package com.btn.btnrustlauncher;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public class ClipboardHelper {
    private static volatile String cachedText = "";

    public static String getText(Activity activity) {
        // Must run on UI thread
        final String[] result = {""};
        final Object lock = new Object();
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    ClipboardManager cm = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
                    if (cm != null && cm.hasPrimaryClip()) {
                        ClipData clip = cm.getPrimaryClip();
                        if (clip != null && clip.getItemCount() > 0) {
                            CharSequence text = clip.getItemAt(0).getText();
                            if (text != null) {
                                result[0] = text.toString();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    synchronized (lock) {
                        lock.notify();
                    }
                }
            }
        });
        synchronized (lock) {
            try {
                lock.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result[0];
    }

    public static void setText(Activity activity, String text) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    ClipboardManager cm = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
                    if (cm != null) {
                        ClipData clip = ClipData.newPlainText("btn rust launcher", text);
                        cm.setPrimaryClip(clip);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

package com.btn.btnrustlauncher;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.app.Activity;

public class ClipboardHelper {
    public static String getText(Activity activity) {
        ClipboardManager cm = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm == null || !cm.hasPrimaryClip()) return "";
        ClipData clip = cm.getPrimaryClip();
        if (clip == null || clip.getItemCount() == 0) return "";
        CharSequence text = clip.getItemAt(0).getText();
        return text != null ? text.toString() : "";
    }

    public static void setText(Activity activity, String text) {
        ClipboardManager cm = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm == null) return;
        ClipData clip = ClipData.newPlainText("btn rust launcher", text);
        cm.setPrimaryClip(clip);
    }
}

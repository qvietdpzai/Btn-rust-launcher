; Installs a release bundle (the files of btn-rust-launcher-windows-x64.zip) for the
; current user, into a folder the client's updater can write to.
;
; usage: iscc /DAppVersion=<x.y.z> /DBundle=<bundle-dir> /DOutDir=<out-dir> /DOutName=<name> pomme.iss

[Setup]
AppId={{22F91093-7D94-4FA4-9045-1F5CBA3D82D5}
AppName=btn rust launcher
AppVersion={#AppVersion}
AppPublisher=btn
AppPublisherURL=https://github.com/qvietdpzai/Btn-rust-launcher
DefaultDirName={localappdata}\Programs\btn rust launcher
DisableProgramGroupPage=yes
PrivilegesRequired=lowest
ArchitecturesAllowed=x64compatible
ArchitecturesInstallIn64BitMode=x64compatible
OutputDir={#OutDir}
OutputBaseFilename={#OutName}
SetupIconFile=..\..\pomme-client\assets\icon.ico
UninstallDisplayIcon={app}\btn-rust-launcher.exe
WizardStyle=modern
Compression=lzma2
SolidCompression=yes

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "{#Bundle}\*"; DestDir: "{app}"; Flags: ignoreversion

[Icons]
Name: "{autoprograms}\btn rust launcher"; Filename: "{app}\btn-rust-launcher.exe"
Name: "{autodesktop}\btn rust launcher"; Filename: "{app}\btn-rust-launcher.exe"; Tasks: desktopicon

[Run]
Filename: "{app}\btn-rust-launcher.exe"; Description: "{cm:LaunchProgram,btn rust launcher}"; Flags: nowait postinstall skipifsilent

; What the updater leaves behind; the data folder (%LOCALAPPDATA%\btn rust launcher) stays.
[UninstallDelete]
Type: files; Name: "{app}\*.old"
Type: filesandordirs; Name: "{app}\.btn-update"

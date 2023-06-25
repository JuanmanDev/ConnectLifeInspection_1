package androidx.test.runner.permission;

import android.annotation.TargetApi;
import android.app.UiAutomation;
import androidx.annotation.VisibleForTesting;
import androidx.test.InstrumentationRegistry;
import androidx.test.internal.util.Checks;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(23)
public class UiAutomationShellCommand extends ShellCommand {
    public static final String TAG = "UiAutomationShellCmd";
    public final PmCommand command;
    public final String permission;
    public final String targetPackage;
    public final UiAutomation uiAutomation = ((UiAutomation) Checks.checkNotNull(InstrumentationRegistry.getInstrumentation().getUiAutomation()));

    public enum PmCommand {
        GRANT_PERMISSION(JuDistPlugin.PERMISSION_GRANT);
        
        public final String pmCommand;

        /* access modifiers changed from: public */
        PmCommand(String str) {
            String valueOf = String.valueOf(str);
            this.pmCommand = valueOf.length() != 0 ? "pm ".concat(valueOf) : new String("pm ");
        }

        public String get() {
            return this.pmCommand;
        }
    }

    public UiAutomationShellCommand(String str, String str2, PmCommand pmCommand) {
        this.targetPackage = ShellCommand.shellEscape(str);
        this.permission = ShellCommand.shellEscape(str2);
        this.command = pmCommand;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void awaitTermination(android.os.ParcelFileDescriptor r3, long r4, java.util.concurrent.TimeUnit r6) {
        /*
            long r4 = r6.toMillis(r4)
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x000f
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r4
        L_0x000f:
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x003b }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x003b }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ all -> 0x003b }
            r2.<init>(r3)     // Catch:{ all -> 0x003b }
            r6.<init>(r2)     // Catch:{ all -> 0x003b }
            r5.<init>(r6)     // Catch:{ all -> 0x003b }
        L_0x001f:
            java.lang.String r3 = r5.readLine()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0034
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0038 }
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x002e
            goto L_0x001f
        L_0x002e:
            java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r5.close()
            return
        L_0x0038:
            r3 = move-exception
            r4 = r5
            goto L_0x003c
        L_0x003b:
            r3 = move-exception
        L_0x003c:
            if (r4 == 0) goto L_0x0041
            r4.close()
        L_0x0041:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.runner.permission.UiAutomationShellCommand.awaitTermination(android.os.ParcelFileDescriptor, long, java.util.concurrent.TimeUnit):void");
    }

    private void executePermissionCommand(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Requesting permission: ".concat(valueOf);
        } else {
            new String("Requesting permission: ");
        }
        try {
            awaitTermination(this.uiAutomation.executeShellCommand(str), 2, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Timeout while executing cmd: ".concat(valueOf2);
            } else {
                new String("Timeout while executing cmd: ");
            }
        }
    }

    @VisibleForTesting
    public String commandForPermission() {
        return this.command.get() + " " + this.targetPackage + " " + this.permission;
    }

    public void execute() {
        executePermissionCommand(commandForPermission());
    }
}

package androidx.test.runner.screenshot;

import android.os.Build;
import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.io.File;
import java.util.UUID;

@Beta
public class BasicScreenCaptureProcessor implements ScreenCaptureProcessor {
    public static String sAndroidDeviceName = Build.DEVICE;
    public static int sAndroidRuntimeVersion = Build.VERSION.SDK_INT;
    public String mDefaultFilenamePrefix;
    public File mDefaultScreenshotPath;
    public String mFileNameDelimiter;
    public String mTag;

    public BasicScreenCaptureProcessor() {
        this(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "screenshots"));
    }

    @VisibleForTesting
    public static void setAndroidDeviceName(String str) {
        sAndroidDeviceName = str;
    }

    @VisibleForTesting
    public static void setAndroidRuntimeVersion(int i) {
        sAndroidRuntimeVersion = i;
    }

    public String getDefaultFilename() {
        String str = this.mDefaultFilenamePrefix;
        String str2 = this.mFileNameDelimiter;
        String str3 = sAndroidDeviceName;
        int i = sAndroidRuntimeVersion;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str2);
        sb.append(i);
        return getFilename(sb.toString());
    }

    public String getFilename(String str) {
        String str2 = this.mFileNameDelimiter;
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(str2);
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097 A[SYNTHETIC, Splitter:B:23:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String process(androidx.test.runner.screenshot.ScreenCapture r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getName()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r5.getDefaultFilename()
            goto L_0x0013
        L_0x000b:
            java.lang.String r0 = r6.getName()
            java.lang.String r0 = r5.getFilename(r0)
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.graphics.Bitmap$CompressFormat r1 = r6.getFormat()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.io.File r1 = r5.mDefaultScreenshotPath
            r1.mkdirs()
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L_0x006d
            boolean r2 = r1.canWrite()
            if (r2 == 0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            java.io.IOException r6 = new java.io.IOException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "The directory %s does not exist and could not be created or is not writable."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            throw r6
        L_0x006d:
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            r1 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0094 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0094 }
            r4.<init>(r2)     // Catch:{ all -> 0x0094 }
            r3.<init>(r4)     // Catch:{ all -> 0x0094 }
            android.graphics.Bitmap r1 = r6.getBitmap()     // Catch:{ all -> 0x0091 }
            android.graphics.Bitmap$CompressFormat r6 = r6.getFormat()     // Catch:{ all -> 0x0091 }
            r2 = 100
            r1.compress(r6, r2, r3)     // Catch:{ all -> 0x0091 }
            r3.flush()     // Catch:{ all -> 0x0091 }
            r3.close()     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            return r0
        L_0x0091:
            r6 = move-exception
            r1 = r3
            goto L_0x0095
        L_0x0094:
            r6 = move-exception
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.runner.screenshot.BasicScreenCaptureProcessor.process(androidx.test.runner.screenshot.ScreenCapture):java.lang.String");
    }

    public BasicScreenCaptureProcessor(File file) {
        this.mTag = "BasicScreenCaptureProcessor";
        this.mFileNameDelimiter = AccountManagerConstants$LOCALE.LOCALE_SEPERATOR;
        this.mDefaultFilenamePrefix = "screenshot";
        this.mDefaultScreenshotPath = file;
    }
}

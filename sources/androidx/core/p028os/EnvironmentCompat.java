package androidx.core.p028os;

import android.os.Build;
import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;

/* renamed from: androidx.core.os.EnvironmentCompat */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    public static final String TAG = "EnvironmentCompat";

    @RequiresApi(19)
    /* renamed from: androidx.core.os.EnvironmentCompat$Api19Impl */
    public static class Api19Impl {
        @DoNotInline
        public static String getStorageState(File file) {
            return Environment.getStorageState(file);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.os.EnvironmentCompat$Api21Impl */
    public static class Api21Impl {
        @DoNotInline
        public static String getExternalStorageState(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return Api21Impl.getExternalStorageState(file);
        }
        if (i >= 19) {
            return Api19Impl.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
            return MEDIA_UNKNOWN;
        } catch (IOException e) {
            "Failed to resolve canonical path: " + e;
            return MEDIA_UNKNOWN;
        }
    }
}

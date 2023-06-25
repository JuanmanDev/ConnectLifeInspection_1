package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class CursorWindowCompat {

    @RequiresApi(15)
    public static class Api15Impl {
        @DoNotInline
        public static CursorWindow createCursorWindow(String str) {
            return new CursorWindow(str);
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        @DoNotInline
        public static CursorWindow createCursorWindow(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.createCursorWindow(str, j);
        }
        if (i >= 15) {
            return Api15Impl.createCursorWindow(str);
        }
        return new CursorWindow(false);
    }
}

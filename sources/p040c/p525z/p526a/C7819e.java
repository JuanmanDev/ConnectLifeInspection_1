package p040c.p525z.p526a;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.z.a.e */
/* compiled from: LogcatLogStrategy */
public class C7819e implements C7818d {
    public void log(int i, @Nullable String str, @NonNull String str2) {
        C7826j.m21901a(str2);
        if (str == null) {
            str = "NO_TAG";
        }
        Log.println(i, str, str2);
    }
}

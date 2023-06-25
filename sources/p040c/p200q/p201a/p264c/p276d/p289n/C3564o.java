package p040c.p200q.p201a.p264c.p276d.p289n;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: c.q.a.c.d.n.o */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3564o {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @Nullable
    /* renamed from: a */
    public static String m9093a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: b */
    public static boolean m9094b(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}

package p040c.p200q.p201a.p264c.p276d.p289n;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.c.d.n.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3554e {
    @NonNull
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m9061a() {
        return Collections.emptyList();
    }

    @NonNull
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m9062b(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m9063c(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m9061a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m9062b(tArr[0]);
    }
}

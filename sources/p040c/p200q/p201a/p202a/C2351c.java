package p040c.p200q.p201a.p202a;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;

/* renamed from: c.q.a.a.c */
/* compiled from: Event */
public abstract class C2351c<T> {
    /* renamed from: d */
    public static <T> C2351c<T> m4029d(T t) {
        return new C2349a((Integer) null, t, Priority.DEFAULT);
    }

    /* renamed from: e */
    public static <T> C2351c<T> m4030e(T t) {
        return new C2349a((Integer) null, t, Priority.HIGHEST);
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo17649a();

    /* renamed from: b */
    public abstract T mo17650b();

    /* renamed from: c */
    public abstract Priority mo17651c();
}

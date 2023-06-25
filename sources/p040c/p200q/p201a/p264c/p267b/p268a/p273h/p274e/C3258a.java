package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.b.a.h.e.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3258a {

    /* renamed from: b */
    public static int f6120b = 31;

    /* renamed from: a */
    public int f6121a = 1;

    @NonNull
    /* renamed from: a */
    public C3258a mo20284a(@Nullable Object obj) {
        this.f6121a = (f6120b * this.f6121a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int mo20285b() {
        return this.f6121a;
    }

    @NonNull
    /* renamed from: c */
    public final C3258a mo20286c(boolean z) {
        this.f6121a = (f6120b * this.f6121a) + (z ? 1 : 0);
        return this;
    }
}

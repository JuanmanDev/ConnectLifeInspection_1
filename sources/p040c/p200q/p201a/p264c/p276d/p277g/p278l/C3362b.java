package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3338d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;

/* renamed from: c.q.a.c.d.g.l.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3362b<O extends C3334a.C3338d> {

    /* renamed from: a */
    public final int f6239a;

    /* renamed from: b */
    public final C3334a<O> f6240b;
    @Nullable

    /* renamed from: c */
    public final O f6241c;
    @Nullable

    /* renamed from: d */
    public final String f6242d;

    public C3362b(C3334a<O> aVar, @Nullable O o, @Nullable String str) {
        this.f6240b = aVar;
        this.f6241c = o;
        this.f6242d = str;
        this.f6239a = C3487m.m8887b(aVar, o, str);
    }

    @NonNull
    /* renamed from: a */
    public static <O extends C3334a.C3338d> C3362b<O> m8510a(@NonNull C3334a<O> aVar, @Nullable O o, @Nullable String str) {
        return new C3362b<>(aVar, o, str);
    }

    @NonNull
    /* renamed from: b */
    public final String mo20463b() {
        return this.f6240b.mo20417c();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3362b)) {
            return false;
        }
        C3362b bVar = (C3362b) obj;
        return C3487m.m8886a(this.f6240b, bVar.f6240b) && C3487m.m8886a(this.f6241c, bVar.f6241c) && C3487m.m8886a(this.f6242d, bVar.f6242d);
    }

    public final int hashCode() {
        return this.f6239a;
    }
}

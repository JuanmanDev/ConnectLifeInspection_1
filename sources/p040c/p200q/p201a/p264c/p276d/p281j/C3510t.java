package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;

/* renamed from: c.q.a.c.d.j.t */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3510t implements C3334a.C3338d {
    @NonNull

    /* renamed from: l */
    public static final C3510t f6510l = m8944a().mo20786a();
    @Nullable

    /* renamed from: e */
    public final String f6511e;

    /* renamed from: c.q.a.c.d.j.t$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C3511a {
        @Nullable

        /* renamed from: a */
        public String f6512a;

        public /* synthetic */ C3511a(C3531y yVar) {
        }

        @NonNull
        /* renamed from: a */
        public C3510t mo20786a() {
            return new C3510t(this.f6512a, (C3534z) null);
        }
    }

    public /* synthetic */ C3510t(String str, C3534z zVar) {
        this.f6511e = str;
    }

    @NonNull
    /* renamed from: a */
    public static C3511a m8944a() {
        return new C3511a((C3531y) null);
    }

    @NonNull
    /* renamed from: b */
    public final Bundle mo20783b() {
        Bundle bundle = new Bundle();
        String str = this.f6511e;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3510t)) {
            return false;
        }
        return C3487m.m8886a(this.f6511e, ((C3510t) obj).f6511e);
    }

    public final int hashCode() {
        return C3487m.m8887b(this.f6511e);
    }
}

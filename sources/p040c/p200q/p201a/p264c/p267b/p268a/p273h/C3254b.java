package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import p040c.p200q.p201a.p264c.p267b.p268a.C3225a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3264g;
import p040c.p200q.p201a.p264c.p276d.C3324b;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3359a;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3402o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3491n;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.a.c.b.a.h.b */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C3254b extends C3345c<GoogleSignInOptions> {

    /* renamed from: k */
    public static int f6112k = C3255a.f6113a;

    /* 'enum' modifier removed */
    /* renamed from: c.q.a.c.b.a.h.b$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class C3255a {

        /* renamed from: a */
        public static final int f6113a = 1;

        /* renamed from: b */
        public static final int f6114b = 2;

        /* renamed from: c */
        public static final int f6115c = 3;

        /* renamed from: d */
        public static final int f6116d = 4;

        /* renamed from: e */
        public static final /* synthetic */ int[] f6117e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m8302a() {
            return (int[]) f6117e.clone();
        }
    }

    public C3254b(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C3225a.f6100e, googleSignInOptions, (C3402o) new C3359a());
    }

    @NonNull
    /* renamed from: p */
    public Intent mo20278p() {
        Context h = mo20440h();
        int i = C3285k.f6139a[mo20281s() - 1];
        if (i == 1) {
            return C3264g.m8331e(h, (GoogleSignInOptions) mo20439g());
        }
        if (i != 2) {
            return C3264g.m8333g(h, (GoogleSignInOptions) mo20439g());
        }
        return C3264g.m8328b(h, (GoogleSignInOptions) mo20439g());
    }

    /* renamed from: q */
    public C5771j<Void> mo20279q() {
        return C3491n.m8893b(C3264g.m8332f(mo20435c(), mo20440h(), mo20281s() == C3255a.f6115c));
    }

    /* renamed from: r */
    public C5771j<Void> mo20280r() {
        return C3491n.m8893b(C3264g.m8329c(mo20435c(), mo20440h(), mo20281s() == C3255a.f6115c));
    }

    /* renamed from: s */
    public final synchronized int mo20281s() {
        if (f6112k == C3255a.f6113a) {
            Context h = mo20440h();
            C3324b m = C3324b.m8405m();
            int h2 = m.mo20389h(h, C3330e.f6210a);
            if (h2 == 0) {
                f6112k = C3255a.f6116d;
            } else if (m.mo20385b(h, h2, (String) null) != null || DynamiteModule.m11030a(h, "com.google.android.gms.auth.api.fallback") == 0) {
                f6112k = C3255a.f6114b;
            } else {
                f6112k = C3255a.f6115c;
            }
        }
        return f6112k;
    }
}

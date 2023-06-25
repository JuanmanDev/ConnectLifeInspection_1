package p040c.p200q.p201a.p264c.p294g.p335i;

import android.net.Uri;

/* renamed from: c.q.a.c.g.i.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5202o6 {

    /* renamed from: a */
    public final String f10030a;

    /* renamed from: b */
    public final Uri f10031b;

    /* renamed from: c */
    public final String f10032c;

    /* renamed from: d */
    public final String f10033d;

    /* renamed from: e */
    public final boolean f10034e;

    /* renamed from: f */
    public final boolean f10035f;

    /* renamed from: g */
    public final boolean f10036g;

    /* renamed from: h */
    public final boolean f10037h;

    /* renamed from: i */
    public final C5322w6 f10038i;

    public C5202o6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C5322w6) null);
    }

    public C5202o6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C5322w6 w6Var) {
        this.f10030a = null;
        this.f10031b = uri;
        this.f10032c = "";
        this.f10033d = "";
        this.f10034e = z;
        this.f10035f = false;
        this.f10036g = z3;
        this.f10037h = false;
        this.f10038i = null;
    }

    /* renamed from: a */
    public final C5202o6 mo27481a() {
        return new C5202o6((String) null, this.f10031b, this.f10032c, this.f10033d, this.f10034e, false, true, false, (C5322w6) null);
    }

    /* renamed from: b */
    public final C5202o6 mo27482b() {
        if (this.f10032c.isEmpty()) {
            return new C5202o6((String) null, this.f10031b, this.f10032c, this.f10033d, true, false, this.f10036g, false, (C5322w6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C5262s6 mo27483c(String str, double d) {
        return new C5172m6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C5262s6 mo27484d(String str, long j) {
        return new C5141k6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C5262s6 mo27485e(String str, String str2) {
        return new C5187n6(this, str, str2, true);
    }

    /* renamed from: f */
    public final C5262s6 mo27486f(String str, boolean z) {
        return new C5157l6(this, str, Boolean.valueOf(z), true);
    }
}

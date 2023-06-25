package p040c.p200q.p201a.p264c.p340i.p342b;

import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.r */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5619r {

    /* renamed from: a */
    public final String f10799a;

    /* renamed from: b */
    public final String f10800b;

    /* renamed from: c */
    public final long f10801c;

    /* renamed from: d */
    public final long f10802d;

    /* renamed from: e */
    public final long f10803e;

    /* renamed from: f */
    public final long f10804f;

    /* renamed from: g */
    public final long f10805g;

    /* renamed from: h */
    public final Long f10806h;

    /* renamed from: i */
    public final Long f10807i;

    /* renamed from: j */
    public final Long f10808j;

    /* renamed from: k */
    public final Boolean f10809k;

    public C5619r(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        boolean z = true;
        C3495o.m8899a(j6 >= 0);
        C3495o.m8899a(j7 >= 0);
        C3495o.m8899a(j8 >= 0);
        C3495o.m8899a(j9 < 0 ? false : z);
        this.f10799a = str;
        this.f10800b = str2;
        this.f10801c = j6;
        this.f10802d = j7;
        this.f10803e = j8;
        this.f10804f = j4;
        this.f10805g = j9;
        this.f10806h = l;
        this.f10807i = l2;
        this.f10808j = l3;
        this.f10809k = bool;
    }

    /* renamed from: a */
    public final C5619r mo28586a(Long l, Long l2, Boolean bool) {
        return new C5619r(this.f10799a, this.f10800b, this.f10801c, this.f10802d, this.f10803e, this.f10804f, this.f10805g, this.f10806h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* renamed from: b */
    public final C5619r mo28587b(long j, long j2) {
        return new C5619r(this.f10799a, this.f10800b, this.f10801c, this.f10802d, this.f10803e, this.f10804f, j, Long.valueOf(j2), this.f10807i, this.f10808j, this.f10809k);
    }

    /* renamed from: c */
    public final C5619r mo28588c(long j) {
        return new C5619r(this.f10799a, this.f10800b, this.f10801c, this.f10802d, this.f10803e, j, this.f10805g, this.f10806h, this.f10807i, this.f10808j, this.f10809k);
    }
}

package p040c.p200q.p201a.p264c.p344k;

import com.google.android.gms.common.api.Scope;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p344k.p345b.C5732a;

/* renamed from: c.q.a.c.k.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C5744f {

    /* renamed from: a */
    public static final C3334a.C3343g<C5732a> f11219a = new C3334a.C3343g<>();

    /* renamed from: b */
    public static final C3334a.C3343g<C5732a> f11220b = new C3334a.C3343g<>();

    /* renamed from: c */
    public static final C3334a.C3335a<C5732a, C5731a> f11221c = new C5741c();

    /* renamed from: d */
    public static final C3334a.C3335a<C5732a, C5743e> f11222d = new C5742d();

    static {
        new Scope("profile");
        new Scope("email");
        new C3334a("SignIn.API", f11221c, f11219a);
        new C3334a("SignIn.INTERNAL_API", f11222d, f11220b);
    }
}

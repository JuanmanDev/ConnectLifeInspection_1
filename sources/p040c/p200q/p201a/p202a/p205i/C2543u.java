package p040c.p200q.p201a.p202a.p205i;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.Set;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.C2354f;
import p040c.p200q.p201a.p202a.C2355g;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.C2544v;
import p040c.p200q.p201a.p202a.p205i.p208c0.C2415e;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2441t;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2443v;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;

/* renamed from: c.q.a.a.i.u */
/* compiled from: TransportRuntime */
public class C2543u implements C2542t {

    /* renamed from: e */
    public static volatile C2544v f2982e;

    /* renamed from: a */
    public final C2512a f2983a;

    /* renamed from: b */
    public final C2512a f2984b;

    /* renamed from: c */
    public final C2415e f2985c;

    /* renamed from: d */
    public final C2441t f2986d;

    public C2543u(C2512a aVar, C2512a aVar2, C2415e eVar, C2441t tVar, C2443v vVar) {
        this.f2983a = aVar;
        this.f2984b = aVar2;
        this.f2985c = eVar;
        this.f2986d = tVar;
        vVar.mo17845a();
    }

    /* renamed from: c */
    public static C2543u m4547c() {
        C2544v vVar = f2982e;
        if (vVar != null) {
            return vVar.mo17956b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C2350b> m4548d(C2524g gVar) {
        if (gVar instanceof C2525h) {
            return Collections.unmodifiableSet(((C2525h) gVar).mo17666a());
        }
        return Collections.singleton(C2350b.m4027b("proto"));
    }

    /* renamed from: f */
    public static void m4549f(Context context) {
        if (f2982e == null) {
            synchronized (C2543u.class) {
                if (f2982e == null) {
                    C2544v.C2545a c = C2520f.m4475c();
                    c.mo17958a(context);
                    f2982e = c.build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17983a(C2536p pVar, C2355g gVar) {
        this.f2985c.mo17801a(pVar.mo17933f().mo17980f(pVar.mo17930c().mo17651c()), mo17984b(pVar), gVar);
    }

    /* renamed from: b */
    public final C2527j mo17984b(C2536p pVar) {
        C2527j.C2528a a = C2527j.m4486a();
        a.mo17796i(this.f2983a.mo17952a());
        a.mo17798k(this.f2984b.mo17952a());
        a.mo17797j(pVar.mo17934g());
        a.mo17795h(new C2526i(pVar.mo17929b(), pVar.mo17978d()));
        a.mo17794g(pVar.mo17930c().mo17649a());
        return a.mo17791d();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C2441t mo17985e() {
        return this.f2986d;
    }

    /* renamed from: g */
    public C2354f mo17986g(C2524g gVar) {
        Set<C2350b> d = m4548d(gVar);
        C2538q.C2539a a = C2538q.m4531a();
        a.mo17949b(gVar.getName());
        a.mo17950c(gVar.getExtras());
        return new C2540r(d, a.mo17948a(), this);
    }
}

package p040c.p151o.p152a.p153a.p159m;

import androidx.annotation.Nullable;
import androidx.navigation.NavInflater;
import java.util.HashMap;
import p040c.p151o.p152a.p153a.C2104g;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p156j.C2128h;

/* renamed from: c.o.a.a.m.e */
/* compiled from: Resolver */
public class C2139e<A extends C2109a> {

    /* renamed from: a */
    public final C2104g<A> f2107a;

    /* renamed from: b */
    public final C2125e f2108b;

    /* renamed from: c */
    public final C2128h<A> f2109c;

    /* renamed from: a */
    public void mo16946a(@Nullable Runnable runnable) {
        HashMap hashMap = new HashMap();
        hashMap.put("regToken", mo16947b());
        hashMap.put(NavInflater.TAG_INCLUDE, "profile,data,emails,subscriptions,preferences");
        hashMap.put("includeUserInfo", "true");
        this.f2109c.mo16899b(hashMap, this.f2107a);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public String mo16947b() {
        return (String) this.f2108b.mo16926f("regToken", String.class);
    }
}

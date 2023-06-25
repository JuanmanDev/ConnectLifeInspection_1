package p040c.p151o.p152a.p153a.p154i;

import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p174u.C2200a;

/* renamed from: c.o.a.a.i.c */
/* compiled from: accountCacheService */
public class C2108c<A extends C2109a> implements C2107b<A> {

    /* renamed from: a */
    public final C2098a f2073a;

    /* renamed from: b */
    public String f2074b;

    /* renamed from: c */
    public Class<A> f2075c;

    /* renamed from: d */
    public long f2076d;

    /* renamed from: e */
    public boolean f2077e;

    /* renamed from: a */
    public void mo16895a() {
        if (this.f2074b != null) {
            int a = this.f2073a.mo16852a();
            if (!this.f2077e && a > 0) {
                this.f2076d = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis((long) a);
            }
        }
    }

    /* renamed from: f */
    public A mo16890f() {
        return (C2109a) new GsonBuilder().registerTypeAdapter(this.f2075c, new C2200a()).create().fromJson(this.f2074b, this.f2075c);
    }

    /* renamed from: g */
    public boolean mo16891g() {
        String str;
        if (this.f2077e || (str = this.f2074b) == null) {
            return false;
        }
        if (str == null || System.currentTimeMillis() <= this.f2076d) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public Class<A> mo16892h() {
        return this.f2075c;
    }

    /* renamed from: i */
    public void mo16893i(String str) {
        this.f2074b = str;
        mo16895a();
    }

    /* renamed from: j */
    public void mo16894j() {
        this.f2074b = null;
    }
}

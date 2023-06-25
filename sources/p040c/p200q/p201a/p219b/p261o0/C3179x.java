package p040c.p200q.p201a.p219b.p261o0;

import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.C3206r;

/* renamed from: c.q.a.b.o0.x */
/* compiled from: StandaloneMediaClock */
public final class C3179x implements C3165o {

    /* renamed from: e */
    public final C3153f f5896e;

    /* renamed from: l */
    public boolean f5897l;

    /* renamed from: m */
    public long f5898m;

    /* renamed from: n */
    public long f5899n;

    /* renamed from: o */
    public C3206r f5900o = C3206r.f6028e;

    public C3179x(C3153f fVar) {
        this.f5896e = fVar;
    }

    /* renamed from: a */
    public void mo20050a(long j) {
        this.f5898m = j;
        if (this.f5897l) {
            this.f5899n = this.f5896e.mo19953b();
        }
    }

    /* renamed from: b */
    public void mo20051b() {
        if (!this.f5897l) {
            this.f5899n = this.f5896e.mo19953b();
            this.f5897l = true;
        }
    }

    /* renamed from: c */
    public void mo20052c() {
        if (this.f5897l) {
            mo20050a(mo18335m());
            this.f5897l = false;
        }
    }

    /* renamed from: f */
    public C3206r mo18333f() {
        return this.f5900o;
    }

    /* renamed from: g */
    public C3206r mo18334g(C3206r rVar) {
        if (this.f5897l) {
            mo20050a(mo18335m());
        }
        this.f5900o = rVar;
        return rVar;
    }

    /* renamed from: m */
    public long mo18335m() {
        long j;
        long j2 = this.f5898m;
        if (!this.f5897l) {
            return j2;
        }
        long b = this.f5896e.mo19953b() - this.f5899n;
        C3206r rVar = this.f5900o;
        if (rVar.f6029a == 1.0f) {
            j = C2627d.m5057a(b);
        } else {
            j = rVar.mo20166a(b);
        }
        return j2 + j;
    }
}

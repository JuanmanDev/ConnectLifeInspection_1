package p040c.p077d.p078a.p101o;

import androidx.annotation.Nullable;

/* renamed from: c.d.a.o.b */
/* compiled from: ErrorRequestCoordinator */
public final class C1908b implements C1910d, C1909c {
    @Nullable

    /* renamed from: e */
    public final C1910d f1550e;

    /* renamed from: l */
    public C1909c f1551l;

    /* renamed from: m */
    public C1909c f1552m;

    public C1908b(@Nullable C1910d dVar) {
        this.f1550e = dVar;
    }

    /* renamed from: a */
    public void mo16321a(C1909c cVar) {
        if (cVar.equals(this.f1552m)) {
            C1910d dVar = this.f1550e;
            if (dVar != null) {
                dVar.mo16321a(this);
            }
        } else if (!this.f1552m.isRunning()) {
            this.f1552m.mo16332j();
        }
    }

    /* renamed from: b */
    public boolean mo16322b() {
        return mo16340r() || mo16326e();
    }

    /* renamed from: c */
    public void mo16323c() {
        this.f1551l.mo16323c();
        this.f1552m.mo16323c();
    }

    public void clear() {
        this.f1551l.clear();
        if (this.f1552m.isRunning()) {
            this.f1552m.clear();
        }
    }

    /* renamed from: d */
    public boolean mo16325d(C1909c cVar) {
        if (!(cVar instanceof C1908b)) {
            return false;
        }
        C1908b bVar = (C1908b) cVar;
        if (!this.f1551l.mo16325d(bVar.f1551l) || !this.f1552m.mo16325d(bVar.f1552m)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo16326e() {
        return (this.f1551l.mo16328g() ? this.f1552m : this.f1551l).mo16326e();
    }

    /* renamed from: f */
    public boolean mo16327f(C1909c cVar) {
        return mo16338p() && mo16336n(cVar);
    }

    /* renamed from: g */
    public boolean mo16328g() {
        return this.f1551l.mo16328g() && this.f1552m.mo16328g();
    }

    /* renamed from: h */
    public boolean mo16329h() {
        return (this.f1551l.mo16328g() ? this.f1552m : this.f1551l).mo16329h();
    }

    /* renamed from: i */
    public boolean mo16330i(C1909c cVar) {
        return mo16339q() && mo16336n(cVar);
    }

    public boolean isRunning() {
        return (this.f1551l.mo16328g() ? this.f1552m : this.f1551l).isRunning();
    }

    /* renamed from: j */
    public void mo16332j() {
        if (!this.f1551l.isRunning()) {
            this.f1551l.mo16332j();
        }
    }

    /* renamed from: k */
    public void mo16333k(C1909c cVar) {
        C1910d dVar = this.f1550e;
        if (dVar != null) {
            dVar.mo16333k(this);
        }
    }

    /* renamed from: l */
    public boolean mo16334l() {
        return (this.f1551l.mo16328g() ? this.f1552m : this.f1551l).mo16334l();
    }

    /* renamed from: m */
    public boolean mo16335m(C1909c cVar) {
        return mo16337o() && mo16336n(cVar);
    }

    /* renamed from: n */
    public final boolean mo16336n(C1909c cVar) {
        return cVar.equals(this.f1551l) || (this.f1551l.mo16328g() && cVar.equals(this.f1552m));
    }

    /* renamed from: o */
    public final boolean mo16337o() {
        C1910d dVar = this.f1550e;
        return dVar == null || dVar.mo16335m(this);
    }

    /* renamed from: p */
    public final boolean mo16338p() {
        C1910d dVar = this.f1550e;
        return dVar == null || dVar.mo16327f(this);
    }

    /* renamed from: q */
    public final boolean mo16339q() {
        C1910d dVar = this.f1550e;
        return dVar == null || dVar.mo16330i(this);
    }

    /* renamed from: r */
    public final boolean mo16340r() {
        C1910d dVar = this.f1550e;
        return dVar != null && dVar.mo16322b();
    }

    /* renamed from: s */
    public void mo16341s(C1909c cVar, C1909c cVar2) {
        this.f1551l = cVar;
        this.f1552m = cVar2;
    }
}

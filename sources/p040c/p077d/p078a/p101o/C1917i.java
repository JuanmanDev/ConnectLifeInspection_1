package p040c.p077d.p078a.p101o;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: c.d.a.o.i */
/* compiled from: ThumbnailRequestCoordinator */
public class C1917i implements C1910d, C1909c {
    @Nullable

    /* renamed from: e */
    public final C1910d f1591e;

    /* renamed from: l */
    public C1909c f1592l;

    /* renamed from: m */
    public C1909c f1593m;

    /* renamed from: n */
    public boolean f1594n;

    @VisibleForTesting
    public C1917i() {
        this((C1910d) null);
    }

    /* renamed from: a */
    public void mo16321a(C1909c cVar) {
        C1910d dVar;
        if (cVar.equals(this.f1592l) && (dVar = this.f1591e) != null) {
            dVar.mo16321a(this);
        }
    }

    /* renamed from: b */
    public boolean mo16322b() {
        return mo16370q() || mo16326e();
    }

    /* renamed from: c */
    public void mo16323c() {
        this.f1592l.mo16323c();
        this.f1593m.mo16323c();
    }

    public void clear() {
        this.f1594n = false;
        this.f1593m.clear();
        this.f1592l.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16325d(p040c.p077d.p078a.p101o.C1909c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p040c.p077d.p078a.p101o.C1917i
            r1 = 0
            if (r0 == 0) goto L_0x0028
            c.d.a.o.i r4 = (p040c.p077d.p078a.p101o.C1917i) r4
            c.d.a.o.c r0 = r3.f1592l
            if (r0 != 0) goto L_0x0010
            c.d.a.o.c r0 = r4.f1592l
            if (r0 != 0) goto L_0x0028
            goto L_0x0018
        L_0x0010:
            c.d.a.o.c r2 = r4.f1592l
            boolean r0 = r0.mo16325d(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0018:
            c.d.a.o.c r0 = r3.f1593m
            c.d.a.o.c r4 = r4.f1593m
            if (r0 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0028
            goto L_0x0027
        L_0x0021:
            boolean r4 = r0.mo16325d(r4)
            if (r4 == 0) goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1917i.mo16325d(c.d.a.o.c):boolean");
    }

    /* renamed from: e */
    public boolean mo16326e() {
        return this.f1592l.mo16326e() || this.f1593m.mo16326e();
    }

    /* renamed from: f */
    public boolean mo16327f(C1909c cVar) {
        return mo16368o() && cVar.equals(this.f1592l) && !mo16322b();
    }

    /* renamed from: g */
    public boolean mo16328g() {
        return this.f1592l.mo16328g();
    }

    /* renamed from: h */
    public boolean mo16329h() {
        return this.f1592l.mo16329h();
    }

    /* renamed from: i */
    public boolean mo16330i(C1909c cVar) {
        return mo16369p() && (cVar.equals(this.f1592l) || !this.f1592l.mo16326e());
    }

    public boolean isRunning() {
        return this.f1592l.isRunning();
    }

    /* renamed from: j */
    public void mo16332j() {
        this.f1594n = true;
        if (!this.f1592l.mo16334l() && !this.f1593m.isRunning()) {
            this.f1593m.mo16332j();
        }
        if (this.f1594n && !this.f1592l.isRunning()) {
            this.f1592l.mo16332j();
        }
    }

    /* renamed from: k */
    public void mo16333k(C1909c cVar) {
        if (!cVar.equals(this.f1593m)) {
            C1910d dVar = this.f1591e;
            if (dVar != null) {
                dVar.mo16333k(this);
            }
            if (!this.f1593m.mo16334l()) {
                this.f1593m.clear();
            }
        }
    }

    /* renamed from: l */
    public boolean mo16334l() {
        return this.f1592l.mo16334l() || this.f1593m.mo16334l();
    }

    /* renamed from: m */
    public boolean mo16335m(C1909c cVar) {
        return mo16367n() && cVar.equals(this.f1592l);
    }

    /* renamed from: n */
    public final boolean mo16367n() {
        C1910d dVar = this.f1591e;
        return dVar == null || dVar.mo16335m(this);
    }

    /* renamed from: o */
    public final boolean mo16368o() {
        C1910d dVar = this.f1591e;
        return dVar == null || dVar.mo16327f(this);
    }

    /* renamed from: p */
    public final boolean mo16369p() {
        C1910d dVar = this.f1591e;
        return dVar == null || dVar.mo16330i(this);
    }

    /* renamed from: q */
    public final boolean mo16370q() {
        C1910d dVar = this.f1591e;
        return dVar != null && dVar.mo16322b();
    }

    /* renamed from: r */
    public void mo16371r(C1909c cVar, C1909c cVar2) {
        this.f1592l = cVar;
        this.f1593m = cVar2;
    }

    public C1917i(@Nullable C1910d dVar) {
        this.f1591e = dVar;
    }
}

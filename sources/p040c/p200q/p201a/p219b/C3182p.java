package p040c.p200q.p201a.p219b;

import android.util.Pair;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.p */
/* compiled from: MediaPeriodQueue */
public final class C3182p {

    /* renamed from: a */
    public final C2578a0.C2580b f5902a = new C2578a0.C2580b();

    /* renamed from: b */
    public final C2578a0.C2581c f5903b = new C2578a0.C2581c();

    /* renamed from: c */
    public long f5904c;

    /* renamed from: d */
    public C2578a0 f5905d = C2578a0.f3043a;

    /* renamed from: e */
    public int f5906e;

    /* renamed from: f */
    public boolean f5907f;
    @Nullable

    /* renamed from: g */
    public C3113n f5908g;
    @Nullable

    /* renamed from: h */
    public C3113n f5909h;
    @Nullable

    /* renamed from: i */
    public C3113n f5910i;

    /* renamed from: j */
    public int f5911j;
    @Nullable

    /* renamed from: k */
    public Object f5912k;

    /* renamed from: l */
    public long f5913l;

    /* renamed from: A */
    public boolean mo20053A() {
        C3113n nVar = this.f5910i;
        return nVar == null || (!nVar.f5692g.f5806f && nVar.mo19863m() && this.f5910i.f5692g.f5804d != -9223372036854775807L && this.f5911j < 100);
    }

    /* renamed from: B */
    public final boolean mo20054B() {
        C3113n nVar;
        C3113n h = mo20065h();
        if (h == null) {
            return true;
        }
        int b = this.f5905d.mo18047b(h.f5687b);
        while (true) {
            b = this.f5905d.mo18049d(b, this.f5902a, this.f5903b, this.f5906e, this.f5907f);
            while (true) {
                C3113n nVar2 = h.f5693h;
                if (nVar2 != null && !h.f5692g.f5805e) {
                    h = nVar2;
                }
            }
            if (b == -1 || (nVar = h.f5693h) == null || this.f5905d.mo18047b(nVar.f5687b) != b) {
                boolean v = mo20079v(h);
                h.f5692g = mo20073p(h.f5692g);
            } else {
                h = h.f5693h;
            }
        }
        boolean v2 = mo20079v(h);
        h.f5692g = mo20073p(h.f5692g);
        if (!v2 || !mo20074q()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo20055C(C3014u.C3015a aVar, long j) {
        int b = this.f5905d.mo18047b(aVar.f5277a);
        C3113n nVar = null;
        int i = b;
        for (C3113n h = mo20065h(); h != null; h = h.f5693h) {
            if (nVar == null) {
                h.f5692g = mo20073p(h.f5692g);
            } else if (i == -1 || !h.f5687b.equals(this.f5905d.mo18057l(i))) {
                return true ^ mo20079v(nVar);
            } else {
                C3142o g = mo20064g(nVar, j);
                if (g == null) {
                    return true ^ mo20079v(nVar);
                }
                h.f5692g = mo20073p(h.f5692g);
                if (!mo20060c(h, g)) {
                    return true ^ mo20079v(nVar);
                }
            }
            if (h.f5692g.f5805e) {
                i = this.f5905d.mo18049d(i, this.f5902a, this.f5903b, this.f5906e, this.f5907f);
            }
            nVar = h;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo20056D(int i) {
        this.f5906e = i;
        return mo20054B();
    }

    /* renamed from: E */
    public boolean mo20057E(boolean z) {
        this.f5907f = z;
        return mo20054B();
    }

    /* renamed from: a */
    public C3113n mo20058a() {
        C3113n nVar = this.f5908g;
        if (nVar != null) {
            if (nVar == this.f5909h) {
                this.f5909h = nVar.f5693h;
            }
            this.f5908g.mo19865o();
            int i = this.f5911j - 1;
            this.f5911j = i;
            if (i == 0) {
                this.f5910i = null;
                C3113n nVar2 = this.f5908g;
                this.f5912k = nVar2.f5687b;
                this.f5913l = nVar2.f5692g.f5801a.f5280d;
            }
            this.f5908g = this.f5908g.f5693h;
        } else {
            C3113n nVar3 = this.f5910i;
            this.f5908g = nVar3;
            this.f5909h = nVar3;
        }
        return this.f5908g;
    }

    /* renamed from: b */
    public C3113n mo20059b() {
        C3113n nVar = this.f5909h;
        C3151e.m7759g((nVar == null || nVar.f5693h == null) ? false : true);
        C3113n nVar2 = this.f5909h.f5693h;
        this.f5909h = nVar2;
        return nVar2;
    }

    /* renamed from: c */
    public final boolean mo20060c(C3113n nVar, C3142o oVar) {
        C3142o oVar2 = nVar.f5692g;
        return oVar2.f5802b == oVar.f5802b && oVar2.f5801a.equals(oVar.f5801a);
    }

    /* renamed from: d */
    public void mo20061d(boolean z) {
        C3113n h = mo20065h();
        if (h != null) {
            this.f5912k = z ? h.f5687b : null;
            this.f5913l = h.f5692g.f5801a.f5280d;
            h.mo19865o();
            mo20079v(h);
        } else if (!z) {
            this.f5912k = null;
        }
        this.f5908g = null;
        this.f5910i = null;
        this.f5909h = null;
        this.f5911j = 0;
    }

    /* renamed from: e */
    public C3012t mo20062e(C3213v[] vVarArr, C3110g gVar, C3117d dVar, C3014u uVar, C3142o oVar) {
        long j;
        C3113n nVar = this.f5910i;
        if (nVar == null) {
            j = oVar.f5802b;
        } else {
            j = nVar.mo19860j() + this.f5910i.f5692g.f5804d;
        }
        C3113n nVar2 = new C3113n(vVarArr, j, gVar, dVar, uVar, oVar);
        if (this.f5910i != null) {
            C3151e.m7759g(mo20074q());
            this.f5910i.f5693h = nVar2;
        }
        this.f5912k = null;
        this.f5910i = nVar2;
        this.f5911j++;
        return nVar2.f5686a;
    }

    /* renamed from: f */
    public final C3142o mo20063f(C3205q qVar) {
        return mo20067j(qVar.f6017c, qVar.f6019e, qVar.f6018d);
    }

    @Nullable
    /* renamed from: g */
    public final C3142o mo20064g(C3113n nVar, long j) {
        long j2;
        long j3;
        Object obj;
        long j4;
        C3113n nVar2 = nVar;
        C3142o oVar = nVar2.f5692g;
        long j5 = (nVar.mo19860j() + oVar.f5804d) - j;
        long j6 = 0;
        if (oVar.f5805e) {
            int d = this.f5905d.mo18049d(this.f5905d.mo18047b(oVar.f5801a.f5277a), this.f5902a, this.f5903b, this.f5906e, this.f5907f);
            if (d == -1) {
                return null;
            }
            int i = this.f5905d.mo18052g(d, this.f5902a, true).f3046c;
            Object obj2 = this.f5902a.f3045b;
            long j7 = oVar.f5801a.f5280d;
            if (this.f5905d.mo18058m(i, this.f5903b).f3052c == d) {
                Pair<Object, Long> k = this.f5905d.mo18056k(this.f5903b, this.f5902a, i, -9223372036854775807L, Math.max(0, j5));
                if (k == null) {
                    return null;
                }
                Object obj3 = k.first;
                long longValue = ((Long) k.second).longValue();
                C3113n nVar3 = nVar2.f5693h;
                if (nVar3 == null || !nVar3.f5687b.equals(obj3)) {
                    j4 = this.f5904c;
                    this.f5904c = 1 + j4;
                } else {
                    j4 = nVar2.f5693h.f5692g.f5801a.f5280d;
                }
                j6 = longValue;
                j3 = j4;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j7;
            }
            long j8 = j6;
            return mo20067j(mo20081x(obj, j8, j3), j8, j6);
        }
        C3014u.C3015a aVar = oVar.f5801a;
        this.f5905d.mo18053h(aVar.f5277a, this.f5902a);
        if (aVar.mo19513a()) {
            int i2 = aVar.f5278b;
            int a = this.f5902a.mo18064a(i2);
            if (a == -1) {
                return null;
            }
            int j9 = this.f5902a.mo18073j(i2, aVar.f5279c);
            if (j9 >= a) {
                long j10 = oVar.f5803c;
                if (this.f5902a.mo18066c() == 1 && this.f5902a.mo18069f(0) == 0) {
                    C2578a0 a0Var = this.f5905d;
                    C2578a0.C2581c cVar = this.f5903b;
                    C2578a0.C2580b bVar = this.f5902a;
                    Pair<Object, Long> k2 = a0Var.mo18056k(cVar, bVar, bVar.f3046c, -9223372036854775807L, Math.max(0, j5));
                    if (k2 == null) {
                        return null;
                    }
                    j2 = ((Long) k2.second).longValue();
                } else {
                    j2 = j10;
                }
                return mo20069l(aVar.f5277a, j2, aVar.f5280d);
            } else if (!this.f5902a.mo18076m(i2, j9)) {
                return null;
            } else {
                return mo20068k(aVar.f5277a, i2, j9, oVar.f5803c, aVar.f5280d);
            }
        } else {
            long j11 = oVar.f5801a.f5281e;
            if (j11 != Long.MIN_VALUE) {
                int e = this.f5902a.mo18068e(j11);
                if (e == -1) {
                    return mo20069l(aVar.f5277a, oVar.f5801a.f5281e, aVar.f5280d);
                }
                int i3 = this.f5902a.mo18072i(e);
                if (!this.f5902a.mo18076m(e, i3)) {
                    return null;
                }
                return mo20068k(aVar.f5277a, e, i3, oVar.f5801a.f5281e, aVar.f5280d);
            }
            int c = this.f5902a.mo18066c();
            if (c == 0) {
                return null;
            }
            int i4 = c - 1;
            if (this.f5902a.mo18069f(i4) != Long.MIN_VALUE || this.f5902a.mo18075l(i4)) {
                return null;
            }
            int i5 = this.f5902a.mo18072i(i4);
            if (!this.f5902a.mo18076m(i4, i5)) {
                return null;
            }
            return mo20068k(aVar.f5277a, i4, i5, this.f5902a.mo18071h(), aVar.f5280d);
        }
    }

    /* renamed from: h */
    public C3113n mo20065h() {
        return mo20074q() ? this.f5908g : this.f5910i;
    }

    /* renamed from: i */
    public C3113n mo20066i() {
        return this.f5910i;
    }

    /* renamed from: j */
    public final C3142o mo20067j(C3014u.C3015a aVar, long j, long j2) {
        this.f5905d.mo18053h(aVar.f5277a, this.f5902a);
        if (!aVar.mo19513a()) {
            return mo20069l(aVar.f5277a, j2, aVar.f5280d);
        } else if (!this.f5902a.mo18076m(aVar.f5278b, aVar.f5279c)) {
            return null;
        } else {
            return mo20068k(aVar.f5277a, aVar.f5278b, aVar.f5279c, j, aVar.f5280d);
        }
    }

    /* renamed from: k */
    public final C3142o mo20068k(Object obj, int i, int i2, long j, long j2) {
        C3014u.C3015a aVar = new C3014u.C3015a(obj, i, i2, j2);
        boolean r = mo20075r(aVar);
        boolean s = mo20076s(aVar, r);
        return new C3142o(aVar, i2 == this.f5902a.mo18072i(i) ? this.f5902a.mo18070g() : 0, j, this.f5905d.mo18053h(aVar.f5277a, this.f5902a).mo18065b(aVar.f5278b, aVar.f5279c), r, s);
    }

    /* renamed from: l */
    public final C3142o mo20069l(Object obj, long j, long j2) {
        long j3;
        int d = this.f5902a.mo18067d(j);
        if (d == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = this.f5902a.mo18069f(d);
        }
        C3014u.C3015a aVar = new C3014u.C3015a(obj, j2, j3);
        this.f5905d.mo18053h(aVar.f5277a, this.f5902a);
        boolean r = mo20075r(aVar);
        return new C3142o(aVar, j, -9223372036854775807L, j3 == Long.MIN_VALUE ? this.f5902a.mo18071h() : j3, r, mo20076s(aVar, r));
    }

    @Nullable
    /* renamed from: m */
    public C3142o mo20070m(long j, C3205q qVar) {
        C3113n nVar = this.f5910i;
        if (nVar == null) {
            return mo20063f(qVar);
        }
        return mo20064g(nVar, j);
    }

    /* renamed from: n */
    public C3113n mo20071n() {
        return this.f5908g;
    }

    /* renamed from: o */
    public C3113n mo20072o() {
        return this.f5909h;
    }

    /* renamed from: p */
    public C3142o mo20073p(C3142o oVar) {
        long j;
        boolean r = mo20075r(oVar.f5801a);
        boolean s = mo20076s(oVar.f5801a, r);
        this.f5905d.mo18053h(oVar.f5801a.f5277a, this.f5902a);
        if (oVar.f5801a.mo19513a()) {
            C2578a0.C2580b bVar = this.f5902a;
            C3014u.C3015a aVar = oVar.f5801a;
            j = bVar.mo18065b(aVar.f5278b, aVar.f5279c);
        } else {
            j = oVar.f5801a.f5281e;
            if (j == Long.MIN_VALUE) {
                j = this.f5902a.mo18071h();
            }
        }
        return new C3142o(oVar.f5801a, oVar.f5802b, oVar.f5803c, j, r, s);
    }

    /* renamed from: q */
    public boolean mo20074q() {
        return this.f5908g != null;
    }

    /* renamed from: r */
    public final boolean mo20075r(C3014u.C3015a aVar) {
        int c = this.f5905d.mo18053h(aVar.f5277a, this.f5902a).mo18066c();
        if (c == 0) {
            return true;
        }
        int i = c - 1;
        boolean a = aVar.mo19513a();
        if (this.f5902a.mo18069f(i) == Long.MIN_VALUE) {
            int a2 = this.f5902a.mo18064a(i);
            if (a2 == -1) {
                return false;
            }
            if (a && aVar.f5278b == i && aVar.f5279c == a2 + -1) {
                return true;
            }
            if (a || this.f5902a.mo18072i(i) != a2) {
                return false;
            }
            return true;
        } else if (a || aVar.f5281e != Long.MIN_VALUE) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: s */
    public final boolean mo20076s(C3014u.C3015a aVar, boolean z) {
        int b = this.f5905d.mo18047b(aVar.f5277a);
        return !this.f5905d.mo18058m(this.f5905d.mo18051f(b, this.f5902a).f3046c, this.f5903b).f3051b && this.f5905d.mo18063r(b, this.f5902a, this.f5903b, this.f5906e, this.f5907f) && z;
    }

    /* renamed from: t */
    public boolean mo20077t(C3012t tVar) {
        C3113n nVar = this.f5910i;
        return nVar != null && nVar.f5686a == tVar;
    }

    /* renamed from: u */
    public void mo20078u(long j) {
        C3113n nVar = this.f5910i;
        if (nVar != null) {
            nVar.mo19864n(j);
        }
    }

    /* renamed from: v */
    public boolean mo20079v(C3113n nVar) {
        boolean z = false;
        C3151e.m7759g(nVar != null);
        this.f5910i = nVar;
        while (true) {
            nVar = nVar.f5693h;
            if (nVar != null) {
                if (nVar == this.f5909h) {
                    this.f5909h = this.f5908g;
                    z = true;
                }
                nVar.mo19865o();
                this.f5911j--;
            } else {
                this.f5910i.f5693h = null;
                return z;
            }
        }
    }

    /* renamed from: w */
    public C3014u.C3015a mo20080w(Object obj, long j) {
        return mo20081x(obj, j, mo20082y(obj));
    }

    /* renamed from: x */
    public final C3014u.C3015a mo20081x(Object obj, long j, long j2) {
        long j3;
        this.f5905d.mo18053h(obj, this.f5902a);
        int e = this.f5902a.mo18068e(j);
        if (e == -1) {
            int d = this.f5902a.mo18067d(j);
            if (d == -1) {
                j3 = Long.MIN_VALUE;
            } else {
                j3 = this.f5902a.mo18069f(d);
            }
            return new C3014u.C3015a(obj, j2, j3);
        }
        return new C3014u.C3015a(obj, e, this.f5902a.mo18072i(e), j2);
    }

    /* renamed from: y */
    public final long mo20082y(Object obj) {
        int b;
        int i = this.f5905d.mo18053h(obj, this.f5902a).f3046c;
        Object obj2 = this.f5912k;
        if (obj2 != null && (b = this.f5905d.mo18047b(obj2)) != -1 && this.f5905d.mo18051f(b, this.f5902a).f3046c == i) {
            return this.f5913l;
        }
        for (C3113n h = mo20065h(); h != null; h = h.f5693h) {
            if (h.f5687b.equals(obj)) {
                return h.f5692g.f5801a.f5280d;
            }
        }
        for (C3113n h2 = mo20065h(); h2 != null; h2 = h2.f5693h) {
            int b2 = this.f5905d.mo18047b(h2.f5687b);
            if (b2 != -1 && this.f5905d.mo18051f(b2, this.f5902a).f3046c == i) {
                return h2.f5692g.f5801a.f5280d;
            }
        }
        long j = this.f5904c;
        this.f5904c = 1 + j;
        return j;
    }

    /* renamed from: z */
    public void mo20083z(C2578a0 a0Var) {
        this.f5905d = a0Var;
    }
}

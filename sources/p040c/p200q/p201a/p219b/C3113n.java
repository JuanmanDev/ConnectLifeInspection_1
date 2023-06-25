package p040c.p200q.p201a.p219b;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p040c.p200q.p201a.p219b.p241k0.C2997m;
import p040c.p200q.p201a.p219b.p241k0.C3002q;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p259m0.C3109f;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p259m0.C3112h;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.n */
/* compiled from: MediaPeriodHolder */
public final class C3113n {

    /* renamed from: a */
    public final C3012t f5686a;

    /* renamed from: b */
    public final Object f5687b;

    /* renamed from: c */
    public final C3027y[] f5688c;

    /* renamed from: d */
    public final boolean[] f5689d;

    /* renamed from: e */
    public boolean f5690e;

    /* renamed from: f */
    public boolean f5691f;

    /* renamed from: g */
    public C3142o f5692g;

    /* renamed from: h */
    public C3113n f5693h;

    /* renamed from: i */
    public TrackGroupArray f5694i;

    /* renamed from: j */
    public C3112h f5695j;

    /* renamed from: k */
    public final C3213v[] f5696k;

    /* renamed from: l */
    public final C3110g f5697l;

    /* renamed from: m */
    public final C3014u f5698m;

    /* renamed from: n */
    public long f5699n;

    /* renamed from: o */
    public C3112h f5700o;

    public C3113n(C3213v[] vVarArr, long j, C3110g gVar, C3117d dVar, C3014u uVar, C3142o oVar) {
        this.f5696k = vVarArr;
        this.f5699n = j - oVar.f5802b;
        this.f5697l = gVar;
        this.f5698m = uVar;
        Object obj = oVar.f5801a.f5277a;
        C3151e.m7757e(obj);
        this.f5687b = obj;
        this.f5692g = oVar;
        this.f5688c = new C3027y[vVarArr.length];
        this.f5689d = new boolean[vVarArr.length];
        C3012t a = uVar.mo19162a(oVar.f5801a, dVar, oVar.f5802b);
        long j2 = oVar.f5801a.f5281e;
        this.f5686a = j2 != Long.MIN_VALUE ? new C2997m(a, true, 0, j2) : a;
    }

    /* renamed from: a */
    public long mo19851a(long j, boolean z) {
        return mo19852b(j, z, new boolean[this.f5696k.length]);
    }

    /* renamed from: b */
    public long mo19852b(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            C3112h hVar = this.f5695j;
            boolean z2 = true;
            if (i >= hVar.f5682a) {
                break;
            }
            boolean[] zArr2 = this.f5689d;
            if (z || !hVar.mo19849b(this.f5700o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        mo19856f(this.f5688c);
        mo19869s(this.f5695j);
        C3109f fVar = this.f5695j.f5684c;
        long j2 = this.f5686a.mo19140j(fVar.mo19843b(), this.f5689d, this.f5688c, zArr, j);
        mo19853c(this.f5688c);
        this.f5691f = false;
        int i2 = 0;
        while (true) {
            C3027y[] yVarArr = this.f5688c;
            if (i2 >= yVarArr.length) {
                return j2;
            }
            if (yVarArr[i2] != null) {
                C3151e.m7759g(this.f5695j.mo19850c(i2));
                if (this.f5696k[i2].mo18204h() != 6) {
                    this.f5691f = true;
                }
            } else {
                C3151e.m7759g(fVar.mo19842a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo19853c(C3027y[] yVarArr) {
        int i = 0;
        while (true) {
            C3213v[] vVarArr = this.f5696k;
            if (i < vVarArr.length) {
                if (vVarArr[i].mo18204h() == 6 && this.f5695j.mo19850c(i)) {
                    yVarArr[i] = new C3002q();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo19854d(long j) {
        this.f5686a.mo19100d(mo19867q(j));
    }

    /* renamed from: e */
    public final void mo19855e(C3112h hVar) {
        for (int i = 0; i < hVar.f5682a; i++) {
            boolean c = hVar.mo19850c(i);
            C3107e a = hVar.f5684c.mo19842a(i);
            if (c && a != null) {
                a.mo19822d();
            }
        }
    }

    /* renamed from: f */
    public final void mo19856f(C3027y[] yVarArr) {
        int i = 0;
        while (true) {
            C3213v[] vVarArr = this.f5696k;
            if (i < vVarArr.length) {
                if (vVarArr[i].mo18204h() == 6) {
                    yVarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo19857g(C3112h hVar) {
        for (int i = 0; i < hVar.f5682a; i++) {
            boolean c = hVar.mo19850c(i);
            C3107e a = hVar.f5684c.mo19842a(i);
            if (c && a != null) {
                a.mo19813f();
            }
        }
    }

    /* renamed from: h */
    public long mo19858h() {
        if (!this.f5690e) {
            return this.f5692g.f5802b;
        }
        long f = this.f5691f ? this.f5686a.mo19102f() : Long.MIN_VALUE;
        return f == Long.MIN_VALUE ? this.f5692g.f5804d : f;
    }

    /* renamed from: i */
    public long mo19859i() {
        if (!this.f5690e) {
            return 0;
        }
        return this.f5686a.mo19098b();
    }

    /* renamed from: j */
    public long mo19860j() {
        return this.f5699n;
    }

    /* renamed from: k */
    public long mo19861k() {
        return this.f5692g.f5802b + this.f5699n;
    }

    /* renamed from: l */
    public void mo19862l(float f) {
        this.f5690e = true;
        this.f5694i = this.f5686a.mo19145r();
        mo19866p(f);
        long a = mo19851a(this.f5692g.f5802b, false);
        long j = this.f5699n;
        C3142o oVar = this.f5692g;
        this.f5699n = j + (oVar.f5802b - a);
        this.f5692g = oVar.mo19933a(a);
    }

    /* renamed from: m */
    public boolean mo19863m() {
        return this.f5690e && (!this.f5691f || this.f5686a.mo19102f() == Long.MIN_VALUE);
    }

    /* renamed from: n */
    public void mo19864n(long j) {
        if (this.f5690e) {
            this.f5686a.mo19103g(mo19867q(j));
        }
    }

    /* renamed from: o */
    public void mo19865o() {
        mo19869s((C3112h) null);
        try {
            if (this.f5692g.f5801a.f5281e != Long.MIN_VALUE) {
                this.f5698m.mo19164i(((C2997m) this.f5686a).f5194e);
            } else {
                this.f5698m.mo19164i(this.f5686a);
            }
        } catch (RuntimeException e) {
            C3163m.m7878d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: p */
    public boolean mo19866p(float f) {
        C3112h d = this.f5697l.mo19836d(this.f5696k, this.f5694i);
        if (d.mo19848a(this.f5700o)) {
            return false;
        }
        this.f5695j = d;
        for (C3107e eVar : d.f5684c.mo19843b()) {
            if (eVar != null) {
                eVar.mo19815n(f);
            }
        }
        return true;
    }

    /* renamed from: q */
    public long mo19867q(long j) {
        return j - mo19860j();
    }

    /* renamed from: r */
    public long mo19868r(long j) {
        return j + mo19860j();
    }

    /* renamed from: s */
    public final void mo19869s(C3112h hVar) {
        C3112h hVar2 = this.f5700o;
        if (hVar2 != null) {
            mo19855e(hVar2);
        }
        this.f5700o = hVar;
        if (hVar != null) {
            mo19857g(hVar);
        }
    }
}

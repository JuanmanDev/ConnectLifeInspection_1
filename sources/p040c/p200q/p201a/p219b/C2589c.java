package p040c.p200q.p201a.p219b;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3165o;

/* renamed from: c.q.a.b.c */
/* compiled from: BaseRenderer */
public abstract class C2589c implements C3212u, C3213v {

    /* renamed from: e */
    public final int f3073e;

    /* renamed from: l */
    public C3214w f3074l;

    /* renamed from: m */
    public int f3075m;

    /* renamed from: n */
    public int f3076n;

    /* renamed from: o */
    public C3027y f3077o;

    /* renamed from: p */
    public Format[] f3078p;

    /* renamed from: q */
    public long f3079q;

    /* renamed from: r */
    public boolean f3080r = true;

    /* renamed from: s */
    public boolean f3081s;

    public C2589c(int i) {
        this.f3073e = i;
    }

    /* renamed from: I */
    public static boolean m4787I(@Nullable C2650i<?> iVar, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (iVar == null) {
            return false;
        }
        return iVar.mo18470d(drmInitData);
    }

    /* renamed from: A */
    public abstract void mo18193A();

    /* renamed from: B */
    public void mo18194B(boolean z) {
    }

    /* renamed from: C */
    public abstract void mo18195C(long j, boolean z);

    /* renamed from: D */
    public void mo18196D() {
    }

    /* renamed from: E */
    public void mo18197E() {
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
    }

    /* renamed from: G */
    public final int mo18199G(C3030l lVar, C2634e eVar, boolean z) {
        int i = this.f3077o.mo19105i(lVar, eVar, z);
        if (i == -4) {
            if (eVar.mo18390n()) {
                this.f3080r = true;
                if (this.f3081s) {
                    return -4;
                }
                return -3;
            }
            eVar.f3308n += this.f3079q;
        } else if (i == -5) {
            Format format = lVar.f5333a;
            long j = format.f7570u;
            if (j != Long.MAX_VALUE) {
                lVar.f5333a = format.mo23922h(j + this.f3079q);
            }
        }
        return i;
    }

    /* renamed from: H */
    public int mo18200H(long j) {
        return this.f3077o.mo19108o(j - this.f3079q);
    }

    /* renamed from: d */
    public final void mo18201d() {
        boolean z = true;
        if (this.f3076n != 1) {
            z = false;
        }
        C3151e.m7759g(z);
        this.f3076n = 0;
        this.f3077o = null;
        this.f3078p = null;
        this.f3081s = false;
        mo18193A();
    }

    /* renamed from: e */
    public final C3027y mo18202e() {
        return this.f3077o;
    }

    public final int getState() {
        return this.f3076n;
    }

    /* renamed from: h */
    public final int mo18204h() {
        return this.f3073e;
    }

    /* renamed from: i */
    public final boolean mo18205i() {
        return this.f3080r;
    }

    /* renamed from: j */
    public final void mo18206j(C3214w wVar, Format[] formatArr, C3027y yVar, long j, boolean z, long j2) {
        C3151e.m7759g(this.f3076n == 0);
        this.f3074l = wVar;
        this.f3076n = 1;
        mo18194B(z);
        mo18218v(formatArr, yVar, j2);
        mo18195C(j, z);
    }

    /* renamed from: k */
    public final void mo18207k() {
        this.f3081s = true;
    }

    /* renamed from: l */
    public final C3213v mo18208l() {
        return this;
    }

    /* renamed from: n */
    public int mo18209n() {
        return 0;
    }

    /* renamed from: p */
    public void mo18210p(int i, @Nullable Object obj) {
    }

    /* renamed from: r */
    public final void mo18211r() {
        this.f3077o.mo19097a();
    }

    /* renamed from: s */
    public final void mo18212s(long j) {
        this.f3081s = false;
        this.f3080r = false;
        mo18195C(j, false);
    }

    public final void setIndex(int i) {
        this.f3075m = i;
    }

    public final void start() {
        boolean z = true;
        if (this.f3076n != 1) {
            z = false;
        }
        C3151e.m7759g(z);
        this.f3076n = 2;
        mo18196D();
    }

    public final void stop() {
        C3151e.m7759g(this.f3076n == 2);
        this.f3076n = 1;
        mo18197E();
    }

    /* renamed from: t */
    public final boolean mo18216t() {
        return this.f3081s;
    }

    /* renamed from: u */
    public C3165o mo18217u() {
        return null;
    }

    /* renamed from: v */
    public final void mo18218v(Format[] formatArr, C3027y yVar, long j) {
        C3151e.m7759g(!this.f3081s);
        this.f3077o = yVar;
        this.f3080r = false;
        this.f3078p = formatArr;
        this.f3079q = j;
        mo18198F(formatArr, j);
    }

    /* renamed from: w */
    public final C3214w mo18219w() {
        return this.f3074l;
    }

    /* renamed from: x */
    public final int mo18220x() {
        return this.f3075m;
    }

    /* renamed from: y */
    public final Format[] mo18221y() {
        return this.f3078p;
    }

    /* renamed from: z */
    public final boolean mo18222z() {
        return this.f3080r ? this.f3081s : this.f3077o.mo19099c();
    }
}

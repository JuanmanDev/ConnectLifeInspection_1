package p040c.p200q.p201a.p219b.p222d0;

/* renamed from: c.q.a.b.d0.a */
/* compiled from: Buffer */
public abstract class C2628a {

    /* renamed from: e */
    public int f3284e;

    /* renamed from: h */
    public final void mo18385h(int i) {
        this.f3284e = i | this.f3284e;
    }

    /* renamed from: i */
    public void mo18386i() {
        this.f3284e = 0;
    }

    /* renamed from: j */
    public final void mo18387j(int i) {
        this.f3284e = (~i) & this.f3284e;
    }

    /* renamed from: k */
    public final boolean mo18388k(int i) {
        return (this.f3284e & i) == i;
    }

    /* renamed from: m */
    public final boolean mo18389m() {
        return mo18388k(Integer.MIN_VALUE);
    }

    /* renamed from: n */
    public final boolean mo18390n() {
        return mo18388k(4);
    }

    /* renamed from: o */
    public final boolean mo18391o() {
        return mo18388k(1);
    }

    /* renamed from: q */
    public final void mo18392q(int i) {
        this.f3284e = i;
    }
}

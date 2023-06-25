package p040c.p200q.p201a.p219b.p250l0;

import java.util.List;
import p040c.p200q.p201a.p219b.p222d0.C2635f;

/* renamed from: c.q.a.b.l0.h */
/* compiled from: SubtitleOutputBuffer */
public abstract class C3039h extends C2635f implements C3034d {

    /* renamed from: n */
    public C3034d f5341n;

    /* renamed from: o */
    public long f5342o;

    /* renamed from: c */
    public int mo19618c(long j) {
        return this.f5341n.mo19618c(j - this.f5342o);
    }

    /* renamed from: d */
    public long mo19619d(int i) {
        return this.f5341n.mo19619d(i) + this.f5342o;
    }

    /* renamed from: e */
    public List<C3031a> mo19620e(long j) {
        return this.f5341n.mo19620e(j - this.f5342o);
    }

    /* renamed from: g */
    public int mo19621g() {
        return this.f5341n.mo19621g();
    }

    /* renamed from: i */
    public void mo18386i() {
        super.mo18386i();
        this.f5341n = null;
    }

    /* renamed from: t */
    public void mo19624t(long j, C3034d dVar, long j2) {
        this.f3310l = j;
        this.f5341n = dVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f5342o = j;
    }
}

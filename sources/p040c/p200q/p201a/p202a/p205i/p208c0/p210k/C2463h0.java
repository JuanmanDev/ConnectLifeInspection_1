package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.C2538q;

/* renamed from: c.q.a.a.i.c0.k.h0 */
/* compiled from: AutoValue_PersistedEvent */
public final class C2463h0 extends C2485q0 {

    /* renamed from: a */
    public final long f2877a;

    /* renamed from: b */
    public final C2538q f2878b;

    /* renamed from: c */
    public final C2527j f2879c;

    public C2463h0(long j, C2538q qVar, C2527j jVar) {
        this.f2877a = j;
        if (qVar != null) {
            this.f2878b = qVar;
            if (jVar != null) {
                this.f2879c = jVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C2527j mo17866b() {
        return this.f2879c;
    }

    /* renamed from: c */
    public long mo17867c() {
        return this.f2877a;
    }

    /* renamed from: d */
    public C2538q mo17868d() {
        return this.f2878b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2485q0)) {
            return false;
        }
        C2485q0 q0Var = (C2485q0) obj;
        if (this.f2877a != q0Var.mo17867c() || !this.f2878b.equals(q0Var.mo17868d()) || !this.f2879c.equals(q0Var.mo17866b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2877a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2878b.hashCode()) * 1000003) ^ this.f2879c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f2877a + ", transportContext=" + this.f2878b + ", event=" + this.f2879c + "}";
    }
}

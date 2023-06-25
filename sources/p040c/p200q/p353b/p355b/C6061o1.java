package p040c.p200q.p353b.p355b;

import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p040c.p200q.p353b.p354a.C5831c;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6065p1;

/* renamed from: c.q.b.b.o1 */
/* compiled from: MapMaker */
public final class C6061o1 {

    /* renamed from: a */
    public boolean f11643a;

    /* renamed from: b */
    public int f11644b = -1;

    /* renamed from: c */
    public int f11645c = -1;

    /* renamed from: d */
    public C6065p1.C6085p f11646d;

    /* renamed from: e */
    public C6065p1.C6085p f11647e;

    /* renamed from: f */
    public Equivalence<Object> f11648f;

    /* renamed from: a */
    public C6061o1 mo29686a(int i) {
        boolean z = true;
        C5850m.m16602w(this.f11645c == -1, "concurrency level was already set to %s", this.f11645c);
        if (i <= 0) {
            z = false;
        }
        C5850m.m16583d(z);
        this.f11645c = i;
        return this;
    }

    /* renamed from: b */
    public int mo29687b() {
        int i = this.f11645c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: c */
    public int mo29688c() {
        int i = this.f11644b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: d */
    public Equivalence<Object> mo29689d() {
        return (Equivalence) C5841i.m16566a(this.f11648f, mo29690e().mo29810c());
    }

    /* renamed from: e */
    public C6065p1.C6085p mo29690e() {
        return (C6065p1.C6085p) C5841i.m16566a(this.f11646d, C6065p1.C6085p.STRONG);
    }

    /* renamed from: f */
    public C6065p1.C6085p mo29691f() {
        return (C6065p1.C6085p) C5841i.m16566a(this.f11647e, C6065p1.C6085p.STRONG);
    }

    /* renamed from: g */
    public C6061o1 mo29692g(int i) {
        boolean z = true;
        C5850m.m16602w(this.f11644b == -1, "initial capacity was already set to %s", this.f11644b);
        if (i < 0) {
            z = false;
        }
        C5850m.m16583d(z);
        this.f11644b = i;
        return this;
    }

    /* renamed from: h */
    public C6061o1 mo29693h(Equivalence<Object> equivalence) {
        C5850m.m16603x(this.f11648f == null, "key equivalence was already set to %s", this.f11648f);
        C5850m.m16594o(equivalence);
        this.f11648f = equivalence;
        this.f11643a = true;
        return this;
    }

    /* renamed from: i */
    public <K, V> ConcurrentMap<K, V> mo29694i() {
        if (!this.f11643a) {
            return new ConcurrentHashMap(mo29688c(), 0.75f, mo29687b());
        }
        return C6065p1.m17016b(this);
    }

    /* renamed from: j */
    public C6061o1 mo29695j(C6065p1.C6085p pVar) {
        C5850m.m16603x(this.f11646d == null, "Key strength was already set to %s", this.f11646d);
        C5850m.m16594o(pVar);
        this.f11646d = pVar;
        if (pVar != C6065p1.C6085p.STRONG) {
            this.f11643a = true;
        }
        return this;
    }

    /* renamed from: k */
    public C6061o1 mo29696k(C6065p1.C6085p pVar) {
        C5850m.m16603x(this.f11647e == null, "Value strength was already set to %s", this.f11647e);
        C5850m.m16594o(pVar);
        this.f11647e = pVar;
        if (pVar != C6065p1.C6085p.STRONG) {
            this.f11643a = true;
        }
        return this;
    }

    /* renamed from: l */
    public C6061o1 mo29697l() {
        mo29695j(C6065p1.C6085p.WEAK);
        return this;
    }

    public String toString() {
        C5841i.C5843b b = C5841i.m16567b(this);
        int i = this.f11644b;
        if (i != -1) {
            b.mo28954b("initialCapacity", i);
        }
        int i2 = this.f11645c;
        if (i2 != -1) {
            b.mo28954b("concurrencyLevel", i2);
        }
        C6065p1.C6085p pVar = this.f11646d;
        if (pVar != null) {
            b.mo28956d("keyStrength", C5831c.m16540c(pVar.toString()));
        }
        C6065p1.C6085p pVar2 = this.f11647e;
        if (pVar2 != null) {
            b.mo28956d("valueStrength", C5831c.m16540c(pVar2.toString()));
        }
        if (this.f11648f != null) {
            b.mo28960h("keyEquivalence");
        }
        return b.toString();
    }
}

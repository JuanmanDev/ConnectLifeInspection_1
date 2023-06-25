package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.p */
/* compiled from: EngineResource */
public class C1678p<Z> implements C1685u<Z> {

    /* renamed from: e */
    public final boolean f1176e;

    /* renamed from: l */
    public final boolean f1177l;

    /* renamed from: m */
    public final C1685u<Z> f1178m;

    /* renamed from: n */
    public C1679a f1179n;

    /* renamed from: o */
    public C1567c f1180o;

    /* renamed from: p */
    public int f1181p;

    /* renamed from: q */
    public boolean f1182q;

    /* renamed from: c.d.a.k.j.p$a */
    /* compiled from: EngineResource */
    public interface C1679a {
        /* renamed from: d */
        void mo15824d(C1567c cVar, C1678p<?> pVar);
    }

    public C1678p(C1685u<Z> uVar, boolean z, boolean z2) {
        C1949i.m2563d(uVar);
        this.f1178m = uVar;
        this.f1176e = z;
        this.f1177l = z2;
    }

    /* renamed from: a */
    public synchronized void mo15865a() {
        if (!this.f1182q) {
            this.f1181p++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public C1685u<Z> mo15866b() {
        return this.f1178m;
    }

    /* renamed from: c */
    public synchronized void mo15867c() {
        if (this.f1181p > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f1182q) {
            this.f1182q = true;
            if (this.f1177l) {
                this.f1178m.mo15867c();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: d */
    public int mo15868d() {
        return this.f1178m.mo15868d();
    }

    @NonNull
    /* renamed from: e */
    public Class<Z> mo15869e() {
        return this.f1178m.mo15869e();
    }

    /* renamed from: f */
    public boolean mo15870f() {
        return this.f1176e;
    }

    /* renamed from: g */
    public void mo15871g() {
        synchronized (this.f1179n) {
            synchronized (this) {
                if (this.f1181p > 0) {
                    int i = this.f1181p - 1;
                    this.f1181p = i;
                    if (i == 0) {
                        this.f1179n.mo15824d(this.f1180o, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    @NonNull
    public Z get() {
        return this.f1178m.get();
    }

    /* renamed from: h */
    public synchronized void mo15873h(C1567c cVar, C1679a aVar) {
        this.f1180o = cVar;
        this.f1179n = aVar;
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f1176e + ", listener=" + this.f1179n + ", key=" + this.f1180o + ", acquired=" + this.f1181p + ", isRecycled=" + this.f1182q + ", resource=" + this.f1178m + '}';
    }
}

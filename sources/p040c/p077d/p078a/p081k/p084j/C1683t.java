package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.p106k.C1952a;
import p040c.p077d.p078a.p105q.p106k.C1961c;

/* renamed from: c.d.a.k.j.t */
/* compiled from: LockedResource */
public final class C1683t<Z> implements C1685u<Z>, C1952a.C1958f {

    /* renamed from: o */
    public static final Pools.Pool<C1683t<?>> f1188o = C1952a.m2588d(20, new C1684a());

    /* renamed from: e */
    public final C1961c f1189e = C1961c.m2601a();

    /* renamed from: l */
    public C1685u<Z> f1190l;

    /* renamed from: m */
    public boolean f1191m;

    /* renamed from: n */
    public boolean f1192n;

    /* renamed from: c.d.a.k.j.t$a */
    /* compiled from: LockedResource */
    public class C1684a implements C1952a.C1956d<C1683t<?>> {
        /* renamed from: a */
        public C1683t<?> create() {
            return new C1683t<>();
        }
    }

    @NonNull
    /* renamed from: b */
    public static <Z> C1683t<Z> m1618b(C1685u<Z> uVar) {
        C1683t<Z> acquire = f1188o.acquire();
        C1949i.m2563d(acquire);
        C1683t<Z> tVar = acquire;
        tVar.mo15883a(uVar);
        return tVar;
    }

    /* renamed from: a */
    public final void mo15883a(C1685u<Z> uVar) {
        this.f1192n = false;
        this.f1191m = true;
        this.f1190l = uVar;
    }

    /* renamed from: c */
    public synchronized void mo15867c() {
        this.f1189e.mo16455c();
        this.f1192n = true;
        if (!this.f1191m) {
            this.f1190l.mo15867c();
            mo15884f();
        }
    }

    /* renamed from: d */
    public int mo15868d() {
        return this.f1190l.mo15868d();
    }

    @NonNull
    /* renamed from: e */
    public Class<Z> mo15869e() {
        return this.f1190l.mo15869e();
    }

    /* renamed from: f */
    public final void mo15884f() {
        this.f1190l = null;
        f1188o.release(this);
    }

    /* renamed from: g */
    public synchronized void mo15885g() {
        this.f1189e.mo16455c();
        if (this.f1191m) {
            this.f1191m = false;
            if (this.f1192n) {
                mo15867c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public Z get() {
        return this.f1190l.get();
    }

    @NonNull
    /* renamed from: i */
    public C1961c mo15723i() {
        return this.f1189e;
    }
}

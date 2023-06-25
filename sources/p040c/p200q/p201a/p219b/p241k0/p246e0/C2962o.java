package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.util.SparseArray;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;

/* renamed from: c.q.a.b.k0.e0.o */
/* compiled from: TimestampAdjusterProvider */
public final class C2962o {

    /* renamed from: a */
    public final SparseArray<C3146b0> f4986a = new SparseArray<>();

    /* renamed from: a */
    public C3146b0 mo19393a(int i) {
        C3146b0 b0Var = this.f4986a.get(i);
        if (b0Var != null) {
            return b0Var;
        }
        C3146b0 b0Var2 = new C3146b0(Long.MAX_VALUE);
        this.f4986a.put(i, b0Var2);
        return b0Var2;
    }

    /* renamed from: b */
    public void mo19394b() {
        this.f4986a.clear();
    }
}

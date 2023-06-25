package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.bb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5002bb extends AbstractList implements RandomAccess, C5016c9 {

    /* renamed from: e */
    public final C5016c9 f9830e;

    public C5002bb(C5016c9 c9Var) {
        this.f9830e = c9Var;
    }

    /* renamed from: C */
    public final void mo27004C(zzje zzje) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C5016c9 mo27009d() {
        return this;
    }

    /* renamed from: e */
    public final List mo27010e() {
        return this.f9830e.mo27010e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C5000b9) this.f9830e).get(i);
    }

    public final Iterator iterator() {
        return new C4986ab(this);
    }

    /* renamed from: j */
    public final Object mo27014j(int i) {
        return this.f9830e.mo27014j(i);
    }

    public final ListIterator listIterator(int i) {
        return new C5371za(this, i);
    }

    public final int size() {
        return this.f9830e.size();
    }
}

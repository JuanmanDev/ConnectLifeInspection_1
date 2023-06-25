package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.t3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4786t3 extends AbstractList implements RandomAccess, C4784t1 {

    /* renamed from: e */
    public final C4784t1 f9635e;

    public C4786t3(C4784t1 t1Var) {
        this.f9635e = t1Var;
    }

    /* renamed from: M */
    public final void mo26624M(zzacc zzacc) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C4784t1 mo26628d() {
        return this;
    }

    /* renamed from: e */
    public final List mo26629e() {
        return this.f9635e.mo26629e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C4758s1) this.f9635e).get(i);
    }

    public final Iterator iterator() {
        return new C4760s3(this);
    }

    /* renamed from: j */
    public final Object mo26632j(int i) {
        return this.f9635e.mo26632j(i);
    }

    public final ListIterator listIterator(int i) {
        return new C4734r3(this, i);
    }

    public final int size() {
        return this.f9635e.size();
    }
}

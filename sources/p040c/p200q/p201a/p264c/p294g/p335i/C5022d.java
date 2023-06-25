package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.i.d */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5022d implements Iterator {

    /* renamed from: e */
    public final /* synthetic */ Iterator f9852e;

    /* renamed from: l */
    public final /* synthetic */ Iterator f9853l;

    public C5022d(C5054f fVar, Iterator it, Iterator it2) {
        this.f9852e = it;
        this.f9853l = it2;
    }

    public final boolean hasNext() {
        if (this.f9852e.hasNext()) {
            return true;
        }
        return this.f9853l.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f9852e.hasNext()) {
            return new C5285u(((Integer) this.f9852e.next()).toString());
        }
        if (this.f9853l.hasNext()) {
            return new C5285u((String) this.f9853l.next());
        }
        throw new NoSuchElementException();
    }
}

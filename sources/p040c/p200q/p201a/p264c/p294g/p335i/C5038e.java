package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.i.e */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5038e implements Iterator {

    /* renamed from: e */
    public int f9869e = 0;

    /* renamed from: l */
    public final /* synthetic */ C5054f f9870l;

    public C5038e(C5054f fVar) {
        this.f9870l = fVar;
    }

    public final boolean hasNext() {
        return this.f9869e < this.f9870l.mo27219u();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f9869e < this.f9870l.mo27219u()) {
            C5054f fVar = this.f9870l;
            int i = this.f9869e;
            this.f9869e = i + 1;
            return fVar.mo27220v(i);
        }
        int i2 = this.f9869e;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}

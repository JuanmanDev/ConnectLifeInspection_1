package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.i.s */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5255s implements Iterator {

    /* renamed from: e */
    public int f10117e = 0;

    /* renamed from: l */
    public final /* synthetic */ C5285u f10118l;

    public C5255s(C5285u uVar) {
        this.f10118l = uVar;
    }

    public final boolean hasNext() {
        return this.f10117e < this.f10118l.f10163e.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f10117e;
        if (i < this.f10118l.f10163e.length()) {
            this.f10117e = i + 1;
            return new C5285u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}

package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.i.t */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5270t implements Iterator {

    /* renamed from: e */
    public int f10140e = 0;

    /* renamed from: l */
    public final /* synthetic */ C5285u f10141l;

    public C5270t(C5285u uVar) {
        this.f10141l = uVar;
    }

    public final boolean hasNext() {
        return this.f10140e < this.f10141l.f10163e.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f10140e;
        C5285u uVar = this.f10141l;
        if (i < uVar.f10163e.length()) {
            String g = uVar.f10163e;
            this.f10140e = i + 1;
            return new C5285u(String.valueOf(g.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}

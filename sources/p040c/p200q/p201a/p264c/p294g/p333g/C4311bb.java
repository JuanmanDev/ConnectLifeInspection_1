package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.g.bb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4311bb implements Iterator {

    /* renamed from: e */
    public Object f9137e;

    /* renamed from: l */
    public int f9138l = 2;

    /* renamed from: a */
    public abstract Object mo25817a();

    /* renamed from: b */
    public final Object mo25818b() {
        this.f9138l = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f9138l;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f9138l = 4;
                    this.f9137e = mo25817a();
                    if (this.f9138l != 3) {
                        this.f9138l = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f9138l = 2;
            Object obj = this.f9137e;
            this.f9137e = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

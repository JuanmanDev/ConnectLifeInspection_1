package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.g.f4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4412f4 extends C4547k4 {

    /* renamed from: e */
    public final int f9207e;

    /* renamed from: l */
    public int f9208l;

    public C4412f4(int i, int i2) {
        C4540jo.m12244b(i2, i, "index");
        this.f9207e = i;
        this.f9208l = i2;
    }

    /* renamed from: a */
    public abstract Object mo25966a(int i);

    public final boolean hasNext() {
        return this.f9208l < this.f9207e;
    }

    public final boolean hasPrevious() {
        return this.f9208l > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f9208l;
            this.f9208l = i + 1;
            return mo25966a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f9208l;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f9208l - 1;
            this.f9208l = i;
            return mo25966a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f9208l - 1;
    }
}

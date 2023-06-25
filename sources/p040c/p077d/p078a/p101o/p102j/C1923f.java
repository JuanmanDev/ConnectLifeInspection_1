package p040c.p077d.p078a.p101o.p102j;

import androidx.annotation.NonNull;
import p040c.p077d.p078a.p105q.C1950j;

@Deprecated
/* renamed from: c.d.a.o.j.f */
/* compiled from: SimpleTarget */
public abstract class C1923f<Z> extends C1918a<Z> {

    /* renamed from: b */
    public final int f1597b;

    /* renamed from: c */
    public final int f1598c;

    public C1923f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo16384a(@NonNull C1924g gVar) {
    }

    /* renamed from: h */
    public final void mo16385h(@NonNull C1924g gVar) {
        if (C1950j.m2583s(this.f1597b, this.f1598c)) {
            gVar.mo16351f(this.f1597b, this.f1598c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f1597b + " and height: " + this.f1598c + ", either provide dimensions in the constructor or call override()");
    }

    public C1923f(int i, int i2) {
        this.f1597b = i;
        this.f1598c = i2;
    }
}

package p040c.p107e.p108a.p109e.p110d;

import kotlin.text.Typography;

/* renamed from: c.e.a.e.d.k */
/* compiled from: ParserCursor */
public class C1983k {

    /* renamed from: a */
    public final int f1675a;

    /* renamed from: b */
    public final int f1676b;

    /* renamed from: c */
    public int f1677c;

    public C1983k(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.f1675a = i;
            this.f1676b = i2;
            this.f1677c = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    /* renamed from: a */
    public boolean mo16536a() {
        return this.f1677c >= this.f1676b;
    }

    /* renamed from: b */
    public int mo16537b() {
        return this.f1677c;
    }

    /* renamed from: c */
    public int mo16538c() {
        return this.f1676b;
    }

    /* renamed from: d */
    public void mo16539d(int i) {
        if (i < this.f1675a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f1676b) {
            this.f1677c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append('[');
        sb.append(this.f1675a);
        sb.append(Typography.greater);
        sb.append(this.f1677c);
        sb.append(Typography.greater);
        sb.append(this.f1676b);
        sb.append(']');
        return sb.toString();
    }
}

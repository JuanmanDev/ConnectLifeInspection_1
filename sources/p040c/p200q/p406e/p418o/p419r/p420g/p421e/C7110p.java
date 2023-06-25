package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.google.zxing.FormatException;

/* renamed from: c.q.e.o.r.g.e.p */
/* compiled from: DecodedNumeric */
public final class C7110p extends C7111q {

    /* renamed from: b */
    public final int f13661b;

    /* renamed from: c */
    public final int f13662c;

    public C7110p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f13661b = i2;
        this.f13662c = i3;
    }

    /* renamed from: b */
    public int mo32735b() {
        return this.f13661b;
    }

    /* renamed from: c */
    public int mo32736c() {
        return this.f13662c;
    }

    /* renamed from: d */
    public boolean mo32737d() {
        return this.f13661b == 10;
    }

    /* renamed from: e */
    public boolean mo32738e() {
        return this.f13662c == 10;
    }
}

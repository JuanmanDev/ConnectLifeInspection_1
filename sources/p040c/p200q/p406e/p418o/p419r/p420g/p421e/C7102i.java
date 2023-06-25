package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.i */
/* compiled from: AI01weightDecoder */
public abstract class C7102i extends C7101h {
    public C7102i(C7032a aVar) {
        super(aVar);
    }

    /* renamed from: h */
    public abstract void mo32711h(StringBuilder sb, int i);

    /* renamed from: i */
    public abstract int mo32712i(int i);

    /* renamed from: j */
    public final void mo32717j(StringBuilder sb, int i, int i2) {
        int f = mo32718b().mo32745f(i, i2);
        mo32711h(sb, f);
        int i3 = mo32712i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}

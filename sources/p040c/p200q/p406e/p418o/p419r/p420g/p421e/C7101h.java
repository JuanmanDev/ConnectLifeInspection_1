package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.h */
/* compiled from: AI01decoder */
public abstract class C7101h extends C7103j {
    public C7101h(C7032a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    public static void m21134e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* renamed from: f */
    public final void mo32715f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo32716g(sb, i, length);
    }

    /* renamed from: g */
    public final void mo32716g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo32718b().mo32745f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m21134e(sb, i2);
    }
}

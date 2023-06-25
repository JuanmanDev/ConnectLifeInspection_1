package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.e */
/* compiled from: AI013x0x1xDecoder */
public final class C7098e extends C7102i {

    /* renamed from: c */
    public final String f13645c;

    /* renamed from: d */
    public final String f13646d;

    public C7098e(C7032a aVar, String str, String str2) {
        super(aVar);
        this.f13645c = str2;
        this.f13646d = str;
    }

    /* renamed from: d */
    public String mo32713d() {
        if (mo32719c().mo32523h() == 84) {
            StringBuilder sb = new StringBuilder();
            mo32715f(sb, 8);
            mo32717j(sb, 48, 20);
            mo32714k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    public void mo32711h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f13646d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* renamed from: i */
    public int mo32712i(int i) {
        return i % 100000;
    }

    /* renamed from: k */
    public final void mo32714k(StringBuilder sb, int i) {
        int f = mo32718b().mo32745f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f13645c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }
}

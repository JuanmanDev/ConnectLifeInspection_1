package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.d */
/* compiled from: AI01393xDecoder */
public final class C7097d extends C7101h {
    public C7097d(C7032a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo32713d() {
        if (mo32719c().mo32523h() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo32715f(sb, 8);
            int f = mo32718b().mo32745f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo32718b().mo32745f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo32718b().mo32742c(60, (String) null).mo32732b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

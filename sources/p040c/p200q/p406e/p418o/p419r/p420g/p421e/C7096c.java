package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.c */
/* compiled from: AI01392xDecoder */
public final class C7096c extends C7101h {
    public C7096c(C7032a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo32713d() {
        if (mo32719c().mo32523h() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo32715f(sb, 8);
            int f = mo32718b().mo32745f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(mo32718b().mo32742c(50, (String) null).mo32732b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

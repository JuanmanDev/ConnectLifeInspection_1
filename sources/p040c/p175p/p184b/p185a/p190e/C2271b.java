package p040c.p175p.p184b.p185a.p190e;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.text.DecimalFormat;

/* renamed from: c.p.b.a.e.b */
/* compiled from: DefaultValueFormatter */
public class C2271b extends C2273d {

    /* renamed from: a */
    public DecimalFormat f2380a;

    public C2271b(int i) {
        mo17304j(i);
    }

    /* renamed from: f */
    public String mo17302f(float f) {
        return this.f2380a.format((double) f);
    }

    /* renamed from: j */
    public void mo17304j(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(MAPCookie.DOT);
            }
            stringBuffer.append("0");
        }
        this.f2380a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}

package p040c.p175p.p184b.p185a.p190e;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.text.DecimalFormat;

/* renamed from: c.p.b.a.e.a */
/* compiled from: DefaultAxisValueFormatter */
public class C2270a extends C2273d {

    /* renamed from: a */
    public DecimalFormat f2378a;

    /* renamed from: b */
    public int f2379b;

    public C2270a(int i) {
        this.f2379b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(MAPCookie.DOT);
            }
            stringBuffer.append("0");
        }
        this.f2378a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    /* renamed from: f */
    public String mo17302f(float f) {
        return this.f2378a.format((double) f);
    }

    /* renamed from: j */
    public int mo17303j() {
        return this.f2379b;
    }
}

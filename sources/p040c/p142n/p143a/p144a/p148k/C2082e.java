package p040c.p142n.p143a.p144a.p148k;

import kotlin.text.Typography;
import p040c.p142n.p143a.p144a.C2063c;

/* renamed from: c.n.a.a.k.e */
/* compiled from: JsonWriteContext */
public class C2082e extends C2063c {

    /* renamed from: c */
    public final C2082e f1985c;

    /* renamed from: d */
    public String f1986d;

    public C2082e(int i, C2082e eVar, C2079b bVar) {
        this.f1917a = i;
        this.f1985c = eVar;
        this.f1918b = -1;
    }

    /* renamed from: g */
    public static C2082e m2958g(C2079b bVar) {
        return new C2082e(0, (C2082e) null, bVar);
    }

    /* renamed from: f */
    public void mo16777f(StringBuilder sb) {
        int i = this.f1917a;
        if (i == 2) {
            sb.append('{');
            if (this.f1986d != null) {
                sb.append(Typography.quote);
                sb.append(this.f1986d);
                sb.append(Typography.quote);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo16695a());
            sb.append(']');
        } else {
            sb.append("/");
        }
    }

    /* renamed from: h */
    public final C2082e mo16778h() {
        return this.f1985c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        mo16777f(sb);
        return sb.toString();
    }
}

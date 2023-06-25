package p040c.p142n.p143a.p144a.p148k;

import kotlin.text.Typography;
import p040c.p142n.p143a.p144a.C2063c;
import p040c.p142n.p143a.p144a.p147j.C2072a;

/* renamed from: c.n.a.a.k.d */
/* compiled from: JsonReadContext */
public final class C2081d extends C2063c {

    /* renamed from: c */
    public String f1984c;

    public C2081d(C2081d dVar, C2079b bVar, int i, int i2, int i3) {
        this.f1917a = i;
        this.f1918b = -1;
    }

    /* renamed from: f */
    public static C2081d m2957f(C2079b bVar) {
        return new C2081d((C2081d) null, bVar, 0, 1, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f1917a;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo16695a());
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            if (this.f1984c != null) {
                sb.append(Typography.quote);
                C2072a.m2897a(sb, this.f1984c);
                sb.append(Typography.quote);
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}

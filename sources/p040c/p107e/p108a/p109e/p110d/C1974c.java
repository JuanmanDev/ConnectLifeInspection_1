package p040c.p107e.p108a.p109e.p110d;

import kotlin.text.Typography;

/* renamed from: c.e.a.e.d.c */
/* compiled from: BasicHeaderValueFormatter */
public class C1974c {

    /* renamed from: a */
    public static final C1974c f1665a = new C1974c();

    /* renamed from: a */
    public void mo16480a(StringBuilder sb, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = mo16482c(str.charAt(i));
            }
        }
        if (z) {
            sb.append(Typography.quote);
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (mo16483d(charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        if (z) {
            sb.append(Typography.quote);
        }
    }

    /* renamed from: b */
    public StringBuilder mo16481b(StringBuilder sb, C1982j jVar, boolean z) {
        sb.append(jVar.getName());
        String value = jVar.getValue();
        if (value != null) {
            sb.append('=');
            mo16480a(sb, value, z);
        }
        return sb;
    }

    /* renamed from: c */
    public boolean mo16482c(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    /* renamed from: d */
    public boolean mo16483d(char c) {
        return "\"\\".indexOf(c) >= 0;
    }
}

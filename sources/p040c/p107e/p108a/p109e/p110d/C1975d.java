package p040c.p107e.p108a.p109e.p110d;

import com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair;
import java.util.ArrayList;

/* renamed from: c.e.a.e.d.d */
/* compiled from: BasicHeaderValueParser */
public class C1975d {

    /* renamed from: a */
    public static final C1975d f1666a = new C1975d();

    /* renamed from: b */
    public static final char[] f1667b = {';', ','};

    /* renamed from: c */
    public static boolean m2633c(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C1978g mo16484a(String str, String str2, C1982j[] jVarArr) {
        return new C1973b(str, str2, jVarArr);
    }

    /* renamed from: b */
    public C1982j mo16485b(String str, String str2) {
        return new BasicNameValuePair(str, str2);
    }

    /* renamed from: d */
    public C1978g[] mo16486d(C1976e eVar, C1983k kVar) {
        C1972a.m2628a(eVar, "Char array buffer");
        C1972a.m2628a(kVar, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (!kVar.mo16536a()) {
            C1978g e = mo16487e(eVar, kVar);
            if (e.getName().length() != 0 || e.getValue() != null) {
                arrayList.add(e);
            }
        }
        return (C1978g[]) arrayList.toArray(new C1978g[arrayList.size()]);
    }

    /* renamed from: e */
    public C1978g mo16487e(C1976e eVar, C1983k kVar) {
        C1972a.m2628a(eVar, "Char array buffer");
        C1972a.m2628a(kVar, "Parser cursor");
        C1982j f = mo16488f(eVar, kVar);
        return mo16484a(f.getName(), f.getValue(), (kVar.mo16536a() || eVar.mo16492b(kVar.mo16537b() + -1) == ',') ? null : mo16490h(eVar, kVar));
    }

    /* renamed from: f */
    public C1982j mo16488f(C1976e eVar, C1983k kVar) {
        return mo16489g(eVar, kVar, f1667b);
    }

    /* renamed from: g */
    public C1982j mo16489g(C1976e eVar, C1983k kVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        char b;
        C1972a.m2628a(eVar, "Char array buffer");
        C1972a.m2628a(kVar, "Parser cursor");
        int b2 = kVar.mo16537b();
        int b3 = kVar.mo16537b();
        int c = kVar.mo16538c();
        while (true) {
            z = true;
            if (b2 >= c || (b = eVar.mo16492b(b2)) == '=') {
                z2 = false;
            } else if (m2633c(b, cArr)) {
                z2 = true;
                break;
            } else {
                b2++;
            }
        }
        z2 = false;
        if (b2 == c) {
            str = eVar.mo16495e(b3, c);
            z2 = true;
        } else {
            str = eVar.mo16495e(b3, b2);
            b2++;
        }
        if (z2) {
            kVar.mo16539d(b2);
            return mo16485b(str, (String) null);
        }
        int i = b2;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i >= c) {
                z = z2;
                break;
            }
            char b4 = eVar.mo16492b(i);
            if (b4 == '\"' && !z3) {
                z4 = !z4;
            }
            if (!z4 && !z3 && m2633c(b4, cArr)) {
                break;
            }
            z3 = !z3 && z4 && b4 == '\\';
            i++;
        }
        while (b2 < i && C1977f.m2646a(eVar.mo16492b(b2))) {
            b2++;
        }
        int i2 = i;
        while (i2 > b2 && C1977f.m2646a(eVar.mo16492b(i2 - 1))) {
            i2--;
        }
        if (i2 - b2 >= 2 && eVar.mo16492b(b2) == '\"' && eVar.mo16492b(i2 - 1) == '\"') {
            b2++;
            i2--;
        }
        String d = eVar.mo16494d(b2, i2);
        if (z) {
            i++;
        }
        kVar.mo16539d(i);
        return mo16485b(str, d);
    }

    /* renamed from: h */
    public C1982j[] mo16490h(C1976e eVar, C1983k kVar) {
        C1972a.m2628a(eVar, "Char array buffer");
        C1972a.m2628a(kVar, "Parser cursor");
        int b = kVar.mo16537b();
        int c = kVar.mo16538c();
        while (b < c && C1977f.m2646a(eVar.mo16492b(b))) {
            b++;
        }
        kVar.mo16539d(b);
        if (kVar.mo16536a()) {
            return new C1982j[0];
        }
        ArrayList arrayList = new ArrayList();
        while (!kVar.mo16536a()) {
            arrayList.add(mo16488f(eVar, kVar));
            if (eVar.mo16492b(kVar.mo16537b() - 1) == ',') {
                break;
            }
        }
        return (C1982j[]) arrayList.toArray(new C1982j[arrayList.size()]);
    }
}

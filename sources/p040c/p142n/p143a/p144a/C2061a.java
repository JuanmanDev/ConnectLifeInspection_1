package p040c.p142n.p143a.p144a;

import com.fasterxml.jackson.core.Base64Variant;

/* renamed from: c.n.a.a.a */
/* compiled from: Base64Variants */
public final class C2061a {

    /* renamed from: a */
    public static final Base64Variant f1913a;

    /* renamed from: b */
    public static final Base64Variant f1914b;

    /* renamed from: c */
    public static final Base64Variant f1915c = new Base64Variant(f1913a, "PEM", true, '=', 64);

    /* renamed from: d */
    public static final Base64Variant f1916d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f1913a = base64Variant;
        f1914b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        f1916d = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, 0, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static Base64Variant m2884a(String str) {
        String str2;
        if (f1913a._name.equals(str)) {
            return f1913a;
        }
        if (f1914b._name.equals(str)) {
            return f1914b;
        }
        if (f1915c._name.equals(str)) {
            return f1915c;
        }
        if (f1916d._name.equals(str)) {
            return f1916d;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}

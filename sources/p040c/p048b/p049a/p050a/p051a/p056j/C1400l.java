package p040c.p048b.p049a.p050a.p051a.p056j;

import android.text.TextUtils;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.l */
/* compiled from: ScopesHelper */
public final class C1400l {

    /* renamed from: a */
    public static final String f473a = "c.b.a.a.a.j.l";

    /* renamed from: a */
    public static String[] m435a(String str) {
        String str2 = f473a;
        C1485a.m832e(str2, "Extracting scope string array from " + str);
        if (str.contains(" ")) {
            return TextUtils.split(str, " ");
        }
        return TextUtils.split(str, "\\+");
    }

    /* renamed from: b */
    public static String m436b(String[] strArr) {
        return TextUtils.join(" ", strArr);
    }
}

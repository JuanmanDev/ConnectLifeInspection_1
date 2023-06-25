package p040c.p474u.p475a.p476a.p481d;

import android.text.TextUtils;

/* renamed from: c.u.a.a.d.b */
public class C7593b {
    /* renamed from: a */
    public static String m21585a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(str.getBytes(), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}

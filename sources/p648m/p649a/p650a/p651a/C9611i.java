package p648m.p649a.p650a.p651a;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;

/* renamed from: m.a.a.a.i */
/* compiled from: Util */
public class C9611i {
    /* renamed from: a */
    public static String m25800a(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1, str.length());
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: b */
    public static String m25801b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        return str.startsWith(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR) ? str.substring(1, str.length()) : str;
    }
}

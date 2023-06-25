package p040c.p200q.p201a.p264c.p294g.p333g;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.Locale;

/* renamed from: c.q.a.c.g.g.eo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4405eo {
    /* renamed from: a */
    public static String m11927a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m11928b(sb, locale);
        if (!locale.equals(Locale.US)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m11928b(sb, Locale.US);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m11928b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
                sb.append(country);
            }
        }
    }
}

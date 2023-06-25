package p040c.p142n.p143a.p144a.p150m;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* renamed from: c.n.a.a.m.d */
/* compiled from: VersionUtil */
public class C2097d {

    /* renamed from: a */
    public static final Pattern f2059a = Pattern.compile("[-_./;:]");

    /* renamed from: a */
    public static Version m3038a(String str, String str2, String str3) {
        String str4 = null;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = f2059a.split(trim);
                int i = 0;
                int b = m3039b(split[0]);
                int b2 = split.length > 1 ? m3039b(split[1]) : 0;
                if (split.length > 2) {
                    i = m3039b(split[2]);
                }
                int i2 = i;
                if (split.length > 3) {
                    str4 = split[3];
                }
                return new Version(b, b2, i2, str4, str2, str3);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static int m3039b(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }
}

package p040c.p200q.p353b.p354a;

/* renamed from: c.q.b.a.c */
/* compiled from: Ascii */
public final class C5831c {
    /* renamed from: a */
    public static boolean m16538a(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: b */
    public static boolean m16539b(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: c */
    public static String m16540c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m16539b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m16539b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: d */
    public static char m16541d(char c) {
        return m16538a(c) ? (char) (c ^ ' ') : c;
    }

    /* renamed from: e */
    public static String m16542e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m16538a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m16538a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}

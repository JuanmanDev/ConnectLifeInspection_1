package p040c.p200q.p201a.p202a.p203h;

/* renamed from: c.q.a.a.h.e */
/* compiled from: StringMerger */
public final class C2362e {
    /* renamed from: a */
    public static String m4057a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}

package p648m.p649a.p650a.p651a;

/* renamed from: m.a.a.a.e */
/* compiled from: OptionValidator */
public class C9607e {
    /* renamed from: a */
    public static boolean m25777a(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    /* renamed from: b */
    public static boolean m25778b(char c) {
        return m25777a(c) || c == ' ' || c == '?' || c == '@';
    }

    /* renamed from: c */
    public static void m25779c(String str) {
        if (str != null) {
            int i = 0;
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                if (!m25778b(charAt)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("illegal option value '");
                    stringBuffer.append(charAt);
                    stringBuffer.append("'");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                return;
            }
            char[] charArray = str.toCharArray();
            while (i < charArray.length) {
                if (m25777a(charArray[i])) {
                    i++;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("opt contains illegal character value '");
                    stringBuffer2.append(charArray[i]);
                    stringBuffer2.append("'");
                    throw new IllegalArgumentException(stringBuffer2.toString());
                }
            }
        }
    }
}

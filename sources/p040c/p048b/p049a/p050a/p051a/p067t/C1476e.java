package p040c.p048b.p049a.p050a.p051a.p067t;

/* renamed from: c.b.a.a.a.t.e */
/* compiled from: MAPVersionHelper */
public final class C1476e {
    /* renamed from: a */
    public static String m810a(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int append : iArr) {
            stringBuffer.append(append);
            stringBuffer.append('.');
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }
}

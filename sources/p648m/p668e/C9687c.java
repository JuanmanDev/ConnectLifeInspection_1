package p648m.p668e;

/* renamed from: m.e.c */
/* compiled from: Assert */
public class C9687c {
    /* renamed from: a */
    public static void m26151a(long j, long j2) {
        m26152b((String) null, j, j2);
    }

    /* renamed from: b */
    public static void m26152b(String str, long j, long j2) {
        if (j != j2) {
            m26154d(str, Long.valueOf(j), Long.valueOf(j2));
            throw null;
        }
    }

    /* renamed from: c */
    public static void m26153c(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    /* renamed from: d */
    public static void m26154d(String str, Object obj, Object obj2) {
        m26153c(m26155e(str, obj, obj2));
        throw null;
    }

    /* renamed from: e */
    public static String m26155e(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            return str2 + "expected: " + m26156f(obj, valueOf) + " but was: " + m26156f(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    /* renamed from: f */
    public static String m26156f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        return name + "<" + str + ">";
    }
}

package p040c.p048b.p049a.p050a.p051a.p067t;

import androidx.test.internal.runner.RunnerArgs;

/* renamed from: c.b.a.a.a.t.h */
/* compiled from: ScopeUtils */
public class C1479h {
    /* renamed from: a */
    public static String m816a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i < strArr.length - 1) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String[] m817b(String str) {
        return str.split(RunnerArgs.CLASS_SEPARATOR);
    }
}

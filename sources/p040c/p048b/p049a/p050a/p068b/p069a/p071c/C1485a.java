package p040c.p048b.p049a.p050a.p068b.p069a.p071c;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.test.internal.runner.RunnerArgs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;

/* renamed from: c.b.a.a.b.a.c.a */
/* compiled from: MAPLog */
public final class C1485a {

    /* renamed from: a */
    public static final String f662a = "c.b.a.a.b.a.c.a";

    /* renamed from: b */
    public static boolean f663b = m834g();

    /* renamed from: a */
    public static int m828a(String str, String str2) {
        return Log.d(str, str2);
    }

    /* renamed from: b */
    public static int m829b(String str, String str2) {
        return Log.e(str, str2);
    }

    /* renamed from: c */
    public static int m830c(String str, String str2, Throwable th) {
        return Log.e(str, str2, th);
    }

    /* renamed from: d */
    public static String m831d(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append(RunnerArgs.CLASSPATH_SEPARATOR);
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static int m832e(String str, String str2) {
        return Log.i(str, str2);
    }

    /* renamed from: f */
    public static int m833f(String str, String str2, Throwable th) {
        return Log.i(str, str2, th);
    }

    /* renamed from: g */
    public static boolean m834g() {
        try {
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                m838k(f662a, "Incremental version was empty");
                return false;
            }
            Pattern compile = Pattern.compile("^(?:(.*?)_)??(?:([^_]*)_)?([0-9]+)$");
            String str2 = f662a;
            m836i(str2, "Extracting verison incremental", "Build.VERSION.INCREMENTAL: " + str);
            Matcher matcher = compile.matcher(str);
            if (!matcher.find()) {
                String str3 = f662a;
                m836i(str3, "Incremental version '%s' was in invalid format.", "ver=" + str);
                return false;
            } else if (matcher.groupCount() < 3) {
                m829b(f662a, "Error parsing build version string.");
                return false;
            } else {
                String group = matcher.group(2);
                String str4 = f662a;
                m836i(str4, "Extracting flavor", "Build flavor: " + group);
                if (!TextUtils.isEmpty(group) && (group.equals("userdebug") || group.equals("eng"))) {
                    m832e(f662a, "MAP is running on 1st party debug");
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            m830c(f662a, e.getMessage(), e);
        }
    }

    /* renamed from: h */
    public static int m835h(String str, String str2, String str3, Throwable th, int i) {
        if (th != null) {
            if (i == 4) {
                return Log.i(str, m831d(str2, str3), th);
            }
            return Log.d(str, m831d(str2, str3), th);
        } else if (i == 4) {
            return Log.i(str, m831d(str2, str3));
        } else {
            return Log.d(str, m831d(str2, str3));
        }
    }

    /* renamed from: i */
    public static int m836i(String str, String str2, String str3) {
        return m837j(str, str2, str3, (Throwable) null);
    }

    /* renamed from: j */
    public static int m837j(String str, String str2, String str3, Throwable th) {
        if (str == null) {
            str = "NULL_TAG";
        }
        String str4 = str + ".PII";
        char c = 3;
        if (f663b) {
            c = 4;
        } else if (C1445b.m721b() && Log.isLoggable("com.amazon.identity.pii", 3)) {
            return m835h(str4, str2, str3, th, 3);
        } else {
            if (!C1445b.m721b()) {
                return m835h(str4, str2, str3, th, 3);
            }
            str3 = "<obscured>";
        }
        if (th != null) {
            if (c == 4) {
                return Log.i(str4, m831d(str2, str3), th);
            }
            return Log.d(str4, m831d(str2, str3), th);
        } else if (c == 4) {
            return Log.i(str4, m831d(str2, str3));
        } else {
            return Log.d(str4, m831d(str2, str3));
        }
    }

    /* renamed from: k */
    public static int m838k(String str, String str2) {
        return Log.w(str, str2);
    }

    /* renamed from: l */
    public static int m839l(String str, String str2, Throwable th) {
        return Log.w(str, str2, th);
    }
}

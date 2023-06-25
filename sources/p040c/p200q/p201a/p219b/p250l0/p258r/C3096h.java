package p040c.p200q.p201a.p219b.p250l0.p258r;

import androidx.test.internal.runner.RunnerArgs;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.r.h */
/* compiled from: WebvttParserUtil */
public final class C3096h {

    /* renamed from: a */
    public static final Pattern f5641a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: a */
    public static Matcher m7517a(C3173t tVar) {
        String l;
        while (true) {
            String l2 = tVar.mo20019l();
            if (l2 == null) {
                return null;
            }
            if (f5641a.matcher(l2).matches()) {
                do {
                    l = tVar.mo20019l();
                    if (l == null) {
                        break;
                    }
                } while (l.isEmpty());
            } else {
                Matcher matcher = C3092f.f5626b.matcher(l2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m7518b(C3173t tVar) {
        String l = tVar.mo20019l();
        return l != null && l.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m7519c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m7520d(String str) {
        String[] g0 = C3152e0.m7800g0(str, "\\.");
        long j = 0;
        for (String parseLong : C3152e0.m7798f0(g0[0], RunnerArgs.CLASSPATH_SEPARATOR)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (g0.length == 2) {
            j2 += Long.parseLong(g0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: e */
    public static void m7521e(C3173t tVar) {
        int c = tVar.mo20010c();
        if (!m7518b(tVar)) {
            tVar.mo20006L(c);
            throw new ParserException("Expected WEBVTT. Got " + tVar.mo20019l());
        }
    }
}

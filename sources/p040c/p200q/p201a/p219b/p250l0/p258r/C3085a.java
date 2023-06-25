package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.TextUtils;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3156h;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.r.a */
/* compiled from: CssParser */
public final class C3085a {

    /* renamed from: c */
    public static final Pattern f5588c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    public final C3173t f5589a = new C3173t();

    /* renamed from: b */
    public final StringBuilder f5590b = new StringBuilder();

    /* renamed from: b */
    public static boolean m7437b(C3173t tVar) {
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        byte[] bArr = tVar.f5877a;
        if (c + 2 > d) {
            return false;
        }
        int i = c + 1;
        if (bArr[c] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= d) {
                tVar.mo20007M(d - tVar.mo20010c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    public static boolean m7438c(C3173t tVar) {
        char j = m7444j(tVar, tVar.mo20010c());
        if (j != 9 && j != 10 && j != 12 && j != 13 && j != ' ') {
            return false;
        }
        tVar.mo20007M(1);
        return true;
    }

    /* renamed from: e */
    public static String m7439e(C3173t tVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        while (c < d && !z) {
            char c2 = (char) tVar.f5877a[c];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                c++;
                sb.append(c2);
            }
        }
        tVar.mo20007M(c - tVar.mo20010c());
        return sb.toString();
    }

    /* renamed from: f */
    public static String m7440f(C3173t tVar, StringBuilder sb) {
        m7447m(tVar);
        if (tVar.mo20008a() == 0) {
            return null;
        }
        String e = m7439e(tVar, sb);
        if (!"".equals(e)) {
            return e;
        }
        return "" + ((char) tVar.mo20032y());
    }

    /* renamed from: g */
    public static String m7441g(C3173t tVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c = tVar.mo20010c();
            String f = m7440f(tVar, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR.equals(f)) {
                tVar.mo20006L(c);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m7442h(C3173t tVar, StringBuilder sb) {
        m7447m(tVar);
        if (tVar.mo20008a() < 5 || !"::cue".equals(tVar.mo20029v(5))) {
            return null;
        }
        int c = tVar.mo20010c();
        String f = m7440f(tVar, sb);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            tVar.mo20006L(c);
            return "";
        }
        String k = "(".equals(f) ? m7445k(tVar) : null;
        String f2 = m7440f(tVar, sb);
        if (!")".equals(f2) || f2 == null) {
            return null;
        }
        return k;
    }

    /* renamed from: i */
    public static void m7443i(C3173t tVar, C3088d dVar, StringBuilder sb) {
        m7447m(tVar);
        String e = m7439e(tVar, sb);
        if (!"".equals(e) && RunnerArgs.CLASSPATH_SEPARATOR.equals(m7440f(tVar, sb))) {
            m7447m(tVar);
            String g = m7441g(tVar, sb);
            if (g != null && !"".equals(g)) {
                int c = tVar.mo20010c();
                String f = m7440f(tVar, sb);
                if (!MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR.equals(f)) {
                    if ("}".equals(f)) {
                        tVar.mo20006L(c);
                    } else {
                        return;
                    }
                }
                if ("color".equals(e)) {
                    dVar.mo19787p(C3156h.m7852c(g));
                } else if ("background-color".equals(e)) {
                    dVar.mo19785n(C3156h.m7852c(g));
                } else if ("text-decoration".equals(e)) {
                    if ("underline".equals(g)) {
                        dVar.mo19794w(true);
                    }
                } else if ("font-family".equals(e)) {
                    dVar.mo19788q(g);
                } else if ("font-weight".equals(e)) {
                    if ("bold".equals(g)) {
                        dVar.mo19786o(true);
                    }
                } else if ("font-style".equals(e) && "italic".equals(g)) {
                    dVar.mo19789r(true);
                }
            }
        }
    }

    /* renamed from: j */
    public static char m7444j(C3173t tVar, int i) {
        return (char) tVar.f5877a[i];
    }

    /* renamed from: k */
    public static String m7445k(C3173t tVar) {
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        boolean z = false;
        while (c < d && !z) {
            int i = c + 1;
            z = ((char) tVar.f5877a[c]) == ')';
            c = i;
        }
        return tVar.mo20029v((c - 1) - tVar.mo20010c()).trim();
    }

    /* renamed from: l */
    public static void m7446l(C3173t tVar) {
        do {
        } while (!TextUtils.isEmpty(tVar.mo20019l()));
    }

    /* renamed from: m */
    public static void m7447m(C3173t tVar) {
        while (true) {
            boolean z = true;
            while (tVar.mo20008a() > 0 && z) {
                if (!m7438c(tVar) && !m7437b(tVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo19769a(C3088d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f5588c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo19793v(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] f0 = C3152e0.m7798f0(str, "\\.");
            String str2 = f0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo19792u(str2.substring(0, indexOf2));
                dVar.mo19791t(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo19792u(str2);
            }
            if (f0.length > 1) {
                dVar.mo19790s((String[]) Arrays.copyOfRange(f0, 1, f0.length));
            }
        }
    }

    /* renamed from: d */
    public C3088d mo19770d(C3173t tVar) {
        this.f5590b.setLength(0);
        int c = tVar.mo20010c();
        m7446l(tVar);
        this.f5589a.mo20004J(tVar.f5877a, tVar.mo20010c());
        this.f5589a.mo20006L(c);
        String h = m7442h(this.f5589a, this.f5590b);
        if (h == null || !"{".equals(m7440f(this.f5589a, this.f5590b))) {
            return null;
        }
        C3088d dVar = new C3088d();
        mo19769a(dVar, h);
        String str = null;
        boolean z = false;
        while (!z) {
            int c2 = this.f5589a.mo20010c();
            str = m7440f(this.f5589a, this.f5590b);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f5589a.mo20006L(c2);
                m7443i(this.f5589a, dVar, this.f5590b);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return dVar;
        }
        return null;
    }
}

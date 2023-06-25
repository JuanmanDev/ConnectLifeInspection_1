package p040c.p200q.p201a.p264c.p340i.p342b;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.i3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5515i3 extends C5589o5 {

    /* renamed from: c */
    public char f10542c = 0;

    /* renamed from: d */
    public long f10543d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    public String f10544e;

    /* renamed from: f */
    public final C5491g3 f10545f = new C5491g3(this, 6, false, false);

    /* renamed from: g */
    public final C5491g3 f10546g = new C5491g3(this, 6, true, false);

    /* renamed from: h */
    public final C5491g3 f10547h = new C5491g3(this, 6, false, true);

    /* renamed from: i */
    public final C5491g3 f10548i = new C5491g3(this, 5, false, false);

    /* renamed from: j */
    public final C5491g3 f10549j = new C5491g3(this, 5, true, false);

    /* renamed from: k */
    public final C5491g3 f10550k = new C5491g3(this, 5, false, true);

    /* renamed from: l */
    public final C5491g3 f10551l = new C5491g3(this, 4, false, false);

    /* renamed from: m */
    public final C5491g3 f10552m = new C5491g3(this, 3, false, false);

    /* renamed from: n */
    public final C5491g3 f10553n = new C5491g3(this, 2, false, false);

    public C5515i3(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: A */
    public static String m15771A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m15772B(z, obj);
        String B2 = m15772B(z, obj2);
        String B3 = m15772B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m15772B(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = AccountManagerConstants$LOCALE.LOCALE_SEPERATOR;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String G = m15775G(C5648t4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m15775G(className).equals(G)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof C5503h3) {
                return ((C5503h3) obj).f10516a;
            } else {
                if (z) {
                    return AccountManagerConstants$LOCALE.LOCALE_SEPERATOR;
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: G */
    public static String m15775G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    public static Object m15778z(String str) {
        if (str == null) {
            return null;
        }
        return new C5503h3(str);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: C */
    public final String mo28336C() {
        String str;
        synchronized (this) {
            if (this.f10544e == null) {
                if (this.f10699a.mo28632Q() != null) {
                    this.f10544e = this.f10699a.mo28632Q();
                } else {
                    this.f10544e = this.f10699a.mo28649z().mo28255w();
                }
            }
            C3495o.m8908j(this.f10544e);
            str = this.f10544e;
        }
        return str;
    }

    /* renamed from: F */
    public final void mo28337F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo28336C(), i)) {
            Log.println(i, mo28336C(), m15771A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C3495o.m8908j(str);
            C5612q4 G = this.f10699a.mo28623G();
            if (G == null) {
                Log.println(6, mo28336C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo28505n()) {
                Log.println(6, mo28336C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                G.mo28540z(new C5479f3(this, i, str, obj, obj2, obj3));
            }
        }
    }

    /* renamed from: j */
    public final boolean mo28227j() {
        return false;
    }

    /* renamed from: q */
    public final C5491g3 mo28338q() {
        return this.f10552m;
    }

    /* renamed from: r */
    public final C5491g3 mo28339r() {
        return this.f10545f;
    }

    /* renamed from: s */
    public final C5491g3 mo28340s() {
        return this.f10547h;
    }

    /* renamed from: t */
    public final C5491g3 mo28341t() {
        return this.f10546g;
    }

    /* renamed from: u */
    public final C5491g3 mo28342u() {
        return this.f10551l;
    }

    /* renamed from: v */
    public final C5491g3 mo28343v() {
        return this.f10553n;
    }

    /* renamed from: w */
    public final C5491g3 mo28344w() {
        return this.f10548i;
    }

    /* renamed from: x */
    public final C5491g3 mo28345x() {
        return this.f10550k;
    }

    /* renamed from: y */
    public final C5491g3 mo28346y() {
        return this.f10549j;
    }
}

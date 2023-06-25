package p040c.p200q.p201a.p264c.p340i.p342b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5074g3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5169m3;

/* renamed from: c.q.a.c.i.b.sa */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C5642sa {

    /* renamed from: a */
    public final String f10868a;

    /* renamed from: b */
    public final int f10869b;

    /* renamed from: c */
    public Boolean f10870c;

    /* renamed from: d */
    public Boolean f10871d;

    /* renamed from: e */
    public Long f10872e;

    /* renamed from: f */
    public Long f10873f;

    public C5642sa(String str, int i) {
        this.f10868a = str;
        this.f10869b = i;
    }

    /* renamed from: d */
    public static Boolean m16076d(String str, int i, boolean z, String str2, List list, String str3, C5515i3 i3Var) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (i3Var != null) {
                        i3Var.mo28344w().mo28260b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    public static Boolean m16077e(BigDecimal bigDecimal, C5074g3 g3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C3495o.m8908j(g3Var);
        if (g3Var.mo27263J()) {
            boolean z = true;
            if (g3Var.mo27268P() != 1) {
                if (g3Var.mo27268P() == 5) {
                    if (!g3Var.mo27267N() || !g3Var.mo27266M()) {
                        return null;
                    }
                } else if (!g3Var.mo27264K()) {
                    return null;
                }
                int P = g3Var.mo27268P();
                if (g3Var.mo27268P() == 5) {
                    if (C5426aa.m15493N(g3Var.mo27261H()) && C5426aa.m15493N(g3Var.mo27260G())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(g3Var.mo27261H());
                            bigDecimal3 = new BigDecimal(g3Var.mo27260G());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C5426aa.m15493N(g3Var.mo27259F())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(g3Var.mo27259F());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (P == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = P - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Boolean m16078f(String str, C5169m3 m3Var, C5515i3 i3Var) {
        String str2;
        List list;
        C3495o.m8908j(m3Var);
        if (str == null || !m3Var.mo27412L() || m3Var.mo27413M() == 1) {
            return null;
        }
        if (m3Var.mo27413M() == 7) {
            if (m3Var.mo27406D() == 0) {
                return null;
            }
        } else if (!m3Var.mo27411K()) {
            return null;
        }
        int M = m3Var.mo27413M();
        boolean I = m3Var.mo27409I();
        if (I || M == 2 || M == 7) {
            str2 = m3Var.mo27407G();
        } else {
            str2 = m3Var.mo27407G().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (m3Var.mo27406D() == 0) {
            list = null;
        } else {
            List<String> H = m3Var.mo27408H();
            if (!I) {
                ArrayList arrayList = new ArrayList(H.size());
                for (String upperCase : H) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                H = Collections.unmodifiableList(arrayList);
            }
            list = H;
        }
        return m16076d(str, M, I, str3, list, M == 2 ? str3 : null, i3Var);
    }

    /* renamed from: g */
    public static Boolean m16079g(double d, C5074g3 g3Var) {
        try {
            return m16077e(new BigDecimal(d), g3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m16080h(long j, C5074g3 g3Var) {
        try {
            return m16077e(new BigDecimal(j), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m16081i(String str, C5074g3 g3Var) {
        if (!C5426aa.m15493N(str)) {
            return null;
        }
        try {
            return m16077e(new BigDecimal(str), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Boolean m16082j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo28594a();

    /* renamed from: b */
    public abstract boolean mo28595b();

    /* renamed from: c */
    public abstract boolean mo28596c();
}

package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import androidx.test.internal.runner.RunnerArgs;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p250l0.p258r.C3089e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.r.f */
/* compiled from: WebvttCueParser */
public final class C3092f {

    /* renamed from: b */
    public static final Pattern f5626b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    public static final Pattern f5627c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    public final StringBuilder f5628a = new StringBuilder();

    /* renamed from: c.q.a.b.l0.r.f$a */
    /* compiled from: WebvttCueParser */
    public static final class C3093a {

        /* renamed from: e */
        public static final String[] f5629e = new String[0];

        /* renamed from: a */
        public final String f5630a;

        /* renamed from: b */
        public final int f5631b;

        /* renamed from: c */
        public final String f5632c;

        /* renamed from: d */
        public final String[] f5633d;

        public C3093a(String str, int i, String str2, String[] strArr) {
            this.f5631b = i;
            this.f5630a = str;
            this.f5632c = str2;
            this.f5633d = strArr;
        }

        /* renamed from: a */
        public static C3093a m7510a(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] f0 = C3152e0.m7798f0(trim, "\\.");
            String str3 = f0[0];
            if (f0.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(f0, 1, f0.length);
            } else {
                strArr = f5629e;
            }
            return new C3093a(str3, i, str2, strArr);
        }

        /* renamed from: b */
        public static C3093a m7511b() {
            return new C3093a("", 0, "", new String[0]);
        }
    }

    /* renamed from: c.q.a.b.l0.r.f$b */
    /* compiled from: WebvttCueParser */
    public static final class C3094b implements Comparable<C3094b> {

        /* renamed from: e */
        public final int f5634e;

        /* renamed from: l */
        public final C3088d f5635l;

        public C3094b(int i, C3088d dVar) {
            this.f5634e = i;
            this.f5635l = dVar;
        }

        /* renamed from: c */
        public int compareTo(@NonNull C3094b bVar) {
            return this.f5634e - bVar.f5634e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7495a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r2
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r4
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0079
            if (r0 == r4) goto L_0x0073
            if (r0 == r3) goto L_0x006d
            if (r0 == r2) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r6, r5)
            goto L_0x007e
        L_0x0067:
            r5 = 38
            r6.append(r5)
            goto L_0x007e
        L_0x006d:
            r5 = 32
            r6.append(r5)
            goto L_0x007e
        L_0x0073:
            r5 = 62
            r6.append(r5)
            goto L_0x007e
        L_0x0079:
            r5 = 60
            r6.append(r5)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.m7495a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e A[LOOP:0: B:43:0x009c->B:44:0x009e, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7496b(java.lang.String r8, p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.C3093a r9, android.text.SpannableStringBuilder r10, java.util.List<p040c.p200q.p201a.p219b.p250l0.p258r.C3088d> r11, java.util.List<p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.C3094b> r12) {
        /*
            int r0 = r9.f5631b
            int r1 = r10.length()
            java.lang.String r2 = r9.f5630a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0067
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x005d
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0053
            r7 = 98
            if (r3 == r7) goto L_0x0049
            r7 = 99
            if (r3 == r7) goto L_0x003f
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x0035
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 5
            goto L_0x0072
        L_0x0035:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = r5
            goto L_0x0072
        L_0x003f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 3
            goto L_0x0072
        L_0x0049:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = r4
            goto L_0x0072
        L_0x0053:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 4
            goto L_0x0072
        L_0x005d:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = r6
            goto L_0x0072
        L_0x0067:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 6
            goto L_0x0072
        L_0x0071:
            r2 = -1
        L_0x0072:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0081;
                case 2: goto L_0x0078;
                case 3: goto L_0x0092;
                case 4: goto L_0x0092;
                case 5: goto L_0x0092;
                case 6: goto L_0x0092;
                default: goto L_0x0077;
            }
        L_0x0077:
            return
        L_0x0078:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0092
        L_0x0081:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0092
        L_0x008a:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            r10.setSpan(r2, r0, r1, r3)
        L_0x0092:
            r12.clear()
            m7499e(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x009c:
            if (r4 >= r8) goto L_0x00ac
            java.lang.Object r9 = r12.get(r4)
            c.q.a.b.l0.r.f$b r9 = (p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.C3094b) r9
            c.q.a.b.l0.r.d r9 = r9.f5635l
            m7497c(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.m7496b(java.lang.String, c.q.a.b.l0.r.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: c */
    public static void m7497c(SpannableStringBuilder spannableStringBuilder, C3088d dVar, int i, int i2) {
        if (dVar != null) {
            if (dVar.mo19778g() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.mo19778g()), i, i2, 33);
            }
            if (dVar.mo19782k()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.mo19783l()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.mo19781j()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.mo19773b()), i, i2, 33);
            }
            if (dVar.mo19780i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.mo19772a()), i, i2, 33);
            }
            if (dVar.mo19774c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.mo19774c()), i, i2, 33);
            }
            if (dVar.mo19779h() != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.mo19779h()), i, i2, 33);
            }
            int e = dVar.mo19776e();
            if (e == 1) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.mo19775d(), true), i, i2, 33);
            } else if (e == 2) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.mo19775d()), i, i2, 33);
            } else if (e == 3) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.mo19775d() / 100.0f), i, i2, 33);
            }
        }
    }

    /* renamed from: d */
    public static int m7498d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: e */
    public static void m7499e(List<C3088d> list, String str, C3093a aVar, List<C3094b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3088d dVar = list.get(i);
            int f = dVar.mo19777f(str, aVar.f5630a, aVar.f5633d, aVar.f5632c);
            if (f > 0) {
                list2.add(new C3094b(f, dVar));
            }
        }
        Collections.sort(list2);
    }

    /* renamed from: f */
    public static String m7500f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return C3152e0.m7800g0(trim, "[ \\.]")[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7501g(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 98
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 99
            if (r0 == r1) goto L_0x004c
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0042
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0038
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0024
            goto L_0x0060
        L_0x0024:
            java.lang.String r0 = "v"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r3
            goto L_0x0061
        L_0x002e:
            java.lang.String r0 = "u"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r4
            goto L_0x0061
        L_0x0038:
            java.lang.String r0 = "lang"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r5
            goto L_0x0061
        L_0x0042:
            java.lang.String r0 = "i"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r6
            goto L_0x0061
        L_0x004c:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r7
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "b"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = r2
            goto L_0x0061
        L_0x0060:
            r8 = -1
        L_0x0061:
            if (r8 == 0) goto L_0x006e
            if (r8 == r7) goto L_0x006e
            if (r8 == r6) goto L_0x006e
            if (r8 == r5) goto L_0x006e
            if (r8 == r4) goto L_0x006e
            if (r8 == r3) goto L_0x006e
            return r2
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.m7501g(java.lang.String):boolean");
    }

    /* renamed from: i */
    public static boolean m7502i(String str, Matcher matcher, C3173t tVar, C3089e.C3091b bVar, StringBuilder sb, List<C3088d> list) {
        try {
            bVar.mo19805j(C3096h.m7520d(matcher.group(1)));
            bVar.mo19799d(C3096h.m7520d(matcher.group(2)));
            m7503j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String l = tVar.mo20019l();
                if (!TextUtils.isEmpty(l)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(l.trim());
                } else {
                    m7504k(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            C3163m.m7880f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    /* renamed from: j */
    public static void m7503j(String str, C3089e.C3091b bVar) {
        Matcher matcher = f5627c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m7505l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.mo19807l(m7508o(group2));
                } else if ("position".equals(group)) {
                    m7507n(group2, bVar);
                } else if (RunnerArgs.ARGUMENT_TEST_SIZE.equals(group)) {
                    bVar.mo19808m(C3096h.m7519c(group2));
                } else {
                    C3163m.m7880f("WebvttCueParser", "Unknown cue setting " + group + RunnerArgs.CLASSPATH_SEPARATOR + group2);
                }
            } catch (NumberFormatException unused) {
                C3163m.m7880f("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: k */
    public static void m7504k(String str, String str2, C3089e.C3091b bVar, List<C3088d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m7495a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m7498d(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String f = m7500f(substring);
                    if (f != null && m7501g(f)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                C3093a aVar = (C3093a) arrayDeque.pop();
                                m7496b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.f5630a.equals(f)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(C3093a.m7510a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m7496b(str, (C3093a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        m7496b(str, C3093a.m7511b(), spannableStringBuilder, list, arrayList);
        bVar.mo19806k(spannableStringBuilder);
    }

    /* renamed from: l */
    public static void m7505l(String str, C3089e.C3091b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo19801f(m7506m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo19801f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.mo19800e(C3096h.m7519c(str));
            bVar.mo19802g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.mo19800e((float) parseInt);
        bVar.mo19802g(1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7506m(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r1
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0056:
            return r3
        L_0x0057:
            return r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.m7506m(java.lang.String):int");
    }

    /* renamed from: n */
    public static void m7507n(String str, C3089e.C3091b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo19804i(m7506m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo19804i(Integer.MIN_VALUE);
        }
        bVar.mo19803h(C3096h.m7519c(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout.Alignment m7508o(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = r1
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = r5
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = r3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = r4
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0074
            if (r0 == r4) goto L_0x0071
            if (r0 == r3) goto L_0x0071
            if (r0 == r2) goto L_0x006e
            if (r0 == r1) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid alignment value: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r0, r6)
            r6 = 0
            return r6
        L_0x006e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r6
        L_0x0071:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            return r6
        L_0x0074:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p258r.C3092f.m7508o(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: h */
    public boolean mo19809h(C3173t tVar, C3089e.C3091b bVar, List<C3088d> list) {
        String l = tVar.mo20019l();
        if (l == null) {
            return false;
        }
        Matcher matcher = f5626b.matcher(l);
        if (matcher.matches()) {
            return m7502i((String) null, matcher, tVar, bVar, this.f5628a, list);
        }
        String l2 = tVar.mo20019l();
        if (l2 == null) {
            return false;
        }
        Matcher matcher2 = f5626b.matcher(l2);
        if (!matcher2.matches()) {
            return false;
        }
        return m7502i(l.trim(), matcher2, tVar, bVar, this.f5628a, list);
    }
}

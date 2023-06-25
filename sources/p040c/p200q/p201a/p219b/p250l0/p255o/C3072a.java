package p040c.p200q.p201a.p219b.p250l0.p255o;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3164n;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.o.a */
/* compiled from: SubripDecoder */
public final class C3072a extends C3032b {

    /* renamed from: p */
    public static final Pattern f5517p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: q */
    public static final Pattern f5518q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n */
    public final StringBuilder f5519n = new StringBuilder();

    /* renamed from: o */
    public final ArrayList<String> f5520o = new ArrayList<>();

    public C3072a() {
        super("SubripDecoder");
    }

    /* renamed from: D */
    public static float m7352D(int i) {
        if (i != 0) {
            return i != 1 ? 0.92f : 0.5f;
        }
        return 0.08f;
    }

    /* renamed from: E */
    public static long m7353E(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p219b.p250l0.C3031a mo19716B(android.text.Spanned r19, @androidx.annotation.Nullable java.lang.String r20) {
        /*
            r18 = this;
            r0 = r20
            if (r0 != 0) goto L_0x000c
            c.q.a.b.l0.a r0 = new c.q.a.b.l0.a
            r2 = r19
            r0.<init>(r2)
            return r0
        L_0x000c:
            r2 = r19
            int r1 = r20.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r16 = 0
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r1) {
                case -685620710: goto L_0x0078;
                case -685620679: goto L_0x0070;
                case -685620648: goto L_0x0068;
                case -685620617: goto L_0x0060;
                case -685620586: goto L_0x0058;
                case -685620555: goto L_0x0050;
                case -685620524: goto L_0x0048;
                case -685620493: goto L_0x003f;
                case -685620462: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0081
        L_0x0037:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0081
            r1 = 5
            goto L_0x0082
        L_0x003f:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0081
            r1 = 8
            goto L_0x0082
        L_0x0048:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0081
            r1 = r15
            goto L_0x0082
        L_0x0050:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0081
            r1 = r4
            goto L_0x0082
        L_0x0058:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0081
            r1 = 7
            goto L_0x0082
        L_0x0060:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0081
            r1 = r3
            goto L_0x0082
        L_0x0068:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0081
            r1 = r5
            goto L_0x0082
        L_0x0070:
            boolean r1 = r0.equals(r13)
            if (r1 == 0) goto L_0x0081
            r1 = 6
            goto L_0x0082
        L_0x0078:
            boolean r1 = r0.equals(r14)
            if (r1 == 0) goto L_0x0081
            r1 = r16
            goto L_0x0082
        L_0x0081:
            r1 = -1
        L_0x0082:
            if (r1 == 0) goto L_0x0095
            if (r1 == r3) goto L_0x0095
            if (r1 == r15) goto L_0x0095
            if (r1 == r5) goto L_0x0092
            if (r1 == r4) goto L_0x0092
            r4 = 5
            if (r1 == r4) goto L_0x0092
            r17 = r3
            goto L_0x0097
        L_0x0092:
            r17 = r15
            goto L_0x0097
        L_0x0095:
            r17 = r16
        L_0x0097:
            int r1 = r20.hashCode()
            switch(r1) {
                case -685620710: goto L_0x00e0;
                case -685620679: goto L_0x00d8;
                case -685620648: goto L_0x00d0;
                case -685620617: goto L_0x00c8;
                case -685620586: goto L_0x00c0;
                case -685620555: goto L_0x00b7;
                case -685620524: goto L_0x00af;
                case -685620493: goto L_0x00a7;
                case -685620462: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x00e9
        L_0x009f:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e9
            r0 = 5
            goto L_0x00ea
        L_0x00a7:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e9
            r0 = 4
            goto L_0x00ea
        L_0x00af:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e9
            r0 = r5
            goto L_0x00ea
        L_0x00b7:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e9
            r0 = 8
            goto L_0x00ea
        L_0x00c0:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e9
            r0 = 7
            goto L_0x00ea
        L_0x00c8:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e9
            r0 = 6
            goto L_0x00ea
        L_0x00d0:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e9
            r0 = r15
            goto L_0x00ea
        L_0x00d8:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e9
            r0 = r3
            goto L_0x00ea
        L_0x00e0:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e9
            r0 = r16
            goto L_0x00ea
        L_0x00e9:
            r0 = -1
        L_0x00ea:
            if (r0 == 0) goto L_0x00fd
            if (r0 == r3) goto L_0x00fd
            if (r0 == r15) goto L_0x00fd
            if (r0 == r5) goto L_0x00fa
            r1 = 4
            if (r0 == r1) goto L_0x00fa
            r1 = 5
            if (r0 == r1) goto L_0x00fa
            r6 = r3
            goto L_0x00fe
        L_0x00fa:
            r6 = r16
            goto L_0x00fe
        L_0x00fd:
            r6 = r15
        L_0x00fe:
            c.q.a.b.l0.a r0 = new c.q.a.b.l0.a
            r3 = 0
            float r4 = m7352D(r6)
            r5 = 0
            float r7 = m7352D(r17)
            r9 = 1
            r1 = r0
            r2 = r19
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p255o.C3072a.mo19716B(android.text.Spanned, java.lang.String):c.q.a.b.l0.a");
    }

    /* renamed from: C */
    public C3073b mo19616y(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        C3164n nVar = new C3164n();
        C3173t tVar = new C3173t(bArr, i);
        while (true) {
            String l = tVar.mo20019l();
            if (l == null) {
                break;
            } else if (l.length() != 0) {
                try {
                    Integer.parseInt(l);
                    String l2 = tVar.mo20019l();
                    if (l2 == null) {
                        C3163m.m7880f("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f5517p.matcher(l2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        nVar.mo19974a(m7353E(matcher, 1));
                        int i2 = 0;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            nVar.mo19974a(m7353E(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.f5519n.setLength(0);
                        this.f5520o.clear();
                        while (true) {
                            String l3 = tVar.mo20019l();
                            if (TextUtils.isEmpty(l3)) {
                                break;
                            }
                            if (this.f5519n.length() > 0) {
                                this.f5519n.append("<br>");
                            }
                            this.f5519n.append(mo19718F(l3, this.f5520o));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f5519n.toString());
                        while (true) {
                            if (i2 >= this.f5520o.size()) {
                                str = null;
                                break;
                            }
                            str = this.f5520o.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(mo19716B(fromHtml, str));
                        if (z2) {
                            arrayList.add((Object) null);
                        }
                    } else {
                        C3163m.m7880f("SubripDecoder", "Skipping invalid timing: " + l2);
                    }
                } catch (NumberFormatException unused) {
                    C3163m.m7880f("SubripDecoder", "Skipping invalid index: " + l);
                }
            }
        }
        C3031a[] aVarArr = new C3031a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new C3073b(aVarArr, nVar.mo19977d());
    }

    /* renamed from: F */
    public final String mo19718F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f5518q.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }
}

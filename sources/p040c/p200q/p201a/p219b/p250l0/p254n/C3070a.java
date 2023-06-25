package p040c.p200q.p201a.p219b.p250l0.p254n;

import androidx.test.internal.runner.RunnerArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3164n;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.n.a */
/* compiled from: SsaDecoder */
public final class C3070a extends C3032b {

    /* renamed from: s */
    public static final Pattern f5509s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: n */
    public final boolean f5510n;

    /* renamed from: o */
    public int f5511o;

    /* renamed from: p */
    public int f5512p;

    /* renamed from: q */
    public int f5513q;

    /* renamed from: r */
    public int f5514r;

    public C3070a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f5510n = false;
            return;
        }
        this.f5510n = true;
        String t = C3152e0.m7820t(list.get(0));
        C3151e.m7753a(t.startsWith("Format: "));
        mo19714E(t);
        mo19715F(new C3173t(list.get(1)));
    }

    /* renamed from: G */
    public static long m7341G(String str) {
        Matcher matcher = f5509s.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * EventLoop_commonKt.MS_TO_NS) + (Long.parseLong(matcher.group(2)) * 60 * EventLoop_commonKt.MS_TO_NS) + (Long.parseLong(matcher.group(3)) * EventLoop_commonKt.MS_TO_NS) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* renamed from: B */
    public C3071b mo19616y(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C3164n nVar = new C3164n();
        C3173t tVar = new C3173t(bArr, i);
        if (!this.f5510n) {
            mo19715F(tVar);
        }
        mo19713D(tVar, arrayList, nVar);
        C3031a[] aVarArr = new C3031a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new C3071b(aVarArr, nVar.mo19977d());
    }

    /* renamed from: C */
    public final void mo19712C(String str, List<C3031a> list, C3164n nVar) {
        long j;
        if (this.f5511o == 0) {
            C3163m.m7880f("SsaDecoder", "Skipping dialogue line before complete format: " + str);
            return;
        }
        String[] split = str.substring(10).split(RunnerArgs.CLASS_SEPARATOR, this.f5511o);
        if (split.length != this.f5511o) {
            C3163m.m7880f("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long G = m7341G(split[this.f5512p]);
        if (G == -9223372036854775807L) {
            C3163m.m7880f("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        String str2 = split[this.f5513q];
        if (!str2.trim().isEmpty()) {
            j = m7341G(str2);
            if (j == -9223372036854775807L) {
                C3163m.m7880f("SsaDecoder", "Skipping invalid timing: " + str);
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        list.add(new C3031a(split[this.f5514r].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        nVar.mo19974a(G);
        if (j != -9223372036854775807L) {
            list.add((Object) null);
            nVar.mo19974a(j);
        }
    }

    /* renamed from: D */
    public final void mo19713D(C3173t tVar, List<C3031a> list, C3164n nVar) {
        while (true) {
            String l = tVar.mo20019l();
            if (l == null) {
                return;
            }
            if (!this.f5510n && l.startsWith("Format: ")) {
                mo19714E(l);
            } else if (l.startsWith("Dialogue: ")) {
                mo19712C(l, list, nVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19714E(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.f5511o = r0
            r0 = -1
            r8.f5512p = r0
            r8.f5513q = r0
            r8.f5514r = r0
            r1 = 0
            r2 = r1
        L_0x0018:
            int r3 = r8.f5511o
            if (r2 >= r3) goto L_0x006d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7810l0(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0050
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0046
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = r1
            goto L_0x005b
        L_0x0046:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = r6
            goto L_0x005b
        L_0x0050:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = r7
            goto L_0x005b
        L_0x005a:
            r3 = r0
        L_0x005b:
            if (r3 == 0) goto L_0x0068
            if (r3 == r7) goto L_0x0065
            if (r3 == r6) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            r8.f5514r = r2
            goto L_0x006a
        L_0x0065:
            r8.f5513q = r2
            goto L_0x006a
        L_0x0068:
            r8.f5512p = r2
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x006d:
            int r9 = r8.f5512p
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f5513q
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f5514r
            if (r9 != r0) goto L_0x007b
        L_0x0079:
            r8.f5511o = r1
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p254n.C3070a.mo19714E(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: F */
    public final void mo19715F(p040c.p200q.p201a.p219b.p261o0.C3173t r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.mo20019l()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "[Events]"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p254n.C3070a.mo19715F(c.q.a.b.o0.t):void");
    }
}

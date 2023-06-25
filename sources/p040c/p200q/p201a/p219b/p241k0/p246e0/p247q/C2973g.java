package p040c.p200q.p201a.p219b.p241k0.p246e0.p247q;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2738j;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.e0.q.g */
/* compiled from: HlsPlaylistParser */
public final class C2973g implements C3138t.C3139a<C2972f> {

    /* renamed from: A */
    public static final Pattern f5060A = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: B */
    public static final Pattern f5061B = m6831c("AUTOSELECT");

    /* renamed from: C */
    public static final Pattern f5062C = m6831c("DEFAULT");

    /* renamed from: D */
    public static final Pattern f5063D = m6831c("FORCED");

    /* renamed from: E */
    public static final Pattern f5064E = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: F */
    public static final Pattern f5065F = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: G */
    public static final Pattern f5066G = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: b */
    public static final Pattern f5067b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    public static final Pattern f5068c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    public static final Pattern f5069d = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: e */
    public static final Pattern f5070e = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f5071f = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f5072g = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: h */
    public static final Pattern f5073h = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: i */
    public static final Pattern f5074i = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: j */
    public static final Pattern f5075j = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: k */
    public static final Pattern f5076k = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: l */
    public static final Pattern f5077l = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: m */
    public static final Pattern f5078m = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: n */
    public static final Pattern f5079n = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: o */
    public static final Pattern f5080o = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f5081p = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: q */
    public static final Pattern f5082q = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: r */
    public static final Pattern f5083r = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: s */
    public static final Pattern f5084s = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: t */
    public static final Pattern f5085t = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: u */
    public static final Pattern f5086u = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: v */
    public static final Pattern f5087v = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: w */
    public static final Pattern f5088w = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: x */
    public static final Pattern f5089x = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: y */
    public static final Pattern f5090y = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: z */
    public static final Pattern f5091z = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: a */
    public final C2968d f5092a;

    /* renamed from: c.q.a.b.k0.e0.q.g$a */
    /* compiled from: HlsPlaylistParser */
    public static class C2974a {

        /* renamed from: a */
        public final BufferedReader f5093a;

        /* renamed from: b */
        public final Queue<String> f5094b;

        /* renamed from: c */
        public String f5095c;

        public C2974a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f5094b = queue;
            this.f5093a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo19444a() {
            String trim;
            if (this.f5095c != null) {
                return true;
            }
            if (!this.f5094b.isEmpty()) {
                this.f5095c = this.f5094b.poll();
                return true;
            }
            do {
                String readLine = this.f5093a.readLine();
                this.f5095c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f5095c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo19445b() {
            if (!mo19444a()) {
                return null;
            }
            String str = this.f5095c;
            this.f5095c = null;
            return str;
        }
    }

    public C2973g() {
        this(C2968d.f5024j);
    }

    /* renamed from: b */
    public static boolean m6830b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int t = m6847t(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (t != "#EXTM3U".charAt(i)) {
                return false;
            }
            t = bufferedReader.read();
        }
        return C3152e0.m7778R(m6847t(bufferedReader, false, t));
    }

    /* renamed from: c */
    public static Pattern m6831c(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }

    /* renamed from: d */
    public static boolean m6832d(List<C2968d.C2969a> list, String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).f5031a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static int m6833f(String str, Map<String, String> map) {
        String n = m6841n(str, f5070e, map);
        if (n != null) {
            return Integer.parseInt(C3152e0.m7800g0(n, "/")[0]);
        }
        return -1;
    }

    /* renamed from: g */
    public static double m6834g(String str, Pattern pattern) {
        return Double.parseDouble(m6844q(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: h */
    public static int m6835h(String str, Pattern pattern) {
        return Integer.parseInt(m6844q(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: i */
    public static long m6836i(String str, Pattern pattern) {
        return Long.parseLong(m6844q(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0201  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d m6837j(p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2973g.C2974a r32, java.lang.String r33) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            r8 = 1
            r9 = r3
            r10 = r9
        L_0x002c:
            boolean r12 = r32.mo19444a()
            if (r12 == 0) goto L_0x0118
            java.lang.String r12 = r32.mo19445b()
            java.lang.String r14 = "#EXT"
            boolean r14 = r12.startsWith(r14)
            if (r14 == 0) goto L_0x0041
            r4.add(r12)
        L_0x0041:
            java.lang.String r14 = "#EXT-X-DEFINE"
            boolean r14 = r12.startsWith(r14)
            if (r14 == 0) goto L_0x0059
            java.util.regex.Pattern r13 = f5090y
            java.lang.String r13 = m6844q(r12, r13, r11)
            java.util.regex.Pattern r14 = f5064E
            java.lang.String r12 = m6844q(r12, r14, r11)
            r11.put(r13, r12)
            goto L_0x002c
        L_0x0059:
            java.lang.String r14 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x0063
            r10 = r8
            goto L_0x002c
        L_0x0063:
            java.lang.String r14 = "#EXT-X-MEDIA"
            boolean r14 = r12.startsWith(r14)
            if (r14 == 0) goto L_0x006f
            r2.add(r12)
            goto L_0x002c
        L_0x006f:
            java.lang.String r14 = "#EXT-X-STREAM-INF"
            boolean r14 = r12.startsWith(r14)
            if (r14 == 0) goto L_0x002c
            java.lang.String r14 = "CLOSED-CAPTIONS=NONE"
            boolean r14 = r12.contains(r14)
            r9 = r9 | r14
            java.util.regex.Pattern r14 = f5069d
            int r14 = m6835h(r12, r14)
            java.util.regex.Pattern r15 = f5067b
            java.lang.String r15 = m6841n(r12, r15, r11)
            if (r15 == 0) goto L_0x0090
            int r14 = java.lang.Integer.parseInt(r15)
        L_0x0090:
            r20 = r14
            java.util.regex.Pattern r14 = f5071f
            java.lang.String r14 = m6841n(r12, r14, r11)
            java.util.regex.Pattern r15 = f5072g
            java.lang.String r15 = m6841n(r12, r15, r11)
            if (r15 == 0) goto L_0x00c3
            java.lang.String r13 = "x"
            java.lang.String[] r13 = r15.split(r13)
            r15 = r13[r3]
            int r15 = java.lang.Integer.parseInt(r15)
            r13 = r13[r8]
            int r13 = java.lang.Integer.parseInt(r13)
            if (r15 <= 0) goto L_0x00bb
            if (r13 > 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            r16 = r13
            r13 = r15
            goto L_0x00be
        L_0x00bb:
            r13 = -1
            r16 = -1
        L_0x00be:
            r21 = r13
            r22 = r16
            goto L_0x00c7
        L_0x00c3:
            r21 = -1
            r22 = -1
        L_0x00c7:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.regex.Pattern r15 = f5073h
            java.lang.String r15 = m6841n(r12, r15, r11)
            if (r15 == 0) goto L_0x00d5
            float r13 = java.lang.Float.parseFloat(r15)
        L_0x00d5:
            r23 = r13
            java.util.regex.Pattern r13 = f5068c
            java.lang.String r12 = m6841n(r12, r13, r11)
            if (r12 == 0) goto L_0x00e8
            if (r14 == 0) goto L_0x00e8
            java.lang.String r13 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7826z(r14, r8)
            r1.put(r12, r13)
        L_0x00e8:
            java.lang.String r12 = r32.mo19445b()
            java.lang.String r12 = m6846s(r12, r11)
            boolean r13 = r0.add(r12)
            if (r13 == 0) goto L_0x002c
            int r13 = r5.size()
            java.lang.String r15 = java.lang.Integer.toString(r13)
            r16 = 0
            r18 = 0
            r24 = 0
            r25 = 0
            java.lang.String r17 = "application/x-mpegURL"
            r19 = r14
            com.google.android.exoplayer2.Format r13 = com.google.android.exoplayer2.Format.m10249w(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            c.q.a.b.k0.e0.q.d$a r14 = new c.q.a.b.k0.e0.q.d$a
            r14.<init>(r12, r13)
            r5.add(r14)
            goto L_0x002c
        L_0x0118:
            r13 = r3
            r12 = 0
            r14 = 0
        L_0x011b:
            int r15 = r2.size()
            if (r13 >= r15) goto L_0x0245
            java.lang.Object r15 = r2.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            int r26 = m6843p(r15)
            java.util.regex.Pattern r0 = f5086u
            java.lang.String r0 = m6841n(r15, r0, r11)
            java.util.regex.Pattern r3 = f5090y
            java.lang.String r3 = m6844q(r15, r3, r11)
            java.util.regex.Pattern r8 = f5089x
            java.lang.String r27 = m6841n(r15, r8, r11)
            java.util.regex.Pattern r8 = f5091z
            java.lang.String r8 = m6841n(r15, r8, r11)
            r28 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r29 = r10
            java.lang.String r10 = ":"
            r2.append(r10)
            r2.append(r3)
            java.lang.String r17 = r2.toString()
            java.util.regex.Pattern r2 = f5088w
            java.lang.String r2 = m6844q(r15, r2, r11)
            int r10 = r2.hashCode()
            r30 = r12
            r12 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            r31 = r4
            r4 = 2
            if (r10 == r12) goto L_0x018e
            r12 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r10 == r12) goto L_0x0184
            r12 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r10 == r12) goto L_0x017a
            goto L_0x0198
        L_0x017a:
            java.lang.String r10 = "AUDIO"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0198
            r2 = 0
            goto L_0x0199
        L_0x0184:
            java.lang.String r10 = "CLOSED-CAPTIONS"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0198
            r2 = r4
            goto L_0x0199
        L_0x018e:
            java.lang.String r10 = "SUBTITLES"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0198
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = -1
        L_0x0199:
            if (r2 == 0) goto L_0x0201
            r10 = 1
            if (r2 == r10) goto L_0x01e6
            if (r2 == r4) goto L_0x01a2
            goto L_0x0237
        L_0x01a2:
            java.util.regex.Pattern r0 = f5060A
            java.lang.String r0 = m6844q(r15, r0, r11)
            java.lang.String r2 = "CC"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x01bb
            java.lang.String r0 = r0.substring(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-608"
            goto L_0x01c6
        L_0x01bb:
            r2 = 7
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-708"
        L_0x01c6:
            r25 = r0
            r20 = r2
            if (r14 != 0) goto L_0x01d2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14 = r0
        L_0x01d2:
            r19 = 0
            r21 = 0
            r22 = -1
            r18 = r3
            r23 = r26
            r24 = r27
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m10244r(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r14.add(r0)
            goto L_0x0237
        L_0x01e6:
            r21 = 0
            r22 = -1
            java.lang.String r19 = "application/x-mpegURL"
            java.lang.String r20 = "text/vtt"
            r18 = r3
            r23 = r26
            r24 = r27
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m10243q(r17, r18, r19, r20, r21, r22, r23, r24)
            c.q.a.b.k0.e0.q.d$a r3 = new c.q.a.b.k0.e0.q.d$a
            r3.<init>(r0, r2)
            r7.add(r3)
            goto L_0x0237
        L_0x0201:
            r10 = 1
            java.lang.Object r2 = r1.get(r8)
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            int r23 = m6833f(r15, r11)
            if (r21 == 0) goto L_0x0217
            java.lang.String r2 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7892d(r21)
            r20 = r2
            goto L_0x0219
        L_0x0217:
            r20 = 0
        L_0x0219:
            r22 = -1
            r24 = -1
            r25 = 0
            java.lang.String r19 = "application/x-mpegURL"
            r18 = r3
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m10235i(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r3 = m6832d(r5, r0)
            if (r3 == 0) goto L_0x022f
            r12 = r2
            goto L_0x0239
        L_0x022f:
            c.q.a.b.k0.e0.q.d$a r3 = new c.q.a.b.k0.e0.q.d$a
            r3.<init>(r0, r2)
            r6.add(r3)
        L_0x0237:
            r12 = r30
        L_0x0239:
            int r13 = r13 + 1
            r8 = r10
            r2 = r28
            r10 = r29
            r4 = r31
            r3 = 0
            goto L_0x011b
        L_0x0245:
            r31 = r4
            r29 = r10
            r30 = r12
            if (r9 == 0) goto L_0x0253
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x0254
        L_0x0253:
            r9 = r14
        L_0x0254:
            c.q.a.b.k0.e0.q.d r0 = new c.q.a.b.k0.e0.q.d
            r2 = r0
            r3 = r33
            r4 = r31
            r8 = r30
            r10 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2973g.m6837j(c.q.a.b.k0.e0.q.g$a, java.lang.String):c.q.a.b.k0.e0.q.d");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v26, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r47v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e m6838k(p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d r61, p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2973g.C2974a r62, java.lang.String r63) {
        /*
            r0 = r61
            boolean r1 = r0.f5059c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r7 = ""
            r13 = 0
            r14 = 1
            r26 = r1
            r16 = r4
            r24 = r16
            r34 = r7
            r1 = r13
            r4 = r1
            r20 = r4
            r27 = r20
            r47 = r27
            r50 = r47
            r23 = r14
            r5 = 0
            r18 = 0
            r21 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r48 = -1
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
        L_0x004c:
            r56 = 0
        L_0x004e:
            boolean r35 = r62.mo19444a()
            if (r35 == 0) goto L_0x0319
            java.lang.String r12 = r62.mo19445b()
            java.lang.String r8 = "#EXT"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0063
            r6.add(r12)
        L_0x0063:
            java.lang.String r8 = "#EXT-X-PLAYLIST-TYPE"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0085
            java.util.regex.Pattern r8 = f5076k
            java.lang.String r8 = m6844q(r12, r8, r2)
            java.lang.String r9 = "VOD"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x007b
            r4 = r14
            goto L_0x004e
        L_0x007b:
            java.lang.String r9 = "EVENT"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x0085:
            java.lang.String r8 = "#EXT-X-START"
            boolean r8 = r12.startsWith(r8)
            r35 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r8 == 0) goto L_0x009e
            java.util.regex.Pattern r8 = f5080o
            double r8 = m6834g(r12, r8)
            double r8 = r8 * r35
            long r8 = (long) r8
            r16 = r8
            goto L_0x004e
        L_0x009e:
            java.lang.String r8 = "#EXT-X-MAP"
            boolean r8 = r12.startsWith(r8)
            java.lang.String r9 = "@"
            if (r8 == 0) goto L_0x00da
            java.util.regex.Pattern r8 = f5086u
            java.lang.String r36 = m6844q(r12, r8, r2)
            java.util.regex.Pattern r8 = f5082q
            java.lang.String r8 = m6841n(r12, r8, r2)
            if (r8 == 0) goto L_0x00c9
            java.lang.String[] r8 = r8.split(r9)
            r9 = r8[r13]
            long r48 = java.lang.Long.parseLong(r9)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x00c9
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x00c9:
            r37 = r29
            r39 = r48
            c.q.a.b.k0.e0.q.e$a r55 = new c.q.a.b.k0.e0.q.e$a
            r35 = r55
            r35.<init>(r36, r37, r39)
            r29 = 0
            r48 = -1
            goto L_0x004e
        L_0x00da:
            java.lang.String r8 = "#EXT-X-TARGETDURATION"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x00f0
            java.util.regex.Pattern r8 = f5074i
            int r8 = m6835h(r12, r8)
            long r8 = (long) r8
            r24 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r24 * r8
            goto L_0x004e
        L_0x00f0:
            java.lang.String r8 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0102
            java.util.regex.Pattern r8 = f5077l
            long r31 = m6836i(r12, r8)
            r21 = r31
            goto L_0x004e
        L_0x0102:
            java.lang.String r8 = "#EXT-X-VERSION"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0112
            java.util.regex.Pattern r8 = f5075j
            int r23 = m6835h(r12, r8)
            goto L_0x004e
        L_0x0112:
            java.lang.String r8 = "#EXT-X-DEFINE"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0144
            java.util.regex.Pattern r8 = f5065F
            java.lang.String r8 = m6841n(r12, r8, r2)
            if (r8 == 0) goto L_0x0130
            java.util.Map<java.lang.String, java.lang.String> r9 = r0.f5030i
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x013f
            r2.put(r8, r9)
            goto L_0x013f
        L_0x0130:
            java.util.regex.Pattern r8 = f5090y
            java.lang.String r8 = m6844q(r12, r8, r2)
            java.util.regex.Pattern r9 = f5064E
            java.lang.String r9 = m6844q(r12, r9, r2)
            r2.put(r8, r9)
        L_0x013f:
            r60 = r3
            r3 = 0
            goto L_0x0311
        L_0x0144:
            java.lang.String r8 = "#EXTINF"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x015f
            java.util.regex.Pattern r8 = f5078m
            double r8 = m6834g(r12, r8)
            double r8 = r8 * r35
            long r8 = (long) r8
            java.util.regex.Pattern r10 = f5079n
            java.lang.String r34 = m6840m(r12, r10, r7, r2)
            r56 = r8
            goto L_0x004e
        L_0x015f:
            java.lang.String r8 = "#EXT-X-KEY"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x01e1
            java.util.regex.Pattern r8 = f5083r
            java.lang.String r8 = m6844q(r12, r8, r2)
            java.util.regex.Pattern r9 = f5084s
            java.lang.String r10 = "identity"
            java.lang.String r9 = m6840m(r12, r9, r10, r2)
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0188
            r3.clear()
            r33 = 0
            r53 = 0
            r54 = 0
            goto L_0x004e
        L_0x0188:
            java.util.regex.Pattern r11 = f5087v
            java.lang.String r11 = m6841n(r12, r11, r2)
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x01ae
            java.lang.String r9 = "AES-128"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01a8
            java.util.regex.Pattern r8 = f5086u
            java.lang.String r8 = m6844q(r12, r8, r2)
            r53 = r8
            r54 = r11
            goto L_0x004e
        L_0x01a8:
            r54 = r11
        L_0x01aa:
            r53 = 0
            goto L_0x004e
        L_0x01ae:
            if (r5 != 0) goto L_0x01c6
            java.lang.String r5 = "SAMPLE-AES-CENC"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x01c4
            java.lang.String r5 = "SAMPLE-AES-CTR"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01c1
            goto L_0x01c4
        L_0x01c1:
            java.lang.String r5 = "cbcs"
            goto L_0x01c6
        L_0x01c4:
            java.lang.String r5 = "cenc"
        L_0x01c6:
            java.lang.String r8 = "com.microsoft.playready"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01d3
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = m6842o(r12, r2)
            goto L_0x01d7
        L_0x01d3:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = m6845r(r12, r9, r2)
        L_0x01d7:
            if (r8 == 0) goto L_0x01a8
            r3.put(r9, r8)
            r54 = r11
            r33 = 0
            goto L_0x01aa
        L_0x01e1:
            java.lang.String r8 = "#EXT-X-BYTERANGE"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x0204
            java.util.regex.Pattern r8 = f5081p
            java.lang.String r8 = m6844q(r12, r8, r2)
            java.lang.String[] r8 = r8.split(r9)
            r9 = r8[r13]
            long r48 = java.lang.Long.parseLong(r9)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x004e
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
            goto L_0x004e
        L_0x0204:
            java.lang.String r8 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r8 = r12.startsWith(r8)
            r9 = 58
            if (r8 == 0) goto L_0x021e
            int r1 = r12.indexOf(r9)
            int r1 = r1 + r14
            java.lang.String r1 = r12.substring(r1)
            int r20 = java.lang.Integer.parseInt(r1)
            r1 = r14
            goto L_0x004e
        L_0x021e:
            java.lang.String r8 = "#EXT-X-DISCONTINUITY"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x022a
            int r50 = r50 + 1
            goto L_0x004e
        L_0x022a:
            java.lang.String r8 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r8 = r12.startsWith(r8)
            if (r8 == 0) goto L_0x024d
            r10 = 0
            int r8 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x013f
            int r8 = r12.indexOf(r9)
            int r8 = r8 + r14
            java.lang.String r8 = r12.substring(r8)
            long r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7784X(r8)
            long r8 = p040c.p200q.p201a.p219b.C2627d.m5057a(r8)
            long r18 = r8 - r51
            goto L_0x004e
        L_0x024d:
            java.lang.String r8 = "#EXT-X-GAP"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0259
            r47 = r14
            goto L_0x004e
        L_0x0259:
            java.lang.String r8 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0265
            r26 = r14
            goto L_0x004e
        L_0x0265:
            java.lang.String r8 = "#EXT-X-ENDLIST"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0271
            r27 = r14
            goto L_0x004e
        L_0x0271:
            java.lang.String r8 = "#"
            boolean r8 = r12.startsWith(r8)
            if (r8 != 0) goto L_0x013f
            if (r53 != 0) goto L_0x027e
            r42 = 0
            goto L_0x0289
        L_0x027e:
            if (r54 == 0) goto L_0x0283
            r42 = r54
            goto L_0x0289
        L_0x0283:
            java.lang.String r8 = java.lang.Long.toHexString(r31)
            r42 = r8
        L_0x0289:
            r8 = 1
            long r8 = r31 + r8
            r10 = -1
            int r58 = (r48 > r10 ? 1 : (r48 == r10 ? 0 : -1))
            if (r58 != 0) goto L_0x0295
            r29 = 0
        L_0x0295:
            if (r33 != 0) goto L_0x02d6
            boolean r31 = r3.isEmpty()
            if (r31 != 0) goto L_0x02d6
            java.util.Collection r10 = r3.values()
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r11 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r13]
            java.lang.Object[] r10 = r10.toArray(r11)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r10 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r10
            com.google.android.exoplayer2.drm.DrmInitData r11 = new com.google.android.exoplayer2.drm.DrmInitData
            r11.<init>((java.lang.String) r5, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r10)
            if (r28 != 0) goto L_0x02d2
            int r13 = r10.length
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r13 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r13]
            r14 = 0
        L_0x02b4:
            int r0 = r10.length
            if (r14 >= r0) goto L_0x02c7
            r0 = r10[r14]
            r60 = r3
            r3 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = r0.mo23990c(r3)
            r13[r14] = r0
            int r14 = r14 + 1
            r3 = r60
            goto L_0x02b4
        L_0x02c7:
            r60 = r3
            r3 = 0
            com.google.android.exoplayer2.drm.DrmInitData r0 = new com.google.android.exoplayer2.drm.DrmInitData
            r0.<init>((java.lang.String) r5, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r13)
            r28 = r0
            goto L_0x02db
        L_0x02d2:
            r60 = r3
            r3 = 0
            goto L_0x02db
        L_0x02d6:
            r60 = r3
            r3 = 0
            r11 = r33
        L_0x02db:
            c.q.a.b.k0.e0.q.e$a r0 = new c.q.a.b.k0.e0.q.e$a
            r31 = r0
            java.lang.String r32 = m6846s(r12, r2)
            r33 = r55
            r35 = r56
            r37 = r50
            r38 = r51
            r40 = r11
            r41 = r53
            r43 = r29
            r45 = r48
            r31.<init>(r32, r33, r34, r35, r37, r38, r40, r41, r42, r43, r45, r47)
            r15.add(r0)
            long r51 = r51 + r56
            if (r58 == 0) goto L_0x02ff
            long r29 = r29 + r48
        L_0x02ff:
            r0 = r61
            r34 = r7
            r31 = r8
            r33 = r11
            r3 = r60
            r13 = 0
            r14 = 1
            r47 = 0
            r48 = -1
            goto L_0x004c
        L_0x0311:
            r0 = r61
            r3 = r60
            r13 = 0
            r14 = 1
            goto L_0x004e
        L_0x0319:
            c.q.a.b.k0.e0.q.e r0 = new c.q.a.b.k0.e0.q.e
            r2 = 0
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0324
            r59 = 1
            goto L_0x0326
        L_0x0324:
            r59 = 0
        L_0x0326:
            r3 = r0
            r5 = r63
            r7 = r16
            r9 = r18
            r11 = r1
            r12 = r20
            r13 = r21
            r1 = r15
            r15 = r23
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r59
            r21 = r28
            r22 = r1
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2973g.m6838k(c.q.a.b.k0.e0.q.d, c.q.a.b.k0.e0.q.g$a, java.lang.String):c.q.a.b.k0.e0.q.e");
    }

    /* renamed from: l */
    public static boolean m6839l(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* renamed from: m */
    public static String m6840m(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m6846s(str2, map);
    }

    @Nullable
    /* renamed from: n */
    public static String m6841n(String str, Pattern pattern, Map<String, String> map) {
        return m6840m(str, pattern, (String) null, map);
    }

    @Nullable
    /* renamed from: o */
    public static DrmInitData.SchemeData m6842o(String str, Map<String, String> map) {
        if (!"1".equals(m6840m(str, f5085t, "1", map))) {
            return null;
        }
        String q = m6844q(str, f5086u, map);
        return new DrmInitData.SchemeData(C2627d.f3283e, "video/mp4", C2738j.m5594a(C2627d.f3283e, Base64.decode(q.substring(q.indexOf(44)), 0)));
    }

    /* renamed from: p */
    public static int m6843p(String str) {
        int i = m6839l(str, f5062C, false) ? 1 : 0;
        if (m6839l(str, f5063D, false)) {
            i |= 2;
        }
        return m6839l(str, f5061B, false) ? i | 4 : i;
    }

    /* renamed from: q */
    public static String m6844q(String str, Pattern pattern, Map<String, String> map) {
        String n = m6841n(str, pattern, map);
        if (n != null) {
            return n;
        }
        throw new ParserException("Couldn't match " + pattern.pattern() + " in " + str);
    }

    @Nullable
    /* renamed from: r */
    public static DrmInitData.SchemeData m6845r(String str, String str2, Map<String, String> map) {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String q = m6844q(str, f5086u, map);
            return new DrmInitData.SchemeData(C2627d.f3282d, "video/mp4", Base64.decode(q.substring(q.indexOf(44)), 0));
        } else if (!"com.widevine".equals(str2)) {
            return null;
        } else {
            try {
                return new DrmInitData.SchemeData(C2627d.f3282d, "hls", str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new ParserException((Throwable) e);
            }
        }
    }

    /* renamed from: s */
    public static String m6846s(String str, Map<String, String> map) {
        Matcher matcher = f5066G.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: t */
    public static int m6847t(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !C3152e0.m7778R(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: e */
    public C2972f mo18948a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m6830b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                C2968d j = m6837j(new C2974a(arrayDeque, bufferedReader), uri.toString());
                                C3152e0.m7807k(bufferedReader);
                                return j;
                            }
                        }
                    } else {
                        C3152e0.m7807k(bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return m6838k(this.f5092a, new C2974a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            C3152e0.m7807k(bufferedReader);
        }
    }

    public C2973g(C2968d dVar) {
        this.f5092a = dVar;
    }
}

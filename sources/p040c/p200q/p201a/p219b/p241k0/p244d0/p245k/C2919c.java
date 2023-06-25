package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.hisense.connect_life.hismart.constants.RequestTag;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.EventLoop_commonKt;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.p703v1.XmlPullParser;
import org.xmlpull.p703v1.XmlPullParserException;
import org.xmlpull.p703v1.XmlPullParserFactory;
import org.xmlpull.p703v1.XmlSerializer;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p261o0.C3150d0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3154f0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.d0.k.c */
/* compiled from: DashManifestParser */
public class C2919c extends DefaultHandler implements C3138t.C3139a<C2918b> {

    /* renamed from: c */
    public static final Pattern f4780c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: d */
    public static final Pattern f4781d = Pattern.compile("CC([1-4])=.*");

    /* renamed from: e */
    public static final Pattern f4782e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: a */
    public final String f4783a;

    /* renamed from: b */
    public final XmlPullParserFactory f4784b;

    /* renamed from: c.q.a.b.k0.d0.k.c$a */
    /* compiled from: DashManifestParser */
    public static final class C2920a {

        /* renamed from: a */
        public final Format f4785a;

        /* renamed from: b */
        public final String f4786b;

        /* renamed from: c */
        public final C2930j f4787c;

        /* renamed from: d */
        public final String f4788d;

        /* renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f4789e;

        /* renamed from: f */
        public final ArrayList<C2921d> f4790f;

        /* renamed from: g */
        public final long f4791g;

        public C2920a(Format format, String str, C2930j jVar, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<C2921d> arrayList2, long j) {
            this.f4785a = format;
            this.f4786b = str;
            this.f4787c = jVar;
            this.f4788d = str2;
            this.f4789e = arrayList;
            this.f4790f = arrayList2;
            this.f4791g = j;
        }
    }

    public C2919c() {
        this((String) null);
    }

    /* renamed from: A */
    public static int m6512A(List<C2921d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C2921d dVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f4792a) && (str = dVar.f4793b) != null) {
                Matcher matcher = f4781d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C3163m.m7880f("MpdParser", "Unable to parse CEA-608 channel number from: " + dVar.f4793b);
            }
        }
        return -1;
    }

    /* renamed from: B */
    public static int m6513B(List<C2921d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C2921d dVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f4792a) && (str = dVar.f4793b) != null) {
                Matcher matcher = f4782e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C3163m.m7880f("MpdParser", "Unable to parse CEA-708 service block number from: " + dVar.f4793b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    public static long m6514E(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return C3152e0.m7784X(attributeValue);
    }

    /* renamed from: F */
    public static C2921d m6515F(XmlPullParser xmlPullParser, String str) {
        String b0 = m6522b0(xmlPullParser, "schemeIdUri", "");
        String b02 = m6522b0(xmlPullParser, "value", (String) null);
        String b03 = m6522b0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!C3154f0.m7833d(xmlPullParser, str));
        return new C2921d(b0, b02, b03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6516G(org.xmlpull.p703v1.XmlPullParser r5) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r5 = r5.getAttributeValue(r0, r1)
            java.lang.String r5 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7810l0(r5)
            r0 = -1
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case 1596796: goto L_0x0038;
                case 2937391: goto L_0x002e;
                case 3094035: goto L_0x0024;
                case 3133436: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0042
        L_0x001a:
            java.lang.String r1 = "fa01"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = r2
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "f801"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = r3
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "a000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = r4
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "4000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x0042:
            r5 = r0
        L_0x0043:
            if (r5 == 0) goto L_0x0052
            if (r5 == r4) goto L_0x0051
            if (r5 == r3) goto L_0x004f
            if (r5 == r2) goto L_0x004c
            return r0
        L_0x004c:
            r5 = 8
            return r5
        L_0x004f:
            r5 = 6
            return r5
        L_0x0051:
            return r3
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.m6516G(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: H */
    public static long m6517H(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return C3152e0.m7785Y(attributeValue);
    }

    /* renamed from: I */
    public static String m6518I(List<C2921d> list) {
        for (int i = 0; i < list.size(); i++) {
            C2921d dVar = list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(dVar.f4792a) && "ec+3".equals(dVar.f4793b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: M */
    public static float m6519M(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f4780c.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: O */
    public static int m6520O(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: P */
    public static long m6521P(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: b0 */
    public static String m6522b0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: o */
    public static int m6523o(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C3151e.m7759g(i == i2);
        return i;
    }

    /* renamed from: p */
    public static String m6524p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C3151e.m7759g(str.equals(str2));
        return str;
    }

    /* renamed from: q */
    public static void m6525q(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.mo23991d()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).mo23989b(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static String m6526s(String str, String str2) {
        if (C3166p.m7899k(str)) {
            return C3166p.m7889a(str2);
        }
        if (C3166p.m7901m(str)) {
            return C3166p.m7898j(str2);
        }
        if (m6528u(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return "application/ttml+xml";
                }
                if (str2.startsWith("wvtt")) {
                    return "application/x-mp4-vtt";
                }
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    /* renamed from: t */
    public static void m6527t(XmlPullParser xmlPullParser) {
        if (C3154f0.m7834e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C3154f0.m7834e(xmlPullParser)) {
                    i++;
                } else if (C3154f0.m7832c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: u */
    public static boolean m6528u(String str) {
        return C3166p.m7900l(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* renamed from: z */
    public static String m6529z(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return C3150d0.m7751c(str, xmlPullParser.getText());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013e A[LOOP:1: B:35:0x009e->B:74:0x013e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012f A[EDGE_INSN: B:76:0x012f->B:70:0x012f ?: BREAK  , SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> mo19240C(org.xmlpull.p703v1.XmlPullParser r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            java.lang.String r2 = "schemeIdUri"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7810l0(r2)
            r5 = -1
            int r6 = r2.hashCode()
            r7 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r8 = 2
            if (r6 == r7) goto L_0x003b
            r7 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r6 == r7) goto L_0x0031
            r7 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r6 == r7) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = r4
            goto L_0x0044
        L_0x0031:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = r8
            goto L_0x0044
        L_0x003b:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0044
            r5 = r3
        L_0x0044:
            if (r5 == 0) goto L_0x0052
            if (r5 == r3) goto L_0x004e
            if (r5 == r8) goto L_0x004b
            goto L_0x0099
        L_0x004b:
            java.util.UUID r2 = p040c.p200q.p201a.p219b.C2627d.f3282d
            goto L_0x0050
        L_0x004e:
            java.util.UUID r2 = p040c.p200q.p201a.p219b.C2627d.f3283e
        L_0x0050:
            r5 = r1
            goto L_0x009b
        L_0x0052:
            java.lang.String r2 = "value"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            java.lang.String r5 = "default_KID"
            java.lang.String r5 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7831b(r0, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0093
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0093
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.util.UUID[] r6 = new java.util.UUID[r6]
            r7 = r4
        L_0x0076:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0084
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0076
        L_0x0084:
            java.util.UUID r5 = p040c.p200q.p201a.p219b.C2627d.f3280b
            byte[] r5 = p040c.p200q.p201a.p219b.p224f0.p229v.C2738j.m5595b(r5, r6, r1)
            java.util.UUID r6 = p040c.p200q.p201a.p219b.C2627d.f3280b
            r7 = r1
            r8 = r4
            r15 = r5
            r5 = r2
            r2 = r6
            r6 = r15
            goto L_0x009e
        L_0x0093:
            r6 = r1
            r7 = r6
            r5 = r2
            r8 = r4
            r2 = r7
            goto L_0x009e
        L_0x0099:
            r2 = r1
            r5 = r2
        L_0x009b:
            r6 = r5
            r7 = r6
            r8 = r4
        L_0x009e:
            r17.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r9)
            if (r9 == 0) goto L_0x00b5
            java.lang.String r7 = "licenseUrl"
            java.lang.String r7 = r0.getAttributeValue(r1, r7)
        L_0x00af:
            r10 = r2
            r13 = r6
        L_0x00b1:
            r11 = r7
            r14 = r8
            goto L_0x0127
        L_0x00b5:
            java.lang.String r9 = "widevine:license"
            boolean r9 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r9)
            if (r9 == 0) goto L_0x00d1
            java.lang.String r8 = "robustness_level"
            java.lang.String r8 = r0.getAttributeValue(r1, r8)
            if (r8 == 0) goto L_0x00cf
            java.lang.String r9 = "HW"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00cf
            r8 = r3
            goto L_0x00af
        L_0x00cf:
            r8 = r4
            goto L_0x00af
        L_0x00d1:
            r9 = 4
            if (r6 != 0) goto L_0x00fc
            java.lang.String r10 = "pssh"
            boolean r10 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7836g(r0, r10)
            if (r10 == 0) goto L_0x00fc
            int r10 = r17.next()
            if (r10 != r9) goto L_0x00fc
            java.lang.String r2 = r17.getText()
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.util.UUID r6 = p040c.p200q.p201a.p219b.p224f0.p229v.C2738j.m5597d(r2)
            if (r6 != 0) goto L_0x00f9
            java.lang.String r2 = "MpdParser"
            java.lang.String r9 = "Skipping malformed cenc:pssh data"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r2, r9)
            r13 = r1
            goto L_0x00fa
        L_0x00f9:
            r13 = r2
        L_0x00fa:
            r10 = r6
            goto L_0x00b1
        L_0x00fc:
            if (r6 != 0) goto L_0x0123
            java.util.UUID r10 = p040c.p200q.p201a.p219b.C2627d.f3283e
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0123
            java.lang.String r10 = "mspr:pro"
            boolean r10 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r10)
            if (r10 == 0) goto L_0x0123
            int r10 = r17.next()
            if (r10 != r9) goto L_0x0123
            java.util.UUID r6 = p040c.p200q.p201a.p219b.C2627d.f3283e
            java.lang.String r9 = r17.getText()
            byte[] r9 = android.util.Base64.decode(r9, r4)
            byte[] r6 = p040c.p200q.p201a.p219b.p224f0.p229v.C2738j.m5594a(r6, r9)
            goto L_0x00af
        L_0x0123:
            m6527t(r17)
            goto L_0x00af
        L_0x0127:
            java.lang.String r2 = "ContentProtection"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7833d(r0, r2)
            if (r2 == 0) goto L_0x013e
            if (r10 == 0) goto L_0x0139
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r12 = "video/mp4"
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0139:
            android.util.Pair r0 = android.util.Pair.create(r5, r1)
            return r0
        L_0x013e:
            r2 = r10
            r7 = r11
            r6 = r13
            r8 = r14
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.mo19240C(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: D */
    public int mo19241D(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* renamed from: J */
    public Pair<Long, EventMessage> mo19242J(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long P = m6521P(xmlPullParser2, "id", 0);
        long P2 = m6521P(xmlPullParser2, "duration", -9223372036854775807L);
        long P3 = m6521P(xmlPullParser2, "presentationTime", 0);
        long c0 = C3152e0.m7792c0(P2, 1000, j);
        long c02 = C3152e0.m7792c0(P3, EventLoop_commonKt.MS_TO_NS, j);
        String b0 = m6522b0(xmlPullParser2, "messageData", (String) null);
        byte[] K = mo19243K(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(c02);
        if (b0 != null) {
            K = C3152e0.m7773M(b0);
        }
        return Pair.create(valueOf, mo19258c(str, str2, P, c0, K));
    }

    /* renamed from: K */
    public byte[] mo19243K(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        xmlPullParser.nextToken();
        while (!C3154f0.m7833d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: L */
    public C2922e mo19244L(XmlPullParser xmlPullParser) {
        String b0 = m6522b0(xmlPullParser, "schemeIdUri", "");
        String b02 = m6522b0(xmlPullParser, "value", "");
        long P = m6521P(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, "Event")) {
                arrayList.add(mo19242J(xmlPullParser, b0, b02, P, byteArrayOutputStream));
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return mo19260d(b0, b02, P, jArr, eventMessageArr);
    }

    /* renamed from: N */
    public C2925h mo19245N(XmlPullParser xmlPullParser) {
        return mo19249T(xmlPullParser, "sourceURL", "range");
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b A[LOOP:0: B:20:0x006e->B:68:0x017b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A[SYNTHETIC] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b mo19246Q(org.xmlpull.p703v1.XmlPullParser r32, java.lang.String r33) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "availabilityStartTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = m6514E(r0, r1, r2)
            java.lang.String r1 = "mediaPresentationDuration"
            long r7 = m6517H(r0, r1, r2)
            java.lang.String r1 = "minBufferTime"
            long r9 = m6517H(r0, r1, r2)
            r1 = 0
            java.lang.String r4 = "type"
            java.lang.String r4 = r0.getAttributeValue(r1, r4)
            r12 = 0
            if (r4 == 0) goto L_0x002d
            java.lang.String r13 = "dynamic"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x002d
            r13 = 1
            goto L_0x002e
        L_0x002d:
            r13 = r12
        L_0x002e:
            if (r13 == 0) goto L_0x0037
            java.lang.String r4 = "minimumUpdatePeriod"
            long r14 = m6517H(r0, r4, r2)
            goto L_0x0038
        L_0x0037:
            r14 = r2
        L_0x0038:
            if (r13 == 0) goto L_0x0041
            java.lang.String r4 = "timeShiftBufferDepth"
            long r16 = m6517H(r0, r4, r2)
            goto L_0x0043
        L_0x0041:
            r16 = r2
        L_0x0043:
            if (r13 == 0) goto L_0x004c
            java.lang.String r4 = "suggestedPresentationDelay"
            long r18 = m6517H(r0, r4, r2)
            goto L_0x004e
        L_0x004c:
            r18 = r2
        L_0x004e:
            java.lang.String r4 = "publishTime"
            long r20 = m6514E(r0, r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r13 == 0) goto L_0x005e
            r22 = r2
            goto L_0x0060
        L_0x005e:
            r22 = 0
        L_0x0060:
            r24 = r12
            r25 = r24
            r11 = r22
            r22 = r1
            r23 = r22
            r1 = r33
            r33 = r23
        L_0x006e:
            r32.next()
            java.lang.String r2 = "BaseURL"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r2)
            if (r2 == 0) goto L_0x008b
            if (r24 != 0) goto L_0x0085
            java.lang.String r1 = m6529z(r0, r1)
            r2 = r33
            r24 = 1
            goto L_0x0133
        L_0x0085:
            r28 = r1
            r29 = r11
            goto L_0x012d
        L_0x008b:
            java.lang.String r2 = "ProgramInformation"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r2)
            if (r2 == 0) goto L_0x0099
            c.q.a.b.k0.d0.k.g r2 = r31.mo19248S(r32)
            goto L_0x0133
        L_0x0099:
            java.lang.String r2 = "UTCTiming"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r2)
            if (r2 == 0) goto L_0x00ab
            c.q.a.b.k0.d0.k.m r2 = r31.mo19261d0(r32)
            r22 = r2
        L_0x00a7:
            r2 = r33
            goto L_0x0133
        L_0x00ab:
            java.lang.String r2 = "Location"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r2)
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r32.nextText()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r23 = r2
            goto L_0x00a7
        L_0x00be:
            java.lang.String r2 = "Period"
            boolean r2 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r2)
            if (r2 == 0) goto L_0x0126
            if (r25 != 0) goto L_0x0126
            r2 = r31
            android.util.Pair r3 = r2.mo19247R(r0, r1, r11)
            r28 = r1
            java.lang.Object r1 = r3.first
            c.q.a.b.k0.d0.k.f r1 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2923f) r1
            r29 = r11
            long r11 = r1.f4800b
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r11 != 0) goto L_0x0103
            if (r13 == 0) goto L_0x00e8
            r11 = r29
            r25 = 1
            goto L_0x0121
        L_0x00e8:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unable to determine start of period "
            r1.append(r3)
            int r3 = r4.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0103:
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r11 = r3.longValue()
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r3 != 0) goto L_0x011a
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x011e
        L_0x011a:
            long r2 = r1.f4800b
            long r2 = r2 + r11
            r11 = r2
        L_0x011e:
            r4.add(r1)
        L_0x0121:
            r2 = r33
            r1 = r28
            goto L_0x0133
        L_0x0126:
            r28 = r1
            r29 = r11
            m6527t(r32)
        L_0x012d:
            r2 = r33
            r1 = r28
            r11 = r29
        L_0x0133:
            java.lang.String r3 = "MPD"
            boolean r3 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7833d(r0, r3)
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x017b
            int r0 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x0155
            int r0 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x014a
            r7 = r11
            goto L_0x0155
        L_0x014a:
            if (r13 == 0) goto L_0x014d
            goto L_0x0155
        L_0x014d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0155:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0173
            r3 = r4
            r4 = r31
            r11 = r13
            r12 = r14
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r2
            r21 = r22
            r22 = r23
            r23 = r3
            c.q.a.b.k0.d0.k.b r0 = r4.mo19263f(r5, r7, r9, r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r0
        L_0x0173:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "No periods found."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x017b:
            r33 = r2
            r2 = r26
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.mo19246Q(org.xmlpull.v1.XmlPullParser, java.lang.String):c.q.a.b.k0.d0.k.b");
    }

    /* renamed from: R */
    public Pair<C2923f, Long> mo19247R(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "id");
        long H = m6517H(xmlPullParser, "start", j);
        long H2 = m6517H(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        C2930j jVar = null;
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m6529z(xmlPullParser, str);
                    z = true;
                }
            } else if (C3154f0.m7835f(xmlPullParser, "AdaptationSet")) {
                arrayList.add(mo19274w(xmlPullParser, str, jVar));
            } else if (C3154f0.m7835f(xmlPullParser, "EventStream")) {
                arrayList2.add(mo19244L(xmlPullParser));
            } else if (C3154f0.m7835f(xmlPullParser, "SegmentBase")) {
                jVar = mo19252W(xmlPullParser, (C2930j.C2935e) null);
            } else if (C3154f0.m7835f(xmlPullParser, "SegmentList")) {
                jVar = mo19253X(xmlPullParser, (C2930j.C2932b) null);
            } else if (C3154f0.m7835f(xmlPullParser, "SegmentTemplate")) {
                jVar = mo19254Y(xmlPullParser, (C2930j.C2933c) null);
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser, "Period"));
        return Pair.create(mo19264g(attributeValue, H, arrayList, arrayList2), Long.valueOf(H2));
    }

    /* renamed from: S */
    public C2924g mo19248S(XmlPullParser xmlPullParser) {
        String str = null;
        String b0 = m6522b0(xmlPullParser, "moreInformationURL", (String) null);
        String b02 = m6522b0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, RequestTag.Title)) {
                str = xmlPullParser.nextText();
            } else if (C3154f0.m7835f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C3154f0.m7835f(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                str3 = xmlPullParser.nextText();
            } else {
                m6527t(xmlPullParser);
            }
            String str4 = str3;
            if (C3154f0.m7833d(xmlPullParser, "ProgramInformation")) {
                return new C2924g(str, str2, str4, b0, b02);
            }
            str3 = str4;
        }
    }

    /* renamed from: T */
    public C2925h mo19249T(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return mo19265h(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return mo19265h(attributeValue, j2, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0154 A[LOOP:0: B:1:0x005a->B:45:0x0154, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b A[EDGE_INSN: B:46:0x011b->B:39:0x011b ?: BREAK  , SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.C2920a mo19250U(org.xmlpull.p703v1.XmlPullParser r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, int r29, float r30, int r31, int r32, java.lang.String r33, int r34, java.util.List<p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2921d> r35, p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j r36) {
        /*
            r22 = this;
            r15 = r22
            r0 = r23
            r1 = 0
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            java.lang.String r3 = "bandwidth"
            r4 = -1
            int r9 = m6520O(r0, r3, r4)
            java.lang.String r3 = "mimeType"
            r4 = r26
            java.lang.String r3 = m6522b0(r0, r3, r4)
            java.lang.String r4 = "codecs"
            r5 = r27
            java.lang.String r13 = m6522b0(r0, r4, r5)
            java.lang.String r4 = "width"
            r5 = r28
            int r4 = m6520O(r0, r4, r5)
            java.lang.String r5 = "height"
            r6 = r29
            int r5 = m6520O(r0, r5, r6)
            r6 = r30
            float r6 = m6519M(r0, r6)
            java.lang.String r7 = "audioSamplingRate"
            r8 = r32
            int r8 = m6520O(r0, r7, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r7 = 0
            r10 = r36
            r16 = r1
            r17 = r7
            r1 = r24
            r7 = r31
        L_0x005a:
            r23.next()
            r24 = r7
            java.lang.String r7 = "BaseURL"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x007d
            if (r17 != 0) goto L_0x0079
            java.lang.String r1 = m6529z(r0, r1)
            r7 = 1
            r17 = r10
            r18 = r16
            r16 = r1
            r1 = r7
        L_0x0075:
            r7 = r24
            goto L_0x0113
        L_0x0079:
            r26 = r1
            goto L_0x0109
        L_0x007d:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x0091
            int r7 = r22.mo19276y(r23)
            r18 = r16
            r16 = r1
            r1 = r17
            goto L_0x0111
        L_0x0091:
            java.lang.String r7 = "SegmentBase"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x00a8
            c.q.a.b.k0.d0.k.j$e r10 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2935e) r10
            c.q.a.b.k0.d0.k.j$e r7 = r15.mo19252W(r0, r10)
        L_0x009f:
            r18 = r16
            r16 = r1
            r1 = r17
            r17 = r7
            goto L_0x0075
        L_0x00a8:
            java.lang.String r7 = "SegmentList"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x00b7
            c.q.a.b.k0.d0.k.j$b r10 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2932b) r10
            c.q.a.b.k0.d0.k.j$b r7 = r15.mo19253X(r0, r10)
            goto L_0x009f
        L_0x00b7:
            java.lang.String r7 = "SegmentTemplate"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x00c6
            c.q.a.b.k0.d0.k.j$c r10 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2933c) r10
            c.q.a.b.k0.d0.k.j$c r7 = r15.mo19254Y(r0, r10)
            goto L_0x009f
        L_0x00c6:
            java.lang.String r7 = "ContentProtection"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r7)
            if (r7 == 0) goto L_0x00e4
            android.util.Pair r7 = r22.mo19240C(r23)
            r26 = r1
            java.lang.Object r1 = r7.first
            if (r1 == 0) goto L_0x00dc
            r16 = r1
            java.lang.String r16 = (java.lang.String) r16
        L_0x00dc:
            java.lang.Object r1 = r7.second
            if (r1 == 0) goto L_0x0109
            r14.add(r1)
            goto L_0x0109
        L_0x00e4:
            r26 = r1
            java.lang.String r1 = "InbandEventStream"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r1)
            if (r7 == 0) goto L_0x00f6
            c.q.a.b.k0.d0.k.d r1 = m6515F(r0, r1)
            r12.add(r1)
            goto L_0x0109
        L_0x00f6:
            java.lang.String r1 = "SupplementalProperty"
            boolean r7 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r0, r1)
            if (r7 == 0) goto L_0x0106
            c.q.a.b.k0.d0.k.d r1 = m6515F(r0, r1)
            r11.add(r1)
            goto L_0x0109
        L_0x0106:
            m6527t(r23)
        L_0x0109:
            r7 = r24
            r18 = r16
            r1 = r17
            r16 = r26
        L_0x0111:
            r17 = r10
        L_0x0113:
            java.lang.String r10 = "Representation"
            boolean r10 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7833d(r0, r10)
            if (r10 == 0) goto L_0x0154
            r0 = r22
            r1 = r2
            r2 = r25
            r10 = r33
            r19 = r11
            r11 = r34
            r20 = r12
            r12 = r35
            r21 = r14
            r14 = r19
            com.google.android.exoplayer2.Format r0 = r0.mo19262e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r17 == 0) goto L_0x0137
            r1 = r17
            goto L_0x013c
        L_0x0137:
            c.q.a.b.k0.d0.k.j$e r1 = new c.q.a.b.k0.d0.k.j$e
            r1.<init>()
        L_0x013c:
            c.q.a.b.k0.d0.k.c$a r2 = new c.q.a.b.k0.d0.k.c$a
            r3 = -1
            r23 = r2
            r24 = r0
            r25 = r16
            r26 = r1
            r27 = r18
            r28 = r21
            r29 = r20
            r30 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            return r2
        L_0x0154:
            r10 = r17
            r17 = r1
            r1 = r16
            r16 = r18
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.mo19250U(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, c.q.a.b.k0.d0.k.j):c.q.a.b.k0.d0.k.c$a");
    }

    /* renamed from: V */
    public int mo19251V(XmlPullParser xmlPullParser) {
        String b0 = m6522b0(xmlPullParser, "schemeIdUri", (String) null);
        String b02 = m6522b0(xmlPullParser, "value", (String) null);
        do {
            xmlPullParser.next();
        } while (!C3154f0.m7833d(xmlPullParser, "Role"));
        return (!"urn:mpeg:dash:role:2011".equals(b0) || !"main".equals(b02)) ? 0 : 1;
    }

    /* renamed from: W */
    public C2930j.C2935e mo19252W(XmlPullParser xmlPullParser, C2930j.C2935e eVar) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2930j.C2935e eVar2 = eVar;
        long P = m6521P(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f4823b : 1);
        long j3 = 0;
        long P2 = m6521P(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f4824c : 0);
        long j4 = eVar2 != null ? eVar2.f4833d : 0;
        if (eVar2 != null) {
            j3 = eVar2.f4834e;
        }
        C2925h hVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (eVar2 != null) {
            hVar = eVar2.f4822a;
        }
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser2, "Initialization")) {
                hVar = mo19245N(xmlPullParser);
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser2, "SegmentBase"));
        return mo19270m(hVar, P, P2, j2, j);
    }

    /* renamed from: X */
    public C2930j.C2932b mo19253X(XmlPullParser xmlPullParser, C2930j.C2932b bVar) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2930j.C2932b bVar2 = bVar;
        long j = 1;
        long P = m6521P(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f4823b : 1);
        long P2 = m6521P(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f4824c : 0);
        long P3 = m6521P(xmlPullParser2, "duration", bVar2 != null ? bVar2.f4826e : -9223372036854775807L);
        if (bVar2 != null) {
            j = bVar2.f4825d;
        }
        long P4 = m6521P(xmlPullParser2, "startNumber", j);
        List list = null;
        C2925h hVar = null;
        List<C2930j.C2934d> list2 = null;
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser2, "Initialization")) {
                hVar = mo19245N(xmlPullParser);
            } else if (C3154f0.m7835f(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo19255Z(xmlPullParser);
            } else if (C3154f0.m7835f(xmlPullParser2, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(mo19256a0(xmlPullParser));
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (hVar == null) {
                hVar = bVar2.f4822a;
            }
            if (list2 == null) {
                list2 = bVar2.f4827f;
            }
            if (list == null) {
                list = bVar2.f4828g;
            }
        }
        return mo19267j(hVar, P, P2, P4, P3, list2, list);
    }

    /* renamed from: Y */
    public C2930j.C2933c mo19254Y(XmlPullParser xmlPullParser, C2930j.C2933c cVar) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2930j.C2933c cVar2 = cVar;
        long j = 1;
        long P = m6521P(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f4823b : 1);
        long P2 = m6521P(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f4824c : 0);
        long P3 = m6521P(xmlPullParser2, "duration", cVar2 != null ? cVar2.f4826e : -9223372036854775807L);
        if (cVar2 != null) {
            j = cVar2.f4825d;
        }
        long P4 = m6521P(xmlPullParser2, "startNumber", j);
        C2925h hVar = null;
        C2937l c0 = mo19259c0(xmlPullParser2, "media", cVar2 != null ? cVar2.f4830h : null);
        C2937l c02 = mo19259c0(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f4829g : null);
        List<C2930j.C2934d> list = null;
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser2, "Initialization")) {
                hVar = mo19245N(xmlPullParser);
            } else if (C3154f0.m7835f(xmlPullParser2, "SegmentTimeline")) {
                list = mo19255Z(xmlPullParser);
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser2, "SegmentTemplate"));
        if (cVar2 != null) {
            if (hVar == null) {
                hVar = cVar2.f4822a;
            }
            if (list == null) {
                list = cVar2.f4827f;
            }
        }
        return mo19268k(hVar, P, P2, P4, P3, list, c02, c0);
    }

    /* renamed from: Z */
    public List<C2930j.C2934d> mo19255Z(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                j = m6521P(xmlPullParser, "t", j);
                long P = m6521P(xmlPullParser, "d", -9223372036854775807L);
                int O = m6520O(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < O; i++) {
                    arrayList.add(mo19269l(j, P));
                    j += P;
                }
            } else {
                m6527t(xmlPullParser);
            }
        } while (!C3154f0.m7833d(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* renamed from: a0 */
    public C2925h mo19256a0(XmlPullParser xmlPullParser) {
        return mo19249T(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: b */
    public C2917a mo19257b(int i, int i2, List<C2926i> list, List<C2921d> list2, List<C2921d> list3) {
        return new C2917a(i, i2, list, list2, list3);
    }

    /* renamed from: c */
    public EventMessage mo19258c(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    /* renamed from: c0 */
    public C2937l mo19259c0(XmlPullParser xmlPullParser, String str, C2937l lVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? C2937l.m6615b(attributeValue) : lVar;
    }

    /* renamed from: d */
    public C2922e mo19260d(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new C2922e(str, str2, j, jArr, eventMessageArr);
    }

    /* renamed from: d0 */
    public C2938m mo19261d0(XmlPullParser xmlPullParser) {
        return mo19271n(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: e */
    public Format mo19262e(String str, String str2, String str3, int i, int i2, float f, int i3, int i4, int i5, String str4, int i6, List<C2921d> list, String str5, List<C2921d> list2) {
        String str6;
        int B;
        String str7 = str3;
        String s = m6526s(str3, str5);
        if (s != null) {
            if ("audio/eac3".equals(s)) {
                s = m6518I(list2);
            }
            str6 = s;
            if (C3166p.m7901m(str6)) {
                return Format.m10249w(str, str2, str3, str6, str5, i5, i, i2, f, (List<byte[]>) null, i6);
            }
            if (C3166p.m7899k(str6)) {
                return Format.m10235i(str, str2, str3, str6, str5, i5, i3, i4, (List<byte[]>) null, i6, str4);
            }
            if (m6528u(str6)) {
                if ("application/cea-608".equals(str6)) {
                    B = m6512A(list);
                } else {
                    B = "application/cea-708".equals(str6) ? m6513B(list) : -1;
                }
                return Format.m10244r(str, str2, str3, str6, str5, i5, i6, str4, B);
            }
        } else {
            str6 = s;
        }
        return Format.m10239m(str, str2, str3, str6, str5, i5, i6, str4);
    }

    /* renamed from: f */
    public C2918b mo19263f(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C2924g gVar, C2938m mVar, Uri uri, List<C2923f> list) {
        return new C2918b(j, j2, j3, z, j4, j5, j6, j7, gVar, mVar, uri, list);
    }

    /* renamed from: g */
    public C2923f mo19264g(String str, long j, List<C2917a> list, List<C2922e> list2) {
        return new C2923f(str, j, list, list2);
    }

    /* renamed from: h */
    public C2925h mo19265h(String str, long j, long j2) {
        return new C2925h(str, j, j2);
    }

    /* renamed from: i */
    public C2926i mo19266i(C2920a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<C2921d> arrayList2) {
        Format format = aVar.f4785a;
        String str3 = aVar.f4788d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f4789e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m6525q(arrayList3);
            format = format.mo23914b(new DrmInitData(str2, (List<DrmInitData.SchemeData>) arrayList3));
        }
        ArrayList<C2921d> arrayList4 = aVar.f4790f;
        arrayList4.addAll(arrayList2);
        return C2926i.m6573l(str, aVar.f4791g, format, aVar.f4786b, aVar.f4787c, arrayList4);
    }

    /* renamed from: j */
    public C2930j.C2932b mo19267j(C2925h hVar, long j, long j2, long j3, long j4, List<C2930j.C2934d> list, List<C2925h> list2) {
        return new C2930j.C2932b(hVar, j, j2, j3, j4, list, list2);
    }

    /* renamed from: k */
    public C2930j.C2933c mo19268k(C2925h hVar, long j, long j2, long j3, long j4, List<C2930j.C2934d> list, C2937l lVar, C2937l lVar2) {
        return new C2930j.C2933c(hVar, j, j2, j3, j4, list, lVar, lVar2);
    }

    /* renamed from: l */
    public C2930j.C2934d mo19269l(long j, long j2) {
        return new C2930j.C2934d(j, j2);
    }

    /* renamed from: m */
    public C2930j.C2935e mo19270m(C2925h hVar, long j, long j2, long j3, long j4) {
        return new C2930j.C2935e(hVar, j, j2, j3, j4);
    }

    /* renamed from: n */
    public C2938m mo19271n(String str, String str2) {
        return new C2938m(str, str2);
    }

    /* renamed from: r */
    public int mo19272r(Format format) {
        String str = format.f7566q;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (C3166p.m7901m(str)) {
            return 2;
        }
        if (C3166p.m7899k(str)) {
            return 1;
        }
        if (m6528u(str)) {
            return 3;
        }
        return -1;
    }

    /* renamed from: v */
    public C2918b mo18948a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f4784b.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return mo19246Q(newPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new ParserException((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0232 A[LOOP:0: B:1:0x0069->B:59:0x0232, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f8 A[EDGE_INSN: B:60:0x01f8->B:53:0x01f8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2917a mo19274w(org.xmlpull.p703v1.XmlPullParser r41, java.lang.String r42, p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j r43) {
        /*
            r40 = this;
            r15 = r40
            r14 = r41
            java.lang.String r0 = "id"
            r1 = -1
            int r16 = m6520O(r14, r0, r1)
            int r0 = r40.mo19241D(r41)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r17 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r18 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r19 = m6520O(r14, r2, r1)
            java.lang.String r2 = "height"
            int r20 = m6520O(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r21 = m6519M(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r22 = m6520O(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r23 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r24 = 0
            r6 = r42
            r25 = r43
            r5 = r0
            r26 = r1
            r4 = r2
            r29 = r13
            r27 = r24
            r28 = r27
        L_0x0069:
            r41.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x00a2
            if (r27 != 0) goto L_0x008e
            java.lang.String r0 = m6529z(r14, r6)
            r27 = 1
            r32 = r0
        L_0x007e:
            r6 = r7
            r34 = r8
            r35 = r9
            r7 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r1 = r14
            r8 = r5
            goto L_0x01f0
        L_0x008e:
            r30 = r4
            r2 = r5
            r32 = r6
            r6 = r7
            r34 = r8
            r35 = r9
            r7 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r1 = r14
            goto L_0x01ed
        L_0x00a2:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x00be
            android.util.Pair r0 = r40.mo19240C(r41)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00b6
            r29 = r1
            java.lang.String r29 = (java.lang.String) r29
        L_0x00b6:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x00f7
            r11.add(r0)
            goto L_0x00f7
        L_0x00be:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r14.getAttributeValue(r13, r12)
            java.lang.String r0 = m6524p(r4, r0)
            int r1 = r40.mo19241D(r41)
            int r1 = m6523o(r5, r1)
            r4 = r0
            r32 = r6
            r6 = r7
            r34 = r8
            r35 = r9
            r7 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r8 = r1
            r1 = r14
            goto L_0x01f0
        L_0x00e9:
            java.lang.String r0 = "Role"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x00fa
            int r0 = r40.mo19251V(r41)
            r28 = r28 | r0
        L_0x00f7:
            r32 = r6
            goto L_0x007e
        L_0x00fa:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x0109
            int r0 = r40.mo19276y(r41)
            r26 = r0
            goto L_0x00f7
        L_0x0109:
            java.lang.String r0 = "Accessibility"
            boolean r1 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r1 == 0) goto L_0x011a
            c.q.a.b.k0.d0.k.d r0 = m6515F(r14, r0)
            r9.add(r0)
            goto L_0x008e
        L_0x011a:
            java.lang.String r0 = "SupplementalProperty"
            boolean r1 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r1 == 0) goto L_0x012b
            c.q.a.b.k0.d0.k.d r0 = m6515F(r14, r0)
            r8.add(r0)
            goto L_0x008e
        L_0x012b:
            java.lang.String r0 = "Representation"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r14, r0)
            if (r0 == 0) goto L_0x0182
            r0 = r40
            r1 = r41
            r2 = r6
            r3 = r23
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r18
            r32 = r6
            r6 = r19
            r33 = r7
            r7 = r20
            r34 = r8
            r8 = r21
            r35 = r9
            r9 = r26
            r36 = r10
            r10 = r22
            r37 = r11
            r11 = r30
            r38 = r12
            r12 = r28
            r39 = r13
            r13 = r35
            r14 = r25
            c.q.a.b.k0.d0.k.c$a r0 = r0.mo19250U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.exoplayer2.Format r1 = r0.f4785a
            int r1 = r15.mo19272r(r1)
            r2 = r31
            int r1 = m6523o(r2, r1)
            r6 = r33
            r6.add(r0)
            r8 = r1
            r4 = r30
            r7 = r36
            r1 = r41
            goto L_0x01f0
        L_0x0182:
            r30 = r4
            r2 = r5
            r32 = r6
            r6 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            java.lang.String r0 = "SegmentBase"
            r1 = r41
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r1, r0)
            if (r0 == 0) goto L_0x01ae
            r0 = r25
            c.q.a.b.k0.d0.k.j$e r0 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2935e) r0
            c.q.a.b.k0.d0.k.j$e r0 = r15.mo19252W(r1, r0)
        L_0x01a6:
            r25 = r0
            r8 = r2
            r4 = r30
            r7 = r36
            goto L_0x01f0
        L_0x01ae:
            java.lang.String r0 = "SegmentList"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r1, r0)
            if (r0 == 0) goto L_0x01bf
            r0 = r25
            c.q.a.b.k0.d0.k.j$b r0 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2932b) r0
            c.q.a.b.k0.d0.k.j$b r0 = r15.mo19253X(r1, r0)
            goto L_0x01a6
        L_0x01bf:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r1, r0)
            if (r0 == 0) goto L_0x01d0
            r0 = r25
            c.q.a.b.k0.d0.k.j$c r0 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j.C2933c) r0
            c.q.a.b.k0.d0.k.j$c r0 = r15.mo19254Y(r1, r0)
            goto L_0x01a6
        L_0x01d0:
            java.lang.String r0 = "InbandEventStream"
            boolean r3 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7835f(r1, r0)
            if (r3 == 0) goto L_0x01e2
            c.q.a.b.k0.d0.k.d r0 = m6515F(r1, r0)
            r7 = r36
            r7.add(r0)
            goto L_0x01ed
        L_0x01e2:
            r7 = r36
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7834e(r41)
            if (r0 == 0) goto L_0x01ed
            r40.mo19275x(r41)
        L_0x01ed:
            r8 = r2
            r4 = r30
        L_0x01f0:
            java.lang.String r0 = "AdaptationSet"
            boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3154f0.m7833d(r1, r0)
            if (r0 == 0) goto L_0x0232
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = r6.size()
            r9.<init>(r0)
            r10 = r24
        L_0x0203:
            int r0 = r6.size()
            if (r10 >= r0) goto L_0x0223
            java.lang.Object r0 = r6.get(r10)
            r1 = r0
            c.q.a.b.k0.d0.k.c$a r1 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.C2920a) r1
            java.lang.String r2 = r15.f4783a
            r0 = r40
            r3 = r29
            r4 = r37
            r5 = r7
            c.q.a.b.k0.d0.k.i r0 = r0.mo19266i(r1, r2, r3, r4, r5)
            r9.add(r0)
            int r10 = r10 + 1
            goto L_0x0203
        L_0x0223:
            r0 = r40
            r1 = r16
            r2 = r8
            r3 = r9
            r4 = r35
            r5 = r34
            c.q.a.b.k0.d0.k.a r0 = r0.mo19257b(r1, r2, r3, r4, r5)
            return r0
        L_0x0232:
            r14 = r1
            r10 = r7
            r5 = r8
            r8 = r34
            r9 = r35
            r11 = r37
            r12 = r38
            r13 = r39
            r7 = r6
            r6 = r32
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c.mo19274w(org.xmlpull.v1.XmlPullParser, java.lang.String, c.q.a.b.k0.d0.k.j):c.q.a.b.k0.d0.k.a");
    }

    /* renamed from: x */
    public void mo19275x(XmlPullParser xmlPullParser) {
        m6527t(xmlPullParser);
    }

    /* renamed from: y */
    public int mo19276y(XmlPullParser xmlPullParser) {
        String b0 = m6522b0(xmlPullParser, "schemeIdUri", (String) null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(b0)) {
            i = m6520O(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(b0)) {
            i = m6516G(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!C3154f0.m7833d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    public C2919c(String str) {
        this.f4783a = str;
        try {
            this.f4784b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}

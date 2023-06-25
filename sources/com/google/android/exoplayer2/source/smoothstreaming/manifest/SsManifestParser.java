package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.camera.core.VideoCapture;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.hisense.connect_life.hismart.constants.RequestTag;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.p703v1.XmlPullParser;
import org.xmlpull.p703v1.XmlPullParserException;
import org.xmlpull.p703v1.XmlPullParserFactory;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2738j;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2742m;
import p040c.p200q.p201a.p219b.p241k0.p248f0.p249f.C2987a;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3155g;

public class SsManifestParser implements C3138t.C3139a<C2987a> {

    /* renamed from: a */
    public final XmlPullParserFactory f7833a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$a */
    public static abstract class C4045a {

        /* renamed from: a */
        public final String f7834a;

        /* renamed from: b */
        public final String f7835b;

        /* renamed from: c */
        public final C4045a f7836c;

        /* renamed from: d */
        public final List<Pair<String, Object>> f7837d = new LinkedList();

        public C4045a(C4045a aVar, String str, String str2) {
            this.f7836c = aVar;
            this.f7834a = str;
            this.f7835b = str2;
        }

        /* renamed from: a */
        public void mo24222a(Object obj) {
        }

        /* renamed from: b */
        public abstract Object mo24223b();

        /* renamed from: c */
        public final Object mo24224c(String str) {
            for (int i = 0; i < this.f7837d.size(); i++) {
                Pair pair = this.f7837d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            C4045a aVar = this.f7836c;
            if (aVar == null) {
                return null;
            }
            return aVar.mo24224c(str);
        }

        /* renamed from: d */
        public boolean mo24225d(String str) {
            return false;
        }

        /* renamed from: e */
        public final C4045a mo24226e(C4045a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C4047c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new C4046b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C4049e(aVar, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object mo24227f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f7835b.equals(name)) {
                        mo24235n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo24225d(name)) {
                            mo24235n(xmlPullParser);
                        } else {
                            C4045a e = mo24226e(this, name, this.f7834a);
                            if (e == null) {
                                i = 1;
                            } else {
                                mo24222a(e.mo24227f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo24236o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo24229h(xmlPullParser);
                    if (!mo24225d(name2)) {
                        return mo24223b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        public final boolean mo24228g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* renamed from: h */
        public void mo24229h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        public final int mo24230i(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException((Throwable) e);
            }
        }

        /* renamed from: j */
        public final long mo24231j(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException((Throwable) e);
            }
        }

        /* renamed from: k */
        public final int mo24232k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new ParserException((Throwable) e);
                }
            } else {
                throw new MissingFieldException(str);
            }
        }

        /* renamed from: l */
        public final long mo24233l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new ParserException((Throwable) e);
                }
            } else {
                throw new MissingFieldException(str);
            }
        }

        /* renamed from: m */
        public final String mo24234m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        /* renamed from: n */
        public abstract void mo24235n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        public void mo24236o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        public final void mo24237p(String str, Object obj) {
            this.f7837d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$b */
    public static class C4046b extends C4045a {

        /* renamed from: e */
        public boolean f7838e;

        /* renamed from: f */
        public UUID f7839f;

        /* renamed from: g */
        public byte[] f7840g;

        public C4046b(C4045a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        public static C2742m[] m10596q(byte[] bArr) {
            return new C2742m[]{new C2742m(true, (String) null, 8, m10597r(bArr), 0, 0, (byte[]) null)};
        }

        /* renamed from: r */
        public static byte[] m10597r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            m10599t(decode, 0, 3);
            m10599t(decode, 1, 2);
            m10599t(decode, 4, 5);
            m10599t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        public static String m10598s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        public static void m10599t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        /* renamed from: b */
        public Object mo24223b() {
            UUID uuid = this.f7839f;
            return new C2987a.C2988a(uuid, C2738j.m5594a(uuid, this.f7840g), m10596q(this.f7840g));
        }

        /* renamed from: d */
        public boolean mo24225d(String str) {
            return "ProtectionHeader".equals(str);
        }

        /* renamed from: h */
        public void mo24229h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f7838e = false;
            }
        }

        /* renamed from: n */
        public void mo24235n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f7838e = true;
                this.f7839f = UUID.fromString(m10598s(xmlPullParser.getAttributeValue((String) null, "SystemID")));
            }
        }

        /* renamed from: o */
        public void mo24236o(XmlPullParser xmlPullParser) {
            if (this.f7838e) {
                this.f7840g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$c */
    public static class C4047c extends C4045a {

        /* renamed from: e */
        public Format f7841e;

        public C4047c(C4045a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List<byte[]> m10605q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] y = C3152e0.m7825y(str);
                byte[][] l = C3155g.m7849l(y);
                if (l == null) {
                    arrayList.add(y);
                } else {
                    Collections.addAll(arrayList, l);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m10606r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return VideoCapture.VIDEO_MIME_TYPE;
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return VideoCapture.AUDIO_MIME_TYPE;
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        /* renamed from: b */
        public Object mo24223b() {
            return this.f7841e;
        }

        /* renamed from: n */
        public void mo24235n(XmlPullParser xmlPullParser) {
            int intValue = ((Integer) mo24224c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Index");
            String str = (String) mo24224c(MAPCookie.KEY_NAME);
            int k = mo24232k(xmlPullParser, "Bitrate");
            String r = m10606r(mo24234m(xmlPullParser, "FourCC"));
            if (intValue == 2) {
                this.f7841e = Format.m10249w(attributeValue, str, "video/mp4", r, (String) null, k, mo24232k(xmlPullParser, "MaxWidth"), mo24232k(xmlPullParser, "MaxHeight"), -1.0f, m10605q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData")), 0);
            } else if (intValue == 1) {
                if (r == null) {
                    r = VideoCapture.AUDIO_MIME_TYPE;
                }
                int k2 = mo24232k(xmlPullParser, "Channels");
                int k3 = mo24232k(xmlPullParser, "SamplingRate");
                List<byte[]> q = m10605q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                if (q.isEmpty() && VideoCapture.AUDIO_MIME_TYPE.equals(r)) {
                    q = Collections.singletonList(C3155g.m7839b(k3, k2));
                }
                this.f7841e = Format.m10235i(attributeValue, str, "audio/mp4", r, (String) null, k, k2, k3, q, 0, (String) mo24224c(RequestTag.Language));
            } else if (intValue == 3) {
                this.f7841e = Format.m10243q(attributeValue, str, "application/mp4", r, (String) null, k, 0, (String) mo24224c(RequestTag.Language));
            } else {
                this.f7841e = Format.m10239m(attributeValue, str, "application/mp4", r, (String) null, k, 0, (String) null);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$d */
    public static class C4048d extends C4045a {

        /* renamed from: e */
        public final List<C2987a.C2989b> f7842e = new LinkedList();

        /* renamed from: f */
        public int f7843f;

        /* renamed from: g */
        public int f7844g;

        /* renamed from: h */
        public long f7845h;

        /* renamed from: i */
        public long f7846i;

        /* renamed from: j */
        public long f7847j;

        /* renamed from: k */
        public int f7848k = -1;

        /* renamed from: l */
        public boolean f7849l;

        /* renamed from: m */
        public C2987a.C2988a f7850m = null;

        public C4048d(C4045a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        /* renamed from: a */
        public void mo24222a(Object obj) {
            if (obj instanceof C2987a.C2989b) {
                this.f7842e.add((C2987a.C2989b) obj);
            } else if (obj instanceof C2987a.C2988a) {
                C3151e.m7759g(this.f7850m == null);
                this.f7850m = (C2987a.C2988a) obj;
            }
        }

        /* renamed from: b */
        public Object mo24223b() {
            int size = this.f7842e.size();
            C2987a.C2989b[] bVarArr = new C2987a.C2989b[size];
            this.f7842e.toArray(bVarArr);
            if (this.f7850m != null) {
                C2987a.C2988a aVar = this.f7850m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar.f5156a, "video/mp4", aVar.f5157b));
                for (int i = 0; i < size; i++) {
                    C2987a.C2989b bVar = bVarArr[i];
                    int i2 = bVar.f5159a;
                    if (i2 == 2 || i2 == 1) {
                        Format[] formatArr = bVar.f5168j;
                        for (int i3 = 0; i3 < formatArr.length; i3++) {
                            formatArr[i3] = formatArr[i3].mo23914b(drmInitData);
                        }
                    }
                }
            }
            return new C2987a(this.f7843f, this.f7844g, this.f7845h, this.f7846i, this.f7847j, this.f7848k, this.f7849l, this.f7850m, bVarArr);
        }

        /* renamed from: n */
        public void mo24235n(XmlPullParser xmlPullParser) {
            this.f7843f = mo24232k(xmlPullParser, "MajorVersion");
            this.f7844g = mo24232k(xmlPullParser, "MinorVersion");
            this.f7845h = mo24231j(xmlPullParser, "TimeScale", 10000000);
            this.f7846i = mo24233l(xmlPullParser, "Duration");
            this.f7847j = mo24231j(xmlPullParser, "DVRWindowLength", 0);
            this.f7848k = mo24230i(xmlPullParser, "LookaheadCount", -1);
            this.f7849l = mo24228g(xmlPullParser, "IsLive", false);
            mo24237p("TimeScale", Long.valueOf(this.f7845h));
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$e */
    public static class C4049e extends C4045a {

        /* renamed from: e */
        public final String f7851e;

        /* renamed from: f */
        public final List<Format> f7852f = new LinkedList();

        /* renamed from: g */
        public int f7853g;

        /* renamed from: h */
        public String f7854h;

        /* renamed from: i */
        public long f7855i;

        /* renamed from: j */
        public String f7856j;

        /* renamed from: k */
        public String f7857k;

        /* renamed from: l */
        public int f7858l;

        /* renamed from: m */
        public int f7859m;

        /* renamed from: n */
        public int f7860n;

        /* renamed from: o */
        public int f7861o;

        /* renamed from: p */
        public String f7862p;

        /* renamed from: q */
        public ArrayList<Long> f7863q;

        /* renamed from: r */
        public long f7864r;

        public C4049e(C4045a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f7851e = str;
        }

        /* renamed from: a */
        public void mo24222a(Object obj) {
            if (obj instanceof Format) {
                this.f7852f.add((Format) obj);
            }
        }

        /* renamed from: b */
        public Object mo24223b() {
            Format[] formatArr = new Format[this.f7852f.size()];
            this.f7852f.toArray(formatArr);
            C2987a.C2989b bVar = r2;
            C2987a.C2989b bVar2 = new C2987a.C2989b(this.f7851e, this.f7857k, this.f7853g, this.f7854h, this.f7855i, this.f7856j, this.f7858l, this.f7859m, this.f7860n, this.f7861o, this.f7862p, formatArr, this.f7863q, this.f7864r);
            return bVar;
        }

        /* renamed from: d */
        public boolean mo24225d(String str) {
            return "c".equals(str);
        }

        /* renamed from: n */
        public void mo24235n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                mo24239r(xmlPullParser);
            } else {
                mo24238q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void mo24238q(XmlPullParser xmlPullParser) {
            int s = mo24240s(xmlPullParser);
            this.f7853g = s;
            mo24237p("Type", Integer.valueOf(s));
            if (this.f7853g == 3) {
                this.f7854h = mo24234m(xmlPullParser, "Subtype");
            } else {
                this.f7854h = xmlPullParser.getAttributeValue((String) null, "Subtype");
            }
            this.f7856j = xmlPullParser.getAttributeValue((String) null, MAPCookie.KEY_NAME);
            this.f7857k = mo24234m(xmlPullParser, "Url");
            this.f7858l = mo24230i(xmlPullParser, "MaxWidth", -1);
            this.f7859m = mo24230i(xmlPullParser, "MaxHeight", -1);
            this.f7860n = mo24230i(xmlPullParser, "DisplayWidth", -1);
            this.f7861o = mo24230i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, RequestTag.Language);
            this.f7862p = attributeValue;
            mo24237p(RequestTag.Language, attributeValue);
            long i = (long) mo24230i(xmlPullParser, "TimeScale", -1);
            this.f7855i = i;
            if (i == -1) {
                this.f7855i = ((Long) mo24224c("TimeScale")).longValue();
            }
            this.f7863q = new ArrayList<>();
        }

        /* renamed from: r */
        public final void mo24239r(XmlPullParser xmlPullParser) {
            int size = this.f7863q.size();
            long j = mo24231j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else if (this.f7864r != -1) {
                    j = this.f7864r + this.f7863q.get(size - 1).longValue();
                } else {
                    throw new ParserException("Unable to infer start time");
                }
            }
            this.f7863q.add(Long.valueOf(j));
            this.f7864r = mo24231j(xmlPullParser, "d", -9223372036854775807L);
            long j2 = mo24231j(xmlPullParser, "r", 1);
            if (j2 <= 1 || this.f7864r != -9223372036854775807L) {
                while (true) {
                    long j3 = (long) i;
                    if (j3 < j2) {
                        this.f7863q.add(Long.valueOf((this.f7864r * j3) + j));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
        }

        /* renamed from: s */
        public final int mo24240s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            } else if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw new ParserException("Invalid key value[" + attributeValue + "]");
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f7833a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    public C2987a mo18948a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f7833a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (C2987a) new C4048d((C4045a) null, uri.toString()).mo24227f(newPullParser);
        } catch (XmlPullParserException e) {
            throw new ParserException((Throwable) e);
        }
    }
}

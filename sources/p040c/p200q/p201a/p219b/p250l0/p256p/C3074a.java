package p040c.p200q.p201a.p219b.p250l0.p256p;

import androidx.core.net.MailTo;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.p703v1.XmlPullParser;
import org.xmlpull.p703v1.XmlPullParserException;
import org.xmlpull.p703v1.XmlPullParserFactory;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3154f0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.l0.p.a */
/* compiled from: TtmlDecoder */
public final class C3074a extends C3032b {

    /* renamed from: o */
    public static final Pattern f5523o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    public static final Pattern f5524p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    public static final Pattern f5525q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    public static final Pattern f5526r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    public static final Pattern f5527s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    public static final Pattern f5528t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    public static final C3076b f5529u = new C3076b(30.0f, 1, 1);

    /* renamed from: v */
    public static final C3075a f5530v = new C3075a(32, 15);

    /* renamed from: n */
    public final XmlPullParserFactory f5531n;

    /* renamed from: c.q.a.b.l0.p.a$a */
    /* compiled from: TtmlDecoder */
    public static final class C3075a {

        /* renamed from: a */
        public final int f5532a;

        public C3075a(int i, int i2) {
            this.f5532a = i2;
        }
    }

    /* renamed from: c.q.a.b.l0.p.a$b */
    /* compiled from: TtmlDecoder */
    public static final class C3076b {

        /* renamed from: a */
        public final float f5533a;

        /* renamed from: b */
        public final int f5534b;

        /* renamed from: c */
        public final int f5535c;

        public C3076b(float f, int i, int i2) {
            this.f5533a = f;
            this.f5534b = i;
            this.f5535c = i2;
        }
    }

    /* renamed from: c.q.a.b.l0.p.a$c */
    /* compiled from: TtmlDecoder */
    public static final class C3077c {

        /* renamed from: a */
        public final int f5536a;

        /* renamed from: b */
        public final int f5537b;

        public C3077c(int i, int i2) {
            this.f5536a = i;
            this.f5537b = i2;
        }
    }

    public C3074a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f5531n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: D */
    public static boolean m7362D(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(MailTo.BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: F */
    public static void m7363F(String str, C3081e eVar) {
        Matcher matcher;
        String[] f0 = C3152e0.m7798f0(str, "\\s+");
        if (f0.length == 1) {
            matcher = f5525q.matcher(str);
        } else if (f0.length == 2) {
            matcher = f5525q.matcher(f0[1]);
            C3163m.m7880f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + f0.length + MAPCookie.DOT);
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c = 0;
                    }
                } else if (group.equals("em")) {
                    c = 1;
                }
            } else if (group.equals("%")) {
                c = 2;
            }
            if (c == 0) {
                eVar.mo19761t(1);
            } else if (c == 1) {
                eVar.mo19761t(2);
            } else if (c == 2) {
                eVar.mo19761t(3);
            } else {
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + group + "'.");
            }
            eVar.mo19760s(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r14.equals("s") != false) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m7364N(java.lang.String r14, p040c.p200q.p201a.p219b.p250l0.p256p.C3074a.C3076b r15) {
        /*
            java.util.regex.Pattern r0 = f5523o
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0073
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0046
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0047
        L_0x0046:
            r10 = r5
        L_0x0047:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x0058
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f5533a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x0059
        L_0x0058:
            r10 = r5
        L_0x0059:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x006f
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f5534b
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.f5533a
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x006f:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0073:
            java.util.regex.Pattern r0 = f5524p
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x010b
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00da
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00d0
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00c6
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00bc
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00b3
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00a9
            goto L_0x00e4
        L_0x00a9:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            r7 = r4
            goto L_0x00e5
        L_0x00b3:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00bc:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            r7 = r6
            goto L_0x00e5
        L_0x00c6:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            r7 = r8
            goto L_0x00e5
        L_0x00d0:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            r7 = 0
            goto L_0x00e5
        L_0x00da:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e4
            r7 = r5
            goto L_0x00e5
        L_0x00e4:
            r7 = r0
        L_0x00e5:
            if (r7 == 0) goto L_0x0102
            if (r7 == r8) goto L_0x00ff
            if (r7 == r6) goto L_0x00f8
            if (r7 == r5) goto L_0x00f4
            if (r7 == r4) goto L_0x00f0
            goto L_0x0108
        L_0x00f0:
            int r14 = r15.f5535c
            double r14 = (double) r14
            goto L_0x00fd
        L_0x00f4:
            float r14 = r15.f5533a
            double r14 = (double) r14
            goto L_0x00fd
        L_0x00f8:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00fd:
            double r9 = r9 / r14
            goto L_0x0108
        L_0x00ff:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0107
        L_0x0102:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0107:
            double r9 = r9 * r14
        L_0x0108:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x010b:
            com.google.android.exoplayer2.text.SubtitleDecoderException r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p256p.C3074a.m7364N(java.lang.String, c.q.a.b.l0.p.a$b):long");
    }

    /* renamed from: B */
    public final C3081e mo19719B(C3081e eVar) {
        return eVar == null ? new C3081e() : eVar;
    }

    /* renamed from: C */
    public C3082f mo19616y(byte[] bArr, int i, boolean z) {
        C3082f fVar;
        C3076b bVar;
        try {
            XmlPullParser newPullParser = this.f5531n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            C3077c cVar = null;
            hashMap2.put("", new C3079c((String) null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C3076b bVar2 = f5529u;
            C3075a aVar = f5530v;
            int i2 = 0;
            C3082f fVar2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C3078b bVar3 = (C3078b) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = mo19722G(newPullParser);
                            aVar = mo19721E(newPullParser, f5530v);
                            cVar = mo19729O(newPullParser);
                        }
                        C3077c cVar2 = cVar;
                        C3076b bVar4 = bVar2;
                        C3075a aVar2 = aVar;
                        if (!m7362D(name)) {
                            C3163m.m7879e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar4;
                            cVar = cVar2;
                            aVar = aVar2;
                            newPullParser.next();
                        } else {
                            if ("head".equals(name)) {
                                fVar = fVar2;
                                bVar = bVar4;
                                mo19723H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                fVar = fVar2;
                                bVar = bVar4;
                                try {
                                    C3078b J = mo19725J(newPullParser, bVar3, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (bVar3 != null) {
                                        bVar3.mo19730a(J);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    C3163m.m7881g("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                    } else {
                        fVar = fVar2;
                        if (eventType == 4) {
                            bVar3.mo19730a(C3078b.m7378d(newPullParser.getText()));
                        } else if (eventType == 3) {
                            fVar2 = newPullParser.getName().equals("tt") ? new C3082f((C3078b) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : fVar;
                            arrayDeque.pop();
                            newPullParser.next();
                        }
                    }
                } else {
                    fVar = fVar2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                }
                fVar2 = fVar;
                newPullParser.next();
            }
            return fVar2;
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    /* renamed from: E */
    public final C3075a mo19721E(XmlPullParser xmlPullParser, C3075a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f5528t.matcher(attributeValue);
        if (!matcher.matches()) {
            C3163m.m7880f("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C3075a(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            C3163m.m7880f("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    /* renamed from: G */
    public final C3076b mo19722G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] f0 = C3152e0.m7798f0(attributeValue2, " ");
            if (f0.length == 2) {
                f = ((float) Integer.parseInt(f0[0])) / ((float) Integer.parseInt(f0[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f5529u.f5534b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f5529u.f5535c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C3076b(((float) parseInt) * f, i, i2);
    }

    /* renamed from: H */
    public final Map<String, C3081e> mo19723H(XmlPullParser xmlPullParser, Map<String, C3081e> map, C3075a aVar, C3077c cVar, Map<String, C3079c> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, "style")) {
                String a = C3154f0.m7830a(xmlPullParser, "style");
                C3081e L = mo19727L(xmlPullParser, new C3081e());
                if (a != null) {
                    for (String str : mo19728M(a)) {
                        L.mo19742a(map.get(str));
                    }
                }
                if (L.mo19748g() != null) {
                    map.put(L.mo19748g(), L);
                }
            } else if (C3154f0.m7835f(xmlPullParser, "region")) {
                C3079c K = mo19726K(xmlPullParser, aVar, cVar);
                if (K != null) {
                    map2.put(K.f5550a, K);
                }
            } else if (C3154f0.m7835f(xmlPullParser, "metadata")) {
                mo19724I(xmlPullParser, map3);
            }
        } while (!C3154f0.m7833d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: I */
    public final void mo19724I(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a;
        do {
            xmlPullParser.next();
            if (C3154f0.m7835f(xmlPullParser, "image") && (a = C3154f0.m7830a(xmlPullParser, "id")) != null) {
                map.put(a, xmlPullParser.nextText());
            }
        } while (!C3154f0.m7833d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p219b.p250l0.p256p.C3078b mo19725J(org.xmlpull.p703v1.XmlPullParser r21, p040c.p200q.p201a.p219b.p250l0.p256p.C3078b r22, java.util.Map<java.lang.String, p040c.p200q.p201a.p219b.p250l0.p256p.C3079c> r23, p040c.p200q.p201a.p219b.p250l0.p256p.C3074a.C3076b r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r21.getAttributeCount()
            r5 = 0
            c.q.a.b.l0.p.e r11 = r0.mo19727L(r1, r5)
            java.lang.String r9 = ""
            r12 = r5
            r14 = r12
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0026:
            if (r5 >= r4) goto L_0x00c5
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            int r19 = r6.hashCode()
            switch(r19) {
                case -934795532: goto L_0x006a;
                case 99841: goto L_0x0060;
                case 100571: goto L_0x0056;
                case 93616297: goto L_0x004c;
                case 109780401: goto L_0x0042;
                case 1292595405: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0074
        L_0x0038:
            java.lang.String r8 = "backgroundImage"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 5
            goto L_0x0075
        L_0x0042:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 3
            goto L_0x0075
        L_0x004c:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 0
            goto L_0x0075
        L_0x0056:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 1
            goto L_0x0075
        L_0x0060:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 2
            goto L_0x0075
        L_0x006a:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 4
            goto L_0x0075
        L_0x0074:
            r8 = -1
        L_0x0075:
            if (r8 == 0) goto L_0x00bb
            r6 = 1
            if (r8 == r6) goto L_0x00b4
            r6 = 2
            if (r8 == r6) goto L_0x00ad
            r6 = 3
            if (r8 == r6) goto L_0x00a2
            r6 = 4
            if (r8 == r6) goto L_0x0098
            r6 = 5
            if (r8 == r6) goto L_0x0087
            goto L_0x0095
        L_0x0087:
            java.lang.String r6 = "#"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x0095
            r6 = 1
            java.lang.String r6 = r7.substring(r6)
            r14 = r6
        L_0x0095:
            r6 = r23
            goto L_0x00c1
        L_0x0098:
            r6 = r23
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00c1
            r13 = r7
            goto L_0x00c1
        L_0x00a2:
            r6 = r23
            java.lang.String[] r7 = r0.mo19728M(r7)
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00c1
            r12 = r7
            goto L_0x00c1
        L_0x00ad:
            r6 = r23
            long r17 = m7364N(r7, r3)
            goto L_0x00c1
        L_0x00b4:
            r6 = r23
            long r15 = m7364N(r7, r3)
            goto L_0x00c1
        L_0x00bb:
            r6 = r23
            long r9 = m7364N(r7, r3)
        L_0x00c1:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00c5:
            if (r2 == 0) goto L_0x00df
            long r3 = r2.f5541d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e4
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d7
            long r9 = r9 + r3
        L_0x00d7:
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            long r3 = r2.f5541d
            long r15 = r15 + r3
            goto L_0x00e4
        L_0x00df:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e4:
            r7 = r9
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00fc
            int r3 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f2
            long r17 = r7 + r17
            r9 = r17
            goto L_0x00fd
        L_0x00f2:
            if (r2 == 0) goto L_0x00fc
            long r2 = r2.f5542e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00fc
            r9 = r2
            goto L_0x00fd
        L_0x00fc:
            r9 = r15
        L_0x00fd:
            java.lang.String r6 = r21.getName()
            c.q.a.b.l0.p.b r1 = p040c.p200q.p201a.p219b.p250l0.p256p.C3078b.m7377c(r6, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p256p.C3074a.mo19725J(org.xmlpull.v1.XmlPullParser, c.q.a.b.l0.p.b, java.util.Map, c.q.a.b.l0.p.a$b):c.q.a.b.l0.p.b");
    }

    /* renamed from: K */
    public final C3079c mo19726K(XmlPullParser xmlPullParser, C3075a aVar, C3077c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C3077c cVar2 = cVar;
        String a = C3154f0.m7830a(xmlPullParser2, "id");
        if (a == null) {
            return null;
        }
        String a2 = C3154f0.m7830a(xmlPullParser2, EventBusConstKt.ORIGIN);
        if (a2 != null) {
            Matcher matcher = f5526r.matcher(a2);
            Matcher matcher2 = f5527s.matcher(a2);
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    f = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f2 = parseFloat;
                } catch (NumberFormatException unused) {
                    C3163m.m7880f("TtmlDecoder", "Ignoring region with malformed origin: " + a2);
                    return null;
                }
            } else if (!matcher2.matches()) {
                C3163m.m7880f("TtmlDecoder", "Ignoring region with unsupported origin: " + a2);
                return null;
            } else if (cVar2 == null) {
                C3163m.m7880f("TtmlDecoder", "Ignoring region with missing tts:extent: " + a2);
                return null;
            } else {
                try {
                    int parseInt = Integer.parseInt(matcher2.group(1));
                    int parseInt2 = Integer.parseInt(matcher2.group(2));
                    f2 = ((float) parseInt) / ((float) cVar2.f5536a);
                    f = ((float) parseInt2) / ((float) cVar2.f5537b);
                } catch (NumberFormatException unused2) {
                    C3163m.m7880f("TtmlDecoder", "Ignoring region with malformed origin: " + a2);
                    return null;
                }
            }
            String a3 = C3154f0.m7830a(xmlPullParser2, "extent");
            if (a3 != null) {
                Matcher matcher3 = f5526r.matcher(a3);
                Matcher matcher4 = f5527s.matcher(a3);
                if (matcher3.matches()) {
                    try {
                        float parseFloat2 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        f4 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                        f3 = parseFloat2;
                    } catch (NumberFormatException unused3) {
                        C3163m.m7880f("TtmlDecoder", "Ignoring region with malformed extent: " + a2);
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    C3163m.m7880f("TtmlDecoder", "Ignoring region with unsupported extent: " + a2);
                    return null;
                } else if (cVar2 == null) {
                    C3163m.m7880f("TtmlDecoder", "Ignoring region with missing tts:extent: " + a2);
                    return null;
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(matcher4.group(1));
                        int parseInt4 = Integer.parseInt(matcher4.group(2));
                        f3 = ((float) parseInt3) / ((float) cVar2.f5536a);
                        f4 = ((float) parseInt4) / ((float) cVar2.f5537b);
                    } catch (NumberFormatException unused4) {
                        C3163m.m7880f("TtmlDecoder", "Ignoring region with malformed extent: " + a2);
                        return null;
                    }
                }
                String a4 = C3154f0.m7830a(xmlPullParser2, "displayAlign");
                if (a4 != null) {
                    String l0 = C3152e0.m7810l0(a4);
                    char c = 65535;
                    int hashCode = l0.hashCode();
                    if (hashCode != -1364013995) {
                        if (hashCode == 92734940 && l0.equals("after")) {
                            c = 1;
                        }
                    } else if (l0.equals("center")) {
                        c = 0;
                    }
                    if (c == 0) {
                        f += f4 / 2.0f;
                        i = 1;
                    } else if (c == 1) {
                        f += f4;
                        i = 2;
                    }
                    return new C3079c(a, f2, f, 0, i, f3, 1, 1.0f / ((float) aVar.f5532a));
                }
                i = 0;
                return new C3079c(a, f2, f, 0, i, f3, 1, 1.0f / ((float) aVar.f5532a));
            }
            C3163m.m7880f("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        C3163m.m7880f("TtmlDecoder", "Ignoring region without an origin");
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p219b.p250l0.p256p.C3081e mo19727L(org.xmlpull.p703v1.XmlPullParser r12, p040c.p200q.p201a.p219b.p250l0.p256p.C3081e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r1
        L_0x0006:
            if (r2 >= r0) goto L_0x01ff
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 2
            r9 = 3
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x006f;
                case -1224696685: goto L_0x0065;
                case -1065511464: goto L_0x005b;
                case -879295043: goto L_0x0050;
                case -734428249: goto L_0x0046;
                case 3355: goto L_0x003c;
                case 94842723: goto L_0x0032;
                case 365601008: goto L_0x0028;
                case 1287124693: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0079
        L_0x001e:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = r10
            goto L_0x007a
        L_0x0028:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = r6
            goto L_0x007a
        L_0x0032:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = r8
            goto L_0x007a
        L_0x003c:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = r1
            goto L_0x007a
        L_0x0046:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 5
            goto L_0x007a
        L_0x0050:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 8
            goto L_0x007a
        L_0x005b:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 7
            goto L_0x007a
        L_0x0065:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = r9
            goto L_0x007a
        L_0x006f:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 6
            goto L_0x007a
        L_0x0079:
            r4 = r7
        L_0x007a:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01a6;
                case 3: goto L_0x019e;
                case 4: goto L_0x0180;
                case 5: goto L_0x0171;
                case 6: goto L_0x0162;
                case 7: goto L_0x00e2;
                case 8: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x01fb
        L_0x0081:
            java.lang.String r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7810l0(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x00ab;
                case -1026963764: goto L_0x00a1;
                case 913457136: goto L_0x0097;
                case 1679736913: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00b4
        L_0x008d:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = r1
            goto L_0x00b4
        L_0x0097:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = r10
            goto L_0x00b4
        L_0x00a1:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = r8
            goto L_0x00b4
        L_0x00ab:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            r7 = r9
        L_0x00b4:
            if (r7 == 0) goto L_0x00d9
            if (r7 == r10) goto L_0x00d0
            if (r7 == r8) goto L_0x00c7
            if (r7 == r9) goto L_0x00be
            goto L_0x01fb
        L_0x00be:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19766y(r1)
            goto L_0x01fb
        L_0x00c7:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19766y(r10)
            goto L_0x01fb
        L_0x00d0:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19764w(r1)
            goto L_0x01fb
        L_0x00d9:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19764w(r10)
            goto L_0x01fb
        L_0x00e2:
            java.lang.String r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7810l0(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0116;
                case 100571: goto L_0x010c;
                case 3317767: goto L_0x0102;
                case 108511772: goto L_0x00f8;
                case 109757538: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x011f
        L_0x00ee:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = r10
            goto L_0x011f
        L_0x00f8:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = r8
            goto L_0x011f
        L_0x0102:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = r1
            goto L_0x011f
        L_0x010c:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = r9
            goto L_0x011f
        L_0x0116:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011f
            r7 = r6
        L_0x011f:
            if (r7 == 0) goto L_0x0157
            if (r7 == r10) goto L_0x014c
            if (r7 == r8) goto L_0x0141
            if (r7 == r9) goto L_0x0136
            if (r7 == r6) goto L_0x012b
            goto L_0x01fb
        L_0x012b:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            r13.mo19765x(r3)
            goto L_0x01fb
        L_0x0136:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r13.mo19765x(r3)
            goto L_0x01fb
        L_0x0141:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r13.mo19765x(r3)
            goto L_0x01fb
        L_0x014c:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r13.mo19765x(r3)
            goto L_0x01fb
        L_0x0157:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r13.mo19765x(r3)
            goto L_0x01fb
        L_0x0162:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.mo19763v(r3)
            goto L_0x01fb
        L_0x0171:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.mo19757p(r3)
            goto L_0x01fb
        L_0x0180:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)     // Catch:{ SubtitleDecoderException -> 0x0189 }
            m7363F(r3, r13)     // Catch:{ SubtitleDecoderException -> 0x0189 }
            goto L_0x01fb
        L_0x0189:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r5, r3)
            goto L_0x01fb
        L_0x019e:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19759r(r3)
            goto L_0x01fb
        L_0x01a6:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            int r4 = p040c.p200q.p201a.p219b.p261o0.C3156h.m7853d(r3)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r13.mo19758q(r4)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            goto L_0x01fb
        L_0x01b2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r5, r3)
            goto L_0x01fb
        L_0x01c7:
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            int r4 = p040c.p200q.p201a.p219b.p261o0.C3156h.m7853d(r3)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            r13.mo19756o(r4)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            goto L_0x01fb
        L_0x01d3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r5, r3)
            goto L_0x01fb
        L_0x01e8:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01fb
            c.q.a.b.l0.p.e r13 = r11.mo19719B(r13)
            r13.mo19762u(r3)
        L_0x01fb:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01ff:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p256p.C3074a.mo19727L(org.xmlpull.v1.XmlPullParser, c.q.a.b.l0.p.e):c.q.a.b.l0.p.e");
    }

    /* renamed from: M */
    public final String[] mo19728M(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C3152e0.m7798f0(trim, "\\s+");
    }

    /* renamed from: O */
    public final C3077c mo19729O(XmlPullParser xmlPullParser) {
        String a = C3154f0.m7830a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f5527s.matcher(a);
        if (!matcher.matches()) {
            C3163m.m7880f("TtmlDecoder", "Ignoring non-pixel tts extent: " + a);
            return null;
        }
        try {
            return new C3077c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            C3163m.m7880f("TtmlDecoder", "Ignoring malformed tts extent: " + a);
            return null;
        }
    }
}

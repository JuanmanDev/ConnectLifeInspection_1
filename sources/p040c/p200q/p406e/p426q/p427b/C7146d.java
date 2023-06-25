package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p406e.p410l.C7034c;
import p040c.p200q.p406e.p410l.C7042k;

/* renamed from: c.q.e.q.b.d */
/* compiled from: DecodedBitStreamParser */
public final class C7146d {

    /* renamed from: a */
    public static final char[] f13748a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7 A[LOOP:0: B:1:0x001e->B:60:0x00e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p406e.p410l.C7035d m21349a(byte[] r17, p040c.p200q.p406e.p426q.p427b.C7150h r18, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r19, java.util.Map<com.google.zxing.DecodeHintType, ?> r20) {
        /*
            r0 = r18
            c.q.e.l.c r7 = new c.q.e.l.c
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r12 = 0
            r13 = r1
            r14 = r2
            r15 = r14
            r16 = r12
        L_0x001e:
            int r1 = r7.mo32549a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            r2 = 4
            if (r1 >= r2) goto L_0x0029
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0027:
            r6 = r1
            goto L_0x0032
        L_0x0029:
            int r1 = r7.mo32552d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.forBits(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0027
        L_0x0032:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 == r1) goto L_0x0058
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 == r1) goto L_0x00c0
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0040
            goto L_0x00c0
        L_0x0040:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0060
            int r1 = r7.mo32549a()     // Catch:{ IllegalArgumentException -> 0x00ea }
            r2 = 16
            if (r1 < r2) goto L_0x005b
            r1 = 8
            int r2 = r7.mo32552d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r1 = r7.mo32552d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            r15 = r1
            r14 = r2
        L_0x0058:
            r11 = r6
            goto L_0x00c2
        L_0x005b:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0060:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x0074
            int r1 = m21355g(r7)     // Catch:{ IllegalArgumentException -> 0x00ea }
            com.google.zxing.common.CharacterSetECI r16 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r16 == 0) goto L_0x006f
            goto L_0x0058
        L_0x006f:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x0074:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.HANZI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x008a
            int r1 = r7.mo32552d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r2 = r6.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r2 = r7.mo32552d(r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r1 != r11) goto L_0x0058
            m21352d(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x008a:
            int r1 = r6.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x00ea }
            int r3 = r7.mo32552d(r1)     // Catch:{ IllegalArgumentException -> 0x00ea }
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x009a
            m21354f(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x009a:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x00a2
            m21350b(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x0058
        L_0x00a2:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r16
            r5 = r10
            r11 = r6
            r6 = r20
            m21351c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x00c2
        L_0x00b2:
            r11 = r6
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r11 != r1) goto L_0x00bb
            m21353e(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ea }
            goto L_0x00c2
        L_0x00bb:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x00ea }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ea }
        L_0x00c0:
            r11 = r6
            r13 = 1
        L_0x00c2:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ea }
            if (r11 != r1) goto L_0x00e7
            c.q.e.l.d r7 = new c.q.e.l.d
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d4
            r3 = r12
            goto L_0x00d5
        L_0x00d4:
            r3 = r10
        L_0x00d5:
            if (r19 != 0) goto L_0x00d9
            r4 = r12
            goto L_0x00de
        L_0x00d9:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00de:
            r0 = r7
            r1 = r17
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00e7:
            r11 = 1
            goto L_0x001e
        L_0x00ea:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p426q.p427b.C7146d.m21349a(byte[], c.q.e.q.b.h, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):c.q.e.l.d");
    }

    /* renamed from: b */
    public static void m21350b(C7034c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo32549a() >= 11) {
                int d = cVar.mo32552d(11);
                sb.append(m21356h(d / 45));
                sb.append(m21356h(d % 45));
                i -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 1) {
            if (cVar.mo32549a() >= 6) {
                sb.append(m21356h(cVar.mo32552d(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m21351c(C7034c cVar, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) {
        String str;
        if ((i << 3) <= cVar.mo32549a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo32552d(8);
            }
            if (characterSetECI == null) {
                str = C7042k.m20882a(bArr, map);
            } else {
                str = characterSetECI.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: d */
    public static void m21352d(C7034c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo32549a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo32552d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: e */
    public static void m21353e(C7034c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo32549a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo32552d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: f */
    public static void m21354f(C7034c cVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (cVar.mo32549a() >= 10) {
                int d = cVar.mo32552d(10);
                if (d < 1000) {
                    sb.append(m21356h(d / 100));
                    sb.append(m21356h((d / 10) % 10));
                    sb.append(m21356h(d % 10));
                    i -= 3;
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 2) {
            if (cVar.mo32549a() >= 7) {
                int d2 = cVar.mo32552d(7);
                if (d2 < 100) {
                    sb.append(m21356h(d2 / 10));
                    sb.append(m21356h(d2 % 10));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        } else if (i != 1) {
        } else {
            if (cVar.mo32549a() >= 4) {
                int d3 = cVar.mo32552d(4);
                if (d3 < 10) {
                    sb.append(m21356h(d3));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: g */
    public static int m21355g(C7034c cVar) {
        int d = cVar.mo32552d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return cVar.mo32552d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo32552d(16) | ((d & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: h */
    public static char m21356h(int i) {
        char[] cArr = f13748a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}

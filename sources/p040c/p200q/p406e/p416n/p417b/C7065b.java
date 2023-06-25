package p040c.p200q.p406e.p416n.p417b;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.stetho.dumpapp.Framer;
import java.text.DecimalFormat;
import java.util.List;
import p040c.p200q.p406e.p410l.C7035d;

/* renamed from: c.q.e.n.b.b */
/* compiled from: DecodedBitStreamParser */
public final class C7065b {

    /* renamed from: a */
    public static final String[] f13556a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    public static C7035d m20970a(byte[] bArr, int i) {
        String str;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m20976g(bArr))).format((long) m20975f(bArr));
            } else {
                str = m20977h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) m20972c(bArr));
            String format2 = decimalFormat.format((long) m20978i(bArr));
            sb.append(m20974e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, str + 29 + format + 29 + format2 + 29);
            } else {
                sb.insert(0, str + 29 + format + 29 + format2 + 29);
            }
        } else if (i == 4) {
            sb.append(m20974e(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(m20974e(bArr, 1, 77));
        }
        return new C7035d(bArr, sb.toString(), (List<byte[]>) null, String.valueOf(i));
    }

    /* renamed from: b */
    public static int m20971b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static int m20972c(byte[] bArr) {
        return m20973d(bArr, new byte[]{53, 54, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    public static int m20973d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m20971b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r5 != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r5 = -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20974e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = r1
            r6 = r4
            r5 = r2
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0068
            java.lang.String[] r7 = f13556a
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0059;
                case 65521: goto L_0x0059;
                case 65522: goto L_0x0059;
                case 65523: goto L_0x0059;
                case 65524: goto L_0x0059;
                case 65525: goto L_0x0055;
                case 65526: goto L_0x0053;
                case 65527: goto L_0x0050;
                case 65528: goto L_0x004d;
                case 65529: goto L_0x0051;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x0060
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x0060
        L_0x004d:
            r5 = r2
            r4 = r8
            goto L_0x0060
        L_0x0050:
            r4 = r1
        L_0x0051:
            r5 = r2
            goto L_0x0060
        L_0x0053:
            r5 = 3
            goto L_0x0056
        L_0x0055:
            r5 = 2
        L_0x0056:
            r6 = r4
            r4 = r1
            goto L_0x0060
        L_0x0059:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = r8
        L_0x0060:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0065
            r4 = r6
        L_0x0065:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0068:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0068
        L_0x0085:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p416n.p417b.C7065b.m20974e(byte[], int, int):java.lang.String");
    }

    /* renamed from: f */
    public static int m20975f(byte[] bArr) {
        return m20973d(bArr, new byte[]{Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    public static int m20976g(byte[] bArr) {
        return m20973d(bArr, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32});
    }

    /* renamed from: h */
    public static String m20977h(byte[] bArr) {
        return String.valueOf(new char[]{f13556a[0].charAt(m20973d(bArr, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32})), f13556a[0].charAt(m20973d(bArr, new byte[]{Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 25, 26})), f13556a[0].charAt(m20973d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), f13556a[0].charAt(m20973d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), f13556a[0].charAt(m20973d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), f13556a[0].charAt(m20973d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    public static int m20978i(byte[] bArr) {
        return m20973d(bArr, new byte[]{55, 56, 57, 58, 59, 60, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52});
    }
}

package p040c.p200q.p405d;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.media.AudioAttributesCompat;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import okio.Utf8;

/* renamed from: c.q.d.o1 */
/* compiled from: Utf8 */
public final class C6969o1 {

    /* renamed from: a */
    public static final C6971b f13340a = ((!C6974e.m20495m() || C6898d.m19666c()) ? new C6972c() : new C6974e());

    /* renamed from: c.q.d.o1$a */
    /* compiled from: Utf8 */
    public static class C6970a {
        /* renamed from: h */
        public static void m20465h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (m20470m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m20470m(b3) || m20470m(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int r = ((b & 7) << 18) | (m20475r(b2) << 12) | (m20475r(b3) << 6) | m20475r(b4);
            cArr[i] = m20469l(r);
            cArr[i + 1] = m20474q(r);
        }

        /* renamed from: i */
        public static void m20466i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m20467j(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (m20470m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m20470m(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (m20475r(b2) << 6) | m20475r(b3));
        }

        /* renamed from: k */
        public static void m20468k(byte b, byte b2, char[] cArr, int i) {
            if (b < -62 || m20470m(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | m20475r(b2));
        }

        /* renamed from: l */
        public static char m20469l(int i) {
            return (char) ((i >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        }

        /* renamed from: m */
        public static boolean m20470m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m20471n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m20472o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m20473p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m20474q(int i) {
            return (char) ((i & AudioAttributesCompat.FLAG_ALL) + Utf8.LOG_SURROGATE_HEADER);
        }

        /* renamed from: r */
        public static int m20475r(byte b) {
            return b & Utf8.REPLACEMENT_BYTE;
        }
    }

    /* renamed from: c.q.d.o1$b */
    /* compiled from: Utf8 */
    public static abstract class C6971b {
        /* renamed from: j */
        public static int m20476j(ByteBuffer byteBuffer, int i, int i2) {
            int e = i + C6969o1.m20447l(byteBuffer, i, i2);
            while (e < i2) {
                int i3 = e + 1;
                byte b = byteBuffer.get(e);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return C6969o1.m20451p(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || byteBuffer.get(i4) > -65))) {
                            return -1;
                        }
                        e = i4 + 1;
                    } else if (i3 >= i2 - 2) {
                        return C6969o1.m20451p(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (byteBuffer.get(i5) <= -65) {
                                i3 = i6 + 1;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                e = i3;
            }
            return 0;
        }

        /* renamed from: a */
        public final String mo32268a(ByteBuffer byteBuffer, int i, int i2) {
            if (byteBuffer.hasArray()) {
                return mo32269b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return mo32271d(byteBuffer, i, i2);
            } else {
                return mo32270c(byteBuffer, i, i2);
            }
        }

        /* renamed from: b */
        public abstract String mo32269b(byte[] bArr, int i, int i2);

        /* renamed from: c */
        public final String mo32270c(ByteBuffer byteBuffer, int i, int i2) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!C6970a.m20471n(b)) {
                        break;
                    }
                    i = r13 + 1;
                    C6970a.m20466i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (C6970a.m20471n(b2)) {
                        int i7 = i5 + 1;
                        C6970a.m20466i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (!C6970a.m20471n(b3)) {
                                break;
                            }
                            i6++;
                            C6970a.m20466i(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C6970a.m20473p(b2)) {
                        if (i6 < i3) {
                            C6970a.m20468k(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C6970a.m20472o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C6970a.m20467j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        C6970a.m20465h(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public abstract String mo32271d(ByteBuffer byteBuffer, int i, int i2);

        /* renamed from: e */
        public abstract int mo32272e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: f */
        public final boolean mo32273f(ByteBuffer byteBuffer, int i, int i2) {
            return mo32275h(0, byteBuffer, i, i2) == 0;
        }

        /* renamed from: g */
        public final boolean mo32274g(byte[] bArr, int i, int i2) {
            return mo32276i(0, bArr, i, i2) == 0;
        }

        /* renamed from: h */
        public final int mo32275h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return mo32276i(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return mo32278l(i, byteBuffer, i2, i3);
            } else {
                return mo32277k(i, byteBuffer, i2, i3);
            }
        }

        /* renamed from: i */
        public abstract int mo32276i(int i, byte[] bArr, int i2, int i3);

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            if (r8.get(r9) > -65) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008b, code lost:
            if (r8.get(r9) > -65) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r8.get(r9) > -65) goto L_0x001d;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo32277k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x008e
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001e
                r7 = -62
                if (r0 < r7) goto L_0x001d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                r9 = r7
                goto L_0x008e
            L_0x001d:
                return r2
            L_0x001e:
                r4 = -16
                if (r0 >= r4) goto L_0x004f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0038
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L_0x0035
                int r7 = p040c.p200q.p405d.C6969o1.m20449n(r0, r9)
                return r7
            L_0x0035:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0038:
                if (r7 > r3) goto L_0x004e
                r4 = -96
                if (r0 != r1) goto L_0x0040
                if (r7 < r4) goto L_0x004e
            L_0x0040:
                r1 = -19
                if (r0 != r1) goto L_0x0046
                if (r7 >= r4) goto L_0x004e
            L_0x0046:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x004e:
                return r2
            L_0x004f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x0065
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L_0x0063
                int r7 = p040c.p200q.p405d.C6969o1.m20449n(r0, r1)
                return r7
            L_0x0063:
                r9 = r7
                goto L_0x0068
            L_0x0065:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0068:
                if (r4 != 0) goto L_0x0078
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L_0x0077
                int r7 = p040c.p200q.p405d.C6969o1.m20450o(r0, r1, r4)
                return r7
            L_0x0077:
                r9 = r7
            L_0x0078:
                if (r1 > r3) goto L_0x008d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x008d
                if (r4 > r3) goto L_0x008d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x008d:
                return r2
            L_0x008e:
                int r7 = m20476j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6971b.mo32277k(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: l */
        public abstract int mo32278l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* renamed from: c.q.d.o1$c */
    /* compiled from: Utf8 */
    public static final class C6972c extends C6971b {
        /* renamed from: m */
        public static int m20488m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m20489n(bArr, i, i2);
        }

        /* renamed from: n */
        public static int m20489n(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return C6969o1.m20452q(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return C6969o1.m20452q(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        /* renamed from: b */
        public String mo32269b(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!C6970a.m20471n(b)) {
                        break;
                    }
                    i = r13 + 1;
                    C6970a.m20466i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (C6970a.m20471n(b2)) {
                        int i7 = i5 + 1;
                        C6970a.m20466i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!C6970a.m20471n(b3)) {
                                break;
                            }
                            i6++;
                            C6970a.m20466i(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C6970a.m20473p(b2)) {
                        if (i6 < i3) {
                            C6970a.m20468k(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C6970a.m20472o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C6970a.m20467j(b2, bArr[i6], bArr[i8], cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C6970a.m20465h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public String mo32271d(ByteBuffer byteBuffer, int i, int i2) {
            return mo32270c(byteBuffer, i, i2);
        }

        /* renamed from: e */
        public int mo32272e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new C6973d(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new C6973d(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32276i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = p040c.p200q.p405d.C6969o1.m20449n(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = p040c.p200q.p405d.C6969o1.m20449n(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = p040c.p200q.p405d.C6969o1.m20450o(r0, r1, r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = m20488m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6972c.mo32276i(int, byte[], int, int):int");
        }

        /* renamed from: l */
        public int mo32278l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return mo32277k(i, byteBuffer, i2, i3);
        }
    }

    /* renamed from: c.q.d.o1$d */
    /* compiled from: Utf8 */
    public static class C6973d extends IllegalArgumentException {
        public C6973d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: c.q.d.o1$e */
    /* compiled from: Utf8 */
    public static final class C6974e extends C6971b {
        /* renamed from: m */
        public static boolean m20495m() {
            return C6961n1.m20332G() && C6961n1.m20333H();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m20496n(long r8, int r10) {
            /*
                int r0 = m20498p(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r10 <= 0) goto L_0x001a
                long r4 = r8 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r8)
                if (r1 < 0) goto L_0x0019
                int r10 = r10 + -1
                r8 = r4
                goto L_0x0009
            L_0x0019:
                r8 = r4
            L_0x001a:
                if (r10 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r10 = r10 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r10 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r10 = r10 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r8
                byte r8 = p040c.p200q.p405d.C6961n1.m20368u(r8)
                if (r8 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r8 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r10 >= r6) goto L_0x0046
                int r8 = m20500r(r8, r1, r10)
                return r8
            L_0x0046:
                int r10 = r10 + -2
                long r6 = r8 + r2
                byte r8 = p040c.p200q.p405d.C6961n1.m20368u(r8)
                if (r8 > r4) goto L_0x0063
                r9 = -96
                if (r1 != r0) goto L_0x0056
                if (r8 < r9) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r8 >= r9) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r8 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                if (r8 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r10 >= r0) goto L_0x006c
                int r8 = m20500r(r8, r1, r10)
                return r8
            L_0x006c:
                int r10 = r10 + -3
                long r6 = r8 + r2
                byte r8 = p040c.p200q.p405d.C6961n1.m20368u(r8)
                if (r8 > r4) goto L_0x008e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x008e
                long r8 = r6 + r2
                byte r0 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r8
                byte r8 = p040c.p200q.p405d.C6961n1.m20368u(r8)
                if (r8 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6974e.m20496n(long, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m20497o(byte[] r8, long r9, int r11) {
            /*
                int r0 = m20499q(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20369v(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = p040c.p200q.p405d.C6961n1.m20369v(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = m20501s(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = p040c.p200q.p405d.C6961n1.m20369v(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = p040c.p200q.p405d.C6961n1.m20369v(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = m20501s(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = p040c.p200q.p405d.C6961n1.m20369v(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = p040c.p200q.p405d.C6961n1.m20369v(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = p040c.p200q.p405d.C6961n1.m20369v(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6974e.m20497o(byte[], long, int):int");
        }

        /* renamed from: p */
        public static int m20498p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (C6961n1.m20368u(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (C6961n1.m20327B(j) & -9187201950435737472L) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* renamed from: q */
        public static int m20499q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (C6961n1.m20369v(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: r */
        public static int m20500r(long j, int i, int i2) {
            if (i2 == 0) {
                return C6969o1.m20448m(i);
            }
            if (i2 == 1) {
                return C6969o1.m20449n(i, C6961n1.m20368u(j));
            }
            if (i2 == 2) {
                return C6969o1.m20450o(i, C6961n1.m20368u(j), C6961n1.m20368u(j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: s */
        public static int m20501s(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C6969o1.m20448m(i);
            }
            if (i2 == 1) {
                return C6969o1.m20449n(i, C6961n1.m20369v(bArr, j));
            }
            if (i2 == 2) {
                return C6969o1.m20450o(i, C6961n1.m20369v(bArr, j), C6961n1.m20369v(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public String mo32269b(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte v = C6961n1.m20369v(bArr, (long) r13);
                    if (!C6970a.m20471n(v)) {
                        break;
                    }
                    i = r13 + 1;
                    C6970a.m20466i(v, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte v2 = C6961n1.m20369v(bArr, (long) r13);
                    if (C6970a.m20471n(v2)) {
                        int i7 = i5 + 1;
                        C6970a.m20466i(v2, cArr, i5);
                        while (i6 < i3) {
                            byte v3 = C6961n1.m20369v(bArr, (long) i6);
                            if (!C6970a.m20471n(v3)) {
                                break;
                            }
                            i6++;
                            C6970a.m20466i(v3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C6970a.m20473p(v2)) {
                        if (i6 < i3) {
                            C6970a.m20468k(v2, C6961n1.m20369v(bArr, (long) i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C6970a.m20472o(v2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C6970a.m20467j(v2, C6961n1.m20369v(bArr, (long) i6), C6961n1.m20369v(bArr, (long) i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte v4 = C6961n1.m20369v(bArr, (long) i6);
                        int i10 = i9 + 1;
                        C6970a.m20465h(v2, v4, C6961n1.m20369v(bArr, (long) i9), C6961n1.m20369v(bArr, (long) i10), cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public String mo32271d(ByteBuffer byteBuffer, int i, int i2) {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long i5 = C6961n1.m20356i(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + i5;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i5 < j2) {
                    byte u = C6961n1.m20368u(i5);
                    if (!C6970a.m20471n(u)) {
                        break;
                    }
                    i5++;
                    C6970a.m20466i(u, cArr, i6);
                    i6++;
                }
                while (true) {
                    int i7 = i6;
                    while (j < j2) {
                        long j3 = j + 1;
                        byte u2 = C6961n1.m20368u(j);
                        if (C6970a.m20471n(u2)) {
                            int i8 = i7 + 1;
                            C6970a.m20466i(u2, cArr, i7);
                            while (j3 < j2) {
                                byte u3 = C6961n1.m20368u(j3);
                                if (!C6970a.m20471n(u3)) {
                                    break;
                                }
                                j3++;
                                C6970a.m20466i(u3, cArr, i8);
                                i8++;
                            }
                            i7 = i8;
                            j = j3;
                        } else if (C6970a.m20473p(u2)) {
                            if (j3 < j2) {
                                j = j3 + 1;
                                C6970a.m20468k(u2, C6961n1.m20368u(j3), cArr, i7);
                                i7++;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (C6970a.m20472o(u2)) {
                            if (j3 < j2 - 1) {
                                long j4 = j3 + 1;
                                C6970a.m20467j(u2, C6961n1.m20368u(j3), C6961n1.m20368u(j4), cArr, i7);
                                i7++;
                                j = j4 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (j3 < j2 - 2) {
                            long j5 = j3 + 1;
                            byte u4 = C6961n1.m20368u(j3);
                            long j6 = j5 + 1;
                            byte u5 = C6961n1.m20368u(j5);
                            i5 = j6 + 1;
                            C6970a.m20465h(u2, u4, u5, C6961n1.m20368u(j6), cArr, i7);
                            i6 = i7 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    return new String(cArr, 0, i7);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32272e(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r22.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004a
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004a
                long r14 = r4 + r11
                byte r13 = (byte) r13
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r13)
                r4 = r11
                r12 = r14
                r11 = r3
                goto L_0x00fc
            L_0x004a:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0074
                r14 = 2
                long r14 = r6 - r14
                int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x0074
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                p040c.p200q.p405d.C6961n1.m20338M(r1, r14, r5)
                r19 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r19
                goto L_0x00fc
            L_0x0074:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007e
                if (r3 >= r13) goto L_0x00af
            L_0x007e:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00af
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                p040c.p200q.p405d.C6961n1.m20338M(r1, r14, r5)
                r14 = 1
                long r17 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                p040c.p200q.p405d.C6961n1.m20338M(r1, r3, r5)
                r12 = r17
                r4 = 1
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fc
            L_0x00af:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                p040c.p200q.p405d.C6961n1.m20338M(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                p040c.p200q.p405d.C6961n1.m20338M(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                p040c.p200q.p405d.C6961n1.m20338M(r1, r14, r2)
                r2 = r3
            L_0x00fc:
                int r2 = r2 + 1
                r3 = r11
                r19 = r4
                r4 = r12
                r11 = r19
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                c.q.d.o1$d r0 = new c.q.d.o1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                c.q.d.o1$d r0 = new c.q.d.o1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6974e.mo32272e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
            if (p040c.p200q.p405d.C6961n1.m20369v(r13, r2) > -65) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (p040c.p200q.p405d.C6961n1.m20369v(r13, r2) > -65) goto L_0x00a0;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32276i(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00a8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00a1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0011
                return r12
            L_0x0011:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L_0x002b
                r12 = -62
                if (r0 < r12) goto L_0x002a
                long r7 = r7 + r2
                byte r12 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                if (r12 <= r6) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                r2 = r7
                goto L_0x00a1
            L_0x002a:
                return r5
            L_0x002b:
                r9 = -16
                if (r0 >= r9) goto L_0x005f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0045
                long r9 = r2 + r7
                byte r12 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L_0x0044
                int r12 = p040c.p200q.p405d.C6969o1.m20449n(r0, r12)
                return r12
            L_0x0044:
                r2 = r9
            L_0x0045:
                if (r12 > r6) goto L_0x005e
                r1 = -96
                if (r0 != r4) goto L_0x004d
                if (r12 < r1) goto L_0x005e
            L_0x004d:
                r4 = -19
                if (r0 != r4) goto L_0x0053
                if (r12 >= r1) goto L_0x005e
            L_0x0053:
                long r0 = r2 + r7
                byte r12 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                if (r12 <= r6) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r2 = r0
                goto L_0x00a1
            L_0x005e:
                return r5
            L_0x005f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0076
                long r9 = r2 + r7
                byte r4 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0074
                int r12 = p040c.p200q.p405d.C6969o1.m20449n(r0, r4)
                return r12
            L_0x0074:
                r2 = r9
                goto L_0x0079
            L_0x0076:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0079:
                if (r1 != 0) goto L_0x008b
                long r9 = r2 + r7
                byte r1 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x008a
                int r12 = p040c.p200q.p405d.C6969o1.m20450o(r0, r4, r1)
                return r12
            L_0x008a:
                r2 = r9
            L_0x008b:
                if (r4 > r6) goto L_0x00a0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r6) goto L_0x00a0
                long r0 = r2 + r7
                byte r12 = p040c.p200q.p405d.C6961n1.m20369v(r13, r2)
                if (r12 <= r6) goto L_0x005c
            L_0x00a0:
                return r5
            L_0x00a1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = m20497o(r13, r2, r12)
                return r12
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6974e.mo32276i(int, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (p040c.p200q.p405d.C6961n1.m20368u(r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (p040c.p200q.p405d.C6961n1.m20368u(r2) > -65) goto L_0x00aa;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32278l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.limit()
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00b2
                long r2 = p040c.p200q.p405d.C6961n1.m20356i(r12)
                long r4 = (long) r13
                long r2 = r2 + r4
                int r14 = r14 - r13
                long r12 = (long) r14
                long r12 = r12 + r2
                if (r11 == 0) goto L_0x00ab
                int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r14 < 0) goto L_0x001b
                return r11
            L_0x001b:
                byte r14 = (byte) r11
                r0 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r14 >= r0) goto L_0x0035
                r11 = -62
                if (r14 < r11) goto L_0x0034
                long r6 = r6 + r2
                byte r11 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                if (r11 <= r5) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2 = r6
                goto L_0x00ab
            L_0x0034:
                return r4
            L_0x0035:
                r8 = -16
                if (r14 >= r8) goto L_0x0069
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L_0x004f
                long r8 = r2 + r6
                byte r11 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r1 < 0) goto L_0x004e
                int r11 = p040c.p200q.p405d.C6969o1.m20449n(r14, r11)
                return r11
            L_0x004e:
                r2 = r8
            L_0x004f:
                if (r11 > r5) goto L_0x0068
                r1 = -96
                if (r14 != r0) goto L_0x0057
                if (r11 < r1) goto L_0x0068
            L_0x0057:
                r0 = -19
                if (r14 != r0) goto L_0x005d
                if (r11 >= r1) goto L_0x0068
            L_0x005d:
                long r0 = r2 + r6
                byte r11 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                if (r11 <= r5) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = r0
                goto L_0x00ab
            L_0x0068:
                return r4
            L_0x0069:
                int r0 = r11 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0080
                long r8 = r2 + r6
                byte r0 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x007e
                int r11 = p040c.p200q.p405d.C6969o1.m20449n(r14, r0)
                return r11
            L_0x007e:
                r2 = r8
                goto L_0x0083
            L_0x0080:
                int r11 = r11 >> 16
                byte r1 = (byte) r11
            L_0x0083:
                if (r1 != 0) goto L_0x0095
                long r8 = r2 + r6
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x0094
                int r11 = p040c.p200q.p405d.C6969o1.m20450o(r14, r0, r1)
                return r11
            L_0x0094:
                r2 = r8
            L_0x0095:
                if (r0 > r5) goto L_0x00aa
                int r11 = r14 << 28
                int r0 = r0 + 112
                int r11 = r11 + r0
                int r11 = r11 >> 30
                if (r11 != 0) goto L_0x00aa
                if (r1 > r5) goto L_0x00aa
                long r0 = r2 + r6
                byte r11 = p040c.p200q.p405d.C6961n1.m20368u(r2)
                if (r11 <= r5) goto L_0x0066
            L_0x00aa:
                return r4
            L_0x00ab:
                long r12 = r12 - r2
                int r11 = (int) r12
                int r11 = m20496n(r2, r11)
                return r11
            L_0x00b2:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r12 = r12.limit()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r0[r1] = r12
                r12 = 1
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r12] = r13
                r12 = 2
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                r0[r12] = r13
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r12, r0)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6969o1.C6974e.mo32278l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    /* renamed from: g */
    public static String m20442g(ByteBuffer byteBuffer, int i, int i2) {
        return f13340a.mo32268a(byteBuffer, i, i2);
    }

    /* renamed from: h */
    public static String m20443h(byte[] bArr, int i, int i2) {
        return f13340a.mo32269b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m20444i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f13340a.mo32272e(charSequence, bArr, i, i2);
    }

    /* renamed from: j */
    public static int m20445j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += m20446k(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSED_BIT));
    }

    /* renamed from: k */
    public static int m20446k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new C6973d(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: l */
    public static int m20447l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & -9187201950435737472L) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* renamed from: m */
    public static int m20448m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: n */
    public static int m20449n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: o */
    public static int m20450o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: p */
    public static int m20451p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m20448m(i);
        }
        if (i3 == 1) {
            return m20449n(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m20450o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: q */
    public static int m20452q(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m20448m(b);
        }
        if (i3 == 1) {
            return m20449n(b, bArr[i]);
        }
        if (i3 == 2) {
            return m20450o(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: r */
    public static boolean m20453r(ByteBuffer byteBuffer) {
        return f13340a.mo32273f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: s */
    public static boolean m20454s(byte[] bArr) {
        return f13340a.mo32274g(bArr, 0, bArr.length);
    }

    /* renamed from: t */
    public static boolean m20455t(byte[] bArr, int i, int i2) {
        return f13340a.mo32274g(bArr, i, i2);
    }

    /* renamed from: u */
    public static int m20456u(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f13340a.mo32275h(i, byteBuffer, i2, i3);
    }

    /* renamed from: v */
    public static int m20457v(int i, byte[] bArr, int i2, int i3) {
        return f13340a.mo32276i(i, bArr, i2, i3);
    }
}
package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.text.Typography;
import p040c.p142n.p143a.p144a.C2061a;
import p040c.p142n.p143a.p144a.p150m.C2095b;

public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    public static final int INT_SPACE = 32;
    public static final char PADDING_CHAR_NONE = '\u0000';
    public static final long serialVersionUID = 1;
    public final transient int[] _asciiToBase64;
    public final transient byte[] _base64ToAsciiB;
    public final transient char[] _base64ToAsciiC;
    public final transient int _maxLineLength;
    public final String _name;
    public final transient char _paddingChar;
    public final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, this._base64ToAsciiC, 0);
            Arrays.fill(this._asciiToBase64, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this._base64ToAsciiC[i2];
                this._base64ToAsciiB[i2] = (byte) c2;
                this._asciiToBase64[c2] = i2;
            }
            if (z) {
                this._asciiToBase64[c] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    public void _reportBase64EOF() {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    public void _reportInvalidBase64(char c, int i, String str) {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public byte[] decode(String str) {
        C2095b bVar = new C2095b();
        decode(str, bVar);
        return bVar.mo16835n();
    }

    public int decodeBase64Byte(byte b) {
        if (b <= Byte.MAX_VALUE) {
            return this._asciiToBase64[b];
        }
        return -1;
    }

    public int decodeBase64Char(char c) {
        if (c <= 127) {
            return this._asciiToBase64[c];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i) {
        return this._base64ToAsciiB[i];
    }

    public char encodeBase64BitsAsChar(int i) {
        return this._base64ToAsciiC[i];
    }

    public int encodeBase64Chunk(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this._paddingChar;
            int i7 = i6 + 1;
            cArr[i6] = this._paddingChar;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i5 + 1;
        }
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public Object readResolve() {
        return C2061a.m2884a(this._name);
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public int decodeBase64Char(int i) {
        if (i <= 127) {
            return this._asciiToBase64[i];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(Typography.quote);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            encodeBase64Chunk(sb, (((bArr[i] << 8) | (bArr[i3] & 255)) << 8) | (bArr[i4] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i = i5;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i + 1;
            int i8 = bArr[i] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            encodeBase64Partial(sb, i8, i6);
        }
        if (z) {
            sb.append(Typography.quote);
        }
        return sb.toString();
    }

    public boolean usesPaddingChar(int i) {
        return i == this._paddingChar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r2 = r3 + 1;
        r3 = r11.charAt(r3);
        r6 = decodeBase64Char(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r6 >= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        _reportInvalidBase64(r3, 1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = (r4 << 6) | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 < r0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (usesPadding() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r12.mo16823b(r3 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r4 = r2 + 1;
        r2 = r11.charAt(r2);
        r6 = decodeBase64Char(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r6 >= 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r6 == -2) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        _reportInvalidBase64(r2, 2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r4 < r0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r2 = r4 + 1;
        r4 = r11.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (usesPaddingChar(r4) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        _reportInvalidBase64(r4, 3, "expected padding character '" + getPaddingChar() + "'");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r12.mo16823b(r3 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r2 = (r3 << 6) | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r4 < r0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (usesPadding() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r12.mo16826d(r2 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r3 = r4 + 1;
        r4 = r11.charAt(r4);
        r6 = decodeBase64Char(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r6 >= 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r6 == -2) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        _reportInvalidBase64(r4, 3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r12.mo16826d(r2 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r12.mo16824c((r2 << 6) | r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r4 = decodeBase64Char(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 >= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        _reportInvalidBase64(r2, 0, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 < r0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decode(java.lang.String r11, p040c.p142n.p143a.p144a.p150m.C2095b r12) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = r1
        L_0x0006:
            if (r2 >= r0) goto L_0x00ca
        L_0x0008:
            int r3 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r3 < r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            r4 = 32
            if (r2 <= r4) goto L_0x00c7
            int r4 = r10.decodeBase64Char((char) r2)
            r5 = 0
            if (r4 >= 0) goto L_0x0020
            r10._reportInvalidBase64(r2, r1, r5)
        L_0x0020:
            if (r3 < r0) goto L_0x0025
            r10._reportBase64EOF()
        L_0x0025:
            int r2 = r3 + 1
            char r3 = r11.charAt(r3)
            int r6 = r10.decodeBase64Char((char) r3)
            if (r6 >= 0) goto L_0x0035
            r7 = 1
            r10._reportInvalidBase64(r3, r7, r5)
        L_0x0035:
            int r3 = r4 << 6
            r3 = r3 | r6
            if (r2 < r0) goto L_0x004a
            boolean r4 = r10.usesPadding()
            if (r4 != 0) goto L_0x0047
            int r11 = r3 >> 4
            r12.mo16823b(r11)
            goto L_0x00ca
        L_0x0047:
            r10._reportBase64EOF()
        L_0x004a:
            int r4 = r2 + 1
            char r2 = r11.charAt(r2)
            int r6 = r10.decodeBase64Char((char) r2)
            r7 = 3
            r8 = -2
            r9 = 2
            if (r6 >= 0) goto L_0x0093
            if (r6 == r8) goto L_0x005e
            r10._reportInvalidBase64(r2, r9, r5)
        L_0x005e:
            if (r4 < r0) goto L_0x0063
            r10._reportBase64EOF()
        L_0x0063:
            int r2 = r4 + 1
            char r4 = r11.charAt(r4)
            boolean r5 = r10.usesPaddingChar((char) r4)
            if (r5 != 0) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "expected padding character '"
            r5.append(r6)
            char r6 = r10.getPaddingChar()
            r5.append(r6)
            java.lang.String r6 = "'"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r10._reportInvalidBase64(r4, r7, r5)
        L_0x008c:
            int r3 = r3 >> 4
            r12.mo16823b(r3)
            goto L_0x0006
        L_0x0093:
            int r2 = r3 << 6
            r2 = r2 | r6
            if (r4 < r0) goto L_0x00a7
            boolean r3 = r10.usesPadding()
            if (r3 != 0) goto L_0x00a4
            int r11 = r2 >> 2
            r12.mo16826d(r11)
            goto L_0x00ca
        L_0x00a4:
            r10._reportBase64EOF()
        L_0x00a7:
            int r3 = r4 + 1
            char r4 = r11.charAt(r4)
            int r6 = r10.decodeBase64Char((char) r4)
            if (r6 >= 0) goto L_0x00be
            if (r6 == r8) goto L_0x00b8
            r10._reportInvalidBase64(r4, r7, r5)
        L_0x00b8:
            int r2 = r2 >> 2
            r12.mo16826d(r2)
            goto L_0x00c4
        L_0x00be:
            int r2 = r2 << 6
            r2 = r2 | r6
            r12.mo16824c(r2)
        L_0x00c4:
            r2 = r3
            goto L_0x0006
        L_0x00c7:
            r2 = r3
            goto L_0x0008
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.Base64Variant.decode(java.lang.String, c.n.a.a.m.b):void");
    }

    public void encodeBase64Chunk(StringBuilder sb, int i) {
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i, int i2) {
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        if (this._usesPadding) {
            sb.append(i2 == 2 ? this._base64ToAsciiC[(i >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i2 == 2) {
            sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            byte b = (byte) this._paddingChar;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            int i7 = i6 + 1;
            bArr[i6] = b;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i5 + 1;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr, 0, this._base64ToAsciiC, 0, cArr.length);
        int[] iArr = base64Variant._asciiToBase64;
        System.arraycopy(iArr, 0, this._asciiToBase64, 0, iArr.length);
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
    }
}

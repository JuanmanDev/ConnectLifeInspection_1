package okio;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\b¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000f\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0011\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a8\u0010\u0012\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a8\u0010\u0014\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0017\u001a\u00020\r*\u00020\u00162\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a8\u0010\u0019\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0019\u0010\u0015\u001a'\u0010\u001d\u001a\u00020\u001a*\u00020\u00162\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001e\u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0016\u0010 \u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0016\u0010!\u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0016\u0010\"\u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0016\u0010#\u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0016\u0010$\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b$\u0010%\"\u0016\u0010&\u001a\u00020\u00138\u0000@\u0000XT¢\u0006\u0006\n\u0004\b&\u0010'\"\u0016\u0010(\u001a\u00020\u00008\u0000@\u0000XT¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u0006)"}, mo47991d2 = {"", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "", "beginIndex", "endIndex", "Lkotlin/Function1;", "", "yield", "process2Utf8Bytes", "([BIILkotlin/Function1;)I", "process3Utf8Bytes", "process4Utf8Bytes", "", "processUtf16Chars", "([BIILkotlin/Function1;)V", "", "processUtf8Bytes", "(Ljava/lang/String;IILkotlin/Function1;)V", "processUtf8CodePoints", "", "size", "(Ljava/lang/String;II)J", "utf8Size", "HIGH_SURROGATE_HEADER", "I", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@JvmName(name = "Utf8")
/* compiled from: Utf8.kt */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = '�';
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & ExifInterface.MARKER_SOF0) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> function1) {
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            function1.invoke(valueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & ExifInterface.MARKER_SOF0) == 128)) {
            function1.invoke(valueOf);
            return 1;
        }
        byte b3 = (b2 ^ ByteCompanionObject.MIN_VALUE) ^ (b << 6);
        if (b3 < 128) {
            function1.invoke(valueOf);
            return 2;
        }
        function1.invoke(Integer.valueOf(b3));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> function1) {
        int i3 = i + 2;
        boolean z = false;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            function1.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & ExifInterface.MARKER_SOF0) == 128) {
                    z = true;
                }
                return !z ? 1 : 2;
            }
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & ExifInterface.MARKER_SOF0) == 128)) {
            function1.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & ExifInterface.MARKER_SOF0) == 128) {
            z = true;
        }
        if (!z) {
            function1.invoke(valueOf);
            return 2;
        }
        byte b4 = ((b3 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6)) ^ (b << 12);
        if (b4 < 2048) {
            function1.invoke(valueOf);
            return 3;
        } else if (55296 <= b4 && 57343 >= b4) {
            function1.invoke(valueOf);
            return 3;
        } else {
            function1.invoke(Integer.valueOf(b4));
            return 3;
        }
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Integer, Unit> function1) {
        int i3 = i + 3;
        boolean z = false;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            function1.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & ExifInterface.MARKER_SOF0) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & ExifInterface.MARKER_SOF0) == 128) {
                            z = true;
                        }
                        return !z ? 2 : 3;
                    }
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & ExifInterface.MARKER_SOF0) == 128)) {
            function1.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & ExifInterface.MARKER_SOF0) == 128)) {
            function1.invoke(valueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & ExifInterface.MARKER_SOF0) == 128) {
            z = true;
        }
        if (!z) {
            function1.invoke(valueOf);
            return 3;
        }
        byte b5 = (((b4 ^ ByteCompanionObject.MIN_VALUE) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (b5 > 1114111) {
            function1.invoke(valueOf);
            return 4;
        } else if (55296 <= b5 && 57343 >= b5) {
            function1.invoke(valueOf);
            return 4;
        } else if (b5 < 65536) {
            function1.invoke(valueOf);
            return 4;
        } else {
            function1.invoke(Integer.valueOf(b5));
            return 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r7 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
        if (r7 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = r17
        L_0x0006:
            if (r2 >= r0) goto L_0x0193
            byte r3 = r16[r2]
            if (r3 < 0) goto L_0x002a
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
            int r2 = r2 + 1
        L_0x0016:
            if (r2 >= r0) goto L_0x0006
            byte r3 = r16[r2]
            if (r3 < 0) goto L_0x0006
            int r3 = r2 + 1
            byte r2 = r16[r2]
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.invoke(r2)
            r2 = r3
            goto L_0x0016
        L_0x002a:
            int r4 = r3 >> 5
            r5 = -2
            r6 = 2
            r7 = 0
            r8 = 128(0x80, float:1.794E-43)
            r9 = 65533(0xfffd, float:9.1831E-41)
            r10 = 1
            if (r4 != r5) goto L_0x0064
            int r3 = r2 + 1
            if (r0 > r3) goto L_0x0045
        L_0x003b:
            char r3 = (char) r9
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
        L_0x0043:
            r6 = r10
            goto L_0x0062
        L_0x0045:
            byte r4 = r16[r2]
            byte r3 = r16[r3]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r8) goto L_0x004e
            r7 = r10
        L_0x004e:
            if (r7 != 0) goto L_0x0051
            goto L_0x003b
        L_0x0051:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r8) goto L_0x005a
            char r3 = (char) r9
            goto L_0x005b
        L_0x005a:
            char r3 = (char) r3
        L_0x005b:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
        L_0x0062:
            int r2 = r2 + r6
            goto L_0x0006
        L_0x0064:
            int r4 = r3 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            r13 = 3
            if (r4 != r5) goto L_0x00d4
            int r3 = r2 + 2
            if (r0 > r3) goto L_0x0089
            char r3 = (char) r9
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
            int r3 = r2 + 1
            if (r0 <= r3) goto L_0x0043
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x0086
            r7 = r10
        L_0x0086:
            if (r7 != 0) goto L_0x0062
        L_0x0088:
            goto L_0x0043
        L_0x0089:
            byte r4 = r16[r2]
            int r5 = r2 + 1
            byte r5 = r16[r5]
            r14 = r5 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x0095
            r14 = r10
            goto L_0x0096
        L_0x0095:
            r14 = r7
        L_0x0096:
            if (r14 != 0) goto L_0x00a1
            char r3 = (char) r9
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
            goto L_0x0088
        L_0x00a1:
            byte r3 = r16[r3]
            r14 = r3 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x00a8
            r7 = r10
        L_0x00a8:
            if (r7 != 0) goto L_0x00b3
            char r3 = (char) r9
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
            goto L_0x0062
        L_0x00b3:
            r6 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r6
            int r5 = r5 << 6
            r3 = r3 ^ r5
            int r4 = r4 << 12
            r3 = r3 ^ r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L_0x00ca
        L_0x00c1:
            char r3 = (char) r9
        L_0x00c2:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
            goto L_0x00d2
        L_0x00ca:
            if (r11 <= r3) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            if (r12 < r3) goto L_0x00d0
            goto L_0x00c1
        L_0x00d0:
            char r3 = (char) r3
            goto L_0x00c2
        L_0x00d2:
            r6 = r13
            goto L_0x0062
        L_0x00d4:
            int r3 = r3 >> 3
            if (r3 != r5) goto L_0x0188
            int r3 = r2 + 3
            if (r0 > r3) goto L_0x0103
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            int r3 = r2 + 1
            if (r0 <= r3) goto L_0x0043
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x00ef
            r3 = r10
            goto L_0x00f0
        L_0x00ef:
            r3 = r7
        L_0x00f0:
            if (r3 != 0) goto L_0x00f4
            goto L_0x0043
        L_0x00f4:
            int r3 = r2 + 2
            if (r0 <= r3) goto L_0x0062
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x00ff
            r7 = r10
        L_0x00ff:
            if (r7 != 0) goto L_0x00d2
            goto L_0x0062
        L_0x0103:
            byte r4 = r16[r2]
            int r5 = r2 + 1
            byte r5 = r16[r5]
            r14 = r5 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x010f
            r14 = r10
            goto L_0x0110
        L_0x010f:
            r14 = r7
        L_0x0110:
            if (r14 != 0) goto L_0x011b
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0043
        L_0x011b:
            int r14 = r2 + 2
            byte r14 = r16[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r8) goto L_0x0125
            r15 = r10
            goto L_0x0126
        L_0x0125:
            r15 = r7
        L_0x0126:
            if (r15 != 0) goto L_0x0131
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0062
        L_0x0131:
            byte r3 = r16[r3]
            r6 = r3 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L_0x0138
            r7 = r10
        L_0x0138:
            if (r7 != 0) goto L_0x0142
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            goto L_0x00d2
        L_0x0142:
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r6
            int r6 = r14 << 6
            r3 = r3 ^ r6
            int r5 = r5 << 12
            r3 = r3 ^ r5
            int r4 = r4 << 18
            r3 = r3 ^ r4
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r4) goto L_0x015c
        L_0x0154:
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0185
        L_0x015c:
            if (r11 <= r3) goto L_0x015f
            goto L_0x0162
        L_0x015f:
            if (r12 < r3) goto L_0x0162
            goto L_0x0154
        L_0x0162:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r4) goto L_0x0167
            goto L_0x0154
        L_0x0167:
            if (r3 == r9) goto L_0x0154
            int r4 = r3 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r1.invoke(r4)
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r4 = 56320(0xdc00, float:7.8921E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.invoke(r3)
        L_0x0185:
            r6 = 4
            goto L_0x0062
        L_0x0188:
            java.lang.Character r3 = java.lang.Character.valueOf(r9)
            r1.invoke(r3)
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    public static final void processUtf8Bytes(@NotNull String str, int i, int i2, @NotNull Function1<? super Byte, Unit> function1) {
        int i3;
        char charAt;
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                function1.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && str.charAt(i) < 128) {
                    function1.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (charAt2 < 2048) {
                    function1.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    function1.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    function1.invoke(Byte.valueOf((byte) ((charAt2 >> 12) | 224)));
                    function1.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (charAt2 > 56319 || i2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || 57343 < charAt) {
                    function1.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int charAt3 = ((charAt2 << 10) + str.charAt(i3)) - 56613888;
                    function1.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    function1.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r7 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fd, code lost:
        if (r7 == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = r17
        L_0x0006:
            if (r2 >= r0) goto L_0x0178
            byte r3 = r16[r2]
            if (r3 < 0) goto L_0x0028
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.invoke(r3)
            int r2 = r2 + 1
        L_0x0015:
            if (r2 >= r0) goto L_0x0006
            byte r3 = r16[r2]
            if (r3 < 0) goto L_0x0006
            int r3 = r2 + 1
            byte r2 = r16[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.invoke(r2)
            r2 = r3
            goto L_0x0015
        L_0x0028:
            int r4 = r3 >> 5
            r5 = -2
            r6 = 2
            r7 = 0
            r8 = 128(0x80, float:1.794E-43)
            r9 = 65533(0xfffd, float:9.1831E-41)
            r10 = 1
            if (r4 != r5) goto L_0x0063
            int r3 = r2 + 1
            if (r0 > r3) goto L_0x0042
        L_0x0039:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
        L_0x0040:
            r6 = r10
            goto L_0x0061
        L_0x0042:
            byte r4 = r16[r2]
            byte r3 = r16[r3]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r8) goto L_0x004b
            r7 = r10
        L_0x004b:
            if (r7 != 0) goto L_0x004e
            goto L_0x0039
        L_0x004e:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r8) goto L_0x005a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x005e
        L_0x005a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x005e:
            r1.invoke(r3)
        L_0x0061:
            int r2 = r2 + r6
            goto L_0x0006
        L_0x0063:
            int r4 = r3 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            r13 = 3
            if (r4 != r5) goto L_0x00d2
            int r3 = r2 + 2
            if (r0 > r3) goto L_0x0087
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            int r3 = r2 + 1
            if (r0 <= r3) goto L_0x0040
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x0084
            r7 = r10
        L_0x0084:
            if (r7 != 0) goto L_0x0061
        L_0x0086:
            goto L_0x0040
        L_0x0087:
            byte r4 = r16[r2]
            int r5 = r2 + 1
            byte r5 = r16[r5]
            r14 = r5 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x0093
            r14 = r10
            goto L_0x0094
        L_0x0093:
            r14 = r7
        L_0x0094:
            if (r14 != 0) goto L_0x009e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0086
        L_0x009e:
            byte r3 = r16[r3]
            r14 = r3 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x00a5
            r7 = r10
        L_0x00a5:
            if (r7 != 0) goto L_0x00af
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0061
        L_0x00af:
            r6 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r6
            int r5 = r5 << 6
            r3 = r3 ^ r5
            int r4 = r4 << 12
            r3 = r3 ^ r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L_0x00c5
        L_0x00bd:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
        L_0x00c1:
            r1.invoke(r3)
            goto L_0x00d0
        L_0x00c5:
            if (r11 <= r3) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            if (r12 < r3) goto L_0x00cb
            goto L_0x00bd
        L_0x00cb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00c1
        L_0x00d0:
            r6 = r13
            goto L_0x0061
        L_0x00d2:
            int r3 = r3 >> 3
            if (r3 != r5) goto L_0x016d
            int r3 = r2 + 3
            if (r0 > r3) goto L_0x0101
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            int r3 = r2 + 1
            if (r0 <= r3) goto L_0x0040
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x00ed
            r3 = r10
            goto L_0x00ee
        L_0x00ed:
            r3 = r7
        L_0x00ee:
            if (r3 != 0) goto L_0x00f2
            goto L_0x0040
        L_0x00f2:
            int r3 = r2 + 2
            if (r0 <= r3) goto L_0x0061
            byte r3 = r16[r3]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            if (r3 != r8) goto L_0x00fd
            r7 = r10
        L_0x00fd:
            if (r7 != 0) goto L_0x00d0
            goto L_0x0061
        L_0x0101:
            byte r4 = r16[r2]
            int r5 = r2 + 1
            byte r5 = r16[r5]
            r14 = r5 & 192(0xc0, float:2.69E-43)
            if (r14 != r8) goto L_0x010d
            r14 = r10
            goto L_0x010e
        L_0x010d:
            r14 = r7
        L_0x010e:
            if (r14 != 0) goto L_0x0119
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0040
        L_0x0119:
            int r14 = r2 + 2
            byte r14 = r16[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r8) goto L_0x0123
            r15 = r10
            goto L_0x0124
        L_0x0123:
            r15 = r7
        L_0x0124:
            if (r15 != 0) goto L_0x012f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            goto L_0x0061
        L_0x012f:
            byte r3 = r16[r3]
            r6 = r3 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L_0x0136
            r7 = r10
        L_0x0136:
            if (r7 != 0) goto L_0x0140
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            goto L_0x00d0
        L_0x0140:
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r6
            int r6 = r14 << 6
            r3 = r3 ^ r6
            int r5 = r5 << 12
            r3 = r3 ^ r5
            int r4 = r4 << 18
            r3 = r3 ^ r4
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r4) goto L_0x015a
        L_0x0152:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
        L_0x0156:
            r1.invoke(r3)
            goto L_0x016a
        L_0x015a:
            if (r11 <= r3) goto L_0x015d
            goto L_0x0160
        L_0x015d:
            if (r12 < r3) goto L_0x0160
            goto L_0x0152
        L_0x0160:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r4) goto L_0x0165
            goto L_0x0152
        L_0x0165:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0156
        L_0x016a:
            r6 = 4
            goto L_0x0061
        L_0x016d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.invoke(r3)
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str) {
        return size$default(str, 0, 0, 3, (Object) null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i) {
        return size$default(str, i, 0, 2, (Object) null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i, int i2) {
        int i3;
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (z) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                i3 = 3;
                            } else {
                                int i4 = i + 1;
                                char charAt2 = i4 < i2 ? str.charAt(i4) : 0;
                                if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                    j++;
                                    i = i4;
                                } else {
                                    j += (long) 4;
                                    i += 2;
                                }
                            }
                            j += (long) i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }
}

package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000T\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\b¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0007H\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u000e*\u00020\u0007H\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\u000eH\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0007*\u00020\u000eH\b¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0007*\u00020\u000eH\b¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\b¢\u0006\u0004\b\u001b\u0010\u001d\u001a\u001e\u0010\u001f\u001a\u00020\u001a*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010#\u001a\u00020\"*\u00020\u00072\u0006\u0010!\u001a\u00020\u0002H\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0002*\u00020\u0007H\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010'\u001a\u00020\u0002*\u00020\u0007H\b¢\u0006\u0004\b'\u0010&\u001a\u0014\u0010(\u001a\u00020\u000e*\u00020\u0007H\b¢\u0006\u0004\b(\u0010\u0010\u001a$\u0010*\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0002H\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010,\u001a\u00020\u0000*\u00020\u0007H\b¢\u0006\u0004\b,\u0010-\u001a$\u0010.\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0002H\b¢\u0006\u0004\b.\u0010+\u001a$\u0010.\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0002H\b¢\u0006\u0004\b.\u0010/\u001a4\u00103\u001a\u00020\u001a*\u00020\u00072\u0006\u00100\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\b¢\u0006\u0004\b3\u00104\u001a4\u00103\u001a\u00020\u001a*\u00020\u00072\u0006\u00100\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\b¢\u0006\u0004\b3\u00105\u001a\u001c\u00107\u001a\u00020\u001a*\u00020\u00072\u0006\u00106\u001a\u00020\u0000H\b¢\u0006\u0004\b7\u0010\u001c\u001a\u001c\u00107\u001a\u00020\u001a*\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\b¢\u0006\u0004\b7\u0010\u001d\u001a$\u0010:\u001a\u00020\u0007*\u00020\u00072\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u0007*\u00020\u0007H\b¢\u0006\u0004\b<\u0010=\u001a\u0014\u0010>\u001a\u00020\u0007*\u00020\u0007H\b¢\u0006\u0004\b>\u0010=\u001a\u0014\u0010?\u001a\u00020\u0000*\u00020\u0007H\b¢\u0006\u0004\b?\u0010-\u001a$\u0010@\u001a\u00020\u0007*\u00020\u00002\u0006\u00100\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\b¢\u0006\u0004\b@\u0010A\u001a\u0014\u0010B\u001a\u00020\u000e*\u00020\u0007H\b¢\u0006\u0004\bB\u0010\u0010\u001a\u0014\u0010C\u001a\u00020\u000e*\u00020\u0007H\b¢\u0006\u0004\bC\u0010\u0010\u001a+\u0010G\u001a\u00020F*\u00020\u00072\u0006\u0010E\u001a\u00020D2\u0006\u00100\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\bG\u0010H\"\u001c\u0010J\u001a\u00020I8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, mo47991d2 = {"", "s", "", "codePointCount", "codePointIndexToCharIndex", "([BI)I", "data", "Lokio/ByteString;", "commonOf", "([B)Lokio/ByteString;", "", "c", "decodeHexDigit", "(C)I", "", "commonBase64", "(Lokio/ByteString;)Ljava/lang/String;", "commonBase64Url", "other", "commonCompareTo", "(Lokio/ByteString;Lokio/ByteString;)I", "commonDecodeBase64", "(Ljava/lang/String;)Lokio/ByteString;", "commonDecodeHex", "commonEncodeUtf8", "suffix", "", "commonEndsWith", "(Lokio/ByteString;[B)Z", "(Lokio/ByteString;Lokio/ByteString;)Z", "", "commonEquals", "(Lokio/ByteString;Ljava/lang/Object;)Z", "pos", "", "commonGetByte", "(Lokio/ByteString;I)B", "commonGetSize", "(Lokio/ByteString;)I", "commonHashCode", "commonHex", "fromIndex", "commonIndexOf", "(Lokio/ByteString;[BI)I", "commonInternalArray", "(Lokio/ByteString;)[B", "commonLastIndexOf", "(Lokio/ByteString;Lokio/ByteString;I)I", "offset", "otherOffset", "byteCount", "commonRangeEquals", "(Lokio/ByteString;I[BII)Z", "(Lokio/ByteString;ILokio/ByteString;II)Z", "prefix", "commonStartsWith", "beginIndex", "endIndex", "commonSubstring", "(Lokio/ByteString;II)Lokio/ByteString;", "commonToAsciiLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "([BII)Lokio/ByteString;", "commonToString", "commonUtf8", "Lokio/Buffer;", "buffer", "", "commonWrite", "(Lokio/ByteString;Lokio/Buffer;II)V", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: ByteString.kt */
public final class ByteStringKt {
    @NotNull
    public static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006b, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01e8
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0075
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0039
            if (r7 == r11) goto L_0x0039
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            if (r9 < r7) goto L_0x0036
        L_0x0033:
            r6 = r17
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            if (r6 != 0) goto L_0x003b
        L_0x0039:
            if (r7 != r12) goto L_0x003c
        L_0x003b:
            return r16
        L_0x003c:
            if (r7 >= r14) goto L_0x0041
            r6 = r17
            goto L_0x0042
        L_0x0041:
            r6 = 2
        L_0x0042:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0045:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0056
            return r5
        L_0x0056:
            if (r4 == r13) goto L_0x0069
            if (r4 == r11) goto L_0x0069
            if (r4 < 0) goto L_0x005e
            if (r10 >= r4) goto L_0x0063
        L_0x005e:
            if (r8 <= r4) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            if (r9 < r4) goto L_0x0066
        L_0x0063:
            r6 = r17
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            if (r6 != 0) goto L_0x006b
        L_0x0069:
            if (r4 != r12) goto L_0x006c
        L_0x006b:
            return r16
        L_0x006c:
            if (r4 >= r14) goto L_0x0071
            r4 = r17
            goto L_0x0072
        L_0x0071:
            r4 = 2
        L_0x0072:
            int r5 = r5 + r4
            r4 = r7
            goto L_0x0045
        L_0x0075:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00ca
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0084
            if (r6 != r1) goto L_0x0083
            return r5
        L_0x0083:
            return r16
        L_0x0084:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x008f
            r15 = r17
            goto L_0x0090
        L_0x008f:
            r15 = 0
        L_0x0090:
            if (r15 != 0) goto L_0x0096
            if (r6 != r1) goto L_0x0095
            return r5
        L_0x0095:
            return r16
        L_0x0096:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x00a1
            if (r6 != r1) goto L_0x00a0
            return r5
        L_0x00a0:
            return r16
        L_0x00a1:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a6
            return r5
        L_0x00a6:
            if (r3 == r13) goto L_0x00b9
            if (r3 == r11) goto L_0x00b9
            if (r3 < 0) goto L_0x00ae
            if (r10 >= r3) goto L_0x00b3
        L_0x00ae:
            if (r8 <= r3) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            if (r9 < r3) goto L_0x00b6
        L_0x00b3:
            r6 = r17
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            if (r6 != 0) goto L_0x00bb
        L_0x00b9:
            if (r3 != r12) goto L_0x00bc
        L_0x00bb:
            return r16
        L_0x00bc:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00c3
            r15 = r17
            goto L_0x00c4
        L_0x00c3:
            r15 = 2
        L_0x00c4:
            int r5 = r5 + r15
            int r4 = r4 + 2
        L_0x00c7:
            r6 = r7
            goto L_0x0008
        L_0x00ca:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L_0x014a
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00dc
            if (r6 != r1) goto L_0x00db
            return r5
        L_0x00db:
            return r16
        L_0x00dc:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00e9
            r8 = r17
            goto L_0x00ea
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            if (r8 != 0) goto L_0x00f0
            if (r6 != r1) goto L_0x00ef
            return r5
        L_0x00ef:
            return r16
        L_0x00f0:
            byte r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00f9
            r8 = r17
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            if (r8 != 0) goto L_0x0100
            if (r6 != r1) goto L_0x00ff
            return r5
        L_0x00ff:
            return r16
        L_0x0100:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x0112
            if (r6 != r1) goto L_0x0111
            return r5
        L_0x0111:
            return r16
        L_0x0112:
            if (r12 <= r3) goto L_0x0115
            goto L_0x011b
        L_0x0115:
            if (r9 < r3) goto L_0x011b
            if (r6 != r1) goto L_0x011a
            return r5
        L_0x011a:
            return r16
        L_0x011b:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x0120
            return r5
        L_0x0120:
            if (r3 == r13) goto L_0x0137
            if (r3 == r11) goto L_0x0137
            if (r3 < 0) goto L_0x0128
            if (r10 >= r3) goto L_0x0131
        L_0x0128:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x0134
        L_0x0131:
            r6 = r17
            goto L_0x0135
        L_0x0134:
            r6 = 0
        L_0x0135:
            if (r6 != 0) goto L_0x013c
        L_0x0137:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x013d
        L_0x013c:
            return r16
        L_0x013d:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0144
            r15 = r17
            goto L_0x0145
        L_0x0144:
            r15 = 2
        L_0x0145:
            int r5 = r5 + r15
            int r4 = r4 + 3
            goto L_0x00c7
        L_0x014a:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01e4
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0156
            if (r6 != r1) goto L_0x0155
            return r5
        L_0x0155:
            return r16
        L_0x0156:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0163
            r15 = r17
            goto L_0x0164
        L_0x0163:
            r15 = 0
        L_0x0164:
            if (r15 != 0) goto L_0x016a
            if (r6 != r1) goto L_0x0169
            return r5
        L_0x0169:
            return r16
        L_0x016a:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0175
            r10 = r17
            goto L_0x0176
        L_0x0175:
            r10 = 0
        L_0x0176:
            if (r10 != 0) goto L_0x017c
            if (r6 != r1) goto L_0x017b
            return r5
        L_0x017b:
            return r16
        L_0x017c:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0185
            r10 = r17
            goto L_0x0186
        L_0x0185:
            r10 = 0
        L_0x0186:
            if (r10 != 0) goto L_0x018c
            if (r6 != r1) goto L_0x018b
            return r5
        L_0x018b:
            return r16
        L_0x018c:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x01a2
            if (r6 != r1) goto L_0x01a1
            return r5
        L_0x01a1:
            return r16
        L_0x01a2:
            if (r12 <= r3) goto L_0x01a5
            goto L_0x01ab
        L_0x01a5:
            if (r9 < r3) goto L_0x01ab
            if (r6 != r1) goto L_0x01aa
            return r5
        L_0x01aa:
            return r16
        L_0x01ab:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01b3
            if (r6 != r1) goto L_0x01b2
            return r5
        L_0x01b2:
            return r16
        L_0x01b3:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01b8
            return r5
        L_0x01b8:
            if (r3 == r13) goto L_0x01d1
            if (r3 == r11) goto L_0x01d1
            if (r3 < 0) goto L_0x01c2
            r6 = 31
            if (r6 >= r3) goto L_0x01cb
        L_0x01c2:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01c7
            goto L_0x01ce
        L_0x01c7:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01ce
        L_0x01cb:
            r6 = r17
            goto L_0x01cf
        L_0x01ce:
            r6 = 0
        L_0x01cf:
            if (r6 != 0) goto L_0x01d6
        L_0x01d1:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01d7
        L_0x01d6:
            return r16
        L_0x01d7:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01de
            r15 = r17
            goto L_0x01df
        L_0x01de:
            r15 = 2
        L_0x01df:
            int r5 = r5 + r15
            int r4 = r4 + 4
            goto L_0x00c7
        L_0x01e4:
            if (r6 != r1) goto L_0x01e7
            return r5
        L_0x01e7:
            return r16
        L_0x01e8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString byteString) {
        return Base64.encodeBase64$default(byteString.getData$okio(), (byte[]) null, 1, (Object) null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString byteString) {
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            byte b = byteString.getByte(i) & 255;
            byte b2 = byteString2.getByte(i) & 255;
            if (b == b2) {
                i++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String str) {
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String str) {
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(@NotNull ByteString byteString, @Nullable Object obj) {
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString byteString, int i) {
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(@NotNull ByteString byteString) {
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString byteString) {
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString byteString) {
        char[] cArr = new char[(byteString.getData$okio().length * 2)];
        int i = 0;
        for (byte b : byteString.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i) {
        int length = byteString.getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(byteString.getData$okio(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString byteString) {
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString, @NotNull ByteString byteString2, int i) {
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i, @NotNull ByteString byteString2, int i2, int i3) {
        return byteString2.rangeEquals(i2, byteString.getData$okio(), i, i3);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString byteString, int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= byteString.getData$okio().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == byteString.getData$okio().length) {
                    return byteString;
                } else {
                    return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString.getData$okio(), i, i2));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString byteString) {
        byte b;
        int i = 0;
        while (i < byteString.getData$okio().length) {
            byte b2 = byteString.getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString byteString) {
        byte b;
        int i = 0;
        while (i < byteString.getData$okio().length) {
            byte b2 = byteString.getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString byteString) {
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] bArr, int i, int i2) {
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 + i));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString) {
        ByteString byteString2;
        boolean z = true;
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (access$codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            if (utf8 != null) {
                String substring = utf8.substring(0, access$codePointIndexToCharIndex);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (access$codePointIndexToCharIndex < utf8.length()) {
                    return "[size=" + byteString.getData$okio().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + ']';
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(byteString.getData$okio().length);
            sb.append(" hex=");
            if (64 > byteString.getData$okio().length) {
                z = false;
            }
            if (z) {
                if (64 == byteString.getData$okio().length) {
                    byteString2 = byteString;
                } else {
                    byteString2 = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString.getData$okio(), 0, 64));
                }
                sb.append(byteString2.hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString byteString) {
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull ByteString byteString, @NotNull Buffer buffer, int i, int i2) {
        buffer.write(byteString.getData$okio(), i, i2);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i) {
        for (int min = Math.min(i, byteString.getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(byteString.getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i, @NotNull byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= byteString.getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(byteString.getData$okio(), i, bArr, i2, i3);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }
}

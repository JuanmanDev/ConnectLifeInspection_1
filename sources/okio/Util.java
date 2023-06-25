package okio;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmName;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000>\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\nH\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\b¢\u0006\u0004\b\u0010\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0015\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\f¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001c\u0010\u0015\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\f¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0013\u0010\u0018\u001a\u00020\u0002*\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u0018\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u001a\u001a\u0013\u0010\u0018\u001a\u00020\u001b*\u00020\u001bH\u0000¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\f¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u001c\u0010\u001e\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\f¢\u0006\u0004\b\u001e\u0010\u0016\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0013H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0000¢\u0006\u0004\b \u0010\"\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\nH\u0000¢\u0006\u0004\b \u0010#¨\u0006$"}, mo47991d2 = {"", "a", "", "aOffset", "b", "bOffset", "byteCount", "", "arrayRangeEquals", "([BI[BII)Z", "", "size", "offset", "", "checkOffsetAndCount", "(JJJ)V", "minOf", "(IJ)J", "(JI)J", "", "other", "and", "(BI)I", "(BJ)J", "reverseBytes", "(I)I", "(J)J", "", "(S)S", "shl", "shr", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@JvmName(name = "-Util")
/* renamed from: okio.-Util  reason: invalid class name */
/* compiled from: -Util.kt */
public final class Util {
    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final long and(byte b, long j) {
        return ((long) b) & j;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final long minOf(long j, int i) {
        return Math.min(j, (long) i);
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short reverseBytes(short s) {
        short s2 = s & UShort.MAX_VALUE;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    public static final int shl(byte b, int i) {
        return b << i;
    }

    public static final int shr(byte b, int i) {
        return b >> i;
    }

    @NotNull
    public static final String toHexString(byte b) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b & 15]});
    }

    public static final long minOf(int i, long j) {
        return Math.min((long) i, j);
    }

    @NotNull
    public static final String toHexString(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }

    @NotNull
    public static final String toHexString(long j) {
        if (j == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return new String(cArr, i, 16 - i);
    }
}

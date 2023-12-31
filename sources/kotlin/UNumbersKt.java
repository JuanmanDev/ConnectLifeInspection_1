package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(mo47990d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\bH\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\bH\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\r\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\bH\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u001a\u001f\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001b\u001a\u001f\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b$\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u001f\u001a\u001f\u0010\"\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b&\u0010!\u001a\u0017\u0010'\u001a\u00020\u0002*\u00020\u0002H\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010'\u001a\u00020\u0005*\u00020\u0005H\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0007\u001a\u0017\u0010'\u001a\u00020\b*\u00020\bH\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010'\u001a\u00020\u000b*\u00020\u000bH\bø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u0002*\u00020\u0002H\bø\u0001\u0000¢\u0006\u0004\b0\u0010)\u001a\u0017\u0010/\u001a\u00020\u0005*\u00020\u0005H\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0007\u001a\u0017\u0010/\u001a\u00020\b*\u00020\bH\bø\u0001\u0000¢\u0006\u0004\b2\u0010,\u001a\u0017\u0010/\u001a\u00020\u000b*\u00020\u000bH\bø\u0001\u0000¢\u0006\u0004\b3\u0010.\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo47991d2 = {"countLeadingZeroBits", "", "Lkotlin/UByte;", "countLeadingZeroBits-7apg3OU", "(B)I", "Lkotlin/UInt;", "countLeadingZeroBits-WZ4Q5Ns", "(I)I", "Lkotlin/ULong;", "countLeadingZeroBits-VKZWuLQ", "(J)I", "Lkotlin/UShort;", "countLeadingZeroBits-xj2QHRw", "(S)I", "countOneBits", "countOneBits-7apg3OU", "countOneBits-WZ4Q5Ns", "countOneBits-VKZWuLQ", "countOneBits-xj2QHRw", "countTrailingZeroBits", "countTrailingZeroBits-7apg3OU", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits-VKZWuLQ", "countTrailingZeroBits-xj2QHRw", "rotateLeft", "bitCount", "rotateLeft-LxnNnR4", "(BI)B", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft-JSWoG40", "(JI)J", "rotateLeft-olVBNx4", "(SI)S", "rotateRight", "rotateRight-LxnNnR4", "rotateRight-V7xB4Y4", "rotateRight-JSWoG40", "rotateRight-olVBNx4", "takeHighestOneBit", "takeHighestOneBit-7apg3OU", "(B)B", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit", "takeLowestOneBit-7apg3OU", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit-VKZWuLQ", "takeLowestOneBit-xj2QHRw", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@JvmName(name = "UNumbersKt")
/* compiled from: UNumbers.kt */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countLeadingZeroBits-7apg3OU  reason: not valid java name */
    public static final int m27542countLeadingZeroBits7apg3OU(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countLeadingZeroBits-VKZWuLQ  reason: not valid java name */
    public static final int m27543countLeadingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns  reason: not valid java name */
    public static final int m27544countLeadingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countLeadingZeroBits-xj2QHRw  reason: not valid java name */
    public static final int m27545countLeadingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countOneBits-7apg3OU  reason: not valid java name */
    public static final int m27546countOneBits7apg3OU(byte b) {
        return Integer.bitCount(UInt.m27393constructorimpl(b & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countOneBits-VKZWuLQ  reason: not valid java name */
    public static final int m27547countOneBitsVKZWuLQ(long j) {
        return Long.bitCount(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countOneBits-WZ4Q5Ns  reason: not valid java name */
    public static final int m27548countOneBitsWZ4Q5Ns(int i) {
        return Integer.bitCount(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countOneBits-xj2QHRw  reason: not valid java name */
    public static final int m27549countOneBitsxj2QHRw(short s) {
        return Integer.bitCount(UInt.m27393constructorimpl(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countTrailingZeroBits-7apg3OU  reason: not valid java name */
    public static final int m27550countTrailingZeroBits7apg3OU(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countTrailingZeroBits-VKZWuLQ  reason: not valid java name */
    public static final int m27551countTrailingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns  reason: not valid java name */
    public static final int m27552countTrailingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: countTrailingZeroBits-xj2QHRw  reason: not valid java name */
    public static final int m27553countTrailingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateLeft-JSWoG40  reason: not valid java name */
    public static final long m27554rotateLeftJSWoG40(long j, int i) {
        return ULong.m27471constructorimpl(Long.rotateLeft(j, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateLeft-LxnNnR4  reason: not valid java name */
    public static final byte m27555rotateLeftLxnNnR4(byte b, int i) {
        return UByte.m27317constructorimpl(NumbersKt__NumbersKt.rotateLeft(b, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateLeft-V7xB4Y4  reason: not valid java name */
    public static final int m27556rotateLeftV7xB4Y4(int i, int i2) {
        return UInt.m27393constructorimpl(Integer.rotateLeft(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateLeft-olVBNx4  reason: not valid java name */
    public static final short m27557rotateLeftolVBNx4(short s, int i) {
        return UShort.m27577constructorimpl(NumbersKt__NumbersKt.rotateLeft(s, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateRight-JSWoG40  reason: not valid java name */
    public static final long m27558rotateRightJSWoG40(long j, int i) {
        return ULong.m27471constructorimpl(Long.rotateRight(j, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateRight-LxnNnR4  reason: not valid java name */
    public static final byte m27559rotateRightLxnNnR4(byte b, int i) {
        return UByte.m27317constructorimpl(NumbersKt__NumbersKt.rotateRight(b, i));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateRight-V7xB4Y4  reason: not valid java name */
    public static final int m27560rotateRightV7xB4Y4(int i, int i2) {
        return UInt.m27393constructorimpl(Integer.rotateRight(i, i2));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    /* renamed from: rotateRight-olVBNx4  reason: not valid java name */
    public static final short m27561rotateRightolVBNx4(short s, int i) {
        return UShort.m27577constructorimpl(NumbersKt__NumbersKt.rotateRight(s, i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeHighestOneBit-7apg3OU  reason: not valid java name */
    public static final byte m27562takeHighestOneBit7apg3OU(byte b) {
        return UByte.m27317constructorimpl((byte) Integer.highestOneBit(b & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeHighestOneBit-VKZWuLQ  reason: not valid java name */
    public static final long m27563takeHighestOneBitVKZWuLQ(long j) {
        return ULong.m27471constructorimpl(Long.highestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeHighestOneBit-WZ4Q5Ns  reason: not valid java name */
    public static final int m27564takeHighestOneBitWZ4Q5Ns(int i) {
        return UInt.m27393constructorimpl(Integer.highestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeHighestOneBit-xj2QHRw  reason: not valid java name */
    public static final short m27565takeHighestOneBitxj2QHRw(short s) {
        return UShort.m27577constructorimpl((short) Integer.highestOneBit(s & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeLowestOneBit-7apg3OU  reason: not valid java name */
    public static final byte m27566takeLowestOneBit7apg3OU(byte b) {
        return UByte.m27317constructorimpl((byte) Integer.lowestOneBit(b & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeLowestOneBit-VKZWuLQ  reason: not valid java name */
    public static final long m27567takeLowestOneBitVKZWuLQ(long j) {
        return ULong.m27471constructorimpl(Long.lowestOneBit(j));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeLowestOneBit-WZ4Q5Ns  reason: not valid java name */
    public static final int m27568takeLowestOneBitWZ4Q5Ns(int i) {
        return UInt.m27393constructorimpl(Integer.lowestOneBit(i));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    /* renamed from: takeLowestOneBit-xj2QHRw  reason: not valid java name */
    public static final short m27569takeLowestOneBitxj2QHRw(short s) {
        return UShort.m27577constructorimpl((short) Integer.lowestOneBit(s & UShort.MAX_VALUE));
    }
}

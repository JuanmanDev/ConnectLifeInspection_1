package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo47991d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: UArraySorting.kt */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4  reason: not valid java name */
    public static final int m27746partitionnroSd4(long[] jArr, int i, int i2) {
        long j = ULongArray.m27530getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.ulongCompare(ULongArray.m27530getsVKNKU(jArr, i), j) < 0) {
                i++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m27530getsVKNKU(jArr, i2), j) > 0) {
                i2--;
            }
            if (i <= i2) {
                long j2 = ULongArray.m27530getsVKNKU(jArr, i);
                ULongArray.m27535setk8EXiF4(jArr, i, ULongArray.m27530getsVKNKU(jArr, i2));
                ULongArray.m27535setk8EXiF4(jArr, i2, j2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    public static final int m27747partition4UcCI2c(byte[] bArr, int i, int i2) {
        byte b;
        byte b2 = UByteArray.m27374getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                b = b2 & 255;
                if (Intrinsics.compare((int) UByteArray.m27374getw2LRezQ(bArr, i) & 255, (int) b) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare((int) UByteArray.m27374getw2LRezQ(bArr, i2) & 255, (int) b) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte b3 = UByteArray.m27374getw2LRezQ(bArr, i);
                UByteArray.m27379setVurrAj0(bArr, i, UByteArray.m27374getw2LRezQ(bArr, i2));
                UByteArray.m27379setVurrAj0(bArr, i2, b3);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    public static final int m27748partitionAa5vz7o(short[] sArr, int i, int i2) {
        short s;
        short s2 = UShortArray.m27634getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                short s3 = UShortArray.m27634getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                s = s2 & UShort.MAX_VALUE;
                if (Intrinsics.compare((int) s3, (int) s) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare((int) UShortArray.m27634getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, (int) s) > 0) {
                i2--;
            }
            if (i <= i2) {
                short s4 = UShortArray.m27634getMh2AYeg(sArr, i);
                UShortArray.m27639set01HTLdE(sArr, i, UShortArray.m27634getMh2AYeg(sArr, i2));
                UShortArray.m27639set01HTLdE(sArr, i2, s4);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    public static final int m27749partitionoBK06Vg(int[] iArr, int i, int i2) {
        int i3 = UIntArray.m27452getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.uintCompare(UIntArray.m27452getpVg5ArA(iArr, i), i3) < 0) {
                i++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m27452getpVg5ArA(iArr, i2), i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                int i4 = UIntArray.m27452getpVg5ArA(iArr, i);
                UIntArray.m27457setVXSXFK8(iArr, i, UIntArray.m27452getpVg5ArA(iArr, i2));
                UIntArray.m27457setVXSXFK8(iArr, i2, i4);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    public static final void m27750quickSortnroSd4(long[] jArr, int i, int i2) {
        int r0 = m27746partitionnroSd4(jArr, i, i2);
        int i3 = r0 - 1;
        if (i < i3) {
            m27750quickSortnroSd4(jArr, i, i3);
        }
        if (r0 < i2) {
            m27750quickSortnroSd4(jArr, r0, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    public static final void m27751quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int r0 = m27747partition4UcCI2c(bArr, i, i2);
        int i3 = r0 - 1;
        if (i < i3) {
            m27751quickSort4UcCI2c(bArr, i, i3);
        }
        if (r0 < i2) {
            m27751quickSort4UcCI2c(bArr, r0, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    public static final void m27752quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int r0 = m27748partitionAa5vz7o(sArr, i, i2);
        int i3 = r0 - 1;
        if (i < i3) {
            m27752quickSortAa5vz7o(sArr, i, i3);
        }
        if (r0 < i2) {
            m27752quickSortAa5vz7o(sArr, r0, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    public static final void m27753quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int r0 = m27749partitionoBK06Vg(iArr, i, i2);
        int i3 = r0 - 1;
        if (i < i3) {
            m27753quickSortoBK06Vg(iArr, i, i3);
        }
        if (r0 < i2) {
            m27753quickSortoBK06Vg(iArr, r0, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m27754sortArraynroSd4(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "array");
        m27750quickSortnroSd4(jArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m27755sortArray4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "array");
        m27751quickSort4UcCI2c(bArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m27756sortArrayAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "array");
        m27752quickSortAa5vz7o(sArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m27757sortArrayoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "array");
        m27753quickSortoBK06Vg(iArr, i, i2 - 1);
    }
}

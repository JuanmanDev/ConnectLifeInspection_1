package com.google.common.primitives;

import java.io.Serializable;
import java.math.BigInteger;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6252d;
import p040c.p200q.p353b.p358e.C6258i;

public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final long UNSIGNED_MASK = Long.MAX_VALUE;
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    public final long value;

    public UnsignedLong(long j) {
        this.value = j;
    }

    public static UnsignedLong fromLongBits(long j) {
        return new UnsignedLong(j);
    }

    public static UnsignedLong valueOf(long j) {
        C5850m.m16587h(j >= 0, "value (%s) is outside the range for an unsigned long value", j);
        return fromLongBits(j);
    }

    public BigInteger bigIntegerValue() {
        BigInteger valueOf = BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? valueOf.setBit(63) : valueOf;
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        long j = this.value;
        C5850m.m16594o(unsignedLong);
        return fromLongBits(C6258i.m17605b(j, unsignedLong.value));
    }

    public double doubleValue() {
        long j = this.value;
        double d = (double) (Long.MAX_VALUE & j);
        return j < 0 ? d + 9.223372036854776E18d : d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnsignedLong) || this.value != ((UnsignedLong) obj).value) {
            return false;
        }
        return true;
    }

    public float floatValue() {
        long j = this.value;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public int hashCode() {
        return C6252d.m17583e(this.value);
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        long j = this.value;
        C5850m.m16594o(unsignedLong);
        return fromLongBits(j - unsignedLong.value);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        long j = this.value;
        C5850m.m16594o(unsignedLong);
        return fromLongBits(C6258i.m17608e(j, unsignedLong.value));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        long j = this.value;
        C5850m.m16594o(unsignedLong);
        return fromLongBits(j + unsignedLong.value);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        long j = this.value;
        C5850m.m16594o(unsignedLong);
        return fromLongBits(j * unsignedLong.value);
    }

    public String toString() {
        return C6258i.m17609f(this.value);
    }

    public int compareTo(UnsignedLong unsignedLong) {
        C5850m.m16594o(unsignedLong);
        return C6258i.m17604a(this.value, unsignedLong.value);
    }

    public String toString(int i) {
        return C6258i.m17610g(this.value, i);
    }

    public static UnsignedLong valueOf(BigInteger bigInteger) {
        C5850m.m16594o(bigInteger);
        C5850m.m16589j(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedLong valueOf(String str, int i) {
        return fromLongBits(C6258i.m17607d(str, i));
    }
}

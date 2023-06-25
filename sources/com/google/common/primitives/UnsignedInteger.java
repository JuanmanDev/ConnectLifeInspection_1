package com.google.common.primitives;

import java.math.BigInteger;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6257h;

public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger ZERO = fromIntBits(0);
    public final int value;

    public UnsignedInteger(int i) {
        this.value = i & -1;
    }

    public static UnsignedInteger fromIntBits(int i) {
        return new UnsignedInteger(i);
    }

    public static UnsignedInteger valueOf(long j) {
        C5850m.m16587h((4294967295L & j) == j, "value (%s) is outside the range for an unsigned integer value", j);
        return fromIntBits((int) j);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        int i = this.value;
        C5850m.m16594o(unsignedInteger);
        return fromIntBits(C6257h.m17598b(i, unsignedInteger.value));
    }

    public double doubleValue() {
        return (double) longValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnsignedInteger) || this.value != ((UnsignedInteger) obj).value) {
            return false;
        }
        return true;
    }

    public float floatValue() {
        return (float) longValue();
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return C6257h.m17602f(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        int i = this.value;
        C5850m.m16594o(unsignedInteger);
        return fromIntBits(i - unsignedInteger.value);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        int i = this.value;
        C5850m.m16594o(unsignedInteger);
        return fromIntBits(C6257h.m17601e(i, unsignedInteger.value));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        int i = this.value;
        C5850m.m16594o(unsignedInteger);
        return fromIntBits(i + unsignedInteger.value);
    }

    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
        int i = this.value;
        C5850m.m16594o(unsignedInteger);
        return fromIntBits(i * unsignedInteger.value);
    }

    public String toString() {
        return toString(10);
    }

    public int compareTo(UnsignedInteger unsignedInteger) {
        C5850m.m16594o(unsignedInteger);
        return C6257h.m17597a(this.value, unsignedInteger.value);
    }

    public String toString(int i) {
        return C6257h.m17603g(this.value, i);
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
        C5850m.m16594o(bigInteger);
        C5850m.m16589j(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public static UnsignedInteger valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedInteger valueOf(String str, int i) {
        return fromIntBits(C6257h.m17600d(str, i));
    }
}

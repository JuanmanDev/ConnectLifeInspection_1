package com.google.common.hash;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p356c.C6212d;
import p040c.p200q.p353b.p357d.C6233a;
import p040c.p200q.p353b.p358e.C6255f;
import p040c.p200q.p353b.p358e.C6256g;

public final class BloomFilter<T> implements C5851n<T>, Serializable {
    public final C6212d.C6215c bits;
    public final Funnel<? super T> funnel;
    public final int numHashFunctions;
    public final C8205c strategy;

    /* renamed from: com.google.common.hash.BloomFilter$b */
    public static class C8204b<T> implements Serializable {
        public static final long serialVersionUID = 1;

        /* renamed from: e */
        public final long[] f15278e;

        /* renamed from: l */
        public final int f15279l;

        /* renamed from: m */
        public final Funnel<? super T> f15280m;

        /* renamed from: n */
        public final C8205c f15281n;

        public C8204b(BloomFilter<T> bloomFilter) {
            this.f15278e = C6212d.C6215c.m17481g(bloomFilter.bits.f11828a);
            this.f15279l = bloomFilter.numHashFunctions;
            this.f15280m = bloomFilter.funnel;
            this.f15281n = bloomFilter.strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new C6212d.C6215c(this.f15278e), this.f15279l, this.f15280m, this.f15281n);
        }
    }

    /* renamed from: com.google.common.hash.BloomFilter$c */
    public interface C8205c extends Serializable {
        /* renamed from: k */
        <T> boolean mo30181k(T t, Funnel<? super T> funnel, int i, C6212d.C6215c cVar);

        int ordinal();

        /* renamed from: v */
        <T> boolean mo30182v(T t, Funnel<? super T> funnel, int i, C6212d.C6215c cVar);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i, double d) {
        return create(funnel2, (long) i, d);
    }

    public static long optimalNumOfBits(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) ((((double) (-j)) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    public static int optimalNumOfHashFunctions(long j, long j2) {
        return Math.max(1, (int) Math.round((((double) j2) / ((double) j)) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel2) {
        int i;
        int i2;
        C5850m.m16595p(inputStream, "InputStream");
        C5850m.m16595p(funnel2, "Funnel");
        byte b = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte readByte = dataInputStream.readByte();
            try {
                i2 = C6256g.m17596b(dataInputStream.readByte());
                try {
                    int readInt = dataInputStream.readInt();
                    C6212d dVar = C6212d.values()[readByte];
                    long[] jArr = new long[readInt];
                    for (int i3 = 0; i3 < readInt; i3++) {
                        jArr[i3] = dataInputStream.readLong();
                    }
                    return new BloomFilter<>(new C6212d.C6215c(jArr), i2, funnel2, dVar);
                } catch (RuntimeException e) {
                    e = e;
                    b = readByte;
                    i = -1;
                    throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + b + " numHashFunctions: " + i2 + " dataLength: " + i, e);
                }
            } catch (RuntimeException e2) {
                e = e2;
                i2 = -1;
                b = readByte;
                i = -1;
                throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + b + " numHashFunctions: " + i2 + " dataLength: " + i, e);
            }
        } catch (RuntimeException e3) {
            e = e3;
            i = -1;
            i2 = -1;
            throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + b + " numHashFunctions: " + i2 + " dataLength: " + i, e);
        }
    }

    private Object writeReplace() {
        return new C8204b(this);
    }

    @Deprecated
    public boolean apply(T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double b = (double) this.bits.mo30186b();
        return C6233a.m17532c(((-Math.log1p(-(((double) this.bits.mo30185a()) / b))) * b) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    public long bitSize() {
        return this.bits.mo30186b();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.mo30187c(), this.numHashFunctions, this.funnel, this.strategy);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        if (this.numHashFunctions != bloomFilter.numHashFunctions || !this.funnel.equals(bloomFilter.funnel) || !this.bits.equals(bloomFilter.bits) || !this.strategy.equals(bloomFilter.strategy)) {
            return false;
        }
        return true;
    }

    public double expectedFpp() {
        return Math.pow(((double) this.bits.mo30185a()) / ((double) bitSize()), (double) this.numHashFunctions);
    }

    public int hashCode() {
        return C5845j.m16577b(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        C5850m.m16594o(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(T t) {
        return this.strategy.mo30181k(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public boolean put(T t) {
        return this.strategy.mo30182v(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        C5850m.m16594o(bloomFilter);
        C5850m.m16584e(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        C5850m.m16586g(this.numHashFunctions == bloomFilter.numHashFunctions, "BloomFilters must have the same number of hash functions (%s != %s)", this.numHashFunctions, bloomFilter.numHashFunctions);
        C5850m.m16588i(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        C5850m.m16590k(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        C5850m.m16590k(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.mo30189e(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(C6255f.m17594a((long) this.strategy.ordinal()));
        dataOutputStream.writeByte(C6256g.m17595a((long) this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f11828a.length());
        for (int i = 0; i < this.bits.f11828a.length(); i++) {
            dataOutputStream.writeLong(this.bits.f11828a.get(i));
        }
    }

    public BloomFilter(C6212d.C6215c cVar, int i, Funnel<? super T> funnel2, C8205c cVar2) {
        boolean z = true;
        C5850m.m16585f(i > 0, "numHashFunctions (%s) must be > 0", i);
        C5850m.m16585f(i > 255 ? false : z, "numHashFunctions (%s) must be <= 255", i);
        C5850m.m16594o(cVar);
        this.bits = cVar;
        this.numHashFunctions = i;
        C5850m.m16594o(funnel2);
        this.funnel = funnel2;
        C5850m.m16594o(cVar2);
        this.strategy = cVar2;
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d) {
        return create(funnel2, j, d, C6212d.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d, C8205c cVar) {
        C5850m.m16594o(funnel2);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        C5850m.m16587h(i >= 0, "Expected insertions (%s) must be >= 0", j);
        C5850m.m16589j(d > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        if (d >= 1.0d) {
            z = false;
        }
        C5850m.m16589j(z, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        C5850m.m16594o(cVar);
        if (i == 0) {
            j = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new BloomFilter<>(new C6212d.C6215c(optimalNumOfBits), optimalNumOfHashFunctions(j, optimalNumOfBits), funnel2, cVar);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + optimalNumOfBits + " bits", e);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i) {
        return create(funnel2, (long) i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j) {
        return create(funnel2, j, 0.03d);
    }
}

package com.google.common.math;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p357d.C6235b;
import p040c.p200q.p353b.p357d.C6246g;
import p040c.p200q.p353b.p358e.C6248b;

public final class Stats implements Serializable {
    public static final int BYTES = 40;
    public static final long serialVersionUID = 0;
    public final long count;
    public final double max;
    public final double mean;
    public final double min;
    public final double sumOfSquaresOfDeltas;

    public Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static Stats fromByteArray(byte[] bArr) {
        C5850m.m16594o(bArr);
        C5850m.m16586g(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    /* renamed from: of */
    public static Stats m22484of(Iterable<? extends Number> iterable) {
        C6246g gVar = new C6246g();
        gVar.mo30230b(iterable);
        return gVar.mo30235h();
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        C5850m.m16594o(byteBuffer);
        C5850m.m16586g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        if (this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C5845j.m16577b(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        C5850m.m16600u(this.count != 0);
        return this.max;
    }

    public double mean() {
        C5850m.m16600u(this.count != 0);
        return this.mean;
    }

    public double min() {
        C5850m.m16600u(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        C5850m.m16600u(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return C6235b.m17533a(this.sumOfSquaresOfDeltas) / ((double) count());
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        C5850m.m16600u(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return C6235b.m17533a(this.sumOfSquaresOfDeltas) / ((double) (this.count - 1));
    }

    public double sum() {
        return this.mean * ((double) this.count);
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    public String toString() {
        if (count() > 0) {
            C5841i.C5843b b = C5841i.m16567b(this);
            b.mo28955c("count", this.count);
            b.mo28953a("mean", this.mean);
            b.mo28953a("populationStandardDeviation", populationStandardDeviation());
            b.mo28953a("min", this.min);
            b.mo28953a("max", this.max);
            return b.toString();
        }
        C5841i.C5843b b2 = C5841i.m16567b(this);
        b2.mo28955c("count", this.count);
        return b2.toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        C5850m.m16594o(byteBuffer);
        C5850m.m16586g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static double meanOf(Iterator<? extends Number> it) {
        C5850m.m16583d(it.hasNext());
        double doubleValue = ((Number) it.next()).doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = ((Number) it.next()).doubleValue();
            j++;
            if (!C6248b.m17561f(doubleValue2) || !C6248b.m17561f(doubleValue)) {
                doubleValue = C6246g.m17547g(doubleValue, doubleValue2);
            } else {
                doubleValue += (doubleValue2 - doubleValue) / ((double) j);
            }
        }
        return doubleValue;
    }

    /* renamed from: of */
    public static Stats m22485of(Iterator<? extends Number> it) {
        C6246g gVar = new C6246g();
        gVar.mo30231c(it);
        return gVar.mo30235h();
    }

    /* renamed from: of */
    public static Stats m22486of(double... dArr) {
        C6246g gVar = new C6246g();
        gVar.mo30232d(dArr);
        return gVar.mo30235h();
    }

    public static double meanOf(double... dArr) {
        C5850m.m16583d(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (!C6248b.m17561f(d2) || !C6248b.m17561f(d)) {
                d = C6246g.m17547g(d, d2);
            } else {
                d += (d2 - d) / ((double) (i + 1));
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m22487of(int... iArr) {
        C6246g gVar = new C6246g();
        gVar.mo30233e(iArr);
        return gVar.mo30235h();
    }

    /* renamed from: of */
    public static Stats m22488of(long... jArr) {
        C6246g gVar = new C6246g();
        gVar.mo30234f(jArr);
        return gVar.mo30235h();
    }

    public static double meanOf(int... iArr) {
        C5850m.m16583d(iArr.length > 0);
        double d = (double) iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = (double) iArr[i];
            if (!C6248b.m17561f(d2) || !C6248b.m17561f(d)) {
                d = C6246g.m17547g(d, d2);
            } else {
                d += (d2 - d) / ((double) (i + 1));
            }
        }
        return d;
    }

    public static double meanOf(long... jArr) {
        C5850m.m16583d(jArr.length > 0);
        double d = (double) jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = (double) jArr[i];
            if (!C6248b.m17561f(d2) || !C6248b.m17561f(d)) {
                d = C6246g.m17547g(d, d2);
            } else {
                d += (d2 - d) / ((double) (i + 1));
            }
        }
        return d;
    }
}

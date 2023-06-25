package p553f.p594c.p602s.p614i;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.p617v.C9323a;

/* renamed from: f.c.s.i.b */
/* compiled from: BackpressureHelper */
public final class C9314b {
    /* renamed from: a */
    public static long m25135a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m25136b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m25136b(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: c */
    public static long m25137c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C9323a.m25169p(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}

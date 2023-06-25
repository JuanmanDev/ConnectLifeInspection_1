package p040c.p200q.p353b.p356c;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p357d.C6243e;
import p040c.p200q.p353b.p358e.C6250c;
import p040c.p200q.p353b.p358e.C6252d;

/* renamed from: c.q.b.c.d */
/* compiled from: BloomFilterStrategies */
public enum C6212d implements BloomFilter.C8205c {
    MURMUR128_MITZ_32 {
        /* renamed from: k */
        public <T> boolean mo30181k(T t, Funnel<? super T> funnel, int i, C6215c cVar) {
            long b = cVar.mo30186b();
            long c = C6220h.m17506a().mo30174b(t, funnel).mo30195c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!cVar.mo30188d(((long) i5) % b)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: v */
        public <T> boolean mo30182v(T t, Funnel<? super T> funnel, int i, C6215c cVar) {
            long b = cVar.mo30186b();
            long c = C6220h.m17506a().mo30174b(t, funnel).mo30195c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                z |= cVar.mo30191f(((long) i5) % b);
            }
            return z;
        }
    },
    MURMUR128_MITZ_64 {
        /* renamed from: c */
        public final long mo30183c(byte[] bArr) {
            return C6252d.m17582d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        /* renamed from: d */
        public final long mo30184d(byte[] bArr) {
            return C6252d.m17582d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        /* renamed from: k */
        public <T> boolean mo30181k(T t, Funnel<? super T> funnel, int i, C6215c cVar) {
            long b = cVar.mo30186b();
            byte[] g = C6220h.m17506a().mo30174b(t, funnel).mo30199g();
            long c = mo30183c(g);
            long d = mo30184d(g);
            for (int i2 = 0; i2 < i; i2++) {
                if (!cVar.mo30188d((Long.MAX_VALUE & c) % b)) {
                    return false;
                }
                c += d;
            }
            return true;
        }

        /* renamed from: v */
        public <T> boolean mo30182v(T t, Funnel<? super T> funnel, int i, C6215c cVar) {
            long b = cVar.mo30186b();
            byte[] g = C6220h.m17506a().mo30174b(t, funnel).mo30199g();
            long c = mo30183c(g);
            long d = mo30184d(g);
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= cVar.mo30191f((Long.MAX_VALUE & c) % b);
                c += d;
            }
            return z;
        }
    };

    /* renamed from: c.q.b.c.d$c */
    /* compiled from: BloomFilterStrategies */
    public static final class C6215c {

        /* renamed from: a */
        public final AtomicLongArray f11828a;

        /* renamed from: b */
        public final C6221i f11829b;

        public C6215c(long j) {
            C5850m.m16584e(j > 0, "data length is zero!");
            this.f11828a = new AtomicLongArray(C6250c.m17569c(C6243e.m17543a(j, 64, RoundingMode.CEILING)));
            this.f11829b = C6222j.m17508a();
        }

        /* renamed from: g */
        public static long[] m17481g(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* renamed from: a */
        public long mo30185a() {
            return this.f11829b.mo30204a();
        }

        /* renamed from: b */
        public long mo30186b() {
            return ((long) this.f11828a.length()) * 64;
        }

        /* renamed from: c */
        public C6215c mo30187c() {
            return new C6215c(m17481g(this.f11828a));
        }

        /* renamed from: d */
        public boolean mo30188d(long j) {
            return ((1 << ((int) j)) & this.f11828a.get((int) (j >>> 6))) != 0;
        }

        /* renamed from: e */
        public void mo30189e(C6215c cVar) {
            long j;
            long j2;
            boolean z;
            C6215c cVar2 = cVar;
            C5850m.m16586g(this.f11828a.length() == cVar2.f11828a.length(), "BitArrays must be of equal length (%s != %s)", this.f11828a.length(), cVar2.f11828a.length());
            for (int i = 0; i < this.f11828a.length(); i++) {
                long j3 = cVar2.f11828a.get(i);
                while (true) {
                    j = this.f11828a.get(i);
                    j2 = j | j3;
                    if (j != j2) {
                        if (this.f11828a.compareAndSet(i, j, j2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    this.f11829b.add((long) (Long.bitCount(j2) - Long.bitCount(j)));
                }
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6215c) {
                return Arrays.equals(m17481g(this.f11828a), m17481g(((C6215c) obj).f11828a));
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo30191f(long j) {
            long j2;
            long j3;
            if (mo30188d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f11828a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f11828a.compareAndSet(i, j2, j3));
            this.f11829b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(m17481g(this.f11828a));
        }

        public C6215c(long[] jArr) {
            C5850m.m16584e(jArr.length > 0, "data length is zero!");
            this.f11828a = new AtomicLongArray(jArr);
            this.f11829b = C6222j.m17508a();
            long j = 0;
            for (long bitCount : jArr) {
                j += (long) Long.bitCount(bitCount);
            }
            this.f11829b.add(j);
        }
    }
}

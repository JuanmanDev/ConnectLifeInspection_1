package p040c.p200q.p353b.p356c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: c.q.b.c.l */
/* compiled from: Murmur3_128HashFunction */
public final class C6227l extends C6209a implements Serializable {

    /* renamed from: l */
    public static final C6218f f11834l = new C6227l(0);
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final int f11835e;

    /* renamed from: c.q.b.c.l$a */
    /* compiled from: Murmur3_128HashFunction */
    public static final class C6228a extends C6211c {

        /* renamed from: c */
        public long f11836c;

        /* renamed from: d */
        public long f11837d;

        /* renamed from: e */
        public int f11838e = 0;

        public C6228a(int i) {
            super(16);
            long j = (long) i;
            this.f11836c = j;
            this.f11837d = j;
        }

        /* renamed from: h */
        public static long m17515h(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: i */
        public static long m17516i(long j) {
            return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
        }

        /* renamed from: j */
        public static long m17517j(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
        }

        /* renamed from: c */
        public C6216e mo30177c() {
            long j = this.f11836c;
            int i = this.f11838e;
            long j2 = j ^ ((long) i);
            this.f11836c = j2;
            long j3 = this.f11837d ^ ((long) i);
            this.f11837d = j3;
            long j4 = j2 + j3;
            this.f11836c = j4;
            this.f11837d = j3 + j4;
            this.f11836c = m17515h(j4);
            long h = m17515h(this.f11837d);
            this.f11837d = h;
            long j5 = this.f11836c + h;
            this.f11836c = j5;
            this.f11837d = h + j5;
            return C6216e.m17488f(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f11836c).putLong(this.f11837d).array());
        }

        /* renamed from: e */
        public void mo30179e(ByteBuffer byteBuffer) {
            mo30218g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f11838e += 16;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(11))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(10))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(9))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
            r0 = r0 ^ ((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(8)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
            r2 = r12.getLong() ^ 0;
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(5))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(4))) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(3))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(2))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dd, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(1))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
            r2 = ((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(0))) ^ r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
            r11.f11836c ^= m17516i(r2);
            r11.f11837d ^= m17517j(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(13))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            r0 = r0 ^ (((long) p040c.p200q.p353b.p358e.C6256g.m17596b(r12.get(12))) << 32);
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30180f(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.f11838e
                int r1 = r12.remaining()
                int r0 = r0 + r1
                r11.f11838e = r0
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 0
                r8 = 8
                switch(r0) {
                    case 1: goto L_0x00ea;
                    case 2: goto L_0x00dc;
                    case 3: goto L_0x00ce;
                    case 4: goto L_0x00c0;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00a3;
                    case 7: goto L_0x0095;
                    case 8: goto L_0x008d;
                    case 9: goto L_0x0081;
                    case 10: goto L_0x0072;
                    case 11: goto L_0x0063;
                    case 12: goto L_0x0054;
                    case 13: goto L_0x0044;
                    case 14: goto L_0x0035;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                int r0 = p040c.p200q.p353b.p358e.C6256g.m17596b(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x0036
            L_0x0035:
                r0 = r6
            L_0x0036:
                r9 = 13
                byte r9 = r12.get(r9)
                int r9 = p040c.p200q.p353b.p358e.C6256g.m17596b(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0045
            L_0x0044:
                r0 = r6
            L_0x0045:
                r2 = 12
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x0055
            L_0x0054:
                r0 = r6
            L_0x0055:
                r2 = 11
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x0064
            L_0x0063:
                r0 = r6
            L_0x0064:
                r2 = 10
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0073
            L_0x0072:
                r0 = r6
            L_0x0073:
                r2 = 9
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x0082
            L_0x0081:
                r0 = r6
            L_0x0082:
                byte r2 = r12.get(r8)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x008e
            L_0x008d:
                r0 = r6
            L_0x008e:
                long r2 = r12.getLong()
                long r2 = r2 ^ r6
                r6 = r0
                goto L_0x00f6
            L_0x0095:
                r0 = 6
                byte r0 = r12.get(r0)
                int r0 = p040c.p200q.p353b.p358e.C6256g.m17596b(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x00a4
            L_0x00a3:
                r0 = r6
            L_0x00a4:
                r9 = 5
                byte r9 = r12.get(r9)
                int r9 = p040c.p200q.p353b.p358e.C6256g.m17596b(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x00b2
            L_0x00b1:
                r0 = r6
            L_0x00b2:
                r2 = 4
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00c1
            L_0x00c0:
                r0 = r6
            L_0x00c1:
                r2 = 3
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00cf
            L_0x00ce:
                r0 = r6
            L_0x00cf:
                r2 = 2
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00dd
            L_0x00dc:
                r0 = r6
            L_0x00dd:
                r2 = 1
                byte r2 = r12.get(r2)
                int r2 = p040c.p200q.p353b.p358e.C6256g.m17596b(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x00eb
            L_0x00ea:
                r0 = r6
            L_0x00eb:
                r2 = 0
                byte r12 = r12.get(r2)
                int r12 = p040c.p200q.p353b.p358e.C6256g.m17596b(r12)
                long r2 = (long) r12
                long r2 = r2 ^ r0
            L_0x00f6:
                long r0 = r11.f11836c
                long r2 = m17516i(r2)
                long r0 = r0 ^ r2
                r11.f11836c = r0
                long r0 = r11.f11837d
                long r2 = m17517j(r6)
                long r0 = r0 ^ r2
                r11.f11837d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p356c.C6227l.C6228a.mo30180f(java.nio.ByteBuffer):void");
        }

        /* renamed from: g */
        public final void mo30218g(long j, long j2) {
            long i = m17516i(j) ^ this.f11836c;
            this.f11836c = i;
            long rotateLeft = Long.rotateLeft(i, 27);
            this.f11836c = rotateLeft;
            long j3 = this.f11837d;
            long j4 = rotateLeft + j3;
            this.f11836c = j4;
            this.f11836c = (j4 * 5) + 1390208809;
            long j5 = m17517j(j2) ^ j3;
            this.f11837d = j5;
            long rotateLeft2 = Long.rotateLeft(j5, 31);
            this.f11837d = rotateLeft2;
            long j6 = rotateLeft2 + this.f11836c;
            this.f11837d = j6;
            this.f11837d = (j6 * 5) + 944331445;
        }
    }

    static {
        int i = C6220h.f11832a;
    }

    public C6227l(int i) {
        this.f11835e = i;
    }

    /* renamed from: a */
    public C6219g mo30203a() {
        return new C6228a(this.f11835e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6227l) || this.f11835e != ((C6227l) obj).f11835e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6227l.class.hashCode() ^ this.f11835e;
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f11835e + ")";
    }
}

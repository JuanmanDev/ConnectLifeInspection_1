package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.l */
/* compiled from: VorbisUtil */
public final class C2763l {

    /* renamed from: c.q.a.b.f0.w.l$a */
    /* compiled from: VorbisUtil */
    public static final class C2764a {
        public C2764a(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    /* renamed from: c.q.a.b.f0.w.l$b */
    /* compiled from: VorbisUtil */
    public static final class C2765b {
        public C2765b(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: c.q.a.b.f0.w.l$c */
    /* compiled from: VorbisUtil */
    public static final class C2766c {

        /* renamed from: a */
        public final boolean f4029a;

        public C2766c(boolean z, int i, int i2, int i3) {
            this.f4029a = z;
        }
    }

    /* renamed from: c.q.a.b.f0.w.l$d */
    /* compiled from: VorbisUtil */
    public static final class C2767d {

        /* renamed from: a */
        public final int f4030a;

        /* renamed from: b */
        public final long f4031b;

        /* renamed from: c */
        public final int f4032c;

        /* renamed from: d */
        public final int f4033d;

        /* renamed from: e */
        public final int f4034e;

        /* renamed from: f */
        public final byte[] f4035f;

        public C2767d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f4030a = i;
            this.f4031b = j2;
            this.f4032c = i3;
            this.f4033d = i5;
            this.f4034e = i6;
            this.f4035f = bArr;
        }
    }

    /* renamed from: a */
    public static int m5700a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static long m5701b(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    /* renamed from: c */
    public static C2764a m5702c(C2760j jVar) {
        if (jVar.mo18732d(24) == 5653314) {
            int d = jVar.mo18732d(16);
            int d2 = jVar.mo18732d(24);
            long[] jArr = new long[d2];
            boolean c = jVar.mo18731c();
            long j = 0;
            if (!c) {
                boolean c2 = jVar.mo18731c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = (long) (jVar.mo18732d(5) + 1);
                    } else if (jVar.mo18731c()) {
                        jArr[i] = (long) (jVar.mo18732d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = jVar.mo18732d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = jVar.mo18732d(m5700a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = (long) d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = jVar.mo18732d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    jVar.mo18733e(32);
                    jVar.mo18733e(32);
                    int d6 = jVar.mo18732d(4) + 1;
                    jVar.mo18733e(1);
                    if (d5 != 1) {
                        j = ((long) d2) * ((long) d);
                    } else if (d != 0) {
                        j = m5701b((long) d2, (long) d);
                    }
                    jVar.mo18733e((int) (j * ((long) d6)));
                }
                return new C2764a(d, d2, jArr, d5, c);
            }
            throw new ParserException("lookup type greater than 2 not decodable: " + d5);
        }
        throw new ParserException("expected code book to start with [0x56, 0x43, 0x42] at " + jVar.mo18730b());
    }

    /* renamed from: d */
    public static void m5703d(C2760j jVar) {
        int d = jVar.mo18732d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = jVar.mo18732d(16);
            if (d2 == 0) {
                jVar.mo18733e(8);
                jVar.mo18733e(16);
                jVar.mo18733e(16);
                jVar.mo18733e(6);
                jVar.mo18733e(8);
                int d3 = jVar.mo18732d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    jVar.mo18733e(8);
                }
            } else if (d2 == 1) {
                int d4 = jVar.mo18732d(5);
                int i3 = -1;
                int[] iArr = new int[d4];
                for (int i4 = 0; i4 < d4; i4++) {
                    iArr[i4] = jVar.mo18732d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = jVar.mo18732d(3) + 1;
                    int d5 = jVar.mo18732d(2);
                    if (d5 > 0) {
                        jVar.mo18733e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d5); i7++) {
                        jVar.mo18733e(8);
                    }
                }
                jVar.mo18733e(2);
                int d6 = jVar.mo18732d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        jVar.mo18733e(d6);
                        i9++;
                    }
                }
            } else {
                throw new ParserException("floor type greater than 1 not decodable: " + d2);
            }
        }
    }

    /* renamed from: e */
    public static void m5704e(int i, C2760j jVar) {
        int d = jVar.mo18732d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = jVar.mo18732d(16);
            if (d2 != 0) {
                C3163m.m7877c("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                int d3 = jVar.mo18731c() ? jVar.mo18732d(4) + 1 : 1;
                if (jVar.mo18731c()) {
                    int d4 = jVar.mo18732d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        jVar.mo18733e(m5700a(i4));
                        jVar.mo18733e(m5700a(i4));
                    }
                }
                if (jVar.mo18732d(2) == 0) {
                    if (d3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            jVar.mo18733e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d3; i6++) {
                        jVar.mo18733e(8);
                        jVar.mo18733e(8);
                        jVar.mo18733e(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: f */
    public static C2766c[] m5705f(C2760j jVar) {
        int d = jVar.mo18732d(6) + 1;
        C2766c[] cVarArr = new C2766c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C2766c(jVar.mo18731c(), jVar.mo18732d(16), jVar.mo18732d(16), jVar.mo18732d(8));
        }
        return cVarArr;
    }

    /* renamed from: g */
    public static void m5706g(C2760j jVar) {
        int d = jVar.mo18732d(6) + 1;
        int i = 0;
        while (i < d) {
            if (jVar.mo18732d(16) <= 2) {
                jVar.mo18733e(24);
                jVar.mo18733e(24);
                jVar.mo18733e(24);
                int d2 = jVar.mo18732d(6) + 1;
                jVar.mo18733e(8);
                int[] iArr = new int[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    iArr[i2] = ((jVar.mo18731c() ? jVar.mo18732d(5) : 0) * 8) + jVar.mo18732d(3);
                }
                for (int i3 = 0; i3 < d2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            jVar.mo18733e(8);
                        }
                    }
                }
                i++;
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: h */
    public static C2765b m5707h(C3173t tVar) {
        m5710k(3, tVar, false);
        String v = tVar.mo20029v((int) tVar.mo20022o());
        int length = 11 + v.length();
        long o = tVar.mo20022o();
        String[] strArr = new String[((int) o)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < o; i2++) {
            strArr[i2] = tVar.mo20029v((int) tVar.mo20022o());
            i = i + 4 + strArr[i2].length();
        }
        if ((tVar.mo20032y() & 1) != 0) {
            return new C2765b(v, strArr, i + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: i */
    public static C2767d m5708i(C3173t tVar) {
        C3173t tVar2 = tVar;
        m5710k(1, tVar2, false);
        long o = tVar.mo20022o();
        int y = tVar.mo20032y();
        long o2 = tVar.mo20022o();
        int m = tVar.mo20020m();
        int m2 = tVar.mo20020m();
        int m3 = tVar.mo20020m();
        int y2 = tVar.mo20032y();
        return new C2767d(o, y, o2, m, m2, m3, (int) Math.pow(2.0d, (double) (y2 & 15)), (int) Math.pow(2.0d, (double) ((y2 & 240) >> 4)), (tVar.mo20032y() & 1) > 0, Arrays.copyOf(tVar2.f5877a, tVar.mo20011d()));
    }

    /* renamed from: j */
    public static C2766c[] m5709j(C3173t tVar, int i) {
        int i2 = 0;
        m5710k(5, tVar, false);
        int y = tVar.mo20032y() + 1;
        C2760j jVar = new C2760j(tVar.f5877a);
        jVar.mo18733e(tVar.mo20010c() * 8);
        for (int i3 = 0; i3 < y; i3++) {
            m5702c(jVar);
        }
        int d = jVar.mo18732d(6) + 1;
        while (i2 < d) {
            if (jVar.mo18732d(16) == 0) {
                i2++;
            } else {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        m5703d(jVar);
        m5706g(jVar);
        m5704e(i, jVar);
        C2766c[] f = m5705f(jVar);
        if (jVar.mo18731c()) {
            return f;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    /* renamed from: k */
    public static boolean m5710k(int i, C3173t tVar, boolean z) {
        if (tVar.mo20008a() < 7) {
            if (z) {
                return false;
            }
            throw new ParserException("too short header: " + tVar.mo20008a());
        } else if (tVar.mo20032y() != i) {
            if (z) {
                return false;
            }
            throw new ParserException("expected header type " + Integer.toHexString(i));
        } else if (tVar.mo20032y() == 118 && tVar.mo20032y() == 111 && tVar.mo20032y() == 114 && tVar.mo20032y() == 98 && tVar.mo20032y() == 105 && tVar.mo20032y() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}

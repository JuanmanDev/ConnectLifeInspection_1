package p040c.p200q.p201a.p219b.p224f0.p229v;

import android.support.p025v4.media.session.PlaybackStateCompat;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.k */
/* compiled from: Sniffer */
public final class C2740k {

    /* renamed from: a */
    public static final int[] f3916a = {C3152e0.m7764D("isom"), C3152e0.m7764D("iso2"), C3152e0.m7764D("iso3"), C3152e0.m7764D("iso4"), C3152e0.m7764D("iso5"), C3152e0.m7764D("iso6"), C3152e0.m7764D("avc1"), C3152e0.m7764D("hvc1"), C3152e0.m7764D("hev1"), C3152e0.m7764D("mp41"), C3152e0.m7764D("mp42"), C3152e0.m7764D("3g2a"), C3152e0.m7764D("3g2b"), C3152e0.m7764D("3gr6"), C3152e0.m7764D("3gs6"), C3152e0.m7764D("3ge6"), C3152e0.m7764D("3gg6"), C3152e0.m7764D("M4V "), C3152e0.m7764D("M4A "), C3152e0.m7764D("f4v "), C3152e0.m7764D("kddi"), C3152e0.m7764D("M4VP"), C3152e0.m7764D("qt  "), C3152e0.m7764D("MSNV")};

    /* renamed from: a */
    public static boolean m5599a(int i) {
        if ((i >>> 8) == C3152e0.m7764D("3gp")) {
            return true;
        }
        for (int i2 : f3916a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5600b(C2675h hVar) {
        return m5601c(hVar, true);
    }

    /* renamed from: c */
    public static boolean m5601c(C2675h hVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C2675h hVar2 = hVar;
        long e = hVar.mo18526e();
        long j = -1;
        int i = (e > -1 ? 1 : (e == -1 ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i != 0 && e <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = e;
        }
        int i2 = (int) j2;
        C3173t tVar = new C3173t(64);
        boolean z6 = false;
        int i3 = 0;
        boolean z7 = false;
        while (true) {
            if (i3 >= i2) {
                z2 = z6;
                break;
            }
            tVar.mo20002H(8);
            hVar2.mo18531i(tVar.f5877a, z6 ? 1 : 0, 8);
            long A = tVar.mo19995A();
            int j3 = tVar.mo20017j();
            int i4 = 16;
            if (A == 1) {
                hVar2.mo18531i(tVar.f5877a, 8, 8);
                tVar.mo20005K(16);
                A = tVar.mo20025r();
            } else {
                if (A == 0) {
                    long e2 = hVar.mo18526e();
                    if (e2 != j) {
                        A = (e2 - hVar.mo18524c()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            if (i != 0 && ((long) i3) + A > e) {
                return z6;
            }
            long j4 = (long) i4;
            if (A < j4) {
                return z6;
            }
            i3 += i4;
            if (j3 == C2718c.f3670C) {
                i2 += (int) A;
                if (i != 0 && ((long) i2) > e) {
                    i2 = (int) e;
                }
            } else if (j3 == C2718c.f3688L || j3 == C2718c.f3692N) {
                z2 = z6;
                z3 = true;
                z4 = true;
            } else {
                long j5 = e;
                int i5 = i3;
                if ((((long) i3) + A) - j4 >= ((long) i2)) {
                    z2 = false;
                    break;
                }
                int i6 = (int) (A - j4);
                i3 = i5 + i6;
                if (j3 != C2718c.f3715b) {
                    z5 = false;
                    if (i6 != 0) {
                        hVar2.mo18525d(i6);
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    tVar.mo20002H(i6);
                    hVar2.mo18531i(tVar.f5877a, 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        if (i8 == 1) {
                            tVar.mo20007M(4);
                        } else if (m5599a(tVar.mo20017j())) {
                            z7 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z7) {
                        return false;
                    }
                    z5 = false;
                }
                z6 = z5;
                e = j5;
            }
            j = -1;
        }
        z3 = true;
        z4 = z2;
        return (!z7 || z != z4) ? z2 : z3;
    }

    /* renamed from: d */
    public static boolean m5602d(C2675h hVar) {
        return m5601c(hVar, false);
    }
}

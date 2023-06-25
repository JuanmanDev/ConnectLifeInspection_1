package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2661a;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.u */
/* compiled from: PsBinarySearchSeeker */
public final class C2808u extends C2661a {

    /* renamed from: c.q.a.b.f0.y.u$b */
    /* compiled from: PsBinarySearchSeeker */
    public static final class C2810b implements C2661a.C2668g {

        /* renamed from: a */
        public final C3146b0 f4329a;

        /* renamed from: b */
        public final C3173t f4330b;

        /* renamed from: d */
        public static void m5940d(C3173t tVar) {
            int d = tVar.mo20011d();
            if (tVar.mo20008a() < 10) {
                tVar.mo20006L(d);
                return;
            }
            tVar.mo20007M(9);
            int y = tVar.mo20032y() & 7;
            if (tVar.mo20008a() < y) {
                tVar.mo20006L(d);
                return;
            }
            tVar.mo20007M(y);
            if (tVar.mo20008a() < 4) {
                tVar.mo20006L(d);
                return;
            }
            if (C2808u.m5939k(tVar.f5877a, tVar.mo20010c()) == 443) {
                tVar.mo20007M(4);
                int E = tVar.mo19999E();
                if (tVar.mo20008a() < E) {
                    tVar.mo20006L(d);
                    return;
                }
                tVar.mo20007M(E);
            }
            while (tVar.mo20008a() >= 4 && (r1 = C2808u.m5939k(tVar.f5877a, tVar.mo20010c())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                tVar.mo20007M(4);
                if (tVar.mo20008a() < 2) {
                    tVar.mo20006L(d);
                    return;
                } else {
                    tVar.mo20006L(Math.min(tVar.mo20011d(), tVar.mo20010c() + tVar.mo19999E()));
                }
            }
        }

        /* renamed from: a */
        public C2661a.C2667f mo18516a(C2675h hVar, long j, C2661a.C2664c cVar) {
            long position = hVar.getPosition();
            int min = (int) Math.min(20000, hVar.mo18526e() - position);
            this.f4330b.mo20002H(min);
            hVar.mo18531i(this.f4330b.f5877a, 0, min);
            return mo18849c(this.f4330b, j, position);
        }

        /* renamed from: b */
        public void mo18517b() {
            this.f4330b.mo20003I(C3152e0.f5824f);
        }

        /* renamed from: c */
        public final C2661a.C2667f mo18849c(C3173t tVar, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (tVar.mo20008a() >= 4) {
                if (C2808u.m5939k(tVar.f5877a, tVar.mo20010c()) != 442) {
                    tVar.mo20007M(1);
                } else {
                    tVar.mo20007M(4);
                    long l = C2811v.m5945l(tVar);
                    if (l != -9223372036854775807L) {
                        long b = this.f4329a.mo19944b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return C2661a.C2667f.m5231d(b, j2);
                            }
                            return C2661a.C2667f.m5232e(j2 + ((long) i2));
                        } else if (100000 + b > j) {
                            return C2661a.C2667f.m5232e(j2 + ((long) tVar.mo20010c()));
                        } else {
                            i2 = tVar.mo20010c();
                            j3 = b;
                        }
                    }
                    m5940d(tVar);
                    i = tVar.mo20010c();
                }
            }
            if (j3 != -9223372036854775807L) {
                return C2661a.C2667f.m5233f(j3, j2 + ((long) i));
            }
            return C2661a.C2667f.f3392d;
        }

        public C2810b(C3146b0 b0Var) {
            this.f4329a = b0Var;
            this.f4330b = new C3173t();
        }
    }

    public C2808u(C3146b0 b0Var, long j, long j2) {
        super(new C2661a.C2663b(), new C2810b(b0Var), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* renamed from: k */
    public static int m5939k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}

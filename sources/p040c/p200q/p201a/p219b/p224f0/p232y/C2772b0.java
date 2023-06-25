package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2661a;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.b0 */
/* compiled from: TsBinarySearchSeeker */
public final class C2772b0 extends C2661a {

    /* renamed from: c.q.a.b.f0.y.b0$a */
    /* compiled from: TsBinarySearchSeeker */
    public static final class C2773a implements C2661a.C2668g {

        /* renamed from: a */
        public final C3146b0 f4050a;

        /* renamed from: b */
        public final C3173t f4051b = new C3173t();

        /* renamed from: c */
        public final int f4052c;

        public C2773a(int i, C3146b0 b0Var) {
            this.f4052c = i;
            this.f4050a = b0Var;
        }

        /* renamed from: a */
        public C2661a.C2667f mo18516a(C2675h hVar, long j, C2661a.C2664c cVar) {
            long position = hVar.getPosition();
            int min = (int) Math.min(112800, hVar.mo18526e() - position);
            this.f4051b.mo20002H(min);
            hVar.mo18531i(this.f4051b.f5877a, 0, min);
            return mo18740c(this.f4051b, j, position);
        }

        /* renamed from: b */
        public void mo18517b() {
            this.f4051b.mo20003I(C3152e0.f5824f);
        }

        /* renamed from: c */
        public final C2661a.C2667f mo18740c(C3173t tVar, long j, long j2) {
            int a;
            int i;
            C3173t tVar2 = tVar;
            long j3 = j2;
            int d = tVar.mo20011d();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (tVar.mo20008a() >= 188 && (i = a + 188) <= d) {
                long b = C2787f0.m5792b(tVar2, (a = C2787f0.m5791a(tVar2.f5877a, tVar.mo20010c(), d)), this.f4052c);
                if (b != -9223372036854775807L) {
                    long b2 = this.f4050a.mo19944b(b);
                    if (b2 > j) {
                        if (j6 == -9223372036854775807L) {
                            return C2661a.C2667f.m5231d(b2, j3);
                        }
                        return C2661a.C2667f.m5232e(j3 + j5);
                    } else if (100000 + b2 > j) {
                        return C2661a.C2667f.m5232e(j3 + ((long) a));
                    } else {
                        j5 = (long) a;
                        j6 = b2;
                    }
                }
                tVar2.mo20006L(i);
                j4 = (long) i;
            }
            if (j6 != -9223372036854775807L) {
                return C2661a.C2667f.m5233f(j6, j3 + j4);
            }
            return C2661a.C2667f.f3392d;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2772b0(p040c.p200q.p201a.p219b.p261o0.C3146b0 r17, long r18, long r20, int r22) {
        /*
            r16 = this;
            c.q.a.b.f0.a$b r1 = new c.q.a.b.f0.a$b
            r1.<init>()
            c.q.a.b.f0.y.b0$a r2 = new c.q.a.b.f0.y.b0$a
            r0 = r17
            r3 = r22
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p232y.C2772b0.<init>(c.q.a.b.o0.b0, long, long, int):void");
    }
}

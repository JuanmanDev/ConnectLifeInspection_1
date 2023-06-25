package p040c.p200q.p201a.p219b.p250l0.p251k;

import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.k.g */
/* compiled from: CeaUtil */
public final class C3055g {

    /* renamed from: a */
    public static final int f5442a = C3152e0.m7764D("GA94");

    /* renamed from: a */
    public static void m7297a(long j, C3173t tVar, C2686q[] qVarArr) {
        while (true) {
            boolean z = true;
            if (tVar.mo20008a() > 1) {
                int c = m7299c(tVar);
                int c2 = m7299c(tVar);
                int c3 = tVar.mo20010c() + c2;
                if (c2 == -1 || c2 > tVar.mo20008a()) {
                    C3163m.m7880f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    c3 = tVar.mo20011d();
                } else if (c == 4 && c2 >= 8) {
                    int y = tVar.mo20032y();
                    int E = tVar.mo19999E();
                    int j2 = E == 49 ? tVar.mo20017j() : 0;
                    int y2 = tVar.mo20032y();
                    if (E == 47) {
                        tVar.mo20007M(1);
                    }
                    boolean z2 = y == 181 && (E == 49 || E == 47) && y2 == 3;
                    if (E == 49) {
                        if (j2 != f5442a) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m7298b(j, tVar, qVarArr);
                    }
                }
                tVar.mo20006L(c3);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m7298b(long j, C3173t tVar, C2686q[] qVarArr) {
        int y = tVar.mo20032y();
        if ((y & 64) != 0) {
            tVar.mo20007M(1);
            int i = (y & 31) * 3;
            int c = tVar.mo20010c();
            for (C2686q qVar : qVarArr) {
                tVar.mo20006L(c);
                qVar.mo18544b(tVar, i);
                qVar.mo18545c(j, 1, i, 0, (C2686q.C2687a) null);
            }
        }
    }

    /* renamed from: c */
    public static int m7299c(C3173t tVar) {
        int i = 0;
        while (tVar.mo20008a() != 0) {
            int y = tVar.mo20032y();
            i += y;
            if (y != 255) {
                return i;
            }
        }
        return -1;
    }
}

package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.List;

/* renamed from: c.q.a.c.g.i.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5015c8 implements C5192nb {

    /* renamed from: a */
    public final C4999b8 f9844a;

    public C5015c8(C4999b8 b8Var) {
        C5369z8.m15426f(b8Var, "output");
        this.f9844a = b8Var;
        b8Var.f9827a = this;
    }

    /* renamed from: K */
    public static C5015c8 m13910K(C4999b8 b8Var) {
        C5015c8 c8Var = b8Var.f9827a;
        return c8Var != null ? c8Var : new C5015c8(b8Var);
    }

    /* renamed from: A */
    public final void mo27097A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26992l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26991k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo27098B(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26994n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26993m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo27099C(int i, long j) {
        this.f9844a.mo27002v(i, j);
    }

    @Deprecated
    /* renamed from: D */
    public final void mo27100D(int i) {
        this.f9844a.mo26999s(i, 3);
    }

    /* renamed from: E */
    public final void mo27101E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26992l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26991k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo27102F(int i, long j) {
        this.f9844a.mo26993m(i, j);
    }

    /* renamed from: G */
    public final void mo27103G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C4999b8.m13823b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                C4999b8 b8Var = this.f9844a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                b8Var.mo27003w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4999b8 b8Var2 = this.f9844a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            b8Var2.mo27002v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo27104H(int i, Object obj, C5065fa faVar) {
        C5295u9 u9Var = (C5295u9) obj;
        C5368z7 z7Var = (C5368z7) this.f9844a;
        z7Var.mo27001u((i << 3) | 2);
        z7Var.mo27001u(((C5046e7) u9Var).mo27189f(faVar));
        faVar.mo27244h(u9Var, z7Var.f9827a);
    }

    /* renamed from: I */
    public final void mo27105I(int i, long j) {
        this.f9844a.mo27002v(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    /* renamed from: J */
    public final void mo27106J(int i) {
        this.f9844a.mo26999s(i, 4);
    }

    /* renamed from: a */
    public final void mo27107a(int i, int i2) {
        this.f9844a.mo27000t(i, i2);
    }

    /* renamed from: b */
    public final void mo27108b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26994n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26993m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo27109c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9844a.mo26990j(i, (zzje) list.get(i2));
        }
    }

    /* renamed from: d */
    public final void mo27110d(int i, int i2) {
        this.f9844a.mo26991k(i, i2);
    }

    /* renamed from: e */
    public final void mo27111e(int i, boolean z) {
        this.f9844a.mo26989i(i, z);
    }

    /* renamed from: f */
    public final void mo27112f(int i, int i2) {
        this.f9844a.mo27000t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: g */
    public final void mo27113g(int i, String str) {
        this.f9844a.mo26998r(i, str);
    }

    /* renamed from: h */
    public final void mo27114h(int i, long j) {
        this.f9844a.mo27002v(i, j);
    }

    /* renamed from: i */
    public final void mo27115i(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26988h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26989i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo27116j(int i, long j) {
        this.f9844a.mo26993m(i, j);
    }

    /* renamed from: k */
    public final void mo27117k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4999b8.m13822a(((Integer) list.get(i4)).intValue());
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo27001u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo27000t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo27118l(int i, Object obj, C5065fa faVar) {
        C4999b8 b8Var = this.f9844a;
        b8Var.mo26999s(i, 3);
        faVar.mo27244h((C5295u9) obj, b8Var.f9827a);
        b8Var.mo26999s(i, 4);
    }

    /* renamed from: m */
    public final void mo27119m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26992l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26991k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo27120n(int i, zzje zzje) {
        this.f9844a.mo26990j(i, zzje);
    }

    /* renamed from: o */
    public final void mo27121o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4999b8.m13828z(((Integer) list.get(i4)).intValue());
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26996p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26995o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo27122p(int i, int i2) {
        this.f9844a.mo26995o(i, i2);
    }

    /* renamed from: q */
    public final void mo27123q(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4999b8.m13828z(((Integer) list.get(i4)).intValue());
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26996p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26995o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo27124r(int i, int i2) {
        this.f9844a.mo26995o(i, i2);
    }

    /* renamed from: s */
    public final void mo27125s(int i, List list) {
        int i2 = 0;
        if (list instanceof C5016c9) {
            C5016c9 c9Var = (C5016c9) list;
            while (i2 < list.size()) {
                Object j = c9Var.mo27014j(i2);
                if (j instanceof String) {
                    this.f9844a.mo26998r(i, (String) j);
                } else {
                    this.f9844a.mo26990j(i, (zzje) j);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26998r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo27126t(int i, double d) {
        this.f9844a.mo26993m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: u */
    public final void mo27127u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo26994n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo26993m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo27128v(int i, int i2) {
        this.f9844a.mo26991k(i, i2);
    }

    /* renamed from: w */
    public final void mo27129w(int i, float f) {
        this.f9844a.mo26991k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: x */
    public final void mo27130x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C4999b8.m13822a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                C4999b8 b8Var = this.f9844a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                b8Var.mo27001u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4999b8 b8Var2 = this.f9844a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            b8Var2.mo27000t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo27131y(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4999b8.m13823b(((Long) list.get(i4)).longValue());
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo27003w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo27002v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo27132z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9844a.mo26999s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4999b8.m13823b(((Long) list.get(i4)).longValue());
            }
            this.f9844a.mo27001u(i3);
            while (i2 < list.size()) {
                this.f9844a.mo27003w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9844a.mo27002v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}

package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.List;

/* renamed from: c.q.a.c.g.g.u0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4809u0 {

    /* renamed from: a */
    public final C4783t0 f9652a;

    public C4809u0(C4783t0 t0Var) {
        C4706q1.m12869f(t0Var, "output");
        this.f9652a = t0Var;
        t0Var.f9631a = this;
    }

    /* renamed from: l */
    public static C4809u0 m13180l(C4783t0 t0Var) {
        C4809u0 u0Var = t0Var.f9631a;
        return u0Var != null ? u0Var : new C4809u0(t0Var);
    }

    /* renamed from: A */
    public final void mo26685A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26559s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26558r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo26686B(int i, Object obj, C4889x2 x2Var) {
        C4783t0 t0Var = this.f9652a;
        t0Var.mo26566z(i, 3);
        x2Var.mo26423i((C4572l2) obj, t0Var.f9631a);
        t0Var.mo26566z(i, 4);
    }

    /* renamed from: C */
    public final void mo26687C(int i, int i2) {
        this.f9652a.mo26562v(i, i2);
    }

    /* renamed from: D */
    public final void mo26688D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4783t0.m13097G(((Integer) list.get(i4)).intValue());
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26563w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26562v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo26689E(int i, long j) {
        this.f9652a.mo26549C(i, j);
    }

    /* renamed from: F */
    public final void mo26690F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4783t0.m13104g(((Long) list.get(i4)).longValue());
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26550D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26549C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo26691G(int i, Object obj, C4889x2 x2Var) {
        this.f9652a.mo26564x(i, (C4572l2) obj, x2Var);
    }

    /* renamed from: H */
    public final void mo26692H(int i, int i2) {
        this.f9652a.mo26558r(i, i2);
    }

    /* renamed from: I */
    public final void mo26693I(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26559s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26558r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo26694J(int i, long j) {
        this.f9652a.mo26560t(i, j);
    }

    /* renamed from: K */
    public final void mo26695K(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26561u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26560t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26696a(int i, int i2) {
        this.f9652a.mo26547A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo26697b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C4783t0.m13103f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                C4783t0 t0Var = this.f9652a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                t0Var.mo26548B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4783t0 t0Var2 = this.f9652a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            t0Var2.mo26547A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo26698c(int i, long j) {
        this.f9652a.mo26549C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo26699d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C4783t0.m13104g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                C4783t0 t0Var = this.f9652a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                t0Var.mo26550D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4783t0 t0Var2 = this.f9652a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            t0Var2.mo26549C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo26700e(int i) {
        this.f9652a.mo26566z(i, 3);
    }

    /* renamed from: f */
    public final void mo26701f(int i, String str) {
        this.f9652a.mo26565y(i, str);
    }

    /* renamed from: g */
    public final void mo26702g(int i, List list) {
        int i2 = 0;
        if (list instanceof C4784t1) {
            C4784t1 t1Var = (C4784t1) list;
            while (i2 < list.size()) {
                Object j = t1Var.mo26632j(i2);
                if (j instanceof String) {
                    this.f9652a.mo26565y(i, (String) j);
                } else {
                    this.f9652a.mo26557p(i, (zzacc) j);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26565y(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo26703h(int i, int i2) {
        this.f9652a.mo26547A(i, i2);
    }

    /* renamed from: i */
    public final void mo26704i(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4783t0.m13103f(((Integer) list.get(i4)).intValue());
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26548B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26547A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo26705j(int i, long j) {
        this.f9652a.mo26549C(i, j);
    }

    /* renamed from: k */
    public final void mo26706k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4783t0.m13104g(((Long) list.get(i4)).longValue());
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26550D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26549C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo26707m(int i, boolean z) {
        this.f9652a.mo26556o(i, z);
    }

    /* renamed from: n */
    public final void mo26708n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26555n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26556o(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo26709o(int i, zzacc zzacc) {
        this.f9652a.mo26557p(i, zzacc);
    }

    /* renamed from: p */
    public final void mo26710p(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9652a.mo26557p(i, (zzacc) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo26711q(int i, double d) {
        this.f9652a.mo26560t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo26712r(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26561u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26560t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo26713s(int i) {
        this.f9652a.mo26566z(i, 4);
    }

    /* renamed from: t */
    public final void mo26714t(int i, int i2) {
        this.f9652a.mo26562v(i, i2);
    }

    /* renamed from: u */
    public final void mo26715u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4783t0.m13097G(((Integer) list.get(i4)).intValue());
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26563w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26562v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo26716v(int i, int i2) {
        this.f9652a.mo26558r(i, i2);
    }

    /* renamed from: w */
    public final void mo26717w(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26559s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26558r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo26718x(int i, long j) {
        this.f9652a.mo26560t(i, j);
    }

    /* renamed from: y */
    public final void mo26719y(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9652a.mo26566z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f9652a.mo26548B(i3);
            while (i2 < list.size()) {
                this.f9652a.mo26561u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9652a.mo26560t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo26720z(int i, float f) {
        this.f9652a.mo26558r(i, Float.floatToRawIntBits(f));
    }
}

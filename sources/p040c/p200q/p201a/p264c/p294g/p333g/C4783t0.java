package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzack;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: c.q.a.c.g.g.t0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4783t0 extends C4938z {

    /* renamed from: b */
    public static final Logger f9629b = Logger.getLogger(C4783t0.class.getName());

    /* renamed from: c */
    public static final boolean f9630c = C4916y3.m13542C();

    /* renamed from: a */
    public C4809u0 f9631a;

    public C4783t0() {
    }

    public /* synthetic */ C4783t0(C4757s0 s0Var) {
    }

    /* renamed from: E */
    public static int m13095E(zzacc zzacc) {
        int zzd = zzacc.zzd();
        return m13103f(zzd) + zzd;
    }

    @Deprecated
    /* renamed from: F */
    public static int m13096F(int i, C4572l2 l2Var, C4889x2 x2Var) {
        int f = m13103f(i << 3);
        return f + f + ((C4782t) l2Var).mo26149b(x2Var);
    }

    /* renamed from: G */
    public static int m13097G(int i) {
        if (i >= 0) {
            return m13103f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m13098H(C4732r1 r1Var) {
        int a = r1Var.mo26591a();
        return m13103f(a) + a;
    }

    /* renamed from: b */
    public static int m13099b(C4572l2 l2Var, C4889x2 x2Var) {
        int b = ((C4782t) l2Var).mo26149b(x2Var);
        return m13103f(b) + b;
    }

    /* renamed from: c */
    public static int m13100c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m13101d(String str) {
        int i;
        try {
            i = C4385e4.m11885c(str);
        } catch (C4358d4 unused) {
            i = str.getBytes(C4706q1.f9576a).length;
        }
        return m13103f(i) + i;
    }

    /* renamed from: e */
    public static int m13102e(int i) {
        return m13103f(i << 3);
    }

    /* renamed from: f */
    public static int m13103f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m13104g(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((CoroutineScheduler.PARKED_VERSION_MASK & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: h */
    public static C4783t0 m13105h(byte[] bArr) {
        return new C4705q0(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static C4783t0 m13106i(OutputStream outputStream, int i) {
        return new C4731r0(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo26547A(int i, int i2);

    /* renamed from: B */
    public abstract void mo26548B(int i);

    /* renamed from: C */
    public abstract void mo26549C(int i, long j);

    /* renamed from: D */
    public abstract void mo26550D(long j);

    /* renamed from: j */
    public final void mo26657j() {
        if (mo26495q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: k */
    public final void mo26658k(String str, C4358d4 d4Var) {
        f9629b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", d4Var);
        byte[] bytes = str.getBytes(C4706q1.f9576a);
        try {
            int length = bytes.length;
            mo26548B(length);
            mo26553a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(e);
        }
    }

    /* renamed from: m */
    public abstract void mo26554m();

    /* renamed from: n */
    public abstract void mo26555n(byte b);

    /* renamed from: o */
    public abstract void mo26556o(int i, boolean z);

    /* renamed from: p */
    public abstract void mo26557p(int i, zzacc zzacc);

    /* renamed from: q */
    public abstract int mo26495q();

    /* renamed from: r */
    public abstract void mo26558r(int i, int i2);

    /* renamed from: s */
    public abstract void mo26559s(int i);

    /* renamed from: t */
    public abstract void mo26560t(int i, long j);

    /* renamed from: u */
    public abstract void mo26561u(long j);

    /* renamed from: v */
    public abstract void mo26562v(int i, int i2);

    /* renamed from: w */
    public abstract void mo26563w(int i);

    /* renamed from: x */
    public abstract void mo26564x(int i, C4572l2 l2Var, C4889x2 x2Var);

    /* renamed from: y */
    public abstract void mo26565y(int i, String str);

    /* renamed from: z */
    public abstract void mo26566z(int i, int i2);
}

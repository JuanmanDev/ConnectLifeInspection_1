package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzjk;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: c.q.a.c.g.i.b8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C4999b8 extends C5142k7 {

    /* renamed from: b */
    public static final Logger f9825b = Logger.getLogger(C4999b8.class.getName());

    /* renamed from: c */
    public static final boolean f9826c = C5082gb.m14142C();

    /* renamed from: a */
    public C5015c8 f9827a;

    public C4999b8() {
    }

    public /* synthetic */ C4999b8(C4983a8 a8Var) {
    }

    /* renamed from: A */
    public static int m13818A(C4984a9 a9Var) {
        int a = a9Var.mo26938a();
        return m13822a(a) + a;
    }

    /* renamed from: B */
    public static int m13819B(C5295u9 u9Var, C5065fa faVar) {
        int f = ((C5046e7) u9Var).mo27189f(faVar);
        return m13822a(f) + f;
    }

    /* renamed from: C */
    public static int m13820C(String str) {
        int i;
        try {
            i = C5177mb.m14500c(str);
        } catch (C5162lb unused) {
            i = str.getBytes(C5369z8.f10297a).length;
        }
        return m13822a(i) + i;
    }

    /* renamed from: D */
    public static int m13821D(int i) {
        return m13822a(i << 3);
    }

    /* renamed from: a */
    public static int m13822a(int i) {
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

    /* renamed from: b */
    public static int m13823b(long j) {
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

    /* renamed from: c */
    public static C4999b8 m13824c(byte[] bArr) {
        return new C5368z7(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m13826x(zzje zzje) {
        int zzd = zzje.zzd();
        return m13822a(zzd) + zzd;
    }

    @Deprecated
    /* renamed from: y */
    public static int m13827y(int i, C5295u9 u9Var, C5065fa faVar) {
        int a = m13822a(i << 3);
        return a + a + ((C5046e7) u9Var).mo27189f(faVar);
    }

    /* renamed from: z */
    public static int m13828z(int i) {
        if (i >= 0) {
            return m13822a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo26985d() {
        if (mo26987g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: e */
    public final void mo26986e(String str, C5162lb lbVar) {
        f9825b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", lbVar);
        byte[] bytes = str.getBytes(C5369z8.f10297a);
        try {
            int length = bytes.length;
            mo27001u(length);
            mo26997q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(e);
        }
    }

    /* renamed from: g */
    public abstract int mo26987g();

    /* renamed from: h */
    public abstract void mo26988h(byte b);

    /* renamed from: i */
    public abstract void mo26989i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo26990j(int i, zzje zzje);

    /* renamed from: k */
    public abstract void mo26991k(int i, int i2);

    /* renamed from: l */
    public abstract void mo26992l(int i);

    /* renamed from: m */
    public abstract void mo26993m(int i, long j);

    /* renamed from: n */
    public abstract void mo26994n(long j);

    /* renamed from: o */
    public abstract void mo26995o(int i, int i2);

    /* renamed from: p */
    public abstract void mo26996p(int i);

    /* renamed from: q */
    public abstract void mo26997q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo26998r(int i, String str);

    /* renamed from: s */
    public abstract void mo26999s(int i, int i2);

    /* renamed from: t */
    public abstract void mo27000t(int i, int i2);

    /* renamed from: u */
    public abstract void mo27001u(int i);

    /* renamed from: v */
    public abstract void mo27002v(int i, long j);

    /* renamed from: w */
    public abstract void mo27003w(long j);
}

package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;

/* renamed from: c.q.a.c.g.g.n0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4624n0 {

    /* renamed from: d */
    public static volatile int f9456d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f9457e = 0;

    /* renamed from: a */
    public int f9458a;

    /* renamed from: b */
    public final int f9459b = f9456d;

    /* renamed from: c */
    public C4651o0 f9460c;

    public /* synthetic */ C4624n0(C4597m0 m0Var) {
    }

    /* renamed from: k */
    public static int m12504k(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: l */
    public static long m12505l(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: m */
    public static C4624n0 m12506m(byte[] bArr, int i, int i2, boolean z) {
        C4570l0 l0Var = new C4570l0(bArr, 0, i2, z, (C4543k0) null);
        try {
            l0Var.mo26204b(i2);
            return l0Var;
        } catch (zzadn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo26203a();

    /* renamed from: b */
    public abstract int mo26204b(int i);

    /* renamed from: c */
    public abstract int mo26205c();

    /* renamed from: d */
    public abstract zzacc mo26206d();

    /* renamed from: e */
    public abstract String mo26207e();

    /* renamed from: f */
    public abstract String mo26208f();

    /* renamed from: g */
    public abstract void mo26209g(int i);

    /* renamed from: h */
    public abstract void mo26210h(int i);

    /* renamed from: i */
    public abstract boolean mo26211i();

    /* renamed from: j */
    public abstract boolean mo26212j();
}

package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zzafm;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p040c.p200q.p201a.p264c.p294g.p333g.C4463h1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4544k1;

/* renamed from: c.q.a.c.g.g.k1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4544k1<MessageType extends C4544k1<MessageType, BuilderType>, BuilderType extends C4463h1<MessageType, BuilderType>> extends C4782t<MessageType, BuilderType> {
    public static final Map zzb = new ConcurrentHashMap();
    public C4681p3 zzc = C4681p3.m12775c();
    public int zzd = -1;

    /* renamed from: B */
    public static C4544k1 m12249B(C4544k1 k1Var, zzacc zzacc, C4913y0 y0Var) {
        C4624n0 zzh = zzacc.zzh();
        C4544k1 A = k1Var.mo26148A();
        try {
            C4889x2 b = C4785t2.m13132a().mo26659b(A.getClass());
            b.mo26424j(A, C4651o0.m12574S(zzh), y0Var);
            b.mo26413b(A);
            try {
                zzh.mo26209g(0);
                m12256t(A);
                return A;
            } catch (zzadn e) {
                e.zzh(A);
                throw e;
            }
        } catch (zzadn e2) {
            e2.zzh(A);
            throw e2;
        } catch (zzafm e3) {
            zzadn zza = e3.zza();
            zza.zzh(A);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzadn) {
                throw ((zzadn) e4.getCause());
            }
            zzadn zzadn = new zzadn(e4);
            zzadn.zzh(A);
            throw zzadn;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzadn) {
                throw ((zzadn) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: C */
    public static C4544k1 m12250C(C4544k1 k1Var, byte[] bArr, C4913y0 y0Var) {
        C4544k1 u = m12257u(k1Var, bArr, 0, bArr.length, y0Var);
        m12256t(u);
        return u;
    }

    /* renamed from: D */
    public static C4679p1 m12251D() {
        return C4811u2.m13217f();
    }

    /* renamed from: d */
    public static C4679p1 m12252d(C4679p1 p1Var) {
        int size = p1Var.size();
        return p1Var.mo25771i(size == 0 ? 10 : size + size);
    }

    /* renamed from: e */
    public static Object m12253e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: f */
    public static Object m12254f(C4572l2 l2Var, String str, Object[] objArr) {
        return new C4837v2(l2Var, str, objArr);
    }

    /* renamed from: l */
    public static void m12255l(Class cls, C4544k1 k1Var) {
        zzb.put(cls, k1Var);
        k1Var.mo26151h();
    }

    /* renamed from: t */
    public static C4544k1 m12256t(C4544k1 k1Var) {
        if (k1Var == null || k1Var.mo26156o()) {
            return k1Var;
        }
        zzadn zza = new zzafm(k1Var).zza();
        zza.zzh(k1Var);
        throw zza;
    }

    /* renamed from: u */
    public static C4544k1 m12257u(C4544k1 k1Var, byte[] bArr, int i, int i2, C4913y0 y0Var) {
        C4544k1 A = k1Var.mo26148A();
        try {
            C4889x2 b = C4785t2.m13132a().mo26659b(A.getClass());
            b.mo26422h(A, bArr, 0, i2, new C4860w(y0Var));
            b.mo26413b(A);
            return A;
        } catch (zzadn e) {
            e.zzh(A);
            throw e;
        } catch (zzafm e2) {
            zzadn zza = e2.zza();
            zza.zzh(A);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzadn) {
                throw ((zzadn) e3.getCause());
            }
            zzadn zzadn = new zzadn(e3);
            zzadn.zzh(A);
            throw zzadn;
        } catch (IndexOutOfBoundsException unused) {
            zzadn zzi = zzadn.zzi();
            zzi.zzh(A);
            throw zzi;
        }
    }

    /* renamed from: z */
    public static C4544k1 m12258z(Class cls) {
        C4544k1 k1Var = (C4544k1) zzb.get(cls);
        if (k1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k1Var = (C4544k1) zzb.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (k1Var == null) {
            k1Var = (C4544k1) ((C4544k1) C4916y3.m13554j(cls)).mo25825v(6, (Object) null, (Object) null);
            if (k1Var != null) {
                zzb.put(cls, k1Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return k1Var;
    }

    /* renamed from: A */
    public final C4544k1 mo26148A() {
        return (C4544k1) mo25825v(4, (Object) null, (Object) null);
    }

    /* renamed from: a */
    public final /* synthetic */ C4572l2 mo26048a() {
        return (C4544k1) mo25825v(6, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final int mo26149b(C4889x2 x2Var) {
        if (mo26157p()) {
            int q = mo26158q(x2Var);
            if (q >= 0) {
                return q;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + q);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int q2 = mo26158q(x2Var);
        if (q2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | q2;
            return q2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + q2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4785t2.m13132a().mo26659b(getClass()).mo26421g(this, (C4544k1) obj);
        }
        return false;
    }

    /* renamed from: h */
    public final void mo26151h() {
        C4785t2.m13132a().mo26659b(getClass()).mo26413b(this);
        mo26153k();
    }

    public final int hashCode() {
        if (mo26157p()) {
            return mo26162w();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int w = mo26162w();
        this.zza = w;
        return w;
    }

    /* renamed from: k */
    public final void mo26153k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: m */
    public final void mo26154m(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: n */
    public final int mo26155n() {
        int i;
        if (mo26157p()) {
            i = mo26158q((C4889x2) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = mo26158q((C4889x2) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: o */
    public final boolean mo26156o() {
        byte byteValue = ((Byte) mo25825v(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C4785t2.m13132a().mo26659b(getClass()).mo26415c(this);
        mo25825v(2, true != c ? null : this, (Object) null);
        return c;
    }

    /* renamed from: p */
    public final boolean mo26157p() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: q */
    public final int mo26158q(C4889x2 x2Var) {
        if (x2Var == null) {
            return C4785t2.m13132a().mo26659b(getClass()).mo26419e(this);
        }
        return x2Var.mo26419e(this);
    }

    /* renamed from: r */
    public final /* synthetic */ C4545k2 mo26159r() {
        return (C4463h1) mo25825v(5, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public final void mo26160s(C4783t0 t0Var) {
        C4785t2.m13132a().mo26659b(getClass()).mo26423i(this, C4809u0.m13180l(t0Var));
    }

    public final String toString() {
        return C4626n2.m12517a(this, super.toString());
    }

    /* renamed from: v */
    public abstract Object mo25825v(int i, Object obj, Object obj2);

    /* renamed from: w */
    public final int mo26162w() {
        return C4785t2.m13132a().mo26659b(getClass()).mo26411a(this);
    }

    /* renamed from: x */
    public final C4463h1 mo26163x() {
        return (C4463h1) mo25825v(5, (Object) null, (Object) null);
    }

    /* renamed from: y */
    public final C4463h1 mo26164y() {
        C4463h1 h1Var = (C4463h1) mo25825v(5, (Object) null, (Object) null);
        h1Var.mo26051d(this);
        return h1Var;
    }
}

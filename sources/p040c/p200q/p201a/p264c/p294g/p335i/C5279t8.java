package p040c.p200q.p201a.p264c.p294g.p335i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p040c.p200q.p201a.p264c.p294g.p335i.C5234q8;
import p040c.p200q.p201a.p264c.p294g.p335i.C5279t8;

/* renamed from: c.q.a.c.g.i.t8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5279t8<MessageType extends C5279t8<MessageType, BuilderType>, BuilderType extends C5234q8<MessageType, BuilderType>> extends C5046e7<MessageType, BuilderType> {
    public static final Map zza = new ConcurrentHashMap();
    public C5341xa zzc = C5341xa.m15301c();
    public int zzd = -1;

    /* renamed from: B */
    public static C5279t8 m14954B(Class cls) {
        C5279t8 t8Var = (C5279t8) zza.get(cls);
        if (t8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8Var = (C5279t8) zza.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t8Var == null) {
            t8Var = (C5279t8) ((C5279t8) C5082gb.m14154j(cls)).mo26916C(6, (Object) null, (Object) null);
            if (t8Var != null) {
                zza.put(cls, t8Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return t8Var;
    }

    /* renamed from: k */
    public static C5324w8 m14955k() {
        return C5294u8.m15026g();
    }

    /* renamed from: l */
    public static C5339x8 m14956l() {
        return C5144k9.m14406f();
    }

    /* renamed from: m */
    public static C5339x8 m14957m(C5339x8 x8Var) {
        int size = x8Var.size();
        return x8Var.mo27369n(size == 0 ? 10 : size + size);
    }

    /* renamed from: n */
    public static C5354y8 m14958n() {
        return C5033da.m13980f();
    }

    /* renamed from: p */
    public static C5354y8 m14959p(C5354y8 y8Var) {
        int size = y8Var.size();
        return y8Var.mo27013i(size == 0 ? 10 : size + size);
    }

    /* renamed from: q */
    public static Object m14960q(Method method, Object obj, Object... objArr) {
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

    /* renamed from: r */
    public static Object m14961r(C5295u9 u9Var, String str, Object[] objArr) {
        return new C5049ea(u9Var, str, objArr);
    }

    /* renamed from: u */
    public static void m14962u(Class cls, C5279t8 t8Var) {
        zza.put(cls, t8Var);
        t8Var.mo27720s();
    }

    /* renamed from: C */
    public abstract Object mo26916C(int i, Object obj, Object obj2);

    /* renamed from: b */
    public final void mo27713b(C4999b8 b8Var) {
        C5017ca.m13951a().mo27133b(getClass()).mo27244h(this, C5015c8.m13910K(b8Var));
    }

    /* renamed from: c */
    public final /* synthetic */ C5280t9 mo27714c() {
        return (C5234q8) mo26916C(5, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final int mo27715d() {
        int i;
        if (mo27724w()) {
            i = mo27718i((C5065fa) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = mo27718i((C5065fa) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final /* synthetic */ C5295u9 mo27517e() {
        return (C5279t8) mo26916C(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5017ca.m13951a().mo27133b(getClass()).mo27243g(this, (C5279t8) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final int mo27189f(C5065fa faVar) {
        if (mo27724w()) {
            int i = mo27718i(faVar);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = mo27718i(faVar);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    public final int hashCode() {
        if (mo27724w()) {
            return mo27725x();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int x = mo27725x();
        this.zzb = x;
        return x;
    }

    /* renamed from: i */
    public final int mo27718i(C5065fa faVar) {
        if (faVar == null) {
            return C5017ca.m13951a().mo27133b(getClass()).mo27241e(this);
        }
        return faVar.mo27241e(this);
    }

    /* renamed from: j */
    public final C5279t8 mo27719j() {
        return (C5279t8) mo26916C(4, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public final void mo27720s() {
        C5017ca.m13951a().mo27133b(getClass()).mo27238b(this);
        mo27721t();
    }

    /* renamed from: t */
    public final void mo27721t() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return C5325w9.m15176a(this, super.toString());
    }

    /* renamed from: v */
    public final void mo27723v(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: w */
    public final boolean mo27724w() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: x */
    public final int mo27725x() {
        return C5017ca.m13951a().mo27133b(getClass()).mo27237a(this);
    }

    /* renamed from: y */
    public final C5234q8 mo27726y() {
        return (C5234q8) mo26916C(5, (Object) null, (Object) null);
    }

    /* renamed from: z */
    public final C5234q8 mo27727z() {
        C5234q8 q8Var = (C5234q8) mo26916C(5, (Object) null, (Object) null);
        q8Var.mo27518j(this);
        return q8Var;
    }
}

package p648m.p668e.p680m.p681d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import p648m.p668e.p669j.p672f.p673d.C9716b;

/* renamed from: m.e.m.d.d */
/* compiled from: FrameworkMethod */
public class C9781d extends C9780c<C9781d> {

    /* renamed from: a */
    public final Method f19048a;

    /* renamed from: m.e.m.d.d$a */
    /* compiled from: FrameworkMethod */
    public class C9782a extends C9716b {

        /* renamed from: a */
        public final /* synthetic */ Object f19049a;

        /* renamed from: b */
        public final /* synthetic */ Object[] f19050b;

        public C9782a(Object obj, Object[] objArr) {
            this.f19049a = obj;
            this.f19050b = objArr;
        }

        /* renamed from: b */
        public Object mo50543b() {
            return C9781d.this.f19048a.invoke(this.f19049a, this.f19050b);
        }
    }

    public C9781d(Method method) {
        if (method != null) {
            this.f19048a = method;
            return;
        }
        throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
    }

    /* renamed from: a */
    public Class<?> mo50640a() {
        return this.f19048a.getDeclaringClass();
    }

    /* renamed from: b */
    public int mo50641b() {
        return this.f19048a.getModifiers();
    }

    /* renamed from: c */
    public String mo50642c() {
        return this.f19048a.getName();
    }

    /* renamed from: d */
    public Class<?> mo50643d() {
        return mo50656l();
    }

    public boolean equals(Object obj) {
        if (!C9781d.class.isInstance(obj)) {
            return false;
        }
        return ((C9781d) obj).f19048a.equals(this.f19048a);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return this.f19048a.getAnnotation(cls);
    }

    public Annotation[] getAnnotations() {
        return this.f19048a.getAnnotations();
    }

    public int hashCode() {
        return this.f19048a.hashCode();
    }

    /* renamed from: j */
    public Method mo50654j() {
        return this.f19048a;
    }

    /* renamed from: k */
    public final Class<?>[] mo50655k() {
        return this.f19048a.getParameterTypes();
    }

    /* renamed from: l */
    public Class<?> mo50656l() {
        return this.f19048a.getReturnType();
    }

    /* renamed from: m */
    public Object mo50657m(Object obj, Object... objArr) {
        return new C9782a(obj, objArr).mo50542a();
    }

    /* renamed from: n */
    public boolean mo50644g(C9781d dVar) {
        if (!dVar.mo50642c().equals(mo50642c()) || dVar.mo50655k().length != mo50655k().length) {
            return false;
        }
        for (int i = 0; i < dVar.mo50655k().length; i++) {
            if (!dVar.mo50655k()[i].equals(mo50655k()[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public void mo50659o(boolean z, List<Throwable> list) {
        if (mo50651h() != z) {
            String str = z ? "should" : "should not";
            list.add(new Exception("Method " + this.f19048a.getName() + "() " + str + " be static"));
        }
        if (!mo50649e()) {
            list.add(new Exception("Method " + this.f19048a.getName() + "() should be public"));
        }
        if (this.f19048a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.f19048a.getName() + "() should be void"));
        }
    }

    /* renamed from: p */
    public void mo50660p(boolean z, List<Throwable> list) {
        mo50659o(z, list);
        if (this.f19048a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.f19048a.getName() + " should have no parameters"));
        }
    }

    public String toString() {
        return this.f19048a.toString();
    }
}

package p040c.p151o.p152a.p153a.p157k;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import p040c.p151o.p152a.p153a.C2103f;

/* renamed from: c.o.a.a.k.b */
/* compiled from: IoCContainer */
public class C2130b {

    /* renamed from: a */
    public Map<Class<?>, C2131a> f2097a = new HashMap();

    /* renamed from: a */
    public <I, C extends I> C2130b mo16928a(Class<I> cls, Class<C> cls2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Binding ");
        sb.append(cls.getCanonicalName());
        sb.append(" to ");
        sb.append(cls2.getCanonicalName());
        sb.append(" as ");
        sb.append(z ? "singleton" : "factory");
        C2103f.m3058d("IoCContainer", sb.toString());
        this.f2097a.put(cls, new C2131a(cls2, z));
        return this;
    }

    /* renamed from: b */
    public <I, C extends I> C2130b mo16929b(Class<I> cls, C c) {
        C2103f.m3058d("IoCContainer", "binding " + cls.getCanonicalName() + " to instance (of type " + c.getClass().getCanonicalName() + ")");
        this.f2097a.put(cls, new C2131a(c));
        return this;
    }

    /* renamed from: c */
    public C2130b clone() {
        C2130b bVar = new C2130b();
        bVar.f2097a = new HashMap(this.f2097a);
        return bVar;
    }

    /* renamed from: d */
    public <T> T mo16932d(Class<T> cls) {
        return mo16933e(cls, false);
    }

    /* renamed from: e */
    public <T> T mo16933e(Class<T> cls, boolean z) {
        C2103f.m3058d("IoCContainer", "Trying to create new instance for: " + cls.getCanonicalName());
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors.length == 0) {
            C2103f.m3058d("IoCContainer", "Default constructor - creating instance");
            return cls.newInstance();
        }
        for (Constructor constructor : declaredConstructors) {
            Class[] parameterTypes = constructor.getParameterTypes();
            C2103f.m3058d("IoCContainer", "For constructor with params #: " + parameterTypes.length);
            ArrayList arrayList = new ArrayList();
            int length = parameterTypes.length;
            for (int i = 0; i < length; i++) {
                Class cls2 = parameterTypes[i];
                C2103f.m3058d("IoCContainer", "Getting required param: " + cls2.getCanonicalName());
                Object g = mo16935g(cls2);
                if (g == null && z) {
                    g = mo16932d(cls2);
                }
                if (g == null) {
                    break;
                }
                arrayList.add(g);
            }
            if (arrayList.size() == parameterTypes.length) {
                C2103f.m3058d("IoCContainer", "Creating new instance for " + cls.getCanonicalName());
                if (Modifier.isProtected(constructor.getModifiers())) {
                    C2103f.m3058d("IoCContainer", "Constructor is protected");
                    constructor.setAccessible(true);
                }
                return constructor.newInstance(arrayList.toArray());
            }
            C2103f.m3058d("IoCContainer", "Constructor wasn't suitable");
        }
        throw new MissingResourceException("Concrete class missing dependencies", cls.getName(), "iocContainer");
    }

    /* renamed from: f */
    public void mo16934f() {
        this.f2097a.clear();
        this.f2097a = null;
    }

    /* renamed from: g */
    public <T> T mo16935g(Class<T> cls) {
        C2103f.m3058d("IoCContainer", "Trying to get: " + cls.getCanonicalName());
        if (!mo16936h(cls)) {
            C2103f.m3058d("IoCContainer", "Contract was not registered");
            return null;
        }
        C2131a aVar = this.f2097a.get(cls);
        if (aVar == null) {
            C2103f.m3058d("IoCContainer", "Contract was not registered = null");
            return null;
        }
        T t = aVar.f2100c;
        if (t != null) {
            return t;
        }
        T d = mo16932d(aVar.f2098a);
        if (aVar.f2099b) {
            aVar.f2100c = d;
        }
        return d;
    }

    /* renamed from: h */
    public boolean mo16936h(Class cls) {
        return this.f2097a.containsKey(cls);
    }

    /* renamed from: c.o.a.a.k.b$a */
    /* compiled from: IoCContainer */
    public static class C2131a<T> {

        /* renamed from: a */
        public Class<T> f2098a;

        /* renamed from: b */
        public boolean f2099b;

        /* renamed from: c */
        public T f2100c;

        public C2131a(Class<T> cls, boolean z) {
            this.f2098a = cls;
            this.f2099b = z;
        }

        public C2131a(T t) {
            this.f2098a = t.getClass();
            this.f2099b = true;
            this.f2100c = t;
        }
    }
}

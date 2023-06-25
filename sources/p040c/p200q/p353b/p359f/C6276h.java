package p040c.p200q.p353b.p359f;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;
import okhttp3.HttpUrl;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5839h;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5852o;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6020k1;

/* renamed from: c.q.b.f.h */
/* compiled from: Types */
public final class C6276h {

    /* renamed from: a */
    public static final C5838g<Type, String> f11895a = new C6277a();

    /* renamed from: b */
    public static final C5839h f11896b = C5839h.m16556g(", ").mo28952i("null");

    /* renamed from: c.q.b.f.h$a */
    /* compiled from: Types */
    public static class C6277a implements C5838g<Type, String> {
        /* renamed from: a */
        public String apply(Type type) {
            return C6285e.f11907o.mo30333e(type);
        }
    }

    /* renamed from: c.q.b.f.h$b */
    /* compiled from: Types */
    public static class C6278b extends C6275g {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f11897b;

        public C6278b(AtomicReference atomicReference) {
            this.f11897b = atomicReference;
        }

        /* renamed from: b */
        public void mo30305b(Class<?> cls) {
            this.f11897b.set(cls.getComponentType());
        }

        /* renamed from: c */
        public void mo30306c(GenericArrayType genericArrayType) {
            this.f11897b.set(genericArrayType.getGenericComponentType());
        }

        /* renamed from: e */
        public void mo30308e(TypeVariable<?> typeVariable) {
            this.f11897b.set(C6276h.m17677q(typeVariable.getBounds()));
        }

        /* renamed from: f */
        public void mo30309f(WildcardType wildcardType) {
            this.f11897b.set(C6276h.m17677q(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: c.q.b.f.h$c */
    /* compiled from: Types */
    public enum C6279c {
        OWNED_BY_ENCLOSING_CLASS {
            /* renamed from: d */
            public Class<?> mo30326d(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* renamed from: d */
            public Class<?> mo30326d(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: m */
        public static final C6279c f11900m = null;

        /* renamed from: c.q.b.f.h$c$b */
        /* compiled from: Types */
        public class C6281b<T> {
        }

        /* renamed from: c.q.b.f.h$c$d */
        /* compiled from: Types */
        public static class C6283d extends C6281b<String> {
        }

        /* access modifiers changed from: public */
        static {
            f11900m = m17686c();
        }

        /* renamed from: c */
        public static C6279c m17686c() {
            ParameterizedType parameterizedType = (ParameterizedType) C6283d.class.getGenericSuperclass();
            for (C6279c cVar : values()) {
                if (cVar.mo30326d(C6281b.class) == parameterizedType.getOwnerType()) {
                    return cVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: d */
        public abstract Class<?> mo30326d(Class<?> cls);
    }

    /* renamed from: c.q.b.f.h$d */
    /* compiled from: Types */
    public static final class C6284d implements GenericArrayType, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Type f11902e;

        public C6284d(Type type) {
            this.f11902e = C6285e.f11907o.mo30335h(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C5845j.m16576a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        public Type getGenericComponentType() {
            return this.f11902e;
        }

        public int hashCode() {
            return this.f11902e.hashCode();
        }

        public String toString() {
            return C6276h.m17680t(this.f11902e) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: c.q.b.f.h$e */
    /* compiled from: Types */
    public enum C6285e {
        JAVA6 {
            /* renamed from: h */
            public Type mo30335h(Type type) {
                C5850m.m16594o(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C6284d(cls.getComponentType()) : type;
            }

            /* renamed from: i */
            public GenericArrayType mo30332d(Type type) {
                return new C6284d(type);
            }
        },
        JAVA7 {
            /* renamed from: d */
            public Type mo30332d(Type type) {
                if (type instanceof Class) {
                    return C6276h.m17669i((Class) type);
                }
                return new C6284d(type);
            }

            /* renamed from: h */
            public Type mo30335h(Type type) {
                C5850m.m16594o(type);
                return type;
            }
        },
        JAVA8 {
            /* renamed from: d */
            public Type mo30332d(Type type) {
                return C6285e.JAVA7.mo30332d(type);
            }

            /* renamed from: e */
            public String mo30333e(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }

            /* renamed from: h */
            public Type mo30335h(Type type) {
                return C6285e.JAVA7.mo30335h(type);
            }
        },
        JAVA9 {
            /* renamed from: c */
            public boolean mo30331c() {
                return false;
            }

            /* renamed from: d */
            public Type mo30332d(Type type) {
                return C6285e.JAVA8.mo30332d(type);
            }

            /* renamed from: e */
            public String mo30333e(Type type) {
                return C6285e.JAVA8.mo30333e(type);
            }

            /* renamed from: h */
            public Type mo30335h(Type type) {
                return C6285e.JAVA8.mo30335h(type);
            }
        };
        

        /* renamed from: o */
        public static final C6285e f11907o = null;

        /* renamed from: c.q.b.f.h$e$e */
        /* compiled from: Types */
        public static class C6290e extends C6265d<Map.Entry<String, int[][]>> {
        }

        /* renamed from: c.q.b.f.h$e$f */
        /* compiled from: Types */
        public static class C6291f extends C6265d<int[]> {
        }

        /* renamed from: c */
        public boolean mo30331c() {
            return true;
        }

        /* renamed from: d */
        public abstract Type mo30332d(Type type);

        /* renamed from: e */
        public String mo30333e(Type type) {
            return C6276h.m17680t(type);
        }

        /* renamed from: g */
        public final ImmutableList<Type> mo30334g(Type[] typeArr) {
            ImmutableList.C8100a builder = ImmutableList.builder();
            for (Type h : typeArr) {
                builder.mo36637h(mo30335h(h));
            }
            return builder.mo36639j();
        }

        /* renamed from: h */
        public abstract Type mo30335h(Type type);
    }

    /* renamed from: c.q.b.f.h$f */
    /* compiled from: Types */
    public static final class C6292f<X> {

        /* renamed from: a */
        public static final boolean f11909a;

        static {
            Class<C6292f> cls = C6292f.class;
            f11909a = !cls.getTypeParameters()[0].equals(C6276h.m17672l(cls, "X", new Type[0]));
        }
    }

    /* renamed from: c.q.b.f.h$g */
    /* compiled from: Types */
    public static final class C6293g implements ParameterizedType, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Type f11910e;

        /* renamed from: l */
        public final ImmutableList<Type> f11911l;

        /* renamed from: m */
        public final Class<?> f11912m;

        public C6293g(Type type, Class<?> cls, Type[] typeArr) {
            C5850m.m16594o(cls);
            C5850m.m16583d(typeArr.length == cls.getTypeParameters().length);
            C6276h.m17667g(typeArr, "type parameter");
            this.f11910e = type;
            this.f11912m = cls;
            this.f11911l = C6285e.f11907o.mo30334g(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !C5845j.m16576a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return C6276h.m17679s(this.f11911l);
        }

        public Type getOwnerType() {
            return this.f11910e;
        }

        public Type getRawType() {
            return this.f11912m;
        }

        public int hashCode() {
            Type type = this.f11910e;
            return ((type == null ? 0 : type.hashCode()) ^ this.f11911l.hashCode()) ^ this.f11912m.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f11910e != null && C6285e.f11907o.mo30331c()) {
                sb.append(C6285e.f11907o.mo30333e(this.f11910e));
                sb.append('.');
            }
            sb.append(this.f11912m.getName());
            sb.append(Typography.less);
            sb.append(C6276h.f11896b.mo28948c(C6020k1.m16927n(this.f11911l, C6276h.f11895a)));
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    /* renamed from: c.q.b.f.h$h */
    /* compiled from: Types */
    public static final class C6294h<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f11913a;

        /* renamed from: b */
        public final String f11914b;

        /* renamed from: c */
        public final ImmutableList<Type> f11915c;

        public C6294h(D d, String str, Type[] typeArr) {
            C6276h.m17667g(typeArr, "bound for type variable");
            C5850m.m16594o(d);
            this.f11913a = (GenericDeclaration) d;
            C5850m.m16594o(str);
            this.f11914b = str;
            this.f11915c = ImmutableList.copyOf((E[]) typeArr);
        }

        /* renamed from: a */
        public D mo30343a() {
            return this.f11913a;
        }

        /* renamed from: b */
        public String mo30344b() {
            return this.f11914b;
        }

        public boolean equals(Object obj) {
            if (C6292f.f11909a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C6295i)) {
                    return false;
                }
                C6294h a = ((C6295i) Proxy.getInvocationHandler(obj)).f11917a;
                if (!this.f11914b.equals(a.mo30344b()) || !this.f11913a.equals(a.mo30343a()) || !this.f11915c.equals(a.f11915c)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f11914b.equals(typeVariable.getName()) || !this.f11913a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            return this.f11913a.hashCode() ^ this.f11914b.hashCode();
        }

        public String toString() {
            return this.f11914b;
        }
    }

    /* renamed from: c.q.b.f.h$i */
    /* compiled from: Types */
    public static final class C6295i implements InvocationHandler {

        /* renamed from: b */
        public static final ImmutableMap<String, Method> f11916b;

        /* renamed from: a */
        public final C6294h<?> f11917a;

        static {
            Class<C6294h> cls = C6294h.class;
            ImmutableMap.C8107b builder = ImmutableMap.builder();
            for (Method method : cls.getMethods()) {
                if (method.getDeclaringClass().equals(cls)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.mo36595c(method.getName(), method);
                }
            }
            f11916b = builder.mo36594a();
        }

        public C6295i(C6294h<?> hVar) {
            this.f11917a = hVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Method method2 = f11916b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f11917a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* renamed from: c.q.b.f.h$j */
    /* compiled from: Types */
    public static final class C6296j implements WildcardType, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableList<Type> f11918e;

        /* renamed from: l */
        public final ImmutableList<Type> f11919l;

        public C6296j(Type[] typeArr, Type[] typeArr2) {
            C6276h.m17667g(typeArr, "lower bound for wildcard");
            C6276h.m17667g(typeArr2, "upper bound for wildcard");
            this.f11918e = C6285e.f11907o.mo30334g(typeArr);
            this.f11919l = C6285e.f11907o.mo30334g(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f11918e.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f11919l.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            return C6276h.m17679s(this.f11918e);
        }

        public Type[] getUpperBounds() {
            return C6276h.m17679s(this.f11919l);
        }

        public int hashCode() {
            return this.f11918e.hashCode() ^ this.f11919l.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            C5991h3<Type> it = this.f11918e.iterator();
            while (it.hasNext()) {
                sb.append(" super ");
                sb.append(C6285e.f11907o.mo30333e(it.next()));
            }
            for (Type e : C6276h.m17668h(this.f11919l)) {
                sb.append(" extends ");
                sb.append(C6285e.f11907o.mo30333e(e));
            }
            return sb.toString();
        }
    }

    /* renamed from: g */
    public static void m17667g(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C5850m.m16590k(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }

    /* renamed from: h */
    public static Iterable<Type> m17668h(Iterable<Type> iterable) {
        return C6020k1.m16917d(iterable, C5852o.m16609f(C5852o.m16606c(Object.class)));
    }

    /* renamed from: i */
    public static Class<?> m17669i(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: j */
    public static Type m17670j(Type type) {
        C5850m.m16594o(type);
        AtomicReference atomicReference = new AtomicReference();
        new C6278b(atomicReference).mo30324a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: k */
    public static Type m17671k(Type type) {
        if (!(type instanceof WildcardType)) {
            return C6285e.f11907o.mo30332d(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        C5850m.m16584e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m17678r(m17671k(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        C5850m.m16584e(z, "Wildcard should have only one upper bound.");
        return m17676p(m17671k(upperBounds[0]));
    }

    /* renamed from: l */
    public static <D extends GenericDeclaration> TypeVariable<D> m17672l(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m17675o(d, str, typeArr);
    }

    /* renamed from: m */
    public static ParameterizedType m17673m(Class<?> cls, Type... typeArr) {
        return new C6293g(C6279c.f11900m.mo30326d(cls), cls, typeArr);
    }

    /* renamed from: n */
    public static ParameterizedType m17674n(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m17673m(cls, typeArr);
        }
        C5850m.m16594o(typeArr);
        C5850m.m16589j(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new C6293g(type, cls, typeArr);
    }

    /* renamed from: o */
    public static <D extends GenericDeclaration> TypeVariable<D> m17675o(D d, String str, Type[] typeArr) {
        return (TypeVariable) C6264c.m17615a(TypeVariable.class, new C6295i(new C6294h(d, str, typeArr)));
    }

    /* renamed from: p */
    public static WildcardType m17676p(Type type) {
        return new C6296j(new Type[0], new Type[]{type});
    }

    /* renamed from: q */
    public static Type m17677q(Type[] typeArr) {
        for (Type j : typeArr) {
            Type j2 = m17670j(j);
            if (j2 != null) {
                if (j2 instanceof Class) {
                    Class cls = (Class) j2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m17676p(j2);
            }
        }
        return null;
    }

    /* renamed from: r */
    public static WildcardType m17678r(Type type) {
        return new C6296j(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: s */
    public static Type[] m17679s(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* renamed from: t */
    public static String m17680t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

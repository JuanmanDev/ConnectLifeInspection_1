package p040c.p200q.p353b.p359f;

import com.google.common.collect.ImmutableMap;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;
import p040c.p200q.p353b.p354a.C5839h;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p359f.C6276h;

/* renamed from: c.q.b.f.f */
/* compiled from: TypeResolver */
public final class C6267f {

    /* renamed from: a */
    public final C6270c f11883a;

    /* renamed from: c.q.b.f.f$a */
    /* compiled from: TypeResolver */
    public static class C6268a extends C6275g {

        /* renamed from: b */
        public final /* synthetic */ Map f11884b;

        /* renamed from: c */
        public final /* synthetic */ Type f11885c;

        public C6268a(Map map, Type type) {
            this.f11884b = map;
            this.f11885c = type;
        }

        /* renamed from: b */
        public void mo30305b(Class<?> cls) {
            if (!(this.f11885c instanceof WildcardType)) {
                throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f11885c);
            }
        }

        /* renamed from: c */
        public void mo30306c(GenericArrayType genericArrayType) {
            Type type = this.f11885c;
            if (!(type instanceof WildcardType)) {
                Type j = C6276h.m17670j(type);
                C5850m.m16589j(j != null, "%s is not an array type.", this.f11885c);
                C6267f.m17622g(this.f11884b, genericArrayType.getGenericComponentType(), j);
            }
        }

        /* renamed from: d */
        public void mo30307d(ParameterizedType parameterizedType) {
            Type type = this.f11885c;
            if (!(type instanceof WildcardType)) {
                ParameterizedType parameterizedType2 = (ParameterizedType) C6267f.m17620e(ParameterizedType.class, type);
                if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                    C6267f.m17622g(this.f11884b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                }
                C5850m.m16590k(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f11885c);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                C5850m.m16590k(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    C6267f.m17622g(this.f11884b, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }
        }

        /* renamed from: e */
        public void mo30308e(TypeVariable<?> typeVariable) {
            this.f11884b.put(new C6272d(typeVariable), this.f11885c);
        }

        /* renamed from: f */
        public void mo30309f(WildcardType wildcardType) {
            Type type = this.f11885c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                C5850m.m16590k(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f11885c);
                for (int i = 0; i < upperBounds.length; i++) {
                    C6267f.m17622g(this.f11884b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    C6267f.m17622g(this.f11884b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* renamed from: c.q.b.f.f$b */
    /* compiled from: TypeResolver */
    public static final class C6269b extends C6275g {

        /* renamed from: b */
        public final Map<C6272d, Type> f11886b = C6108q1.m17179o();

        /* renamed from: g */
        public static ImmutableMap<C6272d, Type> m17636g(Type type) {
            C5850m.m16594o(type);
            C6269b bVar = new C6269b();
            bVar.mo30324a(type);
            return ImmutableMap.copyOf(bVar.f11886b);
        }

        /* renamed from: b */
        public void mo30305b(Class<?> cls) {
            mo30324a(cls.getGenericSuperclass());
            mo30324a(cls.getGenericInterfaces());
        }

        /* renamed from: d */
        public void mo30307d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C5850m.m16600u(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                mo30310h(new C6272d(typeParameters[i]), actualTypeArguments[i]);
            }
            mo30324a(cls);
            mo30324a(parameterizedType.getOwnerType());
        }

        /* renamed from: e */
        public void mo30308e(TypeVariable<?> typeVariable) {
            mo30324a(typeVariable.getBounds());
        }

        /* renamed from: f */
        public void mo30309f(WildcardType wildcardType) {
            mo30324a(wildcardType.getUpperBounds());
        }

        /* renamed from: h */
        public final void mo30310h(C6272d dVar, Type type) {
            if (!this.f11886b.containsKey(dVar)) {
                Type type2 = type;
                while (type2 != null) {
                    if (dVar.mo30314a(type2)) {
                        while (type != null) {
                            type = this.f11886b.remove(C6272d.m17646c(type));
                        }
                        return;
                    }
                    type2 = this.f11886b.get(C6272d.m17646c(type2));
                }
                this.f11886b.put(dVar, type);
            }
        }
    }

    /* renamed from: c.q.b.f.f$d */
    /* compiled from: TypeResolver */
    public static final class C6272d {

        /* renamed from: a */
        public final TypeVariable<?> f11890a;

        public C6272d(TypeVariable<?> typeVariable) {
            C5850m.m16594o(typeVariable);
            this.f11890a = typeVariable;
        }

        /* renamed from: c */
        public static C6272d m17646c(Type type) {
            if (type instanceof TypeVariable) {
                return new C6272d((TypeVariable) type);
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo30314a(Type type) {
            if (type instanceof TypeVariable) {
                return mo30315b((TypeVariable) type);
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo30315b(TypeVariable<?> typeVariable) {
            return this.f11890a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f11890a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6272d) {
                return mo30315b(((C6272d) obj).f11890a);
            }
            return false;
        }

        public int hashCode() {
            return C5845j.m16577b(this.f11890a.getGenericDeclaration(), this.f11890a.getName());
        }

        public String toString() {
            return this.f11890a.toString();
        }
    }

    /* renamed from: c.q.b.f.f$e */
    /* compiled from: TypeResolver */
    public static class C6273e {

        /* renamed from: b */
        public static final C6273e f11891b = new C6273e();

        /* renamed from: a */
        public final AtomicInteger f11892a;

        /* renamed from: c.q.b.f.f$e$a */
        /* compiled from: TypeResolver */
        public class C6274a extends C6273e {

            /* renamed from: c */
            public final /* synthetic */ TypeVariable f11893c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6274a(C6273e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, (C6268a) null);
                this.f11893c = typeVariable;
            }

            /* renamed from: b */
            public TypeVariable<?> mo30320b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f11893c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo30320b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ C6273e(AtomicInteger atomicInteger, C6268a aVar) {
            this(atomicInteger);
        }

        /* renamed from: a */
        public final Type mo30319a(Type type) {
            C5850m.m16594o(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C6276h.m17671k(mo30323e().mo30319a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = mo30322d(typeParameters[i]).mo30319a(actualTypeArguments[i]);
                }
                return C6276h.m17674n(mo30323e().mo30321c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? mo30320b(wildcardType.getUpperBounds()) : type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* renamed from: b */
        public TypeVariable<?> mo30320b(Type[] typeArr) {
            return C6276h.m17672l(C6273e.class, "capture#" + this.f11892a.incrementAndGet() + "-of ? extends " + C5839h.m16555f(Typography.amp).mo28950e(typeArr), typeArr);
        }

        /* renamed from: c */
        public final Type mo30321c(Type type) {
            if (type == null) {
                return null;
            }
            return mo30319a(type);
        }

        /* renamed from: d */
        public final C6273e mo30322d(TypeVariable<?> typeVariable) {
            return new C6274a(this, this.f11892a, typeVariable);
        }

        /* renamed from: e */
        public final C6273e mo30323e() {
            return new C6273e(this.f11892a);
        }

        public C6273e() {
            this(new AtomicInteger());
        }

        public C6273e(AtomicInteger atomicInteger) {
            this.f11892a = atomicInteger;
        }
    }

    public /* synthetic */ C6267f(C6270c cVar, C6268a aVar) {
        this(cVar);
    }

    /* renamed from: d */
    public static C6267f m17619d(Type type) {
        return new C6267f().mo30304o(C6269b.m17636g(type));
    }

    /* renamed from: e */
    public static <T> T m17620e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    /* renamed from: f */
    public static C6267f m17621f(Type type) {
        return new C6267f().mo30304o(C6269b.m17636g(C6273e.f11891b.mo30319a(type)));
    }

    /* renamed from: g */
    public static void m17622g(Map<C6272d, Type> map, Type type, Type type2) {
        if (!type.equals(type2)) {
            new C6268a(map, type2).mo30324a(type);
        }
    }

    /* renamed from: h */
    public final Type mo30297h(GenericArrayType genericArrayType) {
        return C6276h.m17671k(mo30299j(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: i */
    public final ParameterizedType mo30298i(ParameterizedType parameterizedType) {
        Type type;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            type = null;
        } else {
            type = mo30299j(ownerType);
        }
        return C6276h.m17674n(type, (Class) mo30299j(parameterizedType.getRawType()), mo30300k(parameterizedType.getActualTypeArguments()));
    }

    /* renamed from: j */
    public Type mo30299j(Type type) {
        C5850m.m16594o(type);
        if (type instanceof TypeVariable) {
            return this.f11883a.mo30311a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return mo30298i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return mo30297h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? mo30302m((WildcardType) type) : type;
    }

    /* renamed from: k */
    public final Type[] mo30300k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo30299j(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: l */
    public Type[] mo30301l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = mo30299j(typeArr[i]);
        }
        return typeArr;
    }

    /* renamed from: m */
    public final WildcardType mo30302m(WildcardType wildcardType) {
        return new C6276h.C6296j(mo30300k(wildcardType.getLowerBounds()), mo30300k(wildcardType.getUpperBounds()));
    }

    /* renamed from: n */
    public C6267f mo30303n(Type type, Type type2) {
        HashMap o = C6108q1.m17179o();
        C5850m.m16594o(type);
        C5850m.m16594o(type2);
        m17622g(o, type, type2);
        return mo30304o(o);
    }

    /* renamed from: o */
    public C6267f mo30304o(Map<C6272d, ? extends Type> map) {
        return new C6267f(this.f11883a.mo30313c(map));
    }

    /* renamed from: c.q.b.f.f$c */
    /* compiled from: TypeResolver */
    public static class C6270c {

        /* renamed from: a */
        public final ImmutableMap<C6272d, Type> f11887a;

        /* renamed from: c.q.b.f.f$c$a */
        /* compiled from: TypeResolver */
        public class C6271a extends C6270c {

            /* renamed from: b */
            public final /* synthetic */ TypeVariable f11888b;

            /* renamed from: c */
            public final /* synthetic */ C6270c f11889c;

            public C6271a(C6270c cVar, TypeVariable typeVariable, C6270c cVar2) {
                this.f11888b = typeVariable;
                this.f11889c = cVar2;
            }

            /* renamed from: b */
            public Type mo30312b(TypeVariable<?> typeVariable, C6270c cVar) {
                if (typeVariable.getGenericDeclaration().equals(this.f11888b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f11889c.mo30312b(typeVariable, cVar);
            }
        }

        public C6270c() {
            this.f11887a = ImmutableMap.m22184of();
        }

        /* renamed from: a */
        public final Type mo30311a(TypeVariable<?> typeVariable) {
            return mo30312b(typeVariable, new C6271a(this, typeVariable, this));
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.reflect.Type, java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.reflect.Type mo30312b(java.lang.reflect.TypeVariable<?> r4, p040c.p200q.p353b.p359f.C6267f.C6270c r5) {
            /*
                r3 = this;
                com.google.common.collect.ImmutableMap<c.q.b.f.f$d, java.lang.reflect.Type> r0 = r3.f11887a
                c.q.b.f.f$d r1 = new c.q.b.f.f$d
                r1.<init>(r4)
                java.lang.Object r0 = r0.get(r1)
                java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
                r1 = 0
                if (r0 != 0) goto L_0x0039
                java.lang.reflect.Type[] r0 = r4.getBounds()
                int r2 = r0.length
                if (r2 != 0) goto L_0x0018
                return r4
            L_0x0018:
                c.q.b.f.f r2 = new c.q.b.f.f
                r2.<init>(r5, r1)
                java.lang.reflect.Type[] r5 = r2.mo30300k(r0)
                boolean r1 = p040c.p200q.p353b.p359f.C6276h.C6292f.f11909a
                if (r1 == 0) goto L_0x002c
                boolean r0 = java.util.Arrays.equals(r0, r5)
                if (r0 == 0) goto L_0x002c
                return r4
            L_0x002c:
                java.lang.reflect.GenericDeclaration r0 = r4.getGenericDeclaration()
                java.lang.String r4 = r4.getName()
                java.lang.reflect.TypeVariable r4 = p040c.p200q.p353b.p359f.C6276h.m17672l(r0, r4, r5)
                return r4
            L_0x0039:
                c.q.b.f.f r4 = new c.q.b.f.f
                r4.<init>(r5, r1)
                java.lang.reflect.Type r4 = r4.mo30299j(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p359f.C6267f.C6270c.mo30312b(java.lang.reflect.TypeVariable, c.q.b.f.f$c):java.lang.reflect.Type");
        }

        /* renamed from: c */
        public final C6270c mo30313c(Map<C6272d, ? extends Type> map) {
            ImmutableMap.C8107b builder = ImmutableMap.builder();
            builder.mo36598f(this.f11887a);
            for (Map.Entry next : map.entrySet()) {
                C6272d dVar = (C6272d) next.getKey();
                Type type = (Type) next.getValue();
                C5850m.m16589j(!dVar.mo30314a(type), "Type variable %s bound to itself", dVar);
                builder.mo36595c(dVar, type);
            }
            return new C6270c(builder.mo36594a());
        }

        public C6270c(ImmutableMap<C6272d, Type> immutableMap) {
            this.f11887a = immutableMap;
        }
    }

    public C6267f() {
        this.f11883a = new C6270c();
    }

    public C6267f(C6270c cVar) {
        this.f11883a = cVar;
    }
}

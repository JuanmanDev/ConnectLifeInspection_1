package com.google.common.reflect;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5839h;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6041m0;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6167v0;
import p040c.p200q.p353b.p355b.C6205z1;
import p040c.p200q.p353b.p358e.C6254e;
import p040c.p200q.p353b.p359f.C6261b;
import p040c.p200q.p353b.p359f.C6265d;
import p040c.p200q.p353b.p359f.C6266e;
import p040c.p200q.p353b.p359f.C6267f;
import p040c.p200q.p353b.p359f.C6275g;
import p040c.p200q.p353b.p359f.C6276h;

public abstract class TypeToken<T> extends C6265d<T> implements Serializable {
    public static final long serialVersionUID = 3637540370352322684L;
    public transient C6267f covariantTypeResolver;
    public transient C6267f invariantTypeResolver;
    public final Type runtimeType;

    /* renamed from: com.google.common.reflect.TypeToken$a */
    public class C8215a extends C6261b.C6263b<T> {
        public C8215a(Method method) {
            super(method);
        }

        /* renamed from: a */
        public TypeToken<T> mo30278a() {
            return TypeToken.this;
        }

        public String toString() {
            return mo30278a() + MAPCookie.DOT + super.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$b */
    public class C8216b extends C6261b.C6262a<T> {
        public C8216b(Constructor constructor) {
            super(constructor);
        }

        /* renamed from: a */
        public TypeToken<T> mo30278a() {
            return TypeToken.this;
        }

        /* renamed from: b */
        public Type[] mo30292b() {
            C6267f access$100 = TypeToken.this.getInvariantTypeResolver();
            Type[] b = super.mo30292b();
            access$100.mo30301l(b);
            return b;
        }

        public String toString() {
            return mo30278a() + "(" + C5839h.m16556g(", ").mo28950e(mo30292b()) + ")";
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$c */
    public class C8217c extends C6275g {
        public C8217c() {
        }

        /* renamed from: c */
        public void mo30306c(GenericArrayType genericArrayType) {
            mo30324a(genericArrayType.getGenericComponentType());
        }

        /* renamed from: d */
        public void mo30307d(ParameterizedType parameterizedType) {
            mo30324a(parameterizedType.getActualTypeArguments());
            mo30324a(parameterizedType.getOwnerType());
        }

        /* renamed from: e */
        public void mo30308e(TypeVariable<?> typeVariable) {
            throw new IllegalArgumentException(TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        /* renamed from: f */
        public void mo30309f(WildcardType wildcardType) {
            mo30324a(wildcardType.getLowerBounds());
            mo30324a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$d */
    public class C8218d extends C6275g {

        /* renamed from: b */
        public final /* synthetic */ ImmutableSet.C8138a f15294b;

        public C8218d(TypeToken typeToken, ImmutableSet.C8138a aVar) {
            this.f15294b = aVar;
        }

        /* renamed from: b */
        public void mo30305b(Class<?> cls) {
            this.f15294b.mo36621a(cls);
        }

        /* renamed from: c */
        public void mo30306c(GenericArrayType genericArrayType) {
            this.f15294b.mo36621a(C6276h.m17669i(TypeToken.m22536of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        /* renamed from: d */
        public void mo30307d(ParameterizedType parameterizedType) {
            this.f15294b.mo36621a((Class) parameterizedType.getRawType());
        }

        /* renamed from: e */
        public void mo30308e(TypeVariable<?> typeVariable) {
            mo30324a(typeVariable.getBounds());
        }

        /* renamed from: f */
        public void mo30309f(WildcardType wildcardType) {
            mo30324a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$e */
    public static class C8219e {

        /* renamed from: a */
        public final Type[] f15295a;

        /* renamed from: b */
        public final boolean f15296b;

        public C8219e(Type[] typeArr, boolean z) {
            this.f15295a = typeArr;
            this.f15296b = z;
        }

        /* renamed from: a */
        public boolean mo37219a(Type type) {
            for (Type of : this.f15295a) {
                boolean isSubtypeOf = TypeToken.m22536of(of).isSubtypeOf(type);
                boolean z = this.f15296b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f15296b;
        }

        /* renamed from: b */
        public boolean mo37220b(Type type) {
            TypeToken<?> of = TypeToken.m22536of(type);
            for (Type isSubtypeOf : this.f15295a) {
                boolean isSubtypeOf2 = of.isSubtypeOf(isSubtypeOf);
                boolean z = this.f15296b;
                if (isSubtypeOf2 == z) {
                    return z;
                }
            }
            return !this.f15296b;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$f */
    public final class C8220f extends TypeToken<T>.TypeSet {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public transient ImmutableSet<TypeToken<? super T>> f15297e;

        public C8220f() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf(C8224i.f15303b.mo37222a().mo37224c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ C8220f(TypeToken typeToken, C8215a aVar) {
            this();
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f15297e;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<?>> o = C6041m0.m16962k(C8224i.f15302a.mo37222a().mo37225d(TypeToken.this)).mo29630g(C8230j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo29632o();
            this.f15297e = o;
            return o;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$h */
    public static final class C8223h<T> extends TypeToken<T> {
        public static final long serialVersionUID = 0;

        public C8223h(Type type) {
            super(type, (C8215a) null);
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$i */
    public static abstract class C8224i<K> {

        /* renamed from: a */
        public static final C8224i<TypeToken<?>> f15302a = new C8225a();

        /* renamed from: b */
        public static final C8224i<Class<?>> f15303b = new C8226b();

        /* renamed from: com.google.common.reflect.TypeToken$i$a */
        public static class C8225a extends C8224i<TypeToken<?>> {
            public C8225a() {
                super((C8215a) null);
            }

            /* renamed from: i */
            public Iterable<? extends TypeToken<?>> mo37226e(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            /* renamed from: j */
            public Class<?> mo37227f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* renamed from: k */
            public TypeToken<?> mo37228g(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$i$b */
        public static class C8226b extends C8224i<Class<?>> {
            public C8226b() {
                super((C8215a) null);
            }

            /* renamed from: f */
            public /* bridge */ /* synthetic */ Class mo37227f(Object obj) {
                Class cls = (Class) obj;
                mo37233j(cls);
                return cls;
            }

            /* renamed from: i */
            public Iterable<? extends Class<?>> mo37226e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* renamed from: j */
            public Class<?> mo37233j(Class<?> cls) {
                return cls;
            }

            /* renamed from: k */
            public Class<?> mo37228g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$i$c */
        public class C8227c extends C8229e<K> {
            public C8227c(C8224i iVar, C8224i iVar2) {
                super(iVar2);
            }

            /* renamed from: c */
            public ImmutableList<K> mo37224c(Iterable<? extends K> iterable) {
                ImmutableList.C8100a builder = ImmutableList.builder();
                for (Object next : iterable) {
                    if (!mo37227f(next).isInterface()) {
                        builder.mo36637h(next);
                    }
                }
                return super.mo37224c(builder.mo36639j());
            }

            /* renamed from: e */
            public Iterable<? extends K> mo37226e(K k) {
                return ImmutableSet.m22254of();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$i$d */
        public static class C8228d extends C6205z1<K> {

            /* renamed from: e */
            public final /* synthetic */ Comparator f15304e;

            /* renamed from: l */
            public final /* synthetic */ Map f15305l;

            public C8228d(Comparator comparator, Map map) {
                this.f15304e = comparator;
                this.f15305l = map;
            }

            public int compare(K k, K k2) {
                return this.f15304e.compare(this.f15305l.get(k), this.f15305l.get(k2));
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$i$e */
        public static class C8229e<K> extends C8224i<K> {

            /* renamed from: c */
            public final C8224i<K> f15306c;

            public C8229e(C8224i<K> iVar) {
                super((C8215a) null);
                this.f15306c = iVar;
            }

            /* renamed from: f */
            public Class<?> mo37227f(K k) {
                return this.f15306c.mo37227f(k);
            }

            /* renamed from: g */
            public K mo37228g(K k) {
                return this.f15306c.mo37228g(k);
            }
        }

        public C8224i() {
        }

        /* renamed from: h */
        public static <K, V> ImmutableList<K> m22552h(Map<K, V> map, Comparator<? super V> comparator) {
            return new C8228d(comparator, map).mo30152b(map.keySet());
        }

        /* renamed from: a */
        public final C8224i<K> mo37222a() {
            return new C8227c(this, this);
        }

        /* renamed from: b */
        public final int mo37223b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo37227f(k).isInterface();
            for (Object b : mo37226e(k)) {
                isInterface = Math.max(isInterface, mo37223b(b, map));
            }
            Object g = mo37228g(k);
            if (g != null) {
                isInterface = Math.max(isInterface, mo37223b(g, map));
            }
            int i = isInterface + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        /* renamed from: c */
        public ImmutableList<K> mo37224c(Iterable<? extends K> iterable) {
            HashMap o = C6108q1.m17179o();
            for (Object b : iterable) {
                mo37223b(b, o);
            }
            return m22552h(o, C6205z1.m17455e().mo29701h());
        }

        /* renamed from: d */
        public final ImmutableList<K> mo37225d(K k) {
            return mo37224c(ImmutableList.m22153of(k));
        }

        /* renamed from: e */
        public abstract Iterable<? extends K> mo37226e(K k);

        /* renamed from: f */
        public abstract Class<?> mo37227f(K k);

        /* renamed from: g */
        public abstract K mo37228g(K k);

        public /* synthetic */ C8224i(C8215a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$j */
    public enum C8230j implements C5851n<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* renamed from: c */
            public boolean apply(TypeToken<?> typeToken) {
                return !(typeToken.runtimeType instanceof TypeVariable) && !(typeToken.runtimeType instanceof WildcardType);
            }
        },
        INTERFACE_ONLY {
            /* renamed from: c */
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        };
    }

    public /* synthetic */ TypeToken(Type type, C8215a aVar) {
        this(type);
    }

    public static C8219e any(Type[] typeArr) {
        return new C8219e(typeArr, true);
    }

    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<?> of = m22536of(type);
        if (of.getRawType().isInterface()) {
            return null;
        }
        return of;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.C8100a builder = ImmutableList.builder();
        for (Type of : typeArr) {
            TypeToken<?> of2 = m22536of(of);
            if (of2.getRawType().isInterface()) {
                builder.mo36637h(of2);
            }
        }
        return builder.mo36639j();
    }

    public static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        if (type instanceof WildcardType) {
            return canonicalizeWildcardType(typeVariable, (WildcardType) type);
        }
        return canonicalizeWildcardsInType(type);
    }

    public static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).mo37219a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new C6276h.C6296j(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    public static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return C6276h.m17674n(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    public static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? C6276h.m17671k(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    public static C8219e every(Type[] typeArr) {
        return new C8219e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        return m22536of(newArrayClassOrGenericArrayType(getComponentType().getSubtype(cls.getComponentType()).runtimeType));
    }

    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        C5850m.m16596q(componentType, "%s isn't a super type of %s", cls, this);
        return m22536of(newArrayClassOrGenericArrayType(componentType.getSupertype(cls.getComponentType()).runtimeType));
    }

    /* access modifiers changed from: private */
    public C6267f getCovariantTypeResolver() {
        C6267f fVar = this.covariantTypeResolver;
        if (fVar != null) {
            return fVar;
        }
        C6267f d = C6267f.m17619d(this.runtimeType);
        this.covariantTypeResolver = d;
        return d;
    }

    /* access modifiers changed from: private */
    public C6267f getInvariantTypeResolver() {
        C6267f fVar = this.invariantTypeResolver;
        if (fVar != null) {
            return fVar;
        }
        C6267f f = C6267f.m17621f(this.runtimeType);
        this.invariantTypeResolver = f;
        return f;
    }

    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.C8138a builder = ImmutableSet.builder();
        new C8218d(this, builder).mo30324a(this.runtimeType);
        return builder.mo36758l();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return m22536of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type of : typeArr) {
            TypeToken<?> of2 = m22536of(of);
            if (of2.isSubtypeOf((Type) cls)) {
                return of2.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* renamed from: is */
    private boolean m22534is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType canonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        if (!every(canonicalizeWildcardType.getUpperBounds()).mo37220b(this.runtimeType) || !every(canonicalizeWildcardType.getLowerBounds()).mo37219a(this.runtimeType)) {
            return false;
        }
        return true;
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = ((TypeToken) it.next()).getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m22536of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return false;
            }
            return m22535of(cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else if (type instanceof GenericArrayType) {
            return m22536of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else {
            return false;
        }
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = m22536of((Type) parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m22536of(getCovariantTypeResolver().mo30299j(typeParameters[i])).m22534is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        if (Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType())) {
            return true;
        }
        return false;
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return m22536of(genericArrayType.getGenericComponentType()).isSubtypeOf((Type) cls.getComponentType());
        } else if (type instanceof GenericArrayType) {
            return m22536of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        } else {
            return false;
        }
    }

    private boolean isWrapper() {
        return C6254e.m17591b().contains(this.runtimeType);
    }

    public static Type newArrayClassOrGenericArrayType(Type type) {
        return C6276h.C6285e.JAVA7.mo30332d(type);
    }

    /* renamed from: of */
    public static <T> TypeToken<T> m22535of(Class<T> cls) {
        return new C8223h(cls);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> of = m22536of(getCovariantTypeResolver().mo30299j(type));
        of.covariantTypeResolver = this.covariantTypeResolver;
        of.invariantTypeResolver = this.invariantTypeResolver;
        return of;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken<? extends Object> genericType = toGenericType(cls);
        return new C6267f().mo30303n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).mo30299j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        C5991h3 it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return m22536of(C6276h.m17671k(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return m22536of((Type) C6276h.m17674n(type, cls, typeParameters));
        }
        return m22535of(cls);
    }

    public final C6261b<T, T> constructor(Constructor<?> constructor) {
        C5850m.m16590k(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new C8216b(constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type j = C6276h.m17670j(this.runtimeType);
        if (j == null) {
            return null;
        }
        return m22536of(j);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.C8100a builder = ImmutableList.builder();
        for (Type resolveSupertype : getRawType().getGenericInterfaces()) {
            builder.mo36637h(resolveSupertype(resolveSupertype));
        }
        return builder.mo36639j();
    }

    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return (Class) getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        C5850m.m16589j(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        C5850m.m16590k(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<?> of = m22536of(resolveTypeArgsForSubclass(cls));
        C5850m.m16590k(of.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", of, this);
        return of;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        C5850m.m16590k(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final C6261b<T, Object> method(Method method) {
        C5850m.m16590k(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C8215a(method);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new C8217c().mo30324a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        C5850m.m16594o(type);
        return m22536of(getInvariantTypeResolver().mo30299j(type));
    }

    public String toString() {
        return C6276h.m17680t(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? m22535of(C6254e.m17592c((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(C6266e<X> eVar, TypeToken<X> typeToken) {
        return new C8223h(new C6267f().mo30304o(ImmutableMap.m22185of(new C6267f.C6272d(eVar.f11882a), typeToken.runtimeType)).mo30299j(this.runtimeType));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? m22535of(C6254e.m17593d((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return m22536of(new C6267f().mo30299j(this.runtimeType));
    }

    public class TypeSet extends C6167v0<TypeToken<? super T>> implements Serializable {
        public static final long serialVersionUID = 0;
        public transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new C8220f(TypeToken.this, (C8215a) null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new C8221g(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf(C8224i.f15303b.mo37224c(TypeToken.this.getRawTypes()));
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<?>> o = C6041m0.m16962k(C8224i.f15302a.mo37225d(TypeToken.this)).mo29630g(C8230j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo29632o();
            this.types = o;
            return o;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$g */
    public final class C8221g extends TypeToken<T>.TypeSet {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final transient TypeToken<T>.TypeSet f15299e;

        /* renamed from: l */
        public transient ImmutableSet<TypeToken<? super T>> f15300l;

        /* renamed from: com.google.common.reflect.TypeToken$g$a */
        public class C8222a implements C5851n<Class<?>> {
            public C8222a(C8221g gVar) {
            }

            /* renamed from: a */
            public boolean apply(Class<?> cls) {
                return cls.isInterface();
            }
        }

        public C8221g(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f15299e = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        public Set<Class<? super T>> rawTypes() {
            return C6041m0.m16962k(C8224i.f15303b.mo37224c(TypeToken.this.getRawTypes())).mo29630g(new C8222a(this)).mo29632o();
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f15300l;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> o = C6041m0.m16962k(this.f15299e).mo29630g(C8230j.INTERFACE_ONLY).mo29632o();
            this.f15300l = o;
            return o;
        }
    }

    public TypeToken() {
        Type capture = capture();
        this.runtimeType = capture;
        C5850m.m16603x(!(capture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", capture);
    }

    /* renamed from: of */
    public static TypeToken<?> m22536of(Type type) {
        return new C8223h(type);
    }

    public final boolean isSubtypeOf(Type type) {
        C5850m.m16594o(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).mo37220b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).mo37219a(type);
        }
        if (type2 instanceof TypeVariable) {
            if (type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).mo37219a(type)) {
                return true;
            }
            return false;
        } else if (type2 instanceof GenericArrayType) {
            return m22536of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        } else {
            if (type instanceof Class) {
                return someRawTypeIsSubclassOf((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return isSubtypeOfParameterizedType((ParameterizedType) type);
            }
            if (type instanceof GenericArrayType) {
                return isSubtypeOfArrayType((GenericArrayType) type);
            }
            return false;
        }
    }

    public final boolean isSupertypeOf(Type type) {
        return m22536of(type).isSubtypeOf(getType());
    }

    public TypeToken(Class<?> cls) {
        Type capture = super.capture();
        if (capture instanceof Class) {
            this.runtimeType = capture;
        } else {
            this.runtimeType = C6267f.m17619d(cls).mo30299j(capture);
        }
    }

    public final <X> TypeToken<T> where(C6266e<X> eVar, Class<X> cls) {
        return where(eVar, m22535of(cls));
    }

    public TypeToken(Type type) {
        C5850m.m16594o(type);
        this.runtimeType = type;
    }
}

package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6107q0;
import p040c.p200q.p353b.p358e.C6254e;

public final class ImmutableClassToInstanceMap<B> extends C6107q0<Class<? extends B>, B> implements Object<B>, Serializable {
    public static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.m22184of());
    public final ImmutableMap<Class<? extends B>, B> delegate;

    /* renamed from: com.google.common.collect.ImmutableClassToInstanceMap$b */
    public static final class C8097b<B> {

        /* renamed from: a */
        public final ImmutableMap.C8107b<Class<? extends B>, B> f15054a = ImmutableMap.builder();

        /* renamed from: b */
        public static <B, T extends B> T m22141b(Class<T> cls, B b) {
            return C6254e.m17593d(cls).cast(b);
        }

        /* renamed from: a */
        public ImmutableClassToInstanceMap<B> mo36608a() {
            ImmutableMap<Class<? extends B>, B> a = this.f15054a.mo36594a();
            if (a.isEmpty()) {
                return ImmutableClassToInstanceMap.m22139of();
            }
            return new ImmutableClassToInstanceMap<>(a);
        }

        /* renamed from: c */
        public <T extends B> C8097b<B> mo36609c(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry next : map.entrySet()) {
                Class cls = (Class) next.getKey();
                this.f15054a.mo36595c(cls, m22141b(cls, next.getValue()));
            }
            return this;
        }
    }

    public static <B> C8097b<B> builder() {
        return new C8097b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        C8097b bVar = new C8097b();
        bVar.mo36609c(map);
        return bVar.mo36608a();
    }

    /* renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m22139of() {
        return EMPTY;
    }

    public <T extends B> T getInstance(Class<T> cls) {
        ImmutableMap immutableMap = this.delegate;
        C5850m.m16594o(cls);
        return immutableMap.get(cls);
    }

    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? m22139of() : this;
    }

    public ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    /* renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m22140of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m22185of(cls, t));
    }

    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}

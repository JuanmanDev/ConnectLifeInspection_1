package com.google.common.collect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5977f3;
import p040c.p200q.p353b.p355b.C6107q0;
import p040c.p200q.p353b.p355b.C6135r0;
import p040c.p200q.p353b.p355b.C6167v0;
import p040c.p200q.p353b.p358e.C6254e;

public final class MutableClassToInstanceMap<B> extends C6107q0<Class<? extends B>, B> implements Object<B>, Serializable {
    public final Map<Class<? extends B>, B> delegate;

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$a */
    public static class C8169a extends C6135r0<Class<? extends B>, B> {

        /* renamed from: e */
        public final /* synthetic */ Map.Entry f15211e;

        public C8169a(Map.Entry entry) {
            this.f15211e = entry;
        }

        /* renamed from: c */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f15211e;
        }

        public B setValue(B b) {
            return super.setValue(MutableClassToInstanceMap.cast((Class) getKey(), b));
        }
    }

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$b */
    public class C8170b extends C6167v0<Map.Entry<Class<? extends B>, B>> {

        /* renamed from: com.google.common.collect.MutableClassToInstanceMap$b$a */
        public class C8171a extends C5977f3<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public C8171a(C8170b bVar, Iterator it) {
                super(it);
            }

            /* renamed from: b */
            public Map.Entry<Class<? extends B>, B> mo29448a(Map.Entry<Class<? extends B>, B> entry) {
                return MutableClassToInstanceMap.checkedEntry(entry);
            }
        }

        public C8170b() {
        }

        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new C8171a(this, delegate().iterator());
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }
    }

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$c */
    public static final class C8172c<B> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Map<Class<? extends B>, B> f15213e;

        public C8172c(Map<Class<? extends B>, B> map) {
            this.f15213e = map;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.create(this.f15213e);
        }
    }

    public MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        C5850m.m16594o(map);
        this.delegate = map;
    }

    public static <B, T extends B> T cast(Class<T> cls, B b) {
        return C6254e.m17593d(cls).cast(b);
    }

    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new C8169a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new C8172c(delegate());
    }

    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new C8170b();
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return cast(cls, get(cls));
    }

    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    public <T extends B> T putInstance(Class<T> cls, T t) {
        return cast(cls, put(cls, t));
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public B put(Class<? extends B> cls, B b) {
        return super.put(cls, cast(cls, b));
    }
}

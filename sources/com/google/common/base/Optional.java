package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5827a;
import p040c.p200q.p353b.p354a.C5828b;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5863p;
import p040c.p200q.p353b.p354a.C5865r;

public abstract class Optional<T> implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$a */
    public static class C8058a implements Iterable<T> {

        /* renamed from: e */
        public final /* synthetic */ Iterable f15002e;

        /* renamed from: com.google.common.base.Optional$a$a */
        public class C8059a extends C5828b<T> {

            /* renamed from: m */
            public final Iterator<? extends Optional<? extends T>> f15003m;

            public C8059a() {
                Iterator<? extends Optional<? extends T>> it = C8058a.this.f15002e.iterator();
                C5850m.m16594o(it);
                this.f15003m = it;
            }

            /* renamed from: a */
            public T mo28929a() {
                while (this.f15003m.hasNext()) {
                    Optional optional = (Optional) this.f15003m.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return mo28930b();
            }
        }

        public C8058a(Iterable iterable) {
            this.f15002e = iterable;
        }

        public Iterator<T> iterator() {
            return new C8059a();
        }
    }

    public static <T> Optional<T> absent() {
        return C5827a.m16531a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new C5863p(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m22060of(T t) {
        C5850m.m16594o(t);
        return new C5863p(t);
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        C5850m.m16594o(iterable);
        return new C8058a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo28923or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo28924or(C5865r<? extends T> rVar);

    /* renamed from: or */
    public abstract T mo28925or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(C5838g<? super T, V> gVar);
}

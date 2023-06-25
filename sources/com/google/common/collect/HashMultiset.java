package com.google.common.collect;

import java.util.Set;
import p040c.p200q.p353b.p355b.C5966f;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6184x1;

public class HashMultiset<E> extends C5966f<E> {
    public static final long serialVersionUID = 0;

    public HashMultiset(int i) {
        super(i);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public void init(int i) {
        this.backingMap = new C6184x1<>(i);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> create = create(C6158u1.m17264h(iterable));
        C6020k1.m16914a(create, iterable);
        return create;
    }
}

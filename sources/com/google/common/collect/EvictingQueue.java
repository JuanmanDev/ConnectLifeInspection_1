package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6157u0;

public final class EvictingQueue<E> extends C6157u0<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Queue<E> delegate;
    public final int maxSize;

    public EvictingQueue(int i) {
        C5850m.m16585f(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    public boolean add(E e) {
        C5850m.m16594o(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return C6020k1.m16914a(this, C6020k1.m16923j(collection, size - this.maxSize));
    }

    public boolean contains(Object obj) {
        Queue delegate2 = delegate();
        C5850m.m16594o(obj);
        return delegate2.contains(obj);
    }

    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    public boolean remove(Object obj) {
        Queue delegate2 = delegate();
        C5850m.m16594o(obj);
        return delegate2.remove(obj);
    }

    public Queue<E> delegate() {
        return this.delegate;
    }
}

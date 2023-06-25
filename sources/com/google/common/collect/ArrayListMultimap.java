package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6134r;
import p040c.p200q.p353b.p355b.C6136r1;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6174x;

public final class ArrayListMultimap<K, V> extends C6134r<K, V> {
    public static final int DEFAULT_VALUES_PER_KEY = 3;
    public static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey;

    public ArrayListMultimap() {
        this(12, 3);
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int h = C6131q2.m17228h(objectInputStream);
        setMap(C6174x.m17305g());
        C6131q2.m17225e(this, objectInputStream, h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C6131q2.m17230j(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C6153t1 keys() {
        return super.keys();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean putAll(C6136r1 r1Var) {
        return super.putAll(r1Var);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ List removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public void trimToSize() {
        for (Collection collection : backingMap().values()) {
            ((ArrayList) collection).trimToSize();
        }
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public ArrayListMultimap(int i, int i2) {
        super(C5882b2.m16641c(i));
        C6166v.m17276b(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    public List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> ArrayListMultimap<K, V> create(C6136r1<? extends K, ? extends V> r1Var) {
        return new ArrayListMultimap<>(r1Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArrayListMultimap(C6136r1<? extends K, ? extends V> r1Var) {
        this(r1Var.keySet().size(), r1Var instanceof ArrayListMultimap ? ((ArrayListMultimap) r1Var).expectedValuesPerKey : 3);
        putAll(r1Var);
    }
}

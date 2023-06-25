package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5978g;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6151t;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6204z0;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements C6151t<K, V>, Serializable {
    public static final int ABSENT = -1;
    public static final int ENDPOINT = -2;
    public transient Set<Map.Entry<K, V>> entrySet;
    public transient int firstInInsertionOrder;
    public transient int[] hashTableKToV;
    public transient int[] hashTableVToK;
    public transient C6151t<V, K> inverse;
    public transient Set<K> keySet;
    public transient K[] keys;
    public transient int lastInInsertionOrder;
    public transient int modCount;
    public transient int[] nextInBucketKToV;
    public transient int[] nextInBucketVToK;
    public transient int[] nextInInsertionOrder;
    public transient int[] prevInInsertionOrder;
    public transient int size;
    public transient Set<V> valueSet;
    public transient V[] values;

    /* renamed from: com.google.common.collect.HashBiMap$a */
    public final class C8085a extends C5978g<K, V> {

        /* renamed from: e */
        public final K f15037e;

        /* renamed from: l */
        public int f15038l;

        public C8085a(int i) {
            this.f15037e = HashBiMap.this.keys[i];
            this.f15038l = i;
        }

        /* renamed from: a */
        public void mo36560a() {
            int i = this.f15038l;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && C5845j.m16576a(hashBiMap.keys[i], this.f15037e)) {
                    return;
                }
            }
            this.f15038l = HashBiMap.this.findEntryByKey(this.f15037e);
        }

        public K getKey() {
            return this.f15037e;
        }

        public V getValue() {
            mo36560a();
            int i = this.f15038l;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.values[i];
        }

        public V setValue(V v) {
            mo36560a();
            int i = this.f15038l;
            if (i == -1) {
                return HashBiMap.this.put(this.f15037e, v);
            }
            V v2 = HashBiMap.this.values[i];
            if (C5845j.m16576a(v2, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.f15038l, v, false);
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$b */
    public static final class C8086b<K, V> extends C5978g<V, K> {

        /* renamed from: e */
        public final HashBiMap<K, V> f15040e;

        /* renamed from: l */
        public final V f15041l;

        /* renamed from: m */
        public int f15042m;

        public C8086b(HashBiMap<K, V> hashBiMap, int i) {
            this.f15040e = hashBiMap;
            this.f15041l = hashBiMap.values[i];
            this.f15042m = i;
        }

        /* renamed from: a */
        public final void mo36561a() {
            int i = this.f15042m;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f15040e;
                if (i <= hashBiMap.size && C5845j.m16576a(this.f15041l, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f15042m = this.f15040e.findEntryByValue(this.f15041l);
        }

        public V getKey() {
            return this.f15041l;
        }

        public K getValue() {
            mo36561a();
            int i = this.f15042m;
            if (i == -1) {
                return null;
            }
            return this.f15040e.keys[i];
        }

        public K setValue(K k) {
            mo36561a();
            int i = this.f15042m;
            if (i == -1) {
                return this.f15040e.putInverse(this.f15041l, k, false);
            }
            K k2 = this.f15040e.keys[i];
            if (C5845j.m16576a(k2, k)) {
                return k;
            }
            this.f15040e.replaceKeyInEntry(this.f15042m, k, false);
            return k2;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$c */
    public final class C8087c extends C8092h<K, V, Map.Entry<K, V>> {
        public C8087c() {
            super(HashBiMap.this);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            if (findEntryByKey == -1 || !C5845j.m16576a(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public Map.Entry<K, V> mo36562c(int i) {
            return new C8085a(i);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = C6204z0.m17453d(key);
            int findEntryByKey = HashBiMap.this.findEntryByKey(key, d);
            if (findEntryByKey == -1 || !C5845j.m16576a(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, d);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$d */
    public static class C8088d<K, V> extends AbstractMap<V, K> implements C6151t<V, K>, Serializable {

        /* renamed from: e */
        public final HashBiMap<K, V> f15044e;

        /* renamed from: l */
        public transient Set<Map.Entry<V, K>> f15045l;

        public C8088d(HashBiMap<K, V> hashBiMap) {
            this.f15044e = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            C6151t unused = this.f15044e.inverse = this;
        }

        /* renamed from: a */
        public Set<K> values() {
            return this.f15044e.keySet();
        }

        public void clear() {
            this.f15044e.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f15044e.containsValue(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f15044e.containsKey(obj);
        }

        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f15045l;
            if (set != null) {
                return set;
            }
            C8089e eVar = new C8089e(this.f15044e);
            this.f15045l = eVar;
            return eVar;
        }

        public K get(Object obj) {
            return this.f15044e.getInverse(obj);
        }

        public C6151t<K, V> inverse() {
            return this.f15044e;
        }

        public Set<V> keySet() {
            return this.f15044e.values();
        }

        public K put(V v, K k) {
            return this.f15044e.putInverse(v, k, false);
        }

        public K remove(Object obj) {
            return this.f15044e.removeInverse(obj);
        }

        public int size() {
            return this.f15044e.size;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$e */
    public static class C8089e<K, V> extends C8092h<K, V, Map.Entry<V, K>> {
        public C8089e(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.f15048e.findEntryByValue(key);
            if (findEntryByValue == -1 || !C5845j.m16576a(this.f15048e.keys[findEntryByValue], value)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public Map.Entry<V, K> mo36562c(int i) {
            return new C8086b(this.f15048e, i);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = C6204z0.m17453d(key);
            int findEntryByValue = this.f15048e.findEntryByValue(key, d);
            if (findEntryByValue == -1 || !C5845j.m16576a(this.f15048e.keys[findEntryByValue], value)) {
                return false;
            }
            this.f15048e.removeEntryValueHashKnown(findEntryByValue, d);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$f */
    public final class C8090f extends C8092h<K, V, K> {
        public C8090f() {
            super(HashBiMap.this);
        }

        /* renamed from: c */
        public K mo36562c(int i) {
            return HashBiMap.this.keys[i];
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            int d = C6204z0.m17453d(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, d);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, d);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$g */
    public final class C8091g extends C8092h<K, V, V> {
        public C8091g() {
            super(HashBiMap.this);
        }

        /* renamed from: c */
        public V mo36562c(int i) {
            return HashBiMap.this.values[i];
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public boolean remove(Object obj) {
            int d = C6204z0.m17453d(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, d);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, d);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$h */
    public static abstract class C8092h<K, V, T> extends AbstractSet<T> {

        /* renamed from: e */
        public final HashBiMap<K, V> f15048e;

        /* renamed from: com.google.common.collect.HashBiMap$h$a */
        public class C8093a implements Iterator<T> {

            /* renamed from: e */
            public int f15049e = C8092h.this.f15048e.firstInInsertionOrder;

            /* renamed from: l */
            public int f15050l = -1;

            /* renamed from: m */
            public int f15051m;

            /* renamed from: n */
            public int f15052n;

            public C8093a() {
                HashBiMap<K, V> hashBiMap = C8092h.this.f15048e;
                this.f15051m = hashBiMap.modCount;
                this.f15052n = hashBiMap.size;
            }

            /* renamed from: a */
            public final void mo36587a() {
                if (C8092h.this.f15048e.modCount != this.f15051m) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo36587a();
                return this.f15049e != -2 && this.f15052n > 0;
            }

            public T next() {
                if (hasNext()) {
                    T c = C8092h.this.mo36562c(this.f15049e);
                    this.f15050l = this.f15049e;
                    this.f15049e = C8092h.this.f15048e.nextInInsertionOrder[this.f15049e];
                    this.f15052n--;
                    return c;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                mo36587a();
                C6166v.m17279e(this.f15050l != -1);
                C8092h.this.f15048e.removeEntry(this.f15050l);
                if (this.f15049e == C8092h.this.f15048e.size) {
                    this.f15049e = this.f15050l;
                }
                this.f15050l = -1;
                this.f15051m = C8092h.this.f15048e.modCount;
            }
        }

        public C8092h(HashBiMap<K, V> hashBiMap) {
            this.f15048e = hashBiMap;
        }

        /* renamed from: c */
        public abstract T mo36562c(int i);

        public void clear() {
            this.f15048e.clear();
        }

        public Iterator<T> iterator() {
            return new C8093a();
        }

        public int size() {
            return this.f15048e.size;
        }
    }

    public HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i, int i2) {
        C5850m.m16583d(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        if (iArr[bucket] == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[bucket];
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[i]);
            } else if (i3 == i) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketKToV[i3];
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        C5850m.m16583d(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        if (iArr[bucket] == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[bucket];
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[i]);
            } else if (i3 == i) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketVToK[i3];
            }
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int e = ImmutableCollection.C8099b.m22147e(iArr.length, i);
            this.keys = Arrays.copyOf(this.keys, e);
            this.values = Arrays.copyOf(this.values, e);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, e);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, e);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, e);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, e);
        }
        if (this.hashTableKToV.length < i) {
            int a = C6204z0.m17450a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(a);
            this.hashTableVToK = createFilledWithAbsent(a);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(C6204z0.m17453d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[bucket];
                iArr3[bucket] = i2;
                int bucket2 = bucket(C6204z0.m17453d(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[bucket2];
                iArr5[bucket2] = i2;
            }
        }
    }

    public static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        C5850m.m16583d(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        C5850m.m16583d(i != -1);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int i4;
        if (i != i2) {
            int i5 = this.prevInInsertionOrder[i];
            int i6 = this.nextInInsertionOrder[i];
            setSucceeds(i5, i2);
            setSucceeds(i2, i6);
            K[] kArr = this.keys;
            K k = kArr[i];
            V[] vArr = this.values;
            V v = vArr[i];
            kArr[i2] = k;
            vArr[i2] = v;
            int bucket = bucket(C6204z0.m17453d(k));
            int[] iArr = this.hashTableKToV;
            if (iArr[bucket] == i) {
                iArr[bucket] = i2;
            } else {
                int i7 = iArr[bucket];
                int i8 = this.nextInBucketKToV[i7];
                while (true) {
                    int i9 = i8;
                    i4 = i7;
                    i7 = i9;
                    if (i7 == i) {
                        break;
                    }
                    i8 = this.nextInBucketKToV[i7];
                }
                this.nextInBucketKToV[i4] = i2;
            }
            int[] iArr2 = this.nextInBucketKToV;
            iArr2[i2] = iArr2[i];
            iArr2[i] = -1;
            int bucket2 = bucket(C6204z0.m17453d(v));
            int[] iArr3 = this.hashTableVToK;
            if (iArr3[bucket2] == i) {
                iArr3[bucket2] = i2;
            } else {
                int i10 = iArr3[bucket2];
                int i11 = this.nextInBucketVToK[i10];
                while (true) {
                    int i12 = i11;
                    i3 = i10;
                    i10 = i12;
                    if (i10 == i) {
                        break;
                    }
                    i11 = this.nextInBucketVToK[i10];
                }
                this.nextInBucketVToK[i3] = i2;
            }
            int[] iArr4 = this.nextInBucketVToK;
            iArr4[i2] = iArr4[i];
            iArr4[i] = -1;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int h = C6131q2.m17228h(objectInputStream);
        init(16);
        C6131q2.m17223c(this, objectInputStream, h);
    }

    /* access modifiers changed from: private */
    public void replaceKeyInEntry(int i, K k, boolean z) {
        C5850m.m16583d(i != -1);
        int d = C6204z0.m17453d(k);
        int findEntryByKey = findEntryByKey(k, d);
        int i2 = this.lastInInsertionOrder;
        int i3 = -2;
        if (findEntryByKey != -1) {
            if (z) {
                i2 = this.prevInInsertionOrder[findEntryByKey];
                i3 = this.nextInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, d);
                if (i == this.size) {
                    i = findEntryByKey;
                }
            } else {
                throw new IllegalArgumentException("Key already present in map: " + k);
            }
        }
        if (i2 == i) {
            i2 = this.prevInInsertionOrder[i];
        } else if (i2 == this.size) {
            i2 = findEntryByKey;
        }
        if (i3 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i3 != this.size) {
            findEntryByKey = i3;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, C6204z0.m17453d(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, C6204z0.m17453d(k));
        setSucceeds(i2, i);
        setSucceeds(i, findEntryByKey);
    }

    /* access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v, boolean z) {
        C5850m.m16583d(i != -1);
        int d = C6204z0.m17453d(v);
        int findEntryByValue = findEntryByValue(v, d);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, d);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
        }
        deleteFromTableVToK(i, C6204z0.m17453d(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, d);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C6131q2.m17229i(this, objectOutputStream);
    }

    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    public boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C8087c cVar = new C8087c();
        this.entrySet = cVar;
        return cVar;
    }

    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (C5845j.m16576a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, C6204z0.m17453d(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, C6204z0.m17453d(obj));
    }

    public V forcePut(K k, V v) {
        return put(k, v, true);
    }

    public V get(Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    public K getInverse(Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    public void init(int i) {
        C6166v.m17276b(i, "expectedSize");
        int a = C6204z0.m17450a(i, 1.0d);
        this.size = 0;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.hashTableKToV = createFilledWithAbsent(a);
        this.hashTableVToK = createFilledWithAbsent(a);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    public C6151t<V, K> inverse() {
        C6151t<V, K> tVar = this.inverse;
        if (tVar != null) {
            return tVar;
        }
        C8088d dVar = new C8088d(this);
        this.inverse = dVar;
        return dVar;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C8090f fVar = new C8090f();
        this.keySet = fVar;
        return fVar;
    }

    public V put(K k, V v) {
        return put(k, v, false);
    }

    public K putInverse(V v, K k, boolean z) {
        int d = C6204z0.m17453d(v);
        int findEntryByValue = findEntryByValue(v, d);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (C5845j.m16576a(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i = this.lastInInsertionOrder;
        int d2 = C6204z0.m17453d(k);
        int findEntryByKey = findEntryByKey(k, d2);
        if (!z) {
            C5850m.m16589j(findEntryByKey == -1, "Key already present: %s", k);
        } else if (findEntryByKey != -1) {
            i = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v;
        insertIntoTableKToV(i2, d2);
        insertIntoTableVToK(this.size, d);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    public V remove(Object obj) {
        int d = C6204z0.m17453d(obj);
        int findEntryByKey = findEntryByKey(obj, d);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, d);
        return v;
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, C6204z0.m17453d(this.keys[i]));
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, C6204z0.m17453d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, C6204z0.m17453d(this.keys[i]), i2);
    }

    public K removeInverse(Object obj) {
        int d = C6204z0.m17453d(obj);
        int findEntryByValue = findEntryByValue(obj, d);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, d);
        return k;
    }

    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    private void removeEntry(int i, int i2, int i3) {
        C5850m.m16583d(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        K[] kArr = this.keys;
        int i4 = this.size;
        kArr[i4 - 1] = null;
        this.values[i4 - 1] = null;
        this.size = i4 - 1;
        this.modCount++;
    }

    public int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public V put(K k, V v, boolean z) {
        int d = C6204z0.m17453d(k);
        int findEntryByKey = findEntryByKey(k, d);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (C5845j.m16576a(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int d2 = C6204z0.m17453d(v);
        int findEntryByValue = findEntryByValue(v, d2);
        if (!z) {
            C5850m.m16589j(findEntryByValue == -1, "Value already present: %s", v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, d);
        insertIntoTableVToK(this.size, d2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C8091g gVar = new C8091g();
        this.valueSet = gVar;
        return gVar;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}

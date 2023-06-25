package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* renamed from: e */
    public int f7057e;

    public void clear() {
        this.f7057e = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f7057e == 0) {
            this.f7057e = super.hashCode();
        }
        return this.f7057e;
    }

    public V put(K k, V v) {
        this.f7057e = 0;
        return super.put(k, v);
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f7057e = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i) {
        this.f7057e = 0;
        return super.removeAt(i);
    }

    public V setValueAt(int i, V v) {
        this.f7057e = 0;
        return super.setValueAt(i, v);
    }
}

package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import p040c.p200q.p353b.p355b.C6000i2;

/* renamed from: c.q.b.b.g2 */
/* compiled from: RegularImmutableBiMap */
public final class C5981g2<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: p */
    public static final C5981g2<Object, Object> f11539p = new C5981g2<>();

    /* renamed from: e */
    public final transient Object f11540e;

    /* renamed from: l */
    public final transient Object[] f11541l;

    /* renamed from: m */
    public final transient int f11542m;

    /* renamed from: n */
    public final transient int f11543n;

    /* renamed from: o */
    public final transient C5981g2<V, K> f11544o;

    public C5981g2() {
        this.f11540e = null;
        this.f11541l = new Object[0];
        this.f11542m = 0;
        this.f11543n = 0;
        this.f11544o = this;
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new C6000i2.C6001a(this, this.f11541l, this.f11542m, this.f11543n);
    }

    public ImmutableSet<K> createKeySet() {
        return new C6000i2.C6003b(this, new C6000i2.C6004c(this.f11541l, this.f11542m, this.f11543n));
    }

    public V get(Object obj) {
        return C6000i2.m16904d(this.f11540e, this.f11541l, this.f11543n, this.f11542m, obj);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f11543n;
    }

    public ImmutableBiMap<V, K> inverse() {
        return this.f11544o;
    }

    public C5981g2(Object[] objArr, int i) {
        this.f11541l = objArr;
        this.f11543n = i;
        this.f11542m = 0;
        int chooseTableSize = i >= 2 ? ImmutableSet.chooseTableSize(i) : 0;
        this.f11540e = C6000i2.m16902b(objArr, i, chooseTableSize, 0);
        this.f11544o = new C5981g2<>(C6000i2.m16902b(objArr, i, chooseTableSize, 1), objArr, i, this);
    }

    public C5981g2(Object obj, Object[] objArr, int i, C5981g2<V, K> g2Var) {
        this.f11540e = obj;
        this.f11541l = objArr;
        this.f11542m = 1;
        this.f11543n = i;
        this.f11544o = g2Var;
    }
}

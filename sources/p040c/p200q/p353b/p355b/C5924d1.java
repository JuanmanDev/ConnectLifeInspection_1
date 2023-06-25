package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;

/* renamed from: c.q.b.b.d1 */
/* compiled from: ImmutableMapKeySet */
public final class C5924d1<K, V> extends C6012j1<K> {

    /* renamed from: e */
    public final ImmutableMap<K, V> f11460e;

    /* renamed from: c.q.b.b.d1$a */
    /* compiled from: ImmutableMapKeySet */
    public static class C5925a<K> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableMap<K, ?> f11461e;

        public C5925a(ImmutableMap<K, ?> immutableMap) {
            this.f11461e = immutableMap;
        }

        public Object readResolve() {
            return this.f11461e.keySet();
        }
    }

    public C5924d1(ImmutableMap<K, V> immutableMap) {
        this.f11460e = immutableMap;
    }

    public boolean contains(Object obj) {
        return this.f11460e.containsKey(obj);
    }

    public K get(int i) {
        return this.f11460e.entrySet().asList().get(i).getKey();
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.f11460e.size();
    }

    public Object writeReplace() {
        return new C5925a(this.f11460e);
    }

    public C5991h3<K> iterator() {
        return this.f11460e.keyIterator();
    }
}

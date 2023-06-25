package p040c.p200q.p405d;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.d.z */
/* compiled from: LazyField */
public class C7010z extends C6886a0 {

    /* renamed from: e */
    public final C6954m0 f13397e;

    /* renamed from: c.q.d.z$b */
    /* compiled from: LazyField */
    public static class C7012b<K> implements Map.Entry<K, Object> {

        /* renamed from: e */
        public Map.Entry<K, C7010z> f13398e;

        /* renamed from: a */
        public C7010z mo32436a() {
            return this.f13398e.getValue();
        }

        public K getKey() {
            return this.f13398e.getKey();
        }

        public Object getValue() {
            C7010z value = this.f13398e.getValue();
            if (value == null) {
                return null;
            }
            return value.mo32434f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C6954m0) {
                return this.f13398e.getValue().mo31747d((C6954m0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C7012b(Map.Entry<K, C7010z> entry) {
            this.f13398e = entry;
        }
    }

    /* renamed from: c.q.d.z$c */
    /* compiled from: LazyField */
    public static class C7013c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: e */
        public Iterator<Map.Entry<K, Object>> f13399e;

        public C7013c(Iterator<Map.Entry<K, Object>> it) {
            this.f13399e = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f13399e.next();
            return next.getValue() instanceof C7010z ? new C7012b(next) : next;
        }

        public boolean hasNext() {
            return this.f13399e.hasNext();
        }

        public void remove() {
            this.f13399e.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo32434f().equals(obj);
    }

    /* renamed from: f */
    public C6954m0 mo32434f() {
        return mo31746c(this.f13397e);
    }

    public int hashCode() {
        return mo32434f().hashCode();
    }

    public String toString() {
        return mo32434f().toString();
    }
}

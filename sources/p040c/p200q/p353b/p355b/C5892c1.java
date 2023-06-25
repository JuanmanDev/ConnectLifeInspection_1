package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Map;

/* renamed from: c.q.b.b.c1 */
/* compiled from: ImmutableMapEntrySet */
public abstract class C5892c1<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    /* renamed from: c.q.b.b.c1$a */
    /* compiled from: ImmutableMapEntrySet */
    public static class C5893a<K, V> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableMap<K, V> f11423e;

        public C5893a(ImmutableMap<K, V> immutableMap) {
            this.f11423e = immutableMap;
        }

        public Object readResolve() {
            return this.f11423e.entrySet();
        }
    }

    /* renamed from: c */
    public abstract ImmutableMap<K, V> mo29075c();

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo29075c().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo29075c().hashCode();
    }

    public boolean isHashCodeFast() {
        return mo29075c().isHashCodeFast();
    }

    public boolean isPartialView() {
        return mo29075c().isPartialView();
    }

    public int size() {
        return mo29075c().size();
    }

    public Object writeReplace() {
        return new C5893a(mo29075c());
    }
}

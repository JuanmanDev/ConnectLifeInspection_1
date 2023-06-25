package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;

/* renamed from: c.q.b.b.e1 */
/* compiled from: ImmutableMapValues */
public final class C5958e1<K, V> extends ImmutableCollection<V> {

    /* renamed from: e */
    public final ImmutableMap<K, V> f11514e;

    /* renamed from: c.q.b.b.e1$a */
    /* compiled from: ImmutableMapValues */
    public class C5959a extends C5991h3<V> {

        /* renamed from: e */
        public final C5991h3<Map.Entry<K, V>> f11515e = C5958e1.this.f11514e.entrySet().iterator();

        public C5959a() {
        }

        public boolean hasNext() {
            return this.f11515e.hasNext();
        }

        public V next() {
            return this.f11515e.next().getValue();
        }
    }

    /* renamed from: c.q.b.b.e1$b */
    /* compiled from: ImmutableMapValues */
    public class C5960b extends ImmutableList<V> {

        /* renamed from: e */
        public final /* synthetic */ ImmutableList f11517e;

        public C5960b(C5958e1 e1Var, ImmutableList immutableList) {
            this.f11517e = immutableList;
        }

        public V get(int i) {
            return ((Map.Entry) this.f11517e.get(i)).getValue();
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f11517e.size();
        }
    }

    /* renamed from: c.q.b.b.e1$c */
    /* compiled from: ImmutableMapValues */
    public static class C5961c<V> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableMap<?, V> f11518e;

        public C5961c(ImmutableMap<?, V> immutableMap) {
            this.f11518e = immutableMap;
        }

        public Object readResolve() {
            return this.f11518e.values();
        }
    }

    public C5958e1(ImmutableMap<K, V> immutableMap) {
        this.f11514e = immutableMap;
    }

    public ImmutableList<V> asList() {
        return new C5960b(this, this.f11514e.entrySet().asList());
    }

    public boolean contains(Object obj) {
        return obj != null && C6028l1.m16934f(iterator(), obj);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.f11514e.size();
    }

    public Object writeReplace() {
        return new C5961c(this.f11514e);
    }

    public C5991h3<V> iterator() {
        return new C5959a();
    }
}

package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* renamed from: c.q.b.b.j1 */
/* compiled from: IndexedImmutableSet */
public abstract class C6012j1<E> extends ImmutableSet<E> {

    /* renamed from: c.q.b.b.j1$a */
    /* compiled from: IndexedImmutableSet */
    public class C6013a extends ImmutableList<E> {
        public C6013a() {
        }

        public E get(int i) {
            return C6012j1.this.get(i);
        }

        public boolean isPartialView() {
            return C6012j1.this.isPartialView();
        }

        public int size() {
            return C6012j1.this.size();
        }
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public ImmutableList<E> createAsList() {
        return new C6013a();
    }

    public abstract E get(int i);

    public C5991h3<E> iterator() {
        return asList().iterator();
    }
}

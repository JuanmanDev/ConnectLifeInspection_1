package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: c.q.b.b.a1 */
/* compiled from: ImmutableAsList */
public abstract class C5875a1<E> extends ImmutableList<E> {

    /* renamed from: c.q.b.b.a1$a */
    /* compiled from: ImmutableAsList */
    public static class C5876a implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableCollection<?> f11399e;

        public C5876a(ImmutableCollection<?> immutableCollection) {
            this.f11399e = immutableCollection;
        }

        public Object readResolve() {
            return this.f11399e.asList();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: c */
    public abstract ImmutableCollection<E> mo29026c();

    public boolean contains(Object obj) {
        return mo29026c().contains(obj);
    }

    public boolean isEmpty() {
        return mo29026c().isEmpty();
    }

    public boolean isPartialView() {
        return mo29026c().isPartialView();
    }

    public int size() {
        return mo29026c().size();
    }

    public Object writeReplace() {
        return new C5876a(mo29026c());
    }
}

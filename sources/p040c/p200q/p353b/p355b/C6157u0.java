package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: c.q.b.b.u0 */
/* compiled from: ForwardingQueue */
public abstract class C6157u0<E> extends C6048n0<E> implements Queue<E> {
    public abstract /* bridge */ /* synthetic */ Object delegate();

    public abstract /* bridge */ /* synthetic */ Collection delegate();

    public abstract Queue<E> delegate();

    public E element() {
        return delegate().element();
    }

    public abstract boolean offer(E e);

    public E peek() {
        return delegate().peek();
    }

    public E poll() {
        return delegate().poll();
    }

    public E remove() {
        return delegate().remove();
    }

    public boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}

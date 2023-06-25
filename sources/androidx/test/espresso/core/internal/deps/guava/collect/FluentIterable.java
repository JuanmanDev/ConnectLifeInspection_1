package androidx.test.espresso.core.internal.deps.guava.collect;

import androidx.test.espresso.core.internal.deps.guava.base.Optional;

public abstract class FluentIterable<E> implements Iterable<E> {
    public final Optional<Iterable<E>> iterableDelegate = Optional.absent();

    private Iterable<E> getDelegate() {
        return this.iterableDelegate.mo12183or(this);
    }

    public String toString() {
        return Iterables.toString(getDelegate());
    }
}

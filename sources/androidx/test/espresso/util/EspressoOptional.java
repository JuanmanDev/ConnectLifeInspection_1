package androidx.test.espresso.util;

import androidx.test.espresso.core.internal.deps.guava.base.Function;
import androidx.test.espresso.core.internal.deps.guava.base.Optional;
import androidx.test.espresso.core.internal.deps.guava.base.Supplier;
import java.util.Set;

public final class EspressoOptional<T> {
    public static final long serialVersionUID = 0;
    public final Optional<T> delegate;

    public EspressoOptional(Optional<T> optional) {
        this.delegate = optional;
    }

    public static <T> EspressoOptional<T> absent() {
        return new EspressoOptional<>(Optional.absent());
    }

    public static <T> EspressoOptional<T> fromNullable(T t) {
        return new EspressoOptional<>(Optional.fromNullable(t));
    }

    /* renamed from: of */
    public static <T> EspressoOptional<T> m160of(T t) {
        return new EspressoOptional<>(Optional.m143of(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        return Optional.presentInstances(iterable);
    }

    public Set<T> asSet() {
        return this.delegate.asSet();
    }

    public boolean equals(Object obj) {
        if (obj instanceof EspressoOptional) {
            return ((EspressoOptional) obj).delegate.equals(this.delegate);
        }
        return false;
    }

    public T get() {
        return this.delegate.get();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public boolean isPresent() {
        return this.delegate.isPresent();
    }

    /* renamed from: or */
    public Optional<T> mo12776or(Optional<? extends T> optional) {
        return this.delegate.mo12181or(optional);
    }

    public T orNull() {
        return this.delegate.orNull();
    }

    public String toString() {
        return this.delegate.toString();
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        return this.delegate.transform(function);
    }

    /* renamed from: or */
    public T mo12777or(Supplier<? extends T> supplier) {
        return this.delegate.mo12182or(supplier);
    }

    /* renamed from: or */
    public T mo12778or(T t) {
        return this.delegate.mo12183or(t);
    }
}

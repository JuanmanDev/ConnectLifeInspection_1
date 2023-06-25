package androidx.camera.core.impl.utils;

import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;

public final class Absent<T> extends Optional<T> {
    public static final Absent<Object> sInstance = new Absent<>();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return sInstance;
    }

    public static <T> Optional<T> withType() {
        return sInstance;
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public T mo4428or(T t) {
        return Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Nullable
    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    /* renamed from: or */
    public Optional<T> mo4426or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    /* renamed from: or */
    public T mo4427or(Supplier<? extends T> supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}

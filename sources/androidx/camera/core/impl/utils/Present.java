package androidx.camera.core.impl.utils;

import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;

public final class Present<T> extends Optional<T> {
    public static final long serialVersionUID = 0;
    public final T mReference;

    public Present(T t) {
        this.mReference = t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Present) {
            return this.mReference.equals(((Present) obj).mReference);
        }
        return false;
    }

    public T get() {
        return this.mReference;
    }

    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public T mo4428or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    public T orNull() {
        return this.mReference;
    }

    public String toString() {
        return "Optional.of(" + this.mReference + ")";
    }

    /* renamed from: or */
    public Optional<T> mo4426or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    /* renamed from: or */
    public T mo4427or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.mReference;
    }
}

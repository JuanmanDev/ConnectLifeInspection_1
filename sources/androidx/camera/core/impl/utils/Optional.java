package androidx.camera.core.impl.utils;

import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    public static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(@Nullable T t) {
        return t == null ? absent() : new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m8of(T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public abstract boolean equals(@Nullable Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo4426or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo4427or(Supplier<? extends T> supplier);

    /* renamed from: or */
    public abstract T mo4428or(T t);

    @Nullable
    public abstract T orNull();

    public abstract String toString();
}

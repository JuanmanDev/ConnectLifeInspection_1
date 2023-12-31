package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class Insets {
    @NonNull
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top  reason: collision with root package name */
    public final int f19491top;

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: of */
        public static android.graphics.Insets m43of(int i, int i2, int i3, int i4) {
            return android.graphics.Insets.of(i, i2, i3, i4);
        }
    }

    public Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.f19491top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    @NonNull
    public static Insets add(@NonNull Insets insets, @NonNull Insets insets2) {
        return m41of(insets.left + insets2.left, insets.f19491top + insets2.f19491top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    @NonNull
    public static Insets max(@NonNull Insets insets, @NonNull Insets insets2) {
        return m41of(Math.max(insets.left, insets2.left), Math.max(insets.f19491top, insets2.f19491top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    @NonNull
    public static Insets min(@NonNull Insets insets, @NonNull Insets insets2) {
        return m41of(Math.min(insets.left, insets2.left), Math.min(insets.f19491top, insets2.f19491top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    @NonNull
    /* renamed from: of */
    public static Insets m41of(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return NONE;
        }
        return new Insets(i, i2, i3, i4);
    }

    @NonNull
    public static Insets subtract(@NonNull Insets insets, @NonNull Insets insets2) {
        return m41of(insets.left - insets2.left, insets.f19491top - insets2.f19491top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = 29)
    @NonNull
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets) {
        return m41of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NonNull
    @Deprecated
    public static Insets wrap(@NonNull android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f19491top == insets.f19491top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.f19491top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(29)
    @NonNull
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m43of(this.left, this.f19491top, this.right, this.bottom);
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f19491top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @NonNull
    /* renamed from: of */
    public static Insets m42of(@NonNull Rect rect) {
        return m41of(rect.left, rect.top, rect.right, rect.bottom);
    }
}

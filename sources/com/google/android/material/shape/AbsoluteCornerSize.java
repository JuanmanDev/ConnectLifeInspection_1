package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class AbsoluteCornerSize implements CornerSize {
    public final float size;

    public AbsoluteCornerSize(float f) {
        this.size = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCornerSize)) {
            return false;
        }
        if (this.size == ((AbsoluteCornerSize) obj).size) {
            return true;
        }
        return false;
    }

    public float getCornerSize(@NonNull RectF rectF) {
        return this.size;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.size)});
    }

    public float getCornerSize() {
        return this.size;
    }
}

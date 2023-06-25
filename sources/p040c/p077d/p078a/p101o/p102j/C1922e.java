package p040c.p077d.p078a.p101o.p102j;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* renamed from: c.d.a.o.j.e */
/* compiled from: ImageViewTargetFactory */
public class C1922e {
    @NonNull
    /* renamed from: a */
    public <Z> C1926i<ImageView, Z> mo16383a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1919b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1920c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}

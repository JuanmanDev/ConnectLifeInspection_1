package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

public class TintResources extends ResourcesWrapper {
    public final WeakReference<Context> mContextRef;

    public TintResources(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawableCanonical = getDrawableCanonical(i);
        Context context = (Context) this.mContextRef.get();
        if (!(drawableCanonical == null || context == null)) {
            ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i, drawableCanonical);
        }
        return drawableCanonical;
    }
}

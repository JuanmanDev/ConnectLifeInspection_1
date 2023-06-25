package p040c.p077d.p078a.p081k.p091l.p094e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p040c.p077d.p078a.p081k.p084j.C1680q;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.e.b */
/* compiled from: DrawableResource */
public abstract class C1845b<T extends Drawable> implements C1685u<T>, C1680q {

    /* renamed from: e */
    public final T f1434e;

    public C1845b(T t) {
        C1949i.m2563d(t);
        this.f1434e = (Drawable) t;
    }

    /* renamed from: a */
    public void mo15875a() {
        T t = this.f1434e;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).mo21680e().prepareToDraw();
        }
    }

    @NonNull
    /* renamed from: b */
    public final T get() {
        Drawable.ConstantState constantState = this.f1434e.getConstantState();
        if (constantState == null) {
            return this.f1434e;
        }
        return constantState.newDrawable();
    }
}

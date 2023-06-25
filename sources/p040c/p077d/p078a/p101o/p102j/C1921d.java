package p040c.p077d.p078a.p101o.p102j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p101o.p103k.C1931b;

/* renamed from: c.d.a.o.j.d */
/* compiled from: ImageViewTarget */
public abstract class C1921d<Z> extends C1926i<ImageView, Z> implements C1931b.C1932a {
    @Nullable

    /* renamed from: h */
    public Animatable f1596h;

    public C1921d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    public void mo16179b(@NonNull Z z, @Nullable C1931b<? super Z> bVar) {
        if (bVar == null || !bVar.mo16402a(z, this)) {
            mo16382p(z);
        } else {
            mo16380m(z);
        }
    }

    /* renamed from: d */
    public void mo16373d(@Nullable Drawable drawable) {
        super.mo16373d(drawable);
        mo16382p((Object) null);
        mo16381n(drawable);
    }

    /* renamed from: e */
    public void mo16374e(@Nullable Drawable drawable) {
        super.mo16374e(drawable);
        mo16382p((Object) null);
        mo16381n(drawable);
    }

    /* renamed from: g */
    public void mo16376g(@Nullable Drawable drawable) {
        super.mo16376g(drawable);
        Animatable animatable = this.f1596h;
        if (animatable != null) {
            animatable.stop();
        }
        mo16382p((Object) null);
        mo16381n(drawable);
    }

    /* renamed from: m */
    public final void mo16380m(@Nullable Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f1596h = animatable;
            animatable.start();
            return;
        }
        this.f1596h = null;
    }

    /* renamed from: n */
    public void mo16381n(Drawable drawable) {
        ((ImageView) this.f1600b).setImageDrawable(drawable);
    }

    /* renamed from: o */
    public abstract void mo16377o(@Nullable Z z);

    public void onStart() {
        Animatable animatable = this.f1596h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void onStop() {
        Animatable animatable = this.f1596h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void mo16382p(@Nullable Z z) {
        mo16377o(z);
        mo16380m(z);
    }
}

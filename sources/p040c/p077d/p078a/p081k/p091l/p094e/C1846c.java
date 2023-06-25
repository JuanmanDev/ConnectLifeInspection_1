package p040c.p077d.p078a.p081k.p091l.p094e;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p081k.p084j.C1685u;

/* renamed from: c.d.a.k.l.e.c */
/* compiled from: NonOwnedDrawableResource */
public final class C1846c extends C1845b<Drawable> {
    public C1846c(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    /* renamed from: f */
    public static C1685u<Drawable> m2151f(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new C1846c(drawable);
        }
        return null;
    }

    /* renamed from: c */
    public void mo15867c() {
    }

    /* renamed from: d */
    public int mo15868d() {
        return Math.max(1, this.f1434e.getIntrinsicWidth() * this.f1434e.getIntrinsicHeight() * 4);
    }

    @NonNull
    /* renamed from: e */
    public Class<Drawable> mo15869e() {
        return this.f1434e.getClass();
    }
}

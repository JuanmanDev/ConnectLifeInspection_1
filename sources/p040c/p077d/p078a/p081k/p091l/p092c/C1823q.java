package p040c.p077d.p078a.p081k.p091l.p092c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p081k.p084j.C1680q;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.c.q */
/* compiled from: LazyBitmapDrawableResource */
public final class C1823q implements C1685u<BitmapDrawable>, C1680q {

    /* renamed from: e */
    public final Resources f1401e;

    /* renamed from: l */
    public final C1685u<Bitmap> f1402l;

    public C1823q(@NonNull Resources resources, @NonNull C1685u<Bitmap> uVar) {
        C1949i.m2563d(resources);
        this.f1401e = resources;
        C1949i.m2563d(uVar);
        this.f1402l = uVar;
    }

    @Nullable
    /* renamed from: f */
    public static C1685u<BitmapDrawable> m2071f(@NonNull Resources resources, @Nullable C1685u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new C1823q(resources, uVar);
    }

    /* renamed from: a */
    public void mo15875a() {
        C1685u<Bitmap> uVar = this.f1402l;
        if (uVar instanceof C1680q) {
            ((C1680q) uVar).mo15875a();
        }
    }

    @NonNull
    /* renamed from: b */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f1401e, this.f1402l.get());
    }

    /* renamed from: c */
    public void mo15867c() {
        this.f1402l.mo15867c();
    }

    /* renamed from: d */
    public int mo15868d() {
        return this.f1402l.mo15868d();
    }

    @NonNull
    /* renamed from: e */
    public Class<BitmapDrawable> mo15869e() {
        return BitmapDrawable.class;
    }
}

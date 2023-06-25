package p040c.p077d.p078a.p081k.p091l.p097h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p091l.p092c.C1803d;

/* renamed from: c.d.a.k.l.h.c */
/* compiled from: DrawableBytesTranscoder */
public final class C1868c implements C1870e<Drawable, byte[]> {

    /* renamed from: a */
    public final C1697e f1476a;

    /* renamed from: b */
    public final C1870e<Bitmap, byte[]> f1477b;

    /* renamed from: c */
    public final C1870e<GifDrawable, byte[]> f1478c;

    public C1868c(@NonNull C1697e eVar, @NonNull C1870e<Bitmap, byte[]> eVar2, @NonNull C1870e<GifDrawable, byte[]> eVar3) {
        this.f1476a = eVar;
        this.f1477b = eVar2;
        this.f1478c = eVar3;
    }

    @NonNull
    /* renamed from: b */
    public static C1685u<GifDrawable> m2231b(@NonNull C1685u<Drawable> uVar) {
        return uVar;
    }

    @Nullable
    /* renamed from: a */
    public C1685u<byte[]> mo16189a(@NonNull C1685u<Drawable> uVar, @NonNull C1571e eVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f1477b.mo16189a(C1803d.m1984f(((BitmapDrawable) drawable).getBitmap(), this.f1476a), eVar);
        }
        if (!(drawable instanceof GifDrawable)) {
            return null;
        }
        C1870e<GifDrawable, byte[]> eVar2 = this.f1478c;
        m2231b(uVar);
        return eVar2.mo16189a(uVar, eVar);
    }
}

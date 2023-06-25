package p040c.p077d.p078a.p081k.p091l.p096g;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p091l.p092c.C1803d;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.g.e */
/* compiled from: GifDrawableTransformation */
public class C1857e implements C1574h<GifDrawable> {

    /* renamed from: b */
    public final C1574h<Bitmap> f1446b;

    public C1857e(C1574h<Bitmap> hVar) {
        C1949i.m2563d(hVar);
        this.f1446b = hVar;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        this.f1446b.mo15606a(messageDigest);
    }

    @NonNull
    /* renamed from: b */
    public C1685u<GifDrawable> mo15623b(@NonNull Context context, @NonNull C1685u<GifDrawable> uVar, int i, int i2) {
        GifDrawable gifDrawable = uVar.get();
        C1803d dVar = new C1803d(gifDrawable.mo21680e(), C1541c.m1093d(context).mo15451g());
        C1685u<Bitmap> b = this.f1446b.mo15623b(context, dVar, i, i2);
        if (!dVar.equals(b)) {
            dVar.mo15867c();
        }
        gifDrawable.mo21693m(this.f1446b, b.get());
        return uVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1857e) {
            return this.f1446b.equals(((C1857e) obj).f1446b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1446b.hashCode();
    }
}

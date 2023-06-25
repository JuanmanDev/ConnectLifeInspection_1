package p040c.p077d.p078a.p081k.p091l.p092c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;

/* renamed from: c.d.a.k.l.c.m */
/* compiled from: DrawableTransformation */
public class C1819m implements C1574h<Drawable> {

    /* renamed from: b */
    public final C1574h<Bitmap> f1394b;

    /* renamed from: c */
    public final boolean f1395c;

    public C1819m(C1574h<Bitmap> hVar, boolean z) {
        this.f1394b = hVar;
        this.f1395c = z;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        this.f1394b.mo15606a(messageDigest);
    }

    @NonNull
    /* renamed from: b */
    public C1685u<Drawable> mo15623b(@NonNull Context context, @NonNull C1685u<Drawable> uVar, int i, int i2) {
        C1697e g = C1541c.m1093d(context).mo15451g();
        Drawable drawable = uVar.get();
        C1685u<Bitmap> a = C1817l.m2056a(g, drawable, i, i2);
        if (a != null) {
            C1685u<Bitmap> b = this.f1394b.mo15623b(context, a, i, i2);
            if (!b.equals(a)) {
                return mo16105d(context, b);
            }
            b.mo15867c();
            return uVar;
        } else if (!this.f1395c) {
            return uVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: c */
    public C1574h<BitmapDrawable> mo16104c() {
        return this;
    }

    /* renamed from: d */
    public final C1685u<Drawable> mo16105d(Context context, C1685u<Bitmap> uVar) {
        return C1823q.m2071f(context.getResources(), uVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1819m) {
            return this.f1394b.equals(((C1819m) obj).f1394b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1394b.hashCode();
    }
}

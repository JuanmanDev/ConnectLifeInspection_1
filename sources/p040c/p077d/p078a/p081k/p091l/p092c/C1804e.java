package p040c.p077d.p078a.p081k.p091l.p092c;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.c.e */
/* compiled from: BitmapTransformation */
public abstract class C1804e implements C1574h<Bitmap> {
    @NonNull
    /* renamed from: b */
    public final C1685u<Bitmap> mo15623b(@NonNull Context context, @NonNull C1685u<Bitmap> uVar, int i, int i2) {
        if (C1950j.m2583s(i, i2)) {
            C1697e g = C1541c.m1093d(context).mo15451g();
            Bitmap bitmap = uVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo16074c(g, bitmap, i, i2);
            return bitmap.equals(c) ? uVar : C1803d.m1984f(c, g);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo16074c(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2);
}

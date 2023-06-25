package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p084j.p088z.C1698f;

/* renamed from: c.d.a.k.l.c.l */
/* compiled from: DrawableToBitmapConverter */
public final class C1817l {

    /* renamed from: a */
    public static final C1697e f1393a = new C1818a();

    /* renamed from: c.d.a.k.l.c.l$a */
    /* compiled from: DrawableToBitmapConverter */
    public class C1818a extends C1698f {
        /* renamed from: c */
        public void mo15922c(Bitmap bitmap) {
        }
    }

    @Nullable
    /* renamed from: a */
    public static C1685u<Bitmap> m2056a(C1697e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m2057b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f1393a;
        }
        return C1803d.m1984f(bitmap, eVar);
    }

    @Nullable
    /* renamed from: b */
    public static Bitmap m2057b(C1697e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = C1830v.m2101i();
            i3.lock();
            Bitmap d = eVar.mo15923d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                i3.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
            }
            return null;
        }
    }
}

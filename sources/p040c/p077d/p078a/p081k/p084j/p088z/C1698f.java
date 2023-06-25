package p040c.p077d.p078a.p081k.p084j.p088z;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: c.d.a.k.j.z.f */
/* compiled from: BitmapPoolAdapter */
public class C1698f implements C1697e {
    /* renamed from: a */
    public void mo15920a(int i) {
    }

    /* renamed from: b */
    public void mo15921b() {
    }

    /* renamed from: c */
    public void mo15922c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo15923d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo15924e(int i, int i2, Bitmap.Config config) {
        return mo15923d(i, i2, config);
    }
}

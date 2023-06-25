package p040c.p531f0.p532a.p536f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: c.f0.a.f.d */
/* compiled from: FastBitmapDrawable */
public class C8840d extends Drawable {

    /* renamed from: a */
    public final Paint f17191a = new Paint(2);

    /* renamed from: b */
    public Bitmap f17192b;

    /* renamed from: c */
    public int f17193c = 255;

    /* renamed from: d */
    public int f17194d;

    /* renamed from: e */
    public int f17195e;

    public C8840d(Bitmap bitmap) {
        mo46011b(bitmap);
    }

    /* renamed from: a */
    public Bitmap mo46010a() {
        return this.f17192b;
    }

    /* renamed from: b */
    public void mo46011b(Bitmap bitmap) {
        this.f17192b = bitmap;
        if (bitmap != null) {
            this.f17194d = bitmap.getWidth();
            this.f17195e = this.f17192b.getHeight();
            return;
        }
        this.f17195e = 0;
        this.f17194d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f17192b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f17192b, (Rect) null, getBounds(), this.f17191a);
        }
    }

    public int getAlpha() {
        return this.f17193c;
    }

    public int getIntrinsicHeight() {
        return this.f17195e;
    }

    public int getIntrinsicWidth() {
        return this.f17194d;
    }

    public int getMinimumHeight() {
        return this.f17195e;
    }

    public int getMinimumWidth() {
        return this.f17194d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f17193c = i;
        this.f17191a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17191a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.f17191a.setFilterBitmap(z);
    }
}

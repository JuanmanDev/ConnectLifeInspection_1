package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p040c.p531f0.p532a.p533c.C8827a;
import p040c.p531f0.p532a.p533c.C8829c;
import p040c.p531f0.p532a.p534d.C8831a;
import p040c.p531f0.p532a.p534d.C8833c;
import p040c.p531f0.p532a.p535e.C8834a;
import p040c.p531f0.p532a.p536f.C8838b;
import p040c.p531f0.p532a.p536f.C8846g;

public class CropImageView extends TransformImageView {

    /* renamed from: A */
    public final Matrix f17295A;

    /* renamed from: B */
    public float f17296B;

    /* renamed from: C */
    public float f17297C;

    /* renamed from: D */
    public C8829c f17298D;

    /* renamed from: E */
    public Runnable f17299E;

    /* renamed from: F */
    public Runnable f17300F;

    /* renamed from: G */
    public float f17301G;

    /* renamed from: H */
    public float f17302H;

    /* renamed from: I */
    public int f17303I;

    /* renamed from: J */
    public int f17304J;

    /* renamed from: K */
    public long f17305K;

    /* renamed from: z */
    public final RectF f17306z;

    /* renamed from: com.yalantis.ucrop.view.CropImageView$a */
    public static class C8873a implements Runnable {

        /* renamed from: e */
        public final WeakReference<CropImageView> f17307e;

        /* renamed from: l */
        public final long f17308l;

        /* renamed from: m */
        public final long f17309m = System.currentTimeMillis();

        /* renamed from: n */
        public final float f17310n;

        /* renamed from: o */
        public final float f17311o;

        /* renamed from: p */
        public final float f17312p;

        /* renamed from: q */
        public final float f17313q;

        /* renamed from: r */
        public final float f17314r;

        /* renamed from: s */
        public final float f17315s;

        /* renamed from: t */
        public final boolean f17316t;

        public C8873a(CropImageView cropImageView, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f17307e = new WeakReference<>(cropImageView);
            this.f17308l = j;
            this.f17310n = f;
            this.f17311o = f2;
            this.f17312p = f3;
            this.f17313q = f4;
            this.f17314r = f5;
            this.f17315s = f6;
            this.f17316t = z;
        }

        public void run() {
            CropImageView cropImageView = (CropImageView) this.f17307e.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.f17308l, System.currentTimeMillis() - this.f17309m);
                float b = C8838b.m23798b(min, 0.0f, this.f17312p, (float) this.f17308l);
                float b2 = C8838b.m23798b(min, 0.0f, this.f17313q, (float) this.f17308l);
                float a = C8838b.m23797a(min, 0.0f, this.f17315s, (float) this.f17308l);
                if (min < ((float) this.f17308l)) {
                    float[] fArr = cropImageView.f17363l;
                    cropImageView.mo46203k(b - (fArr[0] - this.f17310n), b2 - (fArr[1] - this.f17311o));
                    if (!this.f17316t) {
                        cropImageView.mo46120B(this.f17314r + a, cropImageView.f17306z.centerX(), cropImageView.f17306z.centerY());
                    }
                    if (!cropImageView.mo46142t()) {
                        cropImageView.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.CropImageView$b */
    public static class C8874b implements Runnable {

        /* renamed from: e */
        public final WeakReference<CropImageView> f17317e;

        /* renamed from: l */
        public final long f17318l;

        /* renamed from: m */
        public final long f17319m = System.currentTimeMillis();

        /* renamed from: n */
        public final float f17320n;

        /* renamed from: o */
        public final float f17321o;

        /* renamed from: p */
        public final float f17322p;

        /* renamed from: q */
        public final float f17323q;

        public C8874b(CropImageView cropImageView, long j, float f, float f2, float f3, float f4) {
            this.f17317e = new WeakReference<>(cropImageView);
            this.f17318l = j;
            this.f17320n = f;
            this.f17321o = f2;
            this.f17322p = f3;
            this.f17323q = f4;
        }

        public void run() {
            CropImageView cropImageView = (CropImageView) this.f17317e.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.f17318l, System.currentTimeMillis() - this.f17319m);
                float a = C8838b.m23797a(min, 0.0f, this.f17321o, (float) this.f17318l);
                if (min < ((float) this.f17318l)) {
                    cropImageView.mo46120B(this.f17320n + a, this.f17322p, this.f17323q);
                    cropImageView.post(this);
                    return;
                }
                cropImageView.mo46146x();
            }
        }
    }

    public CropImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public void mo46119A(float f) {
        mo46120B(f, this.f17306z.centerX(), this.f17306z.centerY());
    }

    /* renamed from: B */
    public void mo46120B(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo46128j(f / getCurrentScale(), f2, f3);
        }
    }

    /* renamed from: C */
    public void mo46121C(float f) {
        mo46122D(f, this.f17306z.centerX(), this.f17306z.centerY());
    }

    /* renamed from: D */
    public void mo46122D(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            mo46128j(f / getCurrentScale(), f2, f3);
        }
    }

    @Nullable
    public C8829c getCropBoundsChangeListener() {
        return this.f17298D;
    }

    public float getMaxScale() {
        return this.f17301G;
    }

    public float getMinScale() {
        return this.f17302H;
    }

    public float getTargetAspectRatio() {
        return this.f17296B;
    }

    /* renamed from: h */
    public void mo46127h() {
        super.mo46127h();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.f17296B == 0.0f) {
                this.f17296B = intrinsicWidth / intrinsicHeight;
            }
            int i = this.f17366o;
            float f = this.f17296B;
            int i2 = (int) (((float) i) / f);
            int i3 = this.f17367p;
            if (i2 > i3) {
                int i4 = (int) (((float) i3) * f);
                int i5 = (i - i4) / 2;
                this.f17306z.set((float) i5, 0.0f, (float) (i4 + i5), (float) i3);
            } else {
                int i6 = (i3 - i2) / 2;
                this.f17306z.set(0.0f, (float) i6, (float) i, (float) (i2 + i6));
            }
            mo46131q(intrinsicWidth, intrinsicHeight);
            mo46147y(intrinsicWidth, intrinsicHeight);
            C8829c cVar = this.f17298D;
            if (cVar != null) {
                cVar.mo45980a(this.f17296B);
            }
            TransformImageView.C8880b bVar = this.f17368q;
            if (bVar != null) {
                bVar.mo46078d(getCurrentScale());
                this.f17368q.mo46075a(getCurrentAngle());
            }
        }
    }

    /* renamed from: j */
    public void mo46128j(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.mo46128j(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.mo46128j(f, f2, f3);
        }
    }

    /* renamed from: o */
    public final float[] mo46129o() {
        this.f17295A.reset();
        this.f17295A.setRotate(-getCurrentAngle());
        float[] fArr = this.f17362e;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b = C8846g.m23824b(this.f17306z);
        this.f17295A.mapPoints(copyOf);
        this.f17295A.mapPoints(b);
        RectF d = C8846g.m23826d(copyOf);
        RectF d2 = C8846g.m23826d(b);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.f17295A.reset();
        this.f17295A.setRotate(getCurrentAngle());
        this.f17295A.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: p */
    public final void mo46130p() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            mo46131q((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: q */
    public final void mo46131q(float f, float f2) {
        float min = Math.min(Math.min(this.f17306z.width() / f, this.f17306z.width() / f2), Math.min(this.f17306z.height() / f2, this.f17306z.height() / f));
        this.f17302H = min;
        this.f17301G = min * this.f17297C;
    }

    /* renamed from: r */
    public void mo46132r() {
        removeCallbacks(this.f17299E);
        removeCallbacks(this.f17300F);
    }

    /* renamed from: s */
    public void mo46133s(@NonNull Bitmap.CompressFormat compressFormat, int i, @Nullable C8827a aVar) {
        mo46132r();
        setImageToWrapCropBounds(false);
        new C8834a(getContext(), getViewBitmap(), new C8833c(this.f17306z, C8846g.m23826d(this.f17362e), getCurrentScale(), getCurrentAngle()), new C8831a(this.f17303I, this.f17304J, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void setCropBoundsChangeListener(@Nullable C8829c cVar) {
        this.f17298D = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f17296B = rectF.width() / rectF.height();
        this.f17306z.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        mo46130p();
        mo46146x();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.f17372u && !mo46142t()) {
            float[] fArr = this.f17363l;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f17306z.centerX() - f4;
            float centerY = this.f17306z.centerY() - f5;
            this.f17295A.reset();
            this.f17295A.setTranslate(centerX, centerY);
            float[] fArr2 = this.f17362e;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f17295A.mapPoints(copyOf);
            boolean u = mo46143u(copyOf);
            if (u) {
                float[] o = mo46129o();
                f2 = -(o[1] + o[3]);
                f3 = -(o[0] + o[2]);
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.f17306z);
                this.f17295A.reset();
                this.f17295A.setRotate(getCurrentAngle());
                this.f17295A.mapRect(rectF);
                float[] c = C8846g.m23825c(this.f17362e);
                f3 = centerX;
                f = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                C8873a aVar = new C8873a(this, this.f17305K, f4, f5, f3, f2, currentScale, f, u);
                this.f17299E = aVar;
                post(aVar);
                return;
            }
            mo46203k(f3, f2);
            if (!u) {
                mo46120B(currentScale + f, this.f17306z.centerX(), this.f17306z.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j) {
        if (j > 0) {
            this.f17305K = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.f17303I = i;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.f17304J = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f17297C = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f17296B = f;
            return;
        }
        if (f == 0.0f) {
            this.f17296B = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        } else {
            this.f17296B = f;
        }
        C8829c cVar = this.f17298D;
        if (cVar != null) {
            cVar.mo45980a(this.f17296B);
        }
    }

    /* renamed from: t */
    public boolean mo46142t() {
        return mo46143u(this.f17362e);
    }

    /* renamed from: u */
    public boolean mo46143u(float[] fArr) {
        this.f17295A.reset();
        this.f17295A.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f17295A.mapPoints(copyOf);
        float[] b = C8846g.m23824b(this.f17306z);
        this.f17295A.mapPoints(b);
        return C8846g.m23826d(copyOf).contains(C8846g.m23826d(b));
    }

    /* renamed from: v */
    public void mo46144v(float f) {
        mo46202i(f, this.f17306z.centerX(), this.f17306z.centerY());
    }

    /* renamed from: w */
    public void mo46145w(@NonNull TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f17296B = 0.0f;
        } else {
            this.f17296B = abs / abs2;
        }
    }

    /* renamed from: x */
    public void mo46146x() {
        setImageToWrapCropBounds(true);
    }

    /* renamed from: y */
    public final void mo46147y(float f, float f2) {
        float width = this.f17306z.width();
        float height = this.f17306z.height();
        float max = Math.max(this.f17306z.width() / f, this.f17306z.height() / f2);
        RectF rectF = this.f17306z;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f17365n.reset();
        this.f17365n.postScale(max, max);
        this.f17365n.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f17365n);
    }

    /* renamed from: z */
    public void mo46148z(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        C8874b bVar = new C8874b(this, j, currentScale, f - currentScale, f2, f3);
        this.f17300F = bVar;
        post(bVar);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17306z = new RectF();
        this.f17295A = new Matrix();
        this.f17297C = 10.0f;
        this.f17300F = null;
        this.f17303I = 0;
        this.f17304J = 0;
        this.f17305K = 500;
    }
}

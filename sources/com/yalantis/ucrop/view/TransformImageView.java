package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import p040c.p531f0.p532a.p533c.C8828b;
import p040c.p531f0.p532a.p534d.C8832b;
import p040c.p531f0.p532a.p536f.C8837a;
import p040c.p531f0.p532a.p536f.C8840d;
import p040c.p531f0.p532a.p536f.C8846g;

public class TransformImageView extends AppCompatImageView {

    /* renamed from: e */
    public final float[] f17362e;

    /* renamed from: l */
    public final float[] f17363l;

    /* renamed from: m */
    public final float[] f17364m;

    /* renamed from: n */
    public Matrix f17365n;

    /* renamed from: o */
    public int f17366o;

    /* renamed from: p */
    public int f17367p;

    /* renamed from: q */
    public C8880b f17368q;

    /* renamed from: r */
    public float[] f17369r;

    /* renamed from: s */
    public float[] f17370s;

    /* renamed from: t */
    public boolean f17371t;

    /* renamed from: u */
    public boolean f17372u;

    /* renamed from: v */
    public int f17373v;

    /* renamed from: w */
    public String f17374w;

    /* renamed from: x */
    public String f17375x;

    /* renamed from: y */
    public C8832b f17376y;

    /* renamed from: com.yalantis.ucrop.view.TransformImageView$a */
    public class C8879a implements C8828b {
        public C8879a() {
        }

        /* renamed from: a */
        public void mo45978a(@NonNull Bitmap bitmap, @NonNull C8832b bVar, @NonNull String str, @Nullable String str2) {
            String unused = TransformImageView.this.f17374w = str;
            String unused2 = TransformImageView.this.f17375x = str2;
            C8832b unused3 = TransformImageView.this.f17376y = bVar;
            TransformImageView transformImageView = TransformImageView.this;
            transformImageView.f17371t = true;
            transformImageView.setImageBitmap(bitmap);
        }

        public void onFailure(@NonNull Exception exc) {
            C8880b bVar = TransformImageView.this.f17368q;
            if (bVar != null) {
                bVar.mo46077c(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.TransformImageView$b */
    public interface C8880b {
        /* renamed from: a */
        void mo46075a(float f);

        /* renamed from: b */
        void mo46076b();

        /* renamed from: c */
        void mo46077c(@NonNull Exception exc);

        /* renamed from: d */
        void mo46078d(float f);
    }

    public TransformImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public float mo46192d(@NonNull Matrix matrix) {
        return (float) (-(Math.atan2((double) mo46194f(matrix, 1), (double) mo46194f(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: e */
    public float mo46193e(@NonNull Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) mo46194f(matrix, 0), 2.0d) + Math.pow((double) mo46194f(matrix, 3), 2.0d));
    }

    /* renamed from: f */
    public float mo46194f(@NonNull Matrix matrix, @IntRange(from = 0, mo840to = 9) int i) {
        matrix.getValues(this.f17364m);
        return this.f17364m[i];
    }

    /* renamed from: g */
    public void mo46152g() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public float getCurrentAngle() {
        return mo46192d(this.f17365n);
    }

    public float getCurrentScale() {
        return mo46193e(this.f17365n);
    }

    public C8832b getExifInfo() {
        return this.f17376y;
    }

    public String getImageInputPath() {
        return this.f17374w;
    }

    public String getImageOutputPath() {
        return this.f17375x;
    }

    public int getMaxBitmapSize() {
        if (this.f17373v <= 0) {
            this.f17373v = C8837a.m23790b(getContext());
        }
        return this.f17373v;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C8840d)) {
            return null;
        }
        return ((C8840d) getDrawable()).mo46010a();
    }

    /* renamed from: h */
    public void mo46127h() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)});
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f17369r = C8846g.m23824b(rectF);
            this.f17370s = C8846g.m23823a(rectF);
            this.f17372u = true;
            C8880b bVar = this.f17368q;
            if (bVar != null) {
                bVar.mo46076b();
            }
        }
    }

    /* renamed from: i */
    public void mo46202i(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f17365n.postRotate(f, f2, f3);
            setImageMatrix(this.f17365n);
            C8880b bVar = this.f17368q;
            if (bVar != null) {
                bVar.mo46075a(mo46192d(this.f17365n));
            }
        }
    }

    /* renamed from: j */
    public void mo46128j(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f17365n.postScale(f, f, f2, f3);
            setImageMatrix(this.f17365n);
            C8880b bVar = this.f17368q;
            if (bVar != null) {
                bVar.mo46078d(mo46193e(this.f17365n));
            }
        }
    }

    /* renamed from: k */
    public void mo46203k(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f17365n.postTranslate(f, f2);
            setImageMatrix(this.f17365n);
        }
    }

    /* renamed from: l */
    public void mo46204l(@NonNull Uri uri, @Nullable Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C8837a.m23792d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C8879a());
    }

    /* renamed from: m */
    public final void mo46205m() {
        this.f17365n.mapPoints(this.f17362e, this.f17369r);
        this.f17365n.mapPoints(this.f17363l, this.f17370s);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f17371t && !this.f17372u)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f17366o = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f17367p = (getHeight() - getPaddingBottom()) - paddingTop;
            mo46127h();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C8840d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f17365n.set(matrix);
        mo46205m();
    }

    public void setMaxBitmapSize(int i) {
        this.f17373v = i;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(C8880b bVar) {
        this.f17368q = bVar;
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17362e = new float[8];
        this.f17363l = new float[2];
        this.f17364m = new float[9];
        this.f17365n = new Matrix();
        this.f17371t = false;
        this.f17372u = false;
        this.f17373v = 0;
        mo46152g();
    }
}

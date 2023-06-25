package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import p040c.p531f0.p532a.p533c.C8830d;
import p040c.p531f0.p532a.p536f.C8846g;

public class OverlayView extends View {

    /* renamed from: A */
    public Paint f17335A;

    /* renamed from: B */
    public Paint f17336B;

    /* renamed from: C */
    public int f17337C;

    /* renamed from: D */
    public float f17338D;

    /* renamed from: E */
    public float f17339E;

    /* renamed from: F */
    public int f17340F;

    /* renamed from: G */
    public int f17341G;

    /* renamed from: H */
    public int f17342H;

    /* renamed from: I */
    public int f17343I;

    /* renamed from: J */
    public C8830d f17344J;

    /* renamed from: K */
    public boolean f17345K;

    /* renamed from: e */
    public final RectF f17346e;

    /* renamed from: l */
    public final RectF f17347l;

    /* renamed from: m */
    public int f17348m;

    /* renamed from: n */
    public int f17349n;

    /* renamed from: o */
    public float[] f17350o;

    /* renamed from: p */
    public int f17351p;

    /* renamed from: q */
    public int f17352q;

    /* renamed from: r */
    public float f17353r;

    /* renamed from: s */
    public float[] f17354s;

    /* renamed from: t */
    public boolean f17355t;

    /* renamed from: u */
    public boolean f17356u;

    /* renamed from: v */
    public boolean f17357v;

    /* renamed from: w */
    public int f17358w;

    /* renamed from: x */
    public Path f17359x;

    /* renamed from: y */
    public Paint f17360y;

    /* renamed from: z */
    public Paint f17361z;

    public OverlayView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo46162a(@NonNull Canvas canvas) {
        if (this.f17356u) {
            if (this.f17354s == null && !this.f17346e.isEmpty()) {
                this.f17354s = new float[((this.f17351p * 4) + (this.f17352q * 4))];
                int i = 0;
                for (int i2 = 0; i2 < this.f17351p; i2++) {
                    float[] fArr = this.f17354s;
                    int i3 = i + 1;
                    RectF rectF = this.f17346e;
                    fArr[i] = rectF.left;
                    int i4 = i3 + 1;
                    float f = ((float) i2) + 1.0f;
                    float height = rectF.height() * (f / ((float) (this.f17351p + 1)));
                    RectF rectF2 = this.f17346e;
                    fArr[i3] = height + rectF2.top;
                    float[] fArr2 = this.f17354s;
                    int i5 = i4 + 1;
                    fArr2[i4] = rectF2.right;
                    i = i5 + 1;
                    fArr2[i5] = (rectF2.height() * (f / ((float) (this.f17351p + 1)))) + this.f17346e.top;
                }
                for (int i6 = 0; i6 < this.f17352q; i6++) {
                    float[] fArr3 = this.f17354s;
                    int i7 = i + 1;
                    float f2 = ((float) i6) + 1.0f;
                    float width = this.f17346e.width() * (f2 / ((float) (this.f17352q + 1)));
                    RectF rectF3 = this.f17346e;
                    fArr3[i] = width + rectF3.left;
                    float[] fArr4 = this.f17354s;
                    int i8 = i7 + 1;
                    fArr4[i7] = rectF3.top;
                    int i9 = i8 + 1;
                    float width2 = rectF3.width() * (f2 / ((float) (this.f17352q + 1)));
                    RectF rectF4 = this.f17346e;
                    fArr4[i8] = width2 + rectF4.left;
                    i = i9 + 1;
                    this.f17354s[i9] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f17354s;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f17361z);
            }
        }
        if (this.f17355t) {
            canvas.drawRect(this.f17346e, this.f17335A);
        }
        if (this.f17337C != 0) {
            canvas.save();
            this.f17347l.set(this.f17346e);
            RectF rectF5 = this.f17347l;
            int i10 = this.f17343I;
            rectF5.inset((float) i10, (float) (-i10));
            canvas.clipRect(this.f17347l, Region.Op.DIFFERENCE);
            this.f17347l.set(this.f17346e);
            RectF rectF6 = this.f17347l;
            int i11 = this.f17343I;
            rectF6.inset((float) (-i11), (float) i11);
            canvas.clipRect(this.f17347l, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f17346e, this.f17336B);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo46163b(@NonNull Canvas canvas) {
        canvas.save();
        if (this.f17357v) {
            canvas.clipPath(this.f17359x, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f17346e, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f17358w);
        canvas.restore();
        if (this.f17357v) {
            canvas.drawCircle(this.f17346e.centerX(), this.f17346e.centerY(), Math.min(this.f17346e.width(), this.f17346e.height()) / 2.0f, this.f17360y);
        }
    }

    /* renamed from: c */
    public final int mo46164c(float f, float f2) {
        double d = (double) this.f17341G;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f - this.f17350o[i2]), 2.0d) + Math.pow((double) (f2 - this.f17350o[i2 + 1]), 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.f17337C != 1 || i >= 0 || !this.f17346e.contains(f, f2)) {
            return i;
        }
        return 4;
    }

    /* renamed from: d */
    public void mo46165d() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: e */
    public final void mo46166e(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R$color.ucrop_color_default_crop_frame));
        this.f17335A.setStrokeWidth((float) dimensionPixelSize);
        this.f17335A.setColor(color);
        this.f17335A.setStyle(Paint.Style.STROKE);
        this.f17336B.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.f17336B.setColor(color);
        this.f17336B.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    public final void mo46167f(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R$color.ucrop_color_default_crop_grid));
        this.f17361z.setStrokeWidth((float) dimensionPixelSize);
        this.f17361z.setColor(color);
        this.f17351p = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.f17352q = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    /* renamed from: g */
    public void mo46168g(@NonNull TypedArray typedArray) {
        this.f17357v = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R$color.ucrop_color_default_dimmed));
        this.f17358w = color;
        this.f17360y.setColor(color);
        this.f17360y.setStyle(Paint.Style.STROKE);
        this.f17360y.setStrokeWidth(1.0f);
        mo46166e(typedArray);
        this.f17355t = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_frame, true);
        mo46167f(typedArray);
        this.f17356u = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f17346e;
    }

    public int getFreestyleCropMode() {
        return this.f17337C;
    }

    public C8830d getOverlayViewChangeListener() {
        return this.f17344J;
    }

    /* renamed from: h */
    public void mo46172h() {
        int i = this.f17348m;
        float f = this.f17353r;
        int i2 = (int) (((float) i) / f);
        int i3 = this.f17349n;
        if (i2 > i3) {
            int i4 = (int) (((float) i3) * f);
            int i5 = (i - i4) / 2;
            this.f17346e.set((float) (getPaddingLeft() + i5), (float) getPaddingTop(), (float) (getPaddingLeft() + i4 + i5), (float) (getPaddingTop() + this.f17349n));
        } else {
            int i6 = (i3 - i2) / 2;
            this.f17346e.set((float) getPaddingLeft(), (float) (getPaddingTop() + i6), (float) (getPaddingLeft() + this.f17348m), (float) (getPaddingTop() + i2 + i6));
        }
        C8830d dVar = this.f17344J;
        if (dVar != null) {
            dVar.mo45981a(this.f17346e);
        }
        mo46174j();
    }

    /* renamed from: i */
    public final void mo46173i(float f, float f2) {
        this.f17347l.set(this.f17346e);
        int i = this.f17340F;
        boolean z = true;
        if (i == 0) {
            RectF rectF = this.f17347l;
            RectF rectF2 = this.f17346e;
            rectF.set(f, f2, rectF2.right, rectF2.bottom);
        } else if (i == 1) {
            RectF rectF3 = this.f17347l;
            RectF rectF4 = this.f17346e;
            rectF3.set(rectF4.left, f2, f, rectF4.bottom);
        } else if (i == 2) {
            RectF rectF5 = this.f17347l;
            RectF rectF6 = this.f17346e;
            rectF5.set(rectF6.left, rectF6.top, f, f2);
        } else if (i == 3) {
            RectF rectF7 = this.f17347l;
            RectF rectF8 = this.f17346e;
            rectF7.set(f, rectF8.top, rectF8.right, f2);
        } else if (i == 4) {
            this.f17347l.offset(f - this.f17338D, f2 - this.f17339E);
            if (this.f17347l.left > ((float) getLeft()) && this.f17347l.top > ((float) getTop()) && this.f17347l.right < ((float) getRight()) && this.f17347l.bottom < ((float) getBottom())) {
                this.f17346e.set(this.f17347l);
                mo46174j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z2 = this.f17347l.height() >= ((float) this.f17342H);
        if (this.f17347l.width() < ((float) this.f17342H)) {
            z = false;
        }
        RectF rectF9 = this.f17346e;
        rectF9.set(z ? this.f17347l.left : rectF9.left, (z2 ? this.f17347l : this.f17346e).top, (z ? this.f17347l : this.f17346e).right, (z2 ? this.f17347l : this.f17346e).bottom);
        if (z2 || z) {
            mo46174j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    public final void mo46174j() {
        this.f17350o = C8846g.m23824b(this.f17346e);
        C8846g.m23823a(this.f17346e);
        this.f17354s = null;
        this.f17359x.reset();
        this.f17359x.addCircle(this.f17346e.centerX(), this.f17346e.centerY(), Math.min(this.f17346e.width(), this.f17346e.height()) / 2.0f, Path.Direction.CW);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo46163b(canvas);
        mo46162a(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f17348m = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f17349n = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f17345K) {
                this.f17345K = false;
                setTargetAspectRatio(this.f17353r);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f17346e.isEmpty() && this.f17337C != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = mo46164c(x, y);
                this.f17340F = c;
                if (c != -1) {
                    z = true;
                }
                if (!z) {
                    this.f17338D = -1.0f;
                    this.f17339E = -1.0f;
                } else if (this.f17338D < 0.0f) {
                    this.f17338D = x;
                    this.f17339E = y;
                }
                return z;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f17340F != -1) {
                float min = Math.min(Math.max(x, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                mo46173i(min, min2);
                this.f17338D = min;
                this.f17339E = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f17338D = -1.0f;
                this.f17339E = -1.0f;
                this.f17340F = -1;
                C8830d dVar = this.f17344J;
                if (dVar != null) {
                    dVar.mo45981a(this.f17346e);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f17357v = z;
    }

    public void setCropFrameColor(@ColorInt int i) {
        this.f17335A.setColor(i);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i) {
        this.f17335A.setStrokeWidth((float) i);
    }

    public void setCropGridColor(@ColorInt int i) {
        this.f17361z.setColor(i);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i) {
        this.f17352q = i;
        this.f17354s = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i) {
        this.f17351p = i;
        this.f17354s = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i) {
        this.f17361z.setStrokeWidth((float) i);
    }

    public void setDimmedColor(@ColorInt int i) {
        this.f17358w = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f17337C = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f17337C = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(C8830d dVar) {
        this.f17344J = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.f17355t = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f17356u = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f17353r = f;
        if (this.f17348m > 0) {
            mo46172h();
            postInvalidate();
            return;
        }
        this.f17345K = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17346e = new RectF();
        this.f17347l = new RectF();
        this.f17354s = null;
        this.f17359x = new Path();
        this.f17360y = new Paint(1);
        this.f17361z = new Paint(1);
        this.f17335A = new Paint(1);
        this.f17336B = new Paint(1);
        this.f17337C = 0;
        this.f17338D = -1.0f;
        this.f17339E = -1.0f;
        this.f17340F = -1;
        this.f17341G = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f17342H = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_min_size);
        this.f17343I = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        mo46165d();
    }
}

package com.juconnect.connectlife.ju_picture.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.juconnect.connectlife.ju_picture.R$color;

public class ScanView extends View {

    /* renamed from: A */
    public int f16691A;

    /* renamed from: B */
    public int f16692B;

    /* renamed from: C */
    public int f16693C;

    /* renamed from: D */
    public Paint f16694D;

    /* renamed from: E */
    public Rect f16695E;

    /* renamed from: F */
    public Rect f16696F;

    /* renamed from: G */
    public Rect f16697G;

    /* renamed from: H */
    public Rect f16698H;

    /* renamed from: I */
    public boolean f16699I;

    /* renamed from: e */
    public Rect f16700e;

    /* renamed from: l */
    public Paint f16701l;

    /* renamed from: m */
    public Paint f16702m;

    /* renamed from: n */
    public Paint f16703n;

    /* renamed from: o */
    public Path f16704o;

    /* renamed from: p */
    public int f16705p;

    /* renamed from: q */
    public float f16706q;

    /* renamed from: r */
    public Path f16707r;

    /* renamed from: s */
    public LinearGradient f16708s;

    /* renamed from: t */
    public LinearGradient f16709t;

    /* renamed from: u */
    public float f16710u;

    /* renamed from: v */
    public int f16711v;

    /* renamed from: w */
    public float f16712w;

    /* renamed from: x */
    public float f16713x;

    /* renamed from: y */
    public Matrix f16714y;

    /* renamed from: z */
    public ValueAnimator f16715z;

    /* renamed from: com.juconnect.connectlife.ju_picture.view.ScanView$a */
    public class C8745a implements ValueAnimator.AnimatorUpdateListener {
        public C8745a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (ScanView.this.f16714y != null && ScanView.this.f16709t != null) {
                ScanView.this.f16714y.setTranslate(0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ScanView.this.f16709t.setLocalMatrix(ScanView.this.f16714y);
                ScanView.this.f16708s.setLocalMatrix(ScanView.this.f16714y);
                ScanView.this.invalidate();
            }
        }
    }

    public ScanView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public final void mo44781d() {
        Paint paint = new Paint(1);
        this.f16702m = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f16702m.setStrokeWidth(this.f16710u);
        Paint paint2 = new Paint(1);
        this.f16703n = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f16692B = ContextCompat.getColor(getContext(), R$color.colorAccent);
        Paint paint3 = new Paint(1);
        this.f16701l = paint3;
        paint3.setColor(this.f16705p);
        this.f16701l.setStrokeWidth(this.f16706q);
        this.f16701l.setStyle(Paint.Style.STROKE);
        Matrix matrix = new Matrix();
        this.f16714y = matrix;
        matrix.setTranslate(0.0f, 30.0f);
        this.f16694D = new Paint(1);
    }

    /* renamed from: e */
    public final void mo44782e() {
        this.f16695E = new Rect(0, 0, getWidth(), this.f16700e.top);
        Rect rect = this.f16700e;
        this.f16696F = new Rect(0, rect.top, rect.left, rect.bottom);
        this.f16697G = new Rect(0, this.f16700e.bottom, getWidth(), getHeight());
        Rect rect2 = this.f16700e;
        this.f16698H = new Rect(rect2.right, rect2.top, getWidth(), this.f16700e.bottom);
    }

    /* renamed from: f */
    public final void mo44783f() {
        if (this.f16704o == null) {
            this.f16713x = ((float) this.f16700e.width()) * this.f16712w;
            Path path = new Path();
            this.f16704o = path;
            Rect rect = this.f16700e;
            path.moveTo((float) rect.left, ((float) rect.top) + this.f16713x);
            Path path2 = this.f16704o;
            Rect rect2 = this.f16700e;
            path2.lineTo((float) rect2.left, (float) rect2.top);
            Path path3 = this.f16704o;
            Rect rect3 = this.f16700e;
            path3.lineTo(((float) rect3.left) + this.f16713x, (float) rect3.top);
            Path path4 = this.f16704o;
            Rect rect4 = this.f16700e;
            path4.moveTo(((float) rect4.right) - this.f16713x, (float) rect4.top);
            Path path5 = this.f16704o;
            Rect rect5 = this.f16700e;
            path5.lineTo((float) rect5.right, (float) rect5.top);
            Path path6 = this.f16704o;
            Rect rect6 = this.f16700e;
            path6.lineTo((float) rect6.right, ((float) rect6.top) + this.f16713x);
            Path path7 = this.f16704o;
            Rect rect7 = this.f16700e;
            path7.moveTo((float) rect7.right, ((float) rect7.bottom) - this.f16713x);
            Path path8 = this.f16704o;
            Rect rect8 = this.f16700e;
            path8.lineTo((float) rect8.right, (float) rect8.bottom);
            Path path9 = this.f16704o;
            Rect rect9 = this.f16700e;
            path9.lineTo(((float) rect9.right) - this.f16713x, (float) rect9.bottom);
            Path path10 = this.f16704o;
            Rect rect10 = this.f16700e;
            path10.moveTo(((float) rect10.left) + this.f16713x, (float) rect10.bottom);
            Path path11 = this.f16704o;
            Rect rect11 = this.f16700e;
            path11.lineTo((float) rect11.left, (float) rect11.bottom);
            Path path12 = this.f16704o;
            Rect rect12 = this.f16700e;
            path12.lineTo((float) rect12.left, ((float) rect12.bottom) - this.f16713x);
        }
        if (this.f16715z == null) {
            mo44786i(this.f16700e.height());
        }
    }

    /* renamed from: g */
    public final void mo44784g() {
        if (this.f16707r == null) {
            this.f16707r = new Path();
            float width = ((float) this.f16700e.width()) / (((float) this.f16711v) + 0.0f);
            float height = ((float) this.f16700e.height()) / (((float) this.f16711v) + 0.0f);
            for (int i = 0; i <= this.f16711v; i++) {
                Path path = this.f16707r;
                Rect rect = this.f16700e;
                float f = ((float) i) * width;
                path.moveTo(((float) rect.left) + f, (float) rect.top);
                Path path2 = this.f16707r;
                Rect rect2 = this.f16700e;
                path2.lineTo(((float) rect2.left) + f, (float) rect2.bottom);
            }
            for (int i2 = 0; i2 <= this.f16711v; i2++) {
                Path path3 = this.f16707r;
                Rect rect3 = this.f16700e;
                float f2 = ((float) i2) * height;
                path3.moveTo((float) rect3.left, ((float) rect3.top) + f2);
                Path path4 = this.f16707r;
                Rect rect4 = this.f16700e;
                path4.lineTo((float) rect4.right, ((float) rect4.top) + f2);
            }
        }
        if (this.f16709t == null) {
            Rect rect5 = this.f16700e;
            LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect5.top, 0.0f, ((float) rect5.bottom) + (((float) rect5.height()) * 0.01f), new int[]{0, 0, this.f16692B, 0}, new float[]{0.0f, 0.5f, 0.99f, 1.0f}, Shader.TileMode.CLAMP);
            this.f16709t = linearGradient;
            linearGradient.setLocalMatrix(this.f16714y);
            this.f16702m.setShader(this.f16709t);
        }
    }

    /* renamed from: h */
    public final void mo44785h() {
        if (this.f16708s == null) {
            Rect rect = this.f16700e;
            LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, ((float) rect.bottom) + (((float) rect.height()) * 0.01f), new int[]{0, 0, this.f16692B, 0}, new float[]{0.0f, 0.85f, 0.99f, 1.0f}, Shader.TileMode.CLAMP);
            this.f16708s = linearGradient;
            linearGradient.setLocalMatrix(this.f16714y);
            this.f16703n.setShader(this.f16708s);
        }
    }

    /* renamed from: i */
    public void mo44786i(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f16715z = valueAnimator;
        valueAnimator.setDuration((long) this.f16691A);
        this.f16715z.setFloatValues(new float[]{(float) (-i), 0.0f});
        this.f16715z.setRepeatMode(1);
        this.f16715z.setInterpolator(new DecelerateInterpolator());
        this.f16715z.setRepeatCount(-1);
        this.f16715z.addUpdateListener(new C8745a());
        this.f16715z.start();
    }

    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f16715z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f16715z.cancel();
        }
        super.onDetachedFromWindow();
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Path path;
        this.f16694D.setColor(Color.parseColor("#00000000"));
        if (this.f16699I) {
            if (this.f16700e != null && (path = this.f16704o) != null) {
                canvas.drawPath(path, this.f16701l);
                mo44785h();
                mo44784g();
                int i = this.f16693C;
                if (i == 0) {
                    canvas.drawPath(this.f16707r, this.f16702m);
                } else if (i == 1) {
                    canvas.drawRect(this.f16700e, this.f16703n);
                } else if (i == 2) {
                    canvas.drawPath(this.f16707r, this.f16702m);
                    canvas.drawRect(this.f16700e, this.f16703n);
                }
            } else {
                return;
            }
        }
        canvas.drawRect(this.f16695E, this.f16694D);
        canvas.drawRect(this.f16696F, this.f16694D);
        canvas.drawRect(this.f16697G, this.f16694D);
        canvas.drawRect(this.f16698H, this.f16694D);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int min = Math.min((measuredHeight * 5) / 8, (measuredWidth * 5) / 8);
        int i5 = (measuredWidth - min) / 2;
        int i6 = (measuredHeight - min) / 2;
        this.f16700e = new Rect(i5, i6, i5 + min, min + i6);
        mo44783f();
        mo44782e();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setScanAnimatorDuration(int i) {
        this.f16691A = i;
    }

    public void setScanStyle(int i) {
        this.f16693C = i;
    }

    public void setScancolor(int i) {
        this.f16692B = i;
    }

    public void setStop(Boolean bool) {
        this.f16699I = bool.booleanValue();
    }

    public ScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16705p = -1;
        this.f16706q = 8.0f;
        this.f16710u = 2.0f;
        this.f16711v = 40;
        this.f16712w = 0.25f;
        this.f16713x = 50.0f;
        this.f16691A = 1800;
        this.f16693C = 0;
        this.f16699I = true;
        mo44781d();
    }
}

package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;

public class HorizontalProgressWheelView extends View {

    /* renamed from: e */
    public final Rect f17389e;

    /* renamed from: l */
    public C8883a f17390l;

    /* renamed from: m */
    public float f17391m;

    /* renamed from: n */
    public Paint f17392n;

    /* renamed from: o */
    public Paint f17393o;

    /* renamed from: p */
    public int f17394p;

    /* renamed from: q */
    public int f17395q;

    /* renamed from: r */
    public int f17396r;

    /* renamed from: s */
    public boolean f17397s;

    /* renamed from: t */
    public float f17398t;

    /* renamed from: u */
    public int f17399u;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    public interface C8883a {
        /* renamed from: a */
        void mo46080a();

        /* renamed from: b */
        void mo46081b(float f, float f2);

        /* renamed from: c */
        void mo46082c();
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo46223a() {
        this.f17399u = ContextCompat.getColor(getContext(), R$color.ucrop_color_widget_rotate_mid_line);
        this.f17394p = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f17395q = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f17396r = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f17392n = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f17392n.setStrokeWidth((float) this.f17394p);
        this.f17392n.setColor(getResources().getColor(R$color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f17392n);
        this.f17393o = paint2;
        paint2.setColor(this.f17399u);
        this.f17393o.setStrokeCap(Paint.Cap.ROUND);
        this.f17393o.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_middle_wheel_progress_line));
    }

    /* renamed from: b */
    public final void mo46224b(MotionEvent motionEvent, float f) {
        this.f17398t -= f;
        postInvalidate();
        this.f17391m = motionEvent.getX();
        C8883a aVar = this.f17390l;
        if (aVar != null) {
            aVar.mo46081b(-f, this.f17398t);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f17389e);
        int width = this.f17389e.width();
        int i = this.f17394p;
        int i2 = this.f17396r;
        int i3 = width / (i + i2);
        float f = this.f17398t % ((float) (i2 + i));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.f17392n.setAlpha((int) ((((float) i4) / ((float) i5)) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.f17392n.setAlpha((int) ((((float) (i3 - i4)) / ((float) i5)) * 255.0f));
            } else {
                this.f17392n.setAlpha(255);
            }
            float f2 = -f;
            Rect rect = this.f17389e;
            float f3 = ((float) rect.left) + f2 + ((float) ((this.f17394p + this.f17396r) * i4));
            float centerY = ((float) rect.centerY()) - (((float) this.f17395q) / 4.0f);
            Rect rect2 = this.f17389e;
            canvas.drawLine(f3, centerY, f2 + ((float) rect2.left) + ((float) ((this.f17394p + this.f17396r) * i4)), ((float) rect2.centerY()) + (((float) this.f17395q) / 4.0f), this.f17392n);
        }
        float centerX = (float) this.f17389e.centerX();
        float centerY2 = ((float) this.f17389e.centerY()) - (((float) this.f17395q) / 2.0f);
        Canvas canvas2 = canvas;
        float f4 = centerY2;
        canvas2.drawLine(centerX, f4, (float) this.f17389e.centerX(), (((float) this.f17395q) / 2.0f) + ((float) this.f17389e.centerY()), this.f17393o);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17391m = motionEvent.getX();
        } else if (action == 1) {
            C8883a aVar = this.f17390l;
            if (aVar != null) {
                this.f17397s = false;
                aVar.mo46080a();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f17391m;
            if (x != 0.0f) {
                if (!this.f17397s) {
                    this.f17397s = true;
                    C8883a aVar2 = this.f17390l;
                    if (aVar2 != null) {
                        aVar2.mo46082c();
                    }
                }
                mo46224b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i) {
        this.f17399u = i;
        this.f17393o.setColor(i);
        invalidate();
    }

    public void setScrollingListener(C8883a aVar) {
        this.f17390l = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17389e = new Rect();
        mo46223a();
    }
}

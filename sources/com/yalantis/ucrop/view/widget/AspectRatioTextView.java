package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;

public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: e */
    public final Rect f17382e;

    /* renamed from: l */
    public Paint f17383l;

    /* renamed from: m */
    public int f17384m;

    /* renamed from: n */
    public float f17385n;

    /* renamed from: o */
    public String f17386o;

    /* renamed from: p */
    public float f17387p;

    /* renamed from: q */
    public float f17388q;

    public AspectRatioTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo46215a(@ColorInt int i) {
        Paint paint = this.f17383l;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, ContextCompat.getColor(getContext(), R$color.ucrop_color_widget)}));
    }

    /* renamed from: b */
    public float mo46216b(boolean z) {
        if (z) {
            mo46219e();
            mo46218d();
        }
        return this.f17385n;
    }

    /* renamed from: c */
    public final void mo46217c(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.f17386o = typedArray.getString(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.f17387p = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.f17388q = f;
        float f2 = this.f17387p;
        if (f2 == 0.0f || f == 0.0f) {
            this.f17385n = 0.0f;
        } else {
            this.f17385n = f2 / f;
        }
        this.f17384m = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f17383l = paint;
        paint.setStyle(Paint.Style.FILL);
        mo46218d();
        mo46215a(getResources().getColor(R$color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    /* renamed from: d */
    public final void mo46218d() {
        if (!TextUtils.isEmpty(this.f17386o)) {
            setText(this.f17386o);
            return;
        }
        setText(String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f17387p), Integer.valueOf((int) this.f17388q)}));
    }

    /* renamed from: e */
    public final void mo46219e() {
        if (this.f17385n != 0.0f) {
            float f = this.f17387p;
            float f2 = this.f17388q;
            this.f17387p = f2;
            this.f17388q = f;
            this.f17385n = f2 / f;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f17382e);
            Rect rect = this.f17382e;
            float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i = this.f17384m;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i) * 1.5f), ((float) i) / 2.0f, this.f17383l);
        }
    }

    public void setActiveColor(@ColorInt int i) {
        mo46215a(i);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.f17386o = aspectRatio.mo46110a();
        this.f17387p = aspectRatio.mo46111b();
        float c = aspectRatio.mo46112c();
        this.f17388q = c;
        float f = this.f17387p;
        if (f == 0.0f || c == 0.0f) {
            this.f17385n = 0.0f;
        } else {
            this.f17385n = f / c;
        }
        mo46218d();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17382e = new Rect();
        mo46217c(context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_AspectRatioTextView));
    }
}

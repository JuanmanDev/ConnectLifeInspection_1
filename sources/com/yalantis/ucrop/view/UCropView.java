package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$id;
import com.yalantis.ucrop.R$layout;
import com.yalantis.ucrop.R$styleable;
import p040c.p531f0.p532a.p533c.C8829c;
import p040c.p531f0.p532a.p533c.C8830d;

public class UCropView extends FrameLayout {

    /* renamed from: e */
    public GestureCropImageView f17378e;

    /* renamed from: l */
    public final OverlayView f17379l;

    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    public class C8881a implements C8829c {
        public C8881a() {
        }

        /* renamed from: a */
        public void mo45980a(float f) {
            UCropView.this.f17379l.setTargetAspectRatio(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    public class C8882b implements C8830d {
        public C8882b() {
        }

        /* renamed from: a */
        public void mo45981a(RectF rectF) {
            UCropView.this.f17378e.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void mo46211c() {
        this.f17378e.setCropBoundsChangeListener(new C8881a());
        this.f17379l.setOverlayViewChangeListener(new C8882b());
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f17378e;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f17379l;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.ucrop_view, this, true);
        this.f17378e = (GestureCropImageView) findViewById(R$id.image_view_crop);
        this.f17379l = (OverlayView) findViewById(R$id.view_overlay);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_UCropView);
        this.f17379l.mo46168g(obtainStyledAttributes);
        this.f17378e.mo46145w(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        mo46211c();
    }
}

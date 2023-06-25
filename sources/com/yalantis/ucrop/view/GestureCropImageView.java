package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p040c.p531f0.p532a.p536f.C8847h;

public class GestureCropImageView extends CropImageView {

    /* renamed from: L */
    public ScaleGestureDetector f17324L;

    /* renamed from: M */
    public C8847h f17325M;

    /* renamed from: N */
    public GestureDetector f17326N;

    /* renamed from: O */
    public float f17327O;

    /* renamed from: P */
    public float f17328P;

    /* renamed from: Q */
    public boolean f17329Q;

    /* renamed from: R */
    public boolean f17330R;

    /* renamed from: S */
    public int f17331S;

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    public class C8876b extends GestureDetector.SimpleOnGestureListener {
        public C8876b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.mo46148z(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.mo46203k(-f, -f2);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    public class C8877c extends C8847h.C8849b {
        public C8877c() {
        }

        /* renamed from: a */
        public boolean mo46038a(C8847h hVar) {
            GestureCropImageView.this.mo46202i(hVar.mo46036c(), GestureCropImageView.this.f17327O, GestureCropImageView.this.f17328P);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    public class C8878d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C8878d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo46128j(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f17327O, GestureCropImageView.this.f17328P);
            return true;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.f17329Q = true;
        this.f17330R = true;
        this.f17331S = 5;
    }

    /* renamed from: G */
    public final void mo46151G() {
        this.f17326N = new GestureDetector(getContext(), new C8876b(), (Handler) null, true);
        this.f17324L = new ScaleGestureDetector(getContext(), new C8878d());
        this.f17325M = new C8847h(new C8877c());
    }

    /* renamed from: g */
    public void mo46152g() {
        super.mo46152g();
        mo46151G();
    }

    public int getDoubleTapScaleSteps() {
        return this.f17331S;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.f17331S))));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            mo46132r();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f17327O = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f17328P = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.f17326N.onTouchEvent(motionEvent);
        if (this.f17330R) {
            this.f17324L.onTouchEvent(motionEvent);
        }
        if (this.f17329Q) {
            this.f17325M.mo46037d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            mo46146x();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f17331S = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f17329Q = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f17330R = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17329Q = true;
        this.f17330R = true;
        this.f17331S = 5;
    }
}

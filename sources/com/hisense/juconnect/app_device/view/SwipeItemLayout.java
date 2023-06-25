package com.hisense.juconnect.app_device.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;

public class SwipeItemLayout extends ViewGroup {

    /* renamed from: s */
    public static final Interpolator f16394s = new C8611a();

    /* renamed from: e */
    public C8613c f16395e;

    /* renamed from: l */
    public ViewGroup f16396l;

    /* renamed from: m */
    public ViewGroup f16397m;

    /* renamed from: n */
    public C8614d f16398n;

    /* renamed from: o */
    public int f16399o;

    /* renamed from: p */
    public int f16400p;

    /* renamed from: q */
    public boolean f16401q;

    /* renamed from: r */
    public boolean f16402r;

    /* renamed from: com.hisense.juconnect.app_device.view.SwipeItemLayout$a */
    public class C8611a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.hisense.juconnect.app_device.view.SwipeItemLayout$b */
    public static /* synthetic */ class C8612b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16403a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.hisense.juconnect.app_device.view.SwipeItemLayout$c[] r0 = com.hisense.juconnect.app_device.view.SwipeItemLayout.C8613c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16403a = r0
                com.hisense.juconnect.app_device.view.SwipeItemLayout$c r1 = com.hisense.juconnect.app_device.view.SwipeItemLayout.C8613c.FLING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16403a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.hisense.juconnect.app_device.view.SwipeItemLayout$c r1 = com.hisense.juconnect.app_device.view.SwipeItemLayout.C8613c.RESET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.view.SwipeItemLayout.C8612b.<clinit>():void");
        }
    }

    /* renamed from: com.hisense.juconnect.app_device.view.SwipeItemLayout$c */
    public enum C8613c {
        RESET,
        DRAG,
        FLING,
        TAP
    }

    /* renamed from: com.hisense.juconnect.app_device.view.SwipeItemLayout$d */
    public class C8614d implements Runnable {

        /* renamed from: e */
        public Scroller f16409e;

        /* renamed from: l */
        public boolean f16410l = false;

        /* renamed from: m */
        public int f16411m;

        /* renamed from: n */
        public boolean f16412n = false;

        public C8614d(Context context) {
            this.f16409e = new Scroller(context, SwipeItemLayout.f16394s);
            this.f16411m = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }

        /* renamed from: a */
        public void mo42489a() {
            if (!this.f16410l) {
                this.f16410l = true;
                if (!this.f16409e.isFinished()) {
                    this.f16409e.abortAnimation();
                    SwipeItemLayout.this.removeCallbacks(this);
                }
            }
        }

        /* renamed from: b */
        public boolean mo42490b() {
            return this.f16412n;
        }

        /* renamed from: c */
        public void mo42491c(int i, int i2) {
            "" + i;
            int i3 = 0;
            if (i2 > this.f16411m && i != 0) {
                mo42492d(i, 0);
            } else if (i2 >= (-this.f16411m) || i == (-SwipeItemLayout.this.f16400p)) {
                if (i <= (-SwipeItemLayout.this.f16400p) / 2) {
                    i3 = -SwipeItemLayout.this.f16400p;
                }
                mo42492d(i, i3);
            } else {
                mo42492d(i, -SwipeItemLayout.this.f16400p);
            }
        }

        /* renamed from: d */
        public void mo42492d(int i, int i2) {
            if (i != i2) {
                "" + i + " " + i2;
                SwipeItemLayout.this.setTouchMode(C8613c.FLING);
                boolean z = false;
                this.f16410l = false;
                if (i2 < i) {
                    z = true;
                }
                this.f16412n = z;
                this.f16409e.startScroll(i, 0, i2 - i, 0, 400);
                ViewCompat.postOnAnimation(SwipeItemLayout.this, this);
            }
        }

        public void run() {
            Boolean.toString(this.f16410l);
            if (!this.f16410l) {
                boolean computeScrollOffset = this.f16409e.computeScrollOffset();
                int currX = this.f16409e.getCurrX();
                "" + currX;
                SwipeItemLayout swipeItemLayout = SwipeItemLayout.this;
                boolean m = swipeItemLayout.mo42478m(currX - swipeItemLayout.f16399o);
                if (!computeScrollOffset || m) {
                    if (m) {
                        SwipeItemLayout.this.removeCallbacks(this);
                        if (!this.f16409e.isFinished()) {
                            this.f16409e.abortAnimation();
                        }
                        SwipeItemLayout.this.setTouchMode(C8613c.RESET);
                    }
                    if (!computeScrollOffset) {
                        SwipeItemLayout.this.setTouchMode(C8613c.RESET);
                        if (SwipeItemLayout.this.f16399o != 0) {
                            if (Math.abs(SwipeItemLayout.this.f16399o) > SwipeItemLayout.this.f16400p / 2) {
                                SwipeItemLayout swipeItemLayout2 = SwipeItemLayout.this;
                                int unused = swipeItemLayout2.f16399o = -swipeItemLayout2.f16400p;
                            } else {
                                int unused2 = SwipeItemLayout.this.f16399o = 0;
                            }
                            ViewCompat.postOnAnimation(SwipeItemLayout.this, this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ViewCompat.postOnAnimation(SwipeItemLayout.this, this);
            }
        }
    }

    public SwipeItemLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public static View m23383g(ViewGroup viewGroup, int i, int i2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ViewGroup.MarginLayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public void mo42467e() {
        if (this.f16399o == 0) {
            return;
        }
        if (this.f16395e != C8613c.FLING || this.f16398n.mo42490b()) {
            if (this.f16395e == C8613c.FLING) {
                this.f16398n.mo42489a();
            }
            this.f16398n.mo42492d(this.f16399o, 0);
        }
    }

    /* renamed from: f */
    public final boolean mo42468f() {
        if (getChildCount() != 2) {
            return false;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof ViewGroup)) {
            return false;
        }
        this.f16396l = (ViewGroup) childAt;
        View childAt2 = getChildAt(1);
        if (!(childAt2 instanceof ViewGroup)) {
            return false;
        }
        this.f16397m = (ViewGroup) childAt2;
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C8613c getTouchMode() {
        return this.f16395e;
    }

    /* renamed from: h */
    public void mo42473h(int i) {
        this.f16398n.mo42491c(this.f16399o, i);
    }

    /* renamed from: i */
    public boolean mo42474i() {
        return this.f16399o != 0;
    }

    /* renamed from: j */
    public void mo42475j(int i) {
        ViewCompat.offsetLeftAndRight(this.f16396l, i);
        ViewCompat.offsetLeftAndRight(this.f16397m, i);
    }

    /* renamed from: k */
    public void mo42476k() {
        if (this.f16399o == (-this.f16400p)) {
            return;
        }
        if (this.f16395e != C8613c.FLING || !this.f16398n.mo42490b()) {
            if (this.f16395e == C8613c.FLING) {
                this.f16398n.mo42489a();
            }
            this.f16398n.mo42492d(this.f16399o, -this.f16400p);
        }
    }

    /* renamed from: l */
    public void mo42477l() {
        if (this.f16399o < (-this.f16400p) / 2) {
            mo42476k();
        } else {
            mo42467e();
        }
    }

    /* renamed from: m */
    public boolean mo42478m(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16399o + i;
        if ((i > 0 && i2 > 0) || (i < 0 && i2 < (-this.f16400p))) {
            i2 = Math.max(Math.min(i2, 0), -this.f16400p);
            z = true;
        }
        mo42475j(i2 - this.f16399o);
        this.f16399o = i2;
        return z;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f16399o;
        if (i == 0 || !this.f16402r) {
            this.f16399o = 0;
            return;
        }
        mo42475j(-i);
        this.f16399o = 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.f16399o;
        if (i == 0 || !this.f16402r) {
            this.f16399o = 0;
        } else {
            mo42475j(-i);
            this.f16399o = 0;
        }
        removeCallbacks(this.f16398n);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            View g2 = m23383g(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            if (g2 == null || g2 != this.f16396l || this.f16399o == 0) {
                return false;
            }
            return true;
        } else if (actionMasked == 1 && (g = m23383g(this, (int) motionEvent.getX(), (int) motionEvent.getY())) != null && g == this.f16396l && this.f16395e == C8613c.TAP && this.f16399o != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (mo42468f()) {
            this.f16401q = true;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16396l.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f16397m.getLayoutParams();
            int width = getWidth() - (paddingRight + marginLayoutParams.rightMargin);
            int height = getHeight() - (marginLayoutParams.bottomMargin + paddingBottom);
            this.f16396l.layout(paddingLeft + marginLayoutParams.leftMargin, marginLayoutParams.topMargin + paddingTop, width, height);
            int i5 = marginLayoutParams2.leftMargin;
            int i6 = width + i5;
            this.f16397m.layout(i6, paddingTop + marginLayoutParams2.topMargin, i5 + i6 + marginLayoutParams2.rightMargin + this.f16397m.getMeasuredWidth(), getHeight() - (marginLayoutParams2.bottomMargin + paddingBottom));
            this.f16400p = this.f16397m.getWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            this.f16399o = 0;
            this.f16401q = false;
            this.f16402r = true;
            return;
        }
        throw new RuntimeException("SwipeItemLayout的子视图不符合规定");
    }

    public void onMeasure(int i, int i2) {
        if (mo42468f()) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16396l.getLayoutParams();
            int i3 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i4 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            measureChildWithMargins(this.f16396l, i, i3 + paddingLeft, i2, i4 + paddingTop);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size, this.f16396l.getMeasuredWidth() + i3 + paddingLeft);
            } else if (mode == 0) {
                size = this.f16396l.getMeasuredWidth() + i3 + paddingLeft;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, this.f16396l.getMeasuredHeight() + i4 + paddingTop);
            } else if (mode2 == 0) {
                size2 = this.f16396l.getMeasuredHeight() + i4 + paddingTop;
            }
            setMeasuredDimension(size, size2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f16397m.getLayoutParams();
            this.f16397m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - (marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin)) - paddingTop, 1073741824));
            return;
        }
        throw new RuntimeException("SwipeItemLayout的子视图不符合规定");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            View g2 = m23383g(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            if (g2 == null || g2 != this.f16396l || this.f16399o == 0) {
                return false;
            }
            return true;
        } else if (actionMasked != 1 || (g = m23383g(this, (int) motionEvent.getX(), (int) motionEvent.getY())) == null || g != this.f16396l || this.f16395e != C8613c.TAP || this.f16399o == 0) {
            return false;
        } else {
            mo42467e();
            return true;
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getVisibility() != 0) {
            this.f16399o = 0;
            invalidate();
        }
    }

    public void requestLayout() {
        if (!this.f16401q) {
            super.requestLayout();
        }
    }

    public void setTouchMode(C8613c cVar) {
        if (C8612b.f16403a[this.f16395e.ordinal()] == 1) {
            this.f16398n.mo42489a();
        }
        this.f16395e = cVar;
    }

    public SwipeItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16395e = C8613c.RESET;
        this.f16399o = 0;
        this.f16398n = new C8614d(context);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}

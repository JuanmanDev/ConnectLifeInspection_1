package com.hisense.juconnect.app_device.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import com.hisense.juconnect.app_device.view.SwipeItemLayout;

public class SwipeExpandableListView extends ExpandableListView {

    /* renamed from: e */
    public SwipeItemLayout f16384e;

    /* renamed from: l */
    public float f16385l;

    /* renamed from: m */
    public float f16386m;

    /* renamed from: n */
    public VelocityTracker f16387n;

    /* renamed from: o */
    public int f16388o;

    /* renamed from: p */
    public int f16389p;

    /* renamed from: q */
    public int f16390q;

    /* renamed from: r */
    public boolean f16391r;

    /* renamed from: s */
    public boolean f16392s;

    /* renamed from: t */
    public boolean f16393t;

    public SwipeExpandableListView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo42462a() {
        this.f16391r = false;
        this.f16392s = false;
        this.f16393t = false;
        this.f16388o = -1;
        VelocityTracker velocityTracker = this.f16387n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16387n = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f16384e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canScrollVertically(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.f16392s
            if (r0 != 0) goto L_0x001b
            com.hisense.juconnect.app_device.view.SwipeItemLayout r0 = r1.f16384e
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo42474i()
            if (r0 != 0) goto L_0x001b
        L_0x000e:
            boolean r0 = r1.f16393t
            if (r0 != 0) goto L_0x001b
            boolean r2 = super.canScrollVertically(r2)
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = 0
            goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.view.SwipeExpandableListView.canScrollVertically(int):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        SwipeItemLayout swipeItemLayout;
        boolean z2;
        ViewParent parent;
        SwipeItemLayout swipeItemLayout2;
        SwipeItemLayout swipeItemLayout3;
        SwipeItemLayout swipeItemLayout4;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (this.f16393t && actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        if (this.f16393t) {
            mo42462a();
            return true;
        }
        if (this.f16387n == null) {
            this.f16387n = VelocityTracker.obtain();
        }
        this.f16387n.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f16393t = false;
            this.f16388o = motionEvent.getPointerId(0);
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f16385l = x;
            this.f16386m = y;
            View g = SwipeItemLayout.m23383g(this, (int) x, (int) y);
            if (g == null || !(g instanceof SwipeItemLayout)) {
                swipeItemLayout = null;
                z = true;
            } else {
                swipeItemLayout = (SwipeItemLayout) g;
                z = false;
            }
            if (!z && ((swipeItemLayout2 = this.f16384e) == null || swipeItemLayout2 != swipeItemLayout)) {
                z = true;
            }
            if (!z) {
                if (this.f16384e.getTouchMode() == SwipeItemLayout.C8613c.FLING) {
                    this.f16384e.setTouchMode(SwipeItemLayout.C8613c.DRAG);
                    this.f16392s = true;
                } else {
                    this.f16384e.setTouchMode(SwipeItemLayout.C8613c.TAP);
                    if (!this.f16384e.mo42474i()) {
                        z2 = false;
                        if (z2 && (parent = getParent()) != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                z2 = true;
                parent.requestDisallowInterceptTouchEvent(true);
            } else {
                SwipeItemLayout swipeItemLayout5 = this.f16384e;
                if (swipeItemLayout5 != null && swipeItemLayout5.mo42474i()) {
                    this.f16384e.mo42467e();
                    this.f16384e = null;
                    this.f16393t = true;
                    return true;
                } else if (swipeItemLayout != null) {
                    this.f16384e = swipeItemLayout;
                    swipeItemLayout.setTouchMode(SwipeItemLayout.C8613c.TAP);
                } else {
                    this.f16384e = null;
                }
            }
            if (!this.f16392s) {
                this.f16391r = super.onInterceptTouchEvent(motionEvent);
            }
            if (this.f16392s || this.f16391r) {
                return true;
            }
            return false;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    SwipeItemLayout swipeItemLayout6 = this.f16384e;
                    if (swipeItemLayout6 != null) {
                        swipeItemLayout6.mo42477l();
                    }
                    super.onInterceptTouchEvent(motionEvent);
                    mo42462a();
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f16388o) {
                        if (actionIndex != 0) {
                            z3 = false;
                        }
                        this.f16388o = motionEvent.getPointerId(z3 ? 1 : 0);
                        this.f16385l = motionEvent.getX(z3);
                        this.f16386m = motionEvent.getY(z3);
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else if (this.f16391r) {
                SwipeItemLayout swipeItemLayout7 = this.f16384e;
                if (swipeItemLayout7 != null) {
                    swipeItemLayout7.mo42467e();
                }
                return super.onInterceptTouchEvent(motionEvent);
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f16388o);
                if (findPointerIndex != -1) {
                    float x2 = (float) ((int) (motionEvent.getX(findPointerIndex) + 0.5f));
                    int i = (int) (x2 - this.f16385l);
                    float y2 = (float) ((int) (((float) ((int) motionEvent.getY(findPointerIndex))) + 0.5f));
                    int abs = Math.abs(i);
                    int abs2 = Math.abs((int) (y2 - this.f16386m));
                    SwipeItemLayout swipeItemLayout8 = this.f16384e;
                    if (swipeItemLayout8 != null) {
                        if (swipeItemLayout8.getTouchMode() == SwipeItemLayout.C8613c.TAP) {
                            if (abs <= this.f16389p || abs <= abs2) {
                                this.f16391r = super.onInterceptTouchEvent(motionEvent);
                            } else {
                                this.f16392s = true;
                                this.f16384e.setTouchMode(SwipeItemLayout.C8613c.DRAG);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                int i2 = this.f16389p;
                                i = i > 0 ? i - i2 : i + i2;
                            }
                        }
                        if (this.f16384e.getTouchMode() == SwipeItemLayout.C8613c.DRAG) {
                            this.f16385l = x2;
                            this.f16386m = y2;
                            this.f16384e.mo42478m(i);
                        }
                    } else {
                        this.f16391r = super.onInterceptTouchEvent(motionEvent);
                    }
                    if (this.f16391r && (swipeItemLayout4 = this.f16384e) != null) {
                        swipeItemLayout4.mo42467e();
                    }
                    if (this.f16392s || this.f16391r) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else {
            if (!this.f16392s || (swipeItemLayout3 = this.f16384e) == null) {
                z3 = super.onInterceptTouchEvent(motionEvent);
            } else if (swipeItemLayout3.getTouchMode() == SwipeItemLayout.C8613c.DRAG) {
                VelocityTracker velocityTracker = this.f16387n;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f16390q);
                this.f16384e.mo42473h((int) velocityTracker.getXVelocity(this.f16388o));
            } else {
                z3 = false;
            }
            mo42462a();
            return z3;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SwipeItemLayout swipeItemLayout;
        SwipeItemLayout swipeItemLayout2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 1;
        if (this.f16393t && actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        if (this.f16393t) {
            mo42462a();
            return true;
        }
        if (this.f16387n == null) {
            this.f16387n = VelocityTracker.obtain();
        }
        this.f16387n.addMovement(motionEvent);
        if (actionMasked == 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    SwipeItemLayout swipeItemLayout3 = this.f16384e;
                    if (swipeItemLayout3 != null) {
                        swipeItemLayout3.mo42477l();
                    }
                    super.onTouchEvent(motionEvent);
                    mo42462a();
                    return true;
                } else if (actionMasked == 5) {
                    this.f16388o = motionEvent.getPointerId(actionIndex);
                    this.f16385l = motionEvent.getX(actionIndex);
                    this.f16386m = motionEvent.getY(actionIndex);
                    return super.onTouchEvent(motionEvent);
                } else if (actionMasked == 6) {
                    if (motionEvent.getPointerId(actionIndex) == this.f16388o) {
                        if (actionIndex != 0) {
                            i = 0;
                        }
                        this.f16388o = motionEvent.getPointerId(i);
                        this.f16385l = motionEvent.getX(i);
                        this.f16386m = motionEvent.getY(i);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            } else if (this.f16391r) {
                SwipeItemLayout swipeItemLayout4 = this.f16384e;
                if (swipeItemLayout4 != null) {
                    swipeItemLayout4.mo42467e();
                }
                return super.onTouchEvent(motionEvent);
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f16388o);
                if (findPointerIndex != -1) {
                    float x = (float) ((int) (motionEvent.getX(findPointerIndex) + 0.5f));
                    int i2 = (int) (x - this.f16385l);
                    float y = (float) ((int) (((float) ((int) motionEvent.getY(findPointerIndex))) + 0.5f));
                    int abs = Math.abs(i2);
                    int abs2 = Math.abs((int) (y - this.f16386m));
                    SwipeItemLayout swipeItemLayout5 = this.f16384e;
                    if (swipeItemLayout5 != null) {
                        if (swipeItemLayout5.getTouchMode() == SwipeItemLayout.C8613c.TAP) {
                            if (abs > this.f16389p && abs > abs2) {
                                this.f16392s = true;
                                this.f16384e.setTouchMode(SwipeItemLayout.C8613c.DRAG);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                int i3 = this.f16389p;
                                i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                            } else if (abs2 > this.f16389p) {
                                this.f16391r = true;
                                super.onTouchEvent(motionEvent);
                            }
                        }
                        if (this.f16384e.getTouchMode() == SwipeItemLayout.C8613c.DRAG) {
                            this.f16385l = x;
                            this.f16386m = y;
                            this.f16384e.mo42478m(i2);
                        }
                    } else {
                        this.f16391r = super.onTouchEvent(motionEvent);
                    }
                    if (this.f16391r && (swipeItemLayout2 = this.f16384e) != null) {
                        swipeItemLayout2.mo42467e();
                    }
                    return true;
                }
            }
            return true;
        }
        if (!this.f16392s || (swipeItemLayout = this.f16384e) == null) {
            super.onTouchEvent(motionEvent);
        } else if (swipeItemLayout.getTouchMode() == SwipeItemLayout.C8613c.DRAG) {
            VelocityTracker velocityTracker = this.f16387n;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f16390q);
            this.f16384e.mo42473h((int) velocityTracker.getXVelocity(this.f16388o));
        }
        mo42462a();
        return true;
    }

    public SwipeExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16389p = viewConfiguration.getScaledTouchSlop();
        this.f16390q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16388o = -1;
        this.f16391r = false;
        this.f16392s = false;
        this.f16393t = false;
    }
}

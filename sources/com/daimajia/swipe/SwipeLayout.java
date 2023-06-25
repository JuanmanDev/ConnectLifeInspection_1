package com.daimajia.swipe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SwipeLayout extends FrameLayout {

    /* renamed from: J */
    public static final DragEdge f7114J = DragEdge.Right;

    /* renamed from: A */
    public int f7115A;

    /* renamed from: B */
    public List<C3863f> f7116B;

    /* renamed from: C */
    public boolean f7117C;

    /* renamed from: D */
    public float f7118D;

    /* renamed from: E */
    public float f7119E;

    /* renamed from: F */
    public View.OnClickListener f7120F;

    /* renamed from: G */
    public View.OnLongClickListener f7121G;

    /* renamed from: H */
    public Rect f7122H;

    /* renamed from: I */
    public GestureDetector f7123I;

    /* renamed from: e */
    public int f7124e;

    /* renamed from: l */
    public DragEdge f7125l;

    /* renamed from: m */
    public ViewDragHelper f7126m;

    /* renamed from: n */
    public int f7127n;

    /* renamed from: o */
    public LinkedHashMap<DragEdge, View> f7128o;

    /* renamed from: p */
    public ShowMode f7129p;

    /* renamed from: q */
    public float[] f7130q;

    /* renamed from: r */
    public List<C3867j> f7131r;

    /* renamed from: s */
    public List<C3865h> f7132s;

    /* renamed from: t */
    public Map<View, ArrayList<C3864g>> f7133t;

    /* renamed from: u */
    public Map<View, Boolean> f7134u;

    /* renamed from: v */
    public C3862e f7135v;

    /* renamed from: w */
    public boolean f7136w;

    /* renamed from: x */
    public boolean[] f7137x;

    /* renamed from: y */
    public boolean f7138y;

    /* renamed from: z */
    public ViewDragHelper.Callback f7139z;

    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    public enum ShowMode {
        LayDown,
        PullOut
    }

    public enum Status {
        Middle,
        Open,
        Close
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$a */
    public class C3858a extends ViewDragHelper.Callback {

        /* renamed from: a */
        public boolean f7140a = true;

        public C3858a() {
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (view == SwipeLayout.this.getSurfaceView()) {
                int i3 = C3861d.f7144a[SwipeLayout.this.f7125l.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return SwipeLayout.this.getPaddingLeft();
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (i > SwipeLayout.this.getPaddingLeft()) {
                            return SwipeLayout.this.getPaddingLeft();
                        }
                        if (i < SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.f7127n) {
                            return SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.f7127n;
                        }
                    }
                } else if (i < SwipeLayout.this.getPaddingLeft()) {
                    return SwipeLayout.this.getPaddingLeft();
                } else {
                    if (i > SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.f7127n;
                    }
                }
            } else if (SwipeLayout.this.getCurrentBottomView() == view) {
                int i4 = C3861d.f7144a[SwipeLayout.this.f7125l.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    return SwipeLayout.this.getPaddingLeft();
                }
                if (i4 != 3) {
                    if (i4 == 4 && SwipeLayout.this.f7129p == ShowMode.PullOut && i < SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.f7127n;
                    }
                } else if (SwipeLayout.this.f7129p == ShowMode.PullOut && i > SwipeLayout.this.getPaddingLeft()) {
                    return SwipeLayout.this.getPaddingLeft();
                }
            }
            return i;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (view == SwipeLayout.this.getSurfaceView()) {
                int i4 = C3861d.f7144a[SwipeLayout.this.f7125l.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3 || i4 == 4) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    } else if (i < SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f7127n;
                    } else {
                        if (i > SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    }
                } else if (i < SwipeLayout.this.getPaddingTop()) {
                    return SwipeLayout.this.getPaddingTop();
                } else {
                    if (i > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f7127n;
                    }
                }
            } else {
                View surfaceView = SwipeLayout.this.getSurfaceView();
                if (surfaceView == null) {
                    i3 = 0;
                } else {
                    i3 = surfaceView.getTop();
                }
                int i5 = C3861d.f7144a[SwipeLayout.this.f7125l.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3 || i5 == 4) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    } else if (SwipeLayout.this.f7129p != ShowMode.PullOut) {
                        int i6 = i3 + i2;
                        if (i6 >= SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                        if (i6 <= SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f7127n) {
                            return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f7127n;
                        }
                    } else if (i < SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.f7127n;
                    }
                } else if (SwipeLayout.this.f7129p != ShowMode.PullOut) {
                    int i7 = i3 + i2;
                    if (i7 < SwipeLayout.this.getPaddingTop()) {
                        return SwipeLayout.this.getPaddingTop();
                    }
                    if (i7 > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f7127n) {
                        return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f7127n;
                    }
                } else if (i > SwipeLayout.this.getPaddingTop()) {
                    return SwipeLayout.this.getPaddingTop();
                }
            }
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return SwipeLayout.this.f7127n;
        }

        public int getViewVerticalDragRange(View view) {
            return SwipeLayout.this.f7127n;
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            View surfaceView = SwipeLayout.this.getSurfaceView();
            if (surfaceView != null) {
                View currentBottomView = SwipeLayout.this.getCurrentBottomView();
                int left = surfaceView.getLeft();
                int right = surfaceView.getRight();
                int top2 = surfaceView.getTop();
                int bottom = surfaceView.getBottom();
                if (view == surfaceView) {
                    if (SwipeLayout.this.f7129p == ShowMode.PullOut && currentBottomView != null) {
                        if (SwipeLayout.this.f7125l == DragEdge.Left || SwipeLayout.this.f7125l == DragEdge.Right) {
                            currentBottomView.offsetLeftAndRight(i3);
                        } else {
                            currentBottomView.offsetTopAndBottom(i4);
                        }
                    }
                } else if (SwipeLayout.this.getBottomViews().contains(view)) {
                    if (SwipeLayout.this.f7129p == ShowMode.PullOut) {
                        surfaceView.offsetLeftAndRight(i3);
                        surfaceView.offsetTopAndBottom(i4);
                    } else {
                        SwipeLayout swipeLayout = SwipeLayout.this;
                        Rect e = swipeLayout.mo22412n(swipeLayout.f7125l);
                        if (currentBottomView != null) {
                            currentBottomView.layout(e.left, e.top, e.right, e.bottom);
                        }
                        int left2 = surfaceView.getLeft() + i3;
                        int top3 = surfaceView.getTop() + i4;
                        if (SwipeLayout.this.f7125l == DragEdge.Left && left2 < SwipeLayout.this.getPaddingLeft()) {
                            left2 = SwipeLayout.this.getPaddingLeft();
                        } else if (SwipeLayout.this.f7125l == DragEdge.Right && left2 > SwipeLayout.this.getPaddingLeft()) {
                            left2 = SwipeLayout.this.getPaddingLeft();
                        } else if (SwipeLayout.this.f7125l == DragEdge.Top && top3 < SwipeLayout.this.getPaddingTop()) {
                            top3 = SwipeLayout.this.getPaddingTop();
                        } else if (SwipeLayout.this.f7125l == DragEdge.Bottom && top3 > SwipeLayout.this.getPaddingTop()) {
                            top3 = SwipeLayout.this.getPaddingTop();
                        }
                        surfaceView.layout(left2, top3, SwipeLayout.this.getMeasuredWidth() + left2, SwipeLayout.this.getMeasuredHeight() + top3);
                    }
                }
                SwipeLayout.this.mo22420q(left, top2, right, bottom);
                SwipeLayout.this.mo22421r(left, top2, i3, i4);
                SwipeLayout.this.invalidate();
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            super.onViewReleased(view, f, f2);
            for (C3867j d : SwipeLayout.this.f7131r) {
                d.mo22455d(SwipeLayout.this, f, f2);
            }
            SwipeLayout.this.mo22395K(f, f2, this.f7140a);
            SwipeLayout.this.invalidate();
        }

        public boolean tryCaptureView(View view, int i) {
            boolean z = false;
            boolean z2 = view == SwipeLayout.this.getSurfaceView() || SwipeLayout.this.getBottomViews().contains(view);
            if (z2) {
                if (SwipeLayout.this.getOpenStatus() == Status.Close) {
                    z = true;
                }
                this.f7140a = z;
            }
            return z2;
        }
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$b */
    public class C3859b implements View.OnClickListener {
        public C3859b() {
        }

        public void onClick(View view) {
            SwipeLayout.this.mo22393I();
        }
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$c */
    public class C3860c implements View.OnLongClickListener {
        public C3860c() {
        }

        public boolean onLongClick(View view) {
            boolean unused = SwipeLayout.this.mo22394J();
            return true;
        }
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$d */
    public static /* synthetic */ class C3861d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7144a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.daimajia.swipe.SwipeLayout$DragEdge[] r0 = com.daimajia.swipe.SwipeLayout.DragEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7144a = r0
                com.daimajia.swipe.SwipeLayout$DragEdge r1 = com.daimajia.swipe.SwipeLayout.DragEdge.Top     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7144a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.daimajia.swipe.SwipeLayout$DragEdge r1 = com.daimajia.swipe.SwipeLayout.DragEdge.Bottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7144a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.daimajia.swipe.SwipeLayout$DragEdge r1 = com.daimajia.swipe.SwipeLayout.DragEdge.Left     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7144a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.daimajia.swipe.SwipeLayout$DragEdge r1 = com.daimajia.swipe.SwipeLayout.DragEdge.Right     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.SwipeLayout.C3861d.<clinit>():void");
        }
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$e */
    public interface C3862e {
        /* renamed from: a */
        void mo22446a(SwipeLayout swipeLayout, boolean z);
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$f */
    public interface C3863f {
        /* renamed from: a */
        void mo22447a(SwipeLayout swipeLayout);
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$g */
    public interface C3864g {
        /* renamed from: a */
        void mo22448a(View view, DragEdge dragEdge, float f, int i);
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$h */
    public interface C3865h {
        /* renamed from: a */
        boolean mo22449a(MotionEvent motionEvent);
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$i */
    public class C3866i extends GestureDetector.SimpleOnGestureListener {
        public C3866i() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (SwipeLayout.this.f7135v != null) {
                View currentBottomView = SwipeLayout.this.getCurrentBottomView();
                View surfaceView = SwipeLayout.this.getSurfaceView();
                if (currentBottomView == null || motionEvent.getX() <= ((float) currentBottomView.getLeft()) || motionEvent.getX() >= ((float) currentBottomView.getRight()) || motionEvent.getY() <= ((float) currentBottomView.getTop()) || motionEvent.getY() >= ((float) currentBottomView.getBottom())) {
                    currentBottomView = surfaceView;
                }
                SwipeLayout.this.f7135v.mo22446a(SwipeLayout.this, currentBottomView == surfaceView);
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (SwipeLayout.this.f7138y && SwipeLayout.this.mo22386B(motionEvent)) {
                SwipeLayout.this.mo22410l();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.daimajia.swipe.SwipeLayout$j */
    public interface C3867j {
        /* renamed from: a */
        void mo22452a(SwipeLayout swipeLayout);

        /* renamed from: b */
        void mo22453b(SwipeLayout swipeLayout);

        /* renamed from: c */
        void mo22454c(SwipeLayout swipeLayout, int i, int i2);

        /* renamed from: d */
        void mo22455d(SwipeLayout swipeLayout, float f, float f2);

        /* renamed from: e */
        void mo22456e(SwipeLayout swipeLayout);

        /* renamed from: f */
        void mo22457f(SwipeLayout swipeLayout);
    }

    public SwipeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        DragEdge dragEdge = this.f7125l;
        if (dragEdge == null) {
            return 0.0f;
        }
        return this.f7130q[dragEdge.ordinal()];
    }

    private void setCurrentDragEdge(DragEdge dragEdge) {
        if (this.f7125l != dragEdge) {
            this.f7125l = dragEdge;
            mo22397M();
        }
    }

    /* renamed from: A */
    public boolean mo22385A() {
        View view = this.f7128o.get(DragEdge.Top);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f7137x[DragEdge.Top.ordinal()];
    }

    /* renamed from: B */
    public final boolean mo22386B(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.f7122H == null) {
            this.f7122H = new Rect();
        }
        surfaceView.getHitRect(this.f7122H);
        return this.f7122H.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* renamed from: C */
    public boolean mo22387C(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            int i9 = C3861d.f7144a[dragEdge.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && i3 > i5 && i3 <= i6) {
                            return true;
                        }
                        return false;
                    } else if (i >= i6 || i < i5) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i4 <= i7 || i4 > i8) {
                    return false;
                } else {
                    return true;
                }
            } else if (i2 < i7 || i2 >= i8) {
                return false;
            } else {
                return true;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            int i10 = C3861d.f7144a[dragEdge.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && i5 <= getWidth() && i6 > getWidth()) {
                            return true;
                        }
                        return false;
                    } else if (i6 < getPaddingLeft() || i5 >= getPaddingLeft()) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i7 >= getHeight() || i7 < getPaddingTop()) {
                    return false;
                } else {
                    return true;
                }
            } else if (i7 >= getPaddingTop() || i8 < getPaddingTop()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: D */
    public boolean mo22388D(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        if (this.f7134u.get(view).booleanValue()) {
            return false;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            if ((dragEdge != DragEdge.Right || i3 > i5) && ((dragEdge != DragEdge.Left || i < i6) && ((dragEdge != DragEdge.Top || i2 < i8) && (dragEdge != DragEdge.Bottom || i4 > i7)))) {
                return false;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            if ((dragEdge != DragEdge.Right || i6 > getWidth()) && ((dragEdge != DragEdge.Left || i5 < getPaddingLeft()) && ((dragEdge != DragEdge.Top || i7 < getPaddingTop()) && (dragEdge != DragEdge.Bottom || i8 > getHeight())))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public void mo22389E() {
        Rect p = mo22419p(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(p.left, p.top, p.right, p.bottom);
            bringChildToFront(surfaceView);
        }
        Rect o = mo22413o(ShowMode.LayDown, p);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(o.left, o.top, o.right, o.bottom);
        }
    }

    /* renamed from: F */
    public void mo22390F() {
        Rect p = mo22419p(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(p.left, p.top, p.right, p.bottom);
            bringChildToFront(surfaceView);
        }
        Rect o = mo22413o(ShowMode.PullOut, p);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(o.left, o.top, o.right, o.bottom);
        }
    }

    /* renamed from: G */
    public void mo22391G() {
        mo22392H(true, true);
    }

    /* renamed from: H */
    public void mo22392H(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        View currentBottomView = getCurrentBottomView();
        if (surfaceView != null) {
            Rect p = mo22419p(true);
            if (z) {
                this.f7126m.smoothSlideViewTo(surfaceView, p.left, p.top);
            } else {
                int left = p.left - surfaceView.getLeft();
                int top2 = p.top - surfaceView.getTop();
                surfaceView.layout(p.left, p.top, p.right, p.bottom);
                ShowMode showMode = getShowMode();
                ShowMode showMode2 = ShowMode.PullOut;
                if (showMode == showMode2) {
                    Rect o = mo22413o(showMode2, p);
                    if (currentBottomView != null) {
                        currentBottomView.layout(o.left, o.top, o.right, o.bottom);
                    }
                }
                if (z2) {
                    mo22420q(p.left, p.top, p.right, p.bottom);
                    mo22421r(p.left, p.top, left, top2);
                } else {
                    mo22396L();
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = (android.widget.AdapterView) r0;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22393I() {
        /*
            r5 = this;
            com.daimajia.swipe.SwipeLayout$Status r0 = r5.getOpenStatus()
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r0 == r1) goto L_0x0009
            return
        L_0x0009:
            android.view.ViewParent r0 = r5.getParent()
            boolean r1 = r0 instanceof android.widget.AdapterView
            if (r1 == 0) goto L_0x002f
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            int r1 = r0.getPositionForView(r5)
            r2 = -1
            if (r1 == r2) goto L_0x002f
            int r2 = r0.getFirstVisiblePosition()
            int r2 = r1 - r2
            android.view.View r2 = r0.getChildAt(r2)
            android.widget.Adapter r3 = r0.getAdapter()
            long r3 = r3.getItemId(r1)
            r0.performItemClick(r2, r1, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.SwipeLayout.mo22393I():void");
    }

    /* renamed from: J */
    public final boolean mo22394J() {
        AdapterView adapterView;
        int positionForView;
        if (getOpenStatus() != Status.Close) {
            return false;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = adapterView.getPositionForView(this)) == -1) {
            return false;
        }
        long itemIdAtPosition = (adapterView = (AdapterView) parent).getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", new Class[]{View.class, Integer.TYPE, Long.TYPE});
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(adapterView, new Object[]{this, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition)})).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            boolean onItemLongClick = adapterView.getOnItemLongClickListener() != null ? adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition) : false;
            if (onItemLongClick) {
                adapterView.performHapticFeedback(0);
            }
            return onItemLongClick;
        }
    }

    /* renamed from: K */
    public void mo22395K(float f, float f2, boolean z) {
        float minVelocity = this.f7126m.getMinVelocity();
        View surfaceView = getSurfaceView();
        DragEdge dragEdge = this.f7125l;
        if (dragEdge != null && surfaceView != null) {
            float f3 = z ? 0.25f : 0.75f;
            if (dragEdge == DragEdge.Left) {
                if (f > minVelocity) {
                    mo22391G();
                } else if (f < (-minVelocity)) {
                    mo22410l();
                } else if ((((float) getSurfaceView().getLeft()) * 1.0f) / ((float) this.f7127n) > f3) {
                    mo22391G();
                } else {
                    mo22410l();
                }
            } else if (dragEdge == DragEdge.Right) {
                if (f > minVelocity) {
                    mo22410l();
                } else if (f < (-minVelocity)) {
                    mo22391G();
                } else if ((((float) (-getSurfaceView().getLeft())) * 1.0f) / ((float) this.f7127n) > f3) {
                    mo22391G();
                } else {
                    mo22410l();
                }
            } else if (dragEdge == DragEdge.Top) {
                if (f2 > minVelocity) {
                    mo22391G();
                } else if (f2 < (-minVelocity)) {
                    mo22410l();
                } else if ((((float) getSurfaceView().getTop()) * 1.0f) / ((float) this.f7127n) > f3) {
                    mo22391G();
                } else {
                    mo22410l();
                }
            } else if (dragEdge != DragEdge.Bottom) {
            } else {
                if (f2 > minVelocity) {
                    mo22410l();
                } else if (f2 < (-minVelocity)) {
                    mo22391G();
                } else if ((((float) (-getSurfaceView().getTop())) * 1.0f) / ((float) this.f7127n) > f3) {
                    mo22391G();
                } else {
                    mo22410l();
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo22396L() {
        Status openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus == Status.Close) {
            for (View next : bottomViews) {
                if (!(next == null || next.getVisibility() == 4)) {
                    next.setVisibility(4);
                }
            }
            return;
        }
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null && currentBottomView.getVisibility() != 0) {
            currentBottomView.setVisibility(0);
        }
    }

    /* renamed from: M */
    public final void mo22397M() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            DragEdge dragEdge = this.f7125l;
            if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                this.f7127n = currentBottomView.getMeasuredWidth() - mo22437t(getCurrentOffset());
            } else {
                this.f7127n = currentBottomView.getMeasuredHeight() - mo22437t(getCurrentOffset());
            }
        }
        ShowMode showMode = this.f7129p;
        if (showMode == ShowMode.PullOut) {
            mo22390F();
        } else if (showMode == ShowMode.LayDown) {
            mo22389E();
        }
        mo22396L();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        try {
            i2 = ((Integer) layoutParams.getClass().getField(NotificationCompat.WearableExtender.KEY_GRAVITY).get(layoutParams)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i2 = 0;
        }
        if (i2 <= 0) {
            Iterator<Map.Entry<DragEdge, View>> it = this.f7128o.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (next.getValue() == null) {
                    this.f7128o.put(next.getKey(), view);
                    break;
                }
            }
        } else {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, ViewCompat.getLayoutDirection(this));
            if ((absoluteGravity & 3) == 3) {
                this.f7128o.put(DragEdge.Left, view);
            }
            if ((absoluteGravity & 5) == 5) {
                this.f7128o.put(DragEdge.Right, view);
            }
            if ((absoluteGravity & 48) == 48) {
                this.f7128o.put(DragEdge.Top, view);
            }
            if ((absoluteGravity & 80) == 80) {
                this.f7128o.put(DragEdge.Bottom, view);
            }
        }
        if (view != null && view.getParent() != this) {
            super.addView(view, i, layoutParams);
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f7126m.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (DragEdge dragEdge : DragEdge.values()) {
            arrayList.add(this.f7128o.get(dragEdge));
        }
        return arrayList;
    }

    @Nullable
    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.f7125l.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.f7125l.ordinal());
        }
        return null;
    }

    public int getDragDistance() {
        return this.f7127n;
    }

    public DragEdge getDragEdge() {
        return this.f7125l;
    }

    public Map<DragEdge, View> getDragEdgeMap() {
        return this.f7128o;
    }

    @Deprecated
    public List<DragEdge> getDragEdges() {
        return new ArrayList(this.f7128o.keySet());
    }

    public Status getOpenStatus() {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return Status.Close;
        }
        int left = surfaceView.getLeft();
        int top2 = surfaceView.getTop();
        if (left == getPaddingLeft() && top2 == getPaddingTop()) {
            return Status.Close;
        }
        if (left == getPaddingLeft() - this.f7127n || left == getPaddingLeft() + this.f7127n || top2 == getPaddingTop() - this.f7127n || top2 == getPaddingTop() + this.f7127n) {
            return Status.Open;
        }
        return Status.Middle;
    }

    public ShowMode getShowMode() {
        return this.f7129p;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22409k(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f7117C
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.daimajia.swipe.SwipeLayout$Status r0 = r9.getOpenStatus()
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Middle
            r2 = 1
            if (r0 != r1) goto L_0x0011
            r9.f7117C = r2
            return
        L_0x0011:
            com.daimajia.swipe.SwipeLayout$Status r0 = r9.getOpenStatus()
            float r1 = r10.getRawX()
            float r3 = r9.f7118D
            float r1 = r1 - r3
            float r10 = r10.getRawY()
            float r3 = r9.f7119E
            float r10 = r10 - r3
            float r3 = r10 / r1
            float r3 = java.lang.Math.abs(r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.atan(r3)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            com.daimajia.swipe.SwipeLayout$Status r4 = r9.getOpenStatus()
            com.daimajia.swipe.SwipeLayout$Status r5 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r4 != r5) goto L_0x007b
            r4 = 1110704128(0x42340000, float:45.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x005d
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x004f
            boolean r4 = r9.mo22441x()
            if (r4 == 0) goto L_0x004f
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = com.daimajia.swipe.SwipeLayout.DragEdge.Left
            goto L_0x0076
        L_0x004f:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x005c
            boolean r4 = r9.mo22442y()
            if (r4 == 0) goto L_0x005c
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = com.daimajia.swipe.SwipeLayout.DragEdge.Right
            goto L_0x0076
        L_0x005c:
            return
        L_0x005d:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x006a
            boolean r4 = r9.mo22385A()
            if (r4 == 0) goto L_0x006a
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = com.daimajia.swipe.SwipeLayout.DragEdge.Top
            goto L_0x0076
        L_0x006a:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x007a
            boolean r4 = r9.mo22440w()
            if (r4 == 0) goto L_0x007a
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = com.daimajia.swipe.SwipeLayout.DragEdge.Bottom
        L_0x0076:
            r9.setCurrentDragEdge(r4)
            goto L_0x007b
        L_0x007a:
            return
        L_0x007b:
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = r9.f7125l
            com.daimajia.swipe.SwipeLayout$DragEdge r5 = com.daimajia.swipe.SwipeLayout.DragEdge.Right
            r6 = 1106247680(0x41f00000, float:30.0)
            r7 = 0
            if (r4 != r5) goto L_0x00b0
            com.daimajia.swipe.SwipeLayout$Status r4 = com.daimajia.swipe.SwipeLayout.Status.Open
            if (r0 != r4) goto L_0x008f
            int r4 = r9.f7124e
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x009b
        L_0x008f:
            com.daimajia.swipe.SwipeLayout$Status r4 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r0 != r4) goto L_0x009d
            int r4 = r9.f7124e
            int r4 = -r4
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x009d
        L_0x009b:
            r4 = r2
            goto L_0x009e
        L_0x009d:
            r4 = r7
        L_0x009e:
            if (r4 != 0) goto L_0x00a7
            com.daimajia.swipe.SwipeLayout$Status r4 = com.daimajia.swipe.SwipeLayout.Status.Middle
            if (r0 != r4) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r4 = r7
            goto L_0x00a8
        L_0x00a7:
            r4 = r2
        L_0x00a8:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00b0
        L_0x00ae:
            r4 = r2
            goto L_0x00b1
        L_0x00b0:
            r4 = r7
        L_0x00b1:
            com.daimajia.swipe.SwipeLayout$DragEdge r5 = r9.f7125l
            com.daimajia.swipe.SwipeLayout$DragEdge r8 = com.daimajia.swipe.SwipeLayout.DragEdge.Left
            if (r5 != r8) goto L_0x00e2
            com.daimajia.swipe.SwipeLayout$Status r5 = com.daimajia.swipe.SwipeLayout.Status.Open
            if (r0 != r5) goto L_0x00c3
            int r5 = r9.f7124e
            int r5 = -r5
            float r5 = (float) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00ce
        L_0x00c3:
            com.daimajia.swipe.SwipeLayout$Status r5 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r0 != r5) goto L_0x00d0
            int r5 = r9.f7124e
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
        L_0x00ce:
            r1 = r2
            goto L_0x00d1
        L_0x00d0:
            r1 = r7
        L_0x00d1:
            if (r1 != 0) goto L_0x00da
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Middle
            if (r0 != r1) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r1 = r7
            goto L_0x00db
        L_0x00da:
            r1 = r2
        L_0x00db:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00e1
            if (r1 != 0) goto L_0x00e2
        L_0x00e1:
            r4 = r2
        L_0x00e2:
            com.daimajia.swipe.SwipeLayout$DragEdge r1 = r9.f7125l
            com.daimajia.swipe.SwipeLayout$DragEdge r5 = com.daimajia.swipe.SwipeLayout.DragEdge.Top
            r6 = 1114636288(0x42700000, float:60.0)
            if (r1 != r5) goto L_0x0115
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Open
            if (r0 != r1) goto L_0x00f6
            int r1 = r9.f7124e
            int r1 = -r1
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0101
        L_0x00f6:
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r0 != r1) goto L_0x0103
            int r1 = r9.f7124e
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0103
        L_0x0101:
            r1 = r2
            goto L_0x0104
        L_0x0103:
            r1 = r7
        L_0x0104:
            if (r1 != 0) goto L_0x010d
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Middle
            if (r0 != r1) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r1 = r7
            goto L_0x010e
        L_0x010d:
            r1 = r2
        L_0x010e:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0114
            if (r1 != 0) goto L_0x0115
        L_0x0114:
            r4 = r2
        L_0x0115:
            com.daimajia.swipe.SwipeLayout$DragEdge r1 = r9.f7125l
            com.daimajia.swipe.SwipeLayout$DragEdge r5 = com.daimajia.swipe.SwipeLayout.DragEdge.Bottom
            if (r1 != r5) goto L_0x0143
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Open
            if (r0 != r1) goto L_0x0126
            int r1 = r9.f7124e
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0132
        L_0x0126:
            com.daimajia.swipe.SwipeLayout$Status r1 = com.daimajia.swipe.SwipeLayout.Status.Close
            if (r0 != r1) goto L_0x0134
            int r1 = r9.f7124e
            int r1 = -r1
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0134
        L_0x0132:
            r10 = r2
            goto L_0x0135
        L_0x0134:
            r10 = r7
        L_0x0135:
            if (r10 != 0) goto L_0x013b
            com.daimajia.swipe.SwipeLayout$Status r10 = com.daimajia.swipe.SwipeLayout.Status.Middle
            if (r0 != r10) goto L_0x013c
        L_0x013b:
            r7 = r2
        L_0x013c:
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0142
            if (r7 != 0) goto L_0x0143
        L_0x0142:
            r4 = r2
        L_0x0143:
            r10 = r4 ^ 1
            r9.f7117C = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.SwipeLayout.mo22409k(android.view.MotionEvent):void");
    }

    /* renamed from: l */
    public void mo22410l() {
        mo22411m(true, true);
    }

    /* renamed from: m */
    public void mo22411m(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            if (z) {
                this.f7126m.smoothSlideViewTo(getSurfaceView(), getPaddingLeft(), getPaddingTop());
            } else {
                Rect p = mo22419p(false);
                int left = p.left - surfaceView.getLeft();
                int top2 = p.top - surfaceView.getTop();
                surfaceView.layout(p.left, p.top, p.right, p.bottom);
                if (z2) {
                    mo22420q(p.left, p.top, p.right, p.bottom);
                    mo22421r(p.left, p.top, left, top2);
                } else {
                    mo22396L();
                }
            }
            invalidate();
        }
    }

    /* renamed from: n */
    public final Rect mo22412n(DragEdge dragEdge) {
        int i;
        int i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (dragEdge == DragEdge.Right) {
            paddingLeft = getMeasuredWidth() - this.f7127n;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = getMeasuredHeight() - this.f7127n;
        }
        if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
            i = this.f7127n + paddingLeft;
            i2 = getMeasuredHeight();
        } else {
            i = getMeasuredWidth() + paddingLeft;
            i2 = this.f7127n;
        }
        return new Rect(paddingLeft, paddingTop, i, i2 + paddingTop);
    }

    /* renamed from: o */
    public final Rect mo22413o(ShowMode showMode, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            DragEdge dragEdge = this.f7125l;
            if (dragEdge == DragEdge.Left) {
                i -= this.f7127n;
            } else if (dragEdge == DragEdge.Right) {
                i = i3;
            } else {
                i2 = dragEdge == DragEdge.Top ? i2 - this.f7127n : i4;
            }
            DragEdge dragEdge2 = this.f7125l;
            int i5 = 0;
            if (dragEdge2 == DragEdge.Left || dragEdge2 == DragEdge.Right) {
                int i6 = rect.bottom;
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredWidth();
                }
                i3 = i + i5;
                i4 = i6;
            } else {
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredHeight();
                }
                i4 = i5 + i2;
                i3 = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            DragEdge dragEdge3 = this.f7125l;
            if (dragEdge3 == DragEdge.Left) {
                i3 = i + this.f7127n;
            } else if (dragEdge3 == DragEdge.Right) {
                i = i3 - this.f7127n;
            } else if (dragEdge3 == DragEdge.Top) {
                i4 = i2 + this.f7127n;
            } else {
                i2 = i4 - this.f7127n;
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo22439v()) {
            if (this.f7120F == null) {
                setOnClickListener(new C3859b());
            }
            if (this.f7121G == null) {
                setOnLongClickListener(new C3860c());
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!mo22443z()) {
            return false;
        }
        if (this.f7138y && getOpenStatus() == Status.Open && mo22386B(motionEvent)) {
            return true;
        }
        for (C3865h next : this.f7132s) {
            if (next != null && next.mo22449a(motionEvent)) {
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    boolean z = this.f7117C;
                    mo22409k(motionEvent);
                    if (this.f7117C && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!z && this.f7117C) {
                        return false;
                    }
                } else if (action != 3) {
                    this.f7126m.processTouchEvent(motionEvent);
                }
            }
            this.f7117C = false;
            this.f7126m.processTouchEvent(motionEvent);
        } else {
            this.f7126m.processTouchEvent(motionEvent);
            this.f7117C = false;
            this.f7118D = motionEvent.getRawX();
            this.f7119E = motionEvent.getRawY();
            if (getOpenStatus() == Status.Middle) {
                this.f7117C = true;
            }
        }
        return this.f7117C;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo22397M();
        if (this.f7116B != null) {
            for (int i5 = 0; i5 < this.f7116B.size(); i5++) {
                this.f7116B.get(i5).mo22447a(this);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo22443z()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.f7123I.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        this.f7126m.processTouchEvent(motionEvent);
                        if (!super.onTouchEvent(motionEvent) || !this.f7117C || actionMasked == 0) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            this.f7117C = false;
            this.f7126m.processTouchEvent(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !this.f7117C) {
            }
            return true;
        }
        this.f7126m.processTouchEvent(motionEvent);
        this.f7118D = motionEvent.getRawX();
        this.f7119E = motionEvent.getRawY();
        mo22409k(motionEvent);
        if (this.f7117C) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f7126m.processTouchEvent(motionEvent);
        }
        return true;
    }

    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.f7128o).entrySet()) {
            if (entry.getValue() == view) {
                this.f7128o.remove(entry.getKey());
            }
        }
    }

    /* renamed from: p */
    public final Rect mo22419p(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            DragEdge dragEdge = this.f7125l;
            if (dragEdge == DragEdge.Left) {
                paddingLeft = this.f7127n + getPaddingLeft();
            } else if (dragEdge == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.f7127n;
            } else if (dragEdge == DragEdge.Top) {
                paddingTop = this.f7127n + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.f7127n;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22420q(int r15, int r16, int r17, int r18) {
        /*
            r14 = this;
            r8 = r14
            java.util.Map<android.view.View, java.util.ArrayList<com.daimajia.swipe.SwipeLayout$g>> r0 = r8.f7133t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            java.util.Map<android.view.View, java.util.ArrayList<com.daimajia.swipe.SwipeLayout$g>> r0 = r8.f7133t
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0014:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            r11 = r0
            android.view.View r11 = (android.view.View) r11
            android.graphics.Rect r12 = r14.mo22438u(r11)
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = r8.f7125l
            r0 = r14
            r1 = r11
            r2 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            boolean r0 = r0.mo22387C(r1, r2, r3, r4, r5, r6, r7)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0110
            java.util.Map<android.view.View, java.lang.Boolean> r0 = r8.f7134u
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r11, r1)
            r0 = 0
            r1 = 0
            com.daimajia.swipe.SwipeLayout$ShowMode r2 = r14.getShowMode()
            com.daimajia.swipe.SwipeLayout$ShowMode r3 = com.daimajia.swipe.SwipeLayout.ShowMode.LayDown
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 != r3) goto L_0x0091
            int[] r2 = com.daimajia.swipe.SwipeLayout.C3861d.f7144a
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = r8.f7125l
            int r3 = r3.ordinal()
            r2 = r2[r3]
            if (r2 == r7) goto L_0x0087
            if (r2 == r6) goto L_0x007d
            if (r2 == r5) goto L_0x0074
            if (r2 == r4) goto L_0x0069
            goto L_0x00e1
        L_0x0069:
            int r0 = r12.right
            int r0 = r0 - r17
            float r1 = (float) r0
            int r2 = r11.getWidth()
            goto L_0x00df
        L_0x0074:
            int r0 = r12.left
            int r0 = r0 - r15
            float r1 = (float) r0
            int r2 = r11.getWidth()
            goto L_0x00df
        L_0x007d:
            int r0 = r12.bottom
            int r0 = r0 - r18
            float r1 = (float) r0
            int r2 = r11.getHeight()
            goto L_0x00df
        L_0x0087:
            int r0 = r12.top
            int r0 = r0 - r16
            float r1 = (float) r0
            int r2 = r11.getHeight()
            goto L_0x00df
        L_0x0091:
            com.daimajia.swipe.SwipeLayout$ShowMode r2 = r14.getShowMode()
            com.daimajia.swipe.SwipeLayout$ShowMode r3 = com.daimajia.swipe.SwipeLayout.ShowMode.PullOut
            if (r2 != r3) goto L_0x00e1
            int[] r2 = com.daimajia.swipe.SwipeLayout.C3861d.f7144a
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = r8.f7125l
            int r3 = r3.ordinal()
            r2 = r2[r3]
            if (r2 == r7) goto L_0x00d3
            if (r2 == r6) goto L_0x00c6
            if (r2 == r5) goto L_0x00b9
            if (r2 == r4) goto L_0x00ac
            goto L_0x00e1
        L_0x00ac:
            int r0 = r12.left
            int r1 = r14.getWidth()
            int r0 = r0 - r1
            float r1 = (float) r0
            int r2 = r11.getWidth()
            goto L_0x00df
        L_0x00b9:
            int r0 = r12.right
            int r1 = r14.getPaddingLeft()
            int r0 = r0 - r1
            float r1 = (float) r0
            int r2 = r11.getWidth()
            goto L_0x00df
        L_0x00c6:
            int r0 = r12.top
            int r1 = r14.getHeight()
            int r0 = r0 - r1
            float r1 = (float) r0
            int r2 = r11.getHeight()
            goto L_0x00df
        L_0x00d3:
            int r0 = r12.bottom
            int r1 = r14.getPaddingTop()
            int r0 = r0 - r1
            float r1 = (float) r0
            int r2 = r11.getHeight()
        L_0x00df:
            float r2 = (float) r2
            float r1 = r1 / r2
        L_0x00e1:
            java.lang.Object r2 = r10.getValue()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0110
            java.lang.Object r3 = r2.next()
            com.daimajia.swipe.SwipeLayout$g r3 = (com.daimajia.swipe.SwipeLayout.C3864g) r3
            com.daimajia.swipe.SwipeLayout$DragEdge r4 = r8.f7125l
            float r5 = java.lang.Math.abs(r1)
            r3.mo22448a(r11, r4, r5, r0)
            float r3 = java.lang.Math.abs(r1)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x00eb
            java.util.Map<android.view.View, java.lang.Boolean> r3 = r8.f7134u
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r11, r4)
            goto L_0x00eb
        L_0x0110:
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = r8.f7125l
            r0 = r14
            r1 = r11
            r2 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            boolean r0 = r0.mo22388D(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0014
            java.util.Map<android.view.View, java.lang.Boolean> r0 = r8.f7134u
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r11, r1)
            java.lang.Object r0 = r10.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0133:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r0.next()
            com.daimajia.swipe.SwipeLayout$g r1 = (com.daimajia.swipe.SwipeLayout.C3864g) r1
            com.daimajia.swipe.SwipeLayout$DragEdge r2 = r8.f7125l
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = com.daimajia.swipe.SwipeLayout.DragEdge.Left
            if (r2 == r3) goto L_0x0152
            com.daimajia.swipe.SwipeLayout$DragEdge r3 = com.daimajia.swipe.SwipeLayout.DragEdge.Right
            if (r2 != r3) goto L_0x014a
            goto L_0x0152
        L_0x014a:
            int r3 = r11.getHeight()
            r1.mo22448a(r11, r2, r13, r3)
            goto L_0x0133
        L_0x0152:
            com.daimajia.swipe.SwipeLayout$DragEdge r2 = r8.f7125l
            int r3 = r11.getWidth()
            r1.mo22448a(r11, r2, r13, r3)
            goto L_0x0133
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.SwipeLayout.mo22420q(int, int, int, int):void");
    }

    /* renamed from: r */
    public void mo22421r(int i, int i2, int i3, int i4) {
        DragEdge dragEdge = getDragEdge();
        boolean z = false;
        if (dragEdge != DragEdge.Left ? dragEdge != DragEdge.Right ? dragEdge != DragEdge.Top ? dragEdge != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0) {
            z = true;
        }
        mo22422s(i, i2, z);
    }

    /* renamed from: s */
    public void mo22422s(int i, int i2, boolean z) {
        mo22396L();
        Status openStatus = getOpenStatus();
        if (!this.f7131r.isEmpty()) {
            this.f7115A++;
            for (C3867j next : this.f7131r) {
                if (this.f7115A == 1) {
                    if (z) {
                        next.mo22452a(this);
                    } else {
                        next.mo22453b(this);
                    }
                }
                next.mo22454c(this, i - getPaddingLeft(), i2 - getPaddingTop());
            }
            if (openStatus == Status.Close) {
                for (C3867j f : this.f7131r) {
                    f.mo22457f(this);
                }
                this.f7115A = 0;
            }
            if (openStatus == Status.Open) {
                View currentBottomView = getCurrentBottomView();
                if (currentBottomView != null) {
                    currentBottomView.setEnabled(true);
                }
                for (C3867j e : this.f7131r) {
                    e.mo22456e(this);
                }
                this.f7115A = 0;
            }
        }
    }

    public void setBottomSwipeEnabled(boolean z) {
        this.f7137x[DragEdge.Bottom.ordinal()] = z;
    }

    public void setClickToClose(boolean z) {
        this.f7138y = z;
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f7127n = mo22437t((float) i);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(DragEdge dragEdge) {
        if (getChildCount() >= 2) {
            this.f7128o.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(dragEdge);
    }

    @Deprecated
    public void setDragEdges(List<DragEdge> list) {
        int min = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            this.f7128o.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(f7114J)) {
            setCurrentDragEdge(f7114J);
        } else {
            setCurrentDragEdge(list.get(0));
        }
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.f7137x[DragEdge.Left.ordinal()] = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f7120F = onClickListener;
    }

    public void setOnDoubleClickListener(C3862e eVar) {
        this.f7135v = eVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f7121G = onLongClickListener;
    }

    public void setRightSwipeEnabled(boolean z) {
        this.f7137x[DragEdge.Right.ordinal()] = z;
    }

    public void setShowMode(ShowMode showMode) {
        this.f7129p = showMode;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z) {
        this.f7136w = z;
    }

    public void setTopSwipeEnabled(boolean z) {
        this.f7137x[DragEdge.Top.ordinal()] = z;
    }

    /* renamed from: t */
    public final int mo22437t(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: u */
    public Rect mo22438u(View view) {
        Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
        View view2 = view;
        while (view2.getParent() != null && view2 != getRootView() && (view2 = (View) view2.getParent()) != this) {
            rect.left += view2.getLeft();
            rect.top += view2.getTop();
        }
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        return rect;
    }

    /* renamed from: v */
    public final boolean mo22439v() {
        return getAdapterView() != null;
    }

    /* renamed from: w */
    public boolean mo22440w() {
        View view = this.f7128o.get(DragEdge.Bottom);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f7137x[DragEdge.Bottom.ordinal()];
    }

    /* renamed from: x */
    public boolean mo22441x() {
        View view = this.f7128o.get(DragEdge.Left);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f7137x[DragEdge.Left.ordinal()];
    }

    /* renamed from: y */
    public boolean mo22442y() {
        View view = this.f7128o.get(DragEdge.Right);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f7137x[DragEdge.Right.ordinal()];
    }

    /* renamed from: z */
    public boolean mo22443z() {
        return this.f7136w;
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7125l = f7114J;
        this.f7127n = 0;
        this.f7128o = new LinkedHashMap<>();
        this.f7130q = new float[4];
        this.f7131r = new ArrayList();
        this.f7132s = new ArrayList();
        this.f7133t = new HashMap();
        this.f7134u = new HashMap();
        this.f7136w = true;
        this.f7137x = new boolean[]{true, true, true, true};
        this.f7138y = false;
        this.f7139z = new C3858a();
        this.f7115A = 0;
        this.f7118D = -1.0f;
        this.f7119E = -1.0f;
        this.f7123I = new GestureDetector(getContext(), new C3866i());
        this.f7126m = ViewDragHelper.create(this, this.f7139z);
        this.f7124e = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwipeLayout);
        int i2 = obtainStyledAttributes.getInt(R$styleable.SwipeLayout_drag_edge, 2);
        this.f7130q[DragEdge.Left.ordinal()] = obtainStyledAttributes.getDimension(R$styleable.SwipeLayout_leftEdgeSwipeOffset, 0.0f);
        this.f7130q[DragEdge.Right.ordinal()] = obtainStyledAttributes.getDimension(R$styleable.SwipeLayout_rightEdgeSwipeOffset, 0.0f);
        this.f7130q[DragEdge.Top.ordinal()] = obtainStyledAttributes.getDimension(R$styleable.SwipeLayout_topEdgeSwipeOffset, 0.0f);
        this.f7130q[DragEdge.Bottom.ordinal()] = obtainStyledAttributes.getDimension(R$styleable.SwipeLayout_bottomEdgeSwipeOffset, 0.0f);
        setClickToClose(obtainStyledAttributes.getBoolean(R$styleable.SwipeLayout_clickToClose, this.f7138y));
        if ((i2 & 1) == 1) {
            this.f7128o.put(DragEdge.Left, (Object) null);
        }
        if ((i2 & 4) == 4) {
            this.f7128o.put(DragEdge.Top, (Object) null);
        }
        if ((i2 & 2) == 2) {
            this.f7128o.put(DragEdge.Right, (Object) null);
        }
        if ((i2 & 8) == 8) {
            this.f7128o.put(DragEdge.Bottom, (Object) null);
        }
        this.f7129p = ShowMode.values()[obtainStyledAttributes.getInt(R$styleable.SwipeLayout_show_mode, ShowMode.PullOut.ordinal())];
        obtainStyledAttributes.recycle();
    }

    @Deprecated
    public void setDragEdges(DragEdge... dragEdgeArr) {
        setDragEdges((List<DragEdge>) Arrays.asList(dragEdgeArr));
    }
}

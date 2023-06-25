package com.github.barteksc.pdfviewer.scroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R$drawable;
import p040c.p175p.p176a.p177a.p181k.C2240a;
import p040c.p175p.p176a.p177a.p183m.C2249d;

public class DefaultScrollHandle extends RelativeLayout implements C2240a {

    /* renamed from: e */
    public float f7350e;

    /* renamed from: l */
    public TextView f7351l;

    /* renamed from: m */
    public Context f7352m;

    /* renamed from: n */
    public boolean f7353n;

    /* renamed from: o */
    public PDFView f7354o;

    /* renamed from: p */
    public float f7355p;

    /* renamed from: q */
    public Handler f7356q;

    /* renamed from: r */
    public Runnable f7357r;

    /* renamed from: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a */
    public class C3983a implements Runnable {
        public C3983a() {
        }

        public void run() {
            DefaultScrollHandle.this.mo17208a();
        }
    }

    public DefaultScrollHandle(Context context) {
        this(context, false);
    }

    private void setPosition(float f) {
        int i;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            if (this.f7354o.mo23494C()) {
                i = this.f7354o.getHeight();
            } else {
                i = this.f7354o.getWidth();
            }
            float f2 = (float) i;
            float f3 = f - this.f7350e;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > f2 - ((float) C2249d.m3490a(this.f7352m, 40))) {
                f3 = f2 - ((float) C2249d.m3490a(this.f7352m, 40));
            }
            if (this.f7354o.mo23494C()) {
                setY(f3);
            } else {
                setX(f3);
            }
            mo23573e();
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo17208a() {
        setVisibility(4);
    }

    /* renamed from: b */
    public void mo17209b() {
        this.f7356q.postDelayed(this.f7357r, 1000);
    }

    /* renamed from: c */
    public void mo17210c() {
        this.f7354o.removeView(this);
    }

    /* renamed from: d */
    public boolean mo17211d() {
        return getVisibility() == 0;
    }

    /* renamed from: e */
    public final void mo23573e() {
        int i;
        float f;
        float f2;
        if (this.f7354o.mo23494C()) {
            f2 = getY();
            f = (float) getHeight();
            i = this.f7354o.getHeight();
        } else {
            f2 = getX();
            f = (float) getWidth();
            i = this.f7354o.getWidth();
        }
        this.f7350e = ((f2 + this.f7350e) / ((float) i)) * f;
    }

    /* renamed from: f */
    public final boolean mo23574f() {
        PDFView pDFView = this.f7354o;
        return pDFView != null && pDFView.getPageCount() > 0 && !this.f7354o.mo23542m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo23574f()
            if (r0 != 0) goto L_0x000b
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x000b:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 == r1) goto L_0x0025
            r2 = 2
            if (r0 == r2) goto L_0x0059
            r2 = 3
            if (r0 == r2) goto L_0x0025
            r2 = 5
            if (r0 == r2) goto L_0x002e
            r2 = 6
            if (r0 == r2) goto L_0x0025
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x0025:
            r4.mo17209b()
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f7354o
            r5.mo23510S()
            return r1
        L_0x002e:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f7354o
            r0.mo23517Z()
            android.os.Handler r0 = r4.f7356q
            java.lang.Runnable r2 = r4.f7357r
            r0.removeCallbacks(r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f7354o
            boolean r0 = r0.mo23494C()
            if (r0 == 0) goto L_0x004e
            float r0 = r5.getRawY()
            float r2 = r4.getY()
            float r0 = r0 - r2
            r4.f7355p = r0
            goto L_0x0059
        L_0x004e:
            float r0 = r5.getRawX()
            float r2 = r4.getX()
            float r0 = r0 - r2
            r4.f7355p = r0
        L_0x0059:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f7354o
            boolean r0 = r0.mo23494C()
            r2 = 0
            if (r0 == 0) goto L_0x007d
            float r5 = r5.getRawY()
            float r0 = r4.f7355p
            float r5 = r5 - r0
            float r0 = r4.f7350e
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f7354o
            float r0 = r4.f7350e
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.mo23514W(r0, r2)
            goto L_0x0097
        L_0x007d:
            float r5 = r5.getRawX()
            float r0 = r4.f7355p
            float r5 = r5 - r0
            float r0 = r4.f7350e
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f7354o
            float r0 = r4.f7350e
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.mo23514W(r0, r2)
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setPageNum(int i) {
        String valueOf = String.valueOf(i);
        if (!this.f7351l.getText().equals(valueOf)) {
            this.f7351l.setText(valueOf);
        }
    }

    public void setScroll(float f) {
        if (!mo17211d()) {
            show();
        } else {
            this.f7356q.removeCallbacks(this.f7357r);
        }
        PDFView pDFView = this.f7354o;
        if (pDFView != null) {
            setPosition(((float) (pDFView.mo23494C() ? this.f7354o.getHeight() : this.f7354o.getWidth())) * f);
        }
    }

    public void setTextColor(int i) {
        this.f7351l.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.f7351l.setTextSize(1, (float) i);
    }

    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i;
        int i2 = 65;
        int i3 = 40;
        if (!pDFView.mo23494C()) {
            if (this.f7353n) {
                i = 10;
                drawable = ContextCompat.getDrawable(this.f7352m, R$drawable.default_scroll_handle_top);
            } else {
                i = 12;
                drawable = ContextCompat.getDrawable(this.f7352m, R$drawable.default_scroll_handle_bottom);
            }
            i3 = 65;
            i2 = 40;
        } else if (this.f7353n) {
            i = 9;
            drawable = ContextCompat.getDrawable(this.f7352m, R$drawable.default_scroll_handle_left);
        } else {
            i = 11;
            drawable = ContextCompat.getDrawable(this.f7352m, R$drawable.default_scroll_handle_right);
        }
        if (Build.VERSION.SDK_INT < 16) {
            setBackgroundDrawable(drawable);
        } else {
            setBackground(drawable);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C2249d.m3490a(this.f7352m, i2), C2249d.m3490a(this.f7352m, i3));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.f7351l, layoutParams2);
        layoutParams.addRule(i);
        pDFView.addView(this, layoutParams);
        this.f7354o = pDFView;
    }

    public void show() {
        setVisibility(0);
    }

    public DefaultScrollHandle(Context context, boolean z) {
        super(context);
        this.f7350e = 0.0f;
        this.f7356q = new Handler();
        this.f7357r = new C3983a();
        this.f7352m = context;
        this.f7353n = z;
        this.f7351l = new TextView(context);
        setVisibility(4);
        setTextColor(ViewCompat.MEASURED_STATE_MASK);
        setTextSize(16);
    }
}

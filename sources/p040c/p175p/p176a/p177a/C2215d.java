package p040c.p175p.p176a.p177a;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.SizeF;
import p040c.p175p.p176a.p177a.p180j.C2238a;
import p040c.p175p.p176a.p177a.p181k.C2240a;
import p040c.p175p.p176a.p177a.p183m.C2243a;

/* renamed from: c.p.a.a.d */
/* compiled from: DragPinchManager */
public class C2215d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: e */
    public PDFView f2206e;

    /* renamed from: l */
    public C2208a f2207l;

    /* renamed from: m */
    public GestureDetector f2208m;

    /* renamed from: n */
    public ScaleGestureDetector f2209n;

    /* renamed from: o */
    public boolean f2210o = false;

    /* renamed from: p */
    public boolean f2211p = false;

    /* renamed from: q */
    public boolean f2212q = false;

    public C2215d(PDFView pDFView, C2208a aVar) {
        this.f2206e = pDFView;
        this.f2207l = aVar;
        this.f2208m = new GestureDetector(pDFView.getContext(), this);
        this.f2209n = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final boolean mo17099a(float f, float f2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (this.f2206e.mo23494C()) {
            if (abs2 > abs) {
                return true;
            }
        } else if (abs > abs2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo17100b(float f, float f2) {
        int i;
        int i2;
        PDFView pDFView = this.f2206e;
        C2221f fVar = pDFView.f7302q;
        if (fVar == null) {
            return false;
        }
        float f3 = (-pDFView.getCurrentXOffset()) + f;
        float f4 = (-this.f2206e.getCurrentYOffset()) + f2;
        int j = fVar.mo17141j(this.f2206e.mo23494C() ? f4 : f3, this.f2206e.getZoom());
        SizeF q = fVar.mo17148q(j, this.f2206e.getZoom());
        if (this.f2206e.mo23494C()) {
            i2 = (int) fVar.mo17149r(j, this.f2206e.getZoom());
            i = (int) fVar.mo17144m(j, this.f2206e.getZoom());
        } else {
            i = (int) fVar.mo17149r(j, this.f2206e.getZoom());
            i2 = (int) fVar.mo17144m(j, this.f2206e.getZoom());
        }
        int i3 = i2;
        int i4 = i;
        for (PdfDocument.Link next : fVar.mo17143l(j)) {
            RectF s = fVar.mo17150s(j, i3, i4, (int) q.getWidth(), (int) q.getHeight(), next.getBounds());
            s.sort();
            if (s.contains(f3, f4)) {
                this.f2206e.f7271B.mo17169a(new C2238a(f, f2, f3, f4, s, next));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo17101c() {
        this.f2212q = false;
    }

    /* renamed from: d */
    public void mo17102d() {
        this.f2212q = true;
    }

    /* renamed from: e */
    public final void mo17103e() {
        C2240a scrollHandle = this.f2206e.getScrollHandle();
        if (scrollHandle != null && scrollHandle.mo17211d()) {
            scrollHandle.mo17209b();
        }
    }

    /* renamed from: f */
    public final void mo17104f(float f, float f2) {
        float f3;
        float f4;
        int currentXOffset = (int) this.f2206e.getCurrentXOffset();
        int currentYOffset = (int) this.f2206e.getCurrentYOffset();
        PDFView pDFView = this.f2206e;
        C2221f fVar = pDFView.f7302q;
        float f5 = -fVar.mo17144m(pDFView.getCurrentPage(), this.f2206e.getZoom());
        float k = f5 - fVar.mo17142k(this.f2206e.getCurrentPage(), this.f2206e.getZoom());
        float f6 = 0.0f;
        if (this.f2206e.mo23494C()) {
            f4 = -(this.f2206e.mo23518a0(fVar.mo17139h()) - ((float) this.f2206e.getWidth()));
            f3 = k + ((float) this.f2206e.getHeight());
            f6 = f5;
            f5 = 0.0f;
        } else {
            float width = k + ((float) this.f2206e.getWidth());
            f3 = -(this.f2206e.mo23518a0(fVar.mo17137f()) - ((float) this.f2206e.getHeight()));
            f4 = width;
        }
        this.f2207l.mo17063g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, (int) f5, (int) f3, (int) f6);
    }

    /* renamed from: g */
    public final void mo17105g(MotionEvent motionEvent) {
        this.f2206e.mo23503L();
        mo17103e();
        if (!this.f2207l.mo17062f()) {
            this.f2206e.mo23510S();
        }
    }

    /* renamed from: h */
    public final void mo17106h(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        if (mo17099a(f, f2)) {
            int i = -1;
            if (!this.f2206e.mo23494C() ? f <= 0.0f : f2 <= 0.0f) {
                i = 1;
            }
            if (this.f2206e.mo23494C()) {
                f3 = motionEvent2.getY();
                f4 = motionEvent.getY();
            } else {
                f3 = motionEvent2.getX();
                f4 = motionEvent.getX();
            }
            float f5 = f3 - f4;
            int max = Math.max(0, Math.min(this.f2206e.getPageCount() - 1, this.f2206e.mo23551s(this.f2206e.getCurrentXOffset() - (this.f2206e.getZoom() * f5), this.f2206e.getCurrentYOffset() - (f5 * this.f2206e.getZoom())) + i));
            this.f2207l.mo17064h(-this.f2206e.mo23516Y(max, this.f2206e.mo23560t(max)));
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f2206e.mo23565y()) {
            return false;
        }
        if (this.f2206e.getZoom() < this.f2206e.getMidZoom()) {
            this.f2206e.mo23526f0(motionEvent.getX(), motionEvent.getY(), this.f2206e.getMidZoom());
            return true;
        } else if (this.f2206e.getZoom() < this.f2206e.getMaxZoom()) {
            this.f2206e.mo23526f0(motionEvent.getX(), motionEvent.getY(), this.f2206e.getMaxZoom());
            return true;
        } else {
            this.f2206e.mo23513V();
            return true;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f2207l.mo17069m();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        int i;
        if (!this.f2206e.mo23493B()) {
            return false;
        }
        if (this.f2206e.mo23492A()) {
            if (this.f2206e.mo23509R()) {
                mo17104f(f, f2);
            } else {
                mo17106h(motionEvent, motionEvent2, f, f2);
            }
            return true;
        }
        int currentXOffset = (int) this.f2206e.getCurrentXOffset();
        int currentYOffset = (int) this.f2206e.getCurrentYOffset();
        PDFView pDFView = this.f2206e;
        C2221f fVar = pDFView.f7302q;
        if (pDFView.mo23494C()) {
            f4 = -(this.f2206e.mo23518a0(fVar.mo17139h()) - ((float) this.f2206e.getWidth()));
            f3 = fVar.mo17136e(this.f2206e.getZoom());
            i = this.f2206e.getHeight();
        } else {
            f4 = -(fVar.mo17136e(this.f2206e.getZoom()) - ((float) this.f2206e.getWidth()));
            f3 = this.f2206e.mo23518a0(fVar.mo17137f());
            i = this.f2206e.getHeight();
        }
        this.f2207l.mo17063g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, 0, (int) (-(f3 - ((float) i))), 0);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.f2206e.f7271B.mo17171c(motionEvent);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f2206e.getZoom() * scaleFactor;
        float min = Math.min(C2243a.C2245b.f2296b, this.f2206e.getMinZoom());
        float min2 = Math.min(C2243a.C2245b.f2295a, this.f2206e.getMaxZoom());
        if (zoom < min) {
            scaleFactor = min / this.f2206e.getZoom();
        } else if (zoom > min2) {
            scaleFactor = min2 / this.f2206e.getZoom();
        }
        this.f2206e.mo23519b0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f2211p = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f2206e.mo23503L();
        mo17103e();
        this.f2211p = false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f2210o = true;
        if (this.f2206e.mo23495D() || this.f2206e.mo23493B()) {
            this.f2206e.mo23504M(-f, -f2);
        }
        if (!this.f2211p || this.f2206e.mo23541l()) {
            this.f2206e.mo23502K();
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C2240a scrollHandle;
        boolean h = this.f2206e.f7271B.mo17176h(motionEvent);
        boolean b = mo17100b(motionEvent.getX(), motionEvent.getY());
        if (!h && !b && (scrollHandle = this.f2206e.getScrollHandle()) != null && !this.f2206e.mo23542m()) {
            if (!scrollHandle.mo17211d()) {
                scrollHandle.show();
            } else {
                scrollHandle.mo17208a();
            }
        }
        this.f2206e.performClick();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2212q) {
            return false;
        }
        boolean z = this.f2208m.onTouchEvent(motionEvent) || this.f2209n.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f2210o) {
            this.f2210o = false;
            mo17105g(motionEvent);
        }
        return z;
    }
}

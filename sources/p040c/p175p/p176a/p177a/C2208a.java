package p040c.p175p.p176a.p177a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: c.p.a.a.a */
/* compiled from: AnimationManager */
public class C2208a {

    /* renamed from: a */
    public PDFView f2184a;

    /* renamed from: b */
    public ValueAnimator f2185b;

    /* renamed from: c */
    public OverScroller f2186c;

    /* renamed from: d */
    public boolean f2187d = false;

    /* renamed from: e */
    public boolean f2188e = false;

    /* renamed from: c.p.a.a.a$a */
    /* compiled from: AnimationManager */
    public class C2209a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C2209a() {
        }

        public void onAnimationCancel(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            boolean unused = C2208a.this.f2188e = false;
            C2208a.this.mo17061e();
        }

        public void onAnimationEnd(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            boolean unused = C2208a.this.f2188e = false;
            C2208a.this.mo17061e();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2208a.this.f2184a.mo23505N(((Float) valueAnimator.getAnimatedValue()).floatValue(), C2208a.this.f2184a.getCurrentYOffset());
            C2208a.this.f2184a.mo23502K();
        }
    }

    /* renamed from: c.p.a.a.a$b */
    /* compiled from: AnimationManager */
    public class C2210b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C2210b() {
        }

        public void onAnimationCancel(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            boolean unused = C2208a.this.f2188e = false;
            C2208a.this.mo17061e();
        }

        public void onAnimationEnd(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            boolean unused = C2208a.this.f2188e = false;
            C2208a.this.mo17061e();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2208a.this.f2184a.mo23505N(C2208a.this.f2184a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C2208a.this.f2184a.mo23502K();
        }
    }

    /* renamed from: c.p.a.a.a$c */
    /* compiled from: AnimationManager */
    public class C2211c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f2191a;

        /* renamed from: b */
        public final float f2192b;

        public C2211c(float f, float f2) {
            this.f2191a = f;
            this.f2192b = f2;
        }

        public void onAnimationCancel(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            C2208a.this.mo17061e();
        }

        public void onAnimationEnd(Animator animator) {
            C2208a.this.f2184a.mo23503L();
            C2208a.this.f2184a.mo23510S();
            C2208a.this.mo17061e();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2208a.this.f2184a.mo23520c0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f2191a, this.f2192b));
        }
    }

    public C2208a(PDFView pDFView) {
        this.f2184a = pDFView;
        this.f2186c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: d */
    public void mo17060d() {
        if (this.f2186c.computeScrollOffset()) {
            this.f2184a.mo23505N((float) this.f2186c.getCurrX(), (float) this.f2186c.getCurrY());
            this.f2184a.mo23502K();
        } else if (this.f2187d) {
            this.f2187d = false;
            this.f2184a.mo23503L();
            mo17061e();
            this.f2184a.mo23510S();
        }
    }

    /* renamed from: e */
    public final void mo17061e() {
        if (this.f2184a.getScrollHandle() != null) {
            this.f2184a.getScrollHandle().mo17209b();
        }
    }

    /* renamed from: f */
    public boolean mo17062f() {
        return this.f2187d || this.f2188e;
    }

    /* renamed from: g */
    public void mo17063g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo17068l();
        this.f2187d = true;
        this.f2186c.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: h */
    public void mo17064h(float f) {
        if (this.f2184a.mo23494C()) {
            mo17066j(this.f2184a.getCurrentYOffset(), f);
        } else {
            mo17065i(this.f2184a.getCurrentXOffset(), f);
        }
        this.f2188e = true;
    }

    /* renamed from: i */
    public void mo17065i(float f, float f2) {
        mo17068l();
        this.f2185b = ValueAnimator.ofFloat(new float[]{f, f2});
        C2209a aVar = new C2209a();
        this.f2185b.setInterpolator(new DecelerateInterpolator());
        this.f2185b.addUpdateListener(aVar);
        this.f2185b.addListener(aVar);
        this.f2185b.setDuration(400);
        this.f2185b.start();
    }

    /* renamed from: j */
    public void mo17066j(float f, float f2) {
        mo17068l();
        this.f2185b = ValueAnimator.ofFloat(new float[]{f, f2});
        C2210b bVar = new C2210b();
        this.f2185b.setInterpolator(new DecelerateInterpolator());
        this.f2185b.addUpdateListener(bVar);
        this.f2185b.addListener(bVar);
        this.f2185b.setDuration(400);
        this.f2185b.start();
    }

    /* renamed from: k */
    public void mo17067k(float f, float f2, float f3, float f4) {
        mo17068l();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, f4});
        this.f2185b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C2211c cVar = new C2211c(f, f2);
        this.f2185b.addUpdateListener(cVar);
        this.f2185b.addListener(cVar);
        this.f2185b.setDuration(400);
        this.f2185b.start();
    }

    /* renamed from: l */
    public void mo17068l() {
        ValueAnimator valueAnimator = this.f2185b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2185b = null;
        }
        mo17069m();
    }

    /* renamed from: m */
    public void mo17069m() {
        this.f2187d = false;
        this.f2186c.forceFinished(true);
    }
}

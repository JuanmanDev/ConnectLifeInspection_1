package p630io.supercharge.shimmerlayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.stetho.dumpapp.Framer;

/* renamed from: io.supercharge.shimmerlayout.ShimmerLayout */
public class ShimmerLayout extends FrameLayout {

    /* renamed from: e */
    public int f18757e;

    /* renamed from: l */
    public Rect f18758l;

    /* renamed from: m */
    public Paint f18759m;

    /* renamed from: n */
    public ValueAnimator f18760n;

    /* renamed from: o */
    public Bitmap f18761o;

    /* renamed from: p */
    public Bitmap f18762p;

    /* renamed from: q */
    public Canvas f18763q;

    /* renamed from: r */
    public boolean f18764r;

    /* renamed from: s */
    public boolean f18765s;

    /* renamed from: t */
    public boolean f18766t;

    /* renamed from: u */
    public int f18767u;

    /* renamed from: v */
    public int f18768v;

    /* renamed from: w */
    public int f18769w;

    /* renamed from: x */
    public float f18770x;

    /* renamed from: y */
    public float f18771y;

    /* renamed from: z */
    public ViewTreeObserver.OnPreDrawListener f18772z;

    /* renamed from: io.supercharge.shimmerlayout.ShimmerLayout$a */
    public class C9476a implements ViewTreeObserver.OnPreDrawListener {
        public C9476a() {
        }

        public boolean onPreDraw() {
            ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ShimmerLayout.this.mo47860n();
            return true;
        }
    }

    /* renamed from: io.supercharge.shimmerlayout.ShimmerLayout$b */
    public class C9477b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ int f18774a;

        /* renamed from: b */
        public final /* synthetic */ int f18775b;

        public C9477b(int i, int i2) {
            this.f18774a = i;
            this.f18775b = i2;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int unused = ShimmerLayout.this.f18757e = this.f18774a + ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (ShimmerLayout.this.f18757e + this.f18775b >= 0) {
                ShimmerLayout.this.invalidate();
            }
        }
    }

    public ShimmerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = new float[4];
        fArr[0] = 0.0f;
        fArr[3] = 1.0f;
        float f = this.f18771y;
        fArr[1] = 0.5f - (f / 2.0f);
        fArr[2] = (f / 2.0f) + 0.5f;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f18762p == null) {
            this.f18762p = mo47851e(this.f18758l.width(), getHeight());
        }
        return this.f18762p;
    }

    private Animator getShimmerAnimation() {
        int i;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f18760n;
        if (valueAnimator2 != null) {
            return valueAnimator2;
        }
        if (this.f18758l == null) {
            this.f18758l = mo47848c();
        }
        int width = getWidth();
        if (getWidth() > this.f18758l.width()) {
            i = -width;
        } else {
            i = -this.f18758l.width();
        }
        int width2 = this.f18758l.width();
        int i2 = width - i;
        if (this.f18764r) {
            valueAnimator = ValueAnimator.ofInt(new int[]{i2, 0});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i2});
        }
        this.f18760n = valueAnimator;
        valueAnimator.setDuration((long) this.f18767u);
        this.f18760n.setRepeatCount(-1);
        this.f18760n.addUpdateListener(new C9477b(i, width2));
        return this.f18760n;
    }

    /* renamed from: c */
    public final Rect mo47848c() {
        return new Rect(0, 0, mo47849d(), getHeight());
    }

    /* renamed from: d */
    public final int mo47849d() {
        return (int) ((((double) (((float) (getWidth() / 2)) * this.f18770x)) / Math.cos(Math.toRadians((double) Math.abs(this.f18769w)))) + (((double) getHeight()) * Math.tan(Math.toRadians((double) Math.abs(this.f18769w)))));
    }

    public void dispatchDraw(Canvas canvas) {
        if (!this.f18765s || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            mo47853g(canvas);
        }
    }

    /* renamed from: e */
    public final Bitmap mo47851e(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    /* renamed from: f */
    public final void mo47852f() {
        if (this.f18759m == null) {
            int j = mo47856j(this.f18768v);
            float width = ((float) (getWidth() / 2)) * this.f18770x;
            float height = this.f18769w >= 0 ? (float) getHeight() : 0.0f;
            int i = this.f18768v;
            LinearGradient linearGradient = new LinearGradient(0.0f, height, ((float) Math.cos(Math.toRadians((double) this.f18769w))) * width, height + (((float) Math.sin(Math.toRadians((double) this.f18769w))) * width), new int[]{j, i, i, j}, getGradientColorDistribution(), Shader.TileMode.CLAMP);
            Bitmap bitmap = this.f18761o;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            ComposeShader composeShader = new ComposeShader(linearGradient, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.DST_IN);
            Paint paint = new Paint();
            this.f18759m = paint;
            paint.setAntiAlias(true);
            this.f18759m.setDither(true);
            this.f18759m.setFilterBitmap(true);
            this.f18759m.setShader(composeShader);
        }
    }

    /* renamed from: g */
    public final void mo47853g(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f18761o = maskBitmap;
        if (maskBitmap != null) {
            if (this.f18763q == null) {
                this.f18763q = new Canvas(this.f18761o);
            }
            this.f18763q.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f18763q.save();
            this.f18763q.translate((float) (-this.f18757e), 0.0f);
            super.dispatchDraw(this.f18763q);
            this.f18763q.restore();
            mo47854h(canvas);
            this.f18761o = null;
        }
    }

    /* renamed from: h */
    public final void mo47854h(Canvas canvas) {
        mo47852f();
        canvas.save();
        canvas.translate((float) this.f18757e, 0.0f);
        Rect rect = this.f18758l;
        canvas.drawRect((float) rect.left, 0.0f, (float) rect.width(), (float) this.f18758l.height(), this.f18759m);
        canvas.restore();
    }

    /* renamed from: i */
    public final int mo47855i(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getContext().getColor(i);
        }
        return getResources().getColor(i);
    }

    /* renamed from: j */
    public final int mo47856j(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: k */
    public final void mo47857k() {
        this.f18763q = null;
        Bitmap bitmap = this.f18762p;
        if (bitmap != null) {
            bitmap.recycle();
            this.f18762p = null;
        }
    }

    /* renamed from: l */
    public final void mo47858l() {
        if (this.f18765s) {
            mo47859m();
            mo47860n();
        }
    }

    /* renamed from: m */
    public final void mo47859m() {
        ValueAnimator valueAnimator = this.f18760n;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f18760n.removeAllUpdateListeners();
        }
        this.f18760n = null;
        this.f18759m = null;
        this.f18765s = false;
        mo47857k();
    }

    /* renamed from: n */
    public void mo47860n() {
        if (!this.f18765s) {
            if (getWidth() == 0) {
                this.f18772z = new C9476a();
                getViewTreeObserver().addOnPreDrawListener(this.f18772z);
                return;
            }
            getShimmerAnimation().start();
            this.f18765s = true;
        }
    }

    /* renamed from: o */
    public void mo47861o() {
        if (this.f18772z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18772z);
        }
        mo47859m();
    }

    public void onDetachedFromWindow() {
        mo47859m();
        super.onDetachedFromWindow();
    }

    public void setAnimationReversed(boolean z) {
        this.f18764r = z;
        mo47858l();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", new Object[]{(byte) 0, (byte) 1}));
        }
        this.f18771y = f;
        mo47858l();
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", new Object[]{(byte) 0, (byte) 1}));
        }
        this.f18770x = f;
        mo47858l();
    }

    public void setShimmerAngle(int i) {
        if (i < -45 || 45 < i) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", new Object[]{(byte) -45, Byte.valueOf(Framer.STDIN_FRAME_PREFIX)}));
        }
        this.f18769w = i;
        mo47858l();
    }

    public void setShimmerAnimationDuration(int i) {
        this.f18767u = i;
        mo47858l();
    }

    public void setShimmerColor(int i) {
        this.f18768v = i;
        mo47858l();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            mo47861o();
        } else if (this.f18766t) {
            mo47860n();
        }
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ShimmerLayout, 0, 0);
        try {
            this.f18769w = obtainStyledAttributes.getInteger(R$styleable.ShimmerLayout_shimmer_angle, 20);
            this.f18767u = obtainStyledAttributes.getInteger(R$styleable.ShimmerLayout_shimmer_animation_duration, 1500);
            this.f18768v = obtainStyledAttributes.getColor(R$styleable.ShimmerLayout_shimmer_color, mo47855i(R$color.shimmer_color));
            this.f18766t = obtainStyledAttributes.getBoolean(R$styleable.ShimmerLayout_shimmer_auto_start, false);
            this.f18770x = obtainStyledAttributes.getFloat(R$styleable.ShimmerLayout_shimmer_mask_width, 0.5f);
            this.f18771y = obtainStyledAttributes.getFloat(R$styleable.ShimmerLayout_shimmer_gradient_center_color_width, 0.1f);
            this.f18764r = obtainStyledAttributes.getBoolean(R$styleable.ShimmerLayout_shimmer_reverse_animation, false);
            obtainStyledAttributes.recycle();
            setMaskWidth(this.f18770x);
            setGradientCenterColorWidth(this.f18771y);
            setShimmerAngle(this.f18769w);
            if (this.f18766t && getVisibility() == 0) {
                mo47860n();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}

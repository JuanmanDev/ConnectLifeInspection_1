package com.suke.widget;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public class SwitchButton extends View implements Checkable {

    /* renamed from: i0 */
    public static final int f16867i0 = m23690t(58.0f);

    /* renamed from: j0 */
    public static final int f16868j0 = m23690t(36.0f);

    /* renamed from: A */
    public int f16869A;

    /* renamed from: B */
    public float f16870B;

    /* renamed from: C */
    public int f16871C;

    /* renamed from: D */
    public int f16872D;

    /* renamed from: E */
    public float f16873E;

    /* renamed from: F */
    public float f16874F;

    /* renamed from: G */
    public float f16875G;

    /* renamed from: H */
    public float f16876H;

    /* renamed from: I */
    public float f16877I;

    /* renamed from: J */
    public float f16878J;

    /* renamed from: K */
    public Paint f16879K;

    /* renamed from: L */
    public Paint f16880L;

    /* renamed from: M */
    public C8803e f16881M;

    /* renamed from: N */
    public C8803e f16882N;

    /* renamed from: O */
    public C8803e f16883O;

    /* renamed from: P */
    public RectF f16884P = new RectF();

    /* renamed from: Q */
    public int f16885Q = 0;

    /* renamed from: R */
    public ValueAnimator f16886R;

    /* renamed from: S */
    public final ArgbEvaluator f16887S = new ArgbEvaluator();

    /* renamed from: T */
    public boolean f16888T;

    /* renamed from: U */
    public boolean f16889U;

    /* renamed from: V */
    public boolean f16890V;

    /* renamed from: W */
    public boolean f16891W;

    /* renamed from: a0 */
    public boolean f16892a0 = false;

    /* renamed from: b0 */
    public boolean f16893b0 = false;

    /* renamed from: c0 */
    public boolean f16894c0 = false;

    /* renamed from: d0 */
    public C8802d f16895d0;

    /* renamed from: e */
    public int f16896e;

    /* renamed from: e0 */
    public long f16897e0;

    /* renamed from: f0 */
    public Runnable f16898f0 = new C8799a();

    /* renamed from: g0 */
    public ValueAnimator.AnimatorUpdateListener f16899g0 = new C8800b();

    /* renamed from: h0 */
    public Animator.AnimatorListener f16900h0 = new C8801c();

    /* renamed from: l */
    public int f16901l;

    /* renamed from: m */
    public int f16902m;

    /* renamed from: n */
    public float f16903n;

    /* renamed from: o */
    public float f16904o;

    /* renamed from: p */
    public float f16905p;

    /* renamed from: q */
    public float f16906q;

    /* renamed from: r */
    public float f16907r;

    /* renamed from: s */
    public float f16908s;

    /* renamed from: t */
    public float f16909t;

    /* renamed from: u */
    public float f16910u;

    /* renamed from: v */
    public int f16911v;

    /* renamed from: w */
    public int f16912w;

    /* renamed from: x */
    public int f16913x;

    /* renamed from: y */
    public int f16914y;

    /* renamed from: z */
    public int f16915z;

    /* renamed from: com.suke.widget.SwitchButton$a */
    public class C8799a implements Runnable {
        public C8799a() {
        }

        public void run() {
            if (!SwitchButton.this.mo45899D()) {
                SwitchButton.this.mo45902L();
            }
        }
    }

    /* renamed from: com.suke.widget.SwitchButton$b */
    public class C8800b implements ValueAnimator.AnimatorUpdateListener {
        public C8800b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int j = SwitchButton.this.f16885Q;
            if (j == 1 || j == 3 || j == 4) {
                SwitchButton.this.f16881M.f16921c = ((Integer) SwitchButton.this.f16887S.evaluate(floatValue, Integer.valueOf(SwitchButton.this.f16882N.f16921c), Integer.valueOf(SwitchButton.this.f16883O.f16921c))).intValue();
                SwitchButton.this.f16881M.f16922d = SwitchButton.this.f16882N.f16922d + ((SwitchButton.this.f16883O.f16922d - SwitchButton.this.f16882N.f16922d) * floatValue);
                if (SwitchButton.this.f16885Q != 1) {
                    SwitchButton.this.f16881M.f16919a = SwitchButton.this.f16882N.f16919a + ((SwitchButton.this.f16883O.f16919a - SwitchButton.this.f16882N.f16919a) * floatValue);
                }
                SwitchButton.this.f16881M.f16920b = ((Integer) SwitchButton.this.f16887S.evaluate(floatValue, Integer.valueOf(SwitchButton.this.f16882N.f16920b), Integer.valueOf(SwitchButton.this.f16883O.f16920b))).intValue();
            } else if (j == 5) {
                SwitchButton.this.f16881M.f16919a = SwitchButton.this.f16882N.f16919a + ((SwitchButton.this.f16883O.f16919a - SwitchButton.this.f16882N.f16919a) * floatValue);
                float p = (SwitchButton.this.f16881M.f16919a - SwitchButton.this.f16877I) / (SwitchButton.this.f16878J - SwitchButton.this.f16877I);
                SwitchButton.this.f16881M.f16920b = ((Integer) SwitchButton.this.f16887S.evaluate(p, Integer.valueOf(SwitchButton.this.f16912w), Integer.valueOf(SwitchButton.this.f16913x))).intValue();
                SwitchButton.this.f16881M.f16922d = SwitchButton.this.f16903n * p;
                SwitchButton.this.f16881M.f16921c = ((Integer) SwitchButton.this.f16887S.evaluate(p, 0, Integer.valueOf(SwitchButton.this.f16915z))).intValue();
            }
            SwitchButton.this.postInvalidate();
        }
    }

    /* renamed from: com.suke.widget.SwitchButton$c */
    public class C8801c implements Animator.AnimatorListener {
        public C8801c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            int j = SwitchButton.this.f16885Q;
            if (j == 1) {
                int unused = SwitchButton.this.f16885Q = 2;
                SwitchButton.this.f16881M.f16921c = 0;
                SwitchButton.this.f16881M.f16922d = SwitchButton.this.f16903n;
                SwitchButton.this.postInvalidate();
            } else if (j == 3) {
                int unused2 = SwitchButton.this.f16885Q = 0;
                SwitchButton.this.postInvalidate();
            } else if (j == 4) {
                int unused3 = SwitchButton.this.f16885Q = 0;
                SwitchButton.this.postInvalidate();
                SwitchButton.this.mo45911r();
            } else if (j == 5) {
                SwitchButton switchButton = SwitchButton.this;
                boolean unused4 = switchButton.f16888T = true ^ switchButton.f16888T;
                int unused5 = SwitchButton.this.f16885Q = 0;
                SwitchButton.this.postInvalidate();
                SwitchButton.this.mo45911r();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.suke.widget.SwitchButton$d */
    public interface C8802d {
        /* renamed from: a */
        void mo33010a(SwitchButton switchButton, boolean z);
    }

    /* renamed from: com.suke.widget.SwitchButton$e */
    public static class C8803e {

        /* renamed from: a */
        public float f16919a;

        /* renamed from: b */
        public int f16920b;

        /* renamed from: c */
        public int f16921c;

        /* renamed from: d */
        public float f16922d;

        /* renamed from: b */
        public final void mo45932b(C8803e eVar) {
            this.f16919a = eVar.f16919a;
            this.f16920b = eVar.f16920b;
            this.f16921c = eVar.f16921c;
            this.f16922d = eVar.f16922d;
        }
    }

    public SwitchButton(Context context) {
        super(context);
        mo45897B(context, (AttributeSet) null);
    }

    /* renamed from: F */
    public static boolean m23667F(TypedArray typedArray, int i, boolean z) {
        return typedArray == null ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: G */
    public static int m23668G(TypedArray typedArray, int i, int i2) {
        return typedArray == null ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: H */
    public static int m23669H(TypedArray typedArray, int i, int i2) {
        return typedArray == null ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: I */
    public static float m23670I(TypedArray typedArray, int i, float f) {
        return typedArray == null ? f : typedArray.getDimension(i, f);
    }

    /* renamed from: J */
    public static int m23671J(TypedArray typedArray, int i, int i2) {
        return typedArray == null ? i2 : typedArray.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: s */
    public static float m23689s(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    private void setCheckedViewState(C8803e eVar) {
        eVar.f16922d = this.f16903n;
        eVar.f16920b = this.f16913x;
        eVar.f16921c = this.f16915z;
        eVar.f16919a = this.f16878J;
    }

    private void setUncheckViewState(C8803e eVar) {
        eVar.f16922d = 0.0f;
        eVar.f16920b = this.f16912w;
        eVar.f16921c = 0;
        eVar.f16919a = this.f16877I;
    }

    /* renamed from: t */
    public static int m23690t(float f) {
        return (int) m23689s(f);
    }

    /* renamed from: A */
    public void mo45896A(Canvas canvas, int i, float f, float f2, float f3, float f4, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        canvas.drawCircle(f2, f3, f4, paint);
    }

    /* renamed from: B */
    public final void mo45897B(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, R$styleable.SwitchButton) : null;
        this.f16890V = m23667F(obtainStyledAttributes, R$styleable.SwitchButton_sb_shadow_effect, true);
        this.f16871C = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_uncheckcircle_color, -5592406);
        this.f16872D = m23671J(obtainStyledAttributes, R$styleable.SwitchButton_sb_uncheckcircle_width, m23690t(1.5f));
        this.f16873E = m23689s(10.0f);
        this.f16874F = m23670I(obtainStyledAttributes, R$styleable.SwitchButton_sb_uncheckcircle_radius, m23689s(4.0f));
        this.f16875G = m23689s(4.0f);
        this.f16876H = m23689s(4.0f);
        this.f16896e = m23671J(obtainStyledAttributes, R$styleable.SwitchButton_sb_shadow_radius, m23690t(2.5f));
        this.f16901l = m23671J(obtainStyledAttributes, R$styleable.SwitchButton_sb_shadow_offset, m23690t(1.5f));
        this.f16902m = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_shadow_color, 855638016);
        this.f16912w = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_uncheck_color, -2236963);
        this.f16913x = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_checked_color, -11414681);
        this.f16914y = m23671J(obtainStyledAttributes, R$styleable.SwitchButton_sb_border_width, m23690t(1.0f));
        this.f16915z = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_checkline_color, -1);
        this.f16869A = m23671J(obtainStyledAttributes, R$styleable.SwitchButton_sb_checkline_width, m23690t(1.0f));
        this.f16870B = m23689s(6.0f);
        int G = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_button_color, -1);
        int H = m23669H(obtainStyledAttributes, R$styleable.SwitchButton_sb_effect_duration, 300);
        this.f16888T = m23667F(obtainStyledAttributes, R$styleable.SwitchButton_sb_checked, false);
        this.f16891W = m23667F(obtainStyledAttributes, R$styleable.SwitchButton_sb_show_indicator, true);
        this.f16911v = m23668G(obtainStyledAttributes, R$styleable.SwitchButton_sb_background, -1);
        this.f16889U = m23667F(obtainStyledAttributes, R$styleable.SwitchButton_sb_enable_effect, true);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        this.f16880L = new Paint(1);
        Paint paint = new Paint(1);
        this.f16879K = paint;
        paint.setColor(G);
        if (this.f16890V) {
            this.f16879K.setShadowLayer((float) this.f16896e, 0.0f, (float) this.f16901l, this.f16902m);
        }
        this.f16881M = new C8803e();
        this.f16882N = new C8803e();
        this.f16883O = new C8803e();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f16886R = ofFloat;
        ofFloat.setDuration((long) H);
        this.f16886R.setRepeatCount(0);
        this.f16886R.addUpdateListener(this.f16899g0);
        this.f16886R.addListener(this.f16900h0);
        super.setClickable(true);
        setPadding(0, 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: C */
    public final boolean mo45898C() {
        return this.f16885Q == 2;
    }

    /* renamed from: D */
    public final boolean mo45899D() {
        return this.f16885Q != 0;
    }

    /* renamed from: E */
    public final boolean mo45900E() {
        int i = this.f16885Q;
        return i == 1 || i == 3;
    }

    /* renamed from: K */
    public final void mo45901K() {
        if (mo45898C() || mo45900E()) {
            if (this.f16886R.isRunning()) {
                this.f16886R.cancel();
            }
            this.f16885Q = 3;
            this.f16882N.mo45932b(this.f16881M);
            if (isChecked()) {
                setCheckedViewState(this.f16883O);
            } else {
                setUncheckViewState(this.f16883O);
            }
            this.f16886R.start();
        }
    }

    /* renamed from: L */
    public final void mo45902L() {
        if (!mo45899D() && this.f16892a0) {
            if (this.f16886R.isRunning()) {
                this.f16886R.cancel();
            }
            this.f16885Q = 1;
            this.f16882N.mo45932b(this.f16881M);
            this.f16883O.mo45932b(this.f16881M);
            if (isChecked()) {
                C8803e eVar = this.f16883O;
                int i = this.f16913x;
                eVar.f16920b = i;
                eVar.f16919a = this.f16878J;
                eVar.f16921c = i;
            } else {
                C8803e eVar2 = this.f16883O;
                eVar2.f16920b = this.f16912w;
                eVar2.f16919a = this.f16877I;
                eVar2.f16922d = this.f16903n;
            }
            this.f16886R.start();
        }
    }

    /* renamed from: M */
    public final void mo45903M() {
        if (this.f16886R.isRunning()) {
            this.f16886R.cancel();
        }
        this.f16885Q = 4;
        this.f16882N.mo45932b(this.f16881M);
        if (isChecked()) {
            setCheckedViewState(this.f16883O);
        } else {
            setUncheckViewState(this.f16883O);
        }
        this.f16886R.start();
    }

    /* renamed from: N */
    public void mo45904N(boolean z) {
        mo45905O(z, true);
    }

    /* renamed from: O */
    public final void mo45905O(boolean z, boolean z2) {
        if (isEnabled()) {
            if (this.f16894c0) {
                throw new RuntimeException("should NOT switch the state in method: [onCheckedChanged]!");
            } else if (!this.f16893b0) {
                this.f16888T = !this.f16888T;
                if (z2) {
                    mo45911r();
                }
            } else {
                if (this.f16886R.isRunning()) {
                    this.f16886R.cancel();
                }
                if (!this.f16889U || !z) {
                    this.f16888T = !this.f16888T;
                    if (isChecked()) {
                        setCheckedViewState(this.f16881M);
                    } else {
                        setUncheckViewState(this.f16881M);
                    }
                    postInvalidate();
                    if (z2) {
                        mo45911r();
                        return;
                    }
                    return;
                }
                this.f16885Q = 5;
                this.f16882N.mo45932b(this.f16881M);
                if (isChecked()) {
                    setUncheckViewState(this.f16883O);
                } else {
                    setCheckedViewState(this.f16883O);
                }
                this.f16886R.start();
            }
        }
    }

    public boolean isChecked() {
        return this.f16888T;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16880L.setStrokeWidth((float) this.f16914y);
        this.f16880L.setStyle(Paint.Style.FILL);
        this.f16880L.setColor(this.f16911v);
        Canvas canvas2 = canvas;
        mo45924y(canvas2, this.f16906q, this.f16907r, this.f16908s, this.f16909t, this.f16903n, this.f16880L);
        this.f16880L.setStyle(Paint.Style.STROKE);
        this.f16880L.setColor(this.f16912w);
        mo45924y(canvas2, this.f16906q, this.f16907r, this.f16908s, this.f16909t, this.f16903n, this.f16880L);
        if (this.f16891W) {
            mo45925z(canvas);
        }
        float f = this.f16881M.f16922d * 0.5f;
        this.f16880L.setStyle(Paint.Style.STROKE);
        this.f16880L.setColor(this.f16881M.f16920b);
        this.f16880L.setStrokeWidth(((float) this.f16914y) + (f * 2.0f));
        Canvas canvas3 = canvas;
        mo45924y(canvas3, this.f16906q + f, this.f16907r + f, this.f16908s - f, this.f16909t - f, this.f16903n, this.f16880L);
        this.f16880L.setStyle(Paint.Style.FILL);
        this.f16880L.setStrokeWidth(1.0f);
        float f2 = this.f16906q;
        float f3 = this.f16907r;
        float f4 = this.f16903n;
        mo45920u(canvas3, f2, f3, f2 + (f4 * 2.0f), f3 + (f4 * 2.0f), 90.0f, 180.0f, this.f16880L);
        float f5 = this.f16906q;
        float f6 = this.f16903n;
        float f7 = this.f16907r;
        canvas.drawRect(f5 + f6, f7, this.f16881M.f16919a, f7 + (f6 * 2.0f), this.f16880L);
        if (this.f16891W) {
            mo45922w(canvas);
        }
        mo45921v(canvas, this.f16881M.f16919a, this.f16910u);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(f16867i0, 1073741824);
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(f16868j0, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float max = (float) Math.max(this.f16896e + this.f16901l, this.f16914y);
        float f = ((float) i2) - max;
        float f2 = f - max;
        this.f16905p = f2;
        float f3 = ((float) i) - max;
        float f4 = f2 * 0.5f;
        this.f16903n = f4;
        this.f16904o = f4 - ((float) this.f16914y);
        this.f16906q = max;
        this.f16907r = max;
        this.f16908s = f3;
        this.f16909t = f;
        this.f16910u = (f + max) * 0.5f;
        this.f16877I = max + f4;
        this.f16878J = f3 - f4;
        if (isChecked()) {
            setCheckedViewState(this.f16881M);
        } else {
            setUncheckViewState(this.f16881M);
        }
        this.f16893b0 = true;
        postInvalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16892a0 = true;
            this.f16897e0 = System.currentTimeMillis();
            removeCallbacks(this.f16898f0);
            postDelayed(this.f16898f0, 100);
        } else if (actionMasked == 1) {
            this.f16892a0 = false;
            removeCallbacks(this.f16898f0);
            if (System.currentTimeMillis() - this.f16897e0 <= 300) {
                toggle();
            } else if (mo45898C()) {
                if (Math.max(0.0f, Math.min(1.0f, motionEvent.getX() / ((float) getWidth()))) > 0.5f) {
                    z = true;
                }
                if (z == isChecked()) {
                    mo45901K();
                } else {
                    this.f16888T = z;
                    mo45903M();
                }
            } else if (mo45900E()) {
                mo45901K();
            }
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            if (mo45900E()) {
                float max = Math.max(0.0f, Math.min(1.0f, x / ((float) getWidth())));
                C8803e eVar = this.f16881M;
                float f = this.f16877I;
                eVar.f16919a = f + ((this.f16878J - f) * max);
            } else if (mo45898C()) {
                float max2 = Math.max(0.0f, Math.min(1.0f, x / ((float) getWidth())));
                C8803e eVar2 = this.f16881M;
                float f2 = this.f16877I;
                eVar2.f16919a = f2 + ((this.f16878J - f2) * max2);
                eVar2.f16920b = ((Integer) this.f16887S.evaluate(max2, Integer.valueOf(this.f16912w), Integer.valueOf(this.f16913x))).intValue();
                postInvalidate();
            }
        } else if (actionMasked == 3) {
            this.f16892a0 = false;
            removeCallbacks(this.f16898f0);
            if (mo45900E() || mo45898C()) {
                mo45901K();
            }
        }
        return true;
    }

    /* renamed from: r */
    public final void mo45911r() {
        C8802d dVar = this.f16895d0;
        if (dVar != null) {
            this.f16894c0 = true;
            dVar.mo33010a(this, isChecked());
        }
        this.f16894c0 = false;
    }

    public void setChecked(boolean z) {
        if (z == isChecked()) {
            postInvalidate();
        } else {
            mo45905O(this.f16889U, false);
        }
    }

    public void setEnableEffect(boolean z) {
        this.f16889U = z;
    }

    public void setOnCheckedChangeListener(C8802d dVar) {
        this.f16895d0 = dVar;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(0, 0, 0, 0);
    }

    public void setShadowEffect(boolean z) {
        if (this.f16890V != z) {
            this.f16890V = z;
            if (z) {
                this.f16879K.setShadowLayer((float) this.f16896e, 0.0f, (float) this.f16901l, this.f16902m);
            } else {
                this.f16879K.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public void toggle() {
        mo45904N(true);
    }

    /* renamed from: u */
    public final void mo45920u(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, true, paint);
            return;
        }
        float f7 = f;
        float f8 = f2;
        this.f16884P.set(f, f2, f3, f4);
        canvas.drawArc(this.f16884P, f5, f6, true, paint);
    }

    /* renamed from: v */
    public final void mo45921v(Canvas canvas, float f, float f2) {
        canvas.drawCircle(f, f2, this.f16904o, this.f16879K);
        this.f16880L.setStyle(Paint.Style.STROKE);
        this.f16880L.setStrokeWidth(1.0f);
        this.f16880L.setColor(-2236963);
        canvas.drawCircle(f, f2, this.f16904o, this.f16880L);
    }

    /* renamed from: w */
    public void mo45922w(Canvas canvas) {
        int i = this.f16881M.f16921c;
        float f = (float) this.f16869A;
        float f2 = this.f16906q;
        float f3 = this.f16903n;
        float f4 = (f2 + f3) - this.f16875G;
        float f5 = this.f16910u;
        float f6 = this.f16870B;
        float f7 = f5 - f6;
        float f8 = (f2 + f3) - this.f16876H;
        mo45923x(canvas, i, f, f4, f7, f8, f5 + f6, this.f16880L);
    }

    /* renamed from: x */
    public void mo45923x(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        canvas.drawLine(f2, f3, f4, f5, paint);
    }

    /* renamed from: y */
    public final void mo45924y(Canvas canvas, float f, float f2, float f3, float f4, float f5, Paint paint) {
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
            return;
        }
        this.f16884P.set(f, f2, f3, f4);
        canvas.drawRoundRect(this.f16884P, f5, f5, paint);
    }

    /* renamed from: z */
    public final void mo45925z(Canvas canvas) {
        mo45896A(canvas, this.f16871C, (float) this.f16872D, this.f16908s - this.f16873E, this.f16910u, this.f16874F, this.f16880L);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo45897B(context, attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo45897B(context, attributeSet);
    }
}

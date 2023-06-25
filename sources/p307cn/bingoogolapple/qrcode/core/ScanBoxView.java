package p307cn.bingoogolapple.qrcode.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner.R$mipmap;
import com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner.R$styleable;
import p034b.p035a.p036a.p037a.C1328a;

/* renamed from: cn.bingoogolapple.qrcode.core.ScanBoxView */
public class ScanBoxView extends View {

    /* renamed from: A */
    public int f6804A;

    /* renamed from: B */
    public int f6805B;

    /* renamed from: C */
    public boolean f6806C;

    /* renamed from: D */
    public Drawable f6807D;

    /* renamed from: E */
    public Bitmap f6808E;

    /* renamed from: F */
    public int f6809F;

    /* renamed from: G */
    public int f6810G;

    /* renamed from: H */
    public int f6811H;

    /* renamed from: I */
    public float f6812I;

    /* renamed from: J */
    public int f6813J;

    /* renamed from: K */
    public int f6814K;

    /* renamed from: L */
    public boolean f6815L;

    /* renamed from: M */
    public String f6816M;

    /* renamed from: N */
    public String f6817N;

    /* renamed from: O */
    public String f6818O;

    /* renamed from: P */
    public int f6819P;

    /* renamed from: Q */
    public int f6820Q;

    /* renamed from: R */
    public boolean f6821R;

    /* renamed from: S */
    public int f6822S;

    /* renamed from: T */
    public boolean f6823T;

    /* renamed from: U */
    public int f6824U;

    /* renamed from: V */
    public boolean f6825V;

    /* renamed from: W */
    public boolean f6826W;

    /* renamed from: a0 */
    public boolean f6827a0;

    /* renamed from: b0 */
    public Drawable f6828b0;

    /* renamed from: c0 */
    public Bitmap f6829c0;

    /* renamed from: d0 */
    public float f6830d0;

    /* renamed from: e */
    public int f6831e;

    /* renamed from: e0 */
    public float f6832e0;

    /* renamed from: f0 */
    public Bitmap f6833f0;

    /* renamed from: g0 */
    public Bitmap f6834g0;

    /* renamed from: h0 */
    public Bitmap f6835h0;

    /* renamed from: i0 */
    public Bitmap f6836i0;

    /* renamed from: j0 */
    public float f6837j0;

    /* renamed from: k0 */
    public StaticLayout f6838k0;

    /* renamed from: l */
    public int f6839l;

    /* renamed from: l0 */
    public int f6840l0;

    /* renamed from: m */
    public Rect f6841m;

    /* renamed from: m0 */
    public boolean f6842m0;

    /* renamed from: n */
    public float f6843n;

    /* renamed from: n0 */
    public boolean f6844n0;

    /* renamed from: o */
    public float f6845o;

    /* renamed from: o0 */
    public boolean f6846o0;

    /* renamed from: p */
    public Paint f6847p;

    /* renamed from: p0 */
    public QRCodeView f6848p0;

    /* renamed from: q */
    public TextPaint f6849q;

    /* renamed from: r */
    public int f6850r = Color.parseColor("#33FFFFFF");

    /* renamed from: s */
    public int f6851s = -1;

    /* renamed from: t */
    public int f6852t;

    /* renamed from: u */
    public int f6853u;

    /* renamed from: v */
    public int f6854v;

    /* renamed from: w */
    public int f6855w;

    /* renamed from: x */
    public int f6856x;

    /* renamed from: y */
    public int f6857y;

    /* renamed from: z */
    public int f6858z;

    public ScanBoxView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f6847p = paint;
        paint.setAntiAlias(true);
        this.f6852t = C1328a.m173g(context, 20.0f);
        this.f6853u = C1328a.m173g(context, 3.0f);
        this.f6858z = C1328a.m173g(context, 1.0f);
        this.f6804A = -1;
        this.f6857y = C1328a.m173g(context, 90.0f);
        this.f6854v = C1328a.m173g(context, 200.0f);
        this.f6856x = C1328a.m173g(context, 140.0f);
        this.f6805B = 0;
        this.f6806C = false;
        this.f6807D = null;
        this.f6808E = null;
        this.f6809F = C1328a.m173g(context, 1.0f);
        this.f6810G = -1;
        this.f6811H = 1000;
        this.f6812I = -1.0f;
        this.f6813J = 1;
        this.f6814K = 0;
        this.f6815L = false;
        this.f6831e = C1328a.m173g(context, 2.0f);
        this.f6818O = null;
        this.f6819P = C1328a.m182p(context, 14.0f);
        this.f6820Q = -1;
        this.f6821R = false;
        this.f6822S = C1328a.m173g(context, 20.0f);
        this.f6823T = false;
        this.f6824U = Color.parseColor("#22000000");
        this.f6825V = false;
        this.f6826W = false;
        this.f6827a0 = false;
        TextPaint textPaint = new TextPaint();
        this.f6849q = textPaint;
        textPaint.setAntiAlias(true);
        this.f6840l0 = C1328a.m173g(context, 4.0f);
        this.f6842m0 = false;
        this.f6844n0 = false;
        this.f6846o0 = false;
    }

    /* renamed from: a */
    public final void mo21174a() {
        Drawable drawable = this.f6828b0;
        if (drawable != null) {
            this.f6835h0 = ((BitmapDrawable) drawable).getBitmap();
        }
        if (this.f6835h0 == null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R$mipmap.qrcode_default_grid_scan_line);
            this.f6835h0 = decodeResource;
            this.f6835h0 = C1328a.m180n(decodeResource, this.f6804A);
        }
        Bitmap a = C1328a.m167a(this.f6835h0, 90);
        this.f6836i0 = a;
        Bitmap a2 = C1328a.m167a(a, 90);
        this.f6836i0 = a2;
        this.f6836i0 = C1328a.m167a(a2, 90);
        Drawable drawable2 = this.f6807D;
        if (drawable2 != null) {
            this.f6833f0 = ((BitmapDrawable) drawable2).getBitmap();
        }
        if (this.f6833f0 == null) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R$mipmap.qrcode_default_scan_line);
            this.f6833f0 = decodeResource2;
            this.f6833f0 = C1328a.m180n(decodeResource2, this.f6804A);
        }
        this.f6834g0 = C1328a.m167a(this.f6833f0, 90);
        this.f6857y += this.f6814K;
        this.f6837j0 = (((float) this.f6853u) * 1.0f) / 2.0f;
        this.f6849q.setTextSize((float) this.f6819P);
        this.f6849q.setColor(this.f6820Q);
        setIsBarcode(this.f6815L);
    }

    /* renamed from: b */
    public final void mo21175b() {
        int width = (getWidth() - this.f6854v) / 2;
        int i = this.f6857y;
        Rect rect = new Rect(width, i, this.f6854v + width, this.f6855w + i);
        this.f6841m = rect;
        if (this.f6815L) {
            float f = ((float) rect.left) + this.f6837j0 + 0.5f;
            this.f6845o = f;
            this.f6832e0 = f;
        } else {
            float f2 = ((float) rect.top) + this.f6837j0 + 0.5f;
            this.f6843n = f2;
            this.f6830d0 = f2;
        }
        if (this.f6848p0 != null && mo21214l()) {
            this.f6848p0.mo21115m(new Rect(this.f6841m));
        }
    }

    /* renamed from: c */
    public final void mo21176c(Canvas canvas) {
        if (this.f6809F > 0) {
            this.f6847p.setStyle(Paint.Style.STROKE);
            this.f6847p.setColor(this.f6810G);
            this.f6847p.setStrokeWidth((float) this.f6809F);
            canvas.drawRect(this.f6841m, this.f6847p);
        }
    }

    /* renamed from: d */
    public final void mo21177d(Canvas canvas) {
        if (this.f6837j0 > 0.0f) {
            this.f6847p.setStyle(Paint.Style.STROKE);
            this.f6847p.setColor(this.f6851s);
            this.f6847p.setStrokeWidth((float) this.f6853u);
            int i = this.f6813J;
            if (i == 1) {
                Rect rect = this.f6841m;
                int i2 = rect.left;
                float f = this.f6837j0;
                int i3 = rect.top;
                canvas.drawLine(((float) i2) - f, (float) i3, (((float) i2) - f) + ((float) this.f6852t), (float) i3, this.f6847p);
                Rect rect2 = this.f6841m;
                int i4 = rect2.left;
                int i5 = rect2.top;
                float f2 = this.f6837j0;
                Canvas canvas2 = canvas;
                canvas2.drawLine((float) i4, ((float) i5) - f2, (float) i4, (((float) i5) - f2) + ((float) this.f6852t), this.f6847p);
                Rect rect3 = this.f6841m;
                int i6 = rect3.right;
                float f3 = this.f6837j0;
                int i7 = rect3.top;
                canvas.drawLine(((float) i6) + f3, (float) i7, (((float) i6) + f3) - ((float) this.f6852t), (float) i7, this.f6847p);
                Rect rect4 = this.f6841m;
                int i8 = rect4.right;
                int i9 = rect4.top;
                float f4 = this.f6837j0;
                Canvas canvas3 = canvas;
                canvas3.drawLine((float) i8, ((float) i9) - f4, (float) i8, (((float) i9) - f4) + ((float) this.f6852t), this.f6847p);
                Rect rect5 = this.f6841m;
                int i10 = rect5.left;
                float f5 = this.f6837j0;
                int i11 = rect5.bottom;
                canvas.drawLine(((float) i10) - f5, (float) i11, (((float) i10) - f5) + ((float) this.f6852t), (float) i11, this.f6847p);
                Rect rect6 = this.f6841m;
                int i12 = rect6.left;
                int i13 = rect6.bottom;
                float f6 = this.f6837j0;
                Canvas canvas4 = canvas;
                canvas4.drawLine((float) i12, ((float) i13) + f6, (float) i12, (((float) i13) + f6) - ((float) this.f6852t), this.f6847p);
                Rect rect7 = this.f6841m;
                int i14 = rect7.right;
                float f7 = this.f6837j0;
                int i15 = rect7.bottom;
                canvas.drawLine(((float) i14) + f7, (float) i15, (((float) i14) + f7) - ((float) this.f6852t), (float) i15, this.f6847p);
                Rect rect8 = this.f6841m;
                int i16 = rect8.right;
                int i17 = rect8.bottom;
                float f8 = this.f6837j0;
                Canvas canvas5 = canvas;
                canvas5.drawLine((float) i16, ((float) i17) + f8, (float) i16, (((float) i17) + f8) - ((float) this.f6852t), this.f6847p);
            } else if (i == 2) {
                Rect rect9 = this.f6841m;
                int i18 = rect9.left;
                int i19 = rect9.top;
                float f9 = this.f6837j0;
                Canvas canvas6 = canvas;
                canvas6.drawLine((float) i18, ((float) i19) + f9, (float) (i18 + this.f6852t), ((float) i19) + f9, this.f6847p);
                Rect rect10 = this.f6841m;
                int i20 = rect10.left;
                float f10 = this.f6837j0;
                int i21 = rect10.top;
                canvas.drawLine(((float) i20) + f10, (float) i21, ((float) i20) + f10, (float) (i21 + this.f6852t), this.f6847p);
                Rect rect11 = this.f6841m;
                int i22 = rect11.right;
                int i23 = rect11.top;
                float f11 = this.f6837j0;
                Canvas canvas7 = canvas;
                canvas7.drawLine((float) i22, ((float) i23) + f11, (float) (i22 - this.f6852t), ((float) i23) + f11, this.f6847p);
                Rect rect12 = this.f6841m;
                int i24 = rect12.right;
                float f12 = this.f6837j0;
                int i25 = rect12.top;
                canvas.drawLine(((float) i24) - f12, (float) i25, ((float) i24) - f12, (float) (i25 + this.f6852t), this.f6847p);
                Rect rect13 = this.f6841m;
                int i26 = rect13.left;
                int i27 = rect13.bottom;
                float f13 = this.f6837j0;
                Canvas canvas8 = canvas;
                canvas8.drawLine((float) i26, ((float) i27) - f13, (float) (i26 + this.f6852t), ((float) i27) - f13, this.f6847p);
                Rect rect14 = this.f6841m;
                int i28 = rect14.left;
                float f14 = this.f6837j0;
                int i29 = rect14.bottom;
                canvas.drawLine(((float) i28) + f14, (float) i29, ((float) i28) + f14, (float) (i29 - this.f6852t), this.f6847p);
                Rect rect15 = this.f6841m;
                int i30 = rect15.right;
                int i31 = rect15.bottom;
                float f15 = this.f6837j0;
                Canvas canvas9 = canvas;
                canvas9.drawLine((float) i30, ((float) i31) - f15, (float) (i30 - this.f6852t), ((float) i31) - f15, this.f6847p);
                Rect rect16 = this.f6841m;
                int i32 = rect16.right;
                float f16 = this.f6837j0;
                int i33 = rect16.bottom;
                canvas.drawLine(((float) i32) - f16, (float) i33, ((float) i32) - f16, (float) (i33 - this.f6852t), this.f6847p);
            }
        }
    }

    /* renamed from: e */
    public final void mo21178e(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.f6850r != 0) {
            this.f6847p.setStyle(Paint.Style.FILL);
            this.f6847p.setColor(this.f6850r);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) this.f6841m.top, this.f6847p);
            Rect rect = this.f6841m;
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f6847p);
            Rect rect2 = this.f6841m;
            Canvas canvas2 = canvas;
            float f2 = f;
            canvas2.drawRect((float) (rect2.right + 1), (float) rect2.top, f2, (float) (rect2.bottom + 1), this.f6847p);
            canvas2.drawRect(0.0f, (float) (this.f6841m.bottom + 1), f2, (float) height, this.f6847p);
        }
    }

    /* renamed from: f */
    public final void mo21179f(Canvas canvas) {
        if (this.f6815L) {
            if (this.f6829c0 != null) {
                Rect rect = this.f6841m;
                float f = this.f6837j0;
                int i = this.f6805B;
                RectF rectF = new RectF(((float) rect.left) + f + 0.5f, ((float) rect.top) + f + ((float) i), this.f6832e0, (((float) rect.bottom) - f) - ((float) i));
                Rect rect2 = new Rect((int) (((float) this.f6829c0.getWidth()) - rectF.width()), 0, this.f6829c0.getWidth(), this.f6829c0.getHeight());
                if (rect2.left < 0) {
                    rect2.left = 0;
                    rectF.left = rectF.right - ((float) rect2.width());
                }
                canvas.drawBitmap(this.f6829c0, rect2, rectF, this.f6847p);
            } else if (this.f6808E != null) {
                float f2 = this.f6845o;
                canvas.drawBitmap(this.f6808E, (Rect) null, new RectF(f2, ((float) this.f6841m.top) + this.f6837j0 + ((float) this.f6805B), ((float) this.f6808E.getWidth()) + f2, (((float) this.f6841m.bottom) - this.f6837j0) - ((float) this.f6805B)), this.f6847p);
            } else {
                this.f6847p.setStyle(Paint.Style.FILL);
                this.f6847p.setColor(this.f6804A);
                float f3 = this.f6845o;
                Rect rect3 = this.f6841m;
                float f4 = this.f6837j0;
                int i2 = this.f6805B;
                float f5 = ((float) rect3.top) + f4 + ((float) i2);
                canvas.drawRect(f3, f5, ((float) this.f6858z) + f3, (((float) rect3.bottom) - f4) - ((float) i2), this.f6847p);
            }
        } else if (this.f6829c0 != null) {
            Rect rect4 = this.f6841m;
            float f6 = this.f6837j0;
            int i3 = this.f6805B;
            RectF rectF2 = new RectF(((float) rect4.left) + f6 + ((float) i3), ((float) rect4.top) + f6 + 0.5f, (((float) rect4.right) - f6) - ((float) i3), this.f6830d0);
            Rect rect5 = new Rect(0, (int) (((float) this.f6829c0.getHeight()) - rectF2.height()), this.f6829c0.getWidth(), this.f6829c0.getHeight());
            if (rect5.top < 0) {
                rect5.top = 0;
                rectF2.top = rectF2.bottom - ((float) rect5.height());
            }
            canvas.drawBitmap(this.f6829c0, rect5, rectF2, this.f6847p);
        } else if (this.f6808E != null) {
            Rect rect6 = this.f6841m;
            float f7 = this.f6837j0;
            int i4 = this.f6805B;
            float f8 = ((float) rect6.left) + f7 + ((float) i4);
            float f9 = this.f6843n;
            canvas.drawBitmap(this.f6808E, (Rect) null, new RectF(f8, f9, (((float) rect6.right) - f7) - ((float) i4), ((float) this.f6808E.getHeight()) + f9), this.f6847p);
        } else {
            this.f6847p.setStyle(Paint.Style.FILL);
            this.f6847p.setColor(this.f6804A);
            Rect rect7 = this.f6841m;
            float f10 = this.f6837j0;
            int i5 = this.f6805B;
            float f11 = this.f6843n;
            canvas.drawRect(((float) rect7.left) + f10 + ((float) i5), f11, (((float) rect7.right) - f10) - ((float) i5), f11 + ((float) this.f6858z), this.f6847p);
        }
    }

    /* renamed from: g */
    public final void mo21180g(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f6818O) && this.f6838k0 != null) {
            if (this.f6821R) {
                if (this.f6825V) {
                    this.f6847p.setColor(this.f6824U);
                    this.f6847p.setStyle(Paint.Style.FILL);
                    if (this.f6823T) {
                        Rect rect = new Rect();
                        TextPaint textPaint = this.f6849q;
                        String str = this.f6818O;
                        textPaint.getTextBounds(str, 0, str.length(), rect);
                        float width = (float) (((canvas.getWidth() - rect.width()) / 2) - this.f6840l0);
                        RectF rectF = new RectF(width, (float) ((this.f6841m.bottom + this.f6822S) - this.f6840l0), ((float) rect.width()) + width + ((float) (this.f6840l0 * 2)), (float) (this.f6841m.bottom + this.f6822S + this.f6838k0.getHeight() + this.f6840l0));
                        int i = this.f6840l0;
                        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f6847p);
                    } else {
                        Rect rect2 = this.f6841m;
                        int i2 = rect2.bottom;
                        int i3 = this.f6822S;
                        RectF rectF2 = new RectF((float) rect2.left, (float) ((i2 + i3) - this.f6840l0), (float) rect2.right, (float) (i2 + i3 + this.f6838k0.getHeight() + this.f6840l0));
                        int i4 = this.f6840l0;
                        canvas.drawRoundRect(rectF2, (float) i4, (float) i4, this.f6847p);
                    }
                }
                canvas.save();
                if (this.f6823T) {
                    canvas.translate(0.0f, (float) (this.f6841m.bottom + this.f6822S));
                } else {
                    Rect rect3 = this.f6841m;
                    canvas.translate((float) (rect3.left + this.f6840l0), (float) (rect3.bottom + this.f6822S));
                }
                this.f6838k0.draw(canvas);
                canvas.restore();
                return;
            }
            if (this.f6825V) {
                this.f6847p.setColor(this.f6824U);
                this.f6847p.setStyle(Paint.Style.FILL);
                if (this.f6823T) {
                    Rect rect4 = new Rect();
                    TextPaint textPaint2 = this.f6849q;
                    String str2 = this.f6818O;
                    textPaint2.getTextBounds(str2, 0, str2.length(), rect4);
                    float width2 = (float) (((canvas.getWidth() - rect4.width()) / 2) - this.f6840l0);
                    int i5 = this.f6840l0;
                    RectF rectF3 = new RectF(width2, (float) (((this.f6841m.top - this.f6822S) - this.f6838k0.getHeight()) - this.f6840l0), ((float) rect4.width()) + width2 + ((float) (i5 * 2)), (float) ((this.f6841m.top - this.f6822S) + i5));
                    int i6 = this.f6840l0;
                    canvas.drawRoundRect(rectF3, (float) i6, (float) i6, this.f6847p);
                } else {
                    Rect rect5 = this.f6841m;
                    int height = (rect5.top - this.f6822S) - this.f6838k0.getHeight();
                    int i7 = this.f6840l0;
                    Rect rect6 = this.f6841m;
                    RectF rectF4 = new RectF((float) rect5.left, (float) (height - i7), (float) rect6.right, (float) ((rect6.top - this.f6822S) + i7));
                    int i8 = this.f6840l0;
                    canvas.drawRoundRect(rectF4, (float) i8, (float) i8, this.f6847p);
                }
            }
            canvas.save();
            if (this.f6823T) {
                canvas.translate(0.0f, (float) ((this.f6841m.top - this.f6822S) - this.f6838k0.getHeight()));
            } else {
                Rect rect7 = this.f6841m;
                canvas.translate((float) (rect7.left + this.f6840l0), (float) ((rect7.top - this.f6822S) - this.f6838k0.getHeight()));
            }
            this.f6838k0.draw(canvas);
            canvas.restore();
        }
    }

    public int getAnimTime() {
        return this.f6811H;
    }

    public String getBarCodeTipText() {
        return this.f6817N;
    }

    public int getBarcodeRectHeight() {
        return this.f6856x;
    }

    public int getBorderColor() {
        return this.f6810G;
    }

    public int getBorderSize() {
        return this.f6809F;
    }

    public int getCornerColor() {
        return this.f6851s;
    }

    public int getCornerLength() {
        return this.f6852t;
    }

    public int getCornerSize() {
        return this.f6853u;
    }

    public Drawable getCustomScanLineDrawable() {
        return this.f6807D;
    }

    public float getHalfCornerSize() {
        return this.f6837j0;
    }

    public boolean getIsBarcode() {
        return this.f6815L;
    }

    public int getMaskColor() {
        return this.f6850r;
    }

    public String getQRCodeTipText() {
        return this.f6816M;
    }

    public int getRectHeight() {
        return this.f6855w;
    }

    public int getRectWidth() {
        return this.f6854v;
    }

    public Bitmap getScanLineBitmap() {
        return this.f6808E;
    }

    public int getScanLineColor() {
        return this.f6804A;
    }

    public int getScanLineMargin() {
        return this.f6805B;
    }

    public int getScanLineSize() {
        return this.f6858z;
    }

    public int getTipBackgroundColor() {
        return this.f6824U;
    }

    public int getTipBackgroundRadius() {
        return this.f6840l0;
    }

    public String getTipText() {
        return this.f6818O;
    }

    public int getTipTextColor() {
        return this.f6820Q;
    }

    public int getTipTextMargin() {
        return this.f6822S;
    }

    public int getTipTextSize() {
        return this.f6819P;
    }

    public StaticLayout getTipTextSl() {
        return this.f6838k0;
    }

    public int getToolbarHeight() {
        return this.f6814K;
    }

    public int getTopOffset() {
        return this.f6857y;
    }

    public float getVerticalBias() {
        return this.f6812I;
    }

    /* renamed from: h */
    public Rect mo21210h(int i) {
        if (!this.f6842m0 || getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect(this.f6841m);
        float measuredHeight = (((float) i) * 1.0f) / ((float) getMeasuredHeight());
        float exactCenterX = rect.exactCenterX() * measuredHeight;
        float exactCenterY = rect.exactCenterY() * measuredHeight;
        float width = (((float) rect.width()) / 2.0f) * measuredHeight;
        float height = (((float) rect.height()) / 2.0f) * measuredHeight;
        rect.left = (int) (exactCenterX - width);
        rect.right = (int) (exactCenterX + width);
        rect.top = (int) (exactCenterY - height);
        rect.bottom = (int) (exactCenterY + height);
        return rect;
    }

    /* renamed from: i */
    public void mo21211i(QRCodeView qRCodeView, AttributeSet attributeSet) {
        this.f6848p0 = qRCodeView;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.QRCodeView);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            mo21212j(obtainStyledAttributes.getIndex(i), obtainStyledAttributes);
        }
        obtainStyledAttributes.recycle();
        mo21174a();
    }

    /* renamed from: j */
    public final void mo21212j(int i, TypedArray typedArray) {
        if (i == R$styleable.QRCodeView_qrcv_topOffset) {
            this.f6857y = typedArray.getDimensionPixelSize(i, this.f6857y);
        } else if (i == R$styleable.QRCodeView_qrcv_cornerSize) {
            this.f6853u = typedArray.getDimensionPixelSize(i, this.f6853u);
        } else if (i == R$styleable.QRCodeView_qrcv_cornerLength) {
            this.f6852t = typedArray.getDimensionPixelSize(i, this.f6852t);
        } else if (i == R$styleable.QRCodeView_qrcv_scanLineSize) {
            this.f6858z = typedArray.getDimensionPixelSize(i, this.f6858z);
        } else if (i == R$styleable.QRCodeView_qrcv_rectWidth) {
            this.f6854v = typedArray.getDimensionPixelSize(i, this.f6854v);
        } else if (i == R$styleable.QRCodeView_qrcv_maskColor) {
            this.f6850r = typedArray.getColor(i, this.f6850r);
        } else if (i == R$styleable.QRCodeView_qrcv_cornerColor) {
            this.f6851s = typedArray.getColor(i, this.f6851s);
        } else if (i == R$styleable.QRCodeView_qrcv_scanLineColor) {
            this.f6804A = typedArray.getColor(i, this.f6804A);
        } else if (i == R$styleable.QRCodeView_qrcv_scanLineMargin) {
            this.f6805B = typedArray.getDimensionPixelSize(i, this.f6805B);
        } else if (i == R$styleable.QRCodeView_qrcv_isShowDefaultScanLineDrawable) {
            this.f6806C = typedArray.getBoolean(i, this.f6806C);
        } else if (i == R$styleable.QRCodeView_qrcv_customScanLineDrawable) {
            this.f6807D = typedArray.getDrawable(i);
        } else if (i == R$styleable.QRCodeView_qrcv_borderSize) {
            this.f6809F = typedArray.getDimensionPixelSize(i, this.f6809F);
        } else if (i == R$styleable.QRCodeView_qrcv_borderColor) {
            this.f6810G = typedArray.getColor(i, this.f6810G);
        } else if (i == R$styleable.QRCodeView_qrcv_animTime) {
            this.f6811H = typedArray.getInteger(i, this.f6811H);
        } else if (i == R$styleable.QRCodeView_qrcv_verticalBias) {
            this.f6812I = typedArray.getFloat(i, this.f6812I);
        } else if (i == R$styleable.QRCodeView_qrcv_cornerDisplayType) {
            this.f6813J = typedArray.getInteger(i, this.f6813J);
        } else if (i == R$styleable.QRCodeView_qrcv_toolbarHeight) {
            this.f6814K = typedArray.getDimensionPixelSize(i, this.f6814K);
        } else if (i == R$styleable.QRCodeView_qrcv_barcodeRectHeight) {
            this.f6856x = typedArray.getDimensionPixelSize(i, this.f6856x);
        } else if (i == R$styleable.QRCodeView_qrcv_isBarcode) {
            this.f6815L = typedArray.getBoolean(i, this.f6815L);
        } else if (i == R$styleable.QRCodeView_qrcv_barCodeTipText) {
            this.f6817N = typedArray.getString(i);
        } else if (i == R$styleable.QRCodeView_qrcv_qrCodeTipText) {
            this.f6816M = typedArray.getString(i);
        } else if (i == R$styleable.QRCodeView_qrcv_tipTextSize) {
            this.f6819P = typedArray.getDimensionPixelSize(i, this.f6819P);
        } else if (i == R$styleable.QRCodeView_qrcv_tipTextColor) {
            this.f6820Q = typedArray.getColor(i, this.f6820Q);
        } else if (i == R$styleable.QRCodeView_qrcv_isTipTextBelowRect) {
            this.f6821R = typedArray.getBoolean(i, this.f6821R);
        } else if (i == R$styleable.QRCodeView_qrcv_tipTextMargin) {
            this.f6822S = typedArray.getDimensionPixelSize(i, this.f6822S);
        } else if (i == R$styleable.QRCodeView_qrcv_isShowTipTextAsSingleLine) {
            this.f6823T = typedArray.getBoolean(i, this.f6823T);
        } else if (i == R$styleable.QRCodeView_qrcv_isShowTipBackground) {
            this.f6825V = typedArray.getBoolean(i, this.f6825V);
        } else if (i == R$styleable.QRCodeView_qrcv_tipBackgroundColor) {
            this.f6824U = typedArray.getColor(i, this.f6824U);
        } else if (i == R$styleable.QRCodeView_qrcv_isScanLineReverse) {
            this.f6826W = typedArray.getBoolean(i, this.f6826W);
        } else if (i == R$styleable.QRCodeView_qrcv_isShowDefaultGridScanLineDrawable) {
            this.f6827a0 = typedArray.getBoolean(i, this.f6827a0);
        } else if (i == R$styleable.QRCodeView_qrcv_customGridScanLineDrawable) {
            this.f6828b0 = typedArray.getDrawable(i);
        } else if (i == R$styleable.QRCodeView_qrcv_isOnlyDecodeScanBoxArea) {
            this.f6842m0 = typedArray.getBoolean(i, this.f6842m0);
        } else if (i == R$styleable.QRCodeView_qrcv_isShowLocationPoint) {
            this.f6844n0 = typedArray.getBoolean(i, this.f6844n0);
        } else if (i == R$styleable.QRCodeView_qrcv_isAutoZoom) {
            this.f6846o0 = typedArray.getBoolean(i, this.f6846o0);
        }
    }

    /* renamed from: k */
    public boolean mo21213k() {
        return this.f6846o0;
    }

    /* renamed from: l */
    public boolean mo21214l() {
        return this.f6842m0;
    }

    /* renamed from: m */
    public boolean mo21215m() {
        return this.f6844n0;
    }

    /* renamed from: n */
    public final void mo21216n() {
        if (this.f6815L) {
            if (this.f6829c0 == null) {
                this.f6845o += (float) this.f6831e;
                int i = this.f6858z;
                Bitmap bitmap = this.f6808E;
                if (bitmap != null) {
                    i = bitmap.getWidth();
                }
                if (this.f6826W) {
                    float f = this.f6845o;
                    Rect rect = this.f6841m;
                    float f2 = this.f6837j0;
                    if (((float) i) + f > ((float) rect.right) - f2 || f < ((float) rect.left) + f2) {
                        this.f6831e = -this.f6831e;
                    }
                } else {
                    float f3 = this.f6845o + ((float) i);
                    Rect rect2 = this.f6841m;
                    float f4 = this.f6837j0;
                    if (f3 > ((float) rect2.right) - f4) {
                        this.f6845o = ((float) rect2.left) + f4 + 0.5f;
                    }
                }
            } else {
                float f5 = this.f6832e0 + ((float) this.f6831e);
                this.f6832e0 = f5;
                Rect rect3 = this.f6841m;
                float f6 = this.f6837j0;
                if (f5 > ((float) rect3.right) - f6) {
                    this.f6832e0 = ((float) rect3.left) + f6 + 0.5f;
                }
            }
        } else if (this.f6829c0 == null) {
            this.f6843n += (float) this.f6831e;
            int i2 = this.f6858z;
            Bitmap bitmap2 = this.f6808E;
            if (bitmap2 != null) {
                i2 = bitmap2.getHeight();
            }
            if (this.f6826W) {
                float f7 = this.f6843n;
                Rect rect4 = this.f6841m;
                float f8 = this.f6837j0;
                if (((float) i2) + f7 > ((float) rect4.bottom) - f8 || f7 < ((float) rect4.top) + f8) {
                    this.f6831e = -this.f6831e;
                }
            } else {
                float f9 = this.f6843n + ((float) i2);
                Rect rect5 = this.f6841m;
                float f10 = this.f6837j0;
                if (f9 > ((float) rect5.bottom) - f10) {
                    this.f6843n = ((float) rect5.top) + f10 + 0.5f;
                }
            }
        } else {
            float f11 = this.f6830d0 + ((float) this.f6831e);
            this.f6830d0 = f11;
            Rect rect6 = this.f6841m;
            float f12 = this.f6837j0;
            if (f11 > ((float) rect6.bottom) - f12) {
                this.f6830d0 = ((float) rect6.top) + f12 + 0.5f;
            }
        }
        long j = (long) this.f6839l;
        Rect rect7 = this.f6841m;
        postInvalidateDelayed(j, rect7.left, rect7.top, rect7.right, rect7.bottom);
    }

    /* renamed from: o */
    public final void mo21217o() {
        if (this.f6828b0 != null || this.f6827a0) {
            if (this.f6815L) {
                this.f6829c0 = this.f6836i0;
            } else {
                this.f6829c0 = this.f6835h0;
            }
        } else if (this.f6807D != null || this.f6806C) {
            if (this.f6815L) {
                this.f6808E = this.f6834g0;
            } else {
                this.f6808E = this.f6833f0;
            }
        }
        if (this.f6815L) {
            this.f6818O = this.f6817N;
            this.f6855w = this.f6856x;
            this.f6839l = (int) (((((float) this.f6811H) * 1.0f) * ((float) this.f6831e)) / ((float) this.f6854v));
        } else {
            this.f6818O = this.f6816M;
            int i = this.f6854v;
            this.f6855w = i;
            this.f6839l = (int) (((((float) this.f6811H) * 1.0f) * ((float) this.f6831e)) / ((float) i));
        }
        if (!TextUtils.isEmpty(this.f6818O)) {
            if (this.f6823T) {
                this.f6838k0 = new StaticLayout(this.f6818O, this.f6849q, C1328a.m176j(getContext()).x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            } else {
                this.f6838k0 = new StaticLayout(this.f6818O, this.f6849q, this.f6854v - (this.f6840l0 * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            }
        }
        if (this.f6812I != -1.0f) {
            int k = C1328a.m176j(getContext()).y - C1328a.m177k(getContext());
            int i2 = this.f6814K;
            if (i2 == 0) {
                this.f6857y = (int) ((((float) k) * this.f6812I) - ((float) (this.f6855w / 2)));
            } else {
                this.f6857y = i2 + ((int) ((((float) (k - i2)) * this.f6812I) - ((float) (this.f6855w / 2))));
            }
        }
        mo21175b();
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        if (this.f6841m != null) {
            mo21178e(canvas);
            mo21176c(canvas);
            mo21177d(canvas);
            mo21179f(canvas);
            mo21180g(canvas);
            mo21216n();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo21175b();
    }

    public void setAnimTime(int i) {
        this.f6811H = i;
        mo21217o();
    }

    public void setAutoZoom(boolean z) {
        this.f6846o0 = z;
    }

    public void setBarCodeTipText(String str) {
        this.f6817N = str;
        mo21217o();
    }

    public void setBarcodeRectHeight(int i) {
        this.f6856x = i;
        mo21217o();
    }

    public void setBorderColor(int i) {
        this.f6810G = i;
        mo21217o();
    }

    public void setBorderSize(int i) {
        this.f6809F = i;
        mo21217o();
    }

    public void setCornerColor(int i) {
        this.f6851s = i;
        mo21217o();
    }

    public void setCornerLength(int i) {
        this.f6852t = i;
        mo21217o();
    }

    public void setCornerSize(int i) {
        this.f6853u = i;
        mo21217o();
    }

    public void setCustomScanLineDrawable(Drawable drawable) {
        this.f6807D = drawable;
        mo21217o();
    }

    public void setHalfCornerSize(float f) {
        this.f6837j0 = f;
        mo21217o();
    }

    public void setIsBarcode(boolean z) {
        this.f6815L = z;
        mo21217o();
    }

    public void setMaskColor(int i) {
        this.f6850r = i;
        mo21217o();
    }

    public void setOnlyDecodeScanBoxArea(boolean z) {
        this.f6842m0 = z;
        mo21175b();
    }

    public void setQRCodeTipText(String str) {
        this.f6816M = str;
        mo21217o();
    }

    public void setRectHeight(int i) {
        this.f6855w = i;
        mo21217o();
    }

    public void setRectWidth(int i) {
        this.f6854v = i;
        mo21217o();
    }

    public void setScanLineBitmap(Bitmap bitmap) {
        this.f6808E = bitmap;
        mo21217o();
    }

    public void setScanLineColor(int i) {
        this.f6804A = i;
        mo21217o();
    }

    public void setScanLineMargin(int i) {
        this.f6805B = i;
        mo21217o();
    }

    public void setScanLineReverse(boolean z) {
        this.f6826W = z;
        mo21217o();
    }

    public void setScanLineSize(int i) {
        this.f6858z = i;
        mo21217o();
    }

    public void setShowDefaultGridScanLineDrawable(boolean z) {
        this.f6827a0 = z;
        mo21217o();
    }

    public void setShowDefaultScanLineDrawable(boolean z) {
        this.f6806C = z;
        mo21217o();
    }

    public void setShowLocationPoint(boolean z) {
        this.f6844n0 = z;
    }

    public void setShowTipBackground(boolean z) {
        this.f6825V = z;
        mo21217o();
    }

    public void setShowTipTextAsSingleLine(boolean z) {
        this.f6823T = z;
        mo21217o();
    }

    public void setTipBackgroundColor(int i) {
        this.f6824U = i;
        mo21217o();
    }

    public void setTipBackgroundRadius(int i) {
        this.f6840l0 = i;
        mo21217o();
    }

    public void setTipText(String str) {
        if (this.f6815L) {
            this.f6817N = str;
        } else {
            this.f6816M = str;
        }
        mo21217o();
    }

    public void setTipTextBelowRect(boolean z) {
        this.f6821R = z;
        mo21217o();
    }

    public void setTipTextColor(int i) {
        this.f6820Q = i;
        this.f6849q.setColor(i);
        mo21217o();
    }

    public void setTipTextMargin(int i) {
        this.f6822S = i;
        mo21217o();
    }

    public void setTipTextSize(int i) {
        this.f6819P = i;
        this.f6849q.setTextSize((float) i);
        mo21217o();
    }

    public void setTipTextSl(StaticLayout staticLayout) {
        this.f6838k0 = staticLayout;
        mo21217o();
    }

    public void setToolbarHeight(int i) {
        this.f6814K = i;
        mo21217o();
    }

    public void setTopOffset(int i) {
        this.f6857y = i;
        mo21217o();
    }

    public void setVerticalBias(float f) {
        this.f6812I = f;
        mo21217o();
    }
}

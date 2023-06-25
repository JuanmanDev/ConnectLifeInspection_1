package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p175p.p176a.p177a.C2208a;
import p040c.p175p.p176a.p177a.C2212b;
import p040c.p175p.p176a.p177a.C2214c;
import p040c.p175p.p176a.p177a.C2215d;
import p040c.p175p.p176a.p177a.C2216e;
import p040c.p175p.p176a.p177a.C2221f;
import p040c.p175p.p176a.p177a.C2222g;
import p040c.p175p.p176a.p177a.p178h.C2226a;
import p040c.p175p.p176a.p177a.p178h.C2227b;
import p040c.p175p.p176a.p177a.p179i.C2228a;
import p040c.p175p.p176a.p177a.p179i.C2229b;
import p040c.p175p.p176a.p177a.p179i.C2230c;
import p040c.p175p.p176a.p177a.p179i.C2231d;
import p040c.p175p.p176a.p177a.p179i.C2232e;
import p040c.p175p.p176a.p177a.p179i.C2233f;
import p040c.p175p.p176a.p177a.p179i.C2234g;
import p040c.p175p.p176a.p177a.p179i.C2235h;
import p040c.p175p.p176a.p177a.p179i.C2236i;
import p040c.p175p.p176a.p177a.p179i.C2237j;
import p040c.p175p.p176a.p177a.p180j.C2239b;
import p040c.p175p.p176a.p177a.p181k.C2240a;
import p040c.p175p.p176a.p177a.p182l.C2241a;
import p040c.p175p.p176a.p177a.p182l.C2242b;
import p040c.p175p.p176a.p177a.p183m.C2243a;
import p040c.p175p.p176a.p177a.p183m.C2246b;
import p040c.p175p.p176a.p177a.p183m.C2249d;

public class PDFView extends RelativeLayout {

    /* renamed from: d0 */
    public static final String f7269d0 = PDFView.class.getSimpleName();

    /* renamed from: A */
    public C2216e f7270A;

    /* renamed from: B */
    public C2228a f7271B;

    /* renamed from: C */
    public Paint f7272C;

    /* renamed from: D */
    public Paint f7273D;

    /* renamed from: E */
    public FitPolicy f7274E;

    /* renamed from: F */
    public boolean f7275F;

    /* renamed from: G */
    public int f7276G;

    /* renamed from: H */
    public boolean f7277H;

    /* renamed from: I */
    public boolean f7278I;

    /* renamed from: J */
    public boolean f7279J;

    /* renamed from: K */
    public boolean f7280K;

    /* renamed from: L */
    public boolean f7281L;

    /* renamed from: M */
    public PdfiumCore f7282M;

    /* renamed from: N */
    public C2240a f7283N;

    /* renamed from: O */
    public boolean f7284O;

    /* renamed from: P */
    public boolean f7285P;

    /* renamed from: Q */
    public boolean f7286Q;

    /* renamed from: R */
    public boolean f7287R;

    /* renamed from: S */
    public boolean f7288S;

    /* renamed from: T */
    public PaintFlagsDrawFilter f7289T;

    /* renamed from: U */
    public int f7290U;

    /* renamed from: V */
    public boolean f7291V;

    /* renamed from: W */
    public boolean f7292W;

    /* renamed from: a0 */
    public List<Integer> f7293a0;

    /* renamed from: b0 */
    public boolean f7294b0;

    /* renamed from: c0 */
    public C3980b f7295c0;

    /* renamed from: e */
    public float f7296e = 1.0f;

    /* renamed from: l */
    public float f7297l = 1.75f;

    /* renamed from: m */
    public float f7298m = 3.0f;

    /* renamed from: n */
    public C2212b f7299n;

    /* renamed from: o */
    public C2208a f7300o;

    /* renamed from: p */
    public C2215d f7301p;

    /* renamed from: q */
    public C2221f f7302q;

    /* renamed from: r */
    public int f7303r;

    /* renamed from: s */
    public float f7304s;

    /* renamed from: t */
    public float f7305t;

    /* renamed from: u */
    public float f7306u;

    /* renamed from: v */
    public boolean f7307v;

    /* renamed from: w */
    public C3982d f7308w;

    /* renamed from: x */
    public C2214c f7309x;

    /* renamed from: y */
    public HandlerThread f7310y;

    /* renamed from: z */
    public C2222g f7311z;

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$b */
    public class C3980b {

        /* renamed from: A */
        public boolean f7312A;

        /* renamed from: B */
        public boolean f7313B;

        /* renamed from: a */
        public final C2241a f7315a;

        /* renamed from: b */
        public int[] f7316b;

        /* renamed from: c */
        public boolean f7317c;

        /* renamed from: d */
        public boolean f7318d;

        /* renamed from: e */
        public C2229b f7319e;

        /* renamed from: f */
        public C2229b f7320f;

        /* renamed from: g */
        public C2231d f7321g;

        /* renamed from: h */
        public C2230c f7322h;

        /* renamed from: i */
        public C2233f f7323i;

        /* renamed from: j */
        public C2235h f7324j;

        /* renamed from: k */
        public C2236i f7325k;

        /* renamed from: l */
        public C2237j f7326l;

        /* renamed from: m */
        public C2232e f7327m;

        /* renamed from: n */
        public C2234g f7328n;

        /* renamed from: o */
        public C2227b f7329o;

        /* renamed from: p */
        public int f7330p;

        /* renamed from: q */
        public boolean f7331q;

        /* renamed from: r */
        public boolean f7332r;

        /* renamed from: s */
        public String f7333s;

        /* renamed from: t */
        public C2240a f7334t;

        /* renamed from: u */
        public boolean f7335u;

        /* renamed from: v */
        public int f7336v;

        /* renamed from: w */
        public boolean f7337w;

        /* renamed from: x */
        public FitPolicy f7338x;

        /* renamed from: y */
        public boolean f7339y;

        /* renamed from: z */
        public boolean f7340z;

        /* renamed from: a */
        public C3980b mo23567a(int i) {
            this.f7330p = i;
            return this;
        }

        /* renamed from: b */
        public C3980b mo23568b(boolean z) {
            this.f7318d = z;
            return this;
        }

        /* renamed from: c */
        public C3980b mo23569c(boolean z) {
            this.f7317c = z;
            return this;
        }

        /* renamed from: d */
        public void mo23570d() {
            if (!PDFView.this.f7294b0) {
                C3980b unused = PDFView.this.f7295c0 = this;
                return;
            }
            PDFView.this.mo23511T();
            PDFView.this.f7271B.setOnLoadComplete(this.f7321g);
            PDFView.this.f7271B.setOnError(this.f7322h);
            PDFView.this.f7271B.setOnDraw(this.f7319e);
            PDFView.this.f7271B.setOnDrawAll(this.f7320f);
            PDFView.this.f7271B.setOnPageChange(this.f7323i);
            PDFView.this.f7271B.setOnPageScroll(this.f7324j);
            PDFView.this.f7271B.setOnRender(this.f7325k);
            PDFView.this.f7271B.setOnTap(this.f7326l);
            PDFView.this.f7271B.setOnLongPress(this.f7327m);
            PDFView.this.f7271B.setOnPageError(this.f7328n);
            PDFView.this.f7271B.mo17180l(this.f7329o);
            PDFView.this.setSwipeEnabled(this.f7317c);
            PDFView.this.setNightMode(this.f7313B);
            PDFView.this.mo23550r(this.f7318d);
            PDFView.this.setDefaultPage(this.f7330p);
            PDFView.this.setSwipeVertical(!this.f7331q);
            PDFView.this.mo23548p(this.f7332r);
            PDFView.this.setScrollHandle(this.f7334t);
            PDFView.this.mo23549q(this.f7335u);
            PDFView.this.setSpacing(this.f7336v);
            PDFView.this.setAutoSpacing(this.f7337w);
            PDFView.this.setPageFitPolicy(this.f7338x);
            PDFView.this.setFitEachPage(this.f7339y);
            PDFView.this.setPageSnap(this.f7312A);
            PDFView.this.setPageFling(this.f7340z);
            int[] iArr = this.f7316b;
            if (iArr != null) {
                PDFView.this.mo23499H(this.f7315a, this.f7333s, iArr);
            } else {
                PDFView.this.mo23498G(this.f7315a, this.f7333s);
            }
        }

        /* renamed from: e */
        public C3980b mo23571e(boolean z) {
            this.f7331q = z;
            return this;
        }

        public C3980b(C2241a aVar) {
            this.f7316b = null;
            this.f7317c = true;
            this.f7318d = true;
            this.f7329o = new C2226a(PDFView.this);
            this.f7330p = 0;
            this.f7331q = false;
            this.f7332r = false;
            this.f7333s = null;
            this.f7334t = null;
            this.f7335u = true;
            this.f7336v = 0;
            this.f7337w = false;
            this.f7338x = FitPolicy.WIDTH;
            this.f7339y = false;
            this.f7340z = false;
            this.f7312A = false;
            this.f7313B = false;
            this.f7315a = aVar;
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$c */
    public enum C3981c {
        NONE,
        START,
        END
    }

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$d */
    public enum C3982d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3981c cVar = C3981c.NONE;
        this.f7304s = 0.0f;
        this.f7305t = 0.0f;
        this.f7306u = 1.0f;
        this.f7307v = true;
        this.f7308w = C3982d.DEFAULT;
        this.f7271B = new C2228a();
        this.f7274E = FitPolicy.WIDTH;
        this.f7275F = false;
        this.f7276G = 0;
        this.f7277H = true;
        this.f7278I = true;
        this.f7279J = true;
        this.f7280K = false;
        this.f7281L = true;
        this.f7284O = false;
        this.f7285P = false;
        this.f7286Q = false;
        this.f7287R = false;
        this.f7288S = true;
        this.f7289T = new PaintFlagsDrawFilter(0, 3);
        this.f7290U = 0;
        this.f7291V = false;
        this.f7292W = true;
        this.f7293a0 = new ArrayList(10);
        this.f7294b0 = false;
        this.f7310y = new HandlerThread("PDF renderer");
        if (!isInEditMode()) {
            this.f7299n = new C2212b();
            C2208a aVar = new C2208a(this);
            this.f7300o = aVar;
            this.f7301p = new C2215d(this, aVar);
            this.f7270A = new C2216e(this);
            this.f7272C = new Paint();
            Paint paint = new Paint();
            this.f7273D = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f7282M = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    public void setAutoSpacing(boolean z) {
        this.f7291V = z;
    }

    /* access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.f7276G = i;
    }

    /* access modifiers changed from: private */
    public void setFitEachPage(boolean z) {
        this.f7275F = z;
    }

    /* access modifiers changed from: private */
    public void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f7274E = fitPolicy;
    }

    /* access modifiers changed from: private */
    public void setScrollHandle(C2240a aVar) {
        this.f7283N = aVar;
    }

    /* access modifiers changed from: private */
    public void setSpacing(int i) {
        this.f7290U = C2249d.m3490a(getContext(), i);
    }

    /* access modifiers changed from: private */
    public void setSwipeVertical(boolean z) {
        this.f7277H = z;
    }

    /* renamed from: A */
    public boolean mo23492A() {
        return this.f7292W;
    }

    /* renamed from: B */
    public boolean mo23493B() {
        return this.f7278I;
    }

    /* renamed from: C */
    public boolean mo23494C() {
        return this.f7277H;
    }

    /* renamed from: D */
    public boolean mo23495D() {
        return this.f7306u != this.f7296e;
    }

    /* renamed from: E */
    public void mo23496E(int i) {
        mo23497F(i, false);
    }

    /* renamed from: F */
    public void mo23497F(int i, boolean z) {
        float f;
        C2221f fVar = this.f7302q;
        if (fVar != null) {
            int a = fVar.mo17132a(i);
            if (a == 0) {
                f = 0.0f;
            } else {
                f = -this.f7302q.mo17144m(a, this.f7306u);
            }
            if (this.f7277H) {
                if (z) {
                    this.f7300o.mo17066j(this.f7305t, f);
                } else {
                    mo23505N(this.f7304s, f);
                }
            } else if (z) {
                this.f7300o.mo17065i(this.f7304s, f);
            } else {
                mo23505N(f, this.f7305t);
            }
            mo23515X(a);
        }
    }

    /* renamed from: G */
    public final void mo23498G(C2241a aVar, String str) {
        mo23499H(aVar, str, (int[]) null);
    }

    /* renamed from: H */
    public final void mo23499H(C2241a aVar, String str, int[] iArr) {
        if (this.f7307v) {
            this.f7307v = false;
            C2214c cVar = new C2214c(aVar, str, iArr, this, this.f7282M);
            this.f7309x = cVar;
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
    }

    /* renamed from: I */
    public void mo23500I(C2221f fVar) {
        this.f7308w = C3982d.LOADED;
        this.f7302q = fVar;
        if (!this.f7310y.isAlive()) {
            this.f7310y.start();
        }
        C2222g gVar = new C2222g(this.f7310y.getLooper(), this);
        this.f7311z = gVar;
        gVar.mo17161e();
        C2240a aVar = this.f7283N;
        if (aVar != null) {
            aVar.setupLayout(this);
            this.f7284O = true;
        }
        this.f7301p.mo17102d();
        this.f7271B.mo17170b(fVar.mo17147p());
        mo23497F(this.f7276G, false);
    }

    /* renamed from: J */
    public void mo23501J(Throwable th) {
        this.f7308w = C3982d.ERROR;
        C2230c k = this.f7271B.mo17179k();
        mo23511T();
        invalidate();
        if (k != null) {
            k.onError(th);
        }
    }

    /* renamed from: K */
    public void mo23502K() {
        int i;
        float f;
        if (this.f7302q.mo17147p() != 0) {
            if (this.f7277H) {
                f = this.f7305t;
                i = getHeight();
            } else {
                f = this.f7304s;
                i = getWidth();
            }
            int j = this.f7302q.mo17141j(-(f - (((float) i) / 2.0f)), this.f7306u);
            if (j < 0 || j > this.f7302q.mo17147p() - 1 || j == getCurrentPage()) {
                mo23503L();
            } else {
                mo23515X(j);
            }
        }
    }

    /* renamed from: L */
    public void mo23503L() {
        C2222g gVar;
        if (this.f7302q != null && (gVar = this.f7311z) != null) {
            gVar.removeMessages(1);
            this.f7299n.mo17088i();
            this.f7270A.mo17125f();
            mo23512U();
        }
    }

    /* renamed from: M */
    public void mo23504M(float f, float f2) {
        mo23505N(this.f7304s + f, this.f7305t + f2);
    }

    /* renamed from: N */
    public void mo23505N(float f, float f2) {
        mo23506O(f, f2, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23506O(float r6, float r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r5.f7277H
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 == 0) goto L_0x0082
            c.p.a.a.f r0 = r5.f7302q
            float r0 = r0.mo17139h()
            float r0 = r5.mo23518a0(r0)
            int r3 = r5.getWidth()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0024
            int r6 = r5.getWidth()
            int r6 = r6 / 2
            float r6 = (float) r6
            float r0 = r0 / r1
        L_0x0022:
            float r6 = r6 - r0
            goto L_0x003b
        L_0x0024:
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            r6 = r2
            goto L_0x003b
        L_0x002a:
            float r3 = r6 + r0
            int r4 = r5.getWidth()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x003b
            int r6 = r5.getWidth()
            float r6 = (float) r6
            goto L_0x0022
        L_0x003b:
            c.p.a.a.f r0 = r5.f7302q
            float r3 = r5.f7306u
            float r0 = r0.mo17136e(r3)
            int r3 = r5.getHeight()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0054
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float r7 = r7 - r0
            float r7 = r7 / r1
            goto L_0x006c
        L_0x0054:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x005a
            r7 = r2
            goto L_0x006c
        L_0x005a:
            float r1 = r7 + r0
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x006c
            float r7 = -r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x006c:
            float r0 = r5.f7305t
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0076
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.END
            goto L_0x00f9
        L_0x0076:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007e
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.START
            goto L_0x00f9
        L_0x007e:
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.NONE
            goto L_0x00f9
        L_0x0082:
            c.p.a.a.f r0 = r5.f7302q
            float r0 = r0.mo17137f()
            float r0 = r5.mo23518a0(r0)
            int r3 = r5.getHeight()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x009f
            int r7 = r5.getHeight()
            int r7 = r7 / 2
            float r7 = (float) r7
            float r0 = r0 / r1
        L_0x009d:
            float r7 = r7 - r0
            goto L_0x00b6
        L_0x009f:
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            r7 = r2
            goto L_0x00b6
        L_0x00a5:
            float r3 = r7 + r0
            int r4 = r5.getHeight()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b6
            int r7 = r5.getHeight()
            float r7 = (float) r7
            goto L_0x009d
        L_0x00b6:
            c.p.a.a.f r0 = r5.f7302q
            float r3 = r5.f7306u
            float r0 = r0.mo17136e(r3)
            int r3 = r5.getWidth()
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00cf
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 / r1
            goto L_0x00e7
        L_0x00cf:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d5
            r6 = r2
            goto L_0x00e7
        L_0x00d5:
            float r1 = r6 + r0
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e7
            float r6 = -r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 + r0
        L_0x00e7:
            float r0 = r5.f7304s
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f0
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.END
            goto L_0x00f9
        L_0x00f0:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f7
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.START
            goto L_0x00f9
        L_0x00f7:
            com.github.barteksc.pdfviewer.PDFView$c r0 = com.github.barteksc.pdfviewer.PDFView.C3981c.NONE
        L_0x00f9:
            r5.f7304s = r6
            r5.f7305t = r7
            float r6 = r5.getPositionOffset()
            if (r8 == 0) goto L_0x0112
            c.p.a.a.k.a r7 = r5.f7283N
            if (r7 == 0) goto L_0x0112
            boolean r7 = r5.mo23542m()
            if (r7 != 0) goto L_0x0112
            c.p.a.a.k.a r7 = r5.f7283N
            r7.setScroll(r6)
        L_0x0112:
            c.p.a.a.i.a r7 = r5.f7271B
            int r8 = r5.getCurrentPage()
            r7.mo17174f(r8, r6)
            r5.mo23512U()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.mo23506O(float, float, boolean):void");
    }

    /* renamed from: P */
    public void mo23507P(C2239b bVar) {
        if (this.f7308w == C3982d.LOADED) {
            this.f7308w = C3982d.SHOWN;
            this.f7271B.mo17175g(this.f7302q.mo17147p());
        }
        if (bVar.mo17205e()) {
            this.f7299n.mo17083c(bVar);
        } else {
            this.f7299n.mo17082b(bVar);
        }
        mo23512U();
    }

    /* renamed from: Q */
    public void mo23508Q(PageRenderingException pageRenderingException) {
        if (!this.f7271B.mo17173e(pageRenderingException.getPage(), pageRenderingException.getCause())) {
            "Cannot open page " + pageRenderingException.getPage();
            pageRenderingException.getCause();
        }
    }

    /* renamed from: R */
    public boolean mo23509R() {
        float f = -this.f7302q.mo17144m(this.f7303r, this.f7306u);
        float k = f - this.f7302q.mo17142k(this.f7303r, this.f7306u);
        if (mo23494C()) {
            float f2 = this.f7305t;
            if (f <= f2 || k >= f2 - ((float) getHeight())) {
                return false;
            }
            return true;
        }
        float f3 = this.f7304s;
        if (f <= f3 || k >= f3 - ((float) getWidth())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = mo23551s(r3.f7304s, r3.f7305t);
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23510S() {
        /*
            r3 = this;
            boolean r0 = r3.f7281L
            if (r0 == 0) goto L_0x0039
            c.p.a.a.f r0 = r3.f7302q
            if (r0 == 0) goto L_0x0039
            int r0 = r0.mo17147p()
            if (r0 != 0) goto L_0x000f
            goto L_0x0039
        L_0x000f:
            float r0 = r3.f7304s
            float r1 = r3.f7305t
            int r0 = r3.mo23551s(r0, r1)
            com.github.barteksc.pdfviewer.util.SnapEdge r1 = r3.mo23560t(r0)
            com.github.barteksc.pdfviewer.util.SnapEdge r2 = com.github.barteksc.pdfviewer.util.SnapEdge.NONE
            if (r1 != r2) goto L_0x0020
            return
        L_0x0020:
            float r0 = r3.mo23516Y(r0, r1)
            boolean r1 = r3.f7277H
            if (r1 == 0) goto L_0x0031
            c.p.a.a.a r1 = r3.f7300o
            float r2 = r3.f7305t
            float r0 = -r0
            r1.mo17066j(r2, r0)
            goto L_0x0039
        L_0x0031:
            c.p.a.a.a r1 = r3.f7300o
            float r2 = r3.f7304s
            float r0 = -r0
            r1.mo17065i(r2, r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.mo23510S():void");
    }

    /* renamed from: T */
    public void mo23511T() {
        this.f7295c0 = null;
        this.f7300o.mo17068l();
        this.f7301p.mo17101c();
        C2222g gVar = this.f7311z;
        if (gVar != null) {
            gVar.mo17162f();
            this.f7311z.removeMessages(1);
        }
        C2214c cVar = this.f7309x;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f7299n.mo17089j();
        C2240a aVar = this.f7283N;
        if (aVar != null && this.f7284O) {
            aVar.mo17210c();
        }
        C2221f fVar = this.f7302q;
        if (fVar != null) {
            fVar.mo17133b();
            this.f7302q = null;
        }
        this.f7311z = null;
        this.f7283N = null;
        this.f7284O = false;
        this.f7305t = 0.0f;
        this.f7304s = 0.0f;
        this.f7306u = 1.0f;
        this.f7307v = true;
        this.f7271B = new C2228a();
        this.f7308w = C3982d.DEFAULT;
    }

    /* renamed from: U */
    public void mo23512U() {
        invalidate();
    }

    /* renamed from: V */
    public void mo23513V() {
        mo23525e0(this.f7296e);
    }

    /* renamed from: W */
    public void mo23514W(float f, boolean z) {
        if (this.f7277H) {
            mo23506O(this.f7304s, ((-this.f7302q.mo17136e(this.f7306u)) + ((float) getHeight())) * f, z);
        } else {
            mo23506O(((-this.f7302q.mo17136e(this.f7306u)) + ((float) getWidth())) * f, this.f7305t, z);
        }
        mo23502K();
    }

    /* renamed from: X */
    public void mo23515X(int i) {
        if (!this.f7307v) {
            this.f7303r = this.f7302q.mo17132a(i);
            mo23503L();
            if (this.f7283N != null && !mo23542m()) {
                this.f7283N.setPageNum(this.f7303r + 1);
            }
            this.f7271B.mo17172d(this.f7303r, this.f7302q.mo17147p());
        }
    }

    /* renamed from: Y */
    public float mo23516Y(int i, SnapEdge snapEdge) {
        float f;
        float m = this.f7302q.mo17144m(i, this.f7306u);
        float height = (float) (this.f7277H ? getHeight() : getWidth());
        float k = this.f7302q.mo17142k(i, this.f7306u);
        if (snapEdge == SnapEdge.CENTER) {
            f = m - (height / 2.0f);
            k /= 2.0f;
        } else if (snapEdge != SnapEdge.END) {
            return m;
        } else {
            f = m - height;
        }
        return f + k;
    }

    /* renamed from: Z */
    public void mo23517Z() {
        this.f7300o.mo17069m();
    }

    /* renamed from: a0 */
    public float mo23518a0(float f) {
        return f * this.f7306u;
    }

    /* renamed from: b0 */
    public void mo23519b0(float f, PointF pointF) {
        mo23520c0(this.f7306u * f, pointF);
    }

    /* renamed from: c0 */
    public void mo23520c0(float f, PointF pointF) {
        float f2 = f / this.f7306u;
        mo23524d0(f);
        float f3 = pointF.x;
        float f4 = pointF.y;
        mo23505N((this.f7304s * f2) + (f3 - (f3 * f2)), (this.f7305t * f2) + (f4 - (f2 * f4)));
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f7302q == null) {
            return true;
        }
        if (this.f7277H) {
            if (i < 0 && this.f7304s < 0.0f) {
                return true;
            }
            if (i <= 0 || this.f7304s + mo23518a0(this.f7302q.mo17139h()) <= ((float) getWidth())) {
                return false;
            }
            return true;
        } else if (i < 0 && this.f7304s < 0.0f) {
            return true;
        } else {
            if (i <= 0 || this.f7304s + this.f7302q.mo17136e(this.f7306u) <= ((float) getWidth())) {
                return false;
            }
            return true;
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f7302q == null) {
            return true;
        }
        if (this.f7277H) {
            if (i < 0 && this.f7305t < 0.0f) {
                return true;
            }
            if (i <= 0 || this.f7305t + this.f7302q.mo17136e(this.f7306u) <= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (i < 0 && this.f7305t < 0.0f) {
            return true;
        } else {
            if (i <= 0 || this.f7305t + mo23518a0(this.f7302q.mo17137f()) <= ((float) getHeight())) {
                return false;
            }
            return true;
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            this.f7300o.mo17060d();
        }
    }

    /* renamed from: d0 */
    public void mo23524d0(float f) {
        this.f7306u = f;
    }

    /* renamed from: e0 */
    public void mo23525e0(float f) {
        this.f7300o.mo17067k((float) (getWidth() / 2), (float) (getHeight() / 2), this.f7306u, f);
    }

    /* renamed from: f0 */
    public void mo23526f0(float f, float f2, float f3) {
        this.f7300o.mo17067k(f, f2, this.f7306u, f3);
    }

    public int getCurrentPage() {
        return this.f7303r;
    }

    public float getCurrentXOffset() {
        return this.f7304s;
    }

    public float getCurrentYOffset() {
        return this.f7305t;
    }

    public PdfDocument.Meta getDocumentMeta() {
        C2221f fVar = this.f7302q;
        if (fVar == null) {
            return null;
        }
        return fVar.mo17140i();
    }

    public float getMaxZoom() {
        return this.f7298m;
    }

    public float getMidZoom() {
        return this.f7297l;
    }

    public float getMinZoom() {
        return this.f7296e;
    }

    public int getPageCount() {
        C2221f fVar = this.f7302q;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo17147p();
    }

    public FitPolicy getPageFitPolicy() {
        return this.f7274E;
    }

    public float getPositionOffset() {
        int i;
        float f;
        float f2;
        if (this.f7277H) {
            f2 = -this.f7305t;
            f = this.f7302q.mo17136e(this.f7306u);
            i = getHeight();
        } else {
            f2 = -this.f7304s;
            f = this.f7302q.mo17136e(this.f7306u);
            i = getWidth();
        }
        return C2246b.m3480c(f2 / (f - ((float) i)), 0.0f, 1.0f);
    }

    public C2240a getScrollHandle() {
        return this.f7283N;
    }

    public int getSpacingPx() {
        return this.f7290U;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C2221f fVar = this.f7302q;
        if (fVar == null) {
            return Collections.emptyList();
        }
        return fVar.mo17135d();
    }

    public float getZoom() {
        return this.f7306u;
    }

    /* renamed from: l */
    public boolean mo23541l() {
        return this.f7287R;
    }

    /* renamed from: m */
    public boolean mo23542m() {
        float e = this.f7302q.mo17136e(1.0f);
        if (this.f7277H) {
            if (e < ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (e < ((float) getWidth())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public final void mo23543n(Canvas canvas, C2239b bVar) {
        float f;
        float f2;
        RectF c = bVar.mo17203c();
        Bitmap d = bVar.mo17204d();
        if (!d.isRecycled()) {
            SizeF n = this.f7302q.mo17145n(bVar.mo17202b());
            if (this.f7277H) {
                f2 = this.f7302q.mo17144m(bVar.mo17202b(), this.f7306u);
                f = mo23518a0(this.f7302q.mo17139h() - n.getWidth()) / 2.0f;
            } else {
                f = this.f7302q.mo17144m(bVar.mo17202b(), this.f7306u);
                f2 = mo23518a0(this.f7302q.mo17137f() - n.getHeight()) / 2.0f;
            }
            canvas.translate(f, f2);
            Rect rect = new Rect(0, 0, d.getWidth(), d.getHeight());
            float a0 = mo23518a0(c.left * n.getWidth());
            float a02 = mo23518a0(c.top * n.getHeight());
            RectF rectF = new RectF((float) ((int) a0), (float) ((int) a02), (float) ((int) (a0 + mo23518a0(c.width() * n.getWidth()))), (float) ((int) (a02 + mo23518a0(c.height() * n.getHeight()))));
            float f3 = this.f7304s + f;
            float f4 = this.f7305t + f2;
            if (rectF.left + f3 >= ((float) getWidth()) || f3 + rectF.right <= 0.0f || rectF.top + f4 >= ((float) getHeight()) || f4 + rectF.bottom <= 0.0f) {
                canvas.translate(-f, -f2);
                return;
            }
            canvas.drawBitmap(d, rect, rectF, this.f7272C);
            if (C2243a.f2289a) {
                this.f7273D.setColor(bVar.mo17202b() % 2 == 0 ? SupportMenu.CATEGORY_MASK : -16776961);
                canvas.drawRect(rectF, this.f7273D);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: o */
    public final void mo23544o(Canvas canvas, int i, C2229b bVar) {
        float f;
        if (bVar != null) {
            float f2 = 0.0f;
            if (this.f7277H) {
                f = this.f7302q.mo17144m(i, this.f7306u);
            } else {
                f2 = this.f7302q.mo17144m(i, this.f7306u);
                f = 0.0f;
            }
            canvas.translate(f2, f);
            SizeF n = this.f7302q.mo17145n(i);
            bVar.mo17191a(canvas, mo23518a0(n.getWidth()), mo23518a0(n.getHeight()), i);
            canvas.translate(-f2, -f);
        }
    }

    public void onDetachedFromWindow() {
        mo23511T();
        HandlerThread handlerThread = this.f7310y;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                handlerThread.quitSafely();
            } else {
                handlerThread.quit();
            }
            this.f7310y = null;
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            if (this.f7288S) {
                canvas.setDrawFilter(this.f7289T);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(this.f7280K ? ViewCompat.MEASURED_STATE_MASK : -1);
            } else {
                background.draw(canvas);
            }
            if (!this.f7307v && this.f7308w == C3982d.SHOWN) {
                float f = this.f7304s;
                float f2 = this.f7305t;
                canvas.translate(f, f2);
                for (C2239b n : this.f7299n.mo17086g()) {
                    mo23543n(canvas, n);
                }
                for (C2239b next : this.f7299n.mo17085f()) {
                    mo23543n(canvas, next);
                    if (this.f7271B.mo17178j() != null && !this.f7293a0.contains(Integer.valueOf(next.mo17202b()))) {
                        this.f7293a0.add(Integer.valueOf(next.mo17202b()));
                    }
                }
                for (Integer intValue : this.f7293a0) {
                    mo23544o(canvas, intValue.intValue(), this.f7271B.mo17178j());
                }
                this.f7293a0.clear();
                mo23544o(canvas, this.f7303r, this.f7271B.mo17177i());
                canvas.translate(-f, -f2);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        this.f7294b0 = true;
        C3980b bVar = this.f7295c0;
        if (bVar != null) {
            bVar.mo23570d();
        }
        if (!isInEditMode() && this.f7308w == C3982d.SHOWN) {
            float f3 = (-this.f7304s) + (((float) i3) * 0.5f);
            float f4 = (-this.f7305t) + (((float) i4) * 0.5f);
            if (this.f7277H) {
                f2 = f3 / this.f7302q.mo17139h();
                f = this.f7302q.mo17136e(this.f7306u);
            } else {
                f2 = f3 / this.f7302q.mo17136e(this.f7306u);
                f = this.f7302q.mo17137f();
            }
            float f5 = f4 / f;
            this.f7300o.mo17068l();
            this.f7302q.mo17156y(new Size(i, i2));
            if (this.f7277H) {
                this.f7304s = ((-f2) * this.f7302q.mo17139h()) + (((float) i) * 0.5f);
                this.f7305t = ((-f5) * this.f7302q.mo17136e(this.f7306u)) + (((float) i2) * 0.5f);
            } else {
                this.f7304s = ((-f2) * this.f7302q.mo17136e(this.f7306u)) + (((float) i) * 0.5f);
                this.f7305t = ((-f5) * this.f7302q.mo17137f()) + (((float) i2) * 0.5f);
            }
            mo23505N(this.f7304s, this.f7305t);
            mo23502K();
        }
    }

    /* renamed from: p */
    public void mo23548p(boolean z) {
        this.f7286Q = z;
    }

    /* renamed from: q */
    public void mo23549q(boolean z) {
        this.f7288S = z;
    }

    /* renamed from: r */
    public void mo23550r(boolean z) {
        this.f7279J = z;
    }

    /* renamed from: s */
    public int mo23551s(float f, float f2) {
        if (this.f7277H) {
            f = f2;
        }
        float height = (float) (this.f7277H ? getHeight() : getWidth());
        if (f > -1.0f) {
            return 0;
        }
        if (f < (-this.f7302q.mo17136e(this.f7306u)) + height + 1.0f) {
            return this.f7302q.mo17147p() - 1;
        }
        return this.f7302q.mo17141j(-(f - (height / 2.0f)), this.f7306u);
    }

    public void setMaxZoom(float f) {
        this.f7298m = f;
    }

    public void setMidZoom(float f) {
        this.f7297l = f;
    }

    public void setMinZoom(float f) {
        this.f7296e = f;
    }

    public void setNightMode(boolean z) {
        this.f7280K = z;
        if (z) {
            this.f7272C.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            return;
        }
        this.f7272C.setColorFilter((ColorFilter) null);
    }

    public void setPageFling(boolean z) {
        this.f7292W = z;
    }

    public void setPageSnap(boolean z) {
        this.f7281L = z;
    }

    public void setPositionOffset(float f) {
        mo23514W(f, true);
    }

    public void setSwipeEnabled(boolean z) {
        this.f7278I = z;
    }

    /* renamed from: t */
    public SnapEdge mo23560t(int i) {
        if (!this.f7281L || i < 0) {
            return SnapEdge.NONE;
        }
        float f = this.f7277H ? this.f7305t : this.f7304s;
        float f2 = -this.f7302q.mo17144m(i, this.f7306u);
        int height = this.f7277H ? getHeight() : getWidth();
        float k = this.f7302q.mo17142k(i, this.f7306u);
        float f3 = (float) height;
        if (f3 >= k) {
            return SnapEdge.CENTER;
        }
        if (f >= f2) {
            return SnapEdge.START;
        }
        if (f2 - k > f - f3) {
            return SnapEdge.END;
        }
        return SnapEdge.NONE;
    }

    /* renamed from: u */
    public C3980b mo23561u(File file) {
        return new C3980b(new C2242b(file));
    }

    /* renamed from: v */
    public boolean mo23562v() {
        return this.f7286Q;
    }

    /* renamed from: w */
    public boolean mo23563w() {
        return this.f7291V;
    }

    /* renamed from: x */
    public boolean mo23564x() {
        return this.f7285P;
    }

    /* renamed from: y */
    public boolean mo23565y() {
        return this.f7279J;
    }

    /* renamed from: z */
    public boolean mo23566z() {
        return this.f7275F;
    }
}

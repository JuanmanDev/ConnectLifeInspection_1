package p040c.p175p.p176a.p177a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import p040c.p175p.p176a.p177a.p180j.C2239b;

/* renamed from: c.p.a.a.g */
/* compiled from: RenderingHandler */
public class C2222g extends Handler {

    /* renamed from: f */
    public static final String f2251f = C2222g.class.getName();

    /* renamed from: a */
    public PDFView f2252a;

    /* renamed from: b */
    public RectF f2253b = new RectF();

    /* renamed from: c */
    public Rect f2254c = new Rect();

    /* renamed from: d */
    public Matrix f2255d = new Matrix();

    /* renamed from: e */
    public boolean f2256e = false;

    /* renamed from: c.p.a.a.g$a */
    /* compiled from: RenderingHandler */
    public class C2223a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2239b f2257e;

        public C2223a(C2239b bVar) {
            this.f2257e = bVar;
        }

        public void run() {
            C2222g.this.f2252a.mo23507P(this.f2257e);
        }
    }

    /* renamed from: c.p.a.a.g$b */
    /* compiled from: RenderingHandler */
    public class C2224b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ PageRenderingException f2259e;

        public C2224b(PageRenderingException pageRenderingException) {
            this.f2259e = pageRenderingException;
        }

        public void run() {
            C2222g.this.f2252a.mo23508Q(this.f2259e);
        }
    }

    /* renamed from: c.p.a.a.g$c */
    /* compiled from: RenderingHandler */
    public class C2225c {

        /* renamed from: a */
        public float f2261a;

        /* renamed from: b */
        public float f2262b;

        /* renamed from: c */
        public RectF f2263c;

        /* renamed from: d */
        public int f2264d;

        /* renamed from: e */
        public boolean f2265e;

        /* renamed from: f */
        public int f2266f;

        /* renamed from: g */
        public boolean f2267g;

        /* renamed from: h */
        public boolean f2268h;

        public C2225c(C2222g gVar, float f, float f2, RectF rectF, int i, boolean z, int i2, boolean z2, boolean z3) {
            this.f2264d = i;
            this.f2261a = f;
            this.f2262b = f2;
            this.f2263c = rectF;
            this.f2265e = z;
            this.f2266f = i2;
            this.f2267g = z2;
            this.f2268h = z3;
        }
    }

    public C2222g(Looper looper, PDFView pDFView) {
        super(looper);
        this.f2252a = pDFView;
    }

    /* renamed from: b */
    public void mo17158b(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2, boolean z3) {
        sendMessage(obtainMessage(1, new C2225c(this, f, f2, rectF, i, z, i2, z2, z3)));
    }

    /* renamed from: c */
    public final void mo17159c(int i, int i2, RectF rectF) {
        this.f2255d.reset();
        float f = (float) i;
        float f2 = (float) i2;
        this.f2255d.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
        this.f2255d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f2253b.set(0.0f, 0.0f, f, f2);
        this.f2255d.mapRect(this.f2253b);
        this.f2253b.round(this.f2254c);
    }

    /* renamed from: d */
    public final C2239b mo17160d(C2225c cVar) {
        C2221f fVar = this.f2252a.f7302q;
        fVar.mo17151t(cVar.f2264d);
        int round = Math.round(cVar.f2261a);
        int round2 = Math.round(cVar.f2262b);
        if (!(round == 0 || round2 == 0 || fVar.mo17152u(cVar.f2264d))) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, cVar.f2267g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                mo17159c(round, round2, cVar.f2263c);
                fVar.mo17157z(createBitmap, cVar.f2264d, this.f2254c, cVar.f2268h);
                return new C2239b(cVar.f2264d, createBitmap, cVar.f2263c, cVar.f2265e, cVar.f2266f);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo17161e() {
        this.f2256e = true;
    }

    /* renamed from: f */
    public void mo17162f() {
        this.f2256e = false;
    }

    public void handleMessage(Message message) {
        try {
            C2239b d = mo17160d((C2225c) message.obj);
            if (d == null) {
                return;
            }
            if (this.f2256e) {
                this.f2252a.post(new C2223a(d));
            } else {
                d.mo17204d().recycle();
            }
        } catch (PageRenderingException e) {
            this.f2252a.post(new C2224b(e));
        }
    }
}

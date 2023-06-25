package p040c.p175p.p176a.p177a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p176a.p177a.p183m.C2247c;

/* renamed from: c.p.a.a.f */
/* compiled from: PdfFile */
public class C2221f {

    /* renamed from: t */
    public static final Object f2231t = new Object();

    /* renamed from: a */
    public PdfDocument f2232a;

    /* renamed from: b */
    public PdfiumCore f2233b;

    /* renamed from: c */
    public int f2234c = 0;

    /* renamed from: d */
    public List<Size> f2235d = new ArrayList();

    /* renamed from: e */
    public List<SizeF> f2236e = new ArrayList();

    /* renamed from: f */
    public SparseBooleanArray f2237f = new SparseBooleanArray();

    /* renamed from: g */
    public Size f2238g = new Size(0, 0);

    /* renamed from: h */
    public Size f2239h = new Size(0, 0);

    /* renamed from: i */
    public SizeF f2240i = new SizeF(0.0f, 0.0f);

    /* renamed from: j */
    public SizeF f2241j = new SizeF(0.0f, 0.0f);

    /* renamed from: k */
    public boolean f2242k;

    /* renamed from: l */
    public int f2243l;

    /* renamed from: m */
    public boolean f2244m;

    /* renamed from: n */
    public List<Float> f2245n = new ArrayList();

    /* renamed from: o */
    public List<Float> f2246o = new ArrayList();

    /* renamed from: p */
    public float f2247p = 0.0f;

    /* renamed from: q */
    public final FitPolicy f2248q;

    /* renamed from: r */
    public final boolean f2249r;

    /* renamed from: s */
    public int[] f2250s;

    public C2221f(PdfiumCore pdfiumCore, PdfDocument pdfDocument, FitPolicy fitPolicy, Size size, int[] iArr, boolean z, int i, boolean z2, boolean z3) {
        this.f2233b = pdfiumCore;
        this.f2232a = pdfDocument;
        this.f2248q = fitPolicy;
        this.f2250s = iArr;
        this.f2242k = z;
        this.f2243l = i;
        this.f2244m = z2;
        this.f2249r = z3;
        mo17131A(size);
    }

    /* renamed from: A */
    public final void mo17131A(Size size) {
        int[] iArr = this.f2250s;
        if (iArr != null) {
            this.f2234c = iArr.length;
        } else {
            this.f2234c = this.f2233b.getPageCount(this.f2232a);
        }
        for (int i = 0; i < this.f2234c; i++) {
            Size pageSize = this.f2233b.getPageSize(this.f2232a, mo17134c(i));
            if (pageSize.getWidth() > this.f2238g.getWidth()) {
                this.f2238g = pageSize;
            }
            if (pageSize.getHeight() > this.f2239h.getHeight()) {
                this.f2239h = pageSize;
            }
            this.f2235d.add(pageSize);
        }
        mo17156y(size);
    }

    /* renamed from: a */
    public int mo17132a(int i) {
        int p;
        if (i <= 0) {
            return 0;
        }
        int[] iArr = this.f2250s;
        if (iArr != null) {
            if (i >= iArr.length) {
                p = iArr.length;
            }
            return i;
        }
        if (i >= mo17147p()) {
            p = mo17147p();
        }
        return i;
        return p - 1;
    }

    /* renamed from: b */
    public void mo17133b() {
        PdfDocument pdfDocument;
        PdfiumCore pdfiumCore = this.f2233b;
        if (!(pdfiumCore == null || (pdfDocument = this.f2232a) == null)) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.f2232a = null;
        this.f2250s = null;
    }

    /* renamed from: c */
    public int mo17134c(int i) {
        int i2;
        int[] iArr = this.f2250s;
        if (iArr == null) {
            i2 = i;
        } else if (i < 0 || i >= iArr.length) {
            return -1;
        } else {
            i2 = iArr[i];
        }
        if (i2 < 0 || i >= mo17147p()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: d */
    public List<PdfDocument.Bookmark> mo17135d() {
        PdfDocument pdfDocument = this.f2232a;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.f2233b.getTableOfContents(pdfDocument);
    }

    /* renamed from: e */
    public float mo17136e(float f) {
        return this.f2247p * f;
    }

    /* renamed from: f */
    public float mo17137f() {
        return mo17138g().getHeight();
    }

    /* renamed from: g */
    public SizeF mo17138g() {
        return this.f2242k ? this.f2241j : this.f2240i;
    }

    /* renamed from: h */
    public float mo17139h() {
        return mo17138g().getWidth();
    }

    /* renamed from: i */
    public PdfDocument.Meta mo17140i() {
        PdfDocument pdfDocument = this.f2232a;
        if (pdfDocument == null) {
            return null;
        }
        return this.f2233b.getDocumentMeta(pdfDocument);
    }

    /* renamed from: j */
    public int mo17141j(float f, float f2) {
        int i = 0;
        int i2 = 0;
        while (i < mo17147p() && (this.f2245n.get(i).floatValue() * f2) - (mo17146o(i, f2) / 2.0f) < f) {
            i2++;
            i++;
        }
        int i3 = i2 - 1;
        if (i3 >= 0) {
            return i3;
        }
        return 0;
    }

    /* renamed from: k */
    public float mo17142k(int i, float f) {
        SizeF n = mo17145n(i);
        return (this.f2242k ? n.getHeight() : n.getWidth()) * f;
    }

    /* renamed from: l */
    public List<PdfDocument.Link> mo17143l(int i) {
        return this.f2233b.getPageLinks(this.f2232a, mo17134c(i));
    }

    /* renamed from: m */
    public float mo17144m(int i, float f) {
        if (mo17134c(i) < 0) {
            return 0.0f;
        }
        return this.f2245n.get(i).floatValue() * f;
    }

    /* renamed from: n */
    public SizeF mo17145n(int i) {
        if (mo17134c(i) < 0) {
            return new SizeF(0.0f, 0.0f);
        }
        return this.f2236e.get(i);
    }

    /* renamed from: o */
    public float mo17146o(int i, float f) {
        return (this.f2244m ? this.f2246o.get(i).floatValue() : (float) this.f2243l) * f;
    }

    /* renamed from: p */
    public int mo17147p() {
        return this.f2234c;
    }

    /* renamed from: q */
    public SizeF mo17148q(int i, float f) {
        SizeF n = mo17145n(i);
        return new SizeF(n.getWidth() * f, n.getHeight() * f);
    }

    /* renamed from: r */
    public float mo17149r(int i, float f) {
        float f2;
        float height;
        SizeF n = mo17145n(i);
        if (this.f2242k) {
            f2 = mo17139h();
            height = n.getWidth();
        } else {
            f2 = mo17137f();
            height = n.getHeight();
        }
        return (f * (f2 - height)) / 2.0f;
    }

    /* renamed from: s */
    public RectF mo17150s(int i, int i2, int i3, int i4, int i5, RectF rectF) {
        return this.f2233b.mapRectToDevice(this.f2232a, mo17134c(i), i2, i3, i4, i5, 0, rectF);
    }

    /* renamed from: t */
    public boolean mo17151t(int i) {
        int c = mo17134c(i);
        if (c < 0) {
            return false;
        }
        synchronized (f2231t) {
            if (this.f2237f.indexOfKey(c) >= 0) {
                return false;
            }
            try {
                this.f2233b.openPage(this.f2232a, c);
                this.f2237f.put(c, true);
                return true;
            } catch (Exception e) {
                this.f2237f.put(c, false);
                throw new PageRenderingException(i, e);
            }
        }
    }

    /* renamed from: u */
    public boolean mo17152u(int i) {
        return !this.f2237f.get(mo17134c(i), false);
    }

    /* renamed from: v */
    public final void mo17153v(Size size) {
        float f;
        float f2;
        this.f2246o.clear();
        for (int i = 0; i < mo17147p(); i++) {
            SizeF sizeF = this.f2236e.get(i);
            if (this.f2242k) {
                f = (float) size.getHeight();
                f2 = sizeF.getHeight();
            } else {
                f = (float) size.getWidth();
                f2 = sizeF.getWidth();
            }
            float max = Math.max(0.0f, f - f2);
            if (i < mo17147p() - 1) {
                max += (float) this.f2243l;
            }
            this.f2246o.add(Float.valueOf(max));
        }
    }

    /* renamed from: w */
    public final void mo17154w() {
        float f;
        float f2 = 0.0f;
        for (int i = 0; i < mo17147p(); i++) {
            SizeF sizeF = this.f2236e.get(i);
            f2 += this.f2242k ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f2244m) {
                f = this.f2246o.get(i).floatValue();
            } else if (i < mo17147p() - 1) {
                f = (float) this.f2243l;
            }
            f2 += f;
        }
        this.f2247p = f2;
    }

    /* renamed from: x */
    public final void mo17155x() {
        float f;
        float f2;
        this.f2245n.clear();
        float f3 = 0.0f;
        for (int i = 0; i < mo17147p(); i++) {
            SizeF sizeF = this.f2236e.get(i);
            float height = this.f2242k ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f2244m) {
                f += this.f2246o.get(i).floatValue() / 2.0f;
                if (i == 0) {
                    f -= ((float) this.f2243l) / 2.0f;
                } else if (i == mo17147p() - 1) {
                    f += ((float) this.f2243l) / 2.0f;
                }
                this.f2245n.add(Float.valueOf(f));
                f2 = this.f2246o.get(i).floatValue() / 2.0f;
            } else {
                this.f2245n.add(Float.valueOf(f));
                f2 = (float) this.f2243l;
            }
            f3 = f + height + f2;
        }
    }

    /* renamed from: y */
    public void mo17156y(Size size) {
        this.f2236e.clear();
        C2247c cVar = new C2247c(this.f2248q, this.f2238g, this.f2239h, size, this.f2249r);
        this.f2241j = cVar.mo17223g();
        this.f2240i = cVar.mo17222f();
        for (Size a : this.f2235d) {
            this.f2236e.add(cVar.mo17217a(a));
        }
        if (this.f2244m) {
            mo17153v(size);
        }
        mo17154w();
        mo17155x();
    }

    /* renamed from: z */
    public void mo17157z(Bitmap bitmap, int i, Rect rect, boolean z) {
        Bitmap bitmap2 = bitmap;
        this.f2233b.renderPageBitmap(this.f2232a, bitmap2, mo17134c(i), rect.left, rect.top, rect.width(), rect.height(), z);
    }
}

package p040c.p175p.p176a.p177a;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;
import p040c.p175p.p176a.p177a.p182l.C2241a;

/* renamed from: c.p.a.a.c */
/* compiled from: DecodingAsyncTask */
public class C2214c extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    public boolean f2199a = false;

    /* renamed from: b */
    public WeakReference<PDFView> f2200b;

    /* renamed from: c */
    public PdfiumCore f2201c;

    /* renamed from: d */
    public String f2202d;

    /* renamed from: e */
    public C2241a f2203e;

    /* renamed from: f */
    public int[] f2204f;

    /* renamed from: g */
    public C2221f f2205g;

    public C2214c(C2241a aVar, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f2203e = aVar;
        this.f2204f = iArr;
        this.f2200b = new WeakReference<>(pDFView);
        this.f2202d = str;
        this.f2201c = pdfiumCore;
    }

    /* renamed from: a */
    public Throwable doInBackground(Void... voidArr) {
        try {
            PDFView pDFView = (PDFView) this.f2200b.get();
            if (pDFView == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f2205g = new C2221f(this.f2201c, this.f2203e.mo17216a(pDFView.getContext(), this.f2201c, this.f2202d), pDFView.getPageFitPolicy(), mo17094b(pDFView), this.f2204f, pDFView.mo23494C(), pDFView.getSpacingPx(), pDFView.mo23563w(), pDFView.mo23566z());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: b */
    public final Size mo17094b(PDFView pDFView) {
        return new Size(pDFView.getWidth(), pDFView.getHeight());
    }

    /* renamed from: c */
    public void onPostExecute(Throwable th) {
        PDFView pDFView = (PDFView) this.f2200b.get();
        if (pDFView == null) {
            return;
        }
        if (th != null) {
            pDFView.mo23501J(th);
        } else if (!this.f2199a) {
            pDFView.mo23500I(this.f2205g);
        }
    }

    public void onCancelled() {
        this.f2199a = true;
    }
}

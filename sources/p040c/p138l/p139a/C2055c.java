package p040c.p138l.p139a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import java.io.File;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p575e.C9055e;

/* renamed from: c.l.a.c */
/* compiled from: PdfViewer */
public class C2055c implements C9055e, C9017j.C9021c {

    /* renamed from: e */
    public PDFView f1898e;

    /* renamed from: l */
    public String f1899l;

    public C2055c(Context context, C9003c cVar, int i, Map<String, Object> map) {
        new C9017j(cVar, "pdf_viewer_plugin_" + i).mo46575e(this);
        this.f1898e = new PDFView(context, (AttributeSet) null);
        if (map.containsKey("filePath")) {
            this.f1899l = (String) map.get("filePath");
            mo16680a();
        }
    }

    /* renamed from: a */
    public final void mo16680a() {
        PDFView.C3980b u = this.f1898e.mo23561u(new File(this.f1899l));
        u.mo23569c(true);
        u.mo23571e(false);
        u.mo23568b(true);
        u.mo23567a(0);
        u.mo23570d();
    }

    public void dispose() {
    }

    public View getView() {
        return this.f1898e;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        if (iVar.f17687a.equals("getPdfViewer")) {
            dVar.success((Object) null);
        } else {
            dVar.notImplemented();
        }
    }
}

package p040c.p175p.p176a.p177a.p178h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.github.barteksc.pdfviewer.PDFView;
import p040c.p175p.p176a.p177a.p180j.C2238a;

/* renamed from: c.p.a.a.h.a */
/* compiled from: DefaultLinkHandler */
public class C2226a implements C2227b {

    /* renamed from: a */
    public PDFView f2269a;

    public C2226a(PDFView pDFView) {
        this.f2269a = pDFView;
    }

    /* renamed from: a */
    public void mo17166a(C2238a aVar) {
        String uri = aVar.mo17200a().getUri();
        Integer destPageIdx = aVar.mo17200a().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            mo17168c(uri);
        } else if (destPageIdx != null) {
            mo17167b(destPageIdx.intValue());
        }
    }

    /* renamed from: b */
    public final void mo17167b(int i) {
        this.f2269a.mo23496E(i);
    }

    /* renamed from: c */
    public final void mo17168c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f2269a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        "No activity found for URI: " + str;
    }
}

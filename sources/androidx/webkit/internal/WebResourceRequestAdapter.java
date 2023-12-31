package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

public class WebResourceRequestAdapter {
    public final WebResourceRequestBoundaryInterface mBoundaryInterface;

    public WebResourceRequestAdapter(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.mBoundaryInterface = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.mBoundaryInterface.isRedirect();
    }
}

package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JsReplyProxy;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p001a.p023f.p024a.C0131a;
import p648m.p654b.p655a.p656a.C9616a;

public class JsReplyProxyImpl extends JsReplyProxy {
    public JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JsReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m166a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new JsReplyProxyImpl(jsReplyProxyBoundaryInterface);
    }

    @NonNull
    public static JsReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C9616a.m25809a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JsReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new C0131a(jsReplyProxyBoundaryInterface));
    }

    public void postMessage(@NonNull String str) {
        if (WebViewFeatureInternal.getFeature(WebViewFeature.WEB_MESSAGE_LISTENER).isSupportedByWebView()) {
            this.mBoundaryInterface.postMessage(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}

package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.webview.BaseWineWebViewActivity;
import kotlin.Pair;

/* renamed from: c.v.a.g.t */
/* compiled from: lambda */
public final /* synthetic */ class C7640t implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BaseWineWebViewActivity f14374a;

    public /* synthetic */ C7640t(BaseWineWebViewActivity baseWineWebViewActivity) {
        this.f14374a = baseWineWebViewActivity;
    }

    public final void onChanged(Object obj) {
        BaseWineWebViewActivity.m27207setListeners$lambda5(this.f14374a, (Pair) obj);
    }
}

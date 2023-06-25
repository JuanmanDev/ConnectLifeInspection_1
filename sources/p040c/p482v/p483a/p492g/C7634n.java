package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.webview.AddWineWebViewActivity;
import kotlin.Triple;

/* renamed from: c.v.a.g.n */
/* compiled from: lambda */
public final /* synthetic */ class C7634n implements Observer {

    /* renamed from: a */
    public final /* synthetic */ AddWineWebViewActivity f14367a;

    public /* synthetic */ C7634n(AddWineWebViewActivity addWineWebViewActivity) {
        this.f14367a = addWineWebViewActivity;
    }

    public final void onChanged(Object obj) {
        AddWineWebViewActivity.m27204setListeners$lambda3(this.f14367a, (Triple) obj);
    }
}

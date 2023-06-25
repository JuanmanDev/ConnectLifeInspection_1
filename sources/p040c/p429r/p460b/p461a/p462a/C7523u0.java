package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ShareInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.u0 */
/* compiled from: lambda */
public final /* synthetic */ class C7523u0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ShareInfoActivity f14221a;

    public /* synthetic */ C7523u0(ShareInfoActivity shareInfoActivity) {
        this.f14221a = shareInfoActivity;
    }

    public final void onChanged(Object obj) {
        ShareInfoActivity.m27132subscribeObservable$lambda5(this.f14221a, (Pair) obj);
    }
}

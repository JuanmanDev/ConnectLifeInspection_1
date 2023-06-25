package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ShareInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.h */
/* compiled from: lambda */
public final /* synthetic */ class C7496h implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ShareInfoActivity f14193a;

    public /* synthetic */ C7496h(ShareInfoActivity shareInfoActivity) {
        this.f14193a = shareInfoActivity;
    }

    public final void onChanged(Object obj) {
        ShareInfoActivity.m27131subscribeObservable$lambda4(this.f14193a, (Pair) obj);
    }
}

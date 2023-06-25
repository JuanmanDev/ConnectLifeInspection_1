package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ShareInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.c */
/* compiled from: lambda */
public final /* synthetic */ class C7486c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ShareInfoActivity f14181a;

    public /* synthetic */ C7486c(ShareInfoActivity shareInfoActivity) {
        this.f14181a = shareInfoActivity;
    }

    public final void onChanged(Object obj) {
        ShareInfoActivity.m27130subscribeObservable$lambda2(this.f14181a, (Pair) obj);
    }
}

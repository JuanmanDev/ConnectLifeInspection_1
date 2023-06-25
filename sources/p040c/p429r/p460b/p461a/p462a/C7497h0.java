package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.WineLabelPictureActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C7497h0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ WineLabelPictureActivity f14194a;

    public /* synthetic */ C7497h0(WineLabelPictureActivity wineLabelPictureActivity) {
        this.f14194a = wineLabelPictureActivity;
    }

    public final void onChanged(Object obj) {
        WineLabelPictureActivity.m27141subscribeObservable$lambda1(this.f14194a, (Pair) obj);
    }
}

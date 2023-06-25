package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.FirmwareUpdateActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.v0 */
/* compiled from: lambda */
public final /* synthetic */ class C7525v0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ FirmwareUpdateActivity f14223a;

    public /* synthetic */ C7525v0(FirmwareUpdateActivity firmwareUpdateActivity) {
        this.f14223a = firmwareUpdateActivity;
    }

    public final void onChanged(Object obj) {
        FirmwareUpdateActivity.m27111subscribeObservable$lambda2(this.f14223a, (Pair) obj);
    }
}

package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.FirmwareUpdateActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.o */
/* compiled from: lambda */
public final /* synthetic */ class C7510o implements Observer {

    /* renamed from: a */
    public final /* synthetic */ FirmwareUpdateActivity f14208a;

    public /* synthetic */ C7510o(FirmwareUpdateActivity firmwareUpdateActivity) {
        this.f14208a = firmwareUpdateActivity;
    }

    public final void onChanged(Object obj) {
        FirmwareUpdateActivity.m27110subscribeObservable$lambda1(this.f14208a, (Pair) obj);
    }
}

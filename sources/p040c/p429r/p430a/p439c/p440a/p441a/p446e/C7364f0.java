package p040c.p429r.p430a.p439c.p440a.p441a.p446e;

import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.DeviceServiceImpl;
import kotlin.jvm.functions.Function1;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.r.a.c.a.a.e.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C7364f0 implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ Function1 f14049e;

    public /* synthetic */ C7364f0(Function1 function1) {
        this.f14049e = function1;
    }

    public final void accept(Object obj) {
        DeviceServiceImpl.m27018sendCommand$lambda33(this.f14049e, (HiResult) obj);
    }
}

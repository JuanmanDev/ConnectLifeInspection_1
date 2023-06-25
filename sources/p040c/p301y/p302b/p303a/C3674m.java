package p040c.p301y.p302b.p303a;

import com.juconnect.connectlife.ju_ble.BleDeviceManager;

/* renamed from: c.y.b.a.m */
/* compiled from: lambda */
public final /* synthetic */ class C3674m implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ BleDeviceManager f6619e;

    public /* synthetic */ C3674m(BleDeviceManager bleDeviceManager) {
        this.f6619e = bleDeviceManager;
    }

    public final void run() {
        this.f6619e.disconnect();
    }
}

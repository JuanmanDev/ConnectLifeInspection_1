package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGattCallback;

/* renamed from: no.nordicsemi.android.dfu.DfuCallback */
public interface DfuCallback extends DfuController {

    /* renamed from: no.nordicsemi.android.dfu.DfuCallback$DfuGattCallback */
    public static class DfuGattCallback extends BluetoothGattCallback {
        public void onDisconnected() {
        }
    }

    DfuGattCallback getGattCallback();

    void onBondStateChanged(int i);
}

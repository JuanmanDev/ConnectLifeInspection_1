package p040c.p301y.p302b.p303a;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;

/* renamed from: c.y.b.a.p */
/* compiled from: BluetoothStateReceiver */
public class C3678p extends BroadcastReceiver {

    /* renamed from: a */
    public final C3679a f6631a;

    /* renamed from: c.y.b.a.p$a */
    /* compiled from: BluetoothStateReceiver */
    public interface C3679a {
        /* renamed from: a */
        void mo20953a(boolean z);

        /* renamed from: b */
        void mo20954b(String str, boolean z);
    }

    public C3678p(C3679a aVar) {
        this.f6631a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1530327060) {
                if (hashCode != -301431627) {
                    if (hashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        c = 1;
                    }
                } else if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                    c = 0;
                }
            } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                c = 2;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                        if (intExtra == 10) {
                            this.f6631a.mo20953a(false);
                        } else if (intExtra == 12) {
                            this.f6631a.mo20953a(true);
                        }
                    }
                } else if (bluetoothDevice != null) {
                    "蓝牙设备:" + bluetoothDevice.getName() + "已断开连接";
                    this.f6631a.mo20954b(bluetoothDevice.getName(), false);
                }
            } else if (bluetoothDevice != null && ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0) {
                "蓝牙设备:" + bluetoothDevice.getName() + "已连接";
                this.f6631a.mo20954b(bluetoothDevice.getName(), true);
            }
        }
    }
}

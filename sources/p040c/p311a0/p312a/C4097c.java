package p040c.p311a0.p312a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.protobuf.ByteString;
import com.pauldemarco.flutter_blue.Protos$BluetoothDevice;
import com.pauldemarco.flutter_blue.Protos$DeviceStateResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p040c.p311a0.p312a.C4099e;
import p040c.p311a0.p312a.C4103f;
import p040c.p311a0.p312a.C4105g;
import p040c.p311a0.p312a.C4107h;
import p040c.p311a0.p312a.C4109i;
import p040c.p311a0.p312a.C4117m;
import p040c.p311a0.p312a.C4133u;

/* renamed from: c.a0.a.c */
/* compiled from: ProtoMaker */
public class C4097c {
    static {
        UUID.fromString("000002902-0000-1000-8000-00805f9b34fb");
    }

    /* renamed from: a */
    public static C4103f m11078a(BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGatt bluetoothGatt) {
        C4103f.C4104a R = C4103f.m11118R();
        R.mo25333H(bluetoothDevice.getAddress());
        R.mo25336K(bluetoothGattCharacteristic.getUuid().toString());
        R.mo25332G(m11082e(bluetoothGattCharacteristic.getProperties()));
        if (bluetoothGattCharacteristic.getValue() != null) {
            R.mo25337L(ByteString.copyFrom(bluetoothGattCharacteristic.getValue()));
        }
        for (BluetoothGattDescriptor b : bluetoothGattCharacteristic.getDescriptors()) {
            R.mo25331F(m11079b(bluetoothDevice, b));
        }
        if (bluetoothGattCharacteristic.getService().getType() != 0) {
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                Iterator<BluetoothGattService> it = next.getIncludedServices().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothGattService next2 = it.next();
                    if (next2.getUuid().equals(bluetoothGattCharacteristic.getService().getUuid())) {
                        R.mo25335J(next.getUuid().toString());
                        R.mo25334I(next2.getUuid().toString());
                        break;
                    }
                }
            }
        } else {
            R.mo25335J(bluetoothGattCharacteristic.getService().getUuid().toString());
        }
        return (C4103f) R.build();
    }

    /* renamed from: b */
    public static C4105g m11079b(BluetoothDevice bluetoothDevice, BluetoothGattDescriptor bluetoothGattDescriptor) {
        C4105g.C4106a N = C4105g.m11141N();
        N.mo25344G(bluetoothDevice.getAddress());
        N.mo25346I(bluetoothGattDescriptor.getUuid().toString());
        N.mo25343F(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
        N.mo25345H(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
        if (bluetoothGattDescriptor.getValue() != null) {
            N.mo25347J(ByteString.copyFrom(bluetoothGattDescriptor.getValue()));
        }
        return (C4105g) N.build();
    }

    /* renamed from: c */
    public static Protos$BluetoothDevice m11080c(BluetoothDevice bluetoothDevice) {
        Protos$BluetoothDevice.C8751a L = Protos$BluetoothDevice.m23498L();
        L.mo45647G(bluetoothDevice.getAddress());
        String name = bluetoothDevice.getName();
        if (name != null) {
            L.mo45646F(name);
        }
        int type = bluetoothDevice.getType();
        if (type == 1) {
            L.mo45648H(Protos$BluetoothDevice.Type.CLASSIC);
        } else if (type == 2) {
            L.mo45648H(Protos$BluetoothDevice.Type.LE);
        } else if (type != 3) {
            L.mo45648H(Protos$BluetoothDevice.Type.UNKNOWN);
        } else {
            L.mo45648H(Protos$BluetoothDevice.Type.DUAL);
        }
        return (Protos$BluetoothDevice) L.build();
    }

    /* renamed from: d */
    public static C4107h m11081d(BluetoothDevice bluetoothDevice, BluetoothGattService bluetoothGattService, BluetoothGatt bluetoothGatt) {
        C4107h.C4108a R = C4107h.m11159R();
        R.mo25358I(bluetoothDevice.getAddress());
        R.mo25359J(bluetoothGattService.getUuid().toString());
        R.mo25357H(bluetoothGattService.getType() == 0);
        for (BluetoothGattCharacteristic a : bluetoothGattService.getCharacteristics()) {
            R.mo25355F(m11078a(bluetoothDevice, a, bluetoothGatt));
        }
        for (BluetoothGattService d : bluetoothGattService.getIncludedServices()) {
            R.mo25356G(m11081d(bluetoothDevice, d, bluetoothGatt));
        }
        return (C4107h) R.build();
    }

    /* renamed from: e */
    public static C4109i m11082e(int i) {
        C4109i.C4110a S = C4109i.m11184S();
        boolean z = false;
        S.mo25371G((i & 1) != 0);
        S.mo25377M((i & 2) != 0);
        S.mo25379P((i & 4) != 0);
        S.mo25378N((i & 8) != 0);
        S.mo25375K((i & 16) != 0);
        S.mo25373I((i & 32) != 0);
        S.mo25370F((i & 64) != 0);
        S.mo25372H((i & 128) != 0);
        S.mo25376L((i & 256) != 0);
        if ((i & 512) != 0) {
            z = true;
        }
        S.mo25374J(z);
        return (C4109i) S.build();
    }

    /* renamed from: f */
    public static Protos$DeviceStateResponse m11083f(BluetoothDevice bluetoothDevice, int i) {
        Protos$DeviceStateResponse.C8757a K = Protos$DeviceStateResponse.m23521K();
        if (i == 0) {
            K.mo45656G(Protos$DeviceStateResponse.BluetoothDeviceState.DISCONNECTED);
        } else if (i == 1) {
            K.mo45656G(Protos$DeviceStateResponse.BluetoothDeviceState.CONNECTING);
        } else if (i == 2) {
            K.mo45656G(Protos$DeviceStateResponse.BluetoothDeviceState.CONNECTED);
        } else if (i == 3) {
            K.mo45656G(Protos$DeviceStateResponse.BluetoothDeviceState.DISCONNECTING);
        }
        K.mo45655F(bluetoothDevice.getAddress());
        return (Protos$DeviceStateResponse) K.build();
    }

    @TargetApi(21)
    /* renamed from: g */
    public static C4133u m11084g(BluetoothDevice bluetoothDevice, ScanResult scanResult) {
        C4133u.C4134a L = C4133u.m11309L();
        L.mo25433G(m11080c(bluetoothDevice));
        C4099e.C4100a U = C4099e.m11093U();
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (Build.VERSION.SDK_INT >= 26) {
            U.mo25320I(scanResult.isConnectable());
        } else if (scanRecord != null) {
            U.mo25320I((scanRecord.getAdvertiseFlags() & 2) > 0);
        }
        if (scanRecord != null) {
            String deviceName = scanRecord.getDeviceName();
            if (deviceName != null) {
                U.mo25321J(deviceName);
            }
            int txPowerLevel = scanRecord.getTxPowerLevel();
            if (txPowerLevel != Integer.MIN_VALUE) {
                C4117m.C4118a J = C4117m.m11230J();
                J.mo25391F(txPowerLevel);
                U.mo25322K(J);
            }
            SparseArray<byte[]> manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
            for (int i = 0; i < manufacturerSpecificData.size(); i++) {
                U.mo25318G(manufacturerSpecificData.keyAt(i), ByteString.copyFrom(manufacturerSpecificData.valueAt(i)));
            }
            for (Map.Entry next : scanRecord.getServiceData().entrySet()) {
                U.mo25319H(((ParcelUuid) next.getKey()).getUuid().toString(), ByteString.copyFrom((byte[]) next.getValue()));
            }
            List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
            if (serviceUuids != null) {
                for (ParcelUuid uuid : serviceUuids) {
                    U.mo25317F(uuid.getUuid().toString());
                }
            }
        }
        L.mo25434H(scanResult.getRssi());
        L.mo25432F((C4099e) U.build());
        return (C4133u) L.build();
    }

    /* renamed from: h */
    public static C4133u m11085h(BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        C4133u.C4134a L = C4133u.m11309L();
        L.mo25433G(m11080c(bluetoothDevice));
        if (bArr != null && bArr.length > 0) {
            L.mo25432F(C4085a.m11044a(bArr));
        }
        L.mo25434H(i);
        return (C4133u) L.build();
    }
}

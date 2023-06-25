package p040c.p311a0.p312a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ParcelUuid;
import com.clj.fastble.bluetooth.BleConnector;
import com.google.protobuf.ByteString;
import com.pauldemarco.flutter_blue.Protos$BluetoothState;
import com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p040c.p311a0.p312a.C4086a0;
import p040c.p311a0.p312a.C4115l;
import p040c.p311a0.p312a.C4121o;
import p040c.p311a0.p312a.C4123p;
import p040c.p311a0.p312a.C4127r;
import p040c.p311a0.p312a.C4129s;
import p040c.p311a0.p312a.C4131t;
import p040c.p311a0.p312a.C4135v;
import p040c.p311a0.p312a.C4139x;
import p040c.p311a0.p312a.C4141y;
import p040c.p311a0.p312a.C4143z;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9006d;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: c.a0.a.b */
/* compiled from: FlutterBluePlugin */
public class C4088b implements C8944a, C8948a, C9017j.C9021c, C9024l.C9028d {

    /* renamed from: D */
    public static final UUID f8603D = UUID.fromString(BleConnector.UUID_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR);

    /* renamed from: A */
    public ScanCallback f8604A;

    /* renamed from: B */
    public BluetoothAdapter.LeScanCallback f8605B;

    /* renamed from: C */
    public final BluetoothGattCallback f8606C = new C4093d();

    /* renamed from: e */
    public Object f8607e = new Object();

    /* renamed from: l */
    public Context f8608l;

    /* renamed from: m */
    public C9017j f8609m;

    /* renamed from: n */
    public C9006d f8610n;

    /* renamed from: o */
    public BluetoothManager f8611o;

    /* renamed from: p */
    public BluetoothAdapter f8612p;

    /* renamed from: q */
    public C8944a.C8946b f8613q;

    /* renamed from: r */
    public C8950c f8614r;

    /* renamed from: s */
    public Activity f8615s;

    /* renamed from: t */
    public final Map<String, C4095f> f8616t = new HashMap();

    /* renamed from: u */
    public C4096g f8617u = C4096g.EMERGENCY;

    /* renamed from: v */
    public C9016i f8618v;

    /* renamed from: w */
    public C9017j.C9022d f8619w;

    /* renamed from: x */
    public ArrayList<String> f8620x = new ArrayList<>();

    /* renamed from: y */
    public boolean f8621y = false;

    /* renamed from: z */
    public final C9006d.C9011d f8622z = new C4089a();

    /* renamed from: c.a0.a.b$a */
    /* compiled from: FlutterBluePlugin */
    public class C4089a implements C9006d.C9011d {

        /* renamed from: e */
        public C9006d.C9008b f8623e;

        /* renamed from: l */
        public final BroadcastReceiver f8624l = new C4090a();

        /* renamed from: c.a0.a.b$a$a */
        /* compiled from: FlutterBluePlugin */
        public class C4090a extends BroadcastReceiver {
            public C4090a() {
            }

            public void onReceive(Context context, Intent intent) {
                if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                    switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                        case 10:
                            C9006d.C9008b a = C4089a.this.f8623e;
                            Protos$BluetoothState.C8754a J = Protos$BluetoothState.m23511J();
                            J.mo45651F(Protos$BluetoothState.State.OFF);
                            a.success(((Protos$BluetoothState) J.build()).mo31732f());
                            return;
                        case 11:
                            C9006d.C9008b a2 = C4089a.this.f8623e;
                            Protos$BluetoothState.C8754a J2 = Protos$BluetoothState.m23511J();
                            J2.mo45651F(Protos$BluetoothState.State.TURNING_ON);
                            a2.success(((Protos$BluetoothState) J2.build()).mo31732f());
                            return;
                        case 12:
                            C9006d.C9008b a3 = C4089a.this.f8623e;
                            Protos$BluetoothState.C8754a J3 = Protos$BluetoothState.m23511J();
                            J3.mo45651F(Protos$BluetoothState.State.ON);
                            a3.success(((Protos$BluetoothState) J3.build()).mo31732f());
                            return;
                        case 13:
                            C9006d.C9008b a4 = C4089a.this.f8623e;
                            Protos$BluetoothState.C8754a J4 = Protos$BluetoothState.m23511J();
                            J4.mo45651F(Protos$BluetoothState.State.TURNING_OFF);
                            a4.success(((Protos$BluetoothState) J4.build()).mo31732f());
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        public C4089a() {
        }

        public void onCancel(Object obj) {
            this.f8623e = null;
            C4088b.this.f8608l.unregisterReceiver(this.f8624l);
        }

        public void onListen(Object obj, C9006d.C9008b bVar) {
            this.f8623e = bVar;
            C4088b.this.f8608l.registerReceiver(this.f8624l, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* renamed from: c.a0.a.b$b */
    /* compiled from: FlutterBluePlugin */
    public class C4091b extends ScanCallback {
        public C4091b() {
        }

        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        public void onScanFailed(int i) {
            super.onScanFailed(i);
        }

        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            if (!(C4088b.this.f8621y || scanResult == null || scanResult.getDevice() == null || scanResult.getDevice().getAddress() == null)) {
                if (!C4088b.this.f8620x.contains(scanResult.getDevice().getAddress())) {
                    C4088b.this.f8620x.add(scanResult.getDevice().getAddress());
                } else {
                    return;
                }
            }
            C4088b.this.mo25276l("ScanResult", C4097c.m11084g(scanResult.getDevice(), scanResult).mo31732f());
        }
    }

    /* renamed from: c.a0.a.b$c */
    /* compiled from: FlutterBluePlugin */
    public class C4092c implements BluetoothAdapter.LeScanCallback {
        public C4092c() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (!(C4088b.this.f8621y || bluetoothDevice == null || bluetoothDevice.getAddress() == null)) {
                if (!C4088b.this.f8620x.contains(bluetoothDevice.getAddress())) {
                    C4088b.this.f8620x.add(bluetoothDevice.getAddress());
                } else {
                    return;
                }
            }
            C4088b.this.mo25276l("ScanResult", C4097c.m11085h(bluetoothDevice, bArr, i).mo31732f());
        }
    }

    /* renamed from: c.a0.a.b$d */
    /* compiled from: FlutterBluePlugin */
    public class C4093d extends BluetoothGattCallback {
        public C4093d() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onCharacteristicChanged] uuid: " + bluetoothGattCharacteristic.getUuid().toString());
            C4123p.C4124a K = C4123p.m11251K();
            K.mo25401G(bluetoothGatt.getDevice().getAddress());
            K.mo25400F(C4097c.m11078a(bluetoothGatt.getDevice(), bluetoothGattCharacteristic, bluetoothGatt));
            C4088b.this.mo25276l("OnCharacteristicChanged", ((C4123p) K.build()).mo31732f());
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onCharacteristicRead] uuid: " + bluetoothGattCharacteristic.getUuid().toString() + " status: " + i);
            C4127r.C4128a K = C4127r.m11267K();
            K.mo25409G(bluetoothGatt.getDevice().getAddress());
            K.mo25408F(C4097c.m11078a(bluetoothGatt.getDevice(), bluetoothGattCharacteristic, bluetoothGatt));
            C4088b.this.mo25276l("ReadCharacteristicResponse", ((C4127r) K.build()).mo31732f());
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onCharacteristicWrite] uuid: " + bluetoothGattCharacteristic.getUuid().toString() + " status: " + i);
            Protos$WriteCharacteristicRequest.C8760a R = Protos$WriteCharacteristicRequest.m23534R();
            R.mo45668G(bluetoothGatt.getDevice().getAddress());
            R.mo45667F(bluetoothGattCharacteristic.getUuid().toString());
            R.mo45669H(bluetoothGattCharacteristic.getService().getUuid().toString());
            C4141y.C4142a K = C4141y.m11345K();
            K.mo25451F(R);
            K.mo25452G(i == 0);
            C4088b.this.mo25276l("WriteCharacteristicResponse", ((C4141y) K.build()).mo31732f());
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onConnectionStateChange] status: " + i + " newState: " + i2);
            if (i2 == 0 && !C4088b.this.f8616t.containsKey(bluetoothGatt.getDevice().getAddress())) {
                bluetoothGatt.close();
            }
            C4088b.this.mo25276l("DeviceState", C4097c.m11083f(bluetoothGatt.getDevice(), i2).mo31732f());
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onDescriptorRead] uuid: " + bluetoothGattDescriptor.getUuid().toString() + " status: " + i);
            C4129s.C4130a S = C4129s.m11279S();
            S.mo25422H(bluetoothGatt.getDevice().getAddress());
            S.mo25420F(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
            S.mo25421G(bluetoothGattDescriptor.getUuid().toString());
            if (bluetoothGattDescriptor.getCharacteristic().getService().getType() != 0) {
                for (BluetoothGattService next : bluetoothGatt.getServices()) {
                    Iterator<BluetoothGattService> it = next.getIncludedServices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothGattService next2 = it.next();
                        if (next2.getUuid().equals(bluetoothGattDescriptor.getCharacteristic().getService().getUuid())) {
                            S.mo25424J(next.getUuid().toString());
                            S.mo25423I(next2.getUuid().toString());
                            break;
                        }
                    }
                }
            } else {
                S.mo25424J(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
            }
            C4131t.C4132a K = C4131t.m11299K();
            K.mo25427F(S);
            K.mo25428G(ByteString.copyFrom(bluetoothGattDescriptor.getValue()));
            C4088b.this.mo25276l("ReadDescriptorResponse", ((C4131t) K.build()).mo31732f());
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onDescriptorWrite] uuid: " + bluetoothGattDescriptor.getUuid().toString() + " status: " + i);
            C4143z.C4144a S = C4143z.m11356S();
            S.mo25465H(bluetoothGatt.getDevice().getAddress());
            S.mo25464G(bluetoothGattDescriptor.getUuid().toString());
            S.mo25463F(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
            S.mo25466I(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
            C4086a0.C4087a K = C4086a0.m11048K();
            K.mo25272F(S);
            K.mo25273G(i == 0);
            C4088b.this.mo25276l("WriteDescriptorResponse", ((C4086a0) K.build()).mo31732f());
            if (bluetoothGattDescriptor.getUuid().compareTo(C4088b.f8603D) == 0) {
                C4139x.C4140a K2 = C4139x.m11336K();
                K2.mo25448G(bluetoothGatt.getDevice().getAddress());
                K2.mo25447F(C4097c.m11078a(bluetoothGatt.getDevice(), bluetoothGattDescriptor.getCharacteristic(), bluetoothGatt));
                C4088b.this.mo25276l("SetNotificationResponse", ((C4139x) K2.build()).mo31732f());
            }
        }

        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onMtuChanged] mtu: " + i + " status: " + i2);
            if (i2 == 0 && C4088b.this.f8616t.containsKey(bluetoothGatt.getDevice().getAddress())) {
                ((C4095f) C4088b.this.f8616t.get(bluetoothGatt.getDevice().getAddress())).f8634b = i;
                C4121o.C4122a K = C4121o.m11242K();
                K.mo25397G(bluetoothGatt.getDevice().getAddress());
                K.mo25396F(i);
                C4088b.this.mo25276l("MtuSize", ((C4121o) K.build()).mo31732f());
            }
        }

        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onReadRemoteRssi] rssi: " + i + " status: " + i2);
        }

        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onReliableWriteCompleted] status: " + i);
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            C4088b bVar = C4088b.this;
            C4096g gVar = C4096g.DEBUG;
            bVar.mo25281p(gVar, "[onServicesDiscovered] count: " + bluetoothGatt.getServices().size() + " status: " + i);
            C4115l.C4116a M = C4115l.m11221M();
            M.mo25389G(bluetoothGatt.getDevice().getAddress());
            for (BluetoothGattService d : bluetoothGatt.getServices()) {
                M.mo25388F(C4097c.m11081d(bluetoothGatt.getDevice(), d, bluetoothGatt));
            }
            C4088b.this.mo25276l("DiscoverServicesResult", ((C4115l) M.build()).mo31732f());
        }
    }

    /* renamed from: c.a0.a.b$e */
    /* compiled from: FlutterBluePlugin */
    public class C4094e implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f8630e;

        /* renamed from: l */
        public final /* synthetic */ byte[] f8631l;

        public C4094e(String str, byte[] bArr) {
            this.f8630e = str;
            this.f8631l = bArr;
        }

        public void run() {
            C4088b.this.f8609m.mo46573c(this.f8630e, this.f8631l);
        }
    }

    /* renamed from: c.a0.a.b$f */
    /* compiled from: FlutterBluePlugin */
    public class C4095f {

        /* renamed from: a */
        public final BluetoothGatt f8633a;

        /* renamed from: b */
        public int f8634b = 20;

        public C4095f(C4088b bVar, BluetoothGatt bluetoothGatt) {
            this.f8633a = bluetoothGatt;
        }
    }

    /* renamed from: c.a0.a.b$g */
    /* compiled from: FlutterBluePlugin */
    public enum C4096g {
        EMERGENCY,
        ALERT,
        CRITICAL,
        ERROR,
        WARNING,
        NOTICE,
        INFO,
        DEBUG
    }

    /* renamed from: j */
    public final BluetoothAdapter.LeScanCallback mo25274j() {
        if (this.f8605B == null) {
            this.f8605B = new C4092c();
        }
        return this.f8605B;
    }

    @TargetApi(21)
    /* renamed from: k */
    public final ScanCallback mo25275k() {
        if (this.f8604A == null) {
            this.f8604A = new C4091b();
        }
        return this.f8604A;
    }

    /* renamed from: l */
    public final void mo25276l(String str, byte[] bArr) {
        this.f8615s.runOnUiThread(new C4094e(str, bArr));
    }

    /* renamed from: m */
    public final BluetoothGattCharacteristic mo25277m(BluetoothGatt bluetoothGatt, String str, String str2, String str3) {
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(str));
        if (service != null) {
            BluetoothGattService bluetoothGattService = null;
            if (str2.length() > 0) {
                for (BluetoothGattService next : service.getIncludedServices()) {
                    if (next.getUuid().equals(UUID.fromString(str2))) {
                        bluetoothGattService = next;
                    }
                }
                if (bluetoothGattService == null) {
                    throw new Exception("secondary service (" + str2 + ") could not be located on the device");
                }
            }
            if (bluetoothGattService != null) {
                service = bluetoothGattService;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str3));
            if (characteristic != null) {
                return characteristic;
            }
            throw new Exception("characteristic (" + str3 + ") could not be located in the service (" + service.getUuid().toString() + ")");
        }
        throw new Exception("service (" + str + ") could not be located on the device");
    }

    /* renamed from: n */
    public final BluetoothGattDescriptor mo25278n(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(str));
        if (descriptor != null) {
            return descriptor;
        }
        throw new Exception("descriptor (" + str + ") could not be located in the characteristic (" + bluetoothGattCharacteristic.getUuid().toString() + ")");
    }

    /* renamed from: o */
    public final BluetoothGatt mo25279o(String str) {
        BluetoothGatt bluetoothGatt;
        C4095f fVar = this.f8616t.get(str);
        if (fVar != null && (bluetoothGatt = fVar.f8633a) != null) {
            return bluetoothGatt;
        }
        throw new Exception("no instance of BluetoothGatt, have you connected first?");
    }

    public void onAttachedToActivity(C8950c cVar) {
        this.f8614r = cVar;
        mo25282q(this.f8613q.mo46465b(), (Application) this.f8613q.mo46464a(), this.f8614r.mo46419d(), (C9024l.C9027c) null, this.f8614r);
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        this.f8613q = bVar;
    }

    public void onDetachedFromActivity() {
        mo25289x();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f8613q = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r18, p553f.p554a.p570e.p571a.C9017j.C9022d r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "read_descriptor_error"
            java.lang.String r4 = "read_characteristic_error"
            java.lang.String r5 = "discover_services_error"
            java.lang.String r6 = "write_descriptor_error"
            java.lang.String r7 = "write_characteristic_error"
            java.lang.String r8 = "set_notification_error"
            android.bluetooth.BluetoothAdapter r9 = r1.f8612p
            java.lang.String r10 = "isAvailable"
            r11 = 0
            if (r9 != 0) goto L_0x0029
            java.lang.String r9 = r0.f17687a
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0029
            java.lang.String r0 = "bluetooth_unavailable"
            java.lang.String r3 = "the device does not have bluetooth"
            r2.error(r0, r3, r11)
            return
        L_0x0029:
            java.lang.String r9 = r0.f17687a
            int r13 = r9.hashCode()
            java.lang.String r15 = "mtu"
            r16 = 0
            java.lang.String r12 = "requestMtu"
            r14 = 7
            switch(r13) {
                case -2129330689: goto L_0x00fe;
                case -2064454390: goto L_0x00f4;
                case -1553974309: goto L_0x00e9;
                case -1301283666: goto L_0x00de;
                case -1162471827: goto L_0x00d3;
                case -1130630310: goto L_0x00c8;
                case -938333999: goto L_0x00bd;
                case -309915358: goto L_0x00b2;
                case 108462: goto L_0x00a9;
                case 3241129: goto L_0x009f;
                case 37093023: goto L_0x0095;
                case 109757585: goto L_0x008a;
                case 206669221: goto L_0x007e;
                case 444517567: goto L_0x0075;
                case 530405532: goto L_0x0069;
                case 951351530: goto L_0x005e;
                case 1379209310: goto L_0x0052;
                case 1614410599: goto L_0x0046;
                case 1714778527: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0108
        L_0x003b:
            java.lang.String r10 = "stopScan"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 5
            goto L_0x0109
        L_0x0046:
            java.lang.String r10 = "discoverServices"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 10
            goto L_0x0109
        L_0x0052:
            java.lang.String r10 = "services"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 11
            goto L_0x0109
        L_0x005e:
            java.lang.String r10 = "connect"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = r14
            goto L_0x0109
        L_0x0069:
            java.lang.String r10 = "disconnect"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 8
            goto L_0x0109
        L_0x0075:
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 2
            goto L_0x0109
        L_0x007e:
            java.lang.String r10 = "readDescriptor"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 13
            goto L_0x0109
        L_0x008a:
            java.lang.String r10 = "state"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 1
            goto L_0x0109
        L_0x0095:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0108
            r9 = 18
            goto L_0x0109
        L_0x009f:
            java.lang.String r10 = "isOn"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 3
            goto L_0x0109
        L_0x00a9:
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x0108
            r9 = 17
            goto L_0x0109
        L_0x00b2:
            java.lang.String r10 = "setLogLevel"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = r16
            goto L_0x0109
        L_0x00bd:
            java.lang.String r10 = "readCharacteristic"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 12
            goto L_0x0109
        L_0x00c8:
            java.lang.String r10 = "writeCharacteristic"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 14
            goto L_0x0109
        L_0x00d3:
            java.lang.String r10 = "setNotification"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 16
            goto L_0x0109
        L_0x00de:
            java.lang.String r10 = "writeDescriptor"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 15
            goto L_0x0109
        L_0x00e9:
            java.lang.String r10 = "deviceState"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 9
            goto L_0x0109
        L_0x00f4:
            java.lang.String r10 = "getConnectedDevices"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 6
            goto L_0x0109
        L_0x00fe:
            java.lang.String r10 = "startScan"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0108
            r9 = 4
            goto L_0x0109
        L_0x0108:
            r9 = -1
        L_0x0109:
            java.lang.String r10 = "writeCharacteristic failed"
            java.lang.String r13 = "RuntimeException"
            switch(r9) {
                case 0: goto L_0x064c;
                case 1: goto L_0x060d;
                case 2: goto L_0x05fe;
                case 3: goto L_0x05f0;
                case 4: goto L_0x05cc;
                case 5: goto L_0x05c4;
                case 6: goto L_0x0577;
                case 7: goto L_0x04dd;
                case 8: goto L_0x04b4;
                case 9: goto L_0x048b;
                case 10: goto L_0x0467;
                case 11: goto L_0x041d;
                case 12: goto L_0x03cb;
                case 13: goto L_0x0371;
                case 14: goto L_0x02fe;
                case 15: goto L_0x0294;
                case 16: goto L_0x01aa;
                case 17: goto L_0x017a;
                case 18: goto L_0x0115;
                default: goto L_0x0110;
            }
        L_0x0110:
            r19.notImplemented()
            goto L_0x065f
        L_0x0115:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.n$a r3 = p040c.p311a0.p312a.C4119n.m11235K()     // Catch:{ InvalidProtocolBufferException -> 0x0170 }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x0170 }
            c.a0.a.n$a r3 = (p040c.p311a0.p312a.C4119n.C4120a) r3     // Catch:{ InvalidProtocolBufferException -> 0x0170 }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x0170 }
            c.a0.a.n r0 = (p040c.p311a0.p312a.C4119n) r0     // Catch:{ InvalidProtocolBufferException -> 0x0170 }
            java.lang.String r3 = r0.mo25393J()     // Catch:{ Exception -> 0x0166 }
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r3)     // Catch:{ Exception -> 0x0166 }
            int r0 = r0.mo25392I()     // Catch:{ Exception -> 0x0166 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0166 }
            r5 = 21
            if (r4 < r5) goto L_0x014e
            boolean r0 = r3.requestMtu(r0)     // Catch:{ Exception -> 0x0166 }
            if (r0 == 0) goto L_0x0147
            r2.success(r11)     // Catch:{ Exception -> 0x0166 }
            goto L_0x065f
        L_0x0147:
            java.lang.String r0 = "gatt.requestMtu returned false"
            r2.error(r12, r0, r11)     // Catch:{ Exception -> 0x0166 }
            goto L_0x065f
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0166 }
            r0.<init>()     // Catch:{ Exception -> 0x0166 }
            java.lang.String r3 = "Only supported on devices >= API 21 (Lollipop). This device == "
            r0.append(r3)     // Catch:{ Exception -> 0x0166 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0166 }
            r0.append(r3)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0166 }
            r2.error(r12, r0, r11)     // Catch:{ Exception -> 0x0166 }
            goto L_0x065f
        L_0x0166:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r12, r3, r0)
            goto L_0x065f
        L_0x0170:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x017a:
            java.lang.Object r0 = r0.f17688b
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, c.a0.a.b$f> r3 = r1.f8616t
            java.lang.Object r3 = r3.get(r0)
            c.a0.a.b$f r3 = (p040c.p311a0.p312a.C4088b.C4095f) r3
            if (r3 == 0) goto L_0x01a3
            c.a0.a.o$a r4 = p040c.p311a0.p312a.C4121o.m11242K()
            r4.mo25397G(r0)
            int r0 = r3.f8634b
            r4.mo25396F(r0)
            com.google.protobuf.GeneratedMessageLite r0 = r4.build()
            c.a0.a.o r0 = (p040c.p311a0.p312a.C4121o) r0
            byte[] r0 = r0.mo31732f()
            r2.success(r0)
            goto L_0x065f
        L_0x01a3:
            java.lang.String r0 = "no instance of BluetoothGatt, have you connected first?"
            r2.error(r15, r0, r11)
            goto L_0x065f
        L_0x01aa:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.w$a r3 = p040c.p311a0.p312a.C4137w.m11326N()     // Catch:{ InvalidProtocolBufferException -> 0x028a }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x028a }
            c.a0.a.w$a r3 = (p040c.p311a0.p312a.C4137w.C4138a) r3     // Catch:{ InvalidProtocolBufferException -> 0x028a }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x028a }
            c.a0.a.w r0 = (p040c.p311a0.p312a.C4137w) r0     // Catch:{ InvalidProtocolBufferException -> 0x028a }
            java.lang.String r3 = r0.mo25442K()     // Catch:{ Exception -> 0x0281 }
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r3)     // Catch:{ Exception -> 0x0281 }
            java.lang.String r4 = r0.mo25444M()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r5 = r0.mo25443L()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r6 = r0.mo25440I()     // Catch:{ Exception -> 0x0281 }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mo25277m(r3, r4, r5, r6)     // Catch:{ Exception -> 0x0281 }
            java.util.UUID r5 = f8603D     // Catch:{ Exception -> 0x0281 }
            android.bluetooth.BluetoothGattDescriptor r5 = r4.getDescriptor(r5)     // Catch:{ Exception -> 0x0281 }
            if (r5 == 0) goto L_0x0262
            boolean r6 = r0.mo25441J()
            if (r6 == 0) goto L_0x0211
            int r6 = r4.getProperties()
            r7 = 16
            r6 = r6 & r7
            if (r6 <= 0) goto L_0x01f0
            r6 = 1
            goto L_0x01f2
        L_0x01f0:
            r6 = r16
        L_0x01f2:
            int r7 = r4.getProperties()
            r7 = r7 & 32
            if (r7 <= 0) goto L_0x01fc
            r16 = 1
        L_0x01fc:
            if (r16 != 0) goto L_0x0206
            if (r6 != 0) goto L_0x0206
            java.lang.String r0 = "the characteristic cannot notify or indicate"
            r2.error(r8, r0, r11)
            return
        L_0x0206:
            if (r16 == 0) goto L_0x020b
            byte[] r7 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
            goto L_0x020c
        L_0x020b:
            r7 = r11
        L_0x020c:
            if (r6 == 0) goto L_0x0213
            byte[] r7 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
            goto L_0x0213
        L_0x0211:
            byte[] r7 = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
        L_0x0213:
            boolean r6 = r0.mo25441J()
            boolean r4 = r3.setCharacteristicNotification(r4, r6)
            if (r4 != 0) goto L_0x0236
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "could not set characteristic notifications to :"
            r3.append(r4)
            boolean r0 = r0.mo25441J()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.error(r8, r0, r11)
            return
        L_0x0236:
            boolean r0 = r5.setValue(r7)
            if (r0 != 0) goto L_0x0251
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "error when setting the descriptor value to: "
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r2.error(r8, r0, r11)
            return
        L_0x0251:
            boolean r0 = r3.writeDescriptor(r5)
            if (r0 != 0) goto L_0x025d
            java.lang.String r0 = "error when writing the descriptor"
            r2.error(r8, r0, r11)
            return
        L_0x025d:
            r2.success(r11)
            goto L_0x065f
        L_0x0262:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0281 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0281 }
            r3.<init>()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r5 = "could not locate CCCD descriptor for characteristic: "
            r3.append(r5)     // Catch:{ Exception -> 0x0281 }
            java.util.UUID r4 = r4.getUuid()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0281 }
            r3.append(r4)     // Catch:{ Exception -> 0x0281 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0281 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0281 }
            throw r0     // Catch:{ Exception -> 0x0281 }
        L_0x0281:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.error(r8, r0, r11)
            return
        L_0x028a:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x0294:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.z$a r3 = p040c.p311a0.p312a.C4143z.m11356S()     // Catch:{ InvalidProtocolBufferException -> 0x02f4 }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x02f4 }
            c.a0.a.z$a r3 = (p040c.p311a0.p312a.C4143z.C4144a) r3     // Catch:{ InvalidProtocolBufferException -> 0x02f4 }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x02f4 }
            c.a0.a.z r0 = (p040c.p311a0.p312a.C4143z) r0     // Catch:{ InvalidProtocolBufferException -> 0x02f4 }
            java.lang.String r3 = r0.mo25455O()     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r3)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r4 = r0.mo25457Q()     // Catch:{ Exception -> 0x02eb }
            java.lang.String r5 = r0.mo25456P()     // Catch:{ Exception -> 0x02eb }
            java.lang.String r7 = r0.mo25453M()     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mo25277m(r3, r4, r5, r7)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r5 = r0.mo25454N()     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothGattDescriptor r4 = r1.mo25278n(r4, r5)     // Catch:{ Exception -> 0x02eb }
            com.google.protobuf.ByteString r0 = r0.mo25458R()
            byte[] r0 = r0.toByteArray()
            boolean r0 = r4.setValue(r0)
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = "could not set the local value for descriptor"
            r2.error(r6, r0, r11)
        L_0x02dc:
            boolean r0 = r3.writeDescriptor(r4)
            if (r0 != 0) goto L_0x02e6
            r2.error(r6, r10, r11)
            return
        L_0x02e6:
            r2.success(r11)
            goto L_0x065f
        L_0x02eb:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.error(r6, r0, r11)
            return
        L_0x02f4:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x02fe:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$a r3 = com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest.m23534R()     // Catch:{ InvalidProtocolBufferException -> 0x0367 }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x0367 }
            com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$a r3 = (com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest.C8760a) r3     // Catch:{ InvalidProtocolBufferException -> 0x0367 }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x0367 }
            com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest r0 = (com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest) r0     // Catch:{ InvalidProtocolBufferException -> 0x0367 }
            java.lang.String r3 = r0.mo45658M()     // Catch:{ Exception -> 0x035e }
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r3)     // Catch:{ Exception -> 0x035e }
            java.lang.String r4 = r0.mo45660O()     // Catch:{ Exception -> 0x035e }
            java.lang.String r5 = r0.mo45659N()     // Catch:{ Exception -> 0x035e }
            java.lang.String r6 = r0.mo45657L()     // Catch:{ Exception -> 0x035e }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mo25277m(r3, r4, r5, r6)     // Catch:{ Exception -> 0x035e }
            com.google.protobuf.ByteString r5 = r0.mo45661P()
            byte[] r5 = r5.toByteArray()
            boolean r5 = r4.setValue(r5)
            if (r5 != 0) goto L_0x033e
            java.lang.String r5 = "could not set the local value of characteristic"
            r2.error(r7, r5, r11)
        L_0x033e:
            com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$WriteType r0 = r0.mo45662Q()
            com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$WriteType r5 = com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest.WriteType.WITHOUT_RESPONSE
            if (r0 != r5) goto L_0x034b
            r0 = 1
            r4.setWriteType(r0)
            goto L_0x034f
        L_0x034b:
            r0 = 2
            r4.setWriteType(r0)
        L_0x034f:
            boolean r0 = r3.writeCharacteristic(r4)
            if (r0 != 0) goto L_0x0359
            r2.error(r7, r10, r11)
            return
        L_0x0359:
            r2.success(r11)
            goto L_0x065f
        L_0x035e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.error(r7, r0, r11)
            return
        L_0x0367:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x0371:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.s$a r4 = p040c.p311a0.p312a.C4129s.m11279S()     // Catch:{ InvalidProtocolBufferException -> 0x03c1 }
            r4.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x03c1 }
            c.a0.a.s$a r4 = (p040c.p311a0.p312a.C4129s.C4130a) r4     // Catch:{ InvalidProtocolBufferException -> 0x03c1 }
            com.google.protobuf.GeneratedMessageLite r0 = r4.build()     // Catch:{ InvalidProtocolBufferException -> 0x03c1 }
            c.a0.a.s r0 = (p040c.p311a0.p312a.C4129s) r0     // Catch:{ InvalidProtocolBufferException -> 0x03c1 }
            java.lang.String r4 = r0.mo25412P()     // Catch:{ Exception -> 0x03b8 }
            android.bluetooth.BluetoothGatt r4 = r1.mo25279o(r4)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r5 = r0.mo25414R()     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r6 = r0.mo25413Q()     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r7 = r0.mo25410N()     // Catch:{ Exception -> 0x03b8 }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mo25277m(r4, r5, r6, r7)     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r0 = r0.mo25411O()     // Catch:{ Exception -> 0x03b8 }
            android.bluetooth.BluetoothGattDescriptor r0 = r1.mo25278n(r5, r0)     // Catch:{ Exception -> 0x03b8 }
            boolean r0 = r4.readDescriptor(r0)
            if (r0 == 0) goto L_0x03b1
            r2.success(r11)
            goto L_0x065f
        L_0x03b1:
            java.lang.String r0 = "unknown reason, may occur if readDescriptor was called before last read finished."
            r2.error(r3, r0, r11)
            goto L_0x065f
        L_0x03b8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.error(r3, r0, r11)
            return
        L_0x03c1:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x03cb:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.q$a r3 = p040c.p311a0.p312a.C4125q.m11258M()     // Catch:{ InvalidProtocolBufferException -> 0x0413 }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x0413 }
            c.a0.a.q$a r3 = (p040c.p311a0.p312a.C4125q.C4126a) r3     // Catch:{ InvalidProtocolBufferException -> 0x0413 }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x0413 }
            c.a0.a.q r0 = (p040c.p311a0.p312a.C4125q) r0     // Catch:{ InvalidProtocolBufferException -> 0x0413 }
            java.lang.String r3 = r0.mo25403J()     // Catch:{ Exception -> 0x040a }
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r3)     // Catch:{ Exception -> 0x040a }
            java.lang.String r5 = r0.mo25405L()     // Catch:{ Exception -> 0x040a }
            java.lang.String r6 = r0.mo25404K()     // Catch:{ Exception -> 0x040a }
            java.lang.String r0 = r0.mo25402I()     // Catch:{ Exception -> 0x040a }
            android.bluetooth.BluetoothGattCharacteristic r0 = r1.mo25277m(r3, r5, r6, r0)     // Catch:{ Exception -> 0x040a }
            boolean r0 = r3.readCharacteristic(r0)
            if (r0 == 0) goto L_0x0403
            r2.success(r11)
            goto L_0x065f
        L_0x0403:
            java.lang.String r0 = "unknown reason, may occur if readCharacteristic was called before last read finished."
            r2.error(r4, r0, r11)
            goto L_0x065f
        L_0x040a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.error(r4, r0, r11)
            return
        L_0x0413:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x041d:
            java.lang.Object r0 = r0.f17688b
            java.lang.String r0 = (java.lang.String) r0
            android.bluetooth.BluetoothGatt r3 = r1.mo25279o(r0)     // Catch:{ Exception -> 0x045b }
            c.a0.a.l$a r4 = p040c.p311a0.p312a.C4115l.m11221M()     // Catch:{ Exception -> 0x045b }
            r4.mo25389G(r0)     // Catch:{ Exception -> 0x045b }
            java.util.List r0 = r3.getServices()     // Catch:{ Exception -> 0x045b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x045b }
        L_0x0434:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x045b }
            if (r5 == 0) goto L_0x044c
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x045b }
            android.bluetooth.BluetoothGattService r5 = (android.bluetooth.BluetoothGattService) r5     // Catch:{ Exception -> 0x045b }
            android.bluetooth.BluetoothDevice r6 = r3.getDevice()     // Catch:{ Exception -> 0x045b }
            c.a0.a.h r5 = p040c.p311a0.p312a.C4097c.m11081d(r6, r5, r3)     // Catch:{ Exception -> 0x045b }
            r4.mo25388F(r5)     // Catch:{ Exception -> 0x045b }
            goto L_0x0434
        L_0x044c:
            com.google.protobuf.GeneratedMessageLite r0 = r4.build()     // Catch:{ Exception -> 0x045b }
            c.a0.a.l r0 = (p040c.p311a0.p312a.C4115l) r0     // Catch:{ Exception -> 0x045b }
            byte[] r0 = r0.mo31732f()     // Catch:{ Exception -> 0x045b }
            r2.success(r0)     // Catch:{ Exception -> 0x045b }
            goto L_0x065f
        L_0x045b:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "get_services_error"
            r2.error(r4, r3, r0)
            goto L_0x065f
        L_0x0467:
            java.lang.Object r0 = r0.f17688b
            java.lang.String r0 = (java.lang.String) r0
            android.bluetooth.BluetoothGatt r0 = r1.mo25279o(r0)     // Catch:{ Exception -> 0x0481 }
            boolean r0 = r0.discoverServices()     // Catch:{ Exception -> 0x0481 }
            if (r0 == 0) goto L_0x047a
            r2.success(r11)     // Catch:{ Exception -> 0x0481 }
            goto L_0x065f
        L_0x047a:
            java.lang.String r0 = "unknown reason"
            r2.error(r5, r0, r11)     // Catch:{ Exception -> 0x0481 }
            goto L_0x065f
        L_0x0481:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r5, r3, r0)
            goto L_0x065f
        L_0x048b:
            java.lang.Object r0 = r0.f17688b
            java.lang.String r0 = (java.lang.String) r0
            android.bluetooth.BluetoothAdapter r3 = r1.f8612p
            android.bluetooth.BluetoothDevice r0 = r3.getRemoteDevice(r0)
            android.bluetooth.BluetoothManager r3 = r1.f8611o
            int r3 = r3.getConnectionState(r0, r14)
            com.pauldemarco.flutter_blue.Protos$DeviceStateResponse r0 = p040c.p311a0.p312a.C4097c.m11083f(r0, r3)     // Catch:{ Exception -> 0x04a8 }
            byte[] r0 = r0.mo31732f()     // Catch:{ Exception -> 0x04a8 }
            r2.success(r0)     // Catch:{ Exception -> 0x04a8 }
            goto L_0x065f
        L_0x04a8:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "device_state_error"
            r2.error(r4, r3, r0)
            goto L_0x065f
        L_0x04b4:
            java.lang.Object r0 = r0.f17688b
            java.lang.String r0 = (java.lang.String) r0
            android.bluetooth.BluetoothAdapter r3 = r1.f8612p
            android.bluetooth.BluetoothDevice r3 = r3.getRemoteDevice(r0)
            android.bluetooth.BluetoothManager r4 = r1.f8611o
            int r3 = r4.getConnectionState(r3, r14)
            java.util.Map<java.lang.String, c.a0.a.b$f> r4 = r1.f8616t
            java.lang.Object r0 = r4.remove(r0)
            c.a0.a.b$f r0 = (p040c.p311a0.p312a.C4088b.C4095f) r0
            if (r0 == 0) goto L_0x04d8
            android.bluetooth.BluetoothGatt r0 = r0.f8633a
            r0.disconnect()
            if (r3 != 0) goto L_0x04d8
            r0.close()
        L_0x04d8:
            r2.success(r11)
            goto L_0x065f
        L_0x04dd:
            java.lang.Object r0 = r18.mo46572b()
            byte[] r0 = (byte[]) r0
            c.a0.a.j$a r3 = p040c.p311a0.p312a.C4111j.m11207K()     // Catch:{ InvalidProtocolBufferException -> 0x056d }
            r3.mo31741l(r0)     // Catch:{ InvalidProtocolBufferException -> 0x056d }
            c.a0.a.j$a r3 = (p040c.p311a0.p312a.C4111j.C4112a) r3     // Catch:{ InvalidProtocolBufferException -> 0x056d }
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()     // Catch:{ InvalidProtocolBufferException -> 0x056d }
            c.a0.a.j r0 = (p040c.p311a0.p312a.C4111j) r0     // Catch:{ InvalidProtocolBufferException -> 0x056d }
            java.lang.String r3 = r0.mo25381J()
            android.bluetooth.BluetoothAdapter r4 = r1.f8612p
            android.bluetooth.BluetoothDevice r4 = r4.getRemoteDevice(r3)
            android.bluetooth.BluetoothManager r5 = r1.f8611o
            java.util.List r5 = r5.getConnectedDevices(r14)
            boolean r5 = r5.contains(r4)
            java.util.Map<java.lang.String, c.a0.a.b$f> r6 = r1.f8616t
            boolean r6 = r6.containsKey(r3)
            if (r6 == 0) goto L_0x0518
            if (r5 == 0) goto L_0x0518
            java.lang.String r0 = "already_connected"
            java.lang.String r3 = "connection with device already exists"
            r2.error(r0, r3, r11)
            return
        L_0x0518:
            java.util.Map<java.lang.String, c.a0.a.b$f> r6 = r1.f8616t
            boolean r6 = r6.containsKey(r3)
            if (r6 == 0) goto L_0x053e
            if (r5 != 0) goto L_0x053e
            java.util.Map<java.lang.String, c.a0.a.b$f> r0 = r1.f8616t
            java.lang.Object r0 = r0.get(r3)
            c.a0.a.b$f r0 = (p040c.p311a0.p312a.C4088b.C4095f) r0
            android.bluetooth.BluetoothGatt r0 = r0.f8633a
            boolean r0 = r0.connect()
            if (r0 == 0) goto L_0x0536
            r2.success(r11)
            goto L_0x053d
        L_0x0536:
            java.lang.String r0 = "reconnect_error"
            java.lang.String r3 = "error when reconnecting to device"
            r2.error(r0, r3, r11)
        L_0x053d:
            return
        L_0x053e:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L_0x0552
            android.content.Context r5 = r1.f8608l
            boolean r0 = r0.mo25380I()
            android.bluetooth.BluetoothGattCallback r6 = r1.f8606C
            r7 = 2
            android.bluetooth.BluetoothGatt r0 = r4.connectGatt(r5, r0, r6, r7)
            goto L_0x055e
        L_0x0552:
            android.content.Context r5 = r1.f8608l
            boolean r0 = r0.mo25380I()
            android.bluetooth.BluetoothGattCallback r6 = r1.f8606C
            android.bluetooth.BluetoothGatt r0 = r4.connectGatt(r5, r0, r6)
        L_0x055e:
            java.util.Map<java.lang.String, c.a0.a.b$f> r4 = r1.f8616t
            c.a0.a.b$f r5 = new c.a0.a.b$f
            r5.<init>(r1, r0)
            r4.put(r3, r5)
            r2.success(r11)
            goto L_0x065f
        L_0x056d:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            r2.error(r13, r3, r0)
            goto L_0x065f
        L_0x0577:
            android.bluetooth.BluetoothManager r0 = r1.f8611o
            java.util.List r0 = r0.getConnectedDevices(r14)
            c.a0.a.k$a r3 = p040c.p311a0.p312a.C4113k.m11213L()
            java.util.Iterator r0 = r0.iterator()
        L_0x0585:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0599
            java.lang.Object r4 = r0.next()
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            com.pauldemarco.flutter_blue.Protos$BluetoothDevice r4 = p040c.p311a0.p312a.C4097c.m11080c(r4)
            r3.mo25384F(r4)
            goto L_0x0585
        L_0x0599:
            com.google.protobuf.GeneratedMessageLite r0 = r3.build()
            c.a0.a.k r0 = (p040c.p311a0.p312a.C4113k) r0
            byte[] r0 = r0.mo31732f()
            r2.success(r0)
            c.a0.a.b$g r0 = p040c.p311a0.p312a.C4088b.C4096g.EMERGENCY
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mDevices size: "
            r2.append(r3)
            java.util.Map<java.lang.String, c.a0.a.b$f> r3 = r1.f8616t
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo25281p(r0, r2)
            goto L_0x065f
        L_0x05c4:
            r17.mo25286u()
            r2.success(r11)
            goto L_0x065f
        L_0x05cc:
            android.content.Context r3 = r1.f8608l
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r4)
            if (r3 == 0) goto L_0x05eb
            f.a.d.b.g.c.c r3 = r1.f8614r
            android.app.Activity r3 = r3.mo46419d()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 1452(0x5ac, float:2.035E-42)
            androidx.core.app.ActivityCompat.requestPermissions(r3, r4, r5)
            r1.f8618v = r0
            r1.f8619w = r2
            goto L_0x065f
        L_0x05eb:
            r17.mo25283r(r18, r19)
            goto L_0x065f
        L_0x05f0:
            android.bluetooth.BluetoothAdapter r0 = r1.f8612p
            boolean r0 = r0.isEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.success(r0)
            goto L_0x065f
        L_0x05fe:
            r0 = 1
            android.bluetooth.BluetoothAdapter r3 = r1.f8612p
            if (r3 == 0) goto L_0x0605
            r16 = r0
        L_0x0605:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r2.success(r0)
            goto L_0x065f
        L_0x060d:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$a r0 = com.pauldemarco.flutter_blue.Protos$BluetoothState.m23511J()
            android.bluetooth.BluetoothAdapter r3 = r1.f8612p     // Catch:{ SecurityException -> 0x0639 }
            int r3 = r3.getState()     // Catch:{ SecurityException -> 0x0639 }
            switch(r3) {
                case 10: goto L_0x062f;
                case 11: goto L_0x0629;
                case 12: goto L_0x0623;
                case 13: goto L_0x061d;
                default: goto L_0x061a;
            }     // Catch:{ SecurityException -> 0x0639 }
        L_0x061a:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.UNKNOWN     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x0635
        L_0x061d:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.TURNING_OFF     // Catch:{ SecurityException -> 0x0639 }
            r0.mo45651F(r3)     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x063e
        L_0x0623:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.ON     // Catch:{ SecurityException -> 0x0639 }
            r0.mo45651F(r3)     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x063e
        L_0x0629:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.TURNING_ON     // Catch:{ SecurityException -> 0x0639 }
            r0.mo45651F(r3)     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x063e
        L_0x062f:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.OFF     // Catch:{ SecurityException -> 0x0639 }
            r0.mo45651F(r3)     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x063e
        L_0x0635:
            r0.mo45651F(r3)     // Catch:{ SecurityException -> 0x0639 }
            goto L_0x063e
        L_0x0639:
            com.pauldemarco.flutter_blue.Protos$BluetoothState$State r3 = com.pauldemarco.flutter_blue.Protos$BluetoothState.State.UNAUTHORIZED
            r0.mo45651F(r3)
        L_0x063e:
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.pauldemarco.flutter_blue.Protos$BluetoothState r0 = (com.pauldemarco.flutter_blue.Protos$BluetoothState) r0
            byte[] r0 = r0.mo31732f()
            r2.success(r0)
            goto L_0x065f
        L_0x064c:
            java.lang.Object r0 = r0.f17688b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            c.a0.a.b$g[] r3 = p040c.p311a0.p312a.C4088b.C4096g.values()
            r0 = r3[r0]
            r1.f8617u = r0
            r2.success(r11)
        L_0x065f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p311a0.p312a.C4088b.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    public void onReattachedToActivityForConfigChanges(C8950c cVar) {
        onAttachedToActivity(cVar);
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1452) {
            return false;
        }
        if (iArr[0] == 0) {
            mo25283r(this.f8618v, this.f8619w);
            return true;
        }
        this.f8619w.error("no_permissions", "flutter_blue plugin requires location permissions for scanning", (Object) null);
        this.f8619w = null;
        this.f8618v = null;
        return true;
    }

    /* renamed from: p */
    public final void mo25281p(C4096g gVar, String str) {
        int ordinal = gVar.ordinal();
        int ordinal2 = this.f8617u.ordinal();
    }

    /* renamed from: q */
    public final void mo25282q(C9003c cVar, Application application, Activity activity, C9024l.C9027c cVar2, C8950c cVar3) {
        synchronized (this.f8607e) {
            this.f8615s = activity;
            this.f8608l = application;
            C9017j jVar = new C9017j(cVar, "plugins.pauldemarco.com/flutter_blue/methods");
            this.f8609m = jVar;
            jVar.mo46575e(this);
            C9006d dVar = new C9006d(cVar, "plugins.pauldemarco.com/flutter_blue/state");
            this.f8610n = dVar;
            dVar.mo46556d(this.f8622z);
            BluetoothManager bluetoothManager = (BluetoothManager) application.getSystemService("bluetooth");
            this.f8611o = bluetoothManager;
            this.f8612p = bluetoothManager.getAdapter();
            if (cVar2 != null) {
                cVar2.mo46297b(this);
            } else {
                cVar3.mo46417b(this);
            }
        }
    }

    /* renamed from: r */
    public final void mo25283r(C9016i iVar, C9017j.C9022d dVar) {
        byte[] bArr = (byte[]) iVar.mo46572b();
        try {
            C4135v.C4136a N = C4135v.m11318N();
            N.mo31741l(bArr);
            C4135v vVar = (C4135v) N.build();
            this.f8621y = vVar.mo25435I();
            this.f8620x.clear();
            if (Build.VERSION.SDK_INT >= 21) {
                mo25285t(vVar);
            } else {
                mo25284s(vVar);
            }
            dVar.success((Object) null);
        } catch (Exception e) {
            dVar.error("startScan", e.getMessage(), e);
        }
    }

    /* renamed from: s */
    public final void mo25284s(C4135v vVar) {
        List<String> M = vVar.mo25439M();
        UUID[] uuidArr = new UUID[M.size()];
        for (int i = 0; i < M.size(); i++) {
            uuidArr[i] = UUID.fromString(M.get(i));
        }
        if (!this.f8612p.startLeScan(uuidArr, mo25274j())) {
            throw new IllegalStateException("getBluetoothLeScanner() is null. Is the Adapter on?");
        }
    }

    @TargetApi(21)
    /* renamed from: t */
    public final void mo25285t(C4135v vVar) {
        BluetoothLeScanner bluetoothLeScanner = this.f8612p.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            int J = vVar.mo25436J();
            int L = vVar.mo25438L();
            ArrayList arrayList = new ArrayList(L);
            for (int i = 0; i < L; i++) {
                arrayList.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(vVar.mo25437K(i))).build());
            }
            bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(J).build(), mo25275k());
            return;
        }
        throw new IllegalStateException("getBluetoothLeScanner() is null. Is the Adapter on?");
    }

    /* renamed from: u */
    public final void mo25286u() {
        if (Build.VERSION.SDK_INT >= 21) {
            mo25288w();
        } else {
            mo25287v();
        }
    }

    /* renamed from: v */
    public final void mo25287v() {
        this.f8612p.stopLeScan(mo25274j());
    }

    @TargetApi(21)
    /* renamed from: w */
    public final void mo25288w() {
        BluetoothLeScanner bluetoothLeScanner = this.f8612p.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(mo25275k());
        }
    }

    /* renamed from: x */
    public final void mo25289x() {
        this.f8608l = null;
        this.f8614r.mo46421f(this);
        this.f8614r = null;
        this.f8609m.mo46575e((C9017j.C9021c) null);
        this.f8609m = null;
        this.f8610n.mo46556d((C9006d.C9011d) null);
        this.f8610n = null;
        this.f8612p = null;
        this.f8611o = null;
    }
}

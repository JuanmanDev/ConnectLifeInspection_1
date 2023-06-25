package p040c.p301y.p302b.p303a.p304s;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.widget.TooltipCompatHandler;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.juconnect.connectlife.ju_ble.model.BTBean;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p040c.p301y.p302b.p303a.C3677o;
import p040c.p301y.p302b.p303a.p304s.C3695g;

/* renamed from: c.y.b.a.s.h */
/* compiled from: BTBle */
public class C3700h {

    /* renamed from: B */
    public static C3700h f6679B;

    /* renamed from: C */
    public static byte[] f6680C;

    /* renamed from: D */
    public static int f6681D;

    /* renamed from: E */
    public static UUID f6682E;

    /* renamed from: F */
    public static UUID f6683F;

    /* renamed from: G */
    public static Handler f6684G;

    /* renamed from: A */
    public C3695g.C3699d f6685A;

    /* renamed from: a */
    public Context f6686a;

    /* renamed from: b */
    public BluetoothAdapter f6687b;

    /* renamed from: c */
    public BluetoothGatt f6688c;

    /* renamed from: d */
    public BluetoothGattCharacteristic f6689d;

    /* renamed from: e */
    public List<BTBean> f6690e = new ArrayList();

    /* renamed from: f */
    public C3695g.C3696a f6691f;

    /* renamed from: g */
    public C3695g.C3698c f6692g;

    /* renamed from: h */
    public C3695g.C3697b f6693h;

    /* renamed from: i */
    public String f6694i;

    /* renamed from: j */
    public String f6695j;

    /* renamed from: k */
    public int f6696k = 0;

    /* renamed from: l */
    public int f6697l = 0;

    /* renamed from: m */
    public String f6698m = "";

    /* renamed from: n */
    public ScheduledExecutorService f6699n;

    /* renamed from: o */
    public Handler f6700o;

    /* renamed from: p */
    public ScheduledFuture f6701p;

    /* renamed from: q */
    public ScheduledFuture f6702q;

    /* renamed from: r */
    public BluetoothDevice f6703r;

    /* renamed from: s */
    public int f6704s;

    /* renamed from: t */
    public int f6705t;

    /* renamed from: u */
    public boolean f6706u;

    /* renamed from: v */
    public boolean f6707v;

    /* renamed from: w */
    public final Runnable f6708w;

    /* renamed from: x */
    public Runnable f6709x;

    /* renamed from: y */
    public final BluetoothAdapter.LeScanCallback f6710y;

    /* renamed from: z */
    public BluetoothGattCallback f6711z;

    /* renamed from: c.y.b.a.s.h$a */
    /* compiled from: BTBle */
    public class C3701a extends Handler {
        public C3701a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 701) {
                post(C3700h.this.f6709x);
                sendEmptyMessageDelayed(EventBusConstKt.DASH_BOARD, 500);
            } else if (i == 10001) {
                "handleMessage: discoverCount" + C3700h.this.f6705t;
                C3700h hVar = C3700h.this;
                if (hVar.f6706u) {
                    removeMessages(EventBusConstKt.NOT_MORE);
                    return;
                }
                BluetoothGatt bluetoothGatt = (BluetoothGatt) message.obj;
                if (hVar.f6705t != 0 || C3700h.this.f6706u) {
                    C3700h.m9294c(C3700h.this);
                    bluetoothGatt.discoverServices();
                    Message obtain = Message.obtain();
                    obtain.what = EventBusConstKt.NOT_MORE;
                    obtain.obj = bluetoothGatt;
                    sendMessageDelayed(obtain, 1000);
                    return;
                }
                removeMessages(EventBusConstKt.NOT_MORE);
                C3700h hVar2 = C3700h.this;
                hVar2.mo21031C(hVar2.f6703r);
            }
        }
    }

    /* renamed from: c.y.b.a.s.h$b */
    /* compiled from: BTBle */
    public class C3702b implements Runnable {
        public C3702b() {
        }

        public void run() {
            C3700h.this.f6693h.mo20941a();
        }
    }

    /* renamed from: c.y.b.a.s.h$c */
    /* compiled from: BTBle */
    public class C3703c implements BluetoothAdapter.LeScanCallback {
        public C3703c() {
        }

        @SuppressLint({"MissingPermission"})
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (!C3700h.this.f6707v) {
                C3700h.f6684G.removeCallbacks(C3700h.this.f6708w);
            }
            boolean unused = C3700h.this.f6707v = true;
            if (!TextUtils.isEmpty(bluetoothDevice.getName())) {
                "fauksble------origin device =" + bluetoothDevice.getName();
            }
            if (!TextUtils.isEmpty(bluetoothDevice.getName())) {
                if (C3700h.this.mo21037J(bluetoothDevice.getName(), i + "")) {
                    C3700h hVar = C3700h.this;
                    String u = hVar.mo21034F(hVar.mo21049x(bArr));
                    "fauks ble =deviceBleType:" + u + ",mDevType:" + C3700h.this.f6698m;
                    if (u.equals(C3700h.this.f6698m) && !C3700h.this.mo21051z(bluetoothDevice)) {
                        C3700h.this.f6690e.add(new BTBean(bluetoothDevice, i, u, bluetoothDevice.getName(), bluetoothDevice.getAddress(), 20));
                    }
                }
            }
        }
    }

    /* renamed from: c.y.b.a.s.h$d */
    /* compiled from: BTBle */
    public class C3704d extends BluetoothGattCallback {
        public C3704d() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            "onCharacteristicChanged: " + C3700h.this.mo21049x(bluetoothGattCharacteristic.getValue());
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            "onCharacteristicRead status=" + i;
            "onCharacteristicRead: status=" + i + " receiverbuf" + C3700h.this.mo21049x(bluetoothGattCharacteristic.getValue());
            if (C3700h.this.f6702q != null && !C3700h.this.f6702q.isCancelled()) {
                C3700h.this.f6702q.cancel(true);
            }
            if (i == 0) {
                int unused = C3700h.this.f6697l = 0;
                byte[] value = bluetoothGattCharacteristic.getValue();
                "receiverbuf =" + C3700h.this.mo21049x(bluetoothGattCharacteristic.getValue());
                if (value != null) {
                    byte[] bArr = new byte[value.length];
                    C3700h.f6680C = bArr;
                    System.arraycopy(value, 0, bArr, 0, value.length);
                }
                "onCharacteristicRead: mReceiveBuf=" + Arrays.toString(C3700h.f6680C);
                C3700h.this.mo21035H();
                return;
            }
            C3700h.this.mo21044Q();
            "onCharacteristicRead fail: " + i + " is reReading";
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            "onCharacteristicWrite: " + i;
            C3700h.f6680C = null;
            if (C3700h.this.f6702q != null && !C3700h.this.f6702q.isCancelled()) {
                C3700h.this.f6702q.cancel(true);
            }
            if (i == 0) {
                int unused = C3700h.this.f6697l = 0;
                if (C3700h.f6681D == C3677o.f6627a) {
                    if (C3700h.this.f6692g != null) {
                        C3700h.this.f6692g.mo21025a();
                    }
                } else if (C3700h.f6681D == C3677o.f6629c) {
                    C3700h.this.mo21032D();
                } else if (C3700h.f6681D == C3677o.f6630d) {
                    C3700h.this.mo21032D();
                } else if (C3700h.f6681D == C3677o.f6628b) {
                    C3700h.this.mo21032D();
                }
            } else {
                "onCharacteristicWrite fail: " + i + "is reWriting";
                C3700h.this.mo21044Q();
            }
        }

        @SuppressLint({"MissingPermission"})
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            if (i != 0) {
                if (C3700h.this.f6704s > 0) {
                    C3700h.m9299h(C3700h.this);
                    int unused = C3700h.this.f6705t = 10;
                    C3700h hVar = C3700h.this;
                    hVar.mo21031C(hVar.f6703r);
                    return;
                }
                C3700h.this.mo21030B();
                C3700h.this.f6691f.mo21023a(i, "建立连接失败");
            } else if (i2 == 0) {
                bluetoothGatt.close();
            } else if (i2 == 2) {
                Message obtain = Message.obtain();
                obtain.what = EventBusConstKt.NOT_MORE;
                obtain.obj = bluetoothGatt;
                C3700h.this.f6700o.sendMessageDelayed(obtain, 1000);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            C3700h.this.f6700o.removeMessages(EventBusConstKt.NOT_MORE);
            int unused = C3700h.this.f6705t = 10;
            C3700h hVar = C3700h.this;
            if (!hVar.f6706u) {
                hVar.f6706u = true;
                if (i == 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        bluetoothGatt.requestMtu(200);
                    }
                    if (C3700h.f6682E == null || C3700h.f6683F == null) {
                        C3700h.this.f6691f.mo21023a(10000, "未设置UUID");
                        return;
                    }
                    "onServicesDiscovered: BTCONF_SERVICE_UUID :" + C3700h.f6682E;
                    for (BluetoothGattService next : bluetoothGatt.getServices()) {
                        "onServicesDiscovered: BluetoothGattService uuid :" + next.getUuid();
                        if (next.getUuid().equals(C3700h.f6682E)) {
                            for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                                if (next2 != null && next2.getUuid().equals(C3700h.f6683F)) {
                                    BluetoothGattCharacteristic unused2 = C3700h.this.f6689d = next2;
                                    int unused3 = C3700h.this.f6704s = 10;
                                    C3700h.this.f6691f.onSuccess();
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                    C3700h.this.f6691f.mo21023a(EventBusConstKt.NOT_MORE, "设备中未找到与之相对应的UUID");
                    return;
                }
                hVar.f6691f.mo21023a(i, "建立连接失败");
            }
        }
    }

    /* renamed from: c.y.b.a.s.h$e */
    /* compiled from: BTBle */
    public class C3705e implements Runnable {
        public C3705e() {
        }

        public void run() {
            C3700h.this.mo21044Q();
        }
    }

    /* renamed from: c.y.b.a.s.h$f */
    /* compiled from: BTBle */
    public class C3706f implements Runnable {
        public C3706f() {
        }

        public void run() {
            C3700h.this.mo21044Q();
        }
    }

    public C3700h() {
        Executors.newSingleThreadScheduledExecutor();
        Executors.newScheduledThreadPool(4);
        this.f6699n = Executors.newSingleThreadScheduledExecutor();
        this.f6704s = 10;
        this.f6705t = 10;
        this.f6706u = false;
        this.f6707v = false;
        this.f6708w = new C3690b(this);
        this.f6709x = new C3702b();
        this.f6710y = new C3703c();
        this.f6711z = new C3704d();
    }

    /* renamed from: G */
    public static C3700h m9291G() {
        synchronized (C3700h.class) {
            if (f6679B == null) {
                f6679B = new C3700h();
            }
        }
        return f6679B;
    }

    /* renamed from: c */
    public static /* synthetic */ int m9294c(C3700h hVar) {
        int i = hVar.f6705t;
        hVar.f6705t = i - 1;
        return i;
    }

    /* renamed from: h */
    public static /* synthetic */ int m9299h(C3700h hVar) {
        int i = hVar.f6704s;
        hVar.f6704s = i - 1;
        return i;
    }

    /* renamed from: A */
    public void mo21029A() {
        this.f6690e.clear();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: B */
    public void mo21030B() {
        this.f6700o.post(new C3691c(this));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: C */
    public void mo21031C(BluetoothDevice bluetoothDevice) {
        this.f6703r = bluetoothDevice;
        this.f6700o.post(new C3692d(this));
        this.f6700o.postDelayed(new C3689a(this), 500);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: D */
    public int mo21032D() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f6689d;
        if (bluetoothGattCharacteristic == null) {
            return -1;
        }
        if (bluetoothGattCharacteristic.getUuid().equals(f6683F)) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            BluetoothGatt bluetoothGatt = this.f6688c;
            if (bluetoothGatt == null || !bluetoothGatt.readCharacteristic(this.f6689d)) {
                mo21044Q();
            } else {
                this.f6697l = 0;
                this.f6702q = this.f6699n.schedule(new C3706f(), TooltipCompatHandler.HOVER_HIDE_TIMEOUT_SHORT_MS, TimeUnit.SECONDS);
            }
        }
        byte[] bArr = f6680C;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    /* renamed from: E */
    public List<BTBean> mo21033E() {
        return this.f6690e;
    }

    /* renamed from: F */
    public final String mo21034F(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 12) {
            return "00";
        }
        String substring = str.substring(10, 12);
        String substring2 = mo21042O(substring, str) ? str.substring(16, 18) : "";
        return substring + substring2;
    }

    /* renamed from: H */
    public void mo21035H() {
        int i;
        "handleReceiveMessage currentStatus = " + f6681D;
        "mReceiveBuf = " + Arrays.toString(f6680C);
        if (f6681D == C3677o.f6627a) {
            f6684G.sendEmptyMessage(5);
        } else if (f6681D == C3677o.f6629c) {
            this.f6694i = mo21050y(f6680C);
            "onCharacteristicWrite: wifiId=" + this.f6694i;
            Message obtain = Message.obtain();
            obtain.obj = this.f6694i;
            obtain.what = 6;
            f6684G.sendMessage(obtain);
        } else if (f6681D == C3677o.f6630d) {
            this.f6695j = mo21050y(f6680C);
            "onCharacteristicWrite: deviceId=" + this.f6695j;
            Message obtain2 = Message.obtain();
            obtain2.obj = this.f6695j;
            obtain2.what = 7;
            f6684G.sendMessage(obtain2);
        } else if (f6681D == C3677o.f6628b) {
            int P = mo21043P(f6680C);
            "result = " + P;
            if (P != 3 || (i = this.f6696k) >= 100) {
                this.f6696k = 0;
                if (P == 0) {
                    String str = this.f6694i;
                    if (str == null) {
                        this.f6685A.mo21028b(10003, "获取设备信息失败");
                    } else {
                        this.f6685A.mo21027a(str, this.f6695j);
                    }
                } else if (P == 1) {
                    String str2 = this.f6694i;
                    if (str2 == null) {
                        this.f6685A.mo21028b(10003, "获取设备信息失败");
                    } else {
                        this.f6685A.mo21027a(str2, this.f6695j);
                    }
                } else if (P != 2) {
                    this.f6685A.mo21028b(EventBusConstKt.HAVE_NEW_MESSAHE, "设备连接云端失败");
                } else {
                    this.f6685A.mo21028b(10005, "路由器密码输入错误");
                }
            } else {
                this.f6696k = i + 1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mo21044Q();
            }
        }
    }

    /* renamed from: I */
    public C3700h mo21036I(Context context) {
        this.f6700o = new C3701a(Looper.getMainLooper());
        this.f6686a = context;
        this.f6687b = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        return m9291G();
    }

    /* renamed from: J */
    public final boolean mo21037J(String str, String str2) {
        return str.startsWith("HIS-") || str.startsWith("his-");
    }

    /* renamed from: K */
    public /* synthetic */ void mo21038K() {
        if (this.f6688c != null) {
            this.f6688c.disconnect();
            this.f6704s = 10;
            this.f6705t = 10;
            this.f6688c = null;
        }
    }

    /* renamed from: L */
    public /* synthetic */ void mo21039L() {
        BluetoothGatt bluetoothGatt = this.f6688c;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            this.f6688c = null;
        }
    }

    /* renamed from: M */
    public /* synthetic */ void mo21040M() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f6688c = this.f6703r.connectGatt(this.f6686a, false, this.f6711z, 2);
        } else {
            this.f6688c = this.f6703r.connectGatt(this.f6686a, false, this.f6711z);
        }
    }

    /* renamed from: N */
    public /* synthetic */ void mo21041N() {
        if (!this.f6707v) {
            mo21048U();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mo21047T(this.f6698m);
        }
    }

    /* renamed from: O */
    public boolean mo21042O(String str, String str2) {
        return "59".equals(str) && str2.length() >= 18;
    }

    /* renamed from: P */
    public final int mo21043P(byte[] bArr) {
        String x = mo21049x(bArr);
        "parseDeviceStatus: result=" + x;
        if ("800300020404".equals(x)) {
            return 0;
        }
        if ("800300020401".equals(x)) {
            return 1;
        }
        return "800300020f01".equals(x) ? 2 : 3;
    }

    /* renamed from: Q */
    public void mo21044Q() {
        int i = this.f6697l + 1;
        this.f6697l = i;
        if (i > 5) {
            this.f6697l = 0;
            this.f6685A.mo21028b(10004, "网络不畅");
        } else if (f6681D == C3677o.f6627a) {
            f6684G.sendEmptyMessage(8);
        } else if (f6681D == C3677o.f6629c) {
            f6684G.sendEmptyMessage(5);
        } else if (f6681D == C3677o.f6630d) {
            f6684G.sendEmptyMessage(6);
        } else if (f6681D == C3677o.f6628b) {
            f6684G.sendEmptyMessage(7);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: R */
    public void mo21045R(byte[] bArr) {
        C3695g.C3698c cVar;
        if (this.f6689d == null && (cVar = this.f6692g) != null) {
            cVar.mo21026b(-2, "数据传输错误");
        }
        if (this.f6689d.getUuid().equals(f6683F)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            "sendBTMessage: sendbuf=" + mo21049x(bArr);
            "sendBTMessage: sendbuf=" + mo21049x(bArr);
            this.f6689d.setValue(bArr);
            BluetoothGatt bluetoothGatt = this.f6688c;
            if (bluetoothGatt == null || !bluetoothGatt.writeCharacteristic(this.f6689d)) {
                mo21044Q();
                return;
            }
            this.f6697l = 0;
            this.f6702q = this.f6699n.schedule(new C3705e(), TooltipCompatHandler.HOVER_HIDE_TIMEOUT_SHORT_MS, TimeUnit.SECONDS);
            return;
        }
        C3695g.C3698c cVar2 = this.f6692g;
        if (cVar2 != null) {
            cVar2.mo21026b(-2, "数据传输错误");
        }
    }

    /* renamed from: S */
    public void mo21046S(C3695g.C3697b bVar) {
        this.f6693h = bVar;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: T */
    public void mo21047T(String str) {
        this.f6698m = str;
        if (this.f6687b != null) {
            this.f6690e.clear();
            if (this.f6687b.isDiscovering()) {
                this.f6687b.stopLeScan(this.f6710y);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f6688c != null) {
                mo21030B();
                try {
                    Thread.sleep(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.f6687b.startLeScan(this.f6710y);
            this.f6707v = false;
            f6684G.postDelayed(this.f6708w, 30000);
            this.f6700o.sendEmptyMessageDelayed(EventBusConstKt.DASH_BOARD, 500);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: U */
    public void mo21048U() {
        this.f6700o.removeMessages(EventBusConstKt.DASH_BOARD);
        BluetoothAdapter bluetoothAdapter = this.f6687b;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(this.f6710y);
            if (this.f6701p != null) {
                this.f6701p.cancel(true);
            }
        }
    }

    /* renamed from: x */
    public String mo21049x(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: y */
    public final String mo21050y(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[(bArr.length - 4)];
        System.arraycopy(bArr, 4, bArr2, 0, bArr.length - 4);
        try {
            return new String(bArr2, "ascii");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: z */
    public final boolean mo21051z(BluetoothDevice bluetoothDevice) {
        boolean z = false;
        for (BTBean next : this.f6690e) {
            String bleName = next.getBleName();
            String macAddress = next.getMacAddress();
            if (bleName.equalsIgnoreCase(bluetoothDevice.getName()) && macAddress.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                z = true;
            }
        }
        return z;
    }
}

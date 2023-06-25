package p040c.p301y.p302b.p303a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.clj.fastble.BleManager;
import com.clj.fastble.data.BleDevice;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.connect_life.core.utils.GpsUtils;
import com.juconnect.connectlife.ju_ble.BleDeviceManager;
import com.juconnect.connectlife.ju_ble.BlueToothHelper;
import com.juconnect.connectlife.ju_ble.OnDfuResultListener;
import com.juconnect.connectlife.ju_ble.connect.ConnectParameter;
import com.juconnect.connectlife.ju_ble.model.BTBean;
import com.juconnect.connectlife.ju_ble.model.BleDeviceInfo;
import com.juconnect.connectlife.ju_ble.model.ConfigWifiResult;
import com.juconnect.connectlife.ju_ble.model.ProgressInfo;
import com.juconnect.connectlife.ju_ble.model.WifiBean;
import com.juconnect.connectlife.ju_ble.model.WifiList;
import com.juconnect.connectlife.ju_ble.utils.NetworkUtils;
import com.juconnect.connectlife.ju_ble.utils.PermissionFragment;
import com.juconnect.connectlife.ju_ble.utils.ThreadUtils;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p301y.p302b.p303a.C3678p;
import p040c.p301y.p302b.p303a.p304s.C3695g;
import p040c.p472t.p473a.C7567d;
import p040c.p472t.p473a.C7569f;
import p040c.p472t.p473a.C7585u;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.y.b.a.q */
/* compiled from: JuBlePlugin */
public class C3680q implements C8944a, C9017j.C9021c, C8948a {

    /* renamed from: J */
    public static final String f6632J = "q";

    /* renamed from: A */
    public String f6633A = "";

    /* renamed from: B */
    public boolean f6634B = false;

    /* renamed from: C */
    public final OnDfuResultListener f6635C = new C3684d();

    /* renamed from: D */
    public int f6636D = 0;

    /* renamed from: E */
    public String f6637E = "";

    /* renamed from: F */
    public C9016i f6638F;

    /* renamed from: G */
    public C3678p f6639G = null;

    /* renamed from: H */
    public final String[] f6640H = {PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"};

    /* renamed from: I */
    public final C3678p.C3679a f6641I = new C3686f();

    /* renamed from: e */
    public C9017j f6642e;

    /* renamed from: l */
    public C3695g f6643l;

    /* renamed from: m */
    public FragmentActivity f6644m;

    /* renamed from: n */
    public String f6645n = "";

    /* renamed from: o */
    public ThreadUtils f6646o;

    /* renamed from: p */
    public int f6647p;

    /* renamed from: q */
    public String f6648q;

    /* renamed from: r */
    public String f6649r;

    /* renamed from: s */
    public PermissionFragment f6650s;

    /* renamed from: t */
    public BleDeviceManager.BleWifiListListener f6651t = new C3671j(this);

    /* renamed from: u */
    public final BleDeviceManager.BleDeviceConnectCallBack f6652u = new C3683c();

    /* renamed from: v */
    public C9017j.C9022d f6653v;

    /* renamed from: w */
    public int f6654w;

    /* renamed from: x */
    public Uri f6655x;

    /* renamed from: y */
    public String f6656y;

    /* renamed from: z */
    public BleDevice f6657z;

    /* renamed from: c.y.b.a.q$a */
    /* compiled from: JuBlePlugin */
    public class C3681a implements Function2<BleDevice, String, Unit> {

        /* renamed from: e */
        public final /* synthetic */ C9016i f6658e;

        /* renamed from: l */
        public final /* synthetic */ C9017j.C9022d f6659l;

        public C3681a(C9016i iVar, C9017j.C9022d dVar) {
            this.f6658e = iVar;
            this.f6659l = dVar;
        }

        /* renamed from: a */
        public Unit invoke(BleDevice bleDevice, String str) {
            if (C3680q.this.f6636D == 1) {
                return null;
            }
            String unused = C3680q.this.f6656y = this.f6658e.f17688b.toString();
            BleDevice unused2 = C3680q.this.f6657z = bleDevice;
            this.f6659l.success(Boolean.valueOf(bleDevice != null));
            int unused3 = C3680q.this.f6636D = 1;
            return null;
        }
    }

    /* renamed from: c.y.b.a.q$b */
    /* compiled from: JuBlePlugin */
    public class C3682b implements Application.ActivityLifecycleCallbacks {
        public C3682b() {
        }

        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
            if (C3680q.this.f6644m == activity) {
                C3680q.this.mo20981f0();
            }
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityResumed(@NonNull Activity activity) {
            if (C3680q.this.f6644m == activity) {
                C3680q.this.mo20976a0("页面进入onActivityResumed状态");
            }
        }

        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    /* renamed from: c.y.b.a.q$c */
    /* compiled from: JuBlePlugin */
    public class C3683c implements BleDeviceManager.BleDeviceConnectCallBack {
        public C3683c() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo20991a() {
            if (BleDeviceManager.INSTANCE.getSendIndex() == 3 || BleDeviceManager.INSTANCE.getSendIndex() == 0) {
                if (C3680q.this.f6638F != null) {
                    C3680q qVar = C3680q.this;
                    qVar.mo20982g0(qVar.f6638F);
                }
            } else if (BleDeviceManager.INSTANCE.getSendIndex() != -1) {
                BleDeviceManager.INSTANCE.recoveryBluetoothScene();
            } else {
                C3680q.this.f6643l.mo21021f();
                BleDeviceManager.INSTANCE.startConfig();
            }
        }

        public void configFail(int i, @Nullable String str, @Nullable String str2) {
            String unused = C3680q.f6632J;
            "connCallback configFail=" + str;
        }

        public void configRouteSuccess() {
        }

        public void configSuccess() {
            ConfigWifiResult configWifiResult = new ConfigWifiResult(C3680q.this.f6645n, C3680q.this.f6649r);
            configWifiResult.setResultCode("0");
            C3680q.this.mo20956F("wifiConfigCallback", configWifiResult.toJson());
        }

        public void errorCallback(@NonNull String str, @NonNull String str2, int i, @NonNull String str3, @NonNull String str4) {
            if (i == Integer.parseInt("1") || i == Integer.parseInt("2")) {
                ConfigWifiResult configWifiResult = new ConfigWifiResult(C3680q.this.f6645n, C3680q.this.f6649r);
                configWifiResult.setResultCode("1");
                configWifiResult.setErrorCode(String.valueOf(i));
                configWifiResult.setErrorDes(str3);
                C3680q.this.mo20956F("wifiConfigCallback", configWifiResult.toJson());
                return;
            }
            C3680q qVar = C3680q.this;
            C3680q.this.mo20956F(str, qVar.mo20965O(i + "", str3, str2, str4));
        }

        public void getDeviceId(@Nullable String str) {
            C3680q.this.mo20959I();
        }

        public void getRSSI(int i) {
        }

        public void getWifiId(@NonNull String str) {
            String unused = C3680q.this.f6645n = str;
            C3680q.this.mo20959I();
        }

        public void onBluetoothDisconnected() {
            if (!C3680q.this.f6637E.isEmpty()) {
                C3680q qVar = C3680q.this;
                qVar.mo20961K(qVar.f6637E);
            }
        }

        public void onConnectFail(int i, @Nullable String str) {
            BleDeviceManager.BleDeviceConnectCallBack g = C3680q.this.f6652u;
            int parseInt = Integer.parseInt("2201");
            g.errorCallback("connBleDeviceCallback", "1", parseInt, "读取的wifiId异常：wifiId:" + C3680q.this.f6645n, "");
        }

        public void onConnectSuccess() {
            C3680q.this.f6646o.threadRun(new C3662a(this));
        }

        public void onSendCMDCallback(@Nullable String str, @Nullable String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pairType", "bluetooth");
                jSONObject.put("name", str);
                jSONObject.put("value", str2);
                C3680q qVar = C3680q.this;
                qVar.mo20976a0("准备通过add_appliance_send_commond回调给flutter的模组指令是:" + jSONObject.toString());
                C3680q.this.mo20956F(JuDistPlugin.METHOD_SEND_COMMAND_CALLBACK, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void showWifiPassword() {
        }
    }

    /* renamed from: c.y.b.a.q$d */
    /* compiled from: JuBlePlugin */
    public class C3684d implements OnDfuResultListener {
        public C3684d() {
        }

        public void onAbove(@NonNull String str) {
            if (C3680q.this.f6653v != null) {
                C3680q.this.f6653v.success(Boolean.TRUE);
            }
            C3680q.this.mo20979d0();
        }

        public void onError(@NonNull String str) {
            C3680q.this.mo20956F("otaErrorCallback", str);
            C3680q.this.mo20979d0();
        }

        public void onProgress(int i, int i2, int i3) {
            if (C3680q.this.f6654w != i) {
                int unused = C3680q.this.f6654w = i;
                C3680q.this.mo20956F("otaProgressCallback", C1502i.m930j(new ProgressInfo(i, i2, i3)));
            }
        }

        public void onScanFinish(@Nullable List<BleDevice> list) {
            if ((list == null || list.isEmpty()) && C3680q.this.f6653v != null) {
                C3680q.this.f6653v.success("");
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (BleDevice next : list) {
                    if (next.getName() != null && next.getName().length() > 0 && C3680q.this.mo20963M(next.getScanRecord())) {
                        arrayList.add(new BleDeviceInfo(next.getName(), next.getMac()));
                    }
                }
            }
            C3680q.this.mo20956F("searchAccessoryCallback", C1502i.m930j(arrayList));
        }

        public void onSuccess() {
        }
    }

    /* renamed from: c.y.b.a.q$e */
    /* compiled from: JuBlePlugin */
    public class C3685e implements C7567d {
        public C3685e() {
        }

        @SuppressLint({"MissingPermission"})
        public void onGranted(List<String> list, boolean z) {
            if (z) {
                if (C3680q.this.mo20958H()) {
                    BlueToothHelper.Companion.getInstances().searchBlueToothList();
                    return;
                }
                C3680q.this.f6644m.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
            } else if (C3680q.this.f6653v != null) {
                C3680q.this.f6653v.success("");
            }
        }
    }

    /* renamed from: c.y.b.a.q$f */
    /* compiled from: JuBlePlugin */
    public class C3686f implements C3678p.C3679a {
        public C3686f() {
        }

        /* renamed from: c */
        public static /* synthetic */ void m9275c() {
            BleDeviceManager.INSTANCE.disconnect();
            BleDeviceManager.INSTANCE.close(false);
        }

        /* renamed from: a */
        public void mo20953a(boolean z) {
            if (!z) {
                ThreadUtils.Companion.getInstance().threadRun(C3665d.f6606e);
                C3680q.this.f6643l.mo21022g();
                C3695g unused = C3680q.this.f6643l = null;
            } else if (C3680q.this.f6643l == null) {
                C3695g unused2 = C3680q.this.f6643l = C3695g.m9278b().mo21018c(C3680q.this.f6644m);
                BleDeviceManager.INSTANCE.initBle(C3680q.this.f6644m.getApplication(), C3680q.this.f6652u, C3680q.this.f6651t);
            }
            C3680q.this.mo20957G(!z, false);
        }

        /* renamed from: b */
        public void mo20954b(String str, boolean z) {
            if (str != C3680q.this.f6637E) {
                return;
            }
            if (z) {
                C3680q qVar = C3680q.this;
                qVar.mo20976a0("设备：" + str + "已连接");
                return;
            }
            C3680q qVar2 = C3680q.this;
            qVar2.mo20976a0("设备：" + str + "断开连接");
        }
    }

    /* renamed from: c.y.b.a.q$g */
    /* compiled from: JuBlePlugin */
    public class C3687g implements C7567d {

        /* renamed from: a */
        public final /* synthetic */ boolean f6666a;

        public C3687g(boolean z) {
            this.f6666a = z;
        }

        public void onDenied(List<String> list, boolean z) {
            if (z) {
                C3680q.this.mo20956F("controlTerminalBleState", JuDistPlugin.PERMISSION_DENIED);
            }
        }

        public void onGranted(List<String> list, boolean z) {
            if (!z) {
                C3680q.this.mo20956F("controlTerminalBleState", JuDistPlugin.PERMISSION_DENIED);
            } else if (C3680q.this.mo20958H()) {
                C3680q.this.mo20956F("controlTerminalBleState", JuDistPlugin.PERMISSION_GRANT);
            } else if (this.f6666a) {
                C3680q.this.mo20956F("controlTerminalBleState", "powerOff");
            } else {
                C3680q.this.mo20962L();
            }
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m9218Z(C9016i iVar) {
        ConnectParameter.INSTANCE.initTicket();
        WifiBean wifiBean = (WifiBean) new Gson().fromJson((String) iVar.f17688b, WifiBean.class);
        BleDeviceManager.INSTANCE.sendBssidAndPassword(wifiBean.bssid, wifiBean.password);
    }

    /* renamed from: E */
    public final void mo20955E(C9016i iVar) {
        if (Build.VERSION.SDK_INT > 30 || GpsUtils.INSTANCE.isOPen(this.f6644m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (Build.VERSION.SDK_INT > 30) {
                String[] strArr = C7569f.C7570a.f14271a;
                int length = strArr.length;
                while (i < length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            } else {
                String[] strArr2 = this.f6640H;
                int length2 = strArr2.length;
                while (i < length2) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            if (!C7585u.m21554c(this.f6644m, arrayList)) {
                mo20977b0("权限尚未同意,不能进行搜索");
            } else if (!mo20958H()) {
                mo20977b0("蓝牙开关尚未开启,不能进行搜索");
            } else {
                C3695g gVar = this.f6643l;
                if (gVar == null) {
                    this.f6643l = C3695g.m9278b().mo21018c(this.f6644m);
                } else {
                    gVar.mo21018c(this.f6644m);
                }
                mo20980e0();
            }
        } else {
            mo20977b0("手机GPS定位未打开,不能进行搜索");
        }
    }

    /* renamed from: F */
    public final void mo20956F(String str, Object obj) {
        if (this.f6642e != null && str != null && !str.isEmpty()) {
            mo20976a0("回调Flutter的方法:method:" + str + " args:" + obj);
            this.f6646o.mainRun(new C3667f(this, str, obj));
        }
    }

    /* renamed from: G */
    public final void mo20957G(boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT > 30 || GpsUtils.INSTANCE.isOPen(this.f6644m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (Build.VERSION.SDK_INT > 30) {
                String[] strArr = C7569f.C7570a.f14271a;
                int length = strArr.length;
                while (i < length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            } else {
                String[] strArr2 = this.f6640H;
                int length2 = strArr2.length;
                while (i < length2) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            boolean c = C7585u.m21554c(this.f6644m, arrayList);
            if (z2 && !c) {
                C7585u.m21558j(this.f6644m, arrayList, 2184);
            } else if (!c) {
                C7585u l = C7585u.m21560l(this.f6644m);
                l.mo33041f(arrayList);
                l.mo33043h(new C3687g(z));
            } else if (mo20958H()) {
                mo20956F("controlTerminalBleState", JuDistPlugin.PERMISSION_GRANT);
            } else if (z) {
                mo20956F("controlTerminalBleState", "powerOff");
            } else {
                mo20962L();
            }
        } else {
            PermissionFragment permissionFragment = new PermissionFragment(this.f6642e, 2183);
            this.f6650s = permissionFragment;
            permissionFragment.show(this.f6644m.getSupportFragmentManager(), "dialog");
        }
    }

    /* renamed from: H */
    public final boolean mo20958H() {
        if (Build.VERSION.SDK_INT > 30) {
            return ((BluetoothManager) this.f6644m.getSystemService("bluetooth")).getAdapter().isEnabled();
        }
        return BleManager.getInstance().isBlueEnable();
    }

    /* renamed from: I */
    public final void mo20959I() {
        if (!TextUtils.isEmpty(this.f6645n)) {
            mo20956F("connBleDeviceCallback", mo20965O("1", "", "0", this.f6645n));
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: J */
    public final void mo20960J() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT > 30) {
            arrayList.addAll(Arrays.asList(C7569f.C7570a.f14271a));
        } else {
            arrayList.add(PermissionConstKt.PERMISSION_LOCATION);
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (!C7585u.m21554c(this.f6644m, arrayList)) {
            C7585u l = C7585u.m21560l(this.f6644m);
            l.mo33041f(arrayList);
            l.mo33043h(new C3685e());
        } else if (mo20958H()) {
            BlueToothHelper.Companion.getInstances().searchBlueToothList();
        } else {
            this.f6644m.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        }
    }

    /* renamed from: K */
    public final void mo20961K(String str) {
        this.f6646o.threadRun(new C3669h(this, str));
    }

    /* renamed from: L */
    public final void mo20962L() {
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        if (Build.VERSION.SDK_INT <= 30 || ContextCompat.checkSelfPermission(this.f6644m, "android.permission.BLUETOOTH_CONNECT") == 0) {
            this.f6644m.startActivityForResult(intent, 1);
        } else {
            mo20977b0("权限未开启");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r6 = com.clj.fastble.utils.HexUtil.formatHexString(r6, false).replace(" ", "").toLowerCase();
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20963M(byte[] r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f6633A
            r1 = 1
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
            goto L_0x0069
        L_0x000c:
            r0 = 0
            if (r6 != 0) goto L_0x0010
            return r0
        L_0x0010:
            java.lang.String r6 = com.clj.fastble.utils.HexUtil.formatHexString(r6, r0)
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            java.lang.String r6 = r6.replace(r2, r3)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r2 = "f103"
            int r2 = r6.lastIndexOf(r2)
            r3 = -1
            if (r2 == r3) goto L_0x0068
            int r3 = r2 + 44
            int r4 = r6.length()
            if (r3 < r4) goto L_0x0032
            goto L_0x0068
        L_0x0032:
            java.lang.String r6 = r6.substring(r2, r3)
            r0 = 20
            r2 = 24
            java.lang.String r6 = r6.substring(r0, r2)
            java.lang.String r0 = r5.f6633A
            java.lang.String r2 = "xxxx"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "0e00"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "1000"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "0b00"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0061
            return r1
        L_0x0061:
            java.lang.String r0 = r5.f6633A
            boolean r6 = r6.equalsIgnoreCase(r0)
            return r6
        L_0x0068:
            return r0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p303a.C3680q.mo20963M(byte[]):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo20964N() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f6633A
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case 1507423: goto L_0x002b;
                case 1525682: goto L_0x0021;
                case 1528565: goto L_0x0017;
                case 3694080: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "xxxx"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "0e00"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "0b00"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "1000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r4
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            java.lang.String r1 = "/app_flutter/"
            if (r0 == 0) goto L_0x009f
            if (r0 == r4) goto L_0x0080
            if (r0 == r3) goto L_0x0061
            if (r0 == r2) goto L_0x0042
            r0 = 0
            return r0
        L_0x0042:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.fragment.app.FragmentActivity r2 = r5.f6644m
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getParent()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "hob.zip"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.fragment.app.FragmentActivity r2 = r5.f6644m
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getParent()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "probe.zip"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.fragment.app.FragmentActivity r2 = r5.f6644m
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getParent()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "pot.zip"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x009f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.fragment.app.FragmentActivity r2 = r5.f6644m
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getParent()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "pan.zip"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p303a.C3680q.mo20964N():java.lang.String");
    }

    /* renamed from: O */
    public final String mo20965O(String str, String str2, String str3, String str4) {
        if (!str4.contains("{") || !str4.contains("}")) {
            return "{\"errorCode\":\"" + str + "\",\"errorDesc\":\"" + str2 + "\",\"resultCode\":\"" + str3 + "\",\"data\":\"" + str4 + "\"}";
        }
        return "{\"errorCode\":\"" + str + "\",\"errorDesc\":\"" + str2 + "\",\"resultCode\":\"" + str3 + "\",\"data\":" + str4 + "}";
    }

    /* renamed from: P */
    public final void mo20966P(C9016i iVar) {
        this.f6646o.threadRun(new C3668g(this, iVar));
    }

    /* renamed from: Q */
    public /* synthetic */ void mo20967Q(String str, Object obj) {
        this.f6642e.mo46573c(str, obj);
    }

    /* renamed from: R */
    public /* synthetic */ void mo20968R(String str) {
        BluetoothDevice bluetoothDevice;
        this.f6637E = str;
        Iterator<BTBean> it = this.f6643l.mo21017a().iterator();
        while (true) {
            if (!it.hasNext()) {
                bluetoothDevice = null;
                break;
            }
            BTBean next = it.next();
            if (next.getBleName().equals(str)) {
                bluetoothDevice = next.getBluetoothDevice();
                this.f6649r = next.getDeviceBleType();
                break;
            }
        }
        if (bluetoothDevice != null) {
            BleDeviceManager.INSTANCE.connectDevice(bluetoothDevice, 2);
            return;
        }
        BleDeviceManager.BleDeviceConnectCallBack bleDeviceConnectCallBack = this.f6652u;
        int parseInt = Integer.parseInt("2201");
        bleDeviceConnectCallBack.errorCallback("connBleDeviceCallback", "1", parseInt, "读取的wifiId异常：wifiId:" + this.f6645n, "");
    }

    /* renamed from: S */
    public /* synthetic */ void mo20969S(C9016i iVar) {
        try {
            JSONObject jSONObject = new JSONObject((String) iVar.f17688b);
            String string = jSONObject.getString("domain");
            this.f6647p = jSONObject.getInt("CC");
            String string2 = jSONObject.getString("DN");
            this.f6648q = string2;
            ConnectParameter.domain = string;
            BleDeviceManager.INSTANCE.sendCCAndDN(this.f6647p, string2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T */
    public /* synthetic */ void mo20970T(List list, boolean z) {
        WifiList wifiList = new WifiList();
        wifiList.setData(list);
        wifiList.setEndFlag(Boolean.valueOf(z));
        wifiList.setCurrentSSID(NetworkUtils.INSTANCE.getConnectWifiSsid(this.f6644m));
        mo20956F("wifiListCallback", new Gson().toJson((Object) wifiList));
    }

    /* renamed from: U */
    public /* synthetic */ boolean mo20971U(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                if (i == 2183) {
                    PermissionFragment permissionFragment = this.f6650s;
                    if (permissionFragment != null) {
                        permissionFragment.onActivityResult(i, i2, intent);
                    }
                    if (GpsUtils.INSTANCE.isOPen(this.f6644m)) {
                        mo20957G(false, false);
                    } else {
                        mo20956F("getBleDeviceCallback", Boolean.FALSE);
                    }
                    return true;
                } else if (i == 2184) {
                    mo20957G(false, false);
                }
            } else if (i2 != -1) {
                C9017j.C9022d dVar = this.f6653v;
                if (dVar != null) {
                    dVar.success("");
                }
                return true;
            } else if (intent != null) {
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    this.f6655x = data;
                    C9017j.C9022d dVar2 = this.f6653v;
                    if (dVar2 != null) {
                        dVar2.success(data.getPath());
                    }
                } else {
                    C9017j.C9022d dVar3 = this.f6653v;
                    if (dVar3 != null) {
                        dVar3.success("");
                    }
                }
            }
        } else if (i2 == -1) {
            if (this.f6634B) {
                BlueToothHelper.Companion.getInstances().searchBlueToothList();
            } else {
                mo20957G(false, false);
            }
            return true;
        } else if (i2 == 0) {
            mo20957G(true, false);
        }
        return false;
    }

    /* renamed from: V */
    public /* synthetic */ void mo20972V() {
        this.f6643l.mo21021f();
    }

    /* renamed from: W */
    public /* synthetic */ void mo20973W() {
        BleDeviceManager.INSTANCE.disconnect();
        BleDeviceManager.INSTANCE.close(true);
        this.f6643l.mo21022g();
    }

    /* renamed from: X */
    public /* synthetic */ void mo20974X() {
        mo20956F("getBleDeviceCallback", new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson((Object) this.f6643l.mo21017a(), new C3688r(this).getType()));
    }

    /* renamed from: Y */
    public /* synthetic */ void mo20975Y() {
        this.f6643l.mo21020e(new C3666e(this));
        if (!this.f6643l.mo21019d(this.f6649r)) {
            mo20956F("getBleDeviceCallback", (Object) null);
        }
    }

    /* renamed from: a0 */
    public final void mo20976a0(String str) {
    }

    /* renamed from: b0 */
    public final void mo20977b0(String str) {
    }

    /* renamed from: c0 */
    public final void mo20978c0() {
        if (this.f6639G == null) {
            this.f6639G = new C3678p(this.f6641I);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
            this.f6644m.registerReceiver(this.f6639G, intentFilter);
        }
    }

    /* renamed from: d0 */
    public final void mo20979d0() {
        if (this.f6657z != null) {
            BlueToothHelper.Companion.getInstances().disConnectBle(this.f6657z);
        }
        this.f6655x = null;
        this.f6656y = null;
        this.f6657z = null;
    }

    /* renamed from: e0 */
    public final void mo20980e0() {
        BleDeviceManager.INSTANCE.setSendIndex(-1);
        this.f6646o.threadRun(new C3663b(this));
    }

    /* renamed from: f0 */
    public final void mo20981f0() {
        C3678p pVar = this.f6639G;
        if (pVar != null) {
            this.f6644m.unregisterReceiver(pVar);
            this.f6639G = null;
        }
    }

    /* renamed from: g0 */
    public final void mo20982g0(C9016i iVar) {
        this.f6646o.threadRun(new C3673l(iVar));
    }

    public void onAttachedToActivity(@NonNull C8950c cVar) {
        FragmentActivity fragmentActivity = (FragmentActivity) cVar.mo46419d();
        this.f6644m = fragmentActivity;
        ((Application) fragmentActivity.getApplicationContext()).registerActivityLifecycleCallbacks(new C3682b());
        cVar.mo46415a(new C3664c(this));
    }

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        C9017j jVar = new C9017j(bVar.mo46467d().mo46371h(), "com.juconnect.connectlife/juBleMethod");
        this.f6642e = jVar;
        jVar.mo46575e(this);
        BlueToothHelper.Companion.getInstances().setListener(this.f6635C);
        if (this.f6646o == null) {
            this.f6646o = ThreadUtils.Companion.getInstance();
        }
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        this.f6642e.mo46575e((C9017j.C9021c) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(@androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9016i r8, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f17687a
            int r1 = r0.hashCode()
            r2 = -1
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            switch(r1) {
                case -2129330689: goto L_0x00a9;
                case -1656373096: goto L_0x009e;
                case -1581470752: goto L_0x0094;
                case -1517155372: goto L_0x0089;
                case -393737262: goto L_0x007f;
                case -318784841: goto L_0x0075;
                case 55926088: goto L_0x006a;
                case 63719926: goto L_0x005f;
                case 146992730: goto L_0x0055;
                case 310044234: goto L_0x0049;
                case 476559938: goto L_0x003d;
                case 737050313: goto L_0x0032;
                case 1298523858: goto L_0x0027;
                case 1316780890: goto L_0x001b;
                case 1714778527: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x00b3
        L_0x0010:
            java.lang.String r1 = "stopScan"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 6
            goto L_0x00b4
        L_0x001b:
            java.lang.String r1 = "startOTA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 12
            goto L_0x00b4
        L_0x0027:
            java.lang.String r1 = "turnOnBluetooth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = r3
            goto L_0x00b4
        L_0x0032:
            java.lang.String r1 = "getWifiList"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 4
            goto L_0x00b4
        L_0x003d:
            java.lang.String r1 = "cancelOTA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 13
            goto L_0x00b4
        L_0x0049:
            java.lang.String r1 = "searchAccessory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 9
            goto L_0x00b4
        L_0x0055:
            java.lang.String r1 = "initBlePermission"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = r6
            goto L_0x00b4
        L_0x005f:
            java.lang.String r1 = "disConnectAccessory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 14
            goto L_0x00b4
        L_0x006a:
            java.lang.String r1 = "connectAccessory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 11
            goto L_0x00b4
        L_0x0075:
            java.lang.String r1 = "wifiConfig"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 5
            goto L_0x00b4
        L_0x007f:
            java.lang.String r1 = "closeConnect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 7
            goto L_0x00b4
        L_0x0089:
            java.lang.String r1 = "releaseBle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 8
            goto L_0x00b4
        L_0x0094:
            java.lang.String r1 = "connectDevice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = r4
            goto L_0x00b4
        L_0x009e:
            java.lang.String r1 = "selectFile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = 10
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r1 = "startScan"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b3
            r0 = r5
            goto L_0x00b4
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x029b;
                case 1: goto L_0x0291;
                case 2: goto L_0x0287;
                case 3: goto L_0x0268;
                case 4: goto L_0x0250;
                case 5: goto L_0x0234;
                case 6: goto L_0x021e;
                case 7: goto L_0x0203;
                case 8: goto L_0x01e4;
                case 9: goto L_0x0165;
                case 10: goto L_0x0153;
                case 11: goto L_0x012b;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00cd;
                case 14: goto L_0x00bd;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            r9.notImplemented()
            goto L_0x02cf
        L_0x00bd:
            java.lang.String r8 = "收到来自Flutter的指令:disConnectAccessory"
            r7.mo20976a0(r8)
            r7.mo20979d0()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9.success(r8)
            goto L_0x02cf
        L_0x00cd:
            java.lang.String r8 = "收到来自Flutter的指令:cancelOTA"
            r7.mo20976a0(r8)
            r7.f6653v = r9
            com.juconnect.connectlife.ju_ble.BlueToothHelper$Companion r8 = com.juconnect.connectlife.ju_ble.BlueToothHelper.Companion
            com.juconnect.connectlife.ju_ble.BlueToothHelper r8 = r8.getInstances()
            r8.stopDfuUpdate()
            goto L_0x02cf
        L_0x00e0:
            java.lang.String r8 = "收到来自Flutter的指令:startOTA"
            r7.mo20976a0(r8)
            java.lang.String r8 = r7.mo20964N()
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "selectBleDevMac:"
            r0.append(r2)
            java.lang.String r2 = r7.f6656y
            r0.append(r2)
            java.lang.String r2 = "\tselectPath:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r9.println(r0)
            java.lang.String r9 = r7.f6656y
            if (r9 == 0) goto L_0x0124
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0124
            if (r8 != 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            com.juconnect.connectlife.ju_ble.BlueToothHelper$Companion r9 = com.juconnect.connectlife.ju_ble.BlueToothHelper.Companion
            com.juconnect.connectlife.ju_ble.BlueToothHelper r9 = r9.getInstances()
            java.lang.String r0 = r7.f6656y
            r9.startDfuOta(r0, r8)
            goto L_0x02cf
        L_0x0124:
            java.lang.String r8 = "otaProgressCallback"
            r7.mo20956F(r8, r1)
            goto L_0x02cf
        L_0x012b:
            java.lang.String r0 = "收到来自Flutter的指令:conenctAccessory"
            r7.mo20976a0(r0)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "收到flutter消息:connectAccessory"
            r0.println(r1)
            java.lang.Object r0 = r8.f17688b
            if (r0 == 0) goto L_0x02cf
            com.juconnect.connectlife.ju_ble.BlueToothHelper$Companion r0 = com.juconnect.connectlife.ju_ble.BlueToothHelper.Companion
            com.juconnect.connectlife.ju_ble.BlueToothHelper r0 = r0.getInstances()
            java.lang.Object r1 = r8.f17688b
            java.lang.String r1 = r1.toString()
            c.y.b.a.q$a r2 = new c.y.b.a.q$a
            r2.<init>(r8, r9)
            r0.connectDeviceAndGetInfo(r1, r2)
            goto L_0x02cf
        L_0x0153:
            java.lang.String r8 = "收到来自Flutter的指令:selectFile"
            r7.mo20976a0(r8)
            r7.f6653v = r9
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r9 = "错误的方法调用,flutter现在已经不该调用这个方法!"
            r8.println(r9)
            goto L_0x02cf
        L_0x0165:
            java.lang.String r0 = "收到来自Flutter的指令:searchAccessory"
            r7.mo20976a0(r0)
            r7.f6634B = r5
            java.lang.Object r8 = r8.f17688b
            if (r8 == 0) goto L_0x02cf
            java.lang.String r8 = r8.toString()
            int r0 = r8.hashCode()
            switch(r0) {
                case 49: goto L_0x019b;
                case 50: goto L_0x0191;
                case 51: goto L_0x0187;
                case 52: goto L_0x017d;
                default: goto L_0x017c;
            }
        L_0x017c:
            goto L_0x01a4
        L_0x017d:
            java.lang.String r0 = "4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01a4
            r2 = r4
            goto L_0x01a4
        L_0x0187:
            java.lang.String r0 = "3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01a4
            r2 = r3
            goto L_0x01a4
        L_0x0191:
            java.lang.String r0 = "2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01a4
            r2 = r5
            goto L_0x01a4
        L_0x019b:
            java.lang.String r0 = "1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01a4
            r2 = r6
        L_0x01a4:
            if (r2 == 0) goto L_0x01be
            if (r2 == r5) goto L_0x01b9
            if (r2 == r3) goto L_0x01b4
            if (r2 == r4) goto L_0x01af
            r7.f6633A = r1
            goto L_0x01c2
        L_0x01af:
            java.lang.String r8 = "xxxx"
            r7.f6633A = r8
            goto L_0x01c2
        L_0x01b4:
            java.lang.String r8 = "1000"
            r7.f6633A = r8
            goto L_0x01c2
        L_0x01b9:
            java.lang.String r8 = "0e00"
            r7.f6633A = r8
            goto L_0x01c2
        L_0x01be:
            java.lang.String r8 = "0b00"
            r7.f6633A = r8
        L_0x01c2:
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "收到Flutter的过滤设备代码为:"
            r0.append(r1)
            java.lang.String r1 = r7.f6633A
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.println(r0)
            r7.f6653v = r9
            r7.f6636D = r6
            r7.mo20960J()
            goto L_0x02cf
        L_0x01e4:
            java.lang.String r8 = "收到来自Flutter的指令:releaseBle"
            r7.mo20976a0(r8)
            r7.mo20981f0()
            java.lang.String r8 = ""
            r7.f6637E = r8
            r7.f6638F = r1
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils$Companion r8 = com.juconnect.connectlife.ju_ble.utils.ThreadUtils.Companion
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils r8 = r8.getInstance()
            c.y.b.a.i r9 = new c.y.b.a.i
            r9.<init>(r7)
            r8.threadRun(r9)
            goto L_0x02cf
        L_0x0203:
            java.lang.String r8 = "收到来自Flutter的指令:closeConnect"
            r7.mo20976a0(r8)
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils$Companion r8 = com.juconnect.connectlife.ju_ble.utils.ThreadUtils.Companion
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils r8 = r8.getInstance()
            com.juconnect.connectlife.ju_ble.BleDeviceManager r9 = com.juconnect.connectlife.ju_ble.BleDeviceManager.INSTANCE
            java.util.Objects.requireNonNull(r9)
            c.y.b.a.m r0 = new c.y.b.a.m
            r0.<init>(r9)
            r8.threadRun(r0)
            goto L_0x02cf
        L_0x021e:
            java.lang.String r8 = "收到来自Flutter的指令:stopScan"
            r7.mo20976a0(r8)
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils$Companion r8 = com.juconnect.connectlife.ju_ble.utils.ThreadUtils.Companion
            com.juconnect.connectlife.ju_ble.utils.ThreadUtils r8 = r8.getInstance()
            c.y.b.a.k r9 = new c.y.b.a.k
            r9.<init>(r7)
            r8.threadRun(r9)
            goto L_0x02cf
        L_0x0234:
            java.lang.String r9 = "收到来自Flutter的指令:wifiConfig"
            r7.mo20976a0(r9)
            r7.f6638F = r8
            com.juconnect.connectlife.ju_ble.BleDeviceManager r9 = com.juconnect.connectlife.ju_ble.BleDeviceManager.INSTANCE
            boolean r9 = r9.isConnect()
            if (r9 == 0) goto L_0x0249
            r7.mo20982g0(r8)
            goto L_0x02cf
        L_0x0249:
            java.lang.String r8 = r7.f6637E
            r7.mo20961K(r8)
            goto L_0x02cf
        L_0x0250:
            java.lang.String r9 = "收到来自Flutter的指令:getWifiList"
            r7.mo20976a0(r9)
            com.juconnect.connectlife.ju_ble.BleDeviceManager r9 = com.juconnect.connectlife.ju_ble.BleDeviceManager.INSTANCE
            boolean r9 = r9.isConnect()
            if (r9 == 0) goto L_0x0262
            r7.mo20966P(r8)
            goto L_0x02cf
        L_0x0262:
            java.lang.String r8 = r7.f6637E
            r7.mo20961K(r8)
            goto L_0x02cf
        L_0x0268:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "收到来自Flutter的指令:connectDevice 收到的参数为:"
            r9.append(r0)
            java.lang.Object r0 = r8.f17688b
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r7.mo20976a0(r9)
            java.lang.Object r8 = r8.f17688b
            java.lang.String r8 = (java.lang.String) r8
            r7.mo20961K(r8)
            goto L_0x02cf
        L_0x0287:
            java.lang.String r8 = "收到来自Flutter的指令:turnOnBluetooth"
            r7.mo20976a0(r8)
            r7.mo20957G(r6, r5)
            goto L_0x02cf
        L_0x0291:
            java.lang.String r9 = "收到来自Flutter的指令:startScan "
            r7.mo20976a0(r9)
            r7.mo20955E(r8)
            goto L_0x02cf
        L_0x029b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "收到来自Flutter的指令:initBlePermission 参数devType:"
            r9.append(r0)
            java.lang.Object r0 = r8.f17688b
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r7.mo20976a0(r9)
            com.juconnect.connectlife.ju_ble.BleDeviceManager r9 = com.juconnect.connectlife.ju_ble.BleDeviceManager.INSTANCE
            androidx.fragment.app.FragmentActivity r0 = r7.f6644m
            android.app.Application r0 = r0.getApplication()
            com.juconnect.connectlife.ju_ble.BleDeviceManager$BleDeviceConnectCallBack r1 = r7.f6652u
            com.juconnect.connectlife.ju_ble.BleDeviceManager$BleWifiListListener r2 = r7.f6651t
            r9.initBle(r0, r1, r2)
            r7.f6634B = r6
            java.lang.Object r8 = r8.f17688b
            java.lang.String r8 = (java.lang.String) r8
            r7.f6649r = r8
            r7.mo20978c0()
            r7.mo20957G(r6, r6)
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p303a.C3680q.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    public void onReattachedToActivityForConfigChanges(C8950c cVar) {
    }
}

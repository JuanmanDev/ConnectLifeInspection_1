package com.juconnect.connectlife.ju_dist;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import com.juconnect.connectlife.ju_dist.JuDistPlugin$networkCallback$2;
import com.juconnect.connectlife.ju_dist.connect.ConnectParameter;
import com.juconnect.connectlife.ju_dist.connect.ConnectStep;
import com.juconnect.connectlife.ju_dist.connect.order.SearchWifiOrder;
import com.juconnect.connectlife.ju_dist.connect.order.SearchWifiReplyOrder;
import com.juconnect.connectlife.ju_dist.connect.order.WiFiArr;
import com.juconnect.connectlife.ju_dist.connect.order.ZeroSettingReplyOrder;
import com.juconnect.connectlife.ju_dist.event.EventUnregisterNetwork;
import com.juconnect.connectlife.ju_dist.fbean.CLPairAPInfo;
import com.juconnect.connectlife.ju_dist.fbean.SoftAp;
import com.juconnect.connectlife.ju_dist.fbean.SoftApResult;
import com.juconnect.connectlife.ju_dist.fbean.WifiList;
import com.juconnect.connectlife.ju_dist.utils.FindUtils;
import com.juconnect.connectlife.ju_dist.utils.GpsUtils;
import com.juconnect.connectlife.ju_dist.utils.LogUtils;
import com.juconnect.connectlife.ju_dist.utils.NetworkUtils;
import com.juconnect.connectlife.ju_dist.utils.PermissionActivity;
import com.juconnect.connectlife.ju_dist.utils.ProtocolUtils;
import com.juconnect.connectlife.ju_dist.utils.ThreadUtils;
import com.juconnect.connectlife.ju_dist.utils.WifiNameUtils;
import java.net.URL;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p040c.p301y.p302b.p305b.C3707a;
import p040c.p301y.p302b.p305b.C3708b;
import p040c.p301y.p302b.p305b.C3710d;
import p040c.p301y.p302b.p305b.C3713g;
import p040c.p301y.p302b.p305b.C3715i;
import p040c.p301y.p302b.p305b.C3716j;
import p040c.p301y.p302b.p305b.C3717k;
import p040c.p301y.p302b.p305b.C3718l;
import p040c.p301y.p302b.p305b.C3719m;
import p040c.p301y.p302b.p305b.C3720n;
import p040c.p301y.p302b.p305b.C3722p;
import p040c.p301y.p302b.p305b.C3724r;
import p040c.p472t.p473a.C7585u;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0016\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001cH\u0002J \u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0002J\b\u00100\u001a\u00020!H\u0002J\u0012\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020!H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u00106\u001a\u00020!2\u0006\u00107\u001a\u000203H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020\u001cH\u0002J\u0010\u0010:\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u00020!2\b\b\u0001\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020!H\u0016J\b\u0010B\u001a\u00020!H\u0016J\u0012\u0010C\u001a\u00020!2\b\b\u0001\u0010<\u001a\u00020@H\u0016J\u0018\u0010D\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010E\u001a\u00020!2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010F\u001a\u00020!H\u0002J\u0018\u0010G\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001a\u0010H\u001a\u00020!2\b\u0010I\u001a\u0004\u0018\u00010\u001c2\u0006\u0010J\u001a\u00020\u001cH\u0002J\u0010\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010O\u001a\u00020!H\u0002J\b\u0010P\u001a\u00020!H\u0002J\b\u0010Q\u001a\u00020!H\u0002J\b\u0010R\u001a\u00020!H\u0002J\f\u0010:\u001a\u00020!*\u00020\u001cH\u0002J\f\u0010S\u001a\u00020!*\u00020\u001cH\u0002J\f\u0010T\u001a\u00020!*\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/JuDistPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "()V", "activity", "Landroidx/fragment/app/FragmentActivity;", "connectivityManager", "Landroid/net/ConnectivityManager;", "findUtils", "Lcom/juconnect/connectlife/ju_dist/utils/FindUtils;", "mLockObj", "Ljava/lang/Object;", "getMLockObj", "()Ljava/lang/Object;", "mNetwork", "Landroid/net/Network;", "getMNetwork", "()Landroid/net/Network;", "setMNetwork", "(Landroid/net/Network;)V", "networkCallback", "com/juconnect/connectlife/ju_dist/JuDistPlugin$networkCallback$2$1", "getNetworkCallback", "()Lcom/juconnect/connectlife/ju_dist/JuDistPlugin$networkCallback$2$1;", "networkCallback$delegate", "Lkotlin/Lazy;", "softAPGateway", "", "startSoftApSSID", "threadUtils", "Lcom/juconnect/connectlife/ju_dist/utils/ThreadUtils;", "checkAndReconnectSocket", "", "closeSocket", "decryptUseDES", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "findDevice", "findDeviceSucess", "getErrorJson", "errcode", "errMsg", "resultCode", "getSuccessJson", "data", "getTimeZone", "getWifiName", "ignorePermission", "", "initWifiListener", "isConnection", "isConnectionResult", "connective", "locationPermissionCallback", "content", "log", "onAttachedToActivity", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToEngine", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onDetachedFromEngine", "onMethodCall", "onReattachedToActivityForConfigChanges", "openSetting", "searchWifi", "sendCmdCallback", "name", "value", "setSoftResult", "softApResult", "Lcom/juconnect/connectlife/ju_dist/fbean/SoftApResult;", "settingWifi", "stopFindDevice", "tryGetWifiName", "unResiterNetwork", "verifySetting", "logE", "logW", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin implements C8944a, C9017j.C9021c, C8948a {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String ERROR_CODE_SETTING_WIFI_FAILED = "1203";
    @NotNull
    public static final String ERROR_CODE_TCP_CONNECT_FAILED = "1103";
    @NotNull
    public static final String METHOD_LOCATION_PERMISSION_CALLBACK = "locationPermissionCallback";
    @NotNull
    public static final String METHOD_SEND_COMMAND_CALLBACK = "add_appliance_send_commond";
    @NotNull
    public static final String PERMISSION_DENIED = "denied";
    @NotNull
    public static final String PERMISSION_GRANT = "grant";
    @NotNull
    public static final String PERMISSION_NOT_DETERMINED = "notDetermined";
    @NotNull
    public static final String TAG = "CONNECT";
    @Nullable
    public static C9017j channel;
    public FragmentActivity activity;
    @Nullable
    public ConnectivityManager connectivityManager;
    public FindUtils findUtils;
    @NotNull
    public final Object mLockObj = new Object();
    @Nullable
    public Network mNetwork;
    @NotNull
    public final Lazy networkCallback$delegate = LazyKt__LazyJVMKt.lazy(new JuDistPlugin$networkCallback$2(this));
    @NotNull
    public String softAPGateway = "";
    @Nullable
    public String startSoftApSSID;
    @NotNull
    public ThreadUtils threadUtils = ThreadUtils.Companion.getInstance();

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/JuDistPlugin$Companion;", "", "()V", "ERROR_CODE_SETTING_WIFI_FAILED", "", "ERROR_CODE_TCP_CONNECT_FAILED", "METHOD_LOCATION_PERMISSION_CALLBACK", "METHOD_SEND_COMMAND_CALLBACK", "PERMISSION_DENIED", "PERMISSION_GRANT", "PERMISSION_NOT_DETERMINED", "TAG", "channel", "Lio/flutter/plugin/common/MethodChannel;", "getChannel", "()Lio/flutter/plugin/common/MethodChannel;", "setChannel", "(Lio/flutter/plugin/common/MethodChannel;)V", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: JuDistPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final C9017j getChannel() {
            return JuDistPlugin.channel;
        }

        public final void setChannel(@Nullable C9017j jVar) {
            JuDistPlugin.channel = jVar;
        }
    }

    private final void checkAndReconnectSocket() {
        if (!ProtocolUtils.Companion.getInstance().isConnected()) {
            ProtocolUtils.Companion.getInstance().connect(this.softAPGateway, 5020, this.mNetwork, new JuDistPlugin$checkAndReconnectSocket$1(this));
        }
    }

    private final void closeSocket() {
        try {
            if (this.findUtils != null) {
                FindUtils findUtils2 = this.findUtils;
                if (findUtils2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("findUtils");
                    findUtils2 = null;
                }
                findUtils2.close();
            }
            if (ProtocolUtils.Companion.getInstance().isConnected()) {
                ProtocolUtils.Companion.getInstance().close();
            }
            this.softAPGateway = "";
            FragmentActivity fragmentActivity = this.activity;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                fragmentActivity = null;
            }
            Object systemService = fragmentActivity.getSystemService("connectivity");
            if (systemService != null) {
                ((ConnectivityManager) systemService).bindProcessToNetwork((Network) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void decryptUseDES(C9016i iVar, C9017j.C9022d dVar) {
        String a = C3724r.m9338a(iVar.f17688b.toString());
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("getDESDecryptDataCallback", a);
        }
    }

    private final void findDevice(C9016i iVar) {
        if (this.findUtils == null) {
            FindUtils findUtils2 = new FindUtils();
            this.findUtils = findUtils2;
            FragmentActivity fragmentActivity = null;
            if (findUtils2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("findUtils");
                findUtils2 = null;
            }
            FragmentActivity fragmentActivity2 = this.activity;
            if (fragmentActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            } else {
                fragmentActivity = fragmentActivity2;
            }
            findUtils2.init(fragmentActivity, new JuDistPlugin$findDevice$2(this));
        }
        this.threadUtils.threadRun(new C3719m(this));
        this.threadUtils.threadRun(new C3722p(this));
    }

    /* renamed from: findDevice$lambda-7  reason: not valid java name */
    public static final void m26782findDevice$lambda7(JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        try {
            FindUtils findUtils2 = juDistPlugin.findUtils;
            if (findUtils2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("findUtils");
                findUtils2 = null;
            }
            findUtils2.listen();
        } catch (Exception e) {
            e.printStackTrace();
            Intrinsics.stringPlus("listen err:", e.getMessage());
        }
    }

    /* renamed from: findDevice$lambda-8  reason: not valid java name */
    public static final void m26783findDevice$lambda8(JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        try {
            FindUtils findUtils2 = juDistPlugin.findUtils;
            if (findUtils2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("findUtils");
                findUtils2 = null;
            }
            findUtils2.send();
        } catch (Exception e) {
            e.printStackTrace();
            Intrinsics.stringPlus("send err:", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void findDeviceSucess(String str) {
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("searchModuleListCallback", str);
        }
    }

    /* access modifiers changed from: private */
    public final String getErrorJson(String str, String str2, String str3) {
        return "{\"errorCode\":\"" + str + "\",\"errorDesc\":\"" + str2 + "\",\"resultCode\":\"" + str3 + "\"}";
    }

    private final JuDistPlugin$networkCallback$2.C40781 getNetworkCallback() {
        return (JuDistPlugin$networkCallback$2.C40781) this.networkCallback$delegate.getValue();
    }

    private final String getSuccessJson(String str) {
        return "{\"errorCode\":\"0\",\"errorDes\":\"success\",\"resultCode\":\"0\",\"data\":\"" + str + "\"}";
    }

    private final void getTimeZone() {
        TimeZone timeZone = TimeZone.getDefault();
        C9017j jVar = channel;
        if (jVar != null) {
            String id = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            jVar.mo46573c("getTimeZoneCallback", getSuccessJson(id));
        }
    }

    private final void getWifiName(boolean z) {
        if (!z) {
            GpsUtils gpsUtils = GpsUtils.INSTANCE;
            FragmentActivity fragmentActivity = this.activity;
            FragmentActivity fragmentActivity2 = null;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                fragmentActivity = null;
            }
            if (!gpsUtils.isOPen(fragmentActivity)) {
                FragmentActivity fragmentActivity3 = this.activity;
                if (fragmentActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    fragmentActivity3 = null;
                }
                Intent intent = new Intent(fragmentActivity3, PermissionActivity.class);
                FragmentActivity fragmentActivity4 = this.activity;
                if (fragmentActivity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                } else {
                    fragmentActivity2 = fragmentActivity4;
                }
                fragmentActivity2.startActivity(intent);
                return;
            }
            List listOf = CollectionsKt__CollectionsKt.listOf(PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION");
            FragmentActivity fragmentActivity5 = this.activity;
            if (fragmentActivity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                fragmentActivity5 = null;
            }
            if (!C7585u.m21554c(fragmentActivity5, listOf)) {
                C9017j jVar = channel;
                if (jVar != null) {
                    jVar.mo46573c("getWifiNameCallback", "");
                }
                FragmentActivity fragmentActivity6 = this.activity;
                if (fragmentActivity6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                } else {
                    fragmentActivity2 = fragmentActivity6;
                }
                C7585u l = C7585u.m21560l(fragmentActivity2);
                l.mo33041f(listOf);
                l.mo33043h(new JuDistPlugin$getWifiName$1(this));
                return;
            }
        }
        tryGetWifiName();
    }

    public static /* synthetic */ void getWifiName$default(JuDistPlugin juDistPlugin, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        juDistPlugin.getWifiName(z);
    }

    private final void initWifiListener() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            fragmentActivity = null;
        }
        Object systemService = fragmentActivity.getApplicationContext().getSystemService("connectivity");
        if (systemService != null) {
            this.connectivityManager = (ConnectivityManager) systemService;
            NetworkRequest build = new NetworkRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            ConnectivityManager connectivityManager2 = this.connectivityManager;
            Intrinsics.checkNotNull(connectivityManager2);
            connectivityManager2.registerNetworkCallback(build, getNetworkCallback());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    private final void isConnection(C9017j.C9022d dVar) {
        this.threadUtils.threadRun(new C3710d(this));
    }

    /* renamed from: isConnection$lambda-10  reason: not valid java name */
    public static final void m26784isConnection$lambda10(JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        try {
            new URL("https://www.baidu.com").openStream().close();
            juDistPlugin.isConnectionResult(true);
        } catch (Exception unused) {
            juDistPlugin.isConnectionResult(false);
        }
    }

    private final void isConnectionResult(boolean z) {
        this.threadUtils.mainRun(new C3717k(z));
    }

    /* renamed from: isConnectionResult$lambda-11  reason: not valid java name */
    public static final void m26785isConnectionResult$lambda11(boolean z) {
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("isConnectiveCallBack", String.valueOf(z));
        }
    }

    /* access modifiers changed from: private */
    public final void locationPermissionCallback(String str) {
        log(Intrinsics.stringPlus("回给Flutter的方法：locationPermissionCallback , 参数：", str));
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c(METHOD_LOCATION_PERMISSION_CALLBACK, str);
        }
    }

    private final void log(C9016i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("函数:");
        sb.append(iVar.f17687a);
        sb.append("\t参数:");
        Object obj = iVar.f17688b;
        sb.append(obj == null ? null : obj.toString());
        sb.toString();
    }

    private final void log(String str) {
    }

    /* access modifiers changed from: private */
    public final void logE(String str) {
    }

    private final void logW(String str) {
    }

    private final void openSetting() {
        NetworkUtils networkUtils = NetworkUtils.INSTANCE;
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            fragmentActivity = null;
        }
        networkUtils.openNetSetting(fragmentActivity);
    }

    private final void searchWifi(C9016i iVar, C9017j.C9022d dVar) {
        log(iVar);
        this.threadUtils.threadRun(new C3713g(iVar, this));
    }

    /* renamed from: searchWifi$lambda-2  reason: not valid java name */
    public static final void m26786searchWifi$lambda2(C9016i iVar, JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(iVar, "$call");
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(iVar.f17688b.toString());
            Object obj = jSONObject.get("domain");
            int parseInt = Integer.parseInt(jSONObject.get("CC").toString());
            String obj2 = jSONObject.get("DN").toString();
            ConnectParameter.INSTANCE.setDomain(obj.toString());
            FragmentActivity fragmentActivity = juDistPlugin.activity;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                fragmentActivity = null;
            }
            Object systemService = fragmentActivity.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                WifiManager wifiManager = (WifiManager) systemService;
                String formatIpAddress = Formatter.formatIpAddress(wifiManager.getDhcpInfo().gateway);
                String formatIpAddress2 = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
                LogUtils.Companion.debug("CONNECT", Intrinsics.stringPlus("wifi模块动态域名：", ConnectParameter.INSTANCE.getDomain()));
                LogUtils.Companion.debug("CONNECT", Intrinsics.stringPlus("gateway:", formatIpAddress));
                LogUtils.Companion.debug("CONNECT", Intrinsics.stringPlus("ip:", formatIpAddress2));
                Intrinsics.checkNotNullExpressionValue(formatIpAddress, "gateway");
                juDistPlugin.softAPGateway = formatIpAddress;
                juDistPlugin.checkAndReconnectSocket();
                SearchWifiOrder searchWifiOrder = new SearchWifiOrder();
                searchWifiOrder.setCC(Integer.valueOf(parseInt));
                searchWifiOrder.setDN(obj2);
                juDistPlugin.sendCmdCallback("get_wifi_list", searchWifiOrder.getJson());
                SearchWifiReplyOrder searchWifi = ProtocolUtils.Companion.getInstance().searchWifi(searchWifiOrder, new JuDistPlugin$searchWifi$1$searchWifi$1(juDistPlugin));
                juDistPlugin.log("=========最后一包=========");
                String json = new Gson().toJson((Object) new WifiList(searchWifi.getJson(), true));
                juDistPlugin.logE(Intrinsics.stringPlus("准备发送给flutter的数据:", json));
                juDistPlugin.threadUtils.mainRun(new C3715i(json));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.Companion.debug("CONNECT异常", e.getMessage());
            ProtocolUtils.Companion.getInstance().close();
        }
    }

    /* renamed from: searchWifi$lambda-2$lambda-1  reason: not valid java name */
    public static final void m26787searchWifi$lambda2$lambda1(String str) {
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("getWiFiListCallback", str);
        }
    }

    /* access modifiers changed from: private */
    public final void sendCmdCallback(String str, String str2) {
        try {
            this.threadUtils.mainRun(new C3720n(str, str2, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: sendCmdCallback$lambda-12  reason: not valid java name */
    public static final void m26788sendCmdCallback$lambda12(String str, String str2, JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(str2, "$value");
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pairType", "softAp");
        jSONObject.put("name", str);
        jSONObject.put("value", str2);
        juDistPlugin.log(Intrinsics.stringPlus("准备通过add_appliance_send_commond方法回传给flutter的模组指令是：", str2));
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c(METHOD_SEND_COMMAND_CALLBACK, jSONObject.toString());
        }
    }

    private final void setSoftResult(SoftApResult softApResult) {
        ConnectStep.INSTANCE.setSetting(false);
        this.threadUtils.mainRun(new C3716j(softApResult, this));
    }

    /* renamed from: setSoftResult$lambda-6  reason: not valid java name */
    public static final void m26789setSoftResult$lambda6(SoftApResult softApResult, JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(softApResult, "$softApResult");
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultCode", "0");
        jSONObject.put("errorDes", softApResult.getErrorDes());
        jSONObject.put("errorCode", softApResult.getErrorCode());
        JSONObject jSONObject2 = new JSONObject();
        SoftAp data = softApResult.getData();
        String str = null;
        jSONObject2.put("WifiId", data == null ? null : data.getWifiId());
        SoftAp data2 = softApResult.getData();
        jSONObject2.put("DevId", data2 == null ? null : data2.getDevId());
        SoftAp data3 = softApResult.getData();
        jSONObject2.put("DevType", data3 == null ? null : data3.getDevType());
        SoftAp data4 = softApResult.getData();
        if (data4 != null) {
            str = data4.getDevProductType();
        }
        jSONObject2.put("DevProductType", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(GeneralMethodConstant.METHOD_DEVICE_INFO, jSONObject2);
        jSONObject3.put("ticket", ConnectParameter.INSTANCE.getTicket());
        jSONObject.put("data", jSONObject3);
        Intrinsics.stringPlus("给Flutter返回配网配置信息:", jSONObject);
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("startSoftApCallback", jSONObject.toString());
        }
        juDistPlugin.unResiterNetwork();
    }

    private final void settingWifi(C9016i iVar) {
        log(iVar);
        CLPairAPInfo cLPairAPInfo = (CLPairAPInfo) new Gson().fromJson(iVar.f17688b.toString(), new JuDistPlugin$settingWifi$resultType$1().getType());
        String password = cLPairAPInfo.getPassword();
        if (password != null) {
            this.threadUtils.threadRun(new C3708b(this, cLPairAPInfo, password));
        }
    }

    /* renamed from: settingWifi$lambda-5$lambda-4  reason: not valid java name */
    public static final void m26790settingWifi$lambda5$lambda4(JuDistPlugin juDistPlugin, CLPairAPInfo cLPairAPInfo, String str) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        Intrinsics.checkNotNullParameter(str, "$it");
        try {
            juDistPlugin.checkAndReconnectSocket();
            juDistPlugin.startSoftApSSID = cLPairAPInfo.getSsid();
            ConnectStep.INSTANCE.setSetting(true);
            WiFiArr wiFiArr = new WiFiArr();
            wiFiArr.setBSSID(cLPairAPInfo.getBssid());
            wiFiArr.setPassword(cLPairAPInfo.getPassword());
            wiFiArr.setSSID(cLPairAPInfo.getSsid());
            juDistPlugin.log("准备发送给设备模组的信息: BSSID:" + cLPairAPInfo.getBssid() + " , PASSWORD:" + cLPairAPInfo.getPassword() + " , SSID:" + cLPairAPInfo.getSsid());
            ZeroSettingReplyOrder zeroSettingReplyOrder = ProtocolUtils.Companion.getInstance().settingWifi(wiFiArr, str, new JuDistPlugin$settingWifi$1$1$settingWifi$1(juDistPlugin));
            juDistPlugin.log(Intrinsics.stringPlus("设备模组返回了信息:", zeroSettingReplyOrder.getDevInfo()));
            SoftApResult softApResult = new SoftApResult(zeroSettingReplyOrder);
            ConnectStep.INSTANCE.setVerifying(true);
            juDistPlugin.startSoftApSSID = null;
            juDistPlugin.setSoftResult(softApResult);
        } catch (Exception e) {
            LogUtils.Companion.debug("CONNECT", Intrinsics.stringPlus("配网的时候异常 : ", e.getMessage()));
            e.printStackTrace();
            ConnectStep.INSTANCE.setSetting(false);
            ProtocolUtils.Companion.getInstance().close();
            juDistPlugin.threadUtils.mainRun(new C3718l(juDistPlugin, e));
        }
    }

    /* renamed from: settingWifi$lambda-5$lambda-4$lambda-3  reason: not valid java name */
    public static final void m26791settingWifi$lambda5$lambda4$lambda3(JuDistPlugin juDistPlugin, Exception exc) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        Intrinsics.checkNotNullParameter(exc, "$e");
        String errorJson = juDistPlugin.getErrorJson(ERROR_CODE_SETTING_WIFI_FAILED, Intrinsics.stringPlus("异常", exc.getMessage()), "2");
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46573c("startSoftApCallback", errorJson);
        }
    }

    private final void stopFindDevice() {
    }

    private final void tryGetWifiName() {
        try {
            WifiNameUtils.Companion companion = WifiNameUtils.Companion;
            FragmentActivity fragmentActivity = this.activity;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                fragmentActivity = null;
            }
            String wifiName = companion.wifiName(fragmentActivity);
            C9017j jVar = channel;
            if (jVar != null) {
                jVar.mo46573c("getWifiNameCallback", wifiName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C9017j jVar2 = channel;
            if (jVar2 != null) {
                jVar2.mo46573c("getWifiNameCallback", "");
            }
        }
    }

    private final void unResiterNetwork() {
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        if (connectivityManager2 != null) {
            connectivityManager2.unregisterNetworkCallback(getNetworkCallback());
        }
        ConnectivityManager connectivityManager3 = this.connectivityManager;
        if (connectivityManager3 != null) {
            connectivityManager3.bindProcessToNetwork((Network) null);
        }
        EventBus.getDefault().post(new EventUnregisterNetwork());
    }

    private final void verifySetting() {
        this.threadUtils.threadRun(C3707a.f6718e);
    }

    /* renamed from: verifySetting$lambda-9  reason: not valid java name */
    public static final void m26792verifySetting$lambda9() {
        ProtocolUtils.Companion.getInstance().verifySet();
    }

    @NotNull
    public final Object getMLockObj() {
        return this.mLockObj;
    }

    @Nullable
    public final Network getMNetwork() {
        return this.mNetwork;
    }

    public void onAttachedToActivity(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        this.activity = (FragmentActivity) cVar.mo46419d();
    }

    public void onAttachedToEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "flutterPluginBinding");
        C9017j jVar = new C9017j(bVar.mo46467d().mo46371h(), "com.juconnect.connectlife/juDistMethod");
        channel = jVar;
        if (jVar != null) {
            jVar.mo46575e(this);
        }
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        C9017j jVar = channel;
        if (jVar != null) {
            jVar.mo46575e((C9017j.C9021c) null);
        }
    }

    public void onMethodCall(@NotNull C9016i iVar, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        log(Intrinsics.stringPlus("1接收到来自Flutter的指令:", iVar.f17687a));
        if (!Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getPlatformVersion")) {
            if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getWiFiList")) {
                log("接收到来自Flutter的指令:getWiFiList");
                synchronized (this.mLockObj) {
                    searchWifi(iVar, dVar);
                    Unit unit = Unit.INSTANCE;
                }
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "startSoftAp")) {
                log("接收到来自Flutter的指令:startSoftAp");
                settingWifi(iVar);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "searchModuleList")) {
                log("接收到来自Flutter的指令:searchModuleList");
                LogUtils.Companion.debug("connect", Intrinsics.stringPlus("函数", iVar.f17687a));
                findDevice(iVar);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getWifiName")) {
                log("接收到来自Flutter的指令:getWifiName");
                getWifiName$default(this, false, 1, (Object) null);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "openSetting")) {
                log("接收到来自Flutter的指令:openSetting");
                openSetting();
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "stopFindDevice")) {
                log("接收到来自Flutter的指令:stopFindDevice");
                stopFindDevice();
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "isConnective")) {
                log("接收到来自Flutter的指令:isConnective");
                isConnection(dVar);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getTimeZone")) {
                log("接收到来自Flutter的指令:getTimeZone");
                getTimeZone();
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "closeSocket")) {
                log("接收到来自Flutter的指令:closeSocket");
                closeSocket();
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "decryptUseDES")) {
                log("接收到来自Flutter的指令:decryptUseDES");
                decryptUseDES(iVar, dVar);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getWifiNameIgnoreLocation")) {
                log("接收到来自Flutter的指令:getWifiNameIgnoreLocation");
                getWifiName(true);
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "beginConnectSoftAp")) {
                initWifiListener();
            } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "endConnectSoftAp")) {
                unResiterNetwork();
            } else {
                log(Intrinsics.stringPlus("2接收到来自Flutter的指令:", iVar.f17687a));
            }
        }
    }

    public void onReattachedToActivityForConfigChanges(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
    }

    public final void setMNetwork(@Nullable Network network) {
        this.mNetwork = network;
    }
}

package com.juconnect.connect_life.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiConnectUtils;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "listen", "Lkotlin/Function1;", "", "getListen", "()Lkotlin/jvm/functions/Function1;", "setListen", "(Lkotlin/jvm/functions/Function1;)V", "connectWifi", "context", "Landroid/content/Context;", "ssid", "mListen", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiConnectUtils.kt */
public final class WifiConnectUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Lazy<WifiConnectUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, WifiConnectUtils$Companion$instance$2.INSTANCE);
    @NotNull
    public final String TAG = "wifi-conn--";
    @Nullable
    public Function1<? super String, Unit> listen;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiConnectUtils$Companion;", "", "()V", "instance", "Lcom/juconnect/connect_life/util/WifiConnectUtils;", "getInstance", "()Lcom/juconnect/connect_life/util/WifiConnectUtils;", "instance$delegate", "Lkotlin/Lazy;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WifiConnectUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WifiConnectUtils getInstance() {
            return (WifiConnectUtils) WifiConnectUtils.instance$delegate.getValue();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void connectWifi(@NotNull Context context, @NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "ssid");
        Intrinsics.checkNotNullParameter(function1, "mListen");
        this.listen = function1;
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService != null) {
            WifiManager wifiManager = (WifiManager) systemService;
            if (Build.VERSION.SDK_INT < 29) {
                List<ScanResult> scanResults = wifiManager.getScanResults();
                Intrinsics.checkNotNullExpressionValue(scanResults, "wifiList");
                ArrayList<ScanResult> arrayList = new ArrayList<>();
                for (T next : scanResults) {
                    String str2 = ((ScanResult) next).SSID;
                    Intrinsics.checkNotNullExpressionValue(str2, "it.SSID");
                    String upperCase = str2.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                    String upperCase2 = str.toString().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null)) {
                        arrayList.add(next);
                    }
                }
                for (ScanResult scanResult : arrayList) {
                    String str3 = scanResult.SSID;
                    Intrinsics.checkNotNullExpressionValue(str3, "w.SSID");
                    Intrinsics.checkNotNullExpressionValue(str3.toUpperCase(Locale.ROOT), "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    scanResult.toString();
                }
                if (arrayList.size() == 1) {
                    WifiOldUtils instance = WifiOldUtils.Companion.getInstance(context);
                    String str4 = ((ScanResult) arrayList.get(0)).SSID;
                    Intrinsics.checkNotNullExpressionValue(str4, "wifiList[0].SSID");
                    instance.connectwifi(str4, new WifiConnectUtils$connectWifi$4(this));
                    return;
                }
                Function1<? super String, Unit> function12 = this.listen;
                if (function12 != null) {
                    function12.invoke("0");
                }
            } else if (!wifiManager.isWifiEnabled()) {
                Function1<? super String, Unit> function13 = this.listen;
                if (function13 != null) {
                    function13.invoke("0");
                }
            } else {
                WifiNewUtils.Companion.getInstance().connectwifi(context, str, new WifiConnectUtils$connectWifi$2(this));
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
    }

    @Nullable
    public final Function1<String, Unit> getListen() {
        return this.listen;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void setListen(@Nullable Function1<? super String, Unit> function1) {
        this.listen = function1;
    }
}

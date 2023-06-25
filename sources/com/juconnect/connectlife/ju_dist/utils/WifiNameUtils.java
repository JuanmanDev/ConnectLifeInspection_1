package com.juconnect.connectlife.ju_dist.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/WifiNameUtils;", "", "()V", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiNameUtils.kt */
public final class WifiNameUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/WifiNameUtils$Companion;", "", "()V", "wifiName", "", "activity", "Landroid/app/Activity;", "wifiName8And9", "wifiNameBelow8", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WifiNameUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"MissingPermission"})
        private final String wifiName8And9(Activity activity) {
            Object systemService = activity.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                WifiManager wifiManager = (WifiManager) systemService;
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                String ssid = connectionInfo.getSSID();
                int networkId = connectionInfo.getNetworkId();
                String str = ssid;
                for (WifiConfiguration next : wifiManager.getConfiguredNetworks()) {
                    if (next.networkId == networkId) {
                        str = next.SSID;
                    }
                }
                LogUtils.Companion.debug("WifiNameUtils2", str);
                Intrinsics.checkNotNullExpressionValue(str, "SSID");
                return StringsKt__StringsJVMKt.replace$default(str, "\"", "", false, 4, (Object) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }

        private final String wifiNameBelow8(Activity activity) {
            Object systemService = activity.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                String ssid = ((WifiManager) systemService).getConnectionInfo().getSSID();
                LogUtils.Companion.debug("WifiNameUtils1", ssid);
                Intrinsics.checkNotNullExpressionValue(ssid, "ssid");
                return ssid;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }

        @NotNull
        @SuppressLint({"ObsoleteSdkInt"})
        public final String wifiName(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (Build.VERSION.SDK_INT > 22) {
                return wifiName8And9(activity);
            }
            return wifiNameBelow8(activity);
        }
    }
}

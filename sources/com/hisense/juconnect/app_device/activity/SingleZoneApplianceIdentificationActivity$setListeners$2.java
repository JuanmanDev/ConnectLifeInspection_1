package com.hisense.juconnect.app_device.activity;

import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_socket.connect.ConnectStep;
import com.hisense.juconnect.app_socket.connect.order.WiFiArr;
import com.hisense.juconnect.app_socket.connect.order.ZeroSettingReplyOrder;
import com.hisense.juconnect.app_socket.fbean.SoftApResult;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import com.hisense.juconnect.app_socket.utils.NetworkUtils;
import com.hisense.juconnect.app_socket.utils.ProtocolUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7487c0;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneApplianceIdentificationActivity$setListeners$2(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity) {
        super(1);
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m27133invoke$lambda0(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity, String str, String str2) {
        Intrinsics.checkNotNullParameter(singleZoneApplianceIdentificationActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "$password");
        Intrinsics.checkNotNullParameter(str2, "$ssid");
        try {
            ConnectStep.INSTANCE.setSetting(true);
            WiFiArr wiFiArr = new WiFiArr();
            LogUtils.Companion companion = LogUtils.Companion;
            companion.debug("配网wifi:", "BSSID:" + singleZoneApplianceIdentificationActivity.myBssid + " password:" + str + "SSID:" + str2);
            wiFiArr.setBSSID(singleZoneApplianceIdentificationActivity.myBssid);
            wiFiArr.setPassword(str);
            wiFiArr.setSSID(str2);
            Object systemService = singleZoneApplianceIdentificationActivity.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                DhcpInfo dhcpInfo = ((WifiManager) systemService).getDhcpInfo();
                ProtocolUtils instance = ProtocolUtils.Companion.getInstance();
                String formatIpAddress = Formatter.formatIpAddress(dhcpInfo.gateway);
                Intrinsics.checkNotNullExpressionValue(formatIpAddress, "formatIpAddress(dhcpInfo.gateway)");
                instance.connect(formatIpAddress, 5020);
                LogUtils.Companion.debug("ip :", String.valueOf(dhcpInfo.gateway));
                ZeroSettingReplyOrder zeroSettingReplyOrder = ProtocolUtils.Companion.getInstance().settingWifi(wiFiArr, str);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new SoftApResult(zeroSettingReplyOrder);
                NetworkUtils.INSTANCE.deviceIsOnline(new SingleZoneApplianceIdentificationActivity$setListeners$2$1$1(objectRef, singleZoneApplianceIdentificationActivity), (SoftApResult) objectRef.element, singleZoneApplianceIdentificationActivity);
                singleZoneApplianceIdentificationActivity.hideLoading();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        } catch (Exception e) {
            JuConnectExtKt.navigation(Paths.Device.SingleZonePairingErrorActivity);
            e.printStackTrace();
            ConnectStep.INSTANCE.setSetting(false);
            ProtocolUtils.Companion.getInstance().close();
        } catch (Throwable th) {
            singleZoneApplianceIdentificationActivity.hideLoading();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        this.this$0.showLoading();
        this.this$0.threadUtils.threadRun(new C7487c0(this.this$0, ((EditText) this.this$0._$_findCachedViewById(R$id.et_home_wifi_passwd)).getText().toString(), ((TextView) this.this$0._$_findCachedViewById(R$id.et_connection_setup_wifi_name)).getText().toString()));
    }
}

package com.hisense.juconnect.app_device.activity;

import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import androidx.test.internal.runner.listener.InstrumentationResultPrinter;
import com.hisense.juconnect.app_socket.connect.ConnectParameter;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiOrder;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import com.hisense.juconnect.app_socket.utils.ProtocolUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p294g.p333g.C4514ip;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiReplyOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.SingleZoneApplianceIdentificationActivity$getWifiList$2", mo48701f = "SingleZoneApplianceIdentificationActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$getWifiList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SearchWifiReplyOrder>, Object> {
    public int label;
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneApplianceIdentificationActivity$getWifiList$2(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity, Continuation<? super SingleZoneApplianceIdentificationActivity$getWifiList$2> continuation) {
        super(2, continuation);
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SingleZoneApplianceIdentificationActivity$getWifiList$2(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SearchWifiReplyOrder> continuation) {
        return ((SingleZoneApplianceIdentificationActivity$getWifiList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ConnectParameter.INSTANCE.setDomain("https://wcl-cn-gateway.hijuconn.com/");
            Object systemService = this.this$0.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                WifiManager wifiManager = (WifiManager) systemService;
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                LogUtils.Companion.debug(InstrumentationResultPrinter.REPORT_KEY_NUM_CURRENT, Thread.currentThread().getName());
                LogUtils.Companion.debug("gateway", Formatter.formatIpAddress(dhcpInfo.gateway));
                LogUtils.Companion.debug(C4514ip.f9299q, Formatter.formatIpAddress(connectionInfo.getIpAddress()));
                LogUtils.Companion.debug("ip :", String.valueOf(dhcpInfo.gateway));
                ProtocolUtils instance = ProtocolUtils.Companion.getInstance();
                String formatIpAddress = Formatter.formatIpAddress(dhcpInfo.gateway);
                Intrinsics.checkNotNullExpressionValue(formatIpAddress, "formatIpAddress(dhcpInfo.gateway)");
                instance.connect(formatIpAddress, 5020);
                SearchWifiOrder searchWifiOrder = new SearchWifiOrder();
                searchWifiOrder.setCC(Boxing.boxInt(156));
                searchWifiOrder.setDN("eu");
                return ProtocolUtils.Companion.getInstance().searchWifi(searchWifiOrder);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

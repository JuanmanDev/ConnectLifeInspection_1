package com.hisense.juconnect.app_device.activity;

import com.hisense.juconnect.app_device.adapter.WifiListAdapter;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder;
import com.hisense.juconnect.app_socket.connect.order.WiFiArr;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import com.juconnect.connectlife.model.WifiInfo;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.SingleZoneApplianceIdentificationActivity$initWidgets$1", mo48701f = "SingleZoneApplianceIdentificationActivity.kt", mo48702i = {}, mo48703l = {134}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$initWidgets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneApplianceIdentificationActivity$initWidgets$1(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity, Continuation<? super SingleZoneApplianceIdentificationActivity$initWidgets$1> continuation) {
        super(2, continuation);
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SingleZoneApplianceIdentificationActivity$initWidgets$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleZoneApplianceIdentificationActivity$initWidgets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.showLoading();
            SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity = this.this$0;
            this.label = 1;
            obj = singleZoneApplianceIdentificationActivity.getWifiList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.hideLoading();
        LinkedList<WiFiArr> wiFiArr = ((SearchWifiReplyOrder) obj).getWiFiArr();
        if (wiFiArr != null) {
            SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity2 = this.this$0;
            singleZoneApplianceIdentificationActivity2.wifiList.clear();
            Iterator it = wiFiArr.iterator();
            while (it.hasNext()) {
                WiFiArr wiFiArr2 = (WiFiArr) it.next();
                String ssid = wiFiArr2.getSSID();
                Intrinsics.checkNotNull(ssid);
                String bssid = wiFiArr2.getBSSID();
                Intrinsics.checkNotNull(bssid);
                String rssi = wiFiArr2.getRSSI();
                Intrinsics.checkNotNull(rssi);
                singleZoneApplianceIdentificationActivity2.wifiList.add(new WifiInfo(ssid, bssid, Integer.parseInt(rssi)));
            }
        }
        for (WifiInfo ssid2 : this.this$0.wifiList) {
            LogUtils.Companion.debug("wifi list ssid:", String.valueOf("ssid：" + ssid2.getSsid() + 10));
        }
        WifiListAdapter access$getArrayAdapter1$p = this.this$0.arrayAdapter1;
        if (access$getArrayAdapter1$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayAdapter1");
            access$getArrayAdapter1$p = null;
        }
        access$getArrayAdapter1$p.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}

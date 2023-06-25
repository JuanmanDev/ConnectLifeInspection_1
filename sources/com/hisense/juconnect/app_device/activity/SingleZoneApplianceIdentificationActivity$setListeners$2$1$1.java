package com.hisense.juconnect.app_device.activity;

import android.os.Message;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_socket.fbean.SoftApResult;
import com.hisense.juconnect.app_socket.utils.NetCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p040c.p077d.p078a.p080j.C1564e;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/SingleZoneApplianceIdentificationActivity$setListeners$2$1$1", "Lcom/hisense/juconnect/app_socket/utils/NetCallBack;", "onException", "", "e", "Lcom/hisense/juconnect/app_socket/fbean/SoftApResult;", "onFail", "errorCode", "onSuccess", "info", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$setListeners$2$1$1 implements NetCallBack {
    public final /* synthetic */ Ref.ObjectRef<SoftApResult> $softApResult;
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    public SingleZoneApplianceIdentificationActivity$setListeners$2$1$1(Ref.ObjectRef<SoftApResult> objectRef, SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity) {
        this.$softApResult = objectRef;
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    public void onException(@NotNull SoftApResult softApResult) {
        Intrinsics.checkNotNullParameter(softApResult, C1564e.f893u);
        this.$softApResult.element = softApResult;
        JuConnectExtKt.navigation(Paths.Device.SingleZonePairingErrorActivity);
    }

    public void onFail(@NotNull SoftApResult softApResult) {
        Intrinsics.checkNotNullParameter(softApResult, "errorCode");
        this.$softApResult.element = softApResult;
        JuConnectExtKt.navigation(Paths.Device.SingleZonePairingErrorActivity);
    }

    public void onSuccess(@NotNull SoftApResult softApResult) {
        Intrinsics.checkNotNullParameter(softApResult, "info");
        this.$softApResult.element = softApResult;
        Message obtain = Message.obtain();
        obtain.what = this.this$0.SINGLE_QR_CODE_OK;
        obtain.obj = ((SoftApResult) this.$softApResult.element).toJson();
        this.this$0.getHandle().sendMessage(obtain);
    }
}

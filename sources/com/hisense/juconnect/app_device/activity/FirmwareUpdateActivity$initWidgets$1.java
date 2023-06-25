package com.hisense.juconnect.app_device.activity;

import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.juconnect.app_device.fragment.FirmwareUpdateDialog;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/FirmwareUpdateActivity$initWidgets$1", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "wifiId", "cancel", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirmwareUpdateActivity.kt */
public final class FirmwareUpdateActivity$initWidgets$1 implements IItemCallback<String> {
    public final /* synthetic */ FirmwareUpdateActivity this$0;

    public FirmwareUpdateActivity$initWidgets$1(FirmwareUpdateActivity firmwareUpdateActivity) {
        this.this$0 = firmwareUpdateActivity;
    }

    public void cancel() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        this.this$0.confirmUpgrade(str);
        FirmwareUpdateDialog firmwareUpdateDialog = new FirmwareUpdateDialog(this.this$0.getDeviceNickNameByWifiId(str));
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(firmwareUpdateDialog, supportFragmentManager);
    }
}

package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.FrameLayout;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.event.GoNotification;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceInfoActivity.kt */
public final class DeviceInfoActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ DeviceInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceInfoActivity$setListeners$2(DeviceInfoActivity deviceInfoActivity) {
        super(1);
        this.this$0 = deviceInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (((FrameLayout) this.this$0._$_findCachedViewById(R$id.info_hav_notification)).getVisibility() == 0) {
            ((IconFontView) this.this$0._$_findCachedViewById(R$id.info_go_notification)).setVisibility(0);
            ((FrameLayout) this.this$0._$_findCachedViewById(R$id.info_hav_notification)).setVisibility(8);
            this.this$0.NewMessage(true);
            this.this$0.messageState = true;
        }
        C1524t.m1041e().mo15423n(EventBusConstKt.WIFIID, this.this$0.getWifiId());
        C1524t.m1041e().mo15423n("deviceId", this.this$0.getAuid());
        EventBus.getDefault().post(new GoNotification(this.this$0.getWifiId(), this.this$0.getAuid(), (String) null, 4, (DefaultConstructorMarker) null));
        JuConnectExtKt.navigation(Paths.Device.NotificationActivity);
    }
}

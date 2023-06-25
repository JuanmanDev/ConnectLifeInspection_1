package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.view.View;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneConnectionSettingWifiActivity.kt */
public final class SingleZoneConnectionSettingWifiActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneConnectionSettingWifiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneConnectionSettingWifiActivity$setListeners$2(SingleZoneConnectionSettingWifiActivity singleZoneConnectionSettingWifiActivity) {
        super(1);
        this.this$0 = singleZoneConnectionSettingWifiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        String str;
        if (EasyPermissions.m26767a(this.this$0, PermissionConstKt.PERMISSION_LOCATION)) {
            String unused = this.this$0.getConnectWifiSsid();
        } else {
            C9818b.C9820b bVar = new C9818b.C9820b((Activity) this.this$0, 2, PermissionConstKt.PERMISSION_LOCATION);
            bVar.mo50749d(R$string.pt_camera);
            bVar.mo50748c(R$string.rationale_ask_ok);
            bVar.mo50747b(R$string.camera_cancel);
            C9818b a = bVar.mo50746a();
            Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…                 .build()");
            EasyPermissions.m26771e(a);
        }
        String access$getConnectWifiSsid = this.this$0.getConnectWifiSsid();
        if (access$getConnectWifiSsid == null) {
            str = null;
        } else {
            str = access$getConnectWifiSsid.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
        }
        Intrinsics.checkNotNull(str);
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "HIS", false, 2, (Object) null)) {
            SingleZoneConnectionSettingWifiActivity singleZoneConnectionSettingWifiActivity = this.this$0;
            JuConnectExtKt.navigationForResult(Paths.Device.SingleZoneApplianceIdentificationActivity, singleZoneConnectionSettingWifiActivity, singleZoneConnectionSettingWifiActivity.SINGLE_QR_CODE_APPLIANCE_IDENTIFICATION_REQUEST_CODE);
            return;
        }
        ToastUtils.m9601y("Please correctlly connect to the appliance WiFi and try again!", new Object[0]);
    }
}

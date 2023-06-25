package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_socket.fbean.SoftAp;
import com.hisense.juconnect.app_socket.fbean.SoftApResult;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/SingleZoneApplianceIdentificationActivity$handle$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$handle$1 extends Handler {
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    public SingleZoneApplianceIdentificationActivity$handle$1(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity) {
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    public void handleMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message.what == this.this$0.SINGLE_QR_CODE_OK) {
            LogUtils.Companion companion = LogUtils.Companion;
            Object obj = message.obj;
            Intrinsics.checkNotNullExpressionValue(obj, "msg?.obj");
            companion.debug("配网成功:", Intrinsics.stringPlus("go to SingleZoneConnectionSetupRightActivity msg:", obj));
            JSONObject jSONObject = new JSONObject(message.obj.toString());
            LogUtils.Companion.debug("配网成功:", Intrinsics.stringPlus("go to SingleZoneConnectionSetupRightActivity jsonSoftAp:", jSONObject));
            Object fromJson = new Gson().fromJson(jSONObject.toString(), new C8596xfcbe940d().getType());
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\n       …   type\n                )");
            SoftApResult softApResult = (SoftApResult) fromJson;
            LogUtils.Companion.debug("配网成功:", Intrinsics.stringPlus("go to SingleZoneConnectionSetupRightActivity mySoftApResult DevId:", softApResult.getData()));
            SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity = this.this$0;
            int access$getSingleZoneConnectionSetupRightActivity_REQUEST_CODE$p = singleZoneApplianceIdentificationActivity.SingleZoneConnectionSetupRightActivity_REQUEST_CODE;
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.SingleZoneConnectionSetupRightActivity);
            SoftAp data = softApResult.getData();
            String str = null;
            a.withString("DevId", data == null ? null : data.getDevId());
            SoftAp data2 = softApResult.getData();
            a.withString("WifiId", data2 == null ? null : data2.getWifiId());
            SoftAp data3 = softApResult.getData();
            if (data3 != null) {
                str = data3.getDevType();
            }
            a.withString("DevType", str);
            a.navigation((Activity) singleZoneApplianceIdentificationActivity, access$getSingleZoneConnectionSetupRightActivity_REQUEST_CODE$p);
        }
    }
}

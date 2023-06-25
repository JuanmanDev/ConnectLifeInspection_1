package com.hisense.juconnect.app_device.activity;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ShareInfoActivity$setListeners$3", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "accept", "", "item", "cancel", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShareInfoActivity.kt */
public final class ShareInfoActivity$setListeners$3 implements IItemCallback<String> {
    public final /* synthetic */ ShareInfoActivity this$0;

    public ShareInfoActivity$setListeners$3(ShareInfoActivity shareInfoActivity) {
        this.this$0 = shareInfoActivity;
    }

    public void cancel() {
    }

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "item");
        if (this.this$0.checkEmailFormat(str)) {
            ShareInfoActivity.access$getMViewModel(this.this$0).shareDevice(this.this$0.getDeviceid(), this.this$0.getWifiId(), str);
        } else {
            ToastUtils.m9601y(this.this$0.getString(R$string.change_email_tips_2), new Object[0]);
        }
    }
}

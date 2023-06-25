package com.hisense.juconnect.app_device.activity;

import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/AppliancePairedSuccessActivity$initWidgets$1", "Ljava/lang/Runnable;", "run", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AppliancePairedSuccessActivity.kt */
public final class AppliancePairedSuccessActivity$initWidgets$1 implements Runnable {
    public final /* synthetic */ AppliancePairedSuccessActivity this$0;

    public AppliancePairedSuccessActivity$initWidgets$1(AppliancePairedSuccessActivity appliancePairedSuccessActivity) {
        this.this$0 = appliancePairedSuccessActivity;
    }

    public void run() {
        if (this.this$0.canTurn) {
            this.this$0.gotoNameApplianceActivity();
        }
    }
}

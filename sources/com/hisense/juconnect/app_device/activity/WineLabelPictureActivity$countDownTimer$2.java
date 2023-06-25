package com.hisense.juconnect.app_device.activity;

import android.os.CountDownTimer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo47991d2 = {"<anonymous>", "com/hisense/juconnect/app_device/activity/WineLabelPictureActivity$countDownTimer$2$1", "invoke", "()Lcom/hisense/juconnect/app_device/activity/WineLabelPictureActivity$countDownTimer$2$1;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineLabelPictureActivity.kt */
public final class WineLabelPictureActivity$countDownTimer$2 extends Lambda implements Function0<C86041> {
    public final /* synthetic */ WineLabelPictureActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelPictureActivity$countDownTimer$2(WineLabelPictureActivity wineLabelPictureActivity) {
        super(0);
        this.this$0 = wineLabelPictureActivity;
    }

    @NotNull
    public final C86041 invoke() {
        final WineLabelPictureActivity wineLabelPictureActivity = this.this$0;
        return new CountDownTimer() {
            public void onFinish() {
                wineLabelPictureActivity.handleTimeOut();
            }

            public void onTick(long j) {
            }
        };
    }
}

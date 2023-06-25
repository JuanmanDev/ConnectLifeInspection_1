package com.hisense.juconnect.app_socket.settingnet;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/settingnet/SettingNet;", "", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: order.kt */
public class SettingNet {
    public Activity activity;

    @NotNull
    public final Activity getActivity() {
        Activity activity2 = this.activity;
        if (activity2 != null) {
            return activity2;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        return null;
    }

    public final void setActivity(@NotNull Activity activity2) {
        Intrinsics.checkNotNullParameter(activity2, "<set-?>");
        this.activity = activity2;
    }
}

package com.juconnect.connectlife.ju_ble;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p691no.nordicsemi.android.dfu.DfuBaseService;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0014J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/DfuService;", "Lno/nordicsemi/android/dfu/DfuBaseService;", "()V", "getNotificationTarget", "Ljava/lang/Class;", "Landroid/app/Activity;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DfuService.kt */
public final class DfuService extends DfuBaseService {
    @NotNull
    public Class<? extends Activity> getNotificationTarget() {
        return NotificationActivity.class;
    }

    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return super.onBind(intent);
    }
}

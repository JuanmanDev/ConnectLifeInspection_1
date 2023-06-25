package com.hisense.connect_life.core.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/GpsUtils;", "", "()V", "isOPen", "", "context", "Landroid/content/Context;", "openGPS", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GpsUtils.kt */
public final class GpsUtils {
    @NotNull
    public static final GpsUtils INSTANCE = new GpsUtils();

    public final boolean isOPen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled(EventBusConstKt.GPS) || locationManager.isProviderEnabled("network");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final void openGPS(@Nullable Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
        intent.addCategory("android.intent.category.ALTERNATIVE");
        intent.setData(Uri.parse("custom:3"));
        try {
            PendingIntent.getBroadcast(context, 0, intent, 67108864).send();
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }
}

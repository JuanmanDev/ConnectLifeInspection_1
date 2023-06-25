package com.hisense.connect_life.core.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1497d;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J8\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJB\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J@\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJX\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/NotificationHelper;", "", "()V", "initChannel", "", "context", "Landroid/content/Context;", "channelId", "", "name", "description", "initDefaultChannel", "notifyNotification", "notificationId", "", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "publishNotification", "largeIcon", "Landroid/graphics/Bitmap;", "smallIcon", "title", "content", "contentIntent", "Landroid/app/PendingIntent;", "publishProgressNotification", "max", "pro", "indeterminate", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationHelper.kt */
public final class NotificationHelper {
    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private final void notifyNotification(Context context, int i, NotificationCompat.Builder builder) {
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        from.notify(RangesKt___RangesKt.random(new IntRange(Integer.MIN_VALUE, Integer.MAX_VALUE), (Random) Random.Default), builder.build());
    }

    @RequiresApi(api = 26)
    public final void initChannel(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "channelId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, BundleJUnitUtils.KEY_DESCRIPTION);
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 3);
        notificationChannel.setDescription(str3);
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    @RequiresApi(api = 26)
    public final void initDefaultChannel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a = C1497d.m907a();
        String c = C1497d.m909c();
        Intrinsics.checkNotNullExpressionValue(c, "getAppPackageName()");
        Intrinsics.checkNotNullExpressionValue(a, "name");
        initChannel(context, c, a, "及时通知信息");
    }

    public final void publishNotification(@NotNull Context context, int i, @NotNull Bitmap bitmap, @DrawableRes int i2, @NotNull String str, @NotNull String str2, @Nullable PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "largeIcon");
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str2, BrowserServiceFileProvider.CONTENT_SCHEME);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, C1497d.m909c());
        builder.setContentTitle(str).setContentText(str2).setAutoCancel(true).setLargeIcon(bitmap).setSmallIcon(i2).setColor(ContextCompat.getColor(context, 17170444)).setPriority(1);
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
        notifyNotification(context, i, builder);
    }

    public final void publishProgressNotification(@NotNull Context context, int i, @NotNull String str, @NotNull Bitmap bitmap, @DrawableRes int i2, @NotNull String str2, @NotNull String str3, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "channelId");
        Intrinsics.checkNotNullParameter(bitmap, "largeIcon");
        Intrinsics.checkNotNullParameter(str2, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str3, BrowserServiceFileProvider.CONTENT_SCHEME);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        builder.setContentTitle(str2).setContentText(str3).setLargeIcon(bitmap).setSmallIcon(i2).setProgress(i3, i4, z).setPriority(1);
        notifyNotification(context, i, builder);
    }

    public final void publishNotification(@NotNull Context context, int i, @NotNull Bitmap bitmap, @DrawableRes int i2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "largeIcon");
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str2, BrowserServiceFileProvider.CONTENT_SCHEME);
        publishNotification(context, i, bitmap, i2, str, str2, (PendingIntent) null);
    }

    public final void publishNotification(@NotNull Context context, int i, @NotNull String str, @NotNull Bitmap bitmap, @DrawableRes int i2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "channelId");
        Intrinsics.checkNotNullParameter(bitmap, "largeIcon");
        Intrinsics.checkNotNullParameter(str2, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str3, BrowserServiceFileProvider.CONTENT_SCHEME);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        builder.setContentTitle(str2).setContentText(str3).setLargeIcon(bitmap).setSmallIcon(i2).setPriority(1);
        notifyNotification(context, i, builder);
    }
}

package com.juconnect.connect_life;

import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.juconnect.app_device.event.GoNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1524t;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, mo47991d2 = {"com/juconnect/connect_life/MainActivity$onGoNotification$2", "Lio/flutter/plugin/common/MethodChannel$Result;", "error", "", "errorCode", "", "errorMessage", "errorDetails", "", "notImplemented", "success", "result", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$onGoNotification$2 implements C9017j.C9022d {
    public void error(@Nullable String str, @Nullable String str2, @Nullable Object obj) {
    }

    public void notImplemented() {
    }

    public void success(@Nullable Object obj) {
        EventBus eventBus = EventBus.getDefault();
        String i = C1524t.m1041e().mo15419i(EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullExpressionValue(i, "getInstance().getString(\"wifiId\")");
        String i2 = C1524t.m1041e().mo15419i("deviceId");
        Intrinsics.checkNotNullExpressionValue(i2, "getInstance().getString(\"deviceId\")");
        eventBus.post(new GoNotification(i, i2, "1"));
    }
}

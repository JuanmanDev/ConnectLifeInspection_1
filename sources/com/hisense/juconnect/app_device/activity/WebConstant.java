package com.hisense.juconnect.app_device.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WebConstant;", "", "()V", "Companion", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WebConstant.kt */
public final class WebConstant {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static boolean isFromScan;
    @NotNull
    public static String viviidCaid = "-1";

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WebConstant$Companion;", "", "()V", "isFromScan", "", "()Z", "setFromScan", "(Z)V", "viviidCaid", "", "getViviidCaid", "()Ljava/lang/String;", "setViviidCaid", "(Ljava/lang/String;)V", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WebConstant.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getViviidCaid() {
            return WebConstant.viviidCaid;
        }

        public final boolean isFromScan() {
            return WebConstant.isFromScan;
        }

        public final void setFromScan(boolean z) {
            WebConstant.isFromScan = z;
        }

        public final void setViviidCaid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            WebConstant.viviidCaid = str;
        }
    }
}

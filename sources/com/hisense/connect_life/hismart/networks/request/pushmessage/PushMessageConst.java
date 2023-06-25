package com.hisense.connect_life.hismart.networks.request.pushmessage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/pushmessage/PushMessageConst;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PushMessageConst.kt */
public final class PushMessageConst {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static String FCM_DEVICE_ID = "";
    @NotNull
    public static String PHONECODE = "";

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/pushmessage/PushMessageConst$Companion;", "", "()V", "FCM_DEVICE_ID", "", "getFCM_DEVICE_ID", "()Ljava/lang/String;", "setFCM_DEVICE_ID", "(Ljava/lang/String;)V", "PHONECODE", "getPHONECODE", "setPHONECODE", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: PushMessageConst.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getFCM_DEVICE_ID() {
            return PushMessageConst.FCM_DEVICE_ID;
        }

        @NotNull
        public final String getPHONECODE() {
            return PushMessageConst.PHONECODE;
        }

        public final void setFCM_DEVICE_ID(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            PushMessageConst.FCM_DEVICE_ID = str;
        }

        public final void setPHONECODE(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            PushMessageConst.PHONECODE = str;
        }
    }
}

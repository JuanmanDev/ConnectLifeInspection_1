package com.hisense.connect_life.core.global;

import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/AccountConst;", "", "()V", "Companion", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountConst.kt */
public final class AccountConst {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static String jhkCustomerId = "";
    @NotNull
    public static String jhkRefreshToken = "";
    public static int jhkSubscriberId = -1;
    @NotNull
    public static String jhkToken = "";
    @NotNull
    public static String jhkUserName = "";

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006 "}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/AccountConst$Companion;", "", "()V", "jhkCustomerId", "", "getJhkCustomerId", "()Ljava/lang/String;", "setJhkCustomerId", "(Ljava/lang/String;)V", "jhkRefreshToken", "getJhkRefreshToken", "setJhkRefreshToken", "jhkSubscriberId", "", "getJhkSubscriberId", "()I", "setJhkSubscriberId", "(I)V", "jhkToken", "getJhkToken", "setJhkToken", "jhkUserName", "getJhkUserName", "setJhkUserName", "resetUserInfo", "", "updateUserInfo", "username", "subscriberId", "customerId", "token", "refreshToken", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: AccountConst.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getJhkCustomerId() {
            return AccountConst.jhkCustomerId;
        }

        @NotNull
        public final String getJhkRefreshToken() {
            return AccountConst.jhkRefreshToken;
        }

        public final int getJhkSubscriberId() {
            return AccountConst.jhkSubscriberId;
        }

        @NotNull
        public final String getJhkToken() {
            return AccountConst.jhkToken;
        }

        @NotNull
        public final String getJhkUserName() {
            return AccountConst.jhkUserName;
        }

        public final void resetUserInfo() {
            setJhkUserName("");
            setJhkSubscriberId(-1);
            setJhkCustomerId("");
            setJhkToken("");
            setJhkRefreshToken("");
        }

        public final void setJhkCustomerId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AccountConst.jhkCustomerId = str;
        }

        public final void setJhkRefreshToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AccountConst.jhkRefreshToken = str;
        }

        public final void setJhkSubscriberId(int i) {
            AccountConst.jhkSubscriberId = i;
        }

        public final void setJhkToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AccountConst.jhkToken = str;
        }

        public final void setJhkUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AccountConst.jhkUserName = str;
        }

        public final void updateUserInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "username");
            Intrinsics.checkNotNullParameter(str2, "customerId");
            Intrinsics.checkNotNullParameter(str3, FirebaseMessagingService.EXTRA_TOKEN);
            Intrinsics.checkNotNullParameter(str4, "refreshToken");
            setJhkUserName(str);
            setJhkSubscriberId(i);
            setJhkCustomerId(str2);
            setJhkToken(str3);
            setJhkRefreshToken(str4);
        }
    }
}

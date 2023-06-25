package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.core.app.NotificationCompatJellybean;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimError;", "", "title", "", "description", "errorCode", "", "ConnectedAppliances", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getConnectedAppliances", "()Ljava/lang/String;", "setConnectedAppliances", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getErrorCode", "()I", "setErrorCode", "(I)V", "getTitle", "setTitle", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClaimError.kt */
public final class ClaimError {
    @NotNull
    public String ConnectedAppliances;
    @NotNull
    public String description;
    public int errorCode;
    @NotNull
    public String title;

    public ClaimError() {
        this((String) null, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public ClaimError(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str2, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(str3, "ConnectedAppliances");
        this.title = str;
        this.description = str2;
        this.errorCode = i;
        this.ConnectedAppliances = str3;
    }

    @NotNull
    public final String getConnectedAppliances() {
        return this.ConnectedAppliances;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setConnectedAppliances(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ConnectedAppliances = str;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClaimError(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}

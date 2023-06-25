package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfileResult;", "", "resultCode", "", "applianceProfile", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;", "(ILcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;)V", "getApplianceProfile", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;", "getResultCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceProfileResult.kt */
public final class ApplianceProfileResult {
    @NotNull
    public final ApplianceProfile applianceProfile;
    public final int resultCode;

    public ApplianceProfileResult(int i, @NotNull ApplianceProfile applianceProfile2) {
        Intrinsics.checkNotNullParameter(applianceProfile2, "applianceProfile");
        this.resultCode = i;
        this.applianceProfile = applianceProfile2;
    }

    public static /* synthetic */ ApplianceProfileResult copy$default(ApplianceProfileResult applianceProfileResult, int i, ApplianceProfile applianceProfile2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = applianceProfileResult.resultCode;
        }
        if ((i2 & 2) != 0) {
            applianceProfile2 = applianceProfileResult.applianceProfile;
        }
        return applianceProfileResult.copy(i, applianceProfile2);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final ApplianceProfile component2() {
        return this.applianceProfile;
    }

    @NotNull
    public final ApplianceProfileResult copy(int i, @NotNull ApplianceProfile applianceProfile2) {
        Intrinsics.checkNotNullParameter(applianceProfile2, "applianceProfile");
        return new ApplianceProfileResult(i, applianceProfile2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplianceProfileResult)) {
            return false;
        }
        ApplianceProfileResult applianceProfileResult = (ApplianceProfileResult) obj;
        return this.resultCode == applianceProfileResult.resultCode && Intrinsics.areEqual((Object) this.applianceProfile, (Object) applianceProfileResult.applianceProfile);
    }

    @NotNull
    public final ApplianceProfile getApplianceProfile() {
        return this.applianceProfile;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.resultCode) * 31) + this.applianceProfile.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplianceProfileResult(resultCode=" + this.resultCode + ", applianceProfile=" + this.applianceProfile + ')';
    }
}

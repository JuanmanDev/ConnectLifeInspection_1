package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/UserShareResult;", "", "resultCode", "", "shareDeviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ShareDeviceInfo;", "(ILjava/util/List;)V", "getResultCode", "()I", "getShareDeviceList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserShareResult.kt */
public final class UserShareResult {
    public final int resultCode;
    @NotNull
    public final List<ShareDeviceInfo> shareDeviceList;

    public UserShareResult(int i, @NotNull List<ShareDeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "shareDeviceList");
        this.resultCode = i;
        this.shareDeviceList = list;
    }

    public static /* synthetic */ UserShareResult copy$default(UserShareResult userShareResult, int i, List<ShareDeviceInfo> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userShareResult.resultCode;
        }
        if ((i2 & 2) != 0) {
            list = userShareResult.shareDeviceList;
        }
        return userShareResult.copy(i, list);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final List<ShareDeviceInfo> component2() {
        return this.shareDeviceList;
    }

    @NotNull
    public final UserShareResult copy(int i, @NotNull List<ShareDeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "shareDeviceList");
        return new UserShareResult(i, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserShareResult)) {
            return false;
        }
        UserShareResult userShareResult = (UserShareResult) obj;
        return this.resultCode == userShareResult.resultCode && Intrinsics.areEqual((Object) this.shareDeviceList, (Object) userShareResult.shareDeviceList);
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final List<ShareDeviceInfo> getShareDeviceList() {
        return this.shareDeviceList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.resultCode) * 31) + this.shareDeviceList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserShareResult(resultCode=" + this.resultCode + ", shareDeviceList=" + this.shareDeviceList + ')';
    }
}

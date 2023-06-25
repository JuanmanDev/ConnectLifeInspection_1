package com.hisense.connect_life.hismart.networks.request.device.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "Ljava/io/Serializable;", "wifiId", "", "upgradeFlag", "", "latestVersion", "versionDetail", "fileSize", "onlineStatus", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZ)V", "getFileSize", "()I", "getLatestVersion", "()Ljava/lang/String;", "getOnlineStatus", "()Z", "setOnlineStatus", "(Z)V", "getUpgradeFlag", "getVersionDetail", "getWifiId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpgradeInfo.kt */
public final class UpgradeInfo implements Serializable {
    public final int fileSize;
    @NotNull
    public final String latestVersion;
    public boolean onlineStatus;
    public final int upgradeFlag;
    @NotNull
    public final String versionDetail;
    @NotNull
    public final String wifiId;

    public UpgradeInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "latestVersion");
        Intrinsics.checkNotNullParameter(str3, "versionDetail");
        this.wifiId = str;
        this.upgradeFlag = i;
        this.latestVersion = str2;
        this.versionDetail = str3;
        this.fileSize = i2;
        this.onlineStatus = z;
    }

    public static /* synthetic */ UpgradeInfo copy$default(UpgradeInfo upgradeInfo, String str, int i, String str2, String str3, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = upgradeInfo.wifiId;
        }
        if ((i3 & 2) != 0) {
            i = upgradeInfo.upgradeFlag;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = upgradeInfo.latestVersion;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = upgradeInfo.versionDetail;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = upgradeInfo.fileSize;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = upgradeInfo.onlineStatus;
        }
        return upgradeInfo.copy(str, i4, str4, str5, i5, z);
    }

    @NotNull
    public final String component1() {
        return this.wifiId;
    }

    public final int component2() {
        return this.upgradeFlag;
    }

    @NotNull
    public final String component3() {
        return this.latestVersion;
    }

    @NotNull
    public final String component4() {
        return this.versionDetail;
    }

    public final int component5() {
        return this.fileSize;
    }

    public final boolean component6() {
        return this.onlineStatus;
    }

    @NotNull
    public final UpgradeInfo copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "latestVersion");
        Intrinsics.checkNotNullParameter(str3, "versionDetail");
        return new UpgradeInfo(str, i, str2, str3, i2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeInfo)) {
            return false;
        }
        UpgradeInfo upgradeInfo = (UpgradeInfo) obj;
        return Intrinsics.areEqual((Object) this.wifiId, (Object) upgradeInfo.wifiId) && this.upgradeFlag == upgradeInfo.upgradeFlag && Intrinsics.areEqual((Object) this.latestVersion, (Object) upgradeInfo.latestVersion) && Intrinsics.areEqual((Object) this.versionDetail, (Object) upgradeInfo.versionDetail) && this.fileSize == upgradeInfo.fileSize && this.onlineStatus == upgradeInfo.onlineStatus;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    public final boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    public final int getUpgradeFlag() {
        return this.upgradeFlag;
    }

    @NotNull
    public final String getVersionDetail() {
        return this.versionDetail;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.wifiId.hashCode() * 31) + Integer.hashCode(this.upgradeFlag)) * 31) + this.latestVersion.hashCode()) * 31) + this.versionDetail.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31;
        boolean z = this.onlineStatus;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final void setOnlineStatus(boolean z) {
        this.onlineStatus = z;
    }

    @NotNull
    public String toString() {
        return "UpgradeInfo(wifiId=" + this.wifiId + ", upgradeFlag=" + this.upgradeFlag + ", latestVersion=" + this.latestVersion + ", versionDetail=" + this.versionDetail + ", fileSize=" + this.fileSize + ", onlineStatus=" + this.onlineStatus + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpgradeInfo(String str, int i, String str2, String str3, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, i2, (i3 & 32) != 0 ? true : z);
    }
}

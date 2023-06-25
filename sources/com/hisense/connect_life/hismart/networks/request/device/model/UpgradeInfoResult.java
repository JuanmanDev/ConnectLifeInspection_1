package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfoResult;", "", "resultCode", "", "upgradeInfo", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UpgradeInfo;", "(ILjava/util/List;)V", "getResultCode", "()I", "getUpgradeInfo", "()Ljava/util/List;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpgradeInfoResult.kt */
public final class UpgradeInfoResult {
    public final int resultCode;
    @NotNull
    public final List<UpgradeInfo> upgradeInfo;

    public UpgradeInfoResult(int i, @NotNull List<UpgradeInfo> list) {
        Intrinsics.checkNotNullParameter(list, "upgradeInfo");
        this.resultCode = i;
        this.upgradeInfo = list;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final List<UpgradeInfo> getUpgradeInfo() {
        return this.upgradeInfo;
    }
}

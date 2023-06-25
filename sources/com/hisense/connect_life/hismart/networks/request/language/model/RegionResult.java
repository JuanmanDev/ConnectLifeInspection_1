package com.hisense.connect_life.hismart.networks.request.language.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\""}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/language/model/RegionResult;", "", "resultCode", "", "errorCode", "errorDesc", "", "regionList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "Lkotlin/collections/ArrayList;", "(IILjava/lang/String;Ljava/util/ArrayList;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getRegionList", "()Ljava/util/ArrayList;", "getResultCode", "setResultCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegionResult.kt */
public final class RegionResult {
    public int errorCode;
    @NotNull
    public String errorDesc;
    @NotNull
    public final ArrayList<Region> regionList;
    public int resultCode;

    public RegionResult(int i, int i2, @NotNull String str, @NotNull ArrayList<Region> arrayList) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Intrinsics.checkNotNullParameter(arrayList, "regionList");
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
        this.regionList = arrayList;
    }

    public static /* synthetic */ RegionResult copy$default(RegionResult regionResult, int i, int i2, String str, ArrayList<Region> arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = regionResult.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = regionResult.errorCode;
        }
        if ((i3 & 4) != 0) {
            str = regionResult.errorDesc;
        }
        if ((i3 & 8) != 0) {
            arrayList = regionResult.regionList;
        }
        return regionResult.copy(i, i2, str, arrayList);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final int component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.errorDesc;
    }

    @NotNull
    public final ArrayList<Region> component4() {
        return this.regionList;
    }

    @NotNull
    public final RegionResult copy(int i, int i2, @NotNull String str, @NotNull ArrayList<Region> arrayList) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Intrinsics.checkNotNullParameter(arrayList, "regionList");
        return new RegionResult(i, i2, str, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionResult)) {
            return false;
        }
        RegionResult regionResult = (RegionResult) obj;
        return this.resultCode == regionResult.resultCode && this.errorCode == regionResult.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) regionResult.errorDesc) && Intrinsics.areEqual((Object) this.regionList, (Object) regionResult.regionList);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @NotNull
    public final ArrayList<Region> getRegionList() {
        return this.regionList;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode()) * 31) + this.regionList.hashCode();
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "RegionResult(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ", regionList=" + this.regionList + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegionResult(int i, int i2, String str, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, arrayList);
    }
}

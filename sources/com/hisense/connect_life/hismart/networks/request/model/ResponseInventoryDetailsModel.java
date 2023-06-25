package com.hisense.connect_life.hismart.networks.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u0007H\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/ResponseInventoryDetailsModel;", "", "resultCode", "", "errorCode", "", "errorDesc", "", "desc", "inventoryDetail", "Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;", "(IJLjava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getErrorCode", "()J", "setErrorCode", "(J)V", "getErrorDesc", "setErrorDesc", "getInventoryDetail", "()Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;", "setInventoryDetail", "(Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;)V", "getResultCode", "()I", "setResultCode", "(I)V", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ResponseInventoryDetailsModel.kt */
public final class ResponseInventoryDetailsModel {
    @NotNull
    public String desc;
    public long errorCode;
    @NotNull
    public String errorDesc;
    @NotNull
    public InventoryDetailModel inventoryDetail;
    public int resultCode;

    public ResponseInventoryDetailsModel(int i, long j, @NotNull String str, @NotNull String str2, @NotNull InventoryDetailModel inventoryDetailModel) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Intrinsics.checkNotNullParameter(str2, "desc");
        Intrinsics.checkNotNullParameter(inventoryDetailModel, "inventoryDetail");
        this.resultCode = i;
        this.errorCode = j;
        this.errorDesc = str;
        this.desc = str2;
        this.inventoryDetail = inventoryDetailModel;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @NotNull
    public final InventoryDetailModel getInventoryDetail() {
        return this.inventoryDetail;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void setErrorCode(long j) {
        this.errorCode = j;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setInventoryDetail(@NotNull InventoryDetailModel inventoryDetailModel) {
        Intrinsics.checkNotNullParameter(inventoryDetailModel, "<set-?>");
        this.inventoryDetail = inventoryDetailModel;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "HiResponse(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc='" + this.errorDesc + "', desc='" + this.desc + "')";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseInventoryDetailsModel(int i, long j, String str, String str2, InventoryDetailModel inventoryDetailModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? -1 : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, inventoryDetailModel);
    }
}

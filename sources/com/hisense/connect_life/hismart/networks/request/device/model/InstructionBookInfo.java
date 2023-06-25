package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookInfo;", "", "deviceFeatureCode", "", "deviceTypeCode", "pdfUrl", "picUrls", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/PicUrl;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeviceFeatureCode", "()Ljava/lang/String;", "getDeviceTypeCode", "getPdfUrl", "getPicUrls", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InstructionBookInfo.kt */
public final class InstructionBookInfo {
    @NotNull
    public final String deviceFeatureCode;
    @NotNull
    public final String deviceTypeCode;
    @Nullable
    public final String pdfUrl;
    @Nullable
    public final List<PicUrl> picUrls;

    public InstructionBookInfo(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable List<PicUrl> list) {
        Intrinsics.checkNotNullParameter(str, "deviceFeatureCode");
        Intrinsics.checkNotNullParameter(str2, "deviceTypeCode");
        this.deviceFeatureCode = str;
        this.deviceTypeCode = str2;
        this.pdfUrl = str3;
        this.picUrls = list;
    }

    public static /* synthetic */ InstructionBookInfo copy$default(InstructionBookInfo instructionBookInfo, String str, String str2, String str3, List<PicUrl> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instructionBookInfo.deviceFeatureCode;
        }
        if ((i & 2) != 0) {
            str2 = instructionBookInfo.deviceTypeCode;
        }
        if ((i & 4) != 0) {
            str3 = instructionBookInfo.pdfUrl;
        }
        if ((i & 8) != 0) {
            list = instructionBookInfo.picUrls;
        }
        return instructionBookInfo.copy(str, str2, str3, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceFeatureCode;
    }

    @NotNull
    public final String component2() {
        return this.deviceTypeCode;
    }

    @Nullable
    public final String component3() {
        return this.pdfUrl;
    }

    @Nullable
    public final List<PicUrl> component4() {
        return this.picUrls;
    }

    @NotNull
    public final InstructionBookInfo copy(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable List<PicUrl> list) {
        Intrinsics.checkNotNullParameter(str, "deviceFeatureCode");
        Intrinsics.checkNotNullParameter(str2, "deviceTypeCode");
        return new InstructionBookInfo(str, str2, str3, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionBookInfo)) {
            return false;
        }
        InstructionBookInfo instructionBookInfo = (InstructionBookInfo) obj;
        return Intrinsics.areEqual((Object) this.deviceFeatureCode, (Object) instructionBookInfo.deviceFeatureCode) && Intrinsics.areEqual((Object) this.deviceTypeCode, (Object) instructionBookInfo.deviceTypeCode) && Intrinsics.areEqual((Object) this.pdfUrl, (Object) instructionBookInfo.pdfUrl) && Intrinsics.areEqual((Object) this.picUrls, (Object) instructionBookInfo.picUrls);
    }

    @NotNull
    public final String getDeviceFeatureCode() {
        return this.deviceFeatureCode;
    }

    @NotNull
    public final String getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    @Nullable
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    @Nullable
    public final List<PicUrl> getPicUrls() {
        return this.picUrls;
    }

    public int hashCode() {
        int hashCode = ((this.deviceFeatureCode.hashCode() * 31) + this.deviceTypeCode.hashCode()) * 31;
        String str = this.pdfUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PicUrl> list = this.picUrls;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        return "InstructionBookInfo(deviceFeatureCode=" + this.deviceFeatureCode + ", deviceTypeCode=" + this.deviceTypeCode + ", pdfUrl=" + this.pdfUrl + ", picUrls=" + this.picUrls + ')';
    }
}

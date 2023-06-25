package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceMedia;", "", "binaryData", "", "type", "", "fileType", "url", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBinaryData", "()[B", "getFileType", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceMedia.kt */
public final class ApplianceMedia {
    @NotNull
    public final byte[] binaryData;
    @NotNull
    public final String fileType;
    @NotNull
    public final String type;
    @NotNull
    public final String url;

    public ApplianceMedia(@NotNull byte[] bArr, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(bArr, "binaryData");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "fileType");
        Intrinsics.checkNotNullParameter(str3, "url");
        this.binaryData = bArr;
        this.type = str;
        this.fileType = str2;
        this.url = str3;
    }

    public static /* synthetic */ ApplianceMedia copy$default(ApplianceMedia applianceMedia, byte[] bArr, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = applianceMedia.binaryData;
        }
        if ((i & 2) != 0) {
            str = applianceMedia.type;
        }
        if ((i & 4) != 0) {
            str2 = applianceMedia.fileType;
        }
        if ((i & 8) != 0) {
            str3 = applianceMedia.url;
        }
        return applianceMedia.copy(bArr, str, str2, str3);
    }

    @NotNull
    public final byte[] component1() {
        return this.binaryData;
    }

    @NotNull
    public final String component2() {
        return this.type;
    }

    @NotNull
    public final String component3() {
        return this.fileType;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final ApplianceMedia copy(@NotNull byte[] bArr, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(bArr, "binaryData");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "fileType");
        Intrinsics.checkNotNullParameter(str3, "url");
        return new ApplianceMedia(bArr, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplianceMedia)) {
            return false;
        }
        ApplianceMedia applianceMedia = (ApplianceMedia) obj;
        return Intrinsics.areEqual((Object) this.binaryData, (Object) applianceMedia.binaryData) && Intrinsics.areEqual((Object) this.type, (Object) applianceMedia.type) && Intrinsics.areEqual((Object) this.fileType, (Object) applianceMedia.fileType) && Intrinsics.areEqual((Object) this.url, (Object) applianceMedia.url);
    }

    @NotNull
    public final byte[] getBinaryData() {
        return this.binaryData;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.binaryData) * 31) + this.type.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplianceMedia(binaryData=" + Arrays.toString(this.binaryData) + ", type=" + this.type + ", fileType=" + this.fileType + ", url=" + this.url + ')';
    }
}

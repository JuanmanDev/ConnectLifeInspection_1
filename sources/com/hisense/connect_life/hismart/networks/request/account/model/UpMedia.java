package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpMedia;", "Ljava/io/Serializable;", "fileType", "", "type", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileType", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpMedia.kt */
public final class UpMedia implements Serializable {
    @NotNull
    public final String fileType;
    @NotNull
    public final String type;
    @NotNull
    public final String url;

    public UpMedia(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "fileType");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "url");
        this.fileType = str;
        this.type = str2;
        this.url = str3;
    }

    public static /* synthetic */ UpMedia copy$default(UpMedia upMedia, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upMedia.fileType;
        }
        if ((i & 2) != 0) {
            str2 = upMedia.type;
        }
        if ((i & 4) != 0) {
            str3 = upMedia.url;
        }
        return upMedia.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.fileType;
    }

    @NotNull
    public final String component2() {
        return this.type;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final UpMedia copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "fileType");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "url");
        return new UpMedia(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpMedia)) {
            return false;
        }
        UpMedia upMedia = (UpMedia) obj;
        return Intrinsics.areEqual((Object) this.fileType, (Object) upMedia.fileType) && Intrinsics.areEqual((Object) this.type, (Object) upMedia.type) && Intrinsics.areEqual((Object) this.url, (Object) upMedia.url);
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
        return (((this.fileType.hashCode() * 31) + this.type.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpMedia(fileType=" + this.fileType + ", type=" + this.type + ", url=" + this.url + ')';
    }
}

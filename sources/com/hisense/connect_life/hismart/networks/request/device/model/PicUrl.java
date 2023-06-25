package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/PicUrl;", "", "url", "", "displayOrder", "", "(Ljava/lang/String;I)V", "getDisplayOrder", "()I", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InstructionBookInfo.kt */
public final class PicUrl {
    public final int displayOrder;
    @NotNull
    public final String url;

    public PicUrl(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.url = str;
        this.displayOrder = i;
    }

    public static /* synthetic */ PicUrl copy$default(PicUrl picUrl, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = picUrl.url;
        }
        if ((i2 & 2) != 0) {
            i = picUrl.displayOrder;
        }
        return picUrl.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.displayOrder;
    }

    @NotNull
    public final PicUrl copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new PicUrl(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PicUrl)) {
            return false;
        }
        PicUrl picUrl = (PicUrl) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) picUrl.url) && this.displayOrder == picUrl.displayOrder;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Integer.hashCode(this.displayOrder);
    }

    @NotNull
    public String toString() {
        return "PicUrl(url=" + this.url + ", displayOrder=" + this.displayOrder + ')';
    }
}

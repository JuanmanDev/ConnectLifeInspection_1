package com.juconnect.connect_life.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connect_life/model/FirmwareManualsInfoItem;", "", "desc", "", "id", "lang", "mimeType", "sapId", "type", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getId", "getLang", "getMimeType", "getSapId", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirmwareManualsInfoItem.kt */
public final class FirmwareManualsInfoItem {
    @NotNull
    public final String desc;
    @NotNull

    /* renamed from: id */
    public final String f16688id;
    @NotNull
    public final String lang;
    @NotNull
    public final String mimeType;
    @NotNull
    public final String sapId;
    @NotNull
    public final String type;
    @NotNull
    public final String url;

    public FirmwareManualsInfoItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "lang");
        Intrinsics.checkNotNullParameter(str4, "mimeType");
        Intrinsics.checkNotNullParameter(str5, "sapId");
        Intrinsics.checkNotNullParameter(str6, "type");
        Intrinsics.checkNotNullParameter(str7, "url");
        this.desc = str;
        this.f16688id = str2;
        this.lang = str3;
        this.mimeType = str4;
        this.sapId = str5;
        this.type = str6;
        this.url = str7;
    }

    public static /* synthetic */ FirmwareManualsInfoItem copy$default(FirmwareManualsInfoItem firmwareManualsInfoItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firmwareManualsInfoItem.desc;
        }
        if ((i & 2) != 0) {
            str2 = firmwareManualsInfoItem.f16688id;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = firmwareManualsInfoItem.lang;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = firmwareManualsInfoItem.mimeType;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = firmwareManualsInfoItem.sapId;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = firmwareManualsInfoItem.type;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = firmwareManualsInfoItem.url;
        }
        return firmwareManualsInfoItem.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.desc;
    }

    @NotNull
    public final String component2() {
        return this.f16688id;
    }

    @NotNull
    public final String component3() {
        return this.lang;
    }

    @NotNull
    public final String component4() {
        return this.mimeType;
    }

    @NotNull
    public final String component5() {
        return this.sapId;
    }

    @NotNull
    public final String component6() {
        return this.type;
    }

    @NotNull
    public final String component7() {
        return this.url;
    }

    @NotNull
    public final FirmwareManualsInfoItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "lang");
        Intrinsics.checkNotNullParameter(str4, "mimeType");
        Intrinsics.checkNotNullParameter(str5, "sapId");
        Intrinsics.checkNotNullParameter(str6, "type");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "url");
        return new FirmwareManualsInfoItem(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirmwareManualsInfoItem)) {
            return false;
        }
        FirmwareManualsInfoItem firmwareManualsInfoItem = (FirmwareManualsInfoItem) obj;
        return Intrinsics.areEqual((Object) this.desc, (Object) firmwareManualsInfoItem.desc) && Intrinsics.areEqual((Object) this.f16688id, (Object) firmwareManualsInfoItem.f16688id) && Intrinsics.areEqual((Object) this.lang, (Object) firmwareManualsInfoItem.lang) && Intrinsics.areEqual((Object) this.mimeType, (Object) firmwareManualsInfoItem.mimeType) && Intrinsics.areEqual((Object) this.sapId, (Object) firmwareManualsInfoItem.sapId) && Intrinsics.areEqual((Object) this.type, (Object) firmwareManualsInfoItem.type) && Intrinsics.areEqual((Object) this.url, (Object) firmwareManualsInfoItem.url);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getId() {
        return this.f16688id;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getSapId() {
        return this.sapId;
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
        return (((((((((((this.desc.hashCode() * 31) + this.f16688id.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.sapId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirmwareManualsInfoItem(desc=" + this.desc + ", id=" + this.f16688id + ", lang=" + this.lang + ", mimeType=" + this.mimeType + ", sapId=" + this.sapId + ", type=" + this.type + ", url=" + this.url + ')';
    }
}

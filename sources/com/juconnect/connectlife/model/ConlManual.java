package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/ConlManual;", "", "desc", "", "id", "lang", "type", "url", "sapId", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getId", "getLang", "getMimeType", "getSapId", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConlManual.kt */
public final class ConlManual {
    @NotNull
    public final String desc;
    @NotNull

    /* renamed from: id */
    public final String f16717id;
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

    public ConlManual(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "lang");
        Intrinsics.checkNotNullParameter(str4, "type");
        Intrinsics.checkNotNullParameter(str5, "url");
        Intrinsics.checkNotNullParameter(str6, "sapId");
        Intrinsics.checkNotNullParameter(str7, "mimeType");
        this.desc = str;
        this.f16717id = str2;
        this.lang = str3;
        this.type = str4;
        this.url = str5;
        this.sapId = str6;
        this.mimeType = str7;
    }

    public static /* synthetic */ ConlManual copy$default(ConlManual conlManual, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conlManual.desc;
        }
        if ((i & 2) != 0) {
            str2 = conlManual.f16717id;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = conlManual.lang;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = conlManual.type;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = conlManual.url;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = conlManual.sapId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = conlManual.mimeType;
        }
        return conlManual.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.desc;
    }

    @NotNull
    public final String component2() {
        return this.f16717id;
    }

    @NotNull
    public final String component3() {
        return this.lang;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    @NotNull
    public final String component5() {
        return this.url;
    }

    @NotNull
    public final String component6() {
        return this.sapId;
    }

    @NotNull
    public final String component7() {
        return this.mimeType;
    }

    @NotNull
    public final ConlManual copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "lang");
        Intrinsics.checkNotNullParameter(str4, "type");
        Intrinsics.checkNotNullParameter(str5, "url");
        Intrinsics.checkNotNullParameter(str6, "sapId");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "mimeType");
        return new ConlManual(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConlManual)) {
            return false;
        }
        ConlManual conlManual = (ConlManual) obj;
        return Intrinsics.areEqual((Object) this.desc, (Object) conlManual.desc) && Intrinsics.areEqual((Object) this.f16717id, (Object) conlManual.f16717id) && Intrinsics.areEqual((Object) this.lang, (Object) conlManual.lang) && Intrinsics.areEqual((Object) this.type, (Object) conlManual.type) && Intrinsics.areEqual((Object) this.url, (Object) conlManual.url) && Intrinsics.areEqual((Object) this.sapId, (Object) conlManual.sapId) && Intrinsics.areEqual((Object) this.mimeType, (Object) conlManual.mimeType);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getId() {
        return this.f16717id;
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
        return (((((((((((this.desc.hashCode() * 31) + this.f16717id.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + this.sapId.hashCode()) * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConlManual(desc=" + this.desc + ", id=" + this.f16717id + ", lang=" + this.lang + ", type=" + this.type + ", url=" + this.url + ", sapId=" + this.sapId + ", mimeType=" + this.mimeType + ')';
    }
}

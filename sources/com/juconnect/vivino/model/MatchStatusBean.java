package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jm\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, mo47991d2 = {"Lcom/juconnect/vivino/model/MatchStatusBean;", "", "id", "", "image", "location_id", "match_message", "match_status", "processing_id", "quality_rating", "upload_status", "vintage_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImage", "getLocation_id", "getMatch_message", "getMatch_status", "getProcessing_id", "getQuality_rating", "getUpload_status", "getVintage_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MatchStatusBean.kt */
public final class MatchStatusBean {
    @Nullable

    /* renamed from: id */
    public final String f16734id;
    @Nullable
    public final String image;
    @Nullable
    public final String location_id;
    @Nullable
    public final String match_message;
    @NotNull
    public final String match_status;
    @NotNull
    public final String processing_id;
    @Nullable
    public final String quality_rating;
    @NotNull
    public final String upload_status;
    @NotNull
    public final String vintage_id;

    public MatchStatusBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str5, "match_status");
        Intrinsics.checkNotNullParameter(str6, "processing_id");
        Intrinsics.checkNotNullParameter(str8, "upload_status");
        Intrinsics.checkNotNullParameter(str9, "vintage_id");
        this.f16734id = str;
        this.image = str2;
        this.location_id = str3;
        this.match_message = str4;
        this.match_status = str5;
        this.processing_id = str6;
        this.quality_rating = str7;
        this.upload_status = str8;
        this.vintage_id = str9;
    }

    public static /* synthetic */ MatchStatusBean copy$default(MatchStatusBean matchStatusBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        MatchStatusBean matchStatusBean2 = matchStatusBean;
        int i2 = i;
        return matchStatusBean.copy((i2 & 1) != 0 ? matchStatusBean2.f16734id : str, (i2 & 2) != 0 ? matchStatusBean2.image : str2, (i2 & 4) != 0 ? matchStatusBean2.location_id : str3, (i2 & 8) != 0 ? matchStatusBean2.match_message : str4, (i2 & 16) != 0 ? matchStatusBean2.match_status : str5, (i2 & 32) != 0 ? matchStatusBean2.processing_id : str6, (i2 & 64) != 0 ? matchStatusBean2.quality_rating : str7, (i2 & 128) != 0 ? matchStatusBean2.upload_status : str8, (i2 & 256) != 0 ? matchStatusBean2.vintage_id : str9);
    }

    @Nullable
    public final String component1() {
        return this.f16734id;
    }

    @Nullable
    public final String component2() {
        return this.image;
    }

    @Nullable
    public final String component3() {
        return this.location_id;
    }

    @Nullable
    public final String component4() {
        return this.match_message;
    }

    @NotNull
    public final String component5() {
        return this.match_status;
    }

    @NotNull
    public final String component6() {
        return this.processing_id;
    }

    @Nullable
    public final String component7() {
        return this.quality_rating;
    }

    @NotNull
    public final String component8() {
        return this.upload_status;
    }

    @NotNull
    public final String component9() {
        return this.vintage_id;
    }

    @NotNull
    public final MatchStatusBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9) {
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "match_status");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "processing_id");
        String str12 = str8;
        Intrinsics.checkNotNullParameter(str12, "upload_status");
        String str13 = str9;
        Intrinsics.checkNotNullParameter(str13, "vintage_id");
        return new MatchStatusBean(str, str2, str3, str4, str10, str11, str7, str12, str13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchStatusBean)) {
            return false;
        }
        MatchStatusBean matchStatusBean = (MatchStatusBean) obj;
        return Intrinsics.areEqual((Object) this.f16734id, (Object) matchStatusBean.f16734id) && Intrinsics.areEqual((Object) this.image, (Object) matchStatusBean.image) && Intrinsics.areEqual((Object) this.location_id, (Object) matchStatusBean.location_id) && Intrinsics.areEqual((Object) this.match_message, (Object) matchStatusBean.match_message) && Intrinsics.areEqual((Object) this.match_status, (Object) matchStatusBean.match_status) && Intrinsics.areEqual((Object) this.processing_id, (Object) matchStatusBean.processing_id) && Intrinsics.areEqual((Object) this.quality_rating, (Object) matchStatusBean.quality_rating) && Intrinsics.areEqual((Object) this.upload_status, (Object) matchStatusBean.upload_status) && Intrinsics.areEqual((Object) this.vintage_id, (Object) matchStatusBean.vintage_id);
    }

    @Nullable
    public final String getId() {
        return this.f16734id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getLocation_id() {
        return this.location_id;
    }

    @Nullable
    public final String getMatch_message() {
        return this.match_message;
    }

    @NotNull
    public final String getMatch_status() {
        return this.match_status;
    }

    @NotNull
    public final String getProcessing_id() {
        return this.processing_id;
    }

    @Nullable
    public final String getQuality_rating() {
        return this.quality_rating;
    }

    @NotNull
    public final String getUpload_status() {
        return this.upload_status;
    }

    @NotNull
    public final String getVintage_id() {
        return this.vintage_id;
    }

    public int hashCode() {
        String str = this.f16734id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.match_message;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.match_status.hashCode()) * 31) + this.processing_id.hashCode()) * 31;
        String str5 = this.quality_rating;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.upload_status.hashCode()) * 31) + this.vintage_id.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchStatusBean(id=" + this.f16734id + ", image=" + this.image + ", location_id=" + this.location_id + ", match_message=" + this.match_message + ", match_status=" + this.match_status + ", processing_id=" + this.processing_id + ", quality_rating=" + this.quality_rating + ", upload_status=" + this.upload_status + ", vintage_id=" + this.vintage_id + ')';
    }
}

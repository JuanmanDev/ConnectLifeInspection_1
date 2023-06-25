package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "", "ppVersion", "", "tosVersion", "ppUrl", "tosUrl", "ppSHA256", "tosSHA256", "updateCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPpSHA256", "()Ljava/lang/String;", "getPpUrl", "getPpVersion", "getTosSHA256", "getTosUrl", "getTosVersion", "getUpdateCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JHLAgreementData.kt */
public final class JHLAgreementData {
    @NotNull
    public final String ppSHA256;
    @NotNull
    public final String ppUrl;
    @NotNull
    public final String ppVersion;
    @NotNull
    public final String tosSHA256;
    @NotNull
    public final String tosUrl;
    @NotNull
    public final String tosVersion;
    @NotNull
    public final String updateCount;

    public JHLAgreementData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "ppVersion");
        Intrinsics.checkNotNullParameter(str2, "tosVersion");
        Intrinsics.checkNotNullParameter(str3, "ppUrl");
        Intrinsics.checkNotNullParameter(str4, "tosUrl");
        Intrinsics.checkNotNullParameter(str5, "ppSHA256");
        Intrinsics.checkNotNullParameter(str6, "tosSHA256");
        Intrinsics.checkNotNullParameter(str7, "updateCount");
        this.ppVersion = str;
        this.tosVersion = str2;
        this.ppUrl = str3;
        this.tosUrl = str4;
        this.ppSHA256 = str5;
        this.tosSHA256 = str6;
        this.updateCount = str7;
    }

    public static /* synthetic */ JHLAgreementData copy$default(JHLAgreementData jHLAgreementData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jHLAgreementData.ppVersion;
        }
        if ((i & 2) != 0) {
            str2 = jHLAgreementData.tosVersion;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = jHLAgreementData.ppUrl;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = jHLAgreementData.tosUrl;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = jHLAgreementData.ppSHA256;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = jHLAgreementData.tosSHA256;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = jHLAgreementData.updateCount;
        }
        return jHLAgreementData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.ppVersion;
    }

    @NotNull
    public final String component2() {
        return this.tosVersion;
    }

    @NotNull
    public final String component3() {
        return this.ppUrl;
    }

    @NotNull
    public final String component4() {
        return this.tosUrl;
    }

    @NotNull
    public final String component5() {
        return this.ppSHA256;
    }

    @NotNull
    public final String component6() {
        return this.tosSHA256;
    }

    @NotNull
    public final String component7() {
        return this.updateCount;
    }

    @NotNull
    public final JHLAgreementData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "ppVersion");
        Intrinsics.checkNotNullParameter(str2, "tosVersion");
        Intrinsics.checkNotNullParameter(str3, "ppUrl");
        Intrinsics.checkNotNullParameter(str4, "tosUrl");
        Intrinsics.checkNotNullParameter(str5, "ppSHA256");
        Intrinsics.checkNotNullParameter(str6, "tosSHA256");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "updateCount");
        return new JHLAgreementData(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JHLAgreementData)) {
            return false;
        }
        JHLAgreementData jHLAgreementData = (JHLAgreementData) obj;
        return Intrinsics.areEqual((Object) this.ppVersion, (Object) jHLAgreementData.ppVersion) && Intrinsics.areEqual((Object) this.tosVersion, (Object) jHLAgreementData.tosVersion) && Intrinsics.areEqual((Object) this.ppUrl, (Object) jHLAgreementData.ppUrl) && Intrinsics.areEqual((Object) this.tosUrl, (Object) jHLAgreementData.tosUrl) && Intrinsics.areEqual((Object) this.ppSHA256, (Object) jHLAgreementData.ppSHA256) && Intrinsics.areEqual((Object) this.tosSHA256, (Object) jHLAgreementData.tosSHA256) && Intrinsics.areEqual((Object) this.updateCount, (Object) jHLAgreementData.updateCount);
    }

    @NotNull
    public final String getPpSHA256() {
        return this.ppSHA256;
    }

    @NotNull
    public final String getPpUrl() {
        return this.ppUrl;
    }

    @NotNull
    public final String getPpVersion() {
        return this.ppVersion;
    }

    @NotNull
    public final String getTosSHA256() {
        return this.tosSHA256;
    }

    @NotNull
    public final String getTosUrl() {
        return this.tosUrl;
    }

    @NotNull
    public final String getTosVersion() {
        return this.tosVersion;
    }

    @NotNull
    public final String getUpdateCount() {
        return this.updateCount;
    }

    public int hashCode() {
        return (((((((((((this.ppVersion.hashCode() * 31) + this.tosVersion.hashCode()) * 31) + this.ppUrl.hashCode()) * 31) + this.tosUrl.hashCode()) * 31) + this.ppSHA256.hashCode()) * 31) + this.tosSHA256.hashCode()) * 31) + this.updateCount.hashCode();
    }

    @NotNull
    public String toString() {
        return "JHLAgreementData(ppVersion=" + this.ppVersion + ", tosVersion=" + this.tosVersion + ", ppUrl=" + this.ppUrl + ", tosUrl=" + this.tosUrl + ", ppSHA256=" + this.ppSHA256 + ", tosSHA256=" + this.tosSHA256 + ", updateCount=" + this.updateCount + ')';
    }
}

package com.hisense.connect_life.app_account.util.alexa;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/alexa/AmazonAuthorizationBean;", "", "appUrl", "", "lwaUrl", "unLinkAppUrl", "unLinkLwaUrl", "type", "", "resultCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAppUrl", "()Ljava/lang/String;", "setAppUrl", "(Ljava/lang/String;)V", "getLwaUrl", "setLwaUrl", "getResultCode", "()I", "setResultCode", "(I)V", "getType", "setType", "getUnLinkAppUrl", "setUnLinkAppUrl", "getUnLinkLwaUrl", "setUnLinkLwaUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AmazonAuthorizationBean.kt */
public final class AmazonAuthorizationBean {
    @NotNull
    public String appUrl;
    @NotNull
    public String lwaUrl;
    public int resultCode;
    public int type;
    @NotNull
    public String unLinkAppUrl;
    @NotNull
    public String unLinkLwaUrl;

    public AmazonAuthorizationBean() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, 63, (DefaultConstructorMarker) null);
    }

    public AmazonAuthorizationBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "appUrl");
        Intrinsics.checkNotNullParameter(str2, "lwaUrl");
        Intrinsics.checkNotNullParameter(str3, "unLinkAppUrl");
        Intrinsics.checkNotNullParameter(str4, "unLinkLwaUrl");
        this.appUrl = str;
        this.lwaUrl = str2;
        this.unLinkAppUrl = str3;
        this.unLinkLwaUrl = str4;
        this.type = i;
        this.resultCode = i2;
    }

    public static /* synthetic */ AmazonAuthorizationBean copy$default(AmazonAuthorizationBean amazonAuthorizationBean, String str, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = amazonAuthorizationBean.appUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = amazonAuthorizationBean.lwaUrl;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = amazonAuthorizationBean.unLinkAppUrl;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            str4 = amazonAuthorizationBean.unLinkLwaUrl;
        }
        String str7 = str4;
        if ((i3 & 16) != 0) {
            i = amazonAuthorizationBean.type;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = amazonAuthorizationBean.resultCode;
        }
        return amazonAuthorizationBean.copy(str, str5, str6, str7, i4, i2);
    }

    @NotNull
    public final String component1() {
        return this.appUrl;
    }

    @NotNull
    public final String component2() {
        return this.lwaUrl;
    }

    @NotNull
    public final String component3() {
        return this.unLinkAppUrl;
    }

    @NotNull
    public final String component4() {
        return this.unLinkLwaUrl;
    }

    public final int component5() {
        return this.type;
    }

    public final int component6() {
        return this.resultCode;
    }

    @NotNull
    public final AmazonAuthorizationBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "appUrl");
        Intrinsics.checkNotNullParameter(str2, "lwaUrl");
        Intrinsics.checkNotNullParameter(str3, "unLinkAppUrl");
        Intrinsics.checkNotNullParameter(str4, "unLinkLwaUrl");
        return new AmazonAuthorizationBean(str, str2, str3, str4, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmazonAuthorizationBean)) {
            return false;
        }
        AmazonAuthorizationBean amazonAuthorizationBean = (AmazonAuthorizationBean) obj;
        return Intrinsics.areEqual((Object) this.appUrl, (Object) amazonAuthorizationBean.appUrl) && Intrinsics.areEqual((Object) this.lwaUrl, (Object) amazonAuthorizationBean.lwaUrl) && Intrinsics.areEqual((Object) this.unLinkAppUrl, (Object) amazonAuthorizationBean.unLinkAppUrl) && Intrinsics.areEqual((Object) this.unLinkLwaUrl, (Object) amazonAuthorizationBean.unLinkLwaUrl) && this.type == amazonAuthorizationBean.type && this.resultCode == amazonAuthorizationBean.resultCode;
    }

    @NotNull
    public final String getAppUrl() {
        return this.appUrl;
    }

    @NotNull
    public final String getLwaUrl() {
        return this.lwaUrl;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUnLinkAppUrl() {
        return this.unLinkAppUrl;
    }

    @NotNull
    public final String getUnLinkLwaUrl() {
        return this.unLinkLwaUrl;
    }

    public int hashCode() {
        return (((((((((this.appUrl.hashCode() * 31) + this.lwaUrl.hashCode()) * 31) + this.unLinkAppUrl.hashCode()) * 31) + this.unLinkLwaUrl.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.resultCode);
    }

    public final void setAppUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appUrl = str;
    }

    public final void setLwaUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lwaUrl = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnLinkAppUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unLinkAppUrl = str;
    }

    public final void setUnLinkLwaUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unLinkLwaUrl = str;
    }

    @NotNull
    public String toString() {
        return "AmazonAuthorizationBean(appUrl=" + this.appUrl + ", lwaUrl=" + this.lwaUrl + ", unLinkAppUrl=" + this.unLinkAppUrl + ", unLinkLwaUrl=" + this.unLinkLwaUrl + ", type=" + this.type + ", resultCode=" + this.resultCode + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AmazonAuthorizationBean(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x0008
            r12 = r0
            goto L_0x0009
        L_0x0008:
            r12 = r5
        L_0x0009:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r8
        L_0x001d:
            r5 = r11 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0024
            r3 = r6
            goto L_0x0025
        L_0x0024:
            r3 = r9
        L_0x0025:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002b
            r11 = r6
            goto L_0x002c
        L_0x002b:
            r11 = r10
        L_0x002c:
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.util.alexa.AmazonAuthorizationBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

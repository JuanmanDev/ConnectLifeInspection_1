package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001c¨\u0006>"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/RegisterInfo;", "", "resultCode", "", "subscriberId", "loginName", "", "customerId", "accessToken", "accessTokenCreateTime", "", "accessTokenExpiredTime", "refreshToken", "refreshTokenExpiredTime", "errorCode", "errorDesc", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getAccessTokenCreateTime", "()J", "setAccessTokenCreateTime", "(J)V", "getAccessTokenExpiredTime", "()I", "setAccessTokenExpiredTime", "(I)V", "getCustomerId", "setCustomerId", "getErrorCode", "setErrorCode", "getErrorDesc", "setErrorDesc", "getLoginName", "setLoginName", "getRefreshToken", "setRefreshToken", "getRefreshTokenExpiredTime", "setRefreshTokenExpiredTime", "getResultCode", "setResultCode", "getSubscriberId", "setSubscriberId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInfo.kt */
public final class RegisterInfo {
    @NotNull
    public String accessToken;
    public long accessTokenCreateTime;
    public int accessTokenExpiredTime;
    @NotNull
    public String customerId;
    @NotNull
    public String errorCode;
    @NotNull
    public String errorDesc;
    @NotNull
    public String loginName;
    @NotNull
    public String refreshToken;
    public int refreshTokenExpiredTime;
    public int resultCode;
    public int subscriberId;

    public RegisterInfo(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i3, @NotNull String str4, int i4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Intrinsics.checkNotNullParameter(str3, "accessToken");
        Intrinsics.checkNotNullParameter(str4, "refreshToken");
        Intrinsics.checkNotNullParameter(str5, "errorCode");
        Intrinsics.checkNotNullParameter(str6, "errorDesc");
        this.resultCode = i;
        this.subscriberId = i2;
        this.loginName = str;
        this.customerId = str2;
        this.accessToken = str3;
        this.accessTokenCreateTime = j;
        this.accessTokenExpiredTime = i3;
        this.refreshToken = str4;
        this.refreshTokenExpiredTime = i4;
        this.errorCode = str5;
        this.errorDesc = str6;
    }

    public static /* synthetic */ RegisterInfo copy$default(RegisterInfo registerInfo, int i, int i2, String str, String str2, String str3, long j, int i3, String str4, int i4, String str5, String str6, int i5, Object obj) {
        RegisterInfo registerInfo2 = registerInfo;
        int i6 = i5;
        return registerInfo.copy((i6 & 1) != 0 ? registerInfo2.resultCode : i, (i6 & 2) != 0 ? registerInfo2.subscriberId : i2, (i6 & 4) != 0 ? registerInfo2.loginName : str, (i6 & 8) != 0 ? registerInfo2.customerId : str2, (i6 & 16) != 0 ? registerInfo2.accessToken : str3, (i6 & 32) != 0 ? registerInfo2.accessTokenCreateTime : j, (i6 & 64) != 0 ? registerInfo2.accessTokenExpiredTime : i3, (i6 & 128) != 0 ? registerInfo2.refreshToken : str4, (i6 & 256) != 0 ? registerInfo2.refreshTokenExpiredTime : i4, (i6 & 512) != 0 ? registerInfo2.errorCode : str5, (i6 & 1024) != 0 ? registerInfo2.errorDesc : str6);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component10() {
        return this.errorCode;
    }

    @NotNull
    public final String component11() {
        return this.errorDesc;
    }

    public final int component2() {
        return this.subscriberId;
    }

    @NotNull
    public final String component3() {
        return this.loginName;
    }

    @NotNull
    public final String component4() {
        return this.customerId;
    }

    @NotNull
    public final String component5() {
        return this.accessToken;
    }

    public final long component6() {
        return this.accessTokenCreateTime;
    }

    public final int component7() {
        return this.accessTokenExpiredTime;
    }

    @NotNull
    public final String component8() {
        return this.refreshToken;
    }

    public final int component9() {
        return this.refreshTokenExpiredTime;
    }

    @NotNull
    public final RegisterInfo copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i3, @NotNull String str4, int i4, @NotNull String str5, @NotNull String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "loginName");
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "customerId");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "accessToken");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "refreshToken");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "errorCode");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, "errorDesc");
        return new RegisterInfo(i, i2, str7, str8, str9, j, i3, str10, i4, str11, str12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterInfo)) {
            return false;
        }
        RegisterInfo registerInfo = (RegisterInfo) obj;
        return this.resultCode == registerInfo.resultCode && this.subscriberId == registerInfo.subscriberId && Intrinsics.areEqual((Object) this.loginName, (Object) registerInfo.loginName) && Intrinsics.areEqual((Object) this.customerId, (Object) registerInfo.customerId) && Intrinsics.areEqual((Object) this.accessToken, (Object) registerInfo.accessToken) && this.accessTokenCreateTime == registerInfo.accessTokenCreateTime && this.accessTokenExpiredTime == registerInfo.accessTokenExpiredTime && Intrinsics.areEqual((Object) this.refreshToken, (Object) registerInfo.refreshToken) && this.refreshTokenExpiredTime == registerInfo.refreshTokenExpiredTime && Intrinsics.areEqual((Object) this.errorCode, (Object) registerInfo.errorCode) && Intrinsics.areEqual((Object) this.errorDesc, (Object) registerInfo.errorDesc);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenCreateTime() {
        return this.accessTokenCreateTime;
    }

    public final int getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @NotNull
    public final String getLoginName() {
        return this.loginName;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getSubscriberId() {
        return this.subscriberId;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.subscriberId)) * 31) + this.loginName.hashCode()) * 31) + this.customerId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + Long.hashCode(this.accessTokenCreateTime)) * 31) + Integer.hashCode(this.accessTokenExpiredTime)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshTokenExpiredTime)) * 31) + this.errorCode.hashCode()) * 31) + this.errorDesc.hashCode();
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setAccessTokenCreateTime(long j) {
        this.accessTokenCreateTime = j;
    }

    public final void setAccessTokenExpiredTime(int i) {
        this.accessTokenExpiredTime = i;
    }

    public final void setCustomerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerId = str;
    }

    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setLoginName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginName = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRefreshTokenExpiredTime(int i) {
        this.refreshTokenExpiredTime = i;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setSubscriberId(int i) {
        this.subscriberId = i;
    }

    @NotNull
    public String toString() {
        return "RegisterInfo(resultCode=" + this.resultCode + ", subscriberId=" + this.subscriberId + ", loginName=" + this.loginName + ", customerId=" + this.customerId + ", accessToken=" + this.accessToken + ", accessTokenCreateTime=" + this.accessTokenCreateTime + ", accessTokenExpiredTime=" + this.accessTokenExpiredTime + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiredTime=" + this.refreshTokenExpiredTime + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterInfo(int r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r17
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r18
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r6 = 0
            r9 = r6
            goto L_0x001d
        L_0x001b:
            r9 = r22
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r11 = r2
            goto L_0x0025
        L_0x0023:
            r11 = r24
        L_0x0025:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r26
        L_0x002d:
            r3 = r16
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r25
            r14 = r27
            r15 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.device.model.RegisterInfo.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

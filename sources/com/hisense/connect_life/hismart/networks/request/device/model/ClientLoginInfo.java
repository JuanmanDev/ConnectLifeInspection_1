package com.hisense.connect_life.hismart.networks.request.device.model;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a¨\u00066"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "", "resultCode", "", "customerId", "", "accessToken", "accessTokenCreateTime", "", "accessTokenExpiredTime", "refreshToken", "refreshTokenExpiredTime", "errorCode", "errorDesc", "(ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;IILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getAccessTokenCreateTime", "()J", "setAccessTokenCreateTime", "(J)V", "getAccessTokenExpiredTime", "()I", "setAccessTokenExpiredTime", "(I)V", "getCustomerId", "setCustomerId", "getErrorCode", "setErrorCode", "getErrorDesc", "setErrorDesc", "getRefreshToken", "setRefreshToken", "getRefreshTokenExpiredTime", "setRefreshTokenExpiredTime", "getResultCode", "setResultCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClientLoginInfo.kt */
public final class ClientLoginInfo {
    @NotNull
    public String accessToken;
    public long accessTokenCreateTime;
    public int accessTokenExpiredTime;
    @NotNull
    public String customerId;
    public int errorCode;
    @NotNull
    public String errorDesc;
    @NotNull
    public String refreshToken;
    public int refreshTokenExpiredTime;
    public int resultCode;

    public ClientLoginInfo() {
        this(0, (String) null, (String) null, 0, 0, (String) null, 0, 0, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    public ClientLoginInfo(int i, @NotNull String str, @NotNull String str2, long j, int i2, @NotNull String str3, int i3, int i4, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "customerId");
        Intrinsics.checkNotNullParameter(str2, "accessToken");
        Intrinsics.checkNotNullParameter(str3, "refreshToken");
        Intrinsics.checkNotNullParameter(str4, "errorDesc");
        this.resultCode = i;
        this.customerId = str;
        this.accessToken = str2;
        this.accessTokenCreateTime = j;
        this.accessTokenExpiredTime = i2;
        this.refreshToken = str3;
        this.refreshTokenExpiredTime = i3;
        this.errorCode = i4;
        this.errorDesc = str4;
    }

    public static /* synthetic */ ClientLoginInfo copy$default(ClientLoginInfo clientLoginInfo, int i, String str, String str2, long j, int i2, String str3, int i3, int i4, String str4, int i5, Object obj) {
        ClientLoginInfo clientLoginInfo2 = clientLoginInfo;
        int i6 = i5;
        return clientLoginInfo.copy((i6 & 1) != 0 ? clientLoginInfo2.resultCode : i, (i6 & 2) != 0 ? clientLoginInfo2.customerId : str, (i6 & 4) != 0 ? clientLoginInfo2.accessToken : str2, (i6 & 8) != 0 ? clientLoginInfo2.accessTokenCreateTime : j, (i6 & 16) != 0 ? clientLoginInfo2.accessTokenExpiredTime : i2, (i6 & 32) != 0 ? clientLoginInfo2.refreshToken : str3, (i6 & 64) != 0 ? clientLoginInfo2.refreshTokenExpiredTime : i3, (i6 & 128) != 0 ? clientLoginInfo2.errorCode : i4, (i6 & 256) != 0 ? clientLoginInfo2.errorDesc : str4);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.customerId;
    }

    @NotNull
    public final String component3() {
        return this.accessToken;
    }

    public final long component4() {
        return this.accessTokenCreateTime;
    }

    public final int component5() {
        return this.accessTokenExpiredTime;
    }

    @NotNull
    public final String component6() {
        return this.refreshToken;
    }

    public final int component7() {
        return this.refreshTokenExpiredTime;
    }

    public final int component8() {
        return this.errorCode;
    }

    @NotNull
    public final String component9() {
        return this.errorDesc;
    }

    @NotNull
    public final ClientLoginInfo copy(int i, @NotNull String str, @NotNull String str2, long j, int i2, @NotNull String str3, int i3, int i4, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "customerId");
        Intrinsics.checkNotNullParameter(str2, "accessToken");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "refreshToken");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "errorDesc");
        return new ClientLoginInfo(i, str, str2, j, i2, str5, i3, i4, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientLoginInfo)) {
            return false;
        }
        ClientLoginInfo clientLoginInfo = (ClientLoginInfo) obj;
        return this.resultCode == clientLoginInfo.resultCode && Intrinsics.areEqual((Object) this.customerId, (Object) clientLoginInfo.customerId) && Intrinsics.areEqual((Object) this.accessToken, (Object) clientLoginInfo.accessToken) && this.accessTokenCreateTime == clientLoginInfo.accessTokenCreateTime && this.accessTokenExpiredTime == clientLoginInfo.accessTokenExpiredTime && Intrinsics.areEqual((Object) this.refreshToken, (Object) clientLoginInfo.refreshToken) && this.refreshTokenExpiredTime == clientLoginInfo.refreshTokenExpiredTime && this.errorCode == clientLoginInfo.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) clientLoginInfo.errorDesc);
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

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
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

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.resultCode) * 31) + this.customerId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + Long.hashCode(this.accessTokenCreateTime)) * 31) + Integer.hashCode(this.accessTokenExpiredTime)) * 31) + this.refreshToken.hashCode()) * 31) + Integer.hashCode(this.refreshTokenExpiredTime)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode();
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

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
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

    @NotNull
    public String toString() {
        return "ClientLoginInfo(resultCode=" + this.resultCode + ", customerId=" + this.customerId + ", accessToken=" + this.accessToken + ", accessTokenCreateTime=" + this.accessTokenCreateTime + ", accessTokenExpiredTime=" + this.accessTokenExpiredTime + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiredTime=" + this.refreshTokenExpiredTime + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClientLoginInfo(int r13, java.lang.String r14, java.lang.String r15, long r16, int r18, java.lang.String r19, int r20, int r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0013
        L_0x0012:
            r3 = r14
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001a
        L_0x0019:
            r5 = r15
        L_0x001a:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            r6 = 0
            goto L_0x0023
        L_0x0021:
            r6 = r16
        L_0x0023:
            r8 = r0 & 16
            r9 = 0
            if (r8 == 0) goto L_0x002a
            r8 = r9
            goto L_0x002c
        L_0x002a:
            r8 = r18
        L_0x002c:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0032
            r10 = r4
            goto L_0x0034
        L_0x0032:
            r10 = r19
        L_0x0034:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r9 = r20
        L_0x003b:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = r21
        L_0x0042:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = r22
        L_0x0049:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r5
            r17 = r6
            r19 = r8
            r20 = r10
            r21 = r9
            r22 = r2
            r23 = r4
            r13.<init>(r14, r15, r16, r17, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo.<init>(int, java.lang.String, java.lang.String, long, int, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

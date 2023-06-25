package com.hisense.connect_life.hismart.networks.request;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0007H\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "", "resultCode", "", "errorCode", "", "errorDesc", "", "desc", "(IJLjava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getErrorCode", "()J", "setErrorCode", "(J)V", "getErrorDesc", "setErrorDesc", "getResultCode", "()I", "setResultCode", "(I)V", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiResponse.kt */
public class HiResponse {
    @NotNull
    public String desc;
    public long errorCode;
    @NotNull
    public String errorDesc;
    public int resultCode;

    public HiResponse() {
        this(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public HiResponse(int i, long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Intrinsics.checkNotNullParameter(str2, "desc");
        this.resultCode = i;
        this.errorCode = j;
        this.errorDesc = str;
        this.desc = str2;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void setErrorCode(long j) {
        this.errorCode = j;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "HiResponse(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc='" + this.errorDesc + "', desc='" + this.desc + "')";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HiResponse(int r4, long r5, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = -1
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000b
            r5 = -1
        L_0x000b:
            r0 = r5
            r5 = r9 & 4
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0014
            r10 = r6
            goto L_0x0015
        L_0x0014:
            r10 = r7
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            r2 = r6
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            r5.<init>(r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.HiResponse.<init>(int, long, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

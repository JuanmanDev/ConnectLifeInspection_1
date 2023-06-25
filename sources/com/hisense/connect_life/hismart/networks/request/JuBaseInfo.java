package com.hisense.connect_life.hismart.networks.request;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/JuBaseInfo;", "", "errorCode", "", "errorDesc", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuBaseInfo.kt */
public class JuBaseInfo {
    public int errorCode;
    @NotNull
    public String errorDesc;

    public JuBaseInfo() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public JuBaseInfo(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.errorCode = i;
        this.errorDesc = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JuBaseInfo(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str);
    }
}

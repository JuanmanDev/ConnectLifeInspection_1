package com.hisense.juconnect.app_socket.fbean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/ResultData;", "", "()V", "response", "Lcom/hisense/juconnect/app_socket/fbean/ResultInfo;", "getResponse", "()Lcom/hisense/juconnect/app_socket/fbean/ResultInfo;", "setResponse", "(Lcom/hisense/juconnect/app_socket/fbean/ResultInfo;)V", "signatureServer", "", "getSignatureServer", "()Ljava/lang/String;", "setSignatureServer", "(Ljava/lang/String;)V", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ResultData.kt */
public final class ResultData {
    public ResultInfo response;
    public String signatureServer;

    @NotNull
    public final ResultInfo getResponse() {
        ResultInfo resultInfo = this.response;
        if (resultInfo != null) {
            return resultInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    @NotNull
    public final String getSignatureServer() {
        String str = this.signatureServer;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signatureServer");
        return null;
    }

    public final void setResponse(@NotNull ResultInfo resultInfo) {
        Intrinsics.checkNotNullParameter(resultInfo, "<set-?>");
        this.response = resultInfo;
    }

    public final void setSignatureServer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.signatureServer = str;
    }
}

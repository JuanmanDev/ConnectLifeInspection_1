package com.hisense.connect_life.hismart.networks.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/TokenInvalidResponse;", "", "response", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "signatureServer", "", "(Lcom/hisense/connect_life/hismart/networks/request/HiResponse;Ljava/lang/String;)V", "getResponse", "()Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "getSignatureServer", "()Ljava/lang/String;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TokenInvalidResponse.kt */
public final class TokenInvalidResponse {
    @NotNull
    public final HiResponse response;
    @NotNull
    public final String signatureServer;

    public TokenInvalidResponse(@NotNull HiResponse hiResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hiResponse, "response");
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        this.response = hiResponse;
        this.signatureServer = str;
    }

    @NotNull
    public final HiResponse getResponse() {
        return this.response;
    }

    @NotNull
    public final String getSignatureServer() {
        return this.signatureServer;
    }
}

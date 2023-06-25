package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/JuResult;", "", "response", "Lcom/hisense/connect_life/hismart/model/JuResponse;", "signatureServer", "", "(Lcom/hisense/connect_life/hismart/model/JuResponse;Ljava/lang/String;)V", "getResponse", "()Lcom/hisense/connect_life/hismart/model/JuResponse;", "getSignatureServer", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuResult.kt */
public final class JuResult {
    @NotNull
    public final JuResponse response;
    @NotNull
    public final String signatureServer;

    public JuResult(@NotNull JuResponse juResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(juResponse, "response");
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        this.response = juResponse;
        this.signatureServer = str;
    }

    public static /* synthetic */ JuResult copy$default(JuResult juResult, JuResponse juResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            juResponse = juResult.response;
        }
        if ((i & 2) != 0) {
            str = juResult.signatureServer;
        }
        return juResult.copy(juResponse, str);
    }

    @NotNull
    public final JuResponse component1() {
        return this.response;
    }

    @NotNull
    public final String component2() {
        return this.signatureServer;
    }

    @NotNull
    public final JuResult copy(@NotNull JuResponse juResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(juResponse, "response");
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        return new JuResult(juResponse, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuResult)) {
            return false;
        }
        JuResult juResult = (JuResult) obj;
        return Intrinsics.areEqual((Object) this.response, (Object) juResult.response) && Intrinsics.areEqual((Object) this.signatureServer, (Object) juResult.signatureServer);
    }

    @NotNull
    public final JuResponse getResponse() {
        return this.response;
    }

    @NotNull
    public final String getSignatureServer() {
        return this.signatureServer;
    }

    public int hashCode() {
        return (this.response.hashCode() * 31) + this.signatureServer.hashCode();
    }

    @NotNull
    public String toString() {
        return "JuResult(response=" + this.response + ", signatureServer=" + this.signatureServer + ')';
    }
}

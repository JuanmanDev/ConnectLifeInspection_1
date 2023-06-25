package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/JuCustomResult;", "T", "", "response", "signatureServer", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSignatureServer", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/hisense/connect_life/hismart/model/JuCustomResult;", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuCustomResult.kt */
public final class JuCustomResult<T> {
    public final T response;
    @NotNull
    public final String signatureServer;

    public JuCustomResult(T t, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        this.response = t;
        this.signatureServer = str;
    }

    public static /* synthetic */ JuCustomResult copy$default(JuCustomResult juCustomResult, T t, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            t = juCustomResult.response;
        }
        if ((i & 2) != 0) {
            str = juCustomResult.signatureServer;
        }
        return juCustomResult.copy(t, str);
    }

    public final T component1() {
        return this.response;
    }

    @NotNull
    public final String component2() {
        return this.signatureServer;
    }

    @NotNull
    public final JuCustomResult<T> copy(T t, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        return new JuCustomResult<>(t, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuCustomResult)) {
            return false;
        }
        JuCustomResult juCustomResult = (JuCustomResult) obj;
        return Intrinsics.areEqual((Object) this.response, (Object) juCustomResult.response) && Intrinsics.areEqual((Object) this.signatureServer, (Object) juCustomResult.signatureServer);
    }

    public final T getResponse() {
        return this.response;
    }

    @NotNull
    public final String getSignatureServer() {
        return this.signatureServer;
    }

    public int hashCode() {
        T t = this.response;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.signatureServer.hashCode();
    }

    @NotNull
    public String toString() {
        return "JuCustomResult(response=" + this.response + ", signatureServer=" + this.signatureServer + ')';
    }
}

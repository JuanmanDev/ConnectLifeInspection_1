package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/TokenBean;", "", "access_token", "", "expires_in", "", "refresh_token", "token_type", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "getExpires_in", "()I", "getRefresh_token", "getToken_type", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TokenBean.kt */
public final class TokenBean {
    @NotNull
    public final String access_token;
    public final int expires_in;
    @NotNull
    public final String refresh_token;
    @NotNull
    public final String token_type;

    public TokenBean(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "refresh_token");
        Intrinsics.checkNotNullParameter(str3, "token_type");
        this.access_token = str;
        this.expires_in = i;
        this.refresh_token = str2;
        this.token_type = str3;
    }

    public static /* synthetic */ TokenBean copy$default(TokenBean tokenBean, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tokenBean.access_token;
        }
        if ((i2 & 2) != 0) {
            i = tokenBean.expires_in;
        }
        if ((i2 & 4) != 0) {
            str2 = tokenBean.refresh_token;
        }
        if ((i2 & 8) != 0) {
            str3 = tokenBean.token_type;
        }
        return tokenBean.copy(str, i, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.access_token;
    }

    public final int component2() {
        return this.expires_in;
    }

    @NotNull
    public final String component3() {
        return this.refresh_token;
    }

    @NotNull
    public final String component4() {
        return this.token_type;
    }

    @NotNull
    public final TokenBean copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "refresh_token");
        Intrinsics.checkNotNullParameter(str3, "token_type");
        return new TokenBean(str, i, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenBean)) {
            return false;
        }
        TokenBean tokenBean = (TokenBean) obj;
        return Intrinsics.areEqual((Object) this.access_token, (Object) tokenBean.access_token) && this.expires_in == tokenBean.expires_in && Intrinsics.areEqual((Object) this.refresh_token, (Object) tokenBean.refresh_token) && Intrinsics.areEqual((Object) this.token_type, (Object) tokenBean.token_type);
    }

    @NotNull
    public final String getAccess_token() {
        return this.access_token;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    @NotNull
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    @NotNull
    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        return (((((this.access_token.hashCode() * 31) + Integer.hashCode(this.expires_in)) * 31) + this.refresh_token.hashCode()) * 31) + this.token_type.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenBean(access_token=" + this.access_token + ", expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", token_type=" + this.token_type + ')';
    }
}

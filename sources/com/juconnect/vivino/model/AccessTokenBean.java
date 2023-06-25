package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo47991d2 = {"Lcom/juconnect/vivino/model/AccessTokenBean;", "", "access_token", "", "expires", "", "expires_in", "token_type", "(Ljava/lang/String;JJLjava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "getExpires", "()J", "getExpires_in", "getToken_type", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccessTokenBean.kt */
public final class AccessTokenBean {
    @NotNull
    public final String access_token;
    public final long expires;
    public final long expires_in;
    @NotNull
    public final String token_type;

    public AccessTokenBean(@NotNull String str, long j, long j2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "token_type");
        this.access_token = str;
        this.expires = j;
        this.expires_in = j2;
        this.token_type = str2;
    }

    public static /* synthetic */ AccessTokenBean copy$default(AccessTokenBean accessTokenBean, String str, long j, long j2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessTokenBean.access_token;
        }
        if ((i & 2) != 0) {
            j = accessTokenBean.expires;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = accessTokenBean.expires_in;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str2 = accessTokenBean.token_type;
        }
        return accessTokenBean.copy(str, j3, j4, str2);
    }

    @NotNull
    public final String component1() {
        return this.access_token;
    }

    public final long component2() {
        return this.expires;
    }

    public final long component3() {
        return this.expires_in;
    }

    @NotNull
    public final String component4() {
        return this.token_type;
    }

    @NotNull
    public final AccessTokenBean copy(@NotNull String str, long j, long j2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "token_type");
        return new AccessTokenBean(str, j, j2, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenBean)) {
            return false;
        }
        AccessTokenBean accessTokenBean = (AccessTokenBean) obj;
        return Intrinsics.areEqual((Object) this.access_token, (Object) accessTokenBean.access_token) && this.expires == accessTokenBean.expires && this.expires_in == accessTokenBean.expires_in && Intrinsics.areEqual((Object) this.token_type, (Object) accessTokenBean.token_type);
    }

    @NotNull
    public final String getAccess_token() {
        return this.access_token;
    }

    public final long getExpires() {
        return this.expires;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    @NotNull
    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        return (((((this.access_token.hashCode() * 31) + Long.hashCode(this.expires)) * 31) + Long.hashCode(this.expires_in)) * 31) + this.token_type.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccessTokenBean(access_token=" + this.access_token + ", expires=" + this.expires + ", expires_in=" + this.expires_in + ", token_type=" + this.token_type + ')';
    }
}

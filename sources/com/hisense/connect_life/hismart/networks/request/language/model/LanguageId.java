package com.hisense.connect_life.hismart.networks.request.language.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/language/model/LanguageId;", "", "resultCode", "", "defaultLanguageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultLanguageId", "()Ljava/lang/String;", "getResultCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageId.kt */
public final class LanguageId {
    @NotNull
    public final String defaultLanguageId;
    @NotNull
    public final String resultCode;

    public LanguageId(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "resultCode");
        Intrinsics.checkNotNullParameter(str2, "defaultLanguageId");
        this.resultCode = str;
        this.defaultLanguageId = str2;
    }

    public static /* synthetic */ LanguageId copy$default(LanguageId languageId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageId.resultCode;
        }
        if ((i & 2) != 0) {
            str2 = languageId.defaultLanguageId;
        }
        return languageId.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.defaultLanguageId;
    }

    @NotNull
    public final LanguageId copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "resultCode");
        Intrinsics.checkNotNullParameter(str2, "defaultLanguageId");
        return new LanguageId(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageId)) {
            return false;
        }
        LanguageId languageId = (LanguageId) obj;
        return Intrinsics.areEqual((Object) this.resultCode, (Object) languageId.resultCode) && Intrinsics.areEqual((Object) this.defaultLanguageId, (Object) languageId.defaultLanguageId);
    }

    @NotNull
    public final String getDefaultLanguageId() {
        return this.defaultLanguageId;
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (this.resultCode.hashCode() * 31) + this.defaultLanguageId.hashCode();
    }

    @NotNull
    public String toString() {
        return "LanguageId(resultCode=" + this.resultCode + ", defaultLanguageId=" + this.defaultLanguageId + ')';
    }
}

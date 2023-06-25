package com.juconnect.connect_life.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo47991d2 = {"Lcom/juconnect/connect_life/model/LanguageData;", "", "languageId", "", "languageCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "(Ljava/lang/String;)V", "getLanguageId", "setLanguageId", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageData.kt */
public final class LanguageData {
    @NotNull
    public String languageCode;
    @NotNull
    public String languageId;

    public LanguageData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Intrinsics.checkNotNullParameter(str2, "languageCode");
        this.languageId = str;
        this.languageCode = str2;
    }

    @NotNull
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final String getLanguageId() {
        return this.languageId;
    }

    public final void setLanguageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageCode = str;
    }

    public final void setLanguageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageId = str;
    }
}

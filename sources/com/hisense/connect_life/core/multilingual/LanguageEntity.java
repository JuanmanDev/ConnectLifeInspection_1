package com.hisense.connect_life.core.multilingual;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/connect_life/core/multilingual/LanguageEntity;", "", "languageName", "", "languageType", "languageCode", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setSelected", "(Z)V", "getLanguageCode", "()Ljava/lang/String;", "getLanguageName", "getLanguageType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageEntity.kt */
public final class LanguageEntity {
    public boolean isSelected;
    @NotNull
    public final String languageCode;
    @NotNull
    public final String languageName;
    @NotNull
    public final String languageType;

    public LanguageEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        Intrinsics.checkNotNullParameter(str2, "languageType");
        Intrinsics.checkNotNullParameter(str3, "languageCode");
        this.languageName = str;
        this.languageType = str2;
        this.languageCode = str3;
        this.isSelected = z;
    }

    public static /* synthetic */ LanguageEntity copy$default(LanguageEntity languageEntity, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageEntity.languageName;
        }
        if ((i & 2) != 0) {
            str2 = languageEntity.languageType;
        }
        if ((i & 4) != 0) {
            str3 = languageEntity.languageCode;
        }
        if ((i & 8) != 0) {
            z = languageEntity.isSelected;
        }
        return languageEntity.copy(str, str2, str3, z);
    }

    @NotNull
    public final String component1() {
        return this.languageName;
    }

    @NotNull
    public final String component2() {
        return this.languageType;
    }

    @NotNull
    public final String component3() {
        return this.languageCode;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    @NotNull
    public final LanguageEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        Intrinsics.checkNotNullParameter(str2, "languageType");
        Intrinsics.checkNotNullParameter(str3, "languageCode");
        return new LanguageEntity(str, str2, str3, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageEntity)) {
            return false;
        }
        LanguageEntity languageEntity = (LanguageEntity) obj;
        return Intrinsics.areEqual((Object) this.languageName, (Object) languageEntity.languageName) && Intrinsics.areEqual((Object) this.languageType, (Object) languageEntity.languageType) && Intrinsics.areEqual((Object) this.languageCode, (Object) languageEntity.languageCode) && this.isSelected == languageEntity.isSelected;
    }

    @NotNull
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final String getLanguageName() {
        return this.languageName;
    }

    @NotNull
    public final String getLanguageType() {
        return this.languageType;
    }

    public int hashCode() {
        int hashCode = ((((this.languageName.hashCode() * 31) + this.languageType.hashCode()) * 31) + this.languageCode.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "LanguageEntity(languageName=" + this.languageName + ", languageType=" + this.languageType + ", languageCode=" + this.languageCode + ", isSelected=" + this.isSelected + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LanguageEntity(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}

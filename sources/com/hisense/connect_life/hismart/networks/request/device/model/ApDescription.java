package com.hisense.connect_life.hismart.networks.request.device.model;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDescription;", "", "description", "", "language", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getLanguage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApDescription.kt */
public final class ApDescription {
    @NotNull
    public final String description;
    @NotNull
    public final String language;

    public ApDescription(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(str2, "language");
        this.description = str;
        this.language = str2;
    }

    public static /* synthetic */ ApDescription copy$default(ApDescription apDescription, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = apDescription.language;
        }
        return apDescription.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    @NotNull
    public final String component2() {
        return this.language;
    }

    @NotNull
    public final ApDescription copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(str2, "language");
        return new ApDescription(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApDescription)) {
            return false;
        }
        ApDescription apDescription = (ApDescription) obj;
        return Intrinsics.areEqual((Object) this.description, (Object) apDescription.description) && Intrinsics.areEqual((Object) this.language, (Object) apDescription.language);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.language.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApDescription(description=" + this.description + ", language=" + this.language + ')';
    }
}

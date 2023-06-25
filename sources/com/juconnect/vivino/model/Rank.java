package com.juconnect.vivino.model;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo47991d2 = {"Lcom/juconnect/vivino/model/Rank;", "", "description", "", "rank", "", "total", "(Ljava/lang/String;II)V", "getDescription", "()Ljava/lang/String;", "getRank", "()I", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Rank.kt */
public final class Rank {
    @NotNull
    public final String description;
    public final int rank;
    public final int total;

    public Rank(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        this.description = str;
        this.rank = i;
        this.total = i2;
    }

    public static /* synthetic */ Rank copy$default(Rank rank2, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rank2.description;
        }
        if ((i3 & 2) != 0) {
            i = rank2.rank;
        }
        if ((i3 & 4) != 0) {
            i2 = rank2.total;
        }
        return rank2.copy(str, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.rank;
    }

    public final int component3() {
        return this.total;
    }

    @NotNull
    public final Rank copy(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        return new Rank(str, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rank)) {
            return false;
        }
        Rank rank2 = (Rank) obj;
        return Intrinsics.areEqual((Object) this.description, (Object) rank2.description) && this.rank == rank2.rank && this.total == rank2.total;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((this.description.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.total);
    }

    @NotNull
    public String toString() {
        return "Rank(description=" + this.description + ", rank=" + this.rank + ", total=" + this.total + ')';
    }
}

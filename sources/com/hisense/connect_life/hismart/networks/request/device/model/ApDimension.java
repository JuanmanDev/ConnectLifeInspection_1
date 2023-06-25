package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDimension;", "", "depth", "", "height", "unitOfMeasure", "", "width", "(IILjava/lang/String;I)V", "getDepth", "()I", "getHeight", "getUnitOfMeasure", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApDimension.kt */
public final class ApDimension {
    public final int depth;
    public final int height;
    @NotNull
    public final String unitOfMeasure;
    public final int width;

    public ApDimension(int i, int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "unitOfMeasure");
        this.depth = i;
        this.height = i2;
        this.unitOfMeasure = str;
        this.width = i3;
    }

    public static /* synthetic */ ApDimension copy$default(ApDimension apDimension, int i, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = apDimension.depth;
        }
        if ((i4 & 2) != 0) {
            i2 = apDimension.height;
        }
        if ((i4 & 4) != 0) {
            str = apDimension.unitOfMeasure;
        }
        if ((i4 & 8) != 0) {
            i3 = apDimension.width;
        }
        return apDimension.copy(i, i2, str, i3);
    }

    public final int component1() {
        return this.depth;
    }

    public final int component2() {
        return this.height;
    }

    @NotNull
    public final String component3() {
        return this.unitOfMeasure;
    }

    public final int component4() {
        return this.width;
    }

    @NotNull
    public final ApDimension copy(int i, int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "unitOfMeasure");
        return new ApDimension(i, i2, str, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApDimension)) {
            return false;
        }
        ApDimension apDimension = (ApDimension) obj;
        return this.depth == apDimension.depth && this.height == apDimension.height && Intrinsics.areEqual((Object) this.unitOfMeasure, (Object) apDimension.unitOfMeasure) && this.width == apDimension.width;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.depth) * 31) + Integer.hashCode(this.height)) * 31) + this.unitOfMeasure.hashCode()) * 31) + Integer.hashCode(this.width);
    }

    @NotNull
    public String toString() {
        return "ApDimension(depth=" + this.depth + ", height=" + this.height + ", unitOfMeasure=" + this.unitOfMeasure + ", width=" + this.width + ')';
    }
}

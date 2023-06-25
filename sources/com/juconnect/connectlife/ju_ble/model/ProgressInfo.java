package com.juconnect.connectlife.ju_ble.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/model/ProgressInfo;", "", "currentProgress", "", "currentPart", "partTotal", "(III)V", "getCurrentPart", "()I", "setCurrentPart", "(I)V", "getCurrentProgress", "setCurrentProgress", "getPartTotal", "setPartTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ProgressInfo.kt */
public final class ProgressInfo {
    public int currentPart;
    public int currentProgress;
    public int partTotal;

    public ProgressInfo(int i, int i2, int i3) {
        this.currentProgress = i;
        this.currentPart = i2;
        this.partTotal = i3;
    }

    public static /* synthetic */ ProgressInfo copy$default(ProgressInfo progressInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = progressInfo.currentProgress;
        }
        if ((i4 & 2) != 0) {
            i2 = progressInfo.currentPart;
        }
        if ((i4 & 4) != 0) {
            i3 = progressInfo.partTotal;
        }
        return progressInfo.copy(i, i2, i3);
    }

    public final int component1() {
        return this.currentProgress;
    }

    public final int component2() {
        return this.currentPart;
    }

    public final int component3() {
        return this.partTotal;
    }

    @NotNull
    public final ProgressInfo copy(int i, int i2, int i3) {
        return new ProgressInfo(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressInfo)) {
            return false;
        }
        ProgressInfo progressInfo = (ProgressInfo) obj;
        return this.currentProgress == progressInfo.currentProgress && this.currentPart == progressInfo.currentPart && this.partTotal == progressInfo.partTotal;
    }

    public final int getCurrentPart() {
        return this.currentPart;
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final int getPartTotal() {
        return this.partTotal;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.currentProgress) * 31) + Integer.hashCode(this.currentPart)) * 31) + Integer.hashCode(this.partTotal);
    }

    public final void setCurrentPart(int i) {
        this.currentPart = i;
    }

    public final void setCurrentProgress(int i) {
        this.currentProgress = i;
    }

    public final void setPartTotal(int i) {
        this.partTotal = i;
    }

    @NotNull
    public String toString() {
        return "ProgressInfo(currentProgress=" + this.currentProgress + ", currentPart=" + this.currentPart + ", partTotal=" + this.partTotal + ')';
    }
}

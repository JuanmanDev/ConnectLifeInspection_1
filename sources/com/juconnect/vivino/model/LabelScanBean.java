package com.juconnect.vivino.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo47991d2 = {"Lcom/juconnect/vivino/model/LabelScanBean;", "", "processing_id", "", "status", "matches_after_msec", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMatches_after_msec", "()J", "getProcessing_id", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LabelScanBean.kt */
public final class LabelScanBean {
    public final long matches_after_msec;
    @NotNull
    public final String processing_id;
    @NotNull
    public final String status;

    public LabelScanBean(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "processing_id");
        Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_STATUS);
        this.processing_id = str;
        this.status = str2;
        this.matches_after_msec = j;
    }

    public static /* synthetic */ LabelScanBean copy$default(LabelScanBean labelScanBean, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = labelScanBean.processing_id;
        }
        if ((i & 2) != 0) {
            str2 = labelScanBean.status;
        }
        if ((i & 4) != 0) {
            j = labelScanBean.matches_after_msec;
        }
        return labelScanBean.copy(str, str2, j);
    }

    @NotNull
    public final String component1() {
        return this.processing_id;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    public final long component3() {
        return this.matches_after_msec;
    }

    @NotNull
    public final LabelScanBean copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "processing_id");
        Intrinsics.checkNotNullParameter(str2, NotificationCompat.CATEGORY_STATUS);
        return new LabelScanBean(str, str2, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelScanBean)) {
            return false;
        }
        LabelScanBean labelScanBean = (LabelScanBean) obj;
        return Intrinsics.areEqual((Object) this.processing_id, (Object) labelScanBean.processing_id) && Intrinsics.areEqual((Object) this.status, (Object) labelScanBean.status) && this.matches_after_msec == labelScanBean.matches_after_msec;
    }

    public final long getMatches_after_msec() {
        return this.matches_after_msec;
    }

    @NotNull
    public final String getProcessing_id() {
        return this.processing_id;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.processing_id.hashCode() * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.matches_after_msec);
    }

    @NotNull
    public String toString() {
        return "LabelScanBean(processing_id=" + this.processing_id + ", status=" + this.status + ", matches_after_msec=" + this.matches_after_msec + ')';
    }
}

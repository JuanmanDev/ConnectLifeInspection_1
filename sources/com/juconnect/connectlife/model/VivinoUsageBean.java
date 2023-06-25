package com.juconnect.connectlife.model;

import androidx.core.app.NotificationCompat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/VivinoUsageBean;", "", "date", "Ljava/util/Date;", "status", "", "(Ljava/util/Date;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VivinoUsageBean.kt */
public final class VivinoUsageBean {
    @NotNull
    public final Date date;
    @NotNull
    public final String status;

    public VivinoUsageBean(@NotNull Date date2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(date2, "date");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        this.date = date2;
        this.status = str;
    }

    public static /* synthetic */ VivinoUsageBean copy$default(VivinoUsageBean vivinoUsageBean, Date date2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date2 = vivinoUsageBean.date;
        }
        if ((i & 2) != 0) {
            str = vivinoUsageBean.status;
        }
        return vivinoUsageBean.copy(date2, str);
    }

    @NotNull
    public final Date component1() {
        return this.date;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final VivinoUsageBean copy(@NotNull Date date2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(date2, "date");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        return new VivinoUsageBean(date2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VivinoUsageBean)) {
            return false;
        }
        VivinoUsageBean vivinoUsageBean = (VivinoUsageBean) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) vivinoUsageBean.date) && Intrinsics.areEqual((Object) this.status, (Object) vivinoUsageBean.status);
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "VivinoUsageBean(date=" + this.date + ", status=" + this.status + ')';
    }
}

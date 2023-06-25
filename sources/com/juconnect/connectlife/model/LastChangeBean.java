package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/LastChangeBean;", "", "lastChange", "", "(Ljava/lang/String;)V", "getLastChange", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LastChangeBean.kt */
public final class LastChangeBean {
    @NotNull
    public final String lastChange;

    public LastChangeBean(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastChange");
        this.lastChange = str;
    }

    public static /* synthetic */ LastChangeBean copy$default(LastChangeBean lastChangeBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastChangeBean.lastChange;
        }
        return lastChangeBean.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.lastChange;
    }

    @NotNull
    public final LastChangeBean copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastChange");
        return new LastChangeBean(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastChangeBean) && Intrinsics.areEqual((Object) this.lastChange, (Object) ((LastChangeBean) obj).lastChange);
    }

    @NotNull
    public final String getLastChange() {
        return this.lastChange;
    }

    public int hashCode() {
        return this.lastChange.hashCode();
    }

    @NotNull
    public String toString() {
        return "LastChangeBean(lastChange=" + this.lastChange + ')';
    }
}

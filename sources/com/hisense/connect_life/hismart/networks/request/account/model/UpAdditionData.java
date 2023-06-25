package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAdditionData;", "Ljava/io/Serializable;", "group", "", "name", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroup", "()Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpAdditionData.kt */
public final class UpAdditionData implements Serializable {
    @NotNull
    public final String group;
    @NotNull
    public String name;
    @NotNull
    public String value;

    public UpAdditionData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "group");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "value");
        this.group = str;
        this.name = str2;
        this.value = str3;
    }

    public static /* synthetic */ UpAdditionData copy$default(UpAdditionData upAdditionData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upAdditionData.group;
        }
        if ((i & 2) != 0) {
            str2 = upAdditionData.name;
        }
        if ((i & 4) != 0) {
            str3 = upAdditionData.value;
        }
        return upAdditionData.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.group;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.value;
    }

    @NotNull
    public final UpAdditionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "group");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "value");
        return new UpAdditionData(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpAdditionData)) {
            return false;
        }
        UpAdditionData upAdditionData = (UpAdditionData) obj;
        return Intrinsics.areEqual((Object) this.group, (Object) upAdditionData.group) && Intrinsics.areEqual((Object) this.name, (Object) upAdditionData.name) && Intrinsics.areEqual((Object) this.value, (Object) upAdditionData.value);
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.group.hashCode() * 31) + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "UpAdditionData(group=" + this.group + ", name=" + this.name + ", value=" + this.value + ')';
    }
}

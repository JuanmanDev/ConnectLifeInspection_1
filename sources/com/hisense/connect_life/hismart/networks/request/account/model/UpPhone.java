package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpPhone;", "Ljava/io/Serializable;", "number", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "getType", "setType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpPhone.kt */
public final class UpPhone implements Serializable {
    @NotNull
    public String number;
    @NotNull
    public String type;

    public UpPhone(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "number");
        Intrinsics.checkNotNullParameter(str2, "type");
        this.number = str;
        this.type = str2;
    }

    public static /* synthetic */ UpPhone copy$default(UpPhone upPhone, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upPhone.number;
        }
        if ((i & 2) != 0) {
            str2 = upPhone.type;
        }
        return upPhone.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.number;
    }

    @NotNull
    public final String component2() {
        return this.type;
    }

    @NotNull
    public final UpPhone copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "number");
        Intrinsics.checkNotNullParameter(str2, "type");
        return new UpPhone(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpPhone)) {
            return false;
        }
        UpPhone upPhone = (UpPhone) obj;
        return Intrinsics.areEqual((Object) this.number, (Object) upPhone.number) && Intrinsics.areEqual((Object) this.type, (Object) upPhone.type);
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.number.hashCode() * 31) + this.type.hashCode();
    }

    public final void setNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.number = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "UpPhone(number=" + this.number + ", type=" + this.type + ')';
    }
}

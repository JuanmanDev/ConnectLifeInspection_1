package com.juconnect.connectlife.sql.changes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/changes/InvChangeEntity;", "", "customId", "", "lastChange", "", "(ILjava/lang/String;)V", "getCustomId", "()I", "getLastChange", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "wine_inventory_change")
/* compiled from: InvChangeEntity.kt */
public final class InvChangeEntity {
    @ColumnInfo(name = "custom_id")
    @PrimaryKey(autoGenerate = false)
    public final int customId;
    @ColumnInfo(name = "last_change")
    @NotNull
    public final String lastChange;

    public InvChangeEntity(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastChange");
        this.customId = i;
        this.lastChange = str;
    }

    public static /* synthetic */ InvChangeEntity copy$default(InvChangeEntity invChangeEntity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = invChangeEntity.customId;
        }
        if ((i2 & 2) != 0) {
            str = invChangeEntity.lastChange;
        }
        return invChangeEntity.copy(i, str);
    }

    public final int component1() {
        return this.customId;
    }

    @NotNull
    public final String component2() {
        return this.lastChange;
    }

    @NotNull
    public final InvChangeEntity copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastChange");
        return new InvChangeEntity(i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvChangeEntity)) {
            return false;
        }
        InvChangeEntity invChangeEntity = (InvChangeEntity) obj;
        return this.customId == invChangeEntity.customId && Intrinsics.areEqual((Object) this.lastChange, (Object) invChangeEntity.lastChange);
    }

    public final int getCustomId() {
        return this.customId;
    }

    @NotNull
    public final String getLastChange() {
        return this.lastChange;
    }

    public int hashCode() {
        return (Integer.hashCode(this.customId) * 31) + this.lastChange.hashCode();
    }

    @NotNull
    public String toString() {
        return "InvChangeEntity(customId=" + this.customId + ", lastChange=" + this.lastChange + ')';
    }
}

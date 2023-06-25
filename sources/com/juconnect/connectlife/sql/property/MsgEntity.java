package com.juconnect.connectlife.sql.property;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/MsgEntity;", "", "data", "", "auid", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "getData", "setData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "msgswitch")
/* compiled from: MsgEntity.kt */
public final class MsgEntity {
    @ColumnInfo(name = "auid")
    @NotNull
    @PrimaryKey(autoGenerate = false)
    public String auid;
    @ColumnInfo(name = "data")
    @Nullable
    public String data;

    public MsgEntity(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        this.data = str;
        this.auid = str2;
    }

    public static /* synthetic */ MsgEntity copy$default(MsgEntity msgEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = msgEntity.data;
        }
        if ((i & 2) != 0) {
            str2 = msgEntity.auid;
        }
        return msgEntity.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.data;
    }

    @NotNull
    public final String component2() {
        return this.auid;
    }

    @NotNull
    public final MsgEntity copy(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        return new MsgEntity(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgEntity)) {
            return false;
        }
        MsgEntity msgEntity = (MsgEntity) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) msgEntity.data) && Intrinsics.areEqual((Object) this.auid, (Object) msgEntity.auid);
    }

    @NotNull
    public final String getAuid() {
        return this.auid;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.auid.hashCode();
    }

    public final void setAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auid = str;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    @NotNull
    public String toString() {
        return "MsgEntity(data=" + this.data + ", auid=" + this.auid + ')';
    }
}

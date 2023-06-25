package com.juconnect.connectlife.sql.property;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH'¨\u0006\f"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/MsgDao;", "", "deleteAll", "", "deleteById", "auid", "", "getMsg", "Lcom/juconnect/connectlife/sql/property/MsgEntity;", "insert", "msgEntity", "update", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MsgDao.kt */
public interface MsgDao {
    @Query("DELETE FROM  msgswitch")
    void deleteAll();

    @Query("DELETE  FROM  msgswitch where auid = :auid")
    void deleteById(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM msgswitch a where a.auid = :auid")
    MsgEntity getMsg(@NotNull String str);

    @Insert(onConflict = 1)
    void insert(@NotNull MsgEntity msgEntity);

    @Update
    void update(@NotNull MsgEntity msgEntity);
}

package com.juconnect.connectlife.sql.changes;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\f"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/changes/InvChangeDao;", "", "deleteInvChange", "", "invChangeEntity", "Lcom/juconnect/connectlife/sql/changes/InvChangeEntity;", "customId", "", "insertInvChange", "queryInvChange", "", "updateInvChange", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InvChangeDao.kt */
public interface InvChangeDao {
    @Query("DELETE FROM wine_inventory_change WHERE custom_id=:customId")
    void deleteInvChange(int i);

    @Delete
    void deleteInvChange(@NotNull InvChangeEntity invChangeEntity);

    @Insert(onConflict = 1)
    void insertInvChange(@NotNull InvChangeEntity invChangeEntity);

    @NotNull
    @Query("SELECT * FROM wine_inventory_change where custom_id=:customId ")
    List<InvChangeEntity> queryInvChange(int i);

    @Update
    void updateInvChange(@NotNull InvChangeEntity invChangeEntity);
}

package com.juconnect.connectlife.sql.inventory;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.juconnect.connectlife.model.TicketBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\rH'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\bH'J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\bH'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0017H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0013H'J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H'J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\rH'J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH'¨\u0006 "}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/inventory/WineInventoryDao;", "", "deleteAll", "", "deleteTicketModel", "deleteWineInventories", "", "wineInventories", "", "Lcom/juconnect/connectlife/sql/inventory/WineInventoryEntity;", "deleteWineInventory", "wineInventory", "insertTickModel", "Lcom/juconnect/connectlife/model/TicketBean;", "insertTickModelList", "insertWineInventories", "insertWineInventory", "loadAllByAuid", "auid", "", "loadAllTicketModel", "loadAllVivinoId", "vivinoId", "", "loadAllWineInventories", "loadAllWineInventory", "idInventory", "updateDateRemovedByIdInv", "dateRemoved", "updateTicketModel", "updateWineInventories", "updateWineInventory", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryDao.kt */
public interface WineInventoryDao {
    @Query("DELETE FROM wine_inventory")
    void deleteAll();

    @Query("DELETE FROM ticket_bean")
    void deleteTicketModel();

    @Delete
    int deleteWineInventories(@NotNull List<WineInventoryEntity> list);

    @Delete
    int deleteWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);

    @Insert(onConflict = 1)
    void insertTickModel(@NotNull TicketBean ticketBean);

    @Insert(onConflict = 1)
    void insertTickModelList(@NotNull List<TicketBean> list);

    @Insert(onConflict = 1)
    void insertWineInventories(@NotNull List<WineInventoryEntity> list);

    @Insert(onConflict = 1)
    void insertWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);

    @NotNull
    @Query("SELECT * FROM wine_inventory WHERE auid = :auid")
    List<WineInventoryEntity> loadAllByAuid(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM ticket_bean")
    List<TicketBean> loadAllTicketModel();

    @NotNull
    @Query("SELECT * FROM wine_inventory WHERE vivino_id = :vivinoId")
    List<WineInventoryEntity> loadAllVivinoId(long j);

    @NotNull
    @Query("SELECT * FROM wine_inventory")
    List<WineInventoryEntity> loadAllWineInventories();

    @Nullable
    @Query("SELECT * FROM wine_inventory WHERE id_inventory = :idInventory")
    WineInventoryEntity loadAllWineInventory(@NotNull String str);

    @Query("UPDATE wine_inventory SET date_removed = :dateRemoved  WHERE id_inventory = :idInventory")
    void updateDateRemovedByIdInv(@NotNull String str, @NotNull String str2);

    @Update
    void updateTicketModel(@NotNull TicketBean ticketBean);

    @Update
    int updateWineInventories(@NotNull List<WineInventoryEntity> list);

    @Update
    int updateWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);
}

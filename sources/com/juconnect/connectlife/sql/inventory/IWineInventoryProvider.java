package com.juconnect.connectlife.sql.inventory;

import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\bH&J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0015H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\bH&J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/inventory/IWineInventoryProvider;", "", "deleteAll", "", "deleteTicketBean", "deleteWineInventories", "", "wineInventories", "", "Lcom/juconnect/connectlife/sql/inventory/WineInventoryEntity;", "deleteWineInventory", "wineInventory", "insertTicketBean", "ticketBean", "Lcom/juconnect/connectlife/model/TicketBean;", "insertTicketBeanList", "insertWineInventories", "insertWineInventory", "loadAllByAuid", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "auid", "", "loadAllTicketBean", "loadAllVivinoId", "idInventory", "", "loadAllWineInventories", "loadAllWineInventory", "updateDateRemovedByIdInv", "dateRemoved", "updateTicketBean", "updateWineInventories", "updateWineInventory", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IWineInventoryProvider.kt */
public interface IWineInventoryProvider {
    void deleteAll();

    void deleteTicketBean();

    int deleteWineInventories(@NotNull List<WineInventoryEntity> list);

    int deleteWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);

    void insertTicketBean(@NotNull TicketBean ticketBean);

    void insertTicketBeanList(@NotNull List<TicketBean> list);

    void insertWineInventories(@NotNull List<WineInventoryEntity> list);

    void insertWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);

    @NotNull
    List<WineInventoryBean> loadAllByAuid(@NotNull String str);

    @NotNull
    List<TicketBean> loadAllTicketBean();

    @NotNull
    List<WineInventoryBean> loadAllVivinoId(long j);

    @NotNull
    List<WineInventoryBean> loadAllWineInventories();

    @Nullable
    WineInventoryBean loadAllWineInventory(@NotNull String str);

    void updateDateRemovedByIdInv(@NotNull String str, @NotNull String str2);

    void updateTicketBean(@NotNull TicketBean ticketBean);

    int updateWineInventories(@NotNull List<WineInventoryBean> list);

    int updateWineInventory(@NotNull WineInventoryEntity wineInventoryEntity);
}

package com.juconnect.connectlife.sql.inventory;

import android.text.TextUtils;
import com.hisense.connect_life.core.global.KeyConst;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\tH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\tH\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006#"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/inventory/WineInventoryProvider;", "Lcom/juconnect/connectlife/sql/inventory/IWineInventoryProvider;", "()V", "deleteAll", "", "deleteTicketBean", "deleteWineInventories", "", "wineInventories", "", "Lcom/juconnect/connectlife/sql/inventory/WineInventoryEntity;", "deleteWineInventory", "wineInventory", "insertTicketBean", "ticketBean", "Lcom/juconnect/connectlife/model/TicketBean;", "insertTicketBeanList", "insertWineInventories", "insertWineInventory", "loadAllByAuid", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "auid", "", "loadAllTicketBean", "loadAllVivinoId", "vivinoId", "", "loadAllWineInventories", "loadAllWineInventory", "idInventory", "updateDateRemovedByIdInv", "dateRemoved", "updateTicketBean", "updateWineInventories", "updateWineInventory", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryProvider.kt */
public final class WineInventoryProvider implements IWineInventoryProvider {
    public void deleteAll() {
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().deleteAll();
    }

    public void deleteTicketBean() {
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().deleteTicketModel();
    }

    public int deleteWineInventories(@NotNull List<WineInventoryEntity> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        return ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().deleteWineInventories(list);
    }

    public int deleteWineInventory(@NotNull WineInventoryEntity wineInventoryEntity) {
        Intrinsics.checkNotNullParameter(wineInventoryEntity, "wineInventory");
        return ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().deleteWineInventory(wineInventoryEntity);
    }

    public void insertTicketBean(@NotNull TicketBean ticketBean) {
        Intrinsics.checkNotNullParameter(ticketBean, "ticketBean");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().insertTickModel(ticketBean);
    }

    public void insertTicketBeanList(@NotNull List<TicketBean> list) {
        Intrinsics.checkNotNullParameter(list, "ticketBean");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().insertTickModelList(list);
    }

    public void insertWineInventories(@NotNull List<WineInventoryEntity> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().insertWineInventories(list);
    }

    public void insertWineInventory(@NotNull WineInventoryEntity wineInventoryEntity) {
        Intrinsics.checkNotNullParameter(wineInventoryEntity, "wineInventory");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().insertWineInventory(wineInventoryEntity);
    }

    @NotNull
    public List<WineInventoryBean> loadAllByAuid(@NotNull String str) {
        List<WineInventoryEntity> list;
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        if (TextUtils.isEmpty(str)) {
            list = ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllWineInventories();
        } else {
            list = ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllByAuid(str);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (WineInventoryEntity wineInventoryBean : list) {
            arrayList.add(WineInventoryEntity.Companion.toWineInventoryBean(wineInventoryBean));
        }
        return arrayList;
    }

    @NotNull
    public List<TicketBean> loadAllTicketBean() {
        return ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllTicketModel();
    }

    @NotNull
    public List<WineInventoryBean> loadAllVivinoId(long j) {
        List<WineInventoryEntity> loadAllVivinoId = ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllVivinoId(j);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(loadAllVivinoId, 10));
        for (WineInventoryEntity wineInventoryBean : loadAllVivinoId) {
            arrayList.add(WineInventoryEntity.Companion.toWineInventoryBean(wineInventoryBean));
        }
        return arrayList;
    }

    @NotNull
    public List<WineInventoryBean> loadAllWineInventories() {
        List<WineInventoryEntity> loadAllWineInventories = ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllWineInventories();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(loadAllWineInventories, 10));
        for (WineInventoryEntity wineInventoryBean : loadAllWineInventories) {
            arrayList.add(WineInventoryEntity.Companion.toWineInventoryBean(wineInventoryBean));
        }
        return arrayList;
    }

    @Nullable
    public WineInventoryBean loadAllWineInventory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "idInventory");
        WineInventoryEntity loadAllWineInventory = ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().loadAllWineInventory(str);
        if (loadAllWineInventory == null) {
            return null;
        }
        return WineInventoryEntity.Companion.toWineInventoryBean(loadAllWineInventory);
    }

    public void updateDateRemovedByIdInv(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "dateRemoved");
        Intrinsics.checkNotNullParameter(str2, "idInventory");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().updateDateRemovedByIdInv(str, str2);
    }

    public void updateTicketBean(@NotNull TicketBean ticketBean) {
        Intrinsics.checkNotNullParameter(ticketBean, "ticketBean");
        ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().updateTicketModel(ticketBean);
    }

    public int updateWineInventories(@NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(list, "wineInventories");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (WineInventoryBean fromWineInventoryBean : list) {
            arrayList.add(WineInventoryEntity.Companion.fromWineInventoryBean(fromWineInventoryBean));
        }
        return ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().updateWineInventories(arrayList);
    }

    public int updateWineInventory(@NotNull WineInventoryEntity wineInventoryEntity) {
        Intrinsics.checkNotNullParameter(wineInventoryEntity, "wineInventory");
        return ConnectLifeRoom.Companion.wineInventoryDao$connectlife_release().updateWineInventory(wineInventoryEntity);
    }
}

package com.hisense.connect_life.hismart.networks.request.wine.inventory.manager;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult;
import com.hisense.connect_life.hismart.networks.request.model.DeviceListModel;
import com.hisense.connect_life.hismart.networks.request.model.InventoryDetailModel;
import com.hisense.connect_life.hismart.networks.request.model.WinePositionModel;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWine;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.TicketModel;
import com.juconnect.connectlife.model.TicketRequestBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&J:\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JI\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&J>\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&J0\u0010\u001a\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JI\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00192#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JQ\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010#¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JW\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020\u00192#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010#¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JR\u0010&\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\"\u001a\u00020\u00192\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0\u00072\u0014\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\n0\u0007H&J>\u0010,\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00182\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&JY\u0010/\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H&¨\u00063"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryService;", "", "addTicket", "Lio/reactivex/disposables/Disposable;", "ticketBean", "Lcom/juconnect/connectlife/model/TicketRequestBean;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "", "failure", "", "addWindInWentory", "addWinemodel", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWine;", "cleanUpApplication", "deviceId", "", "", "Lkotlin/ParameterName;", "name", "deleteWindInWentory", "deleteList", "", "", "getTickeList", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/TicketModel;", "getWindInventoryDetails", "inventoryId", "Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;", "inventoryDetails", "getWineListByCategoryId", "categoryId", "lastUpdateTime", "Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;", "getWineListByCategoryIdList", "categoryIdList", "queryByDevList", "deviceList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "Lcom/hisense/connect_life/hismart/networks/request/HiWineCabinetResult;", "error", "upDateWindInventory", "updateList", "Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "vivinoInvoke", "systemtype", "", "status", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryService.kt */
public interface WineInventoryService {
    @NotNull
    C9207b addTicket(@NotNull TicketRequestBean ticketRequestBean, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b addWindInWentory(@NotNull AddWine addWine, @NotNull Function1<? super HiResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b cleanUpApplication(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b deleteWindInWentory(@NotNull List<Long> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getTickeList(@NotNull Function1<? super TicketModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getWindInventoryDetails(long j, @NotNull Function1<? super InventoryDetailModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getWineListByCategoryId(long j, long j2, @NotNull Function1<? super DeviceListModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getWineListByCategoryIdList(@NotNull List<Long> list, long j, @NotNull Function1<? super DeviceListModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryByDevList(@NotNull List<String> list, @Nullable FilterCondition filterCondition, long j, @NotNull Function1<? super HiWineCabinetResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b upDateWindInventory(@NotNull List<WinePositionModel> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b vivinoInvoke(@NotNull String str, int i, int i2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}

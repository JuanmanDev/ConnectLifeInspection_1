package com.hisense.connect_life.hismart.networks.request.wine.inventory.manager;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult;
import com.hisense.connect_life.hismart.networks.request.model.ResponseByCateGoryIdModel;
import com.hisense.connect_life.hismart.networks.request.model.ResponseInventoryDetailsModel;
import com.hisense.connect_life.hismart.networks.request.wine.model.TicketModel;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9960p;
import p692o.p698x.C9961q;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0019\b\u0001\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\tH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J*\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J*\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J*\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryApi;", "", "addNewWindInVentory", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "fileBody", "Lokhttp3/MultipartBody$Part;", "requestBodyMap", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "addQueryTicket", "requestBody", "cleanUpApplication", "deleteWindInVentory", "getByCategoryId", "Lcom/hisense/connect_life/hismart/networks/request/model/ResponseByCateGoryIdModel;", "params", "getByCategoryIdList", "getQueryTicket", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/TicketModel;", "getWineDetails", "Lcom/hisense/connect_life/hismart/networks/request/model/ResponseInventoryDetailsModel;", "queryWineInventory", "Lcom/hisense/connect_life/hismart/networks/request/HiWineCabinetResult;", "updateWineInventory", "vivinoInvoke", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryApi.kt */
public interface WineInventoryApi {
    @C9958n("wim/wine-user/inventory/save")
    @C9955k
    @NotNull
    C9185c<HiResult<HiResponse>> addNewWindInVentory(@C9960p @Nullable MultipartBody.Part part, @NotNull @C9961q Map<String, RequestBody> map);

    @NotNull
    @C9958n("clife-svc/add_service_ticket")
    C9185c<HiResult<HiResponse>> addQueryTicket(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("wim/wine-user/inventory/cleanUpApplication")
    C9185c<HiResult<HiResponse>> cleanUpApplication(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("wim/wine-user/inventory/batchDelete")
    C9185c<HiResult<HiResponse>> deleteWindInVentory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("wim/wine-user/inventory/queryByCategoryId")
    C9185c<HiResult<ResponseByCateGoryIdModel>> getByCategoryId(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("wim/wine-user/inventory/queryByCategoryIdList")
    C9185c<HiResult<ResponseByCateGoryIdModel>> getByCategoryIdList(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("clife-svc/query_service_ticket")
    C9185c<HiResult<TicketModel>> getQueryTicket(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("wim/wine-user/inventory/get")
    C9185c<HiResult<ResponseInventoryDetailsModel>> getWineDetails(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("wim/wine-user/inventory/queryByDevList")
    C9185c<HiResult<HiWineCabinetResult>> queryWineInventory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("wim/wine-user/inventory/batchUpdate")
    C9185c<HiResult<HiResponse>> updateWineInventory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("wim/wine-user/category/vivinoInvoke")
    C9185c<HiResult<HiResponse>> vivinoInvoke(@NotNull @C9945a RequestBody requestBody);
}

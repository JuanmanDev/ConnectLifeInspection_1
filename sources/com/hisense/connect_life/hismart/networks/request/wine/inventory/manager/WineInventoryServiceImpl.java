package com.hisense.connect_life.hismart.networks.request.wine.inventory.manager;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult;
import com.hisense.connect_life.hismart.networks.request.model.DeviceListModel;
import com.hisense.connect_life.hismart.networks.request.model.InventoryDetailModel;
import com.hisense.connect_life.hismart.networks.request.model.ResponseByCateGoryIdModel;
import com.hisense.connect_life.hismart.networks.request.model.ResponseInventoryDetailsModel;
import com.hisense.connect_life.hismart.networks.request.model.WinePositionModel;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWine;
import com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.TicketModel;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.juconnect.connectlife.model.ClaimError;
import com.juconnect.connectlife.model.TicketRequestBean;
import java.io.File;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7432a;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7433b;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7434c;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7435d;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7436e;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7437f;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7438g;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7439h;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7440i;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7441j;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7442k;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7443l;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7444m;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7445n;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7446o;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7447p;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7448q;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7449r;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7450s;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7451t;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7452u;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.p452s.p453a.C7453v;
import p040c.p429r.p430a.p439c.p459d.C7480a;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J:\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016JI\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J>\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J0\u0010\u001e\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J:\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001d2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016JQ\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016JW\u0010(\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010%\u001a\u00020\u001d2#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016JR\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010%\u001a\u00020\u001d2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0\u000b2\u0014\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J>\u00100\u001a\u00020\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016JY\u00103\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryService;", "()V", "wineInventoryApi", "Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryApi;", "kotlin.jvm.PlatformType", "addTicket", "Lio/reactivex/disposables/Disposable;", "ticketBean", "Lcom/juconnect/connectlife/model/TicketRequestBean;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "", "failure", "", "addWindInWentory", "addWinemodel", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWine;", "cleanUpApplication", "deviceId", "", "", "Lkotlin/ParameterName;", "name", "deleteWindInWentory", "deleteList", "", "", "getTickeList", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/TicketModel;", "getWindInventoryDetails", "inventoryId", "Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;", "getWineListByCategoryId", "categoryId", "lastUpdateTime", "Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;", "inventoryDetails", "getWineListByCategoryIdList", "categoryIdList", "queryByDevList", "deviceList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "Lcom/hisense/connect_life/hismart/networks/request/HiWineCabinetResult;", "error", "upDateWindInventory", "updateList", "Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "vivinoInvoke", "systemtype", "", "status", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryServiceImpl.kt */
public final class WineInventoryServiceImpl implements WineInventoryService {
    public final WineInventoryApi wineInventoryApi = ((WineInventoryApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.WINE_MANAGER)).mo51323b(WineInventoryApi.class));

    /* renamed from: addTicket$lambda-18  reason: not valid java name */
    public static final void m27070addTicket$lambda18(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullExpressionValue(hiResult, LanguageConstKt.f15954it);
        function1.invoke(hiResult);
    }

    /* renamed from: addTicket$lambda-19  reason: not valid java name */
    public static final void m27071addTicket$lambda19(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: addWindInWentory$lambda-4  reason: not valid java name */
    public static final void m27072addWindInWentory$lambda4(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult == null ? null : (HiResponse) hiResult.getResponse());
    }

    /* renamed from: addWindInWentory$lambda-5  reason: not valid java name */
    public static final void m27073addWindInWentory$lambda5(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateFile fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: cleanUpApplication$lambda-22  reason: not valid java name */
    public static final void m27074cleanUpApplication$lambda22(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(Boolean.valueOf(((HiResponse) hiResult.getResponse()).getResultCode() == 0));
    }

    /* renamed from: cleanUpApplication$lambda-23  reason: not valid java name */
    public static final void m27075cleanUpApplication$lambda23(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: deleteWindInWentory$lambda-6  reason: not valid java name */
    public static final void m27076deleteWindInWentory$lambda6(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: deleteWindInWentory$lambda-7  reason: not valid java name */
    public static final void m27077deleteWindInWentory$lambda7(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getTickeList$lambda-16  reason: not valid java name */
    public static final void m27078getTickeList$lambda16(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        if (((TicketModel) hiResult.getResponse()).getResultCode() == 0) {
            function1.invoke(hiResult.getResponse());
        }
    }

    /* renamed from: getTickeList$lambda-17  reason: not valid java name */
    public static final void m27079getTickeList$lambda17(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getWindInventoryDetails$lambda-10  reason: not valid java name */
    public static final void m27080getWindInventoryDetails$lambda10(Function1 function1, HiResult hiResult) {
        ResponseInventoryDetailsModel responseInventoryDetailsModel;
        Intrinsics.checkNotNullParameter(function1, "$success");
        InventoryDetailModel inventoryDetailModel = null;
        if (!(hiResult == null || (responseInventoryDetailsModel = (ResponseInventoryDetailsModel) hiResult.getResponse()) == null)) {
            inventoryDetailModel = responseInventoryDetailsModel.getInventoryDetail();
        }
        function1.invoke(inventoryDetailModel);
    }

    /* renamed from: getWindInventoryDetails$lambda-11  reason: not valid java name */
    public static final void m27081getWindInventoryDetails$lambda11(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateFile fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getWineListByCategoryId$lambda-12  reason: not valid java name */
    public static final void m27082getWineListByCategoryId$lambda12(Function1 function1, HiResult hiResult) {
        ResponseByCateGoryIdModel responseByCateGoryIdModel;
        Intrinsics.checkNotNullParameter(function1, "$success");
        DeviceListModel deviceListModel = null;
        if (!(hiResult == null || (responseByCateGoryIdModel = (ResponseByCateGoryIdModel) hiResult.getResponse()) == null)) {
            deviceListModel = responseByCateGoryIdModel.getDeviceList();
        }
        function1.invoke(deviceListModel);
    }

    /* renamed from: getWineListByCategoryId$lambda-13  reason: not valid java name */
    public static final void m27083getWineListByCategoryId$lambda13(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateFile fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getWineListByCategoryIdList$lambda-14  reason: not valid java name */
    public static final void m27084getWineListByCategoryIdList$lambda14(Function1 function1, HiResult hiResult) {
        ResponseByCateGoryIdModel responseByCateGoryIdModel;
        Intrinsics.checkNotNullParameter(function1, "$success");
        DeviceListModel deviceListModel = null;
        if (!(hiResult == null || (responseByCateGoryIdModel = (ResponseByCateGoryIdModel) hiResult.getResponse()) == null)) {
            deviceListModel = responseByCateGoryIdModel.getDeviceList();
        }
        function1.invoke(deviceListModel);
    }

    /* renamed from: getWineListByCategoryIdList$lambda-15  reason: not valid java name */
    public static final void m27085getWineListByCategoryIdList$lambda15(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateFile fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: queryByDevList$lambda-0  reason: not valid java name */
    public static final void m27086queryByDevList$lambda0(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        List<DeviceZone> deviceIdList = ((HiWineCabinetResult) hiResult.getResponse()).getDeviceIdList();
        if (deviceIdList == null || deviceIdList.isEmpty()) {
        }
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: queryByDevList$lambda-1  reason: not valid java name */
    public static final void m27087queryByDevList$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: upDateWindInventory$lambda-8  reason: not valid java name */
    public static final void m27088upDateWindInventory$lambda8(Function1 function1, HiResult hiResult) {
        HiResponse hiResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(hiResult == null || (hiResponse = (HiResponse) hiResult.getResponse()) == null || hiResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: upDateWindInventory$lambda-9  reason: not valid java name */
    public static final void m27089upDateWindInventory$lambda9(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateFile fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: vivinoInvoke$lambda-20  reason: not valid java name */
    public static final void m27090vivinoInvoke$lambda20(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(Boolean.valueOf(((HiResponse) hiResult.getResponse()).getResultCode() == 0));
    }

    /* renamed from: vivinoInvoke$lambda-21  reason: not valid java name */
    public static final void m27091vivinoInvoke$lambda21(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b addTicket(@NotNull TicketRequestBean ticketRequestBean, @NotNull Function1<? super HiResult<HiResponse>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(ticketRequestBean, "ticketBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        String json = new Gson().toJson((Object) ticketRequestBean.getError(), (Type) ClaimError.class);
        C9207b s = this.wineInventoryApi.addQueryTicket(ParameterUtils.Companion.createParamBodySpec(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(KeyConst.KEY_AUIT, ticketRequestBean.getAuid()), TuplesKt.m25743to("purchaseDate", ticketRequestBean.getPurchase_date()), TuplesKt.m25743to("dateOfClaim", ticketRequestBean.getDateOfClaim())), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("error", new JSONObject(json))), MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7444m(function1), new C7449r(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.addQuer…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b addWindInWentory(@NotNull AddWine addWine, @NotNull Function1<? super HiResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(addWine, "addWinemodel");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        File photo = addWine.getPhoto();
        MultipartBody.Part part = null;
        addWine.setPhoto((File) null);
        if (photo != null) {
            part = MultipartBody.Part.Companion.createFormData("photoFile", photo.getName(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), photo));
        }
        Map<String, String> a = C7480a.m21439a(new JSONObject(new Gson().toJson((Object) addWine, (Type) AddWine.class)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ParameterUtils.Companion companion = ParameterUtils.Companion;
        Intrinsics.checkNotNullExpressionValue(a, "mapValue");
        for (Map.Entry next : companion.createParamMap(a).entrySet()) {
            linkedHashMap.put(next.getKey(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), (String) next.getValue()));
        }
        C9207b s = this.wineInventoryApi.addNewWindInVentory(part, linkedHashMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7432a(function1), new C7437f(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.addNewW…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b cleanUpApplication(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.cleanUpApplication(ParameterUtils.Companion.createParamBody(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("deviceId", str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7451t(function1), new C7446o(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.cleanUp…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b deleteWindInWentory(@NotNull List<Long> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "deleteList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        String json = new Gson().toJson((Object) list);
        C9207b s = this.wineInventoryApi.deleteWindInVentory(ParameterUtils.Companion.createParamBodySpec(MapsKt__MapsKt.emptyMap(), MapsKt__MapsKt.emptyMap(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("inventoryIdList", new JSONArray(json))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7447p(function1), new C7435d(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.deleteW…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getTickeList(@NotNull Function1<? super TicketModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.getQueryTicket(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7450s(function1), new C7438g(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.getQuer…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getWindInventoryDetails(long j, @NotNull Function1<? super InventoryDetailModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.getWineDetails(ParameterUtils.Companion.createParamMap(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("inventoryId", String.valueOf(j))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7433b(function1), new C7440i(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.getWine…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getWineListByCategoryId(long j, long j2, @NotNull Function1<? super DeviceListModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.getByCategoryId(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("categoryId", String.valueOf(j)), TuplesKt.m25743to("lastUpdateTime", String.valueOf(j2))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7452u(function1), new C7443l(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.getByCa…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getWineListByCategoryIdList(@NotNull List<Long> list, long j, @NotNull Function1<? super DeviceListModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "categoryIdList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.getByCategoryIdList(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("categoryIdList", new Gson().toJson((Object) list)), TuplesKt.m25743to("lastUpdateTime", String.valueOf(j))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7445n(function1), new C7453v(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.getByCa…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b queryByDevList(@NotNull List<String> list, @Nullable FilterCondition filterCondition, long j, @NotNull Function1<? super HiWineCabinetResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "deviceList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        Gson gson = new Gson();
        String json = gson.toJson((Object) list);
        Map emptyMap = MapsKt__MapsKt.emptyMap();
        if (filterCondition != null) {
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("filterCondition", new JSONObject(gson.toJson((Object) filterCondition))));
        }
        Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("deviceIdList", new JSONArray(json)));
        C9207b s = this.wineInventoryApi.queryWineInventory(ParameterUtils.Companion.createParamBodySpec(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("lastUpdateTime", String.valueOf(j))), emptyMap, mapOf)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7442k(function1), new C7448q(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryWi… error(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b upDateWindInventory(@NotNull List<WinePositionModel> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "updateList");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        String json = new Gson().toJson((Object) list);
        C9207b s = this.wineInventoryApi.updateWineInventory(ParameterUtils.Companion.createParamBodySpec(MapsKt__MapsKt.emptyMap(), MapsKt__MapsKt.emptyMap(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("inventoryList", new JSONArray(json))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7441j(function1), new C7434c(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.updateW…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b vivinoInvoke(@NotNull String str, int i, int i2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.wineInventoryApi.vivinoInvoke(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", ""), TuplesKt.m25743to("systemtype", String.valueOf(i)), TuplesKt.m25743to(NotificationCompat.CATEGORY_STATUS, String.valueOf(i2))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7439h(function1), new C7436e(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.vivinoI…ailure(it)\n            })");
        return s;
    }
}

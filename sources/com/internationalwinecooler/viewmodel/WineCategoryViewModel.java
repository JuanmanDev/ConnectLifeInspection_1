package com.internationalwinecooler.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavInflater;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryByName;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.SortCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.internationalwinecooler.model.JsResp;
import com.internationalwinecooler.model.WineFilterModel;
import com.internationalwinecooler.model.WineFilterModelKt;
import com.internationalwinecooler.model.WineSortBaseModel;
import com.internationalwinecooler.p529ui.FavoriteModel;
import com.internationalwinecooler.p529ui.WineCabinetListModel;
import com.internationalwinecooler.p529ui.model.UserFilerWineCondition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p525z.p526a.C7820f;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005J\u0006\u00105\u001a\u000202J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u0018H\u0002J\u001e\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00150\u000eJ\u0006\u00109\u001a\u000202J\u001e\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00150\u000eJ\u0006\u0010;\u001a\u000202J&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000e2\b\b\u0002\u0010=\u001a\u00020\u00162\b\b\u0002\u0010>\u001a\u00020\u0005J\u001e\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010A\u001a\u00020BJ\u0018\u0010C\u001a\u0002022\u0006\u0010@\u001a\u00020\u00052\u0006\u0010D\u001a\u00020EH\u0002Ju\u0010F\u001a\u0002022\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00052!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002020L2\u0014\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010R\u0012\u0004\u0012\u0002020L2\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010TH\u0002J\u0012\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010X\u001a\u0002022\u0006\u00107\u001a\u00020\u0018Js\u0010Y\u001a\u0002022\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00052!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002020L2\u0014\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010R\u0012\u0004\u0012\u0002020L2\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010TJ\u0012\u0010Z\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R3\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00150\u000e8FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0011R3\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00170\u00150\u000e8FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001c\u0010\u0011R-\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00150\u000e8FX\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u001f\u0010\u0011R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020,X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006["}, mo47991d2 = {"Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "compositeDisposableMap", "", "", "Lio/reactivex/disposables/CompositeDisposable;", "count", "", "getCount", "()I", "setCount", "(I)V", "getWineListFilterInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/internationalwinecooler/ui/model/UserFilerWineCondition;", "getGetWineListFilterInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getWineListFilterInfoLiveData$delegate", "Lkotlin/Lazy;", "getWineListLiveData", "Lkotlin/Pair;", "", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "getGetWineListLiveData", "getWineListLiveData$delegate", "removeWineSucLiveData", "getRemoveWineSucLiveData", "removeWineSucLiveData$delegate", "updateWineFavoriteLiveData", "getUpdateWineFavoriteLiveData", "updateWineFavoriteLiveData$delegate", "wineCabinetListModel", "Lcom/internationalwinecooler/ui/WineCabinetListModel;", "getWineCabinetListModel", "()Lcom/internationalwinecooler/ui/WineCabinetListModel;", "wineCabinetListModel$delegate", "wineManager", "Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "getWineManager", "()Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "wineManager$delegate", "wineSortBaseModel", "Lcom/internationalwinecooler/model/WineSortBaseModel;", "getWineSortBaseModel", "()Lcom/internationalwinecooler/model/WineSortBaseModel;", "setWineSortBaseModel", "(Lcom/internationalwinecooler/model/WineSortBaseModel;)V", "deleteWineCategory", "", "idCategoryList", "deviceId", "deleteWineWithId", "favoriteFail", "wine", "getAllWineCategories", "getCategoryByName", "getExpiredWineCategories", "getFilterCondition", "getWineCategory", "useLastChange", "sortId", "getWineCategoryWithFilter", "identityPage", "context", "Landroid/content/Context;", "manageDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "queryRemoteWineList", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "sortCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "action", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "Lkotlin/ParameterName;", "name", "result", "failure", "", "loadCache", "Lkotlin/Function0;", "strDateToLong", "", "time", "updateWineFavorite", "updateWineList", "useCacheWithDeviceId", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel extends BaseViewModel {
    @NotNull
    public final Map<String, C9206a> compositeDisposableMap = new LinkedHashMap();
    public int count;
    @NotNull
    public final Lazy getWineListFilterInfoLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$getWineListFilterInfoLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getWineListLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$getWineListLiveData$2.INSTANCE);
    @NotNull
    public final Lazy removeWineSucLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$removeWineSucLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateWineFavoriteLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$updateWineFavoriteLiveData$2.INSTANCE);
    @NotNull
    public final Lazy wineCabinetListModel$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$wineCabinetListModel$2.INSTANCE);
    @NotNull
    public final Lazy wineManager$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryViewModel$wineManager$2.INSTANCE);
    public WineSortBaseModel wineSortBaseModel;

    public static /* synthetic */ void deleteWineCategory$default(WineCategoryViewModel wineCategoryViewModel, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        wineCategoryViewModel.deleteWineCategory(list, str);
    }

    /* access modifiers changed from: private */
    public final void favoriteFail(WineCategoryInfo wineCategoryInfo) {
        try {
            int i = 1;
            wineCategoryInfo.setFavorite(wineCategoryInfo.getFavorite() == 0 ? 1 : 0);
            getUpdateWineFavoriteLiveData().postValue(new Pair(Boolean.FALSE, C1502i.m930j(new JsResp(wineCategoryInfo, 0, (String) null, 6, (DefaultConstructorMarker) null))));
            LoginUserInfoRoom.Companion.wineCategoryProvider().updateWineInventory(wineCategoryInfo);
            WineCabinetListModel wineCabinetListModel = getWineCabinetListModel();
            String valueOf = String.valueOf(wineCategoryInfo.getCategoryId());
            if (wineCategoryInfo.getFavorite() != 0) {
                i = 0;
            }
            wineCabinetListModel.updateWineCabinetRoom(new FavoriteModel(valueOf, i));
        } catch (Exception e) {
            getUpdateWineFavoriteLiveData().postValue(new Pair(Boolean.FALSE, e.toString()));
        }
    }

    private final WineCabinetListModel getWineCabinetListModel() {
        return (WineCabinetListModel) this.wineCabinetListModel$delegate.getValue();
    }

    public static /* synthetic */ MutableLiveData getWineCategory$default(WineCategoryViewModel wineCategoryViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "3";
        }
        return wineCategoryViewModel.getWineCategory(z, str);
    }

    private final void manageDisposable(String str, C9207b bVar) {
        C9206a aVar;
        C7820f.m21850d(Intrinsics.stringPlus("manageDisposable - identityPage: ", str), new Object[0]);
        if (this.compositeDisposableMap.containsKey(str)) {
            C9206a aVar2 = this.compositeDisposableMap.get(str);
            Intrinsics.checkNotNull(aVar2);
            aVar = aVar2;
        } else {
            C9206a aVar3 = new C9206a();
            this.compositeDisposableMap.put(str, aVar3);
            aVar = aVar3;
        }
        aVar.mo47027b(bVar);
    }

    private final void queryRemoteWineList(FilterCondition filterCondition, SortCondition sortCondition, boolean z, String str, Function1<? super QueryCategoryResult, Unit> function1, Function1<? super Throwable, Unit> function12, Function0<Unit> function0) {
        String str2 = "0";
        if (z) {
            str2 = C1524t.m1042f(AppConfig.SP_LAST_CHAGE_).mo15420j(KeyConst.KEY_LAST_CHANGE_INVENTORY, str2);
        }
        Intrinsics.checkNotNullExpressionValue(str2, "lastChange");
        manageDisposable(str, getWineManager().queryCategory(new QueryCategoryCondition(filterCondition, sortCondition, StringsKt__StringNumberConversionsKt.toLongOrNull(str2)), new WineCategoryViewModel$queryRemoteWineList$disposable$1(this, function0, function12, function1), new WineCategoryViewModel$queryRemoteWineList$disposable$2(function12)));
    }

    public static /* synthetic */ void queryRemoteWineList$default(WineCategoryViewModel wineCategoryViewModel, FilterCondition filterCondition, SortCondition sortCondition, boolean z, String str, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        wineCategoryViewModel.queryRemoteWineList(filterCondition, sortCondition, z, str, function1, function12, (i & 64) != 0 ? null : function0);
    }

    private final long strDateToLong(String str) {
        if (TextUtils.isEmpty(str)) {
            return System.currentTimeMillis();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:SS");
        Intrinsics.checkNotNull(str);
        Date parse = simpleDateFormat.parse(str);
        Long valueOf = parse == null ? null : Long.valueOf(parse.getTime());
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }

    public static /* synthetic */ void updateWineList$default(WineCategoryViewModel wineCategoryViewModel, FilterCondition filterCondition, SortCondition sortCondition, boolean z, String str, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        wineCategoryViewModel.updateWineList(filterCondition, sortCondition, z, str, function1, function12, (i & 64) != 0 ? null : function0);
    }

    private final void useCacheWithDeviceId(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineCategoryViewModel$useCacheWithDeviceId$1(str, this, (Continuation<? super WineCategoryViewModel$useCacheWithDeviceId$1>) null), 2, (Object) null);
    }

    public final void deleteWineCategory(@NotNull List<String> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "idCategoryList");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineCategoryViewModel$deleteWineCategory$1(list, this, str, (Continuation<? super WineCategoryViewModel$deleteWineCategory$1>) null), 2, (Object) null);
    }

    public final void deleteWineWithId() {
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> getAllWineCategories() {
        SortCondition sortCondition = new SortCondition("3");
        MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData = new MutableLiveData<>();
        updateWineList$default(this, (FilterCondition) null, sortCondition, false, "getAllWineCategories", new WineCategoryViewModel$getAllWineCategories$1(this, mutableLiveData), new WineCategoryViewModel$getAllWineCategories$2(mutableLiveData), (Function0) null, 64, (Object) null);
        return mutableLiveData;
    }

    public final void getCategoryByName() {
        getWineManager().getCategoryByName(new QueryCategoryByName("name", 0, (String) null, (SortCondition) null, 12, (DefaultConstructorMarker) null), WineCategoryViewModel$getCategoryByName$1.INSTANCE, WineCategoryViewModel$getCategoryByName$2.INSTANCE);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> getExpiredWineCategories() {
        SortCondition sortCondition = new SortCondition("3");
        MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData = new MutableLiveData<>();
        long currentTimeMillis = System.currentTimeMillis();
        FilterCondition filterCondition = new FilterCondition((List) null, (List) null, (List) null, (List) null, (Integer) null, (Integer) null, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis), (Integer) null, (String) null, (Integer) null, Long.valueOf(currentTimeMillis), (Integer) null, 5951, (DefaultConstructorMarker) null);
        updateWineList(filterCondition, sortCondition, false, "getAllWineCategories", new WineCategoryViewModel$getExpiredWineCategories$1(mutableLiveData), new WineCategoryViewModel$getExpiredWineCategories$2(mutableLiveData), new WineCategoryViewModel$getExpiredWineCategories$3(mutableLiveData));
        return mutableLiveData;
    }

    public final void getFilterCondition() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        getWineManager().getFilterCondition(new WineCategoryViewModel$getFilterCondition$1(arrayList, arrayList2, arrayList3, arrayList4, this), new WineCategoryViewModel$getFilterCondition$2(this, arrayList, arrayList2, arrayList3, arrayList4));
    }

    @NotNull
    public final MutableLiveData<UserFilerWineCondition> getGetWineListFilterInfoLiveData() {
        return (MutableLiveData) this.getWineListFilterInfoLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> getGetWineListLiveData() {
        return (MutableLiveData) this.getWineListLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<String>>> getRemoveWineSucLiveData() {
        return (MutableLiveData) this.removeWineSucLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getUpdateWineFavoriteLiveData() {
        return (MutableLiveData) this.updateWineFavoriteLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<WineCategoryInfo>> getWineCategory(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_SORTID);
        SortCondition sortCondition = new SortCondition(str);
        MutableLiveData<List<WineCategoryInfo>> mutableLiveData = new MutableLiveData<>();
        updateWineList((FilterCondition) null, sortCondition, z, "updateWineCategory", new WineCategoryViewModel$getWineCategory$1(this, mutableLiveData), new WineCategoryViewModel$getWineCategory$2(this, mutableLiveData), new WineCategoryViewModel$getWineCategory$3(this, mutableLiveData));
        return mutableLiveData;
    }

    public final void getWineCategoryWithFilter(@NotNull String str, @NotNull WineSortBaseModel wineSortBaseModel2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(wineSortBaseModel2, "wineSortBaseModel");
        Intrinsics.checkNotNullParameter(context, "context");
        WineFilterModel filterModel = wineSortBaseModel2.getFilterModel();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = WineFilterModelKt.toFilterCondition(filterModel, context);
        try {
            updateWineList((FilterCondition) objectRef.element, new SortCondition(wineSortBaseModel2.getSort()), false, str, new WineCategoryViewModel$getWineCategoryWithFilter$1(objectRef, this), new WineCategoryViewModel$getWineCategoryWithFilter$2(this), WineCategoryViewModel$getWineCategoryWithFilter$3.INSTANCE);
        } catch (JSONException unused) {
            LoggerUtil.Companion.mo39146e("updateWineList== 》》加载酒异常 ");
            getGetWineListLiveData().postValue(new Pair(Boolean.FALSE, CollectionsKt__CollectionsKt.emptyList()));
        }
    }

    @NotNull
    public final IWineCategoryManager getWineManager() {
        return (IWineCategoryManager) this.wineManager$delegate.getValue();
    }

    @NotNull
    public final WineSortBaseModel getWineSortBaseModel() {
        WineSortBaseModel wineSortBaseModel2 = this.wineSortBaseModel;
        if (wineSortBaseModel2 != null) {
            return wineSortBaseModel2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineSortBaseModel");
        return null;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setWineSortBaseModel(@NotNull WineSortBaseModel wineSortBaseModel2) {
        Intrinsics.checkNotNullParameter(wineSortBaseModel2, "<set-?>");
        this.wineSortBaseModel = wineSortBaseModel2;
    }

    public final void updateWineFavorite(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wine");
        getUpdateWineFavoriteLiveData().postValue(new Pair(Boolean.TRUE, "success"));
        getWineCabinetListModel().updateWineCabinetRoom(new FavoriteModel(String.valueOf(wineCategoryInfo.getCategoryId()), wineCategoryInfo.getFavorite()));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineCategoryViewModel$updateWineFavorite$1(wineCategoryInfo, (Continuation<? super WineCategoryViewModel$updateWineFavorite$1>) null), 2, (Object) null);
        getWineManager().favoriteWineCategory(String.valueOf(wineCategoryInfo.getCategoryId()), String.valueOf(wineCategoryInfo.getFavorite()), new WineCategoryViewModel$updateWineFavorite$2(this, wineCategoryInfo), new WineCategoryViewModel$updateWineFavorite$3(this, wineCategoryInfo));
    }

    public final void updateWineList(@Nullable FilterCondition filterCondition, @NotNull SortCondition sortCondition, boolean z, @NotNull String str, @NotNull Function1<? super QueryCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(sortCondition, "sortCondition");
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(function1, NavInflater.TAG_ACTION);
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        if (function0 != null) {
            function0.invoke();
        }
        queryRemoteWineList(filterCondition, sortCondition, z, str, function1, function12, function0);
    }
}

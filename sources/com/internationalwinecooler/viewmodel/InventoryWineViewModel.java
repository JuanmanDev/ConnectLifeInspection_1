package com.internationalwinecooler.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavInflater;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.juconnect.connectlife.ConnectLife;
import com.juconnect.connectlife.model.WineInventoryBean;
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
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p525z.p526a.C7820f;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0002JB\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0+2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0014\u0010-\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0014\u0010/\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000\u0010J\u0012\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0016JL\u00105\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0+2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010)2\b\b\u0002\u0010,\u001a\u00020\u001eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fRE\u0010\r\u001a,\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f0\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u00100\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000e8FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012R-\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050\u001d0\u000e8FX\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001f\u0010\u0012¨\u00067"}, mo47991d2 = {"Lcom/internationalwinecooler/viewmodel/InventoryWineViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "compositeDisposableMap", "", "", "Lio/reactivex/disposables/CompositeDisposable;", "count", "", "getCount", "()I", "setCount", "(I)V", "getWineListFilterInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "getGetWineListFilterInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getWineListFilterInfoLiveData$delegate", "Lkotlin/Lazy;", "getWineListLiveData", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "getGetWineListLiveData", "getWineListLiveData$delegate", "removeWineSucLiveData", "getRemoveWineSucLiveData", "removeWineSucLiveData$delegate", "updateWineFavoriteLiveData", "Lkotlin/Pair;", "", "getUpdateWineFavoriteLiveData", "updateWineFavoriteLiveData$delegate", "manageDisposable", "", "identityPage", "disposable", "Lio/reactivex/disposables/Disposable;", "queryRemoteWineList", "lastChange", "action", "Lkotlin/Function0;", "failure", "Lkotlin/Function1;", "returnRemoved", "removeMulWineWithIdArrayExe", "idInventoriesList", "removeWineArrayNew", "", "strDateToLong", "time", "updateWineFavorite", "wine", "updateWineList", "loadCache", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel extends BaseViewModel {
    @NotNull
    public final Map<String, C9206a> compositeDisposableMap = new LinkedHashMap();
    public int count;
    @NotNull
    public final Lazy getWineListFilterInfoLiveData$delegate = LazyKt__LazyJVMKt.lazy(InventoryWineViewModel$getWineListFilterInfoLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getWineListLiveData$delegate = LazyKt__LazyJVMKt.lazy(InventoryWineViewModel$getWineListLiveData$2.INSTANCE);
    @NotNull
    public final Lazy removeWineSucLiveData$delegate = LazyKt__LazyJVMKt.lazy(InventoryWineViewModel$removeWineSucLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateWineFavoriteLiveData$delegate = LazyKt__LazyJVMKt.lazy(InventoryWineViewModel$updateWineFavoriteLiveData$2.INSTANCE);

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

    /* access modifiers changed from: private */
    public final void queryRemoteWineList(String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z) {
        manageDisposable(str, ConnectLife.Companion.connectLifeService().queryWines(AppConfig.Companion.getAccessToken(), new InventoryWineViewModel$queryRemoteWineList$disposable$1(this, function1, str2, z, function0), new InventoryWineViewModel$queryRemoteWineList$disposable$2(function1), z));
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

    public static /* synthetic */ void updateWineList$default(InventoryWineViewModel inventoryWineViewModel, String str, Function0 function0, Function1 function1, Function0 function02, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            function02 = null;
        }
        Function0 function03 = function02;
        if ((i & 16) != 0) {
            z = false;
        }
        inventoryWineViewModel.updateWineList(str, function0, function1, function03, z);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final MutableLiveData<Triple<List<String>, List<String>, List<String>>> getGetWineListFilterInfoLiveData() {
        return (MutableLiveData) this.getWineListFilterInfoLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<List<WineInventoryBean>>> getGetWineListLiveData() {
        return (MutableLiveData) this.getWineListLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<String>> getRemoveWineSucLiveData() {
        return (MutableLiveData) this.removeWineSucLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getUpdateWineFavoriteLiveData() {
        return (MutableLiveData) this.updateWineFavoriteLiveData$delegate.getValue();
    }

    public final void removeMulWineWithIdArrayExe(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "idInventoriesList");
    }

    public final void removeWineArrayNew(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "idInventoriesList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Number longValue : list) {
            arrayList2.add(String.valueOf(longValue.longValue()));
        }
        arrayList.addAll(arrayList2);
        if (list.isEmpty()) {
            getRemoveWineSucLiveData().setValue(arrayList);
        }
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().deleteWindInWentory(list, new InventoryWineViewModel$removeWineArrayNew$2(this, arrayList), new InventoryWineViewModel$removeWineArrayNew$3(this, arrayList));
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void updateWineFavorite(@NotNull WineInventoryBean wineInventoryBean) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wine");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new InventoryWineViewModel$updateWineFavorite$1(wineInventoryBean, this, (Continuation<? super InventoryWineViewModel$updateWineFavorite$1>) null), 2, (Object) null);
        ConnectLife.Companion.connectLifeService().updateFavorite(AppConfig.Companion.getAccessToken(), wineInventoryBean, InventoryWineViewModel$updateWineFavorite$2.INSTANCE, new InventoryWineViewModel$updateWineFavorite$3(wineInventoryBean, this));
    }

    public final void updateWineList(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1, @Nullable Function0<Unit> function02, boolean z) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(function0, NavInflater.TAG_ACTION);
        Intrinsics.checkNotNullParameter(function1, BundleJUnitUtils.KEY_FAILURE);
        if (function02 != null) {
            function02.invoke();
        }
        manageDisposable(str, ConnectLife.Companion.connectLifeService().queryLastChange(AppConfig.Companion.getAccessToken(), new InventoryWineViewModel$updateWineList$disposable$1(z, function0, this, str, function1), new InventoryWineViewModel$updateWineList$disposable$2(function02)));
    }
}

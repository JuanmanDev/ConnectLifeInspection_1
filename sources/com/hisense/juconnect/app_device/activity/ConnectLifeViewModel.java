package com.hisense.juconnect.app_device.activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.KeyConst;
import com.juconnect.connectlife.model.ConlManual;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000fR#\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "manualLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/juconnect/connectlife/model/ConlManual;", "getManualLiveData", "()Landroidx/lifecycle/MutableLiveData;", "manualLiveData$delegate", "Lkotlin/Lazy;", "manualLiveDatas", "", "getManualLiveDatas", "manualLiveDatas$delegate", "vivinoLogLiveData", "", "getVivinoLogLiveData", "vivinoLogLiveData$delegate", "queryWineCoolerManual", "", "auid", "", "lang", "vivinoLog", "isSuccess", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeViewModel.kt */
public final class ConnectLifeViewModel extends BaseViewModel {
    @NotNull
    public final Lazy manualLiveData$delegate = LazyKt__LazyJVMKt.lazy(ConnectLifeViewModel$manualLiveData$2.INSTANCE);
    @NotNull
    public final Lazy manualLiveDatas$delegate = LazyKt__LazyJVMKt.lazy(ConnectLifeViewModel$manualLiveDatas$2.INSTANCE);
    @NotNull
    public final Lazy vivinoLogLiveData$delegate = LazyKt__LazyJVMKt.lazy(ConnectLifeViewModel$vivinoLogLiveData$2.INSTANCE);

    @NotNull
    public final MutableLiveData<ConlManual> getManualLiveData() {
        return (MutableLiveData) this.manualLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<ConlManual>> getManualLiveDatas() {
        return (MutableLiveData) this.manualLiveDatas$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getVivinoLogLiveData() {
        return (MutableLiveData) this.vivinoLogLiveData$delegate.getValue();
    }

    public final void queryWineCoolerManual(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "lang");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ConnectLifeViewModel$queryWineCoolerManual$1(str, str2, this, (Continuation<? super ConnectLifeViewModel$queryWineCoolerManual$1>) null), 2, (Object) null);
    }

    public final void vivinoLog(boolean z) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ConnectLifeViewModel$vivinoLog$1(z, this, (Continuation<? super ConnectLifeViewModel$vivinoLog$1>) null), 2, (Object) null);
    }
}

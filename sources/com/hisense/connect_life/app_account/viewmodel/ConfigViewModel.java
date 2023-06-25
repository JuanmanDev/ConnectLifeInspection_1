package com.hisense.connect_life.app_account.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
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

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/viewmodel/ConfigViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "cfgParsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hisense/connect_life/hismart/networks/request/config/model/ConfigParsCom;", "getCfgParsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "cfgParsLiveData$delegate", "Lkotlin/Lazy;", "macLiveData", "getMacLiveData", "macLiveData$delegate", "netStatusLiveData", "getNetStatusLiveData", "netStatusLiveData$delegate", "cfgPars", "", "cmd", "mac", "", "getMac", "getNetStatus", "writeLogToFile", "logStr", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigViewModel.kt */
public final class ConfigViewModel extends BaseViewModel {
    @NotNull
    public final Lazy cfgParsLiveData$delegate = LazyKt__LazyJVMKt.lazy(ConfigViewModel$cfgParsLiveData$2.INSTANCE);
    @NotNull
    public final Lazy macLiveData$delegate = LazyKt__LazyJVMKt.lazy(ConfigViewModel$macLiveData$2.INSTANCE);
    @NotNull
    public final Lazy netStatusLiveData$delegate = LazyKt__LazyJVMKt.lazy(ConfigViewModel$netStatusLiveData$2.INSTANCE);

    /* access modifiers changed from: private */
    public final void writeLogToFile(String str) {
    }

    public final void cfgPars(@NotNull ConfigParsCom configParsCom, @NotNull String str) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Intrinsics.checkNotNullParameter(str, "mac");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ConfigViewModel$cfgPars$1(configParsCom, str, this, (Continuation<? super ConfigViewModel$cfgPars$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<ConfigParsCom> getCfgParsLiveData() {
        return (MutableLiveData) this.cfgParsLiveData$delegate.getValue();
    }

    public final void getMac(@NotNull ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ConfigViewModel$getMac$1(configParsCom, this, (Continuation<? super ConfigViewModel$getMac$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<ConfigParsCom> getMacLiveData() {
        return (MutableLiveData) this.macLiveData$delegate.getValue();
    }

    public final void getNetStatus(@NotNull ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ConfigViewModel$getNetStatus$1(configParsCom, this, (Continuation<? super ConfigViewModel$getNetStatus$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<ConfigParsCom> getNetStatusLiveData() {
        return (MutableLiveData) this.netStatusLiveData$delegate.getValue();
    }
}

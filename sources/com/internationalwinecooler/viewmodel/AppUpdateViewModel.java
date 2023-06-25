package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.hismart.networks.request.appupdate.AppPolicyModel;
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

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rR#\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo47991d2 = {"Lcom/internationalwinecooler/viewmodel/AppUpdateViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "getAppPolicyLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppPolicyModel;", "getGetAppPolicyLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getAppPolicyLiveData$delegate", "Lkotlin/Lazy;", "getAppPolicy", "", "versionCode", "", "appLanguage", "appId", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AppUpdateViewModel.kt */
public final class AppUpdateViewModel extends BaseViewModel {
    @NotNull
    public final Lazy getAppPolicyLiveData$delegate = LazyKt__LazyJVMKt.lazy(AppUpdateViewModel$getAppPolicyLiveData$2.INSTANCE);

    public final void getAppPolicy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "versionCode");
        Intrinsics.checkNotNullParameter(str2, "appLanguage");
        Intrinsics.checkNotNullParameter(str3, "appId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AppUpdateViewModel$getAppPolicy$1((Continuation<? super AppUpdateViewModel$getAppPolicy$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<AppPolicyModel> getGetAppPolicyLiveData() {
        return (MutableLiveData) this.getAppPolicyLiveData$delegate.getValue();
    }
}

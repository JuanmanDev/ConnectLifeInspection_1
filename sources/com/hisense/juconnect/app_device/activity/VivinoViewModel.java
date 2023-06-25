package com.hisense.juconnect.app_device.activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.juconnect.vivino.model.HiVintage;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR/\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/VivinoViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "vivinoScanLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/juconnect/vivino/model/HiVintage;", "getVivinoScanLiveData", "()Landroidx/lifecycle/MutableLiveData;", "vivinoScanLiveData$delegate", "Lkotlin/Lazy;", "scanLabel", "", "file", "Ljava/io/File;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VivinoViewModel.kt */
public final class VivinoViewModel extends BaseViewModel {
    @NotNull
    public final Lazy vivinoScanLiveData$delegate = LazyKt__LazyJVMKt.lazy(VivinoViewModel$vivinoScanLiveData$2.INSTANCE);

    @NotNull
    public final MutableLiveData<Pair<Boolean, HiVintage>> getVivinoScanLiveData() {
        return (MutableLiveData) this.vivinoScanLiveData$delegate.getValue();
    }

    public final void scanLabel(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new VivinoViewModel$scanLabel$1(file, this, (Continuation<? super VivinoViewModel$scanLabel$1>) null), 2, (Object) null);
    }
}

package com.hisense.connect_life.core.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "emptyLoginData", "Landroidx/lifecycle/MutableLiveData;", "", "getEmptyLoginData", "()Landroidx/lifecycle/MutableLiveData;", "emptyLoginData$delegate", "Lkotlin/Lazy;", "loadingLiveData", "getLoadingLiveData", "loadingLiveData$delegate", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "onCleared", "updateLoadingStatus", "isLoading", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseViewModel.kt */
public class BaseViewModel extends ViewModel {
    @NotNull
    public final C9206a compositeDisposable = new C9206a();
    @NotNull
    public final Lazy emptyLoginData$delegate = LazyKt__LazyJVMKt.lazy(BaseViewModel$emptyLoginData$2.INSTANCE);
    @NotNull
    public final Lazy loadingLiveData$delegate = LazyKt__LazyJVMKt.lazy(BaseViewModel$loadingLiveData$2.INSTANCE);

    public final void addDisposable(@NotNull C9207b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "disposable");
        this.compositeDisposable.mo47027b(bVar);
    }

    @NotNull
    public final MutableLiveData<Boolean> getEmptyLoginData() {
        return (MutableLiveData) this.emptyLoginData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadingLiveData() {
        return (MutableLiveData) this.loadingLiveData$delegate.getValue();
    }

    public void onCleared() {
        super.onCleared();
        if (!this.compositeDisposable.mo47031f()) {
            this.compositeDisposable.dispose();
        }
    }

    public final void updateLoadingStatus(boolean z) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new BaseViewModel$updateLoadingStatus$1(this, z, (Continuation<? super BaseViewModel$updateLoadingStatus$1>) null), 3, (Object) null);
    }
}

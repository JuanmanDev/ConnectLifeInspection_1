package com.hisense.connect_life.core.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.R$string;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.dialog.LoadingDialogFragment;
import com.hisense.connect_life.core.listener.ILoadingView;
import com.hisense.connect_life.core.utils.DialogManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p436b.p437b.C7282a;
import p040c.p429r.p430a.p436b.p437b.C7283b;
import p040c.p429r.p430a.p436b.p437b.C7284c;
import p040c.p429r.p430a.p436b.p437b.C7286e;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseVmActivity;", "P", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "Lcom/hisense/connect_life/core/listener/ILoadingView;", "()V", "TAG_LOADING", "", "mViewModel", "getMViewModel", "()Lcom/hisense/connect_life/core/base/BaseViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "hideLoading", "initViewModelClz", "Ljava/lang/Class;", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "dialogCancelable", "", "subscribeObservable", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseVmActivity.kt */
public abstract class BaseVmActivity<P extends BaseViewModel> extends BaseActivity implements ILoadingView {
    @NotNull
    public final String TAG_LOADING = "tag_loading_aty";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy mViewModel$delegate = LazyKt__LazyJVMKt.lazy(new BaseVmActivity$mViewModel$2(this));

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26921subscribeObservable$lambda1(BaseVmActivity baseVmActivity, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseVmActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                baseVmActivity.showLoading(z);
            } else {
                baseVmActivity.hideLoading();
            }
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26922subscribeObservable$lambda2(BaseVmActivity baseVmActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseVmActivity, "this$0");
        if (!bool.booleanValue()) {
            ToastUtils.m9596o().mo21603w(baseVmActivity.getString(R$string.network_lost), new Object[0]);
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26923subscribeObservable$lambda4(BaseVmActivity baseVmActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseVmActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                baseVmActivity.showLoading();
            } else {
                baseVmActivity.hideLoading();
            }
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26924subscribeObservable$lambda5(BaseVmActivity baseVmActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseVmActivity, "this$0");
        ToastUtils.m9596o().mo21603w(baseVmActivity.getString(R$string.network_lost), new Object[0]);
        baseVmActivity.hideLoading();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void attachBaseContext(@Nullable Context context) {
        super.attachBaseContext(context == null ? null : TextContextWrapper.Companion.wrap(context));
    }

    @NotNull
    public final P getMViewModel() {
        return (BaseViewModel) this.mViewModel$delegate.getValue();
    }

    public void hideLoading() {
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, this.TAG_LOADING);
    }

    @NotNull
    public abstract Class<P> initViewModelClz();

    public void loadData() {
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        subscribeObservable();
        loadData();
    }

    public void showLoading() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment(false);
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.displayDialog(loadingDialogFragment, supportFragmentManager, this.TAG_LOADING);
    }

    public void subscribeObservable(boolean z) {
        getMViewModel().getLoadingLiveData().observe(this, new C7282a(this, z));
        getMViewModel().getEmptyLoginData().observe(this, new C7283b(this));
    }

    public void showLoading(boolean z) {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment(z);
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.displayDialog(loadingDialogFragment, supportFragmentManager, this.TAG_LOADING);
    }

    public void subscribeObservable() {
        getMViewModel().getLoadingLiveData().observe(this, new C7284c(this));
        getMViewModel().getEmptyLoginData().observe(this, new C7286e(this));
    }
}

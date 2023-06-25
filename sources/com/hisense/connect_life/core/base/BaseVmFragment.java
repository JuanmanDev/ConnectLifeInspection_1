package com.hisense.connect_life.core.base;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.R$layout;
import com.hisense.connect_life.core.R$style;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.dialog.LoadingDialogFragment;
import com.hisense.connect_life.core.utils.DialogManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p436b.p437b.C7287f;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseVmFragment;", "P", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "TAG_LOADING", "", "mAlertDialog", "Landroidx/appcompat/app/AlertDialog;", "mViewModel", "getMViewModel", "()Lcom/hisense/connect_life/core/base/BaseViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "dismissLoadingDialog", "", "dismissProgressDialog", "displayLoadingDialog", "initViewModelClz", "Ljava/lang/Class;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showProgressDialog", "context", "Landroidx/fragment/app/FragmentActivity;", "cancelable", "", "tip", "subscribeObservable", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseVmFragment.kt */
public abstract class BaseVmFragment<P extends BaseViewModel> extends BaseFragment {
    @NotNull
    public final String TAG_LOADING = "tag_loading_frm";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public AlertDialog mAlertDialog;
    @NotNull
    public final Lazy mViewModel$delegate = LazyKt__LazyJVMKt.lazy(new BaseVmFragment$mViewModel$2(this));

    public static /* synthetic */ void showProgressDialog$default(BaseVmFragment baseVmFragment, FragmentActivity fragmentActivity, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = true;
            }
            baseVmFragment.showProgressDialog(fragmentActivity, str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressDialog");
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26925subscribeObservable$lambda1(BaseVmFragment baseVmFragment, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseVmFragment, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                baseVmFragment.displayLoadingDialog();
            } else {
                baseVmFragment.dismissLoadingDialog();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void dismissLoadingDialog() {
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        dialogManager.dismissDialog(childFragmentManager, this.TAG_LOADING);
    }

    public void dismissProgressDialog() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.mAlertDialog;
        if (alertDialog2 != null) {
            Intrinsics.checkNotNull(alertDialog2);
            if (alertDialog2.isShowing() && (alertDialog = this.mAlertDialog) != null) {
                alertDialog.dismiss();
            }
        }
    }

    public void displayLoadingDialog() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        dialogManager.displayDialog(loadingDialogFragment, childFragmentManager, this.TAG_LOADING);
    }

    @NotNull
    public final P getMViewModel() {
        return (BaseViewModel) this.mViewModel$delegate.getValue();
    }

    @NotNull
    public abstract Class<P> initViewModelClz();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        subscribeObservable();
    }

    public final void showProgressDialog(@NotNull FragmentActivity fragmentActivity, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intrinsics.checkNotNullParameter(str, "tip");
        try {
            if (this.mAlertDialog != null) {
                AlertDialog alertDialog = this.mAlertDialog;
                Intrinsics.checkNotNull(alertDialog);
                if (alertDialog.isShowing()) {
                    return;
                }
            }
            if (this.mAlertDialog == null) {
                this.mAlertDialog = new AlertDialog.Builder(fragmentActivity, R$style.ProgressDialog).create();
            }
            View inflate = fragmentActivity.getLayoutInflater().inflate(R$layout.fragment_loading_dialog, (ViewGroup) null);
            AlertDialog alertDialog2 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog2);
            alertDialog2.setView(inflate, 0, 0, 0, 0);
            AlertDialog alertDialog3 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog3);
            alertDialog3.setCanceledOnTouchOutside(z);
            AlertDialog alertDialog4 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog4);
            alertDialog4.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subscribeObservable() {
        getMViewModel().getLoadingLiveData().observe(getViewLifecycleOwner(), new C7287f(this));
    }

    public void showProgressDialog(@NotNull FragmentActivity fragmentActivity, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        showProgressDialog(fragmentActivity, "", z);
    }
}

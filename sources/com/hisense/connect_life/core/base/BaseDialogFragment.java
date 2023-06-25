package com.hisense.connect_life.core.base;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.R$color;
import com.hisense.connect_life.core.R$style;
import com.hisense.connect_life.core.dialog.LoadingDialogFragment;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import com.hisense.connect_life.core.utils.DialogManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0003H$J\b\u0010\u0013\u001a\u00020\u0014H\u0004J\b\u0010\u0015\u001a\u00020\u0014H\u0004J\b\u0010\u0016\u001a\u00020\u0014H$J&\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\u0014H$J\u0010\u0010\"\u001a\u00020\u00142\b\b\u0001\u0010#\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006$"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "fixedHeightPixel", "", "(I)V", "TAG_LOADING", "", "animResId", "getAnimResId", "()I", "setAnimResId", "getFixedHeightPixel", "layout", "Landroid/view/View;", "getLayout", "()Landroid/view/View;", "setLayout", "(Landroid/view/View;)V", "bindLayout", "dismissLoadingDialog", "", "displayLoadingDialog", "initSelecter", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setListeners", "showString", "resourcesId", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseDialogFragment.kt */
public abstract class BaseDialogFragment extends DialogFragment {
    @NotNull
    public final String TAG_LOADING;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    public int animResId;
    public final int fixedHeightPixel;
    public View layout;

    public BaseDialogFragment() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public BaseDialogFragment(int i) {
        this.fixedHeightPixel = i;
        this.animResId = R$style.animate_bottom_dialog;
        this.TAG_LOADING = "tag_loading_frm";
        this._$_findViewCache = new LinkedHashMap();
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

    public abstract int bindLayout();

    public final void dismissLoadingDialog() {
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        dialogManager.dismissDialog(childFragmentManager, this.TAG_LOADING);
    }

    public final void displayLoadingDialog() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        dialogManager.displayDialog(loadingDialogFragment, childFragmentManager, this.TAG_LOADING);
    }

    public final int getAnimResId() {
        return this.animResId;
    }

    public final int getFixedHeightPixel() {
        return this.fixedHeightPixel;
    }

    @NotNull
    public final View getLayout() {
        View view = this.layout;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
    }

    public abstract void initSelecter();

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(bindLayout(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(bindLayout(), container, false)");
        setLayout(inflate);
        return getLayout();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setWindowAnimations(this.animResId);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            int i = this.fixedHeightPixel;
            if (i != 0) {
                attributes.height = i;
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), R$color.transparent)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSelecter();
        setListeners();
    }

    public final void setAnimResId(int i) {
        this.animResId = i;
    }

    public final void setLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.layout = view;
    }

    public abstract void setListeners();

    public final void showString(@StringRes int i) {
        MultiLanguageUtil.INSTANCE.getConfigLocale();
        ToastUtils o = ToastUtils.m9596o();
        o.mo21601s("dark");
        o.mo21603w(getString(i), new Object[0]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseDialogFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

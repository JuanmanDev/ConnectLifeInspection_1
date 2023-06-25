package com.hisense.connect_life.app_account.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.contrarywind.view.WheelView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.R$style;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p435e.C7279j;

@Metadata(mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006J\b\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/UserTitleDialog;", "Landroidx/fragment/app/DialogFragment;", "onTitleConfirmListener", "Lcom/hisense/connect_life/app_account/widget/UserTitleDialog$OnTitleConfirmListener;", "(Lcom/hisense/connect_life/app_account/widget/UserTitleDialog$OnTitleConfirmListener;)V", "currentSelectedItem", "", "layout", "Landroid/view/View;", "getOnTitleConfirmListener", "()Lcom/hisense/connect_life/app_account/widget/UserTitleDialog$OnTitleConfirmListener;", "titles", "", "", "initSelector", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setCurrentItem", "currentItem", "setListener", "OnTitleConfirmListener", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserTitleDialog.kt */
public final class UserTitleDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int currentSelectedItem;
    public View layout;
    @NotNull
    public final OnTitleConfirmListener onTitleConfirmListener;
    @NotNull
    public final List<String> titles = new ArrayList();

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/UserTitleDialog$OnTitleConfirmListener;", "", "onTitleConfirm", "", "title", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: UserTitleDialog.kt */
    public interface OnTitleConfirmListener {
        void onTitleConfirm(@NotNull String str);
    }

    public UserTitleDialog(@NotNull OnTitleConfirmListener onTitleConfirmListener2) {
        Intrinsics.checkNotNullParameter(onTitleConfirmListener2, "onTitleConfirmListener");
        this.onTitleConfirmListener = onTitleConfirmListener2;
    }

    private final void initSelector() {
        View view = this.layout;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        WheelView wheelView = (WheelView) view.findViewById(R$id.wheelview_city);
        Intrinsics.checkNotNullExpressionValue(wheelView, "layout.wheelview_city");
        wheelView.setVisibility(8);
        UserTitleDialog$initSelector$adapter$1 userTitleDialog$initSelector$adapter$1 = new UserTitleDialog$initSelector$adapter$1(this);
        View view3 = this.layout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view3 = null;
        }
        ((WheelView) view3.findViewById(R$id.wheelview_city)).setCyclic(false);
        View view4 = this.layout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view4 = null;
        }
        ((WheelView) view4.findViewById(R$id.wheelview_language)).setCyclic(false);
        View view5 = this.layout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view5 = null;
        }
        ((WheelView) view5.findViewById(R$id.wheelview_language)).setAdapter(userTitleDialog$initSelector$adapter$1);
        View view6 = this.layout;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view6 = null;
        }
        ((WheelView) view6.findViewById(R$id.wheelview_language)).setCurrentItem(this.currentSelectedItem);
        View view7 = this.layout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
        } else {
            view2 = view7;
        }
        ((WheelView) view2.findViewById(R$id.wheelview_language)).setOnItemSelectedListener(new C7279j(this));
    }

    /* renamed from: initSelector$lambda-0  reason: not valid java name */
    public static final void m26919initSelector$lambda0(UserTitleDialog userTitleDialog, int i) {
        Intrinsics.checkNotNullParameter(userTitleDialog, "this$0");
        userTitleDialog.currentSelectedItem = i;
    }

    private final void setListener() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.pop_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "pop_cancel");
        JuConnectExtKt.singleClickListener(textView, new UserTitleDialog$setListener$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.pop_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "pop_confirm");
        JuConnectExtKt.singleClickListener(textView2, new UserTitleDialog$setListener$2(this));
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

    @NotNull
    public final OnTitleConfirmListener getOnTitleConfirmListener() {
        return this.onTitleConfirmListener;
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LoggerUtil.Companion.mo39146e(String.valueOf(context));
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.pop_language, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…nguage, container, false)");
        this.layout = inflate;
        if (inflate != null) {
            return inflate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
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
        window.setWindowAnimations(R$style.animate_bottom_dialog);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        List<String> list = this.titles;
        String string = getString(R$string.f15734mr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mr)");
        list.add(string);
        List<String> list2 = this.titles;
        String string2 = getString(R$string.f15735ms);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.ms)");
        list2.add(string2);
        initSelector();
        setListener();
        ((WheelView) _$_findCachedViewById(R$id.wheelview_language)).setTypeface(Typeface.DEFAULT);
        ((WheelView) _$_findCachedViewById(R$id.wheelview_city)).setTypeface(Typeface.DEFAULT);
    }

    public final void setCurrentItem(int i) {
        this.currentSelectedItem = i;
    }
}

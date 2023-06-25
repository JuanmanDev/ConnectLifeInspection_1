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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.contrarywind.view.WheelView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$style;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p435e.C7271b;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001,B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u001a\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010(\u001a\u00020\u001aH\u0002J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0007J\f\u0010+\u001a\u00020\u001a*\u00020\u0004H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog;", "Landroidx/fragment/app/DialogFragment;", "selections", "", "", "title", "initIndex", "", "([Ljava/lang/String;Ljava/lang/String;I)V", "callback", "Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog$ISelectSelection;", "getCallback", "()Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog$ISelectSelection;", "setCallback", "(Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog$ISelectSelection;)V", "getInitIndex", "()I", "layout", "Landroid/view/View;", "getSelections", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSelectionIndex", "initSelector", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setListener", "setSelectionIndex", "index", "log", "ISelectSelection", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiSelectionDialog.kt */
public final class MultiSelectionDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    public ISelectSelection callback;
    public final int initIndex;
    public View layout;
    @NotNull
    public final String[] selections;
    @NotNull
    public final String title;

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog$ISelectSelection;", "", "onSelectionSelected", "", "selection", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MultiSelectionDialog.kt */
    public interface ISelectSelection {
        void onSelectionSelected(@NotNull String str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiSelectionDialog(String[] strArr, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, str, (i2 & 4) != 0 ? 0 : i);
    }

    private final void initSelector() {
        MultiSelectionDialog$initSelector$adapter$1 multiSelectionDialog$initSelector$adapter$1 = new MultiSelectionDialog$initSelector$adapter$1(this);
        View view = this.layout;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        ((WheelView) view.findViewById(R$id.wheelview)).setCyclic(false);
        View view3 = this.layout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view3 = null;
        }
        ((WheelView) view3.findViewById(R$id.wheelview)).setAdapter(multiSelectionDialog$initSelector$adapter$1);
        View view4 = this.layout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view4 = null;
        }
        ((WheelView) view4.findViewById(R$id.wheelview)).setLineSpacingMultiplier(2.0f);
        View view5 = this.layout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view5 = null;
        }
        ((WheelView) view5.findViewById(R$id.wheelview)).setCurrentItem(this.initIndex);
        View view6 = this.layout;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
        } else {
            view2 = view6;
        }
        ((WheelView) view2.findViewById(R$id.wheelview)).setOnItemSelectedListener(new C7271b(this));
    }

    /* renamed from: initSelector$lambda-0  reason: not valid java name */
    public static final void m26918initSelector$lambda0(MultiSelectionDialog multiSelectionDialog, int i) {
        Intrinsics.checkNotNullParameter(multiSelectionDialog, "this$0");
        multiSelectionDialog.log(Intrinsics.stringPlus("选中的选项是:", multiSelectionDialog.selections[i]));
    }

    private final void log(String str) {
    }

    private final void setListener() {
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.pop_cancel);
        Intrinsics.checkNotNullExpressionValue(imageView, "pop_cancel");
        JuConnectExtKt.singleClickListener(imageView, new MultiSelectionDialog$setListener$1(this));
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.pop_confirm);
        Intrinsics.checkNotNullExpressionValue(imageView2, "pop_confirm");
        JuConnectExtKt.singleClickListener(imageView2, new MultiSelectionDialog$setListener$2(this));
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

    @Nullable
    public final ISelectSelection getCallback() {
        return this.callback;
    }

    public final int getInitIndex() {
        return this.initIndex;
    }

    public final int getSelectionIndex() {
        View view = this.layout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        return ((WheelView) view.findViewById(R$id.wheelview)).getCurrentItem();
    }

    @NotNull
    public final String[] getSelections() {
        return this.selections;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LoggerUtil.Companion.mo39146e(String.valueOf(context));
    }

    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.pop_multi_selection, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…ection, container, false)");
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
        ((TextView) _$_findCachedViewById(R$id.tv_title)).setText(this.title);
        initSelector();
        setListener();
        ((WheelView) _$_findCachedViewById(R$id.wheelview)).setTypeface(Typeface.DEFAULT);
    }

    public final void setCallback(@Nullable ISelectSelection iSelectSelection) {
        this.callback = iSelectSelection;
    }

    public final void setSelectionIndex(int i) {
        View view = this.layout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        ((WheelView) view.findViewById(R$id.wheelview)).setCurrentItem(i);
    }

    public MultiSelectionDialog(@NotNull String[] strArr, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(strArr, "selections");
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        this.selections = strArr;
        this.title = str;
        this.initIndex = i;
        this._$_findViewCache = new LinkedHashMap();
    }
}

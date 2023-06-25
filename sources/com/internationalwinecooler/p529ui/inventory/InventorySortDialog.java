package com.internationalwinecooler.p529ui.inventory;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
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
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001c"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventorySortDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "sortCallback", "Lcom/internationalwinecooler/ui/inventory/InventorySortDialog$ISortCallback;", "sortId", "", "getSortId", "()Ljava/lang/String;", "setSortId", "(Ljava/lang/String;)V", "hideDialog", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setISortCallBack", "setListener", "updateView", "ISortCallback", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventorySortDialog */
/* compiled from: InventorySortDialog.kt */
public final class InventorySortDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public ISortCallback sortCallback;
    @NotNull
    public String sortId = "";

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventorySortDialog$ISortCallback;", "", "onSort", "", "sortId", "", "sortName", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.inventory.InventorySortDialog$ISortCallback */
    /* compiled from: InventorySortDialog.kt */
    public interface ISortCallback {
        void onSort(@NotNull String str, @NotNull String str2);
    }

    private final void setListener() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.cancel_ifv);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "cancel_ifv");
        JuConnectExtKt.singleClickListener(iconFontView, new InventorySortDialog$setListener$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.text_old_first);
        Intrinsics.checkNotNullExpressionValue(textView, "text_old_first");
        JuConnectExtKt.singleClickListener(textView, new InventorySortDialog$setListener$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.text_young_first);
        Intrinsics.checkNotNullExpressionValue(textView2, "text_young_first");
        JuConnectExtKt.singleClickListener(textView2, new InventorySortDialog$setListener$3(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.text_name_a_z);
        Intrinsics.checkNotNullExpressionValue(textView3, "text_name_a_z");
        JuConnectExtKt.singleClickListener(textView3, new InventorySortDialog$setListener$4(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.text_name_z_a);
        Intrinsics.checkNotNullExpressionValue(textView4, "text_name_z_a");
        JuConnectExtKt.singleClickListener(textView4, new InventorySortDialog$setListener$5(this));
        TextView textView5 = (TextView) _$_findCachedViewById(R$id.text_name_last_in);
        Intrinsics.checkNotNullExpressionValue(textView5, "text_name_last_in");
        JuConnectExtKt.singleClickListener(textView5, new InventorySortDialog$setListener$6(this));
        TextView textView6 = (TextView) _$_findCachedViewById(R$id.text_name_first_in);
        Intrinsics.checkNotNullExpressionValue(textView6, "text_name_first_in");
        JuConnectExtKt.singleClickListener(textView6, new InventorySortDialog$setListener$7(this));
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void updateView() {
        Intrinsics.stringPlus("----sortId == ", this.sortId);
        String str = this.sortId;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    Context context = getContext();
                    Intrinsics.checkNotNull(context);
                    ((TextView) _$_findCachedViewById(R$id.text_old_first)).setBackground(context.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            case 50:
                if (str.equals("2")) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNull(context2);
                    ((TextView) _$_findCachedViewById(R$id.text_young_first)).setBackground(context2.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            case 51:
                if (str.equals("3")) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNull(context3);
                    ((TextView) _$_findCachedViewById(R$id.text_name_a_z)).setBackground(context3.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            case 52:
                if (str.equals("4")) {
                    Context context4 = getContext();
                    Intrinsics.checkNotNull(context4);
                    ((TextView) _$_findCachedViewById(R$id.text_name_z_a)).setBackground(context4.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            case 53:
                if (str.equals("5")) {
                    Context context5 = getContext();
                    Intrinsics.checkNotNull(context5);
                    ((TextView) _$_findCachedViewById(R$id.text_name_last_in)).setBackground(context5.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            case 54:
                if (str.equals("6")) {
                    Context context6 = getContext();
                    Intrinsics.checkNotNull(context6);
                    ((TextView) _$_findCachedViewById(R$id.text_name_first_in)).setBackground(context6.getDrawable(R.drawable.button_circle_unselect));
                    return;
                }
                return;
            default:
                return;
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

    @NotNull
    public final String getSortId() {
        return this.sortId;
    }

    public final void hideDialog() {
        dismiss();
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inventory_sort_dialog, viewGroup, false);
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
        window.setWindowAnimations(R.style.animate_bottom_dialog);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            window.setAttributes(attributes);
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(R$id.title_text)).setText(Intrinsics.stringPlus(getString(R.string.sort_tip), "："));
        setListener();
        updateView();
    }

    public final void setISortCallBack(@NotNull ISortCallback iSortCallback) {
        Intrinsics.checkNotNullParameter(iSortCallback, "sortCallback");
        this.sortCallback = iSortCallback;
    }

    public final void setSortId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sortId = str;
    }
}

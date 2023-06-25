package com.internationalwinecooler.p529ui.fragment.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/DeletedDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "wineInventoryBean", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "getWineInventoryBean", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "setWineInventoryBean", "(Lcom/juconnect/connectlife/model/WineInventoryBean;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "setData", "setIsFavorite", "it", "", "setListener", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.DeletedDialog */
/* compiled from: DeletedDialog.kt */
public final class DeletedDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public WineInventoryBean wineInventoryBean;

    private final void setListener() {
        WineInventoryBean wineInventoryBean2 = this.wineInventoryBean;
        Boolean bool = null;
        String imageUrl = wineInventoryBean2 == null ? null : wineInventoryBean2.getImageUrl();
        WineInventoryBean wineInventoryBean3 = this.wineInventoryBean;
        String name = wineInventoryBean3 == null ? null : wineInventoryBean3.getName();
        WineInventoryBean wineInventoryBean4 = this.wineInventoryBean;
        Long vintage = wineInventoryBean4 == null ? null : wineInventoryBean4.getVintage();
        WineInventoryBean wineInventoryBean5 = this.wineInventoryBean;
        String winery = wineInventoryBean5 == null ? null : wineInventoryBean5.getWinery();
        WineInventoryBean wineInventoryBean6 = this.wineInventoryBean;
        if (wineInventoryBean6 != null) {
            bool = wineInventoryBean6.isFavorite();
        }
        if (imageUrl != null) {
            ((C1544f) C1541c.m1101w(requireActivity()).mo15512s(imageUrl).mo16298j(R.mipmap.bg_default_wine)).mo15478D0((ImageView) _$_findCachedViewById(R$id.wine_image));
        }
        if (name != null) {
            TextView textView = (TextView) _$_findCachedViewById(R$id.text_name);
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(' ');
            if (vintage == null || vintage.longValue() == -1) {
                vintage = "";
            }
            sb.append(vintage);
            textView.setText(sb.toString());
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.text_winery);
        if (TextUtils.isEmpty(winery)) {
            winery = "";
        }
        textView2.setText(winery);
        if (bool != null) {
            setIsFavorite(bool.booleanValue());
        }
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.cancel_ifv);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "cancel_ifv");
        JuConnectExtKt.singleClickListener(iconFontView, new DeletedDialog$setListener$4(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.auto_text);
        Intrinsics.checkNotNullExpressionValue(textView3, "auto_text");
        JuConnectExtKt.singleClickListener(textView3, new DeletedDialog$setListener$5(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.manual_text);
        Intrinsics.checkNotNullExpressionValue(textView4, "manual_text");
        JuConnectExtKt.singleClickListener(textView4, new DeletedDialog$setListener$6(this));
        if (bool != null) {
            setIsFavorite(bool.booleanValue());
        }
        CheckBox checkBox = (CheckBox) _$_findCachedViewById(R$id.checkBox);
        Intrinsics.checkNotNullExpressionValue(checkBox, "checkBox");
        JuConnectExtKt.singleClickListener(checkBox, new DeletedDialog$setListener$8(this));
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
    public final WineInventoryBean getWineInventoryBean() {
        return this.wineInventoryBean;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.deleted_wine_dialog, viewGroup, false);
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
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setListener();
    }

    public final void setData(@NotNull WineInventoryBean wineInventoryBean2) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "wineInventoryBean");
        this.wineInventoryBean = wineInventoryBean2;
    }

    public final void setIsFavorite(boolean z) {
        if (((IconFontView) _$_findCachedViewById(R$id.ic_favorite)) != null) {
            if (z) {
                ((IconFontView) _$_findCachedViewById(R$id.ic_favorite)).setText(getString(R.string.btn_favourutes_slected));
                ((IconFontView) _$_findCachedViewById(R$id.ic_favorite)).setTextColor(C1499f.m915a(R.color.colorButton));
                return;
            }
            ((IconFontView) _$_findCachedViewById(R$id.ic_favorite)).setText(getString(R.string.btn_favourutes_normal));
            ((IconFontView) _$_findCachedViewById(R$id.ic_favorite)).setTextColor(C1499f.m915a(R.color.colorBlack));
        }
    }

    public final void setWineInventoryBean(@Nullable WineInventoryBean wineInventoryBean2) {
        this.wineInventoryBean = wineInventoryBean2;
    }
}

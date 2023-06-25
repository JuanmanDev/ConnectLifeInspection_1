package com.internationalwinecooler.p529ui.fragment.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0018H\u0014J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0005R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryDetaailDialogNew;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "()V", "onFavoriteCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "getOnFavoriteCallback", "()Lcom/hisense/connect_life/core/listener/IItemCallback;", "setOnFavoriteCallback", "(Lcom/hisense/connect_life/core/listener/IItemCallback;)V", "onItemClickCallback", "getOnItemClickCallback", "setOnItemClickCallback", "onRemoveCallback", "getOnRemoveCallback", "setOnRemoveCallback", "wineInventoryBean", "getWineInventoryBean", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "setWineInventoryBean", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;)V", "bindLayout", "", "initSelecter", "", "setIsFavorite", "it", "", "setListeners", "setWineData", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryDetaailDialogNew */
/* compiled from: InventoryDetailDialogNew.kt */
public final class InventoryDetaailDialogNew extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public IItemCallback<? super WineCategoryInfo> onFavoriteCallback;
    @Nullable
    public IItemCallback<? super WineCategoryInfo> onItemClickCallback;
    @Nullable
    public IItemCallback<? super WineCategoryInfo> onRemoveCallback;
    public WineCategoryInfo wineInventoryBean;

    public InventoryDetaailDialogNew() {
        super(0, 1, (DefaultConstructorMarker) null);
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

    public int bindLayout() {
        return R.layout.inventory_generic_detail_dialog_layout;
    }

    @Nullable
    public final IItemCallback<WineCategoryInfo> getOnFavoriteCallback() {
        return this.onFavoriteCallback;
    }

    @Nullable
    public final IItemCallback<WineCategoryInfo> getOnItemClickCallback() {
        return this.onItemClickCallback;
    }

    @Nullable
    public final IItemCallback<WineCategoryInfo> getOnRemoveCallback() {
        return this.onRemoveCallback;
    }

    @NotNull
    public final WineCategoryInfo getWineInventoryBean() {
        WineCategoryInfo wineCategoryInfo = this.wineInventoryBean;
        if (wineCategoryInfo != null) {
            return wineCategoryInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineInventoryBean");
        return null;
    }

    public void initSelecter() {
        String photoUrl = getWineInventoryBean().getPhotoUrl();
        String wineName = getWineInventoryBean().getWineName();
        String produceYear = getWineInventoryBean().getProduceYear();
        String wineFactoryName = getWineInventoryBean().getWineFactoryName();
        int favorite = getWineInventoryBean().getFavorite();
        if (photoUrl != null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            ((C1544f) C1541c.m1101w(activity).mo15512s(photoUrl).mo16298j(R.mipmap.bg_default_wine)).mo15478D0((ImageView) _$_findCachedViewById(R$id.wine_image));
        }
        if (wineName != null) {
            TextView textView = (TextView) _$_findCachedViewById(R$id.text_name);
            StringBuilder sb = new StringBuilder();
            sb.append(wineName);
            sb.append(' ');
            if (TextUtils.equals(produceYear, "-1")) {
                produceYear = "";
            }
            sb.append(produceYear);
            textView.setText(sb.toString());
        }
        if (wineFactoryName != null) {
            ((TextView) _$_findCachedViewById(R$id.text_winery)).setText(wineFactoryName);
        }
        boolean z = true;
        if (favorite != 1) {
            z = false;
        }
        setIsFavorite(z);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.detail_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "detail_close");
        JuConnectExtKt.singleClickListener(iconFontView, new InventoryDetaailDialogNew$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.view_wine_data);
        Intrinsics.checkNotNullExpressionValue(textView, "view_wine_data");
        JuConnectExtKt.singleClickListener(textView, new InventoryDetaailDialogNew$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.remove_from_inventory);
        Intrinsics.checkNotNullExpressionValue(textView2, "remove_from_inventory");
        JuConnectExtKt.singleClickListener(textView2, new InventoryDetaailDialogNew$setListeners$3(this));
    }

    public final void setOnFavoriteCallback(@Nullable IItemCallback<? super WineCategoryInfo> iItemCallback) {
        this.onFavoriteCallback = iItemCallback;
    }

    public final void setOnItemClickCallback(@Nullable IItemCallback<? super WineCategoryInfo> iItemCallback) {
        this.onItemClickCallback = iItemCallback;
    }

    public final void setOnRemoveCallback(@Nullable IItemCallback<? super WineCategoryInfo> iItemCallback) {
        this.onRemoveCallback = iItemCallback;
    }

    public final void setWineData(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wineInventoryBean");
        setWineInventoryBean(wineCategoryInfo);
    }

    public final void setWineInventoryBean(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "<set-?>");
        this.wineInventoryBean = wineCategoryInfo;
    }
}

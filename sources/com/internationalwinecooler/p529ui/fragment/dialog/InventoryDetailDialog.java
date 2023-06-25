package com.internationalwinecooler.p529ui.fragment.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0014J\b\u0010.\u001a\u00020,H\u0016J\u000e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u0007J\b\u00101\u001a\u00020,H\u0014J$\u00102\u001a\u00020,2\u0006\u0010$\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR(\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0015\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00063"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryDetailDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "()V", "deletedDialog", "Lcom/internationalwinecooler/ui/fragment/dialog/DeletedDialog;", "dismissCallBack", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "getDismissCallBack", "()Lcom/hisense/connect_life/core/listener/IItemCallback;", "setDismissCallBack", "(Lcom/hisense/connect_life/core/listener/IItemCallback;)V", "isShowDelete", "()Z", "setShowDelete", "(Z)V", "onFavoriteCallback", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "getOnFavoriteCallback", "setOnFavoriteCallback", "onItemClickCallback", "", "getOnItemClickCallback", "setOnItemClickCallback", "onRemoveCallback", "getOnRemoveCallback", "setOnRemoveCallback", "spIsShow", "getSpIsShow", "setSpIsShow", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getSupportFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setSupportFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "wineInventoryBean", "getWineInventoryBean", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "setWineInventoryBean", "(Lcom/juconnect/connectlife/model/WineInventoryBean;)V", "bindLayout", "", "dismiss", "", "initSelecter", "onDetach", "setIsFavorite", "it", "setListeners", "setWineData", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryDetailDialog */
/* compiled from: InventoryDetailDialog.kt */
public final class InventoryDetailDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final DeletedDialog deletedDialog = new DeletedDialog();
    @Nullable
    public IItemCallback<? super Boolean> dismissCallBack;
    public boolean isShowDelete;
    @Nullable
    public IItemCallback<? super WineInventoryBean> onFavoriteCallback;
    @Nullable
    public IItemCallback<? super List<WineInventoryBean>> onItemClickCallback;
    @Nullable
    public IItemCallback<? super WineInventoryBean> onRemoveCallback;
    public boolean spIsShow = true;
    @Nullable
    public FragmentManager supportFragmentManager;
    public WineInventoryBean wineInventoryBean;

    public InventoryDetailDialog() {
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

    public void dismiss() {
        IItemCallback<? super Boolean> iItemCallback = this.dismissCallBack;
        if (iItemCallback != null) {
            iItemCallback.accept(Boolean.TRUE);
        }
        super.dismiss();
    }

    @Nullable
    public final IItemCallback<Boolean> getDismissCallBack() {
        return this.dismissCallBack;
    }

    @Nullable
    public final IItemCallback<WineInventoryBean> getOnFavoriteCallback() {
        return this.onFavoriteCallback;
    }

    @Nullable
    public final IItemCallback<List<WineInventoryBean>> getOnItemClickCallback() {
        return this.onItemClickCallback;
    }

    @Nullable
    public final IItemCallback<WineInventoryBean> getOnRemoveCallback() {
        return this.onRemoveCallback;
    }

    public final boolean getSpIsShow() {
        return this.spIsShow;
    }

    @Nullable
    public final FragmentManager getSupportFragmentManager() {
        return this.supportFragmentManager;
    }

    @NotNull
    public final WineInventoryBean getWineInventoryBean() {
        WineInventoryBean wineInventoryBean2 = this.wineInventoryBean;
        if (wineInventoryBean2 != null) {
            return wineInventoryBean2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineInventoryBean");
        return null;
    }

    public void initSelecter() {
        this.spIsShow = C1524t.m1041e().mo15416c("isShowDeleted");
        String imageUrl = getWineInventoryBean().getImageUrl();
        String name = getWineInventoryBean().getName();
        Long vintage = getWineInventoryBean().getVintage();
        String winery = getWineInventoryBean().getWinery();
        Boolean isFavorite = getWineInventoryBean().isFavorite();
        if (imageUrl != null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            ((C1544f) C1541c.m1101w(activity).mo15512s(imageUrl).mo16298j(R.mipmap.bg_default_wine)).mo15478D0((ImageView) _$_findCachedViewById(R$id.wine_image));
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
        if (isFavorite != null) {
            setIsFavorite(isFavorite.booleanValue());
        }
    }

    public final boolean isShowDelete() {
        return this.isShowDelete;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDetach() {
        IItemCallback<? super Boolean> iItemCallback = this.dismissCallBack;
        if (iItemCallback != null) {
            iItemCallback.accept(Boolean.TRUE);
        }
        if (this.supportFragmentManager != null && !this.spIsShow && this.isShowDelete) {
            this.isShowDelete = false;
            this.deletedDialog.setData(getWineInventoryBean());
            DeletedDialog deletedDialog2 = this.deletedDialog;
            FragmentManager fragmentManager = this.supportFragmentManager;
            Intrinsics.checkNotNull(fragmentManager);
            JuConnectExtKt.displayDialog(deletedDialog2, fragmentManager);
        }
        super.onDetach();
    }

    public final void setDismissCallBack(@Nullable IItemCallback<? super Boolean> iItemCallback) {
        this.dismissCallBack = iItemCallback;
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
        JuConnectExtKt.singleClickListener(iconFontView, new InventoryDetailDialog$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.view_wine_data);
        Intrinsics.checkNotNullExpressionValue(textView, "view_wine_data");
        JuConnectExtKt.singleClickListener(textView, new InventoryDetailDialog$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.remove_from_inventory);
        Intrinsics.checkNotNullExpressionValue(textView2, "remove_from_inventory");
        JuConnectExtKt.singleClickListener(textView2, new InventoryDetailDialog$setListeners$3(this));
    }

    public final void setOnFavoriteCallback(@Nullable IItemCallback<? super WineInventoryBean> iItemCallback) {
        this.onFavoriteCallback = iItemCallback;
    }

    public final void setOnItemClickCallback(@Nullable IItemCallback<? super List<WineInventoryBean>> iItemCallback) {
        this.onItemClickCallback = iItemCallback;
    }

    public final void setOnRemoveCallback(@Nullable IItemCallback<? super WineInventoryBean> iItemCallback) {
        this.onRemoveCallback = iItemCallback;
    }

    public final void setShowDelete(boolean z) {
        this.isShowDelete = z;
    }

    public final void setSpIsShow(boolean z) {
        this.spIsShow = z;
    }

    public final void setSupportFragmentManager(@Nullable FragmentManager fragmentManager) {
        this.supportFragmentManager = fragmentManager;
    }

    public final void setWineData(@NotNull WineInventoryBean wineInventoryBean2, @NotNull IItemCallback<? super Boolean> iItemCallback, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "wineInventoryBean");
        Intrinsics.checkNotNullParameter(iItemCallback, "dismissCallBack");
        Intrinsics.checkNotNullParameter(fragmentManager, "supportFragmentManager");
        setWineInventoryBean(wineInventoryBean2);
        this.dismissCallBack = iItemCallback;
        this.supportFragmentManager = fragmentManager;
    }

    public final void setWineInventoryBean(@NotNull WineInventoryBean wineInventoryBean2) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "<set-?>");
        this.wineInventoryBean = wineInventoryBean2;
    }
}

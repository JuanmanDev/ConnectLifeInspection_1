package com.internationalwinecooler.p529ui.inventory;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.viewmodel.InventoryWineViewModel;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\"\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventorySelectTypeActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/internationalwinecooler/viewmodel/InventoryWineViewModel;", "()V", "TURN_DETAIL_REQUEST_CODE", "", "deviceAuid", "", "inventoryType", "isShowSecond", "", "bindLayout", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "next", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "selectExactPositioning", "selectGeneric", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/InventorySelectTypeActivity")
/* renamed from: com.internationalwinecooler.ui.inventory.InventorySelectTypeActivity */
/* compiled from: InventorySelectTypeActivity.kt */
public final class InventorySelectTypeActivity extends BaseVmActivity<InventoryWineViewModel> {
    public final int TURN_DETAIL_REQUEST_CODE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    @Autowired(name = "auid")
    @JvmField
    public String deviceAuid = "";
    public int inventoryType;
    @Autowired(name = "isShowSecond")
    @JvmField
    public boolean isShowSecond = true;

    /* access modifiers changed from: private */
    public final void next() {
        if (this.isShowSecond) {
            int i = this.TURN_DETAIL_REQUEST_CODE;
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventoryTypeDetailActivity);
            a.withInt("inventoryType", this.inventoryType);
            a.navigation((Activity) this, i);
            return;
        }
        SPUtils.INSTANCE.put(KeyConst.KEY_WINE_INVENTORY_TYPE, Integer.valueOf(this.inventoryType));
        SPUtils.INSTANCE.put(KeyConst.KEY_INVENTORY_TYPE_FIRST, Boolean.FALSE);
        Postcard a2 = C1337a.m211c().mo15011a(Paths.App.InventoryMainActivity);
        a2.withString(KeyConst.KEY_AUIT, this.deviceAuid);
        a2.navigation();
        finish();
    }

    /* access modifiers changed from: private */
    public final void selectExactPositioning() {
        this.inventoryType = 1;
        ((ImageView) _$_findCachedViewById(R$id.generic_type_select_image)).setBackground(getDrawable(R.drawable.ic_uncheck_));
        ((ImageView) _$_findCachedViewById(R$id.exact_positioning_type_select_image)).setBackground(getDrawable(R.drawable.ic_checked));
        ((IconFontView) _$_findCachedViewById(R$id.generic_type_image)).setTextColor(getColor(R.color.transparent_wine_type));
        ((IconFontView) _$_findCachedViewById(R$id.exact_type_image)).setTextColor(getColor(R.color.colorBlack));
        ((TextView) _$_findCachedViewById(R$id.inventory_type)).setText(getString(R.string.inventory_type_exact_position));
        ((TextView) _$_findCachedViewById(R$id.inventory_type_tips)).setText(getString(R.string.save_your_bottles_n_position_in_a_specific_n_place_inside_a_shelf_n_you_can_later_check_the_n_exact_arrangement_of_n_bottles_on_each_shelf));
    }

    /* access modifiers changed from: private */
    public final void selectGeneric() {
        this.inventoryType = 0;
        ((ImageView) _$_findCachedViewById(R$id.generic_type_select_image)).setBackground(getDrawable(R.drawable.ic_checked));
        ((ImageView) _$_findCachedViewById(R$id.exact_positioning_type_select_image)).setBackground(getDrawable(R.drawable.ic_uncheck_));
        ((IconFontView) _$_findCachedViewById(R$id.generic_type_image)).setTextColor(getColor(R.color.colorBlack));
        ((IconFontView) _$_findCachedViewById(R$id.exact_type_image)).setTextColor(getColor(R.color.transparent_wine_type));
        ((TextView) _$_findCachedViewById(R$id.inventory_type)).setText(getString(R.string.inventory_type_generic));
        ((TextView) _$_findCachedViewById(R$id.inventory_type_tips)).setText(getString(R.string.save_your_bottles_n_position_on_a_shelf_n_you_can_later_ncheck_which_nbottles_are_on_neach_shelf));
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

    public int bindLayout() {
        return R.layout.activity_inventory_select_type_layout;
    }

    @NotNull
    public Class<InventoryWineViewModel> initViewModelClz() {
        return InventoryWineViewModel.class;
    }

    public void initWidgets() {
        ((IconFontView) _$_findCachedViewById(R$id.generic_type_image)).setTextColor(getColor(R.color.colorBlack));
        ((IconFontView) _$_findCachedViewById(R$id.exact_type_image)).setTextColor(getColor(R.color.transparent_wine_type));
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            if (((Integer) obj).intValue() == 0) {
                selectGeneric();
            } else {
                selectExactPositioning();
            }
            if (this.isShowSecond) {
                ((Button) _$_findCachedViewById(R$id.next)).setText(getString(R.string.save));
            } else {
                ((Button) _$_findCachedViewById(R$id.next)).setText(getString(R.string.next));
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == this.TURN_DETAIL_REQUEST_CODE) {
            finish();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new InventorySelectTypeActivity$setListeners$1(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.generic_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "generic_layout");
        JuConnectExtKt.singleClickListener(relativeLayout, new InventorySelectTypeActivity$setListeners$2(this));
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R$id.exact_positioning_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "exact_positioning_layout");
        JuConnectExtKt.singleClickListener(relativeLayout2, new InventorySelectTypeActivity$setListeners$3(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new InventorySelectTypeActivity$setListeners$4(this));
    }
}

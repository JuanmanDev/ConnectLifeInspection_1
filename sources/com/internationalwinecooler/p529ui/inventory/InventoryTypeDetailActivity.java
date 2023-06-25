package com.internationalwinecooler.p529ui.inventory;

import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventoryTypeDetailActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "inventoryType", "", "bindLayout", "initWidgets", "", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/InventoryTypeDetailActivity")
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryTypeDetailActivity */
/* compiled from: InventoryTypeDetailActivity.kt */
public final class InventoryTypeDetailActivity extends BaseActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "inventoryType")
    @JvmField
    public int inventoryType;

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
        return R.layout.activity_inventory_type_detail_layout;
    }

    public void initWidgets() {
        if (this.inventoryType == 0) {
            ((TextView) _$_findCachedViewById(R$id.text_content)).setText(getResources().getString(R.string.Inventory_type_detail_exact_change_to_generic));
        } else {
            ((TextView) _$_findCachedViewById(R$id.text_content)).setText(getResources().getString(R.string.Inventory_type_detail_generic_change_to_exact));
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.detail_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "detail_close");
        JuConnectExtKt.singleClickListener(iconFontView, new InventoryTypeDetailActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.confirm_text);
        Intrinsics.checkNotNullExpressionValue(textView, "confirm_text");
        JuConnectExtKt.singleClickListener(textView, new InventoryTypeDetailActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.cancel_text);
        Intrinsics.checkNotNullExpressionValue(textView2, "cancel_text");
        JuConnectExtKt.singleClickListener(textView2, new InventoryTypeDetailActivity$setListeners$3(this));
    }
}

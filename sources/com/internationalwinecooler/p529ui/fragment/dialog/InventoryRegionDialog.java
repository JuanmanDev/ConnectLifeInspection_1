package com.internationalwinecooler.p529ui.fragment.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.contrarywind.view.WheelView;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p487e.p490c.C7607a;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryRegionDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "dataList", "", "", "currentItem", "", "(Ljava/util/List;I)V", "dataString", "list", "position", "selectResult", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryRegionDialog$RegionSelectResult;", "bindLayout", "initSelecter", "", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "setListeners", "RegionSelectResult", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryRegionDialog */
/* compiled from: InventoryRegionDialog.kt */
public final class InventoryRegionDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int currentItem;
    @NotNull
    public String dataString;
    @NotNull
    public List<String> list;
    public int position;
    public RegionSelectResult selectResult;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryRegionDialog$RegionSelectResult;", "", "regionSelectResult", "", "currentItem", "", "dataString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryRegionDialog$RegionSelectResult */
    /* compiled from: InventoryRegionDialog.kt */
    public interface RegionSelectResult {
        void regionSelectResult(int i, @NotNull String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryRegionDialog(@NotNull List<String> list2, int i) {
        super(0, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list2, "dataList");
        this.list = list2;
        this.currentItem = i;
        this.position = i;
        this.dataString = list2.get(i);
    }

    /* renamed from: initSelecter$lambda-1  reason: not valid java name */
    public static final void m27194initSelecter$lambda1(InventoryRegionDialog inventoryRegionDialog, int i) {
        Intrinsics.checkNotNullParameter(inventoryRegionDialog, "this$0");
        int i2 = 0;
        for (T next : inventoryRegionDialog.list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) next;
            inventoryRegionDialog.position = i;
            i2 = i3;
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

    public int bindLayout() {
        return R.layout.inventory_region_dialog_layout;
    }

    public void initSelecter() {
        InventoryRegionDialog$initSelecter$1 inventoryRegionDialog$initSelecter$1 = new InventoryRegionDialog$initSelecter$1(this);
        ((WheelView) getLayout().findViewById(R$id.wheelview_ticket)).setCyclic(false);
        ((WheelView) getLayout().findViewById(R$id.wheelview_ticket)).setAdapter(inventoryRegionDialog$initSelecter$1);
        ((WheelView) getLayout().findViewById(R$id.wheelview_ticket)).setCurrentItem(this.currentItem);
        ((WheelView) getLayout().findViewById(R$id.wheelview_ticket)).setOnItemSelectedListener(new C7607a(this));
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.selectResult = (RegionSelectResult) context;
    }

    public void onDestroy() {
        RegionSelectResult regionSelectResult = this.selectResult;
        if (regionSelectResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectResult");
            regionSelectResult = null;
        }
        regionSelectResult.regionSelectResult(this.position, this.dataString);
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.ticket_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "ticket_cancel");
        JuConnectExtKt.singleClickListener(textView, new InventoryRegionDialog$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.ticket_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "ticket_confirm");
        JuConnectExtKt.singleClickListener(textView2, new InventoryRegionDialog$setListeners$2(this));
    }
}

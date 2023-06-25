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
import p040c.p482v.p483a.p487e.p490c.C7609c;
import p040c.p482v.p483a.p487e.p490c.C7610d;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0014R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryBestToServeYearDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "mIsBestToServeAll", "", "startYearList", "", "", "endYearList", "startYearItem", "endYearItem", "(ZLjava/util/List;Ljava/util/List;II)V", "endCurrentItem", "endYear", "mIsClickConfirm", "startCurrentItem", "startYear", "yearSelectCallback", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryBestToServeYearDialog$BestServeYearSelectCallback;", "bindLayout", "initSelecter", "", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "setListeners", "BestServeYearSelectCallback", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryBestToServeYearDialog */
/* compiled from: InventoryBestToServeYearDialog.kt */
public final class InventoryBestToServeYearDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int endCurrentItem;
    public int endYear;
    public final int endYearItem;
    @NotNull
    public final List<Integer> endYearList;
    public final boolean mIsBestToServeAll;
    public boolean mIsClickConfirm;
    public int startCurrentItem;
    public int startYear;
    public final int startYearItem;
    @NotNull
    public final List<Integer> startYearList;
    public BestServeYearSelectCallback yearSelectCallback;

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/InventoryBestToServeYearDialog$BestServeYearSelectCallback;", "", "bestToServeSelectYear", "", "isSelectAll", "", "startYear", "", "startCurrentItem", "endYear", "endCurrentItem", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.fragment.dialog.InventoryBestToServeYearDialog$BestServeYearSelectCallback */
    /* compiled from: InventoryBestToServeYearDialog.kt */
    public interface BestServeYearSelectCallback {
        void bestToServeSelectYear(boolean z, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryBestToServeYearDialog(boolean z, @NotNull List<Integer> list, @NotNull List<Integer> list2, int i, int i2) {
        super(0, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "startYearList");
        Intrinsics.checkNotNullParameter(list2, "endYearList");
        this.startYearList = list;
        this.endYearList = list2;
        this.startYearItem = i;
        this.endYearItem = i2;
        this.mIsBestToServeAll = z;
        this.startCurrentItem = i;
        this.endCurrentItem = i2;
        this.startYear = list.get(i).intValue();
        this.endYear = list2.get(i2).intValue();
    }

    /* renamed from: initSelecter$lambda-1  reason: not valid java name */
    public static final void m27189initSelecter$lambda1(InventoryBestToServeYearDialog inventoryBestToServeYearDialog, int i) {
        Intrinsics.checkNotNullParameter(inventoryBestToServeYearDialog, "this$0");
        int i2 = 0;
        for (T next : inventoryBestToServeYearDialog.startYearList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((Number) next).intValue();
            inventoryBestToServeYearDialog.startCurrentItem = i;
            i2 = i3;
        }
    }

    /* renamed from: initSelecter$lambda-3  reason: not valid java name */
    public static final void m27190initSelecter$lambda3(InventoryBestToServeYearDialog inventoryBestToServeYearDialog, int i) {
        Intrinsics.checkNotNullParameter(inventoryBestToServeYearDialog, "this$0");
        int i2 = 0;
        for (T next : inventoryBestToServeYearDialog.endYearList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((Number) next).intValue();
            inventoryBestToServeYearDialog.endCurrentItem = i;
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
        return R.layout.inventory_product_dialog_layout;
    }

    public void initSelecter() {
        InventoryBestToServeYearDialog$initSelecter$1 inventoryBestToServeYearDialog$initSelecter$1 = new InventoryBestToServeYearDialog$initSelecter$1(this);
        ((WheelView) getLayout().findViewById(R$id.wheelview_start)).setCyclic(false);
        ((WheelView) getLayout().findViewById(R$id.wheelview_start)).setAdapter(inventoryBestToServeYearDialog$initSelecter$1);
        ((WheelView) getLayout().findViewById(R$id.wheelview_start)).setCurrentItem(this.startYearItem);
        ((WheelView) getLayout().findViewById(R$id.wheelview_start)).setOnItemSelectedListener(new C7609c(this));
        InventoryBestToServeYearDialog$initSelecter$3 inventoryBestToServeYearDialog$initSelecter$3 = new InventoryBestToServeYearDialog$initSelecter$3(this);
        ((WheelView) getLayout().findViewById(R$id.wheelview_end)).setCyclic(false);
        ((WheelView) getLayout().findViewById(R$id.wheelview_end)).setAdapter(inventoryBestToServeYearDialog$initSelecter$3);
        ((WheelView) getLayout().findViewById(R$id.wheelview_end)).setCurrentItem(this.endYearItem);
        ((WheelView) getLayout().findViewById(R$id.wheelview_end)).setOnItemSelectedListener(new C7610d(this));
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.yearSelectCallback = (BestServeYearSelectCallback) context;
    }

    public void onDestroy() {
        super.onDestroy();
        BestServeYearSelectCallback bestServeYearSelectCallback = this.yearSelectCallback;
        if (bestServeYearSelectCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearSelectCallback");
            bestServeYearSelectCallback = null;
        }
        bestServeYearSelectCallback.bestToServeSelectYear(this.mIsBestToServeAll && !this.mIsClickConfirm, this.startYear, this.startCurrentItem, this.endYear, this.endCurrentItem);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.pop_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "pop_cancel");
        JuConnectExtKt.singleClickListener(textView, new InventoryBestToServeYearDialog$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.pop_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "pop_confirm");
        JuConnectExtKt.singleClickListener(textView2, new InventoryBestToServeYearDialog$setListeners$2(this));
    }
}

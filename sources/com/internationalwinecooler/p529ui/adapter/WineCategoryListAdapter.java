package com.internationalwinecooler.p529ui.adapter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.listener.IItemIndexedCallback;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.juconnect.connect_life.R$id;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003=>?B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0005H\u0017J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0002H\u0016J\u000e\u00102\u001a\u00020#2\u0006\u0010\t\u001a\u00020\nJ\u001e\u00103\u001a\u00020#2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a042\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u00105\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u00106\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u001dH\u0002J%\u00108\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010,\u001a\u00020\u0005¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020#2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u000e\u0010;\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010<\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0005H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "Landroid/widget/Filterable;", "inventoryType", "", "context", "Landroidx/fragment/app/FragmentActivity;", "(ILandroidx/fragment/app/FragmentActivity;)V", "clickFavoriteCallback", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$ClickFavoriteCallback;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "dataList", "", "Lcom/internationalwinecooler/ui/adapter/WineCategoryInfoWrapper;", "emptyViewCallback", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$EmptyViewCallback;", "idCategoriesList", "", "getInventoryType", "()I", "setInventoryType", "(I)V", "itemIndexedCallback", "Lcom/hisense/connect_life/core/listener/IItemIndexedCallback;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "mFilterList", "picIsSelect", "", "selectDeleteCallback", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$SelectDeleteCallback;", "selectNum", "selectedWineList", "clearSelectState", "", "filterName", "charSequence", "", "getFilter", "Landroid/widget/Filter;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setClickFavoriteCallback", "setDataList", "", "setEmptyViewListener", "setIsFavorite", "isFavorite", "setIsFavoriteRequest", "(Lcom/hisense/connect_life/core/utils/Holder;Ljava/lang/Boolean;I)V", "setItemIndexedCallback", "setSelectDeleteCallback", "setUnplacedShow", "ClickFavoriteCallback", "EmptyViewCallback", "SelectDeleteCallback", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter */
/* compiled from: WineCategoryListAdapter.kt */
public final class WineCategoryListAdapter extends RecyclerView.Adapter<Holder> implements Filterable {
    @Nullable
    public ClickFavoriteCallback clickFavoriteCallback;
    @NotNull
    public final FragmentActivity context;
    @NotNull
    public List<WineCategoryInfoWrapper> dataList = new ArrayList();
    @Nullable
    public EmptyViewCallback emptyViewCallback;
    @NotNull
    public List<String> idCategoriesList = new ArrayList();
    public int inventoryType;
    @Nullable
    public IItemIndexedCallback<? super WineCategoryInfo> itemIndexedCallback;
    @NotNull
    public List<WineCategoryInfoWrapper> mFilterList = new ArrayList();
    public boolean picIsSelect = true;
    @Nullable
    public SelectDeleteCallback selectDeleteCallback;
    public int selectNum;
    @NotNull
    public List<WineCategoryInfo> selectedWineList = new ArrayList();

    @Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$ClickFavoriteCallback;", "", "clickFavorite", "", "wine", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "holder", "Lcom/hisense/connect_life/core/utils/Holder;", "position", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$ClickFavoriteCallback */
    /* compiled from: WineCategoryListAdapter.kt */
    public interface ClickFavoriteCallback {
        void clickFavorite(@NotNull WineCategoryInfo wineCategoryInfo, @NotNull Holder holder, int i);
    }

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$EmptyViewCallback;", "", "setEmptyView", "", "size", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$EmptyViewCallback */
    /* compiled from: WineCategoryListAdapter.kt */
    public interface EmptyViewCallback {
        void setEmptyView(int i);
    }

    @Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¨\u0006\u000b"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$SelectDeleteCallback;", "", "onSelectDelete", "", "selectNum", "", "idInventoryList", "", "", "wineList", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$SelectDeleteCallback */
    /* compiled from: WineCategoryListAdapter.kt */
    public interface SelectDeleteCallback {
        void onSelectDelete(int i, @NotNull List<String> list, @NotNull List<WineCategoryInfo> list2);
    }

    public WineCategoryListAdapter(int i, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.inventoryType = i;
        this.context = fragmentActivity;
    }

    public static /* synthetic */ void setDataList$default(WineCategoryListAdapter wineCategoryListAdapter, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        wineCategoryListAdapter.setDataList(list, z);
    }

    private final void setIsFavorite(Holder holder, boolean z) {
        if (z) {
            ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setText(this.context.getString(R.string.btn_favourutes_slected));
            ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setTextColor(this.context.getColor(R.color.colorButton));
            return;
        }
        ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setText(this.context.getString(R.string.btn_favourutes_normal));
        ((IconFontView) holder.itemView.findViewById(R$id.ic_favorite)).setTextColor(this.context.getColor(R.color.colorBlack));
    }

    private final void setUnplacedShow(Holder holder, int i) {
        boolean z;
        int i2 = 0;
        if (this.mFilterList.get(i).getWineCategoryInfo().getWineCount() > 0) {
            Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
            if (obj != null) {
                z = true;
                if (((Integer) obj).intValue() != 0) {
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        z = false;
        IconFontView iconFontView = (IconFontView) holder.itemView.findViewById(R$id.ic_unplaced);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "holder.itemView.ic_unplaced");
        if (!z) {
            i2 = 8;
        }
        iconFontView.setVisibility(i2);
    }

    public final void clearSelectState() {
        this.selectNum = 0;
        this.selectedWineList.clear();
        this.idCategoriesList.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r10 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r12 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r13 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r14 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r15 == null) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0151 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void filterName(@org.jetbrains.annotations.NotNull java.lang.CharSequence r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "charSequence"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper> r3 = r0.dataList
            r1.addAll(r3)
            java.lang.String r2 = r20.toString()
            java.lang.String r2 = r2.toUpperCase()
            java.lang.String r3 = "this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x015b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x0034:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0155
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper r9 = (com.internationalwinecooler.p529ui.adapter.WineCategoryInfoWrapper) r9
            com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo r9 = r9.getWineCategoryInfo()
            java.lang.String r10 = r9.getWineName()
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x004f
        L_0x004d:
            r10 = r11
            goto L_0x0059
        L_0x004f:
            java.lang.String r10 = r10.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            if (r10 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            java.lang.String r12 = r9.getWineType()
            if (r12 != 0) goto L_0x0061
        L_0x005f:
            r12 = r11
            goto L_0x006b
        L_0x0061:
            java.lang.String r12 = r12.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            if (r12 != 0) goto L_0x006b
            goto L_0x005f
        L_0x006b:
            java.lang.String r13 = r9.getArea()
            if (r13 != 0) goto L_0x0073
        L_0x0071:
            r13 = r11
            goto L_0x007d
        L_0x0073:
            java.lang.String r13 = r13.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            if (r13 != 0) goto L_0x007d
            goto L_0x0071
        L_0x007d:
            java.lang.String r14 = r9.getCountry()
            if (r14 != 0) goto L_0x0085
        L_0x0083:
            r14 = r11
            goto L_0x008f
        L_0x0085:
            java.lang.String r14 = r14.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r3)
            if (r14 != 0) goto L_0x008f
            goto L_0x0083
        L_0x008f:
            java.lang.String r15 = r9.getProduceYear()
            if (r15 != 0) goto L_0x0097
        L_0x0095:
            r15 = r11
            goto L_0x00a1
        L_0x0097:
            java.lang.String r15 = r15.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r3)
            if (r15 != 0) goto L_0x00a1
            goto L_0x0095
        L_0x00a1:
            java.lang.String r16 = r9.getWineFactoryName()
            if (r16 != 0) goto L_0x00a8
            goto L_0x00b3
        L_0x00a8:
            java.lang.String r5 = r16.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            if (r5 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r11 = r5
        L_0x00b3:
            java.util.List r5 = r9.getGrapes()
            if (r5 == 0) goto L_0x00c2
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r9 = 0
            goto L_0x00c3
        L_0x00c2:
            r9 = 1
        L_0x00c3:
            r6 = 2
            if (r9 != 0) goto L_0x0100
            java.util.Iterator r5 = r5.iterator()
            r9 = 0
        L_0x00cb:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x00f9
            java.lang.Object r17 = r5.next()
            java.lang.String r17 = (java.lang.String) r17
            r18 = r5
            java.lang.String r5 = r17.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r17 = r7
            r16 = r9
            r7 = 0
            r9 = 0
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x00f2
            r7 = r17
            r5 = r18
            r9 = 1
            goto L_0x00cb
        L_0x00f2:
            r9 = r16
            r7 = r17
            r5 = r18
            goto L_0x00cb
        L_0x00f9:
            r17 = r7
            r16 = r9
            r7 = 0
            r9 = 0
            goto L_0x0106
        L_0x0100:
            r17 = r7
            r7 = 0
            r9 = 0
            r16 = r9
        L_0x0106:
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            java.lang.String r5 = r12.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            java.lang.String r5 = r13.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            java.lang.String r5 = r14.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r15, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            java.lang.String r5 = r11.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r9, (int) r6, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x014b
            if (r16 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r5 = r9
            goto L_0x014c
        L_0x014b:
            r5 = 1
        L_0x014c:
            if (r5 == 0) goto L_0x0151
            r4.add(r8)
        L_0x0151:
            r7 = r17
            goto L_0x0034
        L_0x0155:
            r1.clear()
            r1.addAll(r4)
        L_0x015b:
            java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper> r2 = r0.mFilterList
            r2.clear()
            java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper> r2 = r0.mFilterList
            r2.addAll(r1)
            com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$EmptyViewCallback r1 = r0.emptyViewCallback
            if (r1 != 0) goto L_0x016a
            goto L_0x0173
        L_0x016a:
            java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper> r2 = r0.mFilterList
            int r2 = r2.size()
            r1.setEmptyView(r2)
        L_0x0173:
            r19.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter.filterName(java.lang.CharSequence):void");
    }

    @NotNull
    public final FragmentActivity getContext() {
        return this.context;
    }

    @NotNull
    public Filter getFilter() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T arrayList = new ArrayList();
        objectRef.element = arrayList;
        ((List) arrayList).addAll(this.dataList);
        return new WineCategoryListAdapter$getFilter$1(objectRef, this);
    }

    public final int getInventoryType() {
        return this.inventoryType;
    }

    public int getItemCount() {
        return this.mFilterList.size();
    }

    public final void setClickFavoriteCallback(@NotNull ClickFavoriteCallback clickFavoriteCallback2) {
        Intrinsics.checkNotNullParameter(clickFavoriteCallback2, "clickFavoriteCallback");
        this.clickFavoriteCallback = clickFavoriteCallback2;
    }

    public final void setDataList(@NotNull List<WineCategoryInfo> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.dataList.clear();
        this.mFilterList.clear();
        this.picIsSelect = z;
        for (WineCategoryInfo wineCategoryInfo : list) {
            this.dataList.add(new WineCategoryInfoWrapper(wineCategoryInfo));
            this.mFilterList.add(new WineCategoryInfoWrapper(wineCategoryInfo));
        }
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("WineCategoryListAdapter setDataList ", Integer.valueOf(list.size())));
    }

    public final void setEmptyViewListener(@NotNull EmptyViewCallback emptyViewCallback2) {
        Intrinsics.checkNotNullParameter(emptyViewCallback2, "emptyViewCallback");
        this.emptyViewCallback = emptyViewCallback2;
    }

    public final void setInventoryType(int i) {
        this.inventoryType = i;
    }

    public final void setIsFavoriteRequest(@NotNull Holder holder, @Nullable Boolean bool, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.mFilterList.get(i).getWineCategoryInfo().setFavorite(bool.booleanValue() ? 1 : 0);
            setIsFavorite(holder, booleanValue);
        }
    }

    public final void setItemIndexedCallback(@NotNull IItemIndexedCallback<? super WineCategoryInfo> iItemIndexedCallback) {
        Intrinsics.checkNotNullParameter(iItemIndexedCallback, "itemIndexedCallback");
        this.itemIndexedCallback = iItemIndexedCallback;
    }

    public final void setSelectDeleteCallback(@NotNull SelectDeleteCallback selectDeleteCallback2) {
        Intrinsics.checkNotNullParameter(selectDeleteCallback2, "selectDeleteCallback");
        this.selectDeleteCallback = selectDeleteCallback2;
    }

    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!this.mFilterList.isEmpty()) {
            String photoUrl = this.mFilterList.get(i).getWineCategoryInfo().getPhotoUrl();
            String wineName = this.mFilterList.get(i).getWineCategoryInfo().getWineName();
            String produceYear = this.mFilterList.get(i).getWineCategoryInfo().getProduceYear();
            String wineFactoryName = this.mFilterList.get(i).getWineCategoryInfo().getWineFactoryName();
            int favorite = this.mFilterList.get(i).getWineCategoryInfo().getFavorite();
            if (photoUrl == null || TextUtils.isEmpty(photoUrl)) {
                ((ImageView) holder.itemView.findViewById(R$id.image_wine)).setImageResource(R.mipmap.bg_default_wine);
            } else {
                ((C1544f) ((C1544f) C1541c.m1101w(this.context).mo15512s(photoUrl).mo16285c0(R.mipmap.bg_default_wine)).mo16298j(R.mipmap.bg_default_wine)).mo15478D0((ImageView) holder.itemView.findViewById(R$id.image_wine));
            }
            if (wineName != null) {
                if ((produceYear == null || produceYear.length() == 0) || Intrinsics.areEqual((Object) produceYear, (Object) "-1") || Intrinsics.areEqual((Object) produceYear, (Object) "0")) {
                    ((TextView) holder.itemView.findViewById(R$id.text_name)).setText(String.valueOf(wineName));
                } else {
                    ((TextView) holder.itemView.findViewById(R$id.text_name)).setText(wineName + ' ' + produceYear);
                }
            } else if (produceYear == null) {
                ((TextView) holder.itemView.findViewById(R$id.text_name)).setText("");
            } else {
                ((TextView) holder.itemView.findViewById(R$id.text_name)).setText(String.valueOf(produceYear));
            }
            if (wineFactoryName == null) {
                ((TextView) holder.itemView.findViewById(R$id.text_winery)).setText("");
            } else {
                ((TextView) holder.itemView.findViewById(R$id.text_winery)).setText(wineFactoryName);
            }
            setIsFavorite(holder, favorite == 1);
            if (this.mFilterList.get(i).getWineCategoryInfo().getWineCount() > 1) {
                ((TextView) holder.itemView.findViewById(R$id.text_count)).getVisibility();
                if (this.mFilterList.get(i).getWineCategoryInfo().getWineCount() == 2) {
                    ((TextView) holder.itemView.findViewById(R$id.text_count)).setText(this.mFilterList.get(i).getWineCategoryInfo().getWineCount() + ' ' + this.context.getString(R.string.bottles_two));
                } else {
                    ((TextView) holder.itemView.findViewById(R$id.text_count)).setText(this.mFilterList.get(i).getWineCategoryInfo().getWineCount() + ' ' + this.context.getString(R.string.bottles_d));
                }
            } else if (this.mFilterList.get(i).getWineCategoryInfo().getWineCount() == 0) {
                ((TextView) holder.itemView.findViewById(R$id.text_count)).getVisibility();
                ((TextView) holder.itemView.findViewById(R$id.text_count)).setText("");
            } else {
                ((TextView) holder.itemView.findViewById(R$id.text_count)).getVisibility();
                ((TextView) holder.itemView.findViewById(R$id.text_count)).setText(this.mFilterList.get(i).getWineCategoryInfo().getWineCount() + ' ' + this.context.getString(R.string.bottle_d));
            }
            setUnplacedShow(holder, i);
            if (this.mFilterList.get(i).isSelected()) {
                ((ImageView) holder.itemView.findViewById(R$id.image_wine)).setVisibility(8);
                ((IconFontView) holder.itemView.findViewById(R$id.ic_selected)).setVisibility(0);
                holder.itemView.setBackgroundResource(R.color.colorWhite);
            } else {
                ((ImageView) holder.itemView.findViewById(R$id.image_wine)).setVisibility(0);
                ((IconFontView) holder.itemView.findViewById(R$id.ic_selected)).setVisibility(8);
                holder.itemView.setBackgroundResource(R.color.transparent);
            }
            ((InventoryMainActivity) this.context).setMItemHolder(holder);
            LinearLayout linearLayout = (LinearLayout) holder.itemView.findViewById(R$id.layout_wine_content);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.layout_wine_content");
            JuConnectExtKt.singleClickListener(linearLayout, new WineCategoryListAdapter$onBindViewHolder$1(this, i));
            RelativeLayout relativeLayout = (RelativeLayout) holder.itemView.findViewById(R$id.image_layout);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "holder.itemView.image_layout");
            JuConnectExtKt.singleClickListener(relativeLayout, new WineCategoryListAdapter$onBindViewHolder$2(this, holder, i));
            IconFontView iconFontView = (IconFontView) holder.itemView.findViewById(R$id.ic_favorite);
            Intrinsics.checkNotNullExpressionValue(iconFontView, "holder.itemView.ic_favorite");
            JuConnectExtKt.singleClickListener(iconFontView, new WineCategoryListAdapter$onBindViewHolder$3(this, i, holder));
        }
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inventory_wine_list_item, viewGroup, false));
    }

    public void onViewRecycled(@NotNull Holder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
    }
}

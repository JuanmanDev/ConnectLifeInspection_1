package com.internationalwinecooler.p529ui.adapter;

import android.widget.Filter;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo47991d2 = {"com/internationalwinecooler/ui/adapter/WineCategoryListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryListAdapter$getFilter$1 */
/* compiled from: WineCategoryListAdapter.kt */
public final class WineCategoryListAdapter$getFilter$1 extends Filter {
    public final /* synthetic */ Ref.ObjectRef<List<WineCategoryInfoWrapper>> $filterList;
    public final /* synthetic */ WineCategoryListAdapter this$0;

    public WineCategoryListAdapter$getFilter$1(Ref.ObjectRef<List<WineCategoryInfoWrapper>> objectRef, WineCategoryListAdapter wineCategoryListAdapter) {
        this.$filterList = objectRef;
        this.this$0 = wineCategoryListAdapter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x002e A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = "charSequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toUpperCase()
            java.lang.String r0 = "this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            int r1 = r11.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x00e2
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper>> r1 = r10.$filterList
            T r1 = r1.element
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r1.next()
            r6 = r5
            com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper r6 = (com.internationalwinecooler.p529ui.adapter.WineCategoryInfoWrapper) r6
            com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo r6 = r6.getWineCategoryInfo()
            java.lang.String r7 = r6.getWineName()
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0048
            goto L_0x0053
        L_0x0048:
            java.lang.String r7 = r7.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            if (r7 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r8 = r7
        L_0x0053:
            r7 = 2
            r9 = 0
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r6.getWineType()
            if (r8 != 0) goto L_0x0063
            r8 = r9
            goto L_0x006a
        L_0x0063:
            java.lang.String r8 = r8.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
        L_0x006a:
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r6.getArea()
            if (r8 != 0) goto L_0x0078
            r8 = r9
            goto L_0x007f
        L_0x0078:
            java.lang.String r8 = r8.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
        L_0x007f:
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r6.getCountry()
            if (r8 != 0) goto L_0x008d
            r8 = r9
            goto L_0x0094
        L_0x008d:
            java.lang.String r8 = r8.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
        L_0x0094:
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r6.getProduceYear()
            if (r8 != 0) goto L_0x00a2
            r8 = r9
            goto L_0x00aa
        L_0x00a2:
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L_0x00aa:
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00c8
            java.lang.String r6 = r6.getWineFactoryName()
            if (r6 != 0) goto L_0x00b8
            r6 = r9
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r6 = r6.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
        L_0x00bf:
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r11, (boolean) r3, (int) r7, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r6 = r3
            goto L_0x00c9
        L_0x00c8:
            r6 = r2
        L_0x00c9:
            if (r6 == 0) goto L_0x002e
            r4.add(r5)
            goto L_0x002e
        L_0x00d0:
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper>> r11 = r10.$filterList
            T r11 = r11.element
            java.util.List r11 = (java.util.List) r11
            r11.clear()
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper>> r11 = r10.$filterList
            T r11 = r11.element
            java.util.List r11 = (java.util.List) r11
            r11.addAll(r4)
        L_0x00e2:
            android.widget.Filter$FilterResults r11 = new android.widget.Filter$FilterResults
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper>> r0 = r10.$filterList
            T r0 = r0.element
            r11.values = r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(@NotNull CharSequence charSequence, @NotNull Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(filterResults, "filterResults");
        this.this$0.mFilterList.clear();
        Object obj = filterResults.values;
        if (obj != null) {
            this.this$0.mFilterList.addAll((Collection) obj);
        }
        WineCategoryListAdapter.EmptyViewCallback access$getEmptyViewCallback$p = this.this$0.emptyViewCallback;
        if (access$getEmptyViewCallback$p != null) {
            access$getEmptyViewCallback$p.setEmptyView(this.this$0.mFilterList.size());
        }
        this.this$0.notifyDataSetChanged();
    }
}

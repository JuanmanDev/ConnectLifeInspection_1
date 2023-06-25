package com.hisense.connect_life.app_account.adapter;

import android.widget.Filter;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo47991d2 = {"com/hisense/connect_life/app_account/adapter/CountryListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CountryListAdapter.kt */
public final class CountryListAdapter$getFilter$1 extends Filter {
    public final /* synthetic */ List<Region> $filterList;
    public final /* synthetic */ CountryListAdapter this$0;

    public CountryListAdapter$getFilter$1(List<Region> list, CountryListAdapter countryListAdapter) {
        this.$filterList = list;
        this.this$0 = countryListAdapter;
    }

    @NotNull
    public Filter.FilterResults performFiltering(@Nullable CharSequence charSequence) {
        String upperCase = String.valueOf(charSequence).toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        if (upperCase.length() == 0) {
            this.$filterList.clear();
            this.$filterList.addAll(this.this$0.mRegionList);
        } else {
            List access$getMRegionList$p = this.this$0.mRegionList;
            ArrayList arrayList = new ArrayList();
            for (Object next : access$getMRegionList$p) {
                if (StringsKt__StringsJVMKt.startsWith(((Region) next).getName(), upperCase, true)) {
                    arrayList.add(next);
                }
            }
            this.$filterList.clear();
            this.$filterList.addAll(arrayList);
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = this.$filterList;
        return filterResults;
    }

    public void publishResults(@NotNull CharSequence charSequence, @NotNull Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "constraint");
        Intrinsics.checkNotNullParameter(filterResults, "results");
        this.this$0.mFilterList.clear();
        Object obj = filterResults.values;
        if (obj != null) {
            this.this$0.mFilterList.addAll((Collection) obj);
        }
        this.this$0.notifyDataSetChanged();
    }
}

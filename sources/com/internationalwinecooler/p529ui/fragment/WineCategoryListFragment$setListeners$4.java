package com.internationalwinecooler.p529ui.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.internationalwinecooler.p529ui.adapter.WineCategoryListAdapter;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/internationalwinecooler/ui/fragment/WineCategoryListFragment$setListeners$4", "Lcom/internationalwinecooler/ui/adapter/WineCategoryListAdapter$EmptyViewCallback;", "setEmptyView", "", "size", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.WineCategoryListFragment$setListeners$4 */
/* compiled from: WineCategoryListFragment.kt */
public final class WineCategoryListFragment$setListeners$4 implements WineCategoryListAdapter.EmptyViewCallback {
    public final /* synthetic */ WineCategoryListFragment this$0;

    public WineCategoryListFragment$setListeners$4(WineCategoryListFragment wineCategoryListFragment) {
        this.this$0 = wineCategoryListFragment;
    }

    public void setEmptyView(int i) {
        if (i == 0) {
            ((TextView) this.this$0._$_findCachedViewById(R$id.empty_view)).setVisibility(0);
            ((LinearLayout) this.this$0._$_findCachedViewById(R$id.wine_layout)).setVisibility(8);
            return;
        }
        ((TextView) this.this$0._$_findCachedViewById(R$id.empty_view)).setVisibility(8);
        ((LinearLayout) this.this$0._$_findCachedViewById(R$id.wine_layout)).setVisibility(0);
    }
}

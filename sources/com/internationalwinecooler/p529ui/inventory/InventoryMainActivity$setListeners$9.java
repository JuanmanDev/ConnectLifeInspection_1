package com.internationalwinecooler.p529ui.inventory;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/internationalwinecooler/ui/inventory/InventoryMainActivity$setListeners$9", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$setListeners$9 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$setListeners$9 implements TextWatcher {
    public final /* synthetic */ InventoryMainActivity this$0;

    public InventoryMainActivity$setListeners$9(InventoryMainActivity inventoryMainActivity) {
        this.this$0 = inventoryMainActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        Fragment access$getCurrentFragment$p = this.this$0.currentFragment;
        if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) this.this$0.wineCategoryFragment)) {
            this.this$0.wineCategoryFragment.filter(String.valueOf(charSequence));
        } else if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) this.this$0.wineGenericCabinetFragment)) {
            this.this$0.setSearchState(!TextUtils.isEmpty(String.valueOf(charSequence)));
            this.this$0.wineGenericCabinetFragment.refreshZoneMainAdapter(true, this.this$0.filterSearchList(String.valueOf(charSequence)));
            this.this$0.wineGenericCabinetFragment.setEmptyViewShow(true, this.this$0.filterSearchList(String.valueOf(charSequence)));
            this.this$0.wineGenericCabinetFragment.setWineSearchCounts();
        } else if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) this.this$0.wineExactCabinetFragment)) {
            this.this$0.setSearchState(!TextUtils.isEmpty(String.valueOf(charSequence)));
            this.this$0.filterExactSearchList(String.valueOf(charSequence));
            this.this$0.wineExactCabinetFragment.setWineBottlesCounts();
            this.this$0.wineExactCabinetFragment.refreshExactWineListSearch();
        }
    }
}

package com.internationalwinecooler.p529ui.adapter.basequick;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0014\u0010\u0013\u001a\u00020\r2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J*\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0018"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/basequick/ImgItemProvider;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/internationalwinecooler/ui/adapter/basequick/ProviderMultiEntity;", "()V", "itemViewType", "", "getItemViewType", "()I", "layoutId", "getLayoutId", "convert", "", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "data", "onClick", "view", "Landroid/view/View;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onLongClick", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.basequick.ImgItemProvider */
/* compiled from: ImgItemProvider.kt */
public final class ImgItemProvider extends BaseItemProvider<ProviderMultiEntity> {
    public void convert(@NotNull BaseViewHolder baseViewHolder, @NotNull @Nullable ProviderMultiEntity providerMultiEntity) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "helper");
    }

    public int getItemViewType() {
        return 2;
    }

    public int getLayoutId() {
        return 17367040;
    }

    public void onClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, @Nullable ProviderMultiEntity providerMultiEntity, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @NotNull
    public final BaseViewHolder onCreateViewHolder(@NotNull @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNull(viewGroup);
        return super.onCreateViewHolder(viewGroup, 1);
    }

    public boolean onLongClick(@NotNull BaseViewHolder baseViewHolder, @NotNull View view, @Nullable ProviderMultiEntity providerMultiEntity, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        return true;
    }
}

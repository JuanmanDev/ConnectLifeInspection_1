package com.internationalwinecooler.p529ui.adapter.basequick;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0014¨\u0006\t"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/basequick/ProviderMultiAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/internationalwinecooler/ui/adapter/basequick/ProviderMultiEntity;", "()V", "getItemType", "", "data", "", "position", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.basequick.ProviderMultiAdapter */
/* compiled from: ProviderMultiAdapter.kt */
public final class ProviderMultiAdapter extends BaseProviderMultiAdapter<ProviderMultiEntity> {
    public ProviderMultiAdapter() {
        super((List) null, 1, (DefaultConstructorMarker) null);
        addItemProvider(new ImgItemProvider());
        addItemProvider(new TextImgItemProvider());
        addItemProvider(new TextItemProvider());
    }

    public int getItemType(@NotNull List<ProviderMultiEntity> list, int i) {
        Intrinsics.checkNotNullParameter(list, "data");
        int i2 = i % 3;
        if (i2 != 0) {
            return i2 != 2 ? 0 : 2;
        }
        return 1;
    }
}

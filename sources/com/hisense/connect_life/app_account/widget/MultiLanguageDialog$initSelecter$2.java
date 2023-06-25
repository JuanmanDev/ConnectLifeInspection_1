package com.hisense.connect_life.app_account.widget;

import com.hisense.connect_life.core.multilingual.LanguageListManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p117g.p118a.C1994a;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, mo47991d2 = {"com/hisense/connect_life/app_account/widget/MultiLanguageDialog$initSelecter$2", "Lcom/contrarywind/adapter/WheelAdapter;", "", "getItem", "index", "", "getItemsCount", "indexOf", "o", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiLanguageDialog.kt */
public final class MultiLanguageDialog$initSelecter$2 implements C1994a<Object> {
    @NotNull
    public Object getItem(int i) {
        String str = LanguageListManager.INSTANCE.getLanguageNameList().get(i);
        Intrinsics.checkNotNullExpressionValue(str, "LanguageListManager.languageNameList[index]");
        return str;
    }

    public int getItemsCount() {
        return LanguageListManager.INSTANCE.getLanguageNameList().size();
    }

    public int indexOf(@Nullable Object obj) {
        return CollectionsKt___CollectionsKt.indexOf(LanguageListManager.INSTANCE.getLanguageNameList(), obj);
    }
}

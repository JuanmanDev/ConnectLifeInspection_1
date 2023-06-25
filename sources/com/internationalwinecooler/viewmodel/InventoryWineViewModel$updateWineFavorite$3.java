package com.internationalwinecooler.viewmodel;

import com.internationalwinecooler.model.JsResp;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$updateWineFavorite$3 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ WineInventoryBean $wine;
    public final /* synthetic */ InventoryWineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$updateWineFavorite$3(WineInventoryBean wineInventoryBean, InventoryWineViewModel inventoryWineViewModel) {
        super(1);
        this.$wine = wineInventoryBean;
        this.this$0 = inventoryWineViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        Boolean isFavorite = this.$wine.isFavorite();
        Boolean isFavorite2 = this.$wine.isFavorite();
        Intrinsics.checkNotNull(isFavorite2);
        Intrinsics.areEqual((Object) isFavorite, (Object) Boolean.valueOf(!isFavorite2.booleanValue()));
        this.this$0.getUpdateWineFavoriteLiveData().postValue(new Pair(Boolean.TRUE, C1502i.m930j(new JsResp(this.$wine, 0, (String) null, 6, (DefaultConstructorMarker) null))));
        ConnectLifeRoom.Companion.wineInventoryProvider().updateWineInventories(CollectionsKt__CollectionsJVMKt.listOf(this.$wine));
    }
}

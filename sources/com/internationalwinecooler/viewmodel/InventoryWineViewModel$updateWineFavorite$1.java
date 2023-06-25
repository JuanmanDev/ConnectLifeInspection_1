package com.internationalwinecooler.viewmodel;

import com.internationalwinecooler.model.JsResp;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.InventoryWineViewModel$updateWineFavorite$1", mo48701f = "InventoryWineViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$updateWineFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ WineInventoryBean $wine;
    public int label;
    public final /* synthetic */ InventoryWineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$updateWineFavorite$1(WineInventoryBean wineInventoryBean, InventoryWineViewModel inventoryWineViewModel, Continuation<? super InventoryWineViewModel$updateWineFavorite$1> continuation) {
        super(2, continuation);
        this.$wine = wineInventoryBean;
        this.this$0 = inventoryWineViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryWineViewModel$updateWineFavorite$1(this.$wine, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryWineViewModel$updateWineFavorite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getUpdateWineFavoriteLiveData().postValue(new Pair(Boxing.boxBoolean(true), C1502i.m930j(new JsResp(this.$wine, 0, (String) null, 6, (DefaultConstructorMarker) null))));
            ConnectLifeRoom.Companion.wineInventoryProvider().updateWineInventories(CollectionsKt__CollectionsJVMKt.listOf(this.$wine));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

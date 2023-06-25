package com.internationalwinecooler.p529ui.fragment.cabinet_exact;

import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment$setDeleteWineSucc$1", mo48701f = "InventoryExactCabinetFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment$setDeleteWineSucc$1 */
/* compiled from: InventoryExactCabinetFragment.kt */
public final class InventoryExactCabinetFragment$setDeleteWineSucc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<String> $it;
    public int label;
    public final /* synthetic */ InventoryExactCabinetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactCabinetFragment$setDeleteWineSucc$1(InventoryExactCabinetFragment inventoryExactCabinetFragment, List<String> list, Continuation<? super InventoryExactCabinetFragment$setDeleteWineSucc$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryExactCabinetFragment;
        this.$it = list;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryExactCabinetFragment$setDeleteWineSucc$1(this.this$0, this.$it, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryExactCabinetFragment$setDeleteWineSucc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String unused = this.this$0.getWineCoolerName(LoginUserInfoRoom.Companion.loginUserInfoProvider().queryWineInventoryByInventoryId((String) CollectionsKt___CollectionsKt.first(this.$it)).getDeviceId());
            LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteWineInventoryByInventoryId((String) CollectionsKt___CollectionsKt.first(this.$it));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

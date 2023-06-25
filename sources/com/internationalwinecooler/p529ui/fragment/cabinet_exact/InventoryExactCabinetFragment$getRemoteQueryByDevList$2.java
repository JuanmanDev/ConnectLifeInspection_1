package com.internationalwinecooler.p529ui.fragment.cabinet_exact;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment$getRemoteQueryByDevList$2", mo48701f = "InventoryExactCabinetFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.fragment.cabinet_exact.InventoryExactCabinetFragment$getRemoteQueryByDevList$2 */
/* compiled from: InventoryExactCabinetFragment.kt */
public final class InventoryExactCabinetFragment$getRemoteQueryByDevList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FilterCondition $filterCondition;
    public int label;
    public final /* synthetic */ InventoryExactCabinetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryExactCabinetFragment$getRemoteQueryByDevList$2(FilterCondition filterCondition, InventoryExactCabinetFragment inventoryExactCabinetFragment, Continuation<? super InventoryExactCabinetFragment$getRemoteQueryByDevList$2> continuation) {
        super(2, continuation);
        this.$filterCondition = filterCondition;
        this.this$0 = inventoryExactCabinetFragment;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryExactCabinetFragment$getRemoteQueryByDevList$2(this.$filterCondition, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryExactCabinetFragment$getRemoteQueryByDevList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$filterCondition == null) {
                InventoryMainActivity access$getParentActivity$p = this.this$0.parentActivity;
                InventoryMainActivity inventoryMainActivity = null;
                if (access$getParentActivity$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    access$getParentActivity$p = null;
                }
                if (TextUtils.isEmpty(access$getParentActivity$p.deviceAuid)) {
                    this.this$0.getInventoryWineViewModel().getRemoteLiveData().postValue(new Pair("", LoginUserInfoRoom.Companion.loginUserInfoProvider().getAllWineInventoryNew()));
                } else {
                    MutableLiveData<Pair<String, List<WineBaseInfo>>> remoteLiveData = this.this$0.getInventoryWineViewModel().getRemoteLiveData();
                    LoginUserInfoProvider loginUserInfoProvider = LoginUserInfoRoom.Companion.loginUserInfoProvider();
                    InventoryMainActivity access$getParentActivity$p2 = this.this$0.parentActivity;
                    if (access$getParentActivity$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("parentActivity");
                    } else {
                        inventoryMainActivity = access$getParentActivity$p2;
                    }
                    remoteLiveData.postValue(new Pair("", loginUserInfoProvider.getAllWineInventoryByDeviceId(inventoryMainActivity.deviceAuid)));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

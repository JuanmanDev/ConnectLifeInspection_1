package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$useCacheWithDeviceId$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$useCacheWithDeviceId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $deviceId;
    public int label;
    public final /* synthetic */ WineCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$useCacheWithDeviceId$1(String str, WineCategoryViewModel wineCategoryViewModel, Continuation<? super WineCategoryViewModel$useCacheWithDeviceId$1> continuation) {
        super(2, continuation);
        this.$deviceId = str;
        this.this$0 = wineCategoryViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineCategoryViewModel$useCacheWithDeviceId$1(this.$deviceId, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineCategoryViewModel$useCacheWithDeviceId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<WineCategoryInfo> loadAllWineInventories = LoginUserInfoRoom.Companion.wineCategoryProvider().loadAllWineInventories();
            String str = this.$deviceId;
            if (!(str == null || str.length() == 0)) {
                if (!(loadAllWineInventories == null || loadAllWineInventories.isEmpty())) {
                    String str2 = this.$deviceId;
                    ArrayList arrayList = new ArrayList();
                    for (T next : loadAllWineInventories) {
                        WineCategoryInfo wineCategoryInfo = (WineCategoryInfo) next;
                        List<String> deviceIdList = wineCategoryInfo.getDeviceIdList();
                        if (deviceIdList == null || deviceIdList.isEmpty()) {
                            z = false;
                        } else {
                            List<String> deviceIdList2 = wineCategoryInfo.getDeviceIdList();
                            Intrinsics.checkNotNull(deviceIdList2);
                            z = deviceIdList2.contains(str2);
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    this.this$0.getGetWineListLiveData().postValue(new Pair(Boxing.boxBoolean(true), arrayList));
                    return Unit.INSTANCE;
                }
            }
            this.this$0.getGetWineListLiveData().postValue(new Pair(Boxing.boxBoolean(true), loadAllWineInventories));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

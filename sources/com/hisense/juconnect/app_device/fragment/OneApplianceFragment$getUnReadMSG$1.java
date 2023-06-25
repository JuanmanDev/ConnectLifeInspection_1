package com.hisense.juconnect.app_device.fragment;

import com.hisense.connect_life.hismart.room.Notification;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.fragment.OneApplianceFragment$getUnReadMSG$1", mo48701f = "OneApplianceFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: OneApplianceFragment.kt */
public final class OneApplianceFragment$getUnReadMSG$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<Notification> $unReadList;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ OneApplianceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneApplianceFragment$getUnReadMSG$1(List<Notification> list, OneApplianceFragment oneApplianceFragment, Continuation<? super OneApplianceFragment$getUnReadMSG$1> continuation) {
        super(2, continuation);
        this.$unReadList = list;
        this.this$0 = oneApplianceFragment;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OneApplianceFragment$getUnReadMSG$1 oneApplianceFragment$getUnReadMSG$1 = new OneApplianceFragment$getUnReadMSG$1(this.$unReadList, this.this$0, continuation);
        oneApplianceFragment$getUnReadMSG$1.L$0 = obj;
        return oneApplianceFragment$getUnReadMSG$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneApplianceFragment$getUnReadMSG$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<Notification> list = this.$unReadList;
            OneApplianceFragment oneApplianceFragment = this.this$0;
            if (list.size() > 0) {
                oneApplianceFragment.notificationList.clear();
                Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new OneApplianceFragment$getUnReadMSG$1$1$1$1(oneApplianceFragment, (Continuation<? super OneApplianceFragment$getUnReadMSG$1$1$1$1>) null), 2, (Object) null);
                if (3 < list.size()) {
                    int size = list.size() - 1;
                    int size2 = list.size() - 3;
                    if (size2 <= size) {
                        while (true) {
                            int i = size - 1;
                            oneApplianceFragment.notificationList.add(list.get(size));
                            if (size == size2) {
                                break;
                            }
                            size = i;
                        }
                    }
                } else {
                    for (Notification add : list) {
                        oneApplianceFragment.notificationList.add(add);
                    }
                    Job unused2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new OneApplianceFragment$getUnReadMSG$1$1$1$3(oneApplianceFragment, (Continuation<? super OneApplianceFragment$getUnReadMSG$1$1$1$3>) null), 2, (Object) null);
                }
            }
            Job unused3 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new OneApplianceFragment$getUnReadMSG$1$1$1$4(oneApplianceFragment, (Continuation<? super OneApplianceFragment$getUnReadMSG$1$1$1$4>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

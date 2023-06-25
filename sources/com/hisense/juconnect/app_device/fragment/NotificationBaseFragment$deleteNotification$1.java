package com.hisense.juconnect.app_device.fragment;

import com.hisense.juconnect.app_device.event.DeleteNotification;
import com.juconnect.connectlife.model.NotificationBean;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.fragment.NotificationBaseFragment$deleteNotification$1", mo48701f = "NotificationBaseFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: NotificationBaseFragment.kt */
public final class NotificationBaseFragment$deleteNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<ArrayList<String>> $msgIdList;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ NotificationBaseFragment this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.fragment.NotificationBaseFragment$deleteNotification$1$2", mo48701f = "NotificationBaseFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.hisense.juconnect.app_device.fragment.NotificationBaseFragment$deleteNotification$1$2 */
    /* compiled from: NotificationBaseFragment.kt */
    public static final class C86052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86052(notificationBaseFragment2, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                notificationBaseFragment2.getCheckedList().clear();
                NotificationBaseFragment notificationBaseFragment = notificationBaseFragment2;
                notificationBaseFragment.queryData(notificationBaseFragment.getFirstLoadCounts());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationBaseFragment$deleteNotification$1(NotificationBaseFragment notificationBaseFragment, Ref.ObjectRef<ArrayList<String>> objectRef, Continuation<? super NotificationBaseFragment$deleteNotification$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationBaseFragment;
        this.$msgIdList = objectRef;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        NotificationBaseFragment$deleteNotification$1 notificationBaseFragment$deleteNotification$1 = new NotificationBaseFragment$deleteNotification$1(this.this$0, this.$msgIdList, continuation);
        notificationBaseFragment$deleteNotification$1.L$0 = obj;
        return notificationBaseFragment$deleteNotification$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((NotificationBaseFragment$deleteNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ArrayList<Pair<Integer, Integer>> checkedList = this.this$0.getCheckedList();
            NotificationBaseFragment notificationBaseFragment = this.this$0;
            Ref.ObjectRef<ArrayList<String>> objectRef = this.$msgIdList;
            for (Pair pair : checkedList) {
                NotificationRoom.Companion.notificationProvider().deleteById(((NotificationBean) notificationBaseFragment.getChildList().get(((Number) pair.getFirst()).intValue()).get(((Number) pair.getSecond()).intValue())).getMsgId());
                ((ArrayList) objectRef.element).add(((NotificationBean) notificationBaseFragment.getChildList().get(((Number) pair.getFirst()).intValue()).get(((Number) pair.getSecond()).intValue())).getMsgId());
            }
            EventBus.getDefault().post(new DeleteNotification((ArrayList) this.$msgIdList.element));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            final NotificationBaseFragment notificationBaseFragment2 = this.this$0;
            Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, main, (CoroutineStart) null, new C86052((Continuation<? super C86052>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

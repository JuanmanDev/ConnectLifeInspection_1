package com.hisense.juconnect.app_device.activity;

import android.view.View;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.event.DeleteNotification;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ReportTicketActivity.kt */
public final class ReportTicketActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ ReportTicketActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.ReportTicketActivity$setListeners$2$1", mo48701f = "ReportTicketActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.hisense.juconnect.app_device.activity.ReportTicketActivity$setListeners$2$1 */
    /* compiled from: ReportTicketActivity.kt */
    public static final class C85951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C85951(reportTicketActivity2, objectRef, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C85951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NotificationRoom.Companion.notificationProvider().deleteById(reportTicketActivity2.getMsgId());
                ((ArrayList) objectRef.element).add(reportTicketActivity2.getMsgId());
                EventBus.getDefault().post(new DeleteNotification((ArrayList) objectRef.element));
                ReportTicketActivity reportTicketActivity = reportTicketActivity2;
                String string = reportTicketActivity.getString(R$string.delete_success);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.delete_success)");
                reportTicketActivity.showString(string);
                EventBus.getDefault().post(Boxing.boxInt(104));
                reportTicketActivity2.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportTicketActivity$setListeners$2(ReportTicketActivity reportTicketActivity) {
        super(1);
        this.this$0 = reportTicketActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        ReportTicketActivity reportTicketActivity = this.this$0;
        CoroutineDispatcher io = Dispatchers.getIO();
        final ReportTicketActivity reportTicketActivity2 = this.this$0;
        Job unused = BuildersKt__Builders_commonKt.launch$default(reportTicketActivity, io, (CoroutineStart) null, new C85951((Continuation<? super C85951>) null), 2, (Object) null);
    }
}

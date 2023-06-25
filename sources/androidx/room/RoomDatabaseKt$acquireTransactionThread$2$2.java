package androidx.room;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "run"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RoomDatabase.kt */
public final class RoomDatabaseKt$acquireTransactionThread$2$2 implements Runnable {
    public final /* synthetic */ CancellableContinuation<ContinuationInterceptor> $continuation;
    public final /* synthetic */ Job $controlJob;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", mo48701f = "RoomDatabase.kt", mo48702i = {}, mo48703l = {124}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1 */
    /* compiled from: RoomDatabase.kt */
    public static final class C09101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09101 r0 = new C09101(cancellableContinuation, job, continuation);
            r0.L$0 = obj;
            return r0;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CancellableContinuation<ContinuationInterceptor> cancellableContinuation = cancellableContinuation;
                Result.Companion companion = Result.Companion;
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(ContinuationInterceptor.Key);
                Intrinsics.checkNotNull(element);
                cancellableContinuation.resumeWith(Result.m27299constructorimpl(element));
                Job job = job;
                this.label = 1;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public RoomDatabaseKt$acquireTransactionThread$2$2(CancellableContinuation<? super ContinuationInterceptor> cancellableContinuation, Job job) {
        this.$continuation = cancellableContinuation;
        this.$controlJob = job;
    }

    public final void run() {
        final CancellableContinuation<ContinuationInterceptor> cancellableContinuation = this.$continuation;
        final Job job = this.$controlJob;
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new C09101((Continuation<? super C09101>) null), 1, (Object) null);
    }
}

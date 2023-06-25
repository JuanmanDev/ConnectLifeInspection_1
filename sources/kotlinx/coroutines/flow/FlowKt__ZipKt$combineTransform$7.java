package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@"}, mo47991d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 176)
@DebugMetadata(mo48700c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", mo48701f = "Zip.kt", mo48702i = {}, mo48703l = {308}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: Zip.kt */
public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Flow<T>[] $flowArray;
    public final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
    public /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@"}, mo47991d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 176)
    @DebugMetadata(mo48700c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", mo48701f = "Zip.kt", mo48702i = {}, mo48703l = {308}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 */
    /* compiled from: Zip.kt */
    public static final class C95792 extends SuspendLambda implements Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            C95792 r0 = new C95792(r3, continuation);
            r0.L$0 = flowCollector;
            r0.L$1 = tArr;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = r3;
                this.L$0 = null;
                this.label = 1;
                if (function3.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            r3.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$7(Flow<T>[] flowArr, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combineTransform$7> continuation) {
        super(2, continuation);
        this.$flowArray = flowArr;
        this.$transform = function3;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, continuation);
        flowKt__ZipKt$combineTransform$7.L$0 = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ZipKt$combineTransform$7) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<T>[] flowArr = this.$flowArray;
            Intrinsics.needClassReification();
            final Flow<T>[] flowArr2 = this.$flowArray;
            C95781 r3 = new Function0<T[]>() {
                @Nullable
                public final T[] invoke() {
                    int length = r2.length;
                    Intrinsics.reifiedOperationMarker(0, "T?");
                    return new Object[length];
                }
            };
            Intrinsics.needClassReification();
            final Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.$transform;
            C95792 r4 = new C95792((Continuation<? super C95792>) null);
            this.label = 1;
            if (CombineKt.combineInternal((FlowCollector) this.L$0, flowArr, r3, r4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        Flow<T>[] flowArr = this.$flowArray;
        Intrinsics.needClassReification();
        final Flow<T>[] flowArr2 = this.$flowArray;
        C95781 r1 = new Function0<T[]>() {
            @Nullable
            public final T[] invoke() {
                int length = flowArr2.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        };
        Intrinsics.needClassReification();
        final Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.$transform;
        C95792 r2 = new C95792((Continuation<? super C95792>) null);
        InlineMarker.mark(0);
        CombineKt.combineInternal((FlowCollector) this.L$0, flowArr, r1, r2, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}

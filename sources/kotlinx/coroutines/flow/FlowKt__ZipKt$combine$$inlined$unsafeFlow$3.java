package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, mo47991d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 176)
/* compiled from: SafeCollector.common.kt */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 implements Flow<R> {
    public final /* synthetic */ Flow[] $flowArray$inlined;
    public final /* synthetic */ Function2 $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(Flow[] flowArr, Function2 function2) {
        this.$flowArray$inlined = flowArr;
        this.$transform$inlined = function2;
    }

    @Nullable
    public Object collect(@NotNull FlowCollector<? super R> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Flow[] flowArr = this.$flowArray$inlined;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.$flowArray$inlined);
        Intrinsics.needClassReification();
        Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, new FlowKt__ZipKt$combine$6$2(this.$transform$inlined, (Continuation<? super FlowKt__ZipKt$combine$6$2>) null), continuation);
        if (combineInternal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return combineInternal;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public Object collect$$forInline(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(this, continuation) {
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 this$0;

            {
                this.this$0 = r1;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((FlowCollector) null, this);
            }
        };
        InlineMarker.mark(5);
        Flow[] flowArr = this.$flowArray$inlined;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.$flowArray$inlined);
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform$inlined, (Continuation<? super FlowKt__ZipKt$combine$6$2>) null);
        InlineMarker.mark(0);
        CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, flowKt__ZipKt$combine$6$2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}

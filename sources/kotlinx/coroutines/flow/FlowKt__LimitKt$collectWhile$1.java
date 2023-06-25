package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 176)
@DebugMetadata(mo48700c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo48701f = "Limit.kt", mo48702i = {0}, mo48703l = {136}, mo48704m = "collectWhile", mo48705n = {"collector"}, mo48706s = {"L$0"})
/* compiled from: Limit.kt */
public final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__LimitKt$collectWhile$1(Continuation<? super FlowKt__LimitKt$collectWhile$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.collectWhile((Flow) null, (Function2) null, this);
    }
}

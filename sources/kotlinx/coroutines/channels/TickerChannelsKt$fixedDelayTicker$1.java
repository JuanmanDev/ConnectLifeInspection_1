package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.TickerChannelsKt", mo48701f = "TickerChannels.kt", mo48702i = {0, 0, 1, 1, 2, 2}, mo48703l = {106, 108, 109}, mo48704m = "fixedDelayTicker", mo48705n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, mo48706s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* compiled from: TickerChannels.kt */
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(Continuation<? super TickerChannelsKt$fixedDelayTicker$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TickerChannelsKt.fixedDelayTicker(0, 0, (SendChannel<? super Unit>) null, this);
    }
}

package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo48701f = "Deprecated.kt", mo48702i = {0, 0, 0}, mo48703l = {38}, mo48704m = "elementAt", mo48705n = {"$this$consume$iv", "index", "count"}, mo48706s = {"L$0", "I$0", "I$1"})
/* compiled from: Deprecated.kt */
public final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$elementAt$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAt$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.elementAt((ReceiveChannel) null, 0, this);
    }
}

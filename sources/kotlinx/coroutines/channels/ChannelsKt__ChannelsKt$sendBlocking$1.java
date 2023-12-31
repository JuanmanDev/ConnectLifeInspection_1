package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@"}, mo47991d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", mo48701f = "Channels.kt", mo48702i = {}, mo48703l = {58}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: Channels.kt */
public final class ChannelsKt__ChannelsKt$sendBlocking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ E $element;
    public final /* synthetic */ SendChannel<E> $this_sendBlocking;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$sendBlocking$1(SendChannel<? super E> sendChannel, E e, Continuation<? super ChannelsKt__ChannelsKt$sendBlocking$1> continuation) {
        super(2, continuation);
        this.$this_sendBlocking = sendChannel;
        this.$element = e;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChannelsKt__ChannelsKt$sendBlocking$1(this.$this_sendBlocking, this.$element, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__ChannelsKt$sendBlocking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SendChannel<E> sendChannel = this.$this_sendBlocking;
            E e = this.$element;
            this.label = 1;
            if (sendChannel.send(e, this) == coroutine_suspended) {
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

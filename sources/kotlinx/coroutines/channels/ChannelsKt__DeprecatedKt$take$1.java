package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@"}, mo47991d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", mo48701f = "Deprecated.kt", mo48702i = {0, 0, 1, 1}, mo48703l = {254, 255}, mo48704m = "invokeSuspend", mo48705n = {"$this$produce", "remaining", "$this$produce", "remaining"}, mo48706s = {"L$0", "I$0", "L$0", "I$0"})
/* compiled from: Deprecated.kt */
public final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: $n */
    public final /* synthetic */ int f18813$n;
    public final /* synthetic */ ReceiveChannel<E> $this_take;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$take$1> continuation) {
        super(2, continuation);
        this.f18813$n = i;
        this.$this_take = receiveChannel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f18813$n, this.$this_take, continuation);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super E> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r5
            r5 = r9
            goto L_0x0087
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r9
            goto L_0x006a
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            int r1 = r9.f18813$n
            if (r1 != 0) goto L_0x0044
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0044:
            if (r1 < 0) goto L_0x0048
            r1 = r3
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            int r4 = r9.f18813$n
            if (r1 == 0) goto L_0x0095
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r9.$this_take
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r9
        L_0x0054:
            r5.L$0 = r10
            r5.L$1 = r1
            r5.I$0 = r4
            r5.label = r3
            java.lang.Object r6 = r1.hasNext(r5)
            if (r6 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r7 = r5
            r5 = r10
            r10 = r6
            r6 = r7
            r8 = r4
            r4 = r1
            r1 = r8
        L_0x006a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0092
            java.lang.Object r10 = r4.next()
            r6.L$0 = r5
            r6.L$1 = r4
            r6.I$0 = r1
            r6.label = r2
            java.lang.Object r10 = r5.send(r10, r6)
            if (r10 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r10 = r5
            r5 = r6
        L_0x0087:
            int r1 = r1 + -1
            if (r1 != 0) goto L_0x008e
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x008e:
            r7 = r4
            r4 = r1
            r1 = r7
            goto L_0x0054
        L_0x0092:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0095:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Requested element count "
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = " is less than zero."
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

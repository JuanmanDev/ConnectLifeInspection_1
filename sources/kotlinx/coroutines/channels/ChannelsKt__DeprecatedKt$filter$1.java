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
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", mo48701f = "Deprecated.kt", mo48702i = {0, 1, 1, 2}, mo48703l = {198, 199, 199}, mo48704m = "invokeSuspend", mo48705n = {"$this$produce", "$this$produce", "e", "$this$produce"}, mo48706s = {"L$0", "L$0", "L$2", "L$0"})
/* compiled from: Deprecated.kt */
public final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
    public final /* synthetic */ ReceiveChannel<E> $this_filter;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$filter$1> continuation) {
        super(2, continuation);
        this.$this_filter = receiveChannel;
        this.$predicate = function2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, continuation);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super E> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r5) goto L_0x0038
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0056
        L_0x001e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0026:
            java.lang.Object r1 = r10.L$2
            java.lang.Object r6 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r10
            goto L_0x008d
        L_0x0038:
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L_0x006c
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_filter
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r11
        L_0x0056:
            r11 = r10
        L_0x0057:
            r11.L$0 = r6
            r11.L$1 = r1
            r11.L$2 = r2
            r11.label = r5
            java.lang.Object r7 = r1.hasNext(r11)
            if (r7 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L_0x006c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a9
            java.lang.Object r11 = r6.next()
            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r11, r0)
            if (r8 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r9 = r7
            r7 = r11
            r11 = r8
            r8 = r9
        L_0x008d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a4
            r0.L$0 = r8
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r11 = r8.send(r7, r0)
            if (r11 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            goto L_0x0057
        L_0x00a9:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

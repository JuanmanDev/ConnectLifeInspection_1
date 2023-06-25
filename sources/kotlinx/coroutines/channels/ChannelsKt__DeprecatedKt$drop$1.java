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
@DebugMetadata(mo48700c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", mo48701f = "Deprecated.kt", mo48702i = {0, 0, 1, 2}, mo48703l = {164, 169, 170}, mo48704m = "invokeSuspend", mo48705n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, mo48706s = {"L$0", "I$0", "L$0", "L$0"})
/* compiled from: Deprecated.kt */
public final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: $n */
    public final /* synthetic */ int f18812$n;
    public final /* synthetic */ ReceiveChannel<E> $this_drop;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$drop$1> continuation) {
        super(2, continuation);
        this.f18812$n = i;
        this.$this_drop = receiveChannel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f18812$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super E> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004e
            if (r1 == r4) goto L_0x003b
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x00a4
        L_0x0022:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002a:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x00b4
        L_0x003b:
            int r1 = r9.I$0
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x0083
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            int r1 = r9.f18812$n
            if (r1 < 0) goto L_0x005b
            r1 = r4
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            int r5 = r9.f18812$n
            if (r1 == 0) goto L_0x00d2
            if (r5 <= 0) goto L_0x009c
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r9.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r10
            r10 = r9
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x006d:
            r10.L$0 = r6
            r10.L$1 = r5
            r10.I$0 = r1
            r10.label = r4
            java.lang.Object r7 = r5.hasNext(r10)
            if (r7 != r0) goto L_0x007c
            return r0
        L_0x007c:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L_0x0083:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x009a
            r6.next()
            int r10 = r5 + -1
            if (r10 != 0) goto L_0x0093
            goto L_0x009a
        L_0x0093:
            r5 = r6
            r6 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
            goto L_0x006d
        L_0x009a:
            r10 = r7
            goto L_0x009e
        L_0x009c:
            r1 = r0
            r0 = r9
        L_0x009e:
            kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r0.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L_0x00a4:
            r0.L$0 = r10
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = r4.hasNext(r0)
            if (r5 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x00b4:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cf
            java.lang.Object r10 = r4.next()
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r10 = r5.send(r10, r0)
            if (r10 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            r10 = r5
            goto L_0x00a4
        L_0x00cf:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00d2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Requested element count "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = " is less than zero."
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004H@"}, mo47991d2 = {"<anonymous>", "", "S", "T", "Lkotlin/sequences/SequenceScope;"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", mo48701f = "_Sequences.kt", mo48702i = {0, 0, 0, 1, 1, 1}, mo48703l = {2344, 2347}, mo48704m = "invokeSuspend", mo48705n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, mo48706s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function2<S, T, S> $operation;
    public final /* synthetic */ Sequence<T> $this_runningReduce;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> function2, Continuation<? super SequencesKt___SequencesKt$runningReduce$1> continuation) {
        super(2, continuation);
        this.$this_runningReduce = sequence;
        this.$operation = function2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, continuation);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super S> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.sequences.SequenceScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x000e
            if (r1 != r2) goto L_0x001c
        L_0x000e:
            java.lang.Object r1 = r7.L$2
            java.lang.Object r3 = r7.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004c
        L_0x001c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.sequences.Sequence<T> r8 = r7.$this_runningReduce
            java.util.Iterator r8 = r8.iterator()
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r8.next()
            r7.L$0 = r4
            r7.L$1 = r8
            r7.L$2 = r1
            r7.label = r3
            java.lang.Object r3 = r4.yield(r1, r7)
            if (r3 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r3 = r8
        L_0x004c:
            r8 = r7
        L_0x004d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x006c
            kotlin.jvm.functions.Function2<S, T, S> r5 = r8.$operation
            java.lang.Object r6 = r3.next()
            java.lang.Object r1 = r5.invoke(r1, r6)
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.yield(r1, r8)
            if (r5 != r0) goto L_0x004d
            return r0
        L_0x006c:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

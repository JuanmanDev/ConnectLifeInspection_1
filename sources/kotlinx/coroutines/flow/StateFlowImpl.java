package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u00065"}, mo47991d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StateFlow.kt */
public final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    @NotNull
    public volatile /* synthetic */ Object _state;
    public int sequence;

    public StateFlowImpl(@NotNull Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r7 = (kotlinx.coroutines.flow.StateFlowSlot[]) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r7 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        r2 = r7.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r3 >= r2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r4 = r7[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r4.makePending();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r5.sequence != r6) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        r5.sequence = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6 = r5.sequence;
        r7 = getSlots();
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0050, code lost:
        monitor-exit(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean updateState(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r5.getSlots()
            monitor-enter(r5)
            java.lang.Object r0 = r5._state     // Catch:{ all -> 0x005b }
            r1 = 0
            if (r6 == 0) goto L_0x0011
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)     // Catch:{ all -> 0x005b }
            if (r6 != 0) goto L_0x0011
            monitor-exit(r5)
            return r1
        L_0x0011:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)     // Catch:{ all -> 0x005b }
            r0 = 1
            if (r6 == 0) goto L_0x001a
            monitor-exit(r5)
            return r0
        L_0x001a:
            r5._state = r7     // Catch:{ all -> 0x005b }
            int r6 = r5.sequence     // Catch:{ all -> 0x005b }
            r7 = r6 & 1
            if (r7 != 0) goto L_0x0055
            int r6 = r6 + r0
            r5.sequence = r6     // Catch:{ all -> 0x005b }
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r5.getSlots()     // Catch:{ all -> 0x005b }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005b }
            monitor-exit(r5)
        L_0x002c:
            kotlinx.coroutines.flow.StateFlowSlot[] r7 = (kotlinx.coroutines.flow.StateFlowSlot[]) r7
            if (r7 == 0) goto L_0x003e
            int r2 = r7.length
            r3 = r1
        L_0x0032:
            if (r3 >= r2) goto L_0x003e
            r4 = r7[r3]
            if (r4 == 0) goto L_0x003b
            r4.makePending()
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003e:
            monitor-enter(r5)
            int r7 = r5.sequence     // Catch:{ all -> 0x0052 }
            if (r7 != r6) goto L_0x0048
            int r6 = r6 + r0
            r5.sequence = r6     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r0
        L_0x0048:
            int r6 = r5.sequence     // Catch:{ all -> 0x0052 }
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r5.getSlots()     // Catch:{ all -> 0x0052 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            goto L_0x002c
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0055:
            int r6 = r6 + 2
            r5.sequence = r6     // Catch:{ all -> 0x005b }
            monitor-exit(r5)
            return r0
        L_0x005b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.updateState(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.flow.StateFlowSlot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d0
        L_0x0061:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00ec
        L_0x0076:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r12 = r10.allocateSlot()
            kotlinx.coroutines.flow.StateFlowSlot r12 = (kotlinx.coroutines.flow.StateFlowSlot) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00e9 }
            r0.L$0 = r10     // Catch:{ all -> 0x00e9 }
            r0.L$1 = r11     // Catch:{ all -> 0x00e9 }
            r0.L$2 = r12     // Catch:{ all -> 0x00e9 }
            r0.label = r6     // Catch:{ all -> 0x00e9 }
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch:{ all -> 0x00e9 }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch:{ all -> 0x0073 }
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00ad
            kotlinx.coroutines.JobKt.ensureActive((kotlinx.coroutines.Job) r2)     // Catch:{ all -> 0x0073 }
        L_0x00ad:
            if (r11 == 0) goto L_0x00b5
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d0
        L_0x00b5:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bb
            r11 = r3
            goto L_0x00bc
        L_0x00bb:
            r11 = r12
        L_0x00bc:
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r12     // Catch:{ all -> 0x0073 }
            r0.label = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r11 = r12
        L_0x00d0:
            boolean r12 = r6.takePending()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r11     // Catch:{ all -> 0x0073 }
            r0.label = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.awaitPending(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00e9:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00ec:
            r8.freeSlot(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = NullSurrogateKt.NULL;
        }
        if (t2 == null) {
            t2 = NullSurrogateKt.NULL;
        }
        return updateState(t, t2);
    }

    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @NotNull
    public Flow<T> fuse(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i, bufferOverflow);
    }

    @NotNull
    public List<T> getReplayCache() {
        return CollectionsKt__CollectionsJVMKt.listOf(getValue());
    }

    public T getValue() {
        T t = NullSurrogateKt.NULL;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public void setValue(T t) {
        if (t == null) {
            t = NullSurrogateKt.NULL;
        }
        updateState((Object) null, t);
    }

    public boolean tryEmit(T t) {
        setValue(t);
        return true;
    }

    @NotNull
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    @NotNull
    public StateFlowSlot[] createSlotArray(int i) {
        return new StateFlowSlot[i];
    }
}

package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo47991d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DispatchedContinuation.kt */
public final class DispatchedContinuationKt {
    @NotNull
    @JvmField
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");
    @NotNull
    public static final Symbol UNDEFINED = new Symbol("UNDEFINED");

    public static final boolean executeUnconfined(DispatchedContinuation<?> dispatchedContinuation, Object obj, int i, boolean z, Function0<Unit> function0) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            InlineMarker.finallyEnd(1);
            throw th;
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        InlineMarker.finallyEnd(1);
        return false;
    }

    public static /* synthetic */ boolean executeUnconfined$default(DispatchedContinuation dispatchedContinuation, Object obj, int i, boolean z, Function0 function0, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            InlineMarker.finallyEnd(1);
            throw th;
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        InlineMarker.finallyEnd(1);
        return false;
    }

    public static /* synthetic */ void getREUSABLE_CLAIMED$annotations() {
    }

    public static /* synthetic */ void getUNDEFINED$annotations() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.clearThreadContext() != false) goto L_0x0095;
     */
    @kotlinx.coroutines.InternalCoroutinesApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void resumeCancellableWith(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6, @org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L_0x00ba
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = kotlinx.coroutines.CompletionStateKt.toState((java.lang.Object) r7, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6._state = r8
            r6.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L_0x003f
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto L_0x00bd
        L_0x003f:
            r0.incrementUseCount(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch:{ all -> 0x00ad }
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.isActive()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.getCancellationException()     // Catch:{ all -> 0x00ad }
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r3)     // Catch:{ all -> 0x00ad }
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = kotlin.Result.m27299constructorimpl(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = r1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.countOrElement     // Catch:{ all -> 0x00ad }
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            kotlinx.coroutines.UndispatchedCoroutine r8 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.clearThreadContext()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.clearThreadContext()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.processUnconfinedEvent()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.handleFatalException(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.decrementUseCount(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.decrementUseCount(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.Continuation, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        resumeCancellableWith(continuation, obj, function1);
    }

    public static final boolean yieldUndispatched(@NotNull DispatchedContinuation<? super Unit> dispatchedContinuation) {
        Unit unit = Unit.INSTANCE;
        boolean assertions_enabled = DebugKt.getASSERTIONS_ENABLED();
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = unit;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } catch (Throwable th) {
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            throw th;
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        return false;
    }
}

package kotlinx.coroutines.tasks;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p347m.C5755b;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p634k.p635a.p638d.C9492a;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo47991d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", "T", "Lcom/google/android/gms/tasks/Task;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", "asTask", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Tasks.kt */
public final class TasksKt {
    @NotNull
    public static final <T> Deferred<T> asDeferred(@NotNull C5771j<T> jVar) {
        return asDeferredImpl(jVar, (C5755b) null);
    }

    public static final <T> Deferred<T> asDeferredImpl(C5771j<T> jVar, C5755b bVar) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
        if (jVar.mo28855p()) {
            Exception l = jVar.mo28851l();
            if (l != null) {
                CompletableDeferred$default.completeExceptionally(l);
            } else if (jVar.mo28854o()) {
                Job.DefaultImpls.cancel$default((Job) CompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                CompletableDeferred$default.complete(jVar.mo28852m());
            }
        } else {
            jVar.mo28843d(DirectExecutor.INSTANCE, new C9492a(CompletableDeferred$default));
        }
        if (bVar != null) {
            CompletableDeferred$default.invokeOnCompletion(new TasksKt$asDeferredImpl$2(bVar));
        }
        return new TasksKt$asDeferredImpl$3(CompletableDeferred$default);
    }

    /* renamed from: asDeferredImpl$lambda-0  reason: not valid java name */
    public static final void m28850asDeferredImpl$lambda0(CompletableDeferred completableDeferred, C5771j jVar) {
        Exception l = jVar.mo28851l();
        if (l != null) {
            completableDeferred.completeExceptionally(l);
        } else if (jVar.mo28854o()) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(jVar.mo28852m());
        }
    }

    @NotNull
    public static final <T> C5771j<T> asTask(@NotNull Deferred<? extends T> deferred) {
        C5755b bVar = new C5755b();
        C5773k kVar = new C5773k(bVar.mo28830b());
        deferred.invokeOnCompletion(new TasksKt$asTask$1(bVar, deferred, kVar));
        return kVar.mo28859a();
    }

    @Nullable
    public static final <T> Object await(@NotNull C5771j<T> jVar, @NotNull Continuation<? super T> continuation) {
        return awaitImpl(jVar, (C5755b) null, continuation);
    }

    public static final <T> Object awaitImpl(C5771j<T> jVar, C5755b bVar, Continuation<? super T> continuation) {
        if (jVar.mo28855p()) {
            Exception l = jVar.mo28851l();
            if (l != null) {
                throw l;
            } else if (!jVar.mo28854o()) {
                return jVar.mo28852m();
            } else {
                throw new CancellationException("Task " + jVar + " was cancelled normally.");
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            jVar.mo28843d(DirectExecutor.INSTANCE, new TasksKt$awaitImpl$2$1(cancellableContinuationImpl));
            if (bVar != null) {
                cancellableContinuationImpl.invokeOnCancellation(new TasksKt$awaitImpl$2$2(bVar));
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    @NotNull
    @ExperimentalCoroutinesApi
    public static final <T> Deferred<T> asDeferred(@NotNull C5771j<T> jVar, @NotNull C5755b bVar) {
        return asDeferredImpl(jVar, bVar);
    }

    @Nullable
    @ExperimentalCoroutinesApi
    public static final <T> Object await(@NotNull C5771j<T> jVar, @NotNull C5755b bVar, @NotNull Continuation<? super T> continuation) {
        return awaitImpl(jVar, bVar, continuation);
    }
}

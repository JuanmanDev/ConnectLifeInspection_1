package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", mo48701f = "DebugCoroutineInfoImpl.kt", mo48702i = {}, mo48703l = {75}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DebugCoroutineInfoImpl.kt */
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ StackTraceFrame $bottom;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, Continuation<? super DebugCoroutineInfoImpl$creationStackTrace$1> continuation) {
        super(2, continuation);
        this.this$0 = debugCoroutineInfoImpl;
        this.$bottom = stackTraceFrame;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, this.$bottom, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super StackTraceElement> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.this$0;
            CoroutineStackFrame callerFrame = this.$bottom.getCallerFrame();
            this.label = 1;
            if (debugCoroutineInfoImpl.yieldFrames((SequenceScope) this.L$0, callerFrame, this) == coroutine_suspended) {
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

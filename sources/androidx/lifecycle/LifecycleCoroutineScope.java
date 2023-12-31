package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\t\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000b\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ9\u0010\f\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\r8 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo47991d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launchWhenCreated", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenResumed", "launchWhenStarted", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_runtime_ktx_release", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements CoroutineScope {
    @NotNull
    public abstract Lifecycle getLifecycle$lifecycle_runtime_ktx_release();

    @NotNull
    public final Job launchWhenCreated(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt__Builders_commonKt.launch$default(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, function2, (Continuation) null), 3, (Object) null);
    }

    @NotNull
    public final Job launchWhenResumed(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt__Builders_commonKt.launch$default(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, function2, (Continuation) null), 3, (Object) null);
    }

    @NotNull
    public final Job launchWhenStarted(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt__Builders_commonKt.launch$default(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenStarted$1(this, function2, (Continuation) null), 3, (Object) null);
    }
}

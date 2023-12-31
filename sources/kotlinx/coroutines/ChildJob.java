package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, mo47991d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "parentCancelled", "", "parentJob", "Lkotlinx/coroutines/ParentJob;", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@InternalCoroutinesApi
/* compiled from: Job.kt */
public interface ChildJob extends Job {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Job.kt */
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull ChildJob childJob, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return Job.DefaultImpls.fold(childJob, r, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull ChildJob childJob, @NotNull CoroutineContext.Key<E> key) {
            return Job.DefaultImpls.get(childJob, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull ChildJob childJob, @NotNull CoroutineContext.Key<?> key) {
            return Job.DefaultImpls.minusKey(childJob, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull ChildJob childJob, @NotNull CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus((Job) childJob, coroutineContext);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static Job plus(@NotNull ChildJob childJob, @NotNull Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }

    @InternalCoroutinesApi
    void parentCancelled(@NotNull ParentJob parentJob);
}

package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DelicateCoroutinesApi
@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChild", "mergeForChild", "Lkotlin/coroutines/CoroutineContext;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext$Element;", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@ExperimentalCoroutinesApi
/* compiled from: ThreadContextElement.kt */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThreadContextElement.kt */
    public static final class DefaultImpls {
        public static <S, R> R fold(@NotNull CopyableThreadContextElement<S> copyableThreadContextElement, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E get(@NotNull CopyableThreadContextElement<S> copyableThreadContextElement, @NotNull CoroutineContext.Key<E> key) {
            return ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, key);
        }

        @NotNull
        public static <S> CoroutineContext minusKey(@NotNull CopyableThreadContextElement<S> copyableThreadContextElement, @NotNull CoroutineContext.Key<?> key) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, key);
        }

        @NotNull
        public static <S> CoroutineContext plus(@NotNull CopyableThreadContextElement<S> copyableThreadContextElement, @NotNull CoroutineContext coroutineContext) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, coroutineContext);
        }
    }

    @NotNull
    CopyableThreadContextElement<S> copyForChild();

    @NotNull
    CoroutineContext mergeForChild(@NotNull CoroutineContext.Element element);
}

package kotlin.sequences;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo47991d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements Function1<T, T> {
    public final /* synthetic */ Function0<T> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(Function0<? extends T> function0) {
        super(1);
        this.$nextFunction = function0;
    }

    @Nullable
    public final T invoke(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, LanguageConstKt.f15954it);
        return this.$nextFunction.invoke();
    }
}

package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo47991d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements Function1<T, Boolean> {
    public final /* synthetic */ T $element;
    public final /* synthetic */ Ref.BooleanRef $removed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$1$iterator$1(Ref.BooleanRef booleanRef, T t) {
        super(1);
        this.$removed = booleanRef;
        this.$element = t;
    }

    @NotNull
    public final Boolean invoke(T t) {
        boolean z = true;
        if (!this.$removed.element && Intrinsics.areEqual((Object) t, (Object) this.$element)) {
            this.$removed.element = true;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004"}, mo47991d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$minus$1 implements Sequence<T> {
    public final /* synthetic */ T $element;
    public final /* synthetic */ Sequence<T> $this_minus;

    public SequencesKt___SequencesKt$minus$1(Sequence<? extends T> sequence, T t) {
        this.$this_minus = sequence;
        this.$element = t;
    }

    @NotNull
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.filter(this.$this_minus, new SequencesKt___SequencesKt$minus$1$iterator$1(new Ref.BooleanRef(), this.$element)).iterator();
    }
}

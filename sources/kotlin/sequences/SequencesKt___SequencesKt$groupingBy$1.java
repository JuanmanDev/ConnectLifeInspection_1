package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0002\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¨\u0006\u0007"}, mo47991d2 = {"kotlin/sequences/SequencesKt___SequencesKt$groupingBy$1", "Lkotlin/collections/Grouping;", "keyOf", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 176)
/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$groupingBy$1 implements Grouping<T, K> {
    public final /* synthetic */ Function1<T, K> $keySelector;
    public final /* synthetic */ Sequence<T> $this_groupingBy;

    public SequencesKt___SequencesKt$groupingBy$1(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
        this.$this_groupingBy = sequence;
        this.$keySelector = function1;
    }

    public K keyOf(T t) {
        return this.$keySelector.invoke(t);
    }

    @NotNull
    public Iterator<T> sourceIterator() {
        return this.$this_groupingBy.iterator();
    }
}

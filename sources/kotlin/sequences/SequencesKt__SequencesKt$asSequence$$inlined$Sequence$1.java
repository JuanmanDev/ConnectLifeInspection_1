package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, mo47991d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 implements Sequence<T> {
    public final /* synthetic */ Iterator $this_asSequence$inlined;

    public SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(Iterator it) {
        this.$this_asSequence$inlined = it;
    }

    @NotNull
    public Iterator<T> iterator() {
        return this.$this_asSequence$inlined;
    }
}

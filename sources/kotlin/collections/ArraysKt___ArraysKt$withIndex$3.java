package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\n\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: _Arrays.kt */
public final class ArraysKt___ArraysKt$withIndex$3 extends Lambda implements Function0<Iterator<? extends Short>> {
    public final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$3(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    @NotNull
    public final Iterator<Short> invoke() {
        return ArrayIteratorsKt.iterator(this.$this_withIndex);
    }
}

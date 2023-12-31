package androidx.collection;

import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0003\u0010\b¨\u0006\t"}, mo47991d2 = {"K", "V", "Landroidx/collection/ArrayMap;", "arrayMapOf", "()Landroidx/collection/ArrayMap;", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Landroidx/collection/ArrayMap;", "collection-ktx"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: ArrayMap.kt */
public final class ArrayMapKt {
    @NotNull
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    @NotNull
    public static final <K, V> ArrayMap<K, V> arrayMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        ArrayMap<K, V> arrayMap = new ArrayMap<>(pairArr.length);
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}

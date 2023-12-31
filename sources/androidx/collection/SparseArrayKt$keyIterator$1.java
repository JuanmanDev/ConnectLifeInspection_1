package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, mo47991d2 = {"androidx/collection/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", "", "hasNext", "()Z", "", "nextInt", "()I", "index", "I", "getIndex", "setIndex", "(I)V", "collection-ktx"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: SparseArray.kt */
public final class SparseArrayKt$keyIterator$1 extends IntIterator {
    public final /* synthetic */ SparseArrayCompat $this_keyIterator;
    public int index;

    public SparseArrayKt$keyIterator$1(SparseArrayCompat<T> sparseArrayCompat) {
        this.$this_keyIterator = sparseArrayCompat;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    public int nextInt() {
        SparseArrayCompat sparseArrayCompat = this.$this_keyIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseArrayCompat.keyAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}

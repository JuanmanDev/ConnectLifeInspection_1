package p040c.p200q.p353b.p355b;

import com.google.common.collect.Range;
import java.lang.Comparable;

/* renamed from: c.q.b.b.k */
/* compiled from: AbstractRangeSet */
public abstract class C6018k<C extends Comparable> implements C5962e2<C> {
    public abstract void add(Range<C> range);

    public void addAll(C5962e2<C> e2Var) {
        addAll(e2Var.asRanges());
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(C5962e2<C> e2Var) {
        return enclosesAll(e2Var.asRanges());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5962e2) {
            return asRanges().equals(((C5962e2) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public abstract boolean intersects(Range<C> range);

    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public abstract Range<C> rangeContaining(C c);

    public abstract void remove(Range<C> range);

    public void removeAll(C5962e2<C> e2Var) {
        removeAll(e2Var.asRanges());
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void addAll(Iterable<Range<C>> iterable) {
        for (Range<C> add : iterable) {
            add(add);
        }
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        for (Range<C> encloses : iterable) {
            if (!encloses(encloses)) {
                return false;
            }
        }
        return true;
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        for (Range<C> remove : iterable) {
            remove(remove);
        }
    }
}

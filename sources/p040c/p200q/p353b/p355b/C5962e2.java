package p040c.p200q.p353b.p355b;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Set;

/* renamed from: c.q.b.b.e2 */
/* compiled from: RangeSet */
public interface C5962e2<C extends Comparable> {
    Set<Range<C>> asRanges();

    C5962e2<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(C5962e2<C> e2Var);
}

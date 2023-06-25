package p040c.p200q.p353b.p355b;

import java.util.Map;
import java.util.Set;

/* renamed from: c.q.b.b.d3 */
/* compiled from: Table */
public interface C5927d3<R, C, V> {

    /* renamed from: c.q.b.b.d3$a */
    /* compiled from: Table */
    public interface C5928a<R, C, V> {
        /* renamed from: a */
        C mo29197a();

        /* renamed from: b */
        R mo29198b();

        V getValue();
    }

    Set<C5928a<R, C, V>> cellSet();

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();
}

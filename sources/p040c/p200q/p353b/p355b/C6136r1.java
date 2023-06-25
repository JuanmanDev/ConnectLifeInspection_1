package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: c.q.b.b.r1 */
/* compiled from: Multimap */
public interface C6136r1<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}

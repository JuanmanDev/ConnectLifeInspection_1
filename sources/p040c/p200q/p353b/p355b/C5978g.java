package p040c.p200q.p353b.p355b;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5845j;

/* renamed from: c.q.b.b.g */
/* compiled from: AbstractMapEntry */
public abstract class C5978g<K, V> implements Map.Entry<K, V> {
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C5845j.m16576a(getKey(), entry.getKey()) || !C5845j.m16576a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + getValue();
    }
}

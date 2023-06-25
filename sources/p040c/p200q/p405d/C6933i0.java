package p040c.p200q.p405d;

import com.google.protobuf.MapFieldLite;
import java.util.Map;
import p040c.p200q.p405d.C6917g0;

/* renamed from: c.q.d.i0 */
/* compiled from: MapFieldSchemaLite */
public class C6933i0 implements C6930h0 {
    /* renamed from: i */
    public static <K, V> int m19946i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C6917g0 g0Var = (C6917g0) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += g0Var.mo31954a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> MapFieldLite<K, V> m19947j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: a */
    public Object mo32009a(Object obj, Object obj2) {
        return m19947j(obj, obj2);
    }

    /* renamed from: b */
    public Object mo32010b(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: c */
    public C6917g0.C6918a<?, ?> mo32011c(Object obj) {
        return ((C6917g0) obj).mo31955c();
    }

    /* renamed from: d */
    public Map<?, ?> mo32012d(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: e */
    public Object mo32013e(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: f */
    public int mo32014f(int i, Object obj, Object obj2) {
        return m19946i(i, obj, obj2);
    }

    /* renamed from: g */
    public boolean mo32015g(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    /* renamed from: h */
    public Map<?, ?> mo32016h(Object obj) {
        return (MapFieldLite) obj;
    }
}

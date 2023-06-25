package p040c.p200q.p405d;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.WireFormat;

/* renamed from: c.q.d.g0 */
/* compiled from: MapEntryLite */
public class C6917g0<K, V> {

    /* renamed from: a */
    public final C6918a<K, V> f13234a;

    /* renamed from: b */
    public final K f13235b;

    /* renamed from: c */
    public final V f13236c;

    /* renamed from: c.q.d.g0$a */
    /* compiled from: MapEntryLite */
    public static class C6918a<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f13237a;

        /* renamed from: b */
        public final K f13238b;

        /* renamed from: c */
        public final WireFormat.FieldType f13239c;

        /* renamed from: d */
        public final V f13240d;

        public C6918a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f13237a = fieldType;
            this.f13238b = k;
            this.f13239c = fieldType2;
            this.f13240d = v;
        }
    }

    public C6917g0(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f13234a = new C6918a<>(fieldType, k, fieldType2, v);
        this.f13235b = k;
        this.f13236c = v;
    }

    /* renamed from: b */
    public static <K, V> int m19888b(C6918a<K, V> aVar, K k, V v) {
        return C6988u.m20642d(aVar.f13237a, 1, k) + C6988u.m20642d(aVar.f13239c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C6917g0<K, V> m19889d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new C6917g0<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: e */
    public static <K, V> void m19890e(CodedOutputStream codedOutputStream, C6918a<K, V> aVar, K k, V v) {
        C6988u.m20650z(codedOutputStream, aVar.f13237a, 1, k);
        C6988u.m20650z(codedOutputStream, aVar.f13239c, 2, v);
    }

    /* renamed from: a */
    public int mo31954a(int i, K k, V v) {
        return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(m19888b(this.f13234a, k, v));
    }

    /* renamed from: c */
    public C6918a<K, V> mo31955c() {
        return this.f13234a;
    }
}

package p040c.p200q.p353b.p355b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p353b.p355b.C6153t1;

/* renamed from: c.q.b.b.q2 */
/* compiled from: Serialization */
public final class C6131q2 {

    /* renamed from: c.q.b.b.q2$b */
    /* compiled from: Serialization */
    public static final class C6133b<T> {

        /* renamed from: a */
        public final Field f11731a;

        /* renamed from: a */
        public void mo29954a(T t, int i) {
            try {
                this.f11731a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public void mo29955b(T t, Object obj) {
            try {
                this.f11731a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public C6133b(Field field) {
            this.f11731a = field;
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    public static <T> C6133b<T> m17221a(Class<T> cls, String str) {
        try {
            return new C6133b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static <K, V> void m17222b(Map<K, V> map, ObjectInputStream objectInputStream) {
        m17223c(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: c */
    public static <K, V> void m17223c(Map<K, V> map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: d */
    public static <K, V> void m17224d(C6136r1<K, V> r1Var, ObjectInputStream objectInputStream) {
        m17225e(r1Var, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: e */
    public static <K, V> void m17225e(C6136r1<K, V> r1Var, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection<V> collection = r1Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: f */
    public static <E> void m17226f(C6153t1<E> t1Var, ObjectInputStream objectInputStream) {
        m17227g(t1Var, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: g */
    public static <E> void m17227g(C6153t1<E> t1Var, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            t1Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: h */
    public static int m17228h(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    /* renamed from: i */
    public static <K, V> void m17229i(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: j */
    public static <K, V> void m17230j(C6136r1<K, V> r1Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(r1Var.asMap().size());
        for (Map.Entry next : r1Var.asMap().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: k */
    public static <E> void m17231k(C6153t1<E> t1Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(t1Var.entrySet().size());
        for (C6153t1.C6154a next : t1Var.entrySet()) {
            objectOutputStream.writeObject(next.mo29977a());
            objectOutputStream.writeInt(next.getCount());
        }
    }
}

package p648m.p657c.p658j;

import p648m.p657c.C9620c;
import p648m.p657c.C9622d;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.e */
/* compiled from: IsInstanceOf */
public class C9632e extends C9622d<Object> {

    /* renamed from: e */
    public final Class<?> f18862e;

    /* renamed from: l */
    public final Class<?> f18863l;

    public C9632e(Class<?> cls) {
        this.f18862e = cls;
        this.f18863l = m25868c(cls);
    }

    /* renamed from: b */
    public static <T> C9623e<T> m25867b(Class<T> cls) {
        return new C9632e(cls);
    }

    /* renamed from: c */
    public static Class<?> m25868c(Class<?> cls) {
        if (Boolean.TYPE.equals(cls)) {
            return Boolean.class;
        }
        if (Byte.TYPE.equals(cls)) {
            return Byte.class;
        }
        if (Character.TYPE.equals(cls)) {
            return Character.class;
        }
        if (Double.TYPE.equals(cls)) {
            return Double.class;
        }
        if (Float.TYPE.equals(cls)) {
            return Float.class;
        }
        if (Integer.TYPE.equals(cls)) {
            return Integer.class;
        }
        if (Long.TYPE.equals(cls)) {
            return Long.class;
        }
        return Short.TYPE.equals(cls) ? Short.class : cls;
    }

    /* renamed from: a */
    public boolean mo50313a(Object obj, C9620c cVar) {
        if (obj == null) {
            cVar.mo50300c("null");
            return false;
        } else if (this.f18863l.isInstance(obj)) {
            return true;
        } else {
            C9620c d = cVar.mo50301d(obj);
            d.mo50300c(" is a " + obj.getClass().getName());
            return false;
        }
    }

    public void describeTo(C9620c cVar) {
        cVar.mo50300c("an instance of ").mo50300c(this.f18862e.getName());
    }
}

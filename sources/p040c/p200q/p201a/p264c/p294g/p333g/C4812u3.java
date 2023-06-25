package p040c.p200q.p201a.p264c.p294g.p333g;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.g.u3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4812u3 implements PrivilegedExceptionAction {
    /* renamed from: a */
    public static final Unsafe m13221a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m13221a();
    }
}

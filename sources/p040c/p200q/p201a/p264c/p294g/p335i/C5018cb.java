package p040c.p200q.p201a.p264c.p294g.p335i;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.i.cb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5018cb implements PrivilegedExceptionAction {
    /* renamed from: a */
    public static final Unsafe m13953a() {
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
        return m13953a();
    }
}

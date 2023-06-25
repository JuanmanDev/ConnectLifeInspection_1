package p620g.p621a.p622d;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: g.a.d.f */
/* compiled from: UnsafeAccess */
public class C9364f {

    /* renamed from: a */
    public static final Unsafe f18379a;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException unused) {
            try {
                field = Unsafe.class.getDeclaredField("THE_ONE");
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        field.setAccessible(true);
        f18379a = (Unsafe) field.get((Object) null);
    }
}

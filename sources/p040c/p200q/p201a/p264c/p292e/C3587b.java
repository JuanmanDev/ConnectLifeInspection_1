package p040c.p200q.p201a.p264c.p292e;

import android.os.IBinder;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p292e.C3585a;

/* renamed from: c.q.a.c.e.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3587b<T> extends C3585a.C3586a {

    /* renamed from: e */
    public final Object f6566e;

    public C3587b(Object obj) {
        this.f6566e = obj;
    }

    @NonNull
    /* renamed from: g */
    public static <T> T m9123g(@NonNull C3585a aVar) {
        if (aVar instanceof C3587b) {
            return ((C3587b) aVar).f6566e;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C3495o.m8908j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    @NonNull
    /* renamed from: k */
    public static <T> C3585a m9124k(@NonNull T t) {
        return new C3587b(t);
    }
}

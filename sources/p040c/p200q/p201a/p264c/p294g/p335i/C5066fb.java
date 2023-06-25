package p040c.p200q.p201a.p264c.p294g.p335i;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.i.fb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5066fb {

    /* renamed from: a */
    public final Unsafe f9894a;

    public C5066fb(Unsafe unsafe) {
        this.f9894a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo27170a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo27171b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo27172c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo27173d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo27174e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo27175f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo27176g(Object obj, long j);

    /* renamed from: h */
    public final int mo27246h(Class cls) {
        return this.f9894a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo27247i(Class cls) {
        return this.f9894a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo27248j(Object obj, long j) {
        return this.f9894a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo27249k(Object obj, long j) {
        return this.f9894a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo27250l(Field field) {
        return this.f9894a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo27251m(Object obj, long j) {
        return this.f9894a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo27252n(Object obj, long j, int i) {
        this.f9894a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo27253o(Object obj, long j, long j2) {
        this.f9894a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo27254p(Object obj, long j, Object obj2) {
        this.f9894a.putObject(obj, j, obj2);
    }
}

package p040c.p200q.p201a.p264c.p294g.p333g;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.g.x3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4890x3 {

    /* renamed from: a */
    public final Unsafe f9729a;

    public C4890x3(Unsafe unsafe) {
        this.f9729a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo26766a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo26767b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo26768c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo26769d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo26770e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo26771f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo26772g(Object obj, long j);

    /* renamed from: h */
    public final int mo26812h(Class cls) {
        return this.f9729a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo26813i(Class cls) {
        return this.f9729a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo26814j(Object obj, long j) {
        return this.f9729a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo26815k(Object obj, long j) {
        return this.f9729a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo26816l(Field field) {
        return this.f9729a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo26817m(Object obj, long j) {
        return this.f9729a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo26818n(Object obj, long j, int i) {
        this.f9729a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo26819o(Object obj, long j, long j2) {
        this.f9729a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo26820p(Object obj, long j, Object obj2) {
        this.f9729a.putObject(obj, j, obj2);
    }
}

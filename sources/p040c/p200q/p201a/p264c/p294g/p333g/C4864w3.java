package p040c.p200q.p201a.p264c.p294g.p333g;

import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.g.w3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4864w3 extends C4890x3 {
    public C4864w3(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo26766a(Object obj, long j) {
        return Double.longBitsToDouble(mo26815k(obj, j));
    }

    /* renamed from: b */
    public final float mo26767b(Object obj, long j) {
        return Float.intBitsToFloat(mo26814j(obj, j));
    }

    /* renamed from: c */
    public final void mo26768c(Object obj, long j, boolean z) {
        if (C4916y3.f9749h) {
            C4916y3.m13548d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C4916y3.m13549e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo26769d(Object obj, long j, byte b) {
        if (C4916y3.f9749h) {
            C4916y3.m13548d(obj, j, b);
        } else {
            C4916y3.m13549e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo26770e(Object obj, long j, double d) {
        mo26819o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo26771f(Object obj, long j, float f) {
        mo26818n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo26772g(Object obj, long j) {
        if (C4916y3.f9749h) {
            return C4916y3.m13569y(obj, j);
        }
        return C4916y3.m13570z(obj, j);
    }
}

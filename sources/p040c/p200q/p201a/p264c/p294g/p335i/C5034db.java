package p040c.p200q.p201a.p264c.p294g.p335i;

import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.i.db */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5034db extends C5066fb {
    public C5034db(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo27170a(Object obj, long j) {
        return Double.longBitsToDouble(mo27249k(obj, j));
    }

    /* renamed from: b */
    public final float mo27171b(Object obj, long j) {
        return Float.intBitsToFloat(mo27248j(obj, j));
    }

    /* renamed from: c */
    public final void mo27172c(Object obj, long j, boolean z) {
        if (C5082gb.f9916h) {
            C5082gb.m14148d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C5082gb.m14149e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo27173d(Object obj, long j, byte b) {
        if (C5082gb.f9916h) {
            C5082gb.m14148d(obj, j, b);
        } else {
            C5082gb.m14149e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo27174e(Object obj, long j, double d) {
        mo27253o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo27175f(Object obj, long j, float f) {
        mo27252n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo27176g(Object obj, long j) {
        if (C5082gb.f9916h) {
            return C5082gb.m14169y(obj, j);
        }
        return C5082gb.m14170z(obj, j);
    }
}

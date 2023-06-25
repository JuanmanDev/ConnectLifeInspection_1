package p040c.p200q.p201a.p264c.p294g.p300f;

import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: c.q.a.c.g.f.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3649g {
    /* renamed from: a */
    public static Object[] m9191a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}

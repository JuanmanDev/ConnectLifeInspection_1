package p040c.p200q.p353b.p355b;

/* renamed from: c.q.b.b.z0 */
/* compiled from: Hashing */
public final class C6204z0 {
    /* renamed from: a */
    public static int m17450a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static boolean m17451b(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    /* renamed from: c */
    public static int m17452c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: d */
    public static int m17453d(Object obj) {
        return m17452c(obj == null ? 0 : obj.hashCode());
    }
}

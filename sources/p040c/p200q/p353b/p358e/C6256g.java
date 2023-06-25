package p040c.p200q.p353b.p358e;

import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.g */
/* compiled from: UnsignedBytes */
public final class C6256g {
    /* renamed from: a */
    public static byte m17595a(long j) {
        C5850m.m16587h((j >> 8) == 0, "out of range: %s", j);
        return (byte) ((int) j);
    }

    /* renamed from: b */
    public static int m17596b(byte b) {
        return b & 255;
    }
}

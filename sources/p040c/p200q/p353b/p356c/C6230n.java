package p040c.p200q.p353b.p356c;

import androidx.core.graphics.PaintCompat;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import p040c.p200q.p201a.p264c.p294g.p333g.C4569l;
import sun.misc.Unsafe;

/* renamed from: c.q.b.c.n */
/* compiled from: Striped64 */
public abstract class C6230n extends Number {

    /* renamed from: n */
    public static final ThreadLocal<int[]> f11839n = new ThreadLocal<>();

    /* renamed from: o */
    public static final Random f11840o = new Random();

    /* renamed from: p */
    public static final int f11841p = Runtime.getRuntime().availableProcessors();

    /* renamed from: q */
    public static final Unsafe f11842q;

    /* renamed from: r */
    public static final long f11843r;

    /* renamed from: s */
    public static final long f11844s;

    /* renamed from: e */
    public volatile transient C6232b[] f11845e;

    /* renamed from: l */
    public volatile transient long f11846l;

    /* renamed from: m */
    public volatile transient int f11847m;

    /* renamed from: c.q.b.c.n$a */
    /* compiled from: Striped64 */
    public static class C6231a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: c.q.b.c.n$b */
    /* compiled from: Striped64 */
    public static final class C6232b {

        /* renamed from: b */
        public static final Unsafe f11848b;

        /* renamed from: c */
        public static final long f11849c;

        /* renamed from: a */
        public volatile long f11850a;

        static {
            try {
                Unsafe b = C6230n.m17523f();
                f11848b = b;
                f11849c = b.objectFieldOffset(C6232b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C6232b(long j) {
            this.f11850a = j;
        }

        /* renamed from: a */
        public final boolean mo30224a(long j, long j2) {
            return f11848b.compareAndSwapLong(this, f11849c, j, j2);
        }
    }

    static {
        try {
            Unsafe f = m17523f();
            f11842q = f;
            Class<C6230n> cls = C6230n.class;
            f11843r = f.objectFieldOffset(cls.getDeclaredField(C4569l.f9345A));
            f11844s = f11842q.objectFieldOffset(cls.getDeclaredField(PaintCompat.EM_STRING));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new p040c.p200q.p353b.p356c.C6230n.C6231a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m17523f() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            c.q.b.c.n$a r0 = new c.q.b.c.n$a     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p356c.C6230n.m17523f():sun.misc.Unsafe");
    }

    /* renamed from: c */
    public final boolean mo30219c(long j, long j2) {
        return f11842q.compareAndSwapLong(this, f11843r, j, j2);
    }

    /* renamed from: d */
    public final boolean mo30220d() {
        return f11842q.compareAndSwapInt(this, f11844s, 0, 1);
    }

    /* renamed from: e */
    public abstract long mo30210e(long j, long j2);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0023 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30221g(long r17, int[] r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 1
            r4 = 0
            if (r19 != 0) goto L_0x001b
            java.lang.ThreadLocal<int[]> r5 = f11839n
            int[] r6 = new int[r0]
            r5.set(r6)
            java.util.Random r5 = f11840o
            int r5 = r5.nextInt()
            if (r5 != 0) goto L_0x0018
            r5 = r0
        L_0x0018:
            r6[r4] = r5
            goto L_0x001f
        L_0x001b:
            r5 = r19[r4]
            r6 = r19
        L_0x001f:
            r8 = r4
            r7 = r5
            r5 = r20
        L_0x0023:
            c.q.b.c.n$b[] r9 = r1.f11845e
            if (r9 == 0) goto L_0x00b6
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00b6
            int r11 = r10 + -1
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0063
            int r9 = r1.f11847m
            if (r9 != 0) goto L_0x0061
            c.q.b.c.n$b r9 = new c.q.b.c.n$b
            r9.<init>(r2)
            int r10 = r1.f11847m
            if (r10 != 0) goto L_0x0061
            boolean r10 = r16.mo30220d()
            if (r10 == 0) goto L_0x0061
            c.q.b.c.n$b[] r10 = r1.f11845e     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x0056
            int r11 = r10.length     // Catch:{ all -> 0x005d }
            if (r11 <= 0) goto L_0x0056
            int r11 = r11 + -1
            r11 = r11 & r7
            r12 = r10[r11]     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x0056
            r10[r11] = r9     // Catch:{ all -> 0x005d }
            r9 = r0
            goto L_0x0057
        L_0x0056:
            r9 = r4
        L_0x0057:
            r1.f11847m = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x005d:
            r0 = move-exception
            r1.f11847m = r4
            throw r0
        L_0x0061:
            r8 = r4
            goto L_0x00a9
        L_0x0063:
            if (r5 != 0) goto L_0x0067
            r5 = r0
            goto L_0x00a9
        L_0x0067:
            long r12 = r11.f11850a
            long r14 = r1.mo30210e(r12, r2)
            boolean r11 = r11.mo30224a(r12, r14)
            if (r11 == 0) goto L_0x0075
            goto L_0x00ee
        L_0x0075:
            int r11 = f11841p
            if (r10 >= r11) goto L_0x0061
            c.q.b.c.n$b[] r11 = r1.f11845e
            if (r11 == r9) goto L_0x007e
            goto L_0x0061
        L_0x007e:
            if (r8 != 0) goto L_0x0082
            r8 = r0
            goto L_0x00a9
        L_0x0082:
            int r11 = r1.f11847m
            if (r11 != 0) goto L_0x00a9
            boolean r11 = r16.mo30220d()
            if (r11 == 0) goto L_0x00a9
            c.q.b.c.n$b[] r8 = r1.f11845e     // Catch:{ all -> 0x00a5 }
            if (r8 != r9) goto L_0x00a0
            int r8 = r10 << 1
            c.q.b.c.n$b[] r8 = new p040c.p200q.p353b.p356c.C6230n.C6232b[r8]     // Catch:{ all -> 0x00a5 }
            r11 = r4
        L_0x0095:
            if (r11 >= r10) goto L_0x009e
            r12 = r9[r11]     // Catch:{ all -> 0x00a5 }
            r8[r11] = r12     // Catch:{ all -> 0x00a5 }
            int r11 = r11 + 1
            goto L_0x0095
        L_0x009e:
            r1.f11845e = r8     // Catch:{ all -> 0x00a5 }
        L_0x00a0:
            r1.f11847m = r4
            r8 = r4
            goto L_0x0023
        L_0x00a5:
            r0 = move-exception
            r1.f11847m = r4
            throw r0
        L_0x00a9:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r6[r4] = r7
            goto L_0x0023
        L_0x00b6:
            int r10 = r1.f11847m
            if (r10 != 0) goto L_0x00e2
            c.q.b.c.n$b[] r10 = r1.f11845e
            if (r10 != r9) goto L_0x00e2
            boolean r10 = r16.mo30220d()
            if (r10 == 0) goto L_0x00e2
            c.q.b.c.n$b[] r10 = r1.f11845e     // Catch:{ all -> 0x00de }
            if (r10 != r9) goto L_0x00d8
            r9 = 2
            c.q.b.c.n$b[] r9 = new p040c.p200q.p353b.p356c.C6230n.C6232b[r9]     // Catch:{ all -> 0x00de }
            r10 = r7 & 1
            c.q.b.c.n$b r11 = new c.q.b.c.n$b     // Catch:{ all -> 0x00de }
            r11.<init>(r2)     // Catch:{ all -> 0x00de }
            r9[r10] = r11     // Catch:{ all -> 0x00de }
            r1.f11845e = r9     // Catch:{ all -> 0x00de }
            r9 = r0
            goto L_0x00d9
        L_0x00d8:
            r9 = r4
        L_0x00d9:
            r1.f11847m = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x00de:
            r0 = move-exception
            r1.f11847m = r4
            throw r0
        L_0x00e2:
            long r9 = r1.f11846l
            long r11 = r1.mo30210e(r9, r2)
            boolean r9 = r1.mo30219c(r9, r11)
            if (r9 == 0) goto L_0x0023
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p356c.C6230n.mo30221g(long, int[], boolean):void");
    }
}

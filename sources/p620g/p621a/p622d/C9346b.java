package p620g.p621a.p622d;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import java.lang.Thread;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.Permission;
import java.security.Permissions;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java9.util.concurrent.CountedCompleter;
import java9.util.concurrent.ForkJoinTask;
import kotlin.UShort;
import okhttp3.internal.p700ws.RealWebSocket;
import p040c.p077d.p078a.p080j.C1564e;
import p620g.p621a.C9335b;
import p620g.p621a.p622d.C9356c;
import p620g.p621a.p623e.C9365a;
import sun.misc.Unsafe;

/* renamed from: g.a.d.b */
/* compiled from: ForkJoinPool */
public class C9346b extends AbstractExecutorService {

    /* renamed from: A */
    public static int f18317A;

    /* renamed from: B */
    public static final Unsafe f18318B;

    /* renamed from: C */
    public static final long f18319C;

    /* renamed from: D */
    public static final long f18320D;

    /* renamed from: E */
    public static final int f18321E;

    /* renamed from: F */
    public static final int f18322F;

    /* renamed from: G */
    public static final Class<?> f18323G;

    /* renamed from: v */
    public static final C9350c f18324v;

    /* renamed from: w */
    public static final RuntimePermission f18325w = new RuntimePermission("modifyThread");

    /* renamed from: x */
    public static final C9346b f18326x;

    /* renamed from: y */
    public static final int f18327y;

    /* renamed from: z */
    public static final int f18328z;

    /* renamed from: e */
    public volatile long f18329e;

    /* renamed from: l */
    public volatile long f18330l;

    /* renamed from: m */
    public final long f18331m;

    /* renamed from: n */
    public int f18332n;

    /* renamed from: o */
    public final int f18333o;

    /* renamed from: p */
    public volatile int f18334p;

    /* renamed from: q */
    public C9355g[] f18335q;

    /* renamed from: r */
    public final String f18336r;

    /* renamed from: s */
    public final C9350c f18337s;

    /* renamed from: t */
    public final Thread.UncaughtExceptionHandler f18338t;

    /* renamed from: u */
    public final C9365a<? super C9346b> f18339u;

    /* renamed from: g.a.d.b$a */
    /* compiled from: ForkJoinPool */
    public static class C9347a implements PrivilegedAction<C9346b> {
        /* renamed from: a */
        public C9346b run() {
            return new C9346b((byte) 0, (C9347a) null);
        }
    }

    /* renamed from: g.a.d.b$b */
    /* compiled from: ForkJoinPool */
    public static final class C9348b implements C9350c {

        /* renamed from: a */
        public static final AccessControlContext f18340a = C9346b.m25211f(new RuntimePermission("getClassLoader"));

        /* renamed from: g.a.d.b$b$a */
        /* compiled from: ForkJoinPool */
        public class C9349a implements PrivilegedAction<C9356c> {

            /* renamed from: a */
            public final /* synthetic */ C9346b f18341a;

            public C9349a(C9348b bVar, C9346b bVar2) {
                this.f18341a = bVar2;
            }

            /* renamed from: a */
            public C9356c run() {
                return new C9356c(this.f18341a, ClassLoader.getSystemClassLoader());
            }
        }

        public C9348b() {
        }

        /* renamed from: a */
        public final C9356c mo47245a(C9346b bVar) {
            return (C9356c) AccessController.doPrivileged(new C9349a(this, bVar), f18340a);
        }

        public /* synthetic */ C9348b(C9347a aVar) {
            this();
        }
    }

    /* renamed from: g.a.d.b$c */
    /* compiled from: ForkJoinPool */
    public interface C9350c {
        /* renamed from: a */
        C9356c mo47245a(C9346b bVar);
    }

    /* renamed from: g.a.d.b$d */
    /* compiled from: ForkJoinPool */
    public static final class C9351d implements C9350c {

        /* renamed from: a */
        public static final AccessControlContext f18342a = C9346b.m25211f(C9346b.f18325w, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

        /* renamed from: g.a.d.b$d$a */
        /* compiled from: ForkJoinPool */
        public class C9352a implements PrivilegedAction<C9356c> {

            /* renamed from: a */
            public final /* synthetic */ C9346b f18343a;

            public C9352a(C9351d dVar, C9346b bVar) {
                this.f18343a = bVar;
            }

            /* renamed from: a */
            public C9356c run() {
                return new C9356c.C9357a(this.f18343a);
            }
        }

        public C9351d() {
        }

        /* renamed from: a */
        public final C9356c mo47245a(C9346b bVar) {
            return (C9356c) AccessController.doPrivileged(new C9352a(this, bVar), f18342a);
        }

        public /* synthetic */ C9351d(C9347a aVar) {
            this();
        }
    }

    /* renamed from: g.a.d.b$e */
    /* compiled from: ForkJoinPool */
    public interface C9353e {
        /* renamed from: a */
        boolean mo47204a();

        /* renamed from: b */
        boolean mo47205b();
    }

    /* renamed from: g.a.d.b$f */
    /* compiled from: ForkJoinPool */
    public static final class C9354f {

        /* renamed from: a */
        public static final C9359d f18344a = new C9359d();

        /* renamed from: b */
        public static final Unsafe f18345b;

        /* renamed from: c */
        public static final long f18346c;

        static {
            Unsafe unsafe = C9364f.f18379a;
            f18345b = unsafe;
            try {
                f18346c = unsafe.objectFieldOffset(C9359d.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new ExceptionInInitializerError(e);
            }
        }

        /* renamed from: a */
        public static void m25252a() {
            f18345b.putIntVolatile(f18344a, f18346c, 0);
        }

        /* renamed from: b */
        public static void m25253b() {
            f18345b.putOrderedInt(f18344a, f18346c, 0);
        }
    }

    /* renamed from: g.a.d.b$g */
    /* compiled from: ForkJoinPool */
    public static final class C9355g {

        /* renamed from: k */
        public static final Unsafe f18347k;

        /* renamed from: l */
        public static final long f18348l;

        /* renamed from: m */
        public static final int f18349m;

        /* renamed from: n */
        public static final int f18350n;

        /* renamed from: a */
        public volatile int f18351a;

        /* renamed from: b */
        public int f18352b;

        /* renamed from: c */
        public int f18353c;

        /* renamed from: d */
        public int f18354d;

        /* renamed from: e */
        public volatile int f18355e;

        /* renamed from: f */
        public volatile int f18356f = 4096;

        /* renamed from: g */
        public int f18357g = 4096;

        /* renamed from: h */
        public ForkJoinTask<?>[] f18358h;

        /* renamed from: i */
        public final C9346b f18359i;

        /* renamed from: j */
        public final C9356c f18360j;

        static {
            Unsafe unsafe = C9364f.f18379a;
            f18347k = unsafe;
            try {
                f18348l = unsafe.objectFieldOffset(C9355g.class.getDeclaredField("a"));
                f18349m = f18347k.arrayBaseOffset(ForkJoinTask[].class);
                int arrayIndexScale = f18347k.arrayIndexScale(ForkJoinTask[].class);
                if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                    f18350n = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                    return;
                }
                throw new ExceptionInInitializerError("array index scale not a power of two");
            } catch (Exception e) {
                throw new ExceptionInInitializerError(e);
            }
        }

        public C9355g(C9346b bVar, C9356c cVar) {
            this.f18359i = bVar;
            this.f18360j = cVar;
        }

        /* renamed from: a */
        public final void mo47250a() {
            while (true) {
                ForkJoinTask<?> i = mo47258i();
                if (i != null) {
                    ForkJoinTask.cancelIgnoringExceptions(i);
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java9.util.concurrent.ForkJoinTask<?>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java9.util.concurrent.ForkJoinTask<?>[] mo47251b() {
            /*
                r13 = this;
                java9.util.concurrent.ForkJoinTask<?>[] r6 = r13.f18358h
                if (r6 == 0) goto L_0x0006
                int r0 = r6.length
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                r1 = 8192(0x2000, float:1.14794E-41)
                if (r0 <= 0) goto L_0x000e
                int r2 = r0 << 1
                goto L_0x000f
            L_0x000e:
                r2 = r1
            L_0x000f:
                if (r2 < r1) goto L_0x0056
                r1 = 67108864(0x4000000, float:1.5046328E-36)
                if (r2 > r1) goto L_0x0056
                java9.util.concurrent.ForkJoinTask[] r7 = new java9.util.concurrent.ForkJoinTask[r2]
                r13.f18358h = r7
                if (r6 == 0) goto L_0x0055
                int r8 = r0 + -1
                if (r8 <= 0) goto L_0x0055
                int r9 = r13.f18357g
                int r0 = r13.f18356f
                int r1 = r9 - r0
                if (r1 <= 0) goto L_0x0055
                int r10 = r2 + -1
                r11 = r0
            L_0x002a:
                r0 = r11 & r8
                long r0 = (long) r0
                int r2 = f18350n
                long r0 = r0 << r2
                int r2 = f18349m
                long r2 = (long) r2
                long r2 = r2 + r0
                sun.misc.Unsafe r0 = f18347k
                java.lang.Object r0 = r0.getObjectVolatile(r6, r2)
                r12 = r0
                java9.util.concurrent.ForkJoinTask r12 = (java9.util.concurrent.ForkJoinTask) r12
                if (r12 == 0) goto L_0x004e
                sun.misc.Unsafe r0 = f18347k
                r5 = 0
                r1 = r6
                r4 = r12
                boolean r0 = r0.compareAndSwapObject(r1, r2, r4, r5)
                if (r0 == 0) goto L_0x004e
                r0 = r11 & r10
                r7[r0] = r12
            L_0x004e:
                int r11 = r11 + 1
                if (r11 != r9) goto L_0x002a
                p620g.p621a.p622d.C9346b.C9354f.m25253b()
            L_0x0055:
                return r7
            L_0x0056:
                java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
                java.lang.String r1 = "Queue capacity exceeded"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.C9355g.mo47251b():java9.util.concurrent.ForkJoinTask[]");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.getState();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo47252c() {
            /*
                r2 = this;
                g.a.d.c r0 = r2.f18360j
                if (r0 == 0) goto L_0x0016
                java.lang.Thread$State r0 = r0.getState()
                java.lang.Thread$State r1 = java.lang.Thread.State.BLOCKED
                if (r0 == r1) goto L_0x0016
                java.lang.Thread$State r1 = java.lang.Thread.State.WAITING
                if (r0 == r1) goto L_0x0016
                java.lang.Thread$State r1 = java.lang.Thread.State.TIMED_WAITING
                if (r0 == r1) goto L_0x0016
                r0 = 1
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.C9355g.mo47252c():boolean");
        }

        /* renamed from: d */
        public final int mo47253d(CountedCompleter<?> countedCompleter, int i) {
            boolean z;
            int i2;
            int length;
            if (countedCompleter == null) {
                return 0;
            }
            int i3 = countedCompleter.status;
            if (i3 < 0) {
                return i3;
            }
            while (true) {
                int i4 = this.f18356f;
                int i5 = this.f18357g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
                if (forkJoinTaskArr != null && i4 != i5 && (length = forkJoinTaskArr.length) > 0) {
                    int i6 = i5 - 1;
                    long j = (((long) ((length - 1) & i6)) << f18350n) + ((long) f18349m);
                    ForkJoinTask forkJoinTask = (ForkJoinTask) f18347k.getObject(forkJoinTaskArr, j);
                    if (forkJoinTask instanceof CountedCompleter) {
                        CountedCompleter<?> countedCompleter2 = (CountedCompleter) forkJoinTask;
                        CountedCompleter<?> countedCompleter3 = countedCompleter2;
                        while (true) {
                            if (countedCompleter3 != countedCompleter) {
                                countedCompleter3 = countedCompleter3.completer;
                                if (countedCompleter3 == null) {
                                    break;
                                }
                            } else if (f18347k.compareAndSwapObject(forkJoinTaskArr, j, countedCompleter2, (Object) null)) {
                                this.f18357g = i6;
                                C9354f.m25253b();
                                countedCompleter2.doExec();
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                i2 = countedCompleter.status;
                if (i2 < 0 || !z || (i != 0 && i - 1 == 0)) {
                }
            }
            return i2;
        }

        /* renamed from: e */
        public final void mo47254e(int i) {
            int i2;
            int length;
            do {
                int i3 = 0;
                while (true) {
                    int i4 = this.f18356f;
                    int i5 = this.f18357g;
                    ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
                    if (forkJoinTaskArr != null && (i2 = i4 - i5) < 0 && (length = forkJoinTaskArr.length) > 0) {
                        int i6 = i4 + 1;
                        ForkJoinTask forkJoinTask = (ForkJoinTask) C9346b.m25213m(forkJoinTaskArr, (((long) (i4 & (length - 1))) << f18350n) + ((long) f18349m), (Object) null);
                        if (forkJoinTask != null) {
                            this.f18356f = i6;
                            forkJoinTask.doExec();
                            if (i != 0 && (i3 = i3 + 1) == i) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } while (i2 != -1);
        }

        /* renamed from: f */
        public final void mo47255f(int i) {
            int length;
            while (true) {
                int i2 = this.f18356f;
                int i3 = this.f18357g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
                if (forkJoinTaskArr != null && i2 != i3 && (length = forkJoinTaskArr.length) > 0) {
                    int i4 = i3 - 1;
                    ForkJoinTask forkJoinTask = (ForkJoinTask) C9346b.m25213m(forkJoinTaskArr, (((long) ((length - 1) & i4)) << f18350n) + ((long) f18349m), (Object) null);
                    if (forkJoinTask != null) {
                        this.f18357g = i4;
                        C9354f.m25253b();
                        forkJoinTask.doExec();
                        if (i != 0 && i - 1 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public final ForkJoinTask<?> mo47256g() {
            return (this.f18354d & 65536) != 0 ? mo47258i() : mo47259j();
        }

        /* renamed from: h */
        public final ForkJoinTask<?> mo47257h() {
            int length;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
            if (forkJoinTaskArr == null || (length = forkJoinTaskArr.length) <= 0) {
                return null;
            }
            return forkJoinTaskArr[(length - 1) & ((this.f18354d & 65536) != 0 ? this.f18356f : this.f18357g - 1)];
        }

        /* renamed from: i */
        public final ForkJoinTask<?> mo47258i() {
            int i;
            int length;
            while (true) {
                int i2 = this.f18356f;
                int i3 = this.f18357g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
                if (forkJoinTaskArr == null || (i = i2 - i3) >= 0 || (length = forkJoinTaskArr.length) <= 0) {
                    return null;
                }
                long j = (((long) ((length - 1) & i2)) << f18350n) + ((long) f18349m);
                ForkJoinTask<?> forkJoinTask = (ForkJoinTask) f18347k.getObjectVolatile(forkJoinTaskArr, j);
                int i4 = i2 + 1;
                if (i2 == this.f18356f) {
                    if (forkJoinTask != null) {
                        if (f18347k.compareAndSwapObject(forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                            this.f18356f = i4;
                            return forkJoinTask;
                        }
                    } else if (i == -1) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: j */
        public final ForkJoinTask<?> mo47259j() {
            int length;
            int i = this.f18356f;
            int i2 = this.f18357g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
            if (forkJoinTaskArr == null || i == i2 || (length = forkJoinTaskArr.length) <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            long j = (((long) ((length - 1) & i3)) << f18350n) + ((long) f18349m);
            ForkJoinTask<?> forkJoinTask = (ForkJoinTask) f18347k.getObject(forkJoinTaskArr, j);
            if (forkJoinTask == null || !f18347k.compareAndSwapObject(forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                return null;
            }
            this.f18357g = i3;
            C9354f.m25253b();
            return forkJoinTask;
        }

        /* renamed from: k */
        public final void mo47260k(ForkJoinTask<?> forkJoinTask) {
            int length;
            int i = this.f18357g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
            if (forkJoinTaskArr != null && (length = forkJoinTaskArr.length) > 0) {
                long j = (((long) ((length - 1) & i)) << f18350n) + ((long) f18349m);
                C9346b bVar = this.f18359i;
                this.f18357g = i + 1;
                f18347k.putOrderedObject(forkJoinTaskArr, j, forkJoinTask);
                int i2 = this.f18356f - i;
                if (i2 == 0 && bVar != null) {
                    C9354f.m25252a();
                    bVar.mo47209D();
                } else if (i2 + length == 1) {
                    mo47251b();
                }
            }
        }

        /* renamed from: l */
        public final int mo47261l() {
            int i = this.f18356f - this.f18357g;
            if (i >= 0) {
                return 0;
            }
            return -i;
        }

        /* JADX WARNING: type inference failed for: r0v11, types: [java9.util.concurrent.ForkJoinTask] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo47262m(java9.util.concurrent.CountedCompleter<?> r19, int r20) {
            /*
                r18 = this;
                r6 = r18
                r7 = r19
                r8 = 0
                if (r7 == 0) goto L_0x0086
                int r0 = r7.status
                if (r0 < 0) goto L_0x0085
                r9 = r20
            L_0x000d:
                int r0 = r6.f18356f
                int r10 = r6.f18357g
                java9.util.concurrent.ForkJoinTask<?>[] r12 = r6.f18358h
                if (r12 == 0) goto L_0x0076
                if (r0 == r10) goto L_0x0076
                int r0 = r12.length
                if (r0 <= 0) goto L_0x0076
                int r0 = r0 + -1
                int r15 = r10 + -1
                r0 = r0 & r15
                long r0 = (long) r0
                int r2 = f18350n
                long r0 = r0 << r2
                int r2 = f18349m
                long r2 = (long) r2
                long r13 = r0 + r2
                sun.misc.Unsafe r0 = f18347k
                java.lang.Object r0 = r0.getObject(r12, r13)
                java9.util.concurrent.ForkJoinTask r0 = (java9.util.concurrent.ForkJoinTask) r0
                boolean r1 = r0 instanceof java9.util.concurrent.CountedCompleter
                if (r1 == 0) goto L_0x0076
                r17 = r0
                java9.util.concurrent.CountedCompleter r17 = (java9.util.concurrent.CountedCompleter) r17
                r0 = r17
            L_0x003a:
                if (r0 == r7) goto L_0x0041
                java9.util.concurrent.CountedCompleter<?> r0 = r0.completer
                if (r0 != 0) goto L_0x003a
                goto L_0x0076
            L_0x0041:
                sun.misc.Unsafe r0 = f18347k
                long r2 = f18348l
                r4 = 0
                r5 = 1
                r1 = r18
                boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
                if (r0 == 0) goto L_0x0076
                int r0 = r6.f18357g
                if (r0 != r10) goto L_0x0068
                java9.util.concurrent.ForkJoinTask<?>[] r0 = r6.f18358h
                if (r0 != r12) goto L_0x0068
                sun.misc.Unsafe r11 = f18347k
                r16 = 0
                r10 = r15
                r15 = r17
                boolean r0 = r11.compareAndSwapObject(r12, r13, r15, r16)
                if (r0 == 0) goto L_0x0068
                r6.f18357g = r10
                r0 = 1
                goto L_0x0069
            L_0x0068:
                r0 = r8
            L_0x0069:
                sun.misc.Unsafe r1 = f18347k
                long r2 = f18348l
                r1.putOrderedInt(r6, r2, r8)
                if (r0 == 0) goto L_0x0077
                r17.doExec()
                goto L_0x0077
            L_0x0076:
                r0 = r8
            L_0x0077:
                int r1 = r7.status
                if (r1 < 0) goto L_0x0083
                if (r0 == 0) goto L_0x0083
                if (r9 == 0) goto L_0x000d
                int r9 = r9 + -1
                if (r9 != 0) goto L_0x000d
            L_0x0083:
                r8 = r1
                goto L_0x0086
            L_0x0085:
                r8 = r0
            L_0x0086:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.C9355g.mo47262m(java9.util.concurrent.CountedCompleter, int):int");
        }

        /* renamed from: n */
        public final boolean mo47263n() {
            return f18347k.compareAndSwapInt(this, f18348l, 0, 1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java9.util.concurrent.ForkJoinTask<?>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47264o(java9.util.concurrent.ForkJoinTask<?> r12) {
            /*
                r11 = this;
                int r0 = r11.f18356f
                int r1 = r11.f18357g
                int r0 = r0 - r1
                if (r0 >= 0) goto L_0x006c
                java9.util.concurrent.ForkJoinTask<?>[] r0 = r11.f18358h
                if (r0 == 0) goto L_0x006c
                int r2 = r0.length
                if (r2 <= 0) goto L_0x006c
                int r8 = r2 + -1
                int r1 = r1 + -1
                r9 = r1
            L_0x0013:
                r2 = r9 & r8
                int r3 = f18350n
                int r2 = r2 << r3
                int r3 = f18349m
                int r2 = r2 + r3
                long r4 = (long) r2
                sun.misc.Unsafe r2 = f18347k
                java.lang.Object r2 = r2.getObject(r0, r4)
                r10 = r2
                java9.util.concurrent.ForkJoinTask r10 = (java9.util.concurrent.ForkJoinTask) r10
                if (r10 != 0) goto L_0x0028
                goto L_0x006c
            L_0x0028:
                if (r10 != r12) goto L_0x0069
                sun.misc.Unsafe r2 = f18347k
                r7 = 0
                r3 = r0
                r6 = r10
                boolean r12 = r2.compareAndSwapObject(r3, r4, r6, r7)
                if (r12 == 0) goto L_0x006c
                r11.f18357g = r1
            L_0x0037:
                if (r9 == r1) goto L_0x0062
                int r12 = r9 + 1
                r2 = r12 & r8
                int r3 = f18350n
                int r2 = r2 << r3
                int r3 = f18349m
                int r2 = r2 + r3
                long r2 = (long) r2
                sun.misc.Unsafe r4 = f18347k
                java.lang.Object r4 = r4.getObject(r0, r2)
                java9.util.concurrent.ForkJoinTask r4 = (java9.util.concurrent.ForkJoinTask) r4
                sun.misc.Unsafe r5 = f18347k
                r6 = 0
                r5.putObjectVolatile(r0, r2, r6)
                r2 = r9 & r8
                int r3 = f18350n
                int r2 = r2 << r3
                int r3 = f18349m
                int r2 = r2 + r3
                long r2 = (long) r2
                sun.misc.Unsafe r5 = f18347k
                r5.putOrderedObject(r0, r2, r4)
                r9 = r12
                goto L_0x0037
            L_0x0062:
                p620g.p621a.p622d.C9346b.C9354f.m25253b()
                r10.doExec()
                goto L_0x006c
            L_0x0069:
                int r9 = r9 + -1
                goto L_0x0013
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.C9355g.mo47264o(java9.util.concurrent.ForkJoinTask):void");
        }

        /* renamed from: p */
        public final boolean mo47265p(ForkJoinTask<?> forkJoinTask) {
            int length;
            boolean z = true;
            int i = this.f18357g - 1;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
            if (forkJoinTaskArr == null || (length = forkJoinTaskArr.length) <= 0) {
                return false;
            }
            long j = (((long) ((length - 1) & i)) << f18350n) + ((long) f18349m);
            if (((ForkJoinTask) f18347k.getObject(forkJoinTaskArr, j)) != forkJoinTask) {
                return false;
            }
            if (!f18347k.compareAndSwapInt(this, f18348l, 0, 1)) {
                return false;
            }
            if (this.f18357g == i + 1 && this.f18358h == forkJoinTaskArr && f18347k.compareAndSwapObject(forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                this.f18357g = i;
            } else {
                z = false;
            }
            f18347k.putOrderedInt(this, f18348l, 0);
            return z;
        }

        /* renamed from: q */
        public final boolean mo47266q(ForkJoinTask<?> forkJoinTask) {
            int length;
            int i = this.f18356f;
            int i2 = this.f18357g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f18358h;
            if (forkJoinTaskArr == null || i == i2 || (length = forkJoinTaskArr.length) <= 0) {
                return false;
            }
            int i3 = i2 - 1;
            if (!f18347k.compareAndSwapObject(forkJoinTaskArr, (((long) ((length - 1) & i3)) << f18350n) + ((long) f18349m), forkJoinTask, (Object) null)) {
                return false;
            }
            this.f18357g = i3;
            C9354f.m25253b();
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [g.a.d.b$a, java.lang.Class<?>] */
    static {
        Unsafe unsafe = C9364f.f18379a;
        f18318B = unsafe;
        try {
            f18319C = unsafe.objectFieldOffset(C9346b.class.getDeclaredField(C1564e.f893u));
            f18320D = f18318B.objectFieldOffset(C9346b.class.getDeclaredField("p"));
            f18321E = f18318B.arrayBaseOffset(ForkJoinTask[].class);
            int arrayIndexScale = f18318B.arrayIndexScale(ForkJoinTask[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f18322F = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                Class<LockSupport> cls = LockSupport.class;
                int i = 256;
                try {
                    String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                    if (property != null) {
                        i = Integer.parseInt(property);
                    }
                } catch (Exception unused) {
                }
                f18328z = i;
                Class<?> cls2 = 0;
                f18324v = new C9348b(cls2);
                C9346b bVar = (C9346b) AccessController.doPrivileged(new C9347a());
                f18326x = bVar;
                f18327y = Math.max(bVar.f18334p & 65535, 1);
                try {
                    cls2 = Class.forName("g.a.d.a$b");
                } catch (Exception unused2) {
                } finally {
                    f18323G = cls2;
                }
            } else {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public /* synthetic */ C9346b(byte b, C9347a aVar) {
        this(b);
    }

    /* renamed from: A */
    public static void m25207A() {
        f18326x.mo47219b(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public static void m25208c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f18325w);
        }
    }

    /* renamed from: d */
    public static C9346b m25209d() {
        return f18326x;
    }

    /* renamed from: e */
    public static C9355g m25210e() {
        C9355g[] gVarArr;
        int length;
        C9346b bVar = f18326x;
        int c = C9360e.m25278c();
        if (bVar == null || (gVarArr = bVar.f18335q) == null || (length = gVarArr.length) <= 0) {
            return null;
        }
        return gVarArr[c & (length - 1) & 126];
    }

    /* renamed from: f */
    public static AccessControlContext m25211f(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission add : permissionArr) {
            permissions.add(add);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain((CodeSource) null, permissions)});
    }

    /* renamed from: l */
    public static long m25212l(Object obj, long j, long j2) {
        long longVolatile;
        do {
            longVolatile = f18318B.getLongVolatile(obj, j);
        } while (!f18318B.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
        return longVolatile;
    }

    /* renamed from: m */
    public static Object m25213m(Object obj, long j, Object obj2) {
        Object objectVolatile;
        do {
            objectVolatile = f18318B.getObjectVolatile(obj, j);
        } while (!f18318B.compareAndSwapObject(obj, j, objectVolatile, obj2));
        return objectVolatile;
    }

    /* renamed from: n */
    public static int m25214n() {
        return f18327y;
    }

    /* renamed from: o */
    public static int m25215o() {
        C9356c cVar;
        C9346b bVar;
        C9355g gVar;
        Thread currentThread = Thread.currentThread();
        int i = 0;
        if (!(currentThread instanceof C9356c) || (bVar = (cVar = (C9356c) currentThread).f18361e) == null || (gVar = cVar.f18362l) == null) {
            return 0;
        }
        int i2 = bVar.f18334p & 65535;
        int i3 = ((int) (bVar.f18329e >> 48)) + i2;
        int i4 = gVar.f18357g - gVar.f18356f;
        int i5 = i2 >>> 1;
        if (i3 <= i5) {
            int i6 = i5 >>> 1;
            if (i3 > i6) {
                i = 1;
            } else {
                int i7 = i6 >>> 1;
                i = i3 > i7 ? 2 : i3 > (i7 >>> 1) ? 4 : 8;
            }
        }
        return i4 - i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r1 = (r10 = r10.f18335q).length;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[LOOP:0: B:17:0x0031->B:35:0x0031, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25216p(java.util.concurrent.Executor r10, p620g.p621a.p622d.C9346b.C9353e r11) {
        /*
            if (r11 == 0) goto L_0x007e
            boolean r0 = r10 instanceof p620g.p621a.p622d.C9346b
            if (r0 == 0) goto L_0x007e
            g.a.d.b r10 = (p620g.p621a.p622d.C9346b) r10
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p620g.p621a.p622d.C9356c
            if (r1 == 0) goto L_0x0019
            g.a.d.c r0 = (p620g.p621a.p622d.C9356c) r0
            g.a.d.b r1 = r0.f18361e
            if (r1 != r10) goto L_0x0019
            g.a.d.b$g r10 = r0.f18362l
            goto L_0x002f
        L_0x0019:
            int r0 = p620g.p621a.p622d.C9360e.m25278c()
            if (r0 == 0) goto L_0x002e
            g.a.d.b$g[] r10 = r10.f18335q
            if (r10 == 0) goto L_0x002e
            int r1 = r10.length
            if (r1 <= 0) goto L_0x002e
            int r1 = r1 + -1
            r0 = r0 & r1
            r0 = r0 & 126(0x7e, float:1.77E-43)
            r10 = r10[r0]
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r10 == 0) goto L_0x007e
        L_0x0031:
            int r0 = r10.f18356f
            int r1 = r10.f18357g
            java9.util.concurrent.ForkJoinTask<?>[] r3 = r10.f18358h
            if (r3 == 0) goto L_0x007e
            int r1 = r0 - r1
            if (r1 >= 0) goto L_0x007e
            int r2 = r3.length
            if (r2 <= 0) goto L_0x007e
            int r2 = r2 + -1
            r2 = r2 & r0
            long r4 = (long) r2
            int r2 = f18322F
            long r4 = r4 << r2
            int r2 = f18321E
            long r6 = (long) r2
            long r4 = r4 + r6
            sun.misc.Unsafe r2 = f18318B
            java.lang.Object r2 = r2.getObjectVolatile(r3, r4)
            r8 = r2
            java9.util.concurrent.ForkJoinTask r8 = (java9.util.concurrent.ForkJoinTask) r8
            boolean r2 = r11.mo47205b()
            if (r2 == 0) goto L_0x005b
            goto L_0x007e
        L_0x005b:
            int r9 = r0 + 1
            int r2 = r10.f18356f
            if (r0 != r2) goto L_0x0031
            if (r8 != 0) goto L_0x0067
            r0 = -1
            if (r1 != r0) goto L_0x0031
            goto L_0x007e
        L_0x0067:
            boolean r0 = m25217s(r8)
            if (r0 != 0) goto L_0x006e
            goto L_0x007e
        L_0x006e:
            sun.misc.Unsafe r2 = f18318B
            r7 = 0
            r6 = r8
            boolean r0 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r0 == 0) goto L_0x0031
            r10.f18356f = r9
            r8.doExec()
            goto L_0x0031
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.m25216p(java.util.concurrent.Executor, g.a.d.b$e):void");
    }

    /* renamed from: s */
    public static boolean m25217s(ForkJoinTask<?> forkJoinTask) {
        Class<?> cls;
        if (forkJoinTask == null || (cls = f18323G) == null) {
            return false;
        }
        return cls.isAssignableFrom(forkJoinTask.getClass());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[LOOP:2: B:26:0x0043->B:29:0x004d, LOOP_START] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25218u(p620g.p621a.p622d.C9346b.C9353e r9) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p620g.p621a.p622d.C9356c
            if (r1 == 0) goto L_0x0043
            g.a.d.c r0 = (p620g.p621a.p622d.C9356c) r0
            g.a.d.b r1 = r0.f18361e
            if (r1 == 0) goto L_0x0043
            g.a.d.b$g r0 = r0.f18362l
            if (r0 == 0) goto L_0x0043
        L_0x0012:
            boolean r2 = r9.mo47205b()
            if (r2 != 0) goto L_0x004f
            int r2 = r1.mo47214I(r0)
            if (r2 == 0) goto L_0x0012
        L_0x001e:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r5 = 0
            boolean r0 = r9.mo47205b()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002e
            boolean r0 = r9.mo47204a()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x001e
        L_0x002e:
            long r7 = f18319C
            if (r2 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r5
        L_0x0034:
            m25212l(r1, r7, r3)
            goto L_0x004f
        L_0x0038:
            r9 = move-exception
            long r7 = f18319C
            if (r2 <= 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r3 = r5
        L_0x003f:
            m25212l(r1, r7, r3)
            throw r9
        L_0x0043:
            boolean r0 = r9.mo47205b()
            if (r0 != 0) goto L_0x004f
            boolean r0 = r9.mo47204a()
            if (r0 == 0) goto L_0x0043
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.m25218u(g.a.d.b$e):void");
    }

    /* renamed from: v */
    public static Object m25219v(String str) {
        String property = System.getProperty(str);
        if (property == null) {
            return null;
        }
        return ClassLoader.getSystemClassLoader().loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    /* renamed from: w */
    public static final synchronized int m25220w() {
        int i;
        synchronized (C9346b.class) {
            i = f18317A + 1;
            f18317A = i;
        }
        return i;
    }

    /* renamed from: B */
    public final C9355g mo47207B(C9356c cVar) {
        int i;
        int length;
        cVar.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18338t;
        if (uncaughtExceptionHandler != null) {
            cVar.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C9355g gVar = new C9355g(this, cVar);
        int i2 = this.f18334p & 65536;
        String str = this.f18336r;
        if (str != null) {
            synchronized (str) {
                C9355g[] gVarArr = this.f18335q;
                int i3 = this.f18332n - 1640531527;
                this.f18332n = i3;
                i = 0;
                if (gVarArr != null && (length = gVarArr.length) > 1) {
                    int i4 = length - 1;
                    int i5 = i3 & i4;
                    int i6 = ((i3 << 1) | 1) & i4;
                    int i7 = length >>> 1;
                    while (true) {
                        C9355g gVar2 = gVarArr[i6];
                        if (gVar2 == null) {
                            break;
                        } else if (gVar2.f18351a == 1073741824) {
                            break;
                        } else {
                            i7--;
                            if (i7 == 0) {
                                i6 = length | 1;
                                break;
                            }
                            i6 = (i6 + 2) & i4;
                        }
                    }
                    int i8 = i2 | i6 | (i3 & 1073610752);
                    gVar.f18354d = i8;
                    gVar.f18351a = i8;
                    if (i6 < length) {
                        gVarArr[i6] = gVar;
                    } else {
                        int i9 = length << 1;
                        C9355g[] gVarArr2 = new C9355g[i9];
                        gVarArr2[i6] = gVar;
                        int i10 = i9 - 1;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C9355g gVar3 = gVarArr[i];
                            if (gVar3 != null) {
                                gVarArr2[gVar3.f18354d & i10 & 126] = gVar3;
                            }
                            int i11 = i + 1;
                            if (i11 >= length) {
                                break;
                            }
                            gVarArr2[i11] = gVarArr[i11];
                            i = i11 + 1;
                        }
                        this.f18335q = gVarArr2;
                    }
                    i = i5;
                }
            }
            cVar.setName(str.concat(Integer.toString(i)));
        }
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        r10 = r9.f18351a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (r10 < 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r15 = (r10 + 65536) | Integer.MIN_VALUE;
        r9.f18351a = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r4 = r8.f18329e;
        r9.f18352b = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        if (f18318B.compareAndSwapLong(r23, f18319C, r4, ((r4 - 281474976710656L) & -4294967296L) | (((long) r15) & 4294967295L)) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        r15 = r9.f18352b;
        r9.f18355e = java9.util.concurrent.ForkJoinTask.CANCELLED;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f8, code lost:
        if (r9.f18351a < 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        r9.f18355e = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        r0 = r8.f18334p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
        if (r0 >= 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0106, code lost:
        r4 = r8.f18329e;
        r1 = (65535 & r0) + ((int) (r4 >> 48));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        if (r1 > 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0117, code lost:
        if ((r0 & 262144) == 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        if (mo47216K(false, false) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0120, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0121, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        r17 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0128, code lost:
        if ((r17 & 1) != 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012a, code lost:
        java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        r20 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0130, code lost:
        if (r1 > 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0132, code lost:
        if (r15 == 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0135, code lost:
        if (r10 != ((int) r4)) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        r0 = r8.f18331m + java.lang.System.currentTimeMillis();
        java.util.concurrent.locks.LockSupport.parkUntil(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0145, code lost:
        if (r8.f18329e != r4) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0150, code lost:
        if ((r0 - java.lang.System.currentTimeMillis()) > 20) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0152, code lost:
        r20 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016c, code lost:
        if (f18318B.compareAndSwapLong(r23, f18319C, r4, ((r4 - androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSED_BIT) & -4294967296L) | (((long) r15) & 4294967295L)) == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016e, code lost:
        r9.f18351a = 1073741824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0173, code lost:
        r20 = r7;
        java.util.concurrent.locks.LockSupport.park(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0178, code lost:
        r6 = r17;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47208C(p620g.p621a.p622d.C9346b.C9355g r24) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            r24.mo47251b()
            int r0 = r9.f18354d
            int r1 = p620g.p621a.p622d.C9360e.m25288m()
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            r1 = 0
        L_0x0012:
            g.a.d.b$g[] r2 = r8.f18335q
            if (r2 == 0) goto L_0x017c
            int r3 = r2.length
            int r4 = r3 + -1
            r12 = r0
            r0 = r3
            r5 = 0
        L_0x001c:
            if (r0 <= 0) goto L_0x00ad
            r7 = r12 & r4
            if (r7 < 0) goto L_0x00a2
            if (r7 >= r3) goto L_0x00a2
            r7 = r2[r7]
            if (r7 == 0) goto L_0x00a2
            int r13 = r7.f18356f
            int r14 = r7.f18357g
            int r14 = r13 - r14
            if (r14 >= 0) goto L_0x00a2
            java9.util.concurrent.ForkJoinTask<?>[] r14 = r7.f18358h
            if (r14 == 0) goto L_0x00a2
            int r15 = r14.length
            if (r15 <= 0) goto L_0x00a2
            int r5 = r7.f18354d
            int r15 = r15 + -1
            r15 = r15 & r13
            r21 = r12
            long r11 = (long) r15
            int r15 = f18322F
            long r11 = r11 << r15
            int r15 = f18321E
            r22 = r7
            long r6 = (long) r15
            long r6 = r6 + r11
            sun.misc.Unsafe r11 = f18318B
            java.lang.Object r11 = r11.getObjectVolatile(r14, r6)
            java9.util.concurrent.ForkJoinTask r11 = (java9.util.concurrent.ForkJoinTask) r11
            if (r11 == 0) goto L_0x009e
            int r12 = r13 + 1
            r15 = r22
            int r10 = r15.f18356f
            if (r13 != r10) goto L_0x009e
            sun.misc.Unsafe r10 = f18318B
            r20 = 0
            r13 = r15
            r15 = r10
            r16 = r14
            r17 = r6
            r19 = r11
            boolean r6 = r15.compareAndSwapObject(r16, r17, r19, r20)
            if (r6 == 0) goto L_0x009e
            r13.f18356f = r12
            int r6 = r13.f18357g
            int r12 = r12 - r6
            if (r12 >= 0) goto L_0x0078
            if (r5 == r1) goto L_0x0078
            r23.mo47209D()
        L_0x0078:
            r9.f18355e = r5
            r11.doExec()
            int r1 = r9.f18354d
            r6 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r6
            r6 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x008a
            r9.mo47254e(r6)
            goto L_0x008d
        L_0x008a:
            r9.mo47255f(r6)
        L_0x008d:
            g.a.d.c r1 = r9.f18360j
            int r6 = r9.f18353c
            r7 = 1
            int r6 = r6 + r7
            r9.f18353c = r6
            r6 = 0
            r9.f18355e = r6
            if (r1 == 0) goto L_0x009d
            r1.mo47267a()
        L_0x009d:
            r1 = r5
        L_0x009e:
            r12 = r21
            r5 = 1
            goto L_0x00a9
        L_0x00a2:
            r21 = r12
            if (r5 == 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            int r12 = r21 + 1
        L_0x00a9:
            int r0 = r0 + -1
            goto L_0x001c
        L_0x00ad:
            r21 = r12
        L_0x00af:
            if (r5 == 0) goto L_0x00bd
            int r0 = r21 << 13
            r0 = r21 ^ r0
            int r2 = r0 >>> 17
            r0 = r0 ^ r2
            int r2 = r0 << 5
            r0 = r0 ^ r2
            goto L_0x0012
        L_0x00bd:
            int r10 = r9.f18351a
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r13 = -4294967296(0xffffffff00000000, double:NaN)
            if (r10 < 0) goto L_0x00ef
            r0 = 65536(0x10000, float:9.18355E-41)
            int r10 = r10 + r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r10 | r0
            r9.f18351a = r15
        L_0x00d4:
            long r4 = r8.f18329e
            int r0 = (int) r4
            r9.f18352b = r0
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r4 - r0
            long r0 = r0 & r13
            long r2 = (long) r15
            long r2 = r2 & r11
            long r6 = r0 | r2
            sun.misc.Unsafe r0 = f18318B
            long r2 = f18319C
            r1 = r23
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L_0x00d4
            goto L_0x00fd
        L_0x00ef:
            int r15 = r9.f18352b
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            r9.f18355e = r0
            r6 = 0
        L_0x00f6:
            int r0 = r9.f18351a
            if (r0 < 0) goto L_0x0101
            r0 = 0
            r9.f18355e = r0
        L_0x00fd:
            r0 = r21
            goto L_0x0011
        L_0x0101:
            int r0 = r8.f18334p
            if (r0 >= 0) goto L_0x0106
            return
        L_0x0106:
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            long r4 = r8.f18329e
            r2 = 48
            long r2 = r4 >> r2
            int r2 = (int) r2
            int r1 = r1 + r2
            if (r1 > 0) goto L_0x0121
            r2 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0121
            r7 = 0
            boolean r0 = r8.mo47216K(r7, r7)
            if (r0 == 0) goto L_0x0122
            return
        L_0x0121:
            r7 = 0
        L_0x0122:
            r16 = 1
            int r17 = r6 + 1
            r0 = r17 & 1
            if (r0 != 0) goto L_0x0130
            java.lang.Thread.interrupted()
        L_0x012d:
            r20 = r7
            goto L_0x0178
        L_0x0130:
            if (r1 > 0) goto L_0x0173
            if (r15 == 0) goto L_0x0173
            int r0 = (int) r4
            if (r10 != r0) goto L_0x0173
            long r0 = r8.f18331m
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.util.concurrent.locks.LockSupport.parkUntil(r8, r0)
            long r2 = r8.f18329e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x012d
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 20
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x012d
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r4 - r0
            long r0 = r0 & r13
            long r2 = (long) r15
            long r2 = r2 & r11
            long r18 = r0 | r2
            sun.misc.Unsafe r0 = f18318B
            long r2 = f18319C
            r1 = r23
            r20 = r7
            r6 = r18
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L_0x0178
            r0 = 1073741824(0x40000000, float:2.0)
            r9.f18351a = r0
            return
        L_0x0173:
            r20 = r7
            java.util.concurrent.locks.LockSupport.park(r23)
        L_0x0178:
            r6 = r17
            goto L_0x00f6
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.mo47208C(g.a.d.b$g):void");
    }

    /* renamed from: D */
    public final void mo47209D() {
        int i;
        C9355g gVar;
        while (true) {
            long j = this.f18329e;
            if (j < 0) {
                int i2 = (int) j;
                if (i2 != 0) {
                    C9355g[] gVarArr = this.f18335q;
                    if (gVarArr != null && gVarArr.length > (i = 65535 & i2) && (gVar = gVarArr[i]) != null) {
                        int i3 = i2 & Integer.MAX_VALUE;
                        int i4 = gVar.f18351a;
                        long j2 = (((long) gVar.f18352b) & 4294967295L) | (-4294967296L & (281474976710656L + j));
                        C9356c cVar = gVar.f18360j;
                        if (i2 == i4) {
                            if (f18318B.compareAndSwapLong(this, f18319C, j, j2)) {
                                gVar.f18351a = i3;
                                if (gVar.f18355e < 0) {
                                    LockSupport.unpark(cVar);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if ((140737488355328L & j) != 0) {
                    mo47213H(j);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    public ForkJoinTask<?> submit(Runnable runnable) {
        C9335b.m25184a(runnable);
        ForkJoinTask<?> cVar = runnable instanceof ForkJoinTask ? (ForkJoinTask) runnable : new ForkJoinTask.C9481c(runnable);
        mo47228k(cVar);
        return cVar;
    }

    /* renamed from: F */
    public <T> ForkJoinTask<T> submit(Runnable runnable, T t) {
        ForkJoinTask.C9480b bVar = new ForkJoinTask.C9480b(runnable, t);
        mo47228k(bVar);
        return bVar;
    }

    /* renamed from: G */
    public <T> ForkJoinTask<T> submit(Callable<T> callable) {
        ForkJoinTask.C9479a aVar = new ForkJoinTask.C9479a(callable);
        mo47228k(aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47213H(long r9) {
        /*
            r8 = this;
            r4 = r9
        L_0x0001:
            r9 = -281474976710656(0xffff000000000000, double:NaN)
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 + r4
            long r9 = r9 & r0
            r0 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r4
            long r0 = r0 & r2
            long r6 = r9 | r0
            long r9 = r8.f18329e
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x002a
            sun.misc.Unsafe r0 = f18318B
            long r2 = f18319C
            r1 = r8
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r9 == 0) goto L_0x002a
            r8.mo47221g()
            goto L_0x003b
        L_0x002a:
            long r4 = r8.f18329e
            r9 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r9 = r9 & r4
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x003b
            int r9 = (int) r4
            if (r9 == 0) goto L_0x0001
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.mo47213H(long):void");
    }

    /* renamed from: I */
    public final int mo47214I(C9355g gVar) {
        int length;
        boolean z;
        Thread.State state;
        C9355g gVar2 = gVar;
        long j = this.f18329e;
        C9355g[] gVarArr = this.f18335q;
        short s = (short) ((int) (j >>> 32));
        if (s >= 0) {
            if (gVarArr == null || (length = gVarArr.length) <= 0 || gVar2 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C9355g gVar3 = gVarArr[i & (length - 1)];
                int i2 = gVar2.f18351a;
                long j2 = -4294967296L & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (gVar3 == null) {
                    return 0;
                }
                int i4 = gVar3.f18351a;
                C9356c cVar = gVar3.f18360j;
                long j3 = (((long) gVar3.f18352b) & 4294967295L) | j2;
                if (i4 != i) {
                    return 0;
                }
                if (!f18318B.compareAndSwapLong(this, f18319C, j, j3)) {
                    return 0;
                }
                gVar3.f18351a = i3;
                if (gVar3.f18355e < 0) {
                    LockSupport.unpark(cVar);
                }
                return i2 < 0 ? -1 : 1;
            } else if (((int) (j >> 48)) - ((short) (this.f18333o & 65535)) > 0) {
                return f18318B.compareAndSwapLong(this, f18319C, j, (-281474976710656L & (j - 281474976710656L)) | (281474976710655L & j)) ? 1 : 0;
            } else {
                short s2 = this.f18334p & UShort.MAX_VALUE;
                int i5 = s2 + s;
                int i6 = i5;
                int i7 = 0;
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        z = false;
                        break;
                    }
                    C9355g gVar4 = gVarArr[i8];
                    if (gVar4 != null) {
                        if (gVar4.f18355e == 0) {
                            z = true;
                            break;
                        }
                        i6--;
                        C9356c cVar2 = gVar4.f18360j;
                        if (cVar2 != null && ((state = cVar2.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                            i7++;
                        }
                    }
                    i8 += 2;
                }
                if (z || i6 != 0 || this.f18329e != j) {
                    return 0;
                }
                if (i5 >= 32767 || s >= (this.f18333o >>> 16)) {
                    C9365a<? super C9346b> aVar = this.f18339u;
                    if (aVar != null && aVar.test(this)) {
                        return -1;
                    }
                    if (i7 < s2) {
                        Thread.yield();
                        return 0;
                    }
                    throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
                }
            }
        }
        if (!f18318B.compareAndSwapLong(this, f18319C, j, ((AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSED_BIT + j) & 281470681743360L) | (-281470681743361L & j)) || !mo47221g()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: J */
    public final boolean mo47215J(ForkJoinTask<?> forkJoinTask) {
        int length;
        C9355g gVar;
        int c = C9360e.m25278c();
        C9355g[] gVarArr = this.f18335q;
        if (gVarArr == null || (length = gVarArr.length) <= 0 || (gVar = gVarArr[c & (length - 1) & 126]) == null || !gVar.mo47265p(forkJoinTask)) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final boolean mo47216K(boolean z, boolean z2) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f18334p;
            int i4 = 0;
            if ((i3 & 262144) != 0) {
                while (true) {
                    int i5 = this.f18334p;
                    int i6 = 65535;
                    long j = 0;
                    int i7 = 1;
                    if ((i5 & Integer.MIN_VALUE) == 0) {
                        if (!z) {
                            while (true) {
                                long j2 = this.f18329e;
                                C9355g[] gVarArr = this.f18335q;
                                char c = '0';
                                if ((i5 & i6) + ((int) (j2 >> 48)) <= 0) {
                                    if (gVarArr != null) {
                                        int i8 = i4;
                                        while (true) {
                                            if (i8 >= gVarArr.length) {
                                                break;
                                            }
                                            C9355g gVar = gVarArr[i8];
                                            if (gVar != null) {
                                                int i9 = gVar.f18355e;
                                                int i10 = gVar.f18351a;
                                                int i11 = gVar.f18354d;
                                                int i12 = gVar.f18356f;
                                                if (i12 != gVar.f18357g || ((i11 & 1) == i7 && (i9 >= 0 || i10 >= 0))) {
                                                    i7 = 1;
                                                } else {
                                                    j2 += (((long) i9) << c) + (((long) i10) << 32) + (((long) i12) << 16) + ((long) i11);
                                                }
                                            }
                                            i8++;
                                            c = '0';
                                            i7 = 1;
                                        }
                                        i7 = 1;
                                    }
                                    i7 = 0;
                                }
                                i5 = this.f18334p;
                                if ((i5 & Integer.MIN_VALUE) != 0) {
                                    i4 = 0;
                                    break;
                                } else if (i7 != 0) {
                                    return false;
                                } else {
                                    i4 = 0;
                                    if (this.f18335q == gVarArr) {
                                        if (j == j2) {
                                            break;
                                        }
                                        j = j2;
                                    }
                                    i6 = 65535;
                                    i7 = 1;
                                }
                            }
                        }
                        int i13 = i5;
                        if ((i13 & Integer.MIN_VALUE) == 0) {
                            f18318B.compareAndSwapInt(this, f18320D, i13, i13 | Integer.MIN_VALUE);
                        }
                    } else {
                        while ((this.f18334p & 524288) == 0) {
                            long j3 = 0;
                            while (true) {
                                long j4 = this.f18329e;
                                C9355g[] gVarArr2 = this.f18335q;
                                if (gVarArr2 != null) {
                                    for (int i14 = i4; i14 < gVarArr2.length; i14++) {
                                        C9355g gVar2 = gVarArr2[i14];
                                        if (gVar2 != null) {
                                            C9356c cVar = gVar2.f18360j;
                                            gVar2.mo47250a();
                                            if (cVar != null) {
                                                try {
                                                    cVar.interrupt();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            j4 += (((long) gVar2.f18351a) << 32) + ((long) gVar2.f18356f);
                                        }
                                    }
                                }
                                i = this.f18334p;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f18335q == gVarArr2) {
                                    if (j3 == j4) {
                                        break;
                                    }
                                    j3 = j4;
                                }
                                i4 = 0;
                            }
                            if (i2 != 0 || (i & UShort.MAX_VALUE) + ((short) ((int) (this.f18329e >>> 32))) > 0) {
                                return true;
                            }
                            if (f18318B.compareAndSwapInt(this, f18320D, i, i | 524288)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                return true;
                            }
                            i4 = 0;
                        }
                        return true;
                    }
                }
            } else if (!z2 || this == f18326x) {
                return false;
            } else {
                f18318B.compareAndSwapInt(this, f18320D, i3, i3 | 262144);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo47217a(C9355g gVar, ForkJoinTask<?> forkJoinTask, long j) {
        long j2;
        C9355g gVar2;
        ForkJoinTask<?>[] forkJoinTaskArr;
        int length;
        int d;
        C9355g gVar3 = gVar;
        ForkJoinTask<?> forkJoinTask2 = forkJoinTask;
        if (gVar3 == null || forkJoinTask2 == null) {
            return 0;
        }
        if ((forkJoinTask2 instanceof CountedCompleter) && (d = gVar3.mo47253d((CountedCompleter) forkJoinTask2, 0)) < 0) {
            return d;
        }
        gVar.mo47264o(forkJoinTask);
        int i = gVar3.f18355e;
        int i2 = gVar3.f18354d;
        int i3 = forkJoinTask2.status;
        while (i3 >= 0) {
            boolean z = true;
            int m = C9360e.m25288m() | 1;
            C9355g[] gVarArr = this.f18335q;
            if (gVarArr != null) {
                int length2 = gVarArr.length;
                int i4 = length2 - 1;
                int i5 = -length2;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    int i6 = (m + i5) & i4;
                    if (i6 >= 0 && i6 < length2 && (gVar2 = gVarArr[i6]) != null && gVar2.f18355e == i2) {
                        int i7 = gVar2.f18356f;
                        if (i7 - gVar2.f18357g < 0 && (forkJoinTaskArr = gVar2.f18358h) != null && (length = forkJoinTaskArr.length) > 0) {
                            int i8 = gVar2.f18354d;
                            long j3 = (((long) ((length - 1) & i7)) << f18322F) + ((long) f18321E);
                            ForkJoinTask forkJoinTask3 = (ForkJoinTask) f18318B.getObjectVolatile(forkJoinTaskArr, j3);
                            if (forkJoinTask3 != null) {
                                int i9 = i7 + 1;
                                if (i7 == gVar2.f18356f && i2 == gVar2.f18355e && f18318B.compareAndSwapObject(forkJoinTaskArr, j3, forkJoinTask3, (Object) null)) {
                                    gVar2.f18356f = i9;
                                    gVar3.f18355e = i8;
                                    forkJoinTask3.doExec();
                                    gVar3.f18355e = i;
                                }
                            }
                        }
                    }
                    i5 += 2;
                }
            }
            z = false;
            i3 = forkJoinTask2.status;
            if (i3 < 0) {
                break;
            } else if (!z) {
                long j4 = 0;
                if (j == 0) {
                    j2 = 0;
                } else {
                    long nanoTime = j - System.nanoTime();
                    if (nanoTime <= 0) {
                        break;
                    }
                    j2 = TimeUnit.NANOSECONDS.toMillis(nanoTime);
                    if (j2 <= 0) {
                        j2 = 1;
                    }
                }
                int I = mo47214I(gVar);
                if (I != 0) {
                    forkJoinTask2.internalWait(j2);
                    long j5 = f18319C;
                    if (I > 0) {
                        j4 = 281474976710656L;
                    }
                    m25212l(this, j5, j4);
                }
                i3 = forkJoinTask2.status;
            }
        }
        return i3;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else if (this == f18326x) {
            mo47219b(j, timeUnit);
            return false;
        } else {
            long nanos = timeUnit.toNanos(j);
            if (isTerminated()) {
                return true;
            }
            if (nanos <= 0) {
                return false;
            }
            long nanoTime = System.nanoTime() + nanos;
            synchronized (this) {
                while (!isTerminated()) {
                    if (nanos <= 0) {
                        return false;
                    }
                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                    if (millis <= 0) {
                        millis = 1;
                    }
                    wait(millis);
                    nanos = nanoTime - System.nanoTime();
                }
                return true;
            }
        }
    }

    /* renamed from: b */
    public boolean mo47219b(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            C9356c cVar = (C9356c) currentThread;
            if (cVar.f18361e == this) {
                mo47232r(cVar.f18362l);
                return true;
            }
        }
        long nanoTime = System.nanoTime();
        while (true) {
            ForkJoinTask<?> y = mo47241y(false);
            if (y != null) {
                y.doExec();
            } else if (mo47238t()) {
                return true;
            } else {
                if (System.nanoTime() - nanoTime > nanos) {
                    return false;
                }
                Thread.yield();
            }
        }
    }

    public void execute(Runnable runnable) {
        ForkJoinTask forkJoinTask;
        C9335b.m25184a(runnable);
        if (runnable instanceof ForkJoinTask) {
            forkJoinTask = (ForkJoinTask) runnable;
        } else {
            forkJoinTask = new ForkJoinTask.C9483e(runnable);
        }
        mo47228k(forkJoinTask);
    }

    /* renamed from: g */
    public final boolean mo47221g() {
        C9356c cVar;
        C9350c cVar2 = this.f18337s;
        Throwable th = null;
        if (cVar2 != null) {
            try {
                cVar = cVar2.mo47245a(this);
                if (cVar != null) {
                    try {
                        cVar.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cVar = null;
            }
        } else {
            cVar = null;
        }
        mo47222h(cVar, th);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[LOOP:0: B:26:0x0040->B:27:0x0064, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47222h(p620g.p621a.p622d.C9356c r18, java.lang.Throwable r19) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 0
            r12 = 0
            if (r0 == 0) goto L_0x003a
            g.a.d.b$g r0 = r0.f18362l
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r9.f18336r
            int r3 = r0.f18353c
            long r3 = (long) r3
            long r3 = r3 & r10
            int r5 = r0.f18354d
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r2 == 0) goto L_0x0037
            monitor-enter(r2)
            g.a.d.b$g[] r6 = r9.f18335q     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x002d
            int r7 = r6.length     // Catch:{ all -> 0x0034 }
            if (r7 <= r5) goto L_0x002d
            r7 = r6[r5]     // Catch:{ all -> 0x0034 }
            if (r7 != r0) goto L_0x002d
            r6[r5] = r1     // Catch:{ all -> 0x0034 }
        L_0x002d:
            long r5 = r9.f18330l     // Catch:{ all -> 0x0034 }
            long r5 = r5 + r3
            r9.f18330l = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            int r1 = r0.f18351a
            goto L_0x003c
        L_0x003a:
            r0 = r1
        L_0x003b:
            r1 = r12
        L_0x003c:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0066
        L_0x0040:
            sun.misc.Unsafe r1 = f18318B
            long r3 = f18319C
            long r5 = r9.f18329e
            r7 = -281474976710656(0xffff000000000000, double:NaN)
            r13 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r13 = r5 - r13
            long r7 = r7 & r13
            r13 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            r15 = 4294967296(0x100000000, double:2.121995791E-314)
            long r15 = r5 - r15
            long r13 = r13 & r15
            long r7 = r7 | r13
            long r13 = r5 & r10
            long r7 = r7 | r13
            r2 = r17
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x0040
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r0.mo47250a()
        L_0x006b:
            boolean r1 = r9.mo47216K(r12, r12)
            if (r1 != 0) goto L_0x007a
            if (r0 == 0) goto L_0x007a
            java9.util.concurrent.ForkJoinTask<?>[] r0 = r0.f18358h
            if (r0 == 0) goto L_0x007a
            r17.mo47209D()
        L_0x007a:
            if (r19 != 0) goto L_0x0080
            java9.util.concurrent.ForkJoinTask.helpExpungeStaleExceptions()
            goto L_0x0083
        L_0x0080:
            java9.util.concurrent.ForkJoinTask.rethrow(r19)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.mo47222h(g.a.d.c, java.lang.Throwable):void");
    }

    /* renamed from: i */
    public final int mo47223i(CountedCompleter<?> countedCompleter, int i) {
        int length;
        C9355g gVar;
        int c = C9360e.m25278c();
        C9355g[] gVarArr = this.f18335q;
        if (gVarArr == null || (length = gVarArr.length) <= 0 || (gVar = gVarArr[c & (length - 1) & 126]) == null) {
            return 0;
        }
        return gVar.mo47262m(countedCompleter, i);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            for (Callable aVar : collection) {
                ForkJoinTask.C9479a aVar2 = new ForkJoinTask.C9479a(aVar);
                arrayList.add(aVar2);
                mo47228k(aVar2);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ForkJoinTask) arrayList.get(i)).quietlyJoin();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    public boolean isShutdown() {
        return (this.f18334p & 262144) != 0;
    }

    public boolean isTerminated() {
        return (this.f18334p & 524288) != 0;
    }

    /* renamed from: j */
    public final void mo47227j(ForkJoinTask<?> forkJoinTask) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        boolean z3;
        int length3;
        int length4;
        int c = C9360e.m25278c();
        if (c == 0) {
            C9360e.m25285j();
            c = C9360e.m25278c();
        }
        while (true) {
            int i = this.f18334p;
            C9355g[] gVarArr = this.f18335q;
            if ((i & 262144) == 0 && gVarArr != null && (length = gVarArr.length) > 0) {
                C9355g gVar = gVarArr[(length - 1) & c & 126];
                if (gVar == null) {
                    String str = this.f18336r;
                    int i2 = (c | 1073741824) & -65538;
                    C9355g gVar2 = new C9355g(this, (C9356c) null);
                    gVar2.f18354d = i2;
                    gVar2.f18355e = 1073741824;
                    gVar2.f18351a = 1;
                    if (str != null) {
                        synchronized (str) {
                            C9355g[] gVarArr2 = this.f18335q;
                            if (gVarArr2 != null && (length4 = gVarArr2.length) > 0) {
                                int i3 = i2 & (length4 - 1) & 126;
                                if (gVarArr2[i3] == null) {
                                    gVarArr2[i3] = gVar2;
                                    z2 = true;
                                    z = z2;
                                }
                            }
                            z2 = false;
                            z = z2;
                        }
                    } else {
                        z2 = false;
                        z = false;
                    }
                    gVar = gVar2;
                } else if (gVar.mo47263n()) {
                    int i4 = gVar.f18356f;
                    int i5 = gVar.f18357g;
                    ForkJoinTask<?>[] forkJoinTaskArr = gVar.f18358h;
                    if (forkJoinTaskArr != null && (length3 = forkJoinTaskArr.length) > 0) {
                        int i6 = length3 - 1;
                        int i7 = i4 - i5;
                        if (i6 + i7 > 0) {
                            forkJoinTaskArr[i6 & i5] = forkJoinTask;
                            gVar.f18357g = i5 + 1;
                            gVar.f18351a = 0;
                            if (i7 >= 0 || gVar.f18356f - i5 >= -1) {
                                z3 = false;
                                z2 = true;
                            } else {
                                return;
                            }
                        }
                    }
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z2) {
                    if (z) {
                        try {
                            gVar.mo47251b();
                            int i8 = gVar.f18357g;
                            ForkJoinTask<?>[] forkJoinTaskArr2 = gVar.f18358h;
                            if (forkJoinTaskArr2 != null && (length2 = forkJoinTaskArr2.length) > 0) {
                                forkJoinTaskArr2[(length2 - 1) & i8] = forkJoinTask;
                                gVar.f18357g = i8 + 1;
                            }
                        } finally {
                            gVar.f18351a = 0;
                        }
                    }
                    mo47209D();
                    return;
                }
                c = C9360e.m25276a(c);
            }
        }
        throw new RejectedExecutionException();
    }

    /* renamed from: k */
    public final <T> ForkJoinTask<T> mo47228k(ForkJoinTask<T> forkJoinTask) {
        C9355g gVar;
        C9335b.m25184a(forkJoinTask);
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            C9356c cVar = (C9356c) currentThread;
            if (cVar.f18361e == this && (gVar = cVar.f18362l) != null) {
                gVar.mo47260k(forkJoinTask);
                return forkJoinTask;
            }
        }
        mo47227j(forkJoinTask);
        return forkJoinTask;
    }

    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new ForkJoinTask.C9480b(runnable, t);
    }

    /* renamed from: q */
    public final int mo47231q(C9355g gVar, CountedCompleter<?> countedCompleter, int i) {
        if (gVar == null) {
            return 0;
        }
        return gVar.mo47253d(countedCompleter, i);
    }

    /* renamed from: r */
    public final void mo47232r(C9355g gVar) {
        boolean z;
        boolean z2;
        int i;
        C9355g gVar2;
        ForkJoinTask<?>[] forkJoinTaskArr;
        int length;
        C9355g gVar3 = gVar;
        int i2 = gVar3.f18355e;
        int i3 = gVar3.f18354d & 65536;
        char c = 65535;
        int i4 = i2;
        char c2 = 65535;
        while (true) {
            if (i3 != 0) {
                gVar3.mo47254e(0);
            } else {
                gVar3.mo47255f(0);
            }
            if (c2 == c && gVar3.f18351a >= 0) {
                c2 = 1;
            }
            int m = C9360e.m25288m();
            C9355g[] gVarArr = this.f18335q;
            if (gVarArr != null) {
                int length2 = gVarArr.length;
                int i5 = length2 - 1;
                int i6 = length2;
                z = true;
                while (true) {
                    if (i6 <= 0) {
                        z2 = true;
                        break;
                    }
                    int i7 = (m - i6) & i5;
                    if (i7 >= 0 && i7 < length2 && (gVar2 = gVarArr[i7]) != null) {
                        int i8 = gVar2.f18356f;
                        if (i8 - gVar2.f18357g < 0 && (forkJoinTaskArr = gVar2.f18358h) != null && (length = forkJoinTaskArr.length) > 0) {
                            int i9 = gVar2.f18354d;
                            if (c2 == 0) {
                                m25212l(this, f18319C, 281474976710656L);
                                c2 = 1;
                            }
                            long j = (((long) ((length - 1) & i8)) << f18322F) + ((long) f18321E);
                            ForkJoinTask forkJoinTask = (ForkJoinTask) f18318B.getObjectVolatile(forkJoinTaskArr, j);
                            if (forkJoinTask != null) {
                                int i10 = i8 + 1;
                                if (i8 == gVar2.f18356f && f18318B.compareAndSwapObject(forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                                    gVar2.f18356f = i10;
                                    gVar3.f18355e = gVar2.f18354d;
                                    forkJoinTask.doExec();
                                    gVar3.f18355e = i2;
                                    i4 = i2;
                                }
                            }
                            z2 = false;
                            z = false;
                        } else if ((gVar2.f18355e & 1073741824) == 0) {
                            z = false;
                        }
                    }
                    i6--;
                }
            } else {
                z2 = true;
                z = true;
            }
            if (z) {
                break;
            }
            if (z2) {
                if (i4 != 1073741824) {
                    gVar3.f18355e = 1073741824;
                    i = 1073741824;
                } else {
                    i = i4;
                }
                if (c2 == 1) {
                    m25212l(this, f18319C, -281474976710656L);
                    i4 = i;
                    c2 = 0;
                } else {
                    i4 = i;
                }
            }
            c = 65535;
        }
        if (c2 == 0) {
            m25212l(this, f18319C, 281474976710656L);
        }
        gVar3.f18355e = i2;
    }

    public void shutdown() {
        m25208c();
        mo47216K(false, true);
    }

    public List<Runnable> shutdownNow() {
        m25208c();
        mo47216K(true, true);
        return Collections.emptyList();
    }

    /* renamed from: t */
    public boolean mo47238t() {
        while (true) {
            long j = this.f18329e;
            int i = this.f18334p;
            short s = 65535 & i;
            int i2 = ((short) ((int) (j >>> 32))) + s;
            int i3 = s + ((int) (j >> 48));
            if ((i & -2146959360) != 0) {
                return true;
            }
            if (i3 > 0) {
                return false;
            }
            C9355g[] gVarArr = this.f18335q;
            if (gVarArr != null) {
                for (int i4 = 1; i4 < gVarArr.length; i4 += 2) {
                    C9355g gVar = gVarArr[i4];
                    if (gVar != null) {
                        if ((gVar.f18355e & 1073741824) == 0) {
                            return false;
                        }
                        i2--;
                    }
                }
            }
            if (i2 == 0 && this.f18329e == j) {
                return true;
            }
        }
    }

    public String toString() {
        int i;
        long j = this.f18330l;
        C9355g[] gVarArr = this.f18335q;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        if (gVarArr != null) {
            i = 0;
            for (int i3 = 0; i3 < gVarArr.length; i3++) {
                C9355g gVar = gVarArr[i3];
                if (gVar != null) {
                    int l = gVar.mo47261l();
                    if ((i3 & 1) == 0) {
                        j3 += (long) l;
                    } else {
                        j2 += (long) l;
                        j += ((long) gVar.f18353c) & 4294967295L;
                        if (gVar.mo47252c()) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        int i4 = this.f18334p;
        short s = 65535 & i4;
        long j4 = this.f18329e;
        int i5 = ((short) ((int) (j4 >>> 32))) + s;
        int i6 = ((int) (j4 >> 48)) + s;
        if (i6 >= 0) {
            i2 = i6;
        }
        return super.toString() + "[" + ((524288 & i4) != 0 ? "Terminated" : (Integer.MIN_VALUE & i4) != 0 ? "Terminating" : (i4 & 262144) != 0 ? "Shutting down" : "Running") + ", parallelism = " + s + ", size = " + i5 + ", active = " + i2 + ", running = " + i + ", steals = " + j + ", tasks = " + j2 + ", submissions = " + j3 + "]";
    }

    /* renamed from: x */
    public final ForkJoinTask<?> mo47240x(C9355g gVar) {
        if (gVar != null) {
            ForkJoinTask<?> i = (gVar.f18354d & 65536) != 0 ? gVar.mo47258i() : gVar.mo47259j();
            if (i != null) {
                return i;
            }
        }
        return mo47241y(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r14 = (((long) ((r11 - 1) & r10)) << f18322F) + ((long) f18321E);
        r1 = (java9.util.concurrent.ForkJoinTask) f18318B.getObjectVolatile(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r1 == null) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r2 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r10 != r9.f18356f) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (f18318B.compareAndSwapObject(r13, r14, r1, (java.lang.Object) null) == false) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r9.f18356f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0002, code lost:
        continue;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java9.util.concurrent.ForkJoinTask<?> mo47241y(boolean r19) {
        /*
            r18 = this;
            r0 = r18
        L_0x0002:
            int r1 = r0.f18334p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0073
            g.a.d.b$g[] r1 = r0.f18335q
            if (r1 == 0) goto L_0x0073
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0073
            int r2 = r2 + -1
            int r3 = p620g.p621a.p622d.C9360e.m25288m()
            int r4 = r3 >>> 16
            if (r19 == 0) goto L_0x0022
            r3 = r3 & -2
            r3 = r3 & r2
            r4 = r4 & -2
            r4 = r4 | 2
            goto L_0x0025
        L_0x0022:
            r3 = r3 & r2
            r4 = r4 | 1
        L_0x0025:
            r5 = 0
            r6 = r3
            r7 = r5
            r8 = r7
        L_0x0029:
            r9 = r1[r6]
            if (r9 == 0) goto L_0x0069
            int r10 = r9.f18356f
            int r7 = r7 + r10
            int r11 = r9.f18357g
            int r11 = r10 - r11
            if (r11 >= 0) goto L_0x0069
            java9.util.concurrent.ForkJoinTask<?>[] r13 = r9.f18358h
            if (r13 == 0) goto L_0x0069
            int r11 = r13.length
            if (r11 <= 0) goto L_0x0069
            int r11 = r11 + -1
            r1 = r11 & r10
            long r1 = (long) r1
            int r3 = f18322F
            long r1 = r1 << r3
            int r3 = f18321E
            long r3 = (long) r3
            long r14 = r1 + r3
            sun.misc.Unsafe r1 = f18318B
            java.lang.Object r1 = r1.getObjectVolatile(r13, r14)
            java9.util.concurrent.ForkJoinTask r1 = (java9.util.concurrent.ForkJoinTask) r1
            if (r1 == 0) goto L_0x0002
            int r2 = r10 + 1
            int r3 = r9.f18356f
            if (r10 != r3) goto L_0x0002
            sun.misc.Unsafe r12 = f18318B
            r17 = 0
            r16 = r1
            boolean r3 = r12.compareAndSwapObject(r13, r14, r16, r17)
            if (r3 == 0) goto L_0x0002
            r9.f18356f = r2
            return r1
        L_0x0069:
            int r6 = r6 + r4
            r6 = r6 & r2
            if (r6 != r3) goto L_0x0029
            if (r8 != r7) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r8 = r7
            r7 = r5
            goto L_0x0029
        L_0x0073:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.mo47241y(boolean):java9.util.concurrent.ForkJoinTask");
    }

    /* renamed from: z */
    public ForkJoinTask<?> mo47242z() {
        return mo47241y(true);
    }

    public C9346b() {
        this(Math.min(32767, Runtime.getRuntime().availableProcessors()), f18324v, (Thread.UncaughtExceptionHandler) null, false, 0, 32767, 1, (C9365a<? super C9346b>) null, RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, TimeUnit.MILLISECONDS);
    }

    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new ForkJoinTask.C9479a(callable);
    }

    public C9346b(int i, C9350c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z, int i2, int i3, int i4, C9365a<? super C9346b> aVar, long j, TimeUnit timeUnit) {
        int i5 = i;
        int i6 = i3;
        long j2 = j;
        if (i5 <= 0 || i5 > 32767 || i6 < i5 || j2 <= 0) {
            throw new IllegalArgumentException();
        }
        C9335b.m25184a(cVar);
        long max = Math.max(timeUnit.toMillis(j2), 20);
        long j3 = ((((long) (-Math.min(Math.max(i2, i), 32767))) << 32) & 281470681743360L) | ((((long) (-i5)) << 48) & -281474976710656L);
        int i7 = (z ? 65536 : 0) | i5;
        int min = ((Math.min(i6, 32767) - i5) << 16) | ((Math.min(Math.max(i4, 0), 32767) - i5) & 65535);
        int i8 = i5 > 1 ? i5 - 1 : 1;
        int i9 = i8 | (i8 >>> 1);
        int i10 = i9 | (i9 >>> 2);
        int i11 = i10 | (i10 >>> 4);
        int i12 = i11 | (i11 >>> 8);
        this.f18336r = "ForkJoinPool-" + m25220w() + "-worker-";
        this.f18335q = new C9355g[(((i12 | (i12 >>> 16)) + 1) << 1)];
        this.f18337s = cVar;
        this.f18338t = uncaughtExceptionHandler;
        this.f18339u = aVar;
        this.f18331m = max;
        this.f18333o = min;
        this.f18334p = i7;
        this.f18329e = j3;
        m25208c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9346b(byte r11) {
        /*
            r10 = this;
            r10.<init>()
            r11 = 0
            r0 = -1
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool.common.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0022 }
        L_0x0011:
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool.common.threadFactory"
            java.lang.Object r1 = m25219v(r1)     // Catch:{ Exception -> 0x0022 }
            g.a.d.b$c r1 = (p620g.p621a.p622d.C9346b.C9350c) r1     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = "java.util.concurrent.ForkJoinPool.common.exceptionHandler"
            java.lang.Object r2 = m25219v(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.Thread$UncaughtExceptionHandler r2 = (java.lang.Thread.UncaughtExceptionHandler) r2     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r11
        L_0x0024:
            if (r1 != 0) goto L_0x0034
            java.lang.SecurityManager r1 = java.lang.System.getSecurityManager()
            if (r1 != 0) goto L_0x002f
            g.a.d.b$c r1 = f18324v
            goto L_0x0034
        L_0x002f:
            g.a.d.b$d r1 = new g.a.d.b$d
            r1.<init>(r11)
        L_0x0034:
            r3 = 1
            if (r0 >= 0) goto L_0x0043
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 - r3
            if (r0 > 0) goto L_0x0043
            r0 = r3
        L_0x0043:
            r4 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r4) goto L_0x0048
            r0 = r4
        L_0x0048:
            int r4 = -r0
            long r4 = (long) r4
            r6 = 32
            long r6 = r4 << r6
            r8 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            long r6 = r6 & r8
            r8 = 48
            long r4 = r4 << r8
            r8 = -281474976710656(0xffff000000000000, double:NaN)
            long r4 = r4 & r8
            long r4 = r4 | r6
            int r6 = 1 - r0
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            int r7 = f18328z
            int r7 = r7 << 16
            r6 = r6 | r7
            if (r0 <= r3) goto L_0x006b
            int r7 = r0 + -1
            goto L_0x006c
        L_0x006b:
            r7 = r3
        L_0x006c:
            int r8 = r7 >>> 1
            r7 = r7 | r8
            int r8 = r7 >>> 2
            r7 = r7 | r8
            int r8 = r7 >>> 4
            r7 = r7 | r8
            int r8 = r7 >>> 8
            r7 = r7 | r8
            int r8 = r7 >>> 16
            r7 = r7 | r8
            int r7 = r7 + r3
            int r3 = r7 << 1
            java.lang.String r7 = "ForkJoinPool.commonPool-worker-"
            r10.f18336r = r7
            g.a.d.b$g[] r3 = new p620g.p621a.p622d.C9346b.C9355g[r3]
            r10.f18335q = r3
            r10.f18337s = r1
            r10.f18338t = r2
            r10.f18339u = r11
            r1 = 60000(0xea60, double:2.9644E-319)
            r10.f18331m = r1
            r10.f18333o = r6
            r10.f18334p = r0
            r10.f18329e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p620g.p621a.p622d.C9346b.<init>(byte):void");
    }
}

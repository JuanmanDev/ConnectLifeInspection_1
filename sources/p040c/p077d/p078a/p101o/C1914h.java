package p040c.p077d.p078a.p101o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p040c.p077d.p078a.C1543e;
import p040c.p077d.p078a.p081k.p084j.C1662k;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p091l.p094e.C1844a;
import p040c.p077d.p078a.p101o.p102j.C1924g;
import p040c.p077d.p078a.p101o.p102j.C1925h;
import p040c.p077d.p078a.p101o.p103k.C1933c;
import p040c.p077d.p078a.p105q.C1950j;
import p040c.p077d.p078a.p105q.p106k.C1952a;
import p040c.p077d.p078a.p105q.p106k.C1961c;

/* renamed from: c.d.a.o.h */
/* compiled from: SingleRequest */
public final class C1914h<R> implements C1909c, C1924g, C1913g, C1952a.C1958f {

    /* renamed from: M */
    public static final Pools.Pool<C1914h<?>> f1554M = C1952a.m2588d(150, new C1915a());

    /* renamed from: N */
    public static final boolean f1555N = Log.isLoggable("Request", 2);

    /* renamed from: A */
    public C1933c<? super R> f1556A;

    /* renamed from: B */
    public Executor f1557B;

    /* renamed from: C */
    public C1685u<R> f1558C;

    /* renamed from: D */
    public C1662k.C1668d f1559D;

    /* renamed from: E */
    public long f1560E;
    @GuardedBy("this")

    /* renamed from: F */
    public C1916b f1561F;

    /* renamed from: G */
    public Drawable f1562G;

    /* renamed from: H */
    public Drawable f1563H;

    /* renamed from: I */
    public Drawable f1564I;

    /* renamed from: J */
    public int f1565J;

    /* renamed from: K */
    public int f1566K;
    @Nullable

    /* renamed from: L */
    public RuntimeException f1567L;

    /* renamed from: e */
    public boolean f1568e;
    @Nullable

    /* renamed from: l */
    public final String f1569l;

    /* renamed from: m */
    public final C1961c f1570m;
    @Nullable

    /* renamed from: n */
    public C1911e<R> f1571n;

    /* renamed from: o */
    public C1910d f1572o;

    /* renamed from: p */
    public Context f1573p;

    /* renamed from: q */
    public C1543e f1574q;
    @Nullable

    /* renamed from: r */
    public Object f1575r;

    /* renamed from: s */
    public Class<R> f1576s;

    /* renamed from: t */
    public C1907a<?> f1577t;

    /* renamed from: u */
    public int f1578u;

    /* renamed from: v */
    public int f1579v;

    /* renamed from: w */
    public Priority f1580w;

    /* renamed from: x */
    public C1925h<R> f1581x;
    @Nullable

    /* renamed from: y */
    public List<C1911e<R>> f1582y;

    /* renamed from: z */
    public C1662k f1583z;

    /* renamed from: c.d.a.o.h$a */
    /* compiled from: SingleRequest */
    public class C1915a implements C1952a.C1956d<C1914h<?>> {
        /* renamed from: a */
        public C1914h<?> create() {
            return new C1914h<>();
        }
    }

    /* renamed from: c.d.a.o.h$b */
    /* compiled from: SingleRequest */
    public enum C1916b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public C1914h() {
        this.f1569l = f1555N ? String.valueOf(super.hashCode()) : null;
        this.f1570m = C1961c.m2601a();
    }

    /* renamed from: B */
    public static <R> C1914h<R> m2420B(Context context, C1543e eVar, Object obj, Class<R> cls, C1907a<?> aVar, int i, int i2, Priority priority, C1925h<R> hVar, C1911e<R> eVar2, @Nullable List<C1911e<R>> list, C1910d dVar, C1662k kVar, C1933c<? super R> cVar, Executor executor) {
        C1914h<R> acquire = f1554M.acquire();
        if (acquire == null) {
            acquire = new C1914h<>();
        }
        acquire.mo16360t(context, eVar, obj, cls, aVar, i, i2, priority, hVar, eVar2, list, dVar, kVar, cVar, executor);
        return acquire;
    }

    /* renamed from: y */
    public static int m2421y(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: A */
    public final void mo16346A() {
        C1910d dVar = this.f1572o;
        if (dVar != null) {
            dVar.mo16333k(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public final synchronized void mo16347C(GlideException glideException, int i) {
        boolean z;
        this.f1570m.mo16455c();
        glideException.setOrigin(this.f1567L);
        int g = this.f1574q.mo15472g();
        if (g <= i) {
            "Load failed for " + this.f1575r + " with size [" + this.f1565J + "x" + this.f1566K + "]";
            if (g <= 4) {
                glideException.logRootCauses("Glide");
            }
        }
        this.f1559D = null;
        this.f1561F = C1916b.FAILED;
        boolean z2 = true;
        this.f1568e = true;
        try {
            if (this.f1582y != null) {
                z = false;
                for (C1911e<R> a : this.f1582y) {
                    z |= a.mo16342a(glideException, this.f1575r, this.f1581x, mo16361u());
                }
            } else {
                z = false;
            }
            if (this.f1571n == null || !this.f1571n.mo16342a(glideException, this.f1575r, this.f1581x, mo16361u())) {
                z2 = false;
            }
            if (!z && !z2) {
                mo16350F();
            }
            this.f1568e = false;
            mo16365z();
        } catch (Throwable th) {
            this.f1568e = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6 A[Catch:{ all -> 0x00b8 }] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo16348D(p040c.p077d.p078a.p081k.p084j.C1685u<R> r11, R r12, com.bumptech.glide.load.DataSource r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r6 = r10.mo16361u()     // Catch:{ all -> 0x00bc }
            c.d.a.o.h$b r0 = p040c.p077d.p078a.p101o.C1914h.C1916b.COMPLETE     // Catch:{ all -> 0x00bc }
            r10.f1561F = r0     // Catch:{ all -> 0x00bc }
            r10.f1558C = r11     // Catch:{ all -> 0x00bc }
            c.d.a.e r11 = r10.f1574q     // Catch:{ all -> 0x00bc }
            int r11 = r11.mo15472g()     // Catch:{ all -> 0x00bc }
            r0 = 3
            if (r11 > r0) goto L_0x0065
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r11.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "Finished loading "
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x00bc }
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = " from "
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            r11.append(r13)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = " for "
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r10.f1575r     // Catch:{ all -> 0x00bc }
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = " with size ["
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            int r0 = r10.f1565J     // Catch:{ all -> 0x00bc }
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "x"
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            int r0 = r10.f1566K     // Catch:{ all -> 0x00bc }
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "] in "
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            long r0 = r10.f1560E     // Catch:{ all -> 0x00bc }
            double r0 = p040c.p077d.p078a.p105q.C1945e.m2546a(r0)     // Catch:{ all -> 0x00bc }
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = " ms"
            r11.append(r0)     // Catch:{ all -> 0x00bc }
            r11.toString()     // Catch:{ all -> 0x00bc }
        L_0x0065:
            r11 = 1
            r10.f1568e = r11     // Catch:{ all -> 0x00bc }
            r7 = 0
            java.util.List<c.d.a.o.e<R>> r0 = r10.f1582y     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x008d
            java.util.List<c.d.a.o.e<R>> r0 = r10.f1582y     // Catch:{ all -> 0x00b8 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r9 = r7
        L_0x0074:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b8 }
            c.d.a.o.e r0 = (p040c.p077d.p078a.p101o.C1911e) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r10.f1575r     // Catch:{ all -> 0x00b8 }
            c.d.a.o.j.h<R> r3 = r10.f1581x     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo16343b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r9 = r9 | r0
            goto L_0x0074
        L_0x008d:
            r9 = r7
        L_0x008e:
            c.d.a.o.e<R> r0 = r10.f1571n     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a2
            c.d.a.o.e<R> r0 = r10.f1571n     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r10.f1575r     // Catch:{ all -> 0x00b8 }
            c.d.a.o.j.h<R> r3 = r10.f1581x     // Catch:{ all -> 0x00b8 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo16343b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r11 = r7
        L_0x00a3:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b1
            c.d.a.o.k.c<? super R> r11 = r10.f1556A     // Catch:{ all -> 0x00b8 }
            c.d.a.o.k.b r11 = r11.mo16403a(r13, r6)     // Catch:{ all -> 0x00b8 }
            c.d.a.o.j.h<R> r13 = r10.f1581x     // Catch:{ all -> 0x00b8 }
            r13.mo16179b(r12, r11)     // Catch:{ all -> 0x00b8 }
        L_0x00b1:
            r10.f1568e = r7     // Catch:{ all -> 0x00bc }
            r10.mo16346A()     // Catch:{ all -> 0x00bc }
            monitor-exit(r10)
            return
        L_0x00b8:
            r11 = move-exception
            r10.f1568e = r7     // Catch:{ all -> 0x00bc }
            throw r11     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1914h.mo16348D(c.d.a.k.j.u, java.lang.Object, com.bumptech.glide.load.DataSource):void");
    }

    /* renamed from: E */
    public final void mo16349E(C1685u<?> uVar) {
        this.f1583z.mo15829j(uVar);
        this.f1558C = null;
    }

    /* renamed from: F */
    public final synchronized void mo16350F() {
        if (mo16354n()) {
            Drawable drawable = null;
            if (this.f1575r == null) {
                drawable = mo16358r();
            }
            if (drawable == null) {
                drawable = mo16357q();
            }
            if (drawable == null) {
                drawable = mo16359s();
            }
            this.f1581x.mo16373d(drawable);
        }
    }

    /* renamed from: a */
    public synchronized void mo16344a(GlideException glideException) {
        mo16347C(glideException, 5);
    }

    /* renamed from: b */
    public synchronized void mo16345b(C1685u<?> uVar, DataSource dataSource) {
        this.f1570m.mo16455c();
        this.f1559D = null;
        if (uVar == null) {
            mo16344a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f1576s + " inside, but instead got null."));
            return;
        }
        Object obj = uVar.get();
        if (obj != null) {
            if (this.f1576s.isAssignableFrom(obj.getClass())) {
                if (!mo16355o()) {
                    mo16349E(uVar);
                    this.f1561F = C1916b.COMPLETE;
                    return;
                }
                mo16348D(uVar, obj, dataSource);
                return;
            }
        }
        mo16349E(uVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f1576s);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(uVar);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo16344a(new GlideException(sb.toString()));
    }

    /* renamed from: c */
    public synchronized void mo16323c() {
        mo16352k();
        this.f1573p = null;
        this.f1574q = null;
        this.f1575r = null;
        this.f1576s = null;
        this.f1577t = null;
        this.f1578u = -1;
        this.f1579v = -1;
        this.f1581x = null;
        this.f1582y = null;
        this.f1571n = null;
        this.f1572o = null;
        this.f1556A = null;
        this.f1559D = null;
        this.f1562G = null;
        this.f1563H = null;
        this.f1564I = null;
        this.f1565J = -1;
        this.f1566K = -1;
        this.f1567L = null;
        f1554M.release(this);
    }

    public synchronized void clear() {
        mo16352k();
        this.f1570m.mo16455c();
        if (this.f1561F != C1916b.CLEARED) {
            mo16356p();
            if (this.f1558C != null) {
                mo16349E(this.f1558C);
            }
            if (mo16353m()) {
                this.f1581x.mo16376g(mo16359s());
            }
            this.f1561F = C1916b.CLEARED;
        }
    }

    /* renamed from: d */
    public synchronized boolean mo16325d(C1909c cVar) {
        boolean z = false;
        if (!(cVar instanceof C1914h)) {
            return false;
        }
        C1914h hVar = (C1914h) cVar;
        synchronized (hVar) {
            if (this.f1578u == hVar.f1578u && this.f1579v == hVar.f1579v && C1950j.m2566b(this.f1575r, hVar.f1575r) && this.f1576s.equals(hVar.f1576s) && this.f1577t.equals(hVar.f1577t) && this.f1580w == hVar.f1580w && mo16362v(hVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public synchronized boolean mo16326e() {
        return mo16334l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo16351f(int r22, int r23) {
        /*
            r21 = this;
            r15 = r21
            monitor-enter(r21)
            c.d.a.q.k.c r0 = r15.f1570m     // Catch:{ all -> 0x00f7 }
            r0.mo16455c()     // Catch:{ all -> 0x00f7 }
            boolean r0 = f1555N     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "Got onSizeReady in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f1560E     // Catch:{ all -> 0x00f7 }
            double r1 = p040c.p077d.p078a.p105q.C1945e.m2546a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.mo16364x(r0)     // Catch:{ all -> 0x00f7 }
        L_0x0026:
            c.d.a.o.h$b r0 = r15.f1561F     // Catch:{ all -> 0x00f7 }
            c.d.a.o.h$b r1 = p040c.p077d.p078a.p101o.C1914h.C1916b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00f7 }
            if (r0 == r1) goto L_0x002e
            monitor-exit(r21)
            return
        L_0x002e:
            c.d.a.o.h$b r0 = p040c.p077d.p078a.p101o.C1914h.C1916b.RUNNING     // Catch:{ all -> 0x00f7 }
            r15.f1561F = r0     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            float r0 = r0.mo16263G()     // Catch:{ all -> 0x00f7 }
            r1 = r22
            int r1 = m2421y(r1, r0)     // Catch:{ all -> 0x00f7 }
            r15.f1565J = r1     // Catch:{ all -> 0x00f7 }
            r1 = r23
            int r0 = m2421y(r1, r0)     // Catch:{ all -> 0x00f7 }
            r15.f1566K = r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = f1555N     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "finished setup for calling load in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f1560E     // Catch:{ all -> 0x00f7 }
            double r1 = p040c.p077d.p078a.p105q.C1945e.m2546a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.mo16364x(r0)     // Catch:{ all -> 0x00f7 }
        L_0x0066:
            c.d.a.k.j.k r1 = r15.f1583z     // Catch:{ all -> 0x00f7 }
            c.d.a.e r2 = r15.f1574q     // Catch:{ all -> 0x00f7 }
            java.lang.Object r3 = r15.f1575r     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            c.d.a.k.c r4 = r0.mo16262F()     // Catch:{ all -> 0x00f7 }
            int r5 = r15.f1565J     // Catch:{ all -> 0x00f7 }
            int r6 = r15.f1566K     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = r0.mo16261E()     // Catch:{ all -> 0x00f7 }
            java.lang.Class<R> r8 = r15.f1576s     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.Priority r9 = r15.f1580w     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            c.d.a.k.j.j r10 = r0.mo16304m()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            java.util.Map r11 = r0.mo16265I()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r12 = r0.mo16273S()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r13 = r0.mo16270N()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            c.d.a.k.e r14 = r0.mo16316t()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.mo16268L()     // Catch:{ all -> 0x00f7 }
            r22 = r0
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r16 = r0.mo16267K()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r17 = r0.mo16266J()     // Catch:{ all -> 0x00f7 }
            c.d.a.o.a<?> r0 = r15.f1577t     // Catch:{ all -> 0x00f7 }
            boolean r18 = r0.mo16315s()     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.Executor r0 = r15.f1557B     // Catch:{ all -> 0x00f7 }
            r15 = r22
            r19 = r21
            r20 = r0
            c.d.a.k.j.k$d r0 = r1.mo15826f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f3 }
            r1 = r21
            r1.f1559D = r0     // Catch:{ all -> 0x00f1 }
            c.d.a.o.h$b r0 = r1.f1561F     // Catch:{ all -> 0x00f1 }
            c.d.a.o.h$b r2 = p040c.p077d.p078a.p101o.C1914h.C1916b.RUNNING     // Catch:{ all -> 0x00f1 }
            if (r0 == r2) goto L_0x00d1
            r0 = 0
            r1.f1559D = r0     // Catch:{ all -> 0x00f1 }
        L_0x00d1:
            boolean r0 = f1555N     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            long r2 = r1.f1560E     // Catch:{ all -> 0x00f1 }
            double r2 = p040c.p077d.p078a.p105q.C1945e.m2546a(r2)     // Catch:{ all -> 0x00f1 }
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f1 }
            r1.mo16364x(r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r21)
            return
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f3:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00f7:
            r0 = move-exception
            r1 = r15
        L_0x00f9:
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1914h.mo16351f(int, int):void");
    }

    /* renamed from: g */
    public synchronized boolean mo16328g() {
        return this.f1561F == C1916b.FAILED;
    }

    /* renamed from: h */
    public synchronized boolean mo16329h() {
        return this.f1561F == C1916b.CLEARED;
    }

    @NonNull
    /* renamed from: i */
    public C1961c mo15723i() {
        return this.f1570m;
    }

    public synchronized boolean isRunning() {
        return this.f1561F == C1916b.RUNNING || this.f1561F == C1916b.WAITING_FOR_SIZE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo16332j() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo16352k()     // Catch:{ all -> 0x00ad }
            c.d.a.q.k.c r0 = r3.f1570m     // Catch:{ all -> 0x00ad }
            r0.mo16455c()     // Catch:{ all -> 0x00ad }
            long r0 = p040c.p077d.p078a.p105q.C1945e.m2547b()     // Catch:{ all -> 0x00ad }
            r3.f1560E = r0     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r3.f1575r     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x003a
            int r0 = r3.f1578u     // Catch:{ all -> 0x00ad }
            int r1 = r3.f1579v     // Catch:{ all -> 0x00ad }
            boolean r0 = p040c.p077d.p078a.p105q.C1950j.m2583s(r0, r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0025
            int r0 = r3.f1578u     // Catch:{ all -> 0x00ad }
            r3.f1565J = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f1579v     // Catch:{ all -> 0x00ad }
            r3.f1566K = r0     // Catch:{ all -> 0x00ad }
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r3.mo16358r()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x002d
            r0 = 5
            goto L_0x002e
        L_0x002d:
            r0 = 3
        L_0x002e:
            com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "Received null model"
            r1.<init>(r2)     // Catch:{ all -> 0x00ad }
            r3.mo16347C(r1, r0)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x003a:
            c.d.a.o.h$b r0 = r3.f1561F     // Catch:{ all -> 0x00ad }
            c.d.a.o.h$b r1 = p040c.p077d.p078a.p101o.C1914h.C1916b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x00a5
            c.d.a.o.h$b r0 = r3.f1561F     // Catch:{ all -> 0x00ad }
            c.d.a.o.h$b r1 = p040c.p077d.p078a.p101o.C1914h.C1916b.COMPLETE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x004f
            c.d.a.k.j.u<R> r0 = r3.f1558C     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00ad }
            r3.mo16345b(r0, r1)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x004f:
            c.d.a.o.h$b r0 = p040c.p077d.p078a.p101o.C1914h.C1916b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            r3.f1561F = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f1578u     // Catch:{ all -> 0x00ad }
            int r1 = r3.f1579v     // Catch:{ all -> 0x00ad }
            boolean r0 = p040c.p077d.p078a.p105q.C1950j.m2583s(r0, r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0065
            int r0 = r3.f1578u     // Catch:{ all -> 0x00ad }
            int r1 = r3.f1579v     // Catch:{ all -> 0x00ad }
            r3.mo16351f(r0, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x006a
        L_0x0065:
            c.d.a.o.j.h<R> r0 = r3.f1581x     // Catch:{ all -> 0x00ad }
            r0.mo16385h(r3)     // Catch:{ all -> 0x00ad }
        L_0x006a:
            c.d.a.o.h$b r0 = r3.f1561F     // Catch:{ all -> 0x00ad }
            c.d.a.o.h$b r1 = p040c.p077d.p078a.p101o.C1914h.C1916b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x0076
            c.d.a.o.h$b r0 = r3.f1561F     // Catch:{ all -> 0x00ad }
            c.d.a.o.h$b r1 = p040c.p077d.p078a.p101o.C1914h.C1916b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x0085
        L_0x0076:
            boolean r0 = r3.mo16354n()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0085
            c.d.a.o.j.h<R> r0 = r3.f1581x     // Catch:{ all -> 0x00ad }
            android.graphics.drawable.Drawable r1 = r3.mo16359s()     // Catch:{ all -> 0x00ad }
            r0.mo16374e(r1)     // Catch:{ all -> 0x00ad }
        L_0x0085:
            boolean r0 = f1555N     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "finished run method in "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            long r1 = r3.f1560E     // Catch:{ all -> 0x00ad }
            double r1 = p040c.p077d.p078a.p105q.C1945e.m2546a(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ad }
            r3.mo16364x(r0)     // Catch:{ all -> 0x00ad }
        L_0x00a3:
            monitor-exit(r3)
            return
        L_0x00a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Cannot restart a running request"
            r0.<init>(r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1914h.mo16332j():void");
    }

    /* renamed from: k */
    public final void mo16352k() {
        if (this.f1568e) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    public synchronized boolean mo16334l() {
        return this.f1561F == C1916b.COMPLETE;
    }

    /* renamed from: m */
    public final boolean mo16353m() {
        C1910d dVar = this.f1572o;
        return dVar == null || dVar.mo16335m(this);
    }

    /* renamed from: n */
    public final boolean mo16354n() {
        C1910d dVar = this.f1572o;
        return dVar == null || dVar.mo16327f(this);
    }

    /* renamed from: o */
    public final boolean mo16355o() {
        C1910d dVar = this.f1572o;
        return dVar == null || dVar.mo16330i(this);
    }

    /* renamed from: p */
    public final void mo16356p() {
        mo16352k();
        this.f1570m.mo16455c();
        this.f1581x.mo16384a(this);
        C1662k.C1668d dVar = this.f1559D;
        if (dVar != null) {
            dVar.mo15834a();
            this.f1559D = null;
        }
    }

    /* renamed from: q */
    public final Drawable mo16357q() {
        if (this.f1562G == null) {
            Drawable p = this.f1577t.mo16309p();
            this.f1562G = p;
            if (p == null && this.f1577t.mo16306n() > 0) {
                this.f1562G = mo16363w(this.f1577t.mo16306n());
            }
        }
        return this.f1562G;
    }

    /* renamed from: r */
    public final Drawable mo16358r() {
        if (this.f1564I == null) {
            Drawable q = this.f1577t.mo16311q();
            this.f1564I = q;
            if (q == null && this.f1577t.mo16313r() > 0) {
                this.f1564I = mo16363w(this.f1577t.mo16313r());
            }
        }
        return this.f1564I;
    }

    /* renamed from: s */
    public final Drawable mo16359s() {
        if (this.f1563H == null) {
            Drawable y = this.f1577t.mo16319y();
            this.f1563H = y;
            if (y == null && this.f1577t.mo16320z() > 0) {
                this.f1563H = mo16363w(this.f1577t.mo16320z());
            }
        }
        return this.f1563H;
    }

    /* renamed from: t */
    public final synchronized void mo16360t(Context context, C1543e eVar, Object obj, Class<R> cls, C1907a<?> aVar, int i, int i2, Priority priority, C1925h<R> hVar, C1911e<R> eVar2, @Nullable List<C1911e<R>> list, C1910d dVar, C1662k kVar, C1933c<? super R> cVar, Executor executor) {
        this.f1573p = context;
        this.f1574q = eVar;
        this.f1575r = obj;
        this.f1576s = cls;
        this.f1577t = aVar;
        this.f1578u = i;
        this.f1579v = i2;
        this.f1580w = priority;
        this.f1581x = hVar;
        this.f1571n = eVar2;
        this.f1582y = list;
        this.f1572o = dVar;
        this.f1583z = kVar;
        this.f1556A = cVar;
        this.f1557B = executor;
        this.f1561F = C1916b.PENDING;
        if (this.f1567L == null && eVar.mo15474i()) {
            this.f1567L = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public final boolean mo16361u() {
        C1910d dVar = this.f1572o;
        return dVar == null || !dVar.mo16322b();
    }

    /* renamed from: v */
    public final synchronized boolean mo16362v(C1914h<?> hVar) {
        boolean z;
        synchronized (hVar) {
            z = false;
            if ((this.f1582y == null ? 0 : this.f1582y.size()) == (hVar.f1582y == null ? 0 : hVar.f1582y.size())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: w */
    public final Drawable mo16363w(@DrawableRes int i) {
        return C1844a.m2144a(this.f1574q, i, this.f1577t.mo16264H() != null ? this.f1577t.mo16264H() : this.f1573p.getTheme());
    }

    /* renamed from: x */
    public final void mo16364x(String str) {
        str + " this: " + this.f1569l;
    }

    /* renamed from: z */
    public final void mo16365z() {
        C1910d dVar = this.f1572o;
        if (dVar != null) {
            dVar.mo16321a(this);
        }
    }
}

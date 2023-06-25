package p040c.p077d.p078a.p081k.p084j;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.C1543e;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p081k.p084j.C1643f;
import p040c.p077d.p078a.p081k.p084j.C1655i;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;
import p040c.p077d.p078a.p081k.p091l.p092c.C1814k;
import p040c.p077d.p078a.p105q.C1945e;
import p040c.p077d.p078a.p105q.p106k.C1952a;
import p040c.p077d.p078a.p105q.p106k.C1960b;
import p040c.p077d.p078a.p105q.p106k.C1961c;

/* renamed from: c.d.a.k.j.h */
/* compiled from: DecodeJob */
public class C1646h<R> implements C1643f.C1644a, Runnable, Comparable<C1646h<?>>, C1952a.C1958f {

    /* renamed from: A */
    public int f1049A;

    /* renamed from: B */
    public C1654h f1050B;

    /* renamed from: C */
    public C1653g f1051C;

    /* renamed from: D */
    public long f1052D;

    /* renamed from: E */
    public boolean f1053E;

    /* renamed from: F */
    public Object f1054F;

    /* renamed from: G */
    public Thread f1055G;

    /* renamed from: H */
    public C1567c f1056H;

    /* renamed from: I */
    public C1567c f1057I;

    /* renamed from: J */
    public Object f1058J;

    /* renamed from: K */
    public DataSource f1059K;

    /* renamed from: L */
    public C1578d<?> f1060L;

    /* renamed from: M */
    public volatile C1643f f1061M;

    /* renamed from: N */
    public volatile boolean f1062N;

    /* renamed from: O */
    public volatile boolean f1063O;

    /* renamed from: e */
    public final C1645g<R> f1064e = new C1645g<>();

    /* renamed from: l */
    public final List<Throwable> f1065l = new ArrayList();

    /* renamed from: m */
    public final C1961c f1066m = C1961c.m2601a();

    /* renamed from: n */
    public final C1651e f1067n;

    /* renamed from: o */
    public final Pools.Pool<C1646h<?>> f1068o;

    /* renamed from: p */
    public final C1650d<?> f1069p = new C1650d<>();

    /* renamed from: q */
    public final C1652f f1070q = new C1652f();

    /* renamed from: r */
    public C1543e f1071r;

    /* renamed from: s */
    public C1567c f1072s;

    /* renamed from: t */
    public Priority f1073t;

    /* renamed from: u */
    public C1676n f1074u;

    /* renamed from: v */
    public int f1075v;

    /* renamed from: w */
    public int f1076w;

    /* renamed from: x */
    public C1657j f1077x;

    /* renamed from: y */
    public C1571e f1078y;

    /* renamed from: z */
    public C1648b<R> f1079z;

    /* renamed from: c.d.a.k.j.h$a */
    /* compiled from: DecodeJob */
    public static /* synthetic */ class C1647a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1080a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1081b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f1082c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1082c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1082c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                c.d.a.k.j.h$h[] r2 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f1081b = r2
                c.d.a.k.j.h$h r3 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f1081b     // Catch:{ NoSuchFieldError -> 0x0038 }
                c.d.a.k.j.h$h r3 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f1081b     // Catch:{ NoSuchFieldError -> 0x0043 }
                c.d.a.k.j.h$h r4 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f1081b     // Catch:{ NoSuchFieldError -> 0x004e }
                c.d.a.k.j.h$h r4 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f1081b     // Catch:{ NoSuchFieldError -> 0x0059 }
                c.d.a.k.j.h$h r4 = p040c.p077d.p078a.p081k.p084j.C1646h.C1654h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                c.d.a.k.j.h$g[] r3 = p040c.p077d.p078a.p081k.p084j.C1646h.C1653g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f1080a = r3
                c.d.a.k.j.h$g r4 = p040c.p077d.p078a.p081k.p084j.C1646h.C1653g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f1080a     // Catch:{ NoSuchFieldError -> 0x0074 }
                c.d.a.k.j.h$g r3 = p040c.p077d.p078a.p081k.p084j.C1646h.C1653g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f1080a     // Catch:{ NoSuchFieldError -> 0x007e }
                c.d.a.k.j.h$g r1 = p040c.p077d.p078a.p081k.p084j.C1646h.C1653g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1646h.C1647a.<clinit>():void");
        }
    }

    /* renamed from: c.d.a.k.j.h$b */
    /* compiled from: DecodeJob */
    public interface C1648b<R> {
        /* renamed from: a */
        void mo15800a(GlideException glideException);

        /* renamed from: b */
        void mo15801b(C1685u<R> uVar, DataSource dataSource);

        /* renamed from: c */
        void mo15802c(C1646h<?> hVar);
    }

    /* renamed from: c.d.a.k.j.h$c */
    /* compiled from: DecodeJob */
    public final class C1649c<Z> implements C1655i.C1656a<Z> {

        /* renamed from: a */
        public final DataSource f1083a;

        public C1649c(DataSource dataSource) {
            this.f1083a = dataSource;
        }

        @NonNull
        /* renamed from: a */
        public C1685u<Z> mo15803a(@NonNull C1685u<Z> uVar) {
            return C1646h.this.mo15774B(this.f1083a, uVar);
        }
    }

    /* renamed from: c.d.a.k.j.h$d */
    /* compiled from: DecodeJob */
    public static class C1650d<Z> {

        /* renamed from: a */
        public C1567c f1085a;

        /* renamed from: b */
        public C1573g<Z> f1086b;

        /* renamed from: c */
        public C1683t<Z> f1087c;

        /* renamed from: a */
        public void mo15804a() {
            this.f1085a = null;
            this.f1086b = null;
            this.f1087c = null;
        }

        /* renamed from: b */
        public void mo15805b(C1651e eVar, C1571e eVar2) {
            C1960b.m2597a("DecodeJob.encode");
            try {
                eVar.mo15808a().mo15692a(this.f1085a, new C1642e(this.f1086b, this.f1087c, eVar2));
            } finally {
                this.f1087c.mo15885g();
                C1960b.m2600d();
            }
        }

        /* renamed from: c */
        public boolean mo15806c() {
            return this.f1087c != null;
        }

        /* renamed from: d */
        public <X> void mo15807d(C1567c cVar, C1573g<X> gVar, C1683t<X> tVar) {
            this.f1085a = cVar;
            this.f1086b = gVar;
            this.f1087c = tVar;
        }
    }

    /* renamed from: c.d.a.k.j.h$e */
    /* compiled from: DecodeJob */
    public interface C1651e {
        /* renamed from: a */
        C1609a mo15808a();
    }

    /* renamed from: c.d.a.k.j.h$f */
    /* compiled from: DecodeJob */
    public static class C1652f {

        /* renamed from: a */
        public boolean f1088a;

        /* renamed from: b */
        public boolean f1089b;

        /* renamed from: c */
        public boolean f1090c;

        /* renamed from: a */
        public final boolean mo15809a(boolean z) {
            return (this.f1090c || z || this.f1089b) && this.f1088a;
        }

        /* renamed from: b */
        public synchronized boolean mo15810b() {
            this.f1089b = true;
            return mo15809a(false);
        }

        /* renamed from: c */
        public synchronized boolean mo15811c() {
            this.f1090c = true;
            return mo15809a(false);
        }

        /* renamed from: d */
        public synchronized boolean mo15812d(boolean z) {
            this.f1088a = true;
            return mo15809a(z);
        }

        /* renamed from: e */
        public synchronized void mo15813e() {
            this.f1089b = false;
            this.f1088a = false;
            this.f1090c = false;
        }
    }

    /* renamed from: c.d.a.k.j.h$g */
    /* compiled from: DecodeJob */
    public enum C1653g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: c.d.a.k.j.h$h */
    /* compiled from: DecodeJob */
    public enum C1654h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public C1646h(C1651e eVar, Pools.Pool<C1646h<?>> pool) {
        this.f1067n = eVar;
        this.f1068o = pool;
    }

    /* renamed from: A */
    public final void mo15773A() {
        if (this.f1070q.mo15811c()) {
            mo15776D();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: c.d.a.k.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: c.d.a.k.j.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: c.d.a.k.j.w} */
    /* JADX WARNING: type inference failed for: r12v5, types: [c.d.a.k.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> p040c.p077d.p078a.p081k.p084j.C1685u<Z> mo15774B(com.bumptech.glide.load.DataSource r12, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.p084j.C1685u<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            c.d.a.k.j.g<R> r0 = r11.f1064e
            c.d.a.k.h r0 = r0.mo15766r(r8)
            c.d.a.e r2 = r11.f1071r
            int r3 = r11.f1075v
            int r4 = r11.f1076w
            c.d.a.k.j.u r2 = r0.mo15623b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo15867c()
        L_0x002b:
            c.d.a.k.j.g<R> r13 = r11.f1064e
            boolean r13 = r13.mo15770v(r0)
            if (r13 == 0) goto L_0x0040
            c.d.a.k.j.g<R> r13 = r11.f1064e
            c.d.a.k.g r1 = r13.mo15762n(r0)
            c.d.a.k.e r13 = r11.f1078y
            com.bumptech.glide.load.EncodeStrategy r13 = r1.mo15622b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0042:
            r10 = r1
            c.d.a.k.j.g<R> r1 = r11.f1064e
            c.d.a.k.c r2 = r11.f1056H
            boolean r1 = r1.mo15772x(r2)
            r2 = 1
            r1 = r1 ^ r2
            c.d.a.k.j.j r3 = r11.f1077x
            boolean r12 = r3.mo15821d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = p040c.p077d.p078a.p081k.p084j.C1646h.C1647a.f1082c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            c.d.a.k.j.w r12 = new c.d.a.k.j.w
            c.d.a.k.j.g<R> r13 = r11.f1064e
            c.d.a.k.j.z.b r2 = r13.mo15750b()
            c.d.a.k.c r3 = r11.f1056H
            c.d.a.k.c r4 = r11.f1072s
            int r5 = r11.f1075v
            int r6 = r11.f1076w
            c.d.a.k.e r9 = r11.f1078y
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            c.d.a.k.j.d r12 = new c.d.a.k.j.d
            c.d.a.k.c r13 = r11.f1056H
            c.d.a.k.c r1 = r11.f1072s
            r12.<init>(r13, r1)
        L_0x009b:
            c.d.a.k.j.t r0 = p040c.p077d.p078a.p081k.p084j.C1683t.m1618b(r0)
            c.d.a.k.j.h$d<?> r13 = r11.f1069p
            r13.mo15807d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1646h.mo15774B(com.bumptech.glide.load.DataSource, c.d.a.k.j.u):c.d.a.k.j.u");
    }

    /* renamed from: C */
    public void mo15775C(boolean z) {
        if (this.f1070q.mo15812d(z)) {
            mo15776D();
        }
    }

    /* renamed from: D */
    public final void mo15776D() {
        this.f1070q.mo15813e();
        this.f1069p.mo15804a();
        this.f1064e.mo15749a();
        this.f1062N = false;
        this.f1071r = null;
        this.f1072s = null;
        this.f1078y = null;
        this.f1073t = null;
        this.f1074u = null;
        this.f1079z = null;
        this.f1050B = null;
        this.f1061M = null;
        this.f1055G = null;
        this.f1056H = null;
        this.f1058J = null;
        this.f1059K = null;
        this.f1060L = null;
        this.f1052D = 0;
        this.f1063O = false;
        this.f1054F = null;
        this.f1065l.clear();
        this.f1068o.release(this);
    }

    /* renamed from: E */
    public final void mo15777E() {
        this.f1055G = Thread.currentThread();
        this.f1052D = C1945e.m2547b();
        boolean z = false;
        while (!this.f1063O && this.f1061M != null && !(z = this.f1061M.mo15742a())) {
            this.f1050B = mo15789o(this.f1050B);
            this.f1061M = mo15788n();
            if (this.f1050B == C1654h.SOURCE) {
                mo15747e();
                return;
            }
        }
        if ((this.f1050B == C1654h.FINISHED || this.f1063O) && !z) {
            mo15798y();
        }
    }

    /* renamed from: F */
    public final <Data, ResourceType> C1685u<R> mo15778F(Data data, DataSource dataSource, C1682s<Data, ResourceType, R> sVar) {
        C1571e q = mo15790q(dataSource);
        C1580e l = this.f1071r.mo15473h().mo21649l(data);
        try {
            return sVar.mo15880a(l, q, this.f1075v, this.f1076w, new C1649c(dataSource));
        } finally {
            l.mo15646b();
        }
    }

    /* renamed from: G */
    public final void mo15779G() {
        int i = C1647a.f1080a[this.f1051C.ordinal()];
        if (i == 1) {
            this.f1050B = mo15789o(C1654h.INITIALIZE);
            this.f1061M = mo15788n();
            mo15777E();
        } else if (i == 2) {
            mo15777E();
        } else if (i == 3) {
            mo15787m();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f1051C);
        }
    }

    /* renamed from: H */
    public final void mo15780H() {
        Throwable th;
        this.f1066m.mo16455c();
        if (this.f1062N) {
            if (this.f1065l.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f1065l;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f1062N = true;
    }

    /* renamed from: I */
    public boolean mo15781I() {
        C1654h o = mo15789o(C1654h.INITIALIZE);
        return o == C1654h.RESOURCE_CACHE || o == C1654h.DATA_CACHE;
    }

    /* renamed from: c */
    public void mo15746c(C1567c cVar, Exception exc, C1578d<?> dVar, DataSource dataSource) {
        dVar.mo15629b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(cVar, dataSource, dVar.mo15624a());
        this.f1065l.add(glideException);
        if (Thread.currentThread() != this.f1055G) {
            this.f1051C = C1653g.SWITCH_TO_SOURCE_SERVICE;
            this.f1079z.mo15802c(this);
            return;
        }
        mo15777E();
    }

    /* renamed from: d */
    public void mo15783d() {
        this.f1063O = true;
        C1643f fVar = this.f1061M;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: e */
    public void mo15747e() {
        this.f1051C = C1653g.SWITCH_TO_SOURCE_SERVICE;
        this.f1079z.mo15802c(this);
    }

    /* renamed from: g */
    public void mo15748g(C1567c cVar, Object obj, C1578d<?> dVar, DataSource dataSource, C1567c cVar2) {
        this.f1056H = cVar;
        this.f1058J = obj;
        this.f1060L = dVar;
        this.f1059K = dataSource;
        this.f1057I = cVar2;
        if (Thread.currentThread() != this.f1055G) {
            this.f1051C = C1653g.DECODE_DATA;
            this.f1079z.mo15802c(this);
            return;
        }
        C1960b.m2597a("DecodeJob.decodeFromRetrievedData");
        try {
            mo15787m();
        } finally {
            C1960b.m2600d();
        }
    }

    /* renamed from: h */
    public int compareTo(@NonNull C1646h<?> hVar) {
        int r = mo15791r() - hVar.mo15791r();
        return r == 0 ? this.f1049A - hVar.f1049A : r;
    }

    @NonNull
    /* renamed from: i */
    public C1961c mo15723i() {
        return this.f1066m;
    }

    /* renamed from: j */
    public final <Data> C1685u<R> mo15785j(C1578d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            dVar.mo15629b();
            return null;
        }
        try {
            long b = C1945e.m2547b();
            C1685u<R> k = mo15786k(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                mo15794u("Decoded result " + k, b);
            }
            return k;
        } finally {
            dVar.mo15629b();
        }
    }

    /* renamed from: k */
    public final <Data> C1685u<R> mo15786k(Data data, DataSource dataSource) {
        return mo15778F(data, dataSource, this.f1064e.mo15756h(data.getClass()));
    }

    /* renamed from: m */
    public final void mo15787m() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f1052D;
            mo15795v("Retrieved data", j, "data: " + this.f1058J + ", cache key: " + this.f1056H + ", fetcher: " + this.f1060L);
        }
        C1685u<R> uVar = null;
        try {
            uVar = mo15785j(this.f1060L, this.f1058J, this.f1059K);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f1057I, this.f1059K);
            this.f1065l.add(e);
        }
        if (uVar != null) {
            mo15797x(uVar, this.f1059K);
        } else {
            mo15777E();
        }
    }

    /* renamed from: n */
    public final C1643f mo15788n() {
        int i = C1647a.f1081b[this.f1050B.ordinal()];
        if (i == 1) {
            return new C1686v(this.f1064e, this);
        }
        if (i == 2) {
            return new C1639c(this.f1064e, this);
        }
        if (i == 3) {
            return new C1690y(this.f1064e, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f1050B);
    }

    /* renamed from: o */
    public final C1654h mo15789o(C1654h hVar) {
        int i = C1647a.f1081b[hVar.ordinal()];
        if (i == 1) {
            return this.f1077x.mo15818a() ? C1654h.DATA_CACHE : mo15789o(C1654h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f1053E ? C1654h.FINISHED : C1654h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return C1654h.FINISHED;
        }
        if (i == 5) {
            return this.f1077x.mo15819b() ? C1654h.RESOURCE_CACHE : mo15789o(C1654h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    @NonNull
    /* renamed from: q */
    public final C1571e mo15790q(DataSource dataSource) {
        C1571e eVar = this.f1078y;
        if (Build.VERSION.SDK_INT < 26) {
            return eVar;
        }
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f1064e.mo15771w();
        Boolean bool = (Boolean) eVar.mo15616c(C1814k.f1383h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return eVar;
        }
        C1571e eVar2 = new C1571e();
        eVar2.mo15617d(this.f1078y);
        eVar2.mo15618e(C1814k.f1383h, Boolean.valueOf(z));
        return eVar2;
    }

    /* renamed from: r */
    public final int mo15791r() {
        return this.f1073t.ordinal();
    }

    public void run() {
        C1960b.m2598b("DecodeJob#run(model=%s)", this.f1054F);
        C1578d<?> dVar = this.f1060L;
        try {
            if (this.f1063O) {
                mo15798y();
                if (dVar != null) {
                    dVar.mo15629b();
                }
                C1960b.m2600d();
                return;
            }
            mo15779G();
            if (dVar != null) {
                dVar.mo15629b();
            }
            C1960b.m2600d();
        } catch (C1631b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo15629b();
            }
            C1960b.m2600d();
            throw th;
        }
    }

    /* renamed from: t */
    public C1646h<R> mo15793t(C1543e eVar, Object obj, C1676n nVar, C1567c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1657j jVar, Map<Class<?>, C1574h<?>> map, boolean z, boolean z2, boolean z3, C1571e eVar2, C1648b<R> bVar, int i3) {
        this.f1064e.mo15769u(eVar, obj, cVar, i, i2, jVar, cls, cls2, priority, eVar2, map, z, z2, this.f1067n);
        this.f1071r = eVar;
        this.f1072s = cVar;
        this.f1073t = priority;
        this.f1074u = nVar;
        this.f1075v = i;
        this.f1076w = i2;
        this.f1077x = jVar;
        this.f1053E = z3;
        this.f1078y = eVar2;
        this.f1079z = bVar;
        this.f1049A = i3;
        this.f1051C = C1653g.INITIALIZE;
        this.f1054F = obj;
        return this;
    }

    /* renamed from: u */
    public final void mo15794u(String str, long j) {
        mo15795v(str, j, (String) null);
    }

    /* renamed from: v */
    public final void mo15795v(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1945e.m2546a(j));
        sb.append(", load key: ");
        sb.append(this.f1074u);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.toString();
    }

    /* renamed from: w */
    public final void mo15796w(C1685u<R> uVar, DataSource dataSource) {
        mo15780H();
        this.f1079z.mo15801b(uVar, dataSource);
    }

    /* renamed from: x */
    public final void mo15797x(C1685u<R> uVar, DataSource dataSource) {
        if (uVar instanceof C1680q) {
            ((C1680q) uVar).mo15875a();
        }
        C1683t<R> tVar = null;
        C1683t<R> tVar2 = uVar;
        if (this.f1069p.mo15806c()) {
            C1683t<R> b = C1683t.m1618b(uVar);
            tVar = b;
            tVar2 = b;
        }
        mo15796w(tVar2, dataSource);
        this.f1050B = C1654h.ENCODE;
        try {
            if (this.f1069p.mo15806c()) {
                this.f1069p.mo15805b(this.f1067n, this.f1078y);
            }
            mo15799z();
        } finally {
            if (tVar != null) {
                tVar.mo15885g();
            }
        }
    }

    /* renamed from: y */
    public final void mo15798y() {
        mo15780H();
        this.f1079z.mo15800a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f1065l)));
        mo15773A();
    }

    /* renamed from: z */
    public final void mo15799z() {
        if (this.f1070q.mo15810b()) {
            mo15776D();
        }
    }
}

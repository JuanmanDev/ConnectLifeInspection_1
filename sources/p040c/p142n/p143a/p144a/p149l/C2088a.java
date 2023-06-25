package p040c.p142n.p143a.p144a.p149l;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.n.a.a.l.a */
/* compiled from: BytesToNameCanonicalizer */
public final class C2088a {

    /* renamed from: a */
    public final C2088a f2007a;

    /* renamed from: b */
    public final AtomicReference<C2090b> f2008b;

    /* renamed from: c */
    public final int f2009c;

    /* renamed from: d */
    public int f2010d;

    /* renamed from: e */
    public int f2011e;

    /* renamed from: f */
    public int f2012f;

    /* renamed from: g */
    public int[] f2013g;

    /* renamed from: h */
    public C2093c[] f2014h;

    /* renamed from: i */
    public C2089a[] f2015i;

    /* renamed from: j */
    public int f2016j;

    /* renamed from: k */
    public int f2017k;

    /* renamed from: l */
    public boolean f2018l;

    /* renamed from: c.n.a.a.l.a$a */
    /* compiled from: BytesToNameCanonicalizer */
    public static final class C2089a {
    }

    public C2088a(int i, boolean z, int i2, boolean z2) {
        this.f2007a = null;
        this.f2009c = i2;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.f2008b = new AtomicReference<>(mo16799c(i));
        }
        i = i3;
        this.f2008b = new AtomicReference<>(mo16799c(i));
    }

    /* renamed from: a */
    public static C2088a m2986a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m2987b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: b */
    public static C2088a m2987b(int i) {
        return new C2088a(64, true, i, true);
    }

    /* renamed from: c */
    public final C2090b mo16799c(int i) {
        return new C2090b(0, i - 1, new int[i], new C2093c[i], (C2089a[]) null, 0, 0, 0);
    }

    /* renamed from: d */
    public C2088a mo16800d(int i) {
        return new C2088a(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this.f2009c, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this.f2008b.get());
    }

    /* renamed from: e */
    public boolean mo16801e() {
        return !this.f2018l;
    }

    /* renamed from: f */
    public final void mo16802f(C2090b bVar) {
        int i = bVar.f2019a;
        C2090b bVar2 = this.f2008b.get();
        if (i != bVar2.f2019a) {
            if (i > 6000) {
                bVar = mo16799c(64);
            }
            this.f2008b.compareAndSet(bVar2, bVar);
        }
    }

    /* renamed from: g */
    public void mo16803g() {
        if (this.f2007a != null && mo16801e()) {
            this.f2007a.mo16802f(new C2090b(this));
            this.f2018l = true;
        }
    }

    public C2088a(C2088a aVar, boolean z, int i, boolean z2, C2090b bVar) {
        this.f2007a = aVar;
        this.f2009c = i;
        this.f2008b = null;
        this.f2010d = bVar.f2019a;
        this.f2012f = bVar.f2020b;
        this.f2013g = bVar.f2021c;
        this.f2014h = bVar.f2022d;
        this.f2015i = bVar.f2023e;
        this.f2016j = bVar.f2024f;
        this.f2017k = bVar.f2025g;
        this.f2011e = bVar.f2026h;
        this.f2018l = true;
    }

    /* renamed from: c.n.a.a.l.a$b */
    /* compiled from: BytesToNameCanonicalizer */
    public static final class C2090b {

        /* renamed from: a */
        public final int f2019a;

        /* renamed from: b */
        public final int f2020b;

        /* renamed from: c */
        public final int[] f2021c;

        /* renamed from: d */
        public final C2093c[] f2022d;

        /* renamed from: e */
        public final C2089a[] f2023e;

        /* renamed from: f */
        public final int f2024f;

        /* renamed from: g */
        public final int f2025g;

        /* renamed from: h */
        public final int f2026h;

        public C2090b(int i, int i2, int[] iArr, C2093c[] cVarArr, C2089a[] aVarArr, int i3, int i4, int i5) {
            this.f2019a = i;
            this.f2020b = i2;
            this.f2021c = iArr;
            this.f2022d = cVarArr;
            this.f2023e = aVarArr;
            this.f2024f = i3;
            this.f2025g = i4;
            this.f2026h = i5;
        }

        public C2090b(C2088a aVar) {
            this.f2019a = aVar.f2010d;
            this.f2020b = aVar.f2012f;
            this.f2021c = aVar.f2013g;
            this.f2022d = aVar.f2014h;
            this.f2023e = aVar.f2015i;
            this.f2024f = aVar.f2016j;
            this.f2025g = aVar.f2017k;
            this.f2026h = aVar.f2011e;
        }
    }
}

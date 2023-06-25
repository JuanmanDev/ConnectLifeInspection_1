package p040c.p077d.p078a.p101o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1568d;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1657j;
import p040c.p077d.p078a.p081k.p091l.p092c.C1806g;
import p040c.p077d.p078a.p081k.p091l.p092c.C1807h;
import p040c.p077d.p078a.p081k.p091l.p092c.C1808i;
import p040c.p077d.p078a.p081k.p091l.p092c.C1821o;
import p040c.p077d.p078a.p081k.p091l.p096g.C1864h;
import p040c.p077d.p078a.p101o.C1907a;
import p040c.p077d.p078a.p104p.C1935b;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.o.a */
/* compiled from: BaseRequestOptions */
public abstract class C1907a<T extends C1907a<T>> implements Cloneable {
    @NonNull

    /* renamed from: A */
    public C1571e f1524A = new C1571e();
    @NonNull

    /* renamed from: B */
    public Map<Class<?>, C1574h<?>> f1525B = new CachedHashCodeArrayMap();
    @NonNull

    /* renamed from: C */
    public Class<?> f1526C = Object.class;

    /* renamed from: D */
    public boolean f1527D;
    @Nullable

    /* renamed from: E */
    public Resources.Theme f1528E;

    /* renamed from: F */
    public boolean f1529F;

    /* renamed from: G */
    public boolean f1530G;

    /* renamed from: H */
    public boolean f1531H;

    /* renamed from: I */
    public boolean f1532I = true;

    /* renamed from: J */
    public boolean f1533J;

    /* renamed from: e */
    public int f1534e;

    /* renamed from: l */
    public float f1535l = 1.0f;
    @NonNull

    /* renamed from: m */
    public C1657j f1536m = C1657j.f1110d;
    @NonNull

    /* renamed from: n */
    public Priority f1537n = Priority.NORMAL;
    @Nullable

    /* renamed from: o */
    public Drawable f1538o;

    /* renamed from: p */
    public int f1539p;
    @Nullable

    /* renamed from: q */
    public Drawable f1540q;

    /* renamed from: r */
    public int f1541r;

    /* renamed from: s */
    public boolean f1542s = true;

    /* renamed from: t */
    public int f1543t = -1;

    /* renamed from: u */
    public int f1544u = -1;
    @NonNull

    /* renamed from: v */
    public C1567c f1545v = C1935b.m2530c();

    /* renamed from: w */
    public boolean f1546w;

    /* renamed from: x */
    public boolean f1547x = true;
    @Nullable

    /* renamed from: y */
    public Drawable f1548y;

    /* renamed from: z */
    public int f1549z;

    /* renamed from: Q */
    public static boolean m2318Q(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    /* renamed from: C */
    public final Priority mo16260C() {
        return this.f1537n;
    }

    @NonNull
    /* renamed from: E */
    public final Class<?> mo16261E() {
        return this.f1526C;
    }

    @NonNull
    /* renamed from: F */
    public final C1567c mo16262F() {
        return this.f1545v;
    }

    /* renamed from: G */
    public final float mo16263G() {
        return this.f1535l;
    }

    @Nullable
    /* renamed from: H */
    public final Resources.Theme mo16264H() {
        return this.f1528E;
    }

    @NonNull
    /* renamed from: I */
    public final Map<Class<?>, C1574h<?>> mo16265I() {
        return this.f1525B;
    }

    /* renamed from: J */
    public final boolean mo16266J() {
        return this.f1533J;
    }

    /* renamed from: K */
    public final boolean mo16267K() {
        return this.f1530G;
    }

    /* renamed from: L */
    public final boolean mo16268L() {
        return this.f1542s;
    }

    /* renamed from: M */
    public final boolean mo16269M() {
        return mo16271P(8);
    }

    /* renamed from: N */
    public boolean mo16270N() {
        return this.f1532I;
    }

    /* renamed from: P */
    public final boolean mo16271P(int i) {
        return m2318Q(this.f1534e, i);
    }

    /* renamed from: R */
    public final boolean mo16272R() {
        return this.f1547x;
    }

    /* renamed from: S */
    public final boolean mo16273S() {
        return this.f1546w;
    }

    /* renamed from: T */
    public final boolean mo16274T() {
        return mo16271P(2048);
    }

    /* renamed from: U */
    public final boolean mo16275U() {
        return C1950j.m2583s(this.f1544u, this.f1543t);
    }

    @NonNull
    /* renamed from: V */
    public T mo16276V() {
        this.f1527D = true;
        mo16294h0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: W */
    public T mo16277W() {
        return mo16281a0(DownsampleStrategy.f7026b, new C1806g());
    }

    @CheckResult
    @NonNull
    /* renamed from: X */
    public T mo16278X() {
        return mo16280Z(DownsampleStrategy.f7027c, new C1807h());
    }

    @CheckResult
    @NonNull
    /* renamed from: Y */
    public T mo16279Y() {
        return mo16280Z(DownsampleStrategy.f7025a, new C1821o());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16280Z(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            c.d.a.o.a r2 = r1.mo16292g0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16280Z(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, c.d.a.k.h):c.d.a.o.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public T mo15488a(@NonNull C1907a<?> aVar) {
        if (this.f1529F) {
            return clone().mo15488a(aVar);
        }
        if (m2318Q(aVar.f1534e, 2)) {
            this.f1535l = aVar.f1535l;
        }
        if (m2318Q(aVar.f1534e, 262144)) {
            this.f1530G = aVar.f1530G;
        }
        if (m2318Q(aVar.f1534e, 1048576)) {
            this.f1533J = aVar.f1533J;
        }
        if (m2318Q(aVar.f1534e, 4)) {
            this.f1536m = aVar.f1536m;
        }
        if (m2318Q(aVar.f1534e, 8)) {
            this.f1537n = aVar.f1537n;
        }
        if (m2318Q(aVar.f1534e, 16)) {
            this.f1538o = aVar.f1538o;
            this.f1539p = 0;
            this.f1534e &= -33;
        }
        if (m2318Q(aVar.f1534e, 32)) {
            this.f1539p = aVar.f1539p;
            this.f1538o = null;
            this.f1534e &= -17;
        }
        if (m2318Q(aVar.f1534e, 64)) {
            this.f1540q = aVar.f1540q;
            this.f1541r = 0;
            this.f1534e &= -129;
        }
        if (m2318Q(aVar.f1534e, 128)) {
            this.f1541r = aVar.f1541r;
            this.f1540q = null;
            this.f1534e &= -65;
        }
        if (m2318Q(aVar.f1534e, 256)) {
            this.f1542s = aVar.f1542s;
        }
        if (m2318Q(aVar.f1534e, 512)) {
            this.f1544u = aVar.f1544u;
            this.f1543t = aVar.f1543t;
        }
        if (m2318Q(aVar.f1534e, 1024)) {
            this.f1545v = aVar.f1545v;
        }
        if (m2318Q(aVar.f1534e, 4096)) {
            this.f1526C = aVar.f1526C;
        }
        if (m2318Q(aVar.f1534e, 8192)) {
            this.f1548y = aVar.f1548y;
            this.f1549z = 0;
            this.f1534e &= -16385;
        }
        if (m2318Q(aVar.f1534e, 16384)) {
            this.f1549z = aVar.f1549z;
            this.f1548y = null;
            this.f1534e &= -8193;
        }
        if (m2318Q(aVar.f1534e, 32768)) {
            this.f1528E = aVar.f1528E;
        }
        if (m2318Q(aVar.f1534e, 65536)) {
            this.f1547x = aVar.f1547x;
        }
        if (m2318Q(aVar.f1534e, 131072)) {
            this.f1546w = aVar.f1546w;
        }
        if (m2318Q(aVar.f1534e, 2048)) {
            this.f1525B.putAll(aVar.f1525B);
            this.f1532I = aVar.f1532I;
        }
        if (m2318Q(aVar.f1534e, 524288)) {
            this.f1531H = aVar.f1531H;
        }
        if (!this.f1547x) {
            this.f1525B.clear();
            int i = this.f1534e & -2049;
            this.f1534e = i;
            this.f1546w = false;
            this.f1534e = i & -131073;
            this.f1532I = true;
        }
        this.f1534e |= aVar.f1534e;
        this.f1524A.mo15617d(aVar.f1524A);
        mo16297i0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16281a0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1529F
            if (r0 == 0) goto L_0x000d
            c.d.a.o.a r0 = r1.clone()
            c.d.a.o.a r2 = r0.mo16281a0(r2, r3)
            return r2
        L_0x000d:
            r1.mo16296i(r2)
            r2 = 0
            c.d.a.o.a r2 = r1.mo16308o0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16281a0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, c.d.a.k.h):c.d.a.o.a");
    }

    @NonNull
    /* renamed from: b */
    public T mo16282b() {
        if (!this.f1527D || this.f1529F) {
            this.f1529F = true;
            mo16276V();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    @NonNull
    /* renamed from: b0 */
    public T mo16283b0(int i, int i2) {
        if (this.f1529F) {
            return clone().mo16283b0(i, i2);
        }
        this.f1544u = i;
        this.f1543t = i2;
        this.f1534e |= 512;
        mo16297i0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public T mo16284c() {
        return mo16310p0(DownsampleStrategy.f7027c, new C1808i());
    }

    @CheckResult
    @NonNull
    /* renamed from: c0 */
    public T mo16285c0(@DrawableRes int i) {
        if (this.f1529F) {
            return clone().mo16285c0(i);
        }
        this.f1541r = i;
        int i2 = this.f1534e | 128;
        this.f1534e = i2;
        this.f1540q = null;
        this.f1534e = i2 & -65;
        mo16297i0();
        return this;
    }

    @CheckResult
    /* renamed from: d */
    public T clone() {
        try {
            T t = (C1907a) super.clone();
            C1571e eVar = new C1571e();
            t.f1524A = eVar;
            eVar.mo15617d(this.f1524A);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.f1525B = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f1525B);
            t.f1527D = false;
            t.f1529F = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: d0 */
    public T mo16286d0(@Nullable Drawable drawable) {
        if (this.f1529F) {
            return clone().mo16286d0(drawable);
        }
        this.f1540q = drawable;
        int i = this.f1534e | 64;
        this.f1534e = i;
        this.f1541r = 0;
        this.f1534e = i & -129;
        mo16297i0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: e */
    public T mo16287e(@NonNull Class<?> cls) {
        if (this.f1529F) {
            return clone().mo16287e(cls);
        }
        C1949i.m2563d(cls);
        this.f1526C = cls;
        this.f1534e |= 4096;
        mo16297i0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: e0 */
    public T mo16288e0(@NonNull Priority priority) {
        if (this.f1529F) {
            return clone().mo16288e0(priority);
        }
        C1949i.m2563d(priority);
        this.f1537n = priority;
        this.f1534e |= 8;
        mo16297i0();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1907a)) {
            return false;
        }
        C1907a aVar = (C1907a) obj;
        if (Float.compare(aVar.f1535l, this.f1535l) == 0 && this.f1539p == aVar.f1539p && C1950j.m2567c(this.f1538o, aVar.f1538o) && this.f1541r == aVar.f1541r && C1950j.m2567c(this.f1540q, aVar.f1540q) && this.f1549z == aVar.f1549z && C1950j.m2567c(this.f1548y, aVar.f1548y) && this.f1542s == aVar.f1542s && this.f1543t == aVar.f1543t && this.f1544u == aVar.f1544u && this.f1546w == aVar.f1546w && this.f1547x == aVar.f1547x && this.f1530G == aVar.f1530G && this.f1531H == aVar.f1531H && this.f1536m.equals(aVar.f1536m) && this.f1537n == aVar.f1537n && this.f1524A.equals(aVar.f1524A) && this.f1525B.equals(aVar.f1525B) && this.f1526C.equals(aVar.f1526C) && C1950j.m2567c(this.f1545v, aVar.f1545v) && C1950j.m2567c(this.f1528E, aVar.f1528E)) {
            return true;
        }
        return false;
    }

    @CheckResult
    @NonNull
    /* renamed from: f */
    public T mo16290f(@NonNull C1657j jVar) {
        if (this.f1529F) {
            return clone().mo16290f(jVar);
        }
        C1949i.m2563d(jVar);
        this.f1536m = jVar;
        this.f1534e |= 4;
        mo16297i0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16291f0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            c.d.a.o.a r2 = r1.mo16292g0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16291f0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, c.d.a.k.h):c.d.a.o.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16292g0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            c.d.a.o.a r1 = r0.mo16310p0(r1, r2)
            goto L_0x000b
        L_0x0007:
            c.d.a.o.a r1 = r0.mo16281a0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f1532I = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16292g0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, c.d.a.k.h, boolean):c.d.a.o.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: h */
    public T mo16293h() {
        return mo16299j0(C1864h.f1469b, Boolean.TRUE);
    }

    /* renamed from: h0 */
    public final T mo16294h0() {
        return this;
    }

    public int hashCode() {
        return C1950j.m2578n(this.f1528E, C1950j.m2578n(this.f1545v, C1950j.m2578n(this.f1526C, C1950j.m2578n(this.f1525B, C1950j.m2578n(this.f1524A, C1950j.m2578n(this.f1537n, C1950j.m2578n(this.f1536m, C1950j.m2579o(this.f1531H, C1950j.m2579o(this.f1530G, C1950j.m2579o(this.f1547x, C1950j.m2579o(this.f1546w, C1950j.m2577m(this.f1544u, C1950j.m2577m(this.f1543t, C1950j.m2579o(this.f1542s, C1950j.m2578n(this.f1548y, C1950j.m2577m(this.f1549z, C1950j.m2578n(this.f1540q, C1950j.m2577m(this.f1541r, C1950j.m2578n(this.f1538o, C1950j.m2577m(this.f1539p, C1950j.m2574j(this.f1535l)))))))))))))))))))));
    }

    @CheckResult
    @NonNull
    /* renamed from: i */
    public T mo16296i(@NonNull DownsampleStrategy downsampleStrategy) {
        C1568d dVar = DownsampleStrategy.f7030f;
        C1949i.m2563d(downsampleStrategy);
        return mo16299j0(dVar, downsampleStrategy);
    }

    @NonNull
    /* renamed from: i0 */
    public final T mo16297i0() {
        if (!this.f1527D) {
            mo16294h0();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    /* renamed from: j */
    public T mo16298j(@DrawableRes int i) {
        if (this.f1529F) {
            return clone().mo16298j(i);
        }
        this.f1539p = i;
        int i2 = this.f1534e | 32;
        this.f1534e = i2;
        this.f1538o = null;
        this.f1534e = i2 & -17;
        mo16297i0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [c.d.a.k.d, java.lang.Object, c.d.a.k.d<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo16299j0(@androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1568d<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1529F
            if (r0 == 0) goto L_0x000d
            c.d.a.o.a r0 = r1.clone()
            c.d.a.o.a r2 = r0.mo16299j0(r2, r3)
            return r2
        L_0x000d:
            p040c.p077d.p078a.p105q.C1949i.m2563d(r2)
            p040c.p077d.p078a.p105q.C1949i.m2563d(r3)
            c.d.a.k.e r0 = r1.f1524A
            r0.mo15618e(r2, r3)
            r1.mo16297i0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16299j0(c.d.a.k.d, java.lang.Object):c.d.a.o.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public T mo16300k(@Nullable Drawable drawable) {
        if (this.f1529F) {
            return clone().mo16300k(drawable);
        }
        this.f1538o = drawable;
        int i = this.f1534e | 16;
        this.f1534e = i;
        this.f1539p = 0;
        this.f1534e = i & -33;
        mo16297i0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: k0 */
    public T mo16301k0(@NonNull C1567c cVar) {
        if (this.f1529F) {
            return clone().mo16301k0(cVar);
        }
        C1949i.m2563d(cVar);
        this.f1545v = cVar;
        this.f1534e |= 1024;
        mo16297i0();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public T mo16302l() {
        return mo16291f0(DownsampleStrategy.f7025a, new C1821o());
    }

    @CheckResult
    @NonNull
    /* renamed from: l0 */
    public T mo16303l0(@FloatRange(from = 0.0d, mo822to = 1.0d) float f) {
        if (this.f1529F) {
            return clone().mo16303l0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f1535l = f;
        this.f1534e |= 2;
        mo16297i0();
        return this;
    }

    @NonNull
    /* renamed from: m */
    public final C1657j mo16304m() {
        return this.f1536m;
    }

    @CheckResult
    @NonNull
    /* renamed from: m0 */
    public T mo16305m0(boolean z) {
        if (this.f1529F) {
            return clone().mo16305m0(true);
        }
        this.f1542s = !z;
        this.f1534e |= 256;
        mo16297i0();
        return this;
    }

    /* renamed from: n */
    public final int mo16306n() {
        return this.f1539p;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo16307n0(@androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            c.d.a.o.a r2 = r1.mo16308o0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16307n0(c.d.a.k.h):c.d.a.o.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo16308o0(@androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f1529F
            if (r0 == 0) goto L_0x000d
            c.d.a.o.a r0 = r2.clone()
            c.d.a.o.a r3 = r0.mo16308o0(r3, r4)
            return r3
        L_0x000d:
            c.d.a.k.l.c.m r0 = new c.d.a.k.l.c.m
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo16312q0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo16312q0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r0.mo16104c()
            r2.mo16312q0(r1, r0, r4)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            c.d.a.k.l.g.e r1 = new c.d.a.k.l.g.e
            r1.<init>(r3)
            r2.mo16312q0(r0, r1, r4)
            r2.mo16297i0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16308o0(c.d.a.k.h, boolean):c.d.a.o.a");
    }

    @Nullable
    /* renamed from: p */
    public final Drawable mo16309p() {
        return this.f1538o;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16310p0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1529F
            if (r0 == 0) goto L_0x000d
            c.d.a.o.a r0 = r1.clone()
            c.d.a.o.a r2 = r0.mo16310p0(r2, r3)
            return r2
        L_0x000d:
            r1.mo16296i(r2)
            c.d.a.o.a r2 = r1.mo16307n0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16310p0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, c.d.a.k.h):c.d.a.o.a");
    }

    @Nullable
    /* renamed from: q */
    public final Drawable mo16311q() {
        return this.f1548y;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [c.d.a.k.h<Y>, java.lang.Object, c.d.a.k.h] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo16312q0(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1574h<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f1529F
            if (r0 == 0) goto L_0x000d
            c.d.a.o.a r0 = r1.clone()
            c.d.a.o.a r2 = r0.mo16312q0(r2, r3, r4)
            return r2
        L_0x000d:
            p040c.p077d.p078a.p105q.C1949i.m2563d(r2)
            p040c.p077d.p078a.p105q.C1949i.m2563d(r3)
            java.util.Map<java.lang.Class<?>, c.d.a.k.h<?>> r0 = r1.f1525B
            r0.put(r2, r3)
            int r2 = r1.f1534e
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f1534e = r2
            r3 = 1
            r1.f1547x = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f1534e = r2
            r0 = 0
            r1.f1532I = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f1534e = r2
            r1.f1546w = r3
        L_0x0032:
            r1.mo16297i0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p101o.C1907a.mo16312q0(java.lang.Class, c.d.a.k.h, boolean):c.d.a.o.a");
    }

    /* renamed from: r */
    public final int mo16313r() {
        return this.f1549z;
    }

    @CheckResult
    @NonNull
    /* renamed from: r0 */
    public T mo16314r0(boolean z) {
        if (this.f1529F) {
            return clone().mo16314r0(z);
        }
        this.f1533J = z;
        this.f1534e |= 1048576;
        mo16297i0();
        return this;
    }

    /* renamed from: s */
    public final boolean mo16315s() {
        return this.f1531H;
    }

    @NonNull
    /* renamed from: t */
    public final C1571e mo16316t() {
        return this.f1524A;
    }

    /* renamed from: v */
    public final int mo16317v() {
        return this.f1543t;
    }

    /* renamed from: w */
    public final int mo16318w() {
        return this.f1544u;
    }

    @Nullable
    /* renamed from: y */
    public final Drawable mo16319y() {
        return this.f1540q;
    }

    /* renamed from: z */
    public final int mo16320z() {
        return this.f1541r;
    }
}

package p040c.p077d.p078a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p040c.p077d.p078a.p081k.p084j.C1657j;
import p040c.p077d.p078a.p101o.C1907a;
import p040c.p077d.p078a.p101o.C1908b;
import p040c.p077d.p078a.p101o.C1909c;
import p040c.p077d.p078a.p101o.C1910d;
import p040c.p077d.p078a.p101o.C1911e;
import p040c.p077d.p078a.p101o.C1912f;
import p040c.p077d.p078a.p101o.C1914h;
import p040c.p077d.p078a.p101o.p102j.C1925h;
import p040c.p077d.p078a.p101o.p102j.C1926i;
import p040c.p077d.p078a.p104p.C1934a;
import p040c.p077d.p078a.p105q.C1942d;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.f */
/* compiled from: RequestBuilder */
public class C1544f<TranscodeType> extends C1907a<C1544f<TranscodeType>> implements Cloneable {

    /* renamed from: K */
    public final Context f798K;

    /* renamed from: L */
    public final C1546g f799L;

    /* renamed from: M */
    public final Class<TranscodeType> f800M;

    /* renamed from: N */
    public final C1543e f801N;
    @NonNull

    /* renamed from: O */
    public C1549h<?, ? super TranscodeType> f802O;
    @Nullable

    /* renamed from: P */
    public Object f803P;
    @Nullable

    /* renamed from: Q */
    public List<C1911e<TranscodeType>> f804Q;
    @Nullable

    /* renamed from: R */
    public C1544f<TranscodeType> f805R;
    @Nullable

    /* renamed from: S */
    public C1544f<TranscodeType> f806S;
    @Nullable

    /* renamed from: T */
    public Float f807T;

    /* renamed from: U */
    public boolean f808U = true;

    /* renamed from: V */
    public boolean f809V;

    /* renamed from: W */
    public boolean f810W;

    /* renamed from: c.d.a.f$a */
    /* compiled from: RequestBuilder */
    public static /* synthetic */ class C1545a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f811a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f812b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f812b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f812b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f812b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f812b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f811a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f811a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f811a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.C1544f.C1545a.<clinit>():void");
        }
    }

    static {
        C1912f fVar = (C1912f) ((C1912f) ((C1912f) new C1912f().mo16290f(C1657j.f1109c)).mo16288e0(Priority.LOW)).mo16305m0(true);
    }

    @SuppressLint({"CheckResult"})
    public C1544f(@NonNull C1541c cVar, C1546g gVar, Class<TranscodeType> cls, Context context) {
        this.f799L = gVar;
        this.f800M = cls;
        this.f798K = context;
        this.f802O = gVar.mo15505o(cls);
        this.f801N = cVar.mo15454j();
        mo15498z0(gVar.mo15503m());
        mo15488a(gVar.mo15504n());
    }

    @NonNull
    /* renamed from: A0 */
    public <Y extends C1925h<TranscodeType>> Y mo15475A0(@NonNull Y y) {
        mo15477C0(y, (C1911e) null, C1942d.m2545b());
        return y;
    }

    /* renamed from: B0 */
    public final <Y extends C1925h<TranscodeType>> Y mo15476B0(@NonNull Y y, @Nullable C1911e<TranscodeType> eVar, C1907a<?> aVar, Executor executor) {
        C1949i.m2563d(y);
        if (this.f809V) {
            C1909c u0 = mo15493u0(y, eVar, aVar, executor);
            C1909c f = y.mo16375f();
            if (!u0.mo16325d(f) || mo15479E0(aVar, f)) {
                this.f799L.mo15502l(y);
                y.mo16372c(u0);
                this.f799L.mo15517w(y, u0);
                return y;
            }
            u0.mo16323c();
            C1949i.m2563d(f);
            if (!f.isRunning()) {
                f.mo16332j();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    /* renamed from: C0 */
    public <Y extends C1925h<TranscodeType>> Y mo15477C0(@NonNull Y y, @Nullable C1911e<TranscodeType> eVar, Executor executor) {
        mo15476B0(y, eVar, this, executor);
        return y;
    }

    @NonNull
    /* renamed from: D0 */
    public C1926i<ImageView, TranscodeType> mo15478D0(@NonNull ImageView imageView) {
        C1907a aVar;
        C1950j.m2565a();
        C1949i.m2563d(imageView);
        if (!mo16274T() && mo16272R() && imageView.getScaleType() != null) {
            switch (C1545a.f811a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = mo15490d().mo16277W();
                    break;
                case 2:
                    aVar = mo15490d().mo16278X();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = mo15490d().mo16279Y();
                    break;
                case 6:
                    aVar = mo15490d().mo16278X();
                    break;
            }
        }
        aVar = this;
        C1926i<ImageView, TranscodeType> a = this.f801N.mo15466a(imageView, this.f800M);
        mo15476B0(a, (C1911e) null, aVar, C1942d.m2545b());
        return a;
    }

    /* renamed from: E0 */
    public final boolean mo15479E0(C1907a<?> aVar, C1909c cVar) {
        return !aVar.mo16268L() && cVar.mo16334l();
    }

    @CheckResult
    @NonNull
    /* renamed from: F0 */
    public C1544f<TranscodeType> mo15480F0(@Nullable Bitmap bitmap) {
        mo15485K0(bitmap);
        return mo15488a(C1912f.m2416u0(C1657j.f1108b));
    }

    @CheckResult
    @NonNull
    /* renamed from: G0 */
    public C1544f<TranscodeType> mo15481G0(@Nullable Drawable drawable) {
        mo15485K0(drawable);
        return mo15488a(C1912f.m2416u0(C1657j.f1108b));
    }

    @CheckResult
    @NonNull
    /* renamed from: H0 */
    public C1544f<TranscodeType> mo15482H0(@RawRes @DrawableRes @Nullable Integer num) {
        mo15485K0(num);
        return mo15488a(C1912f.m2417v0(C1934a.m2528c(this.f798K)));
    }

    @CheckResult
    @NonNull
    /* renamed from: I0 */
    public C1544f<TranscodeType> mo15483I0(@Nullable Object obj) {
        mo15485K0(obj);
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: J0 */
    public C1544f<TranscodeType> mo15484J0(@Nullable String str) {
        mo15485K0(str);
        return this;
    }

    @NonNull
    /* renamed from: K0 */
    public final C1544f<TranscodeType> mo15485K0(@Nullable Object obj) {
        this.f803P = obj;
        this.f809V = true;
        return this;
    }

    /* renamed from: L0 */
    public final C1909c mo15486L0(C1925h<TranscodeType> hVar, C1911e<TranscodeType> eVar, C1907a<?> aVar, C1910d dVar, C1549h<?, ? super TranscodeType> hVar2, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f798K;
        C1543e eVar2 = this.f801N;
        return C1914h.m2420B(context, eVar2, this.f803P, this.f800M, aVar, i, i2, priority, hVar, eVar, this.f804Q, dVar, eVar2.mo15471f(), hVar2.mo15523b(), executor);
    }

    @CheckResult
    @NonNull
    /* renamed from: M0 */
    public C1544f<TranscodeType> mo15487M0(@Nullable C1544f<TranscodeType> fVar) {
        this.f805R = fVar;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: s0 */
    public C1544f<TranscodeType> mo15491s0(@Nullable C1911e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f804Q == null) {
                this.f804Q = new ArrayList();
            }
            this.f804Q.add(eVar);
        }
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: t0 */
    public C1544f<TranscodeType> mo15488a(@NonNull C1907a<?> aVar) {
        C1949i.m2563d(aVar);
        return (C1544f) super.mo15488a(aVar);
    }

    /* renamed from: u0 */
    public final C1909c mo15493u0(C1925h<TranscodeType> hVar, @Nullable C1911e<TranscodeType> eVar, C1907a<?> aVar, Executor executor) {
        return mo15494v0(hVar, eVar, (C1910d) null, this.f802O, aVar.mo16260C(), aVar.mo16318w(), aVar.mo16317v(), aVar, executor);
    }

    /* renamed from: v0 */
    public final C1909c mo15494v0(C1925h<TranscodeType> hVar, @Nullable C1911e<TranscodeType> eVar, @Nullable C1910d dVar, C1549h<?, ? super TranscodeType> hVar2, Priority priority, int i, int i2, C1907a<?> aVar, Executor executor) {
        C1908b bVar;
        C1908b bVar2;
        if (this.f806S != null) {
            bVar2 = new C1908b(dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        C1909c w0 = mo15495w0(hVar, eVar, bVar2, hVar2, priority, i, i2, aVar, executor);
        if (bVar == null) {
            return w0;
        }
        int w = this.f806S.mo16318w();
        int v = this.f806S.mo16317v();
        if (C1950j.m2583s(i, i2) && !this.f806S.mo16275U()) {
            w = aVar.mo16318w();
            v = aVar.mo16317v();
        }
        C1544f<TranscodeType> fVar = this.f806S;
        C1908b bVar3 = bVar;
        bVar3.mo16341s(w0, fVar.mo15494v0(hVar, eVar, bVar, fVar.f802O, fVar.mo16260C(), w, v, this.f806S, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [c.d.a.o.a<?>, c.d.a.o.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p077d.p078a.p101o.C1909c mo15495w0(p040c.p077d.p078a.p101o.p102j.C1925h<TranscodeType> r22, p040c.p077d.p078a.p101o.C1911e<TranscodeType> r23, @androidx.annotation.Nullable p040c.p077d.p078a.p101o.C1910d r24, p040c.p077d.p078a.C1549h<?, ? super TranscodeType> r25, com.bumptech.glide.Priority r26, int r27, int r28, p040c.p077d.p078a.p101o.C1907a<?> r29, java.util.concurrent.Executor r30) {
        /*
            r21 = this;
            r10 = r21
            r4 = r24
            r11 = r26
            c.d.a.f<TranscodeType> r0 = r10.f805R
            if (r0 == 0) goto L_0x0091
            boolean r1 = r10.f810W
            if (r1 != 0) goto L_0x0089
            c.d.a.h<?, ? super TranscodeType> r1 = r0.f802O
            boolean r0 = r0.f808U
            if (r0 == 0) goto L_0x0017
            r15 = r25
            goto L_0x0018
        L_0x0017:
            r15 = r1
        L_0x0018:
            c.d.a.f<TranscodeType> r0 = r10.f805R
            boolean r0 = r0.mo16269M()
            if (r0 == 0) goto L_0x0027
            c.d.a.f<TranscodeType> r0 = r10.f805R
            com.bumptech.glide.Priority r0 = r0.mo16260C()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.Priority r0 = r10.mo15497y0(r11)
        L_0x002b:
            r16 = r0
            c.d.a.f<TranscodeType> r0 = r10.f805R
            int r0 = r0.mo16318w()
            c.d.a.f<TranscodeType> r1 = r10.f805R
            int r1 = r1.mo16317v()
            boolean r2 = p040c.p077d.p078a.p105q.C1950j.m2583s(r27, r28)
            if (r2 == 0) goto L_0x004f
            c.d.a.f<TranscodeType> r2 = r10.f805R
            boolean r2 = r2.mo16275U()
            if (r2 != 0) goto L_0x004f
            int r0 = r29.mo16318w()
            int r1 = r29.mo16317v()
        L_0x004f:
            r17 = r0
            r18 = r1
            c.d.a.o.i r14 = new c.d.a.o.i
            r14.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r14
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            c.d.a.o.c r0 = r0.mo15486L0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            r10.f810W = r1
            c.d.a.f<TranscodeType> r1 = r10.f805R
            r11 = r1
            r12 = r22
            r13 = r23
            r2 = r14
            r19 = r1
            r20 = r30
            c.d.a.o.c r1 = r11.mo15494v0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            r10.f810W = r3
            r2.mo16371r(r0, r1)
            return r2
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0091:
            java.lang.Float r0 = r10.f807T
            if (r0 == 0) goto L_0x00cf
            c.d.a.o.i r12 = new c.d.a.o.i
            r12.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r12
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            c.d.a.o.c r13 = r0.mo15486L0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            c.d.a.o.a r0 = r29.clone()
            java.lang.Float r1 = r10.f807T
            float r1 = r1.floatValue()
            c.d.a.o.a r3 = r0.mo16303l0(r1)
            com.bumptech.glide.Priority r6 = r10.mo15497y0(r11)
            r0 = r21
            r1 = r22
            c.d.a.o.c r0 = r0.mo15486L0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.mo16371r(r13, r0)
            return r12
        L_0x00cf:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            c.d.a.o.c r0 = r0.mo15486L0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.C1544f.mo15495w0(c.d.a.o.j.h, c.d.a.o.e, c.d.a.o.d, c.d.a.h, com.bumptech.glide.Priority, int, int, c.d.a.o.a, java.util.concurrent.Executor):c.d.a.o.c");
    }

    @CheckResult
    /* renamed from: x0 */
    public C1544f<TranscodeType> mo15490d() {
        C1544f<TranscodeType> fVar = (C1544f) super.clone();
        fVar.f802O = fVar.f802O.clone();
        return fVar;
    }

    @NonNull
    /* renamed from: y0 */
    public final Priority mo15497y0(@NonNull Priority priority) {
        int i = C1545a.f812b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo16260C());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: z0 */
    public final void mo15498z0(List<C1911e<Object>> list) {
        for (C1911e<Object> s0 : list) {
            mo15491s0(s0);
        }
    }
}

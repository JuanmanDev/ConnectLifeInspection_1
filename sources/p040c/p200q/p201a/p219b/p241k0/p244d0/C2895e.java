package p040c.p200q.p201a.p219b.p241k0.p244d0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.C2862k;
import p040c.p200q.p201a.p219b.p241k0.C2996l;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3001p;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2891c;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2913j;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2917a;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2919c;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2923f;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2938m;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3134q;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.k0.d0.e */
/* compiled from: DashMediaSource */
public final class C2895e extends C2996l {

    /* renamed from: A */
    public final SparseArray<C2893d> f4659A;

    /* renamed from: B */
    public final Runnable f4660B;

    /* renamed from: C */
    public final Runnable f4661C;

    /* renamed from: D */
    public final C2913j.C2915b f4662D;

    /* renamed from: E */
    public final C3136s f4663E;
    @Nullable

    /* renamed from: F */
    public final Object f4664F;

    /* renamed from: G */
    public C3122h f4665G;

    /* renamed from: H */
    public Loader f4666H;
    @Nullable

    /* renamed from: I */
    public C3141v f4667I;

    /* renamed from: J */
    public IOException f4668J;

    /* renamed from: K */
    public Handler f4669K;

    /* renamed from: L */
    public Uri f4670L;

    /* renamed from: M */
    public Uri f4671M;

    /* renamed from: N */
    public C2918b f4672N;

    /* renamed from: O */
    public boolean f4673O;

    /* renamed from: P */
    public long f4674P;

    /* renamed from: Q */
    public long f4675Q;

    /* renamed from: R */
    public long f4676R;

    /* renamed from: S */
    public int f4677S;

    /* renamed from: T */
    public long f4678T;

    /* renamed from: U */
    public int f4679U;

    /* renamed from: p */
    public final boolean f4680p;

    /* renamed from: q */
    public final C3122h.C3123a f4681q;

    /* renamed from: r */
    public final C2891c.C2892a f4682r;

    /* renamed from: s */
    public final C3000o f4683s;

    /* renamed from: t */
    public final C3135r f4684t;

    /* renamed from: u */
    public final long f4685u;

    /* renamed from: v */
    public final boolean f4686v;

    /* renamed from: w */
    public final C3017v.C3018a f4687w;

    /* renamed from: x */
    public final C3138t.C3139a<? extends C2918b> f4688x;

    /* renamed from: y */
    public final C2901f f4689y;

    /* renamed from: z */
    public final Object f4690z;

    /* renamed from: c.q.a.b.k0.d0.e$b */
    /* compiled from: DashMediaSource */
    public static final class C2897b extends C2578a0 {

        /* renamed from: b */
        public final long f4691b;

        /* renamed from: c */
        public final long f4692c;

        /* renamed from: d */
        public final int f4693d;

        /* renamed from: e */
        public final long f4694e;

        /* renamed from: f */
        public final long f4695f;

        /* renamed from: g */
        public final long f4696g;

        /* renamed from: h */
        public final C2918b f4697h;
        @Nullable

        /* renamed from: i */
        public final Object f4698i;

        public C2897b(long j, long j2, int i, long j3, long j4, long j5, C2918b bVar, @Nullable Object obj) {
            this.f4691b = j;
            this.f4692c = j2;
            this.f4693d = i;
            this.f4694e = j3;
            this.f4695f = j4;
            this.f4696g = j5;
            this.f4697h = bVar;
            this.f4698i = obj;
        }

        /* renamed from: b */
        public int mo18047b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f4693d) >= 0 && intValue < mo18054i()) {
                return intValue;
            }
            return -1;
        }

        /* renamed from: g */
        public C2578a0.C2580b mo18052g(int i, C2578a0.C2580b bVar, boolean z) {
            C3151e.m7755c(i, 0, mo18054i());
            Integer num = null;
            String str = z ? this.f4697h.mo19236d(i).f4799a : null;
            if (z) {
                num = Integer.valueOf(this.f4693d + i);
            }
            bVar.mo18077n(str, num, 0, this.f4697h.mo19239g(i), C2627d.m5057a(this.f4697h.mo19236d(i).f4800b - this.f4697h.mo19236d(0).f4800b) - this.f4694e);
            return bVar;
        }

        /* renamed from: i */
        public int mo18054i() {
            return this.f4697h.mo19237e();
        }

        /* renamed from: l */
        public Object mo18057l(int i) {
            C3151e.m7755c(i, 0, mo18054i());
            return Integer.valueOf(this.f4693d + i);
        }

        /* renamed from: o */
        public C2578a0.C2581c mo18060o(int i, C2578a0.C2581c cVar, boolean z, long j) {
            C3151e.m7755c(i, 0, 1);
            long s = mo19174s(j);
            Object obj = z ? this.f4698i : null;
            C2918b bVar = this.f4697h;
            cVar.mo18083e(obj, this.f4691b, this.f4692c, true, bVar.f4771d && bVar.f4772e != -9223372036854775807L && bVar.f4769b == -9223372036854775807L, s, this.f4695f, 0, mo18054i() - 1, this.f4694e);
            return cVar;
        }

        /* renamed from: p */
        public int mo18061p() {
            return 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
            r2 = r2.f4801c.get(r6).f4765c.get(0).mo19290i();
         */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo19174s(long r9) {
            /*
                r8 = this;
                long r0 = r8.f4696g
                c.q.a.b.k0.d0.k.b r2 = r8.f4697h
                boolean r2 = r2.f4771d
                if (r2 != 0) goto L_0x0009
                return r0
            L_0x0009:
                r2 = 0
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x001c
                long r0 = r0 + r9
                long r9 = r8.f4695f
                int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x001c
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r9
            L_0x001c:
                long r9 = r8.f4694e
                long r9 = r9 + r0
                c.q.a.b.k0.d0.k.b r2 = r8.f4697h
                r3 = 0
                long r4 = r2.mo19239g(r3)
                r2 = r3
            L_0x0027:
                c.q.a.b.k0.d0.k.b r6 = r8.f4697h
                int r6 = r6.mo19237e()
                int r6 = r6 + -1
                if (r2 >= r6) goto L_0x003f
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x003f
                long r9 = r9 - r4
                int r2 = r2 + 1
                c.q.a.b.k0.d0.k.b r4 = r8.f4697h
                long r4 = r4.mo19239g(r2)
                goto L_0x0027
            L_0x003f:
                c.q.a.b.k0.d0.k.b r6 = r8.f4697h
                c.q.a.b.k0.d0.k.f r2 = r6.mo19236d(r2)
                r6 = 2
                int r6 = r2.mo19280a(r6)
                r7 = -1
                if (r6 != r7) goto L_0x004e
                return r0
            L_0x004e:
                java.util.List<c.q.a.b.k0.d0.k.a> r2 = r2.f4801c
                java.lang.Object r2 = r2.get(r6)
                c.q.a.b.k0.d0.k.a r2 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2917a) r2
                java.util.List<c.q.a.b.k0.d0.k.i> r2 = r2.f4765c
                java.lang.Object r2 = r2.get(r3)
                c.q.a.b.k0.d0.k.i r2 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2926i) r2
                c.q.a.b.k0.d0.f r2 = r2.mo19290i()
                if (r2 == 0) goto L_0x0075
                int r3 = r2.mo19194g(r4)
                if (r3 != 0) goto L_0x006b
                goto L_0x0075
            L_0x006b:
                long r3 = r2.mo19191d(r9, r4)
                long r2 = r2.mo19188a(r3)
                long r0 = r0 + r2
                long r0 = r0 - r9
            L_0x0075:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.C2895e.C2897b.mo19174s(long):long");
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$c */
    /* compiled from: DashMediaSource */
    public final class C2898c implements C2913j.C2915b {
        public C2898c() {
        }

        /* renamed from: a */
        public void mo19175a() {
            C2895e.this.mo19171x();
        }

        /* renamed from: b */
        public void mo19176b(long j) {
            C2895e.this.mo19170w(j);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$d */
    /* compiled from: DashMediaSource */
    public static final class C2899d {

        /* renamed from: a */
        public final C2891c.C2892a f4700a;
        @Nullable

        /* renamed from: b */
        public final C3122h.C3123a f4701b;
        @Nullable

        /* renamed from: c */
        public C3138t.C3139a<? extends C2918b> f4702c;

        /* renamed from: d */
        public C3000o f4703d = new C3001p();

        /* renamed from: e */
        public C3135r f4704e = new C3134q();

        /* renamed from: f */
        public long f4705f = 30000;

        /* renamed from: g */
        public boolean f4706g;
        @Nullable

        /* renamed from: h */
        public Object f4707h;

        public C2899d(C2891c.C2892a aVar, @Nullable C3122h.C3123a aVar2) {
            C3151e.m7757e(aVar);
            this.f4700a = aVar;
            this.f4701b = aVar2;
        }

        /* renamed from: a */
        public C2895e mo19177a(Uri uri) {
            if (this.f4702c == null) {
                this.f4702c = new C2919c();
            }
            C3151e.m7757e(uri);
            return new C2895e((C2918b) null, uri, this.f4701b, this.f4702c, this.f4700a, this.f4703d, this.f4704e, this.f4705f, this.f4706g, this.f4707h);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$e */
    /* compiled from: DashMediaSource */
    public static final class C2900e implements C3138t.C3139a<Long> {

        /* renamed from: a */
        public static final Pattern f4708a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* renamed from: b */
        public Long mo18948a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f4708a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw new ParserException("Couldn't parse timestamp: " + readLine);
            } catch (ParseException e) {
                throw new ParserException((Throwable) e);
            }
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$f */
    /* compiled from: DashMediaSource */
    public final class C2901f implements Loader.C4057b<C3138t<C2918b>> {
        public C2901f() {
        }

        /* renamed from: a */
        public void mo19106k(C3138t<C2918b> tVar, long j, long j2, boolean z) {
            C2895e.this.mo19172y(tVar, j, j2);
        }

        /* renamed from: b */
        public void mo19107l(C3138t<C2918b> tVar, long j, long j2) {
            C2895e.this.mo19173z(tVar, j, j2);
        }

        /* renamed from: c */
        public Loader.C4058c mo19109s(C3138t<C2918b> tVar, long j, long j2, IOException iOException, int i) {
            return C2895e.this.mo19150A(tVar, j, j2, iOException);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$g */
    /* compiled from: DashMediaSource */
    public final class C2902g implements C3136s {
        public C2902g() {
        }

        /* renamed from: a */
        public void mo19182a() {
            C2895e.this.f4666H.mo19182a();
            mo19183b();
        }

        /* renamed from: b */
        public final void mo19183b() {
            if (C2895e.this.f4668J != null) {
                throw C2895e.this.f4668J;
            }
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$h */
    /* compiled from: DashMediaSource */
    public static final class C2903h {

        /* renamed from: a */
        public final boolean f4711a;

        /* renamed from: b */
        public final long f4712b;

        /* renamed from: c */
        public final long f4713c;

        public C2903h(boolean z, long j, long j2) {
            this.f4711a = z;
            this.f4712b = j;
            this.f4713c = j2;
        }

        /* renamed from: a */
        public static C2903h m6416a(C2923f fVar, long j) {
            boolean z;
            boolean z2;
            long j2;
            C2923f fVar2 = fVar;
            long j3 = j;
            int size = fVar2.f4801c.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                int i3 = fVar2.f4801c.get(i2).f4764b;
                if (i3 == 1 || i3 == 2) {
                    z = true;
                } else {
                    i2++;
                }
            }
            long j4 = Long.MAX_VALUE;
            int i4 = 0;
            boolean z3 = false;
            boolean z4 = false;
            long j5 = 0;
            while (i4 < size) {
                C2917a aVar = fVar2.f4801c.get(i4);
                if (!z || aVar.f4764b != 3) {
                    C2906f i5 = aVar.f4765c.get(i).mo19290i();
                    if (i5 == null) {
                        return new C2903h(true, 0, j);
                    }
                    z3 |= i5.mo19192e();
                    int g = i5.mo19194g(j3);
                    if (g == 0) {
                        z2 = z;
                        j2 = 0;
                        j5 = 0;
                        z4 = true;
                    } else if (!z4) {
                        z2 = z;
                        long f = i5.mo19193f();
                        long j6 = j4;
                        j5 = Math.max(j5, i5.mo19188a(f));
                        if (g != -1) {
                            long j7 = (f + ((long) g)) - 1;
                            j2 = Math.min(j6, i5.mo19188a(j7) + i5.mo19189b(j7, j3));
                        } else {
                            j2 = j6;
                        }
                    }
                    i4++;
                    j4 = j2;
                    z = z2;
                    i = 0;
                }
                z2 = z;
                j2 = j4;
                i4++;
                j4 = j2;
                z = z2;
                i = 0;
            }
            return new C2903h(z3, j5, j4);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$i */
    /* compiled from: DashMediaSource */
    public final class C2904i implements Loader.C4057b<C3138t<Long>> {
        public C2904i() {
        }

        /* renamed from: a */
        public void mo19106k(C3138t<Long> tVar, long j, long j2, boolean z) {
            C2895e.this.mo19172y(tVar, j, j2);
        }

        /* renamed from: b */
        public void mo19107l(C3138t<Long> tVar, long j, long j2) {
            C2895e.this.mo19151B(tVar, j, j2);
        }

        /* renamed from: c */
        public Loader.C4058c mo19109s(C3138t<Long> tVar, long j, long j2, IOException iOException, int i) {
            return C2895e.this.mo19152C(tVar, j, j2, iOException);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.e$j */
    /* compiled from: DashMediaSource */
    public static final class C2905j implements C3138t.C3139a<Long> {
        public C2905j() {
        }

        /* renamed from: b */
        public Long mo18948a(Uri uri, InputStream inputStream) {
            return Long.valueOf(C3152e0.m7784X(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C2862k.m6234a("goog.exo.dash");
    }

    /* renamed from: A */
    public Loader.C4058c mo19150A(C3138t<C2918b> tVar, long j, long j2, IOException iOException) {
        C3138t<C2918b> tVar2 = tVar;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof ParserException;
        this.f4687w.mo19544v(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b(), iOException2, z);
        return z ? Loader.f7922f : Loader.f7920d;
    }

    /* renamed from: B */
    public void mo19151B(C3138t<Long> tVar, long j, long j2) {
        C3138t<Long> tVar2 = tVar;
        this.f4687w.mo19541s(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b());
        mo19154E(tVar.mo19927d().longValue() - j);
    }

    /* renamed from: C */
    public Loader.C4058c mo19152C(C3138t<Long> tVar, long j, long j2, IOException iOException) {
        C3138t<Long> tVar2 = tVar;
        C3017v.C3018a aVar = this.f4687w;
        C3125j jVar = tVar2.f5792a;
        Uri e = tVar.mo19928e();
        Map<String, List<String>> c = tVar.mo19926c();
        int i = tVar2.f5793b;
        aVar.mo19544v(jVar, e, c, i, j, j2, tVar.mo19925b(), iOException, true);
        mo19153D(iOException);
        return Loader.f7921e;
    }

    /* renamed from: D */
    public final void mo19153D(IOException iOException) {
        C3163m.m7878d("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        mo19155F(true);
    }

    /* renamed from: E */
    public final void mo19154E(long j) {
        this.f4676R = j;
        mo19155F(true);
    }

    /* renamed from: F */
    public final void mo19155F(boolean z) {
        boolean z2;
        long j;
        long j2;
        for (int i = 0; i < this.f4659A.size(); i++) {
            int keyAt = this.f4659A.keyAt(i);
            if (keyAt >= this.f4679U) {
                this.f4659A.valueAt(i).mo19138I(this.f4672N, keyAt - this.f4679U);
            }
        }
        int e = this.f4672N.mo19237e() - 1;
        C2903h a = C2903h.m6416a(this.f4672N.mo19236d(0), this.f4672N.mo19239g(0));
        C2903h a2 = C2903h.m6416a(this.f4672N.mo19236d(e), this.f4672N.mo19239g(e));
        long j3 = a.f4712b;
        long j4 = a2.f4713c;
        if (!this.f4672N.f4771d || a2.f4711a) {
            z2 = false;
        } else {
            j4 = Math.min((mo19168u() - C2627d.m5057a(this.f4672N.f4768a)) - C2627d.m5057a(this.f4672N.mo19236d(e).f4800b), j4);
            long j5 = this.f4672N.f4773f;
            if (j5 != -9223372036854775807L) {
                long a3 = j4 - C2627d.m5057a(j5);
                while (a3 < 0 && e > 0) {
                    e--;
                    a3 += this.f4672N.mo19239g(e);
                }
                if (e == 0) {
                    j2 = Math.max(j3, a3);
                } else {
                    j2 = this.f4672N.mo19239g(0);
                }
                j3 = j2;
            }
            z2 = true;
        }
        long j6 = j3;
        long j7 = j4 - j6;
        for (int i2 = 0; i2 < this.f4672N.mo19237e() - 1; i2++) {
            j7 += this.f4672N.mo19239g(i2);
        }
        C2918b bVar = this.f4672N;
        if (bVar.f4771d) {
            long j8 = this.f4685u;
            if (!this.f4686v) {
                long j9 = bVar.f4774g;
                if (j9 != -9223372036854775807L) {
                    j8 = j9;
                }
            }
            long a4 = j7 - C2627d.m5057a(j8);
            if (a4 < 5000000) {
                a4 = Math.min(5000000, j7 / 2);
            }
            j = a4;
        } else {
            j = 0;
        }
        C2918b bVar2 = this.f4672N;
        long b = bVar2.f4768a + bVar2.mo19236d(0).f4800b + C2627d.m5058b(j6);
        C2918b bVar3 = this.f4672N;
        mo19479o(new C2897b(bVar3.f4768a, b, this.f4679U, j6, j7, j, bVar3, this.f4664F), this.f4672N);
        if (!this.f4680p) {
            this.f4669K.removeCallbacks(this.f4661C);
            long j10 = 5000;
            if (z2) {
                this.f4669K.postDelayed(this.f4661C, 5000);
            }
            if (this.f4673O) {
                mo19161L();
            } else if (z) {
                C2918b bVar4 = this.f4672N;
                if (bVar4.f4771d) {
                    long j11 = bVar4.f4772e;
                    if (j11 != -9223372036854775807L) {
                        if (j11 != 0) {
                            j10 = j11;
                        }
                        mo19159J(Math.max(0, (this.f4674P + j10) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo19156G(C2938m mVar) {
        String str = mVar.f4840a;
        if (C3152e0.m7789b(str, "urn:mpeg:dash:utc:direct:2014") || C3152e0.m7789b(str, "urn:mpeg:dash:utc:direct:2012")) {
            mo19157H(mVar);
        } else if (C3152e0.m7789b(str, "urn:mpeg:dash:utc:http-iso:2014") || C3152e0.m7789b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            mo19158I(mVar, new C2900e());
        } else if (C3152e0.m7789b(str, "urn:mpeg:dash:utc:http-xsdate:2014") || C3152e0.m7789b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            mo19158I(mVar, new C2905j());
        } else {
            mo19153D(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: H */
    public final void mo19157H(C2938m mVar) {
        try {
            mo19154E(C3152e0.m7784X(mVar.f4841b) - this.f4675Q);
        } catch (ParserException e) {
            mo19153D(e);
        }
    }

    /* renamed from: I */
    public final void mo19158I(C2938m mVar, C3138t.C3139a<Long> aVar) {
        mo19160K(new C3138t(this.f4665G, Uri.parse(mVar.f4841b), 5, aVar), new C2904i(), 1);
    }

    /* renamed from: J */
    public final void mo19159J(long j) {
        this.f4669K.postDelayed(this.f4660B, j);
    }

    /* renamed from: K */
    public final <T> void mo19160K(C3138t<T> tVar, Loader.C4057b<C3138t<T>> bVar, int i) {
        this.f4687w.mo19547y(tVar.f5792a, tVar.f5793b, this.f4666H.mo24276l(tVar, bVar, i));
    }

    /* renamed from: L */
    public final void mo19161L() {
        Uri uri;
        this.f4669K.removeCallbacks(this.f4660B);
        if (this.f4666H.mo24272h()) {
            this.f4673O = true;
            return;
        }
        synchronized (this.f4690z) {
            uri = this.f4671M;
        }
        this.f4673O = false;
        mo19160K(new C3138t(this.f4665G, uri, 4, this.f4688x), this.f4689y, this.f4684t.mo19924c(4));
    }

    /* renamed from: a */
    public C3012t mo19162a(C3014u.C3015a aVar, C3117d dVar, long j) {
        C3014u.C3015a aVar2 = aVar;
        int intValue = ((Integer) aVar2.f5277a).intValue() - this.f4679U;
        C3017v.C3018a m = mo19478m(aVar2, this.f4672N.mo19236d(intValue).f4800b);
        C2893d dVar2 = new C2893d(this.f4679U + intValue, this.f4672N, intValue, this.f4682r, this.f4667I, this.f4684t, m, this.f4676R, this.f4663E, dVar, this.f4683s, this.f4662D);
        this.f4659A.put(dVar2.f4636e, dVar2);
        return dVar2;
    }

    /* renamed from: h */
    public void mo19163h() {
        this.f4663E.mo19182a();
    }

    /* renamed from: i */
    public void mo19164i(C3012t tVar) {
        C2893d dVar = (C2893d) tVar;
        dVar.mo19134E();
        this.f4659A.remove(dVar.f4636e);
    }

    /* renamed from: n */
    public void mo19165n(@Nullable C3141v vVar) {
        this.f4667I = vVar;
        if (this.f4680p) {
            mo19155F(false);
            return;
        }
        this.f4665G = this.f4681q.mo19884a();
        this.f4666H = new Loader("Loader:DashMediaSource");
        this.f4669K = new Handler();
        mo19161L();
    }

    /* renamed from: p */
    public void mo19166p() {
        this.f4673O = false;
        this.f4665G = null;
        Loader loader = this.f4666H;
        if (loader != null) {
            loader.mo24274j();
            this.f4666H = null;
        }
        this.f4674P = 0;
        this.f4675Q = 0;
        this.f4672N = this.f4680p ? this.f4672N : null;
        this.f4671M = this.f4670L;
        this.f4668J = null;
        Handler handler = this.f4669K;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f4669K = null;
        }
        this.f4676R = 0;
        this.f4677S = 0;
        this.f4678T = -9223372036854775807L;
        this.f4679U = 0;
        this.f4659A.clear();
    }

    /* renamed from: t */
    public final long mo19167t() {
        return (long) Math.min((this.f4677S - 1) * 1000, 5000);
    }

    /* renamed from: u */
    public final long mo19168u() {
        if (this.f4676R != 0) {
            return C2627d.m5057a(SystemClock.elapsedRealtime() + this.f4676R);
        }
        return C2627d.m5057a(System.currentTimeMillis());
    }

    /* renamed from: v */
    public /* synthetic */ void mo19169v() {
        mo19155F(false);
    }

    /* renamed from: w */
    public void mo19170w(long j) {
        long j2 = this.f4678T;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f4678T = j;
        }
    }

    /* renamed from: x */
    public void mo19171x() {
        this.f4669K.removeCallbacks(this.f4661C);
        mo19161L();
    }

    /* renamed from: y */
    public void mo19172y(C3138t<?> tVar, long j, long j2) {
        C3138t<?> tVar2 = tVar;
        this.f4687w.mo19538p(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19173z(p040c.p200q.p201a.p219b.p260n0.C3138t<p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b> r18, long r19, long r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r13 = r19
            c.q.a.b.k0.v$a r2 = r1.f4687w
            c.q.a.b.n0.j r3 = r0.f5792a
            android.net.Uri r4 = r18.mo19928e()
            java.util.Map r5 = r18.mo19926c()
            int r6 = r0.f5793b
            long r11 = r18.mo19925b()
            r7 = r19
            r9 = r21
            r2.mo19541s(r3, r4, r5, r6, r7, r9, r11)
            java.lang.Object r2 = r18.mo19927d()
            c.q.a.b.k0.d0.k.b r2 = (p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b) r2
            c.q.a.b.k0.d0.k.b r3 = r1.f4672N
            r4 = 0
            if (r3 != 0) goto L_0x002c
            r3 = r4
            goto L_0x0030
        L_0x002c:
            int r3 = r3.mo19237e()
        L_0x0030:
            c.q.a.b.k0.d0.k.f r5 = r2.mo19236d(r4)
            long r5 = r5.f4800b
            r7 = r4
        L_0x0037:
            if (r7 >= r3) goto L_0x0048
            c.q.a.b.k0.d0.k.b r8 = r1.f4672N
            c.q.a.b.k0.d0.k.f r8 = r8.mo19236d(r7)
            long r8 = r8.f4800b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0048
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0048:
            boolean r5 = r2.f4771d
            r6 = 1
            if (r5 == 0) goto L_0x00ba
            int r5 = r3 - r7
            int r8 = r2.mo19237e()
            if (r5 <= r8) goto L_0x005e
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r5, r8)
        L_0x005c:
            r5 = r6
            goto L_0x0096
        L_0x005e:
            long r8 = r1.f4678T
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0095
            long r10 = r2.f4775h
            r15 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r15
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0095
            java.lang.String r5 = "DashMediaSource"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Loaded stale dynamic manifest: "
            r8.append(r9)
            long r9 = r2.f4775h
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.f4678T
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r5, r8)
            goto L_0x005c
        L_0x0095:
            r5 = r4
        L_0x0096:
            if (r5 == 0) goto L_0x00b8
            int r2 = r1.f4677S
            int r3 = r2 + 1
            r1.f4677S = r3
            c.q.a.b.n0.r r3 = r1.f4684t
            int r0 = r0.f5793b
            int r0 = r3.mo19924c(r0)
            if (r2 >= r0) goto L_0x00b0
            long r2 = r17.mo19167t()
            r1.mo19159J(r2)
            goto L_0x00b7
        L_0x00b0:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r0 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r0.<init>()
            r1.f4668J = r0
        L_0x00b7:
            return
        L_0x00b8:
            r1.f4677S = r4
        L_0x00ba:
            r1.f4672N = r2
            boolean r5 = r1.f4673O
            boolean r8 = r2.f4771d
            r5 = r5 & r8
            r1.f4673O = r5
            long r8 = r13 - r21
            r1.f4674P = r8
            r1.f4675Q = r13
            android.net.Uri r2 = r2.f4777j
            if (r2 == 0) goto L_0x00e6
            java.lang.Object r2 = r1.f4690z
            monitor-enter(r2)
            c.q.a.b.n0.j r0 = r0.f5792a     // Catch:{ all -> 0x00e3 }
            android.net.Uri r0 = r0.f5720a     // Catch:{ all -> 0x00e3 }
            android.net.Uri r5 = r1.f4671M     // Catch:{ all -> 0x00e3 }
            if (r0 != r5) goto L_0x00d9
            r4 = r6
        L_0x00d9:
            if (r4 == 0) goto L_0x00e1
            c.q.a.b.k0.d0.k.b r0 = r1.f4672N     // Catch:{ all -> 0x00e3 }
            android.net.Uri r0 = r0.f4777j     // Catch:{ all -> 0x00e3 }
            r1.f4671M = r0     // Catch:{ all -> 0x00e3 }
        L_0x00e1:
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e6
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            throw r0
        L_0x00e6:
            if (r3 != 0) goto L_0x00f6
            c.q.a.b.k0.d0.k.b r0 = r1.f4672N
            c.q.a.b.k0.d0.k.m r0 = r0.f4776i
            if (r0 == 0) goto L_0x00f2
            r1.mo19156G(r0)
            goto L_0x00fe
        L_0x00f2:
            r1.mo19155F(r6)
            goto L_0x00fe
        L_0x00f6:
            int r0 = r1.f4679U
            int r0 = r0 + r7
            r1.f4679U = r0
            r1.mo19155F(r6)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.p244d0.C2895e.mo19173z(c.q.a.b.n0.t, long, long):void");
    }

    public C2895e(C2918b bVar, Uri uri, C3122h.C3123a aVar, C3138t.C3139a<? extends C2918b> aVar2, C2891c.C2892a aVar3, C3000o oVar, C3135r rVar, long j, boolean z, @Nullable Object obj) {
        this.f4670L = uri;
        this.f4672N = bVar;
        this.f4671M = uri;
        this.f4681q = aVar;
        this.f4688x = aVar2;
        this.f4682r = aVar3;
        this.f4684t = rVar;
        this.f4685u = j;
        this.f4686v = z;
        this.f4683s = oVar;
        this.f4664F = obj;
        this.f4680p = bVar != null;
        this.f4687w = mo19477j((C3014u.C3015a) null);
        this.f4690z = new Object();
        this.f4659A = new SparseArray<>();
        this.f4662D = new C2898c();
        this.f4678T = -9223372036854775807L;
        if (this.f4680p) {
            C3151e.m7759g(!bVar.f4771d);
            this.f4689y = null;
            this.f4660B = null;
            this.f4661C = null;
            this.f4663E = new C3136s.C3137a();
            return;
        }
        this.f4689y = new C2901f();
        this.f4663E = new C2902g();
        this.f4660B = new C2890b(this);
        this.f4661C = new C2889a(this);
    }
}

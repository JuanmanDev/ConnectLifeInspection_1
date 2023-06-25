package p040c.p200q.p201a.p219b.p224f0;

import java.lang.reflect.Constructor;
import p040c.p200q.p201a.p219b.p224f0.p225r.C2689b;
import p040c.p200q.p201a.p219b.p224f0.p226s.C2692c;
import p040c.p200q.p201a.p219b.p224f0.p227t.C2701e;
import p040c.p200q.p201a.p219b.p224f0.p228u.C2712e;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2732g;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2736i;
import p040c.p200q.p201a.p219b.p224f0.p230w.C2751d;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2777d0;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2780e;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2788g;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2812w;
import p040c.p200q.p201a.p219b.p224f0.p233z.C2818b;

/* renamed from: c.q.a.b.f0.e */
/* compiled from: DefaultExtractorsFactory */
public final class C2672e implements C2677j {

    /* renamed from: j */
    public static final Constructor<? extends C2674g> f3415j;

    /* renamed from: a */
    public boolean f3416a;

    /* renamed from: b */
    public int f3417b;

    /* renamed from: c */
    public int f3418c;

    /* renamed from: d */
    public int f3419d;

    /* renamed from: e */
    public int f3420e;

    /* renamed from: f */
    public int f3421f;

    /* renamed from: g */
    public int f3422g;

    /* renamed from: h */
    public int f3423h = 1;

    /* renamed from: i */
    public int f3424i;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C2674g.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f3415j = constructor;
    }

    /* renamed from: a */
    public synchronized C2674g[] mo18542a() {
        C2674g[] gVarArr;
        gVarArr = new C2674g[(f3415j == null ? 12 : 13)];
        gVarArr[0] = new C2701e(this.f3419d);
        int i = 1;
        gVarArr[1] = new C2732g(this.f3421f);
        gVarArr[2] = new C2736i(this.f3420e);
        gVarArr[3] = new C2712e(this.f3422g | (this.f3416a ? 1 : 0));
        gVarArr[4] = new C2788g(0, this.f3417b | (this.f3416a ? 1 : 0));
        gVarArr[5] = new C2780e();
        gVarArr[6] = new C2777d0(this.f3423h, this.f3424i);
        gVarArr[7] = new C2692c();
        gVarArr[8] = new C2751d();
        gVarArr[9] = new C2812w();
        gVarArr[10] = new C2818b();
        int i2 = this.f3418c;
        if (!this.f3416a) {
            i = 0;
        }
        gVarArr[11] = new C2689b(i | i2);
        if (f3415j != null) {
            try {
                gVarArr[12] = (C2674g) f3415j.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return gVarArr;
    }
}

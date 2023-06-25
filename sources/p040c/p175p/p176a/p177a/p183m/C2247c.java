package p040c.p175p.p176a.p177a.p183m;

import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* renamed from: c.p.a.a.m.c */
/* compiled from: PageSizeCalculator */
public class C2247c {

    /* renamed from: a */
    public FitPolicy f2297a;

    /* renamed from: b */
    public final Size f2298b;

    /* renamed from: c */
    public final Size f2299c;

    /* renamed from: d */
    public final Size f2300d;

    /* renamed from: e */
    public SizeF f2301e;

    /* renamed from: f */
    public SizeF f2302f;

    /* renamed from: g */
    public float f2303g;

    /* renamed from: h */
    public float f2304h;

    /* renamed from: i */
    public boolean f2305i;

    /* renamed from: c.p.a.a.m.c$a */
    /* compiled from: PageSizeCalculator */
    public static /* synthetic */ class C2248a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2306a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.github.barteksc.pdfviewer.util.FitPolicy[] r0 = com.github.barteksc.pdfviewer.util.FitPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2306a = r0
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.HEIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2306a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.BOTH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p176a.p177a.p183m.C2247c.C2248a.<clinit>():void");
        }
    }

    public C2247c(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z) {
        this.f2297a = fitPolicy;
        this.f2298b = size;
        this.f2299c = size2;
        this.f2300d = size3;
        this.f2305i = z;
        mo17218b();
    }

    /* renamed from: a */
    public SizeF mo17217a(Size size) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            return new SizeF(0.0f, 0.0f);
        }
        float width = this.f2305i ? (float) this.f2300d.getWidth() : ((float) size.getWidth()) * this.f2303g;
        float height = this.f2305i ? (float) this.f2300d.getHeight() : ((float) size.getHeight()) * this.f2304h;
        int i = C2248a.f2306a[this.f2297a.ordinal()];
        if (i == 1) {
            return mo17220d(size, height);
        }
        if (i != 2) {
            return mo17221e(size, width);
        }
        return mo17219c(size, width, height);
    }

    /* renamed from: b */
    public final void mo17218b() {
        int i = C2248a.f2306a[this.f2297a.ordinal()];
        if (i == 1) {
            SizeF d = mo17220d(this.f2299c, (float) this.f2300d.getHeight());
            this.f2302f = d;
            this.f2304h = d.getHeight() / ((float) this.f2299c.getHeight());
            Size size = this.f2298b;
            this.f2301e = mo17220d(size, ((float) size.getHeight()) * this.f2304h);
        } else if (i != 2) {
            SizeF e = mo17221e(this.f2298b, (float) this.f2300d.getWidth());
            this.f2301e = e;
            this.f2303g = e.getWidth() / ((float) this.f2298b.getWidth());
            Size size2 = this.f2299c;
            this.f2302f = mo17221e(size2, ((float) size2.getWidth()) * this.f2303g);
        } else {
            float width = mo17219c(this.f2298b, (float) this.f2300d.getWidth(), (float) this.f2300d.getHeight()).getWidth() / ((float) this.f2298b.getWidth());
            Size size3 = this.f2299c;
            SizeF c = mo17219c(size3, ((float) size3.getWidth()) * width, (float) this.f2300d.getHeight());
            this.f2302f = c;
            this.f2304h = c.getHeight() / ((float) this.f2299c.getHeight());
            SizeF c2 = mo17219c(this.f2298b, (float) this.f2300d.getWidth(), ((float) this.f2298b.getHeight()) * this.f2304h);
            this.f2301e = c2;
            this.f2303g = c2.getWidth() / ((float) this.f2298b.getWidth());
        }
    }

    /* renamed from: c */
    public final SizeF mo17219c(Size size, float f, float f2) {
        float width = ((float) size.getWidth()) / ((float) size.getHeight());
        float floor = (float) Math.floor((double) (f / width));
        if (floor > f2) {
            f = (float) Math.floor((double) (width * f2));
        } else {
            f2 = floor;
        }
        return new SizeF(f, f2);
    }

    /* renamed from: d */
    public final SizeF mo17220d(Size size, float f) {
        return new SizeF((float) Math.floor((double) (f / (((float) size.getHeight()) / ((float) size.getWidth())))), f);
    }

    /* renamed from: e */
    public final SizeF mo17221e(Size size, float f) {
        return new SizeF(f, (float) Math.floor((double) (f / (((float) size.getWidth()) / ((float) size.getHeight())))));
    }

    /* renamed from: f */
    public SizeF mo17222f() {
        return this.f2302f;
    }

    /* renamed from: g */
    public SizeF mo17223g() {
        return this.f2301e;
    }
}

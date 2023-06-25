package p040c.p175p.p176a.p177a;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.util.SizeF;
import java.util.List;
import p040c.p175p.p176a.p177a.p183m.C2243a;
import p040c.p175p.p176a.p177a.p183m.C2246b;
import p040c.p175p.p176a.p177a.p183m.C2249d;

/* renamed from: c.p.a.a.e */
/* compiled from: PagesLoader */
public class C2216e {

    /* renamed from: a */
    public PDFView f2213a;

    /* renamed from: b */
    public int f2214b;

    /* renamed from: c */
    public float f2215c;

    /* renamed from: d */
    public float f2216d;

    /* renamed from: e */
    public float f2217e;

    /* renamed from: f */
    public float f2218f;

    /* renamed from: g */
    public float f2219g;

    /* renamed from: h */
    public float f2220h;

    /* renamed from: i */
    public final RectF f2221i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f2222j;

    /* renamed from: c.p.a.a.e$b */
    /* compiled from: PagesLoader */
    public class C2218b {

        /* renamed from: a */
        public int f2223a;

        /* renamed from: b */
        public int f2224b;

        public C2218b(C2216e eVar) {
        }

        public String toString() {
            return "GridSize{rows=" + this.f2223a + ", cols=" + this.f2224b + '}';
        }
    }

    /* renamed from: c.p.a.a.e$c */
    /* compiled from: PagesLoader */
    public class C2219c {

        /* renamed from: a */
        public int f2225a;

        /* renamed from: b */
        public int f2226b;

        public C2219c(C2216e eVar) {
        }

        public String toString() {
            return "Holder{row=" + this.f2225a + ", col=" + this.f2226b + '}';
        }
    }

    /* renamed from: c.p.a.a.e$d */
    /* compiled from: PagesLoader */
    public class C2220d {

        /* renamed from: a */
        public int f2227a = 0;

        /* renamed from: b */
        public C2218b f2228b;

        /* renamed from: c */
        public C2219c f2229c;

        /* renamed from: d */
        public C2219c f2230d;

        public C2220d(C2216e eVar) {
            this.f2228b = new C2218b();
            this.f2229c = new C2219c();
            this.f2230d = new C2219c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f2227a + ", gridSize=" + this.f2228b + ", leftTop=" + this.f2229c + ", rightBottom=" + this.f2230d + '}';
        }
    }

    public C2216e(PDFView pDFView) {
        this.f2213a = pDFView;
        this.f2222j = C2249d.m3490a(pDFView.getContext(), C2243a.f2292d);
    }

    /* renamed from: a */
    public final void mo17120a(C2218b bVar) {
        float f = 1.0f / ((float) bVar.f2224b);
        this.f2217e = f;
        float f2 = 1.0f / ((float) bVar.f2223a);
        this.f2218f = f2;
        float f3 = C2243a.f2291c;
        this.f2219g = f3 / f;
        this.f2220h = f3 / f2;
    }

    /* renamed from: b */
    public final void mo17121b(C2218b bVar, int i) {
        SizeF n = this.f2213a.f7302q.mo17145n(i);
        float height = (C2243a.f2291c * (1.0f / n.getHeight())) / this.f2213a.getZoom();
        float width = (C2243a.f2291c * (1.0f / n.getWidth())) / this.f2213a.getZoom();
        bVar.f2223a = C2246b.m3478a(1.0f / height);
        bVar.f2224b = C2246b.m3478a(1.0f / width);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0190  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p040c.p175p.p176a.p177a.C2216e.C2220d> mo17122c(float r20, float r21, float r22, float r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = 0
            r2 = r20
            float r2 = p040c.p175p.p176a.p177a.p183m.C2246b.m3481d(r2, r1)
            float r2 = -r2
            r3 = r21
            float r3 = p040c.p175p.p176a.p177a.p183m.C2246b.m3481d(r3, r1)
            float r3 = -r3
            r4 = r22
            float r4 = p040c.p175p.p176a.p177a.p183m.C2246b.m3481d(r4, r1)
            float r4 = -r4
            r5 = r23
            float r5 = p040c.p175p.p176a.p177a.p183m.C2246b.m3481d(r5, r1)
            float r5 = -r5
            com.github.barteksc.pdfviewer.PDFView r6 = r0.f2213a
            boolean r6 = r6.mo23494C()
            if (r6 == 0) goto L_0x0029
            r6 = r3
            goto L_0x002a
        L_0x0029:
            r6 = r2
        L_0x002a:
            com.github.barteksc.pdfviewer.PDFView r7 = r0.f2213a
            boolean r7 = r7.mo23494C()
            if (r7 == 0) goto L_0x0034
            r7 = r5
            goto L_0x0035
        L_0x0034:
            r7 = r4
        L_0x0035:
            com.github.barteksc.pdfviewer.PDFView r8 = r0.f2213a
            c.p.a.a.f r9 = r8.f7302q
            float r8 = r8.getZoom()
            int r6 = r9.mo17141j(r6, r8)
            com.github.barteksc.pdfviewer.PDFView r8 = r0.f2213a
            c.p.a.a.f r9 = r8.f7302q
            float r8 = r8.getZoom()
            int r7 = r9.mo17141j(r7, r8)
            int r8 = r7 - r6
            r9 = 1
            int r8 = r8 + r9
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r11 = r6
        L_0x0057:
            if (r11 > r7) goto L_0x0200
            c.p.a.a.e$d r12 = new c.p.a.a.e$d
            r12.<init>(r0)
            r12.f2227a = r11
            if (r11 != r6) goto L_0x009f
            if (r8 != r9) goto L_0x006b
            r13 = r2
            r15 = r3
            r14 = r4
        L_0x0067:
            r16 = r5
            goto L_0x00f0
        L_0x006b:
            com.github.barteksc.pdfviewer.PDFView r13 = r0.f2213a
            c.p.a.a.f r14 = r13.f7302q
            float r13 = r13.getZoom()
            float r13 = r14.mo17144m(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.f2213a
            c.p.a.a.f r15 = r14.f7302q
            float r14 = r14.getZoom()
            com.shockwave.pdfium.util.SizeF r14 = r15.mo17148q(r11, r14)
            com.github.barteksc.pdfviewer.PDFView r15 = r0.f2213a
            boolean r15 = r15.mo23494C()
            if (r15 == 0) goto L_0x0093
            float r14 = r14.getHeight()
            float r13 = r13 + r14
            r14 = r13
            r13 = r4
            goto L_0x0099
        L_0x0093:
            float r14 = r14.getWidth()
            float r13 = r13 + r14
            r14 = r5
        L_0x0099:
            r15 = r3
            r16 = r14
            r14 = r13
            r13 = r2
            goto L_0x00f0
        L_0x009f:
            if (r11 != r7) goto L_0x00bd
            com.github.barteksc.pdfviewer.PDFView r13 = r0.f2213a
            c.p.a.a.f r14 = r13.f7302q
            float r13 = r13.getZoom()
            float r13 = r14.mo17144m(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.f2213a
            boolean r14 = r14.mo23494C()
            if (r14 == 0) goto L_0x00b8
            r14 = r13
            r13 = r2
            goto L_0x00b9
        L_0x00b8:
            r14 = r3
        L_0x00b9:
            r16 = r5
            r15 = r14
            goto L_0x00e6
        L_0x00bd:
            com.github.barteksc.pdfviewer.PDFView r13 = r0.f2213a
            c.p.a.a.f r14 = r13.f7302q
            float r13 = r13.getZoom()
            float r13 = r14.mo17144m(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.f2213a
            c.p.a.a.f r15 = r14.f7302q
            float r14 = r14.getZoom()
            com.shockwave.pdfium.util.SizeF r14 = r15.mo17148q(r11, r14)
            com.github.barteksc.pdfviewer.PDFView r15 = r0.f2213a
            boolean r15 = r15.mo23494C()
            if (r15 == 0) goto L_0x00e8
            float r14 = r14.getHeight()
            float r14 = r14 + r13
            r15 = r13
            r16 = r14
            r13 = r2
        L_0x00e6:
            r14 = r4
            goto L_0x00f0
        L_0x00e8:
            float r14 = r14.getWidth()
            float r14 = r14 + r13
            r15 = r3
            goto L_0x0067
        L_0x00f0:
            c.p.a.a.e$b r9 = r12.f2228b
            int r1 = r12.f2227a
            r0.mo17121b(r9, r1)
            com.github.barteksc.pdfviewer.PDFView r1 = r0.f2213a
            c.p.a.a.f r9 = r1.f7302q
            r17 = r2
            int r2 = r12.f2227a
            float r1 = r1.getZoom()
            com.shockwave.pdfium.util.SizeF r1 = r9.mo17148q(r2, r1)
            float r2 = r1.getHeight()
            c.p.a.a.e$b r9 = r12.f2228b
            int r9 = r9.f2223a
            float r9 = (float) r9
            float r2 = r2 / r9
            float r1 = r1.getWidth()
            c.p.a.a.e$b r9 = r12.f2228b
            int r9 = r9.f2224b
            float r9 = (float) r9
            float r1 = r1 / r9
            com.github.barteksc.pdfviewer.PDFView r9 = r0.f2213a
            r21 = r3
            c.p.a.a.f r3 = r9.f7302q
            float r9 = r9.getZoom()
            float r3 = r3.mo17149r(r11, r9)
            com.github.barteksc.pdfviewer.PDFView r9 = r0.f2213a
            boolean r9 = r9.mo23494C()
            if (r9 == 0) goto L_0x0190
            c.p.a.a.e$c r9 = r12.f2229c
            r22 = r4
            com.github.barteksc.pdfviewer.PDFView r4 = r0.f2213a
            r23 = r5
            c.p.a.a.f r5 = r4.f7302q
            r18 = r6
            int r6 = r12.f2227a
            float r4 = r4.getZoom()
            float r4 = r5.mo17144m(r6, r4)
            float r15 = r15 - r4
            float r4 = java.lang.Math.abs(r15)
            float r4 = r4 / r2
            int r4 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r4)
            r9.f2225a = r4
            c.p.a.a.e$c r4 = r12.f2229c
            float r13 = r13 - r3
            r5 = 0
            float r6 = p040c.p175p.p176a.p177a.p183m.C2246b.m3482e(r13, r5)
            float r6 = r6 / r1
            int r5 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r6)
            r4.f2226b = r5
            c.p.a.a.e$c r4 = r12.f2230d
            com.github.barteksc.pdfviewer.PDFView r5 = r0.f2213a
            c.p.a.a.f r6 = r5.f7302q
            int r9 = r12.f2227a
            float r5 = r5.getZoom()
            float r5 = r6.mo17144m(r9, r5)
            float r16 = r16 - r5
            float r5 = java.lang.Math.abs(r16)
            float r5 = r5 / r2
            int r2 = p040c.p175p.p176a.p177a.p183m.C2246b.m3478a(r5)
            r4.f2225a = r2
            c.p.a.a.e$c r2 = r12.f2230d
            float r14 = r14 - r3
            r3 = 0
            float r4 = p040c.p175p.p176a.p177a.p183m.C2246b.m3482e(r14, r3)
            float r4 = r4 / r1
            int r1 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r4)
            r2.f2226b = r1
            r4 = 0
            goto L_0x01ed
        L_0x0190:
            r22 = r4
            r23 = r5
            r18 = r6
            c.p.a.a.e$c r4 = r12.f2229c
            com.github.barteksc.pdfviewer.PDFView r5 = r0.f2213a
            c.p.a.a.f r6 = r5.f7302q
            int r9 = r12.f2227a
            float r5 = r5.getZoom()
            float r5 = r6.mo17144m(r9, r5)
            float r13 = r13 - r5
            float r5 = java.lang.Math.abs(r13)
            float r5 = r5 / r1
            int r5 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r5)
            r4.f2226b = r5
            c.p.a.a.e$c r4 = r12.f2229c
            float r15 = r15 - r3
            r5 = 0
            float r6 = p040c.p175p.p176a.p177a.p183m.C2246b.m3482e(r15, r5)
            float r6 = r6 / r2
            int r5 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r6)
            r4.f2225a = r5
            c.p.a.a.e$c r4 = r12.f2230d
            com.github.barteksc.pdfviewer.PDFView r5 = r0.f2213a
            c.p.a.a.f r6 = r5.f7302q
            int r9 = r12.f2227a
            float r5 = r5.getZoom()
            float r5 = r6.mo17144m(r9, r5)
            float r14 = r14 - r5
            float r5 = java.lang.Math.abs(r14)
            float r5 = r5 / r1
            int r1 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r5)
            r4.f2226b = r1
            c.p.a.a.e$c r1 = r12.f2230d
            float r3 = r16 - r3
            r4 = 0
            float r3 = p040c.p175p.p176a.p177a.p183m.C2246b.m3482e(r3, r4)
            float r3 = r3 / r2
            int r2 = p040c.p175p.p176a.p177a.p183m.C2246b.m3479b(r3)
            r1.f2225a = r2
        L_0x01ed:
            r10.add(r12)
            int r11 = r11 + 1
            r3 = r21
            r5 = r23
            r1 = r4
            r2 = r17
            r6 = r18
            r9 = 1
            r4 = r22
            goto L_0x0057
        L_0x0200:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p176a.p177a.C2216e.mo17122c(float, float, float, float):java.util.List");
    }

    /* renamed from: d */
    public final boolean mo17123d(int i, int i2, int i3, float f, float f2) {
        float f3 = ((float) i3) * f;
        float f4 = ((float) i2) * f2;
        float f5 = this.f2219g;
        float f6 = this.f2220h;
        float f7 = f3 + f > 1.0f ? 1.0f - f3 : f;
        float f8 = f4 + f2 > 1.0f ? 1.0f - f4 : f2;
        float f9 = f5 * f7;
        float f10 = f6 * f8;
        RectF rectF = new RectF(f3, f4, f7 + f3, f8 + f4);
        if (f9 <= 0.0f || f10 <= 0.0f) {
            return false;
        }
        if (!this.f2213a.f7299n.mo17090k(i, rectF, this.f2214b)) {
            PDFView pDFView = this.f2213a;
            pDFView.f7311z.mo17158b(i, f9, f10, rectF, false, this.f2214b, pDFView.mo23564x(), this.f2213a.mo23562v());
        }
        this.f2214b++;
        return true;
    }

    /* renamed from: e */
    public final int mo17124e(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i2 <= i3) {
            for (int i8 = i4; i8 <= i5; i8++) {
                if (mo17123d(i, i2, i8, this.f2217e, this.f2218f)) {
                    i7++;
                }
                if (i7 >= i6) {
                    return i7;
                }
            }
            i2++;
        }
        return i7;
    }

    /* renamed from: f */
    public void mo17125f() {
        this.f2214b = 1;
        this.f2215c = -C2246b.m3481d(this.f2213a.getCurrentXOffset(), 0.0f);
        this.f2216d = -C2246b.m3481d(this.f2213a.getCurrentYOffset(), 0.0f);
        mo17127h();
    }

    /* renamed from: g */
    public final void mo17126g(int i) {
        SizeF n = this.f2213a.f7302q.mo17145n(i);
        float width = n.getWidth() * C2243a.f2290b;
        float height = n.getHeight() * C2243a.f2290b;
        if (!this.f2213a.f7299n.mo17084d(i, this.f2221i)) {
            PDFView pDFView = this.f2213a;
            pDFView.f7311z.mo17158b(i, width, height, this.f2221i, true, 0, pDFView.mo23564x(), this.f2213a.mo23562v());
        }
    }

    /* renamed from: h */
    public final void mo17127h() {
        float f = (float) this.f2222j;
        float f2 = this.f2215c;
        float f3 = this.f2216d;
        List<C2220d> c = mo17122c((-f2) + f, (-f3) + f, ((-f2) - ((float) this.f2213a.getWidth())) - f, ((-f3) - ((float) this.f2213a.getHeight())) - f);
        for (C2220d dVar : c) {
            mo17126g(dVar.f2227a);
        }
        int i = 0;
        for (C2220d next : c) {
            mo17120a(next.f2228b);
            int i2 = next.f2227a;
            C2219c cVar = next.f2229c;
            int i3 = cVar.f2225a;
            C2219c cVar2 = next.f2230d;
            i += mo17124e(i2, i3, cVar2.f2225a, cVar.f2226b, cVar2.f2226b, C2243a.C2244a.f2293a - i);
            if (i >= C2243a.C2244a.f2293a) {
                return;
            }
        }
    }
}

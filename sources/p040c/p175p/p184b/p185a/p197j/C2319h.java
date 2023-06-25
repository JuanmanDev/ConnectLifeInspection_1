package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.data.BarEntry;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p187b.C2252b;
import p040c.p175p.p184b.p185a.p187b.C2253c;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p192g.p193a.C2288e;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.h */
/* compiled from: HorizontalBarChartRenderer */
public class C2319h extends C2311b {

    /* renamed from: m */
    public RectF f2454m = new RectF();

    public C2319h(C2284a aVar, C2250a aVar2, C2348j jVar) {
        super(aVar, aVar2, jVar);
        this.f2453e.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17498e(android.graphics.Canvas r41) {
        /*
            r40 = this;
            r6 = r40
            c.p.b.a.g.a.a r0 = r6.f2425g
            boolean r0 = r6.mo17514g(r0)
            if (r0 == 0) goto L_0x03ca
            c.p.b.a.g.a.a r0 = r6.f2425g
            c.p.b.a.d.a r0 = r0.getBarData()
            java.util.List r7 = r0.mo17279f()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r8 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            c.p.b.a.g.a.a r0 = r6.f2425g
            boolean r9 = r0.mo17344c()
            r11 = 0
        L_0x0021:
            c.p.b.a.g.a.a r0 = r6.f2425g
            c.p.b.a.d.a r0 = r0.getBarData()
            int r0 = r0.mo17278e()
            if (r11 >= r0) goto L_0x03ca
            java.lang.Object r0 = r7.get(r11)
            r12 = r0
            c.p.b.a.g.b.a r12 = (p040c.p175p.p184b.p185a.p192g.p194b.C2292a) r12
            boolean r0 = r6.mo17505i(r12)
            if (r0 != 0) goto L_0x0040
            r19 = r7
            r20 = r11
            goto L_0x03c4
        L_0x0040:
            c.p.b.a.g.a.a r0 = r6.f2425g
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.mo17384F0()
            boolean r13 = r0.mo17348e(r1)
            r6.mo17513a(r12)
            android.graphics.Paint r0 = r6.f2453e
            java.lang.String r1 = "10"
            int r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3954a(r0, r1)
            float r0 = (float) r0
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r0 / r14
            c.p.b.a.e.d r5 = r12.mo17389K()
            c.p.b.a.b.b[] r0 = r6.f2427i
            r4 = r0[r11]
            c.p.b.a.a.a r0 = r6.f2450b
            float r16 = r0.mo17225b()
            c.p.b.a.k.e r0 = r12.mo17386I0()
            c.p.b.a.k.e r3 = p040c.p175p.p184b.p185a.p199k.C2342e.m3926d(r0)
            float r0 = r3.f2538c
            float r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            r3.f2538c = r0
            float r0 = r3.f2539d
            float r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            r3.f2539d = r0
            boolean r0 = r12.mo17365z0()
            r17 = 0
            if (r0 != 0) goto L_0x019f
            r2 = 0
        L_0x0089:
            float r0 = (float) r2
            float[] r1 = r4.f2310b
            int r1 = r1.length
            float r1 = (float) r1
            c.p.b.a.a.a r10 = r6.f2450b
            float r10 = r10.mo17224a()
            float r1 = r1 * r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0198
            float[] r0 = r4.f2310b
            int r1 = r2 + 1
            r10 = r0[r1]
            int r16 = r2 + 3
            r16 = r0[r16]
            float r10 = r10 + r16
            float r10 = r10 / r14
            c.p.b.a.k.j r14 = r6.f2503a
            r0 = r0[r1]
            boolean r0 = r14.mo17605B(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0198
        L_0x00b2:
            c.p.b.a.k.j r0 = r6.f2503a
            float[] r14 = r4.f2310b
            r14 = r14[r2]
            boolean r0 = r0.mo17606C(r14)
            if (r0 != 0) goto L_0x00cb
        L_0x00be:
            r25 = r2
            r19 = r7
            r20 = r11
            r23 = r15
            r7 = r3
            r11 = r4
            r15 = r5
            goto L_0x0189
        L_0x00cb:
            c.p.b.a.k.j r0 = r6.f2503a
            float[] r14 = r4.f2310b
            r1 = r14[r1]
            boolean r0 = r0.mo17647y(r1)
            if (r0 != 0) goto L_0x00d8
            goto L_0x00be
        L_0x00d8:
            int r0 = r2 / 4
            com.github.mikephil.charting.data.Entry r0 = r12.mo17392O(r0)
            r14 = r0
            com.github.mikephil.charting.data.BarEntry r14 = (com.github.mikephil.charting.data.BarEntry) r14
            float r16 = r14.mo17271c()
            java.lang.String r1 = r5.mo17307b(r14)
            android.graphics.Paint r0 = r6.f2453e
            int r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3957d(r0, r1)
            float r0 = (float) r0
            r19 = r1
            if (r9 == 0) goto L_0x00f6
            r1 = r8
            goto L_0x00f9
        L_0x00f6:
            float r1 = r0 + r8
            float r1 = -r1
        L_0x00f9:
            r20 = r3
            if (r9 == 0) goto L_0x0101
            float r3 = r0 + r8
            float r3 = -r3
            goto L_0x0102
        L_0x0101:
            r3 = r8
        L_0x0102:
            if (r13 == 0) goto L_0x0108
            float r1 = -r1
            float r1 = r1 - r0
            float r3 = -r3
            float r3 = r3 - r0
        L_0x0108:
            r21 = r1
            r22 = r3
            boolean r0 = r12.mo17381A0()
            if (r0 == 0) goto L_0x0145
            float[] r0 = r4.f2310b
            int r1 = r2 + 2
            r0 = r0[r1]
            int r1 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x011f
            r1 = r21
            goto L_0x0121
        L_0x011f:
            r1 = r22
        L_0x0121:
            float r3 = r0 + r1
            float r23 = r10 + r15
            int r0 = r2 / 2
            int r24 = r12.mo17400g0(r0)
            r0 = r40
            r1 = r41
            r25 = r2
            r2 = r19
            r19 = r7
            r7 = r20
            r20 = r11
            r11 = r4
            r4 = r23
            r23 = r15
            r15 = r5
            r5 = r24
            r0.mo17501k(r1, r2, r3, r4, r5)
            goto L_0x0151
        L_0x0145:
            r25 = r2
            r19 = r7
            r23 = r15
            r7 = r20
            r15 = r5
            r20 = r11
            r11 = r4
        L_0x0151:
            android.graphics.drawable.Drawable r0 = r14.mo17270b()
            if (r0 == 0) goto L_0x0189
            boolean r0 = r12.mo17411w()
            if (r0 == 0) goto L_0x0189
            android.graphics.drawable.Drawable r27 = r14.mo17270b()
            float[] r0 = r11.f2310b
            int r2 = r25 + 2
            r0 = r0[r2]
            int r1 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r21 = r22
        L_0x016e:
            float r0 = r0 + r21
            float r1 = r7.f2538c
            float r0 = r0 + r1
            float r1 = r7.f2539d
            float r10 = r10 + r1
            int r0 = (int) r0
            int r1 = (int) r10
            int r30 = r27.getIntrinsicWidth()
            int r31 = r27.getIntrinsicHeight()
            r26 = r41
            r28 = r0
            r29 = r1
            p040c.p175p.p184b.p185a.p199k.C2347i.m3959f(r26, r27, r28, r29, r30, r31)
        L_0x0189:
            int r2 = r25 + 4
            r3 = r7
            r4 = r11
            r5 = r15
            r7 = r19
            r11 = r20
            r15 = r23
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0089
        L_0x0198:
            r19 = r7
            r20 = r11
            r7 = r3
            goto L_0x03c1
        L_0x019f:
            r19 = r7
            r20 = r11
            r23 = r15
            r7 = r3
            r11 = r4
            r15 = r5
            c.p.b.a.g.a.a r0 = r6.f2425g
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.mo17384F0()
            c.p.b.a.k.g r10 = r0.mo17347a(r1)
            r14 = 0
            r21 = 0
        L_0x01b5:
            float r0 = (float) r14
            int r1 = r12.mo17385H0()
            float r1 = (float) r1
            c.p.b.a.a.a r2 = r6.f2450b
            float r2 = r2.mo17224a()
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c1
            com.github.mikephil.charting.data.Entry r0 = r12.mo17392O(r14)
            r5 = r0
            com.github.mikephil.charting.data.BarEntry r5 = (com.github.mikephil.charting.data.BarEntry) r5
            int r22 = r12.mo17400g0(r14)
            float[] r4 = r5.mo23868j()
            if (r4 != 0) goto L_0x029d
            c.p.b.a.k.j r0 = r6.f2503a
            float[] r1 = r11.f2310b
            int r24 = r21 + 1
            r1 = r1[r24]
            boolean r0 = r0.mo17605B(r1)
            if (r0 != 0) goto L_0x01e7
            goto L_0x03c1
        L_0x01e7:
            c.p.b.a.k.j r0 = r6.f2503a
            float[] r1 = r11.f2310b
            r1 = r1[r21]
            boolean r0 = r0.mo17606C(r1)
            if (r0 != 0) goto L_0x01f4
            goto L_0x01b5
        L_0x01f4:
            c.p.b.a.k.j r0 = r6.f2503a
            float[] r1 = r11.f2310b
            r1 = r1[r24]
            boolean r0 = r0.mo17647y(r1)
            if (r0 != 0) goto L_0x0201
            goto L_0x01b5
        L_0x0201:
            java.lang.String r2 = r15.mo17307b(r5)
            android.graphics.Paint r0 = r6.f2453e
            int r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3957d(r0, r2)
            float r0 = (float) r0
            if (r9 == 0) goto L_0x0210
            r1 = r8
            goto L_0x0213
        L_0x0210:
            float r1 = r0 + r8
            float r1 = -r1
        L_0x0213:
            if (r9 == 0) goto L_0x0219
            float r3 = r0 + r8
            float r3 = -r3
            goto L_0x021a
        L_0x0219:
            r3 = r8
        L_0x021a:
            if (r13 == 0) goto L_0x0220
            float r1 = -r1
            float r1 = r1 - r0
            float r3 = -r3
            float r3 = r3 - r0
        L_0x0220:
            r25 = r1
            r26 = r3
            boolean r0 = r12.mo17381A0()
            if (r0 == 0) goto L_0x0256
            float[] r0 = r11.f2310b
            int r1 = r21 + 2
            r0 = r0[r1]
            float r1 = r5.mo17271c()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x023b
            r1 = r25
            goto L_0x023d
        L_0x023b:
            r1 = r26
        L_0x023d:
            float r3 = r0 + r1
            float[] r0 = r11.f2310b
            r0 = r0[r24]
            float r27 = r0 + r23
            r0 = r40
            r1 = r41
            r28 = r14
            r14 = r4
            r4 = r27
            r27 = r5
            r5 = r22
            r0.mo17501k(r1, r2, r3, r4, r5)
            goto L_0x025b
        L_0x0256:
            r27 = r5
            r28 = r14
            r14 = r4
        L_0x025b:
            android.graphics.drawable.Drawable r0 = r27.mo17270b()
            if (r0 == 0) goto L_0x03b1
            boolean r0 = r12.mo17411w()
            if (r0 == 0) goto L_0x03b1
            android.graphics.drawable.Drawable r30 = r27.mo17270b()
            float[] r0 = r11.f2310b
            int r1 = r21 + 2
            r0 = r0[r1]
            float r1 = r27.mo17271c()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r25 = r26
        L_0x027c:
            float r0 = r0 + r25
            float[] r1 = r11.f2310b
            r1 = r1[r24]
            float r2 = r7.f2538c
            float r0 = r0 + r2
            float r2 = r7.f2539d
            float r1 = r1 + r2
            int r0 = (int) r0
            int r1 = (int) r1
            int r33 = r30.getIntrinsicWidth()
            int r34 = r30.getIntrinsicHeight()
            r29 = r41
            r31 = r0
            r32 = r1
            p040c.p175p.p184b.p185a.p199k.C2347i.m3959f(r29, r30, r31, r32, r33, r34)
            goto L_0x03b1
        L_0x029d:
            r27 = r5
            r28 = r14
            r14 = r4
            int r0 = r14.length
            int r5 = r0 * 2
            float[] r4 = new float[r5]
            float r0 = r27.mo23865g()
            float r0 = -r0
            r24 = r0
            r25 = r17
            r0 = 0
            r1 = 0
        L_0x02b2:
            if (r0 >= r5) goto L_0x02df
            r2 = r14[r1]
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x02c9
            int r26 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r26 == 0) goto L_0x02c2
            int r26 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r26 != 0) goto L_0x02c9
        L_0x02c2:
            r39 = r24
            r24 = r2
            r2 = r39
            goto L_0x02d4
        L_0x02c9:
            if (r3 < 0) goto L_0x02d2
            float r25 = r25 + r2
            r2 = r24
            r24 = r25
            goto L_0x02d4
        L_0x02d2:
            float r2 = r24 - r2
        L_0x02d4:
            float r24 = r24 * r16
            r4[r0] = r24
            int r0 = r0 + 2
            int r1 = r1 + 1
            r24 = r2
            goto L_0x02b2
        L_0x02df:
            r10.mo17598k(r4)
            r3 = 0
        L_0x02e3:
            if (r3 >= r5) goto L_0x03b1
            int r0 = r3 / 2
            r0 = r14[r0]
            r2 = r27
            java.lang.String r1 = r15.mo17308c(r0, r2)
            android.graphics.Paint r2 = r6.f2453e
            int r2 = p040c.p175p.p184b.p185a.p199k.C2347i.m3957d(r2, r1)
            float r2 = (float) r2
            r26 = r1
            if (r9 == 0) goto L_0x02fc
            r1 = r8
            goto L_0x02ff
        L_0x02fc:
            float r1 = r2 + r8
            float r1 = -r1
        L_0x02ff:
            r29 = r5
            if (r9 == 0) goto L_0x0307
            float r5 = r2 + r8
            float r5 = -r5
            goto L_0x0308
        L_0x0307:
            r5 = r8
        L_0x0308:
            if (r13 == 0) goto L_0x030e
            float r1 = -r1
            float r1 = r1 - r2
            float r5 = -r5
            float r5 = r5 - r2
        L_0x030e:
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x031a
            int r2 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x031a
            int r2 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x031e
        L_0x031a:
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0320
        L_0x031e:
            r0 = 1
            goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            r2 = r4[r3]
            if (r0 == 0) goto L_0x0326
            r1 = r5
        L_0x0326:
            float r5 = r2 + r1
            float[] r0 = r11.f2310b
            int r1 = r21 + 1
            r1 = r0[r1]
            int r2 = r21 + 3
            r0 = r0[r2]
            float r1 = r1 + r0
            r18 = 1073741824(0x40000000, float:2.0)
            float r2 = r1 / r18
            c.p.b.a.k.j r0 = r6.f2503a
            boolean r0 = r0.mo17605B(r2)
            if (r0 != 0) goto L_0x0341
            goto L_0x03b3
        L_0x0341:
            c.p.b.a.k.j r0 = r6.f2503a
            boolean r0 = r0.mo17606C(r5)
            if (r0 != 0) goto L_0x034e
        L_0x0349:
            r26 = r3
            r32 = r4
            goto L_0x03a9
        L_0x034e:
            c.p.b.a.k.j r0 = r6.f2503a
            boolean r0 = r0.mo17647y(r2)
            if (r0 != 0) goto L_0x0357
            goto L_0x0349
        L_0x0357:
            boolean r0 = r12.mo17381A0()
            if (r0 == 0) goto L_0x0376
            float r30 = r2 + r23
            r0 = r40
            r1 = r41
            r31 = r2
            r2 = r26
            r26 = r3
            r3 = r5
            r32 = r4
            r4 = r30
            r30 = r5
            r5 = r22
            r0.mo17501k(r1, r2, r3, r4, r5)
            goto L_0x037e
        L_0x0376:
            r31 = r2
            r26 = r3
            r32 = r4
            r30 = r5
        L_0x037e:
            android.graphics.drawable.Drawable r0 = r27.mo17270b()
            if (r0 == 0) goto L_0x03a9
            boolean r0 = r12.mo17411w()
            if (r0 == 0) goto L_0x03a9
            android.graphics.drawable.Drawable r34 = r27.mo17270b()
            float r0 = r7.f2538c
            float r5 = r30 + r0
            int r0 = (int) r5
            float r1 = r7.f2539d
            float r2 = r31 + r1
            int r1 = (int) r2
            int r37 = r34.getIntrinsicWidth()
            int r38 = r34.getIntrinsicHeight()
            r33 = r41
            r35 = r0
            r36 = r1
            p040c.p175p.p184b.p185a.p199k.C2347i.m3959f(r33, r34, r35, r36, r37, r38)
        L_0x03a9:
            int r3 = r26 + 2
            r5 = r29
            r4 = r32
            goto L_0x02e3
        L_0x03b1:
            r18 = 1073741824(0x40000000, float:2.0)
        L_0x03b3:
            if (r14 != 0) goto L_0x03b8
            int r21 = r21 + 4
            goto L_0x03bd
        L_0x03b8:
            int r0 = r14.length
            int r0 = r0 * 4
            int r21 = r21 + r0
        L_0x03bd:
            int r14 = r28 + 1
            goto L_0x01b5
        L_0x03c1:
            p040c.p175p.p184b.p185a.p199k.C2342e.m3927e(r7)
        L_0x03c4:
            int r11 = r20 + 1
            r7 = r19
            goto L_0x0021
        L_0x03ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2319h.mo17498e(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public void mo17499f() {
        C2259a barData = this.f2425g.getBarData();
        this.f2427i = new C2253c[barData.mo17278e()];
        for (int i = 0; i < this.f2427i.length; i++) {
            C2292a aVar = (C2292a) barData.mo17277d(i);
            this.f2427i[i] = new C2253c(aVar.mo17385H0() * 4 * (aVar.mo17365z0() ? aVar.mo17361m0() : 1), barData.mo17278e(), aVar.mo17365z0());
        }
    }

    /* renamed from: g */
    public boolean mo17514g(C2288e eVar) {
        return ((float) eVar.getData().mo17280g()) < ((float) eVar.getMaxVisibleCount()) * this.f2503a.mo17640r();
    }

    /* renamed from: j */
    public void mo17500j(Canvas canvas, C2292a aVar, int i) {
        C2292a aVar2 = aVar;
        int i2 = i;
        C2345g a = this.f2425g.mo17347a(aVar.mo17384F0());
        this.f2429k.setColor(aVar.mo17362r());
        this.f2429k.setStrokeWidth(C2347i.m3958e(aVar.mo17364z()));
        int i3 = 0;
        boolean z = true;
        boolean z2 = aVar.mo17364z() > 0.0f;
        float a2 = this.f2450b.mo17224a();
        float b = this.f2450b.mo17225b();
        if (this.f2425g.mo17343b()) {
            this.f2428j.setColor(aVar.mo17360b0());
            float r = this.f2425g.getBarData().mo17268r() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) aVar.mo17385H0()) * a2)), aVar.mo17385H0());
            for (int i4 = 0; i4 < min; i4++) {
                float f = ((BarEntry) aVar2.mo17392O(i4)).mo23876f();
                RectF rectF = this.f2454m;
                rectF.top = f - r;
                rectF.bottom = f + r;
                a.mo17603p(rectF);
                if (!this.f2503a.mo17605B(this.f2454m.bottom)) {
                    Canvas canvas2 = canvas;
                } else if (!this.f2503a.mo17647y(this.f2454m.top)) {
                    break;
                } else {
                    this.f2454m.left = this.f2503a.mo17630h();
                    this.f2454m.right = this.f2503a.mo17631i();
                    canvas.drawRect(this.f2454m, this.f2428j);
                }
            }
        }
        Canvas canvas3 = canvas;
        C2252b bVar = this.f2427i[i2];
        bVar.mo17227b(a2, b);
        bVar.mo17232g(i2);
        bVar.mo17233h(this.f2425g.mo17348e(aVar.mo17384F0()));
        bVar.mo17231f(this.f2425g.getBarData().mo17268r());
        bVar.mo17230e(aVar2);
        a.mo17598k(bVar.f2310b);
        if (aVar.mo17403l0().size() != 1) {
            z = false;
        }
        if (z) {
            this.f2451c.setColor(aVar.mo17388J0());
        }
        while (i3 < bVar.mo17228c()) {
            int i5 = i3 + 3;
            if (this.f2503a.mo17605B(bVar.f2310b[i5])) {
                int i6 = i3 + 1;
                if (this.f2503a.mo17647y(bVar.f2310b[i6])) {
                    if (!z) {
                        this.f2451c.setColor(aVar2.mo17395U(i3 / 4));
                    }
                    float[] fArr = bVar.f2310b;
                    int i7 = i3 + 2;
                    canvas.drawRect(fArr[i3], fArr[i6], fArr[i7], fArr[i5], this.f2451c);
                    if (z2) {
                        float[] fArr2 = bVar.f2310b;
                        canvas.drawRect(fArr2[i3], fArr2[i6], fArr2[i7], fArr2[i5], this.f2429k);
                    }
                }
                i3 += 4;
                Canvas canvas4 = canvas;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo17501k(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: l */
    public void mo17502l(float f, float f2, float f3, float f4, C2345g gVar) {
        this.f2426h.set(f2, f - f4, f3, f + f4);
        gVar.mo17602o(this.f2426h, this.f2450b.mo17225b());
    }

    /* renamed from: m */
    public void mo17503m(C2277d dVar, RectF rectF) {
        dVar.mo17338m(rectF.centerY(), rectF.right);
    }
}

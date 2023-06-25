package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.Legend;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p188c.C2258e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.i */
/* compiled from: LegendRenderer */
public class C2320i extends C2329o {

    /* renamed from: b */
    public Paint f2455b;

    /* renamed from: c */
    public Paint f2456c;

    /* renamed from: d */
    public Legend f2457d;

    /* renamed from: e */
    public List<C2258e> f2458e = new ArrayList(16);

    /* renamed from: f */
    public Paint.FontMetrics f2459f = new Paint.FontMetrics();

    /* renamed from: g */
    public Path f2460g = new Path();

    /* renamed from: c.p.b.a.j.i$a */
    /* compiled from: LegendRenderer */
    public static /* synthetic */ class C2321a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2461a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2462b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f2463c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f2464d;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a4 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendForm[] r0 = com.github.mikephil.charting.components.Legend.LegendForm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2464d = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendForm r2 = com.github.mikephil.charting.components.Legend.LegendForm.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2464d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2464d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f2464d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f2464d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f2464d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.LINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2463c = r3
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r3 = f2463c     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2462b = r3
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r3 = f2462b     // Catch:{ NoSuchFieldError -> 0x007f }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x007f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r3 = f2462b     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2461a = r3
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x009a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                int[] r1 = f2461a     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = f2461a     // Catch:{ NoSuchFieldError -> 0x00ae }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2320i.C2321a.<clinit>():void");
        }
    }

    public C2320i(C2348j jVar, Legend legend) {
        super(jVar);
        this.f2457d = legend;
        Paint paint = new Paint(1);
        this.f2455b = paint;
        paint.setTextSize(C2347i.m3958e(9.0f));
        this.f2455b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f2456c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: c.p.b.a.d.f<?>} */
    /* JADX WARNING: type inference failed for: r7v2, types: [c.p.b.a.g.b.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17515a(p040c.p175p.p184b.p185a.p189d.C2264f<?> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.github.mikephil.charting.components.Legend r2 = r0.f2457d
            boolean r2 = r2.mo23813C()
            if (r2 != 0) goto L_0x01c1
            java.util.List<c.p.b.a.c.e> r2 = r0.f2458e
            r2.clear()
            r3 = 0
        L_0x0012:
            int r4 = r19.mo17278e()
            if (r3 >= r4) goto L_0x01a7
            c.p.b.a.g.b.e r4 = r1.mo17277d(r3)
            java.util.List r5 = r4.mo17403l0()
            int r6 = r4.mo17385H0()
            boolean r7 = r4 instanceof p040c.p175p.p184b.p185a.p192g.p194b.C2292a
            if (r7 == 0) goto L_0x0096
            r7 = r4
            c.p.b.a.g.b.a r7 = (p040c.p175p.p184b.p185a.p192g.p194b.C2292a) r7
            boolean r8 = r7.mo17365z0()
            if (r8 == 0) goto L_0x0096
            java.lang.String[] r6 = r7.mo17359B0()
            r8 = 0
        L_0x0036:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x0074
            int r9 = r7.mo17361m0()
            if (r8 >= r9) goto L_0x0074
            java.util.List<c.p.b.a.c.e> r9 = r0.f2458e
            c.p.b.a.c.e r15 = new c.p.b.a.c.e
            int r10 = r6.length
            int r10 = r8 % r10
            r11 = r6[r10]
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r4.mo17413x()
            float r13 = r4.mo17394S()
            float r14 = r4.mo17391N()
            android.graphics.DashPathEffect r16 = r4.mo17408s()
            java.lang.Object r10 = r5.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r17 = r10.intValue()
            r10 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.add(r2)
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0074:
            java.lang.String r2 = r7.mo17380A()
            if (r2 == 0) goto L_0x0093
            java.util.List<c.p.b.a.c.e> r2 = r0.f2458e
            c.p.b.a.c.e r12 = new c.p.b.a.c.e
            java.lang.String r6 = r4.mo17380A()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r8 = 2143289344(0x7fc00000, float:NaN)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 0
            r11 = 1122867(0x112233, float:1.573472E-39)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r12)
        L_0x0093:
            r2 = r1
            goto L_0x01a2
        L_0x0096:
            boolean r2 = r4 instanceof p040c.p175p.p184b.p185a.p192g.p194b.C2300i
            if (r2 == 0) goto L_0x00fe
            r2 = r4
            c.p.b.a.g.b.i r2 = (p040c.p175p.p184b.p185a.p192g.p194b.C2300i) r2
            r7 = 0
        L_0x009e:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x00dd
            if (r7 >= r6) goto L_0x00dd
            java.util.List<c.p.b.a.c.e> r8 = r0.f2458e
            c.p.b.a.c.e r15 = new c.p.b.a.c.e
            com.github.mikephil.charting.data.Entry r9 = r2.mo17392O(r7)
            com.github.mikephil.charting.data.PieEntry r9 = (com.github.mikephil.charting.data.PieEntry) r9
            java.lang.String r10 = r9.mo23883g()
            com.github.mikephil.charting.components.Legend$LegendForm r11 = r4.mo17413x()
            float r12 = r4.mo17394S()
            float r13 = r4.mo17391N()
            android.graphics.DashPathEffect r14 = r4.mo17408s()
            java.lang.Object r9 = r5.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r16 = r9.intValue()
            r9 = r15
            r1 = r15
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r1)
            int r7 = r7 + 1
            r1 = r19
            goto L_0x009e
        L_0x00dd:
            java.lang.String r1 = r2.mo17380A()
            if (r1 == 0) goto L_0x01a0
            java.util.List<c.p.b.a.c.e> r1 = r0.f2458e
            c.p.b.a.c.e r2 = new c.p.b.a.c.e
            java.lang.String r6 = r4.mo17380A()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r8 = 2143289344(0x7fc00000, float:NaN)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 0
            r11 = 1122867(0x112233, float:1.573472E-39)
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r2)
            goto L_0x01a0
        L_0x00fe:
            boolean r1 = r4 instanceof p040c.p175p.p184b.p185a.p192g.p194b.C2295d
            if (r1 == 0) goto L_0x0153
            r1 = r4
            c.p.b.a.g.b.d r1 = (p040c.p175p.p184b.p185a.p192g.p194b.C2295d) r1
            int r2 = r1.mo17374Q0()
            r7 = 1122867(0x112233, float:1.573472E-39)
            if (r2 == r7) goto L_0x0153
            int r14 = r1.mo17374Q0()
            int r1 = r1.mo17370C0()
            java.util.List<c.p.b.a.c.e> r2 = r0.f2458e
            c.p.b.a.c.e r5 = new c.p.b.a.c.e
            r9 = 0
            com.github.mikephil.charting.components.Legend$LegendForm r10 = r4.mo17413x()
            float r11 = r4.mo17394S()
            float r12 = r4.mo17391N()
            android.graphics.DashPathEffect r13 = r4.mo17408s()
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.add(r5)
            java.util.List<c.p.b.a.c.e> r2 = r0.f2458e
            c.p.b.a.c.e r12 = new c.p.b.a.c.e
            java.lang.String r6 = r4.mo17380A()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = r4.mo17413x()
            float r8 = r4.mo17394S()
            float r9 = r4.mo17391N()
            android.graphics.DashPathEffect r10 = r4.mo17408s()
            r5 = r12
            r11 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r12)
            goto L_0x01a0
        L_0x0153:
            r1 = 0
        L_0x0154:
            int r2 = r5.size()
            if (r1 >= r2) goto L_0x01a0
            if (r1 >= r6) goto L_0x01a0
            int r2 = r5.size()
            int r2 = r2 + -1
            if (r1 >= r2) goto L_0x016d
            int r2 = r6 + -1
            if (r1 >= r2) goto L_0x016d
            r2 = 0
            r9 = r2
            r2 = r19
            goto L_0x0178
        L_0x016d:
            r2 = r19
            c.p.b.a.g.b.e r7 = r2.mo17277d(r3)
            java.lang.String r7 = r7.mo17380A()
            r9 = r7
        L_0x0178:
            java.util.List<c.p.b.a.c.e> r7 = r0.f2458e
            c.p.b.a.c.e r15 = new c.p.b.a.c.e
            com.github.mikephil.charting.components.Legend$LegendForm r10 = r4.mo17413x()
            float r11 = r4.mo17394S()
            float r12 = r4.mo17391N()
            android.graphics.DashPathEffect r13 = r4.mo17408s()
            java.lang.Object r8 = r5.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r14 = r8.intValue()
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.add(r15)
            int r1 = r1 + 1
            goto L_0x0154
        L_0x01a0:
            r2 = r19
        L_0x01a2:
            int r3 = r3 + 1
            r1 = r2
            goto L_0x0012
        L_0x01a7:
            com.github.mikephil.charting.components.Legend r1 = r0.f2457d
            c.p.b.a.c.e[] r1 = r1.mo23821m()
            if (r1 == 0) goto L_0x01ba
            java.util.List<c.p.b.a.c.e> r1 = r0.f2458e
            com.github.mikephil.charting.components.Legend r2 = r0.f2457d
            c.p.b.a.c.e[] r2 = r2.mo23821m()
            java.util.Collections.addAll(r1, r2)
        L_0x01ba:
            com.github.mikephil.charting.components.Legend r1 = r0.f2457d
            java.util.List<c.p.b.a.c.e> r2 = r0.f2458e
            r1.mo23814D(r2)
        L_0x01c1:
            com.github.mikephil.charting.components.Legend r1 = r0.f2457d
            android.graphics.Typeface r1 = r1.mo17259c()
            if (r1 == 0) goto L_0x01ce
            android.graphics.Paint r2 = r0.f2455b
            r2.setTypeface(r1)
        L_0x01ce:
            android.graphics.Paint r1 = r0.f2455b
            com.github.mikephil.charting.components.Legend r2 = r0.f2457d
            float r2 = r2.mo17258b()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.f2455b
            com.github.mikephil.charting.components.Legend r2 = r0.f2457d
            int r2 = r2.mo17257a()
            r1.setColor(r2)
            com.github.mikephil.charting.components.Legend r1 = r0.f2457d
            android.graphics.Paint r2 = r0.f2455b
            c.p.b.a.k.j r3 = r0.f2503a
            r1.mo23815g(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2320i.mo17515a(c.p.b.a.d.f):void");
    }

    /* renamed from: b */
    public void mo17516b(Canvas canvas, float f, float f2, C2258e eVar, Legend legend) {
        int i = eVar.f2359f;
        if (i != 1122868 && i != 1122867 && i != 0) {
            int save = canvas.save();
            Legend.LegendForm legendForm = eVar.f2355b;
            if (legendForm == Legend.LegendForm.DEFAULT) {
                legendForm = legend.mo23822n();
            }
            this.f2456c.setColor(eVar.f2359f);
            float e = C2347i.m3958e(Float.isNaN(eVar.f2356c) ? legend.mo23825q() : eVar.f2356c);
            float f3 = e / 2.0f;
            int i2 = C2321a.f2464d[legendForm.ordinal()];
            if (i2 == 3 || i2 == 4) {
                this.f2456c.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f + f3, f2, f3, this.f2456c);
            } else if (i2 == 5) {
                this.f2456c.setStyle(Paint.Style.FILL);
                canvas.drawRect(f, f2 - f3, f + e, f2 + f3, this.f2456c);
            } else if (i2 == 6) {
                float e2 = C2347i.m3958e(Float.isNaN(eVar.f2357d) ? legend.mo23824p() : eVar.f2357d);
                DashPathEffect dashPathEffect = eVar.f2358e;
                if (dashPathEffect == null) {
                    dashPathEffect = legend.mo23823o();
                }
                this.f2456c.setStyle(Paint.Style.STROKE);
                this.f2456c.setStrokeWidth(e2);
                this.f2456c.setPathEffect(dashPathEffect);
                this.f2460g.reset();
                this.f2460g.moveTo(f, f2);
                this.f2460g.lineTo(f + e, f2);
                canvas.drawPath(this.f2460g, this.f2456c);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: c */
    public void mo17517c(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.f2455b);
    }

    /* renamed from: d */
    public Paint mo17518d() {
        return this.f2455b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0160  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17519e(android.graphics.Canvas r35) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            boolean r0 = r0.mo17262f()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            android.graphics.Typeface r0 = r0.mo17259c()
            if (r0 == 0) goto L_0x001a
            android.graphics.Paint r1 = r6.f2455b
            r1.setTypeface(r0)
        L_0x001a:
            android.graphics.Paint r0 = r6.f2455b
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            float r1 = r1.mo17258b()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f2455b
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            int r1 = r1.mo17257a()
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f2455b
            android.graphics.Paint$FontMetrics r1 = r6.f2459f
            float r8 = p040c.p175p.p184b.p185a.p199k.C2347i.m3964k(r0, r1)
            android.graphics.Paint r0 = r6.f2455b
            android.graphics.Paint$FontMetrics r1 = r6.f2459f
            float r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3966m(r0, r1)
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            float r1 = r1.mo23811A()
            float r1 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r1)
            float r9 = r0 + r1
            android.graphics.Paint r0 = r6.f2455b
            java.lang.String r1 = "ABC"
            int r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3954a(r0, r1)
            float r0 = (float) r0
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r10
            float r11 = r8 - r0
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            c.p.b.a.c.e[] r12 = r0.mo23820l()
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            float r0 = r0.mo23826r()
            float r13 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            float r0 = r0.mo23834z()
            float r14 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            com.github.mikephil.charting.components.Legend$LegendOrientation r0 = r0.mo23831w()
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r15 = r1.mo23827s()
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = r1.mo23833y()
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            com.github.mikephil.charting.components.Legend$LegendDirection r5 = r2.mo23819k()
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            float r2 = r2.mo23825q()
            float r16 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r2)
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            float r2 = r2.mo23832x()
            float r4 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r2)
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            float r2 = r2.mo17261e()
            com.github.mikephil.charting.components.Legend r3 = r6.f2457d
            float r3 = r3.mo17260d()
            int[] r17 = p040c.p175p.p184b.p185a.p197j.C2320i.C2321a.f2461a
            int r18 = r15.ordinal()
            r10 = r17[r18]
            r17 = r4
            r4 = 2
            r20 = 0
            r21 = r14
            r14 = 1
            if (r10 == r14) goto L_0x013b
            if (r10 == r4) goto L_0x011b
            r4 = 3
            if (r10 == r4) goto L_0x00ca
            r26 = r8
            r14 = r9
            r7 = r20
            goto L_0x0155
        L_0x00ca:
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x00d8
            c.p.b.a.k.j r4 = r6.f2503a
            float r4 = r4.mo17635m()
            r10 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r10
            goto L_0x00e8
        L_0x00d8:
            r10 = 1073741824(0x40000000, float:2.0)
            c.p.b.a.k.j r4 = r6.f2503a
            float r4 = r4.mo17630h()
            c.p.b.a.k.j r14 = r6.f2503a
            float r14 = r14.mo17633k()
            float r14 = r14 / r10
            float r4 = r4 + r14
        L_0x00e8:
            com.github.mikephil.charting.components.Legend$LegendDirection r10 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r10) goto L_0x00ee
            r10 = r3
            goto L_0x00ef
        L_0x00ee:
            float r10 = -r3
        L_0x00ef:
            float r4 = r4 + r10
            com.github.mikephil.charting.components.Legend$LegendOrientation r10 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r10) goto L_0x0117
            r14 = r9
            double r9 = (double) r4
            com.github.mikephil.charting.components.Legend$LegendDirection r4 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            r24 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r5 != r4) goto L_0x0109
            com.github.mikephil.charting.components.Legend r4 = r6.f2457d
            float r4 = r4.f7491x
            float r4 = -r4
            r26 = r8
            double r7 = (double) r4
            double r7 = r7 / r24
            double r3 = (double) r3
            double r7 = r7 + r3
            goto L_0x0114
        L_0x0109:
            r26 = r8
            com.github.mikephil.charting.components.Legend r4 = r6.f2457d
            float r4 = r4.f7491x
            double r7 = (double) r4
            double r7 = r7 / r24
            double r3 = (double) r3
            double r7 = r7 - r3
        L_0x0114:
            double r9 = r9 + r7
            float r4 = (float) r9
            goto L_0x0139
        L_0x0117:
            r26 = r8
            r14 = r9
            goto L_0x0139
        L_0x011b:
            r26 = r8
            r14 = r9
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x0129
            c.p.b.a.k.j r4 = r6.f2503a
            float r4 = r4.mo17635m()
            goto L_0x012f
        L_0x0129:
            c.p.b.a.k.j r4 = r6.f2503a
            float r4 = r4.mo17631i()
        L_0x012f:
            float r4 = r4 - r3
            com.github.mikephil.charting.components.Legend$LegendDirection r3 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r3) goto L_0x0139
            com.github.mikephil.charting.components.Legend r3 = r6.f2457d
            float r3 = r3.f7491x
            float r4 = r4 - r3
        L_0x0139:
            r7 = r4
            goto L_0x0155
        L_0x013b:
            r26 = r8
            r14 = r9
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x0143
            goto L_0x014a
        L_0x0143:
            c.p.b.a.k.j r4 = r6.f2503a
            float r4 = r4.mo17630h()
            float r3 = r3 + r4
        L_0x014a:
            com.github.mikephil.charting.components.Legend$LegendDirection r4 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r5 != r4) goto L_0x0154
            com.github.mikephil.charting.components.Legend r4 = r6.f2457d
            float r4 = r4.f7491x
            float r4 = r4 + r3
            goto L_0x0139
        L_0x0154:
            r7 = r3
        L_0x0155:
            int[] r3 = p040c.p175p.p184b.p185a.p197j.C2320i.C2321a.f2463c
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L_0x0267
            r4 = 2
            if (r0 == r4) goto L_0x0165
            goto L_0x03cc
        L_0x0165:
            int[] r0 = p040c.p175p.p184b.p185a.p197j.C2320i.C2321a.f2462b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L_0x01a4
            if (r0 == r4) goto L_0x018c
            r1 = 3
            if (r0 == r1) goto L_0x0177
            r0 = r20
            goto L_0x01b2
        L_0x0177:
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17634l()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            float r3 = r2.f7492y
            float r3 = r3 / r1
            float r0 = r0 - r3
            float r1 = r2.mo17261e()
            float r0 = r0 + r1
            goto L_0x01b2
        L_0x018c:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r0) goto L_0x0197
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17634l()
            goto L_0x019d
        L_0x0197:
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17628f()
        L_0x019d:
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            float r1 = r1.f7492y
            float r1 = r1 + r2
            float r0 = r0 - r1
            goto L_0x01b2
        L_0x01a4:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r0) goto L_0x01ab
            r0 = r20
            goto L_0x01b1
        L_0x01ab:
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17632j()
        L_0x01b1:
            float r0 = r0 + r2
        L_0x01b2:
            r9 = r0
            r18 = r20
            r10 = 0
            r15 = 0
        L_0x01b7:
            int r0 = r12.length
            if (r15 >= r0) goto L_0x03cc
            r4 = r12[r15]
            com.github.mikephil.charting.components.Legend$LegendForm r0 = r4.f2355b
            com.github.mikephil.charting.components.Legend$LegendForm r1 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r0 == r1) goto L_0x01c5
            r19 = 1
            goto L_0x01c7
        L_0x01c5:
            r19 = 0
        L_0x01c7:
            float r0 = r4.f2356c
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x01d2
            r21 = r16
            goto L_0x01da
        L_0x01d2:
            float r0 = r4.f2356c
            float r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            r21 = r0
        L_0x01da:
            if (r19 == 0) goto L_0x020a
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r0) goto L_0x01e3
            float r0 = r7 + r18
            goto L_0x01e7
        L_0x01e3:
            float r0 = r21 - r18
            float r0 = r7 - r0
        L_0x01e7:
            r22 = r0
            float r3 = r9 + r11
            com.github.mikephil.charting.components.Legend r2 = r6.f2457d
            r0 = r34
            r1 = r35
            r24 = r2
            r2 = r22
            r8 = r17
            r17 = r4
            r27 = r11
            r11 = r5
            r5 = r24
            r0.mo17516b(r1, r2, r3, r4, r5)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x0207
            float r22 = r22 + r21
        L_0x0207:
            r0 = r17
            goto L_0x0212
        L_0x020a:
            r27 = r11
            r8 = r17
            r11 = r5
            r0 = r4
            r22 = r7
        L_0x0212:
            java.lang.String r1 = r0.f2354a
            if (r1 == 0) goto L_0x0257
            if (r19 == 0) goto L_0x0224
            if (r10 != 0) goto L_0x0224
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r1) goto L_0x0220
            r1 = r13
            goto L_0x0221
        L_0x0220:
            float r1 = -r13
        L_0x0221:
            float r22 = r22 + r1
            goto L_0x0228
        L_0x0224:
            if (r10 == 0) goto L_0x0228
            r22 = r7
        L_0x0228:
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r1) goto L_0x0237
            android.graphics.Paint r1 = r6.f2455b
            java.lang.String r2 = r0.f2354a
            int r1 = p040c.p175p.p184b.p185a.p199k.C2347i.m3957d(r1, r2)
            float r1 = (float) r1
            float r22 = r22 - r1
        L_0x0237:
            r1 = r22
            if (r10 != 0) goto L_0x0245
            float r2 = r9 + r26
            java.lang.String r0 = r0.f2354a
            r5 = r35
            r6.mo17517c(r5, r1, r2, r0)
            goto L_0x0251
        L_0x0245:
            r5 = r35
            float r2 = r26 + r14
            float r9 = r9 + r2
            float r2 = r9 + r26
            java.lang.String r0 = r0.f2354a
            r6.mo17517c(r5, r1, r2, r0)
        L_0x0251:
            float r0 = r26 + r14
            float r9 = r9 + r0
            r18 = r20
            goto L_0x025e
        L_0x0257:
            r5 = r35
            float r21 = r21 + r8
            float r18 = r18 + r21
            r10 = 1
        L_0x025e:
            int r15 = r15 + 1
            r17 = r8
            r5 = r11
            r11 = r27
            goto L_0x01b7
        L_0x0267:
            r27 = r11
            r8 = r17
            r11 = r5
            r5 = r35
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            java.util.List r9 = r0.mo23818j()
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            java.util.List r10 = r0.mo23817i()
            com.github.mikephil.charting.components.Legend r0 = r6.f2457d
            java.util.List r4 = r0.mo23816h()
            int[] r0 = p040c.p175p.p184b.p185a.p197j.C2320i.C2321a.f2462b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r3 = 1
            if (r0 == r3) goto L_0x02b1
            r1 = 2
            if (r0 == r1) goto L_0x02a4
            r1 = 3
            if (r0 == r1) goto L_0x0294
            r2 = r20
            goto L_0x02b1
        L_0x0294:
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17634l()
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            float r1 = r1.f7492y
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r2 + r0
            goto L_0x02b1
        L_0x02a4:
            c.p.b.a.k.j r0 = r6.f2503a
            float r0 = r0.mo17634l()
            float r0 = r0 - r2
            com.github.mikephil.charting.components.Legend r1 = r6.f2457d
            float r1 = r1.f7492y
            float r2 = r0 - r1
        L_0x02b1:
            int r1 = r12.length
            r17 = r7
            r0 = 0
            r3 = 0
        L_0x02b6:
            if (r0 >= r1) goto L_0x03cc
            r18 = r8
            r8 = r12[r0]
            r20 = r1
            com.github.mikephil.charting.components.Legend$LegendForm r1 = r8.f2355b
            com.github.mikephil.charting.components.Legend$LegendForm r5 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r1 == r5) goto L_0x02c7
            r22 = 1
            goto L_0x02c9
        L_0x02c7:
            r22 = 0
        L_0x02c9:
            float r1 = r8.f2356c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02d4
            r24 = r16
            goto L_0x02dc
        L_0x02d4:
            float r1 = r8.f2356c
            float r1 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r1)
            r24 = r1
        L_0x02dc:
            int r1 = r4.size()
            if (r0 >= r1) goto L_0x02f5
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02f5
            float r1 = r26 + r14
            float r2 = r2 + r1
            r17 = r2
            r1 = r7
            goto L_0x02f9
        L_0x02f5:
            r1 = r17
            r17 = r2
        L_0x02f9:
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0325
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r2) goto L_0x0325
            int r2 = r9.size()
            if (r3 >= r2) goto L_0x0325
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x0314
            java.lang.Object r2 = r9.get(r3)
            c.p.b.a.k.b r2 = (p040c.p175p.p184b.p185a.p199k.C2339b) r2
            float r2 = r2.f2532c
            goto L_0x031d
        L_0x0314:
            java.lang.Object r2 = r9.get(r3)
            c.p.b.a.k.b r2 = (p040c.p175p.p184b.p185a.p199k.C2339b) r2
            float r2 = r2.f2532c
            float r2 = -r2
        L_0x031d:
            r19 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r19
            float r1 = r1 + r2
            int r3 = r3 + 1
            goto L_0x0327
        L_0x0325:
            r19 = 1073741824(0x40000000, float:2.0)
        L_0x0327:
            r28 = r3
            java.lang.String r2 = r8.f2354a
            if (r2 != 0) goto L_0x0330
            r29 = 1
            goto L_0x0332
        L_0x0330:
            r29 = 0
        L_0x0332:
            if (r22 == 0) goto L_0x0360
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x033a
            float r1 = r1 - r24
        L_0x033a:
            r30 = r1
            float r3 = r17 + r27
            com.github.mikephil.charting.components.Legend r5 = r6.f2457d
            r2 = r0
            r0 = r34
            r1 = r35
            r31 = r7
            r7 = r2
            r2 = r30
            r23 = 1
            r32 = r4
            r4 = r8
            r33 = r9
            r9 = r35
            r0.mo17516b(r1, r2, r3, r4, r5)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x035d
            float r1 = r30 + r24
            goto L_0x036b
        L_0x035d:
            r1 = r30
            goto L_0x036b
        L_0x0360:
            r32 = r4
            r31 = r7
            r33 = r9
            r23 = 1
            r9 = r35
            r7 = r0
        L_0x036b:
            if (r29 != 0) goto L_0x03a7
            if (r22 == 0) goto L_0x0377
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x0375
            float r0 = -r13
            goto L_0x0376
        L_0x0375:
            r0 = r13
        L_0x0376:
            float r1 = r1 + r0
        L_0x0377:
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x0384
            java.lang.Object r0 = r10.get(r7)
            c.p.b.a.k.b r0 = (p040c.p175p.p184b.p185a.p199k.C2339b) r0
            float r0 = r0.f2532c
            float r1 = r1 - r0
        L_0x0384:
            float r0 = r17 + r26
            java.lang.String r2 = r8.f2354a
            r6.mo17517c(r9, r1, r0, r2)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x0398
            java.lang.Object r0 = r10.get(r7)
            c.p.b.a.k.b r0 = (p040c.p175p.p184b.p185a.p199k.C2339b) r0
            float r0 = r0.f2532c
            float r1 = r1 + r0
        L_0x0398:
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x03a0
            r0 = r21
            float r2 = -r0
            goto L_0x03a3
        L_0x03a0:
            r0 = r21
            r2 = r0
        L_0x03a3:
            float r1 = r1 + r2
            r2 = r18
            goto L_0x03b5
        L_0x03a7:
            r0 = r21
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x03b1
            r2 = r18
            float r4 = -r2
            goto L_0x03b4
        L_0x03b1:
            r2 = r18
            r4 = r2
        L_0x03b4:
            float r1 = r1 + r4
        L_0x03b5:
            int r3 = r7 + 1
            r21 = r0
            r8 = r2
            r0 = r3
            r5 = r9
            r2 = r17
            r3 = r28
            r7 = r31
            r4 = r32
            r9 = r33
            r17 = r1
            r1 = r20
            goto L_0x02b6
        L_0x03cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2320i.mo17519e(android.graphics.Canvas):void");
    }
}

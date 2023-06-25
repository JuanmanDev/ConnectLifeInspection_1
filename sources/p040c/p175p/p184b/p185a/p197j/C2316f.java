package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2265g;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.f */
/* compiled from: CombinedChartRenderer */
public class C2316f extends C2318g {

    /* renamed from: f */
    public List<C2318g> f2446f = new ArrayList(5);

    /* renamed from: g */
    public WeakReference<Chart> f2447g;

    /* renamed from: h */
    public List<C2277d> f2448h = new ArrayList();

    /* renamed from: c.p.b.a.j.f$a */
    /* compiled from: CombinedChartRenderer */
    public static /* synthetic */ class C2317a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2449a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2449a = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2449a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2449a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2449a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2449a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2316f.C2317a.<clinit>():void");
        }
    }

    public C2316f(CombinedChart combinedChart, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2447g = new WeakReference<>(combinedChart);
        mo17512h();
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        for (C2318g b : this.f2446f) {
            b.mo17495b(canvas);
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
        for (C2318g c : this.f2446f) {
            c.mo17496c(canvas);
        }
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        int i;
        Chart chart = (Chart) this.f2447g.get();
        if (chart != null) {
            for (C2318g next : this.f2446f) {
                Object obj = null;
                if (next instanceof C2311b) {
                    obj = ((C2311b) next).f2425g.getBarData();
                } else if (next instanceof C2322j) {
                    obj = ((C2322j) next).f2465h.getLineData();
                } else if (next instanceof C2315e) {
                    obj = ((C2315e) next).f2440h.getCandleData();
                } else if (next instanceof C2330p) {
                    obj = ((C2330p) next).f2504h.getScatterData();
                } else if (next instanceof C2314d) {
                    obj = ((C2314d) next).f2436g.getBubbleData();
                }
                if (obj == null) {
                    i = -1;
                } else {
                    i = ((C2265g) chart.getData()).mo17291r().indexOf(obj);
                }
                this.f2448h.clear();
                for (C2277d dVar : dVarArr) {
                    if (dVar.mo17328c() == i || dVar.mo17328c() == -1) {
                        this.f2448h.add(dVar);
                    }
                }
                List<C2277d> list = this.f2448h;
                next.mo17497d(canvas, (C2277d[]) list.toArray(new C2277d[list.size()]));
            }
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        for (C2318g e : this.f2446f) {
            e.mo17498e(canvas);
        }
    }

    /* renamed from: f */
    public void mo17499f() {
        for (C2318g f : this.f2446f) {
            f.mo17499f();
        }
    }

    /* renamed from: h */
    public void mo17512h() {
        this.f2446f.clear();
        CombinedChart combinedChart = (CombinedChart) this.f2447g.get();
        if (combinedChart != null) {
            for (CombinedChart.DrawOrder ordinal : combinedChart.getDrawOrder()) {
                int i = C2317a.f2449a[ordinal.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && combinedChart.getScatterData() != null) {
                                    this.f2446f.add(new C2330p(combinedChart, this.f2450b, this.f2503a));
                                }
                            } else if (combinedChart.getCandleData() != null) {
                                this.f2446f.add(new C2315e(combinedChart, this.f2450b, this.f2503a));
                            }
                        } else if (combinedChart.getLineData() != null) {
                            this.f2446f.add(new C2322j(combinedChart, this.f2450b, this.f2503a));
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        this.f2446f.add(new C2314d(combinedChart, this.f2450b, this.f2503a));
                    }
                } else if (combinedChart.getBarData() != null) {
                    this.f2446f.add(new C2311b(combinedChart, this.f2450b, this.f2503a));
                }
            }
        }
    }
}

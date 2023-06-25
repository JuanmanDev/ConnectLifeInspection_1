package p040c.p175p.p184b.p185a.p195h;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;

/* renamed from: c.p.b.a.h.e */
/* compiled from: PieRadarChartTouchListener */
public class C2307e extends ChartTouchListener<PieRadarChartBase<?>> {

    /* renamed from: p */
    public C2342e f2412p = C2342e.m3925c(0.0f, 0.0f);

    /* renamed from: q */
    public float f2413q = 0.0f;

    /* renamed from: r */
    public ArrayList<C2308a> f2414r = new ArrayList<>();

    /* renamed from: s */
    public long f2415s = 0;

    /* renamed from: t */
    public float f2416t = 0.0f;

    /* renamed from: c.p.b.a.h.e$a */
    /* compiled from: PieRadarChartTouchListener */
    public class C2308a {

        /* renamed from: a */
        public long f2417a;

        /* renamed from: b */
        public float f2418b;

        public C2308a(C2307e eVar, long j, float f) {
            this.f2417a = j;
            this.f2418b = f;
        }
    }

    public C2307e(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
    }

    /* renamed from: f */
    public final float mo17479f() {
        if (this.f2414r.isEmpty()) {
            return 0.0f;
        }
        boolean z = false;
        C2308a aVar = this.f2414r.get(0);
        ArrayList<C2308a> arrayList = this.f2414r;
        C2308a aVar2 = arrayList.get(arrayList.size() - 1);
        C2308a aVar3 = aVar;
        for (int size = this.f2414r.size() - 1; size >= 0; size--) {
            aVar3 = this.f2414r.get(size);
            if (aVar3.f2418b != aVar2.f2418b) {
                break;
            }
        }
        float f = ((float) (aVar2.f2417a - aVar.f2417a)) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        if (aVar2.f2418b >= aVar3.f2418b) {
            z = true;
        }
        if (((double) Math.abs(aVar2.f2418b - aVar3.f2418b)) > 270.0d) {
            z = !z;
        }
        float f2 = aVar2.f2418b;
        float f3 = aVar.f2418b;
        if (((double) (f2 - f3)) > 180.0d) {
            aVar.f2418b = (float) (((double) f3) + 360.0d);
        } else if (((double) (f3 - f2)) > 180.0d) {
            aVar2.f2418b = (float) (((double) f2) + 360.0d);
        }
        float abs = Math.abs((aVar2.f2418b - aVar.f2418b) / f);
        return !z ? -abs : abs;
    }

    /* renamed from: g */
    public void mo17480g() {
        if (this.f2416t != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2416t *= ((PieRadarChartBase) this.f7540o).getDragDecelerationFrictionCoef();
            T t = this.f7540o;
            ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getRotationAngle() + (this.f2416t * (((float) (currentAnimationTimeMillis - this.f2415s)) / 1000.0f)));
            this.f2415s = currentAnimationTimeMillis;
            if (((double) Math.abs(this.f2416t)) >= 0.001d) {
                C2347i.m3976w(this.f7540o);
            } else {
                mo17484k();
            }
        }
    }

    /* renamed from: h */
    public final void mo17481h() {
        this.f2414r.clear();
    }

    /* renamed from: i */
    public final void mo17482i(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f2414r.add(new C2308a(this, currentAnimationTimeMillis, ((PieRadarChartBase) this.f7540o).mo23792y(f, f2)));
        for (int size = this.f2414r.size(); size - 2 > 0 && currentAnimationTimeMillis - this.f2414r.get(0).f2417a > 1000; size--) {
            this.f2414r.remove(0);
        }
    }

    /* renamed from: j */
    public void mo17483j(float f, float f2) {
        this.f2413q = ((PieRadarChartBase) this.f7540o).mo23792y(f, f2) - ((PieRadarChartBase) this.f7540o).getRawRotationAngle();
    }

    /* renamed from: k */
    public void mo17484k() {
        this.f2416t = 0.0f;
    }

    /* renamed from: l */
    public void mo17485l(float f, float f2) {
        T t = this.f7540o;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).mo23792y(f, f2) - this.f2413q);
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.f7536e = ChartTouchListener.ChartGesture.LONG_PRESS;
        C2304b onChartGestureListener = ((PieRadarChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17473e(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f7536e = ChartTouchListener.ChartGesture.SINGLE_TAP;
        C2304b onChartGestureListener = ((PieRadarChartBase) this.f7540o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.mo17472d(motionEvent);
        }
        if (!((PieRadarChartBase) this.f7540o).mo23692q()) {
            return false;
        }
        mo23885c(((PieRadarChartBase) this.f7540o).mo23579k(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f7539n.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.f7540o).mo23781C()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                mo23887e(motionEvent);
                mo17484k();
                mo17481h();
                if (((PieRadarChartBase) this.f7540o).mo23687o()) {
                    mo17482i(x, y);
                }
                mo17483j(x, y);
                C2342e eVar = this.f2412p;
                eVar.f2538c = x;
                eVar.f2539d = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.f7540o).mo23687o()) {
                    mo17484k();
                    mo17482i(x, y);
                    float f = mo17479f();
                    this.f2416t = f;
                    if (f != 0.0f) {
                        this.f2415s = AnimationUtils.currentAnimationTimeMillis();
                        C2347i.m3976w(this.f7540o);
                    }
                }
                ((PieRadarChartBase) this.f7540o).mo23684j();
                this.f7537l = 0;
                mo23884b(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.f7540o).mo23687o()) {
                    mo17482i(x, y);
                }
                if (this.f7537l == 0) {
                    C2342e eVar2 = this.f2412p;
                    if (ChartTouchListener.m10183a(x, eVar2.f2538c, y, eVar2.f2539d) > C2347i.m3958e(8.0f)) {
                        this.f7536e = ChartTouchListener.ChartGesture.ROTATE;
                        this.f7537l = 6;
                        ((PieRadarChartBase) this.f7540o).mo23651g();
                        mo23884b(motionEvent);
                    }
                }
                if (this.f7537l == 6) {
                    mo17485l(x, y);
                    ((PieRadarChartBase) this.f7540o).invalidate();
                }
                mo23884b(motionEvent);
            }
        }
        return true;
    }
}

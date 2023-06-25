package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import p040c.p175p.p184b.p185a.p188c.C2257d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p199k.C2342e;

public class MarkerView extends RelativeLayout implements C2257d {

    /* renamed from: e */
    public C2342e f7502e;

    /* renamed from: l */
    public C2342e f7503l;

    /* renamed from: m */
    public WeakReference<Chart> f7504m;

    private void setupLayoutResource(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    /* renamed from: a */
    public void mo17266a(Entry entry, C2277d dVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: b */
    public void mo17267b(Canvas canvas, float f, float f2) {
        C2342e c = mo23842c(f, f2);
        int save = canvas.save();
        canvas.translate(f + c.f2538c, f2 + c.f2539d);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: c */
    public C2342e mo23842c(float f, float f2) {
        C2342e offset = getOffset();
        C2342e eVar = this.f7503l;
        eVar.f2538c = offset.f2538c;
        eVar.f2539d = offset.f2539d;
        Chart chartView = getChartView();
        float width = (float) getWidth();
        float height = (float) getHeight();
        C2342e eVar2 = this.f7503l;
        float f3 = eVar2.f2538c;
        if (f + f3 < 0.0f) {
            eVar2.f2538c = -f;
        } else if (chartView != null && f + width + f3 > ((float) chartView.getWidth())) {
            this.f7503l.f2538c = (((float) chartView.getWidth()) - f) - width;
        }
        C2342e eVar3 = this.f7503l;
        float f4 = eVar3.f2539d;
        if (f2 + f4 < 0.0f) {
            eVar3.f2539d = -f2;
        } else if (chartView != null && f2 + height + f4 > ((float) chartView.getHeight())) {
            this.f7503l.f2539d = (((float) chartView.getHeight()) - f2) - height;
        }
        return this.f7503l;
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.f7504m;
        if (weakReference == null) {
            return null;
        }
        return (Chart) weakReference.get();
    }

    public C2342e getOffset() {
        return this.f7502e;
    }

    public void setChartView(Chart chart) {
        this.f7504m = new WeakReference<>(chart);
    }

    public void setOffset(C2342e eVar) {
        this.f7502e = eVar;
        if (eVar == null) {
            this.f7502e = new C2342e();
        }
    }
}

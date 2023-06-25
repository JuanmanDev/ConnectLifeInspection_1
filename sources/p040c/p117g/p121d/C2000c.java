package p040c.p117g.p121d;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: c.g.d.c */
/* compiled from: SmoothScrollTimerTask */
public final class C2000c extends TimerTask {

    /* renamed from: e */
    public int f1683e = Integer.MAX_VALUE;

    /* renamed from: l */
    public int f1684l = 0;

    /* renamed from: m */
    public int f1685m;

    /* renamed from: n */
    public final WheelView f1686n;

    public C2000c(WheelView wheelView, int i) {
        this.f1686n = wheelView;
        this.f1685m = i;
    }

    public final void run() {
        if (this.f1683e == Integer.MAX_VALUE) {
            this.f1683e = this.f1685m;
        }
        int i = this.f1683e;
        int i2 = (int) (((float) i) * 0.1f);
        this.f1684l = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f1684l = -1;
            } else {
                this.f1684l = 1;
            }
        }
        if (Math.abs(this.f1683e) <= 1) {
            this.f1686n.mo22341b();
            this.f1686n.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
            return;
        }
        WheelView wheelView = this.f1686n;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f1684l));
        if (!this.f1686n.mo22355i()) {
            float itemHeight = this.f1686n.getItemHeight();
            float f = ((float) (-this.f1686n.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f1686n.getItemsCount() - 1) - this.f1686n.getInitPosition())) * itemHeight;
            if (this.f1686n.getTotalScrollY() <= f || this.f1686n.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f1686n;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - ((float) this.f1684l));
                this.f1686n.mo22341b();
                this.f1686n.getHandler().sendEmptyMessage(PathInterpolatorCompat.MAX_NUM_POINTS);
                return;
            }
        }
        this.f1686n.getHandler().sendEmptyMessage(1000);
        this.f1683e -= this.f1684l;
    }
}

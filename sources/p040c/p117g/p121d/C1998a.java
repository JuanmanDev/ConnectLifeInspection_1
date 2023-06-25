package p040c.p117g.p121d;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* renamed from: c.g.d.a */
/* compiled from: InertiaTimerTask */
public final class C1998a extends TimerTask {

    /* renamed from: e */
    public float f1679e = 2.14748365E9f;

    /* renamed from: l */
    public final float f1680l;

    /* renamed from: m */
    public final WheelView f1681m;

    public C1998a(WheelView wheelView, float f) {
        this.f1681m = wheelView;
        this.f1680l = f;
    }

    public final void run() {
        if (this.f1679e == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f1680l) > 2000.0f) {
                if (this.f1680l <= 0.0f) {
                    f = -2000.0f;
                }
                this.f1679e = f;
            } else {
                this.f1679e = this.f1680l;
            }
        }
        if (Math.abs(this.f1679e) < 0.0f || Math.abs(this.f1679e) > 20.0f) {
            WheelView wheelView = this.f1681m;
            float f2 = (float) ((int) (this.f1679e / 100.0f));
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            if (!this.f1681m.mo22355i()) {
                float itemHeight = this.f1681m.getItemHeight();
                float f3 = ((float) (-this.f1681m.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f1681m.getItemsCount() - 1) - this.f1681m.getInitPosition())) * itemHeight;
                double d = ((double) itemHeight) * 0.25d;
                if (((double) this.f1681m.getTotalScrollY()) - d < ((double) f3)) {
                    f3 = this.f1681m.getTotalScrollY() + f2;
                } else if (((double) this.f1681m.getTotalScrollY()) + d > ((double) itemsCount)) {
                    itemsCount = this.f1681m.getTotalScrollY() + f2;
                }
                if (this.f1681m.getTotalScrollY() <= f3) {
                    this.f1679e = 40.0f;
                    this.f1681m.setTotalScrollY((float) ((int) f3));
                } else if (this.f1681m.getTotalScrollY() >= itemsCount) {
                    this.f1681m.setTotalScrollY((float) ((int) itemsCount));
                    this.f1679e = -40.0f;
                }
            }
            float f4 = this.f1679e;
            if (f4 < 0.0f) {
                this.f1679e = f4 + 20.0f;
            } else {
                this.f1679e = f4 - 20.0f;
            }
            this.f1681m.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f1681m.mo22341b();
        this.f1681m.getHandler().sendEmptyMessage(2000);
    }
}

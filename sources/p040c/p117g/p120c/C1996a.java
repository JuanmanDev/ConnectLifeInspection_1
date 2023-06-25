package p040c.p117g.p120c;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.contrarywind.view.WheelView;

/* renamed from: c.g.c.a */
/* compiled from: LoopViewGestureListener */
public final class C1996a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: e */
    public final WheelView f1678e;

    public C1996a(WheelView wheelView) {
        this.f1678e = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f1678e.mo22366q(f2);
        return true;
    }
}

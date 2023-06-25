package p040c.p117g.p121d;

import android.os.Handler;
import android.os.Message;
import com.contrarywind.view.WheelView;

/* renamed from: c.g.d.b */
/* compiled from: MessageHandler */
public final class C1999b extends Handler {

    /* renamed from: a */
    public final WheelView f1682a;

    public C1999b(WheelView wheelView) {
        this.f1682a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f1682a.invalidate();
        } else if (i == 2000) {
            this.f1682a.mo22367r(WheelView.ACTION.FLING);
        } else if (i == 3000) {
            this.f1682a.mo22360n();
        }
    }
}

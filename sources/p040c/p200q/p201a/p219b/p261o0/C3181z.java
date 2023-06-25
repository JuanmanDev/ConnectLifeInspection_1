package p040c.p200q.p201a.p219b.p261o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.q.a.b.o0.z */
/* compiled from: SystemHandlerWrapper */
public final class C3181z implements C3162l {

    /* renamed from: a */
    public final Handler f5901a;

    public C3181z(Handler handler) {
        this.f5901a = handler;
    }

    /* renamed from: a */
    public Message mo19967a(int i, int i2, int i3) {
        return this.f5901a.obtainMessage(i, i2, i3);
    }

    /* renamed from: b */
    public boolean mo19968b(int i) {
        return this.f5901a.sendEmptyMessage(i);
    }

    /* renamed from: c */
    public Message mo19969c(int i, int i2, int i3, Object obj) {
        return this.f5901a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: d */
    public boolean mo19970d(int i, long j) {
        return this.f5901a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: e */
    public void mo19971e(int i) {
        this.f5901a.removeMessages(i);
    }

    /* renamed from: f */
    public Message mo19972f(int i, Object obj) {
        return this.f5901a.obtainMessage(i, obj);
    }

    /* renamed from: g */
    public Looper mo19973g() {
        return this.f5901a.getLooper();
    }
}

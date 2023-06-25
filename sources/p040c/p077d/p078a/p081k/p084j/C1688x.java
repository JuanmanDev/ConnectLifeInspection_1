package p040c.p077d.p078a.p081k.p084j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.d.a.k.j.x */
/* compiled from: ResourceRecycler */
public class C1688x {

    /* renamed from: a */
    public boolean f1212a;

    /* renamed from: b */
    public final Handler f1213b = new Handler(Looper.getMainLooper(), new C1689a());

    /* renamed from: c.d.a.k.j.x$a */
    /* compiled from: ResourceRecycler */
    public static final class C1689a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1685u) message.obj).mo15867c();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo15890a(C1685u<?> uVar) {
        if (this.f1212a) {
            this.f1213b.obtainMessage(1, uVar).sendToTarget();
        } else {
            this.f1212a = true;
            uVar.mo15867c();
            this.f1212a = false;
        }
    }
}

package p040c.p041a.p042a.p043a.p046c;

import java.util.concurrent.CountDownLatch;

/* renamed from: c.a.a.a.c.a */
/* compiled from: CancelableCountDownLatch */
public class C1343a extends CountDownLatch {
    public C1343a(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo15027a() {
        while (getCount() > 0) {
            countDown();
        }
    }
}

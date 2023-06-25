package androidx.test.espresso;

import android.view.Choreographer;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class Espresso$$Lambda$1 implements Choreographer.FrameCallback {
    public final CountDownLatch arg$1;

    public Espresso$$Lambda$1(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    public void doFrame(long j) {
        this.arg$1.countDown();
    }
}

package androidx.test.espresso;

import android.view.Choreographer;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class Espresso$$Lambda$0 implements Runnable {
    public final CountDownLatch arg$1;

    public Espresso$$Lambda$0(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    public void run() {
        Choreographer.getInstance().postFrameCallback(new Espresso$$Lambda$1(this.arg$1));
    }
}

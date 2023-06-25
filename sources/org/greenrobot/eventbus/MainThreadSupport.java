package org.greenrobot.eventbus;

import android.os.Looper;

public interface MainThreadSupport {

    public static class AndroidHandlerMainThreadSupport implements MainThreadSupport {
        public final Looper looper;

        public AndroidHandlerMainThreadSupport(Looper looper2) {
            this.looper = looper2;
        }

        public Poster createPoster(EventBus eventBus) {
            return new HandlerPoster(eventBus, this.looper, 10);
        }

        public boolean isMainThread() {
            return this.looper == Looper.myLooper();
        }
    }

    Poster createPoster(EventBus eventBus);

    boolean isMainThread();
}

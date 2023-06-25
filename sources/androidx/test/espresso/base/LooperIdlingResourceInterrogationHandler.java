package androidx.test.espresso.base;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.base.Interrogator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public class LooperIdlingResourceInterrogationHandler implements IdlingResource, Interrogator.InterrogationHandler<Void> {
    public static final ConcurrentHashMap<String, LooperIdlingResourceInterrogationHandler> insts = new ConcurrentHashMap<>();

    /* renamed from: cb */
    public volatile IdlingResource.ResourceCallback f274cb = null;
    public volatile boolean idle = true;
    public final String name;
    public volatile MessageQueue queue = null;
    public final Interrogator.QueueInterrogationHandler<Boolean> queueHasNewTasks = new Interrogator.QueueInterrogationHandler<Boolean>(this) {
        public Boolean hasTasks = Boolean.FALSE;

        public boolean barrierUp() {
            this.hasTasks = Boolean.TRUE;
            return false;
        }

        public boolean queueEmpty() {
            this.hasTasks = Boolean.FALSE;
            return false;
        }

        public boolean taskDueLong() {
            this.hasTasks = Boolean.FALSE;
            return false;
        }

        public boolean taskDueSoon() {
            this.hasTasks = Boolean.TRUE;
            return false;
        }

        public Boolean get() {
            return this.hasTasks;
        }
    };
    public volatile boolean started = false;

    public LooperIdlingResourceInterrogationHandler(String str) {
        this.name = str;
    }

    public static LooperIdlingResourceInterrogationHandler forLooper(Looper looper) {
        String format = String.format(Locale.ROOT, "LooperIdlingResource-%s-%s", new Object[]{Long.valueOf(looper.getThread().getId()), looper.getThread().getName()});
        LooperIdlingResourceInterrogationHandler looperIdlingResourceInterrogationHandler = new LooperIdlingResourceInterrogationHandler(format);
        LooperIdlingResourceInterrogationHandler putIfAbsent = insts.putIfAbsent(format, looperIdlingResourceInterrogationHandler);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        new Handler(looper).post(new Runnable() {
            public void run() {
                MessageQueue unused = LooperIdlingResourceInterrogationHandler.this.queue = Looper.myQueue();
                boolean unused2 = LooperIdlingResourceInterrogationHandler.this.started = true;
                Interrogator.loopAndInterrogate(LooperIdlingResourceInterrogationHandler.this);
            }
        });
        return looperIdlingResourceInterrogationHandler;
    }

    private void transitionToIdle() {
        this.idle = true;
        if (this.f274cb != null) {
            this.f274cb.onTransitionToIdle();
        }
    }

    public boolean barrierUp() {
        this.idle = false;
        return true;
    }

    public boolean beforeTaskDispatch() {
        this.idle = false;
        return true;
    }

    public Void get() {
        return null;
    }

    public String getName() {
        return this.name;
    }

    public boolean isIdleNow() {
        if (this.started && this.idle) {
            return Boolean.FALSE.equals(Interrogator.peekAtQueueState(this.queue, this.queueHasNewTasks));
        }
        return false;
    }

    public boolean queueEmpty() {
        transitionToIdle();
        return true;
    }

    public void quitting() {
        transitionToIdle();
    }

    public void registerIdleTransitionCallback(IdlingResource.ResourceCallback resourceCallback) {
        this.f274cb = resourceCallback;
    }

    public boolean taskDueLong() {
        transitionToIdle();
        return true;
    }

    public boolean taskDueSoon() {
        this.idle = false;
        return true;
    }
}

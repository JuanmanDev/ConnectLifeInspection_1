package p630io.reactivex.observers;

/* renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy */
public enum BaseTestConsumer$TestWaitStrategy implements Runnable {
    SPIN {
        public void run() {
        }
    },
    YIELD {
        public void run() {
            Thread.yield();
        }
    },
    SLEEP_1MS {
        public void run() {
            BaseTestConsumer$TestWaitStrategy.sleep(1);
        }
    },
    SLEEP_10MS {
        public void run() {
            BaseTestConsumer$TestWaitStrategy.sleep(10);
        }
    },
    SLEEP_100MS {
        public void run() {
            BaseTestConsumer$TestWaitStrategy.sleep(100);
        }
    },
    SLEEP_1000MS {
        public void run() {
            BaseTestConsumer$TestWaitStrategy.sleep(1000);
        }
    };

    public static void sleep(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void run();
}

package androidx.test.espresso.base;

public class NoopRunnableIdleNotifier implements IdleNotifier<Runnable> {
    public void cancelCallback() {
    }

    public boolean isIdleNow() {
        return true;
    }

    public void registerNotificationCallback(Runnable runnable) {
        runnable.run();
    }
}

package androidx.test.espresso.base;

public interface IdleNotifier<CB> {
    void cancelCallback();

    boolean isIdleNow();

    void registerNotificationCallback(CB cb);
}

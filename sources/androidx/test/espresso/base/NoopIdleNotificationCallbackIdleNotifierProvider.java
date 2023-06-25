package androidx.test.espresso.base;

import androidx.test.espresso.base.IdlingResourceRegistry;
import p625h.p626a.C9381a;

public final class NoopIdleNotificationCallbackIdleNotifierProvider implements C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> {

    public static class NoopIdleNotificationCallbackIdleNotifier implements IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback> {
        public NoopIdleNotificationCallbackIdleNotifier() {
        }

        public void cancelCallback() {
        }

        public boolean isIdleNow() {
            return true;
        }

        public void registerNotificationCallback(IdlingResourceRegistry.IdleNotificationCallback idleNotificationCallback) {
            idleNotificationCallback.allResourcesIdle();
        }
    }

    public NoopIdleNotificationCallbackIdleNotifier get() {
        return new NoopIdleNotificationCallbackIdleNotifier();
    }
}

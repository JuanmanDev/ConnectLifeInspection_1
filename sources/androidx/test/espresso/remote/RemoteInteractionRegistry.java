package androidx.test.espresso.remote;

import java.util.concurrent.atomic.AtomicReference;

public class RemoteInteractionRegistry {
    public static final AtomicReference<RemoteInteraction> sInstance = new AtomicReference<>(new NoopRemoteInteraction());

    public static RemoteInteraction getInstance() {
        return sInstance.get();
    }

    public static void registerInstance(RemoteInteraction remoteInteraction) {
        if (remoteInteraction == null) {
            sInstance.set(new NoopRemoteInteraction());
        } else {
            sInstance.set(remoteInteraction);
        }
    }
}

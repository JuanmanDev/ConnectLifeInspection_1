package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.Future;

public final class Uninterruptibles {
    public static <V> V getUninterruptibly(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}

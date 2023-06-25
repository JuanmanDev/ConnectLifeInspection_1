package com.facebook.stetho.inspector.network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AsyncPrettyPrinterExecutorHolder {
    public static ExecutorService sExecutorService;

    public static void ensureInitialized() {
        if (sExecutorService == null) {
            sExecutorService = Executors.newCachedThreadPool();
        }
    }

    public static ExecutorService getExecutorService() {
        return sExecutorService;
    }

    public static void shutdown() {
        sExecutorService.shutdown();
        sExecutorService = null;
    }
}

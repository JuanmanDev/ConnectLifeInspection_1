package com.google.android.exoplayer2.util;

import java.io.IOException;

public final class PriorityTaskManager {

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    /* renamed from: a */
    public abstract void mo24294a(int i);

    /* renamed from: b */
    public abstract void mo24295b(int i);
}

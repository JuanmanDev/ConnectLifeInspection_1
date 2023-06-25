package com.google.android.exoplayer2;

import java.io.IOException;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final Throwable cause;
    public final int rendererIndex;
    public final int type;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i) {
        return new ExoPlaybackException(1, exc, i);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException, -1);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException, -1);
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        C3151e.m7759g(z);
        return (Exception) this.cause;
    }

    public IOException getSourceException() {
        C3151e.m7759g(this.type == 0);
        return (IOException) this.cause;
    }

    public RuntimeException getUnexpectedException() {
        C3151e.m7759g(this.type == 2);
        return (RuntimeException) this.cause;
    }
}

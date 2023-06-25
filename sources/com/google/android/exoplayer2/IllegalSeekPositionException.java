package com.google.android.exoplayer2;

import p040c.p200q.p201a.p219b.C2578a0;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C2578a0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C2578a0 a0Var, int i, long j) {
        this.timeline = a0Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}

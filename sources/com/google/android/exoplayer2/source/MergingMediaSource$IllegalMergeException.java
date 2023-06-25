package com.google.android.exoplayer2.source;

import java.io.IOException;

public final class MergingMediaSource$IllegalMergeException extends IOException {
    public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
    public final int reason;

    public MergingMediaSource$IllegalMergeException(int i) {
        this.reason = i;
    }
}

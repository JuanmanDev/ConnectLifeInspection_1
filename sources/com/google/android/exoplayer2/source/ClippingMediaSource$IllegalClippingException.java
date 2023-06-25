package com.google.android.exoplayer2.source;

import androidx.core.p028os.EnvironmentCompat;
import java.io.IOException;

public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public static final int REASON_INVALID_PERIOD_COUNT = 0;
    public static final int REASON_NOT_SEEKABLE_TO_START = 1;
    public static final int REASON_START_EXCEEDS_END = 2;
    public final int reason;

    public ClippingMediaSource$IllegalClippingException(int i) {
        super("Illegal clipping: " + getReasonDescription(i));
        this.reason = i;
    }

    public static String getReasonDescription(int i) {
        return i != 0 ? i != 1 ? i != 2 ? EnvironmentCompat.MEDIA_UNKNOWN : "start exceeds end" : "not seekable to start" : "invalid period count";
    }
}

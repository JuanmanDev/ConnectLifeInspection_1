package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.IOException;

public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + MAPCookie.DOT);
    }
}

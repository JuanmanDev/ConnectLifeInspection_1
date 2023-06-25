package net.sqlcipher;

import android.support.p025v4.media.session.PlaybackStateCompat;

public class DefaultCursorWindowAllocation implements CursorWindowAllocation {
    public long WindowAllocationUnbounded = 0;
    public long initialAllocationSize = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    public long getGrowthPaddingSize() {
        return this.initialAllocationSize;
    }

    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    public long getMaxAllocationSize() {
        return this.WindowAllocationUnbounded;
    }
}

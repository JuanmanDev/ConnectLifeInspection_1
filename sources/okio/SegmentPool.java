package okio;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\bÁ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, mo47991d2 = {"Lokio/SegmentPool;", "Lokio/Segment;", "segment", "", "recycle", "(Lokio/Segment;)V", "take", "()Lokio/Segment;", "", "MAX_SIZE", "J", "byteCount", "getByteCount", "()J", "setByteCount", "(J)V", "next", "Lokio/Segment;", "getNext", "setNext", "<init>", "()V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: SegmentPool.kt */
public final class SegmentPool {
    public static final SegmentPool INSTANCE = new SegmentPool();
    public static final long MAX_SIZE = 65536;
    public static long byteCount;
    @Nullable
    public static Segment next;

    public final long getByteCount() {
        return byteCount;
    }

    @Nullable
    public final Segment getNext() {
        return next;
    }

    public final void recycle(@NotNull Segment segment) {
        if (!(segment.next == null && segment.prev == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!segment.shared) {
            synchronized (this) {
                long j = (long) 8192;
                if (byteCount + j <= 65536) {
                    byteCount += j;
                    segment.next = next;
                    segment.limit = 0;
                    segment.pos = 0;
                    next = segment;
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final void setByteCount(long j) {
        byteCount = j;
    }

    public final void setNext(@Nullable Segment segment) {
        next = segment;
    }

    @NotNull
    public final Segment take() {
        synchronized (this) {
            Segment segment = next;
            if (segment == null) {
                return new Segment();
            }
            next = segment.next;
            segment.next = null;
            byteCount -= (long) 8192;
            return segment;
        }
    }
}

package okio;

import java.io.InterruptedIOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo47991d2 = {"okio/Throttler$sink$1", "Lokio/ForwardingSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Throttler.kt */
public final class Throttler$sink$1 extends ForwardingSink {
    public final /* synthetic */ Sink $sink;
    public final /* synthetic */ Throttler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Throttler$sink$1(Throttler throttler, Sink sink, Sink sink2) {
        super(sink2);
        this.this$0 = throttler;
        this.$sink = sink;
    }

    public void write(@NotNull Buffer buffer, long j) {
        while (j > 0) {
            try {
                long take$okio = this.this$0.take$okio(j);
                super.write(buffer, take$okio);
                j -= take$okio;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }
}

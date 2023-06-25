package okio;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, mo47991d2 = {"okio/Pipe$source$1", "Lokio/Source;", "", "close", "()V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "Lokio/Timeout;", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Pipe.kt */
public final class Pipe$source$1 implements Source {
    public final /* synthetic */ Pipe this$0;
    public final Timeout timeout = new Timeout();

    public Pipe$source$1(Pipe pipe) {
        this.this$0 = pipe;
    }

    public void close() {
        synchronized (this.this$0.getBuffer$okio()) {
            this.this$0.setSourceClosed$okio(true);
            Buffer buffer$okio = this.this$0.getBuffer$okio();
            if (buffer$okio != null) {
                buffer$okio.notifyAll();
                Unit unit = Unit.INSTANCE;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    public long read(@NotNull Buffer buffer, long j) {
        synchronized (this.this$0.getBuffer$okio()) {
            if (!this.this$0.getSourceClosed$okio()) {
                while (this.this$0.getBuffer$okio().size() == 0) {
                    if (this.this$0.getSinkClosed$okio()) {
                        return -1;
                    }
                    this.timeout.waitUntilNotified(this.this$0.getBuffer$okio());
                }
                long read = this.this$0.getBuffer$okio().read(buffer, j);
                Buffer buffer$okio = this.this$0.getBuffer$okio();
                if (buffer$okio != null) {
                    buffer$okio.notifyAll();
                    return read;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @NotNull
    public Timeout timeout() {
        return this.timeout;
    }
}

package okio;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J'\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo47991d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "", "available", "()I", "", "close", "()V", "read", "", "sink", "offset", "byteCount", "([BII)I", "", "toString", "()Ljava/lang/String;", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Buffer.kt */
public final class Buffer$inputStream$1 extends InputStream {
    public final /* synthetic */ Buffer this$0;

    public Buffer$inputStream$1(Buffer buffer) {
        this.this$0 = buffer;
    }

    public int available() {
        return (int) Math.min(this.this$0.size(), (long) Integer.MAX_VALUE);
    }

    public void close() {
    }

    public int read() {
        if (this.this$0.size() > 0) {
            return this.this$0.readByte() & 255;
        }
        return -1;
    }

    @NotNull
    public String toString() {
        return this.this$0 + ".inputStream()";
    }

    public int read(@NotNull byte[] bArr, int i, int i2) {
        return this.this$0.read(bArr, i, i2);
    }
}

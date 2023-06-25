package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, mo47991d2 = {"okio/Buffer$outputStream$1", "Ljava/io/OutputStream;", "", "close", "()V", "flush", "", "toString", "()Ljava/lang/String;", "", "data", "", "offset", "byteCount", "write", "([BII)V", "b", "(I)V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Buffer.kt */
public final class Buffer$outputStream$1 extends OutputStream {
    public final /* synthetic */ Buffer this$0;

    public Buffer$outputStream$1(Buffer buffer) {
        this.this$0 = buffer;
    }

    public void close() {
    }

    public void flush() {
    }

    @NotNull
    public String toString() {
        return this.this$0 + ".outputStream()";
    }

    public void write(int i) {
        this.this$0.writeByte(i);
    }

    public void write(@NotNull byte[] bArr, int i, int i2) {
        this.this$0.write(bArr, i, i2);
    }
}

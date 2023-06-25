package okhttp3.internal.p700ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo47991d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "close", "()V", "Lokio/Buffer;", "buffer", "deflate", "(Lokio/Buffer;)V", "Lokio/ByteString;", "suffix", "", "endsWith", "(Lokio/Buffer;Lokio/ByteString;)Z", "deflatedBytes", "Lokio/Buffer;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/DeflaterSink;", "deflaterSink", "Lokio/DeflaterSink;", "noContextTakeover", "Z", "<init>", "(Z)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.MessageDeflater */
/* compiled from: MessageDeflater.kt */
public final class MessageDeflater implements Closeable {
    public final Buffer deflatedBytes = new Buffer();
    public final Deflater deflater;
    public final DeflaterSink deflaterSink;
    public final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        Deflater deflater2 = new Deflater(-1, true);
        this.deflater = deflater2;
        this.deflaterSink = new DeflaterSink((Sink) this.deflatedBytes, deflater2);
    }

    private final boolean endsWith(@NotNull Buffer buffer, ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - ((long) byteString.size()), byteString);
    }

    public void close() {
        this.deflaterSink.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deflate(@org.jetbrains.annotations.NotNull okio.Buffer r7) {
        /*
            r6 = this;
            okio.Buffer r0 = r6.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x0063
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L_0x001c
            java.util.zip.Deflater r0 = r6.deflater
            r0.reset()
        L_0x001c:
            okio.DeflaterSink r0 = r6.deflaterSink
            long r3 = r7.size()
            r0.write(r7, r3)
            okio.DeflaterSink r0 = r6.deflaterSink
            r0.flush()
            okio.Buffer r0 = r6.deflatedBytes
            okio.ByteString r3 = okhttp3.internal.p700ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            boolean r0 = r6.endsWith(r0, r3)
            if (r0 == 0) goto L_0x0054
            okio.Buffer r0 = r6.deflatedBytes
            long r2 = r0.size()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            okio.Buffer r0 = r6.deflatedBytes
            r4 = 0
            okio.Buffer$UnsafeCursor r0 = okio.Buffer.readAndWriteUnsafe$default(r0, r4, r1, r4)
            r0.resizeBuffer(r2)     // Catch:{ all -> 0x004d }
            kotlin.p639io.CloseableKt.closeFinally(r0, r4)
            goto L_0x0059
        L_0x004d:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r0, r7)
            throw r1
        L_0x0054:
            okio.Buffer r0 = r6.deflatedBytes
            r0.writeByte((int) r2)
        L_0x0059:
            okio.Buffer r0 = r6.deflatedBytes
            long r1 = r0.size()
            r7.write((okio.Buffer) r0, (long) r1)
            return
        L_0x0063:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.MessageDeflater.deflate(okio.Buffer):void");
    }
}

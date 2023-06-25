package okio;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bQ\u0010RJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ'\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010!J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\"H\u0016¢\u0006\u0004\b\u001b\u0010#J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u001b\u0010&J'\u0010\u001b\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010'J\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020(2\u0006\u0010 \u001a\u00020\"H\u0016¢\u0006\u0004\b\u001b\u0010)J\u0017\u0010*\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u001aH\u0016¢\u0006\u0004\b4\u0010.J\u0017\u00105\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010.J\u0017\u00106\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b6\u00101J\u0017\u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00101J\u0017\u00109\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u0010.J\u0017\u0010:\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u001aH\u0016¢\u0006\u0004\b:\u0010.J\u001f\u0010>\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00152\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J/\u0010>\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010BJ\u0017\u0010C\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\bC\u0010DJ'\u0010C\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010EJ\u0017\u0010G\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u001aH\u0016¢\u0006\u0004\bG\u0010.R\u001d\u0010\u0003\u001a\u00020\u00028Ö\u0002@\u0016X\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0007\u001a\u0004\bH\u0010\u0004R\u0016\u0010J\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, mo47991d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "", "close", "()V", "emit", "()Lokio/BufferedSink;", "emitCompleteSegments", "flush", "", "isOpen", "()Z", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "toString", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "source", "", "write", "(Ljava/nio/ByteBuffer;)I", "", "([B)Lokio/BufferedSink;", "offset", "byteCount", "([BII)Lokio/BufferedSink;", "", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "(Lokio/ByteString;)Lokio/BufferedSink;", "(Lokio/ByteString;II)Lokio/BufferedSink;", "Lokio/Source;", "(Lokio/Source;J)Lokio/BufferedSink;", "writeAll", "(Lokio/Source;)J", "b", "writeByte", "(I)Lokio/BufferedSink;", "v", "writeDecimalLong", "(J)Lokio/BufferedSink;", "writeHexadecimalUnsignedLong", "i", "writeInt", "writeIntLe", "writeLong", "writeLongLe", "s", "writeShort", "writeShortLe", "string", "Ljava/nio/charset/Charset;", "charset", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "getBuffer", "buffer$annotations", "bufferField", "Lokio/Buffer;", "closed", "Z", "Lokio/Sink;", "sink", "Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RealBufferedSink.kt */
public final class RealBufferedSink implements BufferedSink {
    @NotNull
    @JvmField
    public final Buffer bufferField = new Buffer();
    @JvmField
    public boolean closed;
    @NotNull
    @JvmField
    public final Sink sink;

    public RealBufferedSink(@NotNull Sink sink2) {
        this.sink = sink2;
    }

    public static /* synthetic */ void buffer$annotations() {
    }

    @NotNull
    public Buffer buffer() {
        return this.bufferField;
    }

    public void close() {
        if (!this.closed) {
            Throwable th = null;
            try {
                if (this.bufferField.size() > 0) {
                    this.sink.write(this.bufferField, this.bufferField.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.sink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.closed = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @NotNull
    public BufferedSink emit() {
        if (!this.closed) {
            long size = this.bufferField.size();
            if (size > 0) {
                this.sink.write(this.bufferField, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink emitCompleteSegments() {
        if (!this.closed) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.bufferField, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.closed) {
            if (this.bufferField.size() > 0) {
                Sink sink2 = this.sink;
                Buffer buffer = this.bufferField;
                sink2.write(buffer, buffer.size());
            }
            this.sink.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    public boolean isOpen() {
        return !this.closed;
    }

    @NotNull
    public OutputStream outputStream() {
        return new RealBufferedSink$outputStream$1(this);
    }

    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    public int write(@NotNull ByteBuffer byteBuffer) {
        if (!this.closed) {
            int write = this.bufferField.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long writeAll(@NotNull Source source) {
        long j = 0;
        while (true) {
            long read = source.read(this.bufferField, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    @NotNull
    public BufferedSink writeByte(int i) {
        if (!this.closed) {
            this.bufferField.writeByte(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeDecimalLong(long j) {
        if (!this.closed) {
            this.bufferField.writeDecimalLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (!this.closed) {
            this.bufferField.writeHexadecimalUnsignedLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeInt(int i) {
        if (!this.closed) {
            this.bufferField.writeInt(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeIntLe(int i) {
        if (!this.closed) {
            this.bufferField.writeIntLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeLong(long j) {
        if (!this.closed) {
            this.bufferField.writeLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeLongLe(long j) {
        if (!this.closed) {
            this.bufferField.writeLongLe(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeShort(int i) {
        if (!this.closed) {
            this.bufferField.writeShort(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeShortLe(int i) {
        if (!this.closed) {
            this.bufferField.writeShortLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeString(@NotNull String str, @NotNull Charset charset) {
        if (!this.closed) {
            this.bufferField.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeUtf8(@NotNull String str) {
        if (!this.closed) {
            this.bufferField.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeUtf8CodePoint(int i) {
        if (!this.closed) {
            this.bufferField.writeUtf8CodePoint(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void write(@NotNull Buffer buffer, long j) {
        if (!this.closed) {
            this.bufferField.write(buffer, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeString(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        if (!this.closed) {
            this.bufferField.writeString(str, i, i2, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink writeUtf8(@NotNull String str, int i, int i2) {
        if (!this.closed) {
            this.bufferField.writeUtf8(str, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink write(@NotNull ByteString byteString) {
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink write(@NotNull ByteString byteString, int i, int i2) {
        if (!this.closed) {
            this.bufferField.write(byteString, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink write(@NotNull byte[] bArr) {
        if (!this.closed) {
            this.bufferField.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink write(@NotNull byte[] bArr, int i, int i2) {
        if (!this.closed) {
            this.bufferField.write(bArr, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public BufferedSink write(@NotNull Source source, long j) {
        while (j > 0) {
            long read = source.read(this.bufferField, j);
            if (read != -1) {
                j -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}

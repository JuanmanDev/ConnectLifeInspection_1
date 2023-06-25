package okio.internal;

import java.io.EOFException;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\b\u0010\u0003\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0000H\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\b¢\u0006\u0004\b\u0011\u0010\u0016\u001a$\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0018H\b¢\u0006\u0004\b\u0011\u0010\u0019\u001a\u001c\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\b¢\u0006\u0004\b\u0011\u0010\u001c\u001a,\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\b¢\u0006\u0004\b\u0011\u0010\u001d\u001a$\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0018H\b¢\u0006\u0004\b\u0011\u0010\u001f\u001a\u001c\u0010 \u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u001eH\b¢\u0006\u0004\b \u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0013H\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010&\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010(\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\b¢\u0006\u0004\b(\u0010'\u001a\u001c\u0010*\u001a\u00020\u0004*\u00020\u00002\u0006\u0010)\u001a\u00020\u0013H\b¢\u0006\u0004\b*\u0010$\u001a\u001c\u0010+\u001a\u00020\u0004*\u00020\u00002\u0006\u0010)\u001a\u00020\u0013H\b¢\u0006\u0004\b+\u0010$\u001a\u001c\u0010,\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\b¢\u0006\u0004\b,\u0010'\u001a\u001c\u0010-\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\b¢\u0006\u0004\b-\u0010'\u001a\u001c\u0010/\u001a\u00020\u0004*\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\b¢\u0006\u0004\b/\u0010$\u001a\u001c\u00100\u001a\u00020\u0004*\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\b¢\u0006\u0004\b0\u0010$\u001a\u001c\u00102\u001a\u00020\u0004*\u00020\u00002\u0006\u00101\u001a\u00020\fH\b¢\u0006\u0004\b2\u00103\u001a,\u00102\u001a\u00020\u0004*\u00020\u00002\u0006\u00101\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0013H\b¢\u0006\u0004\b2\u00106\u001a\u001c\u00108\u001a\u00020\u0004*\u00020\u00002\u0006\u00107\u001a\u00020\u0013H\b¢\u0006\u0004\b8\u0010$¨\u00069"}, mo47991d2 = {"Lokio/RealBufferedSink;", "", "commonClose", "(Lokio/RealBufferedSink;)V", "Lokio/BufferedSink;", "commonEmit", "(Lokio/RealBufferedSink;)Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSink;)Lokio/Timeout;", "", "commonToString", "(Lokio/RealBufferedSink;)Ljava/lang/String;", "", "source", "commonWrite", "(Lokio/RealBufferedSink;[B)Lokio/BufferedSink;", "", "offset", "byteCount", "(Lokio/RealBufferedSink;[BII)Lokio/BufferedSink;", "Lokio/Buffer;", "", "(Lokio/RealBufferedSink;Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "(Lokio/RealBufferedSink;Lokio/ByteString;)Lokio/BufferedSink;", "(Lokio/RealBufferedSink;Lokio/ByteString;II)Lokio/BufferedSink;", "Lokio/Source;", "(Lokio/RealBufferedSink;Lokio/Source;J)Lokio/BufferedSink;", "commonWriteAll", "(Lokio/RealBufferedSink;Lokio/Source;)J", "b", "commonWriteByte", "(Lokio/RealBufferedSink;I)Lokio/BufferedSink;", "v", "commonWriteDecimalLong", "(Lokio/RealBufferedSink;J)Lokio/BufferedSink;", "commonWriteHexadecimalUnsignedLong", "i", "commonWriteInt", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "s", "commonWriteShort", "commonWriteShortLe", "string", "commonWriteUtf8", "(Lokio/RealBufferedSink;Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Lokio/RealBufferedSink;Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "commonWriteUtf8CodePoint", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RealBufferedSink.kt */
public final class RealBufferedSinkKt {
    public static final void commonClose(@NotNull RealBufferedSink realBufferedSink) {
        if (!realBufferedSink.closed) {
            Throwable th = null;
            try {
                if (realBufferedSink.bufferField.size() > 0) {
                    realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                realBufferedSink.sink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            realBufferedSink.closed = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull RealBufferedSink realBufferedSink) {
        if (!realBufferedSink.closed) {
            long size = realBufferedSink.bufferField.size();
            if (size > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, size);
            }
            return realBufferedSink;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull RealBufferedSink realBufferedSink) {
        if (!realBufferedSink.closed) {
            long completeSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, completeSegmentByteCount);
            }
            return realBufferedSink;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void commonFlush(@NotNull RealBufferedSink realBufferedSink) {
        if (!realBufferedSink.closed) {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            realBufferedSink.sink.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSink realBufferedSink) {
        return realBufferedSink.sink.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSink realBufferedSink) {
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull Buffer buffer, long j) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(buffer, j);
            realBufferedSink.emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonWriteAll(@NotNull RealBufferedSink realBufferedSink, @NotNull Source source) {
        long j = 0;
        while (true) {
            long read = source.read(realBufferedSink.bufferField, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            realBufferedSink.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeByte(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull RealBufferedSink realBufferedSink, long j) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeDecimalLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull RealBufferedSink realBufferedSink, long j) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeInt(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeIntLe(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull RealBufferedSink realBufferedSink, long j) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull RealBufferedSink realBufferedSink, long j) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeLongLe(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeShort(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeShortLe(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull RealBufferedSink realBufferedSink, @NotNull String str) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull RealBufferedSink realBufferedSink, int i) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8CodePoint(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull ByteString byteString) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull RealBufferedSink realBufferedSink, @NotNull String str, int i, int i2) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull ByteString byteString, int i, int i2) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull byte[] bArr) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull byte[] bArr, int i, int i2) {
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull Source source, long j) {
        while (j > 0) {
            long read = source.read(realBufferedSink.bufferField, j);
            if (read != -1) {
                j -= read;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}

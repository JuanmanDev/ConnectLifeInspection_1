package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0012\u0010\u001aJ'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0012\u0010\u001bJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001dH&¢\u0006\u0004\b\u0012\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0014H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001dH&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001dH&¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0014H&¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0014H&¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001dH&¢\u0006\u0004\b+\u0010&J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001dH&¢\u0006\u0004\b,\u0010&J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0014H&¢\u0006\u0004\b.\u0010#J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0014H&¢\u0006\u0004\b/\u0010#J\u001f\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00105J/\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00142\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00108J\u0017\u00109\u001a\u00020\u00002\u0006\u00101\u001a\u000200H&¢\u0006\u0004\b9\u0010:J'\u00109\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014H&¢\u0006\u0004\b9\u0010;J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0014H&¢\u0006\u0004\b=\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0006¨\u0006?"}, mo47991d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lkotlin/Any;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "emit", "()Lokio/BufferedSink;", "emitCompleteSegments", "", "flush", "()V", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "", "source", "write", "([B)Lokio/BufferedSink;", "", "offset", "byteCount", "([BII)Lokio/BufferedSink;", "Lokio/ByteString;", "byteString", "(Lokio/ByteString;)Lokio/BufferedSink;", "(Lokio/ByteString;II)Lokio/BufferedSink;", "Lokio/Source;", "", "(Lokio/Source;J)Lokio/BufferedSink;", "writeAll", "(Lokio/Source;)J", "b", "writeByte", "(I)Lokio/BufferedSink;", "v", "writeDecimalLong", "(J)Lokio/BufferedSink;", "writeHexadecimalUnsignedLong", "i", "writeInt", "writeIntLe", "writeLong", "writeLongLe", "s", "writeShort", "writeShortLe", "", "string", "Ljava/nio/charset/Charset;", "charset", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "getBuffer", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BufferedSink.kt */
public interface BufferedSink extends Sink, WritableByteChannel {
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    Buffer buffer();

    @NotNull
    BufferedSink emit();

    @NotNull
    BufferedSink emitCompleteSegments();

    void flush();

    @NotNull
    Buffer getBuffer();

    @NotNull
    OutputStream outputStream();

    @NotNull
    BufferedSink write(@NotNull ByteString byteString);

    @NotNull
    BufferedSink write(@NotNull ByteString byteString, int i, int i2);

    @NotNull
    BufferedSink write(@NotNull Source source, long j);

    @NotNull
    BufferedSink write(@NotNull byte[] bArr);

    @NotNull
    BufferedSink write(@NotNull byte[] bArr, int i, int i2);

    long writeAll(@NotNull Source source);

    @NotNull
    BufferedSink writeByte(int i);

    @NotNull
    BufferedSink writeDecimalLong(long j);

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long j);

    @NotNull
    BufferedSink writeInt(int i);

    @NotNull
    BufferedSink writeIntLe(int i);

    @NotNull
    BufferedSink writeLong(long j);

    @NotNull
    BufferedSink writeLongLe(long j);

    @NotNull
    BufferedSink writeShort(int i);

    @NotNull
    BufferedSink writeShortLe(int i);

    @NotNull
    BufferedSink writeString(@NotNull String str, int i, int i2, @NotNull Charset charset);

    @NotNull
    BufferedSink writeString(@NotNull String str, @NotNull Charset charset);

    @NotNull
    BufferedSink writeUtf8(@NotNull String str);

    @NotNull
    BufferedSink writeUtf8(@NotNull String str, int i, int i2);

    @NotNull
    BufferedSink writeUtf8CodePoint(int i);
}

package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u0010J'\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u0012J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\r\u0010\u0015J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H&¢\u0006\u0004\b\u001f\u0010$J\u0017\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J'\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010#\u001a\u00020!H&¢\u0006\u0004\b'\u0010)J\u0017\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020%H&¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u00020%2\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\b/\u00101J\u000f\u00102\u001a\u00020\u0013H&¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\b2\u00104J\u000f\u00105\u001a\u00020\fH&¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b8\u00109J\u001f\u00108\u001a\u0002072\u0006\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\b8\u0010:J\u000f\u0010;\u001a\u00020\fH&¢\u0006\u0004\b;\u00106J\u000f\u0010<\u001a\u00020!H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020!H&¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\fH&¢\u0006\u0004\b?\u00106J\u000f\u0010@\u001a\u00020\fH&¢\u0006\u0004\b@\u00106J\u000f\u0010B\u001a\u00020AH&¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020AH&¢\u0006\u0004\bD\u0010CJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020G2\u0006\u0010#\u001a\u00020\f2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bH\u0010JJ\u000f\u0010K\u001a\u00020GH&¢\u0006\u0004\bK\u0010LJ\u0017\u0010K\u001a\u00020G2\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\bK\u0010MJ\u000f\u0010N\u001a\u00020!H&¢\u0006\u0004\bN\u0010=J\u0011\u0010O\u001a\u0004\u0018\u00010GH&¢\u0006\u0004\bO\u0010LJ\u000f\u0010P\u001a\u00020GH&¢\u0006\u0004\bP\u0010LJ\u0017\u0010P\u001a\u00020G2\u0006\u0010Q\u001a\u00020\fH&¢\u0006\u0004\bP\u0010MJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u0002072\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020!2\u0006\u0010W\u001a\u00020VH&¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u0002072\u0006\u0010#\u001a\u00020\fH&¢\u0006\u0004\bZ\u0010UR\u0016\u0010\u0005\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0006¨\u0006\\"}, mo47991d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lkotlin/Any;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "", "exhausted", "()Z", "", "b", "", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "Lokio/ByteString;", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "peek", "()Lokio/BufferedSource;", "offset", "rangeEquals", "(JLokio/ByteString;)Z", "", "bytesOffset", "byteCount", "(JLokio/ByteString;II)Z", "", "sink", "read", "([B)I", "([BII)I", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "readByte", "()B", "readByteArray", "()[B", "(J)[B", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "readDecimalLong", "()J", "", "readFully", "([B)V", "(Lokio/Buffer;J)V", "readHexadecimalUnsignedLong", "readInt", "()I", "readIntLe", "readLong", "readLongLe", "", "readShort", "()S", "readShortLe", "Ljava/nio/charset/Charset;", "charset", "", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "(J)Z", "require", "(J)V", "Lokio/Options;", "options", "select", "(Lokio/Options;)I", "skip", "getBuffer", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BufferedSource.kt */
public interface BufferedSource extends Source, ReadableByteChannel {
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    Buffer buffer();

    boolean exhausted();

    @NotNull
    Buffer getBuffer();

    long indexOf(byte b);

    long indexOf(byte b, long j);

    long indexOf(byte b, long j, long j2);

    long indexOf(@NotNull ByteString byteString);

    long indexOf(@NotNull ByteString byteString, long j);

    long indexOfElement(@NotNull ByteString byteString);

    long indexOfElement(@NotNull ByteString byteString, long j);

    @NotNull
    InputStream inputStream();

    @NotNull
    BufferedSource peek();

    boolean rangeEquals(long j, @NotNull ByteString byteString);

    boolean rangeEquals(long j, @NotNull ByteString byteString, int i, int i2);

    int read(@NotNull byte[] bArr);

    int read(@NotNull byte[] bArr, int i, int i2);

    long readAll(@NotNull Sink sink);

    byte readByte();

    @NotNull
    byte[] readByteArray();

    @NotNull
    byte[] readByteArray(long j);

    @NotNull
    ByteString readByteString();

    @NotNull
    ByteString readByteString(long j);

    long readDecimalLong();

    void readFully(@NotNull Buffer buffer, long j);

    void readFully(@NotNull byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    @NotNull
    String readString(long j, @NotNull Charset charset);

    @NotNull
    String readString(@NotNull Charset charset);

    @NotNull
    String readUtf8();

    @NotNull
    String readUtf8(long j);

    int readUtf8CodePoint();

    @Nullable
    String readUtf8Line();

    @NotNull
    String readUtf8LineStrict();

    @NotNull
    String readUtf8LineStrict(long j);

    boolean request(long j);

    void require(long j);

    int select(@NotNull Options options);

    void skip(long j);
}

package okio.internal;

import androidx.exifinterface.media.ExifInterface;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u000bH\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\u000bH\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001b\u001a\u00020\b*\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u00020\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000fH\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\u0002*\u00020\u000bH\b¢\u0006\u0004\b!\u0010\"\u001a,\u0010&\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\b¢\u0006\u0004\b&\u0010'\u001a$\u0010&\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020(2\u0006\u0010$\u001a\u00020\u000fH\b¢\u0006\u0004\b&\u0010)\u001a$\u0010+\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010*\u001a\u00020(2\u0006\u0010$\u001a\u00020\u000fH\b¢\u0006\u0004\b+\u0010)\u001a4\u0010,\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\b¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010/\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010.\u001a\u00020\u0004H\b¢\u0006\u0004\b/\u00100\u001a,\u0010/\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\b¢\u0006\u0004\b/\u00101\u001a$\u0010/\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b/\u00102\u001a\u001c\u00104\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010.\u001a\u000203H\b¢\u0006\u0004\b4\u00105\u001a\u0014\u00106\u001a\u00020\u001e*\u00020\u000bH\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0004*\u00020\u000bH\b¢\u0006\u0004\b8\u00109\u001a\u001c\u00108\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b8\u0010:\u001a\u0014\u0010;\u001a\u00020(*\u00020\u000bH\b¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010;\u001a\u00020(*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b;\u0010=\u001a\u0014\u0010>\u001a\u00020\u000f*\u00020\u000bH\b¢\u0006\u0004\b>\u0010\u0011\u001a\u001c\u0010?\u001a\u00020\f*\u00020\u000b2\u0006\u0010.\u001a\u00020\u0004H\b¢\u0006\u0004\b?\u0010@\u001a$\u0010?\u001a\u00020\f*\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b?\u0010A\u001a\u0014\u0010B\u001a\u00020\u000f*\u00020\u000bH\b¢\u0006\u0004\bB\u0010\u0011\u001a\u0014\u0010C\u001a\u00020\u0002*\u00020\u000bH\b¢\u0006\u0004\bC\u0010\"\u001a\u0014\u0010D\u001a\u00020\u000f*\u00020\u000bH\b¢\u0006\u0004\bD\u0010\u0011\u001a\u0014\u0010F\u001a\u00020E*\u00020\u000bH\b¢\u0006\u0004\bF\u0010G\u001a\u001c\u0010I\u001a\u00020H*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\bI\u0010J\u001a\u0014\u0010K\u001a\u00020\u0002*\u00020\u000bH\b¢\u0006\u0004\bK\u0010\"\u001a\u0016\u0010L\u001a\u0004\u0018\u00010H*\u00020\u000bH\b¢\u0006\u0004\bL\u0010M\u001a\u001c\u0010O\u001a\u00020H*\u00020\u000b2\u0006\u0010N\u001a\u00020\u000fH\b¢\u0006\u0004\bO\u0010J\u001a\u001c\u0010R\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010Q\u001a\u00020PH\b¢\u0006\u0004\bR\u0010S\u001a\u001c\u0010T\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\bT\u0010U\u001a\u0014\u0010V\u001a\u00020(*\u00020\u000bH\b¢\u0006\u0004\bV\u0010<\u001a\u001c\u0010V\u001a\u00020(*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\b¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010Y\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010X\u001a\u00020\u0002H\b¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020\u0004H\b¢\u0006\u0004\b\\\u0010]\u001a,\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\b¢\u0006\u0004\b\\\u0010^\u001a$\u0010\\\u001a\u00020\f*\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b\\\u0010A\u001a0\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010_\u001a\u00020(2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\b¢\u0006\u0004\b\\\u0010`\u001a$\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020a2\u0006\u0010\u0016\u001a\u00020\u000fH\b¢\u0006\u0004\b\\\u0010b\u001a\u001c\u0010c\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010[\u001a\u00020aH\b¢\u0006\u0004\bc\u0010d\u001a\u001c\u0010e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010#\u001a\u00020\u0002H\b¢\u0006\u0004\be\u0010f\u001a\u001c\u0010h\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010g\u001a\u00020\u000fH\b¢\u0006\u0004\bh\u0010i\u001a\u001c\u0010j\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010g\u001a\u00020\u000fH\b¢\u0006\u0004\bj\u0010i\u001a\u001c\u0010l\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010k\u001a\u00020\u0002H\b¢\u0006\u0004\bl\u0010f\u001a\u001c\u0010m\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010g\u001a\u00020\u000fH\b¢\u0006\u0004\bm\u0010i\u001a\u001c\u0010o\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010n\u001a\u00020\u0002H\b¢\u0006\u0004\bo\u0010f\u001a,\u0010s\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010p\u001a\u00020H2\u0006\u0010q\u001a\u00020\u00022\u0006\u0010r\u001a\u00020\u0002H\b¢\u0006\u0004\bs\u0010t\u001a\u001c\u0010v\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010u\u001a\u00020\u0002H\b¢\u0006\u0004\bv\u0010f\u001a\u001b\u0010x\u001a\u00020H*\u00020\u000b2\u0006\u0010w\u001a\u00020\u000fH\u0000¢\u0006\u0004\bx\u0010J\u001a>\u0010|\u001a\u00028\u0000\"\u0004\b\u0000\u0010y*\u00020\u000b2\u0006\u0010$\u001a\u00020\u000f2\u001a\u0010{\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000zH\b¢\u0006\u0004\b|\u0010}\u001a&\u0010\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\b\b\u0002\u0010~\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0010\u0001\"!\u0010\u0001\u001a\u00020\u00048\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0019\u0010\u0001\u001a\u00020\u000f8\u0000@\u0000XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0019\u0010\u0001\u001a\u00020\u000f8\u0000@\u0000XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0019\u0010\u0001\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo47991d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lokio/Segment;I[BII)Z", "Lokio/Buffer;", "", "commonClear", "(Lokio/Buffer;)V", "", "commonCompleteSegmentByteCount", "(Lokio/Buffer;)J", "commonCopy", "(Lokio/Buffer;)Lokio/Buffer;", "out", "offset", "byteCount", "commonCopyTo", "(Lokio/Buffer;Lokio/Buffer;JJ)Lokio/Buffer;", "", "other", "commonEquals", "(Lokio/Buffer;Ljava/lang/Object;)Z", "pos", "", "commonGet", "(Lokio/Buffer;J)B", "commonHashCode", "(Lokio/Buffer;)I", "b", "fromIndex", "toIndex", "commonIndexOf", "(Lokio/Buffer;BJJ)J", "Lokio/ByteString;", "(Lokio/Buffer;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lokio/Buffer;JLokio/ByteString;II)Z", "sink", "commonRead", "(Lokio/Buffer;[B)I", "(Lokio/Buffer;[BII)I", "(Lokio/Buffer;Lokio/Buffer;J)J", "Lokio/Sink;", "commonReadAll", "(Lokio/Buffer;Lokio/Sink;)J", "commonReadByte", "(Lokio/Buffer;)B", "commonReadByteArray", "(Lokio/Buffer;)[B", "(Lokio/Buffer;J)[B", "commonReadByteString", "(Lokio/Buffer;)Lokio/ByteString;", "(Lokio/Buffer;J)Lokio/ByteString;", "commonReadDecimalLong", "commonReadFully", "(Lokio/Buffer;[B)V", "(Lokio/Buffer;Lokio/Buffer;J)V", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "", "commonReadShort", "(Lokio/Buffer;)S", "", "commonReadUtf8", "(Lokio/Buffer;J)Ljava/lang/String;", "commonReadUtf8CodePoint", "commonReadUtf8Line", "(Lokio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "Lokio/Options;", "options", "commonSelect", "(Lokio/Buffer;Lokio/Options;)I", "commonSkip", "(Lokio/Buffer;J)V", "commonSnapshot", "(Lokio/Buffer;I)Lokio/ByteString;", "minimumCapacity", "commonWritableSegment", "(Lokio/Buffer;I)Lokio/Segment;", "source", "commonWrite", "(Lokio/Buffer;[B)Lokio/Buffer;", "(Lokio/Buffer;[BII)Lokio/Buffer;", "byteString", "(Lokio/Buffer;Lokio/ByteString;II)Lokio/Buffer;", "Lokio/Source;", "(Lokio/Buffer;Lokio/Source;J)Lokio/Buffer;", "commonWriteAll", "(Lokio/Buffer;Lokio/Source;)J", "commonWriteByte", "(Lokio/Buffer;I)Lokio/Buffer;", "v", "commonWriteDecimalLong", "(Lokio/Buffer;J)Lokio/Buffer;", "commonWriteHexadecimalUnsignedLong", "i", "commonWriteInt", "commonWriteLong", "s", "commonWriteShort", "string", "beginIndex", "endIndex", "commonWriteUtf8", "(Lokio/Buffer;Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "newline", "readUtf8Line", "T", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectTruncated", "selectPrefix", "(Lokio/Buffer;Lokio/Options;Z)I", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "J", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "I", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Buffer.kt */
public final class BufferKt {
    @NotNull
    public static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull Buffer buffer) {
        buffer.skip(buffer.size());
    }

    public static final long commonCompleteSegmentByteCount(@NotNull Buffer buffer) {
        long size = buffer.size();
        if (size == 0) {
            return 0;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.throwNpe();
        }
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? size : size - ((long) (i - segment2.pos));
    }

    @NotNull
    public static final Buffer commonCopy(@NotNull Buffer buffer) {
        Buffer buffer2 = new Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            if (segment3 == null) {
                Intrinsics.throwNpe();
            }
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final Buffer commonCopyTo(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j, long j2) {
        Util.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        buffer2.setSize$okio(buffer2.size() + j2);
        Segment segment = buffer.head;
        while (true) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            segment = segment.next;
        }
        while (j2 > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment sharedCopy = segment.sharedCopy();
            int i3 = sharedCopy.pos + ((int) j);
            sharedCopy.pos = i3;
            sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer2.head = sharedCopy;
            } else {
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                Segment segment3 = segment2.prev;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                segment3.push(sharedCopy);
            }
            j2 -= (long) (sharedCopy.limit - sharedCopy.pos);
            segment = segment.next;
            j = 0;
        }
        return buffer;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.Buffer r18, @org.jetbrains.annotations.Nullable java.lang.Object r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            long r5 = r18.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001d
            return r4
        L_0x001d:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            return r2
        L_0x0028:
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L_0x002f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x002f:
            okio.Segment r1 = r1.head
            if (r1 != 0) goto L_0x0036
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0036:
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L_0x003b:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0086
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004f:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006a
            byte[] r15 = r3.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0062
            return r4
        L_0x0062:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004f
        L_0x006a:
            int r13 = r3.limit
            if (r5 != r13) goto L_0x0077
            okio.Segment r3 = r3.next
            if (r3 != 0) goto L_0x0075
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0075:
            int r5 = r3.pos
        L_0x0077:
            int r13 = r1.limit
            if (r6 != r13) goto L_0x0084
            okio.Segment r1 = r1.next
            if (r1 != 0) goto L_0x0082
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0082:
            int r6 = r1.pos
        L_0x0084:
            long r9 = r9 + r11
            goto L_0x003b
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonEquals(okio.Buffer, java.lang.Object):boolean");
    }

    public static final byte commonGet(@NotNull Buffer buffer, long j) {
        Util.checkOffsetAndCount(buffer.size(), j, 1);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.throwNpe();
            return null.data[(int) ((((long) null.pos) + j) - -1)];
        } else if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (segment.limit - segment.pos)) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j2 = j3;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - j2)];
        }
    }

    public static final int commonHashCode(@NotNull Buffer buffer) {
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
        } while (segment != buffer.head);
        return i;
    }

    public static final long commonIndexOf(@NotNull Buffer buffer, byte b, long j, long j2) {
        Segment segment;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > buffer.size()) {
                j2 = buffer.size();
            }
            if (j == j2 || (segment = buffer.head) == null) {
                return -1;
            }
            if (buffer.size() - j < j) {
                j3 = buffer.size();
                while (j3 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j3 -= (long) (segment.limit - segment.pos);
                }
                if (segment != null) {
                    while (j3 < j2) {
                        byte[] bArr = segment.data;
                        int min = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                        i = (int) ((((long) segment.pos) + j) - j3);
                        while (i < min) {
                            if (bArr[i] != b) {
                                i++;
                            }
                        }
                        j3 += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j = j3;
                    }
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (segment.limit - segment.pos)) + j4;
                if (j5 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j4 = j5;
            }
            if (segment != null) {
                while (j3 < j2) {
                    byte[] bArr2 = segment.data;
                    int min2 = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                    int i2 = (int) ((((long) segment.pos) + j) - j3);
                    while (i < min2) {
                        if (bArr2[i] != b) {
                            i2 = i + 1;
                        }
                    }
                    j4 = j3 + ((long) (segment.limit - segment.pos));
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j = j4;
                }
            }
            return -1;
            return ((long) (i - segment.pos)) + j3;
        }
        throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    public static final long commonIndexOfElement(@NotNull Buffer buffer, @NotNull ByteString byteString, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = 0;
        if (j >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1;
            }
            if (buffer.size() - j < j) {
                j2 = buffer.size();
                while (j2 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j2 -= (long) (segment.limit - segment.pos);
                }
                if (segment != null) {
                    if (byteString.size() == 2) {
                        byte b = byteString.getByte(0);
                        byte b2 = byteString.getByte(1);
                        while (j2 < buffer.size()) {
                            byte[] bArr = segment.data;
                            i2 = (int) ((((long) segment.pos) + j) - j2);
                            int i4 = segment.limit;
                            while (i2 < i4) {
                                byte b3 = bArr[i2];
                                if (!(b3 == b || b3 == b2)) {
                                    i2++;
                                }
                            }
                            j2 += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j = j2;
                        }
                    } else {
                        byte[] internalArray$okio = byteString.internalArray$okio();
                        while (j2 < buffer.size()) {
                            byte[] bArr2 = segment.data;
                            i = (int) ((((long) segment.pos) + j) - j2);
                            int i5 = segment.limit;
                            while (i < i5) {
                                byte b4 = bArr2[i];
                                for (byte b5 : internalArray$okio) {
                                    if (b4 == b5) {
                                        i3 = segment.pos;
                                        return ((long) (i2 - i3)) + j2;
                                    }
                                }
                                i++;
                            }
                            j2 += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j = j2;
                        }
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (segment.limit - segment.pos)) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j3 = j4;
            }
            if (segment != null) {
                if (byteString.size() == 2) {
                    byte b6 = byteString.getByte(0);
                    byte b7 = byteString.getByte(1);
                    while (j2 < buffer.size()) {
                        byte[] bArr3 = segment.data;
                        int i6 = (int) ((((long) segment.pos) + j) - j2);
                        int i7 = segment.limit;
                        while (i2 < i7) {
                            byte b8 = bArr3[i2];
                            if (!(b8 == b6 || b8 == b7)) {
                                i6 = i2 + 1;
                            }
                        }
                        j3 = j2 + ((long) (segment.limit - segment.pos));
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j = j3;
                    }
                } else {
                    byte[] internalArray$okio2 = byteString.internalArray$okio();
                    while (j2 < buffer.size()) {
                        byte[] bArr4 = segment.data;
                        int i8 = (int) ((((long) segment.pos) + j) - j2);
                        int i9 = segment.limit;
                        while (i < i9) {
                            byte b9 = bArr4[i];
                            for (byte b10 : internalArray$okio2) {
                                if (b9 == b10) {
                                    i3 = segment.pos;
                                    return ((long) (i2 - i3)) + j2;
                                }
                            }
                            i8 = i + 1;
                        }
                        j3 = j2 + ((long) (segment.limit - segment.pos));
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j = j3;
                    }
                }
            }
            return -1;
            i3 = segment.pos;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    public static final boolean commonRangeEquals(@NotNull Buffer buffer, long j, @NotNull ByteString byteString, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (buffer.getByte(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(@NotNull Buffer buffer, @NotNull Sink sink) {
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final byte commonReadByte(@NotNull Buffer buffer) {
        if (buffer.size() != 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            buffer.setSize$okio(buffer.size() - 1);
            if (i3 == i2) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer buffer) {
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer buffer) {
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r10 != r11) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r0.head = r16.pop();
        okio.SegmentPool.INSTANCE.recycle(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        r16.pos = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r7 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r17) {
        /*
            r0 = r17
            long r1 = r17.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d5
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0011:
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0018
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0018:
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L_0x001e:
            r12 = 1
            if (r10 >= r11) goto L_0x00aa
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0075
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0075
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0048
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0042
            long r7 = (long) r14
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0083
        L_0x0048:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong((long) r3)
            okio.Buffer r0 = r0.writeByte((int) r13)
            if (r6 != 0) goto L_0x005a
            r0.readByte()
        L_0x005a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0075:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x008b
            if (r5 != 0) goto L_0x008b
            r6 = 1
            long r1 = r1 - r6
            r6 = r12
        L_0x0083:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x001e
        L_0x008b:
            if (r5 == 0) goto L_0x008f
            r7 = r12
            goto L_0x00ad
        L_0x008f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString((byte) r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            r15 = r7
            r16 = r8
        L_0x00ad:
            if (r10 != r11) goto L_0x00bd
            okio.Segment r8 = r16.pop()
            r0.head = r8
            okio.SegmentPool r8 = okio.SegmentPool.INSTANCE
            r9 = r16
            r8.recycle(r9)
            goto L_0x00c1
        L_0x00bd:
            r9 = r16
            r9.pos = r10
        L_0x00c1:
            if (r7 != 0) goto L_0x00c7
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0011
        L_0x00c7:
            long r1 = r17.size()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.setSize$okio(r1)
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            long r3 = -r3
        L_0x00d4:
            return r3
        L_0x00d5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = buffer.read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r8 != r9) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r14.head = r6.pop();
        okio.SegmentPool.INSTANCE.recycle(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        r6.pos = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r1 != false) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) {
        /*
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L_0x0014
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0014:
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L_0x001a:
            if (r8 >= r9) goto L_0x009c
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x002b
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x002b
            int r11 = r10 - r11
            goto L_0x0045
        L_0x002b:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x003a
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x003a
        L_0x0035:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0045
        L_0x003a:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007d
            goto L_0x0035
        L_0x0045:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0055
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001a
        L_0x0055:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong((long) r4)
            okio.Buffer r14 = r14.writeByte((int) r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x007d:
            if (r0 == 0) goto L_0x0081
            r1 = 1
            goto L_0x009c
        L_0x0081:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString((byte) r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x009c:
            if (r8 != r9) goto L_0x00aa
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool r7 = okio.SegmentPool.INSTANCE
            r7.recycle(r6)
            goto L_0x00ac
        L_0x00aa:
            r6.pos = r8
        L_0x00ac:
            if (r1 != 0) goto L_0x00b2
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L_0x000d
        L_0x00b2:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        L_0x00bc:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull Buffer buffer) {
        if (buffer.size() >= 4) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 4) {
                return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            buffer.setSize$okio(buffer.size() - 4);
            if (i6 == i2) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public static final long commonReadLong(@NotNull Buffer buffer) {
        if (buffer.size() >= 8) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 8) {
                return ((((long) buffer.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) buffer.readInt()));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            buffer.setSize$okio(buffer.size() - 8);
            if (i10 == i2) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public static final short commonReadShort(@NotNull Buffer buffer) {
        if (buffer.size() >= 2) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            buffer.setSize$okio(buffer.size() - 2);
            if (i4 == i2) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull Buffer buffer, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (buffer.size() < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            if (((long) i2) + j > ((long) segment.limit)) {
                return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, (Object) null);
            }
            int i3 = (int) j;
            String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i2, i2 + i3);
            segment.pos += i3;
            buffer.setSize$okio(buffer.size() - j);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            return commonToUtf8String;
        }
    }

    public static final int commonReadUtf8CodePoint(@NotNull Buffer buffer) {
        byte b;
        int i;
        byte b2;
        if (buffer.size() != 0) {
            byte b3 = buffer.getByte(0);
            int i2 = 1;
            if ((b3 & ByteCompanionObject.MIN_VALUE) == 0) {
                b2 = b3 & ByteCompanionObject.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((b3 & 224) == 192) {
                b2 = b3 & 31;
                i = 2;
                b = 128;
            } else if ((b3 & 240) == 224) {
                b2 = b3 & 15;
                i = 3;
                b = 2048;
            } else if ((b3 & 248) == 240) {
                b2 = b3 & 7;
                i = 4;
                b = 65536;
            } else {
                buffer.skip(1);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            long j = (long) i;
            if (buffer.size() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte b4 = buffer.getByte(j2);
                    if ((b4 & ExifInterface.MARKER_SOF0) == 128) {
                        b2 = (b2 << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
                        i2++;
                    } else {
                        buffer.skip(j2);
                        return Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                buffer.skip(j);
                if (b2 > 1114111) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + buffer.size() + " (to read code point prefixed 0x" + Util.toHexString(b3) + ')');
        }
        throw new EOFException();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull Buffer buffer) {
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull Buffer buffer, long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = buffer.indexOf(b, 0, j2);
            if (indexOf != -1) {
                return readUtf8Line(buffer, indexOf);
            }
            if (j2 < buffer.size() && buffer.getByte(j2 - 1) == ((byte) 13) && buffer.getByte(j2) == b) {
                return readUtf8Line(buffer, j2);
            }
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0, Math.min((long) 32, buffer.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public static final int commonSelect(@NotNull Buffer buffer, @NotNull Options options) {
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, (Object) null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip((long) options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(@NotNull Buffer buffer, long j) {
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment != null) {
                int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
                long j2 = (long) min;
                buffer.setSize$okio(buffer.size() - j2);
                j -= j2;
                int i = segment.pos + min;
                segment.pos = i;
                if (i == segment.limit) {
                    buffer.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer buffer) {
        if (buffer.size() <= ((long) Integer.MAX_VALUE)) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull Buffer buffer, int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            Segment segment = buffer.head;
            if (segment == null) {
                Segment take = SegmentPool.INSTANCE.take();
                buffer.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment segment2 = segment.prev;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.INSTANCE.take()) : segment2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull ByteString byteString, int i, int i2) {
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull Buffer buffer, @NotNull Source source) {
        long j = 0;
        while (true) {
            long read = source.read(buffer, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @NotNull
    public static final Buffer commonWriteByte(@NotNull Buffer buffer, int i) {
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0 A[LOOP:0: B:69:0x00ec->B:71:0x00f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0102  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final okio.Buffer commonWriteDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
        /*
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r13 = 48
            okio.Buffer r12 = r12.writeByte((int) r13)
            return r12
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r12 = r12.writeUtf8((java.lang.String) r13)
            return r12
        L_0x001d:
            r3 = r4
        L_0x001e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0068
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003e
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
            goto L_0x00df
        L_0x003b:
            r4 = 2
            goto L_0x00df
        L_0x003e:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0046
            r2 = 3
            goto L_0x0047
        L_0x0046:
            r2 = 4
        L_0x0047:
            r4 = r2
            goto L_0x00df
        L_0x004a:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r2 = 5
            goto L_0x0047
        L_0x005a:
            r2 = 6
            goto L_0x0047
        L_0x005c:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0065
            r2 = 7
            goto L_0x0047
        L_0x0065:
            r2 = 8
            goto L_0x0047
        L_0x0068:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0095
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0086
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r4 = 9
            goto L_0x00df
        L_0x0084:
            r4 = r5
            goto L_0x00df
        L_0x0086:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0092
            r2 = 11
            goto L_0x0047
        L_0x0092:
            r2 = 12
            goto L_0x0047
        L_0x0095:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            r4 = 13
            goto L_0x00df
        L_0x00aa:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b6
            r2 = 14
            goto L_0x0047
        L_0x00b6:
            r2 = 15
            goto L_0x0047
        L_0x00b9:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d1
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ce
            r4 = 16
            goto L_0x00df
        L_0x00ce:
            r4 = 17
            goto L_0x00df
        L_0x00d1:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dd
            r4 = 18
            goto L_0x00df
        L_0x00dd:
            r4 = 19
        L_0x00df:
            if (r3 == 0) goto L_0x00e3
            int r4 = r4 + 1
        L_0x00e3:
            okio.Segment r2 = r12.writableSegment$okio(r4)
            byte[] r6 = r2.data
            int r7 = r2.limit
            int r7 = r7 + r4
        L_0x00ec:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0100
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = getHEX_DIGIT_BYTES()
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00ec
        L_0x0100:
            if (r3 == 0) goto L_0x0109
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0109:
            int r13 = r2.limit
            int r13 = r13 + r4
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonWriteDecimalLong(okio.Buffer, long):okio.Buffer");
    }

    @NotNull
    public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer buffer, long j) {
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment writableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + ((long) i));
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteInt(@NotNull Buffer buffer, int i) {
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteLong(@NotNull Buffer buffer, long j) {
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        writableSegment$okio.limit = i8 + 1;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteShort(@NotNull Buffer buffer, int i) {
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteUtf8(@NotNull Buffer buffer, @NotNull String str, int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            Segment writableSegment$okio = buffer.writableSegment$okio(1);
                            byte[] bArr = writableSegment$okio.data;
                            int i3 = writableSegment$okio.limit - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = writableSegment$okio.limit;
                            int i6 = (i3 + i4) - i5;
                            writableSegment$okio.limit = i5 + i6;
                            buffer.setSize$okio(buffer.size() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                                byte[] bArr2 = writableSegment$okio2.data;
                                int i7 = writableSegment$okio2.limit;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                writableSegment$okio2.limit = i7 + 2;
                                buffer.setSize$okio(buffer.size() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                Segment writableSegment$okio3 = buffer.writableSegment$okio(3);
                                byte[] bArr3 = writableSegment$okio3.data;
                                int i8 = writableSegment$okio3.limit;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                writableSegment$okio3.limit = i8 + 3;
                                buffer.setSize$okio(buffer.size() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    buffer.writeByte(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    Segment writableSegment$okio4 = buffer.writableSegment$okio(4);
                                    byte[] bArr4 = writableSegment$okio4.data;
                                    int i11 = writableSegment$okio4.limit;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    writableSegment$okio4.limit = i11 + 4;
                                    buffer.setSize$okio(buffer.size() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return buffer;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @NotNull
    public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer buffer, int i) {
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            buffer.writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else if (i <= 1114111) {
            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit = i4 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i));
        }
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                byte[] bArr3 = segment.data;
                int i5 = segment.pos;
                bArr2 = bArr3;
                i = i5;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull Buffer buffer, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == ((byte) 13)) {
                String readUtf8 = buffer.readUtf8(j2);
                buffer.skip(2);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1);
        return readUtf82;
    }

    public static final <T> T seek(@NotNull Buffer buffer, long j, @NotNull Function2<? super Segment, ? super Long, ? extends T> function2) {
        Segment segment = buffer.head;
        if (segment == null) {
            return function2.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                size -= (long) (segment.limit - segment.pos);
            }
            return function2.invoke(segment, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (segment.limit - segment.pos)) + j2;
            if (j3 > j) {
                return function2.invoke(segment, Long.valueOf(j2));
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            j2 = j3;
        }
    }

    public static final int selectPrefix(@NotNull Buffer buffer, @NotNull Options options, boolean z) {
        int i;
        int i2;
        int i3;
        Segment segment;
        int i4;
        Segment segment2 = buffer.head;
        if (segment2 != null) {
            byte[] bArr = segment2.data;
            int i5 = segment2.pos;
            int i6 = segment2.limit;
            int[] trie$okio = options.getTrie$okio();
            Segment segment3 = segment2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = trie$okio[i8];
                int i11 = i9 + 1;
                int i12 = trie$okio[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (segment3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != trie$okio[i11]) {
                            return i7;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            if (segment3 == null) {
                                Intrinsics.throwNpe();
                            }
                            Segment segment4 = segment3.next;
                            if (segment4 == null) {
                                Intrinsics.throwNpe();
                            }
                            i4 = segment4.pos;
                            byte[] bArr2 = segment4.data;
                            i3 = segment4.limit;
                            if (segment4 != segment2) {
                                byte[] bArr3 = bArr2;
                                segment = segment4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                segment = null;
                            }
                        } else {
                            Segment segment5 = segment3;
                            i3 = i6;
                            i4 = i14;
                            segment = segment5;
                        }
                        if (z2) {
                            i2 = trie$okio[i15];
                            i = i4;
                            i6 = i3;
                            segment3 = segment;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        segment3 = segment;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == trie$okio[i11]) {
                            i2 = trie$okio[i11 + i10];
                            if (i == i6) {
                                segment3 = segment3.next;
                                if (segment3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                i = segment3.pos;
                                bArr = segment3.data;
                                i6 = segment3.limit;
                                if (segment3 == segment2) {
                                    segment3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    public static final int commonRead(@NotNull Buffer buffer, @NotNull byte[] bArr, int i, int i2) {
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i3 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + min);
        segment.pos += min;
        buffer.setSize$okio(buffer.size() - ((long) min));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.INSTANCE.recycle(segment);
        }
        return min;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer buffer, long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (buffer.size() >= j) {
            byte[] bArr = new byte[((int) j)];
            buffer.readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer buffer, long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (buffer.size() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(buffer.readByteArray(j));
        } else {
            ByteString snapshot = buffer.snapshot((int) j);
            buffer.skip(j);
            return snapshot;
        }
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        return buffer.write(bArr, 0, bArr.length);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull byte[] bArr, int i, int i2) {
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            ArraysKt___ArraysJvmKt.copyInto(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j) {
        if (buffer.size() >= j) {
            buffer2.write(buffer, j);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer buffer, int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(buffer.size(), 0, (long) i);
        Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        Segment segment2 = buffer.head;
        int i7 = 0;
        while (i2 < i) {
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull Source source, long j) {
        while (j > 0) {
            long read = source.read(buffer, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return buffer;
    }

    public static final long commonRead(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (buffer.size() == 0) {
            return -1;
        } else {
            if (j > buffer.size()) {
                j = buffer.size();
            }
            buffer2.write(buffer, j);
            return j;
        }
    }

    public static final void commonWrite(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j) {
        Segment segment;
        if (buffer2 != buffer) {
            Util.checkOffsetAndCount(buffer2.size(), 0, j);
            while (j > 0) {
                Segment segment2 = buffer2.head;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                int i = segment2.limit;
                Segment segment3 = buffer2.head;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                if (j < ((long) (i - segment3.pos))) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        if (segment4 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j) - ((long) (segment.shared ? 0 : segment.pos)) <= ((long) 8192)) {
                            Segment segment5 = buffer2.head;
                            if (segment5 == null) {
                                Intrinsics.throwNpe();
                            }
                            segment5.writeTo(segment, (int) j);
                            buffer2.setSize$okio(buffer2.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment6 = buffer2.head;
                    if (segment6 == null) {
                        Intrinsics.throwNpe();
                    }
                    buffer2.head = segment6.split((int) j);
                }
                Segment segment7 = buffer2.head;
                if (segment7 == null) {
                    Intrinsics.throwNpe();
                }
                long j2 = (long) (segment7.limit - segment7.pos);
                buffer2.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    if (segment8 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment9 = segment8.prev;
                    if (segment9 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment9.push(segment7).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j2);
                buffer.setSize$okio(buffer.size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static final long commonIndexOf(@NotNull Buffer buffer, @NotNull ByteString byteString, long j) {
        long j2;
        int i;
        long j3 = j;
        boolean z = true;
        if (byteString.size() > 0) {
            long j4 = 0;
            if (j3 >= 0) {
                Segment segment = buffer.head;
                if (segment == null) {
                    return -1;
                }
                if (buffer.size() - j3 < j3) {
                    j2 = buffer.size();
                    while (j2 > j3) {
                        segment = segment.prev;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j2 -= (long) (segment.limit - segment.pos);
                    }
                    if (segment == null) {
                        return -1;
                    }
                    byte[] internalArray$okio = byteString.internalArray$okio();
                    byte b = internalArray$okio[0];
                    int size = byteString.size();
                    long size2 = (buffer.size() - ((long) size)) + 1;
                    while (j2 < size2) {
                        byte[] bArr = segment.data;
                        int min = (int) Math.min((long) segment.limit, (((long) segment.pos) + size2) - j2);
                        i = (int) ((((long) segment.pos) + j3) - j2);
                        while (i < min) {
                            if (bArr[i] != b || !rangeEquals(segment, i + 1, internalArray$okio, 1, size)) {
                                i++;
                            }
                        }
                        j2 += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j3 = j2;
                    }
                    return -1;
                }
                while (true) {
                    long j5 = ((long) (segment.limit - segment.pos)) + j4;
                    if (j5 > j3) {
                        break;
                    }
                    boolean z2 = z;
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j4 = j5;
                    z = z2;
                }
                if (segment == null) {
                    return -1;
                }
                byte[] internalArray$okio2 = byteString.internalArray$okio();
                byte b2 = internalArray$okio2[0];
                int size3 = byteString.size();
                long size4 = (buffer.size() - ((long) size3)) + 1;
                long j6 = j4;
                while (j2 < size4) {
                    byte[] bArr2 = segment.data;
                    long j7 = size4;
                    int min2 = (int) Math.min((long) segment.limit, (((long) segment.pos) + size4) - j2);
                    int i2 = (int) ((((long) segment.pos) + j3) - j2);
                    while (i < min2) {
                        if (bArr2[i] == b2) {
                            if (rangeEquals(segment, i + 1, internalArray$okio2, 1, size3)) {
                            }
                        }
                        i2 = i + 1;
                    }
                    j6 = j2 + ((long) (segment.limit - segment.pos));
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    size4 = j7;
                    j3 = j6;
                }
                return -1;
                return ((long) (i - segment.pos)) + j2;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }
}

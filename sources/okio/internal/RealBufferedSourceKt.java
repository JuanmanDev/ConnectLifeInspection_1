package okio.internal;

import com.google.android.material.internal.CollapsingTextHelper;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\b¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\b¢\u0006\u0004\b\f\u0010\u0010\u001a$\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a4\u0010\u001a\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a$\u0010\u001e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\b\u001e\u0010!\u001a\u001c\u0010#\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\"H\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010'\u001a\u00020\u001c*\u00020\u0000H\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\b'\u0010)\u001a\u0014\u0010*\u001a\u00020\u000e*\u00020\u0000H\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010*\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\b*\u0010,\u001a\u0014\u0010-\u001a\u00020\t*\u00020\u0000H\b¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010/\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\b¢\u0006\u0004\b/\u00100\u001a$\u0010/\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\b/\u00101\u001a\u0014\u00102\u001a\u00020\t*\u00020\u0000H\b¢\u0006\u0004\b2\u0010.\u001a\u0014\u00103\u001a\u00020\u0017*\u00020\u0000H\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00105\u001a\u00020\u0017*\u00020\u0000H\b¢\u0006\u0004\b5\u00104\u001a\u0014\u00106\u001a\u00020\t*\u00020\u0000H\b¢\u0006\u0004\b6\u0010.\u001a\u0014\u00107\u001a\u00020\t*\u00020\u0000H\b¢\u0006\u0004\b7\u0010.\u001a\u0014\u00109\u001a\u000208*\u00020\u0000H\b¢\u0006\u0004\b9\u0010:\u001a\u0014\u0010;\u001a\u000208*\u00020\u0000H\b¢\u0006\u0004\b;\u0010:\u001a\u0014\u0010=\u001a\u00020<*\u00020\u0000H\b¢\u0006\u0004\b=\u0010>\u001a\u001c\u0010=\u001a\u00020<*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\b=\u0010?\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u0000H\b¢\u0006\u0004\b@\u00104\u001a\u0016\u0010A\u001a\u0004\u0018\u00010<*\u00020\u0000H\b¢\u0006\u0004\bA\u0010>\u001a\u001c\u0010C\u001a\u00020<*\u00020\u00002\u0006\u0010B\u001a\u00020\tH\b¢\u0006\u0004\bC\u0010?\u001a\u001c\u0010D\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010F\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\bF\u0010G\u001a\u001c\u0010J\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020HH\b¢\u0006\u0004\bJ\u0010K\u001a\u001c\u0010L\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\b¢\u0006\u0004\bL\u0010G\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020<*\u00020\u0000H\b¢\u0006\u0004\bP\u0010>¨\u0006Q"}, mo47991d2 = {"Lokio/RealBufferedSource;", "", "commonClose", "(Lokio/RealBufferedSource;)V", "", "commonExhausted", "(Lokio/RealBufferedSource;)Z", "", "b", "", "fromIndex", "toIndex", "commonIndexOf", "(Lokio/RealBufferedSource;BJJ)J", "Lokio/ByteString;", "bytes", "(Lokio/RealBufferedSource;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "Lokio/BufferedSource;", "commonPeek", "(Lokio/RealBufferedSource;)Lokio/BufferedSource;", "offset", "", "bytesOffset", "byteCount", "commonRangeEquals", "(Lokio/RealBufferedSource;JLokio/ByteString;II)Z", "", "sink", "commonRead", "(Lokio/RealBufferedSource;[BII)I", "Lokio/Buffer;", "(Lokio/RealBufferedSource;Lokio/Buffer;J)J", "Lokio/Sink;", "commonReadAll", "(Lokio/RealBufferedSource;Lokio/Sink;)J", "commonReadByte", "(Lokio/RealBufferedSource;)B", "commonReadByteArray", "(Lokio/RealBufferedSource;)[B", "(Lokio/RealBufferedSource;J)[B", "commonReadByteString", "(Lokio/RealBufferedSource;)Lokio/ByteString;", "(Lokio/RealBufferedSource;J)Lokio/ByteString;", "commonReadDecimalLong", "(Lokio/RealBufferedSource;)J", "commonReadFully", "(Lokio/RealBufferedSource;[B)V", "(Lokio/RealBufferedSource;Lokio/Buffer;J)V", "commonReadHexadecimalUnsignedLong", "commonReadInt", "(Lokio/RealBufferedSource;)I", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "", "commonReadShort", "(Lokio/RealBufferedSource;)S", "commonReadShortLe", "", "commonReadUtf8", "(Lokio/RealBufferedSource;)Ljava/lang/String;", "(Lokio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8CodePoint", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonRequest", "(Lokio/RealBufferedSource;J)Z", "commonRequire", "(Lokio/RealBufferedSource;J)V", "Lokio/Options;", "options", "commonSelect", "(Lokio/RealBufferedSource;Lokio/Options;)I", "commonSkip", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSource;)Lokio/Timeout;", "commonToString", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RealBufferedSource.kt */
public final class RealBufferedSourceKt {
    public static final void commonClose(@NotNull RealBufferedSource realBufferedSource) {
        if (!realBufferedSource.closed) {
            realBufferedSource.closed = true;
            realBufferedSource.source.close();
            realBufferedSource.bufferField.clear();
        }
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource realBufferedSource) {
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (!realBufferedSource.bufferField.exhausted() || realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        boolean z = true;
        if (!realBufferedSource.closed) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long indexOf = realBufferedSource.bufferField.indexOf(b, j, j2);
                    if (indexOf == -1) {
                        long size = realBufferedSource.bufferField.size();
                        if (size >= j2 || realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, size);
                    } else {
                        return indexOf;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOfElement(@NotNull RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j) {
        if (!realBufferedSource.closed) {
            while (true) {
                long indexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j);
                if (indexOfElement != -1) {
                    return indexOfElement;
                }
                long size = realBufferedSource.bufferField.size();
                if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource realBufferedSource) {
        return Okio.buffer((Source) new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource realBufferedSource, long j, @NotNull ByteString byteString, int i, int i2) {
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != byteString.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final long commonRead(@NotNull RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
            return -1;
        } else {
            return realBufferedSource.bufferField.read(buffer, Math.min(j, realBufferedSource.bufferField.size()));
        }
    }

    public static final long commonReadAll(@NotNull RealBufferedSource realBufferedSource, @NotNull Sink sink) {
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) != -1) {
            long completeSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(realBufferedSource.bufferField, completeSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = j + realBufferedSource.bufferField.size();
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(1);
        return realBufferedSource.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource, long j) {
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource, long j) {
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    public static final long commonReadDecimalLong(@NotNull RealBufferedSource realBufferedSource) {
        int i;
        realBufferedSource.require(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!realBufferedSource.request(j2)) {
                break;
            }
            byte b = realBufferedSource.bufferField.getByte(j);
            if ((b >= ((byte) 48) && b <= ((byte) 57)) || (j == 0 && b == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                String num = Integer.toString(b, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(16)));
                Intrinsics.checkExpressionValueIsNotNull(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource, @NotNull byte[] bArr) {
        try {
            realBufferedSource.require((long) bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int read = buffer.read(bArr, i, (int) buffer.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5) {
        /*
            r0 = 1
            r5.require(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L_0x0064
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r5.append(r0)
            r0 = 16
            int r0 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r0)
            int r0 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            java.lang.String r1 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r5)
            throw r0
        L_0x0064:
            okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.RealBufferedSourceKt.commonReadHexadecimalUnsignedLong(okio.RealBufferedSource):long");
    }

    public static final int commonReadInt(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(4);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(4);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(8);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(8);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(2);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(2);
        return realBufferedSource.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource, long j) {
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.require(1);
        byte b = realBufferedSource.bufferField.getByte(0);
        if ((b & 224) == 192) {
            realBufferedSource.require(2);
        } else if ((b & 240) == 224) {
            realBufferedSource.require(3);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource realBufferedSource) {
        long indexOf = realBufferedSource.indexOf((byte) 10);
        if (indexOf != -1) {
            return BufferKt.readUtf8Line(realBufferedSource.bufferField, indexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource realBufferedSource, long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long indexOf = realBufferedSource.indexOf(b, 0, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(realBufferedSource.bufferField, indexOf);
            }
            if (j2 < Long.MAX_VALUE && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == ((byte) 13) && realBufferedSource.request(1 + j2) && realBufferedSource.bufferField.getByte(j2) == b) {
                return BufferKt.readUtf8Line(realBufferedSource.bufferField, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = realBufferedSource.bufferField;
            buffer2.copyTo(buffer, 0, Math.min((long) 32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + CollapsingTextHelper.ELLIPSIS_NORMAL);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public static final boolean commonRequest(@NotNull RealBufferedSource realBufferedSource, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!realBufferedSource.closed) {
            while (realBufferedSource.bufferField.size() < j) {
                if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public static final void commonRequire(@NotNull RealBufferedSource realBufferedSource, long j) {
        if (!realBufferedSource.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull RealBufferedSource realBufferedSource, @NotNull Options options) {
        if (!realBufferedSource.closed) {
            do {
                int selectPrefix = BufferKt.selectPrefix(realBufferedSource.bufferField, options, true);
                if (selectPrefix != -2) {
                    if (selectPrefix == -1) {
                        return -1;
                    }
                    realBufferedSource.bufferField.skip((long) options.getByteStrings$okio()[selectPrefix].size());
                    return selectPrefix;
                }
            } while (realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void commonSkip(@NotNull RealBufferedSource realBufferedSource, long j) {
        if (!realBufferedSource.closed) {
            while (j > 0) {
                if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, realBufferedSource.bufferField.size());
                realBufferedSource.bufferField.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource realBufferedSource) {
        return realBufferedSource.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource realBufferedSource) {
        return "buffer(" + realBufferedSource.source + ')';
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource) {
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j) {
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j) {
        if (!realBufferedSource.closed) {
            while (true) {
                long indexOf = realBufferedSource.bufferField.indexOf(byteString, j);
                if (indexOf != -1) {
                    return indexOf;
                }
                long size = realBufferedSource.bufferField.size();
                if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (size - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public static final int commonRead(@NotNull RealBufferedSource realBufferedSource, @NotNull byte[] bArr, int i, int i2) {
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) 8192) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(bArr, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
    }
}

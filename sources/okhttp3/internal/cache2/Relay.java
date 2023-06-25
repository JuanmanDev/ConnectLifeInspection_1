package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 D:\u0002DEB5\b\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u00101\u001a\u0004\u0018\u00010\t\u0012\u0006\u00108\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\bB\u0010CJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0005R\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0013\u0010(\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u00105R\u0019\u00106\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u0010\u0015R\"\u00108\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0017\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u0005R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006F"}, mo47991d2 = {"Lokhttp3/internal/cache2/Relay;", "", "upstreamSize", "", "commit", "(J)V", "Lokio/ByteString;", "metadata", "()Lokio/ByteString;", "Lokio/Source;", "newSource", "()Lokio/Source;", "prefix", "metadataSize", "writeHeader", "(Lokio/ByteString;JJ)V", "writeMetadata", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "bufferMaxSize", "J", "getBufferMaxSize", "()J", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "Lokio/ByteString;", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "upstream", "Lokio/Source;", "getUpstream", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "upstreamPos", "getUpstreamPos", "setUpstreamPos", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "<init>", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "Companion", "RelaySource", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Relay.kt */
public final class Relay {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long FILE_HEADER_SIZE = 32;
    @NotNull
    @JvmField
    public static final ByteString PREFIX_CLEAN = ByteString.Companion.encodeUtf8("OkHttp cache v1\n");
    @NotNull
    @JvmField
    public static final ByteString PREFIX_DIRTY = ByteString.Companion.encodeUtf8("OkHttp DIRTY :(\n");
    public static final int SOURCE_FILE = 2;
    public static final int SOURCE_UPSTREAM = 1;
    @NotNull
    public final Buffer buffer;
    public final long bufferMaxSize;
    public boolean complete;
    @Nullable
    public RandomAccessFile file;
    public final ByteString metadata;
    public int sourceCount;
    @Nullable
    public Source upstream;
    @NotNull
    public final Buffer upstreamBuffer;
    public long upstreamPos;
    @Nullable
    public Thread upstreamReader;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, mo47991d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "Ljava/io/File;", "file", "Lokio/Source;", "upstream", "Lokio/ByteString;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lokio/Source;Lokio/ByteString;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Relay.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final Relay edit(@NotNull File file, @NotNull Source source, @NotNull ByteString byteString, long j) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, source, 0, byteString, j, (DefaultConstructorMarker) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        @NotNull
        public final Relay read(@NotNull File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkExpressionValueIsNotNull(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0, buffer, 32);
            if (!(!Intrinsics.areEqual((Object) buffer.readByteString((long) Relay.PREFIX_CLEAN.size()), (Object) Relay.PREFIX_CLEAN))) {
                long readLong = buffer.readLong();
                long readLong2 = buffer.readLong();
                Buffer buffer2 = new Buffer();
                fileOperator.read(readLong + 32, buffer2, readLong2);
                return new Relay(randomAccessFile, (Source) null, readLong, buffer2.readByteString(), 0, (DefaultConstructorMarker) null);
            }
            throw new IOException("unreadable cache file");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0016"}, mo47991d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "", "close", "()V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "Lokio/Timeout;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Relay.kt */
    public final class RelaySource implements Source {
        public FileOperator fileOperator;
        public long sourcePos;
        public final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            if (file == null) {
                Intrinsics.throwNpe();
            }
            FileChannel channel = file.getChannel();
            Intrinsics.checkExpressionValueIsNotNull(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (Relay.this.getSourceCount() == 0) {
                        RandomAccessFile file = Relay.this.getFile();
                        Relay.this.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
            if (r4 != true) goto L_0x00a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            r2 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r11 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
            if (r11 != null) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
            kotlin.jvm.internal.Intrinsics.throwNpe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
            r11.read(r1.sourcePos + 32, r20, r2);
            r1.sourcePos += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r0 = r1.this$0.getUpstream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
            if (r0 != null) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
            kotlin.jvm.internal.Intrinsics.throwNpe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
            r5 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
            if (r5 != -1) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
            r1.this$0.commit(r1.this$0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
            if (r0 == null) goto L_0x00e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
            r0.notifyAll();
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r2 = java.lang.Math.min(r5, r2);
            r1.this$0.getUpstreamBuffer().copyTo(r20, 0, r2);
            r1.sourcePos += r2;
            r13 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
            if (r13 != null) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x010d, code lost:
            kotlin.jvm.internal.Intrinsics.throwNpe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
            r13.write(r1.this$0.getUpstreamPos() + 32, r1.this$0.getUpstreamBuffer().clone(), r5);
            r7 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.this$0.getBuffer().write(r1.this$0.getUpstreamBuffer(), r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
            if (r1.this$0.getBuffer().size() <= r1.this$0.getBufferMaxSize()) goto L_0x0167;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x014d, code lost:
            r1.this$0.getBuffer().skip(r1.this$0.getBuffer().size() - r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0167, code lost:
            r0 = r1.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r5);
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
            r5 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017e, code lost:
            if (r0 == null) goto L_0x0187;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0180, code lost:
            r0.notifyAll();
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0185, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0186, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x018e, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0195, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0198, code lost:
            monitor-enter(r1.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r3 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a0, code lost:
            if (r3 == null) goto L_0x01a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a9, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01aa, code lost:
            r3.notifyAll();
            r3 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b0, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x000b
                r0 = r4
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                if (r0 == 0) goto L_0x01b7
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r5)
            L_0x0011:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b4 }
                long r8 = r1.sourcePos     // Catch:{ all -> 0x01b4 }
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                r6 = 2
                r7 = -1
                if (r0 == 0) goto L_0x005d
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                long r9 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b4 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                okio.Buffer r0 = r0.getBuffer()     // Catch:{ all -> 0x01b4 }
                long r11 = r0.size()     // Catch:{ all -> 0x01b4 }
                long r9 = r9 - r11
                long r11 = r1.sourcePos     // Catch:{ all -> 0x01b4 }
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x0039
                r4 = r6
                goto L_0x0080
            L_0x0039:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01b4 }
                long r11 = r1.sourcePos     // Catch:{ all -> 0x01b4 }
                long r6 = r6 - r11
                long r2 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x01b4 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                okio.Buffer r11 = r0.getBuffer()     // Catch:{ all -> 0x01b4 }
                long r6 = r1.sourcePos     // Catch:{ all -> 0x01b4 }
                long r13 = r6 - r9
                r12 = r20
                r15 = r2
                r11.copyTo((okio.Buffer) r12, (long) r13, (long) r15)     // Catch:{ all -> 0x01b4 }
                long r6 = r1.sourcePos     // Catch:{ all -> 0x01b4 }
                long r6 = r6 + r2
                r1.sourcePos = r6     // Catch:{ all -> 0x01b4 }
                monitor-exit(r5)
                return r2
            L_0x005d:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                boolean r0 = r0.getComplete()     // Catch:{ all -> 0x01b4 }
                if (r0 == 0) goto L_0x0067
                monitor-exit(r5)
                return r7
            L_0x0067:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                java.lang.Thread r0 = r0.getUpstreamReader()     // Catch:{ all -> 0x01b4 }
                if (r0 == 0) goto L_0x0077
                okio.Timeout r0 = r1.timeout     // Catch:{ all -> 0x01b4 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                r0.waitUntilNotified(r6)     // Catch:{ all -> 0x01b4 }
                goto L_0x0011
            L_0x0077:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b4 }
                java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01b4 }
                r0.setUpstreamReader(r9)     // Catch:{ all -> 0x01b4 }
            L_0x0080:
                monitor-exit(r5)
                r9 = 32
                if (r4 != r6) goto L_0x00a9
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this
                long r4 = r0.getUpstreamPos()
                long r6 = r1.sourcePos
                long r4 = r4 - r6
                long r2 = java.lang.Math.min(r2, r4)
                okhttp3.internal.cache2.FileOperator r11 = r1.fileOperator
                if (r11 != 0) goto L_0x0099
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0099:
                long r4 = r1.sourcePos
                long r12 = r4 + r9
                r14 = r20
                r15 = r2
                r11.read(r12, r14, r15)
                long r4 = r1.sourcePos
                long r4 = r4 + r2
                r1.sourcePos = r4
                return r2
            L_0x00a9:
                r4 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                okio.Source r0 = r0.getUpstream()     // Catch:{ all -> 0x0195 }
                if (r0 != 0) goto L_0x00b5
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0195 }
            L_0x00b5:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                okio.Buffer r5 = r5.getUpstreamBuffer()     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                long r11 = r6.getBufferMaxSize()     // Catch:{ all -> 0x0195 }
                long r5 = r0.read(r5, r11)     // Catch:{ all -> 0x0195 }
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 != 0) goto L_0x00f2
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                long r2 = r2.getUpstreamPos()     // Catch:{ all -> 0x0195 }
                r0.commit(r2)     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00ef }
                r0.setUpstreamReader(r4)     // Catch:{ all -> 0x00ef }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00ef }
                if (r0 == 0) goto L_0x00e7
                r0.notifyAll()     // Catch:{ all -> 0x00ef }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00ef }
                monitor-exit(r2)
                return r7
            L_0x00e7:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x00ef }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00ef }
                throw r0     // Catch:{ all -> 0x00ef }
            L_0x00ef:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f2:
                long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                okio.Buffer r11 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0195 }
                r13 = 0
                r12 = r20
                r15 = r2
                r11.copyTo((okio.Buffer) r12, (long) r13, (long) r15)     // Catch:{ all -> 0x0195 }
                long r7 = r1.sourcePos     // Catch:{ all -> 0x0195 }
                long r7 = r7 + r2
                r1.sourcePos = r7     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x0195 }
                if (r13 != 0) goto L_0x0110
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0195 }
            L_0x0110:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                long r7 = r0.getUpstreamPos()     // Catch:{ all -> 0x0195 }
                long r14 = r7 + r9
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                okio.Buffer r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0195 }
                okio.Buffer r16 = r0.clone()     // Catch:{ all -> 0x0195 }
                r17 = r5
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r7 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0195 }
                monitor-enter(r7)     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                okio.Buffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0192 }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                okio.Buffer r8 = r8.getUpstreamBuffer()     // Catch:{ all -> 0x0192 }
                r0.write((okio.Buffer) r8, (long) r5)     // Catch:{ all -> 0x0192 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                okio.Buffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0192 }
                long r8 = r0.size()     // Catch:{ all -> 0x0192 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                long r10 = r0.getBufferMaxSize()     // Catch:{ all -> 0x0192 }
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x0167
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                okio.Buffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0192 }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                okio.Buffer r8 = r8.getBuffer()     // Catch:{ all -> 0x0192 }
                long r8 = r8.size()     // Catch:{ all -> 0x0192 }
                okhttp3.internal.cache2.Relay r10 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                long r10 = r10.getBufferMaxSize()     // Catch:{ all -> 0x0192 }
                long r8 = r8 - r10
                r0.skip(r8)     // Catch:{ all -> 0x0192 }
            L_0x0167:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0192 }
                long r8 = r0.getUpstreamPos()     // Catch:{ all -> 0x0192 }
                long r8 = r8 + r5
                r0.setUpstreamPos(r8)     // Catch:{ all -> 0x0192 }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0192 }
                monitor-exit(r7)     // Catch:{ all -> 0x0195 }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r5)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018f }
                r0.setUpstreamReader(r4)     // Catch:{ all -> 0x018f }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x018f }
                if (r0 == 0) goto L_0x0187
                r0.notifyAll()     // Catch:{ all -> 0x018f }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x018f }
                monitor-exit(r5)
                return r2
            L_0x0187:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x018f }
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r2)     // Catch:{ all -> 0x018f }
                throw r0     // Catch:{ all -> 0x018f }
            L_0x018f:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            L_0x0192:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0195 }
                throw r0     // Catch:{ all -> 0x0195 }
            L_0x0195:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b1 }
                r3.setUpstreamReader(r4)     // Catch:{ all -> 0x01b1 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01b1 }
                if (r3 != 0) goto L_0x01aa
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01b1 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01b1 }
                throw r0     // Catch:{ all -> 0x01b1 }
            L_0x01aa:
                r3.notifyAll()     // Catch:{ all -> 0x01b1 }
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01b1 }
                monitor-exit(r2)
                throw r0
            L_0x01b1:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01b4:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            L_0x01b7:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.Buffer, long):long");
        }

        @NotNull
        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    /* access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j, long j2) {
        Buffer buffer2 = new Buffer();
        buffer2.write(byteString);
        buffer2.writeLong(j);
        buffer2.writeLong(j2);
        if (buffer2.size() == 32) {
            RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile == null) {
                Intrinsics.throwNpe();
            }
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkExpressionValueIsNotNull(channel, "file!!.channel");
            new FileOperator(channel).write(0, buffer2, 32);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) {
        Buffer buffer2 = new Buffer();
        buffer2.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            Intrinsics.throwNpe();
        }
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkExpressionValueIsNotNull(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, buffer2, (long) this.metadata.size());
    }

    public final void commit(long j) {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            Intrinsics.throwNpe();
        }
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        if (randomAccessFile2 == null) {
            Intrinsics.throwNpe();
        }
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly((Closeable) source);
        }
        this.upstream = null;
    }

    @NotNull
    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @Nullable
    public final Source getUpstream() {
        return this.upstream;
    }

    @NotNull
    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    @NotNull
    public final ByteString metadata() {
        return this.metadata;
    }

    @Nullable
    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(@Nullable Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, source, j, byteString, j2);
    }
}

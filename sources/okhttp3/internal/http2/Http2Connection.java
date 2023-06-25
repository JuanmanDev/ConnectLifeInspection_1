package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 º\u00012\u00020\u0001:\b»\u0001º\u0001¼\u0001½\u0001B\u0015\b\u0000\u0012\b\u0010·\u0001\u001a\u00030¶\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J#\u0010 \u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J/\u0010,\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010+J-\u0010/\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010)\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\b4\u00105J+\u00107\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b7\u0010!J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0011H\u0000¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020\u0011H\u0000¢\u0006\u0004\b;\u0010\u0015J\u000f\u0010>\u001a\u00020\u0002H\u0000¢\u0006\u0004\b=\u0010\u0004J\u0015\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0006¢\u0006\u0004\bD\u0010EJ#\u0010I\u001a\u00020\u00022\b\b\u0002\u0010F\u001a\u00020\u00182\b\b\u0002\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ\u0017\u0010N\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0016H\u0000¢\u0006\u0004\bL\u0010MJ/\u0010R\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00182\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010(\u001a\u00020\u0016¢\u0006\u0004\bR\u0010SJ-\u0010W\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00182\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0004\bU\u0010VJ\r\u0010X\u001a\u00020\u0002¢\u0006\u0004\bX\u0010\u0004J%\u0010X\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\u0011¢\u0006\u0004\bX\u0010\\J\r\u0010]\u001a\u00020\u0002¢\u0006\u0004\b]\u0010\u0004J\u001f\u0010_\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0006H\u0000¢\u0006\u0004\b^\u00105J\u001f\u0010a\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\b`\u00105J\u001f\u0010e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010b\u001a\u00020\u0016H\u0000¢\u0006\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u001c\u0010i\u001a\u00020\u00188\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010n\u001a\u00020m8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00110r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010gR\u0016\u0010v\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010gR\u0016\u0010w\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010gR\u0016\u0010x\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010gR\u0016\u0010y\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010gR\u0016\u0010z\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010jR\"\u0010{\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010$\"\u0004\b~\u0010R\"\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010$\"\u0005\b\u0001\u0010R\u001e\u0010\u0001\u001a\u00020?8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020?8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010BR\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u000f\n\u0005\b\u0001\u0010g\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u000f\n\u0005\b\u0001\u0010g\u001a\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u00070\u0001R\u00020\u00008\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010 \u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u0001R\"\u0010¢\u0001\u001a\u00030¡\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R.\u0010§\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130¦\u00018\u0000@\u0000X\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010H\u001a\u00020G8\u0002@\u0002X\u0004¢\u0006\u0007\n\u0005\bH\u0010«\u0001R)\u0010¬\u0001\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u000f\n\u0005\b¬\u0001\u0010g\u001a\u0006\b­\u0001\u0010\u0001R)\u0010®\u0001\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u000f\n\u0005\b®\u0001\u0010g\u001a\u0006\b¯\u0001\u0010\u0001R\u001f\u0010±\u0001\u001a\u00030°\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010µ\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010\u0001¨\u0006¾\u0001"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", "awaitPong", "()V", "close", "Lokhttp3/internal/http2/ErrorCode;", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "e", "failConnection", "(Ljava/io/IOException;)V", "flush", "", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "", "nowNs", "", "isHealthy", "(J)Z", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "out", "newStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "openStreamCount", "()I", "streamId", "Lokio/BufferedSource;", "source", "byteCount", "inFinished", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "errorCode", "pushResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "pushResetLater", "pushStream", "pushedStream$okhttp", "(I)Z", "pushedStream", "removeStream$okhttp", "removeStream", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "statusCode", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "start", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "read", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "outFinished", "Lokio/Buffer;", "buffer", "writeData", "(IZLokio/Buffer;J)V", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "writePing", "reply", "payload1", "payload2", "(ZII)V", "writePingAndAwaitPong", "writeSynReset$okhttp", "writeSynReset", "writeSynResetLater$okhttp", "writeSynResetLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "awaitPingsSent", "J", "awaitPongsReceived", "client", "Z", "getClient$okhttp", "()Z", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "", "currentPushRequests", "Ljava/util/Set;", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Http2Connection.kt */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    public long awaitPingsSent;
    public long awaitPongsReceived;
    public final boolean client;
    @NotNull
    public final String connectionName;
    public final Set<Integer> currentPushRequests;
    public long degradedPingsSent;
    public long degradedPongDeadlineNs;
    public long degradedPongsReceived;
    public long intervalPingsSent;
    public long intervalPongsReceived;
    public boolean isShutdown;
    public int lastGoodStreamId;
    @NotNull
    public final Listener listener;
    public int nextStreamId;
    @NotNull
    public final Settings okHttpSettings;
    @NotNull
    public Settings peerSettings;
    public final PushObserver pushObserver;
    public final TaskQueue pushQueue;
    public long readBytesAcknowledged;
    public long readBytesTotal;
    @NotNull
    public final ReaderRunnable readerRunnable;
    public final TaskQueue settingsListenerQueue;
    @NotNull
    public final Socket socket;
    @NotNull
    public final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    public final TaskRunner taskRunner;
    public long writeBytesMaximum;
    public long writeBytesTotal;
    @NotNull
    public final Http2Writer writer;
    public final TaskQueue writerQueue;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010GJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u000e\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010B\u001a\u00020A8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "(Ljava/net/Socket;Ljava/lang/String;Lokio/BufferedSource;Lokio/BufferedSink;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Http2Connection.kt */
    public static final class Builder {
        public boolean client;
        @NotNull
        public String connectionName;
        @NotNull
        public Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        public int pingIntervalMillis;
        @NotNull
        public PushObserver pushObserver = PushObserver.CANCEL;
        @NotNull
        public BufferedSink sink;
        @NotNull
        public Socket socket;
        @NotNull
        public BufferedSource source;
        @NotNull
        public final TaskRunner taskRunner;

        public Builder(boolean z, @NotNull TaskRunner taskRunner2) {
            this.client = z;
            this.taskRunner = taskRunner2;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket2, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i, Object obj) {
            if ((i & 2) != 0) {
                str = Util.peerName(socket2);
            }
            if ((i & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket2));
            }
            if ((i & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket2));
            }
            return builder.socket(socket2, str, bufferedSource, bufferedSink);
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            }
            return str;
        }

        @NotNull
        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        @NotNull
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        @NotNull
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
            }
            return bufferedSink;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket2 = this.socket;
            if (socket2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
            }
            return socket2;
        }

        @NotNull
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
            }
            return bufferedSource;
        }

        @NotNull
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        @NotNull
        public final Builder listener(@NotNull Listener listener2) {
            this.listener = listener2;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver2) {
            this.pushObserver = pushObserver2;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            this.connectionName = str;
        }

        public final void setListener$okhttp(@NotNull Listener listener2) {
            this.listener = listener2;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver2) {
            this.pushObserver = pushObserver2;
        }

        public final void setSink$okhttp(@NotNull BufferedSink bufferedSink) {
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(@NotNull Socket socket2) {
            this.socket = socket2;
        }

        public final void setSource$okhttp(@NotNull BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        @NotNull
        @JvmOverloads
        public final Builder socket(@NotNull Socket socket2) {
            return socket$default(this, socket2, (String) null, (BufferedSource) null, (BufferedSink) null, 14, (Object) null);
        }

        @NotNull
        @JvmOverloads
        public final Builder socket(@NotNull Socket socket2, @NotNull String str) {
            return socket$default(this, socket2, str, (BufferedSource) null, (BufferedSink) null, 12, (Object) null);
        }

        @NotNull
        @JvmOverloads
        public final Builder socket(@NotNull Socket socket2, @NotNull String str, @NotNull BufferedSource bufferedSource) {
            return socket$default(this, socket2, str, bufferedSource, (BufferedSink) null, 8, (Object) null);
        }

        @NotNull
        @JvmOverloads
        public final Builder socket(@NotNull Socket socket2, @NotNull String str, @NotNull BufferedSource bufferedSource, @NotNull BufferedSink bufferedSink) {
            String str2;
            this.socket = socket2;
            if (this.client) {
                str2 = Util.okHttpName + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.connectionName = str2;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0003¨\u0006\u000f"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "AWAIT_PING", "I", "Lokhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Http2Connection.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000e:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "<init>", "()V", "Companion", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Http2Connection.kt */
    public static abstract class Listener {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        @NotNull
        @JvmField
        public static final Listener REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
        /* compiled from: Http2Connection.kt */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
        }

        public abstract void onStream(@NotNull Http2Stream http2Stream);
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bC\u0010DJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J5\u0010(\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010\u0005J'\u0010.\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J/\u00103\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J-\u00107\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010<\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010=R\u001c\u0010?\u001a\u00020>8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, mo47991d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "okhttp3/internal/http2/Http2Reader$Handler", "Lkotlin/jvm/functions/Function0;", "", "ackSettings", "()V", "", "streamId", "", "origin", "Lokio/ByteString;", "protocol", "host", "port", "", "maxAge", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V", "", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "applyAndAckSettings", "(ZLokhttp3/internal/http2/Settings;)V", "inFinished", "Lokio/BufferedSource;", "source", "length", "data", "(ZILokio/BufferedSource;I)V", "lastGoodStreamId", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "invoke", "ack", "payload1", "payload2", "ping", "(ZII)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "windowSizeIncrement", "windowUpdate", "(IJ)V", "Lokhttp3/internal/http2/Http2Reader;", "reader", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Http2Connection.kt */
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
        @NotNull
        public final Http2Reader reader;

        public ReaderRunnable(@NotNull Http2Reader http2Reader) {
            this.reader = http2Reader;
        }

        public void ackSettings() {
        }

        public void alternateService(int i, @NotNull String str, @NotNull ByteString byteString, @NotNull String str2, int i2, long j) {
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void applyAndAckSettings(boolean r22, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                kotlin.jvm.internal.Ref$LongRef r13 = new kotlin.jvm.internal.Ref$LongRef
                r13.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
                r14.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
                r15.<init>()
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this
                okhttp3.internal.http2.Http2Writer r16 = r1.getWriter()
                monitor-enter(r16)
                okhttp3.internal.http2.Http2Connection r11 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0109 }
                monitor-enter(r11)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Settings r1 = r1.getPeerSettings()     // Catch:{ all -> 0x0104 }
                if (r22 == 0) goto L_0x0028
                r15.element = r0     // Catch:{ all -> 0x0104 }
                goto L_0x0035
            L_0x0028:
                okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings     // Catch:{ all -> 0x0104 }
                r2.<init>()     // Catch:{ all -> 0x0104 }
                r2.merge(r1)     // Catch:{ all -> 0x0104 }
                r2.merge(r0)     // Catch:{ all -> 0x0104 }
                r15.element = r2     // Catch:{ all -> 0x0104 }
            L_0x0035:
                T r2 = r15.element     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch:{ all -> 0x0104 }
                int r2 = r2.getInitialWindowSize()     // Catch:{ all -> 0x0104 }
                long r2 = (long) r2     // Catch:{ all -> 0x0104 }
                int r1 = r1.getInitialWindowSize()     // Catch:{ all -> 0x0104 }
                long r4 = (long) r1     // Catch:{ all -> 0x0104 }
                long r2 = r2 - r4
                r13.element = r2     // Catch:{ all -> 0x0104 }
                r9 = 0
                int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                r8 = 0
                if (r1 == 0) goto L_0x0077
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch:{ all -> 0x0104 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0104 }
                if (r1 == 0) goto L_0x005a
                goto L_0x0077
            L_0x005a:
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch:{ all -> 0x0104 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Http2Stream[] r2 = new okhttp3.internal.http2.Http2Stream[r8]     // Catch:{ all -> 0x0104 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0104 }
                if (r1 == 0) goto L_0x006f
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1     // Catch:{ all -> 0x0104 }
                goto L_0x0078
            L_0x006f:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x0104 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0104 }
                throw r0     // Catch:{ all -> 0x0104 }
            L_0x0077:
                r1 = 0
            L_0x0078:
                r14.element = r1     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                T r2 = r15.element     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch:{ all -> 0x0104 }
                r1.setPeerSettings(r2)     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                okhttp3.internal.concurrent.TaskQueue r7 = r1.settingsListenerQueue     // Catch:{ all -> 0x0104 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
                r1.<init>()     // Catch:{ all -> 0x0104 }
                okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0104 }
                java.lang.String r2 = r2.getConnectionName$okhttp()     // Catch:{ all -> 0x0104 }
                r1.append(r2)     // Catch:{ all -> 0x0104 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0104 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0104 }
                r5 = 1
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 r6 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0104 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r22
                r19 = r8
                r8 = r15
                r9 = r23
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0102 }
                r1 = r17
                r0 = r18
                r2 = 0
                r0.schedule(r1, r2)     // Catch:{ all -> 0x0102 }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0102 }
                monitor-exit(r20)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ IOException -> 0x00d4 }
                okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()     // Catch:{ IOException -> 0x00d4 }
                T r1 = r15.element     // Catch:{ IOException -> 0x00d4 }
                okhttp3.internal.http2.Settings r1 = (okhttp3.internal.http2.Settings) r1     // Catch:{ IOException -> 0x00d4 }
                r0.applyAndAckSettings(r1)     // Catch:{ IOException -> 0x00d4 }
                goto L_0x00da
            L_0x00d4:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0109 }
                r1.failConnection(r0)     // Catch:{ all -> 0x0109 }
            L_0x00da:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0109 }
                monitor-exit(r16)
                T r0 = r14.element
                r1 = r0
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1
                if (r1 == 0) goto L_0x0101
                okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0
                if (r0 != 0) goto L_0x00eb
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00eb:
                int r1 = r0.length
                r8 = r19
            L_0x00ee:
                if (r8 >= r1) goto L_0x0101
                r2 = r0[r8]
                monitor-enter(r2)
                long r3 = r13.element     // Catch:{ all -> 0x00fe }
                r2.addBytesToWriteWindow(r3)     // Catch:{ all -> 0x00fe }
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00fe }
                monitor-exit(r2)
                int r8 = r8 + 1
                goto L_0x00ee
            L_0x00fe:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0101:
                return
            L_0x0102:
                r0 = move-exception
                goto L_0x0107
            L_0x0104:
                r0 = move-exception
                r20 = r11
            L_0x0107:
                monitor-exit(r20)     // Catch:{ all -> 0x0109 }
                throw r0     // Catch:{ all -> 0x0109 }
            L_0x0109:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.applyAndAckSettings(boolean, okhttp3.internal.http2.Settings):void");
        }

        public void data(boolean z, int i, @NotNull BufferedSource bufferedSource, int i2) {
            if (Http2Connection.this.pushedStream$okhttp(i)) {
                Http2Connection.this.pushDataLater$okhttp(i, bufferedSource, i2, z);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                Http2Connection.this.updateConnectionFlowControl$okhttp(j);
                bufferedSource.skip(j);
                return;
            }
            stream.receiveData(bufferedSource, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @NotNull
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        public void goAway(int i, @NotNull ErrorCode errorCode, @NotNull ByteString byteString) {
            int i2;
            Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (Http2Connection.this) {
                Object[] array = Http2Connection.this.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    Http2Connection.this.isShutdown = true;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        public void headers(boolean z, int i, int i2, @NotNull List<Header> list) {
            boolean z2 = z;
            int i3 = i;
            if (Http2Connection.this.pushedStream$okhttp(i3)) {
                Http2Connection.this.pushHeadersLater$okhttp(i3, list, z2);
                return;
            }
            List<Header> list2 = list;
            synchronized (Http2Connection.this) {
                Http2Stream stream = Http2Connection.this.getStream(i3);
                if (stream != null) {
                    Unit unit = Unit.INSTANCE;
                    stream.receiveHeaders(Util.toHeaders(list), z2);
                } else if (!Http2Connection.this.isShutdown) {
                    if (i3 > Http2Connection.this.getLastGoodStreamId$okhttp()) {
                        if (i3 % 2 != Http2Connection.this.getNextStreamId$okhttp() % 2) {
                            Http2Stream http2Stream = new Http2Stream(i, Http2Connection.this, false, z, Util.toHeaders(list));
                            Http2Connection.this.setLastGoodStreamId$okhttp(i3);
                            Http2Connection.this.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                            String str = Http2Connection.this.getConnectionName$okhttp() + '[' + i3 + "] onStream";
                            Http2Connection.this.taskRunner.newQueue().schedule(new C9971xe89ff7cd(str, true, str, true, http2Stream, this, stream, i, list, z), 0);
                        }
                    }
                }
            }
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (Http2Connection.this) {
                    if (i == 1) {
                        Http2Connection http2Connection = Http2Connection.this;
                        http2Connection.intervalPongsReceived = http2Connection.intervalPongsReceived + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            Http2Connection http2Connection2 = Http2Connection.this;
                            http2Connection2.awaitPongsReceived = http2Connection2.awaitPongsReceived + 1;
                            Http2Connection http2Connection3 = Http2Connection.this;
                            if (http2Connection3 != null) {
                                http2Connection3.notifyAll();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Http2Connection http2Connection4 = Http2Connection.this;
                        http2Connection4.degradedPongsReceived = http2Connection4.degradedPongsReceived + 1;
                    }
                }
                return;
            }
            String str = Http2Connection.this.getConnectionName$okhttp() + " ping";
            Http2Connection.this.writerQueue.schedule(new Http2Connection$ReaderRunnable$ping$$inlined$execute$1(str, true, str, true, this, i, i2), 0);
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        public void pushPromise(int i, int i2, @NotNull List<Header> list) {
            Http2Connection.this.pushRequestLater$okhttp(i2, list);
        }

        public void rstStream(int i, @NotNull ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream$okhttp(i)) {
                Http2Connection.this.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = Http2Connection.this.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        public void settings(boolean z, @NotNull Settings settings) {
            String str = Http2Connection.this.getConnectionName$okhttp() + " applyAndAckSettings";
            Http2Connection.this.writerQueue.schedule(new Http2Connection$ReaderRunnable$settings$$inlined$execute$1(str, true, str, true, this, z, settings), 0);
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Http2Connection http2Connection2 = Http2Connection.this;
                    if (http2Connection2 != null) {
                        http2Connection2.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        public void invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode3;
                try {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection.this.close$okhttp(errorCode, errorCode2, e);
                    Util.closeQuietly((Closeable) this.reader);
                } catch (Throwable th) {
                    th = th;
                    Http2Connection.this.close$okhttp(errorCode, errorCode3, e);
                    Util.closeQuietly((Closeable) this.reader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode3;
                Http2Connection.this.close$okhttp(errorCode, errorCode3, e);
                Util.closeQuietly((Closeable) this.reader);
                throw th;
            }
            Http2Connection.this.close$okhttp(errorCode, errorCode2, e);
            Util.closeQuietly((Closeable) this.reader);
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@NotNull Builder builder) {
        this.client = builder.getClient$okhttp();
        this.listener = builder.getListener$okhttp();
        this.connectionName = builder.getConnectionName$okhttp();
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        this.writerQueue = taskRunner$okhttp.newQueue();
        this.pushQueue = this.taskRunner.newQueue();
        this.settingsListenerQueue = this.taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = (long) settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), this.client);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.getSource$okhttp(), this.client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) builder.getPingIntervalMillis$okhttp());
            String str = this.connectionName + " ping";
            this.writerQueue.schedule(new Http2Connection$$special$$inlined$schedule$1(str, str, this, nanos), nanos);
        }
    }

    /* access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner2 = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner2);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0037:
            r3.shutdown(r4)     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0065
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch:{ all -> 0x008f }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x008f }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch:{ all -> 0x008f }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x005d
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch:{ all -> 0x008f }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x008f }
            r0.clear()     // Catch:{ all -> 0x008f }
            goto L_0x0065
        L_0x005d:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x008f }
            throw r4     // Catch:{ all -> 0x008f }
        L_0x0065:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0075
            int r0 = r4.length
        L_0x006b:
            if (r1 >= r0) goto L_0x0075
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x006b
        L_0x0075:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch:{ IOException -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            java.net.Socket r4 = r3.socket     // Catch:{ IOException -> 0x007f }
            r4.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.writerQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.pushQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.settingsListenerQueue
            r4.shutdown()
            return
        L_0x008f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.close$okhttp(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    @NotNull
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    @NotNull
    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @NotNull
    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    @Nullable
    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    @NotNull
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived >= this.degradedPingsSent || j < this.degradedPongDeadlineNs) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List<Header> list, boolean z) {
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i, @NotNull BufferedSource bufferedSource, int i2, boolean z) {
        Buffer buffer = new Buffer();
        long j = (long) i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        String str = this.connectionName + '[' + i + "] onData";
        this.pushQueue.schedule(new Http2Connection$pushDataLater$$inlined$execute$1(str, true, str, true, this, i, buffer, i2, z), 0);
    }

    public final void pushHeadersLater$okhttp(int i, @NotNull List<Header> list, boolean z) {
        String str = this.connectionName + '[' + i + "] onHeaders";
        this.pushQueue.schedule(new Http2Connection$pushHeadersLater$$inlined$execute$1(str, true, str, true, this, i, list, z), 0);
    }

    public final void pushRequestLater$okhttp(int i, @NotNull List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            String str = this.connectionName + '[' + i + "] onRequest";
            this.pushQueue.schedule(new Http2Connection$pushRequestLater$$inlined$execute$1(str, true, str, true, this, i, list), 0);
        }
    }

    public final void pushResetLater$okhttp(int i, @NotNull ErrorCode errorCode) {
        String str = this.connectionName + '[' + i + "] onReset";
        this.pushQueue.schedule(new Http2Connection$pushResetLater$$inlined$execute$1(str, true, str, true, this, i, errorCode), 0);
    }

    @NotNull
    public final Http2Stream pushStream(int i, @NotNull List<Header> list, boolean z) {
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @Nullable
    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            if (this.degradedPongsReceived >= this.degradedPingsSent) {
                this.degradedPingsSent++;
                this.degradedPongDeadlineNs = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.INSTANCE;
                String str = this.connectionName + " ping";
                this.writerQueue.schedule(new Http2Connection$sendDegradedPingLater$$inlined$execute$1(str, true, str, true, this), 0);
            }
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        this.peerSettings = settings;
    }

    public final void setSettings(@NotNull Settings settings) {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void shutdown(@NotNull ErrorCode errorCode) {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.isShutdown = true;
                    int i = this.lastGoodStreamId;
                    Unit unit = Unit.INSTANCE;
                    this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    @JvmOverloads
    public final void start() {
        start$default(this, false, (TaskRunner) null, 3, (Object) null);
    }

    @JvmOverloads
    public final void start(boolean z) {
        start$default(this, z, (TaskRunner) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void start(boolean z, @NotNull TaskRunner taskRunner2) {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - 65535));
            }
        }
        TaskQueue newQueue = taskRunner2.newQueue();
        String str = this.connectionName;
        newQueue.schedule(new TaskQueue$execute$1(this.readerRunnable, str, true, str, true), 0);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = (int) java.lang.Math.min(r13, r9.writeBytesMaximum - r9.writeBytesTotal);
        r2.element = r4;
        r4 = java.lang.Math.min(r4, r9.writer.maxDataLength());
        r2.element = r4;
        r9.writeBytesTotal += (long) r4;
        r5 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r10, boolean r11, @org.jetbrains.annotations.Nullable okio.Buffer r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r13 = r9.writer
            r13.data(r11, r10, r12, r3)
            return
        L_0x000d:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007c
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            monitor-enter(r9)
        L_0x0017:
            long r4 = r9.writeBytesTotal     // Catch:{ InterruptedException -> 0x006d }
            long r6 = r9.writeBytesMaximum     // Catch:{ InterruptedException -> 0x006d }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0037
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r9.streams     // Catch:{ InterruptedException -> 0x006d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x006d }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x006d }
            if (r4 == 0) goto L_0x002f
            r9.wait()     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x0017
        L_0x002f:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006d }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x006d }
            throw r10     // Catch:{ InterruptedException -> 0x006d }
        L_0x0037:
            long r4 = r9.writeBytesMaximum     // Catch:{ all -> 0x006b }
            long r6 = r9.writeBytesTotal     // Catch:{ all -> 0x006b }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r13, r4)     // Catch:{ all -> 0x006b }
            int r4 = (int) r4     // Catch:{ all -> 0x006b }
            r2.element = r4     // Catch:{ all -> 0x006b }
            okhttp3.internal.http2.Http2Writer r5 = r9.writer     // Catch:{ all -> 0x006b }
            int r5 = r5.maxDataLength()     // Catch:{ all -> 0x006b }
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x006b }
            r2.element = r4     // Catch:{ all -> 0x006b }
            long r5 = r9.writeBytesTotal     // Catch:{ all -> 0x006b }
            long r7 = (long) r4     // Catch:{ all -> 0x006b }
            long r5 = r5 + r7
            r9.writeBytesTotal = r5     // Catch:{ all -> 0x006b }
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            long r4 = (long) r4
            long r13 = r13 - r4
            okhttp3.internal.http2.Http2Writer r4 = r9.writer
            if (r11 == 0) goto L_0x0064
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = r3
        L_0x0065:
            int r2 = r2.element
            r4.data(r5, r10, r12, r2)
            goto L_0x000d
        L_0x006b:
            r10 = move-exception
            goto L_0x007a
        L_0x006d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006b }
            r10.interrupt()     // Catch:{ all -> 0x006b }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x006b }
            r10.<init>()     // Catch:{ all -> 0x006b }
            throw r10     // Catch:{ all -> 0x006b }
        L_0x007a:
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, @NotNull List<Header> list) {
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, @NotNull ErrorCode errorCode) {
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, @NotNull ErrorCode errorCode) {
        String str = this.connectionName + '[' + i + "] writeSynReset";
        this.writerQueue.schedule(new Http2Connection$writeSynResetLater$$inlined$execute$1(str, true, str, true, this, i, errorCode), 0);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        String str = this.connectionName + '[' + i + "] windowUpdate";
        this.writerQueue.schedule(new Http2Connection$writeWindowUpdateLater$$inlined$execute$1(str, true, str, true, this, i, j), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0088 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0085 }
            r10.shutdown(r0)     // Catch:{ all -> 0x0085 }
        L_0x0013:
            boolean r0 = r10.isShutdown     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x007f
            int r8 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            int r0 = r0 + 2
            r10.nextStreamId = r0     // Catch:{ all -> 0x0085 }
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x0085 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0085 }
            r0 = 1
            if (r13 == 0) goto L_0x0043
            long r1 = r10.writeBytesTotal     // Catch:{ all -> 0x0085 }
            long r3 = r10.writeBytesMaximum     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0043
            long r1 = r9.getWriteBytesTotal()     // Catch:{ all -> 0x0085 }
            long r3 = r9.getWriteBytesMaximum()     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = 0
            goto L_0x0044
        L_0x0043:
            r13 = r0
        L_0x0044:
            boolean r1 = r9.isOpen()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0085 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0085 }
        L_0x0053:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            if (r11 != 0) goto L_0x005e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch:{ all -> 0x0088 }
            r11.headers(r6, r8, r12)     // Catch:{ all -> 0x0088 }
            goto L_0x0068
        L_0x005e:
            boolean r1 = r10.client     // Catch:{ all -> 0x0088 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch:{ all -> 0x0088 }
            r0.pushPromise(r11, r8, r12)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0088 }
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0072
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L_0x0072:
            return r9
        L_0x0073:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0088 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0088 }
            r12.<init>(r11)     // Catch:{ all -> 0x0088 }
            throw r12     // Catch:{ all -> 0x0088 }
        L_0x007f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0085 }
            r11.<init>()     // Catch:{ all -> 0x0085 }
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}

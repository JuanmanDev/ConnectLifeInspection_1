package okhttp3.internal.p700ws;

import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p700ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\n\u0001\u0001\u0001\u0001\u0001BC\u0012\u0006\u0010\u001a\u00020~\u0012\u0006\u0010g\u001a\u00020?\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010i\u001a\u00020\u0003\u0012\b\u0010W\u001a\u0004\u0018\u00010N\u0012\u0006\u0010e\u001a\u00020\u0003¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00072\n\u0010\"\u001a\u00060 j\u0002`!2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u000bJ\u001f\u0010+\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b.\u00102J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000200H\u0016¢\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u00020\u00072\u0006\u00103\u001a\u000200H\u0016¢\u0006\u0004\b5\u00102J\u0015\u00106\u001a\u00020\u00172\u0006\u00103\u001a\u000200¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0003H\u0016¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010=J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u000bJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\bC\u00107J\u001f\u0010C\u001a\u00020\u00172\u0006\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010GJ\r\u0010H\u001a\u00020\u0013¢\u0006\u0004\bH\u0010=J\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\u000bJ\u000f\u0010K\u001a\u00020\u0017H\u0000¢\u0006\u0004\bJ\u00109J\u000f\u0010M\u001a\u00020\u0007H\u0000¢\u0006\u0004\bL\u0010\u000bJ\u0013\u0010O\u001a\u00020\u0017*\u00020NH\u0002¢\u0006\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010RR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010]\u001a\u00020\\8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020b0a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010[R\u0016\u0010g\u001a\u00020?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010fR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u0002000a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010dR\u0016\u0010:\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010fR\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010[R\u0016\u0010<\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010rR\u0016\u0010>\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010rR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010rR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0001"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "okhttp3/internal/ws/WebSocketReader$FrameCallback", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)V", "cancel", "()V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "code", "", "reason", "", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;)V", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "onReadClose", "(ILjava/lang/String;)V", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/ByteString;", "bytes", "(Lokio/ByteString;)V", "payload", "onReadPing", "onReadPong", "pong", "(Lokio/ByteString;)Z", "processNextFrame", "()Z", "queueSize", "()J", "receivedPingCount", "()I", "receivedPongCount", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "runWriter", "send", "(Ljava/lang/String;)Z", "data", "formatOpcode", "(Lokio/ByteString;I)Z", "sentPingCount", "tearDown", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Lokhttp3/internal/ws/WebSocketExtensions;", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "awaitingPong", "Z", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "enqueuedClose", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "failed", "key", "Ljava/lang/String;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "minimumDeflateSize", "J", "originalRequest", "Lokhttp3/Request;", "pingIntervalMillis", "pongQueue", "Ljava/util/Random;", "random", "Ljava/util/Random;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "I", "receivedCloseReason", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    public static final long MAX_QUEUE_SIZE = 16777216;
    public static final List<Protocol> ONLY_HTTP1 = CollectionsKt__CollectionsJVMKt.listOf(Protocol.HTTP_1_1);
    public boolean awaitingPong;
    public Call call;
    public boolean enqueuedClose;
    public WebSocketExtensions extensions;
    public boolean failed;
    public final String key;
    @NotNull
    public final WebSocketListener listener;
    public final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    public long minimumDeflateSize;
    public String name;
    public final Request originalRequest;
    public final long pingIntervalMillis;
    public final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    public long queueSize;
    public final Random random;
    public WebSocketReader reader;
    public int receivedCloseCode = -1;
    public String receivedCloseReason;
    public int receivedPingCount;
    public int receivedPongCount;
    public int sentPingCount;
    public Streams streams;
    public TaskQueue taskQueue;
    public WebSocketWriter writer;
    public Task writerTask;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "cancelAfterCloseMillis", "J", "getCancelAfterCloseMillis", "()J", "", "code", "I", "getCode", "()I", "Lokio/ByteString;", "reason", "Lokio/ByteString;", "getReason", "()Lokio/ByteString;", "<init>", "(ILokio/ByteString;J)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* compiled from: RealWebSocket.kt */
    public static final class Close {
        public final long cancelAfterCloseMillis;
        public final int code;
        @Nullable
        public final ByteString reason;

        public Close(int i, @Nullable ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final ByteString getReason() {
            return this.reason;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lokhttp3/Protocol;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* compiled from: RealWebSocket.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "Lokio/ByteString;", "data", "Lokio/ByteString;", "getData", "()Lokio/ByteString;", "", "formatOpcode", "I", "getFormatOpcode", "()I", "<init>", "(ILokio/ByteString;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* compiled from: RealWebSocket.kt */
    public static final class Message {
        @NotNull
        public final ByteString data;
        public final int formatOpcode;

        public Message(int i, @NotNull ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }

        @NotNull
        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Z", "getClient", "()Z", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "<init>", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* compiled from: RealWebSocket.kt */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        @NotNull
        public final BufferedSink sink;
        @NotNull
        public final BufferedSource source;

        public Streams(boolean z, @NotNull BufferedSource bufferedSource, @NotNull BufferedSink bufferedSink) {
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final BufferedSink getSink() {
            return this.sink;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo47991d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* renamed from: okhttp3.internal.ws.RealWebSocket$WriterTask */
    /* compiled from: RealWebSocket.kt */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, (DefaultConstructorMarker) null);
        }

        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0;
                }
                return -1;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, (Response) null);
                return -1;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request request, @NotNull WebSocketListener webSocketListener, @NotNull Random random2, long j, @Nullable WebSocketExtensions webSocketExtensions, long j2) {
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        if (Intrinsics.areEqual((Object) ShareTarget.METHOD_GET, (Object) this.originalRequest.method())) {
            ByteString.Companion companion = ByteString.Companion;
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, (Object) null).base64();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + this.originalRequest.method()).toString());
    }

    /* access modifiers changed from: private */
    public final boolean isValid(@NotNull WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        if (8 > intValue || 15 < intValue) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0, 2, (Object) null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void awaitTermination(long j, @NotNull TimeUnit timeUnit) {
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    public void cancel() {
        Call call2 = this.call;
        if (call2 == null) {
            Intrinsics.throwNpe();
        }
        call2.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) {
        if (response.code() == 101) {
            String header$default = Response.header$default(response, WebSocketHandler.HEADER_CONNECTION, (String) null, 2, (Object) null);
            if (StringsKt__StringsJVMKt.equals("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (StringsKt__StringsJVMKt.equals(WebSocketHandler.HEADER_UPGRADE_WEBSOCKET, header$default2, true)) {
                    String header$default3 = Response.header$default(response, WebSocketHandler.HEADER_SEC_WEBSOCKET_ACCEPT, (String) null, 2, (Object) null);
                    ByteString.Companion companion = ByteString.Companion;
                    String base64 = companion.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (!Intrinsics.areEqual((Object) base64, (Object) header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header$default3 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    public boolean close(int i, @Nullable String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(@NotNull OkHttpClient okHttpClient) {
        if (this.originalRequest.header(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (Response) null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", WebSocketHandler.HEADER_UPGRADE_WEBSOCKET).header(WebSocketHandler.HEADER_CONNECTION, "Upgrade").header(WebSocketHandler.HEADER_SEC_WEBSOCKET_KEY, this.key).header(WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION, WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13).header(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        if (realCall == null) {
            Intrinsics.throwNpe();
        }
        realCall.enqueue(new RealWebSocket$connect$1(this, build2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4.listener.onFailure(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r0 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r2 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r3 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(@org.jetbrains.annotations.NotNull java.lang.Exception r5, @org.jetbrains.annotations.Nullable okhttp3.Response r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.failed     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.failed = r0     // Catch:{ all -> 0x0045 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x0045 }
            r1 = 0
            r4.streams = r1     // Catch:{ all -> 0x0045 }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x0045 }
            r4.reader = r1     // Catch:{ all -> 0x0045 }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x0045 }
            r4.writer = r1     // Catch:{ all -> 0x0045 }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x0045 }
            r1.shutdown()     // Catch:{ all -> 0x0045 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.listener     // Catch:{ all -> 0x0034 }
            r1.onFailure(r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0029
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x002e:
            if (r3 == 0) goto L_0x0033
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0033:
            return
        L_0x0034:
            r5 = move-exception
            if (r0 == 0) goto L_0x003a
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x003f:
            if (r3 == 0) goto L_0x0044
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0044:
            throw r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    @NotNull
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String str, @NotNull Streams streams2) {
        String str2 = str;
        WebSocketExtensions webSocketExtensions = this.extensions;
        if (webSocketExtensions == null) {
            Intrinsics.throwNpe();
        }
        synchronized (this) {
            this.name = str2;
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams2.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            if (this.pingIntervalMillis != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
                TaskQueue taskQueue2 = this.taskQueue;
                String str3 = str2 + " ping";
                RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 = r1;
                RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$12 = new RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1(str3, str3, nanos, this, str, streams2, webSocketExtensions);
                taskQueue2.schedule(realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams2.getClient()));
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                Intrinsics.throwNpe();
            }
            webSocketReader.processNextFrame();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [okhttp3.internal.ws.WebSocketWriter, okhttp3.internal.ws.WebSocketReader, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReadClose(int r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto L_0x0007
            r3 = r0
            goto L_0x0008
        L_0x0007:
            r3 = r1
        L_0x0008:
            if (r3 == 0) goto L_0x0078
            monitor-enter(r4)
            int r3 = r4.receivedCloseCode     // Catch:{ all -> 0x0075 }
            if (r3 != r2) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0069
            r4.receivedCloseCode = r5     // Catch:{ all -> 0x0075 }
            r4.receivedCloseReason = r6     // Catch:{ all -> 0x0075 }
            boolean r0 = r4.enqueuedClose     // Catch:{ all -> 0x0075 }
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0037
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x0075 }
            r4.streams = r1     // Catch:{ all -> 0x0075 }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x0075 }
            r4.reader = r1     // Catch:{ all -> 0x0075 }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x0075 }
            r4.writer = r1     // Catch:{ all -> 0x0075 }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x0075 }
            r1.shutdown()     // Catch:{ all -> 0x0075 }
            r1 = r0
            goto L_0x0039
        L_0x0037:
            r2 = r1
            r3 = r2
        L_0x0039:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x0058 }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0048
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x0058 }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x0058 }
        L_0x0048:
            if (r1 == 0) goto L_0x004d
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0057:
            return
        L_0x0058:
            r5 = move-exception
            if (r1 == 0) goto L_0x005e
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0068:
            throw r5
        L_0x0069:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0075 }
            r6.<init>(r5)     // Catch:{ all -> 0x0075 }
            throw r6     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0078:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.onReadClose(int, java.lang.String):void");
    }

    public void onReadMessage(@NotNull String str) {
        this.listener.onMessage((WebSocket) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.failed     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.runWriter()     // Catch:{ all -> 0x0024 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(@NotNull ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull ByteString byteString) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                Intrinsics.throwNpe();
            }
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    public boolean send(@NotNull String str) {
        return send(ByteString.Companion.encodeUtf8(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01dd, code lost:
        if (r1 != null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01df, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        if (r3 == null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        if (r1 != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        r1.writePong(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0109, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        if ((r0.element instanceof okhttp3.internal.p700ws.RealWebSocket.Message) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        r0 = r0.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0113, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r0 = (okhttp3.internal.p700ws.RealWebSocket.Message) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        if (r1 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011c, code lost:
        r1.writeMessageFrame(r0.getFormatOpcode(), r0.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        monitor-enter(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r15.queueSize -= (long) r0.getData().size();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        monitor-exit(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        throw new kotlin.TypeCastException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0149, code lost:
        if ((r0.element instanceof okhttp3.internal.p700ws.RealWebSocket.Close) == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014b, code lost:
        r0 = r0.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014d, code lost:
        if (r0 == null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
        r0 = (okhttp3.internal.p700ws.RealWebSocket.Close) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        if (r1 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0156, code lost:
        r1.writeClose(r0.getCode(), r0.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0167, code lost:
        if (((okhttp3.internal.p700ws.RealWebSocket.Streams) r1.element) == null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0169, code lost:
        r0 = r15.listener;
        r2 = r26.element;
        r3 = (java.lang.String) r25.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0175, code lost:
        if (r3 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0177, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017a, code lost:
        r0.onClosed(r15, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017d, code lost:
        r1 = (okhttp3.internal.p700ws.RealWebSocket.Streams) r1.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0182, code lost:
        if (r1 == null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0184, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        r1 = (okhttp3.internal.p700ws.WebSocketReader) r23.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018d, code lost:
        if (r1 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018f, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0192, code lost:
        r1 = (okhttp3.internal.p700ws.WebSocketWriter) r22.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0198, code lost:
        if (r1 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019a, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
        r3 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a4, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b1, code lost:
        throw new kotlin.TypeCastException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b2, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01bd, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01be, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c1, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c7, code lost:
        r1 = (okhttp3.internal.p700ws.RealWebSocket.Streams) r1.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cb, code lost:
        if (r1 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cd, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d0, code lost:
        r1 = (okhttp3.internal.p700ws.WebSocketReader) r2.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d4, code lost:
        if (r1 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d6, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d9, code lost:
        r1 = (okhttp3.internal.p700ws.WebSocketWriter) r3.element;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() {
        /*
            r27 = this;
            r15 = r27
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r1 = 0
            r0.element = r1
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            r2 = -1
            r14.element = r2
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r13.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r11.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r10.element = r1
            monitor-enter(r27)
            boolean r3 = r15.failed     // Catch:{ all -> 0x01e3 }
            r4 = 0
            if (r3 == 0) goto L_0x0036
            monitor-exit(r27)
            return r4
        L_0x0036:
            okhttp3.internal.ws.WebSocketWriter r9 = r15.writer     // Catch:{ all -> 0x01e3 }
            java.util.ArrayDeque<okio.ByteString> r3 = r15.pongQueue     // Catch:{ all -> 0x01e3 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01e3 }
            r8 = r3
            okio.ByteString r8 = (okio.ByteString) r8     // Catch:{ all -> 0x01e3 }
            if (r8 != 0) goto L_0x00e6
            java.util.ArrayDeque<java.lang.Object> r3 = r15.messageAndCloseQueue     // Catch:{ all -> 0x01e3 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01e3 }
            r0.element = r3     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3 instanceof okhttp3.internal.p700ws.RealWebSocket.Close     // Catch:{ all -> 0x01e3 }
            if (r5 == 0) goto L_0x00d4
            int r3 = r15.receivedCloseCode     // Catch:{ all -> 0x01e3 }
            r14.element = r3     // Catch:{ all -> 0x01e3 }
            java.lang.String r4 = r15.receivedCloseReason     // Catch:{ all -> 0x01e3 }
            r13.element = r4     // Catch:{ all -> 0x01e3 }
            if (r3 == r2) goto L_0x0072
            okhttp3.internal.ws.RealWebSocket$Streams r2 = r15.streams     // Catch:{ all -> 0x01e3 }
            r12.element = r2     // Catch:{ all -> 0x01e3 }
            r15.streams = r1     // Catch:{ all -> 0x01e3 }
            okhttp3.internal.ws.WebSocketReader r2 = r15.reader     // Catch:{ all -> 0x01e3 }
            r11.element = r2     // Catch:{ all -> 0x01e3 }
            r15.reader = r1     // Catch:{ all -> 0x01e3 }
            okhttp3.internal.ws.WebSocketWriter r2 = r15.writer     // Catch:{ all -> 0x01e3 }
            r10.element = r2     // Catch:{ all -> 0x01e3 }
            r15.writer = r1     // Catch:{ all -> 0x01e3 }
            okhttp3.internal.concurrent.TaskQueue r1 = r15.taskQueue     // Catch:{ all -> 0x01e3 }
            r1.shutdown()     // Catch:{ all -> 0x01e3 }
            goto L_0x00e6
        L_0x0072:
            T r1 = r0.element     // Catch:{ all -> 0x01e3 }
            if (r1 == 0) goto L_0x00cc
            okhttp3.internal.ws.RealWebSocket$Close r1 = (okhttp3.internal.p700ws.RealWebSocket.Close) r1     // Catch:{ all -> 0x01e3 }
            long r1 = r1.getCancelAfterCloseMillis()     // Catch:{ all -> 0x01e3 }
            okhttp3.internal.concurrent.TaskQueue r7 = r15.taskQueue     // Catch:{ all -> 0x01e3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
            r3.<init>()     // Catch:{ all -> 0x01e3 }
            java.lang.String r4 = r15.name     // Catch:{ all -> 0x01e3 }
            r3.append(r4)     // Catch:{ all -> 0x01e3 }
            java.lang.String r4 = " cancel"
            r3.append(r4)     // Catch:{ all -> 0x01e3 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x01e3 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01e3 }
            long r5 = r3.toNanos(r1)     // Catch:{ all -> 0x01e3 }
            r16 = 1
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x01e3 }
            r1 = r3
            r2 = r4
            r17 = r3
            r3 = r16
            r18 = r5
            r5 = r16
            r6 = r27
            r20 = r7
            r7 = r9
            r16 = r8
            r21 = r9
            r9 = r0
            r22 = r10
            r10 = r14
            r23 = r11
            r11 = r13
            r24 = r12
            r25 = r13
            r13 = r23
            r26 = r14
            r14 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01e3 }
            r4 = r17
            r2 = r18
            r1 = r20
            r1.schedule(r4, r2)     // Catch:{ all -> 0x01e3 }
            goto L_0x00f4
        L_0x00cc:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01e3 }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch:{ all -> 0x01e3 }
            throw r0     // Catch:{ all -> 0x01e3 }
        L_0x00d4:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            if (r3 != 0) goto L_0x00f4
            monitor-exit(r27)
            return r4
        L_0x00e6:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
        L_0x00f4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01e3 }
            monitor-exit(r27)
            r3 = r16
            if (r3 == 0) goto L_0x0109
            r1 = r21
            if (r1 != 0) goto L_0x0102
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01c0 }
        L_0x0102:
            r1.writePong(r3)     // Catch:{ all -> 0x01c0 }
        L_0x0105:
            r1 = r24
            goto L_0x017d
        L_0x0109:
            r1 = r21
            T r2 = r0.element     // Catch:{ all -> 0x01c0 }
            boolean r2 = r2 instanceof okhttp3.internal.p700ws.RealWebSocket.Message     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x0145
            T r0 = r0.element     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x013d
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.p700ws.RealWebSocket.Message) r0     // Catch:{ all -> 0x01c0 }
            if (r1 != 0) goto L_0x011c
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01c0 }
        L_0x011c:
            int r2 = r0.getFormatOpcode()     // Catch:{ all -> 0x01c0 }
            okio.ByteString r3 = r0.getData()     // Catch:{ all -> 0x01c0 }
            r1.writeMessageFrame(r2, r3)     // Catch:{ all -> 0x01c0 }
            monitor-enter(r27)     // Catch:{ all -> 0x01c0 }
            long r1 = r15.queueSize     // Catch:{ all -> 0x013a }
            okio.ByteString r0 = r0.getData()     // Catch:{ all -> 0x013a }
            int r0 = r0.size()     // Catch:{ all -> 0x013a }
            long r3 = (long) r0     // Catch:{ all -> 0x013a }
            long r1 = r1 - r3
            r15.queueSize = r1     // Catch:{ all -> 0x013a }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x013a }
            monitor-exit(r27)     // Catch:{ all -> 0x01c0 }
            goto L_0x0105
        L_0x013a:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x013d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r0.<init>(r1)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x0145:
            T r2 = r0.element     // Catch:{ all -> 0x01c0 }
            boolean r2 = r2 instanceof okhttp3.internal.p700ws.RealWebSocket.Close     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x01b2
            T r0 = r0.element     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x01a4
            okhttp3.internal.ws.RealWebSocket$Close r0 = (okhttp3.internal.p700ws.RealWebSocket.Close) r0     // Catch:{ all -> 0x01c0 }
            if (r1 != 0) goto L_0x0156
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01c0 }
        L_0x0156:
            int r2 = r0.getCode()     // Catch:{ all -> 0x01c0 }
            okio.ByteString r0 = r0.getReason()     // Catch:{ all -> 0x01c0 }
            r1.writeClose(r2, r0)     // Catch:{ all -> 0x01c0 }
            r1 = r24
            T r0 = r1.element     // Catch:{ all -> 0x019e }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = (okhttp3.internal.p700ws.RealWebSocket.Streams) r0     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x017d
            okhttp3.WebSocketListener r0 = r15.listener     // Catch:{ all -> 0x019e }
            r2 = r26
            int r2 = r2.element     // Catch:{ all -> 0x019e }
            r3 = r25
            T r3 = r3.element     // Catch:{ all -> 0x019e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x019e }
            if (r3 != 0) goto L_0x017a
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x019e }
        L_0x017a:
            r0.onClosed(r15, r2, r3)     // Catch:{ all -> 0x019e }
        L_0x017d:
            r0 = 1
            T r1 = r1.element
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.p700ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L_0x0187
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0187:
            r2 = r23
            T r1 = r2.element
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.p700ws.WebSocketReader) r1
            if (r1 == 0) goto L_0x0192
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0192:
            r3 = r22
            T r1 = r3.element
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.p700ws.WebSocketWriter) r1
            if (r1 == 0) goto L_0x019d
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x019d:
            return r0
        L_0x019e:
            r0 = move-exception
            r3 = r22
            r2 = r23
            goto L_0x01c7
        L_0x01a4:
            r3 = r22
            r2 = r23
            r1 = r24
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r4)     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01b2:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x01be }
            r0.<init>()     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01be:
            r0 = move-exception
            goto L_0x01c7
        L_0x01c0:
            r0 = move-exception
            r3 = r22
            r2 = r23
            r1 = r24
        L_0x01c7:
            T r1 = r1.element
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.p700ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L_0x01d0
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01d0:
            T r1 = r2.element
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.p700ws.WebSocketReader) r1
            if (r1 == 0) goto L_0x01d9
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01d9:
            T r1 = r3.element
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.p700ws.WebSocketWriter) r1
            if (r1 == 0) goto L_0x01e2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01e2:
            throw r0
        L_0x01e3:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r1 == -1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.pingIntervalMillis + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.writePing(okio.ByteString.EMPTY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x0059 }
            r2 = -1
            if (r1 == 0) goto L_0x0013
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x0059 }
            r7.awaitingPong = r4     // Catch:{ all -> 0x0059 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004c
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L_0x004c:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch:{ IOException -> 0x0052 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
        L_0x0056:
            return
        L_0x0057:
            monitor-exit(r7)
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.writePingFrame$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean close(int r8, @org.jetbrains.annotations.Nullable java.lang.String r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p700ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x0059 }
            r0.validateCloseCode(r8)     // Catch:{ all -> 0x0059 }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x003d
            okio.ByteString$Companion r0 = okio.ByteString.Companion     // Catch:{ all -> 0x0059 }
            okio.ByteString r0 = r0.encodeUtf8(r9)     // Catch:{ all -> 0x0059 }
            int r3 = r0.size()     // Catch:{ all -> 0x0059 }
            long r3 = (long) r3     // Catch:{ all -> 0x0059 }
            r5 = 123(0x7b, double:6.1E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x001e
            r3 = r2
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r8.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "reason.size() > 123: "
            r8.append(r10)     // Catch:{ all -> 0x0059 }
            r8.append(r9)     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0059 }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0059 }
            r9.<init>(r8)     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x003d:
            boolean r9 = r7.failed     // Catch:{ all -> 0x0059 }
            if (r9 != 0) goto L_0x0057
            boolean r9 = r7.enqueuedClose     // Catch:{ all -> 0x0059 }
            if (r9 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            r7.enqueuedClose = r2     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque<java.lang.Object> r9 = r7.messageAndCloseQueue     // Catch:{ all -> 0x0059 }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x0059 }
            r1.<init>(r8, r0, r10)     // Catch:{ all -> 0x0059 }
            r9.add(r1)     // Catch:{ all -> 0x0059 }
            r7.runWriter()     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            return r2
        L_0x0057:
            monitor-exit(r7)
            return r1
        L_0x0059:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    public void onReadMessage(@NotNull ByteString byteString) {
        this.listener.onMessage((WebSocket) this, byteString);
    }

    public boolean send(@NotNull ByteString byteString) {
        return send(byteString, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean send(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p700ws.RealWebSocket.send(okio.ByteString, int):boolean");
    }
}

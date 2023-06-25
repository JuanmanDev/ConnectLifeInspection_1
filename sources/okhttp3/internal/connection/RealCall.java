package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0007*\u0001s\u0018\u00002\u00020\u0001:\u0002wxB\u001f\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010p\u001a\u00020\u0015\u0012\u0006\u0010j\u001a\u00020\u0017¢\u0006\u0004\bu\u0010vJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010+J+\u00101\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u00102J;\u00108\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010-2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00172\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\b6\u00107J\u001b\u0010;\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010?\u001a\u00020<H\u0000¢\u0006\u0004\b=\u0010>J\u0011\u0010C\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010DJ\r\u0010E\u001a\u00020\u0017¢\u0006\u0004\bE\u0010+J\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\bJ#\u0010K\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010-2\u0006\u0010J\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010:J\u000f\u0010L\u001a\u00020<H\u0002¢\u0006\u0004\bL\u0010>R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0019\u0010S\u001a\u00020R8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010\u0006R\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010_\u001a\u00020^8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u00103\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010QR\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010QR\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010QR\u0019\u0010j\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010Q\u001a\u0004\bk\u0010+R(\u0010m\u001a\u0004\u0018\u00010&2\b\u0010l\u001a\u0004\u0018\u00010&8\u0000@BX\u000e¢\u0006\f\n\u0004\bm\u0010c\u001a\u0004\bn\u0010oR\u0016\u0010;\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010QR\u0019\u0010p\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010DR\u0016\u0010G\u001a\u00020s8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010tR\u0016\u0010I\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010Q¨\u0006y"}, mo47991d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "callStart", "()V", "cancel", "clone", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "createAddress", "(Lokhttp3/HttpUrl;)Lokhttp3/Address;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "Lokhttp3/Request;", "request", "", "newExchangeFinder", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;Z)V", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "isCanceled", "()Z", "isExecuted", "Ljava/io/IOException;", "E", "e", "force", "maybeReleaseConnection", "(Ljava/io/IOException;Z)Ljava/io/IOException;", "exchange", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "()Lokhttp3/Request;", "retryAfterFailure", "Lokio/AsyncTimeout;", "timeout", "()Lokio/AsyncTimeout;", "timeoutEarlyExit", "cause", "timeoutExit", "toLoggableString", "", "callStackTrace", "Ljava/lang/Object;", "canceled", "Z", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "setConnection", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/Exchange;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeRequestDone", "exchangeResponseDone", "executed", "forWebSocket", "getForWebSocket", "<set-?>", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "originalRequest", "Lokhttp3/Request;", "getOriginalRequest", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "AsyncCall", "CallReference", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RealCall.kt */
public final class RealCall implements Call {
    public Object callStackTrace;
    public boolean canceled;
    @NotNull
    public final OkHttpClient client;
    @Nullable
    public RealConnection connection;
    public final RealConnectionPool connectionPool;
    @NotNull
    public final EventListener eventListener = this.client.eventListenerFactory().create(this);
    public Exchange exchange;
    public ExchangeFinder exchangeFinder;
    public boolean exchangeRequestDone;
    public boolean exchangeResponseDone;
    public boolean executed;
    public final boolean forWebSocket;
    @Nullable
    public Exchange interceptorScopedExchange;
    public boolean noMoreExchanges;
    @NotNull
    public final Request originalRequest;
    public final RealCall$timeout$1 timeout;
    public boolean timeoutEarlyExit;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0000R\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001d\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, mo47991d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "Lokhttp3/internal/connection/RealCall;", "other", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "run", "()V", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "Lokhttp3/Callback;", "responseCallback", "Lokhttp3/Callback;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: RealCall.kt */
    public final class AsyncCall implements Runnable {
        @NotNull
        public volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        public final Callback responseCallback;

        public AsyncCall(@NotNull Callback callback) {
            this.responseCallback = callback;
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            Dispatcher dispatcher = RealCall.this.getClient().dispatcher();
            if (!Util.assertionsEnabled || !Thread.holdsLock(dispatcher)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    RealCall.this.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.getClient().dispatcher().finished$okhttp(this);
                } catch (Throwable th) {
                    RealCall.this.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
        }

        @NotNull
        public final RealCall getCall() {
            return RealCall.this;
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @NotNull
        public final String getHost() {
            return RealCall.this.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return RealCall.this.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall asyncCall) {
            this.callsPerHost = asyncCall.callsPerHost;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[Catch:{ all -> 0x007e, all -> 0x00cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ all -> 0x007e, all -> 0x00cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[Catch:{ all -> 0x007e, all -> 0x00cc }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.RealCall r1 = okhttp3.internal.connection.RealCall.this
                java.lang.String r1 = r1.redactedUrl$okhttp()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                okhttp3.internal.connection.RealCall r3 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x00cc }
                okhttp3.internal.connection.RealCall$timeout$1 r3 = r3.timeout     // Catch:{ all -> 0x00cc }
                r3.enter()     // Catch:{ all -> 0x00cc }
                okhttp3.internal.connection.RealCall r3 = okhttp3.internal.connection.RealCall.this     // Catch:{ IOException -> 0x0080, all -> 0x0052 }
                okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch:{ IOException -> 0x0080, all -> 0x0052 }
                r3 = 1
                okhttp3.Callback r4 = r7.responseCallback     // Catch:{ IOException -> 0x0050, all -> 0x004e }
                okhttp3.internal.connection.RealCall r5 = okhttp3.internal.connection.RealCall.this     // Catch:{ IOException -> 0x0050, all -> 0x004e }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x0050, all -> 0x004e }
                okhttp3.internal.connection.RealCall r0 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x00cc }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x00cc }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00cc }
            L_0x0049:
                r0.finished$okhttp((okhttp3.internal.connection.RealCall.AsyncCall) r7)     // Catch:{ all -> 0x00cc }
                goto L_0x00ba
            L_0x004e:
                r0 = move-exception
                goto L_0x0056
            L_0x0050:
                r0 = move-exception
                goto L_0x0084
            L_0x0052:
                r3 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
            L_0x0056:
                okhttp3.internal.connection.RealCall r4 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x007e }
                r4.cancel()     // Catch:{ all -> 0x007e }
                if (r3 != 0) goto L_0x007d
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r4.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007e }
                r4.append(r0)     // Catch:{ all -> 0x007e }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007e }
                r3.<init>(r4)     // Catch:{ all -> 0x007e }
                r3.addSuppressed(r0)     // Catch:{ all -> 0x007e }
                okhttp3.Callback r4 = r7.responseCallback     // Catch:{ all -> 0x007e }
                okhttp3.internal.connection.RealCall r5 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x007e }
                r4.onFailure(r5, r3)     // Catch:{ all -> 0x007e }
            L_0x007d:
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                goto L_0x00be
            L_0x0080:
                r3 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
            L_0x0084:
                if (r3 == 0) goto L_0x00a8
                okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x007e }
                okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r4.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007e }
                okhttp3.internal.connection.RealCall r5 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x007e }
                java.lang.String r5 = r5.toLoggableString()     // Catch:{ all -> 0x007e }
                r4.append(r5)     // Catch:{ all -> 0x007e }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007e }
                r5 = 4
                r3.log(r4, r5, r0)     // Catch:{ all -> 0x007e }
                goto L_0x00af
            L_0x00a8:
                okhttp3.Callback r3 = r7.responseCallback     // Catch:{ all -> 0x007e }
                okhttp3.internal.connection.RealCall r4 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x007e }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x007e }
            L_0x00af:
                okhttp3.internal.connection.RealCall r0 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x00cc }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x00cc }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00cc }
                goto L_0x0049
            L_0x00ba:
                r1.setName(r2)
                return
            L_0x00be:
                okhttp3.internal.connection.RealCall r3 = okhttp3.internal.connection.RealCall.this     // Catch:{ all -> 0x00cc }
                okhttp3.OkHttpClient r3 = r3.getClient()     // Catch:{ all -> 0x00cc }
                okhttp3.Dispatcher r3 = r3.dispatcher()     // Catch:{ all -> 0x00cc }
                r3.finished$okhttp((okhttp3.internal.connection.RealCall.AsyncCall) r7)     // Catch:{ all -> 0x00cc }
                throw r0     // Catch:{ all -> 0x00cc }
            L_0x00cc:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.AsyncCall.run():void");
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo47991d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "", "callStackTrace", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;", "Lokhttp3/internal/connection/RealCall;", "referent", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: RealCall.kt */
    public static final class CallReference extends WeakReference<RealCall> {
        @Nullable
        public final Object callStackTrace;

        public CallReference(@NotNull RealCall realCall, @Nullable Object obj) {
            super(realCall);
            this.callStackTrace = obj;
        }

        @Nullable
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public RealCall(@NotNull OkHttpClient okHttpClient, @NotNull Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        RealCall$timeout$1 realCall$timeout$1 = new RealCall$timeout$1(this);
        realCall$timeout$1.timeout((long) this.client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = realCall$timeout$1;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <E extends java.io.IOException> E maybeReleaseConnection(E r7, boolean r8) {
        /*
            r6 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0016
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r4 = r2
            goto L_0x0017
        L_0x0013:
            r7 = move-exception
            goto L_0x0086
        L_0x0016:
            r4 = r3
        L_0x0017:
            if (r4 == 0) goto L_0x007a
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            r0.element = r4     // Catch:{ all -> 0x0013 }
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            r5 = 0
            if (r4 == 0) goto L_0x0031
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0031
            if (r8 != 0) goto L_0x002c
            boolean r8 = r6.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x0031
        L_0x002c:
            java.net.Socket r8 = r6.releaseConnectionNoEvents$okhttp()     // Catch:{ all -> 0x0013 }
            goto L_0x0032
        L_0x0031:
            r8 = r5
        L_0x0032:
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0038
            r0.element = r5     // Catch:{ all -> 0x0013 }
        L_0x0038:
            boolean r4 = r6.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0042
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0042
            r4 = r3
            goto L_0x0043
        L_0x0042:
            r4 = r2
        L_0x0043:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            if (r8 == 0) goto L_0x004b
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r8)
        L_0x004b:
            T r8 = r0.element
            r0 = r8
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            if (r0 == 0) goto L_0x005e
            okhttp3.EventListener r0 = r6.eventListener
            okhttp3.Connection r8 = (okhttp3.Connection) r8
            if (r8 != 0) goto L_0x005b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005b:
            r0.connectionReleased(r6, r8)
        L_0x005e:
            if (r4 == 0) goto L_0x0079
            if (r7 == 0) goto L_0x0063
            r2 = r3
        L_0x0063:
            java.io.IOException r7 = r6.timeoutExit(r7)
            if (r2 == 0) goto L_0x0074
            okhttp3.EventListener r8 = r6.eventListener
            if (r7 != 0) goto L_0x0070
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0070:
            r8.callFailed(r6, r7)
            goto L_0x0079
        L_0x0074:
            okhttp3.EventListener r8 = r6.eventListener
            r8.callEnd(r6)
        L_0x0079:
            return r7
        L_0x007a:
            java.lang.String r7 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0013 }
            r8.<init>(r7)     // Catch:{ all -> 0x0013 }
            throw r8     // Catch:{ all -> 0x0013 }
        L_0x0086:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.maybeReleaseConnection(java.io.IOException, boolean):java.io.IOException");
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection realConnection) {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnectionPool)) {
            if (this.connection == null) {
                this.connection = realConnection;
                realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnectionPool);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        if (r2 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        r2.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r4.eventListener.canceled(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r4 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r4.connectionPool
            monitor-enter(r0)
            boolean r1 = r4.canceled     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            r4.canceled = r1     // Catch:{ all -> 0x002f }
            okhttp3.internal.connection.Exchange r1 = r4.exchange     // Catch:{ all -> 0x002f }
            okhttp3.internal.connection.ExchangeFinder r2 = r4.exchangeFinder     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0019
            okhttp3.internal.connection.RealConnection r2 = r2.connectingConnection()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            okhttp3.internal.connection.RealConnection r2 = r4.connection     // Catch:{ all -> 0x002f }
        L_0x001b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002f }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0024
            r1.cancel()
            goto L_0x0029
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r2.cancel()
        L_0x0029:
            okhttp3.EventListener r0 = r4.eventListener
            r0.canceled(r4)
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.cancel():void");
    }

    public void enqueue(@NotNull Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(callback));
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean z) {
        boolean z2 = true;
        if (this.interceptorScopedExchange == null) {
            if (this.exchange != null) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            } else if (z) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @NotNull
    public Response execute() {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        this.timeout.enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        boolean z2 = true;
        if (!this.noMoreExchanges) {
            if (z) {
                Exchange exchange2 = this.exchange;
                if (exchange2 != null) {
                    exchange2.detachWithViolence();
                }
                if (this.exchange != null) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            this.interceptorScopedExchange = null;
            return;
        }
        throw new IllegalStateException("released".toString());
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.connection;
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Nullable
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.interceptors()
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L_0x0046
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.networkInterceptors()
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
        L_0x0046:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.originalRequest
            okhttp3.OkHttpClient r0 = r11.client
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r8 = r0.writeTimeoutMillis()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.originalRequest     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            okhttp3.Response r2 = r9.proceed(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r3 = r11.isCanceled()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x007f
            r11.noMoreExchanges$okhttp(r1)
            return r2
        L_0x007f:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            throw r2     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            goto L_0x00a1
        L_0x008c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.noMoreExchanges$okhttp(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x009c
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x00a1:
            if (r0 != 0) goto L_0x00a6
            r11.noMoreExchanges$okhttp(r1)
        L_0x00a6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():okhttp3.Response");
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain realInterceptorChain) {
        synchronized (this.connectionPool) {
            boolean z = true;
            if (!this.noMoreExchanges) {
                if (this.exchange != null) {
                    z = false;
                }
                if (z) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 == null) {
            Intrinsics.throwNpe();
        }
        ExchangeCodec find = exchangeFinder2.find(this.client, realInterceptorChain);
        EventListener eventListener2 = this.eventListener;
        ExchangeFinder exchangeFinder3 = this.exchangeFinder;
        if (exchangeFinder3 == null) {
            Intrinsics.throwNpe();
        }
        Exchange exchange2 = new Exchange(this, eventListener2, exchangeFinder3, find);
        this.interceptorScopedExchange = exchange2;
        synchronized (this.connectionPool) {
            this.exchange = exchange2;
            this.exchangeRequestDone = false;
            this.exchangeResponseDone = false;
        }
        return exchange2;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.canceled;
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return maybeReleaseConnection(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E messageDone$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            okhttp3.internal.connection.Exchange r1 = r2.exchange     // Catch:{ all -> 0x004e }
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ all -> 0x004e }
            r1 = 1
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x000f
            monitor-exit(r0)
            return r6
        L_0x000f:
            r3 = 0
            if (r4 == 0) goto L_0x0018
            boolean r4 = r2.exchangeRequestDone     // Catch:{ all -> 0x004e }
            r4 = r4 ^ r1
            r2.exchangeRequestDone = r1     // Catch:{ all -> 0x004e }
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            if (r5 == 0) goto L_0x0022
            boolean r5 = r2.exchangeResponseDone     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x0020
            r4 = r1
        L_0x0020:
            r2.exchangeResponseDone = r1     // Catch:{ all -> 0x004e }
        L_0x0022:
            boolean r5 = r2.exchangeRequestDone     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0043
            boolean r5 = r2.exchangeResponseDone     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x0043
            okhttp3.internal.connection.Exchange r4 = r2.exchange     // Catch:{ all -> 0x004e }
            if (r4 != 0) goto L_0x0033
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x004e }
        L_0x0033:
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection$okhttp()     // Catch:{ all -> 0x004e }
            int r5 = r4.getSuccessCount$okhttp()     // Catch:{ all -> 0x004e }
            int r5 = r5 + r1
            r4.setSuccessCount$okhttp(r5)     // Catch:{ all -> 0x004e }
            r4 = 0
            r2.exchange = r4     // Catch:{ all -> 0x004e }
            goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x004d
            java.io.IOException r6 = r2.maybeReleaseConnection(r6, r3)
        L_0x004d:
            return r6
        L_0x004e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException iOException) {
        synchronized (this.connectionPool) {
            this.noMoreExchanges = true;
            Unit unit = Unit.INSTANCE;
        }
        return maybeReleaseConnection(iOException, false);
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnectionPool)) {
            RealConnection realConnection = this.connection;
            if (realConnection == null) {
                Intrinsics.throwNpe();
            }
            Iterator<Reference<RealCall>> it = realConnection.getCalls().iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) (RealCall) it.next().get(), (Object) this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                RealConnection realConnection2 = this.connection;
                if (realConnection2 == null) {
                    Intrinsics.throwNpe();
                }
                realConnection2.getCalls().remove(i);
                this.connection = null;
                if (realConnection2.getCalls().isEmpty()) {
                    realConnection2.setIdleAtNs$okhttp(System.nanoTime());
                    if (this.connectionPool.connectionBecameIdle(realConnection2)) {
                        return realConnection2.socket();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnectionPool);
        throw new AssertionError(sb.toString());
    }

    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 == null) {
            Intrinsics.throwNpe();
        }
        return exchangeFinder2.retryAfterFailure();
    }

    public final void setConnection(@Nullable RealConnection realConnection) {
        this.connection = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    @NotNull
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}

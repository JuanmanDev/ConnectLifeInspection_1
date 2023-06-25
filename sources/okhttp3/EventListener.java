package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 M:\u0002MNB\u0007¢\u0006\u0004\bK\u0010LJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ1\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J2\u0010*\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$2\u0011\u0010)\u001a\r\u0012\t\u0012\u00070'¢\u0006\u0002\b(0&H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b,\u0010-J2\u00101\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.2\u0011\u00100\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b(0&H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b9\u0010\u000bJ\u001f\u0010:\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b:\u0010\u0010J\u001f\u0010=\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b?\u0010\u000bJ\u001f\u0010@\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b@\u00108J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\bA\u0010\u000bJ\u001f\u0010B\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u0010\u0010J\u001f\u0010C\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\bC\u0010\u0007J\u0017\u0010D\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\bD\u0010\u000bJ\u001f\u0010E\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\bE\u0010\u0007J!\u0010H\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\bJ\u0010\u000b¨\u0006O"}, mo47991d2 = {"Lokhttp3/EventListener;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "cachedResponse", "", "cacheConditionalHit", "(Lokhttp3/Call;Lokhttp3/Response;)V", "response", "cacheHit", "cacheMiss", "(Lokhttp3/Call;)V", "callEnd", "Ljava/io/IOException;", "ioe", "callFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "callStart", "canceled", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "", "domainName", "", "Ljava/net/InetAddress;", "Lkotlin/jvm/JvmSuppressWildcards;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Lokhttp3/HttpUrl;", "url", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestBodyStart", "requestFailed", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "responseHeadersStart", "satisfactionFailure", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "secureConnectStart", "<init>", "()V", "Companion", "Factory", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: EventListener.kt */
public abstract class EventListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo47991d2 = {"Lokhttp3/EventListener$Companion;", "Lokhttp3/EventListener;", "NONE", "Lokhttp3/EventListener;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: EventListener.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lokhttp3/EventListener$Factory;", "Lkotlin/Any;", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: EventListener.kt */
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
    }

    public void cacheMiss(@NotNull Call call) {
    }

    public void callEnd(@NotNull Call call) {
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
    }

    public void callStart(@NotNull Call call) {
    }

    public void canceled(@NotNull Call call) {
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
    }

    public void requestBodyEnd(@NotNull Call call, long j) {
    }

    public void requestBodyStart(@NotNull Call call) {
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
    }

    public void requestHeadersStart(@NotNull Call call) {
    }

    public void responseBodyEnd(@NotNull Call call, long j) {
    }

    public void responseBodyStart(@NotNull Call call) {
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
    }

    public void responseHeadersStart(@NotNull Call call) {
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
    }

    public void secureConnectStart(@NotNull Call call) {
    }
}

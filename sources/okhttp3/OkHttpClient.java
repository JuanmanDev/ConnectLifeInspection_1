package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.p700ws.RealWebSocket;
import okhttp3.internal.p700ws.WebSocketExtensions;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B\n\b\u0016¢\u0006\u0005\b\u0001\u0010hB\u0014\b\u0000\u0012\u0007\u0010\u0001\u001a\u00020>¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010.\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00104\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00101J\u000f\u00108\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u001aH\u0007¢\u0006\u0004\b:\u0010\u001dJ\u0015\u0010=\u001a\b\u0012\u0004\u0012\u0002090\u001aH\u0007¢\u0006\u0004\b<\u0010\u001dJ\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020H2\u0006\u0010B\u001a\u00020A2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020\fH\u0007¢\u0006\u0004\bK\u0010\u000eJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u001aH\u0007¢\u0006\u0004\bN\u0010\u001dJ\u0011\u0010S\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0004\bQ\u0010RJ\u000f\u0010U\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010Y\u001a\u00020VH\u0007¢\u0006\u0004\bW\u0010XJ\u000f\u0010[\u001a\u00020\fH\u0007¢\u0006\u0004\bZ\u0010\u000eJ\u000f\u0010]\u001a\u00020/H\u0007¢\u0006\u0004\b\\\u00101J\u000f\u0010a\u001a\u00020^H\u0007¢\u0006\u0004\b_\u0010`J\u000f\u0010e\u001a\u00020bH\u0007¢\u0006\u0004\bc\u0010dJ\u000f\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u00020\fH\u0007¢\u0006\u0004\bi\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u00048G@\u0006¢\u0006\f\n\u0004\b\u0007\u0010k\u001a\u0004\b\u0007\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\f\n\u0004\b\u000b\u0010l\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u000f\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\b\u000f\u0010m\u001a\u0004\b\u000f\u0010\u000eR\u001b\u0010o\u001a\u0004\u0018\u00010n8G@\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010qR\u0019\u0010\u0013\u001a\u00020\u00108G@\u0006¢\u0006\f\n\u0004\b\u0013\u0010r\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\b\u0015\u0010m\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0019\u001a\u00020\u00168G@\u0006¢\u0006\f\n\u0004\b\u0019\u0010s\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G@\u0006¢\u0006\f\n\u0004\b\u001e\u0010t\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\"\u001a\u00020\u001f8G@\u0006¢\u0006\f\n\u0004\b\"\u0010u\u001a\u0004\b\"\u0010!R\u0019\u0010&\u001a\u00020#8G@\u0006¢\u0006\f\n\u0004\b&\u0010v\u001a\u0004\b&\u0010%R\u0019\u0010*\u001a\u00020'8G@\u0006¢\u0006\f\n\u0004\b*\u0010w\u001a\u0004\b*\u0010)R\u0019\u0010.\u001a\u00020+8G@\u0006¢\u0006\f\n\u0004\b.\u0010x\u001a\u0004\b.\u0010-R\u0019\u00102\u001a\u00020/8G@\u0006¢\u0006\f\n\u0004\b2\u0010y\u001a\u0004\b2\u00101R\u0019\u00104\u001a\u00020/8G@\u0006¢\u0006\f\n\u0004\b4\u0010y\u001a\u0004\b4\u00101R\u0019\u00108\u001a\u0002058G@\u0006¢\u0006\f\n\u0004\b8\u0010z\u001a\u0004\b8\u00107R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u001a8G@\u0006¢\u0006\f\n\u0004\b;\u0010t\u001a\u0004\b;\u0010\u001dR\u0019\u0010|\u001a\u00020{8G@\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\u001f\u0010=\u001a\b\u0012\u0004\u0012\u0002090\u001a8G@\u0006¢\u0006\f\n\u0004\b=\u0010t\u001a\u0004\b=\u0010\u001dR\u0019\u0010L\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\bL\u0010m\u001a\u0004\bL\u0010\u000eR\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u001a8G@\u0006¢\u0006\f\n\u0004\bO\u0010t\u001a\u0004\bO\u0010\u001dR\u001b\u0010S\u001a\u0004\u0018\u00010P8G@\u0006¢\u0006\f\n\u0004\bS\u0010\u001a\u0004\bS\u0010RR\u0019\u0010U\u001a\u00020\u00048G@\u0006¢\u0006\f\n\u0004\bU\u0010k\u001a\u0004\bU\u0010\u0006R\u001a\u0010Y\u001a\u00020V8G@\u0006¢\u0006\r\n\u0005\bY\u0010\u0001\u001a\u0004\bY\u0010XR\u0019\u0010[\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\b[\u0010m\u001a\u0004\b[\u0010\u000eR\u0019\u0010]\u001a\u00020/8G@\u0006¢\u0006\f\n\u0004\b]\u0010y\u001a\u0004\b]\u00101R\u001f\u0010\u0001\u001a\u00030\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010a\u001a\u00020^8G@\u0006¢\u0006\r\n\u0005\ba\u0010\u0001\u001a\u0004\ba\u0010`R\u0013\u0010e\u001a\u00020b8G@\u0006¢\u0006\u0006\u001a\u0004\be\u0010dR\u001b\u0010\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010j\u001a\u00020\f8G@\u0006¢\u0006\f\n\u0004\bj\u0010m\u001a\u0004\bj\u0010\u000eR!\u0010\u0001\u001a\u0005\u0018\u00010\u00018G@\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo47991d2 = {"Lokhttp3/OkHttpClient;", "Ljava/lang/Cloneable;", "okhttp3/Call$Factory", "okhttp3/WebSocket$Factory", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "()Ljava/util/List;", "connectionSpecs", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_followRedirects", "()Z", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/OkHttpClient$Builder;", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "retryOnConnectionFailure", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "verifyClientState", "()V", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "Lokhttp3/Authenticator;", "Lokhttp3/Cache;", "I", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/CertificatePinner;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/CookieJar;", "Lokhttp3/Dispatcher;", "Lokhttp3/Dns;", "Lokhttp3/EventListener$Factory;", "Z", "Ljavax/net/ssl/HostnameVerifier;", "", "minWebSocketMessageToCompress", "J", "()J", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "<init>", "builder", "(Lokhttp3/OkHttpClient$Builder;)V", "Companion", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: OkHttpClient.kt */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    @NotNull
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    @NotNull
    public final Authenticator authenticator;
    @Nullable
    public final Cache cache;
    public final int callTimeoutMillis;
    @Nullable
    public final CertificateChainCleaner certificateChainCleaner;
    @NotNull
    public final CertificatePinner certificatePinner;
    public final int connectTimeoutMillis;
    @NotNull
    public final ConnectionPool connectionPool;
    @NotNull
    public final List<ConnectionSpec> connectionSpecs;
    @NotNull
    public final CookieJar cookieJar;
    @NotNull
    public final Dispatcher dispatcher;
    @NotNull
    public final Dns dns;
    @NotNull
    public final EventListener.Factory eventListenerFactory;
    public final boolean followRedirects;
    public final boolean followSslRedirects;
    @NotNull
    public final HostnameVerifier hostnameVerifier;
    @NotNull
    public final List<Interceptor> interceptors;
    public final long minWebSocketMessageToCompress;
    @NotNull
    public final List<Interceptor> networkInterceptors;
    public final int pingIntervalMillis;
    @NotNull
    public final List<Protocol> protocols;
    @Nullable
    public final Proxy proxy;
    @NotNull
    public final Authenticator proxyAuthenticator;
    @NotNull
    public final ProxySelector proxySelector;
    public final int readTimeoutMillis;
    public final boolean retryOnConnectionFailure;
    @NotNull
    public final RouteDatabase routeDatabase;
    @NotNull
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactoryOrNull;
    public final int writeTimeoutMillis;
    @Nullable
    public final X509TrustManager x509TrustManager;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000B\u0014\b\u0010\u0012\u0007\u0010Þ\u0001\u001a\u00020\u0013¢\u0006\u0006\bß\u0001\u0010à\u0001B\t¢\u0006\u0006\bß\u0001\u0010á\u0001J5\u0010\n\u001a\u00020\u00002#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\b¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\rJ5\u0010\u000f\u001a\u00020\u00002#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\b¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001b\u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010\u001cJ\u001d\u0010%\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010!J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020<¢\u0006\u0004\b@\u0010>J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0D¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u001d¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000b0D¢\u0006\u0004\bJ\u0010FJ\u0017\u0010K\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bK\u0010\u001cJ\u001d\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bK\u0010!J\u001b\u0010N\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0)¢\u0006\u0004\bN\u0010,J\u0017\u0010P\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0010¢\u0006\u0004\bR\u0010\u0012J\u0015\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bV\u0010\u001cJ\u001d\u0010V\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bV\u0010!J\u0015\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020<¢\u0006\u0004\bW\u0010>J\u0015\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]J\u001d\u0010\\\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020[2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b\\\u0010`J\u0017\u0010a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\ba\u0010\u001cJ\u001d\u0010a\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\ba\u0010!R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010\u001b\u001a\u00020l8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\"\u0010%\u001a\u00020l8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010m\u001a\u0004\b~\u0010o\"\u0004\b\u0010qR'\u0010'\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\b+\u0010\u0001\u001a\u0005\b\u0001\u0010F\"\u0006\b\u0001\u0010\u0001R'\u0010.\u001a\u00020-8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u00101\u001a\u0002008\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b1\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u00104\u001a\u0002038\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b4\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010:\u001a\u0002098\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b:\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010=\u001a\u00020<8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b=\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b \u0001\u0010¡\u0001R'\u0010@\u001a\u00020<8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b@\u0010\u0001\u001a\u0006\b¢\u0001\u0010\u0001\"\u0006\b£\u0001\u0010¡\u0001R'\u0010B\u001a\u00020A8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bB\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R$\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0D8\u0000@\u0000X\u0004¢\u0006\u000e\n\u0005\bE\u0010\u0001\u001a\u0005\b©\u0001\u0010FR'\u0010H\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bH\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R$\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000b0D8\u0000@\u0000X\u0004¢\u0006\u000e\n\u0005\bJ\u0010\u0001\u001a\u0005\b¯\u0001\u0010FR$\u0010K\u001a\u00020l8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\bK\u0010m\u001a\u0005\b°\u0001\u0010o\"\u0005\b±\u0001\u0010qR,\u0010N\u001a\b\u0012\u0004\u0012\u00020M0)8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\bN\u0010\u0001\u001a\u0005\b²\u0001\u0010F\"\u0006\b³\u0001\u0010\u0001R)\u0010P\u001a\u0004\u0018\u00010O8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bP\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R$\u0010R\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\bR\u0010b\u001a\u0005\b¹\u0001\u0010d\"\u0005\bº\u0001\u0010fR)\u0010T\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bT\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R$\u0010V\u001a\u00020l8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\bV\u0010m\u001a\u0005\bÀ\u0001\u0010o\"\u0005\bÁ\u0001\u0010qR'\u0010W\u001a\u00020<8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bW\u0010\u0001\u001a\u0006\bÂ\u0001\u0010\u0001\"\u0006\bÃ\u0001\u0010¡\u0001R,\u0010Å\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R'\u0010Y\u001a\u00020X8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bY\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R+\u0010Ð\u0001\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R$\u0010a\u001a\u00020l8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\ba\u0010m\u001a\u0005\bÖ\u0001\u0010o\"\u0005\b×\u0001\u0010qR+\u0010Ø\u0001\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001¨\u0006â\u0001"}, mo47991d2 = {"Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/Function1;)Lokhttp3/OkHttpClient$Builder;", "addInterceptor", "Lokhttp3/Interceptor;", "interceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "-addNetworkInterceptor", "addNetworkInterceptor", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/OkHttpClient;", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "callTimeout", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "followRedirects", "(Z)Lokhttp3/OkHttpClient$Builder;", "followProtocolRedirects", "followSslRedirects", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "", "interceptors", "()Ljava/util/List;", "bytes", "minWebSocketMessageToCompress", "(J)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "pingInterval", "interval", "Lokhttp3/Protocol;", "protocols", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "readTimeout", "retryOnConnectionFailure", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "writeTimeout", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getFollowRedirects$okhttp", "()Z", "setFollowRedirects$okhttp", "(Z)V", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "getInterceptors$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "getNetworkInterceptors$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "getProtocols$okhttp", "setProtocols$okhttp", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getRetryOnConnectionFailure$okhttp", "setRetryOnConnectionFailure$okhttp", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: OkHttpClient.kt */
    public static final class Builder {
        @NotNull
        public Authenticator authenticator;
        @Nullable
        public Cache cache;
        public int callTimeout;
        @Nullable
        public CertificateChainCleaner certificateChainCleaner;
        @NotNull
        public CertificatePinner certificatePinner;
        public int connectTimeout;
        @NotNull
        public ConnectionPool connectionPool;
        @NotNull
        public List<ConnectionSpec> connectionSpecs;
        @NotNull
        public CookieJar cookieJar;
        @NotNull
        public Dispatcher dispatcher;
        @NotNull
        public Dns dns;
        @NotNull
        public EventListener.Factory eventListenerFactory;
        public boolean followRedirects;
        public boolean followSslRedirects;
        @NotNull
        public HostnameVerifier hostnameVerifier;
        @NotNull
        public final List<Interceptor> interceptors;
        public long minWebSocketMessageToCompress;
        @NotNull
        public final List<Interceptor> networkInterceptors;
        public int pingInterval;
        @NotNull
        public List<? extends Protocol> protocols;
        @Nullable
        public Proxy proxy;
        @NotNull
        public Authenticator proxyAuthenticator;
        @Nullable
        public ProxySelector proxySelector;
        public int readTimeout;
        public boolean retryOnConnectionFailure;
        @Nullable
        public RouteDatabase routeDatabase;
        @NotNull
        public SocketFactory socketFactory;
        @Nullable
        public SSLSocketFactory sslSocketFactoryOrNull;
        public int writeTimeout;
        @Nullable
        public X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(socketFactory2, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory2;
            this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024;
        }

        @NotNull
        @JvmName(name = "-addInterceptor")
        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m28961addInterceptor(@NotNull Function1<? super Interceptor.Chain, Response> function1) {
            Interceptor.Companion companion = Interceptor.Companion;
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$$inlined$invoke$1(function1));
        }

        @NotNull
        @JvmName(name = "-addNetworkInterceptor")
        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m28962addNetworkInterceptor(@NotNull Function1<? super Interceptor.Chain, Response> function1) {
            Interceptor.Companion companion = Interceptor.Companion;
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$$inlined$invoke$1(function1));
        }

        @NotNull
        public final Builder addInterceptor(@NotNull Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor) {
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder authenticator(@NotNull Authenticator authenticator2) {
            this.authenticator = authenticator2;
            return this;
        }

        @NotNull
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @NotNull
        public final Builder cache(@Nullable Cache cache2) {
            this.cache = cache2;
            return this;
        }

        @NotNull
        public final Builder callTimeout(long j, @NotNull TimeUnit timeUnit) {
            this.callTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner2) {
            if (!Intrinsics.areEqual((Object) certificatePinner2, (Object) this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner2;
            return this;
        }

        @NotNull
        public final Builder connectTimeout(long j, @NotNull TimeUnit timeUnit) {
            this.connectTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder connectionPool(@NotNull ConnectionPool connectionPool2) {
            this.connectionPool = connectionPool2;
            return this;
        }

        @NotNull
        public final Builder connectionSpecs(@NotNull List<ConnectionSpec> list) {
            if (!Intrinsics.areEqual((Object) list, (Object) this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(list);
            return this;
        }

        @NotNull
        public final Builder cookieJar(@NotNull CookieJar cookieJar2) {
            this.cookieJar = cookieJar2;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull Dispatcher dispatcher2) {
            this.dispatcher = dispatcher2;
            return this;
        }

        @NotNull
        public final Builder dns(@NotNull Dns dns2) {
            if (!Intrinsics.areEqual((Object) dns2, (Object) this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns2;
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener) {
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory factory) {
            this.eventListenerFactory = factory;
            return this;
        }

        @NotNull
        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        @NotNull
        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        @NotNull
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @Nullable
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @Nullable
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @NotNull
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @NotNull
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @NotNull
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @NotNull
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @NotNull
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @NotNull
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @NotNull
        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @NotNull
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @NotNull
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @NotNull
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @NotNull
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @Nullable
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @NotNull
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @Nullable
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @Nullable
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @NotNull
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @Nullable
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @Nullable
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @NotNull
        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier2) {
            if (!Intrinsics.areEqual((Object) hostnameVerifier2, (Object) this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier2;
            return this;
        }

        @NotNull
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @NotNull
        public final Builder minWebSocketMessageToCompress(long j) {
            if (j >= 0) {
                this.minWebSocketMessageToCompress = j;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j).toString());
        }

        @NotNull
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @NotNull
        public final Builder pingInterval(long j, @NotNull TimeUnit timeUnit) {
            this.pingInterval = Util.checkDuration("interval", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder protocols(@NotNull List<? extends Protocol> list) {
            List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(list);
            boolean z = false;
            if (mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE) || mutableList.contains(Protocol.HTTP_1_1)) {
                if (!mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE) || mutableList.size() <= 1) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
                } else if (!(!mutableList.contains(Protocol.HTTP_1_0))) {
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
                } else if (mutableList == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                } else if (!mutableList.contains((Object) null)) {
                    mutableList.remove(Protocol.SPDY_3);
                    if (!Intrinsics.areEqual((Object) mutableList, (Object) this.protocols)) {
                        this.routeDatabase = null;
                    }
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(mutableList);
                    Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                    this.protocols = unmodifiableList;
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
        }

        @NotNull
        public final Builder proxy(@Nullable Proxy proxy2) {
            if (!Intrinsics.areEqual((Object) proxy2, (Object) this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy2;
            return this;
        }

        @NotNull
        public final Builder proxyAuthenticator(@NotNull Authenticator authenticator2) {
            if (!Intrinsics.areEqual((Object) authenticator2, (Object) this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator2;
            return this;
        }

        @NotNull
        public final Builder proxySelector(@NotNull ProxySelector proxySelector2) {
            if (!Intrinsics.areEqual((Object) proxySelector2, (Object) this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector2;
            return this;
        }

        @NotNull
        public final Builder readTimeout(long j, @NotNull TimeUnit timeUnit) {
            this.readTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator2) {
            this.authenticator = authenticator2;
        }

        public final void setCache$okhttp(@Nullable Cache cache2) {
            this.cache = cache2;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner2) {
            this.certificateChainCleaner = certificateChainCleaner2;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner2) {
            this.certificatePinner = certificatePinner2;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(@NotNull ConnectionPool connectionPool2) {
            this.connectionPool = connectionPool2;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List<ConnectionSpec> list) {
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar2) {
            this.cookieJar = cookieJar2;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher2) {
            this.dispatcher = dispatcher2;
        }

        public final void setDns$okhttp(@NotNull Dns dns2) {
            this.dns = dns2;
        }

        public final void setEventListenerFactory$okhttp(@NotNull EventListener.Factory factory) {
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier2) {
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(@NotNull List<? extends Protocol> list) {
            this.protocols = list;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator2) {
            this.proxyAuthenticator = authenticator2;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase2) {
            this.routeDatabase = routeDatabase2;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory2) {
            this.socketFactory = socketFactory2;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @NotNull
        public final Builder socketFactory(@NotNull SocketFactory socketFactory2) {
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                if (!Intrinsics.areEqual((Object) socketFactory2, (Object) this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory2;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
            if (!Intrinsics.areEqual((Object) sSLSocketFactory, (Object) this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            X509TrustManager trustManager = Platform.Companion.get().trustManager(sSLSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                Platform platform = Platform.Companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                if (x509TrustManager == null) {
                    Intrinsics.throwNpe();
                }
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + Platform.Companion.get() + ", " + "sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        @NotNull
        public final Builder writeTimeout(long j, @NotNull TimeUnit timeUnit) {
            this.writeTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder callTimeout(@NotNull Duration duration) {
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder connectTimeout(@NotNull Duration duration) {
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder pingInterval(@NotNull Duration duration) {
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder readTimeout(@NotNull Duration duration) {
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder writeTimeout(@NotNull Duration duration) {
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory, @NotNull X509TrustManager x509TrustManager) {
            if ((!Intrinsics.areEqual((Object) sSLSocketFactory, (Object) this.sslSocketFactoryOrNull)) || (!Intrinsics.areEqual((Object) x509TrustManager, (Object) this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        public Builder(@NotNull OkHttpClient okHttpClient) {
            this();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt__MutableCollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            CollectionsKt__MutableCollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\f"}, mo47991d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "Lokhttp3/ConnectionSpec;", "DEFAULT_CONNECTION_SPECS", "Ljava/util/List;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "getDEFAULT_PROTOCOLS$okhttp", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: OkHttpClient.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @NotNull
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OkHttpClient(@NotNull Builder builder) {
        ProxySelector proxySelector2;
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector2 = NullProxySelector.INSTANCE;
        } else {
            proxySelector2 = builder.getProxySelector$okhttp();
            proxySelector2 = proxySelector2 == null ? ProxySelector.getDefault() : proxySelector2;
            if (proxySelector2 == null) {
                proxySelector2 = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector2;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        this.connectionSpecs = builder.getConnectionSpecs$okhttp();
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        List<ConnectionSpec> list = this.connectionSpecs;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ConnectionSpec) it.next()).isTls()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
            CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null) {
                Intrinsics.throwNpe();
            }
            this.certificateChainCleaner = certificateChainCleaner$okhttp;
            X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
            if (x509TrustManagerOrNull$okhttp == null) {
                Intrinsics.throwNpe();
            }
            this.x509TrustManager = x509TrustManagerOrNull$okhttp;
            CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
            CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
            if (certificateChainCleaner2 == null) {
                Intrinsics.throwNpe();
            }
            this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
        } else {
            this.x509TrustManager = Platform.Companion.get().platformTrustManager();
            Platform platform = Platform.Companion.get();
            X509TrustManager x509TrustManager2 = this.x509TrustManager;
            if (x509TrustManager2 == null) {
                Intrinsics.throwNpe();
            }
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManager2);
            CertificateChainCleaner.Companion companion = CertificateChainCleaner.Companion;
            X509TrustManager x509TrustManager3 = this.x509TrustManager;
            if (x509TrustManager3 == null) {
                Intrinsics.throwNpe();
            }
            this.certificateChainCleaner = companion.get(x509TrustManager3);
            CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
            CertificateChainCleaner certificateChainCleaner3 = this.certificateChainCleaner;
            if (certificateChainCleaner3 == null) {
                Intrinsics.throwNpe();
            }
            this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner3);
        }
        verifyClientState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void verifyClientState() {
        /*
            r4 = this;
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r0 == 0) goto L_0x0102
            r2 = 0
            boolean r0 = r0.contains(r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00e5
            java.util.List<okhttp3.Interceptor> r0 = r4.networkInterceptors
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00c2
            java.util.List<okhttp3.ConnectionSpec> r0 = r4.connectionSpecs
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x0029
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0029
        L_0x0027:
            r0 = r3
            goto L_0x0040
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L_0x002d
            r0 = r2
        L_0x0040:
            if (r0 == 0) goto L_0x0091
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 != 0) goto L_0x0048
            r0 = r3
            goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0087
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
            if (r0 != 0) goto L_0x0053
            r0 = r3
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            if (r0 == 0) goto L_0x007d
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            if (r3 == 0) goto L_0x0073
            okhttp3.CertificatePinner r0 = r4.certificatePinner
            okhttp3.CertificatePinner r2 = okhttp3.CertificatePinner.DEFAULT
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0069
            goto L_0x009d
        L_0x0069:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 == 0) goto L_0x00b6
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
            if (r0 == 0) goto L_0x00aa
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 == 0) goto L_0x009e
        L_0x009d:
            return
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null network interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.networkInterceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00df:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r4.interceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0102:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.verifyClientState():void");
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    @JvmName(name = "-deprecated_authenticator")
    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m28935deprecated_authenticator() {
        return this.authenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_cache")
    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m28936deprecated_cache() {
        return this.cache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_callTimeoutMillis")
    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m28937deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @JvmName(name = "-deprecated_certificatePinner")
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m28938deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_connectTimeoutMillis")
    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m28939deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    @JvmName(name = "-deprecated_connectionPool")
    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m28940deprecated_connectionPool() {
        return this.connectionPool;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m28941deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    @JvmName(name = "-deprecated_cookieJar")
    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m28942deprecated_cookieJar() {
        return this.cookieJar;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    @JvmName(name = "-deprecated_dispatcher")
    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m28943deprecated_dispatcher() {
        return this.dispatcher;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m28944deprecated_dns() {
        return this.dns;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @JvmName(name = "-deprecated_eventListenerFactory")
    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m28945deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    @JvmName(name = "-deprecated_followRedirects")
    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m28946deprecated_followRedirects() {
        return this.followRedirects;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    @JvmName(name = "-deprecated_followSslRedirects")
    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m28947deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @JvmName(name = "-deprecated_hostnameVerifier")
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m28948deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    @JvmName(name = "-deprecated_interceptors")
    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m28949deprecated_interceptors() {
        return this.interceptors;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    @JvmName(name = "-deprecated_networkInterceptors")
    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m28950deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    @JvmName(name = "-deprecated_pingIntervalMillis")
    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m28951deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m28952deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_proxy")
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m28953deprecated_proxy() {
        return this.proxy;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m28954deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m28955deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_readTimeoutMillis")
    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m28956deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    @JvmName(name = "-deprecated_retryOnConnectionFailure")
    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m28957deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m28958deprecated_socketFactory() {
        return this.socketFactory;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @JvmName(name = "-deprecated_sslSocketFactory")
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m28959deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_writeTimeoutMillis")
    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m28960deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @NotNull
    @JvmName(name = "authenticator")
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @Nullable
    @JvmName(name = "cache")
    public final Cache cache() {
        return this.cache;
    }

    @JvmName(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Nullable
    @JvmName(name = "certificateChainCleaner")
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    @JvmName(name = "certificatePinner")
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @JvmName(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @NotNull
    @JvmName(name = "connectionPool")
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @NotNull
    @JvmName(name = "connectionSpecs")
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    @JvmName(name = "cookieJar")
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @NotNull
    @JvmName(name = "dispatcher")
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @NotNull
    @JvmName(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    @NotNull
    @JvmName(name = "eventListenerFactory")
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @JvmName(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @JvmName(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @NotNull
    @JvmName(name = "hostnameVerifier")
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    @JvmName(name = "interceptors")
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @JvmName(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @NotNull
    @JvmName(name = "networkInterceptors")
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public Call newCall(@NotNull Request request) {
        return new RealCall(this, request, false);
    }

    @NotNull
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, webSocketListener, new Random(), (long) this.pingIntervalMillis, (WebSocketExtensions) null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @JvmName(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @NotNull
    @JvmName(name = "protocols")
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    @JvmName(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    @JvmName(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    @JvmName(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @JvmName(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @JvmName(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @NotNull
    @JvmName(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @NotNull
    @JvmName(name = "sslSocketFactory")
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Nullable
    @JvmName(name = "x509TrustManager")
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}

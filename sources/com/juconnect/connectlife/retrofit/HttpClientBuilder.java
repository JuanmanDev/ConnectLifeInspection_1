package com.juconnect.connectlife.retrofit;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020'J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010.\u001a\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001aJ\u0010\u00100\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u000101J\u000e\u00102\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u000bJ\u000e\u00103\u001a\u00020\u00062\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u00106\u001a\u00020\u00062\u0006\u00106\u001a\u00020'J\u000e\u00107\u001a\u00020\u00062\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, mo47991d2 = {"Lcom/juconnect/connectlife/retrofit/HttpClientBuilder;", "", "()V", "builder", "Lokhttp3/OkHttpClient$Builder;", "addInterceptor", "", "interceptor", "Lokhttp3/Interceptor;", "addNetworkInterceptor", "authenticator", "Lokhttp3/Authenticator;", "build", "Lokhttp3/OkHttpClient;", "cache", "Lokhttp3/Cache;", "certificatePinner", "Lokhttp3/CertificatePinner;", "connectTimeout", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "connectionPool", "Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "cookieJar", "Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "eventListener", "Lokhttp3/EventListener;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "followRedirects", "", "followSslRedirects", "followProtocolRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "pingInterval", "interval", "protocols", "Lokhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "readTimeout", "retryOnConnectionFailure", "socketFactory", "Ljavax/net/SocketFactory;", "writeTimeout", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HttpClientBuilder.kt */
public final class HttpClientBuilder {
    @NotNull
    public final OkHttpClient.Builder builder = new OkHttpClient.Builder();

    public final void addInterceptor(@NotNull Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.builder.addInterceptor(interceptor);
    }

    public final void addNetworkInterceptor(@NotNull Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.builder.addNetworkInterceptor(interceptor);
    }

    public final void authenticator(@NotNull Authenticator authenticator) {
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        this.builder.authenticator(authenticator);
    }

    @NotNull
    public final OkHttpClient build() {
        return this.builder.build();
    }

    public final void cache(@Nullable Cache cache) {
        this.builder.cache(cache);
    }

    public final void certificatePinner(@NotNull CertificatePinner certificatePinner) {
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        this.builder.certificatePinner(certificatePinner);
    }

    public final void connectTimeout(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        this.builder.connectTimeout(j, timeUnit);
    }

    public final void connectionPool(@NotNull ConnectionPool connectionPool) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        this.builder.connectionPool(connectionPool);
    }

    public final void connectionSpecs(@NotNull List<ConnectionSpec> list) {
        Intrinsics.checkNotNullParameter(list, "connectionSpecs");
        this.builder.connectionSpecs(list);
    }

    public final void cookieJar(@NotNull CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.builder.cookieJar(cookieJar);
    }

    public final void dispatcher(@NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.builder.dispatcher(dispatcher);
    }

    public final void dns(@NotNull Dns dns) {
        Intrinsics.checkNotNullParameter(dns, "dns");
        this.builder.dns(dns);
    }

    public final void eventListener(@NotNull EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.builder.eventListener(eventListener);
    }

    public final void eventListenerFactory(@NotNull EventListener.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "eventListenerFactory");
        this.builder.eventListenerFactory(factory);
    }

    public final void followRedirects(boolean z) {
        this.builder.followRedirects(z);
    }

    public final void followSslRedirects(boolean z) {
        this.builder.followSslRedirects(z);
    }

    public final void hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier) {
        Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
        this.builder.hostnameVerifier(hostnameVerifier);
    }

    public final void pingInterval(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        this.builder.pingInterval(j, timeUnit);
    }

    public final void protocols(@NotNull List<? extends Protocol> list) {
        Intrinsics.checkNotNullParameter(list, "protocols");
        this.builder.protocols(list);
    }

    public final void proxy(@Nullable Proxy proxy) {
        this.builder.proxy(proxy);
    }

    public final void proxyAuthenticator(@NotNull Authenticator authenticator) {
        Intrinsics.checkNotNullParameter(authenticator, "proxyAuthenticator");
        this.builder.proxyAuthenticator(authenticator);
    }

    public final void proxySelector(@NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.builder.proxySelector(proxySelector);
    }

    public final void readTimeout(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        this.builder.readTimeout(j, timeUnit);
    }

    public final void retryOnConnectionFailure(boolean z) {
        this.builder.retryOnConnectionFailure(z);
    }

    public final void socketFactory(@NotNull SocketFactory socketFactory) {
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        this.builder.socketFactory(socketFactory);
    }

    public final void writeTimeout(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        this.builder.writeTimeout(j, timeUnit);
    }
}

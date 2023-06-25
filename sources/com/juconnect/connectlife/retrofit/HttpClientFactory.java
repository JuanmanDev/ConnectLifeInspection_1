package com.juconnect.connectlife.retrofit;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connectlife/retrofit/HttpClientFactory;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "getDefaultClient", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HttpClientFactory.kt */
public final class HttpClientFactory {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Lazy<HttpClientFactory> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, HttpClientFactory$Companion$INSTANCE$2.INSTANCE);
    @NotNull
    public final Lazy client$delegate;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/retrofit/HttpClientFactory$Companion;", "", "()V", "INSTANCE", "Lcom/juconnect/connectlife/retrofit/HttpClientFactory;", "getINSTANCE", "()Lcom/juconnect/connectlife/retrofit/HttpClientFactory;", "INSTANCE$delegate", "Lkotlin/Lazy;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HttpClientFactory.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HttpClientFactory getINSTANCE() {
            return (HttpClientFactory) HttpClientFactory.INSTANCE$delegate.getValue();
        }
    }

    public HttpClientFactory() {
        this.client$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new HttpClientFactory$client$2(this));
    }

    public /* synthetic */ HttpClientFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final OkHttpClient getDefaultClient() {
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        httpClientBuilder.connectTimeout(30000, TimeUnit.MILLISECONDS);
        httpClientBuilder.readTimeout(30000, TimeUnit.MILLISECONDS);
        httpClientBuilder.writeTimeout(30000, TimeUnit.MILLISECONDS);
        httpClientBuilder.connectionPool(new ConnectionPool(5, 5, TimeUnit.MINUTES));
        return httpClientBuilder.build();
    }

    @NotNull
    public final OkHttpClient getClient() {
        return (OkHttpClient) this.client$delegate.getValue();
    }
}

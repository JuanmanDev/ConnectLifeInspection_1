package com.juconnect.vivino.retrofit;

import com.juconnect.vivino.interceptor.Vivino204Interceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo47991d2 = {"Lcom/juconnect/vivino/retrofit/HttpClientFactory;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "getDefaultClient", "Companion", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HttpClientFactory.kt */
public final class HttpClientFactory {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static HttpClientFactory INSTANCE;
    @Nullable
    public OkHttpClient client;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo47991d2 = {"Lcom/juconnect/vivino/retrofit/HttpClientFactory$Companion;", "", "()V", "INSTANCE", "Lcom/juconnect/vivino/retrofit/HttpClientFactory;", "getInstance", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HttpClientFactory.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HttpClientFactory getInstance() {
            if (HttpClientFactory.INSTANCE == null) {
                synchronized (HttpClientFactory.class) {
                    Companion companion = HttpClientFactory.Companion;
                    HttpClientFactory.INSTANCE = new HttpClientFactory((DefaultConstructorMarker) null);
                    Unit unit = Unit.INSTANCE;
                }
            }
            HttpClientFactory access$getINSTANCE$cp = HttpClientFactory.INSTANCE;
            Intrinsics.checkNotNull(access$getINSTANCE$cp);
            return access$getINSTANCE$cp;
        }
    }

    public HttpClientFactory() {
    }

    public /* synthetic */ HttpClientFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final OkHttpClient getDefaultClient() {
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        httpClientBuilder.connectTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.readTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.writeTimeout(10000, TimeUnit.MILLISECONDS);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        httpLoggingInterceptor.mo52898c(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder.addNetworkInterceptor(httpLoggingInterceptor);
        httpClientBuilder.addInterceptor(new Vivino204Interceptor());
        return httpClientBuilder.build();
    }

    @NotNull
    public final OkHttpClient getClient() {
        if (this.client == null) {
            synchronized (HttpClientFactory.class) {
                this.client = getDefaultClient();
                Unit unit = Unit.INSTANCE;
            }
        }
        OkHttpClient okHttpClient = this.client;
        Intrinsics.checkNotNull(okHttpClient);
        return okHttpClient;
    }
}

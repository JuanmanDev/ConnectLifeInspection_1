package com.hisense.connect_life.hismart.networks.retrofit;

import androidx.appcompat.widget.TooltipCompatHandler;
import com.hisense.connect_life.hismart.networks.interceptor.SignInterceptor;
import com.hisense.connect_life.hismart.networks.interceptor.TokenInvalidInterceptor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import p040c.p107e.p108a.C1964a;
import p040c.p107e.p108a.C1966c;
import p040c.p107e.p108a.p109e.C1969b;
import p040c.p107e.p108a.p109e.C1970c;
import p692o.C9910q;
import p692o.p693v.p694a.C9930g;
import p692o.p695w.p696a.C9931a;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/retrofit/RetrofitUtils;", "Lcom/hisense/connect_life/hismart/networks/retrofit/IRetrofitStrategy;", "()V", "getConfigClient", "Lokhttp3/OkHttpClient;", "username", "", "password", "getDefaultClient", "getRetrofit", "Lretrofit2/Retrofit;", "urlBase", "okHttpClient", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RetrofitUtils.kt */
public final class RetrofitUtils implements IRetrofitStrategy {
    @NotNull
    public static final RetrofitUtils INSTANCE = new RetrofitUtils();

    private final OkHttpClient getConfigClient(String str, String str2) {
        C1970c cVar = new C1970c(new C1969b(str, str2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C1966c cVar2 = new C1966c(cVar, concurrentHashMap);
        C1964a aVar = new C1964a(concurrentHashMap);
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        httpClientBuilder.connectTimeout(TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        httpClientBuilder.readTimeout(30000, TimeUnit.MILLISECONDS);
        httpClientBuilder.writeTimeout(30000, TimeUnit.MILLISECONDS);
        X509TrustManager x509TrustManager = SSLSocketClient.INSTANCE.getX509TrustManager();
        if (x509TrustManager != null) {
            httpClientBuilder.setSSLSocketFactory(SSLSocketClient.INSTANCE.getSSLSocketFactory(), x509TrustManager);
        }
        httpClientBuilder.hostnameVerifier(SSLSocketClient.INSTANCE.getHostnameVerifier());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        httpLoggingInterceptor.mo52898c(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder.addNetworkInterceptor(httpLoggingInterceptor);
        httpClientBuilder.authenticator(cVar2);
        httpClientBuilder.addInterceptor(aVar);
        return httpClientBuilder.build();
    }

    private final OkHttpClient getDefaultClient() {
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        httpClientBuilder.connectTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.readTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.writeTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.addInterceptor(new TokenInvalidInterceptor());
        httpClientBuilder.addInterceptor(new SignInterceptor());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        httpLoggingInterceptor.mo52898c(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder.addNetworkInterceptor(httpLoggingInterceptor);
        return httpClientBuilder.build();
    }

    @NotNull
    public C9910q getRetrofit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "urlBase");
        C9910q.C9912b bVar = new C9910q.C9912b();
        bVar.mo51335c(str);
        bVar.mo51334b(C9931a.m26615f());
        bVar.mo51333a(C9930g.m26613d());
        bVar.mo51339g(INSTANCE.getDefaultClient());
        C9910q e = bVar.mo51337e();
        Intrinsics.checkNotNullExpressionValue(e, "retrofitBuilder");
        return e;
    }

    @NotNull
    public C9910q getRetrofit(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "urlBase");
        Intrinsics.checkNotNullParameter(str2, "username");
        Intrinsics.checkNotNullParameter(str3, "password");
        C9910q.C9912b bVar = new C9910q.C9912b();
        bVar.mo51335c(str);
        bVar.mo51334b(C9931a.m26615f());
        bVar.mo51333a(C9930g.m26613d());
        bVar.mo51339g(INSTANCE.getConfigClient(str2, str3));
        C9910q e = bVar.mo51337e();
        Intrinsics.checkNotNullExpressionValue(e, "retrofitBuilder");
        return e;
    }

    @NotNull
    public C9910q getRetrofit(@NotNull String str, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(str, "urlBase");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        C9910q.C9912b bVar = new C9910q.C9912b();
        bVar.mo51335c(str);
        bVar.mo51334b(C9931a.m26615f());
        bVar.mo51333a(C9930g.m26613d());
        bVar.mo51339g(okHttpClient);
        C9910q e = bVar.mo51337e();
        Intrinsics.checkNotNullExpressionValue(e, "retrofitBuilder");
        return e;
    }
}

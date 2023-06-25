package com.juconnect.connectlife.retrofit;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import p040c.p301y.p302b.p517d.C7743a;
import p692o.C9910q;
import p692o.p693v.p694a.C9930g;
import p692o.p695w.p696a.C9931a;
import p692o.p695w.p697b.C9944k;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connectlife/retrofit/RetrofitUtils;", "Lcom/juconnect/connectlife/retrofit/IRetrofitStrategy;", "()V", "getDefaultClient", "Lokhttp3/OkHttpClient;", "getRetrofit", "Lretrofit2/Retrofit;", "urlBase", "", "okHttpClient", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RetrofitUtils.kt */
public final class RetrofitUtils implements IRetrofitStrategy {
    @NotNull
    public static final RetrofitUtils INSTANCE = new RetrofitUtils();

    private final OkHttpClient getDefaultClient() {
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        httpClientBuilder.connectTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.readTimeout(10000, TimeUnit.MILLISECONDS);
        httpClientBuilder.writeTimeout(10000, TimeUnit.MILLISECONDS);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        HostnameVerifier a = C7743a.m21826a();
        Intrinsics.checkNotNullExpressionValue(a, "getHostnameVerifier()");
        httpClientBuilder.hostnameVerifier(a);
        httpLoggingInterceptor.mo52898c(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder.addInterceptor(httpLoggingInterceptor);
        return httpClientBuilder.build();
    }

    @NotNull
    public C9910q getRetrofit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "urlBase");
        C9910q.C9912b bVar = new C9910q.C9912b();
        bVar.mo51335c(str);
        bVar.mo51333a(C9930g.m26613d());
        bVar.mo51334b(C9944k.m26643f());
        bVar.mo51334b(C9931a.m26615f());
        bVar.mo51339g(INSTANCE.getDefaultClient());
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
        bVar.mo51333a(C9930g.m26613d());
        bVar.mo51334b(C9931a.m26615f());
        bVar.mo51334b(C9944k.m26643f());
        bVar.mo51339g(INSTANCE.getDefaultClient());
        C9910q e = bVar.mo51337e();
        Intrinsics.checkNotNullExpressionValue(e, "retrofitBuilder");
        return e;
    }
}

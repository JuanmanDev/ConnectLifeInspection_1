package com.hisense.connect_life.hismart.networks.retrofit;

import kotlin.Metadata;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p692o.C9910q;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/retrofit/IRetrofitStrategy;", "", "getRetrofit", "Lretrofit2/Retrofit;", "urlBase", "", "username", "password", "okHttpClient", "Lokhttp3/OkHttpClient;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IRetrofitStrategy.kt */
public interface IRetrofitStrategy {
    @NotNull
    C9910q getRetrofit(@NotNull String str);

    @NotNull
    C9910q getRetrofit(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    C9910q getRetrofit(@NotNull String str, @NotNull OkHttpClient okHttpClient);
}

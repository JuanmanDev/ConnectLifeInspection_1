package com.juconnect.connectlife.retrofit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p692o.C9910q;

@Metadata(mo47990d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a%\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, mo47991d2 = {"httpClientBuilder", "Lokhttp3/OkHttpClient;", "builderAction", "Lkotlin/Function1;", "Lcom/juconnect/connectlife/retrofit/HttpClientBuilder;", "", "Lkotlin/ExtensionFunctionType;", "retrofitBuilder", "Lretrofit2/Retrofit;", "Lretrofit2/Retrofit$Builder;", "connectlife_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RetrofitExt.kt */
public final class RetrofitExtKt {
    @NotNull
    public static final OkHttpClient httpClientBuilder(@NotNull Function1<? super HttpClientBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "builderAction");
        HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
        function1.invoke(httpClientBuilder);
        return httpClientBuilder.build();
    }

    @NotNull
    public static final C9910q retrofitBuilder(@NotNull Function1<? super C9910q.C9912b, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "builderAction");
        C9910q.C9912b bVar = new C9910q.C9912b();
        function1.invoke(bVar);
        C9910q e = bVar.mo51337e();
        Intrinsics.checkNotNullExpressionValue(e, "retrofitBuilder");
        return e;
    }
}

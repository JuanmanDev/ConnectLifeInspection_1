package com.juconnect.vivino.interceptor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/vivino/interceptor/Vivino204Interceptor;", "Lokhttp3/Interceptor;", "()V", "resultStr", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Vivino204Interceptor.kt */
public final class Vivino204Interceptor implements Interceptor {
    @NotNull
    public String resultStr = "";

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        String string;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        if (proceed != null) {
            if (proceed.code() != 204) {
                ResponseBody body = proceed.body();
                String str = "";
                if (!(body == null || (string = body.string()) == null)) {
                    str = string;
                }
                this.resultStr = str;
            } else {
                Intrinsics.stringPlus("Vivino204Interceptor response:", proceed);
                throw new Exception("response code = 204");
            }
        }
        Response.Builder newBuilder = proceed.newBuilder();
        ResponseBody.Companion companion = ResponseBody.Companion;
        ResponseBody body2 = proceed.body();
        return newBuilder.body(companion.create(body2 == null ? null : body2.contentType(), this.resultStr)).build();
    }
}

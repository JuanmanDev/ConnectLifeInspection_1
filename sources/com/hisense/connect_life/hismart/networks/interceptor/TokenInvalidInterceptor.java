package com.hisense.connect_life.hismart.networks.interceptor;

import com.google.gson.Gson;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.listener.ITokenInvalidCallback;
import com.hisense.connect_life.hismart.networks.request.TokenInvalidResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/interceptor/TokenInvalidInterceptor;", "Lokhttp3/Interceptor;", "()V", "resultStr", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isTokenInvalid", "response", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TokenInvalidInterceptor.kt */
public final class TokenInvalidInterceptor implements Interceptor {
    @NotNull
    public String resultStr = "";

    private final String isTokenInvalid(Response response) {
        try {
            ResponseBody body = response.body();
            String str = "";
            if (body != null) {
                String string = body.string();
                if (string != null) {
                    str = string;
                }
            }
            this.resultStr = str;
            if (str.length() == 0) {
                return "false";
            }
            Object fromJson = new Gson().fromJson(this.resultStr, TokenInvalidResponse.class);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(resultSt…alidResponse::class.java)");
            TokenInvalidResponse tokenInvalidResponse = (TokenInvalidResponse) fromJson;
            if (!(100026 == tokenInvalidResponse.getResponse().getErrorCode() || 100027 == tokenInvalidResponse.getResponse().getErrorCode() || 611701 == tokenInvalidResponse.getResponse().getErrorCode() || 611702 == tokenInvalidResponse.getResponse().getErrorCode())) {
                if (600722 != tokenInvalidResponse.getResponse().getErrorCode()) {
                    return "false";
                }
            }
            return String.valueOf(tokenInvalidResponse.getResponse().getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        ITokenInvalidCallback iTokenInvalidCallback = HiSmart.Companion.getInstance().getITokenInvalidCallback();
        if (iTokenInvalidCallback != null) {
            iTokenInvalidCallback.accept(isTokenInvalid(proceed));
        }
        Response.Builder newBuilder = proceed.newBuilder();
        ResponseBody.Companion companion = ResponseBody.Companion;
        ResponseBody body = proceed.body();
        return newBuilder.body(companion.create(body == null ? null : body.contentType(), this.resultStr)).build();
    }
}

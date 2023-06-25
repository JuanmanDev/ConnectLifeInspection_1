package com.hisense.connect_life.hismart.networks.interceptor;

import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.listener.ITokenInvalidCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/interceptor/SignInterceptor;", "Lokhttp3/Interceptor;", "()V", "resultStr", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "signCheckFail", "response", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SignInterceptor.kt */
public final class SignInterceptor implements Interceptor {
    @NotNull
    public String resultStr = "sign check failed!";

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ Exception -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[Catch:{ Exception -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0020 A[Catch:{ Exception -> 0x0056 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ Exception -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String signCheckFail(okhttp3.Response r5) {
        /*
            r4 = this;
            java.lang.String r0 = "false"
            okhttp3.ResponseBody r5 = r5.body()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r1 = ""
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = r1
            goto L_0x0013
        L_0x000c:
            java.lang.String r5 = r5.string()     // Catch:{ Exception -> 0x0056 }
            if (r5 != 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            r4.resultStr = r5     // Catch:{ Exception -> 0x0056 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0056 }
            if (r5 != 0) goto L_0x001d
            r5 = 1
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            if (r5 == 0) goto L_0x0021
            return r0
        L_0x0021:
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0056 }
            r5.<init>()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = r4.resultStr     // Catch:{ Exception -> 0x0056 }
            java.lang.Class<com.hisense.connect_life.hismart.model.JuCustomResult> r3 = com.hisense.connect_life.hismart.model.JuCustomResult.class
            java.lang.Object r5 = r5.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x0056 }
            com.hisense.connect_life.hismart.model.JuCustomResult r5 = (com.hisense.connect_life.hismart.model.JuCustomResult) r5     // Catch:{ Exception -> 0x0056 }
            if (r5 != 0) goto L_0x0034
        L_0x0032:
            r5 = r1
            goto L_0x003b
        L_0x0034:
            java.lang.String r5 = r5.getSignatureServer()     // Catch:{ Exception -> 0x0056 }
            if (r5 != 0) goto L_0x003b
            goto L_0x0032
        L_0x003b:
            java.lang.String r2 = ",(\\s*)\"signatureServer\":(\\s*)\"(.*?)\""
            kotlin.text.Regex r3 = new kotlin.text.Regex     // Catch:{ Exception -> 0x0056 }
            r3.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = r4.resultStr     // Catch:{ Exception -> 0x0056 }
            java.lang.String r1 = r3.replace((java.lang.CharSequence) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x0056 }
            com.hisense.connect_life.hismart.networks.parameters.RsaSignProvider r2 = new com.hisense.connect_life.hismart.networks.parameters.RsaSignProvider     // Catch:{ Exception -> 0x0056 }
            r2.<init>()     // Catch:{ Exception -> 0x0056 }
            boolean r5 = r2.checkSign(r1, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0056 }
            return r5
        L_0x0056:
            r5 = move-exception
            r5.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.interceptor.SignInterceptor.signCheckFail(okhttp3.Response):java.lang.String");
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        ITokenInvalidCallback iTokenInvalidCallback = HiSmart.Companion.getInstance().getITokenInvalidCallback();
        if (iTokenInvalidCallback != null) {
            iTokenInvalidCallback.accept(signCheckFail(proceed));
        }
        Response.Builder newBuilder = proceed.newBuilder();
        ResponseBody.Companion companion = ResponseBody.Companion;
        ResponseBody body = proceed.body();
        return newBuilder.body(companion.create(body == null ? null : body.contentType(), this.resultStr)).build();
    }
}

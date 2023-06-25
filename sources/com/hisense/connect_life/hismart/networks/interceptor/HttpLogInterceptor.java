package com.hisense.connect_life.hismart.networks.interceptor;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p040c.p525z.p526a.C7820f;
import p040c.p525z.p526a.C7825i;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/interceptor/HttpLogInterceptor;", "Lokhttp3/Interceptor;", "()V", "tag", "", "utf8", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HttpLogInterceptor.kt */
public final class HttpLogInterceptor implements Interceptor {
    @NotNull
    public final String tag = "OKHttp";
    public final Charset utf8 = Charset.forName("UTF-8");

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        Response proceed = chain.proceed(request);
        if (body != null) {
            Buffer buffer = new Buffer();
            body.writeTo(buffer);
            Charset charset = this.utf8;
            MediaType contentType = body.contentType();
            if (contentType != null) {
                charset = contentType.charset(this.utf8);
            }
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            str = buffer.readString(charset);
        } else {
            str = null;
        }
        C7820f.m21854h(this.tag).mo33315f("发送请求\nmethod：%s\nurl：%s\nheaders: %sbody：%s", request.method(), request.url(), request.headers(), str);
        ResponseBody body2 = proceed.body();
        if (body2 != null) {
            BufferedSource source = body2.source();
            source.request(Long.MAX_VALUE);
            Buffer buffer2 = source.buffer();
            Charset charset2 = this.utf8;
            MediaType contentType2 = body2.contentType();
            if (contentType2 != null) {
                try {
                    charset2 = contentType2.charset(this.utf8);
                } catch (UnsupportedCharsetException e) {
                    e.printStackTrace();
                }
            }
            Buffer clone = buffer2.clone();
            Intrinsics.checkNotNullExpressionValue(charset2, "charset");
            String readString = clone.readString(charset2);
            C7825i h = C7820f.m21854h("OKHttp");
            Buffer clone2 = buffer2.clone();
            Intrinsics.checkNotNullExpressionValue(charset2, "charset");
            h.mo33317h(clone2.readString(charset2));
            C7820f.m21854h(this.tag).mo33318i("收到响应\n%s %s\n请求url：%s\n请求body：%s\n响应body：%s", Integer.valueOf(proceed.code()), proceed.message(), proceed.request().url(), str, readString);
        }
        return proceed;
    }
}

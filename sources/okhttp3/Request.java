package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\u0018\u0000:\u00015BC\b\u0000\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0016\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u00190-¢\u0006\u0004\b3\u00104J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b\u0004\u0010\u0003R\u0013\u0010\b\u001a\u00020\u00058G@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0019\u0010\u0010\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010(\u001a\u00020'8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b\u0015\u0010\u0014R,\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u00190-8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010$\u001a\u00020!8\u0007@\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b$\u0010#¨\u00066"}, mo47991d2 = {"Lokhttp3/Request;", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", "body", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_method", "()Ljava/lang/String;", "method", "Lokhttp3/Request$Builder;", "newBuilder", "()Lokhttp3/Request$Builder;", "", "tag", "()Ljava/lang/Object;", "T", "Ljava/lang/Class;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "Lokhttp3/RequestBody;", "Lokhttp3/Headers;", "", "isHttps", "()Z", "lazyCacheControl", "Lokhttp3/CacheControl;", "Ljava/lang/String;", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "Lokhttp3/HttpUrl;", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Request.kt */
public final class Request {
    @Nullable
    public final RequestBody body;
    @NotNull
    public final Headers headers;
    public CacheControl lazyCacheControl;
    @NotNull
    public final String method;
    @NotNull
    public final Map<Class<?>, Object> tags;
    @NotNull
    public final HttpUrl url;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0010\b\u0016\u0018\u0000B\t\b\u0016¢\u0006\u0004\bF\u0010GB\u0011\b\u0010\u0012\u0006\u0010H\u001a\u00020\u0006¢\u0006\u0004\bF\u0010IJ\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001f2\b\u0010!\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b!\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0001H\u0016¢\u0006\u0004\b&\u0010\u001dJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020(H\u0016¢\u0006\u0004\b&\u0010)R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020/8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0017\u001a\u00020\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R2\u0010;\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020#0:8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010&\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, mo47991d2 = {"Lokhttp3/Request$Builder;", "", "name", "value", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", "build", "()Lokhttp3/Request;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "Lokhttp3/RequestBody;", "body", "delete", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "header", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "patch", "post", "put", "removeHeader", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "T", "Ljava/lang/Class;", "type", "tag", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "url", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "<init>", "()V", "request", "(Lokhttp3/Request;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Request.kt */
    public static class Builder {
        @Nullable
        public RequestBody body;
        @NotNull
        public Headers.Builder headers;
        @NotNull
        public String method;
        @NotNull
        public Map<Class<?>, Object> tags;
        @Nullable
        public HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = ShareTarget.METHOD_GET;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        @NotNull
        @JvmOverloads
        public Builder delete() {
            return delete$default(this, (RequestBody) null, 1, (Object) null);
        }

        @NotNull
        @JvmOverloads
        public Builder delete(@Nullable RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        @NotNull
        public Builder get() {
            return method(ShareTarget.METHOD_GET, (RequestBody) null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method("HEAD", (RequestBody) null);
        }

        @NotNull
        public Builder header(@NotNull String str, @NotNull String str2) {
            this.headers.set(str, str2);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String str, @Nullable RequestBody requestBody) {
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @NotNull
        public Builder patch(@NotNull RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        @NotNull
        public Builder post(@NotNull RequestBody requestBody) {
            return method(ShareTarget.METHOD_POST, requestBody);
        }

        @NotNull
        public Builder put(@NotNull RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl httpUrl) {
            this.url = httpUrl;
            return this;
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t) {
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                Object cast = cls.cast(t);
                if (cast == null) {
                    Intrinsics.throwNpe();
                }
                map.put(cls, cast);
            }
            return this;
        }

        @NotNull
        public Builder url(@NotNull String str) {
            if (StringsKt__StringsJVMKt.startsWith(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> map;
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = MapsKt__MapsKt.toMutableMap(request.getTags$okhttp());
            }
            this.tags = map;
            this.headers = request.headers().newBuilder();
        }

        @NotNull
        public Builder url(@NotNull URL url2) {
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url3 = url2.toString();
            Intrinsics.checkExpressionValueIsNotNull(url3, "url.toString()");
            return url(companion.get(url3));
        }
    }

    public Request(@NotNull HttpUrl httpUrl, @NotNull String str, @NotNull Headers headers2, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> map) {
        this.url = httpUrl;
        this.method = str;
        this.headers = headers2;
        this.body = requestBody;
        this.tags = map;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_body")
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m28963deprecated_body() {
        return this.body;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m28964deprecated_cacheControl() {
        return cacheControl();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m28965deprecated_headers() {
        return this.headers;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    @JvmName(name = "-deprecated_method")
    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m28966deprecated_method() {
        return this.method;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m28967deprecated_url() {
        return this.url;
    }

    @Nullable
    @JvmName(name = "body")
    public final RequestBody body() {
        return this.body;
    }

    @NotNull
    @JvmName(name = "cacheControl")
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String str) {
        return this.headers.get(str);
    }

    @NotNull
    @JvmName(name = "headers")
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @NotNull
    @JvmName(name = "method")
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    @JvmName(name = "url")
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        return this.headers.values(str);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}

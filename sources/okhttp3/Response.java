package okhttp3;

import java.io.Closeable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001XB}\b\u0000\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010(\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010$\u001a\u00020!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0000\u0012\b\u00103\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010@\u001a\u00020.\u0012\u0006\u0010:\u001a\u00020.\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bV\u0010WJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\u001cH\u0007¢\u0006\u0004\b&\u0010'J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b)\u0010\u000bJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b2\u0010\u000bJ\u000f\u00107\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u000f\u0010:\u001a\u00020.H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010>\u001a\u00020;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010@\u001a\u00020.H\u0007¢\u0006\u0004\b?\u00109J\u000f\u0010A\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010'J\r\u0010B\u001a\u00020!¢\u0006\u0004\bB\u0010#R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\b\u0005\u0010\u0004R\u0013\u0010\t\u001a\u00020\u00068G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0017\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010G\u001a\u0004\u0018\u00010F8\u0001@\u0000X\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010J\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010$\u001a\u00020!8\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010K\u001a\u0004\b$\u0010#R\u0013\u0010M\u001a\u00020L8F@\u0006¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010O\u001a\u00020L8F@\u0006¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0019\u0010(\u001a\u00020\u001c8\u0007@\u0006¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\b(\u0010'R\u001b\u0010*\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\b*\u0010\u000bR\u001b\u00103\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b3\u0010\u000bR\u0019\u00107\u001a\u0002048\u0007@\u0006¢\u0006\f\n\u0004\b7\u0010S\u001a\u0004\b7\u00106R\u0019\u0010:\u001a\u00020.8\u0007@\u0006¢\u0006\f\n\u0004\b:\u0010T\u001a\u0004\b:\u00109R\u0019\u0010>\u001a\u00020;8\u0007@\u0006¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\b>\u0010=R\u0019\u0010@\u001a\u00020.8\u0007@\u0006¢\u0006\f\n\u0004\b@\u0010T\u001a\u0004\b@\u00109¨\u0006Y"}, mo47991d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/ResponseBody;", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_cacheResponse", "()Lokhttp3/Response;", "cacheResponse", "", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "", "close", "()V", "", "-deprecated_code", "()I", "code", "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", "", "name", "defaultValue", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_message", "()Ljava/lang/String;", "message", "-deprecated_networkResponse", "networkResponse", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "", "byteCount", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", "-deprecated_receivedResponseAtMillis", "()J", "receivedResponseAtMillis", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "-deprecated_sentRequestAtMillis", "sentRequestAtMillis", "toString", "trailers", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "I", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "", "isRedirect", "()Z", "isSuccessful", "lazyCacheControl", "Lokhttp3/CacheControl;", "Ljava/lang/String;", "Lokhttp3/Protocol;", "J", "Lokhttp3/Request;", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Response.kt */
public final class Response implements Closeable {
    @Nullable
    public final ResponseBody body;
    @Nullable
    public final Response cacheResponse;
    public final int code;
    @Nullable
    public final Exchange exchange;
    @Nullable
    public final Handshake handshake;
    @NotNull
    public final Headers headers;
    public CacheControl lazyCacheControl;
    @NotNull
    public final String message;
    @Nullable
    public final Response networkResponse;
    @Nullable
    public final Response priorResponse;
    @NotNull
    public final Protocol protocol;
    public final long receivedResponseAtMillis;
    @NotNull
    public final Request request;
    public final long sentRequestAtMillis;

    public Response(@NotNull Request request2, @NotNull Protocol protocol2, @NotNull String str, int i, @Nullable Handshake handshake2, @NotNull Headers headers2, @Nullable ResponseBody responseBody, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j, long j2, @Nullable Exchange exchange2) {
        this.request = request2;
        this.protocol = protocol2;
        this.message = str;
        this.code = i;
        this.handshake = handshake2;
        this.headers = headers2;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange2;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_body")
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m28968deprecated_body() {
        return this.body;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m28969deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_cacheResponse")
    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final Response m28970deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "code", imports = {}))
    @JvmName(name = "-deprecated_code")
    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m28971deprecated_code() {
        return this.code;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "handshake", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_handshake")
    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m28972deprecated_handshake() {
        return this.handshake;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m28973deprecated_headers() {
        return this.headers;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "message", imports = {}))
    @JvmName(name = "-deprecated_message")
    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m28974deprecated_message() {
        return this.message;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_networkResponse")
    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final Response m28975deprecated_networkResponse() {
        return this.networkResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_priorResponse")
    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final Response m28976deprecated_priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocol", imports = {}))
    @JvmName(name = "-deprecated_protocol")
    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m28977deprecated_protocol() {
        return this.protocol;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    @JvmName(name = "-deprecated_receivedResponseAtMillis")
    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m28978deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "request", imports = {}))
    @JvmName(name = "-deprecated_request")
    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m28979deprecated_request() {
        return this.request;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    @JvmName(name = "-deprecated_sentRequestAtMillis")
    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m28980deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Nullable
    @JvmName(name = "body")
    public final ResponseBody body() {
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

    @Nullable
    @JvmName(name = "cacheResponse")
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<Challenge> challenges() {
        String str;
        Headers headers2 = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return CollectionsKt__CollectionsKt.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers2, str);
    }

    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    @JvmName(name = "code")
    public final int code() {
        return this.code;
    }

    @Nullable
    @JvmName(name = "exchange")
    public final Exchange exchange() {
        return this.exchange;
    }

    @Nullable
    @JvmName(name = "handshake")
    public final Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    @JvmOverloads
    public final String header(@NotNull String str) {
        return header$default(this, str, (String) null, 2, (Object) null);
    }

    @Nullable
    @JvmOverloads
    public final String header(@NotNull String str, @Nullable String str2) {
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
    }

    @NotNull
    @JvmName(name = "headers")
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    @NotNull
    @JvmName(name = "message")
    public final String message() {
        return this.message;
    }

    @Nullable
    @JvmName(name = "networkResponse")
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final ResponseBody peekBody(long j) {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            Intrinsics.throwNpe();
        }
        BufferedSource peek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        peek.request(j);
        buffer.write((Source) peek, Math.min(j, peek.getBuffer().size()));
        return ResponseBody.Companion.create((BufferedSource) buffer, this.body.contentType(), buffer.size());
    }

    @Nullable
    @JvmName(name = "priorResponse")
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    @JvmName(name = "protocol")
    public final Protocol protocol() {
        return this.protocol;
    }

    @JvmName(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    @JvmName(name = "request")
    public final Request request() {
        return this.request;
    }

    @JvmName(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @NotNull
    public final Headers trailers() {
        Exchange exchange2 = this.exchange;
        if (exchange2 != null) {
            return exchange2.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        return this.headers.values(str);
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u0000B\t\b\u0016¢\u0006\u0004\bi\u0010jB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\bi\u0010\u0011J\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b%\u0010\rJ\u0019\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010\rJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b-\u0010$J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\f\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010!R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001c\u001a\u00020I8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010#\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010%\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u00107\u001a\u0004\bT\u0010\u000b\"\u0004\bU\u0010\u0011R$\u0010&\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u00107\u001a\u0004\bV\u0010\u000b\"\u0004\bW\u0010\u0011R$\u0010(\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b(\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010/\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u00101\u001a\u00020*8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010]\u001a\u0004\bg\u0010_\"\u0004\bh\u0010a¨\u0006k"}, mo47991d2 = {"Lokhttp3/Response$Builder;", "", "name", "value", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "build", "()Lokhttp3/Response;", "cacheResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "response", "", "checkPriorResponse", "(Lokhttp3/Response;)V", "checkSupportResponse", "(Ljava/lang/String;Lokhttp3/Response;)V", "", "code", "(I)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "header", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "networkResponse", "priorResponse", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "receivedResponseAtMillis", "(J)Lokhttp3/Response$Builder;", "removeHeader", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "sentRequestAtMillis", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "J", "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Response.kt */
    public static class Builder {
        @Nullable
        public ResponseBody body;
        @Nullable
        public Response cacheResponse;
        public int code;
        @Nullable
        public Exchange exchange;
        @Nullable
        public Handshake handshake;
        @NotNull
        public Headers.Builder headers;
        @Nullable
        public String message;
        @Nullable
        public Response networkResponse;
        @Nullable
        public Response priorResponse;
        @Nullable
        public Protocol protocol;
        public long receivedResponseAtMillis;
        @Nullable
        public Request request;
        public long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                boolean z = true;
                if (response.body() == null) {
                    if (response.networkResponse() == null) {
                        if (response.cacheResponse() == null) {
                            if (response.priorResponse() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Builder body(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @NotNull
        public Response build() {
            if (this.code >= 0) {
                Request request2 = this.request;
                if (request2 != null) {
                    Protocol protocol2 = this.protocol;
                    if (protocol2 != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request2, protocol2, str, this.code, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @NotNull
        public Builder code(int i) {
            this.code = i;
            return this;
        }

        @Nullable
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @Nullable
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @Nullable
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @Nullable
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @Nullable
        public final String getMessage$okhttp() {
            return this.message;
        }

        @Nullable
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @Nullable
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @Nullable
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake2) {
            this.handshake = handshake2;
            return this;
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

        public final void initExchange$okhttp(@NotNull Exchange exchange2) {
            this.exchange = exchange2;
        }

        @NotNull
        public Builder message(@NotNull String str) {
            this.message = str;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            this.headers.removeAll(str);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request2) {
            this.request = request2;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange2) {
            this.exchange = exchange2;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake2) {
            this.handshake = handshake2;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol2) {
            this.protocol = protocol2;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(@Nullable Request request2) {
            this.request = request2;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public Builder(@NotNull Response response) {
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}

package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p699io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0004ONPQB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bI\u0010JB!\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bI\u0010MJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001aJ\u0019\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020\u0018¢\u0006\u0004\b(\u0010\u001aJ\r\u0010)\u001a\u00020\u001c¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010+\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010\nJ\u0017\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0004\b3\u00104J\u0013\u00108\u001a\b\u0012\u0004\u0012\u00020706¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0018¢\u0006\u0004\b:\u0010\u001aJ\r\u0010;\u001a\u00020\u0018¢\u0006\u0004\b;\u0010\u001aR\u001c\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0013\u0010\u000f\u001a\u00020\f8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0013\u0010B\u001a\u00020A8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010@R\"\u0010:\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b:\u0010@\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010FR\"\u0010;\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010@\u001a\u0004\bG\u0010\u001a\"\u0004\bH\u0010F¨\u0006R"}, mo47991d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "", "abortQuietly", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "close", "()V", "delete", "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "evictAll", "flush", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "", "hitCount", "()I", "initialize", "", "maxSize", "()J", "networkCount", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "requestCount", "size", "trackConditionalCacheHit$okhttp", "trackConditionalCacheHit", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "", "", "urls", "()Ljava/util/Iterator;", "writeAbortCount", "writeSuccessCount", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "I", "", "isClosed", "()Z", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "(I)V", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "<init>", "(Ljava/io/File;J)V", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Cache.kt */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int ENTRY_BODY = 1;
    public static final int ENTRY_COUNT = 2;
    public static final int ENTRY_METADATA = 0;
    public static final int VERSION = 201105;
    @NotNull
    public final DiskLruCache cache;
    public int hitCount;
    public int networkCount;
    public int requestCount;
    public int writeAbortCount;
    public int writeSuccessCount;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B)\b\u0000\u0012\n\u0010\u0011\u001a\u00060\u000fR\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR \u0010\u0011\u001a\u00060\u000fR\u00020\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo47991d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "", "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "bodySource", "Lokio/BufferedSource;", "", "Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cache.kt */
    public static final class CacheResponseBody extends ResponseBody {
        public final BufferedSource bodySource;
        public final String contentLength;
        public final String contentType;
        @NotNull
        public final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@NotNull DiskLruCache.Snapshot snapshot2, @Nullable String str, @Nullable String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            Source source = snapshot2.getSource(1);
            this.bodySource = Okio.buffer((Source) new ForwardingSource(this, source, source) {
                public final /* synthetic */ Source $source;
                public final /* synthetic */ CacheResponseBody this$0;

                {
                    this.this$0 = r1;
                    this.$source = r2;
                }

                public void close() {
                    this.this$0.getSnapshot$okhttp().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1);
            }
            return -1;
        }

        @Nullable
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @NotNull
        public final DiskLruCache.Snapshot getSnapshot$okhttp() {
            return this.snapshot;
        }

        @NotNull
        public BufferedSource source() {
            return this.bodySource;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0016*\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b*\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b#\u0010 ¨\u0006&"}, mo47991d2 = {"Lokhttp3/Cache$Companion;", "Lokhttp3/HttpUrl;", "url", "", "key", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lokio/BufferedSource;", "source", "", "readInt$okhttp", "(Lokio/BufferedSource;)I", "readInt", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "", "varyFields", "(Lokhttp3/Headers;)Ljava/util/Set;", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cache.kt */
    public static final class Companion {
        public Companion() {
        }

        private final Set<String> varyFields(@NotNull Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    for (String str : StringsKt__StringsKt.split$default((CharSequence) value, new char[]{','}, false, 0, 6, (Object) null)) {
                        if (str != null) {
                            treeSet.add(StringsKt__StringsKt.trim((CharSequence) str).toString());
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            return treeSet != null ? treeSet : SetsKt__SetsKt.emptySet();
        }

        public final boolean hasVaryAll(@NotNull Response response) {
            return varyFields(response.headers()).contains("*");
        }

        @JvmStatic
        @NotNull
        public final String key(@NotNull HttpUrl httpUrl) {
            return ByteString.Companion.encodeUtf8(httpUrl.toString()).md5().hex();
        }

        public final int readInt$okhttp(@NotNull BufferedSource bufferedSource) {
            try {
                long readDecimalLong = bufferedSource.readDecimalLong();
                String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                if (readDecimalLong >= 0 && readDecimalLong <= ((long) Integer.MAX_VALUE)) {
                    if (!(readUtf8LineStrict.length() > 0)) {
                        return (int) readDecimalLong;
                    }
                }
                throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + Typography.quote);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        @NotNull
        public final Headers varyHeaders(@NotNull Response response) {
            Response networkResponse = response.networkResponse();
            if (networkResponse == null) {
                Intrinsics.throwNpe();
            }
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@NotNull Response response, @NotNull Headers headers, @NotNull Request request) {
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!Intrinsics.areEqual((Object) headers.values(str), (Object) request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00060\u0011R\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo47991d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "", "abort", "()V", "Lokio/Sink;", "body", "()Lokio/Sink;", "Lokio/Sink;", "cacheOut", "", "done", "Z", "getDone$okhttp", "()Z", "setDone$okhttp", "(Z)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cache.kt */
    public final class RealCacheRequest implements CacheRequest {
        public final Sink body;
        public final Sink cacheOut;
        public boolean done;
        public final DiskLruCache.Editor editor;

        public RealCacheRequest(@NotNull DiskLruCache.Editor editor2) {
            this.editor = editor2;
            Sink newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new ForwardingSink(this, newSink) {
                public final /* synthetic */ RealCacheRequest this$0;

                {
                    this.this$0 = r1;
                }

                public void close() {
                    synchronized (Cache.this) {
                        if (!this.this$0.getDone$okhttp()) {
                            this.this$0.setDone$okhttp(true);
                            Cache cache = Cache.this;
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.this$0.editor.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            synchronized (Cache.this) {
                if (!this.done) {
                    this.done = true;
                    Cache cache = Cache.this;
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @NotNull
        public Sink body() {
            return this.body;
        }

        public final boolean getDone$okhttp() {
            return this.done;
        }

        public final void setDone$okhttp(boolean z) {
            this.done = z;
        }
    }

    public Cache(@NotNull File file, long j, @NotNull FileSystem fileSystem) {
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String key(@NotNull HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @JvmName(name = "-deprecated_directory")
    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m28862deprecated_directory() {
        return this.cache.getDirectory();
    }

    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    @NotNull
    @JvmName(name = "directory")
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    public void flush() {
        this.cache.flush();
    }

    @Nullable
    public final Response get$okhttp(@NotNull Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly((Closeable) body);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly((Closeable) snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @NotNull
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @Nullable
    public final CacheRequest put$okhttp(@NotNull Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if ((!Intrinsics.areEqual((Object) method, (Object) ShareTarget.METHOD_GET)) || Companion.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, Companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(@NotNull Request request) {
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(@NotNull Response response, @NotNull Response response2) {
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                DiskLruCache.Editor edit = ((CacheResponseBody) body).getSnapshot$okhttp().edit();
                if (edit != null) {
                    entry.writeTo(edit);
                    edit.commit();
                }
            } catch (IOException unused) {
                abortQuietly((DiskLruCache.Editor) null);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    @NotNull
    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public Cache(@NotNull File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 9:\u00019B\u0011\b\u0010\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b6\u00108J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0018R\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00058B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00102\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00100¨\u0006:"}, mo47991d2 = {"Lokhttp3/Cache$Entry;", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "matches", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lokio/BufferedSource;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "(Lokio/BufferedSource;)Ljava/util/List;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "Lokio/BufferedSink;", "sink", "certificates", "", "writeCertList", "(Lokio/BufferedSink;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "editor", "writeTo", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "code", "I", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "isHttps", "()Z", "", "message", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "receivedResponseMillis", "J", "requestMethod", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "url", "varyHeaders", "Lokio/Source;", "rawSource", "<init>", "(Lokio/Source;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cache.kt */
    public static final class Entry {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String RECEIVED_MILLIS = (Platform.Companion.get().getPrefix() + "-Received-Millis");
        public static final String SENT_MILLIS = (Platform.Companion.get().getPrefix() + "-Sent-Millis");
        public final int code;
        public final Handshake handshake;
        public final String message;
        public final Protocol protocol;
        public final long receivedResponseMillis;
        public final String requestMethod;
        public final Headers responseHeaders;
        public final long sentRequestMillis;
        public final String url;
        public final Headers varyHeaders;

        @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003¨\u0006\u0007"}, mo47991d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
        /* compiled from: Cache.kt */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Entry(@NotNull Source source) {
            TlsVersion tlsVersion;
            try {
                BufferedSource buffer = Okio.buffer(source);
                this.url = buffer.readUtf8LineStrict();
                this.requestMethod = buffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(buffer);
                boolean z = false;
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(buffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.Companion.parse(buffer.readUtf8LineStrict());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(buffer);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(buffer.readUtf8LineStrict());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String readUtf8LineStrict = buffer.readUtf8LineStrict();
                    if (!(readUtf8LineStrict.length() > 0 ? true : z)) {
                        CipherSuite forJavaName = CipherSuite.Companion.forJavaName(buffer.readUtf8LineStrict());
                        List<Certificate> readCertificateList = readCertificateList(buffer);
                        List<Certificate> readCertificateList2 = readCertificateList(buffer);
                        if (!buffer.exhausted()) {
                            tlsVersion = TlsVersion.Companion.forJavaName(buffer.readUtf8LineStrict());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + Typography.quote);
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                source.close();
            }
        }

        private final boolean isHttps() {
            return StringsKt__StringsJVMKt.startsWith$default(this.url, "https://", false, 2, (Object) null);
        }

        private final List<Certificate> readCertificateList(BufferedSource bufferedSource) {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(bufferedSource);
            if (readInt$okhttp == -1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(readUtf8LineStrict);
                    if (decodeBase64 == null) {
                        Intrinsics.throwNpe();
                    }
                    buffer.write(decodeBase64);
                    arrayList.add(instance.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(BufferedSink bufferedSink, List<? extends Certificate> list) {
            try {
                bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    ByteString.Companion companion = ByteString.Companion;
                    Intrinsics.checkExpressionValueIsNotNull(encoded, "bytes");
                    bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, (Object) null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@NotNull Request request, @NotNull Response response) {
            return Intrinsics.areEqual((Object) this.url, (Object) request.url().toString()) && Intrinsics.areEqual((Object) this.requestMethod, (Object) request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        @NotNull
        public final Response response(@NotNull DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get(HttpHeaders.CONTENT_TYPE);
            String str2 = this.responseHeaders.get(HttpHeaders.CONTENT_LENGTH);
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0111, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0112, code lost:
            kotlin.p639io.CloseableKt.closeFinally(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0115, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Editor r8) {
            /*
                r7 = this;
                r0 = 0
                okio.Sink r8 = r8.newSink(r0)
                okio.BufferedSink r8 = okio.Okio.buffer((okio.Sink) r8)
                java.lang.String r1 = r7.url     // Catch:{ all -> 0x010f }
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch:{ all -> 0x010f }
                r2 = 10
                r1.writeByte(r2)     // Catch:{ all -> 0x010f }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x010f }
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch:{ all -> 0x010f }
                r1.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x010f }
                int r1 = r1.size()     // Catch:{ all -> 0x010f }
                long r3 = (long) r1     // Catch:{ all -> 0x010f }
                okio.BufferedSink r1 = r8.writeDecimalLong(r3)     // Catch:{ all -> 0x010f }
                r1.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x010f }
                int r1 = r1.size()     // Catch:{ all -> 0x010f }
                r3 = r0
            L_0x0032:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x0054
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x010f }
                java.lang.String r5 = r5.name(r3)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r5 = r8.writeUtf8(r5)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r4 = r5.writeUtf8(r4)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x010f }
                java.lang.String r5 = r5.value(r3)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r4 = r4.writeUtf8(r5)     // Catch:{ all -> 0x010f }
                r4.writeByte(r2)     // Catch:{ all -> 0x010f }
                int r3 = r3 + 1
                goto L_0x0032
            L_0x0054:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch:{ all -> 0x010f }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x010f }
                int r5 = r7.code     // Catch:{ all -> 0x010f }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x010f }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x010f }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010f }
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch:{ all -> 0x010f }
                r1.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x010f }
                int r1 = r1.size()     // Catch:{ all -> 0x010f }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x010f }
                okio.BufferedSink r1 = r8.writeDecimalLong(r5)     // Catch:{ all -> 0x010f }
                r1.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x010f }
                int r1 = r1.size()     // Catch:{ all -> 0x010f }
            L_0x0080:
                if (r0 >= r1) goto L_0x00a0
                okhttp3.Headers r3 = r7.responseHeaders     // Catch:{ all -> 0x010f }
                java.lang.String r3 = r3.name(r0)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r3 = r8.writeUtf8(r3)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r3 = r3.writeUtf8(r4)     // Catch:{ all -> 0x010f }
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x010f }
                java.lang.String r5 = r5.value(r0)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r3 = r3.writeUtf8(r5)     // Catch:{ all -> 0x010f }
                r3.writeByte(r2)     // Catch:{ all -> 0x010f }
                int r0 = r0 + 1
                goto L_0x0080
            L_0x00a0:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch:{ all -> 0x010f }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r0.writeDecimalLong(r5)     // Catch:{ all -> 0x010f }
                r0.writeByte(r2)     // Catch:{ all -> 0x010f }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch:{ all -> 0x010f }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r0.writeDecimalLong(r3)     // Catch:{ all -> 0x010f }
                r0.writeByte(r2)     // Catch:{ all -> 0x010f }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x010f }
                if (r0 == 0) goto L_0x0108
                r8.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x010f }
                if (r0 != 0) goto L_0x00d6
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x010f }
            L_0x00d6:
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x010f }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch:{ all -> 0x010f }
                r0.writeByte(r2)     // Catch:{ all -> 0x010f }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x010f }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x010f }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x010f }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x010f }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x010f }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x010f }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x010f }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x010f }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x010f }
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch:{ all -> 0x010f }
                r0.writeByte(r2)     // Catch:{ all -> 0x010f }
            L_0x0108:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x010f }
                r0 = 0
                kotlin.p639io.CloseableKt.closeFinally(r8, r0)
                return
            L_0x010f:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0111 }
            L_0x0111:
                r1 = move-exception
                kotlin.p639io.CloseableKt.closeFinally(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }

        public Entry(@NotNull Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}

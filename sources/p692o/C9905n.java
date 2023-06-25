package p692o;

import com.facebook.stetho.server.http.HttpHeaders;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: o.n */
/* compiled from: RequestBuilder */
public final class C9905n {

    /* renamed from: l */
    public static final char[] f19204l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f19205m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f19206a;

    /* renamed from: b */
    public final HttpUrl f19207b;

    /* renamed from: c */
    public String f19208c;

    /* renamed from: d */
    public HttpUrl.Builder f19209d;

    /* renamed from: e */
    public final Request.Builder f19210e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f19211f;

    /* renamed from: g */
    public MediaType f19212g;

    /* renamed from: h */
    public final boolean f19213h;

    /* renamed from: i */
    public MultipartBody.Builder f19214i;

    /* renamed from: j */
    public FormBody.Builder f19215j;

    /* renamed from: k */
    public RequestBody f19216k;

    /* renamed from: o.n$a */
    /* compiled from: RequestBuilder */
    public static class C9906a extends RequestBody {

        /* renamed from: a */
        public final RequestBody f19217a;

        /* renamed from: b */
        public final MediaType f19218b;

        public C9906a(RequestBody requestBody, MediaType mediaType) {
            this.f19217a = requestBody;
            this.f19218b = mediaType;
        }

        public long contentLength() {
            return this.f19217a.contentLength();
        }

        public MediaType contentType() {
            return this.f19218b;
        }

        public void writeTo(BufferedSink bufferedSink) {
            this.f19217a.writeTo(bufferedSink);
        }
    }

    public C9905n(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f19206a = str;
        this.f19207b = httpUrl;
        this.f19208c = str2;
        this.f19212g = mediaType;
        this.f19213h = z;
        if (headers != null) {
            this.f19211f = headers.newBuilder();
        } else {
            this.f19211f = new Headers.Builder();
        }
        if (z2) {
            this.f19215j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f19214i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: g */
    public static String m26530g(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                m26531h(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: h */
    public static void m26531h(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f19204l[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f19204l[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void mo51299a(String str, String str2, boolean z) {
        if (z) {
            this.f19215j.addEncoded(str, str2);
        } else {
            this.f19215j.add(str, str2);
        }
    }

    /* renamed from: b */
    public void mo51300b(String str, String str2) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f19212g = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f19211f.add(str, str2);
        }
    }

    /* renamed from: c */
    public void mo51301c(Headers headers, RequestBody requestBody) {
        this.f19214i.addPart(headers, requestBody);
    }

    /* renamed from: d */
    public void mo51302d(MultipartBody.Part part) {
        this.f19214i.addPart(part);
    }

    /* renamed from: e */
    public void mo51303e(String str, String str2, boolean z) {
        if (this.f19208c != null) {
            String g = m26530g(str2, z);
            String str3 = this.f19208c;
            String replace = str3.replace("{" + str + "}", g);
            if (!f19205m.matcher(replace).matches()) {
                this.f19208c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public void mo51304f(String str, String str2, boolean z) {
        String str3 = this.f19208c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f19207b.newBuilder(str3);
            this.f19209d = newBuilder;
            if (newBuilder != null) {
                this.f19208c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f19207b + ", Relative: " + this.f19208c);
            }
        }
        if (z) {
            this.f19209d.addEncodedQueryParameter(str, str2);
        } else {
            this.f19209d.addQueryParameter(str, str2);
        }
    }

    /* renamed from: i */
    public Request.Builder mo51305i() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f19209d;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f19207b.resolve(this.f19208c);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f19207b + ", Relative: " + this.f19208c);
            }
        }
        C9906a aVar = this.f19216k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f19215j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f19214i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f19213h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f19212g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new C9906a(aVar, mediaType);
            } else {
                this.f19211f.add(HttpHeaders.CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.f19210e.url(httpUrl).headers(this.f19211f.build()).method(this.f19206a, aVar);
    }

    /* renamed from: j */
    public void mo51306j(RequestBody requestBody) {
        this.f19216k = requestBody;
    }

    /* renamed from: k */
    public void mo51307k(Object obj) {
        this.f19208c = obj.toString();
    }
}

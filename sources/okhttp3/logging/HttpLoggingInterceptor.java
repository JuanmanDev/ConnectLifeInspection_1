package okhttp3.logging;

import com.facebook.stetho.inspector.network.DecompressionHelper;
import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;
import okio.Buffer;

public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: c */
    public static final Charset f19327c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C9972a f19328a;

    /* renamed from: b */
    public volatile Level f19329b;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface C9972a {

        /* renamed from: a */
        public static final C9972a f19330a = new C9973a();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a */
        public class C9973a implements C9972a {
            public void log(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(C9972a.f19330a);
    }

    /* renamed from: b */
    public static boolean m26650b(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0, buffer.size() < 64 ? buffer.size() : 64);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo52897a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !str.equalsIgnoreCase("identity") && !str.equalsIgnoreCase(DecompressionHelper.GZIP_ENCODING);
    }

    /* renamed from: c */
    public HttpLoggingInterceptor mo52898c(Level level) {
        if (level != null) {
            this.f19329b = level;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0335  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.f19329b
            okhttp3.Request r3 = r22.request()
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L_0x0013
            okhttp3.Response r0 = r0.proceed(r3)
            return r0
        L_0x0013:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            r5 = 1
            if (r2 != r4) goto L_0x001a
            r4 = r5
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0024
            okhttp3.logging.HttpLoggingInterceptor$Level r7 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r7) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = r5
        L_0x0025:
            okhttp3.RequestBody r7 = r3.body()
            if (r7 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            okhttp3.Connection r8 = r22.connection()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.method()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            okhttp3.HttpUrl r11 = r3.url()
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            r12.append(r13)
            okhttp3.Protocol r8 = r8.protocol()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x0069
        L_0x0068:
            r8 = r11
        L_0x0069:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.contentLength()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L_0x0091:
            okhttp3.logging.HttpLoggingInterceptor$a r13 = r1.f19328a
            r13.log(r8)
            java.lang.String r8 = "-byte body omitted)"
            java.lang.String r13 = ": "
            if (r2 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x00e2
            okhttp3.MediaType r16 = r7.contentType()
            if (r16 == 0) goto L_0x00be
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f19328a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Type: "
            r10.append(r14)
            okhttp3.MediaType r14 = r7.contentType()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.log(r10)
        L_0x00be:
            long r14 = r7.contentLength()
            r17 = -1
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f19328a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Length: "
            r10.append(r14)
            long r14 = r7.contentLength()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.log(r10)
        L_0x00e2:
            okhttp3.Headers r6 = r3.headers()
            int r10 = r6.size()
            r14 = 0
        L_0x00eb:
            if (r14 >= r10) goto L_0x012a
            java.lang.String r15 = r6.name(r14)
            r19 = r10
            java.lang.String r10 = "Content-Type"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            java.lang.String r10 = "Content-Length"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            okhttp3.logging.HttpLoggingInterceptor$a r10 = r1.f19328a
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r13)
            java.lang.String r15 = r6.value(r14)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r10.log(r2)
            goto L_0x0123
        L_0x0121:
            r20 = r2
        L_0x0123:
            int r14 = r14 + 1
            r10 = r19
            r2 = r20
            goto L_0x00eb
        L_0x012a:
            r20 = r2
            java.lang.String r2 = "--> END "
            if (r4 == 0) goto L_0x01d5
            if (r5 != 0) goto L_0x0134
            goto L_0x01d5
        L_0x0134:
            okhttp3.Headers r5 = r3.headers()
            boolean r5 = r1.mo52897a(r5)
            if (r5 == 0) goto L_0x015d
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.method()
            r6.append(r2)
            java.lang.String r2 = " (encoded body omitted)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x015d:
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            r7.writeTo(r5)
            java.nio.charset.Charset r6 = f19327c
            okhttp3.MediaType r10 = r7.contentType()
            if (r10 == 0) goto L_0x0173
            java.nio.charset.Charset r6 = f19327c
            java.nio.charset.Charset r6 = r10.charset(r6)
        L_0x0173:
            okhttp3.logging.HttpLoggingInterceptor$a r10 = r1.f19328a
            r10.log(r11)
            boolean r10 = m26650b(r5)
            if (r10 == 0) goto L_0x01ad
            okhttp3.logging.HttpLoggingInterceptor$a r10 = r1.f19328a
            java.lang.String r5 = r5.readString(r6)
            r10.log(r5)
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.method()
            r6.append(r2)
            r6.append(r12)
            long r14 = r7.contentLength()
            r6.append(r14)
            r6.append(r9)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01ad:
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.method()
            r6.append(r2)
            java.lang.String r2 = " (binary "
            r6.append(r2)
            long r14 = r7.contentLength()
            r6.append(r14)
            r6.append(r8)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01d5:
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.method()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x01f0
        L_0x01ee:
            r20 = r2
        L_0x01f0:
            long r5 = java.lang.System.nanoTime()
            okhttp3.Response r0 = r0.proceed(r3)     // Catch:{ Exception -> 0x03d8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 - r5
            long r2 = r2.toMillis(r14)
            okhttp3.ResponseBody r5 = r0.body()
            long r6 = r5.contentLength()
            r14 = -1
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0223
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r14 = "-byte"
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            goto L_0x0225
        L_0x0223:
            java.lang.String r10 = "unknown-length"
        L_0x0225:
            okhttp3.logging.HttpLoggingInterceptor$a r14 = r1.f19328a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r9
            java.lang.String r9 = "<-- "
            r15.append(r9)
            int r9 = r0.code()
            r15.append(r9)
            java.lang.String r9 = r0.message()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x024a
            r18 = r6
            r7 = r11
            r6 = 32
            goto L_0x0261
        L_0x024a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r18 = r6
            r6 = 32
            r9.append(r6)
            java.lang.String r7 = r0.message()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x0261:
            r15.append(r7)
            r15.append(r6)
            okhttp3.Request r6 = r0.request()
            okhttp3.HttpUrl r6 = r6.url()
            r15.append(r6)
            r15.append(r12)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r20 != 0) goto L_0x0296
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " body"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0297
        L_0x0296:
            r2 = r11
        L_0x0297:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.log(r2)
            if (r20 == 0) goto L_0x03d7
            okhttp3.Headers r2 = r0.headers()
            int r3 = r2.size()
            r6 = 0
        L_0x02b1:
            if (r6 >= r3) goto L_0x02d5
            okhttp3.logging.HttpLoggingInterceptor$a r7 = r1.f19328a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r2.name(r6)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = r2.value(r6)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r7.log(r9)
            int r6 = r6 + 1
            goto L_0x02b1
        L_0x02d5:
            if (r4 == 0) goto L_0x03d0
            boolean r3 = okhttp3.internal.http.HttpHeaders.hasBody(r0)
            if (r3 != 0) goto L_0x02df
            goto L_0x03d0
        L_0x02df:
            okhttp3.Headers r3 = r0.headers()
            boolean r3 = r1.mo52897a(r3)
            if (r3 == 0) goto L_0x02f2
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f19328a
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            goto L_0x03d7
        L_0x02f2:
            okio.BufferedSource r3 = r5.source()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r6)
            okio.Buffer r3 = r3.buffer()
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r2 = r2.get(r4)
            java.lang.String r4 = "gzip"
            boolean r2 = r4.equalsIgnoreCase(r2)
            r4 = 0
            if (r2 == 0) goto L_0x0339
            long r6 = r3.size()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            okio.GzipSource r6 = new okio.GzipSource     // Catch:{ all -> 0x0332 }
            okio.Buffer r3 = r3.clone()     // Catch:{ all -> 0x0332 }
            r6.<init>(r3)     // Catch:{ all -> 0x0332 }
            okio.Buffer r3 = new okio.Buffer     // Catch:{ all -> 0x032f }
            r3.<init>()     // Catch:{ all -> 0x032f }
            r3.writeAll(r6)     // Catch:{ all -> 0x032f }
            r6.close()
            r4 = r2
            goto L_0x0339
        L_0x032f:
            r0 = move-exception
            r4 = r6
            goto L_0x0333
        L_0x0332:
            r0 = move-exception
        L_0x0333:
            if (r4 == 0) goto L_0x0338
            r4.close()
        L_0x0338:
            throw r0
        L_0x0339:
            java.nio.charset.Charset r2 = f19327c
            okhttp3.MediaType r5 = r5.contentType()
            if (r5 == 0) goto L_0x0347
            java.nio.charset.Charset r2 = f19327c
            java.nio.charset.Charset r2 = r5.charset(r2)
        L_0x0347:
            boolean r5 = m26650b(r3)
            if (r5 != 0) goto L_0x0370
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f19328a
            r2.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f19328a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<-- END HTTP (binary "
            r4.append(r5)
            long r5 = r3.size()
            r4.append(r5)
            r4.append(r8)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            return r0
        L_0x0370:
            r5 = 0
            int r5 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0388
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            r5.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            okio.Buffer r6 = r3.clone()
            java.lang.String r2 = r6.readString(r2)
            r5.log(r2)
        L_0x0388:
            java.lang.String r2 = "<-- END HTTP ("
            if (r4 == 0) goto L_0x03b2
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f19328a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            long r2 = r3.size()
            r6.append(r2)
            java.lang.String r2 = "-byte, "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = "-gzipped-byte body)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r2)
            goto L_0x03d7
        L_0x03b2:
            okhttp3.logging.HttpLoggingInterceptor$a r4 = r1.f19328a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            long r2 = r3.size()
            r5.append(r2)
            r2 = r17
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.log(r2)
            goto L_0x03d7
        L_0x03d0:
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f19328a
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L_0x03d7:
            return r0
        L_0x03d8:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f19328a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.log(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public HttpLoggingInterceptor(C9972a aVar) {
        this.f19329b = Level.NONE;
        this.f19328a = aVar;
    }
}

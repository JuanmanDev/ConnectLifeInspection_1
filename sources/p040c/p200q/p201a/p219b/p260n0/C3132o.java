package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import android.support.p025v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3175v;

/* renamed from: c.q.a.b.n0.o */
/* compiled from: DefaultHttpDataSource */
public class C3132o extends C3120f implements HttpDataSource {

    /* renamed from: t */
    public static final Pattern f5769t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: u */
    public static final AtomicReference<byte[]> f5770u = new AtomicReference<>();

    /* renamed from: e */
    public final boolean f5771e;

    /* renamed from: f */
    public final int f5772f;

    /* renamed from: g */
    public final int f5773g;

    /* renamed from: h */
    public final String f5774h;
    @Nullable

    /* renamed from: i */
    public final C3175v<String> f5775i;
    @Nullable

    /* renamed from: j */
    public final HttpDataSource.C4055b f5776j;

    /* renamed from: k */
    public final HttpDataSource.C4055b f5777k = new HttpDataSource.C4055b();
    @Nullable

    /* renamed from: l */
    public C3125j f5778l;
    @Nullable

    /* renamed from: m */
    public HttpURLConnection f5779m;
    @Nullable

    /* renamed from: n */
    public InputStream f5780n;

    /* renamed from: o */
    public boolean f5781o;

    /* renamed from: p */
    public long f5782p;

    /* renamed from: q */
    public long f5783q;

    /* renamed from: r */
    public long f5784r;

    /* renamed from: s */
    public long f5785s;

    public C3132o(String str, @Nullable C3175v<String> vVar, int i, int i2, boolean z, @Nullable HttpDataSource.C4055b bVar) {
        super(true);
        C3151e.m7756d(str);
        this.f5774h = str;
        this.f5775i = vVar;
        this.f5772f = i;
        this.f5773g = i2;
        this.f5771e = z;
        this.f5776j = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m7686l(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00a4
            java.util.regex.Pattern r1 = f5769t
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00a4
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x008d }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x008d }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0064
            r4 = r6
            goto L_0x00a4
        L_0x0064:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x008d }
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r3, r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x008d }
            r4 = r0
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r3, r10)
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p260n0.C3132o.m7686l(java.net.HttpURLConnection):long");
    }

    /* renamed from: m */
    public static URL m7687m(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: p */
    public static void m7688p(HttpURLConnection httpURLConnection, long j) {
        int i = C3152e0.f5819a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        this.f5778l = jVar;
        long j = 0;
        this.f5785s = 0;
        this.f5784r = 0;
        mo19882h(jVar);
        try {
            HttpURLConnection n = mo19916n(jVar);
            this.f5779m = n;
            try {
                int responseCode = n.getResponseCode();
                String responseMessage = this.f5779m.getResponseMessage();
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = this.f5779m.getHeaderFields();
                    mo19915k();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(responseCode, responseMessage, headerFields, jVar);
                    if (responseCode == 416) {
                        invalidResponseCodeException.initCause(new DataSourceException(0));
                    }
                    throw invalidResponseCodeException;
                }
                String contentType = this.f5779m.getContentType();
                C3175v<String> vVar = this.f5775i;
                if (vVar == null || vVar.mo19870a(contentType)) {
                    if (responseCode == 200) {
                        long j2 = jVar.f5724e;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f5782p = j;
                    if (!jVar.mo19892c(1)) {
                        long j3 = jVar.f5725f;
                        long j4 = -1;
                        if (j3 != -1) {
                            this.f5783q = j3;
                        } else {
                            long l = m7686l(this.f5779m);
                            if (l != -1) {
                                j4 = l - this.f5782p;
                            }
                            this.f5783q = j4;
                        }
                    } else {
                        this.f5783q = jVar.f5725f;
                    }
                    try {
                        this.f5780n = this.f5779m.getInputStream();
                        this.f5781o = true;
                        mo19883i(jVar);
                        return this.f5783q;
                    } catch (IOException e) {
                        mo19915k();
                        throw new HttpDataSource.HttpDataSourceException(e, jVar, 1);
                    }
                } else {
                    mo19915k();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, jVar);
                }
            } catch (IOException e2) {
                mo19915k();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + jVar.f5720a.toString(), e2, jVar, 1);
            }
        } catch (IOException e3) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + jVar.f5720a.toString(), e3, jVar, 1);
        }
    }

    public void close() {
        try {
            if (this.f5780n != null) {
                m7688p(this.f5779m, mo19914j());
                this.f5780n.close();
            }
            this.f5780n = null;
            mo19915k();
            if (this.f5781o) {
                this.f5781o = false;
                mo19881g();
            }
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, this.f5778l, 3);
        } catch (Throwable th) {
            this.f5780n = null;
            mo19915k();
            if (this.f5781o) {
                this.f5781o = false;
                mo19881g();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public Map<String, List<String>> mo19311d() {
        HttpURLConnection httpURLConnection = this.f5779m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        HttpURLConnection httpURLConnection = this.f5779m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: j */
    public final long mo19914j() {
        long j = this.f5783q;
        return j == -1 ? j : j - this.f5785s;
    }

    /* renamed from: k */
    public final void mo19915k() {
        HttpURLConnection httpURLConnection = this.f5779m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C3163m.m7878d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f5779m = null;
        }
    }

    /* renamed from: n */
    public final HttpURLConnection mo19916n(C3125j jVar) {
        HttpURLConnection o;
        C3125j jVar2 = jVar;
        URL url = new URL(jVar2.f5720a.toString());
        int i = jVar2.f5721b;
        byte[] bArr = jVar2.f5722c;
        long j = jVar2.f5724e;
        long j2 = jVar2.f5725f;
        boolean c = jVar2.mo19892c(1);
        if (!this.f5771e) {
            return mo19917o(url, i, bArr, j, j2, c, true);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                int i4 = i3;
                long j3 = j2;
                o = mo19917o(url, i, bArr, j, j2, c, false);
                int responseCode = o.getResponseCode();
                String headerField = o.getHeaderField("Location");
                if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    o.disconnect();
                    url = m7687m(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return o;
                } else {
                    o.disconnect();
                    url = m7687m(url, headerField);
                    bArr = null;
                    i = 1;
                }
                i2 = i4;
                j2 = j3;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i3);
            }
        }
        return o;
    }

    /* renamed from: o */
    public final HttpURLConnection mo19917o(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f5772f);
        httpURLConnection.setReadTimeout(this.f5773g);
        HttpDataSource.C4055b bVar = this.f5776j;
        if (bVar != null) {
            for (Map.Entry next : bVar.mo24270a().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        for (Map.Entry next2 : this.f5777k.mo24270a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR;
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f5774h);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C3125j.m7645b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: q */
    public final int mo19918q(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f5783q;
        if (j != -1) {
            long j2 = j - this.f5785s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = this.f5780n.read(bArr, i, i2);
        if (read != -1) {
            this.f5785s += (long) read;
            mo19880f(read);
            return read;
        } else if (this.f5783q == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: r */
    public final void mo19919r() {
        if (this.f5784r != this.f5782p) {
            byte[] andSet = f5770u.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f5784r;
                long j2 = this.f5782p;
                if (j != j2) {
                    int read = this.f5780n.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f5784r += (long) read;
                        mo19880f(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f5770u.set(andSet);
                    return;
                }
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            mo19919r();
            return mo19918q(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, this.f5778l, 2);
        }
    }
}

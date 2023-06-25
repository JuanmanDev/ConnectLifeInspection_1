package p040c.p077d.p078a.p081k.p082i;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1743g;
import p040c.p077d.p078a.p105q.C1940b;
import p040c.p077d.p078a.p105q.C1945e;

/* renamed from: c.d.a.k.i.j */
/* compiled from: HttpUrlFetcher */
public class C1588j implements C1578d<InputStream> {
    @VisibleForTesting

    /* renamed from: q */
    public static final C1590b f936q = new C1589a();

    /* renamed from: e */
    public final C1743g f937e;

    /* renamed from: l */
    public final int f938l;

    /* renamed from: m */
    public final C1590b f939m;

    /* renamed from: n */
    public HttpURLConnection f940n;

    /* renamed from: o */
    public InputStream f941o;

    /* renamed from: p */
    public volatile boolean f942p;

    /* renamed from: c.d.a.k.i.j$a */
    /* compiled from: HttpUrlFetcher */
    public static class C1589a implements C1590b {
        /* renamed from: a */
        public HttpURLConnection mo15663a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: c.d.a.k.i.j$b */
    /* compiled from: HttpUrlFetcher */
    public interface C1590b {
        /* renamed from: a */
        HttpURLConnection mo15663a(URL url);
    }

    public C1588j(C1743g gVar, int i) {
        this(gVar, i, f936q);
    }

    /* renamed from: f */
    public static boolean m1336f(int i) {
        return i / 100 == 2;
    }

    /* renamed from: g */
    public static boolean m1337g(int i) {
        return i / 100 == 3;
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo15624a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo15629b() {
        InputStream inputStream = this.f941o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f940n;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f940n = null;
    }

    @NonNull
    /* renamed from: c */
    public DataSource mo15630c() {
        return DataSource.REMOTE;
    }

    public void cancel() {
        this.f942p = true;
    }

    /* renamed from: d */
    public final InputStream mo15661d(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f941o = C1940b.m2538b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                "Got non empty content encoding: " + httpURLConnection.getContentEncoding();
            }
            this.f941o = httpURLConnection.getInputStream();
        }
        return this.f941o;
    }

    /* renamed from: e */
    public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C1945e.m2547b();
        try {
            aVar.mo15644f(mo15662h(this.f937e.mo16007h(), 0, (URL) null, this.f937e.mo16004e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C1945e.m2546a(b));
                sb.toString();
            }
        } catch (IOException e) {
            boolean isLoggable = Log.isLoggable("HttpUrlFetcher", 3);
            aVar.mo15643d(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                "Finished http url fetcher fetch in " + C1945e.m2546a(b);
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final InputStream mo15662h(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f940n = this.f939m.mo15663a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f940n.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f940n.setConnectTimeout(this.f938l);
            this.f940n.setReadTimeout(this.f938l);
            this.f940n.setUseCaches(false);
            this.f940n.setDoInput(true);
            this.f940n.setInstanceFollowRedirects(false);
            this.f940n.connect();
            this.f941o = this.f940n.getInputStream();
            if (this.f942p) {
                return null;
            }
            int responseCode = this.f940n.getResponseCode();
            if (m1336f(responseCode)) {
                return mo15661d(this.f940n);
            }
            if (m1337g(responseCode)) {
                String headerField = this.f940n.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo15629b();
                    return mo15662h(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f940n.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    @VisibleForTesting
    public C1588j(C1743g gVar, int i, C1590b bVar) {
        this.f937e = gVar;
        this.f938l = i;
        this.f939m = bVar;
    }
}

package p040c.p200q.p363c.p400x;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.c.x.k0 */
/* compiled from: ImageDownload */
public class C6837k0 implements Closeable {

    /* renamed from: e */
    public final URL f13089e;
    @Nullable

    /* renamed from: l */
    public volatile Future<?> f13090l;
    @Nullable

    /* renamed from: m */
    public C5771j<Bitmap> f13091m;

    public C6837k0(URL url) {
        this.f13089e = url;
    }

    @Nullable
    /* renamed from: c */
    public static C6837k0 m19393c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C6837k0(new URL(str));
        } catch (MalformedURLException unused) {
            "Not downloading image, bad URL: " + str;
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap mo31631a() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            "Starting download of: " + this.f13089e;
        }
        byte[] b = mo31632b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                "Successfully downloaded image: " + this.f13089e;
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f13089e);
    }

    /* renamed from: b */
    public final byte[] mo31632b() {
        URLConnection openConnection = this.f13089e.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d = C6808c0.m19317d(C6808c0.m19315b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    "Downloaded " + d.length + " bytes from " + this.f13089e;
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public void close() {
        this.f13090l.cancel(true);
    }

    /* renamed from: d */
    public C5771j<Bitmap> mo31634d() {
        C5771j<Bitmap> jVar = this.f13091m;
        C3495o.m8908j(jVar);
        return jVar;
    }

    /* renamed from: e */
    public /* synthetic */ void mo31635e(C5773k kVar) {
        try {
            kVar.mo28861c(mo31631a());
        } catch (Exception e) {
            kVar.mo28860b(e);
        }
    }

    /* renamed from: f */
    public void mo31636f(ExecutorService executorService) {
        C5773k kVar = new C5773k();
        this.f13090l = executorService.submit(new C6848q(this, kVar));
        this.f13091m = kVar.mo28859a();
    }
}

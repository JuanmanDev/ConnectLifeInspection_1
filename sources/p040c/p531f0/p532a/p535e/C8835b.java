package p040c.p531f0.p532a.p535e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p040c.p531f0.p532a.p533c.C8828b;
import p040c.p531f0.p532a.p534d.C8832b;
import p040c.p531f0.p532a.p536f.C8837a;

/* renamed from: c.f0.a.e.b */
/* compiled from: BitmapLoadTask */
public class C8835b extends AsyncTask<Void, Void, C8836a> {

    /* renamed from: a */
    public final Context f17182a;

    /* renamed from: b */
    public Uri f17183b;

    /* renamed from: c */
    public Uri f17184c;

    /* renamed from: d */
    public final int f17185d;

    /* renamed from: e */
    public final int f17186e;

    /* renamed from: f */
    public final C8828b f17187f;

    public C8835b(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, C8828b bVar) {
        this.f17182a = context;
        this.f17183b = uri;
        this.f17184c = uri2;
        this.f17185d = i;
        this.f17186e = i2;
        this.f17187f = bVar;
    }

    /* renamed from: a */
    public final boolean mo46002a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* renamed from: b */
    public final void mo46003b(@NonNull Uri uri, @Nullable Uri uri2) {
        InputStream inputStream;
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.f17182a.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    if (inputStream != null) {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    C8837a.m23791c(fileOutputStream2);
                                    C8837a.m23791c(inputStream);
                                    this.f17183b = this.f17184c;
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            C8837a.m23791c(fileOutputStream);
                            C8837a.m23791c(inputStream);
                            this.f17183b = this.f17184c;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C8837a.m23791c(fileOutputStream);
                    C8837a.m23791c(inputStream);
                    this.f17183b = this.f17184c;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                C8837a.m23791c(fileOutputStream);
                C8837a.m23791c(inputStream);
                this.f17183b = this.f17184c;
                throw th;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }

    @NonNull
    /* renamed from: c */
    public C8836a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        if (this.f17183b == null) {
            return new C8836a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            mo46008f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C8837a.m23789a(options, this.f17185d, this.f17186e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = this.f17182a.getContentResolver().openInputStream(this.f17183b);
                    bitmap = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        C8836a aVar = new C8836a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f17183b + "]"));
                        C8837a.m23791c(openInputStream);
                        return aVar;
                    }
                    C8837a.m23791c(openInputStream);
                    if (!mo46002a(bitmap, options)) {
                        z = true;
                    }
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                } catch (IOException e) {
                    return new C8836a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f17183b + "]", e));
                } catch (Throwable th) {
                    C8837a.m23791c(openInputStream);
                    throw th;
                }
            }
            if (bitmap == null) {
                return new C8836a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f17183b + "]"));
            }
            int g = C8837a.m23795g(this.f17182a, this.f17183b);
            int e2 = C8837a.m23793e(g);
            int f = C8837a.m23794f(g);
            C8832b bVar = new C8832b(g, e2, f);
            Matrix matrix = new Matrix();
            if (e2 != 0) {
                matrix.preRotate((float) e2);
            }
            if (f != 1) {
                matrix.postScale((float) f, 1.0f);
            }
            if (!matrix.isIdentity()) {
                return new C8836a(C8837a.m23796h(bitmap, matrix), bVar);
            }
            return new C8836a(bitmap, bVar);
        } catch (IOException | NullPointerException e3) {
            return new C8836a(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46005d(@androidx.annotation.NonNull android.net.Uri r6, @androidx.annotation.Nullable android.net.Uri r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x0087
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1 = 0
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch:{ all -> 0x0069 }
            r2.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0069 }
            okhttp3.Request$Builder r6 = r2.url((java.lang.String) r6)     // Catch:{ all -> 0x0069 }
            okhttp3.Request r6 = r6.build()     // Catch:{ all -> 0x0069 }
            okhttp3.Call r6 = r0.newCall(r6)     // Catch:{ all -> 0x0069 }
            okhttp3.Response r6 = r6.execute()     // Catch:{ all -> 0x0069 }
            okhttp3.ResponseBody r2 = r6.body()     // Catch:{ all -> 0x0065 }
            okio.BufferedSource r2 = r2.source()     // Catch:{ all -> 0x0065 }
            android.content.Context r3 = r5.f17182a     // Catch:{ all -> 0x005f }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x005f }
            java.io.OutputStream r7 = r3.openOutputStream(r7)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0057
            okio.Sink r1 = okio.Okio.sink((java.io.OutputStream) r7)     // Catch:{ all -> 0x005f }
            r2.readAll(r1)     // Catch:{ all -> 0x005f }
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r2)
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r1)
            if (r6 == 0) goto L_0x004b
            okhttp3.ResponseBody r6 = r6.body()
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r6)
        L_0x004b:
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.f17184c
            r5.f17183b = r6
            return
        L_0x0057:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r7.<init>(r3)     // Catch:{ all -> 0x005f }
            throw r7     // Catch:{ all -> 0x005f }
        L_0x005f:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r1
            r1 = r4
            goto L_0x006c
        L_0x0065:
            r7 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x006c
        L_0x0069:
            r7 = move-exception
            r6 = r1
            r2 = r6
        L_0x006c:
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r1)
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r6)
            if (r2 == 0) goto L_0x007b
            okhttp3.ResponseBody r6 = r2.body()
            p040c.p531f0.p532a.p536f.C8837a.m23791c(r6)
        L_0x007b:
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.f17184c
            r5.f17183b = r6
            throw r7
        L_0x0087:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Output Uri is null - cannot download image"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p531f0.p532a.p535e.C8835b.mo46005d(android.net.Uri, android.net.Uri):void");
    }

    /* renamed from: e */
    public void onPostExecute(@NonNull C8836a aVar) {
        Exception exc = aVar.f17190c;
        if (exc == null) {
            C8828b bVar = this.f17187f;
            Bitmap bitmap = aVar.f17188a;
            C8832b bVar2 = aVar.f17189b;
            String path = this.f17183b.getPath();
            Uri uri = this.f17184c;
            bVar.mo45978a(bitmap, bVar2, path, uri == null ? null : uri.getPath());
            return;
        }
        this.f17187f.onFailure(exc);
    }

    /* renamed from: f */
    public final void mo46008f() {
        String scheme = this.f17183b.getScheme();
        "Uri scheme: " + scheme;
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                mo46005d(this.f17183b, this.f17184c);
            } catch (IOException | NullPointerException e) {
                throw e;
            }
        } else if (BrowserServiceFileProvider.CONTENT_SCHEME.equals(scheme)) {
            try {
                mo46003b(this.f17183b, this.f17184c);
            } catch (IOException | NullPointerException e2) {
                throw e2;
            }
        } else if (!"file".equals(scheme)) {
            "Invalid Uri scheme " + scheme;
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* renamed from: c.f0.a.e.b$a */
    /* compiled from: BitmapLoadTask */
    public static class C8836a {

        /* renamed from: a */
        public Bitmap f17188a;

        /* renamed from: b */
        public C8832b f17189b;

        /* renamed from: c */
        public Exception f17190c;

        public C8836a(@NonNull Bitmap bitmap, @NonNull C8832b bVar) {
            this.f17188a = bitmap;
            this.f17189b = bVar;
        }

        public C8836a(@NonNull Exception exc) {
            this.f17190c = exc;
        }
    }
}

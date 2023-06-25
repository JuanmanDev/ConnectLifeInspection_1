package p040c.p531f0.p532a.p535e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p040c.p531f0.p532a.p533c.C8827a;
import p040c.p531f0.p532a.p534d.C8831a;
import p040c.p531f0.p532a.p534d.C8833c;
import p040c.p531f0.p532a.p536f.C8837a;
import p040c.p531f0.p532a.p536f.C8841e;
import p040c.p531f0.p532a.p536f.C8842f;

/* renamed from: c.f0.a.e.a */
/* compiled from: BitmapCropTask */
public class C8834a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    public final WeakReference<Context> f17165a;

    /* renamed from: b */
    public Bitmap f17166b;

    /* renamed from: c */
    public final RectF f17167c;

    /* renamed from: d */
    public final RectF f17168d;

    /* renamed from: e */
    public float f17169e;

    /* renamed from: f */
    public float f17170f;

    /* renamed from: g */
    public final int f17171g;

    /* renamed from: h */
    public final int f17172h;

    /* renamed from: i */
    public final Bitmap.CompressFormat f17173i;

    /* renamed from: j */
    public final int f17174j;

    /* renamed from: k */
    public final String f17175k;

    /* renamed from: l */
    public final String f17176l;

    /* renamed from: m */
    public final C8827a f17177m;

    /* renamed from: n */
    public int f17178n;

    /* renamed from: o */
    public int f17179o;

    /* renamed from: p */
    public int f17180p;

    /* renamed from: q */
    public int f17181q;

    public C8834a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull C8833c cVar, @NonNull C8831a aVar, @Nullable C8827a aVar2) {
        this.f17165a = new WeakReference<>(context);
        this.f17166b = bitmap;
        this.f17167c = cVar.mo45991a();
        this.f17168d = cVar.mo45993c();
        this.f17169e = cVar.mo45994d();
        this.f17170f = cVar.mo45992b();
        this.f17171g = aVar.mo45987f();
        this.f17172h = aVar.mo45988g();
        this.f17173i = aVar.mo45982a();
        this.f17174j = aVar.mo45983b();
        this.f17175k = aVar.mo45985d();
        this.f17176l = aVar.mo45986e();
        aVar.mo45984c();
        this.f17177m = aVar2;
    }

    /* renamed from: a */
    public final boolean mo45995a() {
        if (this.f17171g > 0 && this.f17172h > 0) {
            float width = this.f17167c.width() / this.f17169e;
            float height = this.f17167c.height() / this.f17169e;
            if (width > ((float) this.f17171g) || height > ((float) this.f17172h)) {
                float min = Math.min(((float) this.f17171g) / width, ((float) this.f17172h) / height);
                Bitmap bitmap = this.f17166b;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * min), Math.round(((float) this.f17166b.getHeight()) * min), false);
                Bitmap bitmap2 = this.f17166b;
                if (bitmap2 != createScaledBitmap) {
                    bitmap2.recycle();
                }
                this.f17166b = createScaledBitmap;
                this.f17169e /= min;
            }
        }
        if (this.f17170f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f17170f, (float) (this.f17166b.getWidth() / 2), (float) (this.f17166b.getHeight() / 2));
            Bitmap bitmap3 = this.f17166b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f17166b.getHeight(), matrix, true);
            Bitmap bitmap4 = this.f17166b;
            if (bitmap4 != createBitmap) {
                bitmap4.recycle();
            }
            this.f17166b = createBitmap;
        }
        this.f17180p = Math.round((this.f17167c.left - this.f17168d.left) / this.f17169e);
        this.f17181q = Math.round((this.f17167c.top - this.f17168d.top) / this.f17169e);
        this.f17178n = Math.round(this.f17167c.width() / this.f17169e);
        int round = Math.round(this.f17167c.height() / this.f17169e);
        this.f17179o = round;
        boolean e = mo46000e(this.f17178n, round);
        "Should crop: " + e;
        if (e) {
            ExifInterface exifInterface = new ExifInterface(this.f17175k);
            mo45998d(Bitmap.createBitmap(this.f17166b, this.f17180p, this.f17181q, this.f17178n, this.f17179o));
            if (!this.f17173i.equals(Bitmap.CompressFormat.JPEG)) {
                return true;
            }
            C8842f.m23806b(exifInterface, this.f17178n, this.f17179o, this.f17176l);
            return true;
        }
        C8841e.m23804a(this.f17175k, this.f17176l);
        return false;
    }

    @Nullable
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f17166b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f17168d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            mo45995a();
            this.f17166b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: c */
    public void onPostExecute(@Nullable Throwable th) {
        C8827a aVar = this.f17177m;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            this.f17177m.mo45976a(Uri.fromFile(new File(this.f17176l)), this.f17180p, this.f17181q, this.f17178n, this.f17179o);
            return;
        }
        aVar.mo45977b(th);
    }

    /* renamed from: d */
    public final void mo45998d(@NonNull Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (((Context) this.f17165a.get()) != null) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f17176l), false);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(this.f17173i, this.f17174j, byteArrayOutputStream);
                        fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                        bitmap.recycle();
                        C8837a.m23791c(fileOutputStream2);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        try {
                            e.getLocalizedMessage();
                            C8837a.m23791c(fileOutputStream);
                            C8837a.m23791c(byteArrayOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            C8837a.m23791c(fileOutputStream);
                            C8837a.m23791c(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        C8837a.m23791c(fileOutputStream);
                        C8837a.m23791c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    e.getLocalizedMessage();
                    C8837a.m23791c(fileOutputStream);
                    C8837a.m23791c(byteArrayOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    C8837a.m23791c(fileOutputStream);
                    C8837a.m23791c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream = null;
                e.getLocalizedMessage();
                C8837a.m23791c(fileOutputStream);
                C8837a.m23791c(byteArrayOutputStream);
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                C8837a.m23791c(fileOutputStream);
                C8837a.m23791c(byteArrayOutputStream);
                throw th;
            }
            C8837a.m23791c(byteArrayOutputStream);
        }
    }

    /* renamed from: e */
    public final boolean mo46000e(int i, int i2) {
        int round = Math.round(((float) Math.max(i, i2)) / 1000.0f) + 1;
        if (this.f17171g > 0 && this.f17172h > 0) {
            return true;
        }
        float f = (float) round;
        if (Math.abs(this.f17167c.left - this.f17168d.left) > f || Math.abs(this.f17167c.top - this.f17168d.top) > f || Math.abs(this.f17167c.bottom - this.f17168d.bottom) > f || Math.abs(this.f17167c.right - this.f17168d.right) > f || this.f17170f != 0.0f) {
            return true;
        }
        return false;
    }
}

package p704p.p705a.p706a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: p.a.a.c */
/* compiled from: Engine */
public class C9988c {

    /* renamed from: a */
    public C9989d f19436a;

    /* renamed from: b */
    public File f19437b;

    /* renamed from: c */
    public int f19438c;

    /* renamed from: d */
    public int f19439d;

    /* renamed from: e */
    public boolean f19440e;

    public C9988c(C9989d dVar, File file, boolean z) {
        this.f19437b = file;
        this.f19436a = dVar;
        this.f19440e = z;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(dVar.open(), (Rect) null, options);
        this.f19438c = options.outWidth;
        this.f19439d = options.outHeight;
    }

    /* renamed from: a */
    public File mo53715a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = mo53716b();
        Bitmap decodeStream = BitmapFactory.decodeStream(this.f19436a.open(), (Rect) null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (C9986a.SINGLE.mo53709g(this.f19436a.open())) {
            decodeStream = mo53717c(decodeStream, C9986a.SINGLE.mo53707d(this.f19436a.open()));
        }
        decodeStream.compress(this.f19440e ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        decodeStream.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f19437b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f19437b;
    }

    /* renamed from: b */
    public final int mo53716b() {
        int i = this.f19438c;
        if (i % 2 == 1) {
            i++;
        }
        this.f19438c = i;
        int i2 = this.f19439d;
        if (i2 % 2 == 1) {
            i2++;
        }
        this.f19439d = i2;
        int max = Math.max(this.f19438c, i2);
        float min = ((float) Math.min(this.f19438c, this.f19439d)) / ((float) max);
        if (min > 1.0f || ((double) min) <= 0.5625d) {
            double d = (double) min;
            if (d > 0.5625d || d <= 0.5d) {
                return (int) Math.ceil(((double) max) / (1280.0d / d));
            }
            int i3 = max / 1280;
            if (i3 == 0) {
                return 1;
            }
            return i3;
        } else if (max < 1664) {
            return 1;
        } else {
            if (max < 4990) {
                return 2;
            }
            if (max > 4990 && max < 10240) {
                return 4;
            }
            int i4 = max / 1280;
            if (i4 == 0) {
                return 1;
            }
            return i4;
        }
    }

    /* renamed from: c */
    public final Bitmap mo53717c(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}

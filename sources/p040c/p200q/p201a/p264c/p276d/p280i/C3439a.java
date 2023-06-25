package p040c.p200q.p201a.p264c.p276d.p280i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p040c.p200q.p201a.p264c.p276d.p281j.C3450c;

/* renamed from: c.q.a.c.d.i.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3439a implements Runnable {

    /* renamed from: e */
    public final Uri f6392e;
    @Nullable

    /* renamed from: l */
    public final ParcelFileDescriptor f6393l;

    /* renamed from: m */
    public final /* synthetic */ ImageManager f6394m;

    public C3439a(ImageManager imageManager, @Nullable Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f6394m = imageManager;
        this.f6392e = uri;
        this.f6393l = parcelFileDescriptor;
    }

    public final void run() {
        C3450c.m8752b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f6393l;
        Bitmap bitmap = null;
        boolean z = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                String valueOf = String.valueOf(this.f6392e);
                String.valueOf(valueOf).length();
                "OOM while loading bitmap for uri: ".concat(String.valueOf(valueOf));
                z = true;
            }
            try {
                this.f6393l.close();
            } catch (IOException unused2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f6394m;
        imageManager.f8226b.post(new C3440b(imageManager, this.f6392e, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            String valueOf2 = String.valueOf(this.f6392e);
            String.valueOf(valueOf2).length();
            "Latch interrupted while posting ".concat(String.valueOf(valueOf2));
        }
    }
}

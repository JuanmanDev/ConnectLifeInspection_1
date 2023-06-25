package p040c.p200q.p201a.p264c.p276d.p280i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import p040c.p200q.p201a.p264c.p276d.p281j.C3450c;

/* renamed from: c.q.a.c.d.i.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3440b implements Runnable {

    /* renamed from: e */
    public final Uri f6395e;
    @Nullable

    /* renamed from: l */
    public final Bitmap f6396l;

    /* renamed from: m */
    public final CountDownLatch f6397m;

    /* renamed from: n */
    public final /* synthetic */ ImageManager f6398n;

    public C3440b(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f6398n = imageManager;
        this.f6395e = uri;
        this.f6396l = bitmap;
        this.f6397m = countDownLatch;
    }

    public final void run() {
        C3450c.m8751a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f6396l;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f6398n.f8230f.remove(this.f6395e);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f8233l;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C3441c cVar = (C3441c) a.get(i);
                Bitmap bitmap2 = this.f6396l;
                if (bitmap2 == null || bitmap == null) {
                    this.f6398n.f8231g.put(this.f6395e, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f6398n;
                    cVar.mo20637b(imageManager.f8225a, imageManager.f8228d, false);
                } else {
                    cVar.mo20638c(this.f6398n.f8225a, bitmap2, false);
                }
                this.f6398n.f8229e.remove(cVar);
            }
        }
        this.f6397m.countDown();
        synchronized (ImageManager.f8223h) {
            ImageManager.f8224i.remove(this.f6395e);
        }
    }
}

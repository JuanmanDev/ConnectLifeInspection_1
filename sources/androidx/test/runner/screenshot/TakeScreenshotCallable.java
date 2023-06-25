package androidx.test.runner.screenshot;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class TakeScreenshotCallable implements Callable<Bitmap> {
    public static final String TAG = "TakeScreenshotCallable";
    public WeakReference<View> viewRef;

    @VisibleForTesting
    public static class Factory {
        public Callable<Bitmap> create(View view) {
            return new TakeScreenshotCallable(view);
        }
    }

    public TakeScreenshotCallable(View view) {
        this.viewRef = new WeakReference<>(view);
    }

    /* JADX INFO: finally extract failed */
    public Bitmap call() {
        ((View) this.viewRef.get()).setDrawingCacheEnabled(true);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(((View) this.viewRef.get()).getDrawingCache());
            ((View) this.viewRef.get()).setDrawingCacheEnabled(false);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            ((View) this.viewRef.get()).setDrawingCacheEnabled(false);
            return null;
        } catch (Throwable th) {
            ((View) this.viewRef.get()).setDrawingCacheEnabled(false);
            throw th;
        }
    }
}

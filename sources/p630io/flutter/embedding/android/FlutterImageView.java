package p630io.flutter.embedding.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedList;
import java.util.Queue;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p568h.C8970c;

@TargetApi(19)
/* renamed from: io.flutter.embedding.android.FlutterImageView */
public class FlutterImageView extends View implements C8970c {
    @NonNull

    /* renamed from: e */
    public ImageReader f18447e;
    @Nullable

    /* renamed from: l */
    public Queue<Image> f18448l;
    @Nullable

    /* renamed from: m */
    public Image f18449m;
    @Nullable

    /* renamed from: n */
    public Bitmap f18450n;
    @Nullable

    /* renamed from: o */
    public C8964a f18451o;

    /* renamed from: p */
    public SurfaceKind f18452p;

    /* renamed from: q */
    public boolean f18453q;

    /* renamed from: io.flutter.embedding.android.FlutterImageView$SurfaceKind */
    public enum SurfaceKind {
        background,
        overlay
    }

    /* renamed from: io.flutter.embedding.android.FlutterImageView$a */
    public static /* synthetic */ class C9402a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18454a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.FlutterImageView$SurfaceKind[] r0 = p630io.flutter.embedding.android.FlutterImageView.SurfaceKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18454a = r0
                io.flutter.embedding.android.FlutterImageView$SurfaceKind r1 = p630io.flutter.embedding.android.FlutterImageView.SurfaceKind.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18454a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.FlutterImageView$SurfaceKind r1 = p630io.flutter.embedding.android.FlutterImageView.SurfaceKind.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.android.FlutterImageView.C9402a.<clinit>():void");
        }
    }

    public FlutterImageView(@NonNull Context context, int i, int i2, SurfaceKind surfaceKind) {
        this(context, m25378d(i, i2), surfaceKind);
    }

    @TargetApi(19)
    @NonNull
    /* renamed from: d */
    public static ImageReader m25378d(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ImageReader.newInstance(i, i2, 1, 3, 768);
        }
        return ImageReader.newInstance(i, i2, 1, 3);
    }

    /* renamed from: a */
    public void mo46499a(@NonNull C8964a aVar) {
        if (!this.f18453q) {
            if (C9402a.f18454a[this.f18452p.ordinal()] == 1) {
                aVar.mo46493r(this.f18447e.getSurface());
            }
            setAlpha(1.0f);
            this.f18451o = aVar;
            this.f18453q = true;
        }
    }

    /* renamed from: b */
    public void mo46500b() {
        if (this.f18453q) {
            setAlpha(0.0f);
            mo47386c();
            this.f18450n = null;
            for (Image close : this.f18448l) {
                close.close();
            }
            this.f18448l.clear();
            Image image = this.f18449m;
            if (image != null) {
                image.close();
                this.f18449m = null;
            }
            invalidate();
            this.f18453q = false;
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    public boolean mo47386c() {
        Image acquireLatestImage;
        if (!this.f18453q) {
            return false;
        }
        int size = this.f18448l.size();
        if (this.f18449m != null) {
            size++;
        }
        if (size < this.f18447e.getMaxImages() && (acquireLatestImage = this.f18447e.acquireLatestImage()) != null) {
            this.f18448l.add(acquireLatestImage);
        }
        invalidate();
        return !this.f18448l.isEmpty();
    }

    /* renamed from: e */
    public final void mo47387e() {
        setAlpha(0.0f);
    }

    /* renamed from: f */
    public void mo47388f(int i, int i2) {
        if (this.f18451o != null) {
            if (i != this.f18447e.getWidth() || i2 != this.f18447e.getHeight()) {
                this.f18448l.clear();
                this.f18449m = null;
                this.f18447e.close();
                this.f18447e = m25378d(i, i2);
            }
        }
    }

    @TargetApi(29)
    /* renamed from: g */
    public final void mo47389g() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f18449m.getHardwareBuffer();
            this.f18450n = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f18449m.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f18449m.getHeight();
            Bitmap bitmap = this.f18450n;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f18450n.getHeight() == height)) {
                this.f18450n = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            this.f18450n.copyPixelsFromBuffer(plane.getBuffer());
        }
    }

    @Nullable
    public C8964a getAttachedRenderer() {
        return this.f18451o;
    }

    @NonNull
    public Surface getSurface() {
        return this.f18447e.getSurface();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f18448l.isEmpty()) {
            Image image = this.f18449m;
            if (image != null) {
                image.close();
            }
            this.f18449m = this.f18448l.poll();
            mo47389g();
        }
        Bitmap bitmap = this.f18450n;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f18447e.getWidth() && i2 == this.f18447e.getHeight()) && this.f18452p == SurfaceKind.background && this.f18453q) {
            mo47388f(i, i2);
            this.f18451o.mo46493r(this.f18447e.getSurface());
        }
    }

    public void pause() {
    }

    public FlutterImageView(@NonNull Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    @VisibleForTesting
    public FlutterImageView(@NonNull Context context, @NonNull ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, (AttributeSet) null);
        this.f18453q = false;
        this.f18447e = imageReader;
        this.f18452p = surfaceKind;
        this.f18448l = new LinkedList();
        mo47387e();
    }
}

package p040c.p077d.p078a.p081k.p091l.p092c;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1568d;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;

/* renamed from: c.d.a.k.l.c.x */
/* compiled from: VideoDecoder */
public class C1834x<T> implements C1572f<T, Bitmap> {

    /* renamed from: d */
    public static final C1568d<Long> f1423d = C1568d.m1279a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1835a());

    /* renamed from: e */
    public static final C1568d<Integer> f1424e = C1568d.m1279a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1836b());

    /* renamed from: f */
    public static final C1838d f1425f = new C1838d();

    /* renamed from: a */
    public final C1839e<T> f1426a;

    /* renamed from: b */
    public final C1697e f1427b;

    /* renamed from: c */
    public final C1838d f1428c;

    /* renamed from: c.d.a.k.l.c.x$a */
    /* compiled from: VideoDecoder */
    public class C1835a implements C1568d.C1570b<Long> {

        /* renamed from: a */
        public final ByteBuffer f1429a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void mo15615a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f1429a) {
                this.f1429a.position(0);
                messageDigest.update(this.f1429a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: c.d.a.k.l.c.x$b */
    /* compiled from: VideoDecoder */
    public class C1836b implements C1568d.C1570b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f1430a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void mo15615a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f1430a) {
                    this.f1430a.position(0);
                    messageDigest.update(this.f1430a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: c.d.a.k.l.c.x$c */
    /* compiled from: VideoDecoder */
    public static final class C1837c implements C1839e<AssetFileDescriptor> {
        public C1837c() {
        }

        /* renamed from: b */
        public void mo16135a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C1837c(C1835a aVar) {
            this();
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.c.x$d */
    /* compiled from: VideoDecoder */
    public static class C1838d {
        /* renamed from: a */
        public MediaMetadataRetriever mo16137a() {
            return new MediaMetadataRetriever();
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.c.x$e */
    /* compiled from: VideoDecoder */
    public interface C1839e<T> {
        /* renamed from: a */
        void mo16135a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: c.d.a.k.l.c.x$f */
    /* compiled from: VideoDecoder */
    public static final class C1840f implements C1839e<ParcelFileDescriptor> {
        /* renamed from: b */
        public void mo16135a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public C1834x(C1697e eVar, C1839e<T> eVar2) {
        this(eVar, eVar2, f1425f);
    }

    /* renamed from: c */
    public static C1572f<AssetFileDescriptor, Bitmap> m2117c(C1697e eVar) {
        return new C1834x(eVar, new C1837c((C1835a) null));
    }

    @Nullable
    /* renamed from: d */
    public static Bitmap m2118d(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap f = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f7028d) ? null : m2120f(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return f == null ? m2119e(mediaMetadataRetriever, j, i) : f;
    }

    /* renamed from: e */
    public static Bitmap m2119e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: f */
    public static Bitmap m2120f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = downsampleStrategy.mo21675b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable unused) {
            boolean isLoggable = Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: g */
    public static C1572f<ParcelFileDescriptor, Bitmap> m2121g(C1697e eVar) {
        return new C1834x(eVar, new C1840f());
    }

    /* renamed from: a */
    public boolean mo15620a(@NonNull T t, @NonNull C1571e eVar) {
        return true;
    }

    /* renamed from: b */
    public C1685u<Bitmap> mo15621b(@NonNull T t, int i, int i2, @NonNull C1571e eVar) {
        long longValue = ((Long) eVar.mo15616c(f1423d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) eVar.mo15616c(f1424e);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.mo15616c(DownsampleStrategy.f7030f);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f7029e;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever a = this.f1428c.mo16137a();
            try {
                this.f1426a.mo16135a(a, t);
                Bitmap d = m2118d(a, longValue, num.intValue(), i, i2, downsampleStrategy2);
                a.release();
                return C1803d.m1984f(d, this.f1427b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    @VisibleForTesting
    public C1834x(C1697e eVar, C1839e<T> eVar2, C1838d dVar) {
        this.f1427b = eVar;
        this.f1426a = eVar2;
        this.f1428c = dVar;
    }
}

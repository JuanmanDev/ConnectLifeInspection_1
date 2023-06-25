package p040c.p077d.p078a.p081k.p091l.p096g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p040c.p077d.p078a.p080j.C1559a;
import p040c.p077d.p078a.p080j.C1562c;
import p040c.p077d.p078a.p080j.C1563d;
import p040c.p077d.p078a.p080j.C1564e;
import p040c.p077d.p078a.p081k.C1566b;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p091l.C1799b;
import p040c.p077d.p078a.p105q.C1945e;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.g.a */
/* compiled from: ByteBufferGifDecoder */
public class C1851a implements C1572f<ByteBuffer, GifDrawable> {

    /* renamed from: f */
    public static final C1852a f1436f = new C1852a();

    /* renamed from: g */
    public static final C1853b f1437g = new C1853b();

    /* renamed from: a */
    public final Context f1438a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f1439b;

    /* renamed from: c */
    public final C1853b f1440c;

    /* renamed from: d */
    public final C1852a f1441d;

    /* renamed from: e */
    public final C1854b f1442e;

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.g.a$a */
    /* compiled from: ByteBufferGifDecoder */
    public static class C1852a {
        /* renamed from: a */
        public C1559a mo16156a(C1559a.C1560a aVar, C1562c cVar, ByteBuffer byteBuffer, int i) {
            return new C1564e(aVar, cVar, byteBuffer, i);
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.g.a$b */
    /* compiled from: ByteBufferGifDecoder */
    public static class C1853b {

        /* renamed from: a */
        public final Queue<C1563d> f1443a = C1950j.m2569e(0);

        /* renamed from: a */
        public synchronized C1563d mo16157a(ByteBuffer byteBuffer) {
            C1563d poll;
            poll = this.f1443a.poll();
            if (poll == null) {
                poll = new C1563d();
            }
            poll.mo15592p(byteBuffer);
            return poll;
        }

        /* renamed from: b */
        public synchronized void mo16158b(C1563d dVar) {
            dVar.mo15577a();
            this.f1443a.offer(dVar);
        }
    }

    public C1851a(Context context, List<ImageHeaderParser> list, C1697e eVar, C1692b bVar) {
        this(context, list, eVar, bVar, f1437g, f1436f);
    }

    /* renamed from: e */
    public static int m2171e(C1562c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo15573a() / i2, cVar.mo15576d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo15576d() + "x" + cVar.mo15573a() + "]";
        }
        return max;
    }

    @Nullable
    /* renamed from: c */
    public final C1856d mo16153c(ByteBuffer byteBuffer, int i, int i2, C1563d dVar, C1571e eVar) {
        long b = C1945e.m2547b();
        try {
            C1562c c = dVar.mo15579c();
            if (c.mo15574b() > 0) {
                if (c.mo15575c() == 0) {
                    Bitmap.Config config = eVar.mo15616c(C1864h.f1468a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    C1559a a = this.f1441d.mo16156a(this.f1442e, c, byteBuffer, m2171e(c, i, i2));
                    a.mo15562e(config);
                    a.mo15558b();
                    Bitmap a2 = a.mo15557a();
                    if (a2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            "Decoded GIF from stream in " + C1945e.m2546a(b);
                        }
                        return null;
                    }
                    C1856d dVar2 = new C1856d(new GifDrawable(this.f1438a, a, C1799b.m1972c(), i, i2, a2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        "Decoded GIF from stream in " + C1945e.m2546a(b);
                    }
                    return dVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                "Decoded GIF from stream in " + C1945e.m2546a(b);
            }
        }
    }

    /* renamed from: d */
    public C1856d mo15621b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C1571e eVar) {
        C1563d a = this.f1440c.mo16157a(byteBuffer);
        try {
            return mo16153c(byteBuffer, i, i2, a, eVar);
        } finally {
            this.f1440c.mo16158b(a);
        }
    }

    /* renamed from: f */
    public boolean mo15620a(@NonNull ByteBuffer byteBuffer, @NonNull C1571e eVar) {
        return !((Boolean) eVar.mo15616c(C1864h.f1469b)).booleanValue() && C1566b.m1277c(this.f1439b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @VisibleForTesting
    public C1851a(Context context, List<ImageHeaderParser> list, C1697e eVar, C1692b bVar, C1853b bVar2, C1852a aVar) {
        this.f1438a = context.getApplicationContext();
        this.f1439b = list;
        this.f1441d = aVar;
        this.f1442e = new C1854b(eVar, bVar);
        this.f1440c = bVar2;
    }
}

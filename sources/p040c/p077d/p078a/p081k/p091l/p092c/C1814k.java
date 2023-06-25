package p040c.p077d.p078a.p081k.p091l.p092c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p040c.p077d.p078a.p081k.C1566b;
import p040c.p077d.p078a.p081k.C1568d;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p105q.C1945e;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.c.k */
/* compiled from: Downsampler */
public final class C1814k {

    /* renamed from: f */
    public static final C1568d<DecodeFormat> f1381f = C1568d.m1282f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: g */
    public static final C1568d<Boolean> f1382g = C1568d.m1282f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);

    /* renamed from: h */
    public static final C1568d<Boolean> f1383h = C1568d.m1282f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);

    /* renamed from: i */
    public static final Set<String> f1384i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: j */
    public static final C1816b f1385j = new C1815a();

    /* renamed from: k */
    public static final Set<ImageHeaderParser.ImageType> f1386k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: l */
    public static final Queue<BitmapFactory.Options> f1387l = C1950j.m2569e(0);

    /* renamed from: a */
    public final C1697e f1388a;

    /* renamed from: b */
    public final DisplayMetrics f1389b;

    /* renamed from: c */
    public final C1692b f1390c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f1391d;

    /* renamed from: e */
    public final C1822p f1392e = C1822p.m2068a();

    /* renamed from: c.d.a.k.l.c.k$a */
    /* compiled from: Downsampler */
    public class C1815a implements C1816b {
        /* renamed from: a */
        public void mo16102a(C1697e eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo16103b() {
        }
    }

    /* renamed from: c.d.a.k.l.c.k$b */
    /* compiled from: Downsampler */
    public interface C1816b {
        /* renamed from: a */
        void mo16102a(C1697e eVar, Bitmap bitmap);

        /* renamed from: b */
        void mo16103b();
    }

    static {
        C1568d<DownsampleStrategy> dVar = DownsampleStrategy.f7030f;
    }

    public C1814k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C1697e eVar, C1692b bVar) {
        this.f1391d = list;
        C1949i.m2563d(displayMetrics);
        this.f1389b = displayMetrics;
        C1949i.m2563d(eVar);
        this.f1388a = eVar;
        C1949i.m2563d(bVar);
        this.f1390c = bVar;
    }

    /* renamed from: a */
    public static int m2030a(double d) {
        int j = m2035j(d);
        int t = m2043t(((double) j) * d);
        return m2043t((d / ((double) (((float) t) / ((float) j)))) * ((double) t));
    }

    /* renamed from: c */
    public static void m2031c(ImageHeaderParser.ImageType imageType, InputStream inputStream, C1816b bVar, C1697e eVar, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                "Unable to determine dimensions for: " + imageType2 + " with target [" + i13 + str + i14 + "]";
                return;
            }
            return;
        }
        if (i10 == 90 || i10 == 270) {
            f = downsampleStrategy2.mo21675b(i12, i11, i13, i14);
        } else {
            f = downsampleStrategy2.mo21675b(i11, i12, i13, i14);
        }
        if (f > 0.0f) {
            DownsampleStrategy.SampleSizeRounding a = downsampleStrategy2.mo21674a(i11, i12, i13, i14);
            if (a != null) {
                float f2 = (float) i11;
                float f3 = (float) i12;
                String str2 = "Downsampler";
                String str3 = "x";
                int t = i11 / m2043t((double) (f * f2));
                int t2 = i12 / m2043t((double) (f * f3));
                if (a == DownsampleStrategy.SampleSizeRounding.MEMORY) {
                    i6 = Math.max(t, t2);
                } else {
                    i6 = Math.min(t, t2);
                }
                if (Build.VERSION.SDK_INT > 23 || !f1384i.contains(options2.outMimeType)) {
                    i7 = Math.max(1, Integer.highestOneBit(i6));
                    if (a == DownsampleStrategy.SampleSizeRounding.MEMORY && ((float) i7) < 1.0f / f) {
                        i7 <<= 1;
                    }
                } else {
                    i7 = 1;
                }
                options2.inSampleSize = i7;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i7, 8);
                    i8 = (int) Math.ceil((double) (f2 / min));
                    i9 = (int) Math.ceil((double) (f3 / min));
                    int i15 = i7 / 8;
                    if (i15 > 0) {
                        i8 /= i15;
                        i9 /= i15;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f4 = (float) i7;
                        i8 = (int) Math.floor((double) (f2 / f4));
                        d = Math.floor((double) (f3 / f4));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            float f5 = (float) i7;
                            i8 = Math.round(f2 / f5);
                            i9 = Math.round(f3 / f5);
                        } else {
                            float f6 = (float) i7;
                            i8 = (int) Math.floor((double) (f2 / f6));
                            d = Math.floor((double) (f3 / f6));
                        }
                    } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                        i8 = i11 / i7;
                        i9 = i12 / i7;
                    } else {
                        int[] k = m2036k(inputStream, options2, bVar, eVar);
                        int i16 = k[0];
                        i9 = k[1];
                        i8 = i16;
                    }
                    i9 = (int) d;
                }
                double b = (double) downsampleStrategy2.mo21675b(i8, i9, i13, i14);
                if (Build.VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m2030a(b);
                    options2.inDensity = m2035j(b);
                }
                if (m2038o(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i11);
                    String str4 = str3;
                    sb.append(str4);
                    sb.append(i12);
                    sb.append("], target: [");
                    sb.append(i13);
                    sb.append(str4);
                    sb.append(i14);
                    sb.append("], power of two scaled: [");
                    sb.append(i8);
                    sb.append(str4);
                    sb.append(i9);
                    sb.append("], exact scale factor: ");
                    sb.append(f);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i7);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    sb.toString();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str5 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + downsampleStrategy2 + ", source: [" + i11 + str5 + i12 + "], target: [" + i13 + str5 + i14 + "]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0056 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m2032g(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, p040c.p077d.p078a.p081k.p091l.p092c.C1814k.C1816b r7, p040c.p077d.p078a.p081k.p084j.p088z.C1697e r8) {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto L_0x000a
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto L_0x000d
        L_0x000a:
            r7.mo16103b()
        L_0x000d:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = p040c.p077d.p078a.p081k.p091l.p092c.C1830v.m2101i()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0030 }
            java.util.concurrent.locks.Lock r8 = p040c.p077d.p078a.p081k.p091l.p092c.C1830v.m2101i()
            r8.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L_0x002d
            r5.reset()
        L_0x002d:
            return r7
        L_0x002e:
            r5 = move-exception
            goto L_0x0058
        L_0x0030:
            r4 = move-exception
            java.io.IOException r0 = m2040q(r4, r0, r1, r2, r6)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x002e }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0057
            r5.reset()     // Catch:{ IOException -> 0x0056 }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ IOException -> 0x0056 }
            r8.mo15922c(r1)     // Catch:{ IOException -> 0x0056 }
            r6.inBitmap = r3     // Catch:{ IOException -> 0x0056 }
            android.graphics.Bitmap r5 = m2032g(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0056 }
            java.util.concurrent.locks.Lock r6 = p040c.p077d.p078a.p081k.p091l.p092c.C1830v.m2101i()
            r6.unlock()
            return r5
        L_0x0056:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0058:
            java.util.concurrent.locks.Lock r6 = p040c.p077d.p078a.p081k.p091l.p092c.C1830v.m2101i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p092c.C1814k.m2032g(java.io.InputStream, android.graphics.BitmapFactory$Options, c.d.a.k.l.c.k$b, c.d.a.k.j.z.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    @Nullable
    /* renamed from: h */
    public static String m2033h(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: i */
    public static synchronized BitmapFactory.Options m2034i() {
        BitmapFactory.Options poll;
        synchronized (C1814k.class) {
            synchronized (f1387l) {
                poll = f1387l.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m2042s(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    public static int m2035j(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: k */
    public static int[] m2036k(InputStream inputStream, BitmapFactory.Options options, C1816b bVar, C1697e eVar) {
        options.inJustDecodeBounds = true;
        m2032g(inputStream, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: l */
    public static String m2037l(BitmapFactory.Options options) {
        return m2033h(options.inBitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2038o(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p092c.C1814k.m2038o(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: p */
    public static void m2039p(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        "Decoded " + m2033h(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m2037l(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C1945e.m2546a(j);
    }

    /* renamed from: q */
    public static IOException m2040q(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m2037l(options), illegalArgumentException);
    }

    /* renamed from: r */
    public static void m2041r(BitmapFactory.Options options) {
        m2042s(options);
        synchronized (f1387l) {
            f1387l.offer(options);
        }
    }

    /* renamed from: s */
    public static void m2042s(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: t */
    public static int m2043t(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: u */
    public static void m2044u(BitmapFactory.Options options, C1697e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo15924e(i, i2, config);
    }

    /* renamed from: b */
    public final void mo16095b(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f1392e.mo16107c(i, i2, options, decodeFormat, z, z2)) {
            if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C1566b.m1276b(this.f1391d, inputStream, this.f1390c).hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 3)) {
                    "Cannot determine whether the image has alpha or not from header, format " + decodeFormat;
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: d */
    public C1685u<Bitmap> mo16096d(InputStream inputStream, int i, int i2, C1571e eVar) {
        return mo16097e(inputStream, i, i2, eVar, f1385j);
    }

    /* renamed from: e */
    public C1685u<Bitmap> mo16097e(InputStream inputStream, int i, int i2, C1571e eVar, C1816b bVar) {
        C1571e eVar2 = eVar;
        C1949i.m2560a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f1390c.mo15901d(65536, byte[].class);
        BitmapFactory.Options i3 = m2034i();
        i3.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar2.mo15616c(f1381f);
        try {
            return C1803d.m1984f(mo16098f(inputStream, i3, (DownsampleStrategy) eVar2.mo15616c(DownsampleStrategy.f7030f), decodeFormat, eVar2.mo15616c(f1383h) != null && ((Boolean) eVar2.mo15616c(f1383h)).booleanValue(), i, i2, ((Boolean) eVar2.mo15616c(f1382g)).booleanValue(), bVar), this.f1388a);
        } finally {
            m2041r(i3);
            this.f1390c.put(bArr);
        }
    }

    /* renamed from: f */
    public final Bitmap mo16098f(InputStream inputStream, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i, int i2, boolean z2, C1816b bVar) {
        C1814k kVar;
        int i3;
        int i4;
        int i5;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        C1816b bVar2 = bVar;
        long b = C1945e.m2547b();
        int[] k = m2036k(inputStream2, options2, bVar2, this.f1388a);
        boolean z3 = false;
        int i6 = k[0];
        int i7 = k[1];
        String str = options2.outMimeType;
        boolean z4 = (i6 == -1 || i7 == -1) ? false : z;
        int a = C1566b.m1275a(this.f1391d, inputStream2, this.f1390c);
        int j = C1830v.m2102j(a);
        boolean m = C1830v.m2105m(a);
        int i8 = i;
        int i9 = i2;
        int i10 = i8 == Integer.MIN_VALUE ? i6 : i8;
        int i11 = i9 == Integer.MIN_VALUE ? i7 : i9;
        ImageHeaderParser.ImageType b2 = C1566b.m1276b(this.f1391d, inputStream2, this.f1390c);
        C1697e eVar = this.f1388a;
        ImageHeaderParser.ImageType imageType = b2;
        m2031c(b2, inputStream, bVar, eVar, downsampleStrategy, j, i6, i7, i10, i11, options);
        int i12 = a;
        String str2 = str;
        int i13 = i7;
        int i14 = i6;
        C1816b bVar3 = bVar2;
        BitmapFactory.Options options3 = options2;
        mo16095b(inputStream, decodeFormat, z4, m, options, i10, i11);
        if (Build.VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        if (options3.inSampleSize == 1 || z3) {
            kVar = this;
            if (kVar.mo16101v(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z3) {
                    float f = m2038o(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i15 = options3.inSampleSize;
                    float f2 = (float) i15;
                    i5 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f);
                    i4 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        "Calculated target [" + i5 + "x" + i4 + "] for source [" + i14 + "x" + i13 + "], sampleSize: " + i15 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f;
                    }
                } else {
                    i5 = i10;
                    i4 = i11;
                }
                if (i5 > 0 && i4 > 0) {
                    m2044u(options3, kVar.f1388a, i5, i4);
                }
            }
        } else {
            kVar = this;
        }
        Bitmap g = m2032g(inputStream, options3, bVar3, kVar.f1388a);
        bVar3.mo16102a(kVar.f1388a, g);
        if (Log.isLoggable("Downsampler", 2)) {
            i3 = i12;
            m2039p(i14, i13, str2, options, g, i, i2, b);
        } else {
            i3 = i12;
        }
        Bitmap bitmap = null;
        if (g != null) {
            g.setDensity(kVar.f1389b.densityDpi);
            bitmap = C1830v.m2106n(kVar.f1388a, g, i3);
            if (!g.equals(bitmap)) {
                kVar.f1388a.mo15922c(g);
            }
        }
        return bitmap;
    }

    /* renamed from: m */
    public boolean mo16099m(InputStream inputStream) {
        return true;
    }

    /* renamed from: n */
    public boolean mo16100n(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: v */
    public final boolean mo16101v(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f1386k.contains(imageType);
    }
}

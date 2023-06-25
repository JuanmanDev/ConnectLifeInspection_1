package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import p040c.p077d.p078a.p081k.C1568d;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.l.c.c */
/* compiled from: BitmapEncoder */
public class C1802c implements C1573g<Bitmap> {

    /* renamed from: b */
    public static final C1568d<Integer> f1367b = C1568d.m1282f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C1568d<Bitmap.CompressFormat> f1368c = C1568d.m1281e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @Nullable

    /* renamed from: a */
    public final C1692b f1369a;

    public C1802c(@NonNull C1692b bVar) {
        this.f1369a = bVar;
    }

    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo15622b(@NonNull C1571e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:36|37)|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[SYNTHETIC, Splitter:B:36:0x00af] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15605a(@androidx.annotation.NonNull p040c.p077d.p078a.p081k.p084j.C1685u<android.graphics.Bitmap> r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1571e r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.mo16072d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p040c.p077d.p078a.p105q.p106k.C1960b.m2599c(r4, r2, r3, r1)
            long r2 = p040c.p077d.p078a.p105q.C1945e.m2547b()     // Catch:{ all -> 0x00b3 }
            c.d.a.k.d<java.lang.Integer> r4 = f1367b     // Catch:{ all -> 0x00b3 }
            java.lang.Object r4 = r11.mo15616c(r4)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b3 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0058 }
            c.d.a.k.j.z.b r10 = r8.f1369a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            c.d.a.k.i.c r10 = new c.d.a.k.i.c     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            c.d.a.k.j.z.b r6 = r8.f1369a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0058 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00ad
        L_0x0054:
            r6 = r7
            goto L_0x0058
        L_0x0056:
            r9 = move-exception
            goto L_0x00ad
        L_0x0058:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0060
            goto L_0x004d
        L_0x0060:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00b3 }
            if (r10 == 0) goto L_0x00a9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r10.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            r10.append(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            int r0 = p040c.p077d.p078a.p105q.C1950j.m2571g(r9)     // Catch:{ all -> 0x00b3 }
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            double r0 = p040c.p077d.p078a.p105q.C1945e.m2546a(r2)     // Catch:{ all -> 0x00b3 }
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            c.d.a.k.d<android.graphics.Bitmap$CompressFormat> r0 = f1368c     // Catch:{ all -> 0x00b3 }
            java.lang.Object r11 = r11.mo15616c(r0)     // Catch:{ all -> 0x00b3 }
            r10.append(r11)     // Catch:{ all -> 0x00b3 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00b3 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00b3 }
            r10.append(r9)     // Catch:{ all -> 0x00b3 }
            r10.toString()     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            p040c.p077d.p078a.p105q.p106k.C1960b.m2600d()
            return r5
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r9     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r9 = move-exception
            p040c.p077d.p078a.p105q.p106k.C1960b.m2600d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p092c.C1802c.mo15605a(c.d.a.k.j.u, java.io.File, c.d.a.k.e):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat mo16072d(Bitmap bitmap, C1571e eVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) eVar.mo15616c(f1368c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }
}

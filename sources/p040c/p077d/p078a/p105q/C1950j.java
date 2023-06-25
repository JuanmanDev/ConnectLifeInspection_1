package p040c.p077d.p078a.p105q;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p040c.p077d.p078a.p081k.p089k.C1752l;

/* renamed from: c.d.a.q.j */
/* compiled from: Util */
public final class C1950j {

    /* renamed from: a */
    public static final char[] f1637a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f1638b = new char[64];

    /* renamed from: c.d.a.q.j$a */
    /* compiled from: Util */
    public static /* synthetic */ class C1951a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1639a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1639a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1639a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1639a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1639a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p105q.C1950j.C1951a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m2565a() {
        if (!m2581q()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m2566b(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C1752l) {
            return ((C1752l) obj).mo16022a(obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m2567c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    /* renamed from: d */
    public static String m2568d(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f1637a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Queue<T> m2569e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m2570f(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * m2572h(config);
    }

    @TargetApi(19)
    /* renamed from: g */
    public static int m2571g(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    public static int m2572h(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C1951a.f1639a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @NonNull
    /* renamed from: i */
    public static <T> List<T> m2573i(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m2574j(float f) {
        return m2575k(f, 17);
    }

    /* renamed from: k */
    public static int m2575k(float f, int i) {
        return m2577m(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m2576l(int i) {
        return m2577m(i, 17);
    }

    /* renamed from: m */
    public static int m2577m(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: n */
    public static int m2578n(@Nullable Object obj, int i) {
        return m2577m(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: o */
    public static int m2579o(boolean z, int i) {
        return m2577m(z ? 1 : 0, i);
    }

    /* renamed from: p */
    public static boolean m2580p() {
        return !m2581q();
    }

    /* renamed from: q */
    public static boolean m2581q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: r */
    public static boolean m2582r(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: s */
    public static boolean m2583s(int i, int i2) {
        return m2582r(i) && m2582r(i2);
    }

    @NonNull
    /* renamed from: t */
    public static String m2584t(@NonNull byte[] bArr) {
        String d;
        synchronized (f1638b) {
            d = m2568d(bArr, f1638b);
        }
        return d;
    }
}

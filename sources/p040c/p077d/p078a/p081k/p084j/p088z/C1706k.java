package p040c.p077d.p078a.p081k.p084j.p088z;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.d.a.k.j.z.k */
/* compiled from: LruBitmapPool */
public class C1706k implements C1697e {

    /* renamed from: j */
    public static final Bitmap.Config f1243j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C1709l f1244a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f1245b;

    /* renamed from: c */
    public final C1707a f1246c;

    /* renamed from: d */
    public long f1247d;

    /* renamed from: e */
    public long f1248e;

    /* renamed from: f */
    public int f1249f;

    /* renamed from: g */
    public int f1250g;

    /* renamed from: h */
    public int f1251h;

    /* renamed from: i */
    public int f1252i;

    /* renamed from: c.d.a.k.j.z.k$a */
    /* compiled from: LruBitmapPool */
    public interface C1707a {
        /* renamed from: a */
        void mo15961a(Bitmap bitmap);

        /* renamed from: b */
        void mo15962b(Bitmap bitmap);
    }

    /* renamed from: c.d.a.k.j.z.k$b */
    /* compiled from: LruBitmapPool */
    public static final class C1708b implements C1707a {
        /* renamed from: a */
        public void mo15961a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo15962b(Bitmap bitmap) {
        }
    }

    public C1706k(long j, C1709l lVar, Set<Bitmap.Config> set) {
        this.f1247d = j;
        this.f1244a = lVar;
        this.f1245b = set;
        this.f1246c = new C1708b();
    }

    @TargetApi(26)
    /* renamed from: f */
    public static void m1715f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* renamed from: g */
    public static Bitmap m1716g(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f1243j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: k */
    public static Set<Bitmap.Config> m1717k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static C1709l m1718l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C1711n();
        }
        return new C1693c();
    }

    @TargetApi(19)
    /* renamed from: o */
    public static void m1719o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    public static void m1720p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m1719o(bitmap);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo15920a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            "trimMemory, level=" + i;
        }
        if (i >= 40) {
            mo15921b();
        } else if (i >= 20 || i == 15) {
            mo15960q(mo15959n() / 2);
        }
    }

    /* renamed from: b */
    public void mo15921b() {
        boolean isLoggable = Log.isLoggable("LruBitmapPool", 3);
        mo15960q(0);
    }

    /* renamed from: c */
    public synchronized void mo15922c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f1244a.mo15907e(bitmap)) <= this.f1247d) {
                        if (this.f1245b.contains(bitmap.getConfig())) {
                            int e = this.f1244a.mo15907e(bitmap);
                            this.f1244a.mo15905c(bitmap);
                            this.f1246c.mo15962b(bitmap);
                            this.f1251h++;
                            this.f1248e += (long) e;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                "Put bitmap in pool=" + this.f1244a.mo15908f(bitmap);
                            }
                            mo15955h();
                            mo15957j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        "Reject bitmap from pool, bitmap: " + this.f1244a.mo15908f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f1245b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo15923d(int i, int i2, Bitmap.Config config) {
        Bitmap m = mo15958m(i, i2, config);
        if (m == null) {
            return m1716g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo15924e(int i, int i2, Bitmap.Config config) {
        Bitmap m = mo15958m(i, i2, config);
        return m == null ? m1716g(i, i2, config) : m;
    }

    /* renamed from: h */
    public final void mo15955h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            mo15956i();
        }
    }

    /* renamed from: i */
    public final void mo15956i() {
        "Hits=" + this.f1249f + ", misses=" + this.f1250g + ", puts=" + this.f1251h + ", evictions=" + this.f1252i + ", currentSize=" + this.f1248e + ", maxSize=" + this.f1247d + "\nStrategy=" + this.f1244a;
    }

    /* renamed from: j */
    public final void mo15957j() {
        mo15960q(this.f1247d);
    }

    @Nullable
    /* renamed from: m */
    public final synchronized Bitmap mo15958m(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap d;
        m1715f(config);
        d = this.f1244a.mo15906d(i, i2, config != null ? config : f1243j);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                "Missing bitmap=" + this.f1244a.mo15904b(i, i2, config);
            }
            this.f1250g++;
        } else {
            this.f1249f++;
            this.f1248e -= (long) this.f1244a.mo15907e(d);
            this.f1246c.mo15961a(d);
            m1720p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            "Get bitmap=" + this.f1244a.mo15904b(i, i2, config);
        }
        mo15955h();
        return d;
    }

    /* renamed from: n */
    public long mo15959n() {
        return this.f1247d;
    }

    /* renamed from: q */
    public final synchronized void mo15960q(long j) {
        while (this.f1248e > j) {
            Bitmap a = this.f1244a.mo15903a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    mo15956i();
                }
                this.f1248e = 0;
                return;
            }
            this.f1246c.mo15961a(a);
            this.f1248e -= (long) this.f1244a.mo15907e(a);
            this.f1252i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                "Evicting bitmap=" + this.f1244a.mo15908f(a);
            }
            mo15955h();
            a.recycle();
        }
    }

    public C1706k(long j) {
        this(j, m1718l(), m1717k());
    }
}

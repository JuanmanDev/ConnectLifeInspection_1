package p040c.p077d.p078a.p081k.p091l.p092c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.File;

/* renamed from: c.d.a.k.l.c.p */
/* compiled from: HardwareConfigState */
public final class C1822p {

    /* renamed from: c */
    public static final File f1397c = new File("/proc/self/fd");

    /* renamed from: d */
    public static volatile C1822p f1398d;

    /* renamed from: a */
    public volatile int f1399a;

    /* renamed from: b */
    public volatile boolean f1400b = true;

    /* renamed from: a */
    public static C1822p m2068a() {
        if (f1398d == null) {
            synchronized (C1822p.class) {
                if (f1398d == null) {
                    f1398d = new C1822p();
                }
            }
        }
        return f1398d;
    }

    /* renamed from: b */
    public final synchronized boolean mo16106b() {
        boolean z = true;
        int i = this.f1399a + 1;
        this.f1399a = i;
        if (i >= 50) {
            this.f1399a = 0;
            int length = f1397c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f1400b = z;
            if (!this.f1400b && Log.isLoggable("Downsampler", 5)) {
                "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + EventBusConstKt.DEVICE_INFO;
            }
        }
        return this.f1400b;
    }

    @TargetApi(26)
    /* renamed from: c */
    public boolean mo16107c(int i, int i2, BitmapFactory.Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && mo16106b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}

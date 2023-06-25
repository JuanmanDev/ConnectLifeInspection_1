package p040c.p077d.p078a.p081k.p084j.p085a0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;

/* renamed from: c.d.a.k.j.a0.i */
/* compiled from: MemorySizeCalculator */
public final class C1624i {

    /* renamed from: a */
    public final int f988a;

    /* renamed from: b */
    public final int f989b;

    /* renamed from: c */
    public final Context f990c;

    /* renamed from: d */
    public final int f991d;

    /* renamed from: c.d.a.k.j.a0.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C1625a {

        /* renamed from: i */
        public static final int f992i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        public final Context f993a;

        /* renamed from: b */
        public ActivityManager f994b;

        /* renamed from: c */
        public C1627c f995c;

        /* renamed from: d */
        public float f996d = 2.0f;

        /* renamed from: e */
        public float f997e = ((float) f992i);

        /* renamed from: f */
        public float f998f = 0.4f;

        /* renamed from: g */
        public float f999g = 0.33f;

        /* renamed from: h */
        public int f1000h = 4194304;

        public C1625a(Context context) {
            this.f993a = context;
            this.f994b = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.f995c = new C1626b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C1624i.m1430e(this.f994b)) {
                this.f997e = 0.0f;
            }
        }

        /* renamed from: a */
        public C1624i mo15716a() {
            return new C1624i(this);
        }
    }

    /* renamed from: c.d.a.k.j.a0.i$b */
    /* compiled from: MemorySizeCalculator */
    public static final class C1626b implements C1627c {

        /* renamed from: a */
        public final DisplayMetrics f1001a;

        public C1626b(DisplayMetrics displayMetrics) {
            this.f1001a = displayMetrics;
        }

        /* renamed from: a */
        public int mo15717a() {
            return this.f1001a.heightPixels;
        }

        /* renamed from: b */
        public int mo15718b() {
            return this.f1001a.widthPixels;
        }
    }

    /* renamed from: c.d.a.k.j.a0.i$c */
    /* compiled from: MemorySizeCalculator */
    public interface C1627c {
        /* renamed from: a */
        int mo15717a();

        /* renamed from: b */
        int mo15718b();
    }

    public C1624i(C1625a aVar) {
        int i;
        this.f990c = aVar.f993a;
        if (m1430e(aVar.f994b)) {
            i = aVar.f1000h / 2;
        } else {
            i = aVar.f1000h;
        }
        this.f991d = i;
        int c = m1429c(aVar.f994b, aVar.f998f, aVar.f999g);
        float b = (float) (aVar.f995c.mo15718b() * aVar.f995c.mo15717a() * 4);
        int round = Math.round(aVar.f997e * b);
        int round2 = Math.round(b * aVar.f996d);
        int i2 = c - this.f991d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f989b = round2;
            this.f988a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f997e;
            float f3 = aVar.f996d;
            float f4 = f / (f2 + f3);
            this.f989b = Math.round(f3 * f4);
            this.f988a = Math.round(f4 * aVar.f997e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(mo15715f(this.f989b));
            sb.append(", pool size: ");
            sb.append(mo15715f(this.f988a));
            sb.append(", byte array size: ");
            sb.append(mo15715f(this.f991d));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(mo15715f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f994b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m1430e(aVar.f994b));
            sb.toString();
        }
    }

    /* renamed from: c */
    public static int m1429c(ActivityManager activityManager, float f, float f2) {
        boolean e = m1430e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static boolean m1430e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: a */
    public int mo15712a() {
        return this.f991d;
    }

    /* renamed from: b */
    public int mo15713b() {
        return this.f988a;
    }

    /* renamed from: d */
    public int mo15714d() {
        return this.f989b;
    }

    /* renamed from: f */
    public final String mo15715f(int i) {
        return Formatter.formatFileSize(this.f990c, (long) i);
    }
}

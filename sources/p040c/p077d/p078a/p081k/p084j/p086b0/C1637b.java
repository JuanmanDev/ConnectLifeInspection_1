package p040c.p077d.p078a.p081k.p084j.p086b0;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: c.d.a.k.j.b0.b */
/* compiled from: RuntimeCompat */
public final class C1637b {

    /* renamed from: c.d.a.k.j.b0.b$a */
    /* compiled from: RuntimeCompat */
    public class C1638a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f1016a;

        public C1638a(Pattern pattern) {
            this.f1016a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f1016a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static int m1454a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m1455b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m1455b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C1638a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}

package p040c.p077d.p078a.p081k.p084j.p088z;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p040c.p077d.p078a.p105q.C1950j;

@RequiresApi(19)
/* renamed from: c.d.a.k.j.z.n */
/* compiled from: SizeConfigStrategy */
public class C1711n implements C1709l {

    /* renamed from: d */
    public static final Bitmap.Config[] f1253d;

    /* renamed from: e */
    public static final Bitmap.Config[] f1254e;

    /* renamed from: f */
    public static final Bitmap.Config[] f1255f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    public static final Bitmap.Config[] f1256g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    public static final Bitmap.Config[] f1257h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C1714c f1258a = new C1714c();

    /* renamed from: b */
    public final C1700h<C1713b, Bitmap> f1259b = new C1700h<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f1260c = new HashMap();

    /* renamed from: c.d.a.k.j.z.n$a */
    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class C1712a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1261a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1261a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1261a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1261a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1261a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.p088z.C1711n.C1712a.<clinit>():void");
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.z.n$b */
    /* compiled from: SizeConfigStrategy */
    public static final class C1713b implements C1710m {

        /* renamed from: a */
        public final C1714c f1262a;

        /* renamed from: b */
        public int f1263b;

        /* renamed from: c */
        public Bitmap.Config f1264c;

        public C1713b(C1714c cVar) {
            this.f1262a = cVar;
        }

        /* renamed from: a */
        public void mo15910a() {
            this.f1262a.mo15919c(this);
        }

        /* renamed from: b */
        public void mo15967b(int i, Bitmap.Config config) {
            this.f1263b = i;
            this.f1264c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1713b)) {
                return false;
            }
            C1713b bVar = (C1713b) obj;
            if (this.f1263b != bVar.f1263b || !C1950j.m2567c(this.f1264c, bVar.f1264c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f1263b * 31;
            Bitmap.Config config = this.f1264c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1711n.m1743i(this.f1263b, this.f1264c);
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.z.n$c */
    /* compiled from: SizeConfigStrategy */
    public static class C1714c extends C1696d<C1713b> {
        /* renamed from: d */
        public C1713b mo15915a() {
            return new C1713b(this);
        }

        /* renamed from: e */
        public C1713b mo15972e(int i, Bitmap.Config config) {
            C1713b bVar = (C1713b) mo15918b();
            bVar.mo15967b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f1253d = configArr;
        f1254e = configArr;
    }

    /* renamed from: i */
    public static String m1743i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    public static Bitmap.Config[] m1744j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f1254e;
        }
        int i = C1712a.f1261a[config.ordinal()];
        if (i == 1) {
            return f1253d;
        }
        if (i == 2) {
            return f1255f;
        }
        if (i == 3) {
            return f1256g;
        }
        if (i == 4) {
            return f1257h;
        }
        return new Bitmap.Config[]{config};
    }

    @Nullable
    /* renamed from: a */
    public Bitmap mo15903a() {
        Bitmap f = this.f1259b.mo15931f();
        if (f != null) {
            mo15963g(Integer.valueOf(C1950j.m2571g(f)), f);
        }
        return f;
    }

    /* renamed from: b */
    public String mo15904b(int i, int i2, Bitmap.Config config) {
        return m1743i(C1950j.m2570f(i, i2, config), config);
    }

    /* renamed from: c */
    public void mo15905c(Bitmap bitmap) {
        C1713b e = this.f1258a.mo15972e(C1950j.m2571g(bitmap), bitmap.getConfig());
        this.f1259b.mo15930d(e, bitmap);
        NavigableMap<Integer, Integer> k = mo15965k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f1263b));
        Integer valueOf = Integer.valueOf(e.f1263b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    @Nullable
    /* renamed from: d */
    public Bitmap mo15906d(int i, int i2, Bitmap.Config config) {
        C1713b h = mo15964h(C1950j.m2570f(i, i2, config), config);
        Bitmap a = this.f1259b.mo15927a(h);
        if (a != null) {
            mo15963g(Integer.valueOf(h.f1263b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public int mo15907e(Bitmap bitmap) {
        return C1950j.m2571g(bitmap);
    }

    /* renamed from: f */
    public String mo15908f(Bitmap bitmap) {
        return m1743i(C1950j.m2571g(bitmap), bitmap.getConfig());
    }

    /* renamed from: g */
    public final void mo15963g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = mo15965k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo15908f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    public final C1713b mo15964h(int i, Bitmap.Config config) {
        C1713b e = this.f1258a.mo15972e(i, config);
        Bitmap.Config[] j = m1744j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = j[i2];
            Integer ceilingKey = mo15965k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f1258a.mo15919c(e);
                return this.f1258a.mo15972e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: k */
    public final NavigableMap<Integer, Integer> mo15965k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f1260c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1260c.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f1259b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f1260c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f1260c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

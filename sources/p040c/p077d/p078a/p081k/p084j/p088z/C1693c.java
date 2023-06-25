package p040c.p077d.p078a.p081k.p084j.p088z;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.j.z.c */
/* compiled from: AttributeStrategy */
public class C1693c implements C1709l {

    /* renamed from: a */
    public final C1695b f1221a = new C1695b();

    /* renamed from: b */
    public final C1700h<C1694a, Bitmap> f1222b = new C1700h<>();

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.z.c$a */
    /* compiled from: AttributeStrategy */
    public static class C1694a implements C1710m {

        /* renamed from: a */
        public final C1695b f1223a;

        /* renamed from: b */
        public int f1224b;

        /* renamed from: c */
        public int f1225c;

        /* renamed from: d */
        public Bitmap.Config f1226d;

        public C1694a(C1695b bVar) {
            this.f1223a = bVar;
        }

        /* renamed from: a */
        public void mo15910a() {
            this.f1223a.mo15919c(this);
        }

        /* renamed from: b */
        public void mo15911b(int i, int i2, Bitmap.Config config) {
            this.f1224b = i;
            this.f1225c = i2;
            this.f1226d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1694a)) {
                return false;
            }
            C1694a aVar = (C1694a) obj;
            if (this.f1224b == aVar.f1224b && this.f1225c == aVar.f1225c && this.f1226d == aVar.f1226d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f1224b * 31) + this.f1225c) * 31;
            Bitmap.Config config = this.f1226d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1693c.m1651g(this.f1224b, this.f1225c, this.f1226d);
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.z.c$b */
    /* compiled from: AttributeStrategy */
    public static class C1695b extends C1696d<C1694a> {
        /* renamed from: d */
        public C1694a mo15915a() {
            return new C1694a(this);
        }

        /* renamed from: e */
        public C1694a mo15917e(int i, int i2, Bitmap.Config config) {
            C1694a aVar = (C1694a) mo15918b();
            aVar.mo15911b(i, i2, config);
            return aVar;
        }
    }

    /* renamed from: g */
    public static String m1651g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    public static String m1652h(Bitmap bitmap) {
        return m1651g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public Bitmap mo15903a() {
        return this.f1222b.mo15931f();
    }

    /* renamed from: b */
    public String mo15904b(int i, int i2, Bitmap.Config config) {
        return m1651g(i, i2, config);
    }

    /* renamed from: c */
    public void mo15905c(Bitmap bitmap) {
        this.f1222b.mo15930d(this.f1221a.mo15917e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: d */
    public Bitmap mo15906d(int i, int i2, Bitmap.Config config) {
        return this.f1222b.mo15927a(this.f1221a.mo15917e(i, i2, config));
    }

    /* renamed from: e */
    public int mo15907e(Bitmap bitmap) {
        return C1950j.m2571g(bitmap);
    }

    /* renamed from: f */
    public String mo15908f(Bitmap bitmap) {
        return m1652h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f1222b;
    }
}

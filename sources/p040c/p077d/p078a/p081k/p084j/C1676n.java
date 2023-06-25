package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.n */
/* compiled from: EngineKey */
public class C1676n implements C1567c {

    /* renamed from: b */
    public final Object f1167b;

    /* renamed from: c */
    public final int f1168c;

    /* renamed from: d */
    public final int f1169d;

    /* renamed from: e */
    public final Class<?> f1170e;

    /* renamed from: f */
    public final Class<?> f1171f;

    /* renamed from: g */
    public final C1567c f1172g;

    /* renamed from: h */
    public final Map<Class<?>, C1574h<?>> f1173h;

    /* renamed from: i */
    public final C1571e f1174i;

    /* renamed from: j */
    public int f1175j;

    public C1676n(Object obj, C1567c cVar, int i, int i2, Map<Class<?>, C1574h<?>> map, Class<?> cls, Class<?> cls2, C1571e eVar) {
        C1949i.m2563d(obj);
        this.f1167b = obj;
        C1949i.m2564e(cVar, "Signature must not be null");
        this.f1172g = cVar;
        this.f1168c = i;
        this.f1169d = i2;
        C1949i.m2563d(map);
        this.f1173h = map;
        C1949i.m2564e(cls, "Resource class must not be null");
        this.f1170e = cls;
        C1949i.m2564e(cls2, "Transcode class must not be null");
        this.f1171f = cls2;
        C1949i.m2563d(eVar);
        this.f1174i = eVar;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1676n)) {
            return false;
        }
        C1676n nVar = (C1676n) obj;
        if (!this.f1167b.equals(nVar.f1167b) || !this.f1172g.equals(nVar.f1172g) || this.f1169d != nVar.f1169d || this.f1168c != nVar.f1168c || !this.f1173h.equals(nVar.f1173h) || !this.f1170e.equals(nVar.f1170e) || !this.f1171f.equals(nVar.f1171f) || !this.f1174i.equals(nVar.f1174i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f1175j == 0) {
            int hashCode = this.f1167b.hashCode();
            this.f1175j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f1172g.hashCode();
            this.f1175j = hashCode2;
            int i = (hashCode2 * 31) + this.f1168c;
            this.f1175j = i;
            int i2 = (i * 31) + this.f1169d;
            this.f1175j = i2;
            int hashCode3 = (i2 * 31) + this.f1173h.hashCode();
            this.f1175j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f1170e.hashCode();
            this.f1175j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f1171f.hashCode();
            this.f1175j = hashCode5;
            this.f1175j = (hashCode5 * 31) + this.f1174i.hashCode();
        }
        return this.f1175j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f1167b + ", width=" + this.f1168c + ", height=" + this.f1169d + ", resourceClass=" + this.f1170e + ", transcodeClass=" + this.f1171f + ", signature=" + this.f1172g + ", hashCode=" + this.f1175j + ", transformations=" + this.f1173h + ", options=" + this.f1174i + '}';
    }
}

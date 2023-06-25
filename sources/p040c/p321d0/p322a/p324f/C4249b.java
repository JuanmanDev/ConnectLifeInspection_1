package p040c.p321d0.p322a.p324f;

import java.util.List;
import p040c.p321d0.p322a.C4246d;

/* renamed from: c.d0.a.f.b */
/* compiled from: BaseReadOperation */
public abstract class C4249b implements C4255f {
    /* renamed from: b */
    public C4246d mo25712b() {
        return new C4246d(mo25717g(), mo25718h());
    }

    /* renamed from: c */
    public boolean mo25713c() {
        return Boolean.TRUE.equals(mo25719a("noResult"));
    }

    /* renamed from: d */
    public Boolean mo25714d() {
        return mo25715e("inTransaction");
    }

    /* renamed from: e */
    public final Boolean mo25715e(String str) {
        Object a = mo25719a(str);
        if (a instanceof Boolean) {
            return (Boolean) a;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo25716f() {
        return Boolean.TRUE.equals(mo25719a("continueOnError"));
    }

    /* renamed from: g */
    public final String mo25717g() {
        return (String) mo25719a("sql");
    }

    /* renamed from: h */
    public final List<Object> mo25718h() {
        return (List) mo25719a("arguments");
    }
}

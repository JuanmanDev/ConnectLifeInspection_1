package p040c.p126i.p127a.p129f;

import java.util.List;
import p040c.p126i.p127a.C2022d;

/* renamed from: c.i.a.f.b */
/* compiled from: BaseReadOperation */
public abstract class C2025b implements C2031f {
    /* renamed from: b */
    public C2022d mo16630b() {
        return new C2022d(mo16635g(), mo16636h());
    }

    /* renamed from: c */
    public boolean mo16631c() {
        return Boolean.TRUE.equals(mo16637a("noResult"));
    }

    /* renamed from: d */
    public Boolean mo16632d() {
        return mo16633e("inTransaction");
    }

    /* renamed from: e */
    public final Boolean mo16633e(String str) {
        Object a = mo16637a(str);
        if (a instanceof Boolean) {
            return (Boolean) a;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo16634f() {
        return Boolean.TRUE.equals(mo16637a("continueOnError"));
    }

    /* renamed from: g */
    public final String mo16635g() {
        return (String) mo16637a("sql");
    }

    /* renamed from: h */
    public final List<Object> mo16636h() {
        return (List) mo16637a("arguments");
    }
}

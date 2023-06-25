package p648m.p668e.p680m.p681d;

import java.lang.reflect.Modifier;
import java.util.List;
import p648m.p668e.p680m.p681d.C9780c;

/* renamed from: m.e.m.d.c */
/* compiled from: FrameworkMember */
public abstract class C9780c<T extends C9780c<T>> implements C9778a {
    /* renamed from: a */
    public abstract Class<?> mo50640a();

    /* renamed from: b */
    public abstract int mo50641b();

    /* renamed from: c */
    public abstract String mo50642c();

    /* renamed from: d */
    public abstract Class<?> mo50643d();

    /* renamed from: e */
    public boolean mo50649e() {
        return Modifier.isPublic(mo50641b());
    }

    /* renamed from: f */
    public boolean mo50650f(List<T> list) {
        for (T g : list) {
            if (mo50644g(g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo50644g(T t);

    /* renamed from: h */
    public boolean mo50651h() {
        return Modifier.isStatic(mo50641b());
    }
}

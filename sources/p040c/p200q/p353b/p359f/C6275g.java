package p040c.p200q.p353b.p359f;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;
import p040c.p200q.p353b.p355b.C6148s2;

/* renamed from: c.q.b.f.g */
/* compiled from: TypeVisitor */
public abstract class C6275g {

    /* renamed from: a */
    public final Set<Type> f11894a = C6148s2.m17250c();

    /* renamed from: a */
    public final void mo30324a(Type... typeArr) {
        for (TypeVariable typeVariable : typeArr) {
            if (typeVariable != null && this.f11894a.add(typeVariable)) {
                try {
                    if (typeVariable instanceof TypeVariable) {
                        mo30308e(typeVariable);
                    } else if (typeVariable instanceof WildcardType) {
                        mo30309f((WildcardType) typeVariable);
                    } else if (typeVariable instanceof ParameterizedType) {
                        mo30307d(typeVariable);
                    } else if (typeVariable instanceof Class) {
                        mo30305b(typeVariable);
                    } else if (typeVariable instanceof GenericArrayType) {
                        mo30306c(typeVariable);
                    } else {
                        throw new AssertionError("Unknown type: " + typeVariable);
                    }
                } catch (Throwable th) {
                    this.f11894a.remove(typeVariable);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo30305b(Class<?> cls) {
    }

    /* renamed from: c */
    public void mo30306c(GenericArrayType genericArrayType) {
    }

    /* renamed from: d */
    public void mo30307d(ParameterizedType parameterizedType) {
    }

    /* renamed from: e */
    public abstract void mo30308e(TypeVariable<?> typeVariable);

    /* renamed from: f */
    public abstract void mo30309f(WildcardType wildcardType);
}

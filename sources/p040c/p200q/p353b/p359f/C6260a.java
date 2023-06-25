package p040c.p200q.p353b.p359f;

import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.f.a */
/* compiled from: Element */
public class C6260a extends AccessibleObject implements Member {

    /* renamed from: e */
    public final AccessibleObject f11878e;

    /* renamed from: l */
    public final Member f11879l;

    public <M extends AccessibleObject & Member> C6260a(M m) {
        C5850m.m16594o(m);
        this.f11878e = m;
        this.f11879l = (Member) m;
    }

    /* renamed from: a */
    public TypeToken<?> mo30278a() {
        return TypeToken.m22535of(getDeclaringClass());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6260a)) {
            return false;
        }
        C6260a aVar = (C6260a) obj;
        if (!mo30278a().equals(aVar.mo30278a()) || !this.f11879l.equals(aVar.f11879l)) {
            return false;
        }
        return true;
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f11878e.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.f11878e.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f11878e.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f11879l.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f11879l.getModifiers();
    }

    public final String getName() {
        return this.f11879l.getName();
    }

    public int hashCode() {
        return this.f11879l.hashCode();
    }

    public final boolean isAccessible() {
        return this.f11878e.isAccessible();
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f11878e.isAnnotationPresent(cls);
    }

    public final boolean isSynthetic() {
        return this.f11879l.isSynthetic();
    }

    public final void setAccessible(boolean z) {
        this.f11878e.setAccessible(z);
    }

    public String toString() {
        return this.f11879l.toString();
    }
}

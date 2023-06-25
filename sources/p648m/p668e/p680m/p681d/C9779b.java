package p648m.p668e.p680m.p681d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* renamed from: m.e.m.d.b */
/* compiled from: FrameworkField */
public class C9779b extends C9780c<C9779b> {

    /* renamed from: a */
    public final Field f19047a;

    public C9779b(Field field) {
        if (field != null) {
            this.f19047a = field;
            return;
        }
        throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
    }

    /* renamed from: a */
    public Class<?> mo50640a() {
        return this.f19047a.getDeclaringClass();
    }

    /* renamed from: b */
    public int mo50641b() {
        return this.f19047a.getModifiers();
    }

    /* renamed from: c */
    public String mo50642c() {
        return mo50646j().getName();
    }

    /* renamed from: d */
    public Class<?> mo50643d() {
        return this.f19047a.getType();
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return this.f19047a.getAnnotation(cls);
    }

    public Annotation[] getAnnotations() {
        return this.f19047a.getAnnotations();
    }

    /* renamed from: i */
    public Object mo50645i(Object obj) {
        return this.f19047a.get(obj);
    }

    /* renamed from: j */
    public Field mo50646j() {
        return this.f19047a;
    }

    /* renamed from: k */
    public boolean mo50644g(C9779b bVar) {
        return bVar.mo50642c().equals(mo50642c());
    }

    public String toString() {
        return this.f19047a.toString();
    }
}

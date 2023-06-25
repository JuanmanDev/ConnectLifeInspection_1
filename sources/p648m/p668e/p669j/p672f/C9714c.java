package p648m.p668e.p669j.p672f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p627i.p629b.C9388f;

/* renamed from: m.e.j.f.c */
/* compiled from: SuiteMethod */
public class C9714c extends C9711b {
    public C9714c(Class<?> cls) {
        super(m26175a(cls));
    }

    /* renamed from: a */
    public static C9388f m26175a(Class<?> cls) {
        try {
            Method method = cls.getMethod("suite", new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (C9388f) method.invoke((Object) null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}

package p648m.p668e.p669j.p670d;

import p648m.p668e.p669j.p672f.C9714c;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

/* renamed from: m.e.j.d.h */
/* compiled from: SuiteMethodBuilder */
public class C9706h extends C9783e {
    public boolean hasSuiteMethod(Class<?> cls) {
        try {
            cls.getMethod("suite", new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public C9749f runnerForClass(Class<?> cls) {
        if (hasSuiteMethod(cls)) {
            return new C9714c(cls);
        }
        return null;
    }
}

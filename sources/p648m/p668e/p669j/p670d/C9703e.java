package p648m.p668e.p669j.p670d;

import p627i.p629b.C9389g;
import p648m.p668e.p669j.p672f.C9711b;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

/* renamed from: m.e.j.d.e */
/* compiled from: JUnit3Builder */
public class C9703e extends C9783e {
    public boolean isPre4Test(Class<?> cls) {
        return C9389g.class.isAssignableFrom(cls);
    }

    public C9749f runnerForClass(Class<?> cls) {
        if (isPre4Test(cls)) {
            return new C9711b(cls);
        }
        return null;
    }
}

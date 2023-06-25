package p648m.p668e.p680m.p681d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p669j.p672f.C9710a;
import p648m.p668e.p677l.C9749f;

/* renamed from: m.e.m.d.e */
/* compiled from: RunnerBuilder */
public abstract class C9783e {
    public final Set<Class<?>> parents = new HashSet();

    public Class<?> addParent(Class<?> cls) {
        if (this.parents.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", new Object[]{cls.getName()}));
    }

    public void removeParent(Class<?> cls) {
        this.parents.remove(cls);
    }

    public abstract C9749f runnerForClass(Class<?> cls);

    public List<C9749f> runners(Class<?> cls, Class<?>[] clsArr) {
        addParent(cls);
        try {
            return runners(clsArr);
        } finally {
            removeParent(cls);
        }
    }

    public C9749f safeRunnerForClass(Class<?> cls) {
        try {
            return runnerForClass(cls);
        } catch (Throwable th) {
            return new C9710a(cls, th);
        }
    }

    public List<C9749f> runners(Class<?> cls, List<Class<?>> list) {
        return runners(cls, (Class<?>[]) (Class[]) list.toArray(new Class[0]));
    }

    private List<C9749f> runners(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> safeRunnerForClass : clsArr) {
            C9749f safeRunnerForClass2 = safeRunnerForClass(safeRunnerForClass);
            if (safeRunnerForClass2 != null) {
                arrayList.add(safeRunnerForClass2);
            }
        }
        return arrayList;
    }
}

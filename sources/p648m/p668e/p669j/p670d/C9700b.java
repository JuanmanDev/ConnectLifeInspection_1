package p648m.p668e.p669j.p670d;

import java.lang.reflect.Modifier;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p677l.C9748e;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

/* renamed from: m.e.j.d.b */
/* compiled from: AnnotatedBuilder */
public class C9700b extends C9783e {
    public static final String CONSTRUCTOR_ERROR_FORMAT = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    public final C9783e suiteBuilder;

    public C9700b(C9783e eVar) {
        this.suiteBuilder = eVar;
    }

    private Class<?> getEnclosingClassForNonStaticMemberClass(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public C9749f buildRunner(Class<? extends C9749f> cls, Class<?> cls2) {
        try {
            return (C9749f) cls.getConstructor(new Class[]{Class.class}).newInstance(new Object[]{cls2});
        } catch (NoSuchMethodException unused) {
            try {
                return (C9749f) cls.getConstructor(new Class[]{Class.class, C9783e.class}).newInstance(new Object[]{cls2, this.suiteBuilder});
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format(CONSTRUCTOR_ERROR_FORMAT, new Object[]{simpleName, simpleName}));
            }
        }
    }

    public C9749f runnerForClass(Class<?> cls) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            C9748e eVar = (C9748e) cls2.getAnnotation(C9748e.class);
            if (eVar != null) {
                return buildRunner(eVar.value(), cls);
            }
            cls2 = getEnclosingClassForNonStaticMemberClass(cls2);
        }
        return null;
    }
}

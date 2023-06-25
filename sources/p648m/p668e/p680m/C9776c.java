package p648m.p668e.p680m;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p669j.p670d.C9699a;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p679h.C9759b;
import p648m.p668e.p680m.p681d.C9783e;

/* renamed from: m.e.m.c */
/* compiled from: Suite */
public class C9776c extends C9771b<C9749f> {
    public final List<C9749f> runners;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: m.e.m.c$a */
    /* compiled from: Suite */
    public @interface C9777a {
        Class<?>[] value();
    }

    public C9776c(Class<?> cls, C9783e eVar) {
        this(eVar, cls, getAnnotatedClasses(cls));
    }

    public static C9749f emptySuite() {
        try {
            return new C9776c((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (InitializationError unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    public static Class<?>[] getAnnotatedClasses(Class<?> cls) {
        C9777a aVar = (C9777a) cls.getAnnotation(C9777a.class);
        if (aVar != null) {
            return aVar.value();
        }
        throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", new Object[]{cls.getName()}));
    }

    public List<C9749f> getChildren() {
        return this.runners;
    }

    public C9776c(C9783e eVar, Class<?>[] clsArr) {
        this((Class<?>) null, eVar.runners((Class<?>) null, clsArr));
    }

    public Description describeChild(C9749f fVar) {
        return fVar.getDescription();
    }

    public void runChild(C9749f fVar, C9759b bVar) {
        fVar.run(bVar);
    }

    public C9776c(Class<?> cls, Class<?>[] clsArr) {
        this(new C9699a(true), cls, clsArr);
    }

    public C9776c(C9783e eVar, Class<?> cls, Class<?>[] clsArr) {
        this(cls, eVar.runners(cls, clsArr));
    }

    public C9776c(Class<?> cls, List<C9749f> list) {
        super(cls);
        this.runners = Collections.unmodifiableList(list);
    }
}

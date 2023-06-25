package p692o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: o.i */
/* compiled from: Invocation */
public final class C9878i {

    /* renamed from: a */
    public final Method f19143a;

    /* renamed from: b */
    public final List<?> f19144b;

    public C9878i(Method method, List<?> list) {
        this.f19143a = method;
        this.f19144b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo51271a() {
        return this.f19143a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f19143a.getDeclaringClass().getName(), this.f19143a.getName(), this.f19144b});
    }
}

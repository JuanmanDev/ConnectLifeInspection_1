package p648m.p684g.p686e;

import java.io.Serializable;
import p648m.p684g.C9805b;
import p648m.p684g.C9806c;

/* renamed from: m.g.e.b */
/* compiled from: NamedLoggerBase */
public abstract class C9811b implements C9805b, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;
    public String name;

    public String getName() {
        return this.name;
    }

    public Object readResolve() {
        return C9806c.m26346j(getName());
    }
}

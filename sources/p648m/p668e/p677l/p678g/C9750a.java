package p648m.p668e.p677l.p678g;

import java.util.Iterator;
import org.junit.runner.Description;

/* renamed from: m.e.l.g.a */
/* compiled from: Filter */
public abstract class C9750a {
    public static final C9750a ALL = new C9751a();

    /* renamed from: m.e.l.g.a$a */
    /* compiled from: Filter */
    public static class C9751a extends C9750a {
        public void apply(Object obj) {
        }

        public String describe() {
            return "all tests";
        }

        public C9750a intersect(C9750a aVar) {
            return aVar;
        }

        public boolean shouldRun(Description description) {
            return true;
        }
    }

    /* renamed from: m.e.l.g.a$b */
    /* compiled from: Filter */
    public static class C9752b extends C9750a {

        /* renamed from: a */
        public final /* synthetic */ Description f19022a;

        public C9752b(Description description) {
            this.f19022a = description;
        }

        public String describe() {
            return String.format("Method %s", new Object[]{this.f19022a.getDisplayName()});
        }

        public boolean shouldRun(Description description) {
            if (description.isTest()) {
                return this.f19022a.equals(description);
            }
            Iterator<Description> it = description.getChildren().iterator();
            while (it.hasNext()) {
                if (shouldRun(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: m.e.l.g.a$c */
    /* compiled from: Filter */
    public class C9753c extends C9750a {

        /* renamed from: a */
        public final /* synthetic */ C9750a f19023a;

        /* renamed from: b */
        public final /* synthetic */ C9750a f19024b;

        public C9753c(C9750a aVar, C9750a aVar2, C9750a aVar3) {
            this.f19023a = aVar2;
            this.f19024b = aVar3;
        }

        public String describe() {
            return this.f19023a.describe() + " and " + this.f19024b.describe();
        }

        public boolean shouldRun(Description description) {
            return this.f19023a.shouldRun(description) && this.f19024b.shouldRun(description);
        }
    }

    public static C9750a matchMethodDescription(Description description) {
        return new C9752b(description);
    }

    public void apply(Object obj) {
        if (obj instanceof C9754b) {
            ((C9754b) obj).filter(this);
        }
    }

    public abstract String describe();

    public C9750a intersect(C9750a aVar) {
        return (aVar == this || aVar == ALL) ? this : new C9753c(this, this, aVar);
    }

    public abstract boolean shouldRun(Description description);
}

package p648m.p668e.p669j.p672f.p674e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import p648m.p668e.C9690f;
import p648m.p668e.C9693i;
import p648m.p668e.p676k.C9739a;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9780c;
import p648m.p668e.p680m.p681d.C9786h;

/* renamed from: m.e.j.f.e.a */
/* compiled from: RuleMemberValidator */
public class C9717a {

    /* renamed from: d */
    public static final C9717a f18986d;

    /* renamed from: e */
    public static final C9717a f18987e;

    /* renamed from: f */
    public static final C9717a f18988f;

    /* renamed from: g */
    public static final C9717a f18989g;

    /* renamed from: a */
    public final Class<? extends Annotation> f18990a;

    /* renamed from: b */
    public final boolean f18991b;

    /* renamed from: c */
    public final List<C9728k> f18992c;

    /* renamed from: m.e.j.f.e.a$b */
    /* compiled from: RuleMemberValidator */
    public static class C9719b {

        /* renamed from: a */
        public final Class<? extends Annotation> f18993a;

        /* renamed from: b */
        public boolean f18994b;

        /* renamed from: c */
        public final List<C9728k> f18995c;

        /* renamed from: d */
        public C9717a mo50546d() {
            return new C9717a(this);
        }

        /* renamed from: e */
        public C9719b mo50547e() {
            this.f18994b = true;
            return this;
        }

        /* renamed from: f */
        public C9719b mo50548f(C9728k kVar) {
            this.f18995c.add(kVar);
            return this;
        }

        public C9719b(Class<? extends Annotation> cls) {
            this.f18993a = cls;
            this.f18994b = false;
            this.f18995c = new ArrayList();
        }
    }

    /* renamed from: m.e.j.f.e.a$c */
    /* compiled from: RuleMemberValidator */
    public static final class C9720c implements C9728k {
        public C9720c() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!mo50550b(cVar)) {
                list.add(new C9729b(cVar, cls, "must be declared in a public class."));
            }
        }

        /* renamed from: b */
        public final boolean mo50550b(C9780c<?> cVar) {
            return Modifier.isPublic(cVar.mo50640a().getModifiers());
        }
    }

    /* renamed from: m.e.j.f.e.a$d */
    /* compiled from: RuleMemberValidator */
    public static final class C9721d implements C9728k {
        public C9721d() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C9717a.m26188f(cVar)) {
                list.add(new C9729b(cVar, cls, "must implement MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$e */
    /* compiled from: RuleMemberValidator */
    public static final class C9722e implements C9728k {
        public C9722e() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C9717a.m26189g(cVar)) {
                list.add(new C9729b(cVar, cls, "must implement TestRule."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$f */
    /* compiled from: RuleMemberValidator */
    public static final class C9723f implements C9728k {
        public C9723f() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean a = C9717a.m26187e(cVar);
            boolean z = cVar.getAnnotation(C9690f.class) != null;
            if (!cVar.mo50651h()) {
                return;
            }
            if (a || !z) {
                list.add(new C9729b(cVar, cls, C9717a.m26187e(cVar) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$g */
    /* compiled from: RuleMemberValidator */
    public static final class C9724g implements C9728k {
        public C9724g() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!cVar.mo50649e()) {
                list.add(new C9729b(cVar, cls, "must be public."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$h */
    /* compiled from: RuleMemberValidator */
    public static final class C9725h implements C9728k {
        public C9725h() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!cVar.mo50651h()) {
                list.add(new C9729b(cVar, cls, "must be static."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$i */
    /* compiled from: RuleMemberValidator */
    public static final class C9726i implements C9728k {
        public C9726i() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C9717a.m26188f(cVar)) {
                list.add(new C9729b(cVar, cls, "must return an implementation of MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$j */
    /* compiled from: RuleMemberValidator */
    public static final class C9727j implements C9728k {
        public C9727j() {
        }

        /* renamed from: a */
        public void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C9717a.m26189g(cVar)) {
                list.add(new C9729b(cVar, cls, "must return an implementation of TestRule."));
            }
        }
    }

    /* renamed from: m.e.j.f.e.a$k */
    /* compiled from: RuleMemberValidator */
    public interface C9728k {
        /* renamed from: a */
        void mo50549a(C9780c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        C9719b d = m26186d();
        d.mo50548f(new C9720c());
        d.mo50548f(new C9725h());
        d.mo50548f(new C9724g());
        d.mo50548f(new C9722e());
        f18986d = d.mo50546d();
        C9719b h = m26190h();
        h.mo50548f(new C9723f());
        h.mo50548f(new C9724g());
        h.mo50548f(new C9721d());
        f18987e = h.mo50546d();
        C9719b d2 = m26186d();
        d2.mo50547e();
        d2.mo50548f(new C9720c());
        d2.mo50548f(new C9725h());
        d2.mo50548f(new C9724g());
        d2.mo50548f(new C9727j());
        f18988f = d2.mo50546d();
        C9719b h2 = m26190h();
        h2.mo50547e();
        h2.mo50548f(new C9723f());
        h2.mo50548f(new C9724g());
        h2.mo50548f(new C9726i());
        f18989g = h2.mo50546d();
    }

    public C9717a(C9719b bVar) {
        this.f18990a = bVar.f18993a;
        this.f18991b = bVar.f18994b;
        this.f18992c = bVar.f18995c;
    }

    /* renamed from: d */
    public static C9719b m26186d() {
        return new C9719b(C9690f.class);
    }

    /* renamed from: e */
    public static boolean m26187e(C9780c<?> cVar) {
        return C9739a.class.isAssignableFrom(cVar.mo50643d());
    }

    /* renamed from: f */
    public static boolean m26188f(C9780c<?> cVar) {
        return m26187e(cVar) || m26189g(cVar);
    }

    /* renamed from: g */
    public static boolean m26189g(C9780c<?> cVar) {
        return C9741c.class.isAssignableFrom(cVar.mo50643d());
    }

    /* renamed from: h */
    public static C9719b m26190h() {
        return new C9719b(C9693i.class);
    }

    /* renamed from: i */
    public void mo50544i(C9786h hVar, List<Throwable> list) {
        for (C9780c j : this.f18991b ? hVar.mo50675i(this.f18990a) : hVar.mo50670e(this.f18990a)) {
            mo50545j(j, list);
        }
    }

    /* renamed from: j */
    public final void mo50545j(C9780c<?> cVar, List<Throwable> list) {
        for (C9728k a : this.f18992c) {
            a.mo50549a(cVar, this.f18990a, list);
        }
    }
}

package p648m.p668e.p682n;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p648m.p668e.p680m.p681d.C9778a;
import p648m.p668e.p680m.p681d.C9779b;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9786h;

/* renamed from: m.e.n.c */
/* compiled from: AnnotationsValidator */
public final class C9792c implements C9799e {

    /* renamed from: a */
    public static final List<C9794b<?>> f19059a = Arrays.asList(new C9794b[]{new C9795c(), new C9797e(), new C9796d()});

    /* renamed from: m.e.n.c$b */
    /* compiled from: AnnotationsValidator */
    public static abstract class C9794b<T extends C9778a> {

        /* renamed from: a */
        public static final C9791b f19060a = new C9791b();

        public C9794b() {
        }

        /* renamed from: a */
        public abstract Iterable<T> mo50691a(C9786h hVar);

        /* renamed from: b */
        public final List<Exception> mo50692b(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotationType : t.getAnnotations()) {
                C9800f fVar = (C9800f) annotationType.annotationType().getAnnotation(C9800f.class);
                if (fVar != null) {
                    arrayList.addAll(mo50693c(f19060a.mo50689a(fVar), t));
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public abstract List<Exception> mo50693c(C9790a aVar, T t);

        /* renamed from: d */
        public List<Exception> mo50694d(C9786h hVar) {
            ArrayList arrayList = new ArrayList();
            for (C9778a b : mo50691a(hVar)) {
                arrayList.addAll(mo50692b(b));
            }
            return arrayList;
        }
    }

    /* renamed from: m.e.n.c$c */
    /* compiled from: AnnotationsValidator */
    public static class C9795c extends C9794b<C9786h> {
        public C9795c() {
            super();
        }

        /* renamed from: a */
        public Iterable<C9786h> mo50691a(C9786h hVar) {
            return Collections.singletonList(hVar);
        }

        /* renamed from: e */
        public List<Exception> mo50693c(C9790a aVar, C9786h hVar) {
            return aVar.mo50686a(hVar);
        }
    }

    /* renamed from: m.e.n.c$d */
    /* compiled from: AnnotationsValidator */
    public static class C9796d extends C9794b<C9779b> {
        public C9796d() {
            super();
        }

        /* renamed from: a */
        public Iterable<C9779b> mo50691a(C9786h hVar) {
            return hVar.mo50669d();
        }

        /* renamed from: e */
        public List<Exception> mo50693c(C9790a aVar, C9779b bVar) {
            return aVar.mo50687b(bVar);
        }
    }

    /* renamed from: m.e.n.c$e */
    /* compiled from: AnnotationsValidator */
    public static class C9797e extends C9794b<C9781d> {
        public C9797e() {
            super();
        }

        /* renamed from: a */
        public Iterable<C9781d> mo50691a(C9786h hVar) {
            return hVar.mo50673h();
        }

        /* renamed from: e */
        public List<Exception> mo50693c(C9790a aVar, C9781d dVar) {
            return aVar.mo50688c(dVar);
        }
    }

    /* renamed from: a */
    public List<Exception> mo50690a(C9786h hVar) {
        ArrayList arrayList = new ArrayList();
        for (C9794b<?> d : f19059a) {
            arrayList.addAll(d.mo50694d(hVar));
        }
        return arrayList;
    }
}

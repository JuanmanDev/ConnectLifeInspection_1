package p648m.p657c.p658j;

import java.util.ArrayList;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.b */
/* compiled from: AnyOf */
public class C9629b<T> extends C9635h<T> {
    public C9629b(Iterable<C9623e<? super T>> iterable) {
        super(iterable);
    }

    /* renamed from: c */
    public static <T> C9629b<T> m25856c(Iterable<C9623e<? super T>> iterable) {
        return new C9629b<>(iterable);
    }

    /* renamed from: d */
    public static <T> C9629b<T> m25857d(C9623e<T> eVar, C9623e<? super T> eVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        arrayList.add(eVar2);
        return m25856c(arrayList);
    }

    /* renamed from: e */
    public static <T> C9629b<T> m25858e(C9623e<T> eVar, C9623e<? super T> eVar2, C9623e<? super T> eVar3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        arrayList.add(eVar2);
        arrayList.add(eVar3);
        return m25856c(arrayList);
    }

    public void describeTo(C9620c cVar) {
        mo50316a(cVar, "or");
    }

    public boolean matches(Object obj) {
        return mo50317b(obj, true);
    }
}

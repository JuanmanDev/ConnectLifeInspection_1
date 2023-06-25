package p648m.p657c.p658j;

import java.util.ArrayList;
import java.util.Arrays;
import p648m.p657c.C9620c;
import p648m.p657c.C9622d;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.a */
/* compiled from: AllOf */
public class C9628a<T> extends C9622d<T> {

    /* renamed from: e */
    public final Iterable<C9623e<? super T>> f18859e;

    public C9628a(Iterable<C9623e<? super T>> iterable) {
        this.f18859e = iterable;
    }

    /* renamed from: b */
    public static <T> C9623e<T> m25851b(Iterable<C9623e<? super T>> iterable) {
        return new C9628a(iterable);
    }

    /* renamed from: c */
    public static <T> C9623e<T> m25852c(C9623e<? super T> eVar, C9623e<? super T> eVar2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(eVar);
        arrayList.add(eVar2);
        return m25851b(arrayList);
    }

    /* renamed from: d */
    public static <T> C9623e<T> m25853d(C9623e<? super T> eVar, C9623e<? super T> eVar2, C9623e<? super T> eVar3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(eVar);
        arrayList.add(eVar2);
        arrayList.add(eVar3);
        return m25851b(arrayList);
    }

    /* renamed from: e */
    public static <T> C9623e<T> m25854e(C9623e<? super T>... eVarArr) {
        return m25851b(Arrays.asList(eVarArr));
    }

    /* renamed from: a */
    public boolean mo50313a(Object obj, C9620c cVar) {
        for (C9623e next : this.f18859e) {
            if (!next.matches(obj)) {
                cVar.mo50299b(next).mo50300c(" ");
                next.describeMismatch(obj, cVar);
                return false;
            }
        }
        return true;
    }

    public void describeTo(C9620c cVar) {
        cVar.mo50298a("(", " and ", ")", this.f18859e);
    }
}

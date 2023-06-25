package p648m.p657c.p658j;

import p648m.p657c.C9619b;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.h */
/* compiled from: ShortcutCombination */
public abstract class C9635h<T> extends C9619b<T> {

    /* renamed from: e */
    public final Iterable<C9623e<? super T>> f18865e;

    public C9635h(Iterable<C9623e<? super T>> iterable) {
        this.f18865e = iterable;
    }

    /* renamed from: a */
    public void mo50316a(C9620c cVar, String str) {
        cVar.mo50298a("(", " " + str + " ", ")", this.f18865e);
    }

    /* renamed from: b */
    public boolean mo50317b(Object obj, boolean z) {
        for (C9623e<? super T> matches : this.f18865e) {
            if (matches.matches(obj) == z) {
                return z;
            }
        }
        return !z;
    }
}

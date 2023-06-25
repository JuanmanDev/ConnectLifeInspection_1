package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.b.k0.d0.k.a */
/* compiled from: AdaptationSet */
public class C2917a {

    /* renamed from: a */
    public final int f4763a;

    /* renamed from: b */
    public final int f4764b;

    /* renamed from: c */
    public final List<C2926i> f4765c;

    /* renamed from: d */
    public final List<C2921d> f4766d;

    /* renamed from: e */
    public final List<C2921d> f4767e;

    public C2917a(int i, int i2, List<C2926i> list, List<C2921d> list2, List<C2921d> list3) {
        List<C2921d> list4;
        List<C2921d> list5;
        this.f4763a = i;
        this.f4764b = i2;
        this.f4765c = Collections.unmodifiableList(list);
        if (list2 == null) {
            list4 = Collections.emptyList();
        } else {
            list4 = Collections.unmodifiableList(list2);
        }
        this.f4766d = list4;
        if (list3 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list3);
        }
        this.f4767e = list5;
    }
}

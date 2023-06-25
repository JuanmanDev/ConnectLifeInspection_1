package p040c.p200q.p201a.p202a.p205i;

import java.util.Set;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.C2352d;
import p040c.p200q.p201a.p202a.C2353e;
import p040c.p200q.p201a.p202a.C2354f;

/* renamed from: c.q.a.a.i.r */
/* compiled from: TransportFactoryImpl */
public final class C2540r implements C2354f {

    /* renamed from: a */
    public final Set<C2350b> f2974a;

    /* renamed from: b */
    public final C2538q f2975b;

    /* renamed from: c */
    public final C2542t f2976c;

    public C2540r(Set<C2350b> set, C2538q qVar, C2542t tVar) {
        this.f2974a = set;
        this.f2975b = qVar;
        this.f2976c = tVar;
    }

    /* renamed from: a */
    public <T> C2353e<T> mo17662a(String str, Class<T> cls, C2350b bVar, C2352d<T, byte[]> dVar) {
        if (this.f2974a.contains(bVar)) {
            return new C2541s(this.f2975b, str, bVar, dVar, this.f2976c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f2974a}));
    }
}

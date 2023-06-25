package p040c.p200q.p406e.p418o.p419r.p420g;

import java.util.List;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.a */
/* compiled from: BitArrayBuilder */
public final class C7090a {
    /* renamed from: a */
    public static C7032a m21093a(List<C7091b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo32690d() == null) {
            size--;
        }
        C7032a aVar = new C7032a(size * 12);
        int i = 0;
        int b = list.get(0).mo32690d().mo32671b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo32527l(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C7091b bVar = list.get(i3);
            int b2 = bVar.mo32689c().mo32671b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo32527l(i);
                }
                i++;
            }
            if (bVar.mo32690d() != null) {
                int b3 = bVar.mo32690d().mo32671b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo32527l(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}

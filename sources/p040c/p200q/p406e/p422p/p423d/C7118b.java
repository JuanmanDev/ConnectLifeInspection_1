package p040c.p200q.p406e.p422p.p423d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p406e.p422p.C7114a;

/* renamed from: c.q.e.p.d.b */
/* compiled from: BarcodeValue */
public final class C7118b {

    /* renamed from: a */
    public final Map<Integer, Integer> f13680a = new HashMap();

    /* renamed from: a */
    public int[] mo32765a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f13680a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return C7114a.m21186b(arrayList);
    }

    /* renamed from: b */
    public void mo32766b(int i) {
        Integer num = this.f13680a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f13680a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}

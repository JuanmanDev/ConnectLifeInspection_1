package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p264c.p294g.p335i.C4980a5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5027d4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5043e4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5059f4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5075g4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5083gc;
import p040c.p200q.p201a.p264c.p294g.p335i.C5335x4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5350y4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5365z4;

/* renamed from: c.q.a.c.i.b.oa */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5594oa {

    /* renamed from: a */
    public String f10724a;

    /* renamed from: b */
    public boolean f10725b;

    /* renamed from: c */
    public C5350y4 f10726c;

    /* renamed from: d */
    public BitSet f10727d;

    /* renamed from: e */
    public BitSet f10728e;

    /* renamed from: f */
    public Map f10729f;

    /* renamed from: g */
    public Map f10730g;

    /* renamed from: h */
    public final /* synthetic */ C5427b f10731h;

    public /* synthetic */ C5594oa(C5427b bVar, String str, C5582na naVar) {
        this.f10731h = bVar;
        this.f10724a = str;
        this.f10725b = true;
        this.f10727d = new BitSet();
        this.f10728e = new BitSet();
        this.f10729f = new ArrayMap();
        this.f10730g = new ArrayMap();
    }

    @NonNull
    /* renamed from: a */
    public final C5043e4 mo28509a(int i) {
        ArrayList arrayList;
        List list;
        C5027d4 E = C5043e4.m13999E();
        E.mo27141r(i);
        E.mo27143t(this.f10725b);
        C5350y4 y4Var = this.f10726c;
        if (y4Var != null) {
            E.mo27144v(y4Var);
        }
        C5335x4 I = C5350y4.m15336I();
        I.mo27886s(C5426aa.m15491H(this.f10727d));
        I.mo27888v(C5426aa.m15491H(this.f10728e));
        Map map = this.f10729f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f10729f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f10729f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C5059f4 F = C5075g4.m14124F();
                    F.mo27226s(intValue2);
                    F.mo27225r(l.longValue());
                    arrayList2.add((C5075g4) F.mo27520l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            I.mo27885r(arrayList);
        }
        Map map2 = this.f10730g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f10730g.keySet()) {
                C5365z4 G = C4980a5.m13769G();
                G.mo27970s(num.intValue());
                List list2 = (List) this.f10730g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    G.mo27969r(list2);
                }
                arrayList3.add((C4980a5) G.mo27520l());
            }
            list = arrayList3;
        }
        I.mo27887t(list);
        E.mo27142s(I);
        return (C5043e4) E.mo27520l();
    }

    /* renamed from: c */
    public final void mo28510c(@NonNull C5642sa saVar) {
        int a = saVar.mo28594a();
        Boolean bool = saVar.f10870c;
        if (bool != null) {
            this.f10728e.set(a, bool.booleanValue());
        }
        Boolean bool2 = saVar.f10871d;
        if (bool2 != null) {
            this.f10727d.set(a, bool2.booleanValue());
        }
        if (saVar.f10872e != null) {
            Map map = this.f10729f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = saVar.f10872e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f10729f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (saVar.f10873f != null) {
            Map map2 = this.f10730g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f10730g.put(valueOf2, list);
            }
            if (saVar.mo28596c()) {
                list.clear();
            }
            C5083gc.m14171b();
            if (this.f10731h.f10699a.mo28649z().mo28235B(this.f10724a, C5658u2.f10960X) && saVar.mo28595b()) {
                list.clear();
            }
            C5083gc.m14171b();
            if (this.f10731h.f10699a.mo28649z().mo28235B(this.f10724a, C5658u2.f10960X)) {
                Long valueOf3 = Long.valueOf(saVar.f10873f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(saVar.f10873f.longValue() / 1000));
        }
    }

    public /* synthetic */ C5594oa(C5427b bVar, String str, C5350y4 y4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C5582na naVar) {
        this.f10731h = bVar;
        this.f10724a = str;
        this.f10727d = bitSet;
        this.f10728e = bitSet2;
        this.f10729f = map;
        this.f10730g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f10730g.put(num, arrayList);
        }
        this.f10725b = false;
        this.f10726c = y4Var;
    }
}

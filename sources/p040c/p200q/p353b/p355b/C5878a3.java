package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import java.util.LinkedHashMap;
import java.util.Map;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.a3 */
/* compiled from: SparseImmutableTable */
public final class C5878a3<R, C, V> extends C6054n2<R, C, V> {

    /* renamed from: o */
    public static final ImmutableTable<Object, Object, Object> f11400o = new C5878a3(ImmutableList.m22152of(), ImmutableSet.m22254of(), ImmutableSet.m22254of());

    /* renamed from: e */
    public final ImmutableMap<R, ImmutableMap<C, V>> f11401e;

    /* renamed from: l */
    public final ImmutableMap<C, ImmutableMap<R, V>> f11402l;

    /* renamed from: m */
    public final int[] f11403m;

    /* renamed from: n */
    public final int[] f11404n;

    public C5878a3(ImmutableList<C5927d3.C5928a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap<R, Integer> j = C6108q1.m17174j(immutableSet);
        LinkedHashMap q = C6108q1.m17181q();
        C5991h3<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            q.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap q2 = C6108q1.m17181q();
        C5991h3<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            q2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            C5927d3.C5928a aVar = immutableList.get(i);
            Object b = aVar.mo29198b();
            Object a = aVar.mo29197a();
            Object value = aVar.getValue();
            iArr[i] = j.get(b).intValue();
            Map map = (Map) q.get(b);
            iArr2[i] = map.size();
            mo29669a(b, a, map.put(a, value), value);
            ((Map) q2.get(a)).put(b, value);
        }
        this.f11403m = iArr;
        this.f11404n = iArr2;
        ImmutableMap.C8107b bVar = new ImmutableMap.C8107b(q.size());
        for (Map.Entry entry : q.entrySet()) {
            bVar.mo36595c(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f11401e = bVar.mo36594a();
        ImmutableMap.C8107b bVar2 = new ImmutableMap.C8107b(q2.size());
        for (Map.Entry entry2 : q2.entrySet()) {
            bVar2.mo36595c(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.f11402l = bVar2.mo36594a();
    }

    public ImmutableTable.C8153b createSerializedForm() {
        ImmutableMap j = C6108q1.m17174j(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        C5991h3 it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) j.get(((C5927d3.C5928a) it.next()).mo29197a())).intValue();
            i++;
        }
        return ImmutableTable.C8153b.m22344a(this, this.f11403m, iArr);
    }

    public C5927d3.C5928a<R, C, V> getCell(int i) {
        Map.Entry entry = this.f11401e.entrySet().asList().get(this.f11403m[i]);
        Map.Entry entry2 = (Map.Entry) ((ImmutableMap) entry.getValue()).entrySet().asList().get(this.f11404n[i]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    public V getValue(int i) {
        int i2 = this.f11403m[i];
        return this.f11401e.values().asList().get(i2).values().asList().get(this.f11404n[i]);
    }

    public int size() {
        return this.f11403m.length;
    }

    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf(this.f11402l);
    }

    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf(this.f11401e);
    }
}

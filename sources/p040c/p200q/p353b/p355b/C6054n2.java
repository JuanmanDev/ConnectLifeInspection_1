package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.n2 */
/* compiled from: RegularImmutableTable */
public abstract class C6054n2<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: c.q.b.b.n2$a */
    /* compiled from: RegularImmutableTable */
    public static class C6055a implements Comparator<C5927d3.C5928a<R, C, V>> {

        /* renamed from: e */
        public final /* synthetic */ Comparator f11638e;

        /* renamed from: l */
        public final /* synthetic */ Comparator f11639l;

        public C6055a(Comparator comparator, Comparator comparator2) {
            this.f11638e = comparator;
            this.f11639l = comparator2;
        }

        /* renamed from: a */
        public int compare(C5927d3.C5928a<R, C, V> aVar, C5927d3.C5928a<R, C, V> aVar2) {
            int i;
            Comparator comparator = this.f11638e;
            if (comparator == null) {
                i = 0;
            } else {
                i = comparator.compare(aVar.mo29198b(), aVar2.mo29198b());
            }
            if (i != 0) {
                return i;
            }
            Comparator comparator2 = this.f11639l;
            if (comparator2 == null) {
                return 0;
            }
            return comparator2.compare(aVar.mo29197a(), aVar2.mo29197a());
        }
    }

    /* renamed from: c.q.b.b.n2$b */
    /* compiled from: RegularImmutableTable */
    public final class C6056b extends C6012j1<C5927d3.C5928a<R, C, V>> {
        public C6056b() {
        }

        /* renamed from: c */
        public C5927d3.C5928a<R, C, V> get(int i) {
            return C6054n2.this.getCell(i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C5927d3.C5928a)) {
                return false;
            }
            C5927d3.C5928a aVar = (C5927d3.C5928a) obj;
            Object obj2 = C6054n2.this.get(aVar.mo29198b(), aVar.mo29197a());
            if (obj2 == null || !obj2.equals(aVar.getValue())) {
                return false;
            }
            return true;
        }

        public boolean isPartialView() {
            return false;
        }

        public int size() {
            return C6054n2.this.size();
        }

        public /* synthetic */ C6056b(C6054n2 n2Var, C6055a aVar) {
            this();
        }
    }

    /* renamed from: c.q.b.b.n2$c */
    /* compiled from: RegularImmutableTable */
    public final class C6057c extends ImmutableList<V> {
        public C6057c() {
        }

        public V get(int i) {
            return C6054n2.this.getValue(i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return C6054n2.this.size();
        }

        public /* synthetic */ C6057c(C6054n2 n2Var, C6055a aVar) {
            this();
        }
    }

    /* renamed from: b */
    public static <R, C, V> C6054n2<R, C, V> m16987b(List<C5927d3.C5928a<R, C, V>> list, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        C5850m.m16594o(list);
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new C6055a(comparator, comparator2));
        }
        return m16988c(list, comparator, comparator2);
    }

    /* renamed from: c */
    public static <R, C, V> C6054n2<R, C, V> m16988c(Iterable<C5927d3.C5928a<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        ImmutableSet<E> immutableSet;
        ImmutableSet<E> immutableSet2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList<E> copyOf = ImmutableList.copyOf(iterable);
        for (C5927d3.C5928a next : iterable) {
            linkedHashSet.add(next.mo29198b());
            linkedHashSet2.add(next.mo29197a());
        }
        if (comparator == null) {
            immutableSet = ImmutableSet.copyOf(linkedHashSet);
        } else {
            immutableSet = ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator, linkedHashSet));
        }
        if (comparator2 == null) {
            immutableSet2 = ImmutableSet.copyOf(linkedHashSet2);
        } else {
            immutableSet2 = ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator2, linkedHashSet2));
        }
        return m16989d(copyOf, immutableSet, immutableSet2);
    }

    /* renamed from: d */
    public static <R, C, V> C6054n2<R, C, V> m16989d(ImmutableList<C5927d3.C5928a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new C5950e0(immutableList, immutableSet, immutableSet2) : new C5878a3(immutableList, immutableSet, immutableSet2);
    }

    /* renamed from: a */
    public final void mo29669a(R r, C c, V v, V v2) {
        C5850m.m16591l(v == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v);
    }

    public abstract C5927d3.C5928a<R, C, V> getCell(int i);

    public abstract V getValue(int i);

    public final ImmutableSet<C5927d3.C5928a<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.m22254of() : new C6056b(this, (C6055a) null);
    }

    public final ImmutableCollection<V> createValues() {
        return isEmpty() ? ImmutableList.m22152of() : new C6057c(this, (C6055a) null);
    }
}

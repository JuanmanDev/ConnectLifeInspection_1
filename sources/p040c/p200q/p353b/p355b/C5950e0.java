package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import java.lang.reflect.Array;
import java.util.Map;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.e0 */
/* compiled from: DenseImmutableTable */
public final class C5950e0<R, C, V> extends C6054n2<R, C, V> {

    /* renamed from: e */
    public final ImmutableMap<R, Integer> f11495e;

    /* renamed from: l */
    public final ImmutableMap<C, Integer> f11496l;

    /* renamed from: m */
    public final ImmutableMap<R, ImmutableMap<C, V>> f11497m;

    /* renamed from: n */
    public final ImmutableMap<C, ImmutableMap<R, V>> f11498n;

    /* renamed from: o */
    public final int[] f11499o = new int[this.f11495e.size()];

    /* renamed from: p */
    public final int[] f11500p = new int[this.f11496l.size()];

    /* renamed from: q */
    public final V[][] f11501q;

    /* renamed from: r */
    public final int[] f11502r;

    /* renamed from: s */
    public final int[] f11503s;

    /* renamed from: c.q.b.b.e0$b */
    /* compiled from: DenseImmutableTable */
    public final class C5952b extends C5954d<R, V> {

        /* renamed from: l */
        public final int f11504l;

        public C5952b(int i) {
            super(C5950e0.this.f11500p[i]);
            this.f11504l = i;
        }

        /* renamed from: c */
        public V mo29368c(int i) {
            return C5950e0.this.f11501q[i][this.f11504l];
        }

        /* renamed from: e */
        public ImmutableMap<R, Integer> mo29369e() {
            return C5950e0.this.f11495e;
        }

        public boolean isPartialView() {
            return true;
        }
    }

    /* renamed from: c.q.b.b.e0$c */
    /* compiled from: DenseImmutableTable */
    public final class C5953c extends C5954d<C, ImmutableMap<R, V>> {
        /* renamed from: e */
        public ImmutableMap<C, Integer> mo29369e() {
            return C5950e0.this.f11496l;
        }

        /* renamed from: f */
        public ImmutableMap<R, V> mo29368c(int i) {
            return new C5952b(i);
        }

        public boolean isPartialView() {
            return false;
        }

        public C5953c() {
            super(C5950e0.this.f11500p.length);
        }
    }

    /* renamed from: c.q.b.b.e0$d */
    /* compiled from: DenseImmutableTable */
    public static abstract class C5954d<K, V> extends ImmutableMap.C8108c<K, V> {

        /* renamed from: e */
        public final int f11507e;

        /* renamed from: c.q.b.b.e0$d$a */
        /* compiled from: DenseImmutableTable */
        public class C5955a extends C5886c<Map.Entry<K, V>> {

            /* renamed from: m */
            public int f11508m = -1;

            /* renamed from: n */
            public final int f11509n = C5954d.this.mo29369e().size();

            public C5955a() {
            }

            /* renamed from: d */
            public Map.Entry<K, V> mo29067a() {
                int i = this.f11508m;
                while (true) {
                    this.f11508m = i + 1;
                    int i2 = this.f11508m;
                    if (i2 >= this.f11509n) {
                        return (Map.Entry) mo29068b();
                    }
                    Object c = C5954d.this.mo29368c(i2);
                    if (c != null) {
                        return C6108q1.m17173i(C5954d.this.mo29373b(this.f11508m), c);
                    }
                    i = this.f11508m;
                }
            }
        }

        public C5954d(int i) {
            this.f11507e = i;
        }

        /* renamed from: a */
        public C5991h3<Map.Entry<K, V>> mo29372a() {
            return new C5955a();
        }

        /* renamed from: b */
        public K mo29373b(int i) {
            return mo29369e().keySet().asList().get(i);
        }

        /* renamed from: c */
        public abstract V mo29368c(int i);

        public ImmutableSet<K> createKeySet() {
            return mo29375d() ? mo29369e().keySet() : super.createKeySet();
        }

        /* renamed from: d */
        public final boolean mo29375d() {
            return this.f11507e == mo29369e().size();
        }

        /* renamed from: e */
        public abstract ImmutableMap<K, Integer> mo29369e();

        public V get(Object obj) {
            Integer num = (Integer) mo29369e().get(obj);
            if (num == null) {
                return null;
            }
            return mo29368c(num.intValue());
        }

        public int size() {
            return this.f11507e;
        }
    }

    /* renamed from: c.q.b.b.e0$e */
    /* compiled from: DenseImmutableTable */
    public final class C5956e extends C5954d<C, V> {

        /* renamed from: l */
        public final int f11511l;

        public C5956e(int i) {
            super(C5950e0.this.f11499o[i]);
            this.f11511l = i;
        }

        /* renamed from: c */
        public V mo29368c(int i) {
            return C5950e0.this.f11501q[this.f11511l][i];
        }

        /* renamed from: e */
        public ImmutableMap<C, Integer> mo29369e() {
            return C5950e0.this.f11496l;
        }

        public boolean isPartialView() {
            return true;
        }
    }

    /* renamed from: c.q.b.b.e0$f */
    /* compiled from: DenseImmutableTable */
    public final class C5957f extends C5954d<R, ImmutableMap<C, V>> {
        /* renamed from: e */
        public ImmutableMap<R, Integer> mo29369e() {
            return C5950e0.this.f11495e;
        }

        /* renamed from: f */
        public ImmutableMap<C, V> mo29368c(int i) {
            return new C5956e(i);
        }

        public boolean isPartialView() {
            return false;
        }

        public C5957f() {
            super(C5950e0.this.f11499o.length);
        }
    }

    public C5950e0(ImmutableList<C5927d3.C5928a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        int size = immutableSet.size();
        int[] iArr = new int[2];
        iArr[1] = immutableSet2.size();
        iArr[0] = size;
        this.f11501q = (Object[][]) Array.newInstance(Object.class, iArr);
        this.f11495e = C6108q1.m17174j(immutableSet);
        this.f11496l = C6108q1.m17174j(immutableSet2);
        int[] iArr2 = new int[immutableList.size()];
        int[] iArr3 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            C5927d3.C5928a aVar = immutableList.get(i);
            Object b = aVar.mo29198b();
            Object a = aVar.mo29197a();
            int intValue = this.f11495e.get(b).intValue();
            int intValue2 = this.f11496l.get(a).intValue();
            mo29669a(b, a, this.f11501q[intValue][intValue2], aVar.getValue());
            this.f11501q[intValue][intValue2] = aVar.getValue();
            int[] iArr4 = this.f11499o;
            iArr4[intValue] = iArr4[intValue] + 1;
            int[] iArr5 = this.f11500p;
            iArr5[intValue2] = iArr5[intValue2] + 1;
            iArr2[i] = intValue;
            iArr3[i] = intValue2;
        }
        this.f11502r = iArr2;
        this.f11503s = iArr3;
        this.f11497m = new C5957f();
        this.f11498n = new C5953c();
    }

    public ImmutableTable.C8153b createSerializedForm() {
        return ImmutableTable.C8153b.m22344a(this, this.f11502r, this.f11503s);
    }

    public V get(Object obj, Object obj2) {
        Integer num = this.f11495e.get(obj);
        Integer num2 = this.f11496l.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f11501q[num.intValue()][num2.intValue()];
    }

    public C5927d3.C5928a<R, C, V> getCell(int i) {
        int i2 = this.f11502r[i];
        int i3 = this.f11503s[i];
        return ImmutableTable.cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), this.f11501q[i2][i3]);
    }

    public V getValue(int i) {
        return this.f11501q[this.f11502r[i]][this.f11503s[i]];
    }

    public int size() {
        return this.f11502r.length;
    }

    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf(this.f11498n);
    }

    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf(this.f11497m);
    }
}

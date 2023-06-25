package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6058o;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6183x0;
import p040c.p200q.p353b.p355b.C6202y2;
import p040c.p200q.p353b.p355b.C6205z1;
import p040c.p200q.p353b.p358e.C6250c;

public final class TreeMultiset<E> extends C6058o<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient C8188f<E> header;
    public final transient C6183x0<E> range;
    public final transient C8189g<C8188f<E>> rootReference;

    /* renamed from: com.google.common.collect.TreeMultiset$a */
    public class C8181a extends C6158u1.C6160b<E> {

        /* renamed from: e */
        public final /* synthetic */ C8188f f15226e;

        public C8181a(C8188f fVar) {
            this.f15226e = fVar;
        }

        /* renamed from: a */
        public E mo29977a() {
            return this.f15226e.mo36967y();
        }

        public int getCount() {
            int x = this.f15226e.mo36966x();
            return x == 0 ? TreeMultiset.this.count(mo29977a()) : x;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$b */
    public class C8182b implements Iterator<C6153t1.C6154a<E>> {

        /* renamed from: e */
        public C8188f<E> f15228e = TreeMultiset.this.firstNode();

        /* renamed from: l */
        public C6153t1.C6154a<E> f15229l;

        public C8182b() {
        }

        /* renamed from: a */
        public C6153t1.C6154a<E> next() {
            if (hasNext()) {
                C6153t1.C6154a<E> access$1400 = TreeMultiset.this.wrapEntry(this.f15228e);
                this.f15229l = access$1400;
                if (this.f15228e.f15246i == TreeMultiset.this.header) {
                    this.f15228e = null;
                } else {
                    this.f15228e = this.f15228e.f15246i;
                }
                return access$1400;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f15228e == null) {
                return false;
            }
            if (!TreeMultiset.this.range.mo30099m(this.f15228e.mo36967y())) {
                return true;
            }
            this.f15228e = null;
            return false;
        }

        public void remove() {
            C6166v.m17279e(this.f15229l != null);
            TreeMultiset.this.setCount(this.f15229l.mo29977a(), 0);
            this.f15229l = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$c */
    public class C8183c implements Iterator<C6153t1.C6154a<E>> {

        /* renamed from: e */
        public C8188f<E> f15231e = TreeMultiset.this.lastNode();

        /* renamed from: l */
        public C6153t1.C6154a<E> f15232l = null;

        public C8183c() {
        }

        /* renamed from: a */
        public C6153t1.C6154a<E> next() {
            if (hasNext()) {
                C6153t1.C6154a<E> access$1400 = TreeMultiset.this.wrapEntry(this.f15231e);
                this.f15232l = access$1400;
                if (this.f15231e.f15245h == TreeMultiset.this.header) {
                    this.f15231e = null;
                } else {
                    this.f15231e = this.f15231e.f15245h;
                }
                return access$1400;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f15231e == null) {
                return false;
            }
            if (!TreeMultiset.this.range.mo30100n(this.f15231e.mo36967y())) {
                return true;
            }
            this.f15231e = null;
            return false;
        }

        public void remove() {
            C6166v.m17279e(this.f15232l != null);
            TreeMultiset.this.setCount(this.f15232l.mo29977a(), 0);
            this.f15232l = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$d */
    public static /* synthetic */ class C8184d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15234a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15234a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15234a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.C8184d.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$e */
    public enum C8185e {
        SIZE {
            /* renamed from: c */
            public int mo36944c(C8188f<?> fVar) {
                return fVar.f15239b;
            }

            /* renamed from: d */
            public long mo36945d(C8188f<?> fVar) {
                if (fVar == null) {
                    return 0;
                }
                return fVar.f15241d;
            }
        },
        DISTINCT {
            /* renamed from: c */
            public int mo36944c(C8188f<?> fVar) {
                return 1;
            }

            /* renamed from: d */
            public long mo36945d(C8188f<?> fVar) {
                if (fVar == null) {
                    return 0;
                }
                return (long) fVar.f15240c;
            }
        };

        /* renamed from: c */
        public abstract int mo36944c(C8188f<?> fVar);

        /* renamed from: d */
        public abstract long mo36945d(C8188f<?> fVar);
    }

    /* renamed from: com.google.common.collect.TreeMultiset$f */
    public static final class C8188f<E> {

        /* renamed from: a */
        public final E f15238a;

        /* renamed from: b */
        public int f15239b;

        /* renamed from: c */
        public int f15240c;

        /* renamed from: d */
        public long f15241d;

        /* renamed from: e */
        public int f15242e;

        /* renamed from: f */
        public C8188f<E> f15243f;

        /* renamed from: g */
        public C8188f<E> f15244g;

        /* renamed from: h */
        public C8188f<E> f15245h;

        /* renamed from: i */
        public C8188f<E> f15246i;

        public C8188f(E e, int i) {
            C5850m.m16583d(i > 0);
            this.f15238a = e;
            this.f15239b = i;
            this.f15241d = (long) i;
            this.f15240c = 1;
            this.f15242e = 1;
            this.f15243f = null;
            this.f15244g = null;
        }

        /* renamed from: L */
        public static long m22404L(C8188f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.f15241d;
        }

        /* renamed from: z */
        public static int m22420z(C8188f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.f15242e;
        }

        /* renamed from: A */
        public final C8188f<E> mo36946A() {
            int s = mo36960s();
            if (s == -2) {
                if (this.f15244g.mo36960s() > 0) {
                    this.f15244g = this.f15244g.mo36954I();
                }
                return mo36953H();
            } else if (s != 2) {
                mo36948C();
                return this;
            } else {
                if (this.f15243f.mo36960s() < 0) {
                    this.f15243f = this.f15243f.mo36953H();
                }
                return mo36954I();
            }
        }

        /* renamed from: B */
        public final void mo36947B() {
            mo36949D();
            mo36948C();
        }

        /* renamed from: C */
        public final void mo36948C() {
            this.f15242e = Math.max(m22420z(this.f15243f), m22420z(this.f15244g)) + 1;
        }

        /* renamed from: D */
        public final void mo36949D() {
            this.f15240c = TreeMultiset.distinctElements(this.f15243f) + 1 + TreeMultiset.distinctElements(this.f15244g);
            this.f15241d = ((long) this.f15239b) + m22404L(this.f15243f) + m22404L(this.f15244g);
        }

        /* renamed from: E */
        public C8188f<E> mo36950E(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f15243f = fVar.mo36950E(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f15240c--;
                        this.f15241d -= (long) iArr[0];
                    } else {
                        this.f15241d -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : mo36946A();
            } else if (compare > 0) {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f15244g = fVar2.mo36950E(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f15240c--;
                        this.f15241d -= (long) iArr[0];
                    } else {
                        this.f15241d -= (long) i;
                    }
                }
                return mo36946A();
            } else {
                int i2 = this.f15239b;
                iArr[0] = i2;
                if (i >= i2) {
                    return mo36964v();
                }
                this.f15239b = i2 - i;
                this.f15241d -= (long) i;
                return this;
            }
        }

        /* renamed from: F */
        public final C8188f<E> mo36951F(C8188f<E> fVar) {
            C8188f<E> fVar2 = this.f15244g;
            if (fVar2 == null) {
                return this.f15243f;
            }
            this.f15244g = fVar2.mo36951F(fVar);
            this.f15240c--;
            this.f15241d -= (long) fVar.f15239b;
            return mo36946A();
        }

        /* renamed from: G */
        public final C8188f<E> mo36952G(C8188f<E> fVar) {
            C8188f<E> fVar2 = this.f15243f;
            if (fVar2 == null) {
                return this.f15244g;
            }
            this.f15243f = fVar2.mo36952G(fVar);
            this.f15240c--;
            this.f15241d -= (long) fVar.f15239b;
            return mo36946A();
        }

        /* renamed from: H */
        public final C8188f<E> mo36953H() {
            C5850m.m16600u(this.f15244g != null);
            C8188f<E> fVar = this.f15244g;
            this.f15244g = fVar.f15243f;
            fVar.f15243f = this;
            fVar.f15241d = this.f15241d;
            fVar.f15240c = this.f15240c;
            mo36947B();
            fVar.mo36948C();
            return fVar;
        }

        /* renamed from: I */
        public final C8188f<E> mo36954I() {
            C5850m.m16600u(this.f15243f != null);
            C8188f<E> fVar = this.f15243f;
            this.f15243f = fVar.f15244g;
            fVar.f15244g = this;
            fVar.f15241d = this.f15241d;
            fVar.f15240c = this.f15240c;
            mo36947B();
            fVar.mo36948C();
            return fVar;
        }

        /* renamed from: J */
        public C8188f<E> mo36955J(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                if (fVar == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo36958q(e, i2);
                    }
                    return this;
                }
                this.f15243f = fVar.mo36955J(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f15240c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f15240c++;
                    }
                    this.f15241d += (long) (i2 - iArr[0]);
                }
                return mo36946A();
            } else if (compare > 0) {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo36959r(e, i2);
                    }
                    return this;
                }
                this.f15244g = fVar2.mo36955J(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f15240c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f15240c++;
                    }
                    this.f15241d += (long) (i2 - iArr[0]);
                }
                return mo36946A();
            } else {
                int i3 = this.f15239b;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return mo36964v();
                    }
                    this.f15241d += (long) (i2 - i3);
                    this.f15239b = i2;
                }
                return this;
            }
        }

        /* renamed from: K */
        public C8188f<E> mo36956K(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                if (fVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo36958q(e, i);
                    }
                    return this;
                }
                this.f15243f = fVar.mo36956K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f15240c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f15240c++;
                }
                this.f15241d += (long) (i - iArr[0]);
                return mo36946A();
            } else if (compare > 0) {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo36959r(e, i);
                    }
                    return this;
                }
                this.f15244g = fVar2.mo36956K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f15240c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f15240c++;
                }
                this.f15241d += (long) (i - iArr[0]);
                return mo36946A();
            } else {
                int i2 = this.f15239b;
                iArr[0] = i2;
                if (i == 0) {
                    return mo36964v();
                }
                this.f15241d += (long) (i - i2);
                this.f15239b = i;
                return this;
            }
        }

        /* renamed from: p */
        public C8188f<E> mo36957p(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f15238a);
            boolean z = true;
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                if (fVar == null) {
                    iArr[0] = 0;
                    mo36958q(e, i);
                    return this;
                }
                int i2 = fVar.f15242e;
                this.f15243f = fVar.mo36957p(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f15240c++;
                }
                this.f15241d += (long) i;
                return this.f15243f.f15242e == i2 ? this : mo36946A();
            } else if (compare > 0) {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    mo36959r(e, i);
                    return this;
                }
                int i3 = fVar2.f15242e;
                this.f15244g = fVar2.mo36957p(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f15240c++;
                }
                this.f15241d += (long) i;
                return this.f15244g.f15242e == i3 ? this : mo36946A();
            } else {
                int i4 = this.f15239b;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > 2147483647L) {
                    z = false;
                }
                C5850m.m16583d(z);
                this.f15239b += i;
                this.f15241d += j;
                return this;
            }
        }

        /* renamed from: q */
        public final C8188f<E> mo36958q(E e, int i) {
            C8188f<E> fVar = new C8188f<>(e, i);
            this.f15243f = fVar;
            TreeMultiset.successor(this.f15245h, fVar, this);
            this.f15242e = Math.max(2, this.f15242e);
            this.f15240c++;
            this.f15241d += (long) i;
            return this;
        }

        /* renamed from: r */
        public final C8188f<E> mo36959r(E e, int i) {
            C8188f<E> fVar = new C8188f<>(e, i);
            this.f15244g = fVar;
            TreeMultiset.successor(this, fVar, this.f15246i);
            this.f15242e = Math.max(2, this.f15242e);
            this.f15240c++;
            this.f15241d += (long) i;
            return this;
        }

        /* renamed from: s */
        public final int mo36960s() {
            return m22420z(this.f15243f) - m22420z(this.f15244g);
        }

        /* renamed from: t */
        public final C8188f<E> mo36961t(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                return fVar == null ? this : (C8188f) C5841i.m16566a(fVar.mo36961t(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.mo36961t(comparator, e);
            }
        }

        public String toString() {
            return C6158u1.m17263g(mo36967y(), mo36966x()).toString();
        }

        /* renamed from: u */
        public int mo36963u(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare < 0) {
                C8188f<E> fVar = this.f15243f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.mo36963u(comparator, e);
            } else if (compare <= 0) {
                return this.f15239b;
            } else {
                C8188f<E> fVar2 = this.f15244g;
                if (fVar2 == null) {
                    return 0;
                }
                return fVar2.mo36963u(comparator, e);
            }
        }

        /* renamed from: v */
        public final C8188f<E> mo36964v() {
            int i = this.f15239b;
            this.f15239b = 0;
            TreeMultiset.successor(this.f15245h, this.f15246i);
            C8188f<E> fVar = this.f15243f;
            if (fVar == null) {
                return this.f15244g;
            }
            C8188f<E> fVar2 = this.f15244g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.f15242e >= fVar2.f15242e) {
                C8188f<E> fVar3 = this.f15245h;
                fVar3.f15243f = fVar.mo36951F(fVar3);
                fVar3.f15244g = this.f15244g;
                fVar3.f15240c = this.f15240c - 1;
                fVar3.f15241d = this.f15241d - ((long) i);
                return fVar3.mo36946A();
            }
            C8188f<E> fVar4 = this.f15246i;
            fVar4.f15244g = fVar2.mo36952G(fVar4);
            fVar4.f15243f = this.f15243f;
            fVar4.f15240c = this.f15240c - 1;
            fVar4.f15241d = this.f15241d - ((long) i);
            return fVar4.mo36946A();
        }

        /* renamed from: w */
        public final C8188f<E> mo36965w(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f15238a);
            if (compare > 0) {
                C8188f<E> fVar = this.f15244g;
                return fVar == null ? this : (C8188f) C5841i.m16566a(fVar.mo36965w(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                C8188f<E> fVar2 = this.f15243f;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.mo36965w(comparator, e);
            }
        }

        /* renamed from: x */
        public int mo36966x() {
            return this.f15239b;
        }

        /* renamed from: y */
        public E mo36967y() {
            return this.f15238a;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$g */
    public static final class C8189g<T> {

        /* renamed from: a */
        public T f15247a;

        public C8189g() {
        }

        /* renamed from: a */
        public void mo36968a(T t, T t2) {
            if (this.f15247a == t) {
                this.f15247a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void mo36969b() {
            this.f15247a = null;
        }

        /* renamed from: c */
        public T mo36970c() {
            return this.f15247a;
        }

        public /* synthetic */ C8189g(C8181a aVar) {
            this();
        }
    }

    public TreeMultiset(C8189g<C8188f<E>> gVar, C6183x0<E> x0Var, C8188f<E> fVar) {
        super(x0Var.mo30088b());
        this.rootReference = gVar;
        this.range = x0Var;
        this.header = fVar;
    }

    private long aggregateAboveRange(C8185e eVar, C8188f<E> fVar) {
        long d;
        long aggregateAboveRange;
        if (fVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.range.mo30094h(), fVar.f15238a);
        if (compare > 0) {
            return aggregateAboveRange(eVar, fVar.f15244g);
        }
        if (compare == 0) {
            int i = C8184d.f15234a[this.range.mo30093g().ordinal()];
            if (i == 1) {
                d = (long) eVar.mo36944c(fVar);
                aggregateAboveRange = eVar.mo36945d(fVar.f15244g);
            } else if (i == 2) {
                return eVar.mo36945d(fVar.f15244g);
            } else {
                throw new AssertionError();
            }
        } else {
            d = eVar.mo36945d(fVar.f15244g) + ((long) eVar.mo36944c(fVar));
            aggregateAboveRange = aggregateAboveRange(eVar, fVar.f15243f);
        }
        return d + aggregateAboveRange;
    }

    private long aggregateBelowRange(C8185e eVar, C8188f<E> fVar) {
        long d;
        long aggregateBelowRange;
        if (fVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.range.mo30092f(), fVar.f15238a);
        if (compare < 0) {
            return aggregateBelowRange(eVar, fVar.f15243f);
        }
        if (compare == 0) {
            int i = C8184d.f15234a[this.range.mo30090e().ordinal()];
            if (i == 1) {
                d = (long) eVar.mo36944c(fVar);
                aggregateBelowRange = eVar.mo36945d(fVar.f15243f);
            } else if (i == 2) {
                return eVar.mo36945d(fVar.f15243f);
            } else {
                throw new AssertionError();
            }
        } else {
            d = eVar.mo36945d(fVar.f15243f) + ((long) eVar.mo36944c(fVar));
            aggregateBelowRange = aggregateBelowRange(eVar, fVar.f15244g);
        }
        return d + aggregateBelowRange;
    }

    private long aggregateForEntries(C8185e eVar) {
        C8188f c = this.rootReference.mo36970c();
        long d = eVar.mo36945d(c);
        if (this.range.mo30096i()) {
            d -= aggregateBelowRange(eVar, c);
        }
        return this.range.mo30097j() ? d - aggregateAboveRange(eVar, c) : d;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(C6205z1.m17455e());
    }

    /* access modifiers changed from: private */
    public C8188f<E> firstNode() {
        C8188f<E> fVar;
        if (this.rootReference.mo36970c() == null) {
            return null;
        }
        if (this.range.mo30096i()) {
            E f = this.range.mo30092f();
            fVar = this.rootReference.mo36970c().mo36961t(comparator(), f);
            if (fVar == null) {
                return null;
            }
            if (this.range.mo30090e() == BoundType.OPEN && comparator().compare(f, fVar.mo36967y()) == 0) {
                fVar = fVar.f15246i;
            }
        } else {
            fVar = this.header.f15246i;
        }
        if (fVar == this.header || !this.range.mo30089c(fVar.mo36967y())) {
            return null;
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public C8188f<E> lastNode() {
        C8188f<E> fVar;
        if (this.rootReference.mo36970c() == null) {
            return null;
        }
        if (this.range.mo30097j()) {
            E h = this.range.mo30094h();
            fVar = this.rootReference.mo36970c().mo36965w(comparator(), h);
            if (fVar == null) {
                return null;
            }
            if (this.range.mo30093g() == BoundType.OPEN && comparator().compare(h, fVar.mo36967y()) == 0) {
                fVar = fVar.f15245h;
            }
        } else {
            fVar = this.header.f15245h;
        }
        if (fVar == this.header || !this.range.mo30089c(fVar.mo36967y())) {
            return null;
        }
        return fVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C6131q2.m17221a(C6058o.class, "comparator").mo29955b(this, comparator);
        C6131q2.m17221a(TreeMultiset.class, "range").mo29955b(this, C6183x0.m17339a(comparator));
        C6131q2.m17221a(TreeMultiset.class, "rootReference").mo29955b(this, new C8189g((C8181a) null));
        C8188f fVar = new C8188f(null, 1);
        C6131q2.m17221a(TreeMultiset.class, "header").mo29955b(this, fVar);
        successor(fVar, fVar);
        C6131q2.m17226f(this, objectInputStream);
    }

    public static <T> void successor(C8188f<T> fVar, C8188f<T> fVar2) {
        C8188f unused = fVar.f15246i = fVar2;
        C8188f unused2 = fVar2.f15245h = fVar;
    }

    /* access modifiers changed from: private */
    public C6153t1.C6154a<E> wrapEntry(C8188f<E> fVar) {
        return new C8181a(fVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        C6131q2.m17231k(this, objectOutputStream);
    }

    public int add(E e, int i) {
        C6166v.m17276b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        C5850m.m16583d(this.range.mo30089c(e));
        C8188f c = this.rootReference.mo36970c();
        if (c == null) {
            comparator().compare(e, e);
            C8188f fVar = new C8188f(e, i);
            C8188f<E> fVar2 = this.header;
            successor(fVar2, fVar, fVar2);
            this.rootReference.mo36968a(c, fVar);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo36968a(c, c.mo36957p(comparator(), e, i, iArr));
        return iArr[0];
    }

    public void clear() {
        if (this.range.mo30096i() || this.range.mo30097j()) {
            C6028l1.m16932d(entryIterator());
            return;
        }
        C8188f<E> l = this.header.f15246i;
        while (true) {
            C8188f<E> fVar = this.header;
            if (l != fVar) {
                C8188f<E> l2 = l.f15246i;
                int unused = l.f15239b = 0;
                C8188f unused2 = l.f15243f = null;
                C8188f unused3 = l.f15244g = null;
                C8188f unused4 = l.f15245h = null;
                C8188f unused5 = l.f15246i = null;
                l = l2;
            } else {
                successor(fVar, fVar);
                this.rootReference.mo36969b();
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public int count(Object obj) {
        try {
            C8188f c = this.rootReference.mo36970c();
            if (this.range.mo30089c(obj)) {
                if (c != null) {
                    return c.mo36963u(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public Iterator<C6153t1.C6154a<E>> descendingEntryIterator() {
        return new C8183c();
    }

    public /* bridge */ /* synthetic */ C6202y2 descendingMultiset() {
        return super.descendingMultiset();
    }

    public int distinctElements() {
        return C6250c.m17574h(aggregateForEntries(C8185e.DISTINCT));
    }

    public Iterator<E> elementIterator() {
        return C6158u1.m17261e(entryIterator());
    }

    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    public Iterator<C6153t1.C6154a<E>> entryIterator() {
        return new C8182b();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ C6153t1.C6154a firstEntry() {
        return super.firstEntry();
    }

    public C6202y2<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.mo30098l(C6183x0.m17341o(comparator(), e, boundType)), this.header);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator<E> iterator() {
        return C6158u1.m17265i(this);
    }

    public /* bridge */ /* synthetic */ C6153t1.C6154a lastEntry() {
        return super.lastEntry();
    }

    public /* bridge */ /* synthetic */ C6153t1.C6154a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public /* bridge */ /* synthetic */ C6153t1.C6154a pollLastEntry() {
        return super.pollLastEntry();
    }

    public int remove(Object obj, int i) {
        C6166v.m17276b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C8188f c = this.rootReference.mo36970c();
        int[] iArr = new int[1];
        try {
            if (this.range.mo30089c(obj)) {
                if (c != null) {
                    this.rootReference.mo36968a(c, c.mo36950E(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public int setCount(E e, int i) {
        C6166v.m17276b(i, "count");
        boolean z = true;
        if (!this.range.mo30089c(e)) {
            if (i != 0) {
                z = false;
            }
            C5850m.m16583d(z);
            return 0;
        }
        C8188f c = this.rootReference.mo36970c();
        if (c == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo36968a(c, c.mo36956K(comparator(), e, i, iArr));
        return iArr[0];
    }

    public int size() {
        return C6250c.m17574h(aggregateForEntries(C8185e.SIZE));
    }

    public /* bridge */ /* synthetic */ C6202y2 subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    public C6202y2<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.mo30098l(C6183x0.m17340d(comparator(), e, boundType)), this.header);
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(C6205z1.m17455e()) : new TreeMultiset<>(comparator);
    }

    public static int distinctElements(C8188f<?> fVar) {
        if (fVar == null) {
            return 0;
        }
        return fVar.f15240c;
    }

    public static <T> void successor(C8188f<T> fVar, C8188f<T> fVar2, C8188f<T> fVar3) {
        successor(fVar, fVar2);
        successor(fVar2, fVar3);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        C6020k1.m16914a(create, iterable);
        return create;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = C6183x0.m17339a(comparator);
        C8188f<E> fVar = new C8188f<>(null, 1);
        this.header = fVar;
        successor(fVar, fVar);
        this.rootReference = new C8189g<>((C8181a) null);
    }

    public boolean setCount(E e, int i, int i2) {
        C6166v.m17276b(i2, "newCount");
        C6166v.m17276b(i, "oldCount");
        C5850m.m16583d(this.range.mo30089c(e));
        C8188f c = this.rootReference.mo36970c();
        if (c != null) {
            int[] iArr = new int[1];
            this.rootReference.mo36968a(c, c.mo36955J(comparator(), e, i, i2, iArr));
            if (iArr[0] == i) {
                return true;
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        }
    }
}

package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.f2 */
/* compiled from: RegularContiguousSet */
public final class C5972f2<C extends Comparable> extends ContiguousSet<C> {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final Range<C> f11529e;

    /* renamed from: c.q.b.b.f2$a */
    /* compiled from: RegularContiguousSet */
    public class C5973a extends C6026l<C> {

        /* renamed from: l */
        public final C f11530l = C5972f2.this.last();

        public C5973a(Comparable comparable) {
            super(comparable);
        }

        /* renamed from: b */
        public C mo29442a(C c) {
            if (C5972f2.m16829f(c, this.f11530l)) {
                return null;
            }
            return C5972f2.this.domain.mo29527f(c);
        }
    }

    /* renamed from: c.q.b.b.f2$b */
    /* compiled from: RegularContiguousSet */
    public class C5974b extends C6026l<C> {

        /* renamed from: l */
        public final C f11532l = C5972f2.this.first();

        public C5974b(Comparable comparable) {
            super(comparable);
        }

        /* renamed from: b */
        public C mo29442a(C c) {
            if (C5972f2.m16829f(c, this.f11532l)) {
                return null;
            }
            return C5972f2.this.domain.mo29529h(c);
        }
    }

    /* renamed from: c.q.b.b.f2$c */
    /* compiled from: RegularContiguousSet */
    public class C5975c extends C5875a1<C> {
        public C5975c() {
        }

        /* renamed from: f */
        public ImmutableSortedSet<C> mo29026c() {
            return C5972f2.this;
        }

        /* renamed from: g */
        public C get(int i) {
            C5850m.m16592m(i, size());
            C5972f2 f2Var = C5972f2.this;
            return f2Var.domain.mo29528g(f2Var.first(), (long) i);
        }
    }

    /* renamed from: c.q.b.b.f2$d */
    /* compiled from: RegularContiguousSet */
    public static final class C5976d<C extends Comparable> implements Serializable {

        /* renamed from: e */
        public final Range<C> f11535e;

        /* renamed from: l */
        public final C5995i0<C> f11536l;

        public /* synthetic */ C5976d(Range range, C5995i0 i0Var, C5973a aVar) {
            this(range, i0Var);
        }

        private Object readResolve() {
            return new C5972f2(this.f11535e, this.f11536l);
        }

        public C5976d(Range<C> range, C5995i0<C> i0Var) {
            this.f11535e = range;
            this.f11536l = i0Var;
        }
    }

    public C5972f2(Range<C> range, C5995i0<C> i0Var) {
        super(i0Var);
        this.f11529e = range;
    }

    /* renamed from: f */
    public static boolean m16829f(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && Range.compareOrThrow(comparable, comparable2) == 0;
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f11529e.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        return C6170w.m17283b(this, collection);
    }

    public ImmutableList<C> createAsList() {
        if (this.domain.f11556e) {
            return new C5975c();
        }
        return super.createAsList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5972f2) {
            C5972f2 f2Var = (C5972f2) obj;
            if (this.domain.equals(f2Var.domain)) {
                if (!first().equals(f2Var.first()) || !last().equals(f2Var.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public C first() {
        return this.f11529e.lowerBound.mo29183r(this.domain);
    }

    public int hashCode() {
        return C6148s2.m17249b(this);
    }

    public int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.domain.mo29524a(first(), (Comparable) obj);
        }
        return -1;
    }

    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        C5850m.m16594o(contiguousSet);
        C5850m.m16583d(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) C6205z1.m17455e().mo29699c(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) C6205z1.m17455e().mo29700d(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.domain) : new C6009j0(this.domain);
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isPartialView() {
        return false;
    }

    /* renamed from: l */
    public final ContiguousSet<C> mo29432l(Range<C> range) {
        return this.f11529e.isConnected(range) ? ContiguousSet.create(this.f11529e.intersection(range), this.domain) : new C6009j0(this.domain);
    }

    /* renamed from: o */
    public C last() {
        return this.f11529e.upperBound.mo29181o(this.domain);
    }

    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    public int size() {
        long a = this.domain.mo29524a(first(), last());
        if (a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a) + 1;
    }

    public Object writeReplace() {
        return new C5976d(this.f11529e, this.domain, (C5973a) null);
    }

    public C5991h3<C> descendingIterator() {
        return new C5974b(last());
    }

    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return mo29432l(Range.upTo(c, BoundType.forBoolean(z)));
    }

    public C5991h3<C> iterator() {
        return new C5973a(first());
    }

    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.create(this.f11529e.lowerBound.mo29186w(boundType, this.domain), this.f11529e.upperBound.mo29187x(boundType2, this.domain));
    }

    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return mo29432l(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
        }
        return new C6009j0(this.domain);
    }

    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return mo29432l(Range.downTo(c, BoundType.forBoolean(z)));
    }
}

package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: c.q.b.b.j0 */
/* compiled from: EmptyContiguousSet */
public final class C6009j0<C extends Comparable> extends ContiguousSet<C> {

    /* renamed from: c.q.b.b.j0$b */
    /* compiled from: EmptyContiguousSet */
    public static final class C6011b<C extends Comparable> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final C5995i0<C> f11574e;

        private Object readResolve() {
            return new C6009j0(this.f11574e);
        }

        public C6011b(C5995i0<C> i0Var) {
            this.f11574e = i0Var;
        }
    }

    public C6009j0(C5995i0<C> i0Var) {
        super(i0Var);
    }

    public ImmutableList<C> asList() {
        return ImmutableList.m22152of();
    }

    /* renamed from: c */
    public C mo29579c() {
        throw new NoSuchElementException();
    }

    public boolean contains(Object obj) {
        return false;
    }

    public ImmutableSortedSet<C> createDescendingSet() {
        return ImmutableSortedSet.emptySet(C6205z1.m17455e().mo29701h());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: f */
    public C mo29580f() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ Object first() {
        mo29579c();
        throw null;
    }

    public int hashCode() {
        return 0;
    }

    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
        headSetImpl((Comparable) obj, z);
        return this;
    }

    public int indexOf(Object obj) {
        return -1;
    }

    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        return this;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object last() {
        mo29580f();
        throw null;
    }

    public Range<C> range() {
        throw new NoSuchElementException();
    }

    public int size() {
        return 0;
    }

    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    public /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        subSetImpl((Comparable) obj, z, (Comparable) obj2, z2);
        return this;
    }

    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
        tailSetImpl((Comparable) obj, z);
        return this;
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public Object writeReplace() {
        return new C6011b(this.domain);
    }

    public C5991h3<C> descendingIterator() {
        return C6028l1.m16936h();
    }

    public C5991h3<C> iterator() {
        return C6028l1.m16936h();
    }

    public Range<C> range(BoundType boundType, BoundType boundType2) {
        throw new NoSuchElementException();
    }
}

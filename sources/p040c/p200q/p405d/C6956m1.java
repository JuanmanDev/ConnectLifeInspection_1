package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.q.d.m1 */
/* compiled from: UnmodifiableLazyStringList */
public class C6956m1 extends AbstractList<String> implements C6892c0, RandomAccess {

    /* renamed from: e */
    public final C6892c0 f13321e;

    /* renamed from: c.q.d.m1$a */
    /* compiled from: UnmodifiableLazyStringList */
    public class C6957a implements ListIterator<String> {

        /* renamed from: e */
        public ListIterator<String> f13322e = C6956m1.this.f13321e.listIterator(this.f13323l);

        /* renamed from: l */
        public final /* synthetic */ int f13323l;

        public C6957a(int i) {
            this.f13323l = i;
        }

        /* renamed from: a */
        public void mo32227a(String str) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            mo32227a((String) obj);
            throw null;
        }

        /* renamed from: b */
        public String next() {
            return this.f13322e.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f13322e.previous();
        }

        /* renamed from: d */
        public void mo32231d(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f13322e.hasNext();
        }

        public boolean hasPrevious() {
            return this.f13322e.hasPrevious();
        }

        public int nextIndex() {
            return this.f13322e.nextIndex();
        }

        public int previousIndex() {
            return this.f13322e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            mo32231d((String) obj);
            throw null;
        }
    }

    /* renamed from: c.q.d.m1$b */
    /* compiled from: UnmodifiableLazyStringList */
    public class C6958b implements Iterator<String> {

        /* renamed from: e */
        public Iterator<String> f13325e = C6956m1.this.f13321e.iterator();

        public C6958b() {
        }

        /* renamed from: a */
        public String next() {
            return this.f13325e.next();
        }

        public boolean hasNext() {
            return this.f13325e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6956m1(C6892c0 c0Var) {
        this.f13321e = c0Var;
    }

    /* renamed from: G */
    public C6892c0 mo31761G() {
        return this;
    }

    /* renamed from: K */
    public Object mo31762K(int i) {
        return this.f13321e.mo31762K(i);
    }

    /* renamed from: f */
    public String get(int i) {
        return (String) this.f13321e.get(i);
    }

    public Iterator<String> iterator() {
        return new C6958b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C6957a(i);
    }

    /* renamed from: r */
    public void mo31774r(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f13321e.size();
    }

    /* renamed from: w */
    public List<?> mo31778w() {
        return this.f13321e.mo31778w();
    }
}

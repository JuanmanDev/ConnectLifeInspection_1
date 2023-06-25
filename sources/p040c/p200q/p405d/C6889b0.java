package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.d.b0 */
/* compiled from: LazyStringArrayList */
public class C6889b0 extends C6891c<String> implements C6892c0, RandomAccess {

    /* renamed from: m */
    public static final C6889b0 f13182m;

    /* renamed from: l */
    public final List<Object> f13183l;

    static {
        C6889b0 b0Var = new C6889b0();
        f13182m = b0Var;
        b0Var.mo31828m();
    }

    public C6889b0() {
        this(10);
    }

    /* renamed from: g */
    public static String m19587g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return C6999y.m20716j((byte[]) obj);
    }

    /* renamed from: G */
    public C6892c0 mo31761G() {
        return mo31823N() ? new C6956m1(this) : this;
    }

    /* renamed from: K */
    public Object mo31762K(int i) {
        return this.f13183l.get(i);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo31825c();
        this.f13183l.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public void add(int i, String str) {
        mo31825c();
        this.f13183l.add(i, str);
        this.modCount++;
    }

    /* renamed from: k */
    public String get(int i) {
        Object obj = this.f13183l.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f13183l.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String j = C6999y.m20716j(bArr);
        if (C6999y.m20713g(bArr)) {
            this.f13183l.set(i, j);
        }
        return j;
    }

    /* renamed from: l */
    public C6889b0 mo31773q(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f13183l);
            return new C6889b0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public String remove(int i) {
        mo31825c();
        Object remove = this.f13183l.remove(i);
        this.modCount++;
        return m19587g(remove);
    }

    /* renamed from: p */
    public String set(int i, String str) {
        mo31825c();
        return m19587g(this.f13183l.set(i, str));
    }

    /* renamed from: r */
    public void mo31774r(ByteString byteString) {
        mo31825c();
        this.f13183l.add(byteString);
        this.modCount++;
    }

    public int size() {
        return this.f13183l.size();
    }

    /* renamed from: w */
    public List<?> mo31778w() {
        return Collections.unmodifiableList(this.f13183l);
    }

    public C6889b0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo31825c();
        if (collection instanceof C6892c0) {
            collection = ((C6892c0) collection).mo31778w();
        }
        boolean addAll = this.f13183l.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public C6889b0(ArrayList<Object> arrayList) {
        this.f13183l = arrayList;
    }
}

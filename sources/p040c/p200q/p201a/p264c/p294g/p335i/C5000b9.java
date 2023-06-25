package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.b9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5000b9 extends C5062f7 implements RandomAccess, C5016c9 {

    /* renamed from: m */
    public static final C5000b9 f9828m;

    /* renamed from: l */
    public final List f9829l;

    static {
        C5000b9 b9Var = new C5000b9(10);
        f9828m = b9Var;
        b9Var.mo27229a();
    }

    public C5000b9() {
        this(10);
    }

    /* renamed from: g */
    public static String m13848g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzje) {
            return ((zzje) obj).zzn(C5369z8.f10297a);
        }
        return C5369z8.m15427g((byte[]) obj);
    }

    /* renamed from: C */
    public final void mo27004C(zzje zzje) {
        mo27231c();
        this.f9829l.add(zzje);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo27231c();
        this.f9829l.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo27231c();
        if (collection instanceof C5016c9) {
            collection = ((C5016c9) collection).mo27010e();
        }
        boolean addAll = this.f9829l.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo27231c();
        this.f9829l.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final C5016c9 mo27009d() {
        return mo27230b() ? new C5002bb(this) : this;
    }

    /* renamed from: e */
    public final List mo27010e() {
        return Collections.unmodifiableList(this.f9829l);
    }

    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f9829l.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzje) {
            zzje zzje = (zzje) obj;
            String zzn = zzje.zzn(C5369z8.f10297a);
            if (zzje.zzi()) {
                this.f9829l.set(i, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String g = C5369z8.m15427g(bArr);
        if (C5369z8.m15428h(bArr)) {
            this.f9829l.set(i, g);
        }
        return g;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5354y8 mo27013i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9829l);
            return new C5000b9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public final Object mo27014j(int i) {
        return this.f9829l.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        Object remove = this.f9829l.remove(i);
        this.modCount++;
        return m13848g(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo27231c();
        return m13848g(this.f9829l.set(i, (String) obj));
    }

    public final int size() {
        return this.f9829l.size();
    }

    public C5000b9(int i) {
        this.f9829l = new ArrayList(i);
    }

    public C5000b9(ArrayList arrayList) {
        this.f9829l = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}

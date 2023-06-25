package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.s1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4758s1 extends C4808u implements RandomAccess, C4784t1 {

    /* renamed from: m */
    public static final C4758s1 f9607m;

    /* renamed from: l */
    public final List f9608l;

    static {
        C4758s1 s1Var = new C4758s1(10);
        f9607m = s1Var;
        s1Var.mo26496a();
    }

    public C4758s1() {
        this(10);
    }

    /* renamed from: g */
    public static String m13038g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzacc) {
            return ((zzacc) obj).zzr(C4706q1.f9576a);
        }
        return C4706q1.m12870g((byte[]) obj);
    }

    /* renamed from: M */
    public final void mo26624M(zzacc zzacc) {
        mo26681c();
        this.f9608l.add(zzacc);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo26681c();
        this.f9608l.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo26681c();
        if (collection instanceof C4784t1) {
            collection = ((C4784t1) collection).mo26629e();
        }
        boolean addAll = this.f9608l.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo26681c();
        this.f9608l.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final C4784t1 mo26628d() {
        return mo26497b() ? new C4786t3(this) : this;
    }

    /* renamed from: e */
    public final List mo26629e() {
        return Collections.unmodifiableList(this.f9608l);
    }

    /* renamed from: f */
    public final String get(int i) {
        Object obj = this.f9608l.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzacc) {
            zzacc zzacc = (zzacc) obj;
            String zzr = zzacc.zzr(C4706q1.f9576a);
            if (zzacc.zzk()) {
                this.f9608l.set(i, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String g = C4706q1.m12870g(bArr);
        if (C4706q1.m12871h(bArr)) {
            this.f9608l.set(i, g);
        }
        return g;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9608l);
            return new C4758s1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public final Object mo26632j(int i) {
        return this.f9608l.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        Object remove = this.f9608l.remove(i);
        this.modCount++;
        return m13038g(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo26681c();
        return m13038g(this.f9608l.set(i, (String) obj));
    }

    public final int size() {
        return this.f9608l.size();
    }

    public C4758s1(int i) {
        this.f9608l = new ArrayList(i);
    }

    public C4758s1(ArrayList arrayList) {
        this.f9608l = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}

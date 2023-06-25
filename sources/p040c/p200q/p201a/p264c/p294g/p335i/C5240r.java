package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.r */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5240r implements C5225q {

    /* renamed from: e */
    public final String f10103e;

    /* renamed from: l */
    public final ArrayList f10104l;

    public C5240r(String str, List list) {
        this.f10103e = str;
        ArrayList arrayList = new ArrayList();
        this.f10104l = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo27528a() {
        return this.f10103e;
    }

    /* renamed from: b */
    public final ArrayList mo27529b() {
        return this.f10104l;
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        return this;
    }

    /* renamed from: e */
    public final Double mo27206e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5240r)) {
            return false;
        }
        C5240r rVar = (C5240r) obj;
        String str = this.f10103e;
        if (str == null ? rVar.f10103e == null : str.equals(rVar.f10103e)) {
            return this.f10104l.equals(rVar.f10104l);
        }
        return false;
    }

    /* renamed from: f */
    public final String mo27208f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f10103e;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f10104l.hashCode();
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return null;
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}

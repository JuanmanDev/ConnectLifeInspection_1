package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.h */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5086h implements C5225q {

    /* renamed from: e */
    public final C5225q f9920e;

    /* renamed from: l */
    public final String f9921l;

    public C5086h() {
        throw null;
    }

    public C5086h(String str) {
        this.f9920e = C5225q.f10068c;
        this.f9921l = str;
    }

    public C5086h(String str, C5225q qVar) {
        this.f9920e = qVar;
        this.f9921l = str;
    }

    /* renamed from: a */
    public final C5225q mo27281a() {
        return this.f9920e;
    }

    /* renamed from: b */
    public final String mo27282b() {
        return this.f9921l;
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        return new C5086h(this.f9921l, this.f9920e.mo27205c());
    }

    /* renamed from: e */
    public final Double mo27206e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5086h)) {
            return false;
        }
        C5086h hVar = (C5086h) obj;
        return this.f9921l.equals(hVar.f9921l) && this.f9920e.equals(hVar.f9920e);
    }

    /* renamed from: f */
    public final String mo27208f() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f9921l.hashCode() * 31) + this.f9920e.hashCode();
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return null;
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}

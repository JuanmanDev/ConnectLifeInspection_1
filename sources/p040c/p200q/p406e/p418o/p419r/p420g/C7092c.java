package p040c.p200q.p406e.p418o.p419r.p420g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.q.e.o.r.g.c */
/* compiled from: ExpandedRow */
public final class C7092c {

    /* renamed from: a */
    public final List<C7091b> f13632a;

    /* renamed from: b */
    public final int f13633b;

    /* renamed from: c */
    public final boolean f13634c;

    public C7092c(List<C7091b> list, int i, boolean z) {
        this.f13632a = new ArrayList(list);
        this.f13633b = i;
        this.f13634c = z;
    }

    /* renamed from: a */
    public List<C7091b> mo32695a() {
        return this.f13632a;
    }

    /* renamed from: b */
    public int mo32696b() {
        return this.f13633b;
    }

    /* renamed from: c */
    public boolean mo32697c(List<C7091b> list) {
        return this.f13632a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7092c)) {
            return false;
        }
        C7092c cVar = (C7092c) obj;
        if (!this.f13632a.equals(cVar.mo32695a()) || this.f13634c != cVar.f13634c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f13632a.hashCode() ^ Boolean.valueOf(this.f13634c).hashCode();
    }

    public String toString() {
        return "{ " + this.f13632a + " }";
    }
}

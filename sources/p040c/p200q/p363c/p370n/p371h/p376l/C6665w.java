package p040c.p200q.p363c.p370n.p371h.p376l;

import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;

/* renamed from: c.q.c.n.h.l.w */
/* compiled from: AutoValue_StaticSessionData */
public final class C6665w extends C6595b0 {

    /* renamed from: a */
    public final C6595b0.C6596a f12724a;

    /* renamed from: b */
    public final C6595b0.C6598c f12725b;

    /* renamed from: c */
    public final C6595b0.C6597b f12726c;

    public C6665w(C6595b0.C6596a aVar, C6595b0.C6598c cVar, C6595b0.C6597b bVar) {
        if (aVar != null) {
            this.f12724a = aVar;
            if (cVar != null) {
                this.f12725b = cVar;
                if (bVar != null) {
                    this.f12726c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public C6595b0.C6596a mo30955a() {
        return this.f12724a;
    }

    /* renamed from: c */
    public C6595b0.C6597b mo30956c() {
        return this.f12726c;
    }

    /* renamed from: d */
    public C6595b0.C6598c mo30957d() {
        return this.f12725b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6595b0)) {
            return false;
        }
        C6595b0 b0Var = (C6595b0) obj;
        if (!this.f12724a.equals(b0Var.mo30955a()) || !this.f12725b.equals(b0Var.mo30957d()) || !this.f12726c.equals(b0Var.mo30956c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f12724a.hashCode() ^ 1000003) * 1000003) ^ this.f12725b.hashCode()) * 1000003) ^ this.f12726c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f12724a + ", osData=" + this.f12725b + ", deviceData=" + this.f12726c + "}";
    }
}

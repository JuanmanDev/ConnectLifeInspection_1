package p040c.p200q.p363c.p370n.p371h.p376l;

import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;

/* renamed from: c.q.c.n.h.l.z */
/* compiled from: AutoValue_StaticSessionData_OsData */
public final class C6668z extends C6595b0.C6598c {

    /* renamed from: a */
    public final String f12742a;

    /* renamed from: b */
    public final String f12743b;

    /* renamed from: c */
    public final boolean f12744c;

    public C6668z(String str, String str2, boolean z) {
        if (str != null) {
            this.f12742a = str;
            if (str2 != null) {
                this.f12743b = str2;
                this.f12744c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    /* renamed from: b */
    public boolean mo30973b() {
        return this.f12744c;
    }

    /* renamed from: c */
    public String mo30974c() {
        return this.f12743b;
    }

    /* renamed from: d */
    public String mo30975d() {
        return this.f12742a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6595b0.C6598c)) {
            return false;
        }
        C6595b0.C6598c cVar = (C6595b0.C6598c) obj;
        if (!this.f12742a.equals(cVar.mo30975d()) || !this.f12743b.equals(cVar.mo30974c()) || this.f12744c != cVar.mo30973b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f12742a.hashCode() ^ 1000003) * 1000003) ^ this.f12743b.hashCode()) * 1000003) ^ (this.f12744c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f12742a + ", osCodeName=" + this.f12743b + ", isRooted=" + this.f12744c + "}";
    }
}

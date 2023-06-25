package p040c.p200q.p363c.p403y;

/* renamed from: c.q.c.y.c */
/* compiled from: AutoValue_LibraryVersion */
public final class C6873c extends C6877g {

    /* renamed from: a */
    public final String f13165a;

    /* renamed from: b */
    public final String f13166b;

    public C6873c(String str, String str2) {
        if (str != null) {
            this.f13165a = str;
            if (str2 != null) {
                this.f13166b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: b */
    public String mo31724b() {
        return this.f13165a;
    }

    /* renamed from: c */
    public String mo31725c() {
        return this.f13166b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6877g)) {
            return false;
        }
        C6877g gVar = (C6877g) obj;
        if (!this.f13165a.equals(gVar.mo31724b()) || !this.f13166b.equals(gVar.mo31725c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f13165a.hashCode() ^ 1000003) * 1000003) ^ this.f13166b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f13165a + ", version=" + this.f13166b + "}";
    }
}

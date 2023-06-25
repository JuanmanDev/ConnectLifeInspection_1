package p040c.p200q.p201a.p202a.p203h.p204f;

/* renamed from: c.q.a.a.h.f.h */
/* compiled from: AutoValue_LogResponse */
public final class C2385h extends C2394m {

    /* renamed from: a */
    public final long f2706a;

    public C2385h(long j) {
        this.f2706a = j;
    }

    /* renamed from: c */
    public long mo17761c() {
        return this.f2706a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2394m)) {
            return false;
        }
        if (this.f2706a == ((C2394m) obj).mo17761c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f2706a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2706a + "}";
    }
}

package p040c.p200q.p201a.p202a.p205i.p214x;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* renamed from: c.q.a.a.i.x.b */
/* compiled from: AutoValue_BackendResponse */
public final class C2550b extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f2996a;

    /* renamed from: b */
    public final long f2997b;

    public C2550b(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f2996a = status;
            this.f2997b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo17997b() {
        return this.f2997b;
    }

    /* renamed from: c */
    public BackendResponse.Status mo17998c() {
        return this.f2996a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f2996a.equals(backendResponse.mo17998c()) || this.f2997b != backendResponse.mo17997b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2997b;
        return ((this.f2996a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f2996a + ", nextRequestWaitMillis=" + this.f2997b + "}";
    }
}

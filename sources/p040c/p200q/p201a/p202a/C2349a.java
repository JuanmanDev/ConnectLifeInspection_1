package p040c.p200q.p201a.p202a;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;

/* renamed from: c.q.a.a.a */
/* compiled from: AutoValue_Event */
public final class C2349a<T> extends C2351c<T> {

    /* renamed from: a */
    public final Integer f2585a;

    /* renamed from: b */
    public final T f2586b;

    /* renamed from: c */
    public final Priority f2587c;

    public C2349a(@Nullable Integer num, T t, Priority priority) {
        this.f2585a = num;
        if (t != null) {
            this.f2586b = t;
            if (priority != null) {
                this.f2587c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Nullable
    /* renamed from: a */
    public Integer mo17649a() {
        return this.f2585a;
    }

    /* renamed from: b */
    public T mo17650b() {
        return this.f2586b;
    }

    /* renamed from: c */
    public Priority mo17651c() {
        return this.f2587c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2351c)) {
            return false;
        }
        C2351c cVar = (C2351c) obj;
        Integer num = this.f2585a;
        if (num != null ? num.equals(cVar.mo17649a()) : cVar.mo17649a() == null) {
            if (this.f2586b.equals(cVar.mo17650b()) && this.f2587c.equals(cVar.mo17651c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f2585a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f2586b.hashCode()) * 1000003) ^ this.f2587c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f2585a + ", payload=" + this.f2586b + ", priority=" + this.f2587c + "}";
    }
}

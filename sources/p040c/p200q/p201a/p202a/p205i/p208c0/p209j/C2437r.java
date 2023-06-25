package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: c.q.a.a.i.c0.j.r */
/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
public final class C2437r extends SchedulerConfig.C3993b {

    /* renamed from: a */
    public final long f2806a;

    /* renamed from: b */
    public final long f2807b;

    /* renamed from: c */
    public final Set<SchedulerConfig.Flag> f2808c;

    /* renamed from: c.q.a.a.i.c0.j.r$b */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    public static final class C2439b extends SchedulerConfig.C3993b.C3994a {

        /* renamed from: a */
        public Long f2809a;

        /* renamed from: b */
        public Long f2810b;

        /* renamed from: c */
        public Set<SchedulerConfig.Flag> f2811c;

        /* renamed from: a */
        public SchedulerConfig.C3993b mo17825a() {
            String str = "";
            if (this.f2809a == null) {
                str = str + " delta";
            }
            if (this.f2810b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f2811c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2437r(this.f2809a.longValue(), this.f2810b.longValue(), this.f2811c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public SchedulerConfig.C3993b.C3994a mo17826b(long j) {
            this.f2809a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public SchedulerConfig.C3993b.C3994a mo17827c(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.f2811c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public SchedulerConfig.C3993b.C3994a mo17828d(long j) {
            this.f2810b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public long mo17819b() {
        return this.f2806a;
    }

    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo17820c() {
        return this.f2808c;
    }

    /* renamed from: d */
    public long mo17821d() {
        return this.f2807b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C3993b)) {
            return false;
        }
        SchedulerConfig.C3993b bVar = (SchedulerConfig.C3993b) obj;
        if (this.f2806a == bVar.mo17819b() && this.f2807b == bVar.mo17821d() && this.f2808c.equals(bVar.mo17820c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f2806a;
        long j2 = this.f2807b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2808c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f2806a + ", maxAllowedDelay=" + this.f2807b + ", flags=" + this.f2808c + "}";
    }

    public C2437r(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f2806a = j;
        this.f2807b = j2;
        this.f2808c = set;
    }
}

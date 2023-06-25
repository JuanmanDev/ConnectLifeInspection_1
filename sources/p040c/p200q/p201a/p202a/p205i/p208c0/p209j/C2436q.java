package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;

/* renamed from: c.q.a.a.i.c0.j.q */
/* compiled from: AutoValue_SchedulerConfig */
public final class C2436q extends SchedulerConfig {

    /* renamed from: a */
    public final C2512a f2804a;

    /* renamed from: b */
    public final Map<Priority, SchedulerConfig.C3993b> f2805b;

    public C2436q(C2512a aVar, Map<Priority, SchedulerConfig.C3993b> map) {
        if (aVar != null) {
            this.f2804a = aVar;
            if (map != null) {
                this.f2805b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: e */
    public C2512a mo17814e() {
        return this.f2804a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f2804a.equals(schedulerConfig.mo17814e()) || !this.f2805b.equals(schedulerConfig.mo17816h())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public Map<Priority, SchedulerConfig.C3993b> mo17816h() {
        return this.f2805b;
    }

    public int hashCode() {
        return ((this.f2804a.hashCode() ^ 1000003) * 1000003) ^ this.f2805b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f2804a + ", values=" + this.f2805b + "}";
    }
}

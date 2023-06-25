package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2436q;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2437r;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;

public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C3992a {

        /* renamed from: a */
        public C2512a f7546a;

        /* renamed from: b */
        public Map<Priority, C3993b> f7547b = new HashMap();

        /* renamed from: a */
        public C3992a mo23906a(Priority priority, C3993b bVar) {
            this.f7547b.put(priority, bVar);
            return this;
        }

        /* renamed from: b */
        public SchedulerConfig mo23907b() {
            if (this.f7546a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f7547b.keySet().size() >= Priority.values().length) {
                Map<Priority, C3993b> map = this.f7547b;
                this.f7547b = new HashMap();
                return SchedulerConfig.m10215d(this.f7546a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C3992a mo23908c(C2512a aVar) {
            this.f7546a = aVar;
            return this;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class C3993b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class C3994a {
            /* renamed from: a */
            public abstract C3993b mo17825a();

            /* renamed from: b */
            public abstract C3994a mo17826b(long j);

            /* renamed from: c */
            public abstract C3994a mo17827c(Set<Flag> set);

            /* renamed from: d */
            public abstract C3994a mo17828d(long j);
        }

        /* renamed from: a */
        public static C3994a m10227a() {
            C2437r.C2439b bVar = new C2437r.C2439b();
            bVar.mo17827c(Collections.emptySet());
            return bVar;
        }

        /* renamed from: b */
        public abstract long mo17819b();

        /* renamed from: c */
        public abstract Set<Flag> mo17820c();

        /* renamed from: d */
        public abstract long mo17821d();
    }

    /* renamed from: b */
    public static C3992a m10214b() {
        return new C3992a();
    }

    /* renamed from: d */
    public static SchedulerConfig m10215d(C2512a aVar, Map<Priority, C3993b> map) {
        return new C2436q(aVar, map);
    }

    /* renamed from: f */
    public static SchedulerConfig m10216f(C2512a aVar) {
        C3992a b = m10214b();
        Priority priority = Priority.DEFAULT;
        C3993b.C3994a a = C3993b.m10227a();
        a.mo17826b(30000);
        a.mo17828d(86400000);
        b.mo23906a(priority, a.mo17825a());
        Priority priority2 = Priority.HIGHEST;
        C3993b.C3994a a2 = C3993b.m10227a();
        a2.mo17826b(1000);
        a2.mo17828d(86400000);
        b.mo23906a(priority2, a2.mo17825a());
        Priority priority3 = Priority.VERY_LOW;
        C3993b.C3994a a3 = C3993b.m10227a();
        a3.mo17826b(86400000);
        a3.mo17828d(86400000);
        a3.mo17827c(m10217i(Flag.DEVICE_IDLE));
        b.mo23906a(priority3, a3.mo17825a());
        b.mo23908c(aVar);
        return b.mo23907b();
    }

    /* renamed from: i */
    public static <T> Set<T> m10217i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long mo23902a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo23903c(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo23904g(priority, j, i));
        mo23905j(builder, mo17816h().get(priority).mo17820c());
        return builder;
    }

    /* renamed from: e */
    public abstract C2512a mo17814e();

    /* renamed from: g */
    public long mo23904g(Priority priority, long j, int i) {
        long a = j - mo17814e().mo17952a();
        C3993b bVar = mo17816h().get(priority);
        return Math.min(Math.max(mo23902a(i, bVar.mo17819b()), a), bVar.mo17821d());
    }

    /* renamed from: h */
    public abstract Map<Priority, C3993b> mo17816h();

    @RequiresApi(api = 21)
    /* renamed from: j */
    public final void mo23905j(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}

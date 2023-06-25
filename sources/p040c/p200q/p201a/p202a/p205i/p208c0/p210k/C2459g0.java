package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2469k0;

/* renamed from: c.q.a.a.i.c0.k.g0 */
/* compiled from: AutoValue_EventStoreConfig */
public final class C2459g0 extends C2469k0 {

    /* renamed from: b */
    public final long f2864b;

    /* renamed from: c */
    public final int f2865c;

    /* renamed from: d */
    public final int f2866d;

    /* renamed from: e */
    public final long f2867e;

    /* renamed from: f */
    public final int f2868f;

    /* renamed from: c.q.a.a.i.c0.k.g0$b */
    /* compiled from: AutoValue_EventStoreConfig */
    public static final class C2461b extends C2469k0.C2470a {

        /* renamed from: a */
        public Long f2869a;

        /* renamed from: b */
        public Integer f2870b;

        /* renamed from: c */
        public Integer f2871c;

        /* renamed from: d */
        public Long f2872d;

        /* renamed from: e */
        public Integer f2873e;

        /* renamed from: a */
        public C2469k0 mo17860a() {
            String str = "";
            if (this.f2869a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f2870b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f2871c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2872d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2873e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C2459g0(this.f2869a.longValue(), this.f2870b.intValue(), this.f2871c.intValue(), this.f2872d.longValue(), this.f2873e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2469k0.C2470a mo17861b(int i) {
            this.f2871c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C2469k0.C2470a mo17862c(long j) {
            this.f2872d = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C2469k0.C2470a mo17863d(int i) {
            this.f2870b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C2469k0.C2470a mo17864e(int i) {
            this.f2873e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C2469k0.C2470a mo17865f(long j) {
            this.f2869a = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public int mo17852b() {
        return this.f2866d;
    }

    /* renamed from: c */
    public long mo17853c() {
        return this.f2867e;
    }

    /* renamed from: d */
    public int mo17854d() {
        return this.f2865c;
    }

    /* renamed from: e */
    public int mo17855e() {
        return this.f2868f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2469k0)) {
            return false;
        }
        C2469k0 k0Var = (C2469k0) obj;
        if (this.f2864b == k0Var.mo17857f() && this.f2865c == k0Var.mo17854d() && this.f2866d == k0Var.mo17852b() && this.f2867e == k0Var.mo17853c() && this.f2868f == k0Var.mo17855e()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo17857f() {
        return this.f2864b;
    }

    public int hashCode() {
        long j = this.f2864b;
        long j2 = this.f2867e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2865c) * 1000003) ^ this.f2866d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2868f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2864b + ", loadBatchSize=" + this.f2865c + ", criticalSectionEnterTimeoutMs=" + this.f2866d + ", eventCleanUpAge=" + this.f2867e + ", maxBlobByteSizePerRow=" + this.f2868f + "}";
    }

    public C2459g0(long j, int i, int i2, long j2, int i3) {
        this.f2864b = j;
        this.f2865c = i;
        this.f2866d = i2;
        this.f2867e = j2;
        this.f2868f = i3;
    }
}

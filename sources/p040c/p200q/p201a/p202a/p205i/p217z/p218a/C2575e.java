package p040c.p200q.p201a.p202a.p205i.p217z.p218a;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: c.q.a.a.i.z.a.e */
/* compiled from: TimeWindow */
public final class C2575e {

    /* renamed from: a */
    public final long f3037a;

    /* renamed from: b */
    public final long f3038b;

    /* renamed from: c.q.a.a.i.z.a.e$a */
    /* compiled from: TimeWindow */
    public static final class C2576a {

        /* renamed from: a */
        public long f3039a = 0;

        /* renamed from: b */
        public long f3040b = 0;

        /* renamed from: a */
        public C2575e mo18042a() {
            return new C2575e(this.f3039a, this.f3040b);
        }

        /* renamed from: b */
        public C2576a mo18043b(long j) {
            this.f3040b = j;
            return this;
        }

        /* renamed from: c */
        public C2576a mo18044c(long j) {
            this.f3039a = j;
            return this;
        }
    }

    static {
        new C2576a().mo18042a();
    }

    public C2575e(long j, long j2) {
        this.f3037a = j;
        this.f3038b = j2;
    }

    /* renamed from: c */
    public static C2576a m4628c() {
        return new C2576a();
    }

    @Protobuf(tag = 2)
    /* renamed from: a */
    public long mo18040a() {
        return this.f3038b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public long mo18041b() {
        return this.f3037a;
    }
}

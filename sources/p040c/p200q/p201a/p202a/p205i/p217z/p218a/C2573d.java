package p040c.p200q.p201a.p202a.p205i.p217z.p218a;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: c.q.a.a.i.z.a.d */
/* compiled from: StorageMetrics */
public final class C2573d {

    /* renamed from: a */
    public final long f3033a;

    /* renamed from: b */
    public final long f3034b;

    /* renamed from: c.q.a.a.i.z.a.d$a */
    /* compiled from: StorageMetrics */
    public static final class C2574a {

        /* renamed from: a */
        public long f3035a = 0;

        /* renamed from: b */
        public long f3036b = 0;

        /* renamed from: a */
        public C2573d mo18037a() {
            return new C2573d(this.f3035a, this.f3036b);
        }

        /* renamed from: b */
        public C2574a mo18038b(long j) {
            this.f3035a = j;
            return this;
        }

        /* renamed from: c */
        public C2574a mo18039c(long j) {
            this.f3036b = j;
            return this;
        }
    }

    static {
        new C2574a().mo18037a();
    }

    public C2573d(long j, long j2) {
        this.f3033a = j;
        this.f3034b = j2;
    }

    /* renamed from: c */
    public static C2574a m4622c() {
        return new C2574a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo18035a() {
        return this.f3033a;
    }

    @Protobuf(tag = 2)
    /* renamed from: b */
    public long mo18036b() {
        return this.f3034b;
    }
}

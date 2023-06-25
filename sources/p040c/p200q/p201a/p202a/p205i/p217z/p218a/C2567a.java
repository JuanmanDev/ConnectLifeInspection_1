package p040c.p200q.p201a.p202a.p205i.p217z.p218a;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p202a.p205i.C2533n;

/* renamed from: c.q.a.a.i.z.a.a */
/* compiled from: ClientMetrics */
public final class C2567a {

    /* renamed from: a */
    public final C2575e f3019a;

    /* renamed from: b */
    public final List<C2571c> f3020b;

    /* renamed from: c */
    public final C2569b f3021c;

    /* renamed from: d */
    public final String f3022d;

    /* renamed from: c.q.a.a.i.z.a.a$a */
    /* compiled from: ClientMetrics */
    public static final class C2568a {

        /* renamed from: a */
        public C2575e f3023a = null;

        /* renamed from: b */
        public List<C2571c> f3024b = new ArrayList();

        /* renamed from: c */
        public C2569b f3025c = null;

        /* renamed from: d */
        public String f3026d = "";

        /* renamed from: a */
        public C2568a mo18022a(C2571c cVar) {
            this.f3024b.add(cVar);
            return this;
        }

        /* renamed from: b */
        public C2567a mo18023b() {
            return new C2567a(this.f3023a, Collections.unmodifiableList(this.f3024b), this.f3025c, this.f3026d);
        }

        /* renamed from: c */
        public C2568a mo18024c(String str) {
            this.f3026d = str;
            return this;
        }

        /* renamed from: d */
        public C2568a mo18025d(C2569b bVar) {
            this.f3025c = bVar;
            return this;
        }

        /* renamed from: e */
        public C2568a mo18026e(C2575e eVar) {
            this.f3023a = eVar;
            return this;
        }
    }

    static {
        new C2568a().mo18023b();
    }

    public C2567a(C2575e eVar, List<C2571c> list, C2569b bVar, String str) {
        this.f3019a = eVar;
        this.f3020b = list;
        this.f3021c = bVar;
        this.f3022d = str;
    }

    /* renamed from: e */
    public static C2568a m4601e() {
        return new C2568a();
    }

    @Protobuf(tag = 4)
    /* renamed from: a */
    public String mo18017a() {
        return this.f3022d;
    }

    @Protobuf(tag = 3)
    /* renamed from: b */
    public C2569b mo18018b() {
        return this.f3021c;
    }

    @Protobuf(tag = 2)
    /* renamed from: c */
    public List<C2571c> mo18019c() {
        return this.f3020b;
    }

    @Protobuf(tag = 1)
    /* renamed from: d */
    public C2575e mo18020d() {
        return this.f3019a;
    }

    /* renamed from: f */
    public byte[] mo18021f() {
        return C2533n.m4516a(this);
    }
}

package p040c.p321d0.p322a.p324f;

import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.d0.a.f.e */
/* compiled from: MethodCallOperation */
public class C4253e extends C4248a {

    /* renamed from: a */
    public final C9016i f9089a;

    /* renamed from: b */
    public final C4254a f9090b;

    /* renamed from: c.d0.a.f.e$a */
    /* compiled from: MethodCallOperation */
    public class C4254a implements C4256g {

        /* renamed from: a */
        public final C9017j.C9022d f9091a;

        public C4254a(C4253e eVar, C9017j.C9022d dVar) {
            this.f9091a = dVar;
        }

        public void error(String str, String str2, Object obj) {
            this.f9091a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.f9091a.success(obj);
        }
    }

    public C4253e(C9016i iVar, C9017j.C9022d dVar) {
        this.f9089a = iVar;
        this.f9090b = new C4254a(this, dVar);
    }

    /* renamed from: a */
    public <T> T mo25719a(String str) {
        return this.f9089a.mo46571a(str);
    }

    /* renamed from: i */
    public C4256g mo25710i() {
        return this.f9090b;
    }
}

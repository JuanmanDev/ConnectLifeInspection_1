package p040c.p126i.p127a.p129f;

import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.i.a.f.e */
/* compiled from: MethodCallOperation */
public class C2029e extends C2024a {

    /* renamed from: a */
    public final C9016i f1767a;

    /* renamed from: b */
    public final C2030a f1768b;

    /* renamed from: c.i.a.f.e$a */
    /* compiled from: MethodCallOperation */
    public class C2030a implements C2032g {

        /* renamed from: a */
        public final C9017j.C9022d f1769a;

        public C2030a(C2029e eVar, C9017j.C9022d dVar) {
            this.f1769a = dVar;
        }

        public void error(String str, String str2, Object obj) {
            this.f1769a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.f1769a.success(obj);
        }
    }

    public C2029e(C9016i iVar, C9017j.C9022d dVar) {
        this.f1767a = iVar;
        this.f1768b = new C2030a(this, dVar);
    }

    /* renamed from: a */
    public <T> T mo16637a(String str) {
        return this.f1767a.mo46571a(str);
    }

    /* renamed from: i */
    public C2032g mo16628i() {
        return this.f1768b;
    }
}

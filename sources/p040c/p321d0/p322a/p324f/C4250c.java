package p040c.p321d0.p322a.p324f;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.d0.a.f.c */
/* compiled from: BatchOperation */
public class C4250c extends C4248a {

    /* renamed from: a */
    public final Map<String, Object> f9079a;

    /* renamed from: b */
    public final C4251a f9080b = new C4251a(this);

    /* renamed from: c */
    public final boolean f9081c;

    /* renamed from: c.d0.a.f.c$a */
    /* compiled from: BatchOperation */
    public class C4251a implements C4256g {

        /* renamed from: a */
        public Object f9082a;

        /* renamed from: b */
        public String f9083b;

        /* renamed from: c */
        public String f9084c;

        /* renamed from: d */
        public Object f9085d;

        public C4251a(C4250c cVar) {
        }

        public void error(String str, String str2, Object obj) {
            this.f9083b = str;
            this.f9084c = str2;
            this.f9085d = obj;
        }

        public void success(Object obj) {
            this.f9082a = obj;
        }
    }

    public C4250c(Map<String, Object> map, boolean z) {
        this.f9079a = map;
        this.f9081c = z;
    }

    /* renamed from: a */
    public <T> T mo25719a(String str) {
        return this.f9079a.get(str);
    }

    /* renamed from: c */
    public boolean mo25713c() {
        return this.f9081c;
    }

    /* renamed from: i */
    public C4256g mo25710i() {
        return this.f9080b;
    }

    /* renamed from: j */
    public String mo25720j() {
        return (String) this.f9079a.get("method");
    }

    /* renamed from: k */
    public Map<String, Object> mo25721k() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f9080b.f9083b);
        hashMap2.put("message", this.f9080b.f9084c);
        hashMap2.put("data", this.f9080b.f9085d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: l */
    public Map<String, Object> mo25722l() {
        HashMap hashMap = new HashMap();
        hashMap.put(BundleJUnitUtils.KEY_RESULT, this.f9080b.f9082a);
        return hashMap;
    }

    /* renamed from: m */
    public void mo25723m(C9017j.C9022d dVar) {
        C4251a aVar = this.f9080b;
        dVar.error(aVar.f9083b, aVar.f9084c, aVar.f9085d);
    }

    /* renamed from: n */
    public void mo25724n(List<Map<String, Object>> list) {
        if (!mo25713c()) {
            list.add(mo25721k());
        }
    }

    /* renamed from: o */
    public void mo25725o(List<Map<String, Object>> list) {
        if (!mo25713c()) {
            list.add(mo25722l());
        }
    }
}

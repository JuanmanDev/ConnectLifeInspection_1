package p040c.p126i.p127a.p129f;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.i.a.f.c */
/* compiled from: BatchOperation */
public class C2026c extends C2024a {

    /* renamed from: a */
    public final Map<String, Object> f1757a;

    /* renamed from: b */
    public final C2027a f1758b = new C2027a(this);

    /* renamed from: c */
    public final boolean f1759c;

    /* renamed from: c.i.a.f.c$a */
    /* compiled from: BatchOperation */
    public class C2027a implements C2032g {

        /* renamed from: a */
        public Object f1760a;

        /* renamed from: b */
        public String f1761b;

        /* renamed from: c */
        public String f1762c;

        /* renamed from: d */
        public Object f1763d;

        public C2027a(C2026c cVar) {
        }

        public void error(String str, String str2, Object obj) {
            this.f1761b = str;
            this.f1762c = str2;
            this.f1763d = obj;
        }

        public void success(Object obj) {
            this.f1760a = obj;
        }
    }

    public C2026c(Map<String, Object> map, boolean z) {
        this.f1757a = map;
        this.f1759c = z;
    }

    /* renamed from: a */
    public <T> T mo16637a(String str) {
        return this.f1757a.get(str);
    }

    /* renamed from: c */
    public boolean mo16631c() {
        return this.f1759c;
    }

    /* renamed from: i */
    public C2032g mo16628i() {
        return this.f1758b;
    }

    /* renamed from: j */
    public String mo16638j() {
        return (String) this.f1757a.get("method");
    }

    /* renamed from: k */
    public Map<String, Object> mo16639k() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f1758b.f1761b);
        hashMap2.put("message", this.f1758b.f1762c);
        hashMap2.put("data", this.f1758b.f1763d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: l */
    public Map<String, Object> mo16640l() {
        HashMap hashMap = new HashMap();
        hashMap.put(BundleJUnitUtils.KEY_RESULT, this.f1758b.f1760a);
        return hashMap;
    }

    /* renamed from: m */
    public void mo16641m(C9017j.C9022d dVar) {
        C2027a aVar = this.f1758b;
        dVar.error(aVar.f1761b, aVar.f1762c, aVar.f1763d);
    }

    /* renamed from: n */
    public void mo16642n(List<Map<String, Object>> list) {
        if (!mo16631c()) {
            list.add(mo16639k());
        }
    }

    /* renamed from: o */
    public void mo16643o(List<Map<String, Object>> list) {
        if (!mo16631c()) {
            list.add(mo16640l());
        }
    }
}

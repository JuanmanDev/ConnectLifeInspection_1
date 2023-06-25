package p648m.p684g.p686e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p648m.p684g.C9804a;
import p648m.p684g.C9805b;
import p648m.p684g.p685d.C9809c;

/* renamed from: m.g.e.d */
/* compiled from: SubstituteLoggerFactory */
public class C9813d implements C9804a {

    /* renamed from: a */
    public boolean f19080a = false;

    /* renamed from: b */
    public final Map<String, C9812c> f19081b = new HashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue<C9809c> f19082c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public synchronized C9805b mo50699a(String str) {
        C9812c cVar;
        cVar = this.f19081b.get(str);
        if (cVar == null) {
            cVar = new C9812c(str, this.f19082c, this.f19080a);
            this.f19081b.put(str, cVar);
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo50730b() {
        this.f19081b.clear();
        this.f19082c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue<C9809c> mo50731c() {
        return this.f19082c;
    }

    /* renamed from: d */
    public List<C9812c> mo50732d() {
        return new ArrayList(this.f19081b.values());
    }

    /* renamed from: e */
    public void mo50733e() {
        this.f19080a = true;
    }
}

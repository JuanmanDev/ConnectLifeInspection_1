package p040c.p077d.p078a.p081k.p084j;

import com.bumptech.glide.Priority;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.C1543e;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1646h;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p091l.C1799b;

/* renamed from: c.d.a.k.j.g */
/* compiled from: DecodeHelper */
public final class C1645g<Transcode> {

    /* renamed from: a */
    public final List<C1756n.C1757a<?>> f1031a = new ArrayList();

    /* renamed from: b */
    public final List<C1567c> f1032b = new ArrayList();

    /* renamed from: c */
    public C1543e f1033c;

    /* renamed from: d */
    public Object f1034d;

    /* renamed from: e */
    public int f1035e;

    /* renamed from: f */
    public int f1036f;

    /* renamed from: g */
    public Class<?> f1037g;

    /* renamed from: h */
    public C1646h.C1651e f1038h;

    /* renamed from: i */
    public C1571e f1039i;

    /* renamed from: j */
    public Map<Class<?>, C1574h<?>> f1040j;

    /* renamed from: k */
    public Class<Transcode> f1041k;

    /* renamed from: l */
    public boolean f1042l;

    /* renamed from: m */
    public boolean f1043m;

    /* renamed from: n */
    public C1567c f1044n;

    /* renamed from: o */
    public Priority f1045o;

    /* renamed from: p */
    public C1657j f1046p;

    /* renamed from: q */
    public boolean f1047q;

    /* renamed from: r */
    public boolean f1048r;

    /* renamed from: a */
    public void mo15749a() {
        this.f1033c = null;
        this.f1034d = null;
        this.f1044n = null;
        this.f1037g = null;
        this.f1041k = null;
        this.f1039i = null;
        this.f1045o = null;
        this.f1040j = null;
        this.f1046p = null;
        this.f1031a.clear();
        this.f1042l = false;
        this.f1032b.clear();
        this.f1043m = false;
    }

    /* renamed from: b */
    public C1692b mo15750b() {
        return this.f1033c.mo15467b();
    }

    /* renamed from: c */
    public List<C1567c> mo15751c() {
        if (!this.f1043m) {
            this.f1043m = true;
            this.f1032b.clear();
            List<C1756n.C1757a<?>> g = mo15755g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C1756n.C1757a aVar = g.get(i);
                if (!this.f1032b.contains(aVar.f1308a)) {
                    this.f1032b.add(aVar.f1308a);
                }
                for (int i2 = 0; i2 < aVar.f1309b.size(); i2++) {
                    if (!this.f1032b.contains(aVar.f1309b.get(i2))) {
                        this.f1032b.add(aVar.f1309b.get(i2));
                    }
                }
            }
        }
        return this.f1032b;
    }

    /* renamed from: d */
    public C1609a mo15752d() {
        return this.f1038h.mo15808a();
    }

    /* renamed from: e */
    public C1657j mo15753e() {
        return this.f1046p;
    }

    /* renamed from: f */
    public int mo15754f() {
        return this.f1036f;
    }

    /* renamed from: g */
    public List<C1756n.C1757a<?>> mo15755g() {
        if (!this.f1042l) {
            this.f1042l = true;
            this.f1031a.clear();
            List i = this.f1033c.mo15473h().mo21646i(this.f1034d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1756n.C1757a b = ((C1756n) i.get(i2)).mo15974b(this.f1034d, this.f1035e, this.f1036f, this.f1039i);
                if (b != null) {
                    this.f1031a.add(b);
                }
            }
        }
        return this.f1031a;
    }

    /* renamed from: h */
    public <Data> C1682s<Data, ?, Transcode> mo15756h(Class<Data> cls) {
        return this.f1033c.mo15473h().mo21645h(cls, this.f1037g, this.f1041k);
    }

    /* renamed from: i */
    public Class<?> mo15757i() {
        return this.f1034d.getClass();
    }

    /* renamed from: j */
    public List<C1756n<File, ?>> mo15758j(File file) {
        return this.f1033c.mo15473h().mo21646i(file);
    }

    /* renamed from: k */
    public C1571e mo15759k() {
        return this.f1039i;
    }

    /* renamed from: l */
    public Priority mo15760l() {
        return this.f1045o;
    }

    /* renamed from: m */
    public List<Class<?>> mo15761m() {
        return this.f1033c.mo15473h().mo21647j(this.f1034d.getClass(), this.f1037g, this.f1041k);
    }

    /* renamed from: n */
    public <Z> C1573g<Z> mo15762n(C1685u<Z> uVar) {
        return this.f1033c.mo15473h().mo21648k(uVar);
    }

    /* renamed from: o */
    public C1567c mo15763o() {
        return this.f1044n;
    }

    /* renamed from: p */
    public <X> C1565a<X> mo15764p(X x) {
        return this.f1033c.mo15473h().mo21650m(x);
    }

    /* renamed from: q */
    public Class<?> mo15765q() {
        return this.f1041k;
    }

    /* renamed from: r */
    public <Z> C1574h<Z> mo15766r(Class<Z> cls) {
        C1574h<Z> hVar = this.f1040j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, C1574h<?>>> it = this.f1040j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    hVar = (C1574h) next.getValue();
                    break;
                }
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (!this.f1040j.isEmpty() || !this.f1047q) {
            return C1799b.m1972c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: s */
    public int mo15767s() {
        return this.f1035e;
    }

    /* renamed from: t */
    public boolean mo15768t(Class<?> cls) {
        return mo15756h(cls) != null;
    }

    /* renamed from: u */
    public <R> void mo15769u(C1543e eVar, Object obj, C1567c cVar, int i, int i2, C1657j jVar, Class<?> cls, Class<R> cls2, Priority priority, C1571e eVar2, Map<Class<?>, C1574h<?>> map, boolean z, boolean z2, C1646h.C1651e eVar3) {
        this.f1033c = eVar;
        this.f1034d = obj;
        this.f1044n = cVar;
        this.f1035e = i;
        this.f1036f = i2;
        this.f1046p = jVar;
        this.f1037g = cls;
        this.f1038h = eVar3;
        this.f1041k = cls2;
        this.f1045o = priority;
        this.f1039i = eVar2;
        this.f1040j = map;
        this.f1047q = z;
        this.f1048r = z2;
    }

    /* renamed from: v */
    public boolean mo15770v(C1685u<?> uVar) {
        return this.f1033c.mo15473h().mo21651n(uVar);
    }

    /* renamed from: w */
    public boolean mo15771w() {
        return this.f1048r;
    }

    /* renamed from: x */
    public boolean mo15772x(C1567c cVar) {
        List<C1756n.C1757a<?>> g = mo15755g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f1308a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }
}

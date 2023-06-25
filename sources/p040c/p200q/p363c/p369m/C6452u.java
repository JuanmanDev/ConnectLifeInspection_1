package p040c.p200q.p363c.p369m;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: c.q.c.m.u */
/* compiled from: CycleDetector */
public class C6452u {

    /* renamed from: c.q.c.m.u$b */
    /* compiled from: CycleDetector */
    public static class C6454b {

        /* renamed from: a */
        public final C6439o<?> f12141a;

        /* renamed from: b */
        public final Set<C6454b> f12142b = new HashSet();

        /* renamed from: c */
        public final Set<C6454b> f12143c = new HashSet();

        public C6454b(C6439o<?> oVar) {
            this.f12141a = oVar;
        }

        /* renamed from: a */
        public void mo30576a(C6454b bVar) {
            this.f12142b.add(bVar);
        }

        /* renamed from: b */
        public void mo30577b(C6454b bVar) {
            this.f12143c.add(bVar);
        }

        /* renamed from: c */
        public C6439o<?> mo30578c() {
            return this.f12141a;
        }

        /* renamed from: d */
        public Set<C6454b> mo30579d() {
            return this.f12142b;
        }

        /* renamed from: e */
        public boolean mo30580e() {
            return this.f12142b.isEmpty();
        }

        /* renamed from: f */
        public boolean mo30581f() {
            return this.f12143c.isEmpty();
        }

        /* renamed from: g */
        public void mo30582g(C6454b bVar) {
            this.f12143c.remove(bVar);
        }
    }

    /* renamed from: c.q.c.m.u$c */
    /* compiled from: CycleDetector */
    public static class C6455c {

        /* renamed from: a */
        public final Class<?> f12144a;

        /* renamed from: b */
        public final boolean f12145b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C6455c)) {
                return false;
            }
            C6455c cVar = (C6455c) obj;
            if (!cVar.f12144a.equals(this.f12144a) || cVar.f12145b != this.f12145b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f12144a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f12145b).hashCode();
        }

        public C6455c(Class<?> cls, boolean z) {
            this.f12144a = cls;
            this.f12145b = z;
        }
    }

    /* renamed from: a */
    public static void m18029a(List<C6439o<?>> list) {
        Set<C6454b> c = m18031c(list);
        Set<C6454b> b = m18030b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C6454b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C6454b next2 : next.mo30579d()) {
                next2.mo30582g(next);
                if (next2.mo30581f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C6454b next3 : c) {
                if (!next3.mo30581f() && !next3.mo30580e()) {
                    arrayList.add(next3.mo30578c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    public static Set<C6454b> m18030b(Set<C6454b> set) {
        HashSet hashSet = new HashSet();
        for (C6454b next : set) {
            if (next.mo30581f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C6454b> m18031c(List<C6439o<?>> list) {
        Set<C6454b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C6439o next : list) {
            C6454b bVar = new C6454b(next);
            Iterator it = next.mo30543f().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C6455c cVar = new C6455c(cls, !next.mo30547l());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f12145b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C6454b> it2 : hashMap.values()) {
            for (C6454b bVar2 : it2) {
                for (C6456v next2 : bVar2.mo30578c().mo30540c()) {
                    if (next2.mo30587e() && (set = (Set) hashMap.get(new C6455c(next2.mo30585c(), next2.mo30590g()))) != null) {
                        for (C6454b bVar3 : set) {
                            bVar2.mo30576a(bVar3);
                            bVar3.mo30577b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}

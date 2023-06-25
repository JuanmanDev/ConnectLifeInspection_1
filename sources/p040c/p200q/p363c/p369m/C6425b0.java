package p040c.p200q.p363c.p369m;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p040c.p200q.p363c.p389r.C6736a;
import p040c.p200q.p363c.p389r.C6738c;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.b0 */
/* compiled from: RestrictedComponentContainer */
public final class C6425b0 extends C6438n {

    /* renamed from: a */
    public final Set<Class<?>> f12086a;

    /* renamed from: b */
    public final Set<Class<?>> f12087b;

    /* renamed from: c */
    public final Set<Class<?>> f12088c;

    /* renamed from: d */
    public final Set<Class<?>> f12089d;

    /* renamed from: e */
    public final Set<Class<?>> f12090e;

    /* renamed from: f */
    public final Set<Class<?>> f12091f;

    /* renamed from: g */
    public final C6442p f12092g;

    /* renamed from: c.q.c.m.b0$a */
    /* compiled from: RestrictedComponentContainer */
    public static class C6426a implements C6738c {

        /* renamed from: a */
        public final Set<Class<?>> f12093a;

        /* renamed from: b */
        public final C6738c f12094b;

        public C6426a(Set<Class<?>> set, C6738c cVar) {
            this.f12093a = set;
            this.f12094b = cVar;
        }

        /* renamed from: c */
        public void mo30534c(C6736a<?> aVar) {
            if (this.f12093a.contains(aVar.mo31407b())) {
                this.f12094b.mo30534c(aVar);
            } else {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    public C6425b0(C6439o<?> oVar, C6442p pVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C6456v next : oVar.mo30540c()) {
            if (next.mo30587e()) {
                if (next.mo30590g()) {
                    hashSet4.add(next.mo30585c());
                } else {
                    hashSet.add(next.mo30585c());
                }
            } else if (next.mo30586d()) {
                hashSet3.add(next.mo30585c());
            } else if (next.mo30590g()) {
                hashSet5.add(next.mo30585c());
            } else {
                hashSet2.add(next.mo30585c());
            }
        }
        if (!oVar.mo30544g().isEmpty()) {
            hashSet.add(C6738c.class);
        }
        this.f12086a = Collections.unmodifiableSet(hashSet);
        this.f12087b = Collections.unmodifiableSet(hashSet2);
        this.f12088c = Collections.unmodifiableSet(hashSet3);
        this.f12089d = Collections.unmodifiableSet(hashSet4);
        this.f12090e = Collections.unmodifiableSet(hashSet5);
        this.f12091f = oVar.mo30544g();
        this.f12092g = pVar;
    }

    /* renamed from: a */
    public <T> T mo30529a(Class<T> cls) {
        if (this.f12086a.contains(cls)) {
            T a = this.f12092g.mo30529a(cls);
            if (!cls.equals(C6738c.class)) {
                return a;
            }
            return new C6426a(this.f12091f, (C6738c) a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C6757b<T> mo30530b(Class<T> cls) {
        if (this.f12087b.contains(cls)) {
            return this.f12092g.mo30530b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C6757b<Set<T>> mo30531c(Class<T> cls) {
        if (this.f12090e.contains(cls)) {
            return this.f12092g.mo30531c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo30532d(Class<T> cls) {
        if (this.f12089d.contains(cls)) {
            return this.f12092g.mo30532d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: e */
    public <T> C6755a<T> mo30533e(Class<T> cls) {
        if (this.f12088c.contains(cls)) {
            return this.f12092g.mo30533e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}

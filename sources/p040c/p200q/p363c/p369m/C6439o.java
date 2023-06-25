package p040c.p200q.p363c.p369m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.q.c.m.o */
/* compiled from: Component */
public final class C6439o<T> {

    /* renamed from: a */
    public final String f12111a;

    /* renamed from: b */
    public final Set<Class<? super T>> f12112b;

    /* renamed from: c */
    public final Set<C6456v> f12113c;

    /* renamed from: d */
    public final int f12114d;

    /* renamed from: e */
    public final int f12115e;

    /* renamed from: f */
    public final C6447r<T> f12116f;

    /* renamed from: g */
    public final Set<Class<?>> f12117g;

    /* renamed from: c.q.c.m.o$b */
    /* compiled from: Component */
    public static class C6441b<T> {

        /* renamed from: a */
        public String f12118a;

        /* renamed from: b */
        public final Set<Class<? super T>> f12119b;

        /* renamed from: c */
        public final Set<C6456v> f12120c;

        /* renamed from: d */
        public int f12121d;

        /* renamed from: e */
        public int f12122e;

        /* renamed from: f */
        public C6447r<T> f12123f;

        /* renamed from: g */
        public Set<Class<?>> f12124g;

        /* renamed from: b */
        public C6441b<T> mo30550b(C6456v vVar) {
            C6423a0.m17953c(vVar, "Null dependency");
            mo30558j(vVar.mo30585c());
            this.f12120c.add(vVar);
            return this;
        }

        /* renamed from: c */
        public C6441b<T> mo30551c() {
            mo30557i(1);
            return this;
        }

        /* renamed from: d */
        public C6439o<T> mo30552d() {
            C6423a0.m17954d(this.f12123f != null, "Missing required property: factory.");
            return new C6439o(this.f12118a, new HashSet(this.f12119b), new HashSet(this.f12120c), this.f12121d, this.f12122e, this.f12123f, this.f12124g);
        }

        /* renamed from: e */
        public C6441b<T> mo30553e() {
            mo30557i(2);
            return this;
        }

        /* renamed from: f */
        public C6441b<T> mo30554f(C6447r<T> rVar) {
            C6423a0.m17953c(rVar, "Null factory");
            this.f12123f = rVar;
            return this;
        }

        /* renamed from: g */
        public final C6441b<T> mo30555g() {
            this.f12122e = 1;
            return this;
        }

        /* renamed from: h */
        public C6441b<T> mo30556h(@NonNull String str) {
            this.f12118a = str;
            return this;
        }

        /* renamed from: i */
        public final C6441b<T> mo30557i(int i) {
            C6423a0.m17954d(this.f12121d == 0, "Instantiation type has already been set.");
            this.f12121d = i;
            return this;
        }

        /* renamed from: j */
        public final void mo30558j(Class<?> cls) {
            C6423a0.m17951a(!this.f12119b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public C6441b(Class<T> cls, Class<? super T>... clsArr) {
            this.f12118a = null;
            this.f12119b = new HashSet();
            this.f12120c = new HashSet();
            this.f12121d = 0;
            this.f12122e = 0;
            this.f12124g = new HashSet();
            C6423a0.m17953c(cls, "Null interface");
            this.f12119b.add(cls);
            for (Class<? super T> c : clsArr) {
                C6423a0.m17953c(c, "Null interface");
            }
            Collections.addAll(this.f12119b, clsArr);
        }
    }

    /* renamed from: a */
    public static <T> C6441b<T> m17967a(Class<T> cls) {
        return new C6441b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C6441b<T> m17968b(Class<T> cls, Class<? super T>... clsArr) {
        return new C6441b<>(cls, clsArr);
    }

    /* renamed from: h */
    public static <T> C6439o<T> m17969h(T t, Class<T> cls) {
        C6441b<T> i = m17970i(cls);
        i.mo30554f(new C6424b(t));
        return i.mo30552d();
    }

    /* renamed from: i */
    public static <T> C6441b<T> m17970i(Class<T> cls) {
        C6441b<T> a = m17967a(cls);
        C6441b unused = a.mo30555g();
        return a;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m17971m(Object obj, C6442p pVar) {
        return obj;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m17972n(Object obj, C6442p pVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: o */
    public static <T> C6439o<T> m17973o(T t, Class<T> cls, Class<? super T>... clsArr) {
        C6441b<T> b = m17968b(cls, clsArr);
        b.mo30554f(new C6422a(t));
        return b.mo30552d();
    }

    /* renamed from: c */
    public Set<C6456v> mo30540c() {
        return this.f12113c;
    }

    /* renamed from: d */
    public C6447r<T> mo30541d() {
        return this.f12116f;
    }

    @Nullable
    /* renamed from: e */
    public String mo30542e() {
        return this.f12111a;
    }

    /* renamed from: f */
    public Set<Class<? super T>> mo30543f() {
        return this.f12112b;
    }

    /* renamed from: g */
    public Set<Class<?>> mo30544g() {
        return this.f12117g;
    }

    /* renamed from: j */
    public boolean mo30545j() {
        return this.f12114d == 1;
    }

    /* renamed from: k */
    public boolean mo30546k() {
        return this.f12114d == 2;
    }

    /* renamed from: l */
    public boolean mo30547l() {
        return this.f12115e == 0;
    }

    /* renamed from: p */
    public C6439o<T> mo30548p(C6447r<T> rVar) {
        return new C6439o(this.f12111a, this.f12112b, this.f12113c, this.f12114d, this.f12115e, rVar, this.f12117g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f12112b.toArray()) + ">{" + this.f12114d + ", type=" + this.f12115e + ", deps=" + Arrays.toString(this.f12113c.toArray()) + "}";
    }

    public C6439o(@Nullable String str, Set<Class<? super T>> set, Set<C6456v> set2, int i, int i2, C6447r<T> rVar, Set<Class<?>> set3) {
        this.f12111a = str;
        this.f12112b = Collections.unmodifiableSet(set);
        this.f12113c = Collections.unmodifiableSet(set2);
        this.f12114d = i;
        this.f12115e = i2;
        this.f12116f = rVar;
        this.f12117g = Collections.unmodifiableSet(set3);
    }
}

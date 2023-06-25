package p040c.p077d.p078a.p081k.p084j.p088z;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.z.j */
/* compiled from: LruArrayPool */
public final class C1703j implements C1692b {

    /* renamed from: a */
    public final C1700h<C1704a, Object> f1234a = new C1700h<>();

    /* renamed from: b */
    public final C1705b f1235b = new C1705b();

    /* renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f1236c = new HashMap();

    /* renamed from: d */
    public final Map<Class<?>, C1691a<?>> f1237d = new HashMap();

    /* renamed from: e */
    public final int f1238e;

    /* renamed from: f */
    public int f1239f;

    /* renamed from: c.d.a.k.j.z.j$a */
    /* compiled from: LruArrayPool */
    public static final class C1704a implements C1710m {

        /* renamed from: a */
        public final C1705b f1240a;

        /* renamed from: b */
        public int f1241b;

        /* renamed from: c */
        public Class<?> f1242c;

        public C1704a(C1705b bVar) {
            this.f1240a = bVar;
        }

        /* renamed from: a */
        public void mo15910a() {
            this.f1240a.mo15919c(this);
        }

        /* renamed from: b */
        public void mo15949b(int i, Class<?> cls) {
            this.f1241b = i;
            this.f1242c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1704a)) {
                return false;
            }
            C1704a aVar = (C1704a) obj;
            if (this.f1241b == aVar.f1241b && this.f1242c == aVar.f1242c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f1241b * 31;
            Class<?> cls = this.f1242c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f1241b + "array=" + this.f1242c + '}';
        }
    }

    /* renamed from: c.d.a.k.j.z.j$b */
    /* compiled from: LruArrayPool */
    public static final class C1705b extends C1696d<C1704a> {
        /* renamed from: d */
        public C1704a mo15915a() {
            return new C1704a(this);
        }

        /* renamed from: e */
        public C1704a mo15954e(int i, Class<?> cls) {
            C1704a aVar = (C1704a) mo15918b();
            aVar.mo15949b(i, cls);
            return aVar;
        }
    }

    public C1703j(int i) {
        this.f1238e = i;
    }

    /* renamed from: a */
    public synchronized void mo15898a(int i) {
        if (i >= 40) {
            try {
                mo15899b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo15940g(this.f1238e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo15899b() {
        mo15940g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo15900c(int i, Class<T> cls) {
        return mo15944k(this.f1235b.mo15954e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo15901d(int i, Class<T> cls) {
        C1704a aVar;
        Integer ceilingKey = mo15945l(cls).ceilingKey(Integer.valueOf(i));
        if (mo15948o(i, ceilingKey)) {
            aVar = this.f1235b.mo15954e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f1235b.mo15954e(i, cls);
        }
        return mo15944k(aVar, cls);
    }

    /* renamed from: e */
    public final void mo15938e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = mo15945l(cls);
        Integer num = (Integer) l.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            l.remove(Integer.valueOf(i));
        } else {
            l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    public final void mo15939f() {
        mo15940g(this.f1238e);
    }

    /* renamed from: g */
    public final void mo15940g(int i) {
        while (this.f1239f > i) {
            Object f = this.f1234a.mo15931f();
            C1949i.m2563d(f);
            C1691a h = mo15941h(f);
            this.f1239f -= h.mo15895b(f) * h.mo15894a();
            mo15938e(h.mo15895b(f), f.getClass());
            if (Log.isLoggable(h.getTag(), 2)) {
                h.getTag();
                "evicted: " + h.mo15895b(f);
            }
        }
    }

    /* renamed from: h */
    public final <T> C1691a<T> mo15941h(T t) {
        return mo15942i(t.getClass());
    }

    /* renamed from: i */
    public final <T> C1691a<T> mo15942i(Class<T> cls) {
        C1691a<T> aVar = this.f1237d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C1702i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C1699g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f1237d.put(cls, aVar);
        }
        return aVar;
    }

    @Nullable
    /* renamed from: j */
    public final <T> T mo15943j(C1704a aVar) {
        return this.f1234a.mo15927a(aVar);
    }

    /* renamed from: k */
    public final <T> T mo15944k(C1704a aVar, Class<T> cls) {
        C1691a<T> i = mo15942i(cls);
        T j = mo15943j(aVar);
        if (j != null) {
            this.f1239f -= i.mo15895b(j) * i.mo15894a();
            mo15938e(i.mo15895b(j), cls);
        }
        if (j != null) {
            return j;
        }
        if (Log.isLoggable(i.getTag(), 2)) {
            i.getTag();
            "Allocated " + aVar.f1241b + " bytes";
        }
        return i.newArray(aVar.f1241b);
    }

    /* renamed from: l */
    public final NavigableMap<Integer, Integer> mo15945l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f1236c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1236c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean mo15946m() {
        int i = this.f1239f;
        return i == 0 || this.f1238e / i >= 2;
    }

    /* renamed from: n */
    public final boolean mo15947n(int i) {
        return i <= this.f1238e / 2;
    }

    /* renamed from: o */
    public final boolean mo15948o(int i, Integer num) {
        return num != null && (mo15946m() || num.intValue() <= i * 8);
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C1691a<?> i = mo15942i(cls);
        int b = i.mo15895b(t);
        int a = i.mo15894a() * b;
        if (mo15947n(a)) {
            C1704a e = this.f1235b.mo15954e(b, cls);
            this.f1234a.mo15930d(e, t);
            NavigableMap<Integer, Integer> l = mo15945l(cls);
            Integer num = (Integer) l.get(Integer.valueOf(e.f1241b));
            Integer valueOf = Integer.valueOf(e.f1241b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            l.put(valueOf, Integer.valueOf(i2));
            this.f1239f += a;
            mo15939f();
        }
    }
}

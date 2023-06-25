package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.k.r */
/* compiled from: MultiModelLoaderFactory */
public class C1764r {

    /* renamed from: e */
    public static final C1767c f1324e = new C1767c();

    /* renamed from: f */
    public static final C1756n<Object, Object> f1325f = new C1765a();

    /* renamed from: a */
    public final List<C1766b<?, ?>> f1326a;

    /* renamed from: b */
    public final C1767c f1327b;

    /* renamed from: c */
    public final Set<C1766b<?, ?>> f1328c;

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f1329d;

    /* renamed from: c.d.a.k.k.r$a */
    /* compiled from: MultiModelLoaderFactory */
    public static class C1765a implements C1756n<Object, Object> {
        /* renamed from: a */
        public boolean mo15973a(@NonNull Object obj) {
            return false;
        }

        @Nullable
        /* renamed from: b */
        public C1756n.C1757a<Object> mo15974b(@NonNull Object obj, int i, int i2, @NonNull C1571e eVar) {
            return null;
        }
    }

    /* renamed from: c.d.a.k.k.r$b */
    /* compiled from: MultiModelLoaderFactory */
    public static class C1766b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f1330a;

        /* renamed from: b */
        public final Class<Data> f1331b;

        /* renamed from: c */
        public final C1758o<? extends Model, ? extends Data> f1332c;

        public C1766b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1758o<? extends Model, ? extends Data> oVar) {
            this.f1330a = cls;
            this.f1331b = cls2;
            this.f1332c = oVar;
        }

        /* renamed from: a */
        public boolean mo16045a(@NonNull Class<?> cls) {
            return this.f1330a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo16046b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return mo16045a(cls) && this.f1331b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: c.d.a.k.k.r$c */
    /* compiled from: MultiModelLoaderFactory */
    public static class C1767c {
        @NonNull
        /* renamed from: a */
        public <Model, Data> C1762q<Model, Data> mo16047a(@NonNull List<C1756n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new C1762q<>(list, pool);
        }
    }

    public C1764r(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f1324e);
    }

    @NonNull
    /* renamed from: f */
    public static <Model, Data> C1756n<Model, Data> m1886f() {
        return f1325f;
    }

    /* renamed from: a */
    public final <Model, Data> void mo16039a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1758o<? extends Model, ? extends Data> oVar, boolean z) {
        C1766b bVar = new C1766b(cls, cls2, oVar);
        List<C1766b<?, ?>> list = this.f1326a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo16040b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1758o<? extends Model, ? extends Data> oVar) {
        mo16039a(cls, cls2, oVar, true);
    }

    @NonNull
    /* renamed from: c */
    public final <Model, Data> C1756n<Model, Data> mo16041c(@NonNull C1766b<?, ?> bVar) {
        C1756n<? extends Model, ? extends Data> b = bVar.f1332c.mo15978b(this);
        C1949i.m2563d(b);
        return b;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <Model, Data> C1756n<Model, Data> mo16042d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1766b next : this.f1326a) {
                if (this.f1328c.contains(next)) {
                    z = true;
                } else if (next.mo16046b(cls, cls2)) {
                    this.f1328c.add(next);
                    arrayList.add(mo16041c(next));
                    this.f1328c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f1327b.mo16047a(arrayList, this.f1329d);
            } else if (arrayList.size() == 1) {
                return (C1756n) arrayList.get(0);
            } else if (z) {
                return m1886f();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f1328c.clear();
            throw th;
        }
    }

    @NonNull
    /* renamed from: e */
    public synchronized <Model> List<C1756n<Model, ?>> mo16043e(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1766b next : this.f1326a) {
                if (!this.f1328c.contains(next)) {
                    if (next.mo16045a(cls)) {
                        this.f1328c.add(next);
                        arrayList.add(mo16041c(next));
                        this.f1328c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f1328c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: g */
    public synchronized List<Class<?>> mo16044g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1766b next : this.f1326a) {
            if (!arrayList.contains(next.f1331b) && next.mo16045a(cls)) {
                arrayList.add(next.f1331b);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    public C1764r(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull C1767c cVar) {
        this.f1326a = new ArrayList();
        this.f1328c = new HashSet();
        this.f1329d = pool;
        this.f1327b = cVar;
    }
}

package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.d.a.k.k.p */
/* compiled from: ModelLoaderRegistry */
public class C1759p {

    /* renamed from: a */
    public final C1764r f1311a;

    /* renamed from: b */
    public final C1760a f1312b;

    /* renamed from: c.d.a.k.k.p$a */
    /* compiled from: ModelLoaderRegistry */
    public static class C1760a {

        /* renamed from: a */
        public final Map<Class<?>, C1761a<?>> f1313a = new HashMap();

        /* renamed from: c.d.a.k.k.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        public static class C1761a<Model> {

            /* renamed from: a */
            public final List<C1756n<Model, ?>> f1314a;

            public C1761a(List<C1756n<Model, ?>> list) {
                this.f1314a = list;
            }
        }

        /* renamed from: a */
        public void mo16034a() {
            this.f1313a.clear();
        }

        @Nullable
        /* renamed from: b */
        public <Model> List<C1756n<Model, ?>> mo16035b(Class<Model> cls) {
            C1761a aVar = this.f1313a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f1314a;
        }

        /* renamed from: c */
        public <Model> void mo16036c(Class<Model> cls, List<C1756n<Model, ?>> list) {
            if (this.f1313a.put(cls, new C1761a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C1759p(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new C1764r(pool));
    }

    @NonNull
    /* renamed from: b */
    public static <A> Class<A> m1869b(@NonNull A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo16030a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1758o<? extends Model, ? extends Data> oVar) {
        this.f1311a.mo16040b(cls, cls2, oVar);
        this.f1312b.mo16034a();
    }

    @NonNull
    /* renamed from: c */
    public synchronized List<Class<?>> mo16031c(@NonNull Class<?> cls) {
        return this.f1311a.mo16044g(cls);
    }

    @NonNull
    /* renamed from: d */
    public <A> List<C1756n<A, ?>> mo16032d(@NonNull A a) {
        List e = mo16033e(m1869b(a));
        int size = e.size();
        List<C1756n<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C1756n nVar = (C1756n) e.get(i);
            if (nVar.mo15973a(a)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        return emptyList;
    }

    @NonNull
    /* renamed from: e */
    public final synchronized <A> List<C1756n<A, ?>> mo16033e(@NonNull Class<A> cls) {
        List<C1756n<A, ?>> b;
        b = this.f1312b.mo16035b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f1311a.mo16043e(cls));
            this.f1312b.mo16036c(cls, b);
        }
        return b;
    }

    public C1759p(@NonNull C1764r rVar) {
        this.f1312b = new C1760a();
        this.f1311a = rVar;
    }
}

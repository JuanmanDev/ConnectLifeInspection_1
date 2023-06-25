package p040c.p077d.p078a.p105q.p106k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.d.a.q.k.a */
/* compiled from: FactoryPools */
public final class C1952a {

    /* renamed from: a */
    public static final C1959g<Object> f1640a = new C1953a();

    /* renamed from: c.d.a.q.k.a$a */
    /* compiled from: FactoryPools */
    public class C1953a implements C1959g<Object> {
        /* renamed from: a */
        public void mo16451a(@NonNull Object obj) {
        }
    }

    /* renamed from: c.d.a.q.k.a$b */
    /* compiled from: FactoryPools */
    public class C1954b implements C1956d<List<T>> {
        @NonNull
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* renamed from: c.d.a.q.k.a$c */
    /* compiled from: FactoryPools */
    public class C1955c implements C1959g<List<T>> {
        /* renamed from: b */
        public void mo16451a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* renamed from: c.d.a.q.k.a$d */
    /* compiled from: FactoryPools */
    public interface C1956d<T> {
        T create();
    }

    /* renamed from: c.d.a.q.k.a$e */
    /* compiled from: FactoryPools */
    public static final class C1957e<T> implements Pools.Pool<T> {

        /* renamed from: a */
        public final C1956d<T> f1641a;

        /* renamed from: b */
        public final C1959g<T> f1642b;

        /* renamed from: c */
        public final Pools.Pool<T> f1643c;

        public C1957e(@NonNull Pools.Pool<T> pool, @NonNull C1956d<T> dVar, @NonNull C1959g<T> gVar) {
            this.f1643c = pool;
            this.f1641a = dVar;
            this.f1642b = gVar;
        }

        public T acquire() {
            T acquire = this.f1643c.acquire();
            if (acquire == null) {
                acquire = this.f1641a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    "Created new " + acquire.getClass();
                }
            }
            if (acquire instanceof C1958f) {
                ((C1958f) acquire).mo15723i().mo16454b(false);
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            if (t instanceof C1958f) {
                ((C1958f) t).mo15723i().mo16454b(true);
            }
            this.f1642b.mo16451a(t);
            return this.f1643c.release(t);
        }
    }

    /* renamed from: c.d.a.q.k.a$f */
    /* compiled from: FactoryPools */
    public interface C1958f {
        @NonNull
        /* renamed from: i */
        C1961c mo15723i();
    }

    /* renamed from: c.d.a.q.k.a$g */
    /* compiled from: FactoryPools */
    public interface C1959g<T> {
        /* renamed from: a */
        void mo16451a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    public static <T extends C1958f> Pools.Pool<T> m2585a(@NonNull Pools.Pool<T> pool, @NonNull C1956d<T> dVar) {
        return m2586b(pool, dVar, m2587c());
    }

    @NonNull
    /* renamed from: b */
    public static <T> Pools.Pool<T> m2586b(@NonNull Pools.Pool<T> pool, @NonNull C1956d<T> dVar, @NonNull C1959g<T> gVar) {
        return new C1957e(pool, dVar, gVar);
    }

    @NonNull
    /* renamed from: c */
    public static <T> C1959g<T> m2587c() {
        return f1640a;
    }

    @NonNull
    /* renamed from: d */
    public static <T extends C1958f> Pools.Pool<T> m2588d(int i, @NonNull C1956d<T> dVar) {
        return m2585a(new Pools.SynchronizedPool(i), dVar);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Pools.Pool<List<T>> m2589e() {
        return m2590f(20);
    }

    @NonNull
    /* renamed from: f */
    public static <T> Pools.Pool<List<T>> m2590f(int i) {
        return m2586b(new Pools.SynchronizedPool(i), new C1954b(), new C1955c());
    }
}

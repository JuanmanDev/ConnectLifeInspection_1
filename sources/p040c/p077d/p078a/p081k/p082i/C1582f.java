package p040c.p077d.p078a.p081k.p082i;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.i.f */
/* compiled from: DataRewinderRegistry */
public class C1582f {

    /* renamed from: b */
    public static final C1580e.C1581a<?> f928b = new C1583a();

    /* renamed from: a */
    public final Map<Class<?>, C1580e.C1581a<?>> f929a = new HashMap();

    /* renamed from: c.d.a.k.i.f$a */
    /* compiled from: DataRewinderRegistry */
    public class C1583a implements C1580e.C1581a<Object> {
        @NonNull
        /* renamed from: a */
        public Class<Object> mo15647a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @NonNull
        /* renamed from: b */
        public C1580e<Object> mo15648b(@NonNull Object obj) {
            return new C1584b(obj);
        }
    }

    /* renamed from: c.d.a.k.i.f$b */
    /* compiled from: DataRewinderRegistry */
    public static final class C1584b implements C1580e<Object> {

        /* renamed from: a */
        public final Object f930a;

        public C1584b(@NonNull Object obj) {
            this.f930a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo15645a() {
            return this.f930a;
        }

        /* renamed from: b */
        public void mo15646b() {
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <T> C1580e<T> mo15649a(@NonNull T t) {
        C1580e.C1581a<?> aVar;
        C1949i.m2563d(t);
        aVar = this.f929a.get(t.getClass());
        if (aVar == null) {
            Iterator<C1580e.C1581a<?>> it = this.f929a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1580e.C1581a<?> next = it.next();
                if (next.mo15647a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f928b;
        }
        return aVar.mo15648b(t);
    }

    /* renamed from: b */
    public synchronized void mo15650b(@NonNull C1580e.C1581a<?> aVar) {
        this.f929a.put(aVar.mo15647a(), aVar);
    }
}

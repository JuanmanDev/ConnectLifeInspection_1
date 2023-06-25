package p040c.p077d.p078a.p100n;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.util.Pools;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p077d.p078a.p081k.p084j.C1655i;
import p040c.p077d.p078a.p081k.p084j.C1682s;
import p040c.p077d.p078a.p081k.p091l.p097h.C1873g;
import p040c.p077d.p078a.p105q.C1948h;

/* renamed from: c.d.a.n.c */
/* compiled from: LoadPathCache */
public class C1901c {

    /* renamed from: c */
    public static final C1682s<?, ?, ?> f1511c = new C1682s(Object.class, Object.class, Object.class, Collections.singletonList(new C1655i(Object.class, Object.class, Object.class, Collections.emptyList(), new C1873g(), (Pools.Pool<List<Throwable>>) null)), (Pools.Pool<List<Throwable>>) null);

    /* renamed from: a */
    public final ArrayMap<C1948h, C1682s<?, ?, ?>> f1512a = new ArrayMap<>();

    /* renamed from: b */
    public final AtomicReference<C1948h> f1513b = new AtomicReference<>();

    @Nullable
    /* renamed from: a */
    public <Data, TResource, Transcode> C1682s<Data, TResource, Transcode> mo16245a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1682s<Data, TResource, Transcode> sVar;
        C1948h b = mo16246b(cls, cls2, cls3);
        synchronized (this.f1512a) {
            sVar = this.f1512a.get(b);
        }
        this.f1513b.set(b);
        return sVar;
    }

    /* renamed from: b */
    public final C1948h mo16246b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1948h andSet = this.f1513b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1948h();
        }
        andSet.mo16447a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: c */
    public boolean mo16247c(@Nullable C1682s<?, ?, ?> sVar) {
        return f1511c.equals(sVar);
    }

    /* renamed from: d */
    public void mo16248d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C1682s<?, ?, ?> sVar) {
        synchronized (this.f1512a) {
            ArrayMap<C1948h, C1682s<?, ?, ?>> arrayMap = this.f1512a;
            C1948h hVar = new C1948h(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f1511c;
            }
            arrayMap.put(hVar, sVar);
        }
    }
}

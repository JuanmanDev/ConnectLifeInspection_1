package p040c.p077d.p078a.p100n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p077d.p078a.p105q.C1948h;

/* renamed from: c.d.a.n.d */
/* compiled from: ModelToResourceClassCache */
public class C1902d {

    /* renamed from: a */
    public final AtomicReference<C1948h> f1514a = new AtomicReference<>();

    /* renamed from: b */
    public final ArrayMap<C1948h, List<Class<?>>> f1515b = new ArrayMap<>();

    @Nullable
    /* renamed from: a */
    public List<Class<?>> mo16249a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        C1948h andSet = this.f1514a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1948h(cls, cls2, cls3);
        } else {
            andSet.mo16447a(cls, cls2, cls3);
        }
        synchronized (this.f1515b) {
            list = this.f1515b.get(andSet);
        }
        this.f1514a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo16250b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f1515b) {
            this.f1515b.put(new C1948h(cls, cls2, cls3), list);
        }
    }
}

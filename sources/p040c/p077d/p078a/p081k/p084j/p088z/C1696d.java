package p040c.p077d.p078a.p081k.p084j.p088z;

import java.util.Queue;
import p040c.p077d.p078a.p081k.p084j.p088z.C1710m;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.j.z.d */
/* compiled from: BaseKeyPool */
public abstract class C1696d<T extends C1710m> {

    /* renamed from: a */
    public final Queue<T> f1227a = C1950j.m2569e(20);

    /* renamed from: a */
    public abstract T mo15915a();

    /* renamed from: b */
    public T mo15918b() {
        T t = (C1710m) this.f1227a.poll();
        return t == null ? mo15915a() : t;
    }

    /* renamed from: c */
    public void mo15919c(T t) {
        if (this.f1227a.size() < 20) {
            this.f1227a.offer(t);
        }
    }
}

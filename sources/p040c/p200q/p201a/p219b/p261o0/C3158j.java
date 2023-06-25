package p040c.p200q.p201a.p219b.p261o0;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c.q.a.b.o0.j */
/* compiled from: EventDispatcher */
public final class C3158j<T> {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C3160b<T>> f5837a = new CopyOnWriteArrayList<>();

    /* renamed from: c.q.a.b.o0.j$a */
    /* compiled from: EventDispatcher */
    public interface C3159a<T> {
        /* renamed from: a */
        void mo18438a(T t);
    }

    /* renamed from: c.q.a.b.o0.j$b */
    /* compiled from: EventDispatcher */
    public static final class C3160b<T> {

        /* renamed from: a */
        public final Handler f5838a;

        /* renamed from: b */
        public final T f5839b;

        /* renamed from: c */
        public boolean f5840c;

        public C3160b(Handler handler, T t) {
            this.f5838a = handler;
            this.f5839b = t;
        }

        /* renamed from: b */
        public void mo19962b(C3159a<T> aVar) {
            this.f5838a.post(new C3143a(this, aVar));
        }

        /* renamed from: c */
        public /* synthetic */ void mo19963c(C3159a aVar) {
            if (!this.f5840c) {
                aVar.mo18438a(this.f5839b);
            }
        }

        /* renamed from: d */
        public void mo19964d() {
            this.f5840c = true;
        }
    }

    /* renamed from: a */
    public void mo19959a(Handler handler, T t) {
        C3151e.m7753a((handler == null || t == null) ? false : true);
        mo19961c(t);
        this.f5837a.add(new C3160b(handler, t));
    }

    /* renamed from: b */
    public void mo19960b(C3159a<T> aVar) {
        Iterator<C3160b<T>> it = this.f5837a.iterator();
        while (it.hasNext()) {
            it.next().mo19962b(aVar);
        }
    }

    /* renamed from: c */
    public void mo19961c(T t) {
        Iterator<C3160b<T>> it = this.f5837a.iterator();
        while (it.hasNext()) {
            C3160b next = it.next();
            if (next.f5839b == t) {
                next.mo19964d();
                this.f5837a.remove(next);
            }
        }
    }
}

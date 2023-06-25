package p040c.p200q.p363c.p369m;

import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.x */
/* compiled from: Lazy */
public class C6458x<T> implements C6757b<T> {

    /* renamed from: c */
    public static final Object f12152c = new Object();

    /* renamed from: a */
    public volatile Object f12153a = f12152c;

    /* renamed from: b */
    public volatile C6757b<T> f12154b;

    public C6458x(C6757b<T> bVar) {
        this.f12154b = bVar;
    }

    public T get() {
        T t = this.f12153a;
        if (t == f12152c) {
            synchronized (this) {
                t = this.f12153a;
                if (t == f12152c) {
                    t = this.f12154b.get();
                    this.f12153a = t;
                    this.f12154b = null;
                }
            }
        }
        return t;
    }
}

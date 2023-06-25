package p040c.p200q.p363c.p389r;

import p040c.p200q.p363c.p369m.C6423a0;

/* renamed from: c.q.c.r.a */
/* compiled from: Event */
public class C6736a<T> {

    /* renamed from: a */
    public final Class<T> f12892a;

    /* renamed from: b */
    public final T f12893b;

    public C6736a(Class<T> cls, T t) {
        C6423a0.m17952b(cls);
        this.f12892a = cls;
        C6423a0.m17952b(t);
        this.f12893b = t;
    }

    /* renamed from: a */
    public T mo31406a() {
        return this.f12893b;
    }

    /* renamed from: b */
    public Class<T> mo31407b() {
        return this.f12892a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f12892a, this.f12893b});
    }
}

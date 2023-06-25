package p040c.p200q.p363c.p369m;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.z */
/* compiled from: OptionalProvider */
public class C6460z<T> implements C6757b<T>, C6755a<T> {

    /* renamed from: c */
    public static final C6755a.C6756a<Object> f12157c = C6435k.f12108a;

    /* renamed from: d */
    public static final C6757b<Object> f12158d = C6434j.f12107a;
    @GuardedBy("this")

    /* renamed from: a */
    public C6755a.C6756a<T> f12159a;

    /* renamed from: b */
    public volatile C6757b<T> f12160b;

    public C6460z(C6755a.C6756a<T> aVar, C6757b<T> bVar) {
        this.f12159a = aVar;
        this.f12160b = bVar;
    }

    /* renamed from: b */
    public static <T> C6460z<T> m18062b() {
        return new C6460z<>(f12157c, f12158d);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18063c(C6757b bVar) {
    }

    /* renamed from: d */
    public static /* synthetic */ Object m18064d() {
        return null;
    }

    /* renamed from: e */
    public static /* synthetic */ void m18065e(C6755a.C6756a aVar, C6755a.C6756a aVar2, C6757b bVar) {
        aVar.mo30538a(bVar);
        aVar2.mo30538a(bVar);
    }

    /* renamed from: f */
    public static <T> C6460z<T> m18066f(C6757b<T> bVar) {
        return new C6460z<>((C6755a.C6756a) null, bVar);
    }

    /* renamed from: a */
    public void mo30600a(@NonNull C6755a.C6756a<T> aVar) {
        C6757b<T> bVar;
        C6757b<T> bVar2 = this.f12160b;
        if (bVar2 != f12158d) {
            aVar.mo30538a(bVar2);
            return;
        }
        C6757b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f12160b;
            if (bVar != f12158d) {
                bVar3 = bVar;
            } else {
                this.f12159a = new C6433i(this.f12159a, aVar);
            }
        }
        if (bVar3 != null) {
            aVar.mo30538a(bVar);
        }
    }

    /* renamed from: g */
    public void mo30601g(C6757b<T> bVar) {
        C6755a.C6756a<T> aVar;
        if (this.f12160b == f12158d) {
            synchronized (this) {
                aVar = this.f12159a;
                this.f12159a = null;
                this.f12160b = bVar;
            }
            aVar.mo30538a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public T get() {
        return this.f12160b.get();
    }
}

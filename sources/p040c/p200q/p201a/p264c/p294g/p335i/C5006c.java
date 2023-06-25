package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.c */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5006c {

    /* renamed from: a */
    public C4990b f9836a;

    /* renamed from: b */
    public C4990b f9837b;

    /* renamed from: c */
    public final List f9838c;

    public C5006c() {
        this.f9836a = new C4990b("", 0, (Map) null);
        this.f9837b = new C4990b("", 0, (Map) null);
        this.f9838c = new ArrayList();
    }

    /* renamed from: a */
    public final C4990b mo27026a() {
        return this.f9836a;
    }

    /* renamed from: b */
    public final C4990b mo27027b() {
        return this.f9837b;
    }

    /* renamed from: c */
    public final List mo27028c() {
        return this.f9838c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5006c cVar = new C5006c(this.f9836a.clone());
        for (C4990b b : this.f9838c) {
            cVar.f9838c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo27030d(C4990b bVar) {
        this.f9836a = bVar;
        this.f9837b = bVar.clone();
        this.f9838c.clear();
    }

    /* renamed from: e */
    public final void mo27031e(String str, long j, Map map) {
        this.f9838c.add(new C4990b(str, j, map));
    }

    /* renamed from: f */
    public final void mo27032f(C4990b bVar) {
        this.f9837b = bVar;
    }

    public C5006c(C4990b bVar) {
        this.f9836a = bVar;
        this.f9837b = bVar.clone();
        this.f9838c = new ArrayList();
    }
}
